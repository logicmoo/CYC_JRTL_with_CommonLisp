package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0737 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0737";
    public static final String myFingerPrint = "5be6eed9d5cb9d0d0df1819f5442f6e27ed51d86dd408ffec0170f3e0f82e865";
    private static SubLSymbol $g5825$;
    private static SubLSymbol $g5826$;
    public static SubLSymbol $g5827$;
    private static SubLSymbol $g5828$;
    private static SubLSymbol $g5830$;
    public static SubLSymbol $g5831$;
    private static SubLSymbol $g5832$;
    private static SubLSymbol $g5833$;
    private static SubLSymbol $g5834$;
    private static SubLSymbol $g5835$;
    private static SubLSymbol $g5836$;
    private static SubLSymbol $g5837$;
    private static SubLSymbol $g5838$;
    private static SubLSymbol $g5839$;
    private static SubLSymbol $g5840$;
    private static SubLSymbol $g5841$;
    private static SubLSymbol $g5842$;
    private static SubLSymbol $g5843$;
    private static SubLSymbol $g5844$;
    private static SubLSymbol $g5845$;
    public static SubLSymbol $g5846$;
    private static SubLSymbol $g5847$;
    private static SubLSymbol $g5848$;
    private static SubLSymbol $g5849$;
    private static SubLSymbol $g5850$;
    private static SubLSymbol $g5851$;
    private static SubLSymbol $g5852$;
    private static SubLSymbol $g5853$;
    private static SubLSymbol $g5854$;
    private static SubLSymbol $g5855$;
    public static SubLSymbol $g5829$;
    private static SubLSymbol $g5856$;
    private static SubLSymbol $g5857$;
    private static SubLSymbol $g5858$;
    public static SubLSymbol $g5859$;
    public static SubLSymbol $g5860$;
    public static SubLSymbol $g5861$;
    private static SubLSymbol $g5862$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLInteger $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLInteger $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLInteger $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLInteger $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLInteger $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLInteger $ic165$;
    private static final SubLList $ic166$;
    private static final SubLList $ic167$;
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
    private static final SubLList $ic179$;
    private static final SubLObject $ic180$;
    private static final SubLList $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLList $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLObject $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLString $ic227$;
    private static final SubLList $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLList $ic231$;
    private static final SubLList $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLList $ic235$;
    private static final SubLList $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLList $ic238$;
    private static final SubLList $ic239$;
    private static final SubLList $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLString $ic242$;
    private static final SubLList $ic243$;
    private static final SubLList $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLString $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLString $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLString $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLInteger $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLList $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLList $ic268$;
    private static final SubLList $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLString $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLString $ic290$;
    private static final SubLString $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLList $ic296$;
    private static final SubLObject $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLObject $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLObject $ic303$;
    private static final SubLString $ic304$;
    private static final SubLString $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLString $ic310$;
    private static final SubLObject $ic311$;
    private static final SubLObject $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLString $ic316$;
    private static final SubLString $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLObject $ic319$;
    private static final SubLObject $ic320$;
    private static final SubLString $ic321$;
    private static final SubLString $ic322$;
    private static final SubLString $ic323$;
    private static final SubLList $ic324$;
    private static final SubLList $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLInteger $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLList $ic330$;
    private static final SubLList $ic331$;
    private static final SubLList $ic332$;
    private static final SubLList $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLInteger $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLInteger $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLInteger $ic344$;
    private static final SubLString $ic345$;
    private static final SubLList $ic346$;
    private static final SubLString $ic347$;
    private static final SubLList $ic348$;
    private static final SubLList $ic349$;
    private static final SubLList $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLList $ic353$;
    private static final SubLList $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLList $ic356$;
    private static final SubLObject $ic357$;
    private static final SubLList $ic358$;
    private static final SubLObject $ic359$;
    private static final SubLString $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLObject $ic365$;
    private static final SubLObject $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLList $ic371$;
    private static final SubLList $ic372$;
    private static final SubLString $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLList $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLString $ic379$;
    private static final SubLString $ic380$;
    private static final SubLObject $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLList $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLList $ic386$;
    private static final SubLSymbol $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLSymbol $ic391$;
    private static final SubLList $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLSymbol $ic397$;
    private static final SubLSymbol $ic398$;
    private static final SubLSymbol $ic399$;
    private static final SubLList $ic400$;
    private static final SubLString $ic401$;
    private static final SubLString $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLInteger $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLString $ic407$;
    private static final SubLSymbol $ic408$;
    
    public static SubLObject f45317(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic6$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f45318(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)$ic7$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f45319(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != f45320(var8, (SubLObject)UNPROVIDED) || NIL != f45321(var8, (SubLObject)UNPROVIDED) || NIL != f45322(var8, (SubLObject)UNPROVIDED) || NIL != f45323(var8, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45322(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var8) && (NIL == var9 || NIL != assertion_handles_oc.f11041(var8, (SubLObject)UNPROVIDED)) && NIL != module0178.f11284(var8) && module0178.f11333(var8).eql($ic8$));
    }
    
    public static SubLObject f45324(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != f45320(var8, (SubLObject)T) || NIL != f45321(var8, (SubLObject)T) || NIL != f45322(var8, (SubLObject)T) || NIL != f45323(var8, (SubLObject)T));
    }
    
    public static SubLObject f45325(final SubLObject var8) {
        if (NIL != f45320(var8, (SubLObject)UNPROVIDED)) {
            return f45326(var8);
        }
        if (NIL != f45322(var8, (SubLObject)UNPROVIDED)) {
            return f45327(var8);
        }
        if (NIL != f45321(var8, (SubLObject)UNPROVIDED)) {
            return f45328(var8, (SubLObject)T);
        }
        if (NIL != f45323(var8, (SubLObject)UNPROVIDED)) {
            return f45329(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45330(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0034.$g879$.getDynamicValue(var9);
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == var10) {
            return f45325(var8);
        }
        var11 = module0034.f1857(var10, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        if (NIL == var11) {
            var11 = module0034.f1807(module0034.f1842(var10), (SubLObject)$ic9$, (SubLObject)ONE_INTEGER, (SubLObject)$ic10$, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var10, (SubLObject)$ic9$, var11);
        }
        SubLObject var12 = module0034.f1814(var11, var8, (SubLObject)$ic11$);
        if (var12 == $ic11$) {
            var12 = Values.arg2(var9.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45325(var8)));
            module0034.f1816(var11, var8, var12, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var12);
    }
    
    public static SubLObject f45323(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45329(final SubLObject var14) {
        return var14;
    }
    
    public static SubLObject f45331(final SubLObject var15, final SubLObject var16) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45332(final SubLObject var15, final SubLObject var17, final SubLObject var18) {
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45333(var15, var17, var18);
        }
        if (NIL != f45320(var15, (SubLObject)UNPROVIDED)) {
            return f45334(var15, var17, var18);
        }
        print_high.print(var15, var17);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45335(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)T)) {
            return (SubLObject)$ic12$;
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic13$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45336(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)T)) {
            return f45337(var15);
        }
        if (NIL != f45322(var15, (SubLObject)T)) {
            return module0209.f13552(module0178.f11336(var15));
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45338(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return module0209.f13552(f45331(var15, (SubLObject)$ic14$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45339(final SubLObject var15, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)T;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = f45340(f45336(var15));
        final SubLObject var22 = f45341(var15);
        SubLObject var23 = conses_high.copy_list(var21);
        SubLObject var24 = var21;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (NIL != f45320(var15, (SubLObject)T)) {
                final SubLObject var26 = module0585.$g4447$.currentBinding(var20);
                try {
                    module0585.$g4447$.bind((SubLObject)$ic16$, var20);
                    if (NIL != module0035.f2002(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && var25.first().equalp($g5828$.getGlobalValue()) && !conses_high.second(var25).equalp($g5828$.getGlobalValue())) {
                        var23 = (SubLObject)ConsesLow.cons(var25.rest(), var23);
                    }
                    else if (NIL != var19 && NIL != f45342(var15, var22, var25)) {
                        final SubLObject var27 = (SubLObject)ConsesLow.cons($g5828$.getGlobalValue(), var25);
                        var23 = (SubLObject)ConsesLow.cons(var27, var23);
                    }
                }
                finally {
                    module0585.$g4447$.rebind(var26, var20);
                }
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f45343(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)$ic18$;
            final SubLObject var9 = (SubLObject)$ic19$;
            final SubLObject var10 = (SubLObject)$ic20$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic23$)), (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ConsesLow.listS(var9, var10, var8, (SubLObject)$ic27$), (SubLObject)ConsesLow.list((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var6, var10), (SubLObject)ConsesLow.listS((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)ConsesLow.listS((SubLObject)$ic33$, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var6), (SubLObject)$ic35$))), ConsesLow.append(var7, (SubLObject)NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45342(final SubLObject var15, final SubLObject var21, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = module0585.$g4447$.currentBinding(var25);
        try {
            module0585.$g4447$.bind((SubLObject)$ic16$, var25);
            var26 = (SubLObject)makeBoolean(NIL != module0731.f44656($ic36$, (SubLObject)UNPROVIDED) && NIL != module0035.f2002(var24, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f45344(module0035.f2114(var24), var21) && NIL != module0732.f45152($ic37$, var15, var21) && NIL != f45345(f45346(var15), var21) && NIL != f45347(f45348(var15), var21));
        }
        finally {
            module0585.$g4447$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f45344(final SubLObject var35, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), module0731.f44727(var35, $ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var39 = module0147.f9540(var36);
        final SubLObject var40 = module0147.$g2095$.currentBinding(var37);
        final SubLObject var41 = module0147.$g2094$.currentBinding(var37);
        final SubLObject var42 = module0147.$g2096$.currentBinding(var37);
        try {
            module0147.$g2095$.bind(module0147.f9545(var39), var37);
            module0147.$g2094$.bind(module0147.f9546(var39), var37);
            module0147.$g2096$.bind(module0147.f9549(var39), var37);
            var38 = Sequences.remove($ic38$, var38, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var42, var37);
            module0147.$g2094$.rebind(var41, var37);
            module0147.$g2095$.rebind(var40, var37);
        }
        return module0035.f2013(var38);
    }
    
    public static SubLObject f45349(final SubLObject var36) {
        return module0434.f30579((SubLObject)$ic41$, (SubLObject)$ic42$, module0162.f10628(module0202.f12768($ic43$, $ic44$, var36)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45350(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0034.$g879$.getDynamicValue(var37);
        SubLObject var39 = (SubLObject)NIL;
        if (NIL == var38) {
            return f45349(var36);
        }
        var39 = module0034.f1857(var38, (SubLObject)$ic40$, (SubLObject)UNPROVIDED);
        if (NIL == var39) {
            var39 = module0034.f1807(module0034.f1842(var38), (SubLObject)$ic40$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var38, (SubLObject)$ic40$, var39);
        }
        SubLObject var40 = module0034.f1814(var39, var36, (SubLObject)$ic11$);
        if (var40 == $ic11$) {
            var40 = Values.arg2(var37.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45349(var36)));
            module0034.f1816(var39, var36, var40, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var40);
    }
    
    public static SubLObject f45347(final SubLObject var41, final SubLObject var36) {
        if (NIL != f45351((SubLObject)UNPROVIDED) && NIL != module0034.f1839(module0034.f1881())) {
            return (SubLObject)makeBoolean(NIL == f45352(var41, var36));
        }
        SubLObject var42 = (SubLObject)NIL;
        if (NIL == var42) {
            SubLObject var43;
            SubLObject var44;
            for (var43 = f45350(var36), var44 = (SubLObject)NIL, var44 = var43.first(); NIL == var42 && NIL != var43; var42 = module0259.f16891(var41, var44), var43 = var43.rest(), var44 = var43.first()) {}
        }
        return (SubLObject)makeBoolean(NIL == var42);
    }
    
    public static SubLObject f45352(final SubLObject var41, final SubLObject var36) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var41) && NIL != module0077.f5320(var41, f45353(var36)));
    }
    
    public static SubLObject f45354(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = f45355((SubLObject)UNPROVIDED);
        SubLObject var39 = f45350(var36);
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            final SubLObject var41 = module0147.$g2094$.currentBinding(var37);
            final SubLObject var42 = module0147.$g2095$.currentBinding(var37);
            try {
                module0147.$g2094$.bind((SubLObject)$ic46$, var37);
                module0147.$g2095$.bind($ic47$, var37);
                SubLObject var23_46 = module0259.f16848(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var43 = (SubLObject)NIL;
                var43 = var23_46.first();
                while (NIL != var23_46) {
                    module0077.f5326(var43, var38);
                    var23_46 = var23_46.rest();
                    var43 = var23_46.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var42, var37);
                module0147.$g2094$.rebind(var41, var37);
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var38;
    }
    
    public static SubLObject f45353(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0034.$g879$.getDynamicValue(var37);
        SubLObject var39 = (SubLObject)NIL;
        if (NIL == var38) {
            return f45354(var36);
        }
        var39 = module0034.f1857(var38, (SubLObject)$ic45$, (SubLObject)UNPROVIDED);
        if (NIL == var39) {
            var39 = module0034.f1807(module0034.f1842(var38), (SubLObject)$ic45$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var38, (SubLObject)$ic45$, var39);
        }
        SubLObject var40 = module0034.f1814(var39, var36, (SubLObject)$ic11$);
        if (var40 == $ic11$) {
            var40 = Values.arg2(var37.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45354(var36)));
            module0034.f1816(var39, var36, var40, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var40);
    }
    
    public static SubLObject f45356(final SubLObject var48, final SubLObject var36) {
        return (SubLObject)makeBoolean(NIL == module0540.f33526(module0409.f28506((SubLObject)ConsesLow.list($ic49$, var48), module0162.f10628(module0202.f12768($ic43$, $ic44$, var36)), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f45345(final SubLObject var48, final SubLObject var36) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)NIL;
        if (NIL == var50) {
            return f45356(var48, var36);
        }
        var51 = module0034.f1857(var50, (SubLObject)$ic48$, (SubLObject)UNPROVIDED);
        if (NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)$ic48$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var50, (SubLObject)$ic48$, var51);
        }
        final SubLObject var52 = module0034.f1782(var48, var36);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)UNPROVIDED);
        if (var53 != $ic11$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var48.eql(var56.first())) {
                    var56 = var56.rest();
                    if (NIL != var56 && NIL == var56.rest() && var36.eql(var56.first())) {
                        return module0034.f1959(var57);
                    }
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        final SubLObject var58 = Values.arg2(var49.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45356(var48, var36)));
        module0034.f1836(var51, var52, var53, var58, (SubLObject)ConsesLow.list(var48, var36));
        return module0034.f1959(var58);
    }
    
    public static SubLObject f45357(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)T)) {
            return (SubLObject)NIL;
        }
        if (NIL != f45322(var15, (SubLObject)T)) {
            final SubLObject var16 = module0178.f11335(var15);
            return (SubLObject)((NIL != module0731.f44656(var16, (SubLObject)UNPROVIDED)) ? var16 : ((NIL != module0731.f44690(var16, (SubLObject)UNPROVIDED)) ? module0731.f44691(var16) : NIL));
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45358(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return f45331(var15, (SubLObject)$ic50$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45359(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)T)) {
            return (SubLObject)NIL;
        }
        if (NIL != f45322(var15, (SubLObject)T)) {
            final SubLObject var16 = module0178.f11335(var15);
            return (SubLObject)((NIL != module0731.f44690(var16, (SubLObject)UNPROVIDED)) ? ConsesLow.list(var16) : ((NIL != module0731.f44656(var16, (SubLObject)UNPROVIDED)) ? module0731.f44659(var16) : NIL));
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45360(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(f45331(var15, (SubLObject)$ic51$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45361(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)T)) {
            return (SubLObject)ConsesLow.list(f45348(var15));
        }
        if (NIL != f45322(var15, (SubLObject)T)) {
            return (SubLObject)ConsesLow.list(module0178.f11334(var15));
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45362(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return f45331(var15, (SubLObject)$ic52$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45363(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)T)) {
            return f45364(var15);
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45365(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45366(final SubLObject var15) {
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45367(var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45368(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic31$, var7, (SubLObject)$ic55$), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic56$, var7))), ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic57$, var7, (SubLObject)$ic55$), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic58$, var7))), ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic59$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic53$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45369(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic61$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic31$, var7, (SubLObject)$ic55$), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic62$, var7))), ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic57$, var7, (SubLObject)$ic55$), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic63$, var7))), ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic59$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic64$, (SubLObject)ConsesLow.list(var6, var7), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic61$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45370(final SubLObject var30) {
        return f45337(var30);
    }
    
    public static SubLObject f45371(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var73_74 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic66$);
            var73_74 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic66$);
            if (NIL == conses_high.member(var73_74, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var73_74 == $ic68$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic66$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var7), (SubLObject)$ic69$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f45372(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic66$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var83_84 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic66$);
            var83_84 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic66$);
            if (NIL == conses_high.member(var83_84, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var83_84 == $ic68$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic66$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var7), (SubLObject)$ic69$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f45373(final SubLObject var15, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)T;
        }
        if (NIL != f45320(var15, (SubLObject)T)) {
            return f45346(var15);
        }
        if (NIL != f45322(var15, (SubLObject)T)) {
            return $ic8$;
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45374(var15, var86);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return f45331(var15, (SubLObject)$ic51$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45341(final SubLObject var15) {
        if (NIL != assertion_handles_oc.f11035(var15)) {
            return module0178.f11287(var15);
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45375(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return f45331(var15, (SubLObject)$ic73$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45376(final SubLObject var15) {
        if (NIL != assertion_handles_oc.f11035(var15)) {
            return module0178.f11287(var15);
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45377(var15);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return f45331(var15, (SubLObject)$ic73$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45378(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0077.f5326(var15, var16);
            return var16;
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45379(var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45380(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var15);
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45381(var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45382(final SubLObject var88, final SubLObject var89, final SubLObject var15) {
        final SubLObject var90 = module0208.f13535(var89);
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            return f45383(var88, var90, var15);
        }
        if (NIL != f45320(var15, (SubLObject)UNPROVIDED)) {
            return f45384(var88, var90, var15);
        }
        if (NIL != f45319(var15)) {
            return f45385(var88, var90, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45386(final SubLObject var88, final SubLObject var89, final SubLObject var15) {
        final SubLObject var90 = module0208.f13535(var89);
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            f45387(var88, var90, var15);
        }
        else if (NIL != f45320(var15, (SubLObject)UNPROVIDED)) {
            f45388(var88, var90, var15);
        }
        else if (NIL != f45319(var15)) {
            f45389(var90, var15, var88);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45390(final SubLObject var15) {
        if (NIL != f45320(var15, (SubLObject)UNPROVIDED)) {
            return f45391(var15);
        }
        if (NIL != f45322(var15, (SubLObject)UNPROVIDED)) {
            return f45392(var15);
        }
        if (NIL != f45321(var15, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = f45393(var15);
            return f45394(var16);
        }
        if (NIL != f45323(var15, (SubLObject)UNPROVIDED)) {
            return f45331(var15, (SubLObject)$ic74$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45394(final SubLObject var90) {
        return (SubLObject)((NIL != module0178.f11284(var90)) ? f45392(var90) : NIL);
    }
    
    public static SubLObject f45395(final SubLObject var91) {
        assert NIL != f45319(var91) : var91;
        SubLObject var92 = (SubLObject)NIL;
        final SubLObject var93 = f45336(var91);
        SubLObject var95;
        final SubLObject var94 = var95 = f45361(var91);
        SubLObject var96 = (SubLObject)NIL;
        var96 = var95.first();
        while (NIL != var95) {
            final SubLObject var97 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var93, (SubLObject)ConsesLow.list(module0751.f46929(var93, var96, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)ZERO_INTEGER))), var96);
            SubLObject var23_96;
            final SubLObject var98 = var23_96 = (SubLObject)ConsesLow.list(var97);
            SubLObject var99 = (SubLObject)NIL;
            var99 = var23_96.first();
            while (NIL != var23_96) {
                var92 = (SubLObject)ConsesLow.cons(var99, var92);
                var23_96 = var23_96.rest();
                var99 = var23_96.first();
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        var92 = Sequences.delete_duplicates(var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Values.values(var92, Sequences.nreverse(var94));
    }
    
    public static SubLObject f45396(final SubLObject var98) {
        return var98.first();
    }
    
    public static SubLObject f45321(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f45397(var8) && (NIL != module0585.f35830() || NIL == var9 || NIL != f45398(var8)));
    }
    
    public static SubLObject f45399(final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = module0077.f5333(f45400(var69));
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == var70 && NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
            var74 = module0032.f1745(var72, var73);
            if (NIL != module0032.f1746(var73, var74)) {
                var70 = (SubLObject)makeBoolean(NIL == f45401(var74));
            }
        }
        return var70;
    }
    
    public static SubLObject f45402(final SubLObject var69) {
        final SubLObject var70 = module0077.f5314(f45400(var69));
        final SubLObject var71 = module0077.f5314(f45379(var69));
        return f45403(var70, var71);
    }
    
    public static SubLObject f45404(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var104) || NIL != f45405(var104));
    }
    
    public static SubLObject f45328(final SubLObject var69, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = module0077.f5333(f45400(var69));
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
            var74 = module0032.f1745(var72, var73);
            if (NIL != module0032.f1746(var73, var74) && NIL == f45401(var74)) {
                var70 = (SubLObject)ConsesLow.cons(var74, var70);
            }
        }
        if (NIL != var70) {
            SubLObject var75 = var70;
            SubLObject var76 = (SubLObject)NIL;
            var76 = var75.first();
            while (NIL != var75) {
                f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic76$, var76, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f45407(var69, var76);
                var75 = var75.rest();
                var76 = var75.first();
            }
        }
        if (NIL != module0077.f5316(f45400(var69))) {
            return (SubLObject)NIL;
        }
        SubLObject var77 = (SubLObject)NIL;
        var71 = module0077.f5333(f45379(var69));
        SubLObject var78;
        for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
            var78 = module0032.f1745(var72, var73);
            if (NIL != module0032.f1746(var73, var78) && NIL == f45408(var78, var9)) {
                var77 = (SubLObject)ConsesLow.cons(var78, var77);
            }
        }
        if (NIL != var77) {
            SubLObject var75 = var77;
            SubLObject var79 = (SubLObject)NIL;
            var79 = var75.first();
            while (NIL != var75) {
                f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic77$, var79, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f45409(var69, var79);
                var75 = var75.rest();
                var79 = var75.first();
            }
        }
        return var69;
    }
    
    public static SubLObject f45410(final SubLObject var69) {
        return (SubLObject)makeBoolean(NIL != f45397(var69) && NIL != f45411(f45400(var69)) && NIL != f45412(f45379(var69)));
    }
    
    public static SubLObject f45398(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = module0034.$g879$.getDynamicValue(var70);
        SubLObject var72 = (SubLObject)NIL;
        if (NIL == var71) {
            return f45410(var69);
        }
        var72 = module0034.f1857(var71, (SubLObject)$ic78$, (SubLObject)UNPROVIDED);
        if (NIL == var72) {
            var72 = module0034.f1807(module0034.f1842(var71), (SubLObject)$ic78$, (SubLObject)ONE_INTEGER, (SubLObject)$ic10$, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var71, (SubLObject)$ic78$, var72);
        }
        SubLObject var73 = module0034.f1814(var72, var69, (SubLObject)$ic11$);
        if (var73 == $ic11$) {
            var73 = Values.arg2(var70.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45410(var69)));
            module0034.f1816(var72, var69, var73, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var73);
    }
    
    public static SubLObject f45413(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var104) && (NIL != module0585.f35830() || NIL != f45414(var104, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f45415(final SubLObject var110, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11041(var110, (SubLObject)NIL) && (NIL == var9 || (NIL != module0161.f10571(module0178.f11287(var110), (SubLObject)UNPROVIDED) && NIL != module0130.f8503(module0178.f11291(var110)) && NIL != module0212.f13775(assertions_low_oc.f11242(var110)))));
    }
    
    public static SubLObject f45414(final SubLObject var110, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)T;
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0034.$g879$.getDynamicValue(var111);
        SubLObject var113 = (SubLObject)NIL;
        if (NIL == var112) {
            return f45415(var110, var9);
        }
        var113 = module0034.f1857(var112, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
        if (NIL == var113) {
            var113 = module0034.f1807(module0034.f1842(var112), (SubLObject)$ic79$, (SubLObject)TWO_INTEGER, (SubLObject)$ic80$, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var112, (SubLObject)$ic79$, var113);
        }
        final SubLObject var114 = module0034.f1782(var110, var9);
        final SubLObject var115 = module0034.f1814(var113, var114, (SubLObject)UNPROVIDED);
        if (var115 != $ic11$) {
            SubLObject var116 = var115;
            SubLObject var117 = (SubLObject)NIL;
            var117 = var116.first();
            while (NIL != var116) {
                SubLObject var118 = var117.first();
                final SubLObject var119 = conses_high.second(var117);
                if (var110.eql(var118.first())) {
                    var118 = var118.rest();
                    if (NIL != var118 && NIL == var118.rest() && var9.eql(var118.first())) {
                        return module0034.f1959(var119);
                    }
                }
                var116 = var116.rest();
                var117 = var116.first();
            }
        }
        final SubLObject var120 = Values.arg2(var111.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45415(var110, var9)));
        module0034.f1836(var113, var114, var115, var120, (SubLObject)ConsesLow.list(var110, var9));
        return module0034.f1959(var120);
    }
    
    public static SubLObject f45401(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != f45413(var104) || NIL != f45416(var104));
    }
    
    public static SubLObject f45417(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != f45413(var104) || NIL != f45418(var104, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45419(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var104) || NIL != f45420(var104));
    }
    
    public static SubLObject f45421(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var104) || NIL != f45422(var104, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45408(final SubLObject var104, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f45413(var104) || NIL != f45423(var104, var9));
    }
    
    public static SubLObject f45405(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != f45422(var104, (SubLObject)UNPROVIDED) || NIL != f45420(var104));
    }
    
    public static SubLObject f45416(final SubLObject var104) {
        return f45422(var104, (SubLObject)T);
    }
    
    public static SubLObject f45422(final SubLObject var104, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(var104.isCons() && NIL != module0202.f12590(var104.first()) && (NIL == var9 || NIL == module0035.f2439((SubLObject)$ic81$, var104, (SubLObject)UNPROVIDED)) && NIL != module0161.f10481(var104.rest()));
    }
    
    public static SubLObject f45424(final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var68, var68, (SubLObject)$ic82$);
        var71 = var68.first();
        final SubLObject var73 = var72 = var68.rest();
        final SubLObject var74 = module0147.f9540(var72);
        final SubLObject var75 = module0147.$g2095$.currentBinding(var69);
        final SubLObject var76 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var77 = module0147.$g2096$.currentBinding(var69);
        try {
            module0147.$g2095$.bind(module0147.f9545(var74), var69);
            module0147.$g2094$.bind(module0147.f9546(var74), var69);
            module0147.$g2096$.bind(module0147.f9549(var74), var69);
            if (NIL != module0202.f12734(var71, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                SubLObject var117_118;
                final SubLObject var115_116 = var117_118 = var71;
                SubLObject var78 = (SubLObject)NIL;
                SubLObject var79 = (SubLObject)NIL;
                SubLObject var80 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)$ic83$);
                var78 = var117_118.first();
                var117_118 = var117_118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)$ic83$);
                var79 = var117_118.first();
                var117_118 = var117_118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var117_118, var115_116, (SubLObject)$ic83$);
                var80 = var117_118.first();
                var117_118 = var117_118.rest();
                if (NIL == var117_118) {
                    if (NIL == var70) {
                        SubLObject var81 = module0730.f44566(var79, var78);
                        SubLObject var82 = (SubLObject)NIL;
                        var82 = var81.first();
                        while (NIL == var70 && NIL != var81) {
                            SubLObject var123_124;
                            final SubLObject var121_122 = var123_124 = var82;
                            SubLObject var83 = (SubLObject)NIL;
                            SubLObject var84 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var123_124, var121_122, (SubLObject)$ic84$);
                            var83 = var123_124.first();
                            var123_124 = (var84 = var123_124.rest());
                            if (var83.equal(var80)) {
                                var70 = var84;
                            }
                            var81 = var81.rest();
                            var82 = var81.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var115_116, (SubLObject)$ic83$);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var77, var69);
            module0147.$g2094$.rebind(var76, var69);
            module0147.$g2095$.rebind(var75, var69);
        }
        return var70;
    }
    
    public static SubLObject f45420(final SubLObject var104) {
        return (SubLObject)makeBoolean(var104.isVector() && (NIL == Vectors.aref(var104, (SubLObject)ONE_INTEGER) || NIL != module0161.f10481(Vectors.aref(var104, (SubLObject)ONE_INTEGER))));
    }
    
    public static SubLObject f45418(final SubLObject var104, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(var104.isVector() && NIL != module0077.f5302(Vectors.aref(var104, (SubLObject)ZERO_INTEGER)) && $g5829$.getGlobalValue().eql(module0077.f5315(Vectors.aref(var104, (SubLObject)ZERO_INTEGER))) && (NIL == Vectors.aref(var104, (SubLObject)ONE_INTEGER) || NIL != module0161.f10481(Vectors.aref(var104, (SubLObject)ONE_INTEGER))) && (NIL == var9 || NIL != f45425(Vectors.aref(var104, (SubLObject)ZERO_INTEGER))));
    }
    
    public static SubLObject f45425(final SubLObject var127) {
        SubLObject var128 = (SubLObject)NIL;
        final SubLObject var129 = module0077.f5333(var127);
        SubLObject var130;
        SubLObject var131;
        SubLObject var132;
        for (var130 = module0032.f1741(var129), var131 = (SubLObject)NIL, var131 = module0032.f1742(var130, var129); NIL == var128 && NIL == module0032.f1744(var130, var131); var131 = module0032.f1743(var131)) {
            var132 = module0032.f1745(var130, var131);
            if (NIL != module0032.f1746(var131, var132)) {
                var128 = f45426(var132);
            }
        }
        return (SubLObject)makeBoolean(NIL == var128);
    }
    
    public static SubLObject f45423(final SubLObject var104, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(var104.isVector() && NIL != module0077.f5302(Vectors.aref(var104, (SubLObject)ZERO_INTEGER)) && $g5829$.getGlobalValue().eql(module0077.f5315(Vectors.aref(var104, (SubLObject)ZERO_INTEGER))) && (NIL == Vectors.aref(var104, (SubLObject)ONE_INTEGER) || NIL != module0161.f10481(Vectors.aref(var104, (SubLObject)ONE_INTEGER))) && (NIL == var9 || NIL != f45427(Vectors.aref(var104, (SubLObject)ZERO_INTEGER))));
    }
    
    public static SubLObject f45427(final SubLObject var127) {
        SubLObject var128 = (SubLObject)NIL;
        final SubLObject var129 = module0077.f5333(var127);
        SubLObject var130;
        SubLObject var131;
        SubLObject var132;
        for (var130 = module0032.f1741(var129), var131 = (SubLObject)NIL, var131 = module0032.f1742(var130, var129); NIL == module0032.f1744(var130, var131); var131 = module0032.f1743(var131)) {
            var132 = module0032.f1745(var130, var131);
            if (NIL != module0032.f1746(var131, var132) && NIL != f45426(var132)) {
                f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic85$, var132, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var128 = (SubLObject)ConsesLow.cons(var132, var128);
            }
        }
        SubLObject var133 = var128;
        SubLObject var134 = (SubLObject)NIL;
        var134 = var133.first();
        while (NIL != var133) {
            module0077.f5327(var134, var127);
            var133 = var133.rest();
            var134 = var133.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45426(final SubLObject var61) {
        SubLObject var62 = (SubLObject)NIL;
        if (NIL == var62) {
            SubLObject var63 = $g5830$.getGlobalValue();
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL == var62 && NIL != var63) {
                if (NIL != Functions.funcall(var64, var61)) {
                    var62 = (SubLObject)T;
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        return var62;
    }
    
    public static SubLObject f45428(final SubLObject var61) {
        return module0205.f13145((SubLObject)$ic87$, var61, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45429(final SubLObject var114, final SubLObject var36, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var35.isString()) {
            final SubLObject var115 = f45430(var114, var36, var35);
            if (NIL != f45421(var115)) {
                return var115;
            }
        }
        final SubLObject var116 = module0217.f14424(var114, var36);
        if (NIL != assertion_handles_oc.f11035(var116)) {
            return var116;
        }
        return f45431(var114, var36);
    }
    
    public static SubLObject f45430(final SubLObject var114, final SubLObject var36, final SubLObject var35) {
        SubLObject var115 = (SubLObject)NIL;
        final SubLObject var116 = f45432(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var116.isList() && NIL == var115) {
            SubLObject var117 = var116;
            SubLObject var118 = (SubLObject)NIL;
            var118 = var117.first();
            while (NIL == var115 && NIL != var117) {
                if (NIL != f45321(var118, (SubLObject)UNPROVIDED) && var36.eql(f45375(var118))) {
                    final SubLObject var119 = module0077.f5333(f45400(var118));
                    SubLObject var120;
                    SubLObject var121;
                    SubLObject var122;
                    for (var120 = module0032.f1741(var119), var121 = (SubLObject)NIL, var121 = module0032.f1742(var120, var119); NIL == var115 && NIL == module0032.f1744(var120, var121); var121 = module0032.f1743(var121)) {
                        var122 = module0032.f1745(var120, var121);
                        if (NIL != module0032.f1746(var121, var122) && var114.equal(f45433(var122))) {
                            var115 = var122;
                        }
                    }
                }
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        return var115;
    }
    
    public static SubLObject f45434(final SubLObject var114, final SubLObject var36) {
        assert NIL != module0202.f12590(var114) : var114;
        assert NIL != module0161.f10481(var36) : var36;
        return f45431(var114, var36);
    }
    
    public static SubLObject f45431(final SubLObject var114, final SubLObject var36) {
        return (SubLObject)ConsesLow.cons(var114, var36);
    }
    
    public static SubLObject f45435(final SubLObject var93, final SubLObject var36) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        assert NIL != module0077.f5302(var93) : var93;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var94) && !module0077.f5315(var93).eql($g5829$.getGlobalValue())) {
            Errors.error((SubLObject)$ic91$, $g5829$.getGlobalValue());
        }
        assert NIL != module0161.f10481(var36) : var36;
        return f45436(var93, var36);
    }
    
    public static SubLObject f45436(final SubLObject var93, final SubLObject var36) {
        final SubLObject var94 = Vectors.make_vector((SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        f45437(var94, var93);
        Vectors.set_aref(var94, (SubLObject)ONE_INTEGER, var36);
        return var94;
    }
    
    public static SubLObject f45433(final SubLObject var68) {
        if (NIL != assertion_handles_oc.f11035(var68)) {
            return module0178.f11303(var68);
        }
        if (NIL != f45422(var68, (SubLObject)UNPROVIDED)) {
            return var68.first();
        }
        if (NIL != f45420(var68)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45438(final SubLObject var68) {
        if (NIL != assertion_handles_oc.f11035(var68)) {
            return module0178.f11287(var68);
        }
        if (NIL != f45422(var68, (SubLObject)UNPROVIDED)) {
            return var68.rest();
        }
        if (NIL != f45420(var68)) {
            return Vectors.aref(var68, (SubLObject)ONE_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45439(final SubLObject var68) {
        if (NIL != f45420(var68)) {
            return $ic92$;
        }
        return module0205.f13333(f45433(var68));
    }
    
    public static SubLObject f45440(final SubLObject var135, final SubLObject var17) {
        f45441(var135, var17, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45397(final SubLObject var135) {
        return (SubLObject)((var135.getClass() == $sX49546_native.class) ? T : NIL);
    }
    
    public static SubLObject f45442(final SubLObject var135) {
        assert NIL != f45397(var135) : var135;
        return var135.getField2();
    }
    
    public static SubLObject f45443(final SubLObject var135) {
        assert NIL != f45397(var135) : var135;
        return var135.getField3();
    }
    
    public static SubLObject f45444(final SubLObject var135, final SubLObject var137) {
        assert NIL != f45397(var135) : var135;
        return var135.setField2(var137);
    }
    
    public static SubLObject f45445(final SubLObject var135, final SubLObject var137) {
        assert NIL != f45397(var135) : var135;
        return var135.setField3(var137);
    }
    
    public static SubLObject f45446(SubLObject var138) {
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)NIL;
        }
        final SubLObject var139 = (SubLObject)new $sX49546_native();
        SubLObject var140;
        SubLObject var141;
        SubLObject var142;
        SubLObject var143;
        for (var140 = (SubLObject)NIL, var140 = var138; NIL != var140; var140 = conses_high.cddr(var140)) {
            var141 = var140.first();
            var142 = conses_high.cadr(var140);
            var143 = var141;
            if (var143.eql((SubLObject)$ic107$)) {
                f45444(var139, var142);
            }
            else if (var143.eql((SubLObject)$ic108$)) {
                f45445(var139, var142);
            }
            else {
                Errors.error((SubLObject)$ic109$, var141);
            }
        }
        return var139;
    }
    
    public static SubLObject f45447(final SubLObject var144, final SubLObject var145) {
        Functions.funcall(var145, var144, (SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var145, var144, (SubLObject)$ic112$, (SubLObject)$ic107$, f45442(var144));
        Functions.funcall(var145, var144, (SubLObject)$ic112$, (SubLObject)$ic108$, f45443(var144));
        Functions.funcall(var145, var144, (SubLObject)$ic113$, (SubLObject)$ic111$, (SubLObject)TWO_INTEGER);
        return var144;
    }
    
    public static SubLObject f45448(final SubLObject var144, final SubLObject var145) {
        return f45447(var144, var145);
    }
    
    public static SubLObject f45449(final SubLObject var104) {
        return Numbers.logxor(new SubLObject[] { $ic115$, Sxhash.sxhash(f45442(var104)), Sxhash.sxhash(f45443(var104)) });
    }
    
    public static SubLObject f45441(final SubLObject var69, final SubLObject var17, final SubLObject var18) {
        print_high.princ((SubLObject)$ic117$, var17);
        SubLObject var70 = module0077.f5333(f45400(var69));
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        for (var71 = module0032.f1741(var70), var72 = (SubLObject)NIL, var72 = module0032.f1742(var71, var70); NIL == module0032.f1744(var71, var72); var72 = module0032.f1743(var72)) {
            var73 = module0032.f1745(var71, var72);
            if (NIL != module0032.f1746(var72, var73)) {
                PrintLow.format(var17, (SubLObject)$ic118$, var73);
            }
        }
        var70 = module0077.f5333(f45379(var69));
        for (var71 = module0032.f1741(var70), var72 = (SubLObject)NIL, var72 = module0032.f1742(var71, var70); NIL == module0032.f1744(var71, var72); var72 = module0032.f1743(var72)) {
            var73 = module0032.f1745(var71, var72);
            if (NIL != module0032.f1746(var72, var73)) {
                PrintLow.format(var17, (SubLObject)$ic118$, var73);
            }
        }
        print_high.princ((SubLObject)$ic119$, var17);
        return var69;
    }
    
    public static SubLObject f45450(final SubLObject var17) {
        SubLObject var18 = (SubLObject)NIL;
        var18 = f45446((SubLObject)UNPROVIDED);
        f45444(var18, module0021.f1090(var17));
        f45445(var18, module0021.f1090(var17));
        return var18;
    }
    
    public static SubLObject f45451(final SubLObject var146, final SubLObject var17) {
        module0021.f1086($g5832$.getGlobalValue(), var17);
        module0021.f1038(f45442(var146), var17);
        module0021.f1038(f45443(var146), var17);
        return var146;
    }
    
    public static SubLObject f45452(final SubLObject var104, final SubLObject var17) {
        return f45451(var104, var17);
    }
    
    public static SubLObject f45412(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var104) && module0077.f5315(var104).eql($g5833$.getGlobalValue()) && NIL == module0078.f5364((SubLObject)$ic123$, var104, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45453(SubLObject var147) {
        if (var147 == UNPROVIDED) {
            var147 = (SubLObject)NIL;
        }
        return module0078.f5367(var147, $g5833$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45411(final SubLObject var104) {
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var104) && module0077.f5315(var104).eql($g5834$.getGlobalValue()) && NIL == module0078.f5364((SubLObject)$ic124$, var104, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45454(SubLObject var147) {
        if (var147 == UNPROVIDED) {
            var147 = (SubLObject)NIL;
        }
        return module0078.f5367(var147, $g5834$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45455(final SubLObject var68) {
        return f45403(module0078.f5369(var68, $g5834$.getGlobalValue()), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45403(final SubLObject var102, SubLObject var103) {
        if (var103 == UNPROVIDED) {
            var103 = f45453((SubLObject)UNPROVIDED);
        }
        assert NIL != f45411(var102) : var102;
        assert NIL != f45412(var103) : var103;
        return f45446((SubLObject)ConsesLow.list((SubLObject)$ic107$, var102, (SubLObject)$ic108$, var103));
    }
    
    public static SubLObject f45456(final SubLObject var69, final SubLObject var148) {
        assert NIL != f45397(var69) : var69;
        assert NIL != f45411(var148) : var148;
        f45444(var69, var148);
        return f45442(var69);
    }
    
    public static SubLObject f45457(final SubLObject var69, final SubLObject var149) {
        assert NIL != f45397(var69) : var69;
        assert NIL != f45412(var149) : var149;
        f45445(var69, var149);
        return f45443(var69);
    }
    
    public static SubLObject f45458(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != f45404(var8) && NIL != f45459(f45439(var8)));
    }
    
    public static SubLObject f45459(final SubLObject var8) {
        return (SubLObject)makeBoolean($ic127$.eql(var8) || NIL != module0731.f44690(var8, (SubLObject)UNPROVIDED) || NIL != f45460(var8));
    }
    
    public static SubLObject f45461(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var8) || NIL != f45420(var8));
    }
    
    public static SubLObject f45462(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11041(var8, (SubLObject)NIL) || NIL != f45418(var8, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45463(final SubLObject var69) {
        final SubLObject var70 = f45400(var69);
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        while (NIL == var72) {
            if (NIL != module0077.f5318(var70)) {
                f45406((SubLObject)THREE_INTEGER, (SubLObject)$ic128$, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var72 = (SubLObject)T;
            }
            else if (NIL != f45401(var71)) {
                var72 = (SubLObject)T;
            }
            else if (NIL != var71) {
                f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic76$, var71, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f45407(var69, var71);
                var71 = (SubLObject)NIL;
            }
            else {
                var71 = module0078.f5343(var70);
            }
        }
        return var71;
    }
    
    public static SubLObject f45464(final SubLObject var69) {
        return module0077.f5312(f45465(var69));
    }
    
    public static SubLObject f45400(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)NIL;
        final SubLObject var72 = $g5835$.currentBinding(var70);
        try {
            $g5835$.bind((SubLObject)T, var70);
            var71 = f45465(var69);
        }
        finally {
            $g5835$.rebind(var72, var70);
        }
        return var71;
    }
    
    public static SubLObject f45465(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        if (NIL == $g5835$.getDynamicValue(var70)) {
            f45466((SubLObject)$ic129$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f45442(var69);
    }
    
    public static SubLObject f45381(final SubLObject var69) {
        return module0077.f5312(f45379(var69));
    }
    
    public static SubLObject f45379(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)NIL;
        final SubLObject var72 = $g5836$.currentBinding(var70);
        try {
            $g5836$.bind((SubLObject)T, var70);
            var71 = f45467(var69);
        }
        finally {
            $g5836$.rebind(var72, var70);
        }
        return var71;
    }
    
    public static SubLObject f45467(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        if (NIL == $g5836$.getDynamicValue(var70)) {
            f45466((SubLObject)$ic130$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f45443(var69);
    }
    
    public static SubLObject f45393(final SubLObject var69) {
        final SubLObject var70 = f45379(var69);
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        while (NIL == var72) {
            if (NIL != module0077.f5318(var70)) {
                f45406((SubLObject)THREE_INTEGER, (SubLObject)$ic131$, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var72 = (SubLObject)T;
            }
            else if (NIL != f45417(var71)) {
                var72 = (SubLObject)T;
            }
            else if (NIL != var71) {
                f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic77$, var71, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f45409(var69, var71);
                var71 = (SubLObject)NIL;
            }
            else {
                var71 = module0078.f5343(var70);
            }
        }
        return var71;
    }
    
    public static SubLObject f45468(final SubLObject var69, final SubLObject var68, SubLObject var152) {
        if (var152 == UNPROVIDED) {
            var152 = (SubLObject)T;
        }
        final SubLObject var153 = f45400(var69);
        if (NIL != var152) {
            return module0077.f5320(var68, var153);
        }
        final SubLObject var154 = f45433(var68);
        final SubLObject var155 = f45438(var68);
        SubLObject var156 = (SubLObject)NIL;
        final SubLObject var157 = module0077.f5333(var153);
        SubLObject var158;
        SubLObject var159;
        SubLObject var160;
        for (var158 = module0032.f1741(var157), var159 = (SubLObject)NIL, var159 = module0032.f1742(var158, var157); NIL == var156 && NIL == module0032.f1744(var158, var159); var159 = module0032.f1743(var159)) {
            var160 = module0032.f1745(var158, var159);
            if (NIL != module0032.f1746(var159, var160) && f45433(var160).equal(var154) && f45438(var160).equal(var155)) {
                var156 = (SubLObject)T;
            }
        }
        return var156;
    }
    
    public static SubLObject f45469(final SubLObject var69, final SubLObject var68, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)T;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f45400(var69);
        SubLObject var160 = (SubLObject)NIL;
        final SubLObject var161 = $g5835$.currentBinding(var158);
        try {
            $g5835$.bind((SubLObject)T, var158);
            var160 = module0077.f5326(var68, var159);
        }
        finally {
            $g5835$.rebind(var161, var158);
        }
        if (NIL != var157) {
            f45470(var69);
        }
        assert NIL != f45321(var69, (SubLObject)UNPROVIDED) : var69;
        return (SubLObject)((NIL != var160) ? $ic132$ : $ic133$);
    }
    
    public static SubLObject f45470(final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = module0077.f5333(f45400(var69));
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var99_162;
        SubLObject var100_163;
        SubLObject var101_164;
        SubLObject var80;
        for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
            var74 = module0032.f1745(var72, var73);
            if (NIL != module0032.f1746(var73, var74) && NIL != f45422(var74, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)NIL;
                if (NIL == var75) {
                    var76 = f45471(var74);
                    var77 = (SubLObject)NIL;
                    var77 = var76.first();
                    while (NIL == var75 && NIL != var76) {
                        var78 = (SubLObject)NIL;
                        var79 = f45400(var69);
                        var99_162 = module0077.f5333(var79);
                        for (var100_163 = module0032.f1741(var99_162), var101_164 = (SubLObject)NIL, var101_164 = module0032.f1742(var100_163, var99_162); NIL == var78 && NIL == module0032.f1744(var100_163, var101_164); var101_164 = module0032.f1743(var101_164)) {
                            var80 = module0032.f1745(var100_163, var101_164);
                            if (NIL != module0032.f1746(var101_164, var80) && !var80.eql(var74) && NIL != module0731.f44702(f45439(var80), var77, (SubLObject)UNPROVIDED)) {
                                var78 = var80;
                            }
                        }
                        if (NIL == var78) {
                            var75 = var77;
                        }
                        var76 = var76.rest();
                        var77 = var76.first();
                    }
                }
                if (NIL == var75) {
                    var70 = (SubLObject)ConsesLow.cons(var74, var70);
                }
            }
        }
        SubLObject var81 = var70;
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            if (!ONE_INTEGER.eql(module0077.f5311(f45400(var69)))) {
                f45407(var69, var82);
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        return var70;
    }
    
    public static SubLObject f45407(final SubLObject var69, final SubLObject var68) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)NIL;
        final SubLObject var72 = f45433(var68);
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0077.f5333(f45400(var69));
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
            var77 = module0032.f1745(var75, var76);
            if (NIL != module0032.f1746(var76, var77) && f45433(var77).equal(var72)) {
                var73 = (SubLObject)ConsesLow.cons(var77, var73);
            }
        }
        if (NIL != var73) {
            var71 = (SubLObject)T;
            SubLObject var78 = var73;
            SubLObject var68_167 = (SubLObject)NIL;
            var68_167 = var78.first();
            while (NIL != var78) {
                final SubLObject var79 = $g5835$.currentBinding(var70);
                try {
                    $g5835$.bind((SubLObject)T, var70);
                    module0077.f5327(var68_167, f45465(var69));
                }
                finally {
                    $g5835$.rebind(var79, var70);
                }
                var78 = var78.rest();
                var68_167 = var78.first();
            }
        }
        assert NIL != f45321(var69, (SubLObject)UNPROVIDED) : var69;
        return (SubLObject)((NIL != var71) ? $ic134$ : $ic135$);
    }
    
    public static SubLObject f45472(final SubLObject var69, final SubLObject var68) {
        final SubLObject var70 = f45379(var69);
        return module0077.f5320(var68, var70);
    }
    
    public static SubLObject f45473(final SubLObject var168, final SubLObject var169) {
        return Equality.equalp(var168, var169);
    }
    
    public static SubLObject f45474(final SubLObject var69, final SubLObject var68) {
        if (NIL != f45472(var69, var68)) {
            return (SubLObject)$ic133$;
        }
        if (NIL != f45475(var68)) {
            final SubLObject var70 = f45379(var69);
            SubLObject var71 = (SubLObject)NIL;
            final SubLObject var72 = module0077.f5333(var70);
            SubLObject var73;
            SubLObject var74;
            SubLObject var75;
            SubLObject var99_171;
            SubLObject var100_172;
            SubLObject var101_173;
            SubLObject var76;
            for (var73 = module0032.f1741(var72), var74 = (SubLObject)NIL, var74 = module0032.f1742(var73, var72); NIL == var71 && NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
                var75 = module0032.f1745(var73, var74);
                if (NIL != module0032.f1746(var74, var75) && NIL != f45476(var75, var68)) {
                    var99_171 = module0077.f5333(f45477(var68));
                    for (var100_172 = module0032.f1741(var99_171), var101_173 = (SubLObject)NIL, var101_173 = module0032.f1742(var100_172, var99_171); NIL == module0032.f1744(var100_172, var101_173); var101_173 = module0032.f1743(var101_173)) {
                        var76 = module0032.f1745(var100_172, var101_173);
                        if (NIL != module0032.f1746(var101_173, var76)) {
                            module0077.f5326(var76, f45477(var75));
                        }
                    }
                    var71 = (SubLObject)T;
                }
            }
            if (NIL == var71) {
                f45478(var69, var68);
            }
            return var69;
        }
        f45478(var69, var68);
        return var69;
    }
    
    public static SubLObject f45475(final SubLObject var68) {
        return f45420(var68);
    }
    
    public static SubLObject f45478(final SubLObject var69, final SubLObject var68) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = $g5836$.currentBinding(var70);
        try {
            $g5836$.bind((SubLObject)T, var70);
            module0077.f5326(var68, f45467(var69));
        }
        finally {
            $g5836$.rebind(var71, var70);
        }
        assert NIL != f45321(var69, (SubLObject)UNPROVIDED) : var69;
        return var69;
    }
    
    public static SubLObject f45476(final SubLObject var168, final SubLObject var169) {
        return (SubLObject)makeBoolean(NIL != f45420(var168) && f45438(var168).eql(f45438(var169)));
    }
    
    public static SubLObject f45477(final SubLObject var68) {
        return Vectors.aref(var68, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f45437(final SubLObject var68, final SubLObject var93) {
        assert NIL != module0077.f5302(var93) : var93;
        Vectors.set_aref(var68, (SubLObject)ZERO_INTEGER, var93);
        return var68;
    }
    
    public static SubLObject f45479(final SubLObject var68, SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)NIL;
        }
        if (NIL != f45413(var68)) {
            if (!var174.isInteger()) {
                final SubLObject var175 = f45439(var68);
                var174 = module0732.f44992(var175);
            }
            if (var174.isInteger()) {
                final SubLObject var176 = module0205.f13180(f45433(var68), (SubLObject)UNPROVIDED);
                final SubLObject var177 = module0035.f2002(var176, var174, (SubLObject)UNPROVIDED);
                if (NIL == var177) {
                    f45466((SubLObject)$ic137$, var174, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return (SubLObject)((NIL != var177) ? ConsesLow.list(ConsesLow.nth(var174, var176)) : NIL);
            }
        }
        else if (NIL != f45420(var68)) {
            return module0077.f5312(f45477(var68));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45480(final SubLObject var68, SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)NIL;
        }
        final SubLThread var175 = SubLProcess.currentSubLThread();
        final SubLObject var176 = module0034.$g879$.getDynamicValue(var175);
        SubLObject var177 = (SubLObject)NIL;
        if (NIL == var176) {
            return f45479(var68, var174);
        }
        var177 = module0034.f1857(var176, (SubLObject)$ic136$, (SubLObject)UNPROVIDED);
        if (NIL == var177) {
            var177 = module0034.f1807(module0034.f1842(var176), (SubLObject)$ic136$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUALP, (SubLObject)UNPROVIDED);
            module0034.f1860(var176, (SubLObject)$ic136$, var177);
        }
        final SubLObject var178 = module0034.f1782(var68, var174);
        final SubLObject var179 = module0034.f1814(var177, var178, (SubLObject)UNPROVIDED);
        if (var179 != $ic11$) {
            SubLObject var180 = var179;
            SubLObject var181 = (SubLObject)NIL;
            var181 = var180.first();
            while (NIL != var180) {
                SubLObject var182 = var181.first();
                final SubLObject var183 = conses_high.second(var181);
                if (var68.equalp(var182.first())) {
                    var182 = var182.rest();
                    if (NIL != var182 && NIL == var182.rest() && var174.equalp(var182.first())) {
                        return module0034.f1959(var183);
                    }
                }
                var180 = var180.rest();
                var181 = var180.first();
            }
        }
        final SubLObject var184 = Values.arg2(var175.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45479(var68, var174)));
        module0034.f1836(var177, var178, var179, var184, (SubLObject)ConsesLow.list(var68, var174));
        return module0034.f1959(var184);
    }
    
    public static SubLObject f45481(final SubLObject var68, SubLObject var176) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)NIL;
        }
        if (NIL != f45413(var68)) {
            return (SubLObject)((NIL != module0178.f11284(var68)) ? ConsesLow.list(module0731.f44858(var68, var176)) : NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45482(final SubLObject var68, SubLObject var176) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)NIL;
        }
        final SubLThread var177 = SubLProcess.currentSubLThread();
        final SubLObject var178 = module0034.$g879$.getDynamicValue(var177);
        SubLObject var179 = (SubLObject)NIL;
        if (NIL == var178) {
            return f45481(var68, var176);
        }
        var179 = module0034.f1857(var178, (SubLObject)$ic138$, (SubLObject)UNPROVIDED);
        if (NIL == var179) {
            var179 = module0034.f1807(module0034.f1842(var178), (SubLObject)$ic138$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUALP, (SubLObject)UNPROVIDED);
            module0034.f1860(var178, (SubLObject)$ic138$, var179);
        }
        final SubLObject var180 = module0034.f1782(var68, var176);
        final SubLObject var181 = module0034.f1814(var179, var180, (SubLObject)UNPROVIDED);
        if (var181 != $ic11$) {
            SubLObject var182 = var181;
            SubLObject var183 = (SubLObject)NIL;
            var183 = var182.first();
            while (NIL != var182) {
                SubLObject var184 = var183.first();
                final SubLObject var185 = conses_high.second(var183);
                if (var68.equalp(var184.first())) {
                    var184 = var184.rest();
                    if (NIL != var184 && NIL == var184.rest() && var176.equalp(var184.first())) {
                        return module0034.f1959(var185);
                    }
                }
                var182 = var182.rest();
                var183 = var182.first();
            }
        }
        final SubLObject var186 = Values.arg2(var177.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45481(var68, var176)));
        module0034.f1836(var179, var180, var181, var186, (SubLObject)ConsesLow.list(var68, var176));
        return module0034.f1959(var186);
    }
    
    public static SubLObject f45409(final SubLObject var69, final SubLObject var68) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)NIL;
        final SubLObject var72 = $g5836$.currentBinding(var70);
        try {
            $g5836$.bind((SubLObject)T, var70);
            var71 = module0077.f5327(var68, f45467(var69));
        }
        finally {
            $g5836$.rebind(var72, var70);
        }
        return (SubLObject)((NIL != var71) ? var69 : $ic135$);
    }
    
    public static SubLObject f45360(final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = module0077.f5333(f45400(var69));
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
            var74 = module0032.f1745(var72, var73);
            if (NIL != module0032.f1746(var73, var74)) {
                var75 = f45471(var74);
                var76 = (SubLObject)NIL;
                var76 = var75.first();
                while (NIL != var75) {
                    var77 = var76;
                    if (NIL == conses_high.member(var77, var70, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var70 = (SubLObject)ConsesLow.cons(var77, var70);
                    }
                    var75 = var75.rest();
                    var76 = var75.first();
                }
            }
        }
        if (NIL == var70) {
            var70 = (SubLObject)$ic139$;
        }
        return var70;
    }
    
    public static SubLObject f45483(final SubLObject var134) {
        return f45460(f45439(var134));
    }
    
    public static SubLObject f45471(final SubLObject var134) {
        final SubLObject var135 = f45433(var134);
        final SubLObject var136 = f45439(var134);
        if (NIL != f45460(var136)) {
            SubLObject var137 = (SubLObject)NIL;
            final SubLObject var138 = f45484(var136);
            final SubLObject var139 = module0205.f13384(var135, var138, (SubLObject)UNPROVIDED);
            SubLObject var140 = f45485(var139);
            SubLObject var141 = (SubLObject)NIL;
            var141 = var140.first();
            while (NIL != var140) {
                final SubLObject var142 = var141;
                if (NIL == conses_high.member(var142, var137, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var137 = (SubLObject)ConsesLow.cons(var142, var137);
                }
                var140 = var140.rest();
                var141 = var140.first();
            }
            return var137;
        }
        if ($ic127$.eql(var136)) {
            return f45486(module0205.f13388(var135, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(var136);
    }
    
    public static SubLObject f45487() {
        final SubLObject var183 = $g5837$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45488(final SubLObject var184, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = module0584.$g4396$.getDynamicValue();
        }
        return module0034.f1829($g5837$.getGlobalValue(), (SubLObject)ConsesLow.list(var184, var36), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45489(final SubLObject var184, final SubLObject var36) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        SubLObject var186 = (SubLObject)NIL;
        SubLObject var187 = (SubLObject)NIL;
        if (NIL == var187) {
            SubLObject var188 = var184;
            final SubLObject var189 = (SubLObject)$ic143$;
            final SubLObject var190 = module0056.f4145(var189);
            final SubLObject var191 = module0139.$g1635$.currentBinding(var185);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var185);
                final SubLObject var25_189 = module0147.$g2095$.currentBinding(var185);
                final SubLObject var192 = module0147.$g2094$.currentBinding(var185);
                final SubLObject var193 = module0147.$g2096$.currentBinding(var185);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var36), var185);
                    module0147.$g2094$.bind(module0147.f9546(var36), var185);
                    module0147.$g2096$.bind(module0147.f9549(var36), var185);
                    final SubLObject var194 = $ic144$;
                    final SubLObject var25_190 = module0141.$g1714$.currentBinding(var185);
                    final SubLObject var39_192 = module0141.$g1715$.currentBinding(var185);
                    try {
                        module0141.$g1714$.bind((NIL != var194) ? var194 : module0141.f9283(), var185);
                        module0141.$g1715$.bind((SubLObject)((NIL != var194) ? $ic145$ : module0141.$g1715$.getDynamicValue(var185)), var185);
                        if (NIL != var194 && NIL != module0136.f8864() && NIL == module0141.f9279(var194)) {
                            final SubLObject var195 = module0136.$g1591$.getDynamicValue(var185);
                            if (var195.eql((SubLObject)$ic146$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic147$, var194, (SubLObject)$ic148$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var195.eql((SubLObject)$ic149$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic150$, (SubLObject)$ic147$, var194, (SubLObject)$ic148$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var195.eql((SubLObject)$ic151$)) {
                                Errors.warn((SubLObject)$ic147$, var194, (SubLObject)$ic148$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic152$, module0136.$g1591$.getDynamicValue(var185));
                                Errors.cerror((SubLObject)$ic150$, (SubLObject)$ic147$, var194, (SubLObject)$ic148$);
                            }
                        }
                        final SubLObject var25_191 = module0141.$g1670$.currentBinding(var185);
                        final SubLObject var39_193 = module0141.$g1671$.currentBinding(var185);
                        final SubLObject var40_195 = module0141.$g1672$.currentBinding(var185);
                        final SubLObject var196 = module0141.$g1674$.currentBinding(var185);
                        final SubLObject var197 = module0137.$g1605$.currentBinding(var185);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic153$), var185);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic153$)), var185);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic153$)), var185);
                            module0141.$g1674$.bind((SubLObject)NIL, var185);
                            module0137.$g1605$.bind(module0137.f8955($ic153$), var185);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var184, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var25_192 = module0141.$g1677$.currentBinding(var185);
                                final SubLObject var39_194 = module0138.$g1619$.currentBinding(var185);
                                final SubLObject var40_196 = module0141.$g1674$.currentBinding(var185);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var185);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic153$)), var185);
                                    module0141.$g1674$.bind((SubLObject)NIL, var185);
                                    module0249.f16055(var188, (SubLObject)UNPROVIDED);
                                    while (NIL != var188 && NIL == var187) {
                                        final SubLObject var198 = var188;
                                        if (NIL == module0731.f44656(var198, (SubLObject)UNPROVIDED)) {
                                            var187 = (SubLObject)T;
                                        }
                                        else if (NIL != module0731.f44713(var198, $ic154$, (SubLObject)UNPROVIDED)) {
                                            SubLObject var199 = module0731.f44659(var198);
                                            SubLObject var200 = (SubLObject)NIL;
                                            var200 = var199.first();
                                            while (NIL != var199) {
                                                final SubLObject var201 = var200;
                                                if (NIL == conses_high.member(var201, var186, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                    var186 = (SubLObject)ConsesLow.cons(var201, var186);
                                                }
                                                var199 = var199.rest();
                                                var200 = var199.first();
                                            }
                                        }
                                        final SubLObject var202 = module0200.f12443(module0137.f8955($ic153$));
                                        SubLObject var203;
                                        SubLObject var204;
                                        SubLObject var25_193;
                                        SubLObject var39_195;
                                        SubLObject var205;
                                        SubLObject var206;
                                        SubLObject var207;
                                        SubLObject var208;
                                        SubLObject var212_213;
                                        SubLObject var209;
                                        SubLObject var25_194;
                                        SubLObject var211_216;
                                        SubLObject var210;
                                        SubLObject var211;
                                        SubLObject var25_195;
                                        SubLObject var212;
                                        SubLObject var213;
                                        SubLObject var214;
                                        SubLObject var215;
                                        SubLObject var216;
                                        SubLObject var217;
                                        SubLObject var218;
                                        SubLObject var219;
                                        SubLObject var204_223;
                                        SubLObject var220;
                                        SubLObject var25_196;
                                        SubLObject var222;
                                        SubLObject var221;
                                        SubLObject var223;
                                        SubLObject var224;
                                        SubLObject var225;
                                        SubLObject var226;
                                        SubLObject var227;
                                        SubLObject var228;
                                        for (var203 = (SubLObject)NIL, var203 = var202; NIL == var187 && NIL != var203; var203 = var203.rest()) {
                                            var204 = var203.first();
                                            var25_193 = module0137.$g1605$.currentBinding(var185);
                                            var39_195 = module0141.$g1674$.currentBinding(var185);
                                            try {
                                                module0137.$g1605$.bind(var204, var185);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var185)) : module0141.$g1674$.getDynamicValue(var185)), var185);
                                                var205 = module0228.f15229(var188);
                                                if (NIL != module0138.f8992(var205)) {
                                                    var206 = module0242.f15664(var205, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var206) {
                                                        var207 = module0245.f15834(var206, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var207) {
                                                            for (var208 = module0066.f4838(module0067.f4891(var207)); NIL == var187 && NIL == module0066.f4841(var208); var208 = module0066.f4840(var208)) {
                                                                var185.resetMultipleValues();
                                                                var212_213 = module0066.f4839(var208);
                                                                var209 = var185.secondMultipleValue();
                                                                var185.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var212_213)) {
                                                                    var25_194 = module0138.$g1623$.currentBinding(var185);
                                                                    try {
                                                                        module0138.$g1623$.bind(var212_213, var185);
                                                                        for (var211_216 = module0066.f4838(module0067.f4891(var209)); NIL == var187 && NIL == module0066.f4841(var211_216); var211_216 = module0066.f4840(var211_216)) {
                                                                            var185.resetMultipleValues();
                                                                            var210 = module0066.f4839(var211_216);
                                                                            var211 = var185.secondMultipleValue();
                                                                            var185.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var210)) {
                                                                                var25_195 = module0138.$g1624$.currentBinding(var185);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var210, var185);
                                                                                    var212 = var211;
                                                                                    if (NIL != module0077.f5302(var212)) {
                                                                                        var213 = module0077.f5333(var212);
                                                                                        for (var214 = module0032.f1741(var213), var215 = (SubLObject)NIL, var215 = module0032.f1742(var214, var213); NIL == var187 && NIL == module0032.f1744(var214, var215); var215 = module0032.f1743(var215)) {
                                                                                            var216 = module0032.f1745(var214, var215);
                                                                                            if (NIL != module0032.f1746(var215, var216) && NIL == module0249.f16059(var216, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var216, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var216, var190);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var212.isList()) {
                                                                                        if (NIL == var187) {
                                                                                            var217 = var212;
                                                                                            var218 = (SubLObject)NIL;
                                                                                            var218 = var217.first();
                                                                                            while (NIL == var187 && NIL != var217) {
                                                                                                if (NIL == module0249.f16059(var218, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var218, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var218, var190);
                                                                                                }
                                                                                                var217 = var217.rest();
                                                                                                var218 = var217.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic155$, var212);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var25_195, var185);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var211_216);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var25_194, var185);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var208);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic156$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var205, (SubLObject)UNPROVIDED)) {
                                                    var219 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var185), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var185), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var204_223 = (SubLObject)NIL, var204_223 = var219; NIL == var187 && NIL != var204_223; var204_223 = var204_223.rest()) {
                                                        var220 = var204_223.first();
                                                        var25_196 = module0138.$g1625$.currentBinding(var185);
                                                        try {
                                                            module0138.$g1625$.bind(var220, var185);
                                                            var221 = (var222 = Functions.funcall(var220, var205));
                                                            if (NIL != module0077.f5302(var222)) {
                                                                var223 = module0077.f5333(var222);
                                                                for (var224 = module0032.f1741(var223), var225 = (SubLObject)NIL, var225 = module0032.f1742(var224, var223); NIL == var187 && NIL == module0032.f1744(var224, var225); var225 = module0032.f1743(var225)) {
                                                                    var226 = module0032.f1745(var224, var225);
                                                                    if (NIL != module0032.f1746(var225, var226) && NIL == module0249.f16059(var226, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var226, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var226, var190);
                                                                    }
                                                                }
                                                            }
                                                            else if (var222.isList()) {
                                                                if (NIL == var187) {
                                                                    var227 = var222;
                                                                    var228 = (SubLObject)NIL;
                                                                    var228 = var227.first();
                                                                    while (NIL == var187 && NIL != var227) {
                                                                        if (NIL == module0249.f16059(var228, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var228, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var228, var190);
                                                                        }
                                                                        var227 = var227.rest();
                                                                        var228 = var227.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic155$, var222);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var25_196, var185);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var39_195, var185);
                                                module0137.$g1605$.rebind(var25_193, var185);
                                            }
                                        }
                                        var188 = module0056.f4150(var190);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var40_196, var185);
                                    module0138.$g1619$.rebind(var39_194, var185);
                                    module0141.$g1677$.rebind(var25_192, var185);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic157$, var184, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var197, var185);
                            module0141.$g1674$.rebind(var196, var185);
                            module0141.$g1672$.rebind(var40_195, var185);
                            module0141.$g1671$.rebind(var39_193, var185);
                            module0141.$g1670$.rebind(var25_191, var185);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var39_192, var185);
                        module0141.$g1714$.rebind(var25_190, var185);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var193, var185);
                    module0147.$g2094$.rebind(var192, var185);
                    module0147.$g2095$.rebind(var25_189, var185);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var185));
            }
            finally {
                module0139.$g1635$.rebind(var191, var185);
            }
        }
        return var186;
    }
    
    public static SubLObject f45486(final SubLObject var184, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var185 = $g5837$.getGlobalValue();
        if (NIL == var185) {
            var185 = module0034.f1934((SubLObject)$ic140$, (SubLObject)$ic158$, (SubLObject)$ic159$, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1949((SubLObject)$ic160$);
        }
        final SubLObject var186 = module0034.f1782(var184, var36);
        final SubLObject var187 = module0034.f1814(var185, var186, (SubLObject)UNPROVIDED);
        if (var187 != $ic11$) {
            SubLObject var188 = var187;
            SubLObject var189 = (SubLObject)NIL;
            var189 = var188.first();
            while (NIL != var188) {
                SubLObject var190 = var189.first();
                final SubLObject var191 = conses_high.second(var189);
                if (var184.eql(var190.first())) {
                    var190 = var190.rest();
                    if (NIL != var190 && NIL == var190.rest() && var36.eql(var190.first())) {
                        return module0034.f1959(var191);
                    }
                }
                var188 = var188.rest();
                var189 = var188.first();
            }
        }
        final SubLObject var192 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45489(var184, var36)));
        module0034.f1836(var185, var186, var187, var192, (SubLObject)ConsesLow.list(var184, var36));
        return module0034.f1959(var192);
    }
    
    public static SubLObject f45484(final SubLObject var119) {
        if (NIL == f45460(var119)) {
            return (SubLObject)NIL;
        }
        if (var119.eql($ic161$)) {
            return (SubLObject)TWO_INTEGER;
        }
        return (SubLObject)THREE_INTEGER;
    }
    
    public static SubLObject f45490(final SubLObject var119) {
        if (var119.eql($ic127$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (NIL != module0731.f44690(var119, (SubLObject)UNPROVIDED)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (NIL != f45460(var119)) {
            return f45491(var119);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45491(final SubLObject var119) {
        if (NIL == f45460(var119)) {
            return (SubLObject)NIL;
        }
        if (var119.eql($ic161$)) {
            return (SubLObject)THREE_INTEGER;
        }
        return (SubLObject)FOUR_INTEGER;
    }
    
    public static SubLObject f45492(final SubLObject var69) {
        final SubLObject var70 = f45463(var69);
        final SubLObject var71 = f45439(var70);
        final SubLObject var72 = (SubLObject)(var71.eql($ic163$) ? NIL : module0078.f5363((SubLObject)$ic164$, f45379(var69), (SubLObject)UNPROVIDED));
        final SubLObject var73 = (SubLObject)((NIL != var72) ? f45493(var72) : NIL);
        if (NIL != var73) {
            return var73;
        }
        if (var71.eql($ic127$)) {
            return module0205.f13204(f45433(var70), (SubLObject)UNPROVIDED);
        }
        if (NIL != f45460(var71)) {
            final SubLObject var74 = f45484(var71);
            final SubLObject var75 = module0205.f13384(f45433(var70), var74, (SubLObject)UNPROVIDED);
            return f45494(var75);
        }
        if (NIL != module0731.f44690(var71, (SubLObject)UNPROVIDED)) {
            return module0731.f44691(var71);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45358(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = module0034.$g879$.getDynamicValue(var70);
        SubLObject var72 = (SubLObject)NIL;
        if (NIL == var71) {
            return f45492(var69);
        }
        var72 = module0034.f1857(var71, (SubLObject)$ic162$, (SubLObject)UNPROVIDED);
        if (NIL == var72) {
            var72 = module0034.f1807(module0034.f1842(var71), (SubLObject)$ic162$, (SubLObject)ONE_INTEGER, (SubLObject)$ic165$, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var71, (SubLObject)$ic162$, var72);
        }
        SubLObject var73 = module0034.f1814(var72, var69, (SubLObject)$ic11$);
        if (var73 == $ic11$) {
            var73 = Values.arg2(var70.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45492(var69)));
            module0034.f1816(var72, var69, var73, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var73);
    }
    
    public static SubLObject f45495(final SubLObject var69, SubLObject var232) {
        if (var232 == UNPROVIDED) {
            var232 = (SubLObject)T;
        }
        final SubLObject var233 = f45463(var69);
        final SubLObject var234 = f45439(var233);
        if (NIL != f45496(var234)) {
            return (SubLObject)NIL;
        }
        final SubLObject var235 = module0732.f45009(var234);
        SubLObject var236 = (SubLObject)NIL;
        if (var235.isInteger()) {
            var236 = module0205.f13384(f45433(var233), var235, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)((NIL == var232 || NIL != module0731.f44764(var236, (SubLObject)UNPROVIDED)) ? var236 : NIL);
    }
    
    public static SubLObject f45497(final SubLObject var69) {
        final SubLObject var70 = module0077.f5333(f45379(var69));
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        for (var71 = module0032.f1741(var70), var72 = (SubLObject)NIL, var72 = module0032.f1742(var71, var70); NIL == module0032.f1744(var71, var72); var72 = module0032.f1743(var72)) {
            var73 = module0032.f1745(var71, var72);
            if (NIL != module0032.f1746(var72, var73)) {
                var74 = f45498(var73);
                if (NIL != module0173.f10955(var74)) {
                    return var74;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45498(final SubLObject var230) {
        final SubLObject var231 = f45439(var230);
        final SubLObject var232 = module0732.f45006(var231, (SubLObject)UNPROVIDED);
        return (SubLObject)(var232.isInteger() ? module0205.f13384(f45433(var230), var232, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f45499(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic166$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic166$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic166$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var243_244 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic166$);
            var243_244 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic166$);
            if (NIL == conses_high.member(var243_244, (SubLObject)$ic167$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var243_244 == $ic68$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic166$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic168$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic169$;
        final SubLObject var15 = (SubLObject)$ic170$;
        final SubLObject var16 = (SubLObject)$ic171$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.listS((SubLObject)$ic172$, var7, (SubLObject)$ic7$)), (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic173$, (SubLObject)ConsesLow.list((SubLObject)$ic174$, var14), (SubLObject)ConsesLow.list((SubLObject)$ic175$, var14)))), (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic176$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic177$, var12, (SubLObject)ConsesLow.list((SubLObject)$ic178$, var16)), (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic136$, var16, var15)), ConsesLow.append(var13, (SubLObject)NIL))))));
    }
    
    public static SubLObject f45500(final SubLObject var90) {
        SubLObject var91 = (SubLObject)NIL;
        if (NIL != f45501(f45439(var90))) {
            var91 = (SubLObject)T;
        }
        else if (NIL != f45502(var90)) {
            var91 = (SubLObject)T;
        }
        return var91;
    }
    
    public static SubLObject f45501(final SubLObject var248) {
        return module0004.f104(var248, $g5838$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45502(final SubLObject var90) {
        SubLObject var91 = (SubLObject)NIL;
        if (NIL != assertion_handles_oc.f11035(var90) && NIL == var91) {
            SubLObject var92 = module0211.f13701(var90);
            SubLObject var93 = (SubLObject)NIL;
            var93 = var92.first();
            while (NIL == var91 && NIL != var92) {
                if (NIL != f45503(var93)) {
                    var91 = (SubLObject)T;
                }
                var92 = var92.rest();
                var93 = var92.first();
            }
        }
        return var91;
    }
    
    public static SubLObject f45503(final SubLObject var249) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var249) && NIL != module0260.f17089(module0178.f11333(var249), $ic180$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45504(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic181$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic182$;
            final SubLObject var10 = (SubLObject)$ic183$;
            final SubLObject var11 = (SubLObject)$ic184$;
            final SubLObject var12 = (SubLObject)$ic185$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.listS((SubLObject)$ic172$, var7, (SubLObject)$ic7$)), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic173$, (SubLObject)ConsesLow.list((SubLObject)$ic174$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic186$, var9))), reader.bq_cons(var12, (SubLObject)$ic7$)), (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic176$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic187$, (SubLObject)ConsesLow.list((SubLObject)$ic188$, var11), (SubLObject)ConsesLow.listS((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic138$, var11, var10)), ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic189$, var11, var12))), (SubLObject)ConsesLow.list((SubLObject)$ic28$, (SubLObject)ConsesLow.list(var11, var12), (SubLObject)ConsesLow.list((SubLObject)$ic190$, var7, var11))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic181$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45505(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic191$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic191$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic191$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic192$;
            final SubLObject var10 = (SubLObject)$ic193$;
            final SubLObject var11 = (SubLObject)$ic194$;
            final SubLObject var12 = (SubLObject)$ic195$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic196$, var7))), (SubLObject)ConsesLow.list((SubLObject)$ic197$, (SubLObject)ConsesLow.list(var9, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic198$, var9)), (SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic199$, var9)), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic200$, var10, var11, var12))), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic191$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45506(final SubLObject var69) {
        return f45507(var69);
    }
    
    public static SubLObject f45508(final SubLObject var68) {
        return f45509(var68);
    }
    
    public static SubLObject f45510(final SubLObject var68) {
        return f45511(var68);
    }
    
    public static SubLObject f45512(final SubLObject var259, final SubLObject var260, final SubLObject var261) {
        return f45513(var259, var260, var261);
    }
    
    public static SubLObject f45338(final SubLObject var69) {
        final SubLObject var70 = f45514(var69);
        final SubLObject var71 = f45507(var69);
        final SubLObject var72 = f45515(var69);
        return (SubLObject)((NIL != var71) ? f45513(var70, var71, var72) : NIL);
    }
    
    public static SubLObject f45507(final SubLObject var69) {
        final SubLObject var70 = f45463(var69);
        return f45516(var70);
    }
    
    public static SubLObject f45516(final SubLObject var134) {
        final SubLObject var135 = f45439(var134);
        final SubLObject var136 = f45490(var135);
        return (SubLObject)(var136.isInteger() ? module0209.f13552(module0205.f13384(f45433(var134), var136, (SubLObject)UNPROVIDED)) : NIL);
    }
    
    public static SubLObject f45514(final SubLObject var69) {
        final SubLObject var70 = f45393(var69);
        return f45509(var70);
    }
    
    public static SubLObject f45509(final SubLObject var68) {
        return module0732.f45018(f45433(var68));
    }
    
    public static SubLObject f45515(final SubLObject var69) {
        final SubLObject var70 = f45393(var69);
        return f45511(var70);
    }
    
    public static SubLObject f45511(final SubLObject var68) {
        return module0732.f45019(f45433(var68));
    }
    
    public static SubLObject f45517(final SubLObject var69) {
        return (SubLObject)makeBoolean(NIL == f45514(var69) && NIL == f45515(var69));
    }
    
    public static SubLObject f45518(final SubLObject var263) {
        final SubLObject var264 = module0209.f13552(var263);
        final SubLObject var265 = f45432(var264, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var266 = (SubLObject)NIL;
        SubLObject var267 = var265;
        SubLObject var268 = (SubLObject)NIL;
        var268 = var267.first();
        while (NIL != var267) {
            if (NIL != f45321(var268, (SubLObject)UNPROVIDED)) {
                final SubLObject var269 = f45507(var268);
                final SubLObject var271;
                final SubLObject var270 = var271 = module0777.f50110(var269, var264);
                if (NIL != var271) {
                    var266 = (SubLObject)ConsesLow.cons(var271, var266);
                }
            }
            var267 = var267.rest();
            var268 = var267.first();
        }
        return Sequences.remove_duplicates(var266, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45374(final SubLObject var69, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)T;
        }
        final SubLObject var87 = f45463(var69);
        final SubLObject var88 = f45439(var87);
        final SubLObject var89 = f45393(var69);
        if (NIL != var86 && NIL != f45460(var88)) {
            return var88;
        }
        if (NIL != f45404(var89)) {
            return f45439(var89);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45362(final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = f45374(var69, (SubLObject)NIL);
        final SubLObject var72 = (SubLObject)((NIL != module0212.f13762(var71)) ? module0732.f44992(var71) : NIL);
        if (var72.isInteger()) {
            final SubLObject var73 = module0077.f5333(f45379(var69));
            SubLObject var74;
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                var76 = module0032.f1745(var74, var75);
                if (NIL != module0032.f1746(var75, var76)) {
                    var77 = f45480(var76, var72);
                    var78 = (SubLObject)NIL;
                    var78 = var77.first();
                    while (NIL != var77) {
                        var70 = (SubLObject)ConsesLow.cons(var78, var70);
                        var77 = var77.rest();
                        var78 = var77.first();
                    }
                }
            }
        }
        return var70;
    }
    
    public static SubLObject f45365(final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = f45374(var69, (SubLObject)NIL);
        final SubLObject var72 = (SubLObject)((NIL != module0212.f13762(var71)) ? module0732.f44992(var71) : NIL);
        if (var72.isInteger()) {
            final SubLObject var73 = module0077.f5333(f45379(var69));
            SubLObject var74;
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                var76 = module0032.f1745(var74, var75);
                if (NIL != module0032.f1746(var75, var76) && NIL != f45500(var76)) {
                    var77 = f45480(var76, var72);
                    var78 = (SubLObject)NIL;
                    var78 = var77.first();
                    while (NIL != var77) {
                        var70 = (SubLObject)ConsesLow.cons(var78, var70);
                        var77 = var77.rest();
                        var78 = var77.first();
                    }
                }
            }
        }
        return var70;
    }
    
    public static SubLObject f45367(final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = f45374(var69, (SubLObject)NIL);
        final SubLObject var72 = (SubLObject)((NIL != module0212.f13762(var71)) ? module0732.f44995(var71) : NIL);
        SubLObject var73 = (SubLObject)NIL;
        if (var72.isInteger()) {
            final SubLObject var74 = module0077.f5333(f45379(var69));
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                var77 = module0032.f1745(var75, var76);
                if (NIL != module0032.f1746(var76, var77)) {
                    if (NIL != f45417(var77)) {
                        var78 = f45482(var77, var72);
                        var79 = (SubLObject)NIL;
                        var79 = var78.first();
                        while (NIL != var78) {
                            var70 = (SubLObject)ConsesLow.cons(var79, var70);
                            var78 = var78.rest();
                            var79 = var78.first();
                        }
                    }
                    else {
                        var73 = (SubLObject)ConsesLow.cons(var77, var73);
                    }
                }
            }
            SubLObject var80 = var73;
            SubLObject var81 = (SubLObject)NIL;
            var81 = var80.first();
            while (NIL != var80) {
                f45409(var69, var81);
                var80 = var80.rest();
                var81 = var80.first();
            }
        }
        return var70;
    }
    
    public static SubLObject f45375(final SubLObject var69) {
        return f45438(f45463(var69));
    }
    
    public static SubLObject f45377(final SubLObject var69) {
        if (NIL != module0077.f5316(f45379(var69))) {
            return (SubLObject)NIL;
        }
        final SubLObject var70 = f45375(var69);
        final SubLObject var71 = f45393(var69);
        final SubLObject var72 = f45438(var71);
        return (NIL != module0731.f44644(var72, var70)) ? var72 : var70;
    }
    
    public static SubLObject f45333(final SubLObject var69, final SubLObject var17, final SubLObject var18) {
        PrintLow.format(var17, (SubLObject)$ic201$, f45495(var69, (SubLObject)UNPROVIDED));
        PrintLow.format(var17, (SubLObject)$ic202$, f45358(var69));
        PrintLow.format(var17, (SubLObject)$ic203$, f45360(var69));
        PrintLow.format(var17, (SubLObject)$ic204$, f45373(var69, (SubLObject)UNPROVIDED));
        PrintLow.format(var17, (SubLObject)$ic205$, f45361(var69));
        PrintLow.format(var17, (SubLObject)$ic206$, f45390(var69));
        PrintLow.format(var17, (SubLObject)$ic207$, f45341(var69));
        return var69;
    }
    
    public static SubLObject f45334(final SubLObject var30, final SubLObject var17, final SubLObject var18) {
        PrintLow.format(var17, (SubLObject)$ic208$, f45373(var30, (SubLObject)UNPROVIDED));
        PrintLow.format(var17, (SubLObject)$ic209$, f45361(var30));
        PrintLow.format(var17, (SubLObject)$ic210$, f45390(var30));
        PrintLow.format(var17, (SubLObject)$ic211$, f45341(var30));
        return var30;
    }
    
    public static SubLObject f45320(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0167.f10813(var8) || (NIL != assertion_handles_oc.f11035(var8) && NIL == f45322(var8, (SubLObject)NIL) && (NIL != module0585.f35830() || NIL == var9 || (NIL != module0178.f11284(var8) && NIL != f45519(module0178.f11333(var8))))));
    }
    
    public static SubLObject f45326(final SubLObject var30) {
        final SubLObject var31 = (SubLObject)makeBoolean(NIL != module0585.f35830() || NIL != module0167.f10824(var30, (SubLObject)UNPROVIDED) || NIL != f45413(var30));
        if (NIL == var31) {
            f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic212$, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)((NIL != var31) ? var30 : NIL);
    }
    
    public static SubLObject f45327(final SubLObject var278) {
        final SubLObject var279 = (SubLObject)makeBoolean(NIL != module0585.f35830() || NIL != f45413(var278));
        if (NIL == var279) {
            f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic213$, var278, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)((NIL != var279) ? var278 : NIL);
    }
    
    public static SubLObject f45346(final SubLObject var30) {
        if (NIL != assertion_handles_oc.f11035(var30)) {
            return module0178.f11333(var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45348(final SubLObject var30) {
        if (NIL != module0167.f10813(var30)) {
            return var30;
        }
        if (NIL != assertion_handles_oc.f11035(var30)) {
            return module0178.f11334(var30);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45364(final SubLObject var30) {
        if (NIL != assertion_handles_oc.f11035(var30) && NIL != f45500(var30)) {
            return (SubLObject)ConsesLow.list(f45348(var30));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45337(final SubLObject var30) {
        if (NIL != assertion_handles_oc.f11035(var30)) {
            return module0209.f13552(module0178.f11335(var30));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45520(final SubLObject var8) {
        return (SubLObject)makeBoolean(var8.isCons() && NIL != f45521(var8.first()) && NIL != f45522(var8.rest()));
    }
    
    public static SubLObject f45523(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0034.$g879$.getDynamicValue(var9);
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == var10) {
            return f45520(var8);
        }
        var11 = module0034.f1857(var10, (SubLObject)$ic214$, (SubLObject)UNPROVIDED);
        if (NIL == var11) {
            var11 = module0034.f1807(module0034.f1842(var10), (SubLObject)$ic214$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUALP, (SubLObject)UNPROVIDED);
            module0034.f1860(var10, (SubLObject)$ic214$, var11);
        }
        SubLObject var12 = module0034.f1814(var11, var8, (SubLObject)$ic11$);
        if (var12 == $ic11$) {
            var12 = Values.arg2(var9.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45520(var8)));
            module0034.f1816(var11, var8, var12, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var12);
    }
    
    public static SubLObject f45524(final SubLObject var32, final SubLObject var33) {
        assert NIL != f45521(var32) : var32;
        assert NIL != f45522(var33) : var33;
        return (SubLObject)ConsesLow.cons(module0208.f13535(var32), var33);
    }
    
    public static SubLObject f45525(final SubLObject var279) {
        assert NIL != f45523(var279) : var279;
        return var279.first();
    }
    
    public static SubLObject f45526(final SubLObject var279) {
        assert NIL != f45523(var279) : var279;
        return var279.rest();
    }
    
    public static SubLObject f45521(final SubLObject var8) {
        return (SubLObject)makeBoolean(var8.isList() && NIL == module0035.find_if_not((SubLObject)$ic217$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45522(final SubLObject var8) {
        return (SubLObject)makeBoolean(var8.isList() && NIL == module0035.find_if_not((SubLObject)$ic75$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45527() {
        if (!$g5840$.getGlobalValue().isList()) {
            f45528();
        }
        return $g5840$.getGlobalValue();
    }
    
    public static SubLObject f45529() {
        if (!$g5841$.getGlobalValue().isList()) {
            f45530();
        }
        return $g5841$.getGlobalValue();
    }
    
    public static SubLObject f45531() {
        if (!$g5842$.getGlobalValue().isList()) {
            f45532();
        }
        return $g5842$.getGlobalValue();
    }
    
    public static SubLObject f45533() {
        if (!$g5843$.getGlobalValue().isList()) {
            f45532();
        }
        return $g5843$.getGlobalValue();
    }
    
    public static SubLObject f45534() {
        if (!$g5844$.getGlobalValue().isList()) {
            f45532();
        }
        return $g5844$.getGlobalValue();
    }
    
    public static SubLObject f45535() {
        if (!$g5845$.getGlobalValue().isList()) {
            f45536();
        }
        return $g5845$.getGlobalValue();
    }
    
    public static SubLObject f45537(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic228$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic228$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic229$, (SubLObject)ConsesLow.listS((SubLObject)$ic230$, var6, (SubLObject)$ic231$))), (SubLObject)ConsesLow.listS((SubLObject)$ic24$, (SubLObject)$ic232$, ConsesLow.append(var7, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic228$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45351(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = f45538();
        }
        final SubLThread var89 = SubLProcess.currentSubLThread();
        return module0004.f104(var88, $g5847$.getDynamicValue(var89), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45539(SubLObject var130) {
        if (var130 == UNPROVIDED) {
            var130 = $g5825$.getGlobalValue();
        }
        return module0087.f5954(var130);
    }
    
    public static SubLObject f45540(final SubLObject var104, SubLObject var283) {
        if (var283 == UNPROVIDED) {
            var283 = (SubLObject)T;
        }
        return module0087.f5956(var104, var283);
    }
    
    public static SubLObject f45541(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        return f45540(var88, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45538() {
        if (NIL != f45541((SubLObject)UNPROVIDED)) {
            return $g5848$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45542(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (NIL == f45541(var88)) {
            f45543(var88);
            return (SubLObject)$ic234$;
        }
        return module0087.f5966(var88);
    }
    
    public static SubLObject f45544(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (NIL == f45541(var88)) {
            f45543(var88);
            return (SubLObject)$ic234$;
        }
        return module0087.f5980(var88);
    }
    
    public static SubLObject f45545(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (NIL == f45541(var88)) {
            f45543(var88);
            return (SubLObject)$ic234$;
        }
        return module0087.f5967(var88);
    }
    
    public static SubLObject f45546(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic235$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var290_291 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic235$);
            var290_291 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic235$);
            if (NIL == conses_high.member(var290_291, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var290_291 == $ic68$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic235$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)$ic236$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.listS((SubLObject)$ic237$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic238$, (SubLObject)$ic69$, var12), ConsesLow.append(var13, (SubLObject)NIL))));
    }
    
    public static SubLObject f45547(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic239$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic239$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic239$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var299_300 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic239$);
            var299_300 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic239$);
            if (NIL == conses_high.member(var299_300, (SubLObject)$ic240$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var299_300 == $ic68$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic239$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic241$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic242$);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)$ic243$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic238$, (SubLObject)$ic69$, var12, (SubLObject)$ic241$, var14), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f45548(SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (NIL != var35) {
            final SubLObject var37 = f45432(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)(var37.isList() ? Sequences.length(var37) : ZERO_INTEGER);
        }
        SubLObject var38 = (SubLObject)ZERO_INTEGER;
        final SubLObject var39 = $g5846$.getGlobalValue();
        SubLObject var40 = (SubLObject)NIL;
        try {
            var40 = Locks.seize_lock(var39);
            final SubLObject var41 = module0096.$g1265$.currentBinding(var36);
            try {
                module0096.$g1265$.bind($g5827$.getGlobalValue(), var36);
                final SubLObject var42 = module0054.f3968();
                final SubLObject var43 = module0079.f5424(f45538());
                SubLObject var46;
                for (SubLObject var44 = (SubLObject)NIL; NIL == var44; var44 = (SubLObject)makeBoolean(NIL == var46)) {
                    var36.resetMultipleValues();
                    final SubLObject var45 = module0052.f3693(var43);
                    var46 = var36.secondMultipleValue();
                    var36.resetMultipleValues();
                    if (NIL != var46) {
                        SubLObject var48;
                        final SubLObject var47 = var48 = var45;
                        SubLObject var49 = (SubLObject)NIL;
                        SubLObject var50 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic244$);
                        var49 = var48.first();
                        var48 = var48.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic244$);
                        var50 = var48.first();
                        var48 = var48.rest();
                        if (NIL == var48) {
                            if (NIL != module0079.f5404(var50)) {
                                module0054.f3973(var50, var42);
                            }
                            else if (var50.isCons()) {
                                final SubLObject var51 = var50.first();
                                final SubLObject var52 = var50.rest();
                                var38 = Numbers.add(var38, Sequences.length(var52));
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var47, (SubLObject)$ic244$);
                        }
                    }
                }
                while (NIL == module0054.f3970(var42)) {
                    final SubLObject var53 = module0054.f3974(var42);
                    final SubLObject var54 = module0079.f5424(var53);
                    SubLObject var57;
                    for (SubLObject var55 = (SubLObject)NIL; NIL == var55; var55 = (SubLObject)makeBoolean(NIL == var57)) {
                        var36.resetMultipleValues();
                        final SubLObject var56 = module0052.f3693(var54);
                        var57 = var36.secondMultipleValue();
                        var36.resetMultipleValues();
                        if (NIL != var57) {
                            SubLObject var59;
                            final SubLObject var58 = var59 = var56;
                            SubLObject var60 = (SubLObject)NIL;
                            SubLObject var61 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic244$);
                            var60 = var59.first();
                            var59 = var59.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic244$);
                            var61 = var59.first();
                            var59 = var59.rest();
                            if (NIL == var59) {
                                if (NIL != module0079.f5404(var61)) {
                                    module0054.f3973(var61, var42);
                                }
                                else if (var61.isCons()) {
                                    final SubLObject var62 = var61.first();
                                    final SubLObject var63 = var61.rest();
                                    var38 = Numbers.add(var38, Sequences.length(var63));
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)$ic244$);
                            }
                        }
                    }
                }
            }
            finally {
                module0096.$g1265$.rebind(var41, var36);
            }
        }
        finally {
            if (NIL != var40) {
                Locks.release_lock(var39);
            }
        }
        return var38;
    }
    
    public static SubLObject f45549(final SubLObject var319, final SubLObject var320) {
        final SubLThread var321 = SubLProcess.currentSubLThread();
        if (NIL == f45541(var319)) {
            f45543(var319);
            return (SubLObject)$ic234$;
        }
        if (NIL == f45541(var320)) {
            f45543(var320);
            return (SubLObject)$ic234$;
        }
        f45550(var320);
        if (var319.eql($g5848$.getGlobalValue())) {
            final SubLObject var322 = $g5846$.getGlobalValue();
            SubLObject var323 = (SubLObject)NIL;
            try {
                var323 = Locks.seize_lock(var322);
                final SubLObject var324 = module0096.$g1265$.currentBinding(var321);
                try {
                    module0096.$g1265$.bind($g5827$.getGlobalValue(), var321);
                    final SubLObject var325 = module0054.f3968();
                    final SubLObject var326 = module0079.f5424(var319);
                    SubLObject var329;
                    for (SubLObject var327 = (SubLObject)NIL; NIL == var327; var327 = (SubLObject)makeBoolean(NIL == var329)) {
                        var321.resetMultipleValues();
                        final SubLObject var328 = module0052.f3693(var326);
                        var329 = var321.secondMultipleValue();
                        var321.resetMultipleValues();
                        if (NIL != var329) {
                            SubLObject var331;
                            final SubLObject var330 = var331 = var328;
                            SubLObject var332 = (SubLObject)NIL;
                            SubLObject var333 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var331, var330, (SubLObject)$ic244$);
                            var332 = var331.first();
                            var331 = var331.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var331, var330, (SubLObject)$ic244$);
                            var333 = var331.first();
                            var331 = var331.rest();
                            if (NIL == var331) {
                                if (NIL != module0079.f5404(var333)) {
                                    module0054.f3973(var333, var325);
                                }
                                else if (var333.isCons()) {
                                    final SubLObject var334 = var333.first();
                                    SubLObject var336;
                                    final SubLObject var335 = var336 = var333.rest();
                                    SubLObject var337 = (SubLObject)NIL;
                                    var337 = var336.first();
                                    while (NIL != var336) {
                                        f45385(var320, var334, var337);
                                        var336 = var336.rest();
                                        var337 = var336.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var330, (SubLObject)$ic244$);
                            }
                        }
                    }
                    while (NIL == module0054.f3970(var325)) {
                        final SubLObject var338 = module0054.f3974(var325);
                        final SubLObject var339 = module0079.f5424(var338);
                        SubLObject var342;
                        for (SubLObject var340 = (SubLObject)NIL; NIL == var340; var340 = (SubLObject)makeBoolean(NIL == var342)) {
                            var321.resetMultipleValues();
                            final SubLObject var341 = module0052.f3693(var339);
                            var342 = var321.secondMultipleValue();
                            var321.resetMultipleValues();
                            if (NIL != var342) {
                                SubLObject var344;
                                final SubLObject var343 = var344 = var341;
                                SubLObject var345 = (SubLObject)NIL;
                                SubLObject var346 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var344, var343, (SubLObject)$ic244$);
                                var345 = var344.first();
                                var344 = var344.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var344, var343, (SubLObject)$ic244$);
                                var346 = var344.first();
                                var344 = var344.rest();
                                if (NIL == var344) {
                                    if (NIL != module0079.f5404(var346)) {
                                        module0054.f3973(var346, var325);
                                    }
                                    else if (var346.isCons()) {
                                        final SubLObject var347 = var346.first();
                                        SubLObject var349;
                                        final SubLObject var348 = var349 = var346.rest();
                                        SubLObject var350 = (SubLObject)NIL;
                                        var350 = var349.first();
                                        while (NIL != var349) {
                                            f45385(var320, var347, var350);
                                            var349 = var349.rest();
                                            var350 = var349.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var343, (SubLObject)$ic244$);
                                }
                            }
                        }
                    }
                }
                finally {
                    module0096.$g1265$.rebind(var324, var321);
                }
            }
            finally {
                if (NIL != var323) {
                    Locks.release_lock(var322);
                }
            }
        }
        else {
            final SubLObject var351 = module0054.f3968();
            final SubLObject var352 = module0079.f5424(var319);
            SubLObject var355;
            for (SubLObject var353 = (SubLObject)NIL; NIL == var353; var353 = (SubLObject)makeBoolean(NIL == var355)) {
                var321.resetMultipleValues();
                final SubLObject var354 = module0052.f3693(var352);
                var355 = var321.secondMultipleValue();
                var321.resetMultipleValues();
                if (NIL != var355) {
                    SubLObject var357;
                    final SubLObject var356 = var357 = var354;
                    SubLObject var358 = (SubLObject)NIL;
                    SubLObject var359 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var357, var356, (SubLObject)$ic244$);
                    var358 = var357.first();
                    var357 = var357.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var357, var356, (SubLObject)$ic244$);
                    var359 = var357.first();
                    var357 = var357.rest();
                    if (NIL == var357) {
                        if (NIL != module0079.f5404(var359)) {
                            module0054.f3973(var359, var351);
                        }
                        else if (var359.isCons()) {
                            final SubLObject var360 = var359.first();
                            SubLObject var362;
                            final SubLObject var361 = var362 = var359.rest();
                            SubLObject var363 = (SubLObject)NIL;
                            var363 = var362.first();
                            while (NIL != var362) {
                                f45385(var320, var360, var363);
                                var362 = var362.rest();
                                var363 = var362.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var356, (SubLObject)$ic244$);
                    }
                }
            }
            while (NIL == module0054.f3970(var351)) {
                final SubLObject var364 = module0054.f3974(var351);
                final SubLObject var365 = module0079.f5424(var364);
                SubLObject var368;
                for (SubLObject var366 = (SubLObject)NIL; NIL == var366; var366 = (SubLObject)makeBoolean(NIL == var368)) {
                    var321.resetMultipleValues();
                    final SubLObject var367 = module0052.f3693(var365);
                    var368 = var321.secondMultipleValue();
                    var321.resetMultipleValues();
                    if (NIL != var368) {
                        SubLObject var370;
                        final SubLObject var369 = var370 = var367;
                        SubLObject var371 = (SubLObject)NIL;
                        SubLObject var372 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var370, var369, (SubLObject)$ic244$);
                        var371 = var370.first();
                        var370 = var370.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var370, var369, (SubLObject)$ic244$);
                        var372 = var370.first();
                        var370 = var370.rest();
                        if (NIL == var370) {
                            if (NIL != module0079.f5404(var372)) {
                                module0054.f3973(var372, var351);
                            }
                            else if (var372.isCons()) {
                                final SubLObject var373 = var372.first();
                                SubLObject var375;
                                final SubLObject var374 = var375 = var372.rest();
                                SubLObject var376 = (SubLObject)NIL;
                                var376 = var375.first();
                                while (NIL != var375) {
                                    f45385(var320, var373, var376);
                                    var375 = var375.rest();
                                    var376 = var375.first();
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var369, (SubLObject)$ic244$);
                        }
                    }
                }
            }
        }
        return (SubLObject)$ic245$;
    }
    
    public static SubLObject f45550(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (NIL == f45541(var88)) {
            f45543(var88);
            return (SubLObject)$ic234$;
        }
        if ($g5848$.getGlobalValue().eql(var88)) {
            final SubLObject var89 = $g5846$.getGlobalValue();
            SubLObject var90 = (SubLObject)NIL;
            try {
                var90 = Locks.seize_lock(var89);
                PrintLow.format((SubLObject)T, (SubLObject)$ic246$, var88);
                module0740.f45879();
                module0090.f6130($g5827$.getGlobalValue());
                module0087.f5955(var88);
            }
            finally {
                if (NIL != var90) {
                    Locks.release_lock(var89);
                }
            }
        }
        else {
            module0087.f5955(var88);
        }
        return (SubLObject)$ic247$;
    }
    
    public static SubLObject f45551(SubLObject var88, SubLObject var335) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var335 == UNPROVIDED) {
            var335 = $g5827$.getGlobalValue();
        }
        final SubLThread var336 = SubLProcess.currentSubLThread();
        SubLObject var337 = (SubLObject)NIL;
        final SubLObject var338 = $g5846$.getGlobalValue();
        SubLObject var339 = (SubLObject)NIL;
        try {
            var339 = Locks.seize_lock(var338);
            var336.resetMultipleValues();
            final SubLObject var340 = module0096.f6998(var88);
            final SubLObject var341 = var336.secondMultipleValue();
            var336.resetMultipleValues();
            var337 = var341;
            module0090.f6130(var335);
        }
        finally {
            if (NIL != var339) {
                Locks.release_lock(var338);
            }
        }
        return var337;
    }
    
    public static SubLObject f45552(SubLObject var88, SubLObject var341, SubLObject var342, SubLObject var343, SubLObject var344) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var341 == UNPROVIDED) {
            var341 = (SubLObject)T;
        }
        if (var342 == UNPROVIDED) {
            var342 = (SubLObject)T;
        }
        if (var343 == UNPROVIDED) {
            var343 = (SubLObject)T;
        }
        if (var344 == UNPROVIDED) {
            var344 = (SubLObject)T;
        }
        final SubLThread var345 = SubLProcess.currentSubLThread();
        if (NIL != f45541(var88)) {
            f45550(var88);
            final SubLObject var346 = module0584.$g4390$.currentBinding(var345);
            final SubLObject var347 = $g5847$.currentBinding(var345);
            try {
                module0584.$g4390$.bind((SubLObject)$ic248$, var345);
                $g5847$.bind((SubLObject)ConsesLow.cons(var88, $g5847$.getDynamicValue(var345)), var345);
                final SubLObject var348 = $g5846$.getGlobalValue();
                SubLObject var349 = (SubLObject)NIL;
                try {
                    var349 = Locks.seize_lock(var348);
                    if (var88.eql(f45538())) {
                        nl_trie_completion_oc.f45854();
                    }
                    f45553();
                    if (NIL != var341) {
                        f45528();
                    }
                    if (NIL != var342) {
                        f45530();
                    }
                    if (NIL != var343) {
                        f45532();
                    }
                    if (NIL != var344) {
                        f45536();
                    }
                    final SubLObject var351;
                    final SubLObject var350 = var351 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var25_349 = module0034.$g879$.currentBinding(var345);
                    try {
                        module0034.$g879$.bind(var351, var345);
                        SubLObject var352 = (SubLObject)NIL;
                        if (NIL != var351 && NIL == module0034.f1842(var351)) {
                            var352 = module0034.f1869(var351);
                            final SubLObject var353 = Threads.current_process();
                            if (NIL == var352) {
                                module0034.f1873(var351, var353);
                            }
                            else if (!var352.eql(var353)) {
                                Errors.error((SubLObject)$ic249$);
                            }
                        }
                        try {
                            final SubLObject var354 = module0139.$g1630$.getDynamicValue(var345);
                            final SubLObject var25_350 = module0139.$g1631$.currentBinding(var345);
                            final SubLObject var39_354 = module0139.$g1632$.currentBinding(var345);
                            final SubLObject var355 = module0139.$g1630$.currentBinding(var345);
                            try {
                                module0139.$g1631$.bind(module0139.f9015(var354, (SubLObject)SIX_INTEGER), var345);
                                module0139.$g1632$.bind(module0139.f9016(var354), var345);
                                module0139.$g1630$.bind((SubLObject)T, var345);
                                f45554(var88);
                            }
                            finally {
                                module0139.$g1630$.rebind(var355, var345);
                                module0139.$g1632$.rebind(var39_354, var345);
                                module0139.$g1631$.rebind(var25_350, var345);
                            }
                        }
                        finally {
                            final SubLObject var25_351 = Threads.$is_thread_performing_cleanupP$.currentBinding(var345);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var345);
                                if (NIL != var351 && NIL == var352) {
                                    module0034.f1873(var351, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_351, var345);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var25_349, var345);
                    }
                    f45553();
                    module0740.f45878();
                    module0740.f45865();
                }
                finally {
                    if (NIL != var349) {
                        Locks.release_lock(var348);
                    }
                }
            }
            finally {
                $g5847$.rebind(var347, var345);
                module0584.$g4390$.rebind(var346, var345);
            }
            return (SubLObject)$ic250$;
        }
        f45543(var88);
        return (SubLObject)$ic234$;
    }
    
    public static SubLObject f45555(final SubLObject var263, SubLObject var356) {
        if (var356 == UNPROVIDED) {
            var356 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var357 = SubLProcess.currentSubLThread();
        final SubLObject var358 = module0209.f13552(var263);
        SubLObject var359 = (SubLObject)NIL;
        final SubLObject var360 = module0585.$g4447$.currentBinding(var357);
        try {
            module0585.$g4447$.bind(var356, var357);
            final SubLObject var361 = var359 = f45432(var358, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var359.isList()) {
                var359 = ConsesLow.append(var359, module0788.f50490(var358));
            }
        }
        finally {
            module0585.$g4447$.rebind(var360, var357);
        }
        return var359;
    }
    
    public static SubLObject f45432(final SubLObject var263, SubLObject var88, SubLObject var356) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var356 == UNPROVIDED) {
            var356 = module0585.$g4447$.getDynamicValue();
        }
        final SubLObject var357 = module0209.f13552(var263);
        if (var356.eql((SubLObject)$ic16$)) {
            return f45556(var357, var88);
        }
        if (var356.eql((SubLObject)$ic251$)) {
            return f45557(var357, var88);
        }
        if (var356.eql((SubLObject)$ic252$)) {
            return f45558(var357, var88);
        }
        f45466((SubLObject)$ic253$, var356, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45559(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = f45538();
        }
        return Equality.eql(Symbols.symbol_function((SubLObject)EQUAL), module0087.f5958(var88));
    }
    
    public static SubLObject f45560(final SubLObject var35, final SubLObject var88) {
        return f45561(var35, var88, (SubLObject)$ic251$);
    }
    
    public static SubLObject f45557(final SubLObject var35, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = module0034.$g879$.getDynamicValue(var89);
        SubLObject var91 = (SubLObject)NIL;
        if (NIL == var90) {
            return f45560(var35, var88);
        }
        var91 = module0034.f1857(var90, (SubLObject)$ic254$, (SubLObject)UNPROVIDED);
        if (NIL == var91) {
            var91 = module0034.f1807(module0034.f1842(var90), (SubLObject)$ic254$, (SubLObject)TWO_INTEGER, (SubLObject)$ic255$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var90, (SubLObject)$ic254$, var91);
        }
        final SubLObject var92 = module0034.f1782(var35, var88);
        final SubLObject var93 = module0034.f1814(var91, var92, (SubLObject)UNPROVIDED);
        if (var93 != $ic11$) {
            SubLObject var94 = var93;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                SubLObject var96 = var95.first();
                final SubLObject var97 = conses_high.second(var95);
                if (var35.equal(var96.first())) {
                    var96 = var96.rest();
                    if (NIL != var96 && NIL == var96.rest() && var88.equal(var96.first())) {
                        return module0034.f1959(var97);
                    }
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
        }
        final SubLObject var98 = Values.arg2(var89.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45560(var35, var88)));
        module0034.f1836(var91, var92, var93, var98, (SubLObject)ConsesLow.list(var35, var88));
        return module0034.f1959(var98);
    }
    
    public static SubLObject f45562(final SubLObject var35, final SubLObject var88) {
        return f45561(var35, var88, (SubLObject)$ic16$);
    }
    
    public static SubLObject f45556(final SubLObject var35, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = module0034.$g879$.getDynamicValue(var89);
        SubLObject var91 = (SubLObject)NIL;
        if (NIL == var90) {
            return f45562(var35, var88);
        }
        var91 = module0034.f1857(var90, (SubLObject)$ic256$, (SubLObject)UNPROVIDED);
        if (NIL == var91) {
            var91 = module0034.f1807(module0034.f1842(var90), (SubLObject)$ic256$, (SubLObject)TWO_INTEGER, (SubLObject)$ic255$, (SubLObject)EQUALP, (SubLObject)UNPROVIDED);
            module0034.f1860(var90, (SubLObject)$ic256$, var91);
        }
        final SubLObject var92 = module0034.f1782(var35, var88);
        final SubLObject var93 = module0034.f1814(var91, var92, (SubLObject)UNPROVIDED);
        if (var93 != $ic11$) {
            SubLObject var94 = var93;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                SubLObject var96 = var95.first();
                final SubLObject var97 = conses_high.second(var95);
                if (var35.equalp(var96.first())) {
                    var96 = var96.rest();
                    if (NIL != var96 && NIL == var96.rest() && var88.equalp(var96.first())) {
                        return module0034.f1959(var97);
                    }
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
        }
        final SubLObject var98 = Values.arg2(var89.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45562(var35, var88)));
        module0034.f1836(var91, var92, var93, var98, (SubLObject)ConsesLow.list(var35, var88));
        return module0034.f1959(var98);
    }
    
    public static SubLObject f45563(final SubLObject var35, final SubLObject var88) {
        return f45561(var35, var88, (SubLObject)$ic252$);
    }
    
    public static SubLObject f45558(final SubLObject var35, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = module0034.$g879$.getDynamicValue(var89);
        SubLObject var91 = (SubLObject)NIL;
        if (NIL == var90) {
            return f45563(var35, var88);
        }
        var91 = module0034.f1857(var90, (SubLObject)$ic257$, (SubLObject)UNPROVIDED);
        if (NIL == var91) {
            var91 = module0034.f1807(module0034.f1842(var90), (SubLObject)$ic257$, (SubLObject)TWO_INTEGER, (SubLObject)$ic255$, (SubLObject)EQUALP, (SubLObject)UNPROVIDED);
            module0034.f1860(var90, (SubLObject)$ic257$, var91);
        }
        final SubLObject var92 = module0034.f1782(var35, var88);
        final SubLObject var93 = module0034.f1814(var91, var92, (SubLObject)UNPROVIDED);
        if (var93 != $ic11$) {
            SubLObject var94 = var93;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                SubLObject var96 = var95.first();
                final SubLObject var97 = conses_high.second(var95);
                if (var35.equalp(var96.first())) {
                    var96 = var96.rest();
                    if (NIL != var96 && NIL == var96.rest() && var88.equalp(var96.first())) {
                        return module0034.f1959(var97);
                    }
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
        }
        final SubLObject var98 = Values.arg2(var89.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45563(var35, var88)));
        module0034.f1836(var91, var92, var93, var98, (SubLObject)ConsesLow.list(var35, var88));
        return module0034.f1959(var98);
    }
    
    public static SubLObject f45561(final SubLObject var35, SubLObject var88, SubLObject var356) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var356 == UNPROVIDED) {
            var356 = module0585.$g4447$.getDynamicValue();
        }
        SubLObject var357 = (SubLObject)NIL;
        final SubLObject var358 = $g5846$.getGlobalValue();
        SubLObject var359 = (SubLObject)NIL;
        try {
            var359 = Locks.seize_lock(var358);
            if (NIL == f45541(var88)) {
                f45543(var88);
                var357 = (SubLObject)$ic234$;
            }
            else if (NIL != f45545(var88)) {
                f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic258$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var357 = (SubLObject)NIL;
            }
            else if (var88.eql($g5848$.getGlobalValue()) && NIL != module0740.f45876() && NIL == f45351($g5848$.getGlobalValue())) {
                f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic259$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f45550((SubLObject)UNPROVIDED);
                var357 = (SubLObject)$ic234$;
            }
            else if (var88.eql($g5848$.getGlobalValue()) && NIL == module0740.f45868() && NIL != module0740.f45872()) {
                f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic260$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f45550(var88);
                var357 = (SubLObject)$ic234$;
            }
            else {
                SubLObject var360 = f45340(var35);
                SubLObject var361 = (SubLObject)NIL;
                var361 = var360.first();
                while (NIL != var360) {
                    var357 = conses_high.union(var357, (SubLObject)((NIL != var361) ? f45564(f45565(var88, var361, var356), var88, var361) : NIL), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
                    var360 = var360.rest();
                    var361 = var360.first();
                }
            }
        }
        finally {
            if (NIL != var359) {
                Locks.release_lock(var358);
            }
        }
        return var357;
    }
    
    public static SubLObject f45566(final SubLObject var110, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (NIL == f45541(var88)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0584.$g4403$.getDynamicValue(var111)) {
            f45567();
        }
        if (NIL != f45568(var110)) {
            return f45569(var110, var88, (SubLObject)NIL);
        }
        f45570(var110);
        return (SubLObject)$ic261$;
    }
    
    public static SubLObject f45571(final SubLObject var110, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (NIL == f45541(var88)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0584.$g4403$.getDynamicValue(var111)) {
            f45567();
        }
        if (NIL != f45568(var110)) {
            return f45569(var110, var88, (SubLObject)T);
        }
        f45572(var110);
        return (SubLObject)$ic262$;
    }
    
    public static SubLObject f45573(final SubLObject var110, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (NIL == f45541(var88)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0584.$g4403$.getDynamicValue(var111)) {
            f45567();
        }
        if (NIL != f45574(var110)) {
            return f45575(var110, var88, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        f45570(var110);
        return Values.values((SubLObject)$ic261$, (SubLObject)NIL);
    }
    
    public static SubLObject f45576(final SubLObject var110, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (NIL == f45541(var88)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0584.$g4403$.getDynamicValue(var111)) {
            f45567();
        }
        if (NIL != f45574(var110)) {
            return f45575(var110, var88, (SubLObject)T, (SubLObject)UNPROVIDED);
        }
        f45572(var110);
        return Values.values((SubLObject)$ic262$, (SubLObject)NIL);
    }
    
    public static SubLObject f45577(final SubLObject var110, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (NIL != f45574(var110)) {
            f45576(var110, var88);
            f45573(var110, var88);
            return (SubLObject)$ic263$;
        }
        return (SubLObject)$ic264$;
    }
    
    public static SubLObject f45578(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic265$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic265$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic265$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8 = (SubLObject)$ic266$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.listS((SubLObject)$ic267$, var5, (SubLObject)$ic268$))), (SubLObject)ConsesLow.list((SubLObject)$ic187$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic32$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var8, (SubLObject)$ic269$)), (SubLObject)ConsesLow.list(var7, var8)), (SubLObject)ConsesLow.list((SubLObject)$ic270$, var6, var8), (SubLObject)ConsesLow.list((SubLObject)$ic271$, (SubLObject)$ic272$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic273$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic273$, var7))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic265$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45579(final SubLObject var17) {
        final SubLObject var18 = module0021.f1060(var17, (SubLObject)NIL, (SubLObject)$ic274$);
        if (var18 != $ic274$ && NIL != module0079.f5404(var18)) {
            $g5848$.setGlobalValue(var18);
        }
        else {
            Errors.warn((SubLObject)$ic272$, var18, (SubLObject)$ic233$, (SubLObject)$ic275$);
        }
        return var17;
    }
    
    public static SubLObject f45580(final SubLObject var17) {
        module0021.f1038($g5848$.getGlobalValue(), var17);
        return var17;
    }
    
    public static SubLObject f45581(final SubLObject var17) {
        final SubLObject var18 = module0021.f1060(var17, (SubLObject)NIL, (SubLObject)$ic274$);
        if (var18 != $ic274$ && NIL != module0079.f5404(var18)) {
            nl_trie_completion_oc.$g5755$.setGlobalValue(var18);
        }
        else {
            Errors.warn((SubLObject)$ic272$, var18, (SubLObject)$ic276$, (SubLObject)$ic275$);
        }
        return var17;
    }
    
    public static SubLObject f45582(final SubLObject var17) {
        module0021.f1038(nl_trie_completion_oc.$g5755$.getGlobalValue(), var17);
        return var17;
    }
    
    public static SubLObject f45583(final SubLObject var366, final SubLObject var367) {
        final SubLObject var368 = module0730.f44634(var366);
        final SubLObject var369 = module0730.f44635(var366);
        return f45584(var368, var369, var367);
    }
    
    public static SubLObject f45584(final SubLObject var368, final SubLObject var369, SubLObject var367) {
        if (var367 == UNPROVIDED) {
            var367 = module0021.f1153();
        }
        final SubLObject var370 = (SubLObject)makeBoolean(NIL != module0075.f5218(var368) && NIL != module0075.f5218(var369));
        if (NIL != module0096.f6951($g5848$.getGlobalValue())) {
            if (NIL == var370) {
                Errors.error((SubLObject)$ic277$, var368, var369);
            }
            final SubLObject var371 = module0095.f6845(var368, var369, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0096.f6965($g5848$.getGlobalValue(), var371, var367);
            return module0096.f6951($g5848$.getGlobalValue());
        }
        if (NIL != var370) {
            $g5848$.setGlobalValue(module0096.f6962($g5848$.getGlobalValue(), var368, var369, var367));
            return module0096.f6951($g5848$.getGlobalValue());
        }
        Errors.warn((SubLObject)$ic278$, var368, var369);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45585(final SubLObject var372, final SubLObject var371) {
        final SubLThread var373 = SubLProcess.currentSubLThread();
        final SubLObject var374 = f45586(var371);
        final SubLObject var375 = f45587(var374);
        SubLObject var376 = (SubLObject)NIL;
        final SubLObject var377 = $g5846$.getGlobalValue();
        SubLObject var378 = (SubLObject)NIL;
        try {
            var378 = Locks.seize_lock(var377);
            final SubLObject var379 = module0096.$g1265$.currentBinding(var373);
            try {
                module0096.$g1265$.bind($g5827$.getGlobalValue(), var373);
                module0087.f5986($g5848$.getGlobalValue(), var375);
            }
            finally {
                module0096.$g1265$.rebind(var379, var373);
            }
        }
        finally {
            if (NIL != var378) {
                Locks.release_lock(var377);
            }
        }
        var376 = f45588(var374);
        module0021.f1038(var376, var372);
        return var372;
    }
    
    public static SubLObject f45587(final SubLObject var373) {
        return module0086.f5924((SubLObject)$ic279$, (SubLObject)$ic280$, (SubLObject)$ic281$, (SubLObject)$ic282$, (SubLObject)$ic283$, var373);
    }
    
    public static SubLObject f45589(final SubLObject var374) {
        final SubLThread var375 = SubLProcess.currentSubLThread();
        final SubLObject var376 = module0086.f5932(var374);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var375) && NIL == f45590(var376)) {
            Errors.error((SubLObject)$ic284$, var376);
        }
        return var374;
    }
    
    public static SubLObject f45591(final SubLObject var374) {
        final SubLThread var375 = SubLProcess.currentSubLThread();
        final SubLObject var376 = module0086.f5932(var374);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var375) && NIL == f45592(var376)) {
            Errors.error((SubLObject)$ic285$, var376);
        }
        return var374;
    }
    
    public static SubLObject f45593(final SubLObject var374, final SubLObject var378) {
        final SubLObject var379 = module0086.f5932(var374);
        f45594(var379, var378);
        return var374;
    }
    
    public static SubLObject f45595(final SubLObject var374, final SubLObject var378) {
        final SubLObject var379 = module0086.f5932(var374);
        SubLObject var380 = f45596(var379, var378);
        final SubLObject var381 = f45597(var379);
        final SubLObject var382 = module0096.f6945(var380, var381, (SubLObject)$ic286$);
        if (NIL == var378) {
            f45598(var379, var382);
        }
        else {
            final SubLObject var383 = var378.first();
            final SubLObject var384 = module0096.f6964(var382);
            var380 = f45599(var379);
            module0079.f5412(var380, var383, var384);
        }
        return var374;
    }
    
    public static SubLObject f45600(final SubLObject var374, final SubLObject var383) {
        final SubLObject var384 = module0086.f5932(var374);
        final SubLObject var385 = f45599(var384);
        SubLObject var386 = (SubLObject)NIL;
        SubLObject var387 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var383, var383, (SubLObject)$ic287$);
        var386 = var383.first();
        final SubLObject var388 = var387 = var383.rest();
        module0079.f5412(var385, var386, var387);
        return var374;
    }
    
    public static SubLObject f45586(final SubLObject var371) {
        return module0035.f2333((SubLObject)ConsesLow.list((SubLObject)$ic288$, (SubLObject)$ic289$), (SubLObject)ConsesLow.list(var371, module0054.f3968()));
    }
    
    public static SubLObject f45590(final SubLObject var373) {
        return (SubLObject)makeBoolean(NIL != module0035.f2327(var373) && NIL != module0095.f6844(conses_high.getf(var373, (SubLObject)$ic288$, (SubLObject)UNPROVIDED)) && NIL != module0054.f3970(conses_high.getf(var373, (SubLObject)$ic289$, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f45592(final SubLObject var373) {
        return (SubLObject)makeBoolean(NIL != module0035.f2327(var373) && NIL != module0095.f6844(conses_high.getf(var373, (SubLObject)$ic288$, (SubLObject)UNPROVIDED)) && ONE_INTEGER.numE(module0054.f3967(conses_high.getf(var373, (SubLObject)$ic289$, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f45599(final SubLObject var373) {
        final SubLObject var374 = conses_high.getf(var373, (SubLObject)$ic289$, (SubLObject)UNPROVIDED);
        return module0054.f3975(var374);
    }
    
    public static SubLObject f45597(final SubLObject var373) {
        return conses_high.getf(var373, (SubLObject)$ic288$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45596(final SubLObject var373, final SubLObject var378) {
        final SubLObject var379 = conses_high.getf(var373, (SubLObject)$ic289$, (SubLObject)UNPROVIDED);
        return module0054.f3974(var379);
    }
    
    public static SubLObject f45594(final SubLObject var373, final SubLObject var378) {
        final SubLObject var379 = conses_high.getf(var373, (SubLObject)$ic289$, (SubLObject)UNPROVIDED);
        final SubLObject var380 = module0067.f4880(module0079.f5408(f45538()), (SubLObject)UNPROVIDED);
        module0054.f3973(var380, var379);
        return var380;
    }
    
    public static SubLObject f45588(final SubLObject var373) {
        return f45599(var373);
    }
    
    public static SubLObject f45598(final SubLObject var373, final SubLObject var389) {
        final SubLObject var390 = conses_high.getf(var373, (SubLObject)$ic289$, (SubLObject)UNPROVIDED);
        module0054.f3973(var389, var390);
        return var389;
    }
    
    public static SubLObject f45565(final SubLObject var88, final SubLObject var89, SubLObject var356) {
        if (var356 == UNPROVIDED) {
            var356 = module0585.$g4447$.getDynamicValue();
        }
        final SubLThread var357 = SubLProcess.currentSubLThread();
        final SubLObject var358 = module0208.f13535(var89);
        SubLObject var359 = (SubLObject)NIL;
        final SubLObject var360 = $g5846$.getGlobalValue();
        SubLObject var361 = (SubLObject)NIL;
        try {
            var361 = Locks.seize_lock(var360);
            if (var88.eql(f45538())) {
                final SubLObject var362 = module0096.$g1265$.currentBinding(var357);
                try {
                    module0096.$g1265$.bind($g5827$.getGlobalValue(), var357);
                    var359 = module0087.f5976(var88, var358);
                }
                finally {
                    module0096.$g1265$.rebind(var362, var357);
                }
            }
            else {
                var359 = module0087.f5976(var88, var358);
            }
        }
        finally {
            if (NIL != var361) {
                Locks.release_lock(var360);
            }
        }
        if (NIL != f45559(var88) || var356.eql((SubLObject)$ic16$)) {
            return var359;
        }
        if (var356.eql((SubLObject)$ic251$)) {
            return f45601(var359, var358);
        }
        if (var356 == $ic252$) {
            final SubLObject var363 = f45601(var359, var358);
            return (NIL != var363) ? var363 : var359;
        }
        f45466((SubLObject)$ic290$, var356, var88, module0087.f5958(var88), (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45602() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = (SubLObject)$ic291$;
        final SubLObject var12 = module0012.$g73$.currentBinding(var10);
        final SubLObject var13 = module0012.$g65$.currentBinding(var10);
        final SubLObject var14 = module0012.$g67$.currentBinding(var10);
        final SubLObject var15 = module0012.$g68$.currentBinding(var10);
        final SubLObject var16 = module0012.$g66$.currentBinding(var10);
        final SubLObject var17 = module0012.$g69$.currentBinding(var10);
        final SubLObject var18 = module0012.$g70$.currentBinding(var10);
        final SubLObject var19 = module0012.$silent_progressP$.currentBinding(var10);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var10);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var10), var10);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var10);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var10);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var10);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var10);
            module0012.$g70$.bind((SubLObject)T, var10);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var11) ? module0012.$silent_progressP$.getDynamicValue(var10) : T), var10);
            module0012.f474(var11);
            final SubLObject var20 = $g5846$.getGlobalValue();
            SubLObject var21 = (SubLObject)NIL;
            try {
                var21 = Locks.seize_lock(var20);
                final SubLObject var25_400 = module0096.$g1265$.currentBinding(var10);
                try {
                    module0096.$g1265$.bind($g5827$.getGlobalValue(), var10);
                    final SubLObject var22 = module0054.f3968();
                    final SubLObject var23 = module0079.f5424(f45538());
                    SubLObject var26;
                    for (SubLObject var24 = (SubLObject)NIL; NIL == var24; var24 = (SubLObject)makeBoolean(NIL == var26)) {
                        var10.resetMultipleValues();
                        final SubLObject var25 = module0052.f3693(var23);
                        var26 = var10.secondMultipleValue();
                        var10.resetMultipleValues();
                        if (NIL != var26) {
                            SubLObject var28;
                            final SubLObject var27 = var28 = var25;
                            SubLObject var29 = (SubLObject)NIL;
                            SubLObject var30 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic244$);
                            var29 = var28.first();
                            var28 = var28.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic244$);
                            var30 = var28.first();
                            var28 = var28.rest();
                            if (NIL == var28) {
                                if (NIL != module0079.f5404(var30)) {
                                    module0054.f3973(var30, var22);
                                }
                                else if (var30.isCons()) {
                                    final SubLObject var31 = var30.first();
                                    SubLObject var33;
                                    final SubLObject var32 = var33 = var30.rest();
                                    SubLObject var34 = (SubLObject)NIL;
                                    var34 = var33.first();
                                    while (NIL != var33) {
                                        final SubLObject var35 = f45330(var34);
                                        if (NIL == var35) {
                                            f45386($g5848$.getGlobalValue(), var31, var34);
                                        }
                                        var33 = var33.rest();
                                        var34 = var33.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)$ic244$);
                            }
                        }
                    }
                    while (NIL == module0054.f3970(var22)) {
                        final SubLObject var36 = module0054.f3974(var22);
                        final SubLObject var37 = module0079.f5424(var36);
                        SubLObject var40;
                        for (SubLObject var38 = (SubLObject)NIL; NIL == var38; var38 = (SubLObject)makeBoolean(NIL == var40)) {
                            var10.resetMultipleValues();
                            final SubLObject var39 = module0052.f3693(var37);
                            var40 = var10.secondMultipleValue();
                            var10.resetMultipleValues();
                            if (NIL != var40) {
                                SubLObject var42;
                                final SubLObject var41 = var42 = var39;
                                SubLObject var43 = (SubLObject)NIL;
                                SubLObject var44 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic244$);
                                var43 = var42.first();
                                var42 = var42.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic244$);
                                var44 = var42.first();
                                var42 = var42.rest();
                                if (NIL == var42) {
                                    if (NIL != module0079.f5404(var44)) {
                                        module0054.f3973(var44, var22);
                                    }
                                    else if (var44.isCons()) {
                                        final SubLObject var45 = var44.first();
                                        SubLObject var47;
                                        final SubLObject var46 = var47 = var44.rest();
                                        SubLObject var15_406 = (SubLObject)NIL;
                                        var15_406 = var47.first();
                                        while (NIL != var47) {
                                            final SubLObject var48 = f45330(var15_406);
                                            if (NIL == var48) {
                                                f45386($g5848$.getGlobalValue(), var45, var15_406);
                                            }
                                            var47 = var47.rest();
                                            var15_406 = var47.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)$ic244$);
                                }
                            }
                        }
                    }
                }
                finally {
                    module0096.$g1265$.rebind(var25_400, var10);
                }
            }
            finally {
                if (NIL != var21) {
                    Locks.release_lock(var20);
                }
            }
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var19, var10);
            module0012.$g70$.rebind(var18, var10);
            module0012.$g69$.rebind(var17, var10);
            module0012.$g66$.rebind(var16, var10);
            module0012.$g68$.rebind(var15, var10);
            module0012.$g67$.rebind(var14, var10);
            module0012.$g65$.rebind(var13, var10);
            module0012.$g73$.rebind(var12, var10);
        }
        return (SubLObject)$ic292$;
    }
    
    public static SubLObject f45564(final SubLObject var390, final SubLObject var88, final SubLObject var89) {
        if (NIL != module0585.f35830()) {
            return var390;
        }
        final SubLObject var391 = module0208.f13535(var89);
        SubLObject var392 = (SubLObject)NIL;
        SubLObject var393 = var390;
        SubLObject var394 = (SubLObject)NIL;
        var394 = var393.first();
        while (NIL != var393) {
            final SubLObject var395 = f45330(var394);
            if (NIL == var395) {
                var392 = (SubLObject)ConsesLow.cons(var394, var392);
                f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic293$, var391, var394, var390, (SubLObject)UNPROVIDED);
                f45386(var88, var391, var394);
            }
            var393 = var393.rest();
            var394 = var393.first();
        }
        if (NIL != var392) {
            final SubLObject var396 = f45603(var390, var392);
            f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic294$, var396, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var396;
        }
        return var390;
    }
    
    public static SubLObject f45603(final SubLObject var390, final SubLObject var407) {
        return conses_high.set_difference(var390, var407, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45601(final SubLObject var390, final SubLObject var89) {
        final SubLThread var391 = SubLProcess.currentSubLThread();
        final SubLObject var392 = module0208.f13535(var89);
        SubLObject var393 = (SubLObject)NIL;
        SubLObject var394 = var390;
        SubLObject var395 = (SubLObject)NIL;
        var395 = var394.first();
        while (NIL != var394) {
            if (NIL != module0004.f104(var395, $g5849$.getDynamicValue(var391), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var393 = (SubLObject)ConsesLow.cons(var395, var393);
            }
            else {
                final SubLObject var396 = $g5849$.currentBinding(var391);
                try {
                    $g5849$.bind((SubLObject)ConsesLow.cons(var395, $g5849$.getDynamicValue(var391)), var391);
                    if (NIL != f45604(var395, var392)) {
                        var393 = (SubLObject)ConsesLow.cons(var395, var393);
                    }
                }
                finally {
                    $g5849$.rebind(var396, var391);
                }
            }
            var394 = var394.rest();
            var395 = var394.first();
        }
        return var393;
    }
    
    public static SubLObject f45604(final SubLObject var15, final SubLObject var89) {
        final SubLObject var90 = module0208.f13535(var89);
        SubLObject var91 = (SubLObject)NIL;
        final SubLObject var92 = Equality.equalp(var90.first(), $g5828$.getGlobalValue());
        if (NIL == var91) {
            SubLObject var93;
            SubLObject var94;
            for (var93 = f45339(var15, var92), var94 = (SubLObject)NIL, var94 = var93.first(); NIL == var91 && NIL != var93; var91 = Equality.equal(var94, var90), var93 = var93.rest(), var94 = var93.first()) {}
        }
        return var91;
    }
    
    public static SubLObject f45553() {
        f45605();
        f45606();
        f45607();
        f45608();
        f45609();
        f45610();
        f45611();
        f45612();
        f45487();
        return (SubLObject)T;
    }
    
    public static SubLObject f45567() {
        f45528();
        f45530();
        f45532();
        f45536();
        return (SubLObject)T;
    }
    
    public static SubLObject f45528() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var10);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var10);
            module0147.$g2095$.bind($ic47$, var10);
            final SubLObject var13 = (SubLObject)ConsesLow.cons($ic127$, module0731.f44700($g5839$.getGlobalValue()));
            final SubLObject var14 = module0035.remove_if_not((SubLObject)$ic295$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            $g5840$.setGlobalValue(var14);
        }
        finally {
            module0147.$g2095$.rebind(var12, var10);
            module0147.$g2094$.rebind(var11, var10);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45530() {
        $g5841$.setGlobalValue((SubLObject)$ic296$);
        return (SubLObject)T;
    }
    
    public static SubLObject f45532() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var10);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var10);
            module0147.$g2095$.bind($ic47$, var10);
            $g5843$.setGlobalValue((SubLObject)ConsesLow.cons($ic161$, f45613()));
            $g5844$.setGlobalValue(module0259.f16848($ic297$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            $g5842$.setGlobalValue(module0259.f16848($ic298$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            $g5842$.setGlobalValue(module0035.delete_if_not((SubLObject)$ic299$, $g5842$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var12, var10);
            module0147.$g2094$.rebind(var11, var10);
        }
        return $g5844$.getGlobalValue();
    }
    
    public static SubLObject f45614(final SubLObject var119) {
        return (SubLObject)makeBoolean(NIL != f45615(var119, (SubLObject)UNPROVIDED) || NIL != module0732.f44998(var119));
    }
    
    public static SubLObject f45460(final SubLObject var8) {
        return module0004.f104(var8, f45533(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45496(final SubLObject var8) {
        return module0004.f104(var8, f45613(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45606() {
        final SubLObject var183 = $g5850$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45616() {
        return module0034.f1829($g5850$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45617() {
        return module0259.f16850($ic301$);
    }
    
    public static SubLObject f45613() {
        SubLObject var415 = $g5850$.getGlobalValue();
        if (NIL == var415) {
            var415 = module0034.f1934((SubLObject)$ic300$, (SubLObject)$ic302$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var416 = module0034.f1810(var415, (SubLObject)UNPROVIDED);
        if (var416 == $ic11$) {
            var416 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45617()));
            module0034.f1812(var415, var416, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var416);
    }
    
    public static SubLObject f45536() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var10);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var10);
            module0147.$g2095$.bind($ic47$, var10);
            $g5845$.setGlobalValue(module0259.f16848($ic303$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var12, var10);
            module0147.$g2094$.rebind(var11, var10);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45568(final SubLObject var110) {
        if (NIL != f45618(var110)) {
            final SubLObject var111 = module0178.f11333(var110);
            return (SubLObject)makeBoolean(NIL != module0004.f104(var111, f45527(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != conses_high.member(var111, f45534(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f45460(var111));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45574(final SubLObject var110) {
        if (NIL != f45618(var110)) {
            final SubLObject var111 = module0178.f11333(var110);
            return (SubLObject)makeBoolean(var111.eql($ic8$) || NIL != module0004.f104(var111, f45529(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != conses_high.member(var111, f45531(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f45519(var111) || NIL != conses_high.member(var111, f45534(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45554(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic304$);
        streams_high.force_output((SubLObject)UNPROVIDED);
        PrintLow.format((SubLObject)T, (SubLObject)$ic305$);
        f45619((SubLObject)$ic306$, var88);
        PrintLow.format((SubLObject)T, (SubLObject)$ic307$);
        f45619((SubLObject)$ic308$, var88);
        return (SubLObject)T;
    }
    
    public static SubLObject f45619(final SubLObject var418, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        final SubLThread var419 = SubLProcess.currentSubLThread();
        final SubLObject var420 = module0035.remove_if_not((SubLObject)$ic309$, (SubLObject)((var418 == $ic306$) ? ConsesLow.append(f45527(), f45533()) : ConsesLow.cons($ic8$, f45620())), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var421 = Sequences.length(var420);
        SubLObject var422 = (SubLObject)ZERO_INTEGER;
        final SubLObject var424;
        final SubLObject var423 = var424 = module0034.f1888();
        final SubLObject var425 = module0034.$g879$.currentBinding(var419);
        try {
            module0034.$g879$.bind(var424, var419);
            SubLObject var426 = (SubLObject)NIL;
            if (NIL != var424 && NIL == module0034.f1842(var424)) {
                var426 = module0034.f1869(var424);
                final SubLObject var427 = Threads.current_process();
                if (NIL == var426) {
                    module0034.f1873(var424, var427);
                }
                else if (!var426.eql(var427)) {
                    Errors.error((SubLObject)$ic249$);
                }
            }
            try {
                SubLObject var428 = var420;
                SubLObject var429 = (SubLObject)NIL;
                var429 = var428.first();
                while (NIL != var428) {
                    final SubLObject var430 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic310$, new SubLObject[] { module0048.f_1X(var422), var421, var429 });
                    f45621(var429, (SubLObject)NIL, var418, var88, var430);
                    var422 = Numbers.add(var422, (SubLObject)ONE_INTEGER);
                    var428 = var428.rest();
                    var429 = var428.first();
                }
            }
            finally {
                final SubLObject var25_423 = Threads.$is_thread_performing_cleanupP$.currentBinding(var419);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var419);
                    if (NIL != var424 && NIL == var426) {
                        module0034.f1873(var424, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var25_423, var419);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var425, var419);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45622(final SubLObject var36, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        f45623(var36, module0259.f16848($ic311$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var88);
        f45623(var36, module0259.f16848($ic312$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var88);
        return (SubLObject)T;
    }
    
    public static SubLObject f45623(final SubLObject var36, SubLObject var419, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        final SubLThread var420 = SubLProcess.currentSubLThread();
        var419 = module0035.remove_if_not((SubLObject)$ic309$, var419, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var421 = Sequences.length(var419);
        SubLObject var422 = (SubLObject)ZERO_INTEGER;
        final SubLObject var423 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic313$, var36);
        final SubLObject var424 = module0012.$g75$.currentBinding(var420);
        final SubLObject var425 = module0012.$g76$.currentBinding(var420);
        final SubLObject var426 = module0012.$g77$.currentBinding(var420);
        final SubLObject var427 = module0012.$g78$.currentBinding(var420);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var420);
            module0012.$g76$.bind((SubLObject)NIL, var420);
            module0012.$g77$.bind((SubLObject)T, var420);
            module0012.$g78$.bind(Time.get_universal_time(), var420);
            module0012.f478(var423);
            SubLObject var428 = var419;
            SubLObject var429 = (SubLObject)NIL;
            var429 = var428.first();
            while (NIL != var428) {
                final SubLObject var430 = (SubLObject)((NIL != Sequences.find(var429, f45527(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? $ic306$ : $ic308$);
                final SubLObject var431 = module0147.f9540(var36);
                final SubLObject var25_425 = module0147.$g2095$.currentBinding(var420);
                final SubLObject var39_426 = module0147.$g2094$.currentBinding(var420);
                final SubLObject var40_427 = module0147.$g2096$.currentBinding(var420);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var431), var420);
                    module0147.$g2094$.bind(module0147.f9546(var431), var420);
                    module0147.$g2096$.bind(module0147.f9549(var431), var420);
                    final SubLObject var432 = var429;
                    if (NIL != module0158.f10038(var432)) {
                        final SubLObject var433 = (SubLObject)NIL;
                        final SubLObject var25_426 = module0012.$g73$.currentBinding(var420);
                        final SubLObject var39_427 = module0012.$g65$.currentBinding(var420);
                        final SubLObject var40_428 = module0012.$g67$.currentBinding(var420);
                        final SubLObject var196_432 = module0012.$g68$.currentBinding(var420);
                        final SubLObject var434 = module0012.$g66$.currentBinding(var420);
                        final SubLObject var435 = module0012.$g69$.currentBinding(var420);
                        final SubLObject var436 = module0012.$g70$.currentBinding(var420);
                        final SubLObject var437 = module0012.$silent_progressP$.currentBinding(var420);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var420);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var420), var420);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var420);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var420);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var420);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var420);
                            module0012.$g70$.bind((SubLObject)T, var420);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var433) ? module0012.$silent_progressP$.getDynamicValue(var420) : T), var420);
                            module0012.f474(var433);
                            final SubLObject var438 = module0158.f10039(var432);
                            SubLObject var439 = (SubLObject)NIL;
                            final SubLObject var440 = (SubLObject)NIL;
                            while (NIL == var439) {
                                final SubLObject var441 = module0052.f3695(var438, var440);
                                final SubLObject var442 = (SubLObject)makeBoolean(!var440.eql(var441));
                                if (NIL != var442) {
                                    module0012.f476();
                                    SubLObject var443 = (SubLObject)NIL;
                                    try {
                                        var443 = module0158.f10316(var441, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                                        SubLObject var434_439 = (SubLObject)NIL;
                                        final SubLObject var435_440 = (SubLObject)NIL;
                                        while (NIL == var434_439) {
                                            final SubLObject var444 = module0052.f3695(var443, var435_440);
                                            final SubLObject var437_441 = (SubLObject)makeBoolean(!var435_440.eql(var444));
                                            if (NIL != var437_441) {
                                                final SubLObject var445 = var430;
                                                if (var445.eql((SubLObject)$ic306$)) {
                                                    f45569(var444, var88, (SubLObject)UNPROVIDED);
                                                }
                                                else if (var445.eql((SubLObject)$ic308$)) {
                                                    f45575(var444, var88, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            var434_439 = (SubLObject)makeBoolean(NIL == var437_441);
                                        }
                                    }
                                    finally {
                                        final SubLObject var25_427 = Threads.$is_thread_performing_cleanupP$.currentBinding(var420);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var420);
                                            if (NIL != var443) {
                                                module0158.f10319(var443);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var25_427, var420);
                                        }
                                    }
                                }
                                var439 = (SubLObject)makeBoolean(NIL == var442);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var437, var420);
                            module0012.$g70$.rebind(var436, var420);
                            module0012.$g69$.rebind(var435, var420);
                            module0012.$g66$.rebind(var434, var420);
                            module0012.$g68$.rebind(var196_432, var420);
                            module0012.$g67$.rebind(var40_428, var420);
                            module0012.$g65$.rebind(var39_427, var420);
                            module0012.$g73$.rebind(var25_426, var420);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var40_427, var420);
                    module0147.$g2094$.rebind(var39_426, var420);
                    module0147.$g2095$.rebind(var25_425, var420);
                }
                var422 = Numbers.add(var422, (SubLObject)ONE_INTEGER);
                module0012.note_percent_progress(var422, var421);
                var428 = var428.rest();
                var429 = var428.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var427, var420);
            module0012.$g77$.rebind(var426, var420);
            module0012.$g76$.rebind(var425, var420);
            module0012.$g75$.rebind(var424, var420);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45621(final SubLObject var119, SubLObject var443, SubLObject var418, SubLObject var88, SubLObject var303) {
        if (var443 == UNPROVIDED) {
            var443 = (SubLObject)T;
        }
        if (var418 == UNPROVIDED) {
            var418 = (SubLObject)NIL;
        }
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var303 == UNPROVIDED) {
            var303 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic316$, var119);
        }
        final SubLThread var444 = SubLProcess.currentSubLThread();
        if (NIL != var443) {
            f45624(var119);
        }
        if (NIL == var418) {
            var418 = (SubLObject)((NIL != Sequences.find(var119, f45527(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? $ic306$ : $ic308$);
        }
        SubLObject var445 = (SubLObject)ZERO_INTEGER;
        SubLObject var446 = (SubLObject)ZERO_INTEGER;
        final SubLObject var447 = (SubLObject)$ic165$;
        final SubLObject var448 = f45625((SubLObject)NIL, (SubLObject)T);
        SubLObject var449 = module0147.$g2094$.currentBinding(var444);
        SubLObject var450 = module0147.$g2095$.currentBinding(var444);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var444);
            module0147.$g2095$.bind($ic47$, var444);
            var445 = module0217.f14249(var119);
        }
        finally {
            module0147.$g2095$.rebind(var450, var444);
            module0147.$g2094$.rebind(var449, var444);
        }
        var449 = module0012.$g75$.currentBinding(var444);
        var450 = module0012.$g76$.currentBinding(var444);
        final SubLObject var451 = module0012.$g77$.currentBinding(var444);
        final SubLObject var452 = module0012.$g78$.currentBinding(var444);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var444);
            module0012.$g76$.bind((SubLObject)NIL, var444);
            module0012.$g77$.bind((SubLObject)T, var444);
            module0012.$g78$.bind(Time.get_universal_time(), var444);
            module0012.f478(var303);
            final SubLObject var25_448 = module0147.$g2094$.currentBinding(var444);
            final SubLObject var39_449 = module0147.$g2095$.currentBinding(var444);
            try {
                module0147.$g2094$.bind((SubLObject)$ic46$, var444);
                module0147.$g2095$.bind($ic47$, var444);
                if (NIL != module0158.f10038(var119)) {
                    final SubLObject var453 = (SubLObject)NIL;
                    final SubLObject var25_449 = module0012.$g73$.currentBinding(var444);
                    final SubLObject var39_450 = module0012.$g65$.currentBinding(var444);
                    final SubLObject var40_452 = module0012.$g67$.currentBinding(var444);
                    final SubLObject var196_453 = module0012.$g68$.currentBinding(var444);
                    final SubLObject var454 = module0012.$g66$.currentBinding(var444);
                    final SubLObject var455 = module0012.$g69$.currentBinding(var444);
                    final SubLObject var456 = module0012.$g70$.currentBinding(var444);
                    final SubLObject var457 = module0012.$silent_progressP$.currentBinding(var444);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var444);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var444), var444);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var444);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var444);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var444);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var444);
                        module0012.$g70$.bind((SubLObject)T, var444);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var453) ? module0012.$silent_progressP$.getDynamicValue(var444) : T), var444);
                        module0012.f474(var453);
                        final SubLObject var458 = module0158.f10039(var119);
                        SubLObject var459 = (SubLObject)NIL;
                        final SubLObject var460 = (SubLObject)NIL;
                        while (NIL == var459) {
                            final SubLObject var461 = module0052.f3695(var458, var460);
                            final SubLObject var462 = (SubLObject)makeBoolean(!var460.eql(var461));
                            if (NIL != var462) {
                                module0012.f476();
                                SubLObject var463 = (SubLObject)NIL;
                                try {
                                    var463 = module0158.f10316(var461, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                                    SubLObject var434_454 = (SubLObject)NIL;
                                    final SubLObject var435_455 = (SubLObject)NIL;
                                    while (NIL == var434_454) {
                                        final SubLObject var464 = module0052.f3695(var463, var435_455);
                                        final SubLObject var437_456 = (SubLObject)makeBoolean(!var435_455.eql(var464));
                                        if (NIL != var437_456) {
                                            final SubLObject var465 = var418;
                                            if (var465.eql((SubLObject)$ic306$)) {
                                                final SubLObject var466 = f45569(var464, var88, (SubLObject)UNPROVIDED);
                                                if (!var466.eql(var448)) {
                                                    Errors.warn((SubLObject)$ic317$, var466, var464);
                                                }
                                            }
                                            else if (var465.eql((SubLObject)$ic308$)) {
                                                final SubLObject var466 = f45575(var464, var88, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                if (!var466.eql(var448)) {
                                                    Errors.warn((SubLObject)$ic317$, var466, var464);
                                                }
                                            }
                                            var446 = Numbers.add(var446, (SubLObject)ONE_INTEGER);
                                            if (var445.numGE(var447)) {
                                                module0012.note_percent_progress(var446, var445);
                                            }
                                        }
                                        var434_454 = (SubLObject)makeBoolean(NIL == var437_456);
                                    }
                                }
                                finally {
                                    final SubLObject var25_450 = Threads.$is_thread_performing_cleanupP$.currentBinding(var444);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var444);
                                        if (NIL != var463) {
                                            module0158.f10319(var463);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var25_450, var444);
                                    }
                                }
                            }
                            var459 = (SubLObject)makeBoolean(NIL == var462);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var457, var444);
                        module0012.$g70$.rebind(var456, var444);
                        module0012.$g69$.rebind(var455, var444);
                        module0012.$g66$.rebind(var454, var444);
                        module0012.$g68$.rebind(var196_453, var444);
                        module0012.$g67$.rebind(var40_452, var444);
                        module0012.$g65$.rebind(var39_450, var444);
                        module0012.$g73$.rebind(var25_449, var444);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var39_449, var444);
                module0147.$g2094$.rebind(var25_448, var444);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var452, var444);
            module0012.$g77$.rebind(var451, var444);
            module0012.$g76$.rebind(var450, var444);
            module0012.$g75$.rebind(var449, var444);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45624(final SubLObject var119) {
        final SubLThread var120 = SubLProcess.currentSubLThread();
        final SubLObject var121 = $g5846$.getGlobalValue();
        SubLObject var122 = (SubLObject)NIL;
        try {
            var122 = Locks.seize_lock(var121);
            final SubLObject var123 = module0096.$g1265$.currentBinding(var120);
            try {
                module0096.$g1265$.bind($g5827$.getGlobalValue(), var120);
                final SubLObject var124 = module0054.f3968();
                final SubLObject var125 = module0079.f5424($g5848$.getGlobalValue());
                SubLObject var128;
                for (SubLObject var126 = (SubLObject)NIL; NIL == var126; var126 = (SubLObject)makeBoolean(NIL == var128)) {
                    var120.resetMultipleValues();
                    final SubLObject var127 = module0052.f3693(var125);
                    var128 = var120.secondMultipleValue();
                    var120.resetMultipleValues();
                    if (NIL != var128) {
                        SubLObject var130;
                        final SubLObject var129 = var130 = var127;
                        SubLObject var131 = (SubLObject)NIL;
                        SubLObject var132 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)$ic244$);
                        var131 = var130.first();
                        var130 = var130.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)$ic244$);
                        var132 = var130.first();
                        var130 = var130.rest();
                        if (NIL == var130) {
                            if (NIL != module0079.f5404(var132)) {
                                module0054.f3973(var132, var124);
                            }
                            else if (var132.isCons()) {
                                final SubLObject var133 = var132.first();
                                final SubLObject var134 = var132.rest();
                                var120.resetMultipleValues();
                                final SubLObject var135 = f45626(var134, var119);
                                final SubLObject var136 = var120.secondMultipleValue();
                                var120.resetMultipleValues();
                                if (NIL != var136) {
                                    if (NIL != var135) {
                                        module0087.f5968($g5848$.getGlobalValue(), var133, var135);
                                    }
                                    else {
                                        module0087.f5970($g5848$.getGlobalValue(), var133);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)$ic244$);
                        }
                    }
                }
                while (NIL == module0054.f3970(var124)) {
                    final SubLObject var137 = module0054.f3974(var124);
                    final SubLObject var138 = module0079.f5424(var137);
                    SubLObject var141;
                    for (SubLObject var139 = (SubLObject)NIL; NIL == var139; var139 = (SubLObject)makeBoolean(NIL == var141)) {
                        var120.resetMultipleValues();
                        final SubLObject var140 = module0052.f3693(var138);
                        var141 = var120.secondMultipleValue();
                        var120.resetMultipleValues();
                        if (NIL != var141) {
                            SubLObject var143;
                            final SubLObject var142 = var143 = var140;
                            SubLObject var144 = (SubLObject)NIL;
                            SubLObject var145 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)$ic244$);
                            var144 = var143.first();
                            var143 = var143.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)$ic244$);
                            var145 = var143.first();
                            var143 = var143.rest();
                            if (NIL == var143) {
                                if (NIL != module0079.f5404(var145)) {
                                    module0054.f3973(var145, var124);
                                }
                                else if (var145.isCons()) {
                                    final SubLObject var146 = var145.first();
                                    final SubLObject var147 = var145.rest();
                                    var120.resetMultipleValues();
                                    final SubLObject var148 = f45626(var147, var119);
                                    final SubLObject var149 = var120.secondMultipleValue();
                                    var120.resetMultipleValues();
                                    if (NIL != var149) {
                                        if (NIL != var148) {
                                            module0087.f5968($g5848$.getGlobalValue(), var146, var148);
                                        }
                                        else {
                                            module0087.f5970($g5848$.getGlobalValue(), var146);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)$ic244$);
                            }
                        }
                    }
                }
            }
            finally {
                module0096.$g1265$.rebind(var123, var120);
            }
        }
        finally {
            if (NIL != var122) {
                Locks.release_lock(var121);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45626(final SubLObject var33, final SubLObject var119) {
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        SubLObject var122 = var33;
        SubLObject var123 = (SubLObject)NIL;
        var123 = var122.first();
        while (NIL != var122) {
            if (NIL == f45319(var123)) {
                var121 = (SubLObject)T;
            }
            else if (f45373(var123, (SubLObject)UNPROVIDED).eql(var119)) {
                var121 = (SubLObject)T;
            }
            else {
                var120 = (SubLObject)ConsesLow.cons(var123, var120);
            }
            var122 = var122.rest();
            var123 = var122.first();
        }
        return Values.values(var120, var121);
    }
    
    public static SubLObject f45618(final SubLObject var110) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var110) && NIL != module0161.f10481(module0178.f11287(var110)));
    }
    
    public static SubLObject f45625(final SubLObject var466, SubLObject var467) {
        if (var467 == UNPROVIDED) {
            var467 = (SubLObject)T;
        }
        if (NIL != var466) {
            return (SubLObject)((NIL != var467) ? $ic134$ : $ic262$);
        }
        return (SubLObject)((NIL != var467) ? $ic132$ : $ic261$);
    }
    
    public static SubLObject f45569(final SubLObject var110, SubLObject var88, SubLObject var466) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var466 == UNPROVIDED) {
            var466 = (SubLObject)NIL;
        }
        final SubLThread var467 = SubLProcess.currentSubLThread();
        if (NIL == f45627(var88, var110)) {
            return f45625(var466, (SubLObject)NIL);
        }
        final SubLObject var468 = module0178.f11333(var110);
        final SubLObject var469 = f45625(var466, (SubLObject)T);
        SubLObject var470 = (SubLObject)NIL;
        SubLObject var471 = (SubLObject)NIL;
        if (NIL != $g5851$.getDynamicValue(var467)) {
            try {
                var467.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var472 = Errors.$error_handler$.currentBinding(var467);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic318$, var467);
                    try {
                        final SubLObject var473 = $g5846$.getGlobalValue();
                        SubLObject var474 = (SubLObject)NIL;
                        try {
                            var474 = Locks.seize_lock(var473);
                            if (var468.eql($ic127$)) {
                                var471 = f45628(var110, var88, var466);
                            }
                            else if (NIL != f45460(var468)) {
                                final SubLObject var475 = var468;
                                if (var475.eql($ic161$)) {
                                    var471 = f45629(var110, var88, var466);
                                }
                                else if (var475.eql($ic319$)) {
                                    var471 = f45630(var110, var88, var466);
                                }
                                else if (var475.eql($ic320$)) {
                                    var471 = f45631(var110, var88, var466);
                                }
                            }
                            else {
                                var471 = f45632(var110, var88, var466);
                            }
                        }
                        finally {
                            if (NIL != var474) {
                                Locks.release_lock(var473);
                            }
                        }
                    }
                    catch (Throwable var476) {
                        Errors.handleThrowable(var476, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var472, var467);
                }
            }
            catch (Throwable var477) {
                var470 = Errors.handleThrowable(var477, module0003.$g3$.getGlobalValue());
            }
            finally {
                var467.throwStack.pop();
            }
        }
        else {
            final SubLObject var478 = $g5846$.getGlobalValue();
            SubLObject var479 = (SubLObject)NIL;
            try {
                var479 = Locks.seize_lock(var478);
                if (var468.eql($ic127$)) {
                    var471 = f45628(var110, var88, var466);
                }
                else if (NIL != f45460(var468)) {
                    final SubLObject var480 = var468;
                    if (var480.eql($ic161$)) {
                        var471 = f45629(var110, var88, var466);
                    }
                    else if (var480.eql($ic319$)) {
                        var471 = f45630(var110, var88, var466);
                    }
                    else if (var480.eql($ic320$)) {
                        var471 = f45631(var110, var88, var466);
                    }
                }
                else {
                    var471 = f45632(var110, var88, var466);
                }
            }
            finally {
                if (NIL != var479) {
                    Locks.release_lock(var478);
                }
            }
        }
        if (var470.isString()) {
            f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic321$, var110, var470, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f45625(var466, Equality.eql(var471, var469));
    }
    
    public static SubLObject f45627(final SubLObject var88, final SubLObject var110) {
        if (NIL == f45541(var88)) {
            f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic322$, var88, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL == f45618(var110)) {
            f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic323$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45632(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        final SubLObject var467 = module0209.f13552(module0178.f11335(var110));
        final SubLObject var468 = module0178.f11334(var110);
        final SubLObject var469 = module0178.f11287(var110);
        final SubLObject var470 = module0178.f11333(var110);
        final SubLObject var471 = f45633(var468, var467, var470, var469);
        final SubLObject var472 = f45634(var471, var469);
        SubLObject var473 = f45340(var467);
        SubLObject var474 = (SubLObject)NIL;
        var474 = var473.first();
        while (NIL != var473) {
            final SubLObject var475 = f45455(var110);
            f45635(var88, var474, var475, var466);
            var473 = var473.rest();
            var474 = var473.first();
        }
        var473 = var472;
        SubLObject var476 = (SubLObject)NIL;
        var476 = var473.first();
        while (NIL != var473) {
            SubLObject var478;
            final SubLObject var477 = var478 = var476;
            SubLObject var479 = (SubLObject)NIL;
            SubLObject var480 = (SubLObject)NIL;
            SubLObject var481 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var478, var477, (SubLObject)$ic324$);
            var479 = var478.first();
            var478 = var478.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var478, var477, (SubLObject)$ic324$);
            var480 = var478.first();
            var478 = var478.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var478, var477, (SubLObject)$ic324$);
            var481 = var478.first();
            var478 = var478.rest();
            if (NIL == var478) {
                final SubLObject var482 = (NIL != module0269.f17716(var480)) ? var480 : $ic127$;
                SubLObject var23_484 = var479;
                SubLObject var483 = (SubLObject)NIL;
                var483 = var23_484.first();
                while (NIL != var23_484) {
                    SubLObject var23_485 = f45340(var483);
                    SubLObject var484 = (SubLObject)NIL;
                    var484 = var23_485.first();
                    while (NIL != var23_485) {
                        final SubLObject var485 = module0202.f12768(var482, var468, var483);
                        final SubLObject var486 = f45429(var485, var481, var483);
                        final SubLObject var487 = f45455(var486);
                        f45635(var88, var484, var487, var466);
                        var23_485 = var23_485.rest();
                        var484 = var23_485.first();
                    }
                    var23_484 = var23_484.rest();
                    var483 = var23_484.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var477, (SubLObject)$ic324$);
            }
            var473 = var473.rest();
            var476 = var473.first();
        }
        f45636(var468, var88, var469, var466, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var467), var470, var469), var472));
        if (NIL != f45637(var110)) {
            f45638(var110, var88, var466);
        }
        return f45625(var466, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45637(final SubLObject var110) {
        SubLObject var112;
        final SubLObject var111 = var112 = module0178.f11285(var110);
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)$ic325$);
        var113 = var112.first();
        var112 = var112.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)$ic325$);
        var114 = var112.first();
        var112 = var112.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)$ic325$);
        var115 = var112.first();
        var112 = var112.rest();
        if (NIL == var112) {
            final SubLObject var116 = module0178.f11287(var110);
            return (SubLObject)makeBoolean(NIL != module0731.f44695(var113, var116) && NIL == Sequences.remove(var115, f45639(var114, var113, var116), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var111, (SubLObject)$ic325$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45639(final SubLObject var475, final SubLObject var119, final SubLObject var36) {
        final SubLThread var476 = SubLProcess.currentSubLThread();
        SubLObject var477 = (SubLObject)NIL;
        SubLObject var478 = f45640(var119, var36);
        SubLObject var479 = (SubLObject)NIL;
        var479 = var478.first();
        while (NIL != var478) {
            final SubLObject var480 = module0147.f9540(var36);
            final SubLObject var481 = module0147.$g2095$.currentBinding(var476);
            final SubLObject var482 = module0147.$g2094$.currentBinding(var476);
            final SubLObject var483 = module0147.$g2096$.currentBinding(var476);
            try {
                module0147.$g2095$.bind(module0147.f9545(var480), var476);
                module0147.$g2094$.bind(module0147.f9546(var480), var476);
                module0147.$g2096$.bind(module0147.f9549(var480), var476);
                SubLObject var23_491 = module0220.f14562(var475, var479, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var484 = (SubLObject)NIL;
                var484 = var23_491.first();
                while (NIL != var23_491) {
                    var477 = (SubLObject)ConsesLow.cons(var484, var477);
                    var23_491 = var23_491.rest();
                    var484 = var23_491.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var483, var476);
                module0147.$g2094$.rebind(var482, var476);
                module0147.$g2095$.rebind(var481, var476);
            }
            var478 = var478.rest();
            var479 = var478.first();
        }
        return Sequences.delete_duplicates(var477, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45610() {
        final SubLObject var183 = $g5852$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45641(final SubLObject var119, final SubLObject var36) {
        return module0034.f1829($g5852$.getGlobalValue(), (SubLObject)ConsesLow.list(var119, var36), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45642(final SubLObject var119, final SubLObject var36) {
        return module0260.f17033(var119, var36, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45640(final SubLObject var119, final SubLObject var36) {
        SubLObject var120 = $g5852$.getGlobalValue();
        if (NIL == var120) {
            var120 = module0034.f1934((SubLObject)$ic326$, (SubLObject)$ic327$, (SubLObject)$ic328$, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1947((SubLObject)$ic329$);
        }
        final SubLObject var121 = module0034.f1782(var119, var36);
        final SubLObject var122 = module0034.f1814(var120, var121, (SubLObject)UNPROVIDED);
        if (var122 != $ic11$) {
            SubLObject var123 = var122;
            SubLObject var124 = (SubLObject)NIL;
            var124 = var123.first();
            while (NIL != var123) {
                SubLObject var125 = var124.first();
                final SubLObject var126 = conses_high.second(var124);
                if (var119.eql(var125.first())) {
                    var125 = var125.rest();
                    if (NIL != var125 && NIL == var125.rest() && var36.eql(var125.first())) {
                        return module0034.f1959(var126);
                    }
                }
                var123 = var123.rest();
                var124 = var123.first();
            }
        }
        final SubLObject var127 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45642(var119, var36)));
        module0034.f1836(var120, var121, var122, var127, (SubLObject)ConsesLow.list(var119, var36));
        return module0034.f1959(var127);
    }
    
    public static SubLObject f45638(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        SubLObject var468;
        final SubLObject var467 = var468 = module0178.f11285(var110);
        SubLObject var469 = (SubLObject)NIL;
        SubLObject var470 = (SubLObject)NIL;
        SubLObject var471 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic330$);
        var469 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic330$);
        var470 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic330$);
        var471 = var468.first();
        var468 = var468.rest();
        if (NIL == var468) {
            final SubLObject var472 = module0178.f11287(var110);
            SubLObject var473 = (SubLObject)NIL;
            if (NIL != module0731.f44690(var469, (SubLObject)UNPROVIDED) && NIL != module0731.f44719(var470)) {
                SubLObject var474 = module0730.f44573(var470, var469, var472);
                SubLObject var475 = (SubLObject)NIL;
                var475 = var474.first();
                while (NIL != var474) {
                    if (!var475.equal(var471)) {
                        if (NIL != var466) {
                            if (NIL == module0731.f44724(var475, var470, var469, var472, (SubLObject)UNPROVIDED)) {
                                f45643(var475, var110, var88, var466);
                                var473 = (SubLObject)ConsesLow.cons(var475, var473);
                            }
                        }
                        else if (NIL == f45644(var469, var470, var475, var472)) {
                            f45643(var475, var110, var88, var466);
                            var473 = (SubLObject)ConsesLow.cons(var475, var473);
                        }
                    }
                    var474 = var474.rest();
                    var475 = var474.first();
                }
            }
            return var473;
        }
        cdestructuring_bind.cdestructuring_bind_error(var467, (SubLObject)$ic330$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45644(final SubLObject var495, final SubLObject var69, final SubLObject var498, final SubLObject var499) {
        final SubLThread var500 = SubLProcess.currentSubLThread();
        SubLObject var501 = (SubLObject)NIL;
        final SubLObject var502 = module0147.f9540(var499);
        final SubLObject var503 = module0147.$g2095$.currentBinding(var500);
        final SubLObject var504 = module0147.$g2094$.currentBinding(var500);
        final SubLObject var505 = module0147.$g2096$.currentBinding(var500);
        try {
            module0147.$g2095$.bind(module0147.f9545(var502), var500);
            module0147.$g2094$.bind(module0147.f9546(var502), var500);
            module0147.$g2096$.bind(module0147.f9549(var502), var500);
            SubLObject var506 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var69, (SubLObject)NIL, var495)) {
                final SubLObject var507 = module0158.f10011(var69, (SubLObject)NIL, var495);
                SubLObject var508 = var501;
                final SubLObject var509 = (SubLObject)NIL;
                while (NIL == var508) {
                    final SubLObject var510 = module0052.f3695(var507, var509);
                    final SubLObject var511 = (SubLObject)makeBoolean(!var509.eql(var510));
                    if (NIL != var511) {
                        SubLObject var512 = (SubLObject)NIL;
                        try {
                            var512 = module0158.f10316(var510, (SubLObject)$ic314$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var434_504 = var501;
                            final SubLObject var435_505 = (SubLObject)NIL;
                            while (NIL == var434_504) {
                                final SubLObject var513 = module0052.f3695(var512, var435_505);
                                final SubLObject var437_507 = (SubLObject)makeBoolean(!var435_505.eql(var513));
                                if (NIL != var437_507) {
                                    var506 = module0178.f11331(var513, (SubLObject)TWO_INTEGER);
                                    if (var506.equal(var498)) {
                                        var501 = (SubLObject)T;
                                    }
                                }
                                var434_504 = (SubLObject)makeBoolean(NIL == var437_507 || NIL != var501);
                            }
                        }
                        finally {
                            final SubLObject var25_508 = Threads.$is_thread_performing_cleanupP$.currentBinding(var500);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var500);
                                if (NIL != var512) {
                                    module0158.f10319(var512);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_508, var500);
                            }
                        }
                    }
                    var508 = (SubLObject)makeBoolean(NIL == var511 || NIL != var501);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var505, var500);
            module0147.$g2094$.rebind(var504, var500);
            module0147.$g2095$.rebind(var503, var500);
        }
        return var501;
    }
    
    public static SubLObject f45643(final SubLObject var497, final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        SubLObject var499;
        final SubLObject var498 = var499 = module0178.f11285(var110);
        SubLObject var500 = (SubLObject)NIL;
        SubLObject var501 = (SubLObject)NIL;
        SubLObject var502 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var499, var498, (SubLObject)$ic331$);
        var500 = var499.first();
        var499 = var499.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var499, var498, (SubLObject)$ic331$);
        var501 = var499.first();
        var499 = var499.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var499, var498, (SubLObject)$ic331$);
        var502 = var499.first();
        var499 = var499.rest();
        if (NIL == var499) {
            final SubLObject var503 = module0178.f11287(var110);
            final SubLObject var504 = (SubLObject)makeBoolean(NIL == var466);
            final SubLObject var505 = module0202.f12768(var500, var501, var497);
            final SubLObject var506 = f45429(var505, var503, var497);
            final SubLObject var507 = f45455(var506);
            SubLObject var508 = f45340(var497);
            SubLObject var509 = (SubLObject)NIL;
            var509 = var508.first();
            while (NIL != var508) {
                f45635(var88, var509, var507, var504);
                var508 = var508.rest();
                var509 = var508.first();
            }
            if (NIL == var504) {
                final SubLObject var510 = f45634((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var497), var500)), var503);
                f45636(var501, var88, var503, var504, var510);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var498, (SubLObject)$ic331$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45634(final SubLObject var516, final SubLObject var476) {
        SubLObject var517 = (SubLObject)NIL;
        SubLObject var518 = var516;
        SubLObject var519 = (SubLObject)NIL;
        var519 = var518.first();
        while (NIL != var518) {
            SubLObject var521;
            final SubLObject var520 = var521 = var519;
            SubLObject var522 = (SubLObject)NIL;
            SubLObject var523 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var521, var520, (SubLObject)$ic332$);
            var522 = var521.first();
            var521 = var521.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var521, var520, (SubLObject)$ic332$);
            var523 = var521.first();
            var521 = var521.rest();
            if (NIL == var521) {
                var517 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var522, var523, var476), var517);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var520, (SubLObject)$ic332$);
            }
            var518 = var518.rest();
            var519 = var518.first();
        }
        return var517;
    }
    
    public static SubLObject f45628(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        SubLObject var468;
        final SubLObject var467 = var468 = module0178.f11330(var110);
        SubLObject var469 = (SubLObject)NIL;
        SubLObject var470 = (SubLObject)NIL;
        SubLObject var471 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic333$);
        var469 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic333$);
        var470 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic333$);
        var471 = var468.first();
        var468 = var468.rest();
        if (NIL == var468) {
            final SubLObject var472 = module0209.f13552(var471);
            final SubLObject var473 = module0178.f11287(var110);
            final SubLObject var474 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var472), var470, var473));
            final SubLObject var475 = f45455(var110);
            SubLObject var476 = f45340(var472);
            SubLObject var477 = (SubLObject)NIL;
            var477 = var476.first();
            while (NIL != var476) {
                f45635(var88, var477, var475, var466);
                var476 = var476.rest();
                var477 = var476.first();
            }
            f45636(var469, var88, var473, var466, var474);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var467, (SubLObject)$ic333$);
        }
        return f45625(var466, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45636(final SubLObject var475, final SubLObject var88, final SubLObject var522, final SubLObject var466, SubLObject var479) {
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        SubLObject var524;
        final SubLObject var523 = var524 = Sequences.remove_duplicates(ConsesLow.append(f45534(), f45529(), f45531()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var525 = (SubLObject)NIL;
        var525 = var524.first();
        while (NIL != var524) {
            f45645(var475, var88, var522, var466, var479, var525);
            var524 = var524.rest();
            var525 = var524.first();
        }
        return f45625(var466, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45645(final SubLObject var475, final SubLObject var88, final SubLObject var522, final SubLObject var466, SubLObject var479, final SubLObject var119) {
        final SubLThread var523 = SubLProcess.currentSubLThread();
        final SubLObject var524 = module0732.f45009(var119);
        final SubLObject var525 = module0732.f44998(var119);
        final SubLObject var526 = f45615(var119, (SubLObject)UNPROVIDED);
        if (NIL != module0731.f44656(var526, (SubLObject)UNPROVIDED)) {
            var479 = f45646(var479, var526);
        }
        if (NIL != var479) {
            final SubLObject var527 = module0147.$g2094$.currentBinding(var523);
            final SubLObject var528 = module0147.$g2095$.currentBinding(var523);
            try {
                module0147.$g2094$.bind((SubLObject)$ic46$, var523);
                module0147.$g2095$.bind($ic47$, var523);
                if (NIL != module0158.f10010(var475, var524, var119)) {
                    final SubLObject var529 = module0158.f10011(var475, var524, var119);
                    SubLObject var530 = (SubLObject)NIL;
                    final SubLObject var531 = (SubLObject)NIL;
                    while (NIL == var530) {
                        final SubLObject var532 = module0052.f3695(var529, var531);
                        final SubLObject var533 = (SubLObject)makeBoolean(!var531.eql(var532));
                        if (NIL != var533) {
                            SubLObject var534 = (SubLObject)NIL;
                            try {
                                var534 = module0158.f10316(var532, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                                SubLObject var434_526 = (SubLObject)NIL;
                                final SubLObject var435_527 = (SubLObject)NIL;
                                while (NIL == var434_526) {
                                    final SubLObject var535 = module0052.f3695(var534, var435_527);
                                    final SubLObject var437_528 = (SubLObject)makeBoolean(!var435_527.eql(var535));
                                    if (NIL != var437_528) {
                                        f45647(var535, var522, var525, var479, var88, var466);
                                    }
                                    var434_526 = (SubLObject)makeBoolean(NIL == var437_528);
                                }
                            }
                            finally {
                                final SubLObject var25_529 = Threads.$is_thread_performing_cleanupP$.currentBinding(var523);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var523);
                                    if (NIL != var534) {
                                        module0158.f10319(var534);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_529, var523);
                                }
                            }
                        }
                        var530 = (SubLObject)makeBoolean(NIL == var533);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var528, var523);
                module0147.$g2094$.rebind(var527, var523);
            }
        }
        return var119;
    }
    
    public static SubLObject f45647(final SubLObject var110, final SubLObject var522, final SubLObject var525, final SubLObject var479, final SubLObject var88, final SubLObject var466) {
        if (NIL != f45618(var110) && (NIL != module0731.f44644(module0178.f11287(var110), var522) || NIL != module0731.f44644(var522, module0178.f11287(var110)))) {
            if (NIL != var525) {
                final SubLObject var526 = module0178.f11331(var110, var525);
                final SubLObject var527 = f45646(var479, var526);
                if (NIL != var527) {
                    f45575(var110, var88, var466, var527);
                }
            }
            else {
                f45575(var110, var88, var466, var479);
            }
        }
        return var110;
    }
    
    public static SubLObject f45612() {
        final SubLObject var183 = $g5853$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45648(final SubLObject var119, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = $g5839$.getGlobalValue();
        }
        return module0034.f1829($g5853$.getGlobalValue(), (SubLObject)ConsesLow.list(var119, var36), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45649(final SubLObject var119, final SubLObject var36) {
        return module0731.f44877(var119, var36);
    }
    
    public static SubLObject f45615(final SubLObject var119, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = $g5839$.getGlobalValue();
        }
        SubLObject var120 = $g5853$.getGlobalValue();
        if (NIL == var120) {
            var120 = module0034.f1934((SubLObject)$ic334$, (SubLObject)$ic335$, (SubLObject)$ic336$, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var121 = module0034.f1782(var119, var36);
        final SubLObject var122 = module0034.f1814(var120, var121, (SubLObject)UNPROVIDED);
        if (var122 != $ic11$) {
            SubLObject var123 = var122;
            SubLObject var124 = (SubLObject)NIL;
            var124 = var123.first();
            while (NIL != var123) {
                SubLObject var125 = var124.first();
                final SubLObject var126 = conses_high.second(var124);
                if (var119.eql(var125.first())) {
                    var125 = var125.rest();
                    if (NIL != var125 && NIL == var125.rest() && var36.eql(var125.first())) {
                        return module0034.f1959(var126);
                    }
                }
                var123 = var123.rest();
                var124 = var123.first();
            }
        }
        final SubLObject var127 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45649(var119, var36)));
        module0034.f1836(var120, var121, var122, var127, (SubLObject)ConsesLow.list(var119, var36));
        return module0034.f1959(var127);
    }
    
    public static SubLObject f45646(final SubLObject var479, final SubLObject var184) {
        SubLObject var480 = (SubLObject)NIL;
        SubLObject var481 = var479;
        SubLObject var482 = (SubLObject)NIL;
        var482 = var481.first();
        while (NIL != var481) {
            final SubLObject var483 = conses_high.second(var482);
            SubLObject var484 = (SubLObject)NIL;
            if (NIL != module0269.f17710(var483)) {
                var484 = (SubLObject)makeBoolean(NIL != module0731.f44713(var483, var184, (SubLObject)UNPROVIDED) || NIL != module0731.f44713(var184, var483, (SubLObject)UNPROVIDED));
            }
            else if (NIL != module0269.f17716(var483)) {
                var484 = f45650(var483, var184);
            }
            if (NIL != var484) {
                var480 = (SubLObject)ConsesLow.cons(var482, var480);
            }
            var481 = var481.rest();
            var482 = var481.first();
        }
        return var480;
    }
    
    public static SubLObject f45611() {
        final SubLObject var183 = $g5854$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45651(final SubLObject var119, final SubLObject var184) {
        return module0034.f1829($g5854$.getGlobalValue(), (SubLObject)ConsesLow.list(var119, var184), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45652(final SubLObject var119, final SubLObject var184) {
        return (SubLObject)makeBoolean(var119.eql($ic127$) || NIL != conses_high.member(var184, f45653(var119), (SubLObject)$ic338$, (SubLObject)UNPROVIDED) || NIL != conses_high.member(var119, f45654(var184), (SubLObject)$ic339$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45650(final SubLObject var119, final SubLObject var184) {
        SubLObject var185 = $g5854$.getGlobalValue();
        if (NIL == var185) {
            var185 = module0034.f1934((SubLObject)$ic337$, (SubLObject)$ic340$, (SubLObject)$ic341$, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var186 = module0034.f1782(var119, var184);
        final SubLObject var187 = module0034.f1814(var185, var186, (SubLObject)UNPROVIDED);
        if (var187 != $ic11$) {
            SubLObject var188 = var187;
            SubLObject var189 = (SubLObject)NIL;
            var189 = var188.first();
            while (NIL != var188) {
                SubLObject var190 = var189.first();
                final SubLObject var191 = conses_high.second(var189);
                if (var119.eql(var190.first())) {
                    var190 = var190.rest();
                    if (NIL != var190 && NIL == var190.rest() && var184.eql(var190.first())) {
                        return module0034.f1959(var191);
                    }
                }
                var188 = var188.rest();
                var189 = var188.first();
            }
        }
        final SubLObject var192 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45652(var119, var184)));
        module0034.f1836(var185, var186, var187, var192, (SubLObject)ConsesLow.list(var119, var184));
        return module0034.f1959(var192);
    }
    
    public static SubLObject f45607() {
        final SubLObject var183 = $g5855$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45655(final SubLObject var184) {
        return module0034.f1829($g5855$.getGlobalValue(), (SubLObject)ConsesLow.list(var184), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45656(final SubLObject var184) {
        return conses_high.intersection(f45657(var184), module0732.f44934(var184), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45654(final SubLObject var184) {
        SubLObject var185 = $g5855$.getGlobalValue();
        if (NIL == var185) {
            var185 = module0034.f1934((SubLObject)$ic342$, (SubLObject)$ic343$, (SubLObject)$ic328$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic344$);
        }
        SubLObject var186 = module0034.f1814(var185, var184, (SubLObject)$ic11$);
        if (var186 == $ic11$) {
            var186 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45656(var184)));
            module0034.f1816(var185, var184, var186, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var186);
    }
    
    public static SubLObject f45575(final SubLObject var110, SubLObject var88, SubLObject var466, SubLObject var479) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        if (var466 == UNPROVIDED) {
            var466 = (SubLObject)NIL;
        }
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        final SubLThread var480 = SubLProcess.currentSubLThread();
        if (NIL == f45627(var88, var110)) {
            return f45625(var466, (SubLObject)NIL);
        }
        final SubLObject var481 = module0178.f11333(var110);
        final SubLObject var482 = f45625(var466, (SubLObject)T);
        SubLObject var483 = (SubLObject)NIL;
        SubLObject var484 = (SubLObject)NIL;
        final SubLObject var485 = $g5846$.getGlobalValue();
        SubLObject var486 = (SubLObject)NIL;
        try {
            var486 = Locks.seize_lock(var485);
            if (var481.eql($ic8$)) {
                var480.resetMultipleValues();
                final SubLObject var534_535 = f45658(var110, var88, var466);
                final SubLObject var536_537 = var480.secondMultipleValue();
                var480.resetMultipleValues();
                var483 = var534_535;
                var484 = var536_537;
            }
            else if (NIL != conses_high.member(var481, f45529(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var480.resetMultipleValues();
                final SubLObject var538_539 = f45659(var110, var88, var466, var479);
                final SubLObject var540_541 = var480.secondMultipleValue();
                var480.resetMultipleValues();
                var483 = var538_539;
                var484 = var540_541;
            }
            else if (NIL != conses_high.member(var481, f45531(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var480.resetMultipleValues();
                final SubLObject var542_543 = f45659(var110, var88, var466, var479);
                final SubLObject var544_545 = var480.secondMultipleValue();
                var480.resetMultipleValues();
                var483 = var542_543;
                var484 = var544_545;
            }
            else if (NIL != f45519(var481)) {
                var480.resetMultipleValues();
                final SubLObject var546_547 = f45660(var110, var88, var466);
                final SubLObject var548_549 = var480.secondMultipleValue();
                var480.resetMultipleValues();
                var483 = var546_547;
                var484 = var548_549;
            }
            else if (NIL != conses_high.member(var481, f45534(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var480.resetMultipleValues();
                final SubLObject var550_551 = f45661(var110, var88, var466, var479);
                final SubLObject var552_553 = var480.secondMultipleValue();
                var480.resetMultipleValues();
                var483 = var550_551;
                var484 = var552_553;
            }
        }
        finally {
            if (NIL != var486) {
                Locks.release_lock(var485);
            }
        }
        return Values.values(f45625(var466, Equality.eql(var483, var482)), var484);
    }
    
    public static SubLObject f45659(final SubLObject var110, final SubLObject var88, final SubLObject var466, final SubLObject var479) {
        final SubLThread var480 = SubLProcess.currentSubLThread();
        final SubLObject var481 = module0178.f11285(var110);
        final SubLObject var482 = f45625(var466, (SubLObject)T);
        SubLObject var483 = (SubLObject)NIL;
        SubLObject var484 = (SubLObject)NIL;
        SubLObject var485 = (SubLObject)NIL;
        SubLObject var486 = (SubLObject)NIL;
        if (NIL != $g5851$.getDynamicValue(var480)) {
            try {
                var480.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var487 = Errors.$error_handler$.currentBinding(var480);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic318$, var480);
                    try {
                        var480.resetMultipleValues();
                        final SubLObject var488 = f45662(var481);
                        final SubLObject var489 = var480.secondMultipleValue();
                        final SubLObject var490 = var480.thirdMultipleValue();
                        final SubLObject var491 = var480.fourthMultipleValue();
                        var480.resetMultipleValues();
                        if (NIL != var479) {
                            var485 = f45663(var489, var110, var479);
                        }
                        else {
                            var485 = f45664(var489, var110, var491);
                        }
                        SubLObject var492 = var485;
                        SubLObject var493 = (SubLObject)NIL;
                        var493 = var492.first();
                        while (NIL != var492) {
                            final SubLObject var494 = f45507(var493);
                            final SubLObject var495 = f45513(var488, var494, var490);
                            SubLObject var23_557;
                            final SubLObject var496 = var23_557 = f45340(var495);
                            SubLObject var497 = (SubLObject)NIL;
                            var497 = var23_557.first();
                            while (NIL != var23_557) {
                                final SubLObject var498 = f45635(var88, var497, var493, var466);
                                if (var482.eql(var498)) {
                                    final SubLObject var499 = var495;
                                    if (NIL == conses_high.member(var499, var486, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var486 = (SubLObject)ConsesLow.cons(var499, var486);
                                    }
                                    var483 = (SubLObject)T;
                                }
                                var23_557 = var23_557.rest();
                                var497 = var23_557.first();
                            }
                            var492 = var492.rest();
                            var493 = var492.first();
                        }
                    }
                    catch (Throwable var500) {
                        Errors.handleThrowable(var500, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var487, var480);
                }
            }
            catch (Throwable var501) {
                var484 = Errors.handleThrowable(var501, module0003.$g3$.getGlobalValue());
            }
            finally {
                var480.throwStack.pop();
            }
        }
        else {
            var480.resetMultipleValues();
            final SubLObject var502 = f45662(var481);
            final SubLObject var503 = var480.secondMultipleValue();
            final SubLObject var504 = var480.thirdMultipleValue();
            final SubLObject var505 = var480.fourthMultipleValue();
            var480.resetMultipleValues();
            if (NIL != var479) {
                var485 = f45663(var503, var110, var479);
            }
            else {
                var485 = f45664(var503, var110, var505);
            }
            SubLObject var506 = var485;
            SubLObject var507 = (SubLObject)NIL;
            var507 = var506.first();
            while (NIL != var506) {
                final SubLObject var508 = f45507(var507);
                final SubLObject var509 = f45513(var502, var508, var504);
                SubLObject var23_558;
                final SubLObject var510 = var23_558 = f45340(var509);
                SubLObject var511 = (SubLObject)NIL;
                var511 = var23_558.first();
                while (NIL != var23_558) {
                    final SubLObject var512 = f45635(var88, var511, var507, var466);
                    if (var482.eql(var512)) {
                        final SubLObject var513 = var509;
                        if (NIL == conses_high.member(var513, var486, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var486 = (SubLObject)ConsesLow.cons(var513, var486);
                        }
                        var483 = (SubLObject)T;
                    }
                    var23_558 = var23_558.rest();
                    var511 = var23_558.first();
                }
                var506 = var506.rest();
                var507 = var506.first();
            }
        }
        if (var484.isString()) {
            var483 = (SubLObject)NIL;
            f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic345$, var110, var484, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var483) {
            if (NIL != var466) {
                f45572(var110);
            }
            else {
                f45570(var110);
            }
        }
        return Values.values(f45625(var466, var483), var486);
    }
    
    public static SubLObject f45658(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        final SubLThread var467 = SubLProcess.currentSubLThread();
        final SubLObject var468 = module0178.f11285(var110);
        final SubLObject var469 = module0209.f13552(module0205.f13205(var468, (SubLObject)UNPROVIDED));
        final SubLObject var470 = f45625(var466, (SubLObject)T);
        SubLObject var471 = (SubLObject)T;
        SubLObject var472 = (SubLObject)NIL;
        if (NIL != $g5851$.getDynamicValue(var467)) {
            try {
                var467.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var473 = Errors.$error_handler$.currentBinding(var467);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic318$, var467);
                    try {
                        SubLObject var474 = f45340(var469);
                        SubLObject var475 = (SubLObject)NIL;
                        var475 = var474.first();
                        while (NIL != var474) {
                            final SubLObject var476 = f45665(var88, var475, var110, var466);
                            if (!var470.eql(var476)) {
                                var471 = (SubLObject)NIL;
                            }
                            var474 = var474.rest();
                            var475 = var474.first();
                        }
                    }
                    catch (Throwable var477) {
                        Errors.handleThrowable(var477, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var473, var467);
                }
            }
            catch (Throwable var478) {
                var472 = Errors.handleThrowable(var478, module0003.$g3$.getGlobalValue());
            }
            finally {
                var467.throwStack.pop();
            }
        }
        else {
            SubLObject var479 = f45340(var469);
            SubLObject var480 = (SubLObject)NIL;
            var480 = var479.first();
            while (NIL != var479) {
                final SubLObject var481 = f45665(var88, var480, var110, var466);
                if (!var470.eql(var481)) {
                    var471 = (SubLObject)NIL;
                }
                var479 = var479.rest();
                var480 = var479.first();
            }
        }
        if (var472.isString()) {
            var471 = (SubLObject)NIL;
            f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic345$, var110, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var471) {
            if (NIL != var466) {
                f45572(var110);
            }
            else {
                f45570(var110);
            }
        }
        return Values.values(f45625(var466, var471), (SubLObject)ConsesLow.list(var469));
    }
    
    public static SubLObject f45665(final SubLObject var88, final SubLObject var32, final SubLObject var15, final SubLObject var466) {
        if (NIL != var466) {
            return f45666(var88, var32, var15);
        }
        return f45667(var88, var32, var15);
    }
    
    public static SubLObject f45667(final SubLObject var88, final SubLObject var32, final SubLObject var559) {
        f45385(var88, var32, var559);
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f45666(final SubLObject var88, final SubLObject var32, final SubLObject var15) {
        f45389(var32, var15, var88);
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f45662(final SubLObject var554) {
        final SubLThread var555 = SubLProcess.currentSubLThread();
        var555.resetMultipleValues();
        final SubLObject var556 = module0732.f45023(var554, (SubLObject)UNPROVIDED);
        final SubLObject var557 = var555.secondMultipleValue();
        final SubLObject var558 = var555.thirdMultipleValue();
        SubLObject var559 = var555.fourthMultipleValue();
        var555.resetMultipleValues();
        if (NIL == module0731.f44656(var559, (SubLObject)UNPROVIDED) && NIL != module0004.f104(module0205.f13132(var554), f45531(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var559 = f45615(module0205.f13132(var554), (SubLObject)UNPROVIDED);
        }
        return Values.values(module0208.f13535(var556), var557, module0208.f13535(var558), var559);
    }
    
    public static SubLObject f45493(final SubLObject var230) {
        if (NIL != assertion_handles_oc.f11035(var230)) {
            final SubLObject var231 = module0289.f19396(var230);
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)THREE_INTEGER), f45662(var231));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45663(final SubLObject var475, final SubLObject var560, final SubLObject var479) {
        SubLObject var561 = (SubLObject)NIL;
        final SubLObject var562 = module0178.f11333(var560);
        final SubLObject var563 = module0732.f44998(var562);
        final SubLObject var564 = var563.isInteger() ? module0178.f11331(var560, var563) : f45615(var562, (SubLObject)UNPROVIDED);
        if (NIL != module0731.f44656(var564, (SubLObject)UNPROVIDED)) {
            SubLObject var565 = var479;
            SubLObject var566 = (SubLObject)NIL;
            var566 = var565.first();
            while (NIL != var565) {
                SubLObject var568;
                final SubLObject var567 = var568 = var566;
                SubLObject var569 = (SubLObject)NIL;
                SubLObject var570 = (SubLObject)NIL;
                SubLObject var571 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var568, var567, (SubLObject)$ic346$);
                var569 = var568.first();
                var568 = var568.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var568, var567, (SubLObject)$ic346$);
                var570 = var568.first();
                var568 = var568.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var568, var567, (SubLObject)$ic346$);
                var571 = var568.first();
                var568 = var568.rest();
                if (NIL == var568) {
                    final SubLObject var572 = (NIL != module0269.f17716(var570)) ? var570 : $ic127$;
                    SubLObject var23_568 = var569;
                    SubLObject var573 = (SubLObject)NIL;
                    var573 = var23_568.first();
                    while (NIL != var23_568) {
                        final SubLObject var574 = f45668(var572, var475, var564, var573);
                        final SubLObject var575 = f45429(var574, var571, var573);
                        final SubLObject var576 = f45403(module0078.f5369(var575, Symbols.symbol_function((SubLObject)EQUALP)), module0078.f5369(var560, Symbols.symbol_function((SubLObject)EQUALP)));
                        var561 = (SubLObject)ConsesLow.cons(var576, var561);
                        var23_568 = var23_568.rest();
                        var573 = var23_568.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var567, (SubLObject)$ic346$);
                }
                var565 = var565.rest();
                var566 = var565.first();
            }
        }
        return var561;
    }
    
    public static SubLObject f45668(final SubLObject var119, final SubLObject var475, final SubLObject var184, final SubLObject var35) {
        if (var119.eql($ic127$)) {
            return module0202.f12769(var119, var475, var184, var35);
        }
        return module0202.f12768(var119, var475, var35);
    }
    
    public static SubLObject f45664(final SubLObject var475, final SubLObject var560, final SubLObject var184) {
        final SubLObject var561 = f45669(var184);
        if (NIL != var561) {
            return f45670(var561, var475, var560);
        }
        return f45671(var184, var475, var560);
    }
    
    public static SubLObject f45670(final SubLObject var177, final SubLObject var475, final SubLObject var560) {
        SubLObject var561 = (SubLObject)NIL;
        final SubLObject var562 = module0178.f11287(var560);
        SubLObject var564;
        final SubLObject var563 = var564 = f45672(var177, var475, var562);
        SubLObject var565 = (SubLObject)NIL;
        var565 = var564.first();
        while (NIL != var564) {
            final SubLObject var566 = f45403(module0078.f5369(var565, Symbols.symbol_function((SubLObject)EQUALP)), module0078.f5369(var560, Symbols.symbol_function((SubLObject)EQUALP)));
            var561 = (SubLObject)ConsesLow.cons(var566, var561);
            var564 = var564.rest();
            var565 = var564.first();
        }
        if (NIL == var561) {
            f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic347$, var475, var177, var562, (SubLObject)UNPROVIDED);
        }
        return var561;
    }
    
    public static SubLObject f45672(final SubLObject var177, final SubLObject var475, final SubLObject var476) {
        final SubLThread var477 = SubLProcess.currentSubLThread();
        SubLObject var478 = (SubLObject)NIL;
        SubLObject var479 = var177;
        SubLObject var480 = (SubLObject)NIL;
        var480 = var479.first();
        while (NIL != var479) {
            SubLObject var23_570;
            final SubLObject var481 = var23_570 = f45673(var475, (SubLObject)ConsesLow.list(var480), var476, (SubLObject)T);
            SubLObject var482 = (SubLObject)NIL;
            var482 = var23_570.first();
            while (NIL != var23_570) {
                SubLObject var484;
                final SubLObject var483 = var484 = var482;
                SubLObject var485 = (SubLObject)NIL;
                SubLObject var486 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var484, var483, (SubLObject)$ic348$);
                var485 = var484.first();
                var484 = (var486 = var484.rest());
                SubLObject var487 = (SubLObject)NIL;
                if (NIL == var487) {
                    SubLObject var488 = var486;
                    SubLObject var489 = (SubLObject)NIL;
                    var489 = var488.first();
                    while (NIL == var487 && NIL != var488) {
                        if (NIL != f45458(var489) && f45516(var489).equalp(var485)) {
                            var487 = var489;
                        }
                        var488 = var488.rest();
                        var489 = var488.first();
                    }
                }
                if (NIL == var487) {
                    final SubLObject var490 = module0202.f12768(var480, var475, var485);
                    var487 = f45429(var490, var476, var485);
                }
                final SubLObject var491 = var487;
                if (NIL == conses_high.member(var491, var478, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var478 = (SubLObject)ConsesLow.cons(var491, var478);
                }
                var23_570 = var23_570.rest();
                var482 = var23_570.first();
            }
            final SubLObject var492 = module0147.f9540($g5839$.getGlobalValue());
            final SubLObject var493 = module0147.$g2095$.currentBinding(var477);
            final SubLObject var494 = module0147.$g2094$.currentBinding(var477);
            final SubLObject var495 = module0147.$g2096$.currentBinding(var477);
            try {
                module0147.$g2095$.bind(module0147.f9545(var492), var477);
                module0147.$g2094$.bind(module0147.f9546(var492), var477);
                module0147.$g2096$.bind(module0147.f9549(var492), var477);
                final SubLObject var496 = var480;
                if (NIL != module0158.f10010(var475, (SubLObject)ONE_INTEGER, var496)) {
                    final SubLObject var497 = module0158.f10011(var475, (SubLObject)ONE_INTEGER, var496);
                    SubLObject var498 = (SubLObject)NIL;
                    final SubLObject var499 = (SubLObject)NIL;
                    while (NIL == var498) {
                        final SubLObject var500 = module0052.f3695(var497, var499);
                        final SubLObject var501 = (SubLObject)makeBoolean(!var499.eql(var500));
                        if (NIL != var501) {
                            SubLObject var502 = (SubLObject)NIL;
                            try {
                                var502 = module0158.f10316(var500, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                                SubLObject var434_576 = (SubLObject)NIL;
                                final SubLObject var435_577 = (SubLObject)NIL;
                                while (NIL == var434_576) {
                                    final SubLObject var503 = module0052.f3695(var502, var435_577);
                                    final SubLObject var437_578 = (SubLObject)makeBoolean(!var435_577.eql(var503));
                                    if (NIL != var437_578) {
                                        final SubLObject var504 = module0732.f44950(var503);
                                        final SubLObject var505 = module0178.f11287(var503);
                                        SubLObject var506 = f45633(var475, var504, var480, var505);
                                        if (NIL != module0731.f44644(var505, var476) && !var505.eql(var476)) {
                                            final SubLObject var507 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var504), var480);
                                            if (NIL == conses_high.member(var507, var506, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                var506 = (SubLObject)ConsesLow.cons(var507, var506);
                                            }
                                            SubLObject var23_571 = var506;
                                            SubLObject var508 = (SubLObject)NIL;
                                            var508 = var23_571.first();
                                            while (NIL != var23_571) {
                                                SubLObject var510;
                                                final SubLObject var509 = var510 = var508;
                                                SubLObject var511 = (SubLObject)NIL;
                                                SubLObject var512 = (SubLObject)NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(var510, var509, (SubLObject)$ic349$);
                                                var511 = var510.first();
                                                var510 = var510.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(var510, var509, (SubLObject)$ic349$);
                                                var512 = var510.first();
                                                var510 = var510.rest();
                                                if (NIL == var510) {
                                                    SubLObject var23_572 = var511;
                                                    SubLObject var513 = (SubLObject)NIL;
                                                    var513 = var23_572.first();
                                                    while (NIL != var23_572) {
                                                        final SubLObject var514 = module0202.f12768(var512, var475, var513);
                                                        final SubLObject var516;
                                                        final SubLObject var515 = var516 = f45429(var514, var505, var513);
                                                        if (NIL == conses_high.member(var516, var478, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                            var478 = (SubLObject)ConsesLow.cons(var516, var478);
                                                        }
                                                        var23_572 = var23_572.rest();
                                                        var513 = var23_572.first();
                                                    }
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(var509, (SubLObject)$ic349$);
                                                }
                                                var23_571 = var23_571.rest();
                                                var508 = var23_571.first();
                                            }
                                        }
                                    }
                                    var434_576 = (SubLObject)makeBoolean(NIL == var437_578);
                                }
                            }
                            finally {
                                final SubLObject var25_586 = Threads.$is_thread_performing_cleanupP$.currentBinding(var477);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var477);
                                    if (NIL != var502) {
                                        module0158.f10319(var502);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_586, var477);
                                }
                            }
                        }
                        var498 = (SubLObject)makeBoolean(NIL == var501);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var495, var477);
                module0147.$g2094$.rebind(var494, var477);
                module0147.$g2095$.rebind(var493, var477);
            }
            var479 = var479.rest();
            var480 = var479.first();
        }
        return var478;
    }
    
    public static SubLObject f45671(final SubLObject var184, final SubLObject var475, final SubLObject var587) {
        final SubLObject var588 = module0178.f11287(var587);
        SubLObject var589 = (SubLObject)NIL;
        SubLObject var590 = f45674(var475, var184, var588);
        SubLObject var591 = (SubLObject)NIL;
        var591 = var590.first();
        while (NIL != var590) {
            SubLObject var593;
            final SubLObject var592 = var593 = var591;
            SubLObject var594 = (SubLObject)NIL;
            SubLObject var595 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var593, var592, (SubLObject)$ic350$);
            var594 = var593.first();
            var593 = var593.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var593, var592, (SubLObject)$ic350$);
            var595 = var593.first();
            var593 = var593.rest();
            if (NIL == var593) {
                final SubLObject var596 = module0202.f12769($ic127$, var475, var184, var594);
                final SubLObject var597 = f45429(var596, var595, var594);
                final SubLObject var598 = f45403(module0078.f5369(var597, Symbols.symbol_function((SubLObject)EQUALP)), module0078.f5369(var587, Symbols.symbol_function((SubLObject)EQUALP)));
                var589 = (SubLObject)ConsesLow.cons(var598, var589);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var592, (SubLObject)$ic350$);
            }
            var590 = var590.rest();
            var591 = var590.first();
        }
        return var589;
    }
    
    public static SubLObject f45674(final SubLObject var475, final SubLObject var184, final SubLObject var591) {
        final SubLThread var592 = SubLProcess.currentSubLThread();
        SubLObject var593 = (SubLObject)NIL;
        final SubLObject var594 = module0147.$g2094$.currentBinding(var592);
        final SubLObject var595 = module0147.$g2095$.currentBinding(var592);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var592);
            module0147.$g2095$.bind($ic47$, var592);
            SubLObject var596 = module0219.f14509(var475, (SubLObject)ONE_INTEGER, $ic127$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var597 = (SubLObject)NIL;
            var597 = var596.first();
            while (NIL != var596) {
                final SubLObject var598 = module0178.f11287(var597);
                final SubLObject var599 = module0178.f11335(var597);
                final SubLObject var600 = module0178.f11336(var597);
                if (NIL != module0731.f44713(var599, var184, (SubLObject)UNPROVIDED) || NIL != module0731.f44713(var184, var599, (SubLObject)UNPROVIDED)) {
                    SubLObject var23_596 = module0262.f17370((SubLObject)ConsesLow.list(var598, var591), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var601 = (SubLObject)NIL;
                    var601 = var23_596.first();
                    while (NIL != var23_596) {
                        final SubLObject var602 = (SubLObject)ConsesLow.list(var600, var601);
                        if (NIL == conses_high.member(var602, var593, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var593 = (SubLObject)ConsesLow.cons(var602, var593);
                        }
                        var23_596 = var23_596.rest();
                        var601 = var23_596.first();
                    }
                }
                var596 = var596.rest();
                var597 = var596.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var595, var592);
            module0147.$g2094$.rebind(var594, var592);
        }
        return var593;
    }
    
    public static SubLObject f45513(final SubLObject var259, final SubLObject var574, final SubLObject var261) {
        return module0732.f45026(var259, var574, var261);
    }
    
    public static SubLObject f45355(SubLObject var93) {
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        return module0078.f5367(var93, $g5829$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45661(final SubLObject var110, final SubLObject var88, final SubLObject var466, SubLObject var479) {
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        final SubLThread var480 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11284(var110) : var110;
        final SubLObject var481 = module0178.f11333(var110);
        final SubLObject var482 = module0178.f11287(var110);
        final SubLObject var483 = module0732.f45009(var481);
        final SubLObject var484 = module0732.f44998(var481);
        final SubLObject var485 = module0732.f44992(var481);
        final SubLObject var486 = (SubLObject)((NIL != var483) ? module0178.f11331(var110, var483) : NIL);
        SubLObject var487 = (SubLObject)NIL;
        SubLObject var488 = (SubLObject)NIL;
        SubLObject var489 = (SubLObject)NIL;
        final SubLObject var490 = (SubLObject)((NIL != var484) ? module0178.f11331(var110, var484) : NIL);
        final SubLObject var491 = (SubLObject)((NIL != var485) ? module0178.f11331(var110, var485) : NIL);
        SubLObject var492 = (SubLObject)NIL;
        var480.resetMultipleValues();
        final SubLObject var603_604 = module0732.f45020(module0178.f11285(var110));
        final SubLObject var605_606 = var480.secondMultipleValue();
        var480.resetMultipleValues();
        var487 = var603_604;
        var488 = var605_606;
        if (NIL != var486 && NIL != module0731.f44656(var490, (SubLObject)UNPROVIDED) && NIL != var491) {
            final SubLObject var493 = module0731.f44899(var487, var486, var488, var490, (SubLObject)$ic352$, var491, var482, var482);
            final SubLObject var494 = f45355(var493);
            final SubLObject var495 = f45436(var494, var482);
            if (NIL != var493) {
                if (NIL != var479) {
                    var480.resetMultipleValues();
                    final SubLObject var609_610 = f45675(var495, var487, var486, var488, var490, var88, var466, var479);
                    final SubLObject var611_612 = var480.secondMultipleValue();
                    var480.resetMultipleValues();
                    var492 = var609_610;
                    var489 = var611_612;
                }
                else {
                    var480.resetMultipleValues();
                    final SubLObject var613_614 = f45676(var495, var487, var486, var488, var490, var88, var466, var482);
                    final SubLObject var615_616 = var480.secondMultipleValue();
                    var480.resetMultipleValues();
                    var492 = var613_614;
                    var489 = var615_616;
                }
            }
        }
        return Values.values(f45625(var466, var492), var489);
    }
    
    public static SubLObject f45675(final SubLObject var90, final SubLObject var259, final SubLObject var600, final SubLObject var261, final SubLObject var184, final SubLObject var88, final SubLObject var466, final SubLObject var479) {
        SubLObject var601 = (SubLObject)NIL;
        SubLObject var602 = (SubLObject)NIL;
        SubLObject var603 = var479;
        SubLObject var604 = (SubLObject)NIL;
        var604 = var603.first();
        while (NIL != var603) {
            SubLObject var606;
            final SubLObject var605 = var606 = var604;
            SubLObject var607 = (SubLObject)NIL;
            SubLObject var608 = (SubLObject)NIL;
            SubLObject var609 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var606, var605, (SubLObject)$ic353$);
            var607 = var606.first();
            var606 = var606.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var606, var605, (SubLObject)$ic353$);
            var608 = var606.first();
            var606 = var606.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var606, var605, (SubLObject)$ic353$);
            var609 = var606.first();
            var606 = var606.rest();
            if (NIL == var606) {
                final SubLObject var610 = (NIL != module0269.f17716(var608)) ? var608 : $ic127$;
                if ((NIL != module0731.f44690(var610, (SubLObject)UNPROVIDED) && var184.eql(module0731.f44691(var610))) || var608.eql(var184)) {
                    SubLObject var23_621 = var607;
                    SubLObject var611 = (SubLObject)NIL;
                    var611 = var23_621.first();
                    while (NIL != var23_621) {
                        final SubLObject var612 = f45513(var259, var611, var261);
                        final SubLObject var613 = module0202.f12768(var610, var600, var611);
                        final SubLObject var614 = f45429(var613, var609, var611);
                        final SubLObject var615 = f45403(module0078.f5369(var614, Symbols.symbol_function((SubLObject)EQUALP)), module0078.f5369(var90, Symbols.symbol_function((SubLObject)EQUALP)));
                        var601 = (SubLObject)T;
                        var602 = (SubLObject)ConsesLow.cons(var612, var602);
                        SubLObject var23_622 = f45340(var612);
                        SubLObject var616 = (SubLObject)NIL;
                        var616 = var23_622.first();
                        while (NIL != var23_622) {
                            f45635(var88, var616, var615, var466);
                            var23_622 = var23_622.rest();
                            var616 = var23_622.first();
                        }
                        var23_621 = var23_621.rest();
                        var611 = var23_621.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var605, (SubLObject)$ic353$);
            }
            var603 = var603.rest();
            var604 = var603.first();
        }
        return Values.values(var601, var602);
    }
    
    public static SubLObject f45676(final SubLObject var90, final SubLObject var259, final SubLObject var600, final SubLObject var261, final SubLObject var184, final SubLObject var88, final SubLObject var466, final SubLObject var36) {
        final SubLObject var601 = module0732.f44932(var184).first();
        final SubLObject var602 = module0728.f44446(var601, (SubLObject)UNPROVIDED);
        SubLObject var603 = (SubLObject)NIL;
        SubLObject var604 = (SubLObject)NIL;
        SubLObject var605 = module0730.f44564(var600, var601, (SubLObject)UNPROVIDED);
        SubLObject var606 = (SubLObject)NIL;
        var606 = var605.first();
        while (NIL != var605) {
            final SubLObject var607 = f45513(var259, var606, var261);
            final SubLObject var608 = module0202.f12768(var601, var600, var606);
            final SubLObject var609 = f45429(var608, var36, var606);
            final SubLObject var610 = f45403(module0078.f5369(var609, $g5834$.getGlobalValue()), module0078.f5369(var90, $g5833$.getGlobalValue()));
            var603 = (SubLObject)T;
            var604 = (SubLObject)ConsesLow.cons(var607, var604);
            SubLObject var23_627 = f45340(var607);
            SubLObject var611 = (SubLObject)NIL;
            var611 = var23_627.first();
            while (NIL != var23_627) {
                f45635(var88, var611, var610, var466);
                var23_627 = var23_627.rest();
                var611 = var23_627.first();
            }
            SubLObject var23_628 = var602;
            SubLObject var612 = (SubLObject)NIL;
            var612 = var23_628.first();
            while (NIL != var23_628) {
                final SubLObject var613 = module0728.f44456(var612, var601, var606, (SubLObject)UNPROVIDED);
                final SubLObject var614 = module0202.f12768(var612, var600, var613);
                final SubLObject var615 = f45429(var614, var36, var613);
                final SubLObject var616 = f45403(module0078.f5369(var615, Symbols.symbol_function((SubLObject)EQUALP)), module0078.f5369(var90, Symbols.symbol_function((SubLObject)EQUALP)));
                final SubLObject var617 = f45513(var259, var613, var261);
                var603 = (SubLObject)T;
                var604 = (SubLObject)ConsesLow.cons(var617, var604);
                SubLObject var23_629 = f45340(var617);
                SubLObject var618 = (SubLObject)NIL;
                var618 = var23_629.first();
                while (NIL != var23_629) {
                    f45635(var88, var618, var616, var466);
                    var23_629 = var23_629.rest();
                    var618 = var23_629.first();
                }
                var23_628 = var23_628.rest();
                var612 = var23_628.first();
            }
            var605 = var605.rest();
            var606 = var605.first();
        }
        return Values.values(var603, var604);
    }
    
    public static SubLObject f45629(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        assert NIL != module0178.f11284(var110) : var110;
        SubLObject var468;
        final SubLObject var467 = var468 = module0205.f13180(module0178.f11285(var110), (SubLObject)UNPROVIDED);
        SubLObject var469 = (SubLObject)NIL;
        SubLObject var470 = (SubLObject)NIL;
        SubLObject var471 = (SubLObject)NIL;
        SubLObject var472 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic354$);
        var469 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic354$);
        var470 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic354$);
        var471 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic354$);
        var472 = var468.first();
        var468 = var468.rest();
        if (NIL == var468) {
            final SubLObject var473 = module0209.f13552(var472);
            final SubLObject var474 = f45494(var471);
            final SubLObject var475 = f45485(var471);
            final SubLObject var476 = module0178.f11287(var110);
            final SubLObject var477 = f45454((SubLObject)UNPROVIDED);
            final SubLObject var478 = f45677(var470, var474, var476);
            SubLObject var479 = (SubLObject)T;
            final SubLObject var480 = f45625(var466, (SubLObject)T);
            SubLObject var481 = var475;
            SubLObject var482 = (SubLObject)NIL;
            var482 = var481.first();
            while (NIL != var481) {
                final SubLObject var483 = (SubLObject)ConsesLow.list(var469, var470, var482, var472);
                final SubLObject var484 = f45429(var483, var476, var472);
                module0077.f5326(var484, var477);
                f45636(var470, var88, var476, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var472), var482, var476)));
                var481 = var481.rest();
                var482 = var481.first();
            }
            final SubLObject var485 = f45403(var477, var478);
            SubLObject var486 = f45340(var473);
            SubLObject var487 = (SubLObject)NIL;
            var487 = var486.first();
            while (NIL != var486) {
                final SubLObject var488 = f45635(var88, var487, var485, var466);
                if (!var488.eql(var480)) {
                    var479 = (SubLObject)NIL;
                }
                var486 = var486.rest();
                var487 = var486.first();
            }
            return f45625(var466, var479);
        }
        cdestructuring_bind.cdestructuring_bind_error(var467, (SubLObject)$ic354$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45677(final SubLObject var475, final SubLObject var637, final SubLObject var36) {
        final SubLThread var638 = SubLProcess.currentSubLThread();
        final SubLObject var639 = f45355((SubLObject)UNPROVIDED);
        final SubLObject var640 = module0147.f9540(var36);
        final SubLObject var641 = module0147.$g2095$.currentBinding(var638);
        final SubLObject var642 = module0147.$g2094$.currentBinding(var638);
        final SubLObject var643 = module0147.$g2096$.currentBinding(var638);
        final SubLObject var644 = module0148.$g2099$.currentBinding(var638);
        final SubLObject var645 = module0148.$g2097$.currentBinding(var638);
        try {
            module0147.$g2095$.bind(module0147.f9545(var640), var638);
            module0147.$g2094$.bind(module0147.f9546(var640), var638);
            module0147.$g2096$.bind(module0147.f9549(var640), var638);
            module0148.$g2099$.bind((SubLObject)$ic355$, var638);
            module0148.$g2097$.bind($ic92$, var638);
            final SubLObject var646 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var475, (SubLObject)ONE_INTEGER, var646)) {
                final SubLObject var647 = module0158.f10011(var475, (SubLObject)ONE_INTEGER, var646);
                SubLObject var648 = (SubLObject)NIL;
                final SubLObject var649 = (SubLObject)NIL;
                while (NIL == var648) {
                    final SubLObject var650 = module0052.f3695(var647, var649);
                    final SubLObject var651 = (SubLObject)makeBoolean(!var649.eql(var650));
                    if (NIL != var651) {
                        SubLObject var652 = (SubLObject)NIL;
                        try {
                            var652 = module0158.f10316(var650, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                            SubLObject var434_638 = (SubLObject)NIL;
                            final SubLObject var435_639 = (SubLObject)NIL;
                            while (NIL == var434_638) {
                                final SubLObject var653 = module0052.f3695(var652, var435_639);
                                final SubLObject var437_641 = (SubLObject)makeBoolean(!var435_639.eql(var653));
                                if (NIL != var437_641) {
                                    final SubLObject var654 = module0178.f11335(var653);
                                    if (var654.equal(var637)) {
                                        module0077.f5326(var653, var639);
                                    }
                                }
                                var434_638 = (SubLObject)makeBoolean(NIL == var437_641);
                            }
                        }
                        finally {
                            final SubLObject var25_642 = Threads.$is_thread_performing_cleanupP$.currentBinding(var638);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var638);
                                if (NIL != var652) {
                                    module0158.f10319(var652);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_642, var638);
                            }
                        }
                    }
                    var648 = (SubLObject)makeBoolean(NIL == var651);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var645, var638);
            module0148.$g2099$.rebind(var644, var638);
            module0147.$g2096$.rebind(var643, var638);
            module0147.$g2094$.rebind(var642, var638);
            module0147.$g2095$.rebind(var641, var638);
        }
        return var639;
    }
    
    public static SubLObject f45631(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        assert NIL != module0178.f11284(var110) : var110;
        SubLObject var468;
        final SubLObject var467 = var468 = module0205.f13180(module0178.f11285(var110), (SubLObject)UNPROVIDED);
        SubLObject var469 = (SubLObject)NIL;
        SubLObject var470 = (SubLObject)NIL;
        SubLObject var471 = (SubLObject)NIL;
        SubLObject var472 = (SubLObject)NIL;
        SubLObject var473 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic356$);
        var469 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic356$);
        var470 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic356$);
        var471 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic356$);
        var472 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic356$);
        var473 = var468.first();
        var468 = var468.rest();
        if (NIL == var468) {
            final SubLObject var474 = module0208.f13535(var471);
            final SubLObject var475 = f45494(var472);
            final SubLObject var476 = f45485(var472);
            final SubLObject var477 = module0178.f11287(var110);
            final SubLObject var478 = f45454((SubLObject)UNPROVIDED);
            final SubLObject var479 = f45678(var474, var470, var475, var477);
            SubLObject var480 = (SubLObject)T;
            final SubLObject var481 = f45625(var466, (SubLObject)T);
            SubLObject var482 = var476;
            SubLObject var483 = (SubLObject)NIL;
            var483 = var482.first();
            while (NIL != var482) {
                final SubLObject var484 = (SubLObject)ConsesLow.list(var469, var470, var474, var483, var473);
                final SubLObject var485 = f45429(var484, var477, var473);
                module0077.f5326(var485, var478);
                var482 = var482.rest();
                var483 = var482.first();
            }
            final SubLObject var486 = f45403(var478, var479);
            SubLObject var487 = f45340(var473);
            SubLObject var488 = (SubLObject)NIL;
            var488 = var487.first();
            while (NIL != var487) {
                final SubLObject var489 = f45635(var88, var488, var486, var466);
                if (!var489.eql(var481)) {
                    var480 = (SubLObject)NIL;
                }
                var487 = var487.rest();
                var488 = var487.first();
            }
            return f45625(var466, var480);
        }
        cdestructuring_bind.cdestructuring_bind_error(var467, (SubLObject)$ic356$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45678(final SubLObject var647, final SubLObject var69, final SubLObject var637, final SubLObject var36) {
        final SubLThread var648 = SubLProcess.currentSubLThread();
        final SubLObject var649 = f45355((SubLObject)UNPROVIDED);
        final SubLObject var650 = module0147.f9540(var36);
        final SubLObject var651 = module0147.$g2095$.currentBinding(var648);
        final SubLObject var652 = module0147.$g2094$.currentBinding(var648);
        final SubLObject var653 = module0147.$g2096$.currentBinding(var648);
        final SubLObject var654 = module0148.$g2099$.currentBinding(var648);
        final SubLObject var655 = module0148.$g2097$.currentBinding(var648);
        try {
            module0147.$g2095$.bind(module0147.f9545(var650), var648);
            module0147.$g2094$.bind(module0147.f9546(var650), var648);
            module0147.$g2096$.bind(module0147.f9549(var650), var648);
            module0148.$g2099$.bind((SubLObject)$ic355$, var648);
            module0148.$g2097$.bind($ic357$, var648);
            final SubLObject var656 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var69, (SubLObject)ONE_INTEGER, var656)) {
                final SubLObject var657 = module0158.f10011(var69, (SubLObject)ONE_INTEGER, var656);
                SubLObject var658 = (SubLObject)NIL;
                final SubLObject var659 = (SubLObject)NIL;
                while (NIL == var658) {
                    final SubLObject var660 = module0052.f3695(var657, var659);
                    final SubLObject var661 = (SubLObject)makeBoolean(!var659.eql(var660));
                    if (NIL != var661) {
                        SubLObject var662 = (SubLObject)NIL;
                        try {
                            var662 = module0158.f10316(var660, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                            SubLObject var434_648 = (SubLObject)NIL;
                            final SubLObject var435_649 = (SubLObject)NIL;
                            while (NIL == var434_648) {
                                final SubLObject var663 = module0052.f3695(var662, var435_649);
                                final SubLObject var437_651 = (SubLObject)makeBoolean(!var435_649.eql(var663));
                                if (NIL != var437_651) {
                                    final SubLObject var664 = module0178.f11335(var663);
                                    final SubLObject var665 = module0178.f11336(var663);
                                    if (var664.equal(var647) && var665.equal(var637)) {
                                        module0077.f5326(var663, var649);
                                    }
                                }
                                var434_648 = (SubLObject)makeBoolean(NIL == var437_651);
                            }
                        }
                        finally {
                            final SubLObject var25_652 = Threads.$is_thread_performing_cleanupP$.currentBinding(var648);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var648);
                                if (NIL != var662) {
                                    module0158.f10319(var662);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_652, var648);
                            }
                        }
                    }
                    var658 = (SubLObject)makeBoolean(NIL == var661);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var655, var648);
            module0148.$g2099$.rebind(var654, var648);
            module0147.$g2096$.rebind(var653, var648);
            module0147.$g2094$.rebind(var652, var648);
            module0147.$g2095$.rebind(var651, var648);
        }
        return var649;
    }
    
    public static SubLObject f45630(final SubLObject var110, final SubLObject var88, final SubLObject var466) {
        assert NIL != module0178.f11284(var110) : var110;
        SubLObject var468;
        final SubLObject var467 = var468 = module0205.f13180(module0178.f11285(var110), (SubLObject)UNPROVIDED);
        SubLObject var469 = (SubLObject)NIL;
        SubLObject var470 = (SubLObject)NIL;
        SubLObject var471 = (SubLObject)NIL;
        SubLObject var472 = (SubLObject)NIL;
        SubLObject var473 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic358$);
        var469 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic358$);
        var470 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic358$);
        var471 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic358$);
        var472 = var468.first();
        var468 = var468.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)$ic358$);
        var473 = var468.first();
        var468 = var468.rest();
        if (NIL == var468) {
            final SubLObject var474 = module0208.f13535(var470);
            final SubLObject var475 = module0209.f13552(var473);
            final SubLObject var476 = f45494(var472);
            final SubLObject var477 = f45485(var472);
            final SubLObject var478 = module0178.f11287(var110);
            final SubLObject var479 = f45454((SubLObject)UNPROVIDED);
            final SubLObject var480 = f45679(var474, var471, var476, var478);
            SubLObject var481 = (SubLObject)T;
            final SubLObject var482 = f45625(var466, (SubLObject)T);
            SubLObject var483 = var477;
            SubLObject var484 = (SubLObject)NIL;
            var484 = var483.first();
            while (NIL != var483) {
                final SubLObject var485 = (SubLObject)ConsesLow.list(var469, var474, var471, var484, var475);
                final SubLObject var486 = f45429(var485, var478, var475);
                module0077.f5326(var486, var479);
                var483 = var483.rest();
                var484 = var483.first();
            }
            final SubLObject var487 = f45403(var479, var480);
            SubLObject var488 = f45340(var475);
            SubLObject var489 = (SubLObject)NIL;
            var489 = var488.first();
            while (NIL != var488) {
                final SubLObject var490 = f45635(var88, var489, var487, var466);
                if (!var490.eql(var482)) {
                    var481 = (SubLObject)NIL;
                }
                var488 = var488.rest();
                var489 = var488.first();
            }
            return f45625(var466, var481);
        }
        cdestructuring_bind.cdestructuring_bind_error(var467, (SubLObject)$ic358$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45679(final SubLObject var647, final SubLObject var69, final SubLObject var637, final SubLObject var36) {
        final SubLThread var648 = SubLProcess.currentSubLThread();
        final SubLObject var649 = f45355((SubLObject)UNPROVIDED);
        final SubLObject var650 = module0147.f9540(var36);
        final SubLObject var651 = module0147.$g2095$.currentBinding(var648);
        final SubLObject var652 = module0147.$g2094$.currentBinding(var648);
        final SubLObject var653 = module0147.$g2096$.currentBinding(var648);
        final SubLObject var654 = module0148.$g2099$.currentBinding(var648);
        final SubLObject var655 = module0148.$g2097$.currentBinding(var648);
        try {
            module0147.$g2095$.bind(module0147.f9545(var650), var648);
            module0147.$g2094$.bind(module0147.f9546(var650), var648);
            module0147.$g2096$.bind(module0147.f9549(var650), var648);
            module0148.$g2099$.bind((SubLObject)$ic355$, var648);
            module0148.$g2097$.bind($ic359$, var648);
            final SubLObject var656 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var69, (SubLObject)TWO_INTEGER, var656)) {
                final SubLObject var657 = module0158.f10011(var69, (SubLObject)TWO_INTEGER, var656);
                SubLObject var658 = (SubLObject)NIL;
                final SubLObject var659 = (SubLObject)NIL;
                while (NIL == var658) {
                    final SubLObject var660 = module0052.f3695(var657, var659);
                    final SubLObject var661 = (SubLObject)makeBoolean(!var659.eql(var660));
                    if (NIL != var661) {
                        SubLObject var662 = (SubLObject)NIL;
                        try {
                            var662 = module0158.f10316(var660, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                            SubLObject var434_655 = (SubLObject)NIL;
                            final SubLObject var435_656 = (SubLObject)NIL;
                            while (NIL == var434_655) {
                                final SubLObject var663 = module0052.f3695(var662, var435_656);
                                final SubLObject var437_658 = (SubLObject)makeBoolean(!var435_656.eql(var663));
                                if (NIL != var437_658) {
                                    final SubLObject var664 = module0178.f11334(var663);
                                    final SubLObject var665 = module0178.f11336(var663);
                                    if (var664.equal(var647) && var665.equal(var637)) {
                                        module0077.f5326(var663, var649);
                                    }
                                }
                                var434_655 = (SubLObject)makeBoolean(NIL == var437_658);
                            }
                        }
                        finally {
                            final SubLObject var25_659 = Threads.$is_thread_performing_cleanupP$.currentBinding(var648);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var648);
                                if (NIL != var662) {
                                    module0158.f10319(var662);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var25_659, var648);
                            }
                        }
                    }
                    var658 = (SubLObject)makeBoolean(NIL == var661);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var655, var648);
            module0148.$g2099$.rebind(var654, var648);
            module0147.$g2096$.rebind(var653, var648);
            module0147.$g2094$.rebind(var652, var648);
            module0147.$g2095$.rebind(var651, var648);
        }
        return var649;
    }
    
    public static SubLObject f45660(final SubLObject var660, final SubLObject var88, final SubLObject var466) {
        final SubLObject var661 = f45337(var660);
        final SubLObject var662 = f45625(var466, (SubLObject)T);
        SubLObject var663 = (SubLObject)NIL;
        if (!var661.isString()) {
            if (NIL != var466) {
                f45572(var660);
            }
            else {
                f45570(var660);
            }
            return f45625(var466, (SubLObject)NIL);
        }
        final SubLObject var664 = f45339(var660, (SubLObject)UNPROVIDED);
        SubLObject var665 = (SubLObject)NIL;
        SubLObject var666 = (SubLObject)ConsesLow.list(var661);
        SubLObject var667 = var664;
        SubLObject var668 = (SubLObject)NIL;
        var668 = var667.first();
        while (NIL != var667) {
            if (NIL != f45342(var660, f45341(var660), var668)) {
                final SubLObject var669 = Sequences.cconcatenate($g5828$.getGlobalValue(), new SubLObject[] { $ic360$, var661 });
                if (NIL == conses_high.member(var669, var666, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var666 = (SubLObject)ConsesLow.cons(var669, var666);
                }
            }
            var665 = f45680(var88, var668, var660, var466);
            if (var662.eql(var665)) {
                var663 = (SubLObject)T;
            }
            var667 = var667.rest();
            var668 = var667.first();
        }
        return Values.values(f45625(var466, var663), var666);
    }
    
    public static SubLObject f45635(final SubLObject var88, final SubLObject var89, final SubLObject var69, final SubLObject var466) {
        final SubLObject var467 = f45625(var466, (SubLObject)T);
        final SubLObject var468 = module0208.f13535(var89);
        final SubLObject var469 = (SubLObject)((NIL != var468) ? ((NIL != var466) ? f45387(var88, var468, var69) : f45383(var88, var468, var69)) : NIL);
        module0738.f45834((SubLObject)ConsesLow.list(var69), var466, (SubLObject)UNPROVIDED);
        return f45625(var466, Equality.eql(var467, var469));
    }
    
    public static SubLObject f45385(final SubLObject var88, SubLObject var32, final SubLObject var15) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        var32 = f45681(var32);
        if (var88.eql(f45538())) {
            nl_trie_completion_oc.f45858(f45336(var15));
        }
        SubLObject var90 = (SubLObject)NIL;
        if (var88.eql(f45538())) {
            final SubLObject var91 = $g5846$.getGlobalValue();
            SubLObject var92 = (SubLObject)NIL;
            try {
                var92 = Locks.seize_lock(var91);
                final SubLObject var93 = module0096.$g1265$.currentBinding(var89);
                try {
                    module0096.$g1265$.bind($g5827$.getGlobalValue(), var89);
                    var90 = module0087.f5971(var88, var32, var15);
                }
                finally {
                    module0096.$g1265$.rebind(var93, var89);
                }
            }
            finally {
                if (NIL != var92) {
                    Locks.release_lock(var91);
                }
            }
        }
        else {
            var90 = module0087.f5971(var88, var32, var15);
        }
        return var90;
    }
    
    public static SubLObject f45681(final SubLObject var32) {
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        var33 = var32;
        var34 = var33.first();
        for (var35 = (SubLObject)ZERO_INTEGER; NIL != var33; var33 = var33.rest(), var34 = var33.first(), var35 = Numbers.add((SubLObject)ONE_INTEGER, var35)) {
            final SubLObject var36 = module0738.f45804(var34);
            if (!var34.eql(var36)) {
                module0035.f2044(var35, var36, var32);
            }
        }
        return var32;
    }
    
    public static SubLObject f45383(final SubLObject var88, final SubLObject var89, final SubLObject var559) {
        final SubLObject var560 = module0208.f13535(var89);
        final SubLObject var561 = f45565(var88, var560, (SubLObject)$ic16$);
        SubLObject var562 = f45564(var561, var88, var560);
        SubLObject var563 = (SubLObject)NIL;
        var563 = var562.first();
        while (NIL != var562) {
            if (NIL != f45321(var563, (SubLObject)UNPROVIDED) && NIL != f45682(var563, var559, (SubLObject)UNPROVIDED)) {
                f45683(var563, var559, (SubLObject)T);
                return (SubLObject)$ic132$;
            }
            var562 = var562.rest();
            var563 = var562.first();
        }
        f45385(var88, var560, var559);
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f45684(final SubLObject var15) {
        return (SubLObject)makeBoolean(NIL != f45321(var15, (SubLObject)UNPROVIDED) && NIL != module0731.f44712(f45358(var15), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45685(final SubLObject var15, final SubLObject var35) {
        return Equality.equal(f45336(var15), var35);
    }
    
    public static SubLObject f45683(final SubLObject var69, final SubLObject var671, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)T;
        }
        SubLObject var672 = module0077.f5333(f45400(var671));
        SubLObject var673;
        SubLObject var674;
        SubLObject var675;
        for (var673 = module0032.f1741(var672), var674 = (SubLObject)NIL, var674 = module0032.f1742(var673, var672); NIL == module0032.f1744(var673, var674); var674 = module0032.f1743(var674)) {
            var675 = module0032.f1745(var673, var674);
            if (NIL != module0032.f1746(var674, var675)) {
                f45469(var69, var675, var157);
            }
        }
        var672 = module0077.f5333(f45379(var671));
        SubLObject var676;
        for (var673 = module0032.f1741(var672), var674 = (SubLObject)NIL, var674 = module0032.f1742(var673, var672); NIL == module0032.f1744(var673, var674); var674 = module0032.f1743(var674)) {
            var676 = module0032.f1745(var673, var674);
            if (NIL != module0032.f1746(var674, var676)) {
                f45474(var69, var676);
            }
        }
        return (SubLObject)$ic361$;
    }
    
    public static SubLObject f45387(final SubLObject var88, final SubLObject var32, final SubLObject var672) {
        final SubLObject var673 = f45565(var88, var32, (SubLObject)$ic16$);
        final SubLObject var674 = f45400(var672);
        final SubLObject var675 = f45379(var672);
        SubLObject var676 = (SubLObject)NIL;
        SubLObject var677 = var673;
        SubLObject var678 = (SubLObject)NIL;
        var678 = var677.first();
        while (NIL != var677) {
            if (NIL != f45321(var678, (SubLObject)UNPROVIDED)) {
                SubLObject var679 = module0077.f5316(var674);
                final SubLObject var680 = module0077.f5333(var674);
                SubLObject var681;
                SubLObject var682;
                SubLObject var683;
                SubLObject var99_674;
                SubLObject var100_675;
                SubLObject var101_676;
                SubLObject var684;
                for (var681 = module0032.f1741(var680), var682 = (SubLObject)NIL, var682 = module0032.f1742(var681, var680); NIL == var679 && NIL == module0032.f1744(var681, var682); var682 = module0032.f1743(var682)) {
                    var683 = module0032.f1745(var681, var682);
                    if (NIL != module0032.f1746(var682, var683) && NIL != f45468(var678, var683, (SubLObject)NIL)) {
                        if (NIL != module0077.f5316(var675)) {
                            var676 = (SubLObject)T;
                            f45407(var678, var683);
                            if (NIL != module0077.f5316(f45400(var678))) {
                                var679 = (SubLObject)T;
                            }
                        }
                        else {
                            var99_674 = module0077.f5333(var675);
                            for (var100_675 = module0032.f1741(var99_674), var101_676 = (SubLObject)NIL, var101_676 = module0032.f1742(var100_675, var99_674); NIL == module0032.f1744(var100_675, var101_676); var101_676 = module0032.f1743(var101_676)) {
                                var684 = module0032.f1745(var100_675, var101_676);
                                if (NIL != module0032.f1746(var101_676, var684) && NIL != f45472(var678, var684)) {
                                    var676 = (SubLObject)T;
                                    f45409(var678, var684);
                                }
                            }
                            if (NIL != f45686(var678, var32)) {
                                var679 = (SubLObject)T;
                            }
                        }
                    }
                }
                if (NIL != var679) {
                    f45389(var32, var678, var88);
                    var676 = (SubLObject)T;
                }
            }
            var677 = var677.rest();
            var678 = var677.first();
        }
        return (SubLObject)((NIL != var676) ? $ic134$ : $ic135$);
    }
    
    public static SubLObject f45389(final SubLObject var32, final SubLObject var15, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = f45538();
        }
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = $g5846$.getGlobalValue();
        SubLObject var91 = (SubLObject)NIL;
        try {
            var91 = Locks.seize_lock(var90);
            final SubLObject var92 = module0096.$g1265$.currentBinding(var89);
            try {
                module0096.$g1265$.bind($g5827$.getGlobalValue(), var89);
                module0087.f5975(var88, var32, var15);
            }
            finally {
                module0096.$g1265$.rebind(var92, var89);
            }
        }
        finally {
            if (NIL != var91) {
                Locks.release_lock(var90);
            }
        }
        if (var88.eql(f45538()) && NIL == f45432(f45336(var15), f45538(), (SubLObject)UNPROVIDED)) {
            nl_trie_completion_oc.f45859(f45336(var15));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45686(final SubLObject var69, final SubLObject var32) {
        return (SubLObject)makeBoolean(NIL != module0077.f5316(f45379(var69)) && NIL == module0004.f104(var32, f45340(f45338(var69)), (SubLObject)EQUALP, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45682(final SubLObject var679, final SubLObject var680, SubLObject var681) {
        if (var681 == UNPROVIDED) {
            var681 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL != f45687(var679, var680) && NIL != f45688(var679, var680) && (NIL == var681 || NIL != f45689(var679, var680)) && NIL != f45690(var679, var680));
    }
    
    public static SubLObject f45690(final SubLObject var679, final SubLObject var680) {
        return Equality.equal(f45336(var679), f45336(var680));
    }
    
    public static SubLObject f45687(final SubLObject var679, final SubLObject var680) {
        return (SubLObject)makeBoolean(NIL != f45691(var679, var680) && NIL != f45692(var679, var680) && (NIL != f45693(var679, var680) || (NIL != f45694(var679, var680) && NIL != f45695(var679, var680))));
    }
    
    public static SubLObject f45688(final SubLObject var679, final SubLObject var680) {
        return (SubLObject)makeBoolean(NIL != f45696(var679, var680) || (NIL != f45697(var679, var680) && NIL != f45698(var679, var680)));
    }
    
    public static SubLObject f45689(final SubLObject var679, final SubLObject var680) {
        if (NIL != module0077.f5316(f45379(var679))) {
            return (SubLObject)T;
        }
        if (NIL != module0077.f5316(f45379(var680))) {
            return (SubLObject)T;
        }
        if (f45390(var679).equal(f45390(var680))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45697(final SubLObject var679, final SubLObject var680) {
        return (SubLObject)makeBoolean(NIL == f45373(var679, (SubLObject)UNPROVIDED) || NIL == f45373(var680, (SubLObject)UNPROVIDED) || f45373(var679, (SubLObject)UNPROVIDED).equal(f45373(var680, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f45698(final SubLObject var679, final SubLObject var680) {
        return (SubLObject)makeBoolean(NIL == f45377(var679) || NIL == f45377(var680) || f45377(var679).equal(f45377(var680)));
    }
    
    public static SubLObject f45693(final SubLObject var679, final SubLObject var680) {
        return (SubLObject)makeBoolean(NIL != module0077.f5316(f45400(var679)) || NIL != module0077.f5316(f45400(var680)) || NIL != module0078.f5359(f45400(var679), f45400(var680)));
    }
    
    public static SubLObject f45696(final SubLObject var679, final SubLObject var680) {
        return (SubLObject)makeBoolean(NIL != module0077.f5316(f45379(var679)) || NIL != module0077.f5316(f45379(var680)) || NIL != module0078.f5359(f45379(var679), f45379(var680)));
    }
    
    public static SubLObject f45692(final SubLObject var679, final SubLObject var680) {
        return Equality.equal(f45358(var679), f45358(var680));
    }
    
    public static SubLObject f45691(final SubLObject var679, final SubLObject var680) {
        return Equality.equal(f45497(var679), f45497(var680));
    }
    
    public static SubLObject f45694(final SubLObject var679, final SubLObject var680) {
        return Equality.equal(f45495(var679, (SubLObject)UNPROVIDED), f45495(var680, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45695(final SubLObject var679, final SubLObject var680) {
        return Equality.equal(f45375(var679), f45375(var680));
    }
    
    public static SubLObject f45680(final SubLObject var88, final SubLObject var32, final SubLObject var30, final SubLObject var466) {
        SubLObject var467 = (SubLObject)T;
        SubLObject var469;
        final SubLObject var468 = var469 = (SubLObject)((NIL != var32) ? ConsesLow.list(var32) : f45340(f45337(var30)));
        SubLObject var32_683 = (SubLObject)NIL;
        var32_683 = var469.first();
        while (NIL != var469) {
            final SubLObject var470 = f45625(var466, (SubLObject)T);
            final SubLObject var471 = (SubLObject)((NIL != var32_683) ? ((NIL != var466) ? f45388(var88, var32_683, var30) : f45384(var88, var32_683, var30)) : NIL);
            module0738.f45834((SubLObject)ConsesLow.list(var30), var466, (SubLObject)UNPROVIDED);
            if (!var470.eql(var471)) {
                var467 = (SubLObject)NIL;
            }
            var469 = var469.rest();
            var32_683 = var469.first();
        }
        return f45625(var466, var467);
    }
    
    public static SubLObject f45384(final SubLObject var88, final SubLObject var89, final SubLObject var559) {
        final SubLObject var560 = module0208.f13535(var89);
        SubLObject var561 = f45565(var88, var560, (SubLObject)UNPROVIDED);
        SubLObject var562 = (SubLObject)NIL;
        var562 = var561.first();
        while (NIL != var561) {
            if (NIL != f45320(var562, (SubLObject)UNPROVIDED)) {
                if (NIL != f45699(var559, var562)) {
                    return (SubLObject)$ic362$;
                }
                if (NIL != f45699(var562, var559)) {
                    f45388(var88, var560, var562);
                }
            }
            var561 = var561.rest();
            var562 = var561.first();
        }
        f45385(var88, var560, var559);
        return (SubLObject)$ic132$;
    }
    
    public static SubLObject f45699(final SubLObject var685, final SubLObject var686) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var686) && NIL != module0178.f11284(var685) && module0178.f11334(var686).equal(module0178.f11334(var685)) && module0178.f11335(var686).equal(module0178.f11335(var685)) && f45341(var685).eql(f45341(var686)) && f45373(var686, (SubLObject)UNPROVIDED).eql(f45373(var685, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f45388(final SubLObject var88, final SubLObject var32, final SubLObject var30) {
        f45389(var32, var30, var88);
        return (SubLObject)$ic134$;
    }
    
    public static SubLObject f45700(final SubLObject var475, final SubLObject var184, final SubLObject var36) {
        if (NIL != module0256.f16605($ic154$, var184, var36, (SubLObject)UNPROVIDED)) {
            SubLObject var476 = (SubLObject)NIL;
            SubLObject var477 = module0219.f14509(var475, (SubLObject)ONE_INTEGER, $ic127$, var36, (SubLObject)UNPROVIDED);
            SubLObject var478 = (SubLObject)NIL;
            var478 = var477.first();
            while (NIL != var477) {
                if (NIL != module0731.f44713(module0178.f11335(var478), var184, (SubLObject)UNPROVIDED)) {
                    final SubLObject var479 = module0178.f11336(var478);
                    if (NIL == conses_high.member(var479, var476, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var476 = (SubLObject)ConsesLow.cons(var479, var476);
                    }
                }
                var477 = var477.rest();
                var478 = var477.first();
            }
            return var476;
        }
        return module0731.f44711(var475, var184, (SubLObject)$ic363$, (SubLObject)NIL, var36);
    }
    
    public static SubLObject f45605() {
        final SubLObject var183 = $g5856$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45701(final SubLObject var184) {
        return module0034.f1829($g5856$.getGlobalValue(), (SubLObject)ConsesLow.list(var184), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45702(final SubLObject var184) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        SubLObject var186 = module0035.remove_if_not((SubLObject)$ic295$, module0220.f14565(var184, $ic365$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var187 = module0147.$g2094$.currentBinding(var185);
        final SubLObject var188 = module0147.$g2095$.currentBinding(var185);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var185);
            module0147.$g2095$.bind($ic47$, var185);
            if (NIL != module0731.f44713($ic366$, var184, (SubLObject)UNPROVIDED)) {
                final SubLObject var189 = $ic163$;
                if (NIL == conses_high.member(var189, var186, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var186 = (SubLObject)ConsesLow.cons(var189, var186);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var188, var185);
            module0147.$g2094$.rebind(var187, var185);
        }
        return var186;
    }
    
    public static SubLObject f45657(final SubLObject var184) {
        SubLObject var185 = $g5856$.getGlobalValue();
        if (NIL == var185) {
            var185 = module0034.f1934((SubLObject)$ic364$, (SubLObject)$ic367$, (SubLObject)$ic336$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic344$);
        }
        SubLObject var186 = module0034.f1814(var185, var184, (SubLObject)$ic11$);
        if (var186 == $ic11$) {
            var186 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45702(var184)));
            module0034.f1816(var185, var184, var186, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var186);
    }
    
    public static SubLObject f45609() {
        final SubLObject var183 = $g5857$.getGlobalValue();
        if (NIL != var183) {
            module0034.f1818(var183);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45703(final SubLObject var119) {
        return module0034.f1829($g5857$.getGlobalValue(), (SubLObject)ConsesLow.list(var119), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45704(final SubLObject var119) {
        return (SubLObject)((NIL != module0731.f44690(var119, (SubLObject)UNPROVIDED)) ? module0220.f14565(var119, $ic365$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f45653(final SubLObject var119) {
        SubLObject var120 = $g5857$.getGlobalValue();
        if (NIL == var120) {
            var120 = module0034.f1934((SubLObject)$ic368$, (SubLObject)$ic369$, (SubLObject)$ic336$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic159$);
        }
        SubLObject var121 = module0034.f1814(var120, var119, (SubLObject)$ic11$);
        if (var121 == $ic11$) {
            var121 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45704(var119)));
            module0034.f1816(var120, var119, var121, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var121);
    }
    
    public static SubLObject f45673(final SubLObject var475, final SubLObject var687, final SubLObject var36, SubLObject var688) {
        if (var688 == UNPROVIDED) {
            var688 = (SubLObject)NIL;
        }
        final SubLThread var689 = SubLProcess.currentSubLThread();
        SubLObject var690 = (SubLObject)NIL;
        if (NIL != var688) {
            final SubLObject var691 = module0147.f9540(module0584.$g4396$.getDynamicValue(var689));
            final SubLObject var692 = module0147.$g2095$.currentBinding(var689);
            final SubLObject var693 = module0147.$g2094$.currentBinding(var689);
            final SubLObject var694 = module0147.$g2096$.currentBinding(var689);
            try {
                module0147.$g2095$.bind(module0147.f9545(var691), var689);
                module0147.$g2094$.bind(module0147.f9546(var691), var689);
                module0147.$g2096$.bind(module0147.f9549(var691), var689);
                var690 = module0730.f44574(var475, var687);
            }
            finally {
                module0147.$g2096$.rebind(var694, var689);
                module0147.$g2094$.rebind(var693, var689);
                module0147.$g2095$.rebind(var692, var689);
            }
        }
        else {
            var690 = module0730.f44561(var475, var687, (SubLObject)NIL, var36);
        }
        return var690;
    }
    
    public static SubLObject f45705(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = (SubLObject)((NIL != f45706(var35)) ? ConsesLow.list(var35) : module0038.f2868(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var38 = (SubLObject)NIL;
        final SubLObject var39 = module0585.$g4449$.currentBinding(var36);
        try {
            module0585.$g4449$.bind((SubLObject)NIL, var36);
            var38 = f45707(var37).first();
        }
        finally {
            module0585.$g4449$.rebind(var39, var36);
        }
        return (SubLObject)((NIL != var38) ? var38 : ConsesLow.list(var35));
    }
    
    public static SubLObject f45340(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = (SubLObject)((NIL != f45706(var35)) ? ConsesLow.list(var35) : module0038.f2868(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var38 = (SubLObject)NIL;
        final SubLObject var39 = module0585.$g4449$.currentBinding(var36);
        try {
            module0585.$g4449$.bind((SubLObject)NIL, var36);
            var38 = f45707(var37);
        }
        finally {
            module0585.$g4449$.rebind(var39, var36);
        }
        return (SubLObject)((NIL != var38) ? var38 : ConsesLow.list((SubLObject)ConsesLow.list(var35)));
    }
    
    public static SubLObject f45706(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL == Sequences.find((SubLObject)Characters.CHAR_space, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == Sequences.find_if((SubLObject)$ic370$, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45708(final SubLObject var531) {
        return f45707(var531);
    }
    
    public static SubLObject f45707(final SubLObject var531) {
        final SubLThread var532 = SubLProcess.currentSubLThread();
        if (NIL != module0585.$g4449$.getDynamicValue(var532)) {
            return Values.values((SubLObject)ConsesLow.list(var531), (SubLObject)ConsesLow.list((SubLObject)NIL));
        }
        return f45709(var531);
    }
    
    public static SubLObject f45709(final SubLObject var531) {
        final SubLThread var532 = SubLProcess.currentSubLThread();
        SubLObject var533 = (SubLObject)NIL;
        SubLObject var534 = (SubLObject)NIL;
        SubLObject var535 = (SubLObject)NIL;
        SubLObject var693_694 = (SubLObject)NIL;
        SubLObject var536 = (SubLObject)NIL;
        SubLObject var696_697 = (SubLObject)NIL;
        var535 = (SubLObject)$ic371$;
        var693_694 = var535.first();
        var536 = (SubLObject)$ic372$;
        var696_697 = var536.first();
        while (NIL != var536 || NIL != var535) {
            SubLObject var537 = (SubLObject)NIL;
            SubLObject var538 = (SubLObject)NIL;
            SubLObject var539 = (SubLObject)NIL;
            SubLObject var540 = (SubLObject)NIL;
            SubLObject var541 = (SubLObject)NIL;
            var539 = var531;
            var540 = var539.first();
            for (var541 = (SubLObject)ZERO_INTEGER; NIL != var539; var539 = var539.rest(), var540 = var539.first(), var541 = Numbers.add((SubLObject)ONE_INTEGER, var541)) {
                if (NIL != module0208.f13537(var540, (SubLObject)UNPROVIDED)) {
                    var537 = (SubLObject)ConsesLow.cons(var540, var537);
                }
                else if (NIL != conses_high.member(var540, var693_694, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    var538 = module0035.f2063(var538, var541, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
                }
                else if (NIL != f45710(var540)) {
                    var537 = (SubLObject)ConsesLow.cons(var540, var537);
                }
                else if (NIL != module0038.f2673(var540, (SubLObject)$ic373$, (SubLObject)UNPROVIDED)) {
                    var537 = (SubLObject)ConsesLow.cons(var540, var537);
                }
                else if (NIL != Sequences.find_if((SubLObject)$ic374$, var540, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var537 = (SubLObject)ConsesLow.cons(var540, var537);
                }
                else {
                    final SubLObject var542 = Sequences.remove((SubLObject)Characters.CHAR_period, var540, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var543 = module0038.f2738(var542, var696_697, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL, (SubLObject)$ic375$);
                    if (NIL == module0035.f1995(var543, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                        var538 = module0035.f2063(var538, var541, Sequences.length(var543), (SubLObject)UNPROVIDED);
                    }
                    SubLObject var544 = var543;
                    SubLObject var545 = (SubLObject)NIL;
                    var545 = var544.first();
                    while (NIL != var544) {
                        var537 = (SubLObject)ConsesLow.cons(var545, var537);
                        var544 = var544.rest();
                        var545 = var544.first();
                    }
                }
            }
            if (NIL != $g5858$.getDynamicValue(var532)) {
                SubLObject var546 = (SubLObject)NIL;
                SubLObject var547 = var537;
                SubLObject var548 = (SubLObject)NIL;
                var548 = var547.first();
                while (NIL != var547) {
                    if (NIL != module0035.f2002(var548, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                        var546 = (SubLObject)ConsesLow.cons(module0038.f2856((SubLObject)ConsesLow.list(module0038.f2636(var548), module0038.f2637(var548))), var546);
                    }
                    else {
                        var546 = (SubLObject)ConsesLow.cons(var548, var546);
                    }
                    var547 = var547.rest();
                    var548 = var547.first();
                }
                var537 = Sequences.nreverse(var546);
            }
            var537 = Sequences.nreverse(var537);
            if (NIL == module0004.f104(var537, var533, (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                var533 = (SubLObject)ConsesLow.cons(var537, var533);
                var534 = (SubLObject)ConsesLow.cons(var538, var534);
            }
            var535 = var535.rest();
            var693_694 = var535.first();
            var536 = var536.rest();
            var696_697 = var536.first();
        }
        return Values.values(var533, var534);
    }
    
    public static SubLObject f45710(final SubLObject var35) {
        SubLObject var36 = module0035.f1993(var35, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        if (NIL == var36) {
            SubLObject var37 = (SubLObject)NIL;
            final SubLObject var38 = f45711(module0038.f2636(var35));
            final SubLObject var39 = Sequences.length(var35);
            if (NIL == var37) {
                SubLObject var709_710;
                SubLObject var40;
                SubLObject var41;
                for (var709_710 = var39, var40 = (SubLObject)NIL, var40 = (SubLObject)ONE_INTEGER; NIL == var37 && !var40.numGE(var709_710); var37 = (SubLObject)makeBoolean(!f45711(var41).eql(var38)), var40 = module0048.f_1X(var40)) {
                    var41 = Strings.sublisp_char(var35, var40);
                }
            }
            var36 = (SubLObject)makeBoolean(NIL == var37);
        }
        return var36;
    }
    
    public static SubLObject f45711(final SubLObject var712) {
        return (SubLObject)makeBoolean(NIL != Characters.charE(var712, (SubLObject)Characters.CHAR_hyphen) || NIL != Characters.charE(var712, (SubLObject)Characters.CHAR_period) || NIL != Characters.charE(var712, (SubLObject)Characters.CHAR_slash) || NIL != Characters.charE(var712, (SubLObject)Characters.CHAR_quote));
    }
    
    public static SubLObject f45543(final SubLObject var88) {
        f45406((SubLObject)ONE_INTEGER, (SubLObject)$ic376$, var88, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)T;
    }
    
    public static SubLObject f45570(final SubLObject var110) {
        return f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic377$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45572(final SubLObject var110) {
        return f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic378$, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45406(final SubLObject var713, final SubLObject var714, SubLObject var136, SubLObject var715, SubLObject var716, SubLObject var717) {
        if (var136 == UNPROVIDED) {
            var136 = (SubLObject)NIL;
        }
        if (var715 == UNPROVIDED) {
            var715 = (SubLObject)NIL;
        }
        if (var716 == UNPROVIDED) {
            var716 = (SubLObject)NIL;
        }
        if (var717 == UNPROVIDED) {
            var717 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45466(final SubLObject var714, SubLObject var136, SubLObject var715, SubLObject var716, SubLObject var717) {
        if (var136 == UNPROVIDED) {
            var136 = (SubLObject)NIL;
        }
        if (var715 == UNPROVIDED) {
            var715 = (SubLObject)NIL;
        }
        if (var716 == UNPROVIDED) {
            var716 = (SubLObject)NIL;
        }
        if (var717 == UNPROVIDED) {
            var717 = (SubLObject)NIL;
        }
        final SubLThread var718 = SubLProcess.currentSubLThread();
        if (NIL != $g5860$.getDynamicValue(var718)) {
            Errors.error(var714, new SubLObject[] { var136, var715, var716, var717 });
        }
        else {
            f45406((SubLObject)ONE_INTEGER, Sequences.cconcatenate((SubLObject)$ic379$, var714), var136, var715, var716, var717);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45669(final SubLObject var184) {
        return conses_high.intersection(f45657(var184), f45527(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45633(final SubLObject var475, final SubLObject var35, final SubLObject var477, final SubLObject var36) {
        final SubLThread var478 = SubLProcess.currentSubLThread();
        SubLObject var479 = (SubLObject)NIL;
        if (NIL != $g5861$.getDynamicValue(var478)) {
            SubLObject var480 = module0728.f44446(var477, var36);
            SubLObject var481 = (SubLObject)NIL;
            var481 = var480.first();
            while (NIL != var480) {
                if (NIL != module0730.f44568(var475, var481, var477, var36)) {
                    final SubLObject var482 = module0728.f44457(var481, var477, var35, var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != var482) {
                        var479 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var482, var481), var479);
                    }
                }
                var480 = var480.rest();
                var481 = var480.first();
            }
        }
        return var479;
    }
    
    public static SubLObject f45391(final SubLObject var719) {
        if (NIL != assertion_handles_oc.f11035(var719)) {
            return f45392(var719);
        }
        f45406((SubLObject)TWO_INTEGER, (SubLObject)$ic380$, var719, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45392(final SubLObject var110) {
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = f45535();
        SubLObject var113 = (SubLObject)NIL;
        var113 = var112.first();
        while (NIL != var112) {
            final SubLObject var114 = f45712(var110, var113);
            var111 = ConsesLow.append(var111, var114);
            var112 = var112.rest();
            var113 = var112.first();
        }
        return var111;
    }
    
    public static SubLObject f45712(final SubLObject var110, final SubLObject var721) {
        final SubLThread var722 = SubLProcess.currentSubLThread();
        SubLObject var723 = (SubLObject)NIL;
        if (NIL != module0211.f13700(var110)) {
            final SubLObject var724 = module0147.f9540($g5839$.getGlobalValue());
            final SubLObject var725 = module0147.$g2095$.currentBinding(var722);
            final SubLObject var726 = module0147.$g2094$.currentBinding(var722);
            final SubLObject var727 = module0147.$g2096$.currentBinding(var722);
            final SubLObject var728 = module0148.$g2099$.currentBinding(var722);
            final SubLObject var729 = module0148.$g2097$.currentBinding(var722);
            try {
                module0147.$g2095$.bind(module0147.f9545(var724), var722);
                module0147.$g2094$.bind(module0147.f9546(var724), var722);
                module0147.$g2096$.bind(module0147.f9549(var724), var722);
                module0148.$g2099$.bind((SubLObject)$ic355$, var722);
                module0148.$g2097$.bind(var721, var722);
                SubLObject var730 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var110, (SubLObject)TWO_INTEGER, var730)) {
                    final SubLObject var731 = module0158.f10011(var110, (SubLObject)TWO_INTEGER, var730);
                    SubLObject var732 = (SubLObject)NIL;
                    final SubLObject var733 = (SubLObject)NIL;
                    while (NIL == var732) {
                        final SubLObject var734 = module0052.f3695(var731, var733);
                        final SubLObject var735 = (SubLObject)makeBoolean(!var733.eql(var734));
                        if (NIL != var735) {
                            SubLObject var736 = (SubLObject)NIL;
                            try {
                                var736 = module0158.f10316(var734, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                                SubLObject var434_723 = (SubLObject)NIL;
                                final SubLObject var435_724 = (SubLObject)NIL;
                                while (NIL == var434_723) {
                                    final SubLObject var737 = module0052.f3695(var736, var435_724);
                                    final SubLObject var437_725 = (SubLObject)makeBoolean(!var435_724.eql(var737));
                                    if (NIL != var437_725) {
                                        final SubLObject var738 = module0178.f11334(var737);
                                        final SubLObject var739 = (SubLObject)(module0205.f13132(var738).eql($ic381$) ? module0205.f13203(var738, (SubLObject)UNPROVIDED) : NIL);
                                        final SubLObject var740 = module0178.f11287(var737);
                                        var723 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var739, var740), var723);
                                    }
                                    var434_723 = (SubLObject)makeBoolean(NIL == var437_725);
                                }
                            }
                            finally {
                                final SubLObject var25_729 = Threads.$is_thread_performing_cleanupP$.currentBinding(var722);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var722);
                                    if (NIL != var736) {
                                        module0158.f10319(var736);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_729, var722);
                                }
                            }
                        }
                        var732 = (SubLObject)makeBoolean(NIL == var735);
                    }
                }
                var730 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var110, (SubLObject)ONE_INTEGER, var730)) {
                    final SubLObject var731 = module0158.f10011(var110, (SubLObject)ONE_INTEGER, var730);
                    SubLObject var732 = (SubLObject)NIL;
                    final SubLObject var733 = (SubLObject)NIL;
                    while (NIL == var732) {
                        final SubLObject var734 = module0052.f3695(var731, var733);
                        final SubLObject var735 = (SubLObject)makeBoolean(!var733.eql(var734));
                        if (NIL != var735) {
                            SubLObject var736 = (SubLObject)NIL;
                            try {
                                var736 = module0158.f10316(var734, (SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)NIL);
                                SubLObject var434_724 = (SubLObject)NIL;
                                final SubLObject var435_725 = (SubLObject)NIL;
                                while (NIL == var434_724) {
                                    final SubLObject var737 = module0052.f3695(var736, var435_725);
                                    final SubLObject var437_726 = (SubLObject)makeBoolean(!var435_725.eql(var737));
                                    if (NIL != var437_726) {
                                        final SubLObject var741 = module0178.f11335(var737);
                                        final SubLObject var742 = module0178.f11287(var737);
                                        var723 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var741, var742), var723);
                                    }
                                    var434_724 = (SubLObject)makeBoolean(NIL == var437_726);
                                }
                            }
                            finally {
                                final SubLObject var25_730 = Threads.$is_thread_performing_cleanupP$.currentBinding(var722);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var722);
                                    if (NIL != var736) {
                                        module0158.f10319(var736);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var25_730, var722);
                                }
                            }
                        }
                        var732 = (SubLObject)makeBoolean(NIL == var735);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var729, var722);
                module0148.$g2099$.rebind(var728, var722);
                module0147.$g2096$.rebind(var727, var722);
                module0147.$g2094$.rebind(var726, var722);
                module0147.$g2095$.rebind(var725, var722);
            }
        }
        return var723;
    }
    
    public static SubLObject f45713(final SubLObject var182) {
        if (NIL != module0731.f44690(var182, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var182);
        }
        if (NIL != module0731.f44656(var182, (SubLObject)UNPROVIDED)) {
            return f45714(Sequences.nreverse(module0732.f44924(var182, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45485(final SubLObject var182) {
        final SubLThread var183 = SubLProcess.currentSubLThread();
        final SubLObject var184 = module0034.$g879$.getDynamicValue(var183);
        SubLObject var185 = (SubLObject)NIL;
        if (NIL == var184) {
            return f45713(var182);
        }
        var185 = module0034.f1857(var184, (SubLObject)$ic382$, (SubLObject)UNPROVIDED);
        if (NIL == var185) {
            var185 = module0034.f1807(module0034.f1842(var184), (SubLObject)$ic382$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var184, (SubLObject)$ic382$, var185);
        }
        SubLObject var186 = module0034.f1814(var185, var182, (SubLObject)$ic11$);
        if (var186 == $ic11$) {
            var186 = Values.arg2(var183.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f45713(var182)));
            module0034.f1816(var185, var182, var186, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var186);
    }
    
    public static SubLObject f45714(final SubLObject var177) {
        if (!var177.isList()) {
            return (SubLObject)NIL;
        }
        SubLObject var178 = (SubLObject)NIL;
        SubLObject var179;
        SubLObject var181;
        SubLObject var180;
        SubLObject var182;
        SubLObject var183;
        for (var179 = (SubLObject)NIL, var179 = var177; NIL != var179; var179 = var179.rest()) {
            var180 = (var181 = var179);
            var182 = (SubLObject)NIL;
            var183 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)$ic383$);
            var182 = var181.first();
            var181 = (var183 = var181.rest());
            if (NIL == module0004.f104(var182, var183, (SubLObject)$ic384$, (SubLObject)UNPROVIDED) && NIL == conses_high.member(var182, var178, (SubLObject)$ic384$, (SubLObject)UNPROVIDED)) {
                var178 = (SubLObject)ConsesLow.cons(var182, var178);
            }
        }
        return var178;
    }
    
    public static SubLObject f45494(final SubLObject var182) {
        if (NIL != module0731.f44690(var182, (SubLObject)UNPROVIDED)) {
            final SubLObject var183 = f45653(var182);
            return (SubLObject)((NIL != var183) ? ((NIL != module0035.f1997(var183)) ? var183.first() : module0256.f16637(var183, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first()) : NIL);
        }
        if (NIL != module0731.f44656(var182, (SubLObject)UNPROVIDED)) {
            return var182;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45715(final SubLObject var740) {
        final SubLThread var741 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var740.eql($ic127$) || (NIL != module0731.f44690(var740, module0584.$g4396$.getDynamicValue(var741)) && NIL != f45716(var740)));
    }
    
    public static SubLObject f45717(final SubLObject var36) {
        return module0731.f44644(var36, $ic37$);
    }
    
    public static SubLObject f45716(final SubLObject var119) {
        return module0035.sublisp_boolean(f45653(var119));
    }
    
    public static SubLObject f45718(final SubLObject var740) {
        return module0259.f16891(var740, $ic312$);
    }
    
    public static SubLObject f45608() {
        if (NIL != module0584.f35780($g5862$.getGlobalValue())) {
            module0584.f35779($g5862$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45719() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL == module0584.f35780($g5862$.getGlobalValue())) {
            $g5862$.setGlobalValue(module0584.f35782());
        }
        final SubLObject var11 = module0081.f5563($g5862$.getGlobalValue());
        SubLObject var12 = (SubLObject)NIL;
        try {
            var12 = ReadWriteLocks.rw_lock_seize_write_lock(var11);
            module0079.f5420($g5862$.getGlobalValue());
            SubLObject var13 = module0079.f5424(module0584.f35793((SubLObject)T));
            SubLObject var16;
            for (SubLObject var14 = (SubLObject)NIL; NIL == var14; var14 = (SubLObject)makeBoolean(NIL == var16)) {
                var10.resetMultipleValues();
                final SubLObject var15 = module0052.f3693(var13);
                var16 = var10.secondMultipleValue();
                var10.resetMultipleValues();
                if (NIL != var16) {
                    SubLObject var18;
                    final SubLObject var17 = var18 = var15;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var20 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic386$);
                    var19 = var18.first();
                    var18 = var18.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic386$);
                    var20 = var18.first();
                    var18 = var18.rest();
                    if (NIL == var18) {
                        module0079.f5412($g5862$.getGlobalValue(), var19, (SubLObject)T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic386$);
                    }
                }
            }
            var13 = module0079.f5424(module0584.f35797((SubLObject)T));
            for (SubLObject var14 = (SubLObject)NIL; NIL == var14; var14 = (SubLObject)makeBoolean(NIL == var16)) {
                var10.resetMultipleValues();
                final SubLObject var15 = module0052.f3693(var13);
                var16 = var10.secondMultipleValue();
                var10.resetMultipleValues();
                if (NIL != var16) {
                    SubLObject var22;
                    final SubLObject var21 = var22 = var15;
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var20 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic386$);
                    var19 = var22.first();
                    var22 = var22.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic386$);
                    var20 = var22.first();
                    var22 = var22.rest();
                    if (NIL == var22) {
                        module0079.f5412($g5862$.getGlobalValue(), var19, (SubLObject)T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic386$);
                    }
                }
            }
        }
        finally {
            if (NIL != var12) {
                ReadWriteLocks.rw_lock_release_write_lock(var11);
            }
        }
        return $g5862$.getGlobalValue();
    }
    
    public static SubLObject f45620() {
        if (NIL == module0584.f35780($g5862$.getGlobalValue())) {
            $g5862$.setGlobalValue(module0584.f35782());
        }
        final SubLObject var741 = module0081.f5563($g5862$.getGlobalValue());
        SubLObject var742 = (SubLObject)NIL;
        try {
            var742 = ReadWriteLocks.rw_lock_seize_write_lock(var741);
            if (NIL != module0584.f35781($g5862$.getGlobalValue())) {
                f45719();
            }
            return module0584.f35784($g5862$.getGlobalValue());
        }
        finally {
            if (NIL != var742) {
                ReadWriteLocks.rw_lock_release_write_lock(var741);
            }
        }
    }
    
    public static SubLObject f45519(final SubLObject var119) {
        if (NIL == module0584.f35780($g5862$.getGlobalValue())) {
            $g5862$.setGlobalValue(module0584.f35782());
        }
        final SubLObject var120 = module0081.f5563($g5862$.getGlobalValue());
        SubLObject var121 = (SubLObject)NIL;
        try {
            var121 = ReadWriteLocks.rw_lock_seize_write_lock(var120);
            if (NIL != module0584.f35781($g5862$.getGlobalValue())) {
                f45719();
            }
            return module0584.f35783(var119, $g5862$.getGlobalValue());
        }
        finally {
            if (NIL != var121) {
                ReadWriteLocks.rw_lock_release_write_lock(var120);
            }
        }
    }
    
    public static SubLObject f45720(final SubLObject var740) {
        return module0259.f16891(var740, $ic303$);
    }
    
    public static SubLObject f45721(final SubLObject var747) {
        return Mapping.mapcar((SubLObject)$ic388$, module0228.f15226(var747));
    }
    
    public static SubLObject f45722(final SubLObject var748) {
        SubLObject var750;
        final SubLObject var749 = var750 = module0764.f48457(var748, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var751 = (SubLObject)NIL;
        var751 = var750.first();
        while (NIL != var750) {
            SubLObject var23_749 = f45340(module0209.f13552(var751));
            SubLObject var752 = (SubLObject)NIL;
            var752 = var23_749.first();
            while (NIL != var23_749) {
                f45384(f45538(), var752, var748);
                var23_749 = var23_749.rest();
                var752 = var23_749.first();
            }
            var750 = var750.rest();
            var751 = var750.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45723(SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = $g5848$.getGlobalValue();
        }
        assert NIL != f45540(var88, (SubLObject)UNPROVIDED) : var88;
        return module0052.f3689(f45724(var88), (SubLObject)$ic390$, (SubLObject)$ic391$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45724(final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = Equality.eq(var88, f45538());
        SubLObject var91 = (SubLObject)NIL;
        if (NIL != var90) {
            final SubLObject var92 = $g5846$.getGlobalValue();
            SubLObject var93 = (SubLObject)NIL;
            try {
                var93 = Locks.seize_lock(var92);
                final SubLObject var94 = module0096.$g1265$.currentBinding(var89);
                try {
                    module0096.$g1265$.bind($g5827$.getGlobalValue(), var89);
                    var91 = module0087.f5962(var88);
                }
                finally {
                    module0096.$g1265$.rebind(var94, var89);
                }
            }
            finally {
                if (NIL != var93) {
                    Locks.release_lock(var92);
                }
            }
        }
        else {
            var91 = module0087.f5962(var88);
        }
        return (SubLObject)ConsesLow.list(var91, var90);
    }
    
    public static SubLObject f45725(final SubLObject var754) {
        final SubLThread var755 = SubLProcess.currentSubLThread();
        SubLObject var756 = (SubLObject)NIL;
        SubLObject var757 = (SubLObject)NIL;
        SubLObject var758 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var754, var754, (SubLObject)$ic392$);
        var757 = var754.first();
        SubLObject var759 = var754.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var759, var754, (SubLObject)$ic392$);
        var758 = var759.first();
        var759 = var759.rest();
        if (NIL == var759) {
            if (NIL != var758) {
                final SubLObject var760 = $g5846$.getGlobalValue();
                SubLObject var761 = (SubLObject)NIL;
                try {
                    var761 = Locks.seize_lock(var760);
                    final SubLObject var762 = module0096.$g1265$.currentBinding(var755);
                    try {
                        module0096.$g1265$.bind($g5827$.getGlobalValue(), var755);
                        var756 = module0052.f3687(var757);
                    }
                    finally {
                        module0096.$g1265$.rebind(var762, var755);
                    }
                }
                finally {
                    if (NIL != var761) {
                        Locks.release_lock(var760);
                    }
                }
            }
            else {
                var756 = module0052.f3687(var757);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var754, (SubLObject)$ic392$);
        }
        return var756;
    }
    
    public static SubLObject f45726(final SubLObject var754) {
        final SubLThread var755 = SubLProcess.currentSubLThread();
        SubLObject var756 = (SubLObject)NIL;
        SubLObject var757 = (SubLObject)NIL;
        SubLObject var758 = (SubLObject)NIL;
        SubLObject var759 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var754, var754, (SubLObject)$ic392$);
        var758 = var754.first();
        SubLObject var760 = var754.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var760, var754, (SubLObject)$ic392$);
        var759 = var760.first();
        var760 = var760.rest();
        if (NIL == var760) {
            if (NIL != var759) {
                final SubLObject var761 = $g5846$.getGlobalValue();
                SubLObject var762 = (SubLObject)NIL;
                try {
                    var762 = Locks.seize_lock(var761);
                    final SubLObject var763 = module0096.$g1265$.currentBinding(var755);
                    try {
                        module0096.$g1265$.bind($g5827$.getGlobalValue(), var755);
                        var755.resetMultipleValues();
                        final SubLObject var765_766 = module0052.f3693(var758);
                        final SubLObject var767_768 = var755.secondMultipleValue();
                        var755.resetMultipleValues();
                        var756 = var765_766;
                        var757 = var767_768;
                    }
                    finally {
                        module0096.$g1265$.rebind(var763, var755);
                    }
                }
                finally {
                    if (NIL != var762) {
                        Locks.release_lock(var761);
                    }
                }
            }
            else {
                var755.resetMultipleValues();
                final SubLObject var769_770 = module0052.f3693(var758);
                final SubLObject var771_772 = var755.secondMultipleValue();
                var755.resetMultipleValues();
                var756 = var769_770;
                var757 = var771_772;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var754, (SubLObject)$ic392$);
        }
        if (NIL == var757) {
            return Values.values((SubLObject)NIL, var754, (SubLObject)T);
        }
        return Values.values(var756, var754, (SubLObject)NIL);
    }
    
    public static SubLObject f45727(final SubLObject var773) {
        final SubLThread var774 = SubLProcess.currentSubLThread();
        final SubLObject var775 = module0087.f5954((SubLObject)UNPROVIDED);
        SubLObject var776 = (SubLObject)NIL;
        SubLObject var777 = (SubLObject)NIL;
        SubLObject var778 = (SubLObject)NIL;
        var776 = var773;
        var777 = var776.first();
        for (var778 = (SubLObject)ZERO_INTEGER; NIL != var776; var776 = var776.rest(), var777 = var776.first(), var778 = Numbers.add((SubLObject)ONE_INTEGER, var778)) {
            module0087.f5971(var775, var777, var778);
        }
        final SubLObject var779 = module0075.f5185((SubLObject)$ic401$, (SubLObject)UNPROVIDED);
        final SubLObject var780 = module0075.f5185((SubLObject)$ic402$, (SubLObject)UNPROVIDED);
        SubLObject var781 = (SubLObject)NIL;
        try {
            var774.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var782 = Errors.$error_handler$.currentBinding(var774);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic318$, var774);
                try {
                    SubLObject var783 = (SubLObject)NIL;
                    try {
                        var783 = module0095.f6845(var780, var779, (SubLObject)$ic403$, (SubLObject)$ic404$, (SubLObject)$ic404$, (SubLObject)UNPROVIDED);
                        final SubLObject var784 = f45586(var783);
                        final SubLObject var785 = f45587(var784);
                        module0087.f5986(var775, var785);
                    }
                    finally {
                        final SubLObject var25_778 = Threads.$is_thread_performing_cleanupP$.currentBinding(var774);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var774);
                            if (NIL != module0095.f6844(var783)) {
                                module0095.f6849(var783);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var25_778, var774);
                        }
                    }
                }
                catch (Throwable var786) {
                    Errors.handleThrowable(var786, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var782, var774);
            }
        }
        catch (Throwable var787) {
            var781 = Errors.handleThrowable(var787, module0003.$g3$.getGlobalValue());
        }
        finally {
            var774.throwStack.pop();
        }
        SubLObject var788 = (SubLObject)NIL;
        try {
            var774.throwStack.push($ic405$);
            final SubLObject var789 = Errors.$error_handler$.currentBinding(var774);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic406$), var774);
                try {
                    Filesys.delete_file(var779);
                }
                catch (Throwable var790) {
                    Errors.handleThrowable(var790, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var789, var774);
            }
        }
        catch (Throwable var791) {
            var788 = Errors.handleThrowable(var791, (SubLObject)$ic405$);
        }
        finally {
            var774.throwStack.pop();
        }
        SubLObject var792 = (SubLObject)NIL;
        try {
            var774.throwStack.push($ic405$);
            final SubLObject var789 = Errors.$error_handler$.currentBinding(var774);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic406$), var774);
                try {
                    Filesys.delete_file(var780);
                }
                catch (Throwable var790) {
                    Errors.handleThrowable(var790, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var789, var774);
            }
        }
        catch (Throwable var791) {
            var792 = Errors.handleThrowable(var791, (SubLObject)$ic405$);
        }
        finally {
            var774.throwStack.pop();
        }
        if (var781.isString()) {
            Errors.error((SubLObject)$ic407$, var781);
        }
        return (SubLObject)$ic408$;
    }
    
    public static SubLObject f45728() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45317", "S#49566");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45318", "S#49567");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45319", "S#49568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45322", "S#49569", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45324", "S#49570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45325", "S#49571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45330", "S#49572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45323", "S#49573", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45329", "S#49574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45331", "S#49575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45332", "S#49576", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45335", "S#49577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45336", "S#49444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45339", "S#49578", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45343", "S#49579");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45342", "S#49580", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45344", "S#49581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45349", "S#49582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45350", "S#49583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45347", "S#49584", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45352", "S#49585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45354", "S#49586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45353", "S#49587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45356", "S#49588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45345", "S#49589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45357", "S#49590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45359", "S#49591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45361", "NL-TRIE-ENTRY-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45363", "S#49592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45366", "S#49593", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45368", "S#49594");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45369", "S#49595");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45370", "S#49596", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45371", "S#49597");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45372", "S#49598");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45373", "S#49599", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45341", "S#49600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45376", "S#49601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45378", "S#49602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45380", "S#49603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45382", "S#49604", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45386", "S#49605", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45390", "S#49606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45394", "S#49607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45395", "S#49608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45396", "S#49609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45321", "S#49440", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45399", "S#49610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45402", "S#49611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45404", "S#49612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45328", "S#49613", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45410", "S#49614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45398", "S#49615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45413", "S#49616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45415", "S#49617", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45414", "S#49618", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45401", "S#49619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45417", "S#49620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45419", "S#49621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45421", "S#49622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45408", "S#49623", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45405", "S#49624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45416", "S#49625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45422", "S#49626", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45424", "S#49627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45420", "S#49628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45418", "S#49629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45425", "S#49630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45423", "S#49631", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45427", "S#49632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45426", "S#49633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45428", "S#49634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45429", "S#49635", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45430", "S#49636", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45434", "S#49637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45431", "S#49638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45435", "S#49639", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45436", "S#49640", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45433", "S#49641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45438", "S#49642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45439", "S#49643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45440", "S#49644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45397", "S#49547", 1, 0, false);
        new $f45397$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45442", "S#49645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45443", "S#49646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45444", "S#49647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45445", "S#49648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45446", "S#49649", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45447", "S#49650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45448", "S#49651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45449", "S#49548", 1, 0, false);
        new $f45449$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45441", "S#49652", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45450", "S#49549", 1, 0, false);
        new $f45450$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45451", "S#49653", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45452", "S#49654", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45412", "S#49655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45453", "S#49656", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45411", "S#49657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45454", "S#49658", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45455", "S#49659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45403", "S#49660", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45456", "S#49661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45457", "S#49662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45458", "S#49663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45459", "S#49664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45461", "S#49665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45462", "S#49666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45463", "S#49667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45464", "S#49668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45400", "S#49669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45465", "S#49670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45381", "S#49671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45379", "S#49672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45467", "S#49673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45393", "S#49674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45468", "S#49675", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45469", "S#49676", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45470", "S#49677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45407", "S#49678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45472", "S#49679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45473", "S#49680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45474", "S#49681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45475", "S#49682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45478", "S#49683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45476", "S#49684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45477", "S#49685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45437", "S#49686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45479", "S#49687", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45480", "S#49688", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45481", "S#49689", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45482", "S#49690", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45409", "S#49691", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45360", "S#49692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45483", "S#49693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45471", "S#49694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45487", "S#49404", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45488", "S#49695", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45489", "S#49696", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45486", "S#49697", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45484", "S#49698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45490", "S#49699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45491", "S#49700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45492", "S#49701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45358", "S#49702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45495", "S#49443", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45497", "S#49703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45498", "S#49704", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45499", "S#49705");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45500", "S#49706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45501", "S#49707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45502", "S#49708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45503", "S#49709", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45504", "S#49710");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45505", "S#49711");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45506", "S#49712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45508", "S#49713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45510", "S#49714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45512", "S#49715", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45338", "S#49716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45507", "S#49717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45516", "S#49718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45514", "S#49719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45509", "S#49720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45515", "S#49721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45511", "S#49722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45517", "S#49441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45518", "S#49723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45374", "S#49724", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45362", "S#49725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45365", "S#49726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45367", "S#49727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45375", "S#49728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45377", "S#49729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45333", "S#49730", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45334", "S#49731", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45320", "S#49732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45326", "S#49733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45327", "S#49734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45346", "S#49735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45348", "S#49736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45364", "S#49737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45337", "S#49738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45520", "S#49739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45523", "S#49740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45524", "S#49741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45525", "S#49742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45526", "S#49743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45521", "S#49744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45522", "S#49745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45527", "S#49746", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45529", "S#48885", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45531", "S#49747", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45533", "S#49748", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45534", "S#49749", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45535", "S#49750", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45537", "S#49751");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45351", "S#49752", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45539", "S#49753", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45540", "S#49754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45541", "S#49755", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45538", "GET-NL-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45542", "S#49756", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45544", "S#49757", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45545", "S#48757", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45546", "S#49758");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45547", "S#49759");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45548", "S#49760", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45549", "S#49761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45550", "S#49762", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45551", "S#49763", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45552", "S#48756", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45555", "S#49764", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45432", "NL-TRIE-SEARCH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45559", "S#49765", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45560", "S#49766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45557", "S#49767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45562", "S#49768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45556", "S#49769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45563", "S#49770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45558", "S#49771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45561", "S#49772", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45566", "S#49398", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45571", "S#49399", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45573", "S#49400", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45576", "S#49402", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45577", "S#49403", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0737", "f45578", "S#49773");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45579", "S#48762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45580", "S#49774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45581", "S#48764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45582", "S#48760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45583", "S#9542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45584", "S#48763", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45585", "S#48759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45587", "S#49775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45589", "S#49776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45591", "S#49777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45593", "S#49778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45595", "S#49779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45600", "S#49780", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45586", "S#49781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45590", "S#49782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45592", "S#49783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45599", "S#49784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45597", "S#49785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45596", "S#49786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45594", "S#49787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45588", "S#49788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45598", "S#49789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45565", "S#49790", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45602", "S#49791", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45564", "S#49792", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45603", "S#49793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45601", "S#49794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45604", "S#49795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45553", "S#48869", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45567", "S#49796", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45528", "S#49797", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45530", "S#49798", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45532", "S#49799", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45614", "S#49559", 1, 0, false);
        new $f45614$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45460", "S#49800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45496", "S#49801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45606", "S#49802", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45616", "S#49803", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45617", "S#49804", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45613", "S#49805", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45536", "S#49806", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45568", "S#49807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45574", "S#49808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45554", "S#49809", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45619", "S#49810", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45622", "S#49811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45623", "S#49812", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45621", "S#49813", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45624", "S#49814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45626", "S#49815", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45618", "S#49816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45625", "S#49817", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45569", "S#49818", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45627", "S#49819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45632", "S#49820", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45637", "S#49821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45639", "S#49822", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45610", "S#49823", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45641", "S#49824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45642", "S#49825", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45640", "S#49826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45638", "S#49827", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45644", "S#49828", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45643", "S#49829", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45634", "S#49830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45628", "S#49831", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45636", "S#49832", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45645", "S#49833", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45647", "S#49834", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45612", "S#49835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45648", "S#49836", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45649", "S#49837", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45615", "S#49838", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45646", "S#49839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45611", "S#49840", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45651", "S#49841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45652", "S#49842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45650", "S#49843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45607", "S#49844", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45655", "S#49845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45656", "S#49846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45654", "S#49847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45575", "S#49848", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45659", "S#49849", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45658", "S#49850", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45665", "S#49851", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45667", "S#49852", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45666", "S#49853", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45662", "S#49854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45493", "S#49855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45663", "S#49856", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45668", "S#49857", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45664", "S#49858", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45670", "S#49859", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45672", "S#49860", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45671", "S#49861", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45674", "S#49862", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45513", "S#49863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45355", "S#49864", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45661", "S#49865", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45675", "S#49866", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45676", "S#49867", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45629", "S#49868", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45677", "S#49869", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45631", "S#49870", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45678", "S#49871", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45630", "S#49872", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45679", "S#49873", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45660", "S#49874", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45635", "S#49875", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45385", "S#49876", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45681", "S#49877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45383", "S#49878", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45684", "S#49879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45685", "S#49880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45683", "S#49881", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45387", "S#49882", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45389", "S#49883", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45686", "S#49884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45682", "S#49885", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45690", "S#49886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45687", "S#49887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45688", "S#49888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45689", "S#49889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45697", "S#49890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45698", "S#49891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45693", "S#49892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45696", "S#49893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45692", "S#49894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45691", "S#49895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45694", "S#49896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45695", "S#49897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45680", "S#49898", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45384", "S#49899", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45699", "S#49900", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45388", "S#49901", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45700", "S#49902", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45605", "S#49903", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45701", "S#49904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45702", "S#49905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45657", "S#49906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45609", "S#49907", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45703", "S#49908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45704", "S#49909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45653", "S#49910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45673", "S#49911", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45705", "S#48594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45340", "S#49912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45706", "S#49913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45708", "S#49914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45707", "S#49915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45709", "S#49916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45710", "S#49917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45711", "S#49564", 1, 0, false);
        new $f45711$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45543", "S#49918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45570", "S#49919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45572", "S#49920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45406", "S#49921", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45466", "S#49922", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45669", "S#49923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45633", "S#49924", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45391", "S#49925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45392", "S#49926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45712", "S#49927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45713", "S#49928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45485", "S#49929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45714", "S#49930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45494", "S#49931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45715", "S#49565", 1, 0, false);
        new $f45715$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45717", "S#49932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45716", "S#49933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45718", "S#49934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45608", "S#49935", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45719", "S#49936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45620", "S#49937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45519", "S#49537", 1, 0, false);
        new $f45519$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45720", "S#49938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45721", "S#49939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45722", "S#49940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45723", "S#49445", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45724", "S#49941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45725", "S#49942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45726", "S#49943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0737", "f45727", "S#49944", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45729() {
        $g5825$ = SubLFiles.deflexical("S#49945", Symbols.symbol_function((SubLObject)EQUALP));
        $g5826$ = SubLFiles.deflexical("S#49946", (SubLObject)$ic3$);
        $g5827$ = SubLFiles.deflexical("S#49947", (NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g5827$.getGlobalValue() : module0090.f6215($g5826$.getGlobalValue(), $g5825$.getGlobalValue()));
        $g5828$ = SubLFiles.defconstant("S#49948", (SubLObject)$ic15$);
        $g5830$ = SubLFiles.deflexical("S#49949", (SubLObject)$ic86$);
        $g5831$ = SubLFiles.defconstant("S#49950", (SubLObject)$ic93$);
        $g5832$ = SubLFiles.defconstant("S#49951", (SubLObject)$ic120$);
        $g5833$ = SubLFiles.deflexical("S#49952", Symbols.symbol_function((SubLObject)EQUALP));
        $g5834$ = SubLFiles.deflexical("S#49953", Symbols.symbol_function((SubLObject)EQUALP));
        $g5835$ = SubLFiles.defparameter("S#49954", (SubLObject)NIL);
        $g5836$ = SubLFiles.defparameter("S#49955", (SubLObject)NIL);
        $g5837$ = SubLFiles.deflexical("S#49956", (SubLObject)NIL);
        $g5838$ = SubLFiles.deflexical("S#49957", (SubLObject)$ic179$);
        $g5839$ = SubLFiles.deflexical("S#49958", (NIL != Symbols.boundp((SubLObject)$ic218$)) ? $g5839$.getGlobalValue() : $ic219$);
        $g5840$ = SubLFiles.deflexical("S#49959", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic220$)) ? $g5840$.getGlobalValue() : $ic221$));
        $g5841$ = SubLFiles.deflexical("S#49960", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic222$)) ? $g5841$.getGlobalValue() : $ic221$));
        $g5842$ = SubLFiles.deflexical("S#49961", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic223$)) ? $g5842$.getGlobalValue() : $ic221$));
        $g5843$ = SubLFiles.deflexical("S#49962", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic224$)) ? $g5843$.getGlobalValue() : $ic221$));
        $g5844$ = SubLFiles.deflexical("S#49963", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic225$)) ? $g5844$.getGlobalValue() : $ic221$));
        $g5845$ = SubLFiles.deflexical("S#49964", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic226$)) ? $g5845$.getGlobalValue() : $ic221$));
        $g5846$ = SubLFiles.deflexical("S#49965", Locks.make_lock((SubLObject)$ic227$));
        $g5847$ = SubLFiles.defparameter("S#49966", (SubLObject)NIL);
        $g5848$ = SubLFiles.deflexical("S#49967", (NIL != Symbols.boundp((SubLObject)$ic233$)) ? $g5848$.getGlobalValue() : f45539((SubLObject)UNPROVIDED));
        $g5849$ = SubLFiles.defparameter("S#49968", (SubLObject)NIL);
        $g5850$ = SubLFiles.deflexical("S#49969", (SubLObject)NIL);
        $g5851$ = SubLFiles.defparameter("S#49970", (SubLObject)T);
        $g5852$ = SubLFiles.deflexical("S#49971", (SubLObject)NIL);
        $g5853$ = SubLFiles.deflexical("S#49972", (SubLObject)NIL);
        $g5854$ = SubLFiles.deflexical("S#49973", (SubLObject)NIL);
        $g5855$ = SubLFiles.deflexical("S#49974", (SubLObject)NIL);
        $g5829$ = SubLFiles.deflexical("S#49975", Symbols.symbol_function((SubLObject)EQUALP));
        $g5856$ = SubLFiles.deflexical("S#49976", (SubLObject)NIL);
        $g5857$ = SubLFiles.deflexical("S#49977", (SubLObject)NIL);
        $g5858$ = SubLFiles.defparameter("S#49978", (SubLObject)NIL);
        $g5859$ = SubLFiles.defparameter("S#49979", (SubLObject)ONE_INTEGER);
        $g5860$ = SubLFiles.defparameter("S#49980", (SubLObject)NIL);
        $g5861$ = SubLFiles.defparameter("S#49981", (SubLObject)T);
        $g5862$ = SubLFiles.deflexical("S#49982", (NIL != Symbols.boundp((SubLObject)$ic385$)) ? $g5862$.getGlobalValue() : module0584.f35782());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45730() {
        module0584.$g4429$.setGlobalValue((SubLObject)$ic0$);
        module0584.f35817((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic4$);
        module0034.f1895((SubLObject)$ic9$);
        module0034.f1895((SubLObject)$ic40$);
        module0034.f1895((SubLObject)$ic45$);
        module0034.f1895((SubLObject)$ic48$);
        module0002.f50((SubLObject)$ic62$, (SubLObject)$ic65$);
        module0034.f1895((SubLObject)$ic78$);
        module0034.f1895((SubLObject)$ic79$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5831$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic101$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic102$);
        Structures.def_csetf((SubLObject)$ic103$, (SubLObject)$ic104$);
        Structures.def_csetf((SubLObject)$ic105$, (SubLObject)$ic106$);
        Equality.identity((SubLObject)$ic93$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5831$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic114$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5831$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic116$));
        module0021.f1098($g5832$.getGlobalValue(), (SubLObject)$ic121$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g5831$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic122$));
        module0034.f1895((SubLObject)$ic136$);
        module0034.f1895((SubLObject)$ic138$);
        module0034.f1909((SubLObject)$ic140$);
        module0034.f1895((SubLObject)$ic162$);
        module0002.f50((SubLObject)$ic178$, (SubLObject)$ic60$);
        module0002.f50((SubLObject)$ic196$, (SubLObject)$ic64$);
        module0002.f50((SubLObject)$ic198$, (SubLObject)$ic64$);
        module0002.f50((SubLObject)$ic199$, (SubLObject)$ic64$);
        module0002.f50((SubLObject)$ic200$, (SubLObject)$ic64$);
        module0034.f1895((SubLObject)$ic214$);
        module0003.f57((SubLObject)$ic218$);
        module0003.f57((SubLObject)$ic220$);
        module0003.f57((SubLObject)$ic222$);
        module0003.f57((SubLObject)$ic223$);
        module0003.f57((SubLObject)$ic224$);
        module0003.f57((SubLObject)$ic225$);
        module0003.f57((SubLObject)$ic226$);
        module0003.f57((SubLObject)$ic233$);
        module0034.f1895((SubLObject)$ic254$);
        module0034.f1895((SubLObject)$ic256$);
        module0034.f1895((SubLObject)$ic257$);
        module0034.f1909((SubLObject)$ic300$);
        module0034.f1909((SubLObject)$ic326$);
        module0034.f1909((SubLObject)$ic334$);
        module0034.f1909((SubLObject)$ic337$);
        module0034.f1909((SubLObject)$ic342$);
        module0034.f1909((SubLObject)$ic364$);
        module0034.f1909((SubLObject)$ic368$);
        module0034.f1895((SubLObject)$ic382$);
        module0003.f57((SubLObject)$ic385$);
        module0027.f1449((SubLObject)$ic393$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic394$, NIL, $ic395$, NIL, $ic396$, NIL, $ic397$, $ic398$, $ic399$, T }), (SubLObject)$ic400$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f45728();
    }
    
    public void initializeVariables() {
        f45729();
    }
    
    public void runTopLevelForms() {
        f45730();
    }
    
    static {
        me = (SubLFile)new module0737();
        $g5825$ = null;
        $g5826$ = null;
        $g5827$ = null;
        $g5828$ = null;
        $g5830$ = null;
        $g5831$ = null;
        $g5832$ = null;
        $g5833$ = null;
        $g5834$ = null;
        $g5835$ = null;
        $g5836$ = null;
        $g5837$ = null;
        $g5838$ = null;
        $g5839$ = null;
        $g5840$ = null;
        $g5841$ = null;
        $g5842$ = null;
        $g5843$ = null;
        $g5844$ = null;
        $g5845$ = null;
        $g5846$ = null;
        $g5847$ = null;
        $g5848$ = null;
        $g5849$ = null;
        $g5850$ = null;
        $g5851$ = null;
        $g5852$ = null;
        $g5853$ = null;
        $g5854$ = null;
        $g5855$ = null;
        $g5829$ = null;
        $g5856$ = null;
        $g5857$ = null;
        $g5858$ = null;
        $g5859$ = null;
        $g5860$ = null;
        $g5861$ = null;
        $g5862$ = null;
        $ic0$ = makeString("$Revision: 138034 $");
        $ic1$ = makeSymbol("*NL-TRIE-CODE-REVISION*");
        $ic2$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeString("1.195"), (SubLObject)makeString("1.196")), ConsesLow.list((SubLObject)makeString("1.196"), (SubLObject)makeString("1.197")), ConsesLow.list((SubLObject)makeString("1.197"), (SubLObject)makeString("1.198")), ConsesLow.list((SubLObject)makeString("1.198"), (SubLObject)makeString("1.199")), ConsesLow.list((SubLObject)makeString("1.199"), (SubLObject)makeString("1.200")), ConsesLow.list((SubLObject)makeString("1.200"), (SubLObject)makeString("1.201")), ConsesLow.list((SubLObject)makeString("1.201"), (SubLObject)makeString("1.202")), ConsesLow.list((SubLObject)makeString("1.202"), (SubLObject)makeString("1.203")), ConsesLow.list((SubLObject)makeString("1.203"), (SubLObject)makeString("1.204")), ConsesLow.list((SubLObject)makeString("1.204"), (SubLObject)makeString("1.205")), ConsesLow.list((SubLObject)makeString("1.205"), (SubLObject)makeString("1.206")), ConsesLow.list((SubLObject)makeString("1.206"), (SubLObject)makeString("1.207")), ConsesLow.list((SubLObject)makeString("1.207"), (SubLObject)makeString("1.208")), ConsesLow.list((SubLObject)makeString("1.219"), (SubLObject)makeString("1.220")), ConsesLow.list((SubLObject)makeString("1.222"), (SubLObject)makeString("1.223")), ConsesLow.list((SubLObject)makeString("1.228"), (SubLObject)makeString("1.229")) });
        $ic3$ = makeInteger(6000);
        $ic4$ = makeSymbol("S#49947", "CYC");
        $ic5$ = makeSymbol("S#8769", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#49947", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)NIL);
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("termPhrases"));
        $ic9$ = makeSymbol("S#49572", "CYC");
        $ic10$ = makeInteger(200);
        $ic11$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic12$ = makeKeyword("NAME");
        $ic13$ = makeKeyword("WORD");
        $ic14$ = makeKeyword("STRING");
        $ic15$ = makeString("the");
        $ic16$ = makeKeyword("OFF");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = makeUninternedSymbol("US#552BA5E");
        $ic19$ = makeUninternedSymbol("US#3165895");
        $ic20$ = makeUninternedSymbol("US#34B4C45");
        $ic21$ = makeSymbol("S#49566", "CYC");
        $ic22$ = makeSymbol("CLET");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6285", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-NL-TRIE")), (SubLObject)makeString("the")));
        $ic24$ = makeSymbol("WITH-LOCK-HELD");
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#49965", "CYC"), (SubLObject)makeKeyword("WHOSTATE"), (SubLObject)makeString("NL Trie Names with Added The"));
        $ic26$ = makeSymbol("S#7603", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("PROGRESS-NOTE"), (SubLObject)makeString("Finding NL trie names with added 'the'..."));
        $ic28$ = makeSymbol("CDOLIST");
        $ic29$ = makeSymbol("PWHEN");
        $ic30$ = makeSymbol("CAND");
        $ic31$ = makeSymbol("S#49732", "CYC");
        $ic32$ = makeSymbol("CNOT");
        $ic33$ = makeSymbol("S#4086", "CYC");
        $ic34$ = makeSymbol("S#49738", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)makeString("the "), (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUALP));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("Noun"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("EnglishLexiconMt"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("properNounStrings"));
        $ic39$ = makeSymbol("SPEC-PREDICATE?");
        $ic40$ = makeSymbol("S#49583", "CYC");
        $ic41$ = makeSymbol("?COLLECTION");
        $ic42$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dontAddTheToNamesOfInstances")), (SubLObject)makeSymbol("?COLLECTION"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("EnglishMt"));
        $ic45$ = makeSymbol("S#49587", "CYC");
        $ic46$ = makeSymbol("S#12274", "CYC");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic48$ = makeSymbol("S#49589", "CYC");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("dontAddTheToNamesWithPred"));
        $ic50$ = makeKeyword("CYC-POS");
        $ic51$ = makeKeyword("PREDICATE");
        $ic52$ = makeKeyword("DENOTS");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#49536", "CYC"), (SubLObject)makeSymbol("S#8600", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = makeSymbol("PCOND");
        $ic55$ = ConsesLow.list((SubLObject)T);
        $ic56$ = makeSymbol("S#49736", "CYC");
        $ic57$ = makeSymbol("S#49569", "CYC");
        $ic58$ = makeSymbol("GAF-ARG1");
        $ic59$ = makeSymbol("S#49440", "CYC");
        $ic60$ = makeSymbol("S#49705", "CYC");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#8600", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic62$ = makeSymbol("S#49596", "CYC");
        $ic63$ = makeSymbol("GAF-ARG3");
        $ic64$ = makeSymbol("S#49711", "CYC");
        $ic65$ = makeSymbol("S#49595", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic67$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic68$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic69$ = makeKeyword("DONE");
        $ic70$ = makeSymbol("S#708", "CYC");
        $ic71$ = makeSymbol("S#49669", "CYC");
        $ic72$ = makeSymbol("S#49672", "CYC");
        $ic73$ = makeKeyword("MT");
        $ic74$ = makeKeyword("PRAGMATICS");
        $ic75$ = makeSymbol("S#49568", "CYC");
        $ic76$ = makeString("Removing bad syntactic support: ~S~% from ~S");
        $ic77$ = makeString("Removing bad semantic support: ~S~% from ~S");
        $ic78$ = makeSymbol("S#49615", "CYC");
        $ic79$ = makeSymbol("S#49618", "CYC");
        $ic80$ = makeInteger(500);
        $ic81$ = makeSymbol("S#13755", "CYC");
        $ic82$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic84$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#49983", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic85$ = makeString("Removing invalid denot: ~S");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#49634", "CYC"));
        $ic87$ = makeSymbol("S#2609", "CYC");
        $ic88$ = makeSymbol("S#12753", "CYC");
        $ic89$ = makeSymbol("S#12263", "CYC");
        $ic90$ = makeSymbol("S#6920", "CYC");
        $ic91$ = makeString("~S~% is not a valid NL trie denot set. Test must be ~S.");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("denotation"));
        $ic93$ = makeSymbol("S#49546", "CYC");
        $ic94$ = makeSymbol("S#49547", "CYC");
        $ic95$ = makeInteger(166);
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("S#49984", "CYC"), (SubLObject)makeSymbol("S#49985", "CYC"));
        $ic97$ = ConsesLow.list((SubLObject)makeKeyword("SYNTACTIC-SUPPORTS"), (SubLObject)makeKeyword("SEMANTIC-SUPPORTS"));
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#49645", "CYC"), (SubLObject)makeSymbol("S#49646", "CYC"));
        $ic99$ = ConsesLow.list((SubLObject)makeSymbol("S#49647", "CYC"), (SubLObject)makeSymbol("S#49648", "CYC"));
        $ic100$ = makeSymbol("S#49652", "CYC");
        $ic101$ = makeSymbol("S#49644", "CYC");
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#49547", "CYC"));
        $ic103$ = makeSymbol("S#49645", "CYC");
        $ic104$ = makeSymbol("S#49647", "CYC");
        $ic105$ = makeSymbol("S#49646", "CYC");
        $ic106$ = makeSymbol("S#49648", "CYC");
        $ic107$ = makeKeyword("SYNTACTIC-SUPPORTS");
        $ic108$ = makeKeyword("SEMANTIC-SUPPORTS");
        $ic109$ = makeString("Invalid slot ~S for construction function");
        $ic110$ = makeKeyword("BEGIN");
        $ic111$ = makeSymbol("S#49649", "CYC");
        $ic112$ = makeKeyword("SLOT");
        $ic113$ = makeKeyword("END");
        $ic114$ = makeSymbol("S#49651", "CYC");
        $ic115$ = makeInteger(509);
        $ic116$ = makeSymbol("S#49548", "CYC");
        $ic117$ = makeString("<NL-TRIE-WORD");
        $ic118$ = makeString("~% ~S");
        $ic119$ = makeString(">");
        $ic120$ = makeInteger(71);
        $ic121$ = makeSymbol("S#49549", "CYC");
        $ic122$ = makeSymbol("S#49654", "CYC");
        $ic123$ = makeSymbol("S#49666", "CYC");
        $ic124$ = makeSymbol("S#49663", "CYC");
        $ic125$ = makeSymbol("S#49657", "CYC");
        $ic126$ = makeSymbol("S#49655", "CYC");
        $ic127$ = constant_handles_oc.f8479((SubLObject)makeString("partOfSpeech"));
        $ic128$ = makeString("Couldn't find valid arbitrary syntactic support in~% ~S~%");
        $ic129$ = makeString("Illicit call to NL-TRIE-WORD-SYNTACTIC-SUPPORTS.");
        $ic130$ = makeString("Illicit call to NL-TRIE-WORD-SEMANTIC-SUPPORTS.");
        $ic131$ = makeString("Couldn't find valid arbitrary semantic support in~% ~S~%");
        $ic132$ = makeKeyword("ADDED");
        $ic133$ = makeKeyword("ALREADY-PRESENT");
        $ic134$ = makeKeyword("REMOVED");
        $ic135$ = makeKeyword("NOT-FOUND");
        $ic136$ = makeSymbol("S#49688", "CYC");
        $ic137$ = makeString("Can't get arg ~S of ~S");
        $ic138$ = makeSymbol("S#49690", "CYC");
        $ic139$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordStrings")));
        $ic140$ = makeSymbol("S#49697", "CYC");
        $ic141$ = makeKeyword("BREADTH");
        $ic142$ = makeKeyword("QUEUE");
        $ic143$ = makeKeyword("STACK");
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic145$ = makeSymbol("S#11450", "CYC");
        $ic146$ = makeKeyword("ERROR");
        $ic147$ = makeString("~A is not a ~A");
        $ic148$ = makeSymbol("S#11592", "CYC");
        $ic149$ = makeKeyword("CERROR");
        $ic150$ = makeString("continue anyway");
        $ic151$ = makeKeyword("WARN");
        $ic152$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic153$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic154$ = constant_handles_oc.f8479((SubLObject)makeString("ClosedClassWord"));
        $ic155$ = makeString("~A is neither SET-P nor LISTP.");
        $ic156$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic157$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic158$ = makeSymbol("S#49956", "CYC");
        $ic159$ = makeInteger(64);
        $ic160$ = makeSymbol("S#49404", "CYC");
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("abbreviationForLexicalWord"));
        $ic162$ = makeSymbol("S#49702", "CYC");
        $ic163$ = constant_handles_oc.f8479((SubLObject)makeString("gerund"));
        $ic164$ = makeSymbol("ASSERTION-P");
        $ic165$ = makeInteger(1000);
        $ic166$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#49536", "CYC"), (SubLObject)makeSymbol("S#8600", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#49986", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic167$ = ConsesLow.list((SubLObject)makeKeyword("PREFERRED-ONLY?"));
        $ic168$ = makeKeyword("PREFERRED-ONLY?");
        $ic169$ = makeUninternedSymbol("US#34A80D6");
        $ic170$ = makeUninternedSymbol("US#53548B4");
        $ic171$ = makeUninternedSymbol("US#7C2A061");
        $ic172$ = makeSymbol("S#49724", "CYC");
        $ic173$ = makeSymbol("FWHEN");
        $ic174$ = makeSymbol("INDEXED-TERM-P");
        $ic175$ = makeSymbol("S#48888", "CYC");
        $ic176$ = makeSymbol("INTEGERP");
        $ic177$ = makeSymbol("FIMPLIES");
        $ic178$ = makeSymbol("S#49706", "CYC");
        $ic179$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("preferredNameString")), constant_handles_oc.f8479((SubLObject)makeString("preferredTermStrings")));
        $ic180$ = constant_handles_oc.f8479((SubLObject)makeString("preferredLexification"));
        $ic181$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#49987", "CYC"), (SubLObject)makeSymbol("S#8600", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic182$ = makeUninternedSymbol("US#34A80D6");
        $ic183$ = makeUninternedSymbol("US#1D710D2");
        $ic184$ = makeUninternedSymbol("US#7C2A061");
        $ic185$ = makeUninternedSymbol("US#33EC86");
        $ic186$ = makeSymbol("S#48893", "CYC");
        $ic187$ = makeSymbol("PIF");
        $ic188$ = makeSymbol("S#49620", "CYC");
        $ic189$ = makeSymbol("CPUSH");
        $ic190$ = makeSymbol("S#49691", "CYC");
        $ic191$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#49988", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic192$ = makeUninternedSymbol("US#7C2A061");
        $ic193$ = makeUninternedSymbol("US#24AE744");
        $ic194$ = makeUninternedSymbol("US#10DBC4C");
        $ic195$ = makeUninternedSymbol("US#D43360");
        $ic196$ = makeSymbol("S#49712", "CYC");
        $ic197$ = makeSymbol("S#49598", "CYC");
        $ic198$ = makeSymbol("S#49713", "CYC");
        $ic199$ = makeSymbol("S#49714", "CYC");
        $ic200$ = makeSymbol("S#49715", "CYC");
        $ic201$ = makeString("#<NL-TRIE-WORD:Word-unit:    ~S~%");
        $ic202$ = makeString("               POS:          ~S~%");
        $ic203$ = makeString("               POS Preds:    ~S~%");
        $ic204$ = makeString("               Lexical Pred: ~S~%");
        $ic205$ = makeString("               Denotations:  ~S~%");
        $ic206$ = makeString("               Pragmatics:   ~S~%");
        $ic207$ = makeString("               Microtheory:  ~S>~%");
        $ic208$ = makeString("#<NL-TRIE-NAME:Namestring Pred: ~S~%");
        $ic209$ = makeString("               Denotations:     ~S~%");
        $ic210$ = makeString("               Pragmatics:      ~S~%");
        $ic211$ = makeString("               Microtheory:     ~S>~%");
        $ic212$ = makeString("Invalid NL trie name: ~S");
        $ic213$ = makeString("Invalid NL trie tp-entry: ~S");
        $ic214$ = makeSymbol("S#49740", "CYC");
        $ic215$ = makeSymbol("S#49744", "CYC");
        $ic216$ = makeSymbol("S#49745", "CYC");
        $ic217$ = makeSymbol("S#3935", "CYC");
        $ic218$ = makeSymbol("S#49958", "CYC");
        $ic219$ = constant_handles_oc.f8479((SubLObject)makeString("AllLexicalMicrotheoryPSC"));
        $ic220$ = makeSymbol("S#49959", "CYC");
        $ic221$ = makeKeyword("UNINITIALIZED");
        $ic222$ = makeSymbol("S#49960", "CYC");
        $ic223$ = makeSymbol("S#49961", "CYC");
        $ic224$ = makeSymbol("S#49962", "CYC");
        $ic225$ = makeSymbol("S#49963", "CYC");
        $ic226$ = makeSymbol("S#49964", "CYC");
        $ic227$ = makeString("NL Trie Lock");
        $ic228$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#49989", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic229$ = makeSymbol("S#49966", "CYC");
        $ic230$ = makeSymbol("CONS");
        $ic231$ = ConsesLow.list((SubLObject)makeSymbol("S#49966", "CYC"));
        $ic232$ = ConsesLow.list((SubLObject)makeSymbol("S#49965", "CYC"), (SubLObject)makeKeyword("WHOSTATE"), (SubLObject)makeString("Initialize NL Trie"));
        $ic233$ = makeSymbol("S#49967", "CYC");
        $ic234$ = makeKeyword("ABORTED");
        $ic235$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#49990", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic236$ = ConsesLow.list((SubLObject)makeSymbol("S#49965", "CYC"), (SubLObject)makeKeyword("WHOSTATE"), (SubLObject)makeString("Do NL Trie"));
        $ic237$ = makeSymbol("S#7604", "CYC");
        $ic238$ = ConsesLow.list((SubLObject)makeSymbol("GET-NL-TRIE"));
        $ic239$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#49990", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6473", "CYC"), (SubLObject)makeString("Mapping NL trie..."))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic240$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("PROGRESS-NOTE"));
        $ic241$ = makeKeyword("PROGRESS-NOTE");
        $ic242$ = makeString("Mapping NL trie...");
        $ic243$ = ConsesLow.list((SubLObject)makeSymbol("S#49965", "CYC"), (SubLObject)makeKeyword("WHOSTATE"), (SubLObject)makeString("Do NL Trie Progress"));
        $ic244$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#794E61F"), (SubLObject)makeUninternedSymbol("US#712B0A2"));
        $ic245$ = makeKeyword("COPIED");
        $ic246$ = makeString("~%Clearing the present contents of ~a ...~%");
        $ic247$ = makeKeyword("CLEARED");
        $ic248$ = makeKeyword("NEVER");
        $ic249$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic250$ = makeKeyword("INITIALIZED");
        $ic251$ = makeKeyword("ON");
        $ic252$ = makeKeyword("PREFERRED");
        $ic253$ = makeString("Didn't recognize NL Trie case-sensitivity setting ~S");
        $ic254$ = makeSymbol("S#49767", "CYC");
        $ic255$ = makeInteger(48);
        $ic256$ = makeSymbol("S#49769", "CYC");
        $ic257$ = makeSymbol("S#49771", "CYC");
        $ic258$ = makeString("NL Trie empty.");
        $ic259$ = makeString("NL Trie incompletely built.");
        $ic260$ = makeString("NL trie built with stale code~%");
        $ic261$ = makeKeyword("NOT-ADDED");
        $ic262$ = makeKeyword("NOT-REMOVED");
        $ic263$ = makeKeyword("RETRIEFIED");
        $ic264$ = makeKeyword("NOT-RETRIEFIED");
        $ic265$ = ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#673", "CYC"), (SubLObject)makeSymbol("TYPE"));
        $ic266$ = makeUninternedSymbol("US#13EA097");
        $ic267$ = makeSymbol("S#2100", "CYC");
        $ic268$ = ConsesLow.list((SubLObject)NIL, (SubLObject)makeKeyword("EOF"));
        $ic269$ = ConsesLow.list((SubLObject)makeKeyword("EOF"));
        $ic270$ = makeSymbol("CSETQ");
        $ic271$ = makeSymbol("WARN");
        $ic272$ = makeString("~&~S is not the right type of object for ~S (expected a ~S).");
        $ic273$ = makeSymbol("QUOTE");
        $ic274$ = makeKeyword("EOF");
        $ic275$ = makeSymbol("S#3046", "CYC");
        $ic276$ = makeSymbol("S#49991", "CYC");
        $ic277$ = makeString("Mismatch between world and HL caches: no ~A and ~A to reconnect NL trie with.");
        $ic278$ = makeString("Reconnecting to legacy unit files w/out NL trie contents in ~A and ~A.");
        $ic279$ = makeSymbol("S#49776", "CYC");
        $ic280$ = makeSymbol("S#49778", "CYC");
        $ic281$ = makeSymbol("S#49780", "CYC");
        $ic282$ = makeSymbol("S#49779", "CYC");
        $ic283$ = makeSymbol("S#49777", "CYC");
        $ic284$ = makeString("The NL trie visitor is not properly setup; initial context ~A is bogus.");
        $ic285$ = makeString("The NL trie visitor did nto complete properly; final context ~A is bogus.");
        $ic286$ = makeKeyword("SWAPPED-OUT");
        $ic287$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#49992", "CYC"), (SubLObject)makeSymbol("S#5858", "CYC"));
        $ic288$ = makeKeyword("FILE-VECTOR");
        $ic289$ = makeKeyword("MAP-STACK");
        $ic290$ = makeString("Invalid case-sensitivity setting ~S for trie ~S, whose test function is ~S");
        $ic291$ = makeString("Validating all NL trie entries");
        $ic292$ = makeKeyword("VALIDATED");
        $ic293$ = makeString("Removing bad NL trie entry for ~S:~% ~S~% from ~S~%");
        $ic294$ = makeString("Remaining entries:~% ~S~%");
        $ic295$ = makeSymbol("S#49565", "CYC");
        $ic296$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("denotationRelatedTo")), constant_handles_oc.f8479((SubLObject)makeString("denotationPlaceholder")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), constant_handles_oc.f8479((SubLObject)makeString("compoundString")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString-Speculative")), constant_handles_oc.f8479((SubLObject)makeString("headMedialString")));
        $ic297$ = constant_handles_oc.f8479((SubLObject)makeString("DenotesArgInRelnPredicate"));
        $ic298$ = constant_handles_oc.f8479((SubLObject)makeString("SemTransPred"));
        $ic299$ = makeSymbol("S#49559", "CYC");
        $ic300$ = makeSymbol("S#49805", "CYC");
        $ic301$ = constant_handles_oc.f8479((SubLObject)makeString("MultiWordForStringPred"));
        $ic302$ = makeSymbol("S#49969", "CYC");
        $ic303$ = constant_handles_oc.f8479((SubLObject)makeString("NLPragmaticPredicate-New"));
        $ic304$ = makeString("~%Initializing NL Trie...~%");
        $ic305$ = makeString("~%Triefying the syntactic predicates ...~%");
        $ic306$ = makeKeyword("SYNTACTIC");
        $ic307$ = makeString("~%Triefying the semantic predicates ...~%");
        $ic308$ = makeKeyword("SEMANTIC");
        $ic309$ = makeSymbol("VALID-CONSTANT?");
        $ic310$ = makeString("~%[~D/~D] Triefying ~S assertions...");
        $ic311$ = constant_handles_oc.f8479((SubLObject)makeString("NLSyntacticPredicate"));
        $ic312$ = constant_handles_oc.f8479((SubLObject)makeString("NLSemanticPredicate"));
        $ic313$ = makeString("Triefying ~S");
        $ic314$ = makeKeyword("GAF");
        $ic315$ = makeKeyword("TRUE");
        $ic316$ = makeString("Triefying ~S assertions...");
        $ic317$ = makeString("Got failure result ~S when triefying~% ~S");
        $ic318$ = makeSymbol("S#38", "CYC");
        $ic319$ = constant_handles_oc.f8479((SubLObject)makeString("abbreviationForMultiWordString"));
        $ic320$ = constant_handles_oc.f8479((SubLObject)makeString("abbreviationForCompoundString"));
        $ic321$ = makeString("Caught error in UPDATE-NL-TRIE-SYNTACTIC for~% ~S:~% ~S");
        $ic322$ = makeString("Trie not present: ~S");
        $ic323$ = makeString("Assertion fails OK-ASSERTION-FOR-NL-TRIE?~% ~S");
        $ic324$ = ConsesLow.list((SubLObject)makeSymbol("S#49993", "CYC"), (SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic325$ = ConsesLow.list((SubLObject)makeSymbol("S#49994", "CYC"), (SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic326$ = makeSymbol("S#49826", "CYC");
        $ic327$ = makeSymbol("S#49971", "CYC");
        $ic328$ = makeInteger(256);
        $ic329$ = makeSymbol("S#49823", "CYC");
        $ic330$ = ConsesLow.list((SubLObject)makeSymbol("S#49995", "CYC"), (SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic331$ = ConsesLow.list((SubLObject)makeSymbol("S#49994", "CYC"), (SubLObject)makeSymbol("S#49996", "CYC"), (SubLObject)makeSymbol("S#49997", "CYC"));
        $ic332$ = ConsesLow.list((SubLObject)makeSymbol("S#49993", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic333$ = ConsesLow.list((SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("S#20618", "CYC"), (SubLObject)makeSymbol("S#49998", "CYC"));
        $ic334$ = makeSymbol("S#49838", "CYC");
        $ic335$ = makeSymbol("S#49972", "CYC");
        $ic336$ = makeInteger(128);
        $ic337$ = makeSymbol("S#49843", "CYC");
        $ic338$ = makeSymbol("S#48751", "CYC");
        $ic339$ = makeSymbol("S#48593", "CYC");
        $ic340$ = makeSymbol("S#49973", "CYC");
        $ic341$ = makeInteger(1024);
        $ic342$ = makeSymbol("S#49847", "CYC");
        $ic343$ = makeSymbol("S#49974", "CYC");
        $ic344$ = makeInteger(32);
        $ic345$ = makeString("Caught error in NL-TRIEFY-SEMANTIC-ASSERTION for~% ~S:~% ~S");
        $ic346$ = ConsesLow.list((SubLObject)makeSymbol("S#49999", "CYC"), (SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic347$ = makeString("Couldn't find any string-nl-trie-word pairs for ~S with ~S from ~S");
        $ic348$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#50000", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic349$ = ConsesLow.list((SubLObject)makeSymbol("S#50001", "CYC"), (SubLObject)makeSymbol("S#50002", "CYC"));
        $ic350$ = ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic351$ = makeSymbol("S#11995", "CYC");
        $ic352$ = makeKeyword("UNDETERMINED");
        $ic353$ = ConsesLow.list((SubLObject)makeSymbol("S#50003", "CYC"), (SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic354$ = ConsesLow.list((SubLObject)makeSymbol("S#50004", "CYC"), (SubLObject)makeSymbol("S#49996", "CYC"), (SubLObject)makeSymbol("S#50005", "CYC"), (SubLObject)makeSymbol("S#50006", "CYC"));
        $ic355$ = makeSymbol("S#12344", "CYC");
        $ic356$ = ConsesLow.list((SubLObject)makeSymbol("S#50004", "CYC"), (SubLObject)makeSymbol("S#49996", "CYC"), (SubLObject)makeSymbol("S#50007", "CYC"), (SubLObject)makeSymbol("S#50005", "CYC"), (SubLObject)makeSymbol("S#50008", "CYC"));
        $ic357$ = constant_handles_oc.f8479((SubLObject)makeString("compoundString"));
        $ic358$ = ConsesLow.list((SubLObject)makeSymbol("S#50004", "CYC"), (SubLObject)makeSymbol("S#50007", "CYC"), (SubLObject)makeSymbol("S#49996", "CYC"), (SubLObject)makeSymbol("S#50005", "CYC"), (SubLObject)makeSymbol("S#50006", "CYC"));
        $ic359$ = constant_handles_oc.f8479((SubLObject)makeString("multiWordString"));
        $ic360$ = makeString(" ");
        $ic361$ = makeKeyword("AUGMENTED");
        $ic362$ = makeKeyword("REDUNDANT");
        $ic363$ = makeKeyword("ALL");
        $ic364$ = makeSymbol("S#49906", "CYC");
        $ic365$ = constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds"));
        $ic366$ = constant_handles_oc.f8479((SubLObject)makeString("Verb"));
        $ic367$ = makeSymbol("S#49976", "CYC");
        $ic368$ = makeSymbol("S#49910", "CYC");
        $ic369$ = makeSymbol("S#49977", "CYC");
        $ic370$ = makeSymbol("S#49564", "CYC");
        $ic371$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("-"), (SubLObject)makeString(""), (SubLObject)makeString(".")), (SubLObject)ConsesLow.list((SubLObject)makeString(""), (SubLObject)makeString(".")));
        $ic372$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("-")), (SubLObject)NIL);
        $ic373$ = makeString("-");
        $ic374$ = makeSymbol("DIGIT-CHAR-P");
        $ic375$ = ConsesLow.list((SubLObject)makeString("'"));
        $ic376$ = makeString("~a is not currently an NL Trie.");
        $ic377$ = makeString("Couldn't find any strings to add to trie:~% ~S");
        $ic378$ = makeString("Couldn't find any strings to remove from trie:~% ~S");
        $ic379$ = makeString("error ");
        $ic380$ = makeString("Unable to determine pragmatic features for ~A");
        $ic381$ = constant_handles_oc.f8479((SubLObject)makeString("pragmaticallyAcceptable"));
        $ic382$ = makeSymbol("S#49929", "CYC");
        $ic383$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#49132", "CYC"), (SubLObject)makeSymbol("S#39540", "CYC"));
        $ic384$ = makeSymbol("SPEC-POS-PRED?");
        $ic385$ = makeSymbol("S#49982", "CYC");
        $ic386$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic387$ = makeSymbol("S#5859", "CYC");
        $ic388$ = makeSymbol("S#49940", "CYC");
        $ic389$ = makeSymbol("S#49754", "CYC");
        $ic390$ = makeSymbol("S#49942", "CYC");
        $ic391$ = makeSymbol("S#49943", "CYC");
        $ic392$ = ConsesLow.list((SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("S#50009", "CYC"));
        $ic393$ = makeSymbol("S#49944", "CYC");
        $ic394$ = makeKeyword("TEST");
        $ic395$ = makeKeyword("OWNER");
        $ic396$ = makeKeyword("CLASSES");
        $ic397$ = makeKeyword("KB");
        $ic398$ = makeKeyword("TINY");
        $ic399$ = makeKeyword("WORKING?");
        $ic400$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("Dartmouth"), (SubLObject)makeString(","), (SubLObject)makeString("Massachusetts")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("Vancouver")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("Anna"), (SubLObject)makeString("nuclear"), (SubLObject)makeString("power"), (SubLObject)makeString("plant")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("East"), (SubLObject)makeString("optic"), (SubLObject)makeString("network"), (SubLObject)makeString("("), (SubLObject)makeString("NOPT"), (SubLObject)makeString(")")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("central"), (SubLObject)makeString("intercollegiate"), (SubLObject)makeString("athletic"), (SubLObject)makeString("conference")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("sea")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("valley"), (SubLObject)makeString("Bancorp"), (SubLObject)makeString("("), (SubLObject)makeString("Nasdaq"), (SubLObject)makeString(":"), (SubLObject)makeString("Novb"), (SubLObject)makeString(")")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("Sea"), (SubLObject)makeString("Brent"), (SubLObject)makeString("crude")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("Rolandsay")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("county"), (SubLObject)makeString("Bancorp"), (SubLObject)makeString("("), (SubLObject)makeString("Nasdaq"), (SubLObject)makeString(":"), (SubLObject)makeString("NCBH"), (SubLObject)makeString(")")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("GOA"), (SubLObject)makeString("district")), ConsesLow.list(new SubLObject[] { makeString("North"), makeString("point"), makeString("communications"), makeString("group"), makeString(","), makeString("inc"), makeString("("), makeString("Nasdaq"), makeString(":"), makeString("NPNT"), makeString(")") }), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("fork"), (SubLObject)makeString("ranger"), (SubLObject)makeString("district")), ConsesLow.list((SubLObject)makeString("North"), (SubLObject)makeString("Carolina"), (SubLObject)makeString("a"), (SubLObject)makeString("&"), (SubLObject)makeString("t"), (SubLObject)makeString("football"), (SubLObject)makeString("team")) })), (SubLObject)makeKeyword("SUCCESS")));
        $ic401$ = makeString("index");
        $ic402$ = makeString("data");
        $ic403$ = makeKeyword("OUTPUT");
        $ic404$ = makeInteger(4000000);
        $ic405$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic406$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic407$ = makeString("~A");
        $ic408$ = makeKeyword("SUCCESS");
    }
    
    public static final class $sX49546_native extends SubLStructNative
    {
        public SubLObject $syntactic_supports;
        public SubLObject $semantic_supports;
        private static final SubLStructDeclNative structDecl;
        
        public $sX49546_native() {
            this.$syntactic_supports = (SubLObject)CommonSymbols.NIL;
            this.$semantic_supports = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX49546_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$syntactic_supports;
        }
        
        public SubLObject getField3() {
            return this.$semantic_supports;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$syntactic_supports = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$semantic_supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX49546_native.class, $ic93$, $ic94$, $ic96$, $ic97$, new String[] { "$syntactic_supports", "$semantic_supports" }, $ic98$, $ic99$, $ic100$);
        }
    }
    
    public static final class $f45397$UnaryFunction extends UnaryFunction
    {
        public $f45397$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49547"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45397(var136);
        }
    }
    
    public static final class $f45449$UnaryFunction extends UnaryFunction
    {
        public $f45449$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49548"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45449(var136);
        }
    }
    
    public static final class $f45450$UnaryFunction extends UnaryFunction
    {
        public $f45450$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49549"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45450(var136);
        }
    }
    
    public static final class $f45614$UnaryFunction extends UnaryFunction
    {
        public $f45614$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49559"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45614(var136);
        }
    }
    
    public static final class $f45711$UnaryFunction extends UnaryFunction
    {
        public $f45711$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49564"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45711(var136);
        }
    }
    
    public static final class $f45715$UnaryFunction extends UnaryFunction
    {
        public $f45715$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49565"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45715(var136);
        }
    }
    
    public static final class $f45519$UnaryFunction extends UnaryFunction
    {
        public $f45519$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49537"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return f45519(var136);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4207 ms
	
	Decompiled with Procyon 0.5.32.
*/