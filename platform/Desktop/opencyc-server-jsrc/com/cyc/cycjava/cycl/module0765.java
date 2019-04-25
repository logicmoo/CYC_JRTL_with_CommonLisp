package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0765 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0765";
    public static final String myFingerPrint = "66ae25890ee4b31d67eb0c7d17bd8c3cd0c3fe70e5f396df1f1a862fe5841f63";
    public static SubLSymbol $g6117$;
    private static SubLSymbol $g6118$;
    private static SubLSymbol $g6119$;
    private static SubLSymbol $g6120$;
    private static SubLSymbol $g6121$;
    private static SubLSymbol $g6122$;
    private static SubLSymbol $g6123$;
    private static SubLSymbol $g6124$;
    private static SubLSymbol $g6125$;
    private static SubLSymbol $g6126$;
    private static SubLSymbol $g6127$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLList $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLList $ic153$;
    private static final SubLList $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLList $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLList $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLString $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLObject $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLObject $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLString $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLObject $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLList $ic186$;
    private static final SubLList $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLList $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
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
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLObject $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLString $ic219$;
    private static final SubLObject $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLString $ic223$;
    private static final SubLList $ic224$;
    private static final SubLList $ic225$;
    private static final SubLObject $ic226$;
    private static final SubLString $ic227$;
    private static final SubLList $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLList $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLObject $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLList $ic247$;
    private static final SubLString $ic248$;
    private static final SubLList $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLObject $ic260$;
    private static final SubLObject $ic261$;
    private static final SubLObject $ic262$;
    private static final SubLObject $ic263$;
    private static final SubLObject $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLObject $ic266$;
    private static final SubLList $ic267$;
    private static final SubLObject $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLList $ic273$;
    private static final SubLObject $ic274$;
    private static final SubLString $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLList $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLList $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLObject $ic285$;
    private static final SubLObject $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLString $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLString $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLObject $ic299$;
    private static final SubLList $ic300$;
    private static final SubLInteger $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLObject $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLInteger $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLString $ic309$;
    private static final SubLObject $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLObject $ic313$;
    private static final SubLString $ic314$;
    private static final SubLObject $ic315$;
    private static final SubLList $ic316$;
    private static final SubLList $ic317$;
    private static final SubLString $ic318$;
    private static final SubLObject $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLList $ic322$;
    private static final SubLList $ic323$;
    private static final SubLObject $ic324$;
    private static final SubLObject $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLObject $ic328$;
    private static final SubLList $ic329$;
    private static final SubLList $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLObject $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLInteger $ic335$;
    private static final SubLString $ic336$;
    private static final SubLObject $ic337$;
    private static final SubLString $ic338$;
    private static final SubLObject $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLObject $ic342$;
    private static final SubLString $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLObject $ic347$;
    private static final SubLString $ic348$;
    private static final SubLString $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLObject $ic353$;
    private static final SubLString $ic354$;
    private static final SubLObject $ic355$;
    private static final SubLString $ic356$;
    private static final SubLString $ic357$;
    private static final SubLObject $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLObject $ic360$;
    private static final SubLObject $ic361$;
    private static final SubLString $ic362$;
    private static final SubLObject $ic363$;
    private static final SubLList $ic364$;
    private static final SubLString $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLString $ic368$;
    private static final SubLString $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLString $ic372$;
    private static final SubLString $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLSymbol $ic375$;
    private static final SubLString $ic376$;
    private static final SubLObject $ic377$;
    private static final SubLString $ic378$;
    private static final SubLString $ic379$;
    private static final SubLString $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLInteger $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLString $ic389$;
    private static final SubLString $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLString $ic393$;
    private static final SubLObject $ic394$;
    private static final SubLString $ic395$;
    private static final SubLObject $ic396$;
    private static final SubLList $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLSymbol $ic400$;
    private static final SubLList $ic401$;
    private static final SubLObject $ic402$;
    private static final SubLObject $ic403$;
    private static final SubLObject $ic404$;
    private static final SubLObject $ic405$;
    private static final SubLObject $ic406$;
    private static final SubLString $ic407$;
    private static final SubLObject $ic408$;
    private static final SubLObject $ic409$;
    private static final SubLObject $ic410$;
    private static final SubLObject $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLSymbol $ic413$;
    private static final SubLObject $ic414$;
    private static final SubLSymbol $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLList $ic419$;
    private static final SubLString $ic420$;
    private static final SubLString $ic421$;
    private static final SubLString $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLString $ic424$;
    private static final SubLString $ic425$;
    private static final SubLSymbol $ic426$;
    private static final SubLObject $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLList $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLString $ic432$;
    private static final SubLSymbol $ic433$;
    private static final SubLObject $ic434$;
    private static final SubLString $ic435$;
    private static final SubLString $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLSymbol $ic438$;
    private static final SubLObject $ic439$;
    private static final SubLObject $ic440$;
    private static final SubLList $ic441$;
    private static final SubLList $ic442$;
    private static final SubLString $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLObject $ic447$;
    private static final SubLList $ic448$;
    private static final SubLObject $ic449$;
    private static final SubLSymbol $ic450$;
    private static final SubLSymbol $ic451$;
    private static final SubLString $ic452$;
    private static final SubLObject $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLSymbol $ic455$;
    private static final SubLObject $ic456$;
    private static final SubLString $ic457$;
    private static final SubLList $ic458$;
    private static final SubLString $ic459$;
    private static final SubLString $ic460$;
    private static final SubLString $ic461$;
    private static final SubLObject $ic462$;
    private static final SubLSymbol $ic463$;
    private static final SubLSymbol $ic464$;
    private static final SubLObject $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLSymbol $ic467$;
    private static final SubLString $ic468$;
    private static final SubLList $ic469$;
    private static final SubLObject $ic470$;
    private static final SubLList $ic471$;
    private static final SubLString $ic472$;
    private static final SubLObject $ic473$;
    
    
    public static SubLObject f48515(final SubLObject var1) {
        return Sequences.cconcatenate(module0006.f203(module0770.f49097(var1, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)), (SubLObject)module0765.$ic0$);
    }
    
    public static SubLObject f48516(final SubLObject var2) {
        return f48517(var2, (SubLObject)module0765.$ic1$);
    }
    
    public static SubLObject f48518(final SubLObject var2) {
        return f48517(var2, (SubLObject)module0765.$ic2$);
    }
    
    public static SubLObject f48517(final SubLObject var2, SubLObject var3) {
        if (var3 == module0765.UNPROVIDED) {
            var3 = (SubLObject)module0765.$ic1$;
        }
        if (module0765.NIL == module0035.f2014(var2)) {
            return print_high.princ_to_string(var2);
        }
        final SubLObject var4 = var2.first();
        final SubLObject var5 = module0770.f49097(var4, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var6 = Sequences.length(var2);
        if (var6.eql((SubLObject)module0765.ONE_INTEGER)) {
            return var5;
        }
        if (var6.eql((SubLObject)module0765.TWO_INTEGER)) {
            return Sequences.cconcatenate(var5, new SubLObject[] { module0765.$ic3$, var3, module0765.$ic3$, module0770.f49097(conses_high.second(var2), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) });
        }
        final SubLObject var7 = conses_high.butlast(var2, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var8 = Mapping.mapcar((SubLObject)module0765.$ic4$, var7);
        final SubLObject var9 = module0770.f49097(module0035.f2114(var2), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        return module0038.f2761(ConsesLow.append(var8, (SubLObject)ConsesLow.list(var3, var9)), (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48519(final SubLObject var10, SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var11 == module0765.UNPROVIDED) {
            var11 = (SubLObject)module0765.NIL;
        }
        if (var12 == module0765.UNPROVIDED) {
            var12 = (SubLObject)module0765.$ic5$;
        }
        if (var13 == module0765.UNPROVIDED) {
            var13 = (SubLObject)module0765.$ic6$;
        }
        final SubLObject var14 = f48520(var10, var11, var12, var13);
        return (SubLObject)((module0765.NIL != module0756.f47600(var14)) ? module0756.f47713(var14, (SubLObject)module0765.UNPROVIDED) : module0765.$ic7$);
    }
    
    public static SubLObject f48520(final SubLObject var10, SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var11 == module0765.UNPROVIDED) {
            var11 = (SubLObject)module0765.NIL;
        }
        if (var12 == module0765.UNPROVIDED) {
            var12 = (SubLObject)module0765.$ic5$;
        }
        if (var13 == module0765.UNPROVIDED) {
            var13 = (SubLObject)module0765.$ic6$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0765.NIL;
        SubLObject var16 = (SubLObject)module0765.NIL;
        if (var10.isCons()) {
            final SubLObject var17 = module0580.$g4361$.currentBinding(var14);
            try {
                module0580.$g4361$.bind((SubLObject)module0765.NIL, var14);
                var14.resetMultipleValues();
                final SubLObject var18_19 = module0580.$g4362$.currentBinding(var14);
                try {
                    module0580.$g4362$.bind(module0580.f35560(), var14);
                    final SubLObject var18 = var14.secondMultipleValue();
                    var14.resetMultipleValues();
                    try {
                        var14.resetMultipleValues();
                        final SubLObject var18_20 = module0580.$g4358$.currentBinding(var14);
                        try {
                            module0580.$g4358$.bind(module0580.f35544(), var14);
                            final SubLObject var19 = var14.secondMultipleValue();
                            var14.resetMultipleValues();
                            final SubLObject var18_21 = module0580.$g4359$.currentBinding(var14);
                            try {
                                module0580.$g4359$.bind(module0580.f35545(), var14);
                                final SubLObject var20 = module0580.$g4358$.getDynamicValue(var14);
                                final SubLObject var18_22 = module0034.$g879$.currentBinding(var14);
                                try {
                                    module0034.$g879$.bind(var20, var14);
                                    SubLObject var21 = (SubLObject)module0765.NIL;
                                    if (module0765.NIL != var20 && module0765.NIL == module0034.f1842(var20)) {
                                        var21 = module0034.f1869(var20);
                                        final SubLObject var22 = Threads.current_process();
                                        if (module0765.NIL == var21) {
                                            module0034.f1873(var20, var22);
                                        }
                                        else if (!var21.eql(var22)) {
                                            Errors.error((SubLObject)module0765.$ic8$);
                                        }
                                    }
                                    try {
                                        SubLObject var28_29 = (SubLObject)module0765.NIL;
                                        SubLObject var23 = (SubLObject)module0765.NIL;
                                        final SubLObject var18_23 = module0579.$g4237$.currentBinding(var14);
                                        try {
                                            module0579.$g4237$.bind((module0765.NIL != module0579.$g4237$.getDynamicValue(var14)) ? module0579.$g4237$.getDynamicValue(var14) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQUALP), (SubLObject)module0765.UNPROVIDED), var14);
                                            module0753.f47251((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic9$, module0751.f46599(), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                            SubLObject var24 = (SubLObject)module0765.NIL;
                                            SubLObject var25 = (SubLObject)module0765.NIL;
                                            SubLObject var26 = (SubLObject)module0765.NIL;
                                            var24 = var10;
                                            var25 = var24.first();
                                            for (var26 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL == var23 && module0765.NIL != var24; var24 = var24.rest(), var25 = var24.first(), var26 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var26)) {
                                                final SubLObject var27 = f48521(var25, Sequences.remove_if((SubLObject)module0765.$ic10$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                module0753.f47252(var26, var27);
                                                if (module0765.NIL != module0756.f47600(var27)) {
                                                    var28_29 = (SubLObject)ConsesLow.cons(var27, var28_29);
                                                }
                                                else {
                                                    var23 = (SubLObject)module0765.T;
                                                }
                                            }
                                            if (module0765.NIL != var23) {
                                                var15 = (SubLObject)module0765.$ic7$;
                                            }
                                            else {
                                                var28_29 = Sequences.nreverse(var28_29);
                                                SubLObject var29;
                                                final SubLObject var28 = var29 = module0753.f47258(var28_29);
                                                SubLObject var30 = (SubLObject)module0765.NIL;
                                                var30 = var29.first();
                                                while (module0765.NIL != var29) {
                                                    module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic11$, var30, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                    final SubLObject var31 = module0753.f47256(var30, var10);
                                                    SubLObject var37_40 = var30;
                                                    SubLObject var32 = (SubLObject)module0765.NIL;
                                                    var32 = var37_40.first();
                                                    while (module0765.NIL != var37_40) {
                                                        final SubLObject var33 = ConsesLow.nth(var32, var10);
                                                        module0753.f47251((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic12$, var33, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                        final SubLObject var34 = module0751.f46608(var33, var31);
                                                        final SubLObject var35 = module0753.f47253(var32, var28_29);
                                                        SubLObject var36 = (SubLObject)module0765.NIL;
                                                        if (!var34.equal(module0751.f46599())) {
                                                            module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic13$, var34, var33, (SubLObject)module0765.UNPROVIDED);
                                                            assert module0765.NIL != module0751.f46598(var34) : var34;
                                                            final SubLObject var18_24 = module0579.$g4254$.currentBinding(var14);
                                                            final SubLObject var37 = module0579.$g4287$.currentBinding(var14);
                                                            try {
                                                                module0579.$g4254$.bind(var34, var14);
                                                                module0579.$g4287$.bind(var35, var14);
                                                                var36 = f48521(var33, Sequences.remove_if((SubLObject)module0765.$ic10$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                            }
                                                            finally {
                                                                module0579.$g4287$.rebind(var37, var14);
                                                                module0579.$g4254$.rebind(var18_24, var14);
                                                            }
                                                            module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic15$, var34, var33, var36);
                                                        }
                                                        if (var34.isList() && (module0765.NIL == var36 || module0765.NIL != module0753.f47255(var36, ConsesLow.nth(var32, var28_29)))) {
                                                            module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic16$, var33, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                            assert module0765.NIL != module0751.f46598((SubLObject)module0765.T) : module0765.T;
                                                            final SubLObject var18_25 = module0579.$g4254$.currentBinding(var14);
                                                            final SubLObject var37 = module0579.$g4237$.currentBinding(var14);
                                                            final SubLObject var38 = module0579.$g4287$.currentBinding(var14);
                                                            try {
                                                                module0579.$g4254$.bind((SubLObject)module0765.T, var14);
                                                                module0579.$g4237$.bind((module0765.NIL != module0579.$g4237$.getDynamicValue(var14)) ? module0579.$g4237$.getDynamicValue(var14) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQUALP), (SubLObject)module0765.UNPROVIDED), var14);
                                                                module0579.$g4287$.bind(var35, var14);
                                                                var36 = f48521(var33, Sequences.remove_if((SubLObject)module0765.$ic10$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                            }
                                                            finally {
                                                                module0579.$g4287$.rebind(var38, var14);
                                                                module0579.$g4237$.rebind(var37, var14);
                                                                module0579.$g4254$.rebind(var18_25, var14);
                                                            }
                                                            module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic17$, var33, var36, (SubLObject)module0765.UNPROVIDED);
                                                        }
                                                        if (module0765.NIL != module0753.f47254(var36, ConsesLow.nth(var32, var28_29), var33)) {
                                                            module0753.f47251((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic18$, var33, ConsesLow.nth(var32, var28_29), var36);
                                                            ConsesLow.set_nth(var32, var28_29, var36);
                                                            module0753.f47252(var32, var36);
                                                        }
                                                        var37_40 = var37_40.rest();
                                                        var32 = var37_40.first();
                                                    }
                                                    var29 = var29.rest();
                                                    var30 = var29.first();
                                                }
                                                SubLObject var39 = var10;
                                                var25 = (SubLObject)module0765.NIL;
                                                var25 = var39.first();
                                                while (module0765.NIL != var39) {
                                                    module0755.f47385(var25);
                                                    var39 = var39.rest();
                                                    var25 = var39.first();
                                                }
                                                var15 = ConsesLow.append(var15, var28_29);
                                            }
                                        }
                                        finally {
                                            module0579.$g4237$.rebind(var18_23, var14);
                                        }
                                    }
                                    finally {
                                        final SubLObject var18_26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var14);
                                            if (module0765.NIL != var20 && module0765.NIL == var21) {
                                                module0034.f1873(var20, (SubLObject)module0765.NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_26, var14);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var18_22, var14);
                                }
                            }
                            finally {
                                module0580.$g4359$.rebind(var18_21, var14);
                            }
                            if (var19 == module0765.$ic19$ && module0765.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var14))) {
                                module0034.f1891(module0580.$g4358$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0580.$g4358$.rebind(var18_20, var14);
                        }
                    }
                    finally {
                        final SubLObject var18_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var14);
                            if (module0765.NIL == var18) {
                                module0580.f35554(module0580.$g4362$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_27, var14);
                        }
                    }
                }
                finally {
                    module0580.$g4362$.rebind(var18_19, var14);
                }
            }
            finally {
                module0580.$g4361$.rebind(var17, var14);
            }
            if (!var15.isList()) {
                return (SubLObject)module0765.$ic7$;
            }
            f48522(var10, var15);
            final SubLObject var40 = Sequences.find_if((SubLObject)module0765.$ic10$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != var40) {
                f48523(var40, var15);
            }
            final SubLObject var41 = Sequences.find_if((SubLObject)module0765.$ic20$, var10, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var42 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.$g4238$.getDynamicValue(var14) && module0765.NIL == var41);
            final SubLObject var43 = module0579.$g4238$.currentBinding(var14);
            try {
                module0579.$g4238$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.$g4238$.getDynamicValue(var14) && module0765.NIL != var41), var14);
                if (module0765.NIL != var42 && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic21$, var10);
                }
                var16 = f48524(var15, var12, (SubLObject)module0765.NIL, var13);
                if (module0765.NIL != var42 && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic22$);
                }
            }
            finally {
                module0579.$g4238$.rebind(var43, var14);
            }
        }
        return var16;
    }
    
    public static SubLObject f48525(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        SubLObject var55 = (SubLObject)module0765.NIL;
        if (module0765.NIL == module0579.$g4238$.getDynamicValue(var54)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic23$);
            }
        }
        else if (module0765.NIL != f48526(var53)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic24$);
            }
        }
        else {
            var55 = (SubLObject)module0765.T;
        }
        return var55;
    }
    
    public static SubLObject f48526(final SubLObject var53) {
        final SubLObject var54 = module0035.f1993(var53, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.UNPROVIDED);
        SubLObject var55 = module0035.f2002(var53, (SubLObject)module0765.FOUR_INTEGER, (SubLObject)module0765.UNPROVIDED);
        SubLObject var56 = (SubLObject)module0765.ZERO_INTEGER;
        if (module0765.NIL == var54 && module0765.NIL == var55) {
            SubLObject var57 = var53;
            SubLObject var58 = (SubLObject)module0765.NIL;
            var58 = var57.first();
            while (module0765.NIL == var55 && module0765.NIL != var57) {
                if (module0765.NIL == var55) {
                    SubLObject var58_60 = var58;
                    SubLObject var59 = (SubLObject)module0765.NIL;
                    var59 = var58_60.first();
                    while (module0765.NIL == var55 && module0765.NIL != var58_60) {
                        var56 = Numbers.add(var56, Sequences.length(module0749.f46455(var59)));
                        var55 = Numbers.numG(var56, (SubLObject)module0765.$ic25$);
                        var58_60 = var58_60.rest();
                        var59 = var58_60.first();
                    }
                }
                var57 = var57.rest();
                var58 = var57.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != var54 || module0765.NIL == var55);
    }
    
    public static SubLObject f48524(final SubLObject var53, final SubLObject var12, SubLObject var62, SubLObject var13) {
        if (var62 == module0765.UNPROVIDED) {
            var62 = (SubLObject)module0765.NIL;
        }
        if (var13 == module0765.UNPROVIDED) {
            var13 = (SubLObject)module0765.$ic6$;
        }
        final SubLObject var63 = Sequences.length(var53);
        final SubLObject var64 = f48527(var12);
        final SubLObject var65 = f48525(var53);
        if (module0765.NIL == var62) {
            var62 = module0772.f49212(var64);
        }
        else {
            module0749.f46457(var62, var64);
        }
        final SubLObject var66 = var63;
        if (var66.eql((SubLObject)module0765.ONE_INTEGER)) {
            return var53.first();
        }
        if (var66.eql((SubLObject)module0765.TWO_INTEGER)) {
            return f48528(var53, var62, var13, var65);
        }
        return f48529(var53, var64, var62, var13, var65);
    }
    
    public static SubLObject f48530(final SubLObject var65, final SubLObject var66) {
        SubLObject var68;
        final SubLObject var67 = var68 = var65.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)module0765.$ic26$);
        final SubLObject var69 = var68.rest();
        var68 = var68.first();
        SubLObject var70 = (SubLObject)module0765.NIL;
        SubLObject var71 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)module0765.$ic26$);
        var70 = var68.first();
        var68 = var68.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)module0765.$ic26$);
        var71 = var68.first();
        var68 = var68.rest();
        if (module0765.NIL == var68) {
            final SubLObject var72;
            var68 = (var72 = var69);
            return (SubLObject)ConsesLow.listS((SubLObject)module0765.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0765.$ic28$, var71, (SubLObject)ConsesLow.list((SubLObject)module0765.$ic29$, (SubLObject)module0765.$ic30$, var70)), ConsesLow.append(var72, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0765.$ic28$, var71, (SubLObject)ConsesLow.list((SubLObject)module0765.$ic29$, (SubLObject)module0765.$ic31$, var70)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var67, (SubLObject)module0765.$ic26$);
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48528(final SubLObject var53, final SubLObject var62, final SubLObject var13, final SubLObject var54) {
        SubLObject var63 = (SubLObject)module0765.NIL;
        SubLObject var64 = (SubLObject)module0765.NIL;
        SubLObject var65 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var53, var53, (SubLObject)module0765.$ic32$);
        var64 = var53.first();
        SubLObject var66 = var53.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var66, var53, (SubLObject)module0765.$ic32$);
        var65 = var66.first();
        var66 = var66.rest();
        if (module0765.NIL == var66) {
            if (module0765.NIL != var54) {
                var63 = (SubLObject)ConsesLow.cons(f48531(), var63);
            }
            SubLObject var67 = var64;
            SubLObject var68 = (SubLObject)module0765.NIL;
            var68 = var67.first();
            while (module0765.NIL != var67) {
                var63 = (SubLObject)ConsesLow.cons(var68, var63);
                var67 = var67.rest();
                var68 = var67.first();
            }
            if (module0765.NIL != var54) {
                var63 = (SubLObject)ConsesLow.cons(f48532(), var63);
            }
            if (module0765.NIL == var54) {
                var63 = (SubLObject)ConsesLow.cons(var62, var63);
                var67 = var65;
                var68 = (SubLObject)module0765.NIL;
                var68 = var67.first();
                while (module0765.NIL != var67) {
                    var63 = (SubLObject)ConsesLow.cons(var68, var63);
                    var67 = var67.rest();
                    var68 = var67.first();
                }
            }
            else if (var13 == module0765.$ic6$) {
                var63 = (SubLObject)ConsesLow.cons(f48531(), var63);
                var63 = (SubLObject)ConsesLow.cons(var62, var63);
                var67 = var65;
                var68 = (SubLObject)module0765.NIL;
                var68 = var67.first();
                while (module0765.NIL != var67) {
                    var63 = (SubLObject)ConsesLow.cons(var68, var63);
                    var67 = var67.rest();
                    var68 = var67.first();
                }
                var63 = (SubLObject)ConsesLow.cons(f48532(), var63);
            }
            else {
                var63 = (SubLObject)ConsesLow.cons(f48533(), var63);
                var63 = (SubLObject)ConsesLow.cons(var62, var63);
                var63 = (SubLObject)ConsesLow.cons(f48531(), var63);
                var67 = var65;
                var68 = (SubLObject)module0765.NIL;
                var68 = var67.first();
                while (module0765.NIL != var67) {
                    var63 = (SubLObject)ConsesLow.cons(var68, var63);
                    var67 = var67.rest();
                    var68 = var67.first();
                }
                var63 = (SubLObject)ConsesLow.cons(f48532(), var63);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0765.$ic32$);
        }
        var63 = Sequences.nreverse(var63);
        if (module0765.NIL != var54) {
            var63 = f48534(var63, var13);
        }
        return var63;
    }
    
    public static SubLObject f48529(final SubLObject var53, final SubLObject var64, final SubLObject var62, final SubLObject var13, final SubLObject var54) {
        final SubLObject var65 = Sequences.length(var53);
        final SubLObject var66 = (SubLObject)SubLObjectFactory.makeBoolean(var64.isString() && module0765.NIL != Sequences.find_if((SubLObject)module0765.$ic33$, var64, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        final SubLObject var67 = (SubLObject)module0765.NIL;
        SubLObject var68 = (SubLObject)module0765.NIL;
        SubLObject var69 = (SubLObject)module0765.NIL;
        SubLObject var70 = (SubLObject)module0765.NIL;
        SubLObject var71 = (SubLObject)module0765.NIL;
        var69 = var53;
        var70 = var69.first();
        for (var71 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var69; var69 = var69.rest(), var70 = var69.first(), var71 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var71)) {
            final SubLObject var72 = Numbers.zerop(var71);
            final SubLObject var73 = Numbers.numE(var71, module0048.f_1_(var65));
            if (module0765.NIL == var73) {
                if (module0765.NIL != var54) {
                    var68 = (SubLObject)ConsesLow.cons(f48531(), var68);
                }
                if (module0765.NIL != var67 && module0765.NIL == var72) {
                    var68 = (SubLObject)ConsesLow.cons(var62, var68);
                }
                SubLObject var74 = var70;
                SubLObject var75 = (SubLObject)module0765.NIL;
                var75 = var74.first();
                while (module0765.NIL != var74) {
                    var68 = (SubLObject)ConsesLow.cons(var75, var68);
                    var74 = var74.rest();
                    var75 = var74.first();
                }
                if (module0765.NIL != var66) {
                    var68 = (SubLObject)ConsesLow.cons(f48533(), var68);
                }
                if (module0765.NIL != var54) {
                    var68 = (SubLObject)ConsesLow.cons(f48532(), var68);
                }
            }
            else if (module0765.NIL == var54) {
                if (module0765.NIL != var64) {
                    var68 = (SubLObject)ConsesLow.cons(var62, var68);
                }
                SubLObject var74 = var70;
                SubLObject var75 = (SubLObject)module0765.NIL;
                var75 = var74.first();
                while (module0765.NIL != var74) {
                    var68 = (SubLObject)ConsesLow.cons(var75, var68);
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
            else if (module0765.NIL == var64) {
                var68 = (SubLObject)ConsesLow.cons(f48531(), var68);
                SubLObject var74 = var70;
                SubLObject var75 = (SubLObject)module0765.NIL;
                var75 = var74.first();
                while (module0765.NIL != var74) {
                    var68 = (SubLObject)ConsesLow.cons(var75, var68);
                    var74 = var74.rest();
                    var75 = var74.first();
                }
                var68 = (SubLObject)ConsesLow.cons(f48532(), var68);
            }
            else if (var13 == module0765.$ic6$) {
                var68 = (SubLObject)ConsesLow.cons(f48531(), var68);
                var68 = (SubLObject)ConsesLow.cons(var62, var68);
                SubLObject var74 = var70;
                SubLObject var75 = (SubLObject)module0765.NIL;
                var75 = var74.first();
                while (module0765.NIL != var74) {
                    var68 = (SubLObject)ConsesLow.cons(var75, var68);
                    var74 = var74.rest();
                    var75 = var74.first();
                }
                var68 = (SubLObject)ConsesLow.cons(f48532(), var68);
            }
            else {
                var68 = (SubLObject)ConsesLow.cons(var62, var68);
                var68 = (SubLObject)ConsesLow.cons(f48531(), var68);
                SubLObject var74 = var70;
                SubLObject var75 = (SubLObject)module0765.NIL;
                var75 = var74.first();
                while (module0765.NIL != var74) {
                    var68 = (SubLObject)ConsesLow.cons(var75, var68);
                    var74 = var74.rest();
                    var75 = var74.first();
                }
                var68 = (SubLObject)ConsesLow.cons(f48532(), var68);
            }
        }
        var68 = Sequences.nreverse(var68);
        if (module0765.NIL != var54) {
            var68 = f48534(var68, var13);
        }
        return var68;
    }
    
    public static SubLObject f48533() {
        return module0772.f49212((SubLObject)module0765.$ic0$);
    }
    
    public static SubLObject f48534(final SubLObject var83, SubLObject var84) {
        if (var84 == module0765.UNPROVIDED) {
            var84 = (SubLObject)module0765.$ic6$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        if (module0765.NIL == conses_high.member(var84, module0015.$g274$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0765.EQUAL), (SubLObject)module0765.UNPROVIDED)) {
            var84 = (SubLObject)module0765.$ic6$;
        }
        if (module0579.$g4259$.getDynamicValue(var85) == module0765.$ic34$) {
            return (SubLObject)ConsesLow.cons(f48535(var84), ConsesLow.append(var83, (SubLObject)ConsesLow.list(f48536(var84))));
        }
        return var83;
    }
    
    public static SubLObject f48535(SubLObject var84) {
        if (var84 == module0765.UNPROVIDED) {
            var84 = (SubLObject)module0765.$ic6$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = module0772.f49212(module0038.$g916$.getGlobalValue());
        if (module0579.$g4259$.getDynamicValue(var85) == module0765.$ic34$) {
            module0749.f46479(var86, f48537(var84), (SubLObject)module0765.NIL);
        }
        return var86;
    }
    
    public static SubLObject f48536(SubLObject var84) {
        if (var84 == module0765.UNPROVIDED) {
            var84 = (SubLObject)module0765.$ic6$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = module0772.f49212(module0038.$g916$.getGlobalValue());
        if (module0579.$g4259$.getDynamicValue(var85) == module0765.$ic34$) {
            module0749.f46479(var86, (SubLObject)module0765.NIL, f48538(var84));
        }
        return var86;
    }
    
    public static SubLObject f48537(SubLObject var84) {
        if (var84 == module0765.UNPROVIDED) {
            var84 = (SubLObject)module0765.$ic6$;
        }
        SubLObject var85 = module0038.$g916$.getGlobalValue();
        SubLObject var86 = (SubLObject)module0765.NIL;
        final SubLObject var87 = var84;
        if (var87.eql((SubLObject)module0765.$ic6$)) {
            var86 = module0015.$g264$.getGlobalValue();
        }
        else {
            var86 = module0015.$g262$.getGlobalValue();
            var85 = Sequences.cconcatenate(module0006.f203(module0015.$g273$.getGlobalValue()), module0006.f205(var84));
        }
        return Sequences.cconcatenate(var86, new SubLObject[] { var85, module0765.$ic35$ });
    }
    
    public static SubLObject f48538(SubLObject var84) {
        if (var84 == module0765.UNPROVIDED) {
            var84 = (SubLObject)module0765.$ic6$;
        }
        final SubLObject var85 = var84;
        if (var85.eql((SubLObject)module0765.$ic6$)) {
            return module0015.$g265$.getGlobalValue();
        }
        return module0015.$g263$.getGlobalValue();
    }
    
    public static SubLObject f48531() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0772.f49212(module0038.$g916$.getGlobalValue());
        if (module0579.$g4259$.getDynamicValue(var15) == module0765.$ic34$) {
            module0749.f46479(var16, Sequences.cconcatenate(module0015.$g275$.getGlobalValue(), (SubLObject)module0765.$ic35$), (SubLObject)module0765.NIL);
        }
        return var16;
    }
    
    public static SubLObject f48532() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0772.f49212(module0038.$g916$.getGlobalValue());
        if (module0579.$g4259$.getDynamicValue(var15) == module0765.$ic34$) {
            module0749.f46479(var16, (SubLObject)module0765.NIL, module0015.$g276$.getGlobalValue());
        }
        return var16;
    }
    
    public static SubLObject f48527(final SubLObject var12) {
        if (module0765.NIL == module0751.f46661((SubLObject)module0765.UNPROVIDED)) {
            return module0038.$g916$.getGlobalValue();
        }
        if (var12.eql((SubLObject)module0765.$ic36$) || var12.eql((SubLObject)module0765.$ic37$)) {
            return module0038.$g916$.getGlobalValue();
        }
        if (var12.eql((SubLObject)module0765.$ic38$)) {
            return (SubLObject)module0765.$ic39$;
        }
        if (var12.eql((SubLObject)module0765.$ic40$)) {
            return (SubLObject)module0765.$ic2$;
        }
        if (var12.eql((SubLObject)module0765.$ic41$)) {
            return (SubLObject)module0765.$ic42$;
        }
        if (var12.eql((SubLObject)module0765.$ic5$)) {
            return (SubLObject)module0765.$ic1$;
        }
        if (var12.eql((SubLObject)module0765.$ic43$)) {
            return (SubLObject)module0765.$ic44$;
        }
        return (SubLObject)module0765.$ic0$;
    }
    
    public static SubLObject f48523(final SubLObject var87, final SubLObject var53) {
        SubLObject var88 = var87;
        SubLObject var89 = var53;
        SubLObject var90 = (SubLObject)module0765.NIL;
        var90 = var89.first();
        while (module0765.NIL != var89) {
            final SubLObject var91 = (SubLObject)ConsesLow.list(var88);
            SubLObject var37_90 = var90;
            SubLObject var92 = (SubLObject)module0765.NIL;
            var92 = var37_90.first();
            while (module0765.NIL != var37_90) {
                module0751.f47205(var91, var92);
                var37_90 = var37_90.rest();
                var92 = var37_90.first();
            }
            var88 = Numbers.add(var88, (SubLObject)module0765.ONE_INTEGER);
            var89 = var89.rest();
            var90 = var89.first();
        }
        return var53;
    }
    
    public static SubLObject f48522(final SubLObject var10, final SubLObject var53) {
        SubLObject var54 = (SubLObject)module0765.NIL;
        SubLObject var59_93 = (SubLObject)module0765.NIL;
        SubLObject var55 = (SubLObject)module0765.NIL;
        SubLObject var95_96 = (SubLObject)module0765.NIL;
        var54 = var53;
        var59_93 = var54.first();
        var55 = var10;
        var95_96 = var55.first();
        while (module0765.NIL != var55 || module0765.NIL != var54) {
            if (module0765.NIL != module0035.f1997(var59_93) && module0765.NIL == module0202.f12590(var95_96)) {
                final SubLObject var56 = var59_93.first();
                final SubLObject var57 = module0749.f46462(var56);
                if (module0765.NIL == var57) {
                    module0749.f46468(var56, var95_96);
                }
            }
            var54 = var54.rest();
            var59_93 = var54.first();
            var55 = var55.rest();
            var95_96 = var55.first();
        }
        return var53;
    }
    
    public static SubLObject f48539(final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = f48540(var98, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var101 = (SubLObject)((module0765.NIL != module0762.f48200(var100)) ? module0764.f48440(var100, module0765.$ic45$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) : module0765.NIL);
        if (var101.isString()) {
            return var101;
        }
        SubLObject var102 = (SubLObject)module0765.NIL;
        final SubLObject var103 = module0580.$g4363$.currentBinding(var99);
        final SubLObject var104 = module0580.$g4366$.currentBinding(var99);
        final SubLObject var105 = module0580.$g4364$.currentBinding(var99);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var99);
            module0580.$g4366$.bind(module0580.f35568(), var99);
            module0580.$g4364$.bind((SubLObject)module0765.T, var99);
            try {
                var102 = module0770.f49097(var98, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            }
            finally {
                final SubLObject var18_102 = Threads.$is_thread_performing_cleanupP$.currentBinding(var99);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var99);
                    module0580.f35566();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_102, var99);
                }
            }
        }
        finally {
            module0580.$g4364$.rebind(var105, var99);
            module0580.$g4366$.rebind(var104, var99);
            module0580.$g4363$.rebind(var103, var99);
        }
        if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED)) {
            return Sequences.cconcatenate(var102, f48541(var98));
        }
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER) && module0765.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0765.$ic46$, var98, module0579.$g4260$.getDynamicValue(var99));
        }
        return var102;
    }
    
    public static SubLObject f48540(final SubLObject var98, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var104 = (SubLObject)module0765.NIL;
        if (var98.isNumber() && module0765.NIL == var104) {
            SubLObject var105;
            SubLObject var106;
            for (var105 = module0751.f46874((SubLObject)ConsesLow.list(module0765.$ic48$, (SubLObject)module0765.$ic47$, module0765.$ic45$, (SubLObject)module0765.$ic49$, var98), var103, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var106 = (SubLObject)module0765.NIL, var106 = var105.first(); module0765.NIL == var104 && module0765.NIL != var105; var104 = module0233.f15369((SubLObject)module0765.$ic47$, var106), var105 = var105.rest(), var106 = var105.first()) {}
        }
        return var104;
    }
    
    public static SubLObject f48541(SubLObject var98) {
        if (var98.isNumber()) {
            var98 = Numbers.mod(var98, (SubLObject)module0765.$ic50$);
        }
        if (var98.equal((SubLObject)module0765.ONE_INTEGER)) {
            return (SubLObject)module0765.$ic51$;
        }
        if (var98.equal((SubLObject)module0765.TWO_INTEGER)) {
            return (SubLObject)module0765.$ic52$;
        }
        if (var98.equal((SubLObject)module0765.THREE_INTEGER)) {
            return (SubLObject)module0765.$ic53$;
        }
        if (!var98.isNumber() || var98.numLE((SubLObject)module0765.TWENTY_INTEGER)) {
            return (SubLObject)module0765.$ic54$;
        }
        if (var98.isNumber()) {
            return f48541(Numbers.mod(var98, (SubLObject)module0765.TEN_INTEGER));
        }
        return (SubLObject)module0765.$ic54$;
    }
    
    public static SubLObject f48542(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0205.f13136(var108);
        final SubLObject var110 = module0770.f49097(module0205.f13203(var108, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var111 = module0205.f13204(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var112 = var111.eql((SubLObject)module0765.ONE_INTEGER) ? module0038.$g916$.getGlobalValue() : (var111.isInteger() ? f48539(var111) : module0770.f49097(var111, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        SubLObject var113 = (SubLObject)(var109.eql(module0765.$ic58$) ? module0765.$ic59$ : module0765.$ic60$);
        final SubLObject var114 = (module0765.NIL != Strings.stringE(var112, module0038.$g916$.getGlobalValue(), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) ? var113 : module0581.f35672((SubLObject)ConsesLow.list(var112, var113));
        final SubLObject var115 = module0205.f13205(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var116 = (module0765.NIL != module0269.f17709(var115)) ? module0581.f35672((SubLObject)ConsesLow.list((SubLObject)module0765.$ic61$, module0770.f49097(var115, (SubLObject)module0765.$ic62$, (SubLObject)module0765.UNPROVIDED))) : module0770.f49097(var115, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var117 = module0770.f49097(module0205.f13345(var108, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.$ic63$, (SubLObject)module0765.UNPROVIDED);
        if (module0579.$g4259$.getDynamicValue(var107) == module0765.$ic34$) {
            var113 = module0769.f49022(var113, var109);
        }
        module0756.f47723(var106, module0581.f35672((SubLObject)ConsesLow.list(var110, (SubLObject)module0765.$ic64$, var114, var117, (SubLObject)module0765.$ic65$, var116)));
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48543(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0765.NIL == Errors.$ignore_mustsP$.getDynamicValue(var107) && module0765.NIL != module0756.f47478(var106)) {
            Errors.error((SubLObject)module0765.$ic70$, var106);
        }
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == module0202.f12714(var108)) {
            final SubLObject var109 = module0579.$g4323$.currentBinding(var107);
            try {
                module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var107))) ? module0579.$g4323$.getDynamicValue(var107) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var107);
                final SubLObject var110 = module0754.f47307();
                final SubLObject var18_119 = module0754.$g6064$.currentBinding(var107);
                final SubLObject var111 = module0579.$g4324$.currentBinding(var107);
                final SubLObject var112 = module0579.$g4325$.currentBinding(var107);
                try {
                    module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var107), var107);
                    module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var107))) ? module0579.$g4324$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var107);
                    module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var107)), var107);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var107), module0067.f4903(module0579.$g4323$.getDynamicValue(var107)));
                    }
                    try {
                        var107.resetMultipleValues();
                        final SubLObject var113 = f48544(var106);
                        final SubLObject var114 = var107.secondMultipleValue();
                        var107.resetMultipleValues();
                        if (module0756.f47588(var106).isPositive()) {
                            module0756.f47491(var106);
                        }
                        if (module0765.NIL != module0756.f47466(var113)) {
                            module0756.f47777(var106, var113);
                            if (module0765.NIL == module0749.f46385(module0756.f47482(var106))) {
                                module0756.f47630(var106, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.UNPROVIDED);
                            }
                            module0756.f47608(var106);
                            if (module0765.NIL != var114) {
                                module0756.f47569(var106, var114);
                            }
                        }
                    }
                    finally {
                        final SubLObject var18_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                            final SubLObject var115 = conses_high.set_difference(module0754.f47307(), var110, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var107), module0754.f47307());
                            }
                            module0580.f35619(var115);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_120, var107);
                        }
                    }
                }
                finally {
                    module0579.$g4325$.rebind(var112, var107);
                    module0579.$g4324$.rebind(var111, var107);
                    module0754.$g6064$.rebind(var18_119, var107);
                }
            }
            finally {
                module0579.$g4323$.rebind(var109, var107);
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48544(final SubLObject var106) {
        SubLObject var107 = (SubLObject)module0765.NIL;
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        SubLObject var109 = (SubLObject)module0765.NIL;
        if (module0765.NIL == module0762.f48193(var108)) {
            return (SubLObject)module0765.NIL;
        }
        final SubLObject var110 = module0228.f15229(module0205.f13136(var108));
        final SubLObject var111 = module0205.f13207(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var112 = module0751.f47032(var108);
        final SubLObject var113 = module0751.f47099(var112, module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != var113) {
            var109 = f48545(var110, var111);
            if (module0765.NIL != var109) {
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic74$, var109);
                }
                var107 = f48546(var108, var109, var113, (SubLObject)module0765.NIL, module0751.f47200(), var106);
            }
        }
        SubLObject subLObject = var107;
        return Values.values(subLObject, (SubLObject)((module0765.$ic7$ == (subLObject = var107)) ? module0765.NIL : var109));
    }
    
    public static SubLObject f48547(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0765.NIL == module0762.f48193(var117)) {
            return (SubLObject)module0765.NIL;
        }
        SubLObject var119 = (SubLObject)module0765.NIL;
        final SubLObject var120 = module0205.f13136(var117);
        final SubLObject var121 = module0579.$g4259$.currentBinding(var118);
        try {
            module0579.$g4259$.bind((SubLObject)module0765.$ic77$, var118);
            final SubLObject var122 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var123 = f48548(var120, var122, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var18_129 = module0580.$g4363$.currentBinding(var118);
            final SubLObject var124 = module0580.$g4366$.currentBinding(var118);
            final SubLObject var125 = module0580.$g4364$.currentBinding(var118);
            try {
                module0580.$g4363$.bind(module0054.f3968(), var118);
                module0580.$g4366$.bind(module0580.f35568(), var118);
                module0580.$g4364$.bind((SubLObject)module0765.T, var118);
                try {
                    SubLObject var126 = var123;
                    SubLObject var127 = (SubLObject)module0765.NIL;
                    var127 = var126.first();
                    while (module0765.NIL != var126) {
                        final SubLObject var128 = f48546(var117, var127, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        if (module0765.NIL != var128) {
                            var119 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0756.f47713(var128, (SubLObject)module0765.NIL), var127), var119);
                        }
                        var126 = var126.rest();
                        var127 = var126.first();
                    }
                }
                finally {
                    final SubLObject var18_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var118);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var118);
                        module0580.f35566();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_130, var118);
                    }
                }
            }
            finally {
                module0580.$g4364$.rebind(var125, var118);
                module0580.$g4366$.rebind(var124, var118);
                module0580.$g4363$.rebind(var18_129, var118);
            }
        }
        finally {
            module0579.$g4259$.rebind(var121, var118);
        }
        return Sequences.reverse(var119);
    }
    
    public static SubLObject f48549(final SubLObject var124, final SubLObject var117, SubLObject var127) {
        if (var127 == module0765.UNPROVIDED) {
            var127 = (SubLObject)module0765.$ic78$;
        }
        final SubLThread var128 = SubLProcess.currentSubLThread();
        SubLObject var129 = (SubLObject)module0765.T;
        var128.resetMultipleValues();
        final SubLObject var130 = f48550(var124);
        SubLObject var131 = var128.secondMultipleValue();
        var128.resetMultipleValues();
        if (var130.isString()) {
            var131 = f48551(var131, module0202.f12725(var117, (SubLObject)module0765.$ic79$));
            SubLObject var132 = (SubLObject)module0765.NIL;
            SubLObject var133 = (SubLObject)module0765.ZERO_INTEGER;
            final SubLObject var134 = module0205.f13207(var117, (SubLObject)module0765.$ic80$);
            SubLObject var135;
            SubLObject var136;
            SubLObject var137;
            SubLObject var138;
            SubLObject var139;
            for (var135 = (SubLObject)module0765.NIL, var135 = var134; module0765.NIL == var132 && module0765.NIL != var135; var135 = var135.rest()) {
                var136 = var135.first();
                var133 = Numbers.add(var133, (SubLObject)module0765.ONE_INTEGER);
                var137 = (SubLObject)module0765.$ic78$;
                var138 = f48552(var136);
                var139 = module0751.f47099(var137, var138, (SubLObject)module0765.UNPROVIDED);
                if (module0765.NIL == var139) {
                    var132 = (SubLObject)module0765.T;
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)module0765.$ic81$, var124, var117);
                    }
                }
            }
            if (module0765.NIL != var132) {
                var129 = (SubLObject)module0765.NIL;
            }
        }
        return var129;
    }
    
    public static SubLObject f48552(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = (SubLObject)module0765.$ic78$;
        if (module0765.NIL != module0762.f48210(var141)) {
            final SubLObject var144 = module0580.$g4363$.currentBinding(var142);
            final SubLObject var145 = module0580.$g4366$.currentBinding(var142);
            final SubLObject var146 = module0580.$g4364$.currentBinding(var142);
            try {
                module0580.$g4363$.bind(module0054.f3968(), var142);
                module0580.$g4366$.bind(module0580.f35568(), var142);
                module0580.$g4364$.bind((SubLObject)module0765.T, var142);
                try {
                    final SubLObject var147 = module0756.f47463(var141, module0751.f46691(), (SubLObject)module0765.UNPROVIDED);
                    var143 = module0756.f47488(var147, (SubLObject)module0765.UNPROVIDED);
                }
                finally {
                    final SubLObject var18_143 = Threads.$is_thread_performing_cleanupP$.currentBinding(var142);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var142);
                        module0580.f35566();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_143, var142);
                    }
                }
            }
            finally {
                module0580.$g4364$.rebind(var146, var142);
                module0580.$g4366$.rebind(var145, var142);
                module0580.$g4363$.rebind(var144, var142);
            }
        }
        return var143;
    }
    
    public static SubLObject f48546(final SubLObject var117, final SubLObject var124, SubLObject var127, SubLObject var144, SubLObject var145, SubLObject var106) {
        if (var127 == module0765.UNPROVIDED) {
            var127 = (SubLObject)module0765.$ic78$;
        }
        if (var144 == module0765.UNPROVIDED) {
            var144 = (SubLObject)module0765.NIL;
        }
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        if (var106 == module0765.UNPROVIDED) {
            var106 = (SubLObject)module0765.NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = (SubLObject)module0765.NIL;
        var146.resetMultipleValues();
        final SubLObject var148 = f48550(var124);
        final SubLObject var149 = var146.secondMultipleValue();
        var146.resetMultipleValues();
        var147 = f48553(var117, var148, var149, var145, var106);
        return module0751.f46637(var144, var147, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48553(final SubLObject var117, final SubLObject var132, final SubLObject var133, final SubLObject var145, SubLObject var106) {
        if (var106 == module0765.UNPROVIDED) {
            var106 = (SubLObject)module0765.NIL;
        }
        if (module0765.NIL == var132) {
            final SubLObject var146 = print_high.princ_to_string(module0202.f12799((SubLObject)module0765.$ic83$, var117, (SubLObject)module0765.UNPROVIDED));
            return module0756.f47778(var146, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        SubLObject var147 = (SubLObject)module0765.NIL;
        SubLObject var148 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var117, var117, (SubLObject)module0765.$ic82$);
        var147 = var117.first();
        final SubLObject var149 = var148 = var117.rest();
        final SubLObject var150 = f48554(var117, var147, var148, var133, var145, var106);
        if (module0765.NIL != module0035.f2428((SubLObject)module0765.$ic7$, var150, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.$ic7$;
        }
        return f48555(var132, var147, var150, var145);
    }
    
    public static SubLObject f48555(final SubLObject var132, final SubLObject var125, SubLObject var16, SubLObject var145) {
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        SubLObject var146 = (SubLObject)module0765.NIL;
        final SubLObject var147 = module0751.f46982((SubLObject)module0765.$ic84$, var145);
        SubLObject var148 = (SubLObject)module0765.NIL;
        SubLObject var149 = module0038.f2738(var132, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        SubLObject var150 = (SubLObject)module0765.NIL;
        var150 = var149.first();
        while (module0765.NIL != var149) {
            final SubLObject var151 = Sequences.count((SubLObject)Characters.CHAR_tilde, var150, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != module0004.f105(var151)) {
                if (module0765.NIL != var148) {
                    var146 = (SubLObject)ConsesLow.cons(module0758.f47924(var125, var148, var147), var146);
                    var148 = (SubLObject)module0765.NIL;
                }
                SubLObject var152 = module0038.f2738(var150, (SubLObject)module0765.$ic85$, (SubLObject)module0765.NIL, (SubLObject)module0765.T, (SubLObject)module0765.T, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                SubLObject var153 = (SubLObject)module0765.NIL;
                SubLObject var154 = (SubLObject)module0765.NIL;
                SubLObject var155 = (SubLObject)module0765.NIL;
                var155 = var152.first();
                while (module0765.NIL != var152) {
                    var152 = var152.rest();
                    if (module0765.NIL != Strings.stringE(var155, (SubLObject)module0765.$ic86$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != var152) {
                        SubLObject var37_156 = var16.first();
                        SubLObject var156 = (SubLObject)module0765.NIL;
                        var156 = var37_156.first();
                        while (module0765.NIL != var37_156) {
                            if (module0765.NIL != var153) {
                                module0749.f46458(var156, var153);
                                var153 = (SubLObject)module0765.NIL;
                            }
                            var146 = (SubLObject)ConsesLow.cons(var156, var146);
                            var37_156 = var37_156.rest();
                            var156 = var37_156.first();
                        }
                        var16 = var16.rest();
                        var154 = (SubLObject)module0765.T;
                    }
                    else if (module0765.NIL != var154) {
                        if (module0765.NIL != module0035.f2002(var155, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED)) {
                            final SubLObject var157 = Sequences.subseq(var155, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED);
                            final SubLObject var158 = var146.first();
                            module0749.f46461(var158, var157);
                        }
                        var154 = (SubLObject)module0765.NIL;
                    }
                    else {
                        var153 = var155;
                    }
                    var155 = var152.first();
                }
            }
            else {
                var148 = (SubLObject)ConsesLow.cons(var150, var148);
            }
            var149 = var149.rest();
            var150 = var149.first();
        }
        if (module0765.NIL != var148) {
            var146 = (SubLObject)ConsesLow.cons(module0758.f47924(var125, var148, var147), var146);
        }
        return Sequences.nreverse(var146);
    }
    
    public static SubLObject f48556(final SubLObject var117, final SubLObject var159) {
        SubLObject var160 = module0205.f13134(var117, var159, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == module0765.$g6117$.getGlobalValue() && !module0765.areAssertionsDisabledFor(me) && module0765.NIL == module0202.f12674(var160)) {
            throw new AssertionError(var160);
        }
        if (module0765.NIL != module0202.f12674(var160)) {
            var160 = module0202.f12755(var160);
        }
        return var160;
    }
    
    public static SubLObject f48550(final SubLObject var130) {
        if (module0765.NIL == module0178.f11284(var130)) {
            return (SubLObject)module0765.NIL;
        }
        return f48557(module0178.f11285(var130));
    }
    
    public static SubLObject f48557(final SubLObject var160) {
        if (module0765.NIL == module0202.f12590(var160)) {
            return (SubLObject)module0765.NIL;
        }
        final SubLObject var161 = module0205.f13136(var160);
        if (module0765.NIL != conses_high.member(var161, (SubLObject)ConsesLow.list(module0765.$ic88$, module0765.$ic89$, module0765.$ic90$), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            return Values.values(module0205.f13204(var160, (SubLObject)module0765.UNPROVIDED), f48556(var160, (SubLObject)module0765.THREE_INTEGER));
        }
        if (var161.eql(module0765.$ic91$)) {
            return Values.values(module0205.f13205(var160, (SubLObject)module0765.UNPROVIDED), f48556(var160, (SubLObject)module0765.FOUR_INTEGER));
        }
        if (var161.eql(module0765.$ic92$)) {
            return Values.values(module0205.f13345(var160, (SubLObject)module0765.UNPROVIDED), f48556(var160, (SubLObject)module0765.FIVE_INTEGER));
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48545(final SubLObject var161, SubLObject var10) {
        if (var10 == module0765.UNPROVIDED) {
            var10 = (SubLObject)module0765.NIL;
        }
        return f48548(var161, var10, (SubLObject)module0765.T).first();
    }
    
    public static SubLObject f48548(final SubLObject var161, SubLObject var10, SubLObject var162) {
        if (var10 == module0765.UNPROVIDED) {
            var10 = (SubLObject)module0765.NIL;
        }
        if (var162 == module0765.UNPROVIDED) {
            var162 = (SubLObject)module0765.T;
        }
        final SubLThread var163 = SubLProcess.currentSubLThread();
        final SubLObject var164 = module0751.f46622();
        SubLObject var165 = f48558(var161, var10, var162);
        SubLObject var166 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != var162 && module0765.NIL != var165);
        final SubLObject var167 = (SubLObject)((module0765.NIL != var166) ? module0765.NIL : module0751.f46623(var161, (SubLObject)module0765.UNPROVIDED));
        if (module0765.NIL == var166) {
            SubLObject var168 = var167;
            SubLObject var169 = (SubLObject)module0765.NIL;
            var169 = var168.first();
            while (module0765.NIL == var166 && module0765.NIL != var168) {
                final SubLObject var170 = f48558(var169, var10, var162);
                if (module0765.NIL == var166) {
                    SubLObject var58_168 = var170;
                    SubLObject var171 = (SubLObject)module0765.NIL;
                    var171 = var58_168.first();
                    while (module0765.NIL == var166 && module0765.NIL != var58_168) {
                        var165 = (SubLObject)ConsesLow.cons(var171, var165);
                        var166 = var162;
                        var58_168 = var58_168.rest();
                        var171 = var58_168.first();
                    }
                }
                var168 = var168.rest();
                var169 = var168.first();
            }
        }
        if (module0765.NIL == var166 && var164.isPositive() && module0765.NIL != module0269.f17715(var161)) {
            SubLObject var172 = (SubLObject)module0765.ZERO_INTEGER;
            if (module0765.NIL == var166) {
                final SubLObject var173 = module0137.f8955(module0765.$ic93$);
                final SubLObject var174 = (SubLObject)((module0765.$ic94$ == module0765.$ic95$) ? module0765.$ic96$ : module0765.$ic97$);
                final SubLObject var175 = module0056.f4145(var174);
                SubLObject var176 = (SubLObject)module0765.NIL;
                final SubLObject var177 = module0139.$g1635$.currentBinding(var163);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var163);
                    final SubLObject var178 = module0579.$g4260$.getDynamicValue(var163);
                    final SubLObject var18_176 = module0147.$g2095$.currentBinding(var163);
                    final SubLObject var179 = module0147.$g2094$.currentBinding(var163);
                    final SubLObject var180 = module0147.$g2096$.currentBinding(var163);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var178), var163);
                        module0147.$g2094$.bind(module0147.f9546(var178), var163);
                        module0147.$g2096$.bind(module0147.f9549(var178), var163);
                        final SubLObject var181 = module0765.$ic98$;
                        final SubLObject var18_177 = module0141.$g1714$.currentBinding(var163);
                        final SubLObject var45_179 = module0141.$g1715$.currentBinding(var163);
                        try {
                            module0141.$g1714$.bind((module0765.NIL != var181) ? var181 : module0141.f9283(), var163);
                            module0141.$g1715$.bind((SubLObject)((module0765.NIL != var181) ? module0765.$ic99$ : module0141.$g1715$.getDynamicValue(var163)), var163);
                            if (module0765.NIL != var181 && module0765.NIL != module0136.f8864() && module0765.NIL == module0141.f9279(var181)) {
                                final SubLObject var182 = module0136.$g1591$.getDynamicValue(var163);
                                if (var182.eql((SubLObject)module0765.$ic100$)) {
                                    module0136.f8870((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic101$, var181, (SubLObject)module0765.$ic102$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                }
                                else if (var182.eql((SubLObject)module0765.$ic103$)) {
                                    module0136.f8871((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic104$, (SubLObject)module0765.$ic101$, var181, (SubLObject)module0765.$ic102$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                }
                                else if (var182.eql((SubLObject)module0765.$ic105$)) {
                                    Errors.warn((SubLObject)module0765.$ic101$, var181, (SubLObject)module0765.$ic102$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0765.$ic106$, module0136.$g1591$.getDynamicValue(var163));
                                    Errors.cerror((SubLObject)module0765.$ic104$, (SubLObject)module0765.$ic101$, var181, (SubLObject)module0765.$ic102$);
                                }
                            }
                            final SubLObject var18_178 = module0141.$g1670$.currentBinding(var163);
                            final SubLObject var45_180 = module0141.$g1671$.currentBinding(var163);
                            final SubLObject var47_182 = module0141.$g1672$.currentBinding(var163);
                            final SubLObject var183 = module0141.$g1674$.currentBinding(var163);
                            final SubLObject var184 = module0137.$g1605$.currentBinding(var163);
                            try {
                                module0141.$g1670$.bind(var173, var163);
                                module0141.$g1671$.bind(module0244.f15739(var173), var163);
                                module0141.$g1672$.bind(module0244.f15746(var173), var163);
                                module0141.$g1674$.bind((SubLObject)module0765.NIL, var163);
                                module0137.$g1605$.bind(var173, var163);
                                if (module0765.NIL != module0136.f8865() || module0765.NIL != module0244.f15795(var161, module0137.f8955((SubLObject)module0765.UNPROVIDED))) {
                                    final SubLObject var18_179 = module0141.$g1677$.currentBinding(var163);
                                    final SubLObject var45_181 = module0138.$g1619$.currentBinding(var163);
                                    final SubLObject var47_183 = module0141.$g1674$.currentBinding(var163);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9208(), var163);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var173), var163);
                                        module0141.$g1674$.bind((SubLObject)module0765.NIL, var163);
                                        module0249.f16055(var161, (SubLObject)module0765.UNPROVIDED);
                                        for (var176 = (SubLObject)ConsesLow.list(var161, module0141.f9195()); module0765.NIL != var176 && module0765.NIL == var166; var176 = module0056.f4150(var175)) {
                                            final SubLObject var171_188 = var176.first();
                                            final SubLObject var185 = conses_high.second(var176);
                                            final SubLObject var186 = var171_188;
                                            final SubLObject var18_180 = module0141.$g1674$.currentBinding(var163);
                                            try {
                                                module0141.$g1674$.bind(var185, var163);
                                                final SubLObject var187 = var185;
                                                if (module0765.NIL == var187 && !var186.eql(var161) && module0765.NIL == conses_high.member(var186, var167, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                                                    final SubLObject var188 = f48558(var186, var10, var162);
                                                    if (module0765.NIL == var166) {
                                                        SubLObject var189 = var188;
                                                        SubLObject var190 = (SubLObject)module0765.NIL;
                                                        var190 = var189.first();
                                                        while (module0765.NIL == var166 && module0765.NIL != var189) {
                                                            var165 = (SubLObject)ConsesLow.cons(var190, var165);
                                                            var172 = Numbers.add(var172, (SubLObject)module0765.ONE_INTEGER);
                                                            var166 = var162;
                                                            var189 = var189.rest();
                                                            var190 = var189.first();
                                                        }
                                                    }
                                                }
                                                var166 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != var166 || module0765.NIL != var165 || var172.numGE(var164));
                                                final SubLObject var191 = module0200.f12443(var173);
                                                SubLObject var192;
                                                SubLObject var193;
                                                SubLObject var18_181;
                                                SubLObject var45_182;
                                                SubLObject var194;
                                                SubLObject var195;
                                                SubLObject var196;
                                                SubLObject var197;
                                                SubLObject var198;
                                                SubLObject var199;
                                                SubLObject var18_182;
                                                SubLObject var200_204;
                                                SubLObject var200;
                                                SubLObject var201;
                                                SubLObject var18_183;
                                                SubLObject var202;
                                                SubLObject var203;
                                                SubLObject var204;
                                                SubLObject var205;
                                                SubLObject var206;
                                                SubLObject var207;
                                                SubLObject var208;
                                                SubLObject var209;
                                                SubLObject var137_214;
                                                SubLObject var210;
                                                SubLObject var18_184;
                                                SubLObject var212;
                                                SubLObject var211;
                                                SubLObject var213;
                                                SubLObject var214;
                                                SubLObject var215;
                                                SubLObject var216;
                                                SubLObject var217;
                                                SubLObject var218;
                                                for (var192 = (SubLObject)module0765.NIL, var192 = var191; module0765.NIL == var166 && module0765.NIL != var192; var192 = var192.rest()) {
                                                    var193 = var192.first();
                                                    var18_181 = module0137.$g1605$.currentBinding(var163);
                                                    var45_182 = module0141.$g1674$.currentBinding(var163);
                                                    try {
                                                        module0137.$g1605$.bind(var193, var163);
                                                        module0141.$g1674$.bind((SubLObject)((module0765.NIL != module0141.f9205((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0765.NIL == module0141.$g1674$.getDynamicValue(var163)) : module0141.$g1674$.getDynamicValue(var163)), var163);
                                                        var194 = module0228.f15229(var171_188);
                                                        if (module0765.NIL != module0138.f8992(var194)) {
                                                            var195 = module0242.f15664(var194, module0137.f8955((SubLObject)module0765.UNPROVIDED));
                                                            if (module0765.NIL != var195) {
                                                                var196 = module0245.f15834(var195, module0138.f8979(), module0137.f8955((SubLObject)module0765.UNPROVIDED));
                                                                if (module0765.NIL != var196) {
                                                                    for (var197 = module0066.f4838(module0067.f4891(var196)); module0765.NIL == var166 && module0765.NIL == module0066.f4841(var197); var197 = module0066.f4840(var197)) {
                                                                        var163.resetMultipleValues();
                                                                        var198 = module0066.f4839(var197);
                                                                        var199 = var163.secondMultipleValue();
                                                                        var163.resetMultipleValues();
                                                                        if (module0765.NIL != module0147.f9507(var198)) {
                                                                            var18_182 = module0138.$g1623$.currentBinding(var163);
                                                                            try {
                                                                                module0138.$g1623$.bind(var198, var163);
                                                                                for (var200_204 = module0066.f4838(module0067.f4891(var199)); module0765.NIL == var166 && module0765.NIL == module0066.f4841(var200_204); var200_204 = module0066.f4840(var200_204)) {
                                                                                    var163.resetMultipleValues();
                                                                                    var200 = module0066.f4839(var200_204);
                                                                                    var201 = var163.secondMultipleValue();
                                                                                    var163.resetMultipleValues();
                                                                                    if (module0765.NIL != module0141.f9289(var200)) {
                                                                                        var18_183 = module0138.$g1624$.currentBinding(var163);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var200, var163);
                                                                                            var202 = var201;
                                                                                            if (module0765.NIL != module0077.f5302(var202)) {
                                                                                                var203 = module0077.f5333(var202);
                                                                                                for (var204 = module0032.f1741(var203), var205 = (SubLObject)module0765.NIL, var205 = module0032.f1742(var204, var203); module0765.NIL == var166 && module0765.NIL == module0032.f1744(var204, var205); var205 = module0032.f1743(var205)) {
                                                                                                    var206 = module0032.f1745(var204, var205);
                                                                                                    if (module0765.NIL != module0032.f1746(var205, var206) && module0765.NIL == module0249.f16059(var206, (SubLObject)module0765.UNPROVIDED)) {
                                                                                                        module0249.f16055(var206, (SubLObject)module0765.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var206, module0141.f9195()), var175);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var202.isList()) {
                                                                                                if (module0765.NIL == var166) {
                                                                                                    var207 = var202;
                                                                                                    var208 = (SubLObject)module0765.NIL;
                                                                                                    var208 = var207.first();
                                                                                                    while (module0765.NIL == var166 && module0765.NIL != var207) {
                                                                                                        if (module0765.NIL == module0249.f16059(var208, (SubLObject)module0765.UNPROVIDED)) {
                                                                                                            module0249.f16055(var208, (SubLObject)module0765.UNPROVIDED);
                                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var208, module0141.f9195()), var175);
                                                                                                        }
                                                                                                        var207 = var207.rest();
                                                                                                        var208 = var207.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0765.$ic107$, var202);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var18_183, var163);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var200_204);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var18_182, var163);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var197);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0765.FIVE_INTEGER, (SubLObject)module0765.$ic108$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0765.NIL != module0155.f9785(var194, (SubLObject)module0765.UNPROVIDED)) {
                                                            var209 = ((module0765.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var163), module0137.f8955((SubLObject)module0765.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var163), module0137.f8955((SubLObject)module0765.UNPROVIDED)));
                                                            for (var137_214 = (SubLObject)module0765.NIL, var137_214 = var209; module0765.NIL == var166 && module0765.NIL != var137_214; var137_214 = var137_214.rest()) {
                                                                var210 = var137_214.first();
                                                                var18_184 = module0138.$g1625$.currentBinding(var163);
                                                                try {
                                                                    module0138.$g1625$.bind(var210, var163);
                                                                    var211 = (var212 = Functions.funcall(var210, var194));
                                                                    if (module0765.NIL != module0077.f5302(var212)) {
                                                                        var213 = module0077.f5333(var212);
                                                                        for (var214 = module0032.f1741(var213), var215 = (SubLObject)module0765.NIL, var215 = module0032.f1742(var214, var213); module0765.NIL == var166 && module0765.NIL == module0032.f1744(var214, var215); var215 = module0032.f1743(var215)) {
                                                                            var216 = module0032.f1745(var214, var215);
                                                                            if (module0765.NIL != module0032.f1746(var215, var216) && module0765.NIL == module0249.f16059(var216, (SubLObject)module0765.UNPROVIDED)) {
                                                                                module0249.f16055(var216, (SubLObject)module0765.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var216, module0141.f9195()), var175);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var212.isList()) {
                                                                        if (module0765.NIL == var166) {
                                                                            var217 = var212;
                                                                            var218 = (SubLObject)module0765.NIL;
                                                                            var218 = var217.first();
                                                                            while (module0765.NIL == var166 && module0765.NIL != var217) {
                                                                                if (module0765.NIL == module0249.f16059(var218, (SubLObject)module0765.UNPROVIDED)) {
                                                                                    module0249.f16055(var218, (SubLObject)module0765.UNPROVIDED);
                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var218, module0141.f9195()), var175);
                                                                                }
                                                                                var217 = var217.rest();
                                                                                var218 = var217.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0765.$ic107$, var212);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var18_184, var163);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var45_182, var163);
                                                        module0137.$g1605$.rebind(var18_181, var163);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var18_180, var163);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var47_183, var163);
                                        module0138.$g1619$.rebind(var45_181, var163);
                                        module0141.$g1677$.rebind(var18_179, var163);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic109$, var161, module0244.f15748(module0137.f8955((SubLObject)module0765.UNPROVIDED)), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var184, var163);
                                module0141.$g1674$.rebind(var183, var163);
                                module0141.$g1672$.rebind(var47_182, var163);
                                module0141.$g1671$.rebind(var45_180, var163);
                                module0141.$g1670$.rebind(var18_178, var163);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var45_179, var163);
                            module0141.$g1714$.rebind(var18_177, var163);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var180, var163);
                        module0147.$g2094$.rebind(var179, var163);
                        module0147.$g2095$.rebind(var18_176, var163);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var163));
                }
                finally {
                    module0139.$g1635$.rebind(var177, var163);
                }
            }
            var165 = Sequences.nreverse(var165);
        }
        return var165;
    }
    
    public static SubLObject f48559(final SubLObject var130, final SubLObject var10) {
        final SubLThread var131 = SubLProcess.currentSubLThread();
        SubLObject var132 = (SubLObject)module0765.NIL;
        var131.resetMultipleValues();
        final SubLObject var133 = f48550(var130);
        final SubLObject var134 = var131.secondMultipleValue();
        var131.resetMultipleValues();
        if (module0765.NIL == var132) {
            SubLObject var135 = var134;
            SubLObject var136 = (SubLObject)module0765.NIL;
            var136 = var135.first();
            while (module0765.NIL == var132 && module0765.NIL != var135) {
                final SubLObject var137 = (SubLObject)(var136.isInteger() ? var136 : (var136.isList() ? var136.first() : module0765.NIL));
                var132 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0004.f105(var137) && module0765.NIL == ConsesLow.nth(module0048.f_1_(var137), var10));
                var135 = var135.rest();
                var136 = var135.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var132);
    }
    
    public static SubLObject f48560(final SubLObject var130, SubLObject var217) {
        if (var217 == module0765.UNPROVIDED) {
            var217 = (SubLObject)module0765.NIL;
        }
        final SubLThread var218 = SubLProcess.currentSubLThread();
        SubLObject var219 = (SubLObject)module0765.NIL;
        SubLObject var220 = (SubLObject)module0765.NIL;
        var218.resetMultipleValues();
        final SubLObject var221 = f48550(var130);
        final SubLObject var222 = var218.secondMultipleValue();
        var218.resetMultipleValues();
        if (module0765.NIL == var222) {
            var220 = Sequences.count((SubLObject)Characters.CHAR_tilde, var221, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        if (module0751.f46599().isList() && module0765.NIL == var219) {
            SubLObject var223 = module0751.f46599();
            SubLObject var224 = (SubLObject)module0765.NIL;
            var224 = var223.first();
            while (module0765.NIL == var219 && module0765.NIL != var223) {
                final SubLObject var225 = (SubLObject)(var224.isInteger() ? var224 : (var224.isList() ? var224.first() : module0765.NIL));
                SubLObject var226 = (SubLObject)module0765.NIL;
                if (module0765.NIL != var222) {
                    if (module0765.NIL == var226) {
                        SubLObject var58_220;
                        SubLObject var227;
                        for (var58_220 = var222, var227 = (SubLObject)module0765.NIL, var227 = var58_220.first(); module0765.NIL == var226 && module0765.NIL != var58_220; var226 = (SubLObject)SubLObjectFactory.makeBoolean(var225.eql(var227) || (var227.isList() && var225.eql(var227.first()))), var58_220 = var58_220.rest(), var227 = var58_220.first()) {}
                    }
                }
                else {
                    var226 = Numbers.numLE(var225, var220);
                }
                var219 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var226);
                if (module0765.NIL != var219 && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0765.$ic110$, var225, var130, module0751.f46599());
                }
                var223 = var223.rest();
                var224 = var223.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var219);
    }
    
    public static SubLObject f48561(final SubLObject var125) {
        return module0035.sublisp_boolean(f48562(var125, (SubLObject)module0765.T, module0765.$ic89$));
    }
    
    public static SubLObject f48558(final SubLObject var161, final SubLObject var10, final SubLObject var162) {
        final SubLThread var163 = SubLProcess.currentSubLThread();
        SubLObject var164 = (SubLObject)module0765.NIL;
        SubLObject var165 = (SubLObject)module0765.NIL;
        final SubLObject var166 = f48562(var161, (SubLObject)module0765.NIL, module0765.$ic89$);
        if ((module0765.NIL != module0751.f46606((SubLObject)module0765.ZERO_INTEGER) || module0765.NIL != Sequences.find_if((SubLObject)module0765.$ic111$, var10, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) && module0765.NIL == var164) {
            SubLObject var167 = var166;
            SubLObject var168 = (SubLObject)module0765.NIL;
            var168 = var167.first();
            while (module0765.NIL == var164 && module0765.NIL != var167) {
                if (module0765.NIL != f48559(var168, var10)) {
                    var165 = (SubLObject)ConsesLow.cons(var168, var165);
                    var164 = var162;
                }
                var167 = var167.rest();
                var168 = var167.first();
            }
        }
        if (module0765.NIL == var164) {
            if (module0765.NIL != var10 && module0765.NIL != module0212.f13762(var161) && module0765.NIL == var164 && module0765.NIL != module0220.f14547(var161, module0765.$ic92$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                final SubLObject var169 = module0147.f9540(module0579.$g4260$.getDynamicValue(var163));
                final SubLObject var170 = module0147.$g2095$.currentBinding(var163);
                final SubLObject var171 = module0147.$g2094$.currentBinding(var163);
                final SubLObject var172 = module0147.$g2096$.currentBinding(var163);
                final SubLObject var173 = module0148.$g2099$.currentBinding(var163);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var169), var163);
                    module0147.$g2094$.bind(module0147.f9546(var169), var163);
                    module0147.$g2096$.bind(module0147.f9549(var169), var163);
                    module0148.$g2099$.bind((SubLObject)module0765.$ic112$, var163);
                    final SubLObject var174 = module0765.$ic92$;
                    if (module0765.NIL != module0158.f10010(var161, (SubLObject)module0765.NIL, var174)) {
                        final SubLObject var175 = module0158.f10011(var161, (SubLObject)module0765.NIL, var174);
                        SubLObject var176 = var164;
                        final SubLObject var177 = (SubLObject)module0765.NIL;
                        while (module0765.NIL == var176) {
                            final SubLObject var178 = module0052.f3695(var175, var177);
                            final SubLObject var179 = (SubLObject)SubLObjectFactory.makeBoolean(!var177.eql(var178));
                            if (module0765.NIL != var179) {
                                SubLObject var180 = (SubLObject)module0765.NIL;
                                try {
                                    var180 = module0158.f10316(var178, (SubLObject)module0765.$ic113$, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL);
                                    SubLObject var225_230 = var164;
                                    final SubLObject var226_231 = (SubLObject)module0765.NIL;
                                    while (module0765.NIL == var225_230) {
                                        final SubLObject var181 = module0052.f3695(var180, var226_231);
                                        final SubLObject var228_232 = (SubLObject)SubLObjectFactory.makeBoolean(!var226_231.eql(var181));
                                        if (module0765.NIL != var228_232 && module0765.NIL != f48559(var181, var10) && module0765.NIL != module0751.f47151(var181, var10)) {
                                            var165 = (SubLObject)ConsesLow.cons(var181, var165);
                                            var164 = var162;
                                        }
                                        var225_230 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var228_232 || module0765.NIL != var164);
                                    }
                                }
                                finally {
                                    final SubLObject var18_233 = Threads.$is_thread_performing_cleanupP$.currentBinding(var163);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var163);
                                        if (module0765.NIL != var180) {
                                            module0158.f10319(var180);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_233, var163);
                                    }
                                }
                            }
                            var176 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var179 || module0765.NIL != var164);
                        }
                    }
                }
                finally {
                    module0148.$g2099$.rebind(var173, var163);
                    module0147.$g2096$.rebind(var172, var163);
                    module0147.$g2094$.rebind(var171, var163);
                    module0147.$g2095$.rebind(var170, var163);
                }
            }
            if (module0765.NIL == var164) {
                final SubLObject var182 = f48562(var161, (SubLObject)module0765.NIL, (SubLObject)module0765.UNPROVIDED);
                if (module0765.NIL == var164) {
                    SubLObject var183 = var182;
                    SubLObject var184 = (SubLObject)module0765.NIL;
                    var184 = var183.first();
                    while (module0765.NIL == var164 && module0765.NIL != var183) {
                        if (module0765.NIL != f48559(var184, var10)) {
                            var165 = (SubLObject)ConsesLow.cons(var184, var165);
                            var164 = var162;
                        }
                        var183 = var183.rest();
                        var184 = var183.first();
                    }
                }
            }
            if (module0765.NIL == var165 && module0765.NIL == var164) {
                SubLObject var167 = var166;
                SubLObject var168 = (SubLObject)module0765.NIL;
                var168 = var167.first();
                while (module0765.NIL == var164 && module0765.NIL != var167) {
                    if (module0765.NIL != f48559(var168, var10)) {
                        var165 = (SubLObject)ConsesLow.cons(var168, var165);
                        var164 = var162;
                    }
                    var167 = var167.rest();
                    var168 = var167.first();
                }
            }
        }
        var165 = Sequences.remove_if((SubLObject)module0765.$ic114$, var165, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != module0751.f46599()) {
            var165 = Sort.sort(var165, (SubLObject)module0765.$ic115$, (SubLObject)module0765.UNPROVIDED);
        }
        return Sequences.nreverse(var165);
    }
    
    public static SubLObject f48562(final SubLObject var161, SubLObject var162, SubLObject var235) {
        if (var162 == module0765.UNPROVIDED) {
            var162 = (SubLObject)module0765.NIL;
        }
        if (var235 == module0765.UNPROVIDED) {
            var235 = module0765.$ic88$;
        }
        final SubLThread var236 = SubLProcess.currentSubLThread();
        SubLObject var237 = (SubLObject)module0765.NIL;
        SubLObject var238 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.THREE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic116$, var161, module0579.$g4260$.getDynamicValue(var236));
        }
        final SubLObject var239 = module0147.f9540(module0579.$g4260$.getDynamicValue(var236));
        final SubLObject var240 = module0147.$g2095$.currentBinding(var236);
        final SubLObject var241 = module0147.$g2094$.currentBinding(var236);
        final SubLObject var242 = module0147.$g2096$.currentBinding(var236);
        try {
            module0147.$g2095$.bind(module0147.f9545(var239), var236);
            module0147.$g2094$.bind(module0147.f9546(var239), var236);
            module0147.$g2096$.bind(module0147.f9549(var239), var236);
            final SubLObject var243 = module0219.f14510(var161, (SubLObject)module0765.ONE_INTEGER, var235, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL == var243) {
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic117$, new SubLObject[] { var235, var161, module0579.$g4260$.getDynamicValue(var236) });
                }
            }
            else if (module0765.NIL == var238) {
                SubLObject var244 = var243;
                SubLObject var245 = (SubLObject)module0765.NIL;
                var245 = var244.first();
                while (module0765.NIL == var238 && module0765.NIL != var244) {
                    var237 = (SubLObject)ConsesLow.cons(var245, var237);
                    var238 = var162;
                    var244 = var244.rest();
                    var245 = var244.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var242, var236);
            module0147.$g2094$.rebind(var241, var236);
            module0147.$g2095$.rebind(var240, var236);
        }
        return Values.values(var237, var238);
    }
    
    public static SubLObject f48563(final SubLObject var237) {
        final SubLObject var238 = module0228.f15229(module0205.f13136(var237));
        final SubLObject var239 = module0205.f13207(var237, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var240 = f48548(var238, var239, (SubLObject)module0765.T);
        final SubLObject var241 = (SubLObject)((module0765.NIL != var240.first()) ? module0538.f33478(var240.first(), (SubLObject)module0765.UNPROVIDED) : module0765.NIL);
        if (module0765.NIL != var241 && !module0205.f13203(var241, (SubLObject)module0765.UNPROVIDED).eql(var238) && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic118$, var238, module0205.f13203(var241, (SubLObject)module0765.UNPROVIDED));
        }
        return var241;
    }
    
    public static SubLObject f48521(final SubLObject var33, SubLObject var11, SubLObject var117, SubLObject var145, SubLObject var239) {
        if (var11 == module0765.UNPROVIDED) {
            var11 = (SubLObject)module0765.NIL;
        }
        if (var117 == module0765.UNPROVIDED) {
            var117 = (SubLObject)module0765.NIL;
        }
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        if (var239 == module0765.UNPROVIDED) {
            var239 = (SubLObject)module0765.NIL;
        }
        final SubLThread var240 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic119$, new SubLObject[] { var33, var11, module0751.f46599() });
        }
        if (!var11.isList()) {
            var11 = (SubLObject)ConsesLow.list(var11);
        }
        final SubLObject var241 = (SubLObject)((module0765.NIL != var117) ? module0205.f13215(Symbols.symbol_function((SubLObject)module0765.$ic120$), var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) : module0765.NIL);
        final SubLObject var242 = Sequences.find_if((SubLObject)module0765.$ic10$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var243 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0765.$ic121$), var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var244 = f48564(var11);
        final SubLObject var245 = module0756.f47484(module0756.f47463(module0228.f15229(var33), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        SubLObject var246 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0756.f47497(var239, (SubLObject)module0765.UNPROVIDED)) {
            module0756.f47623(var245, var239);
            module0756.f47836(var245, var239);
        }
        module0751.f46742(var245, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != var244) {
            final SubLObject var247 = (SubLObject)((module0765.NIL != var242) ? conses_high.nthcdr(var242, module0205.f13180(var117, (SubLObject)module0765.UNPROVIDED)) : ConsesLow.list(var33));
            final SubLObject var248 = Sequences.remove_if((SubLObject)module0765.$ic122$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            var246 = f48520(var247, var248, var244, (SubLObject)module0765.UNPROVIDED);
        }
        else if (module0765.NIL != var243) {
            final SubLObject var249 = var241.eql((SubLObject)module0765.ONE_INTEGER) ? var243.first() : conses_high.second(var243);
            var246 = (SubLObject)ConsesLow.list(module0749.f46446(var249, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        }
        else {
            var246 = f48565(var245, var33, var117, var241, var11, module0579.$g4259$.getDynamicValue(var240), module0751.f46599());
            if (module0765.NIL != module0756.f47600(var246)) {
                var246 = f48566(var246, var11, var33, var145);
            }
        }
        if (module0765.NIL != module0756.f47600(var246)) {
            module0756.f47501(var245, var246, (SubLObject)module0765.UNPROVIDED);
            module0756.f47608(var245);
            module0755.f47456(var245);
        }
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic123$, var246);
        }
        return var246;
    }
    
    public static SubLObject f48567(final SubLObject var107) {
        return module0269.f17737(var107);
    }
    
    public static SubLObject f48564(final SubLObject var11) {
        return Sequences.find_if((SubLObject)module0765.$ic122$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48565(final SubLObject var243, final SubLObject var33, final SubLObject var117, final SubLObject var240, final SubLObject var246, final SubLObject var247, final SubLObject var248) {
        final SubLThread var249 = SubLProcess.currentSubLThread();
        final SubLObject var250 = module0756.f47484(var243, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var251 = module0751.f47049(var33);
        assert module0765.NIL != module0751.f46598(var248) : var248;
        final SubLObject var252 = module0579.$g4254$.currentBinding(var249);
        try {
            module0579.$g4254$.bind(var248, var249);
            if (var33.isInteger() && module0765.NIL != var117 && var246.first().isInteger() && module0765.NIL != module0751.f47064(module0205.f13136(var117), var246.first(), module0765.$ic125$)) {
                module0767.f48912(var250);
            }
            else if (var33.isInteger() && module0765.NIL != var117 && var246.first().isInteger() && module0765.NIL != module0751.f47064(module0205.f13136(var117), var246.first(), module0765.$ic126$)) {
                module0767.f48914(var250, (SubLObject)module0765.UNPROVIDED);
            }
            else if (module0765.NIL != var251 && module0765.NIL == module0762.f48227(var33)) {
                if (module0765.NIL != module0762.f48210(var33)) {
                    final SubLObject var253 = f48565(var243, var33, var117, var240, var246, var247, var248);
                    if (module0765.NIL != module0756.f47466(var253)) {
                        module0756.f47501(var250, var253, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47608(var250);
                    }
                }
                else {
                    final SubLObject var254 = (SubLObject)module0765.$ic127$;
                    final SubLObject var255 = PrintLow.format((SubLObject)module0765.NIL, var254, module0205.f13144(var33));
                    module0756.f47723(var250, var255);
                }
                module0756.f47715(var250);
            }
            else {
                final SubLObject var256 = (SubLObject)module0765.NIL;
                final SubLObject var18_255 = module0579.$g4259$.currentBinding(var249);
                try {
                    module0579.$g4259$.bind(var247, var249);
                    if (module0765.NIL != module0206.f13497(var33) && module0765.NIL != module0202.f12590(var117)) {
                        f48568(var33, var117);
                    }
                    if (module0765.NIL != var256) {
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic128$, var256);
                        }
                        module0756.f47784(var250, var256, (SubLObject)module0765.UNPROVIDED);
                    }
                    module0770.f49065(var250, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                }
                finally {
                    module0579.$g4259$.rebind(var18_255, var249);
                }
            }
        }
        finally {
            module0579.$g4254$.rebind(var252, var249);
        }
        return (SubLObject)((module0765.NIL != module0756.f47479(var250)) ? module0756.f47467(var250) : module0765.$ic7$);
    }
    
    public static SubLObject f48569(final SubLObject var106, final SubLObject var256) {
        final SubLObject var257 = module0756.f47691(var106);
        final SubLObject var258 = f48570(var256, var257, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var259 = module0756.f47480(var106, (SubLObject)module0765.NIL);
        final SubLObject var260 = module0751.f46638(var258, var259, var257);
        if (module0765.NIL != module0038.f2653(var260)) {
            final SubLObject var261 = module0772.f49212(var260);
            final SubLObject var262 = module0756.f47467(var106);
            module0756.f47501(var106, (SubLObject)ConsesLow.cons(var261, var262), (SubLObject)module0765.UNPROVIDED);
        }
        return module0756.f47480(var106, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48566(final SubLObject var120, final SubLObject var11, final SubLObject var33, final SubLObject var145) {
        final SubLObject var146 = Sequences.find_if((SubLObject)module0765.$ic10$, var11, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var147 = (SubLObject)((module0765.NIL != var146) ? ConsesLow.list(var146) : module0765.NIL);
        SubLObject var148 = (SubLObject)module0765.NIL;
        SubLObject var149 = (SubLObject)module0765.NIL;
        SubLObject var150 = (SubLObject)module0765.NIL;
        SubLObject var151 = (SubLObject)module0765.NIL;
        var149 = var120;
        var150 = var149.first();
        for (var151 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var149; var149 = var149.rest(), var150 = var149.first(), var151 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var151)) {
            final SubLObject var152 = module0749.f46462(var150);
            if (module0765.NIL == module0751.f46829(var152) && module0765.NIL == f48571(var150, var33)) {
                final SubLObject var153 = module0751.f47204(var147, var152);
                final SubLObject var154 = module0751.f46982(var153, var145);
                module0749.f46464(var150, var154);
            }
            if (module0765.NIL != module0035.f1997(var120) && module0765.NIL != var147 && module0765.NIL != module0751.f46829(var152)) {
                module0756.f47719(var150, var33);
            }
            var148 = (SubLObject)ConsesLow.cons(var150, var148);
        }
        return Sequences.nreverse(var148);
    }
    
    public static SubLObject f48572(final SubLObject var91) {
        final SubLObject var92 = module0749.f46455(var91);
        final SubLObject var93 = module0749.f46430(var91);
        final SubLObject var94 = (SubLObject)((module0765.NIL != var93) ? module0728.f44500(var92) : module0765.NIL);
        if (var94.isString()) {
            final SubLObject var95 = module0749.f46447(var91);
            module0749.f46457(var95, var94);
            return var95;
        }
        final SubLObject var96 = module0749.f46470(var91);
        final SubLObject var97 = module0728.f44501(var92, var96);
        return module0749.f46461(var91, var97);
    }
    
    public static SubLObject f48573(final SubLObject var91, final SubLObject var271) {
        final SubLObject var272 = module0728.f44505(var271);
        return module0749.f46458(var91, Sequences.cconcatenate(var272, (SubLObject)module0765.$ic3$));
    }
    
    public static SubLObject f48574(final SubLObject var91, final SubLObject var271) {
        final SubLObject var272 = f48575(var271);
        return module0749.f46458(var91, Sequences.cconcatenate(var272, (SubLObject)module0765.$ic3$));
    }
    
    public static SubLObject f48575(final SubLObject var273) {
        if (module0765.NIL == module0206.f13497(var273)) {
            final SubLObject var274 = module0751.f46851((SubLObject)module0765.$ic129$, (SubLObject)ConsesLow.list(module0765.$ic130$, var273));
            final SubLObject var275 = (SubLObject)((module0765.NIL != var274) ? module0765.NIL : module0751.f46851((SubLObject)ConsesLow.list(module0765.$ic130$, var273), (SubLObject)module0765.$ic129$));
            if (module0765.NIL != var275) {
                return (SubLObject)module0765.$ic131$;
            }
            if (module0765.NIL != var274) {
                return (SubLObject)module0765.$ic132$;
            }
        }
        return (SubLObject)module0765.$ic133$;
    }
    
    public static SubLObject f48571(final SubLObject var91, final SubLObject var33) {
        final SubLObject var92 = module0749.f46466(var91);
        final SubLObject var93 = module0749.f46462(var91);
        SubLObject var94 = (SubLObject)module0765.NIL;
        if (var93.equal(module0756.f47773()) && (module0765.NIL == module0202.f12590(var33) || !var92.equal(module0205.f13394(var33, var93, (SubLObject)module0765.UNPROVIDED)))) {
            var94 = (SubLObject)module0765.T;
        }
        return var94;
    }
    
    public static SubLObject f48570(final SubLObject var2, SubLObject var108, SubLObject var278) {
        if (var108 == module0765.UNPROVIDED) {
            var108 = (SubLObject)module0765.NIL;
        }
        if (var278 == module0765.UNPROVIDED) {
            var278 = (SubLObject)module0765.T;
        }
        final SubLThread var279 = SubLProcess.currentSubLThread();
        SubLObject var280 = (SubLObject)module0765.NIL;
        SubLObject var281 = (SubLObject)module0765.NIL;
        SubLObject var282 = (SubLObject)module0765.NIL;
        final SubLObject var283 = module0147.f9540(module0579.$g4260$.getDynamicValue(var279));
        final SubLObject var284 = module0147.$g2095$.currentBinding(var279);
        final SubLObject var285 = module0147.$g2094$.currentBinding(var279);
        final SubLObject var286 = module0147.$g2096$.currentBinding(var279);
        try {
            module0147.$g2095$.bind(module0147.f9545(var283), var279);
            module0147.$g2094$.bind(module0147.f9546(var283), var279);
            module0147.$g2096$.bind(module0147.f9549(var283), var279);
            if (module0765.NIL == var282) {
                SubLObject var287 = var2;
                SubLObject var288 = (SubLObject)module0765.NIL;
                var288 = var287.first();
                while (module0765.NIL == var282 && module0765.NIL != var287) {
                    if (module0765.NIL == var108 || (module0765.NIL != module0173.f10955(var288) && module0765.NIL != module0751.f46849(var108, var288, (SubLObject)module0765.UNPROVIDED))) {
                        var282 = (SubLObject)module0765.T;
                        var280 = Sequences.find_if((SubLObject)module0765.$ic134$, var2, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        var281 = Sequences.find_if((SubLObject)module0765.$ic135$, var2, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                    }
                    else if (var288.isList()) {
                        var279.resetMultipleValues();
                        final SubLObject var289 = f48570(var288, var108, (SubLObject)module0765.NIL);
                        final SubLObject var290 = var279.secondMultipleValue();
                        var279.resetMultipleValues();
                        if (module0765.NIL != var290) {
                            final SubLObject var291 = var289;
                            var280 = var291.first();
                            var281 = conses_high.cadr(var291);
                            var282 = (SubLObject)module0765.T;
                        }
                    }
                    var287 = var287.rest();
                    var288 = var287.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var286, var279);
            module0147.$g2094$.rebind(var285, var279);
            module0147.$g2095$.rebind(var284, var279);
        }
        if (module0765.NIL == var282 && module0765.NIL != var278) {
            var280 = Sequences.find_if((SubLObject)module0765.$ic134$, var2, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            var281 = Sequences.find_if((SubLObject)module0765.$ic135$, var2, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        return Values.values((SubLObject)((module0765.NIL != var280) ? ConsesLow.list(var280, var281) : module0765.NIL), var282);
    }
    
    public static SubLObject f48576(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0765.NIL;
        if (module0765.NIL == module0751.f46639(var1)) {
            if (var1.isKeyword() || (var1.isCons() && var1.first().isKeyword())) {
                var2 = var1;
            }
            else if (module0765.NIL != constant_handles_oc.f8463(var1, (SubLObject)module0765.UNPROVIDED)) {
                var2 = var1;
            }
            else if (var1.isCons() && module0765.NIL != constant_handles_oc.f8463(var1.first(), (SubLObject)module0765.UNPROVIDED)) {
                var2 = var1;
            }
        }
        return var2;
    }
    
    public static SubLObject f48577(final SubLObject var2) {
        return Sequences.remove((SubLObject)module0765.NIL, module0035.f2119(Mapping.mapcar((SubLObject)module0765.$ic136$, var2)), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48578(final SubLObject var2, SubLObject var284) {
        if (var284 == module0765.UNPROVIDED) {
            var284 = (SubLObject)module0765.NIL;
        }
        SubLObject var285 = f48577(var2);
        if (module0765.NIL != var284) {
            var285 = ConsesLow.append((SubLObject)module0765.$ic137$, var285);
        }
        return var285;
    }
    
    public static SubLObject f48551(SubLObject var133, final SubLObject var285) {
        if (module0765.NIL == var133) {
            var133 = module0035.f2160(var285, (SubLObject)module0765.ONE_INTEGER);
        }
        if (module0765.NIL != Sequences.find_if((SubLObject)module0765.$ic138$, var133, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var286 = conses_high.copy_list(var133);
            SubLObject var287 = (SubLObject)module0765.NIL;
            SubLObject var288 = (SubLObject)module0765.NIL;
            SubLObject var289 = (SubLObject)module0765.NIL;
            var287 = var133;
            var288 = var287.first();
            for (var289 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var287; var287 = var287.rest(), var288 = var287.first(), var289 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var289)) {
                if (var288.isAtom()) {
                    ConsesLow.set_nth(var289, var286, (SubLObject)ConsesLow.list(var288));
                }
            }
            var133 = var286;
        }
        return var133;
    }
    
    public static SubLObject f48554(final SubLObject var117, final SubLObject var108, final SubLObject var10, SubLObject var133, SubLObject var145, SubLObject var106) {
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        if (var106 == module0765.UNPROVIDED) {
            var106 = (SubLObject)module0765.NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = (SubLObject)module0765.NIL;
        SubLObject var148 = (SubLObject)module0765.NIL;
        SubLObject var149 = (SubLObject)module0765.NIL;
        var133 = f48551(var133, module0202.f12725(var117, (SubLObject)module0765.$ic79$));
        SubLObject var150 = (SubLObject)module0765.NIL;
        final SubLObject var151 = module0580.$g4361$.currentBinding(var146);
        try {
            module0580.$g4361$.bind((SubLObject)module0765.NIL, var146);
            var146.resetMultipleValues();
            final SubLObject var18_289 = module0580.$g4362$.currentBinding(var146);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var146);
                final SubLObject var152 = var146.secondMultipleValue();
                var146.resetMultipleValues();
                try {
                    var146.resetMultipleValues();
                    final SubLObject var18_290 = module0580.$g4358$.currentBinding(var146);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var146);
                        final SubLObject var153 = var146.secondMultipleValue();
                        var146.resetMultipleValues();
                        final SubLObject var18_291 = module0580.$g4359$.currentBinding(var146);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var146);
                            final SubLObject var154 = module0580.$g4358$.getDynamicValue(var146);
                            final SubLObject var18_292 = module0034.$g879$.currentBinding(var146);
                            try {
                                module0034.$g879$.bind(var154, var146);
                                SubLObject var155 = (SubLObject)module0765.NIL;
                                if (module0765.NIL != var154 && module0765.NIL == module0034.f1842(var154)) {
                                    var155 = module0034.f1869(var154);
                                    final SubLObject var156 = Threads.current_process();
                                    if (module0765.NIL == var155) {
                                        module0034.f1873(var154, var156);
                                    }
                                    else if (!var155.eql(var156)) {
                                        Errors.error((SubLObject)module0765.$ic8$);
                                    }
                                }
                                try {
                                    SubLObject var28_293 = (SubLObject)module0765.NIL;
                                    SubLObject var157 = (SubLObject)module0765.NIL;
                                    final SubLObject var18_293 = module0579.$g4237$.currentBinding(var146);
                                    try {
                                        module0579.$g4237$.bind((module0765.NIL != module0579.$g4237$.getDynamicValue(var146)) ? module0579.$g4237$.getDynamicValue(var146) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQUALP), (SubLObject)module0765.UNPROVIDED), var146);
                                        module0753.f47251((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic9$, module0751.f46599(), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                        SubLObject var158 = (SubLObject)module0765.NIL;
                                        SubLObject var159 = (SubLObject)module0765.NIL;
                                        SubLObject var160 = (SubLObject)module0765.NIL;
                                        var158 = var10;
                                        var159 = var158.first();
                                        for (var160 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL == var157 && module0765.NIL != var158; var158 = var158.rest(), var159 = var158.first(), var160 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var160)) {
                                            final SubLObject var161 = f48579(var159, module0048.f_1X(var160), var133, var117, var145, var106);
                                            module0753.f47252(var160, var161);
                                            if (module0765.NIL != module0756.f47600(var161)) {
                                                var28_293 = (SubLObject)ConsesLow.cons(var161, var28_293);
                                            }
                                            else {
                                                var157 = (SubLObject)module0765.T;
                                            }
                                        }
                                        if (module0765.NIL != var157) {
                                            var150 = (SubLObject)module0765.$ic7$;
                                        }
                                        else {
                                            var28_293 = Sequences.nreverse(var28_293);
                                            SubLObject var163;
                                            final SubLObject var162 = var163 = module0753.f47258(var28_293);
                                            SubLObject var164 = (SubLObject)module0765.NIL;
                                            var164 = var163.first();
                                            while (module0765.NIL != var163) {
                                                module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic11$, var164, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                final SubLObject var165 = module0753.f47256(var164, var10);
                                                SubLObject var37_295 = var164;
                                                SubLObject var166 = (SubLObject)module0765.NIL;
                                                var166 = var37_295.first();
                                                while (module0765.NIL != var37_295) {
                                                    final SubLObject var167 = ConsesLow.nth(var166, var10);
                                                    module0753.f47251((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic12$, var167, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                    final SubLObject var168 = module0751.f46608(var167, var165);
                                                    final SubLObject var169 = module0753.f47253(var166, var28_293);
                                                    SubLObject var170 = (SubLObject)module0765.NIL;
                                                    if (!var168.equal(module0751.f46599())) {
                                                        module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic13$, var168, var167, (SubLObject)module0765.UNPROVIDED);
                                                        assert module0765.NIL != module0751.f46598(var168) : var168;
                                                        final SubLObject var18_294 = module0579.$g4254$.currentBinding(var146);
                                                        final SubLObject var171 = module0579.$g4287$.currentBinding(var146);
                                                        try {
                                                            module0579.$g4254$.bind(var168, var146);
                                                            module0579.$g4287$.bind(var169, var146);
                                                            var170 = f48579(var167, module0048.f_1X(var166), var133, var117, var145, var106);
                                                        }
                                                        finally {
                                                            module0579.$g4287$.rebind(var171, var146);
                                                            module0579.$g4254$.rebind(var18_294, var146);
                                                        }
                                                        module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic15$, var168, var167, var170);
                                                    }
                                                    if (var168.isList() && (module0765.NIL == var170 || module0765.NIL != module0753.f47255(var170, ConsesLow.nth(var166, var28_293)))) {
                                                        module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic16$, var167, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                        assert module0765.NIL != module0751.f46598((SubLObject)module0765.T) : module0765.T;
                                                        final SubLObject var18_295 = module0579.$g4254$.currentBinding(var146);
                                                        final SubLObject var171 = module0579.$g4237$.currentBinding(var146);
                                                        final SubLObject var172 = module0579.$g4287$.currentBinding(var146);
                                                        try {
                                                            module0579.$g4254$.bind((SubLObject)module0765.T, var146);
                                                            module0579.$g4237$.bind((module0765.NIL != module0579.$g4237$.getDynamicValue(var146)) ? module0579.$g4237$.getDynamicValue(var146) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQUALP), (SubLObject)module0765.UNPROVIDED), var146);
                                                            module0579.$g4287$.bind(var169, var146);
                                                            var170 = f48579(var167, module0048.f_1X(var166), var133, var117, var145, var106);
                                                        }
                                                        finally {
                                                            module0579.$g4287$.rebind(var172, var146);
                                                            module0579.$g4237$.rebind(var171, var146);
                                                            module0579.$g4254$.rebind(var18_295, var146);
                                                        }
                                                        module0753.f47251((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic17$, var167, var170, (SubLObject)module0765.UNPROVIDED);
                                                    }
                                                    if (module0765.NIL != module0753.f47254(var170, ConsesLow.nth(var166, var28_293), var167)) {
                                                        module0753.f47251((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic18$, var167, ConsesLow.nth(var166, var28_293), var170);
                                                        ConsesLow.set_nth(var166, var28_293, var170);
                                                        module0753.f47252(var166, var170);
                                                    }
                                                    var37_295 = var37_295.rest();
                                                    var166 = var37_295.first();
                                                }
                                                var163 = var163.rest();
                                                var164 = var163.first();
                                            }
                                            SubLObject var173 = var10;
                                            var159 = (SubLObject)module0765.NIL;
                                            var159 = var173.first();
                                            while (module0765.NIL != var173) {
                                                module0755.f47385(var159);
                                                var173 = var173.rest();
                                                var159 = var173.first();
                                            }
                                            var150 = ConsesLow.append(var150, var28_293);
                                        }
                                    }
                                    finally {
                                        module0579.$g4237$.rebind(var18_293, var146);
                                    }
                                }
                                finally {
                                    final SubLObject var18_296 = Threads.$is_thread_performing_cleanupP$.currentBinding(var146);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var146);
                                        if (module0765.NIL != var154 && module0765.NIL == var155) {
                                            module0034.f1873(var154, (SubLObject)module0765.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_296, var146);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var18_292, var146);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var18_291, var146);
                        }
                        if (var153 == module0765.$ic19$ && module0765.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var146))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var146));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var18_290, var146);
                    }
                }
                finally {
                    final SubLObject var18_297 = Threads.$is_thread_performing_cleanupP$.currentBinding(var146);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var146);
                        if (module0765.NIL == var152) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var146));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_297, var146);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var18_289, var146);
            }
        }
        finally {
            module0580.$g4361$.rebind(var151, var146);
        }
        if (!var150.isList()) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0765.$ic139$, var10, var133);
            }
            return (SubLObject)module0765.$ic7$;
        }
        var150 = module0035.remove_if_not((SubLObject)module0765.$ic140$, var150, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var174 = module0035.find_if_not(Symbols.symbol_function((SubLObject)module0765.$ic141$), var150, (SubLObject)module0765.$ic142$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != var174) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0765.$ic143$, var174);
            }
            return (SubLObject)module0765.$ic7$;
        }
        SubLObject var175 = var133;
        SubLObject var176 = (SubLObject)module0765.NIL;
        var176 = var175.first();
        while (module0765.NIL != var175) {
            final SubLObject var177 = Sequences.find_if(Symbols.symbol_function((SubLObject)module0765.$ic10$), var176, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var178 = module0579.$g4249$.currentBinding(var146);
            try {
                module0579.$g4249$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.$g4249$.getDynamicValue(var146) && module0765.NIL == Sequences.find(var177, var148, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)), var146);
                final SubLObject var179 = (SubLObject)((module0765.NIL != var177) ? module0205.f13134(var117, var177, (SubLObject)module0765.$ic79$) : module0765.NIL);
                SubLObject var180 = (SubLObject)module0765.NIL;
                SubLObject var181 = (SubLObject)module0765.NIL;
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic144$, var179, var147);
                }
                if (module0765.NIL != module0579.$g4249$.getDynamicValue(var146)) {
                    var146.resetMultipleValues();
                    final SubLObject var303_304 = f48580(var179, var147);
                    final SubLObject var305_306 = var146.secondMultipleValue();
                    var146.resetMultipleValues();
                    var180 = var303_304;
                    var181 = var305_306;
                }
                if (module0765.NIL != module0579.$g4249$.getDynamicValue(var146) && (!var179.equal(var180) || module0765.NIL != var181)) {
                    assert module0765.NIL != module0751.f46598(module0751.f46607(var177, var117)) : module0751.f46607(var177, var117);
                    final SubLObject var18_298 = module0579.$g4254$.currentBinding(var146);
                    try {
                        module0579.$g4254$.bind(module0751.f46607(var177, var117), var146);
                        var149 = (SubLObject)ConsesLow.cons(f48521(var179, ConsesLow.append(var181, var176), var117, var145, var106), var149);
                    }
                    finally {
                        module0579.$g4254$.rebind(var18_298, var146);
                    }
                }
                else if (module0765.NIL != module0004.f105(var177)) {
                    SubLObject var182 = f48581(var150, var177);
                    if (module0765.NIL != module0004.f104(var182, var149, Symbols.symbol_function((SubLObject)module0765.EQUAL), (SubLObject)module0765.UNPROVIDED)) {
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic145$, var182);
                        }
                        var182 = Mapping.mapcar((SubLObject)module0765.$ic146$, var182);
                    }
                    var149 = (SubLObject)ConsesLow.cons(var182, var149);
                }
                else {
                    var149 = (SubLObject)ConsesLow.cons(f48521(var179, var176, var117, var145, var106), var149);
                }
                var147 = (SubLObject)ConsesLow.cons(var179, var147);
                if (module0765.NIL != var177) {
                    var148 = (SubLObject)ConsesLow.cons(var177, var148);
                }
            }
            finally {
                module0579.$g4249$.rebind(var178, var146);
            }
            var175 = var175.rest();
            var176 = var175.first();
        }
        var149 = Sequences.nreverse(var149);
        return var149;
    }
    
    public static SubLObject f48581(final SubLObject var16, final SubLObject var50) {
        return ConsesLow.nth(module0048.f_1_(var50), var16);
    }
    
    public static SubLObject f48579(final SubLObject var33, final SubLObject var80, final SubLObject var133, final SubLObject var117, SubLObject var145, SubLObject var106) {
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        if (var106 == module0765.UNPROVIDED) {
            var106 = (SubLObject)module0765.NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0756.f47497(var106, (SubLObject)module0765.UNPROVIDED) && module0579.f35487().isPositive() && !module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED).equal(module0579.f35508()) && module0765.NIL == module0756.f47497(module0756.f47633(var106), (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0765.$ic147$, var106);
        }
        final SubLObject var147 = conses_high.assoc(var80, var133, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        SubLObject var148 = (SubLObject)module0765.NIL;
        assert module0765.NIL != module0751.f46598(module0751.f46607(var80, var117)) : module0751.f46607(var80, var117);
        final SubLObject var149 = module0579.$g4254$.currentBinding(var146);
        try {
            module0579.$g4254$.bind(module0751.f46607(var80, var117), var146);
            var148 = (SubLObject)((module0765.NIL != var147) ? f48521(var33, var147, var117, var145, var106) : module0765.NIL);
        }
        finally {
            module0579.$g4254$.rebind(var149, var146);
        }
        return var148;
    }
    
    public static SubLObject f48580(final SubLObject var33, final SubLObject var287) {
        final SubLThread var288 = SubLProcess.currentSubLThread();
        SubLObject var289 = (SubLObject)module0765.NIL;
        SubLObject var290 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0202.f12589(var33, module0765.$ic148$)) {
            final SubLObject var291 = module0205.f13203(var33, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var292 = module0147.f9540(module0579.$g4262$.getDynamicValue(var288));
            final SubLObject var293 = module0147.$g2095$.currentBinding(var288);
            final SubLObject var294 = module0147.$g2094$.currentBinding(var288);
            final SubLObject var295 = module0147.$g2096$.currentBinding(var288);
            try {
                module0147.$g2095$.bind(module0147.f9545(var292), var288);
                module0147.$g2094$.bind(module0147.f9546(var292), var288);
                module0147.$g2096$.bind(module0147.f9549(var292), var288);
                if (module0765.NIL != module0202.f12589(var291, module0765.$ic149$) && module0765.NIL != module0751.f46849(module0205.f13204(var291, (SubLObject)module0765.UNPROVIDED), module0765.$ic150$, (SubLObject)module0765.UNPROVIDED) && module0765.NIL == var289) {
                    SubLObject var296 = var287;
                    SubLObject var297 = (SubLObject)module0765.NIL;
                    var297 = var296.first();
                    while (module0765.NIL == var289 && module0765.NIL != var296) {
                        if (var297.equalp(module0205.f13205(var291, (SubLObject)module0765.UNPROVIDED))) {
                            final SubLObject var298 = module0767.f48968(var297);
                            final SubLObject var299 = module0767.f48971(var297);
                            final SubLObject var300 = f48582(var298, var299);
                            var289 = module0205.f13203(var291, (SubLObject)module0765.UNPROVIDED);
                            var290 = (SubLObject)ConsesLow.list((SubLObject)module0765.$ic151$, var300);
                        }
                        var296 = var296.rest();
                        var297 = var296.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var295, var288);
                module0147.$g2094$.rebind(var294, var288);
                module0147.$g2095$.rebind(var293, var288);
            }
        }
        else if (module0765.NIL != module0202.f12589(var33, module0765.$ic152$)) {
            final SubLObject var291 = module0205.f13203(var33, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var292 = module0147.f9540(module0579.$g4262$.getDynamicValue(var288));
            final SubLObject var293 = module0147.$g2095$.currentBinding(var288);
            final SubLObject var294 = module0147.$g2094$.currentBinding(var288);
            final SubLObject var295 = module0147.$g2096$.currentBinding(var288);
            try {
                module0147.$g2095$.bind(module0147.f9545(var292), var288);
                module0147.$g2094$.bind(module0147.f9546(var292), var288);
                module0147.$g2096$.bind(module0147.f9549(var292), var288);
                if (module0765.NIL != module0202.f12589(var291, module0765.$ic149$) && module0765.NIL != module0751.f46849(module0205.f13204(var291, (SubLObject)module0765.UNPROVIDED), module0765.$ic150$, (SubLObject)module0765.UNPROVIDED)) {
                    final SubLObject var301 = module0205.f13205(var291, (SubLObject)module0765.UNPROVIDED);
                    if (module0765.NIL == var289) {
                        SubLObject var302 = var287;
                        SubLObject var303 = (SubLObject)module0765.NIL;
                        var303 = var302.first();
                        while (module0765.NIL == var289 && module0765.NIL != var302) {
                            if (module0765.NIL != module0202.f12589(var303, module0765.$ic152$) && module0765.NIL != module0751.f46684(var301, module0205.f13203(var303, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED)) {
                                var289 = module0205.f13203(var291, (SubLObject)module0765.UNPROVIDED);
                                var290 = (SubLObject)module0765.$ic153$;
                            }
                            var302 = var302.rest();
                            var303 = var302.first();
                        }
                    }
                }
                else if (module0765.NIL == var289) {
                    SubLObject var296 = var287;
                    SubLObject var297 = (SubLObject)module0765.NIL;
                    var297 = var296.first();
                    while (module0765.NIL == var289 && module0765.NIL != var296) {
                        if (module0765.NIL != module0202.f12589(var297, module0765.$ic148$) && module0765.NIL != module0751.f46684(var297, var291, (SubLObject)module0765.UNPROVIDED)) {
                            var289 = var291;
                            var290 = (SubLObject)module0765.$ic154$;
                        }
                        var296 = var296.rest();
                        var297 = var296.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var295, var288);
                module0147.$g2094$.rebind(var294, var288);
                module0147.$g2095$.rebind(var293, var288);
            }
        }
        else if (module0765.NIL == module0751.f46877(var33) && var287.equalp((SubLObject)ConsesLow.list(var33))) {
            final SubLObject var304 = module0767.f48968(var33);
            final SubLObject var305 = module0767.f48971(var33);
            var289 = f48583(var304, var305);
        }
        return (module0765.NIL != var289) ? Values.values(var289, var290) : Values.values(var33, (SubLObject)module0765.NIL);
    }
    
    public static SubLObject f48583(final SubLObject var312, final SubLObject var240) {
        final SubLThread var313 = SubLProcess.currentSubLThread();
        final SubLObject var314 = module0764.f48485(module0765.$ic155$, var240, var312);
        final SubLObject var315 = module0764.f48501(var314, module0765.$ic156$);
        SubLObject var316 = (SubLObject)module0765.NIL;
        SubLObject var317 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0212.f13762(var315)) {
            var317 = module0764.f48502(var315);
            final SubLObject var318 = module0147.f9540(module0579.$g4260$.getDynamicValue(var313));
            final SubLObject var319 = module0147.$g2095$.currentBinding(var313);
            final SubLObject var320 = module0147.$g2094$.currentBinding(var313);
            final SubLObject var321 = module0147.$g2096$.currentBinding(var313);
            try {
                module0147.$g2095$.bind(module0147.f9545(var318), var313);
                module0147.$g2094$.bind(module0147.f9546(var318), var313);
                module0147.$g2096$.bind(module0147.f9549(var318), var313);
                var316 = (SubLObject)((module0765.NIL != var317) ? module0764.f48466(var317, module0765.$ic156$).first() : module0765.NIL);
            }
            finally {
                module0147.$g2096$.rebind(var321, var313);
                module0147.$g2094$.rebind(var320, var313);
                module0147.$g2095$.rebind(var319, var313);
            }
        }
        return var316;
    }
    
    public static SubLObject f48582(final SubLObject var312, final SubLObject var240) {
        SubLObject var313 = (SubLObject)module0765.NIL;
        final SubLObject var314 = module0764.f48485(module0765.$ic155$, var240, var312);
        final SubLObject var315 = module0764.f48501(var314, module0765.$ic156$);
        var313 = module0764.f48502(var315);
        return var313;
    }
    
    public static SubLObject f48584(final SubLObject var106) {
        final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != f48585(var107)) {
            SubLObject var108 = (SubLObject)module0765.NIL;
            if (module0765.NIL != module0762.f48172(var107)) {
                var108 = f48586(var107, module0756.f47511(var106));
                if (module0765.NIL != module0612.f37382(var107)) {
                    var108 = f48587(var108);
                }
            }
            final SubLObject var109 = f48588(var107);
            module0756.f47745(var106, var109);
            var108 = ConsesLow.append(var108, f48589(var106));
            if (module0765.NIL != module0756.f47466(var108)) {
                module0756.f47501(var106, var108, (SubLObject)module0765.UNPROVIDED);
                module0756.f47608(var106);
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48590(final SubLObject var106) {
        if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var108 = module0751.f47211(module0756.f47511(var106));
            final SubLObject var109 = f48591(var107, var108);
            module0756.f47501(var106, var109, (SubLObject)module0765.UNPROVIDED);
            module0756.f47608(var106);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48591(final SubLObject var320, final SubLObject var319) {
        final SubLObject var321 = module0205.f13277(var320, (SubLObject)module0765.UNPROVIDED);
        SubLObject var322 = print_high.princ_to_string(var321);
        if (module0765.NIL != module0751.f46605()) {
            var322 = f48592(var322, (SubLObject)module0765.$ic161$);
        }
        final SubLObject var323 = (SubLObject)ConsesLow.list(module0749.f46446(var322, var319, var320, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL));
        return var323;
    }
    
    public static SubLObject f48593(final SubLObject var106) {
        if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var108 = module0751.f46982((SubLObject)module0765.$ic164$, module0756.f47511(var106));
            final SubLObject var109 = module0205.f13277(var107, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var110 = module0205.f13368(var107, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var111 = module0751.f46982((SubLObject)module0765.$ic165$, module0756.f47511(var106));
            final SubLObject var112 = f48594(var109, var108, var110, var111);
            module0756.f47501(var106, var112, (SubLObject)module0765.UNPROVIDED);
            module0756.f47608(var106);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48595(final SubLObject var323) {
        return module0035.f2294(module0765.$g6119$.getGlobalValue(), var323, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48594(final SubLObject var323, final SubLObject var322, final SubLObject var320, final SubLObject var324) {
        final SubLThread var325 = SubLProcess.currentSubLThread();
        SubLObject var326 = f48595(var323);
        SubLObject var327 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0751.f46605()) {
            var326 = f48592(var326, (SubLObject)module0765.$ic167$);
        }
        assert module0765.NIL != module0751.f46598((SubLObject)module0765.NIL) : module0765.NIL;
        final SubLObject var328 = module0579.$g4254$.currentBinding(var325);
        try {
            module0579.$g4254$.bind((SubLObject)module0765.NIL, var325);
            var327 = f48591(var320, var324);
        }
        finally {
            module0579.$g4254$.rebind(var328, var325);
        }
        final SubLObject var329 = (SubLObject)ConsesLow.cons(module0749.f46446(var326, var322, var323, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL), var327);
        return var329;
    }
    
    public static SubLObject f48596(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED) && (module0765.NIL == module0579.$g4245$.getDynamicValue(var107) || !var108.equal(module0612.f37528()))) {
            final SubLObject var109 = module0751.f46982((SubLObject)module0765.$ic164$, module0756.f47511(var106));
            final SubLObject var110 = module0205.f13277(var108, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var111 = module0205.f13277(module0205.f13368(var108, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
            final SubLObject var112 = module0751.f46982((SubLObject)module0765.$ic170$, module0756.f47511(var106));
            final SubLObject var113 = module0205.f13368(module0205.f13368(var108, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
            final SubLObject var114 = module0751.f46982((SubLObject)module0765.$ic171$, module0756.f47511(var106));
            final SubLObject var115 = f48597(var110, var109, var111, var112, var113, var114);
            module0756.f47501(var106, var115, (SubLObject)module0765.UNPROVIDED);
            module0756.f47608(var106);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48597(final SubLObject var327, final SubLObject var326, final SubLObject var323, final SubLObject var322, final SubLObject var320, final SubLObject var324) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        final SubLObject var329 = print_high.princ_to_string(var327);
        final SubLObject var330 = f48595(var323);
        SubLObject var331 = (SubLObject)module0765.NIL;
        assert module0765.NIL != module0751.f46598((SubLObject)module0765.NIL) : module0765.NIL;
        final SubLObject var332 = module0579.$g4254$.currentBinding(var328);
        try {
            module0579.$g4254$.bind((SubLObject)module0765.NIL, var328);
            var331 = f48591(var320, var324);
        }
        finally {
            module0579.$g4254$.rebind(var332, var328);
        }
        SubLObject var333 = ConsesLow.append((SubLObject)ConsesLow.list(module0756.f47719(module0749.f46446(var330, var322, var323, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL), var323), module0749.f46446(var329, var326, var327, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL), f48533()), var331);
        if (module0765.NIL != module0751.f46605()) {
            final SubLObject var334 = f48598((SubLObject)module0765.$ic172$);
            if (module0765.NIL != module0038.f2611(var334)) {
                var333 = (SubLObject)ConsesLow.cons(module0772.f49212(var334), var333);
            }
        }
        return var333;
    }
    
    public static SubLObject f48589(final SubLObject var106) {
        final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        SubLObject var108 = (SubLObject)module0765.NIL;
        final SubLObject var109 = module0762.f48153((SubLObject)module0765.$ic157$, (SubLObject)module0765.NIL);
        module0762.f48155((SubLObject)module0765.$ic157$, var109);
        try {
            module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        finally {
            final SubLObject var110 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0765.T);
                module0762.f48154((SubLObject)module0765.$ic157$, var109);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var110);
            }
        }
        module0765.$g6120$.setGlobalValue((SubLObject)ConsesLow.cons(var107, module0765.$g6120$.getGlobalValue()));
        var108 = module0756.f47467(var106);
        return var108;
    }
    
    public static SubLObject f48585(final SubLObject var317) {
        if (module0765.NIL != conses_high.member(module0205.f13276(var317), (SubLObject)module0765.$ic173$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL == module0202.f12689(var317, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.NIL;
        }
        return (SubLObject)module0765.T;
    }
    
    public static SubLObject f48586(final SubLObject var317, final SubLObject var332) {
        final SubLObject var333 = module0756.f47463(var317, var332, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var334 = f48599(var317);
        return f48600(var333, var334);
    }
    
    public static SubLObject f48601(final SubLObject var98, final SubLObject var334) {
        return module0749.f46446(PrintLow.format((SubLObject)module0765.NIL, (SubLObject)module0765.$ic174$, var98), var334, var98, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48602(final SubLObject var335) {
        SubLObject var336 = module0612.f37475(var335);
        if (module0765.NIL == var336 && var335.eql(module0765.$ic175$)) {
            var336 = module0765.$ic176$;
        }
        return var336;
    }
    
    public static SubLObject f48603(final SubLObject var337, final SubLObject var338) {
        final SubLObject var339 = f48602(var337);
        final SubLObject var340 = f48602(var338);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != var339 && module0765.NIL != var340 && module0765.NIL != module0610.f37205(var339, var340));
    }
    
    public static SubLObject f48604(final SubLObject var341, SubLObject var248, SubLObject var332) {
        if (var248 == module0765.UNPROVIDED) {
            var248 = module0765.$ic175$;
        }
        if (var332 == module0765.UNPROVIDED) {
            var332 = module0751.f47200();
        }
        final SubLThread var342 = SubLProcess.currentSubLThread();
        SubLObject var343 = (SubLObject)module0765.NIL;
        SubLObject var344 = (SubLObject)module0765.ZERO_INTEGER;
        SubLObject var345 = module0751.f46982(module0751.f46825((SubLObject)module0765.$ic177$), var332);
        var342.resetMultipleValues();
        final SubLObject var346 = module0612.f37410(var341);
        final SubLObject var347 = var342.secondMultipleValue();
        final SubLObject var348 = var342.thirdMultipleValue();
        final SubLObject var349 = var342.fourthMultipleValue();
        final SubLObject var350 = var342.fifthMultipleValue();
        SubLObject var351 = var342.sixthMultipleValue();
        SubLObject var352 = var342.seventhMultipleValue();
        SubLObject var353 = var342.eighthMultipleValue();
        var342.resetMultipleValues();
        if (module0765.NIL != var353) {
            var344 = (SubLObject)module0765.THREE_INTEGER;
        }
        else if (module0765.NIL != var352) {
            var344 = (SubLObject)module0765.TWO_INTEGER;
            var353 = (SubLObject)module0765.ZERO_INTEGER;
        }
        else if (module0765.NIL != var351) {
            var344 = (SubLObject)module0765.ONE_INTEGER;
            var352 = (SubLObject)module0765.ZERO_INTEGER;
            var353 = (SubLObject)module0765.ZERO_INTEGER;
        }
        else {
            var344 = (SubLObject)module0765.ZERO_INTEGER;
            var351 = (SubLObject)module0765.ZERO_INTEGER;
            var352 = (SubLObject)module0765.ZERO_INTEGER;
            var353 = (SubLObject)module0765.ZERO_INTEGER;
        }
        if (module0765.NIL != f48603(var248, module0765.$ic178$)) {
            var343 = (SubLObject)ConsesLow.cons(f48601(PrintLow.format((SubLObject)module0765.NIL, (SubLObject)module0765.$ic179$, var353), var344.numGE((SubLObject)module0765.THREE_INTEGER) ? var345 : module0751.f46705()), var343);
            var343 = (SubLObject)ConsesLow.cons(module0772.f49212((SubLObject)module0765.$ic39$), var343);
        }
        if (var344.numGE((SubLObject)module0765.THREE_INTEGER)) {
            var345 = module0751.f47204(module0751.f46825((SubLObject)module0765.$ic180$), var345);
        }
        if (module0765.NIL != f48603(var248, module0765.$ic181$)) {
            var343 = (SubLObject)ConsesLow.cons(f48601(var352, var344.numGE((SubLObject)module0765.TWO_INTEGER) ? var345 : module0751.f46705()), var343);
            var343 = (SubLObject)ConsesLow.cons(module0772.f49212((SubLObject)module0765.$ic182$), var343);
        }
        if (var344.numGE((SubLObject)module0765.TWO_INTEGER)) {
            var345 = module0751.f47204(module0751.f46825((SubLObject)module0765.$ic180$), var345);
        }
        var343 = (SubLObject)ConsesLow.cons(f48601(var351, var344.numGE((SubLObject)module0765.ONE_INTEGER) ? var345 : module0751.f46705()), var343);
        var343 = (SubLObject)ConsesLow.cons(module0772.f49212((SubLObject)module0765.$ic182$), var343);
        if (var344.numGE((SubLObject)module0765.ONE_INTEGER)) {
            var345 = module0751.f47204(module0751.f46825((SubLObject)module0765.$ic180$), var345);
        }
        var343 = (SubLObject)ConsesLow.cons(f48601(var350, var345), var343);
        return (SubLObject)ConsesLow.list(module0749.f46484(var343));
    }
    
    public static SubLObject f48600(final SubLObject var106, SubLObject var248) {
        if (var248 == module0765.UNPROVIDED) {
            var248 = module0765.$ic175$;
        }
        return f48604(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED), var248, module0756.f47511(var106));
    }
    
    public static SubLObject f48599(final SubLObject var317) {
        if (module0765.NIL != module0612.f37382(var317)) {
            return module0612.f37425(var317);
        }
        return f48605(module0205.f13276(var317));
    }
    
    public static SubLObject f48605(final SubLObject var348) {
        return module0751.f46770((SubLObject)module0765.$ic183$, (SubLObject)ConsesLow.listS(module0765.$ic184$, (SubLObject)ConsesLow.listS(module0765.$ic185$, var348, (SubLObject)module0765.$ic186$), (SubLObject)module0765.$ic187$), module0765.$ic188$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED).first();
    }
    
    public static SubLObject f48588(SubLObject var317) {
        SubLObject var318 = module0751.f46678();
        SubLObject var319 = (SubLObject)module0765.NIL;
        while (module0765.NIL == var319) {
            if (module0765.NIL == module0172.f10917(var317)) {
                var319 = (SubLObject)module0765.T;
            }
            else if (module0765.NIL != module0762.f48172(var317)) {
                var318 = module0751.f46793((SubLObject)module0765.TWO_INTEGER, var318);
                var317 = module0205.f13204(var317, (SubLObject)module0765.UNPROVIDED);
            }
            else {
                var319 = (SubLObject)module0765.T;
            }
        }
        return var318;
    }
    
    public static SubLObject f48598(final SubLObject var84) {
        return conses_high.getf(module0765.$g6121$.getGlobalValue(), var84, module0038.$g916$.getGlobalValue());
    }
    
    public static SubLObject f48592(final SubLObject var350, final SubLObject var84) {
        final SubLObject var351 = f48598(var84);
        return Sequences.cconcatenate(var351, var350);
    }
    
    public static SubLObject f48606(final SubLObject var106) {
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48607(final SubLObject var351, final SubLObject var127, final SubLObject var341) {
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48608(final SubLObject var352) {
        final SubLThread var353 = SubLProcess.currentSubLThread();
        if (module0765.NIL == Errors.$ignore_mustsP$.getDynamicValue(var353) && module0765.NIL != module0756.f47478(var352)) {
            Errors.error((SubLObject)module0765.$ic193$, var352);
        }
        final SubLObject var354 = module0756.f47487(var352, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var355 = module0756.f47511(var352);
        if (module0765.NIL == module0202.f12714(var354) && module0765.NIL == module0202.f12604(var354)) {
            SubLObject var356 = module0756.f47488(var352, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var357 = module0756.f47526(var352);
            final SubLObject var358 = module0756.f47772();
            final SubLObject var359 = (module0765.NIL != var358) ? module0579.$g4336$.getDynamicValue(var353) : module0205.f13132(var354);
            SubLObject var360 = (SubLObject)module0765.NIL;
            SubLObject var361 = (SubLObject)module0765.NIL;
            SubLObject var362 = (SubLObject)module0765.ZERO_INTEGER;
            SubLObject var363 = (SubLObject)module0765.ZERO_INTEGER;
            var356 = module0767.f48852(var352, var356);
            final SubLObject var364 = module0579.$g4336$.currentBinding(var353);
            try {
                module0579.$g4336$.bind((SubLObject)((module0765.NIL != module0580.f35536(var359)) ? var359 : module0765.$ic194$), var353);
                final SubLObject var365 = Time.get_internal_real_time();
                final SubLObject var18_359 = module0579.$g4280$.currentBinding(var353);
                try {
                    module0579.$g4280$.bind((SubLObject)((module0765.NIL != module0579.f35507()) ? module0765.ZERO_INTEGER : module0579.$g4280$.getDynamicValue(var353)), var353);
                    final SubLObject var366 = module0749.f46552(var354, var357, (SubLObject)module0765.NIL, var356, var355, (SubLObject)module0765.UNPROVIDED);
                    while (module0765.NIL == var361 && module0765.NIL == module0749.f46551(var366)) {
                        var353.resetMultipleValues();
                        final SubLObject var367 = module0763.f48349(var366);
                        final SubLObject var368 = var353.secondMultipleValue();
                        var353.resetMultipleValues();
                        if (module0765.NIL != module0756.f47497(var367, (SubLObject)module0765.UNPROVIDED)) {
                            final SubLObject var369 = module0763.f48334(var367, var354, var355, var356);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic195$, var369);
                            }
                            final SubLObject var370 = (module0765.NIL != module0579.f35485()) ? module0756.f47484(var352, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) : var352;
                            module0756.f47724(var369);
                            final SubLObject var18_360 = module0579.$g4323$.currentBinding(var353);
                            try {
                                module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var353))) ? module0579.$g4323$.getDynamicValue(var353) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var353);
                                final SubLObject var371 = module0754.f47307();
                                final SubLObject var18_361 = module0754.$g6064$.currentBinding(var353);
                                final SubLObject var372 = module0579.$g4324$.currentBinding(var353);
                                final SubLObject var373 = module0579.$g4325$.currentBinding(var353);
                                try {
                                    module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var353), var353);
                                    module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var353))) ? module0579.$g4324$.getDynamicValue(var353) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var353);
                                    module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var353)), var353);
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var353), module0067.f4903(module0579.$g4323$.getDynamicValue(var353)));
                                    }
                                    try {
                                        f48609(var370, var369);
                                        f48610(var369);
                                    }
                                    finally {
                                        final SubLObject var18_362 = Threads.$is_thread_performing_cleanupP$.currentBinding(var353);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var353);
                                            final SubLObject var374 = conses_high.set_difference(module0754.f47307(), var371, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var353), module0754.f47307());
                                            }
                                            module0580.f35619(var374);
                                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_362, var353);
                                        }
                                    }
                                }
                                finally {
                                    module0579.$g4325$.rebind(var373, var353);
                                    module0579.$g4324$.rebind(var372, var353);
                                    module0754.$g6064$.rebind(var18_361, var353);
                                }
                            }
                            finally {
                                module0579.$g4323$.rebind(var18_360, var353);
                            }
                            if (module0765.NIL != module0756.f47479(var369) && module0765.NIL == module0756.f47479(var352)) {
                                module0758.f47893(var370);
                                if (module0765.NIL != module0579.f35496(module0756.f47627(var370), (SubLObject)module0765.UNPROVIDED)) {
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.THREE_INTEGER) && module0765.NIL == module0578.f35477()) {
                                        Errors.warn((SubLObject)module0765.$ic196$);
                                    }
                                    module0756.f47491(var370);
                                    module0756.f47535(var370);
                                    module0756.f47613(var369, (SubLObject)module0765.UNPROVIDED);
                                }
                                else {
                                    if (module0765.NIL != module0579.f35485()) {
                                        module0756.f47484(var369, var352, (SubLObject)module0765.NIL);
                                        module0756.f47820(var352, module0756.f47516(var369));
                                    }
                                    SubLObject var375 = conses_high.copy_list(module0756.f47510(var369));
                                    SubLObject var376 = (SubLObject)module0765.NIL;
                                    var376 = var375.first();
                                    while (module0765.NIL != var375) {
                                        module0756.f47569(var352, var376);
                                        var375 = var375.rest();
                                        var376 = var375.first();
                                    }
                                    module0756.f47608(var352);
                                    if (module0765.NIL == module0579.f35485()) {
                                        var361 = (SubLObject)module0765.T;
                                    }
                                }
                            }
                            else if (module0765.NIL != module0756.f47479(var369)) {
                                module0756.f47675(var352, var369);
                                var362 = Numbers.add(var362, (SubLObject)module0765.ONE_INTEGER);
                            }
                            else {
                                module0756.f47491(var370);
                                module0756.f47613(var369, (SubLObject)module0765.UNPROVIDED);
                            }
                            var360 = (SubLObject)module0765.T;
                        }
                    }
                    module0749.f46553(var366);
                }
                finally {
                    module0579.$g4280$.rebind(var18_359, var353);
                }
                var363 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var365), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            finally {
                module0579.$g4336$.rebind(var364, var353);
            }
            if (var362.isPositive() && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic197$, var362, var352);
            }
            if (module0765.NIL == var360) {
                module0756.f47663(var352, (SubLObject)module0765.$ic190$, (SubLObject)module0765.$ic198$, (SubLObject)ConsesLow.list((SubLObject)module0765.$ic199$, var354));
            }
            else if (module0765.NIL == module0756.f47479(var352)) {
                module0756.f47663(var352, (SubLObject)module0765.$ic190$, (SubLObject)module0765.$ic200$, (SubLObject)ConsesLow.list((SubLObject)module0765.$ic199$, var354));
            }
            else if (module0765.NIL != module0202.f12938(var354)) {
                f48607(var354, var356, var363);
            }
        }
        return module0756.f47467(var352);
    }
    
    public static SubLObject f48609(final SubLObject var368, final SubLObject var369) {
        final SubLObject var370 = module0756.f47481(var368, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var371 = module0756.f47482(var368);
        final SubLObject var372 = module0756.f47635(var368);
        final SubLObject var373 = conses_high.copy_list(module0756.f47510(var368));
        final SubLObject var374 = Sequences.length(var373);
        SubLObject var375 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0756.f47478(var368)) {
            module0756.f47491(var368);
        }
        module0756.f47821(var368, var369);
        SubLObject var376 = (SubLObject)module0765.NIL;
        SubLObject var377 = (SubLObject)module0765.NIL;
        SubLObject var378 = (SubLObject)module0765.NIL;
        var376 = var373;
        var377 = var376.first();
        for (var378 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL == var375 && module0765.NIL != var376; var376 = var376.rest(), var377 = var376.first(), var378 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var378)) {
            if (var378.numGE(var374)) {
                final SubLObject var379 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic203$) });
                module0578.f35476(var379, (SubLObject)ConsesLow.list(var373));
                var375 = (SubLObject)module0765.T;
            }
            else {
                module0756.f47569(var369, var377);
            }
        }
        if (module0765.NIL == module0756.f47482(var369)) {
            module0756.f47508(var369, var371, (SubLObject)module0765.NIL);
        }
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic204$, module0756.f47482(var369));
        }
        if (module0765.NIL == module0756.f47481(var369, (SubLObject)module0765.UNPROVIDED)) {
            module0756.f47503(var369, var370, (SubLObject)module0765.UNPROVIDED);
        }
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic205$, module0756.f47481(var369, (SubLObject)module0765.UNPROVIDED));
        }
        if (module0765.NIL == module0756.f47635(var369) && module0765.NIL != var372) {
            module0756.f47620(var369, var372, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic206$, module0756.f47635(var369));
            }
        }
        return var369;
    }
    
    public static SubLObject f48610(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.$g4307$.getDynamicValue(var107) && module0765.NIL != module0206.f13453(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED)) && module0765.NIL != module0751.f46924(module0756.f47711(var106)));
        final SubLObject var109 = module0579.$g4259$.currentBinding(var107);
        try {
            module0579.$g4259$.bind((SubLObject)((module0765.NIL != var108) ? module0765.$ic77$ : module0579.$g4259$.getDynamicValue(var107)), var107);
            assert module0765.NIL != module0751.f46598((SubLObject)module0765.NIL) : module0765.NIL;
            final SubLObject var18_378 = module0579.$g4254$.currentBinding(var107);
            try {
                module0579.$g4254$.bind((SubLObject)module0765.NIL, var107);
                module0758.f47878(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                if (module0765.NIL != var108) {
                    module0756.f47709(var106, module0756.f47711(var106), (SubLObject)module0765.NIL, (SubLObject)module0765.NIL, module0756.f47691(var106));
                    module0756.f47715(var106);
                }
            }
            finally {
                module0579.$g4254$.rebind(var18_378, var107);
            }
        }
        finally {
            module0579.$g4259$.rebind(var109, var107);
        }
        if (module0765.NIL != module0579.f35496(module0756.f47627(var106), (SubLObject)module0765.UNPROVIDED)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER) && module0765.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0765.$ic207$);
            }
            module0756.f47535(var106);
        }
        if (module0765.NIL != module0756.f47479(var106)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic208$, module0581.f35682(module0756.f47480(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED));
            }
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic209$, module0756.f47691(var106));
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48611(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = module0205.f13203(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
        SubLObject var109 = module0751.f46693(module0756.f47511(var106), (SubLObject)module0765.$ic177$);
        SubLObject var110 = (SubLObject)module0765.NIL;
        SubLObject var111 = (SubLObject)module0765.NIL;
        var107.resetMultipleValues();
        final SubLObject var112 = f48612(var108, (SubLObject)module0765.NIL, var109, (SubLObject)module0765.T);
        final SubLObject var113 = var107.secondMultipleValue();
        final SubLObject var114 = var107.thirdMultipleValue();
        var107.resetMultipleValues();
        if (module0765.NIL != var112) {
            var108 = module0751.f46672(var112, var108);
            var109 = module0751.f46693(var109, var112);
        }
        if (module0765.NIL != var113) {
            module0756.f47569(var106, var113);
        }
        if (module0765.NIL == module0202.f12925(var108)) {
            return (SubLObject)module0765.NIL;
        }
        final SubLObject var115 = module0579.$g4314$.currentBinding(var107);
        try {
            module0579.$g4314$.bind((SubLObject)ConsesLow.cons((SubLObject)module0765.$ic212$, module0579.$g4314$.getDynamicValue(var107)), var107);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic213$, (SubLObject)module0765.$ic212$);
            }
            final SubLObject var116 = module0756.f47711(var106);
            final SubLObject var117 = (module0765.NIL != module0751.f46924(var116)) ? ConsesLow.append(var116, (SubLObject)ConsesLow.list((SubLObject)module0765.ZERO_INTEGER)) : module0751.f46705();
            final SubLObject var118 = module0579.$g4327$.getDynamicValue(var107);
            final SubLObject var119 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            module0579.$g4327$.setDynamicValue((SubLObject)ConsesLow.cons(var117, module0579.$g4327$.getDynamicValue(var107)), var107);
            module0756.f47745(var119, (SubLObject)module0765.$ic177$);
            module0756.f47745(var119, var112);
            final SubLObject var120 = module0755.f47383((SubLObject)module0765.UNPROVIDED);
            final SubLObject var18_387 = module0579.$g4321$.currentBinding(var107);
            try {
                module0579.$g4321$.bind(module0755.f47382(), var107);
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic214$);
                }
                module0770.f49065(var119, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                var111 = module0580.f35577(module0579.$g4321$.getDynamicValue(var107), var120);
            }
            finally {
                module0579.$g4321$.rebind(var18_387, var107);
            }
            if (module0765.NIL != module0756.f47479(var119) && module0765.NIL == Sequences.find(var117, module0579.$g4327$.getDynamicValue(var107), (SubLObject)module0765.EQUAL, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                module0756.f47484(var119, var106, (SubLObject)module0765.UNPROVIDED);
            }
            else {
                final SubLObject var121 = module0749.f46552(var108, (SubLObject)module0765.NIL, module0205.f13132(var108), (SubLObject)module0765.$ic78$, (SubLObject)module0765.NIL, (SubLObject)module0765.UNPROVIDED);
                while (module0765.NIL == var110 && module0765.NIL == module0749.f46551(var121)) {
                    var107.resetMultipleValues();
                    final SubLObject var122 = module0763.f48349(var121);
                    final SubLObject var123 = var107.secondMultipleValue();
                    var107.resetMultipleValues();
                    if (module0765.NIL != module0756.f47497(var122, (SubLObject)module0765.UNPROVIDED)) {
                        final SubLObject var18_388 = module0579.$g4336$.currentBinding(var107);
                        try {
                            module0579.$g4336$.bind((SubLObject)((module0765.NIL != module0580.f35536(module0205.f13132(var108))) ? module0205.f13132(var108) : module0765.$ic194$), var107);
                            module0763.f48337(var122, var108, var109, (SubLObject)module0765.UNPROVIDED);
                            final SubLObject var124 = module0756.f47648(var122);
                            if (module0765.NIL == var124) {
                                continue;
                            }
                            module0756.f47726(var124);
                            if (module0765.NIL == module0756.f47653(var124)) {
                                continue;
                            }
                            if (module0765.NIL != module0751.f46989(var122)) {
                                module0751.f46990(var122);
                            }
                            if (module0765.NIL != module0579.$g4328$.getDynamicValue(var107)) {
                                final SubLObject var125 = module0755.f47383((SubLObject)module0765.UNPROVIDED);
                                final SubLObject var18_389 = module0579.$g4321$.currentBinding(var107);
                                try {
                                    module0579.$g4321$.bind(module0755.f47382(), var107);
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic214$);
                                    }
                                    f48613(var122);
                                    var111 = module0580.f35577(module0579.$g4321$.getDynamicValue(var107), var125);
                                }
                                finally {
                                    module0579.$g4321$.rebind(var18_389, var107);
                                }
                            }
                            if (module0765.NIL == module0756.f47479(var122)) {
                                final SubLObject var125 = module0755.f47383((SubLObject)module0765.UNPROVIDED);
                                final SubLObject var18_390 = module0579.$g4321$.currentBinding(var107);
                                try {
                                    module0579.$g4321$.bind(module0755.f47382(), var107);
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic214$);
                                    }
                                    f48614(var122);
                                    var111 = module0580.f35577(module0579.$g4321$.getDynamicValue(var107), var125);
                                }
                                finally {
                                    module0579.$g4321$.rebind(var18_390, var107);
                                }
                            }
                            if (module0765.NIL == module0756.f47479(var122)) {
                                continue;
                            }
                            var110 = (SubLObject)module0765.T;
                            module0756.f47484(var122, var106, (SubLObject)module0765.UNPROVIDED);
                        }
                        finally {
                            module0579.$g4336$.rebind(var18_388, var107);
                        }
                    }
                }
                module0749.f46553(var121);
            }
            module0579.$g4327$.setDynamicValue(var118, var107);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic215$, (SubLObject)module0765.$ic212$);
            }
        }
        finally {
            module0579.$g4314$.rebind(var115, var107);
        }
        return var106;
    }
    
    public static SubLObject f48613(final SubLObject var349) {
        final SubLThread var350 = SubLProcess.currentSubLThread();
        final SubLObject var351 = module0756.f47484(var349, module0749.f46494((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.T);
        final SubLObject var352 = module0756.f47648(var351);
        final SubLObject var353 = module0756.f47606(var352, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var354 = module0202.f12720(module0765.$ic216$, (SubLObject)ConsesLow.list(var353, module0765.$ic217$), (SubLObject)module0765.UNPROVIDED);
        SubLObject var355 = (SubLObject)module0765.NIL;
        module0756.f47625(var352, var354);
        module0756.f47738(var352, module0765.$ic218$, (SubLObject)module0765.T, (SubLObject)module0765.T);
        final SubLObject var356 = module0755.f47383((SubLObject)module0765.UNPROVIDED);
        final SubLObject var357 = module0579.$g4321$.currentBinding(var350);
        try {
            module0579.$g4321$.bind(module0755.f47382(), var350);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic214$);
            }
            f48610(var351);
            module0755.f47448(var355);
            var355 = module0580.f35577(module0579.$g4321$.getDynamicValue(var350), var356);
        }
        finally {
            module0579.$g4321$.rebind(var357, var350);
        }
        if (module0765.NIL != module0756.f47479(var351)) {
            module0756.f47484(var351, var349, (SubLObject)module0765.UNPROVIDED);
        }
        return var349;
    }
    
    public static SubLObject f48614(final SubLObject var349) {
        final SubLThread var350 = SubLProcess.currentSubLThread();
        final SubLObject var351 = module0749.f46494((SubLObject)module0765.$ic219$, module0765.$ic220$, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var352 = Numbers.add((SubLObject)module0765.ONE_INTEGER, module0756.f47477(var349));
        SubLObject var353 = (SubLObject)module0765.NIL;
        module0756.f47837(var349, var351, var352);
        final SubLObject var354 = module0755.f47383((SubLObject)module0765.UNPROVIDED);
        final SubLObject var355 = module0579.$g4321$.currentBinding(var350);
        try {
            module0579.$g4321$.bind(module0755.f47382(), var350);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic214$);
            }
            f48610(var349);
            module0755.f47448(var353);
            var353 = module0580.f35577(module0579.$g4321$.getDynamicValue(var350), var354);
        }
        finally {
            module0579.$g4321$.rebind(var355, var350);
        }
        return var349;
    }
    
    public static SubLObject f48615(final SubLObject var106) {
        final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var108 = module0205.f13364(var107);
        final SubLObject var109 = module0205.f13277(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var110 = module0205.f13368(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var111 = module0205.f13304(var107, (SubLObject)module0765.UNPROVIDED);
        SubLObject var112 = (SubLObject)module0765.NIL;
        SubLObject var113 = (SubLObject)module0765.NIL;
        SubLObject var114 = (SubLObject)ConsesLow.list((SubLObject)module0765.$ic223$);
        if (module0765.NIL == var112) {
            SubLObject var115 = module0035.f2293(f48616(var110, (SubLObject)module0765.UNPROVIDED), var109, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            SubLObject var116 = (SubLObject)module0765.NIL;
            var116 = var115.first();
            while (module0765.NIL == var112 && module0765.NIL != var115) {
                SubLObject var118;
                final SubLObject var117 = var118 = var116;
                SubLObject var119 = (SubLObject)module0765.NIL;
                SubLObject var120 = (SubLObject)module0765.NIL;
                SubLObject var121 = (SubLObject)module0765.NIL;
                SubLObject var122 = (SubLObject)module0765.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0765.$ic224$);
                var119 = var118.first();
                var118 = var118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0765.$ic224$);
                var120 = var118.first();
                var118 = var118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0765.$ic224$);
                var121 = var118.first();
                var118 = var118.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0765.$ic224$);
                var122 = var118.first();
                var118 = var118.rest();
                if (module0765.NIL == var118) {
                    if (module0765.NIL != var120 && module0765.NIL != var122 && module0765.NIL != module0035.f2012(var119) && module0765.NIL != module0035.f2012(var121)) {
                        var112 = module0764.f48440(var120, var122, (SubLObject)module0765.$ic63$, (SubLObject)module0765.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var117, (SubLObject)module0765.$ic224$);
                }
                var115 = var115.rest();
                var116 = var115.first();
            }
        }
        if (var112.isString()) {
            var114 = (SubLObject)ConsesLow.cons(var112, var114);
            if (module0765.NIL != var111) {
                var114 = (SubLObject)ConsesLow.cons((SubLObject)module0765.$ic65$, var114);
                var113 = f48519(var111, (SubLObject)module0765.$ic225$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                var114 = (SubLObject)ConsesLow.cons(var113, var114);
            }
            module0756.f47723(var106, module0038.f2761(Sequences.nreverse(var114), (SubLObject)module0765.UNPROVIDED));
        }
        return var106;
    }
    
    public static SubLObject f48617(final SubLObject var161) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        SubLObject var163 = (SubLObject)module0765.NIL;
        final SubLObject var164 = module0147.f9540(module0579.$g4260$.getDynamicValue(var162));
        final SubLObject var165 = module0147.$g2095$.currentBinding(var162);
        final SubLObject var166 = module0147.$g2094$.currentBinding(var162);
        final SubLObject var167 = module0147.$g2096$.currentBinding(var162);
        try {
            module0147.$g2095$.bind(module0147.f9545(var164), var162);
            module0147.$g2094$.bind(module0147.f9546(var164), var162);
            module0147.$g2096$.bind(module0147.f9549(var164), var162);
            final SubLObject var168 = module0765.$ic90$;
            if (module0765.NIL != module0158.f10010(var161, (SubLObject)module0765.ONE_INTEGER, var168)) {
                final SubLObject var169 = module0158.f10011(var161, (SubLObject)module0765.ONE_INTEGER, var168);
                SubLObject var170 = var163;
                final SubLObject var171 = (SubLObject)module0765.NIL;
                while (module0765.NIL == var170) {
                    final SubLObject var172 = module0052.f3695(var169, var171);
                    final SubLObject var173 = (SubLObject)SubLObjectFactory.makeBoolean(!var171.eql(var172));
                    if (module0765.NIL != var173) {
                        SubLObject var174 = (SubLObject)module0765.NIL;
                        try {
                            var174 = module0158.f10316(var172, (SubLObject)module0765.$ic113$, (SubLObject)module0765.NIL, (SubLObject)module0765.NIL);
                            SubLObject var225_406 = var163;
                            final SubLObject var226_407 = (SubLObject)module0765.NIL;
                            while (module0765.NIL == var225_406) {
                                final SubLObject var175 = module0052.f3695(var174, var226_407);
                                final SubLObject var228_408 = (SubLObject)SubLObjectFactory.makeBoolean(!var226_407.eql(var175));
                                if (module0765.NIL != var228_408) {
                                    var163 = var175;
                                }
                                var225_406 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var228_408 || module0765.NIL != var163);
                            }
                        }
                        finally {
                            final SubLObject var18_409 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var162);
                                if (module0765.NIL != var174) {
                                    module0158.f10319(var174);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_409, var162);
                            }
                        }
                    }
                    var170 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var173 || module0765.NIL != var163);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var167, var162);
            module0147.$g2094$.rebind(var166, var162);
            module0147.$g2095$.rebind(var165, var162);
        }
        return (SubLObject)((module0765.NIL != var163) ? module0289.f19396(var163) : module0765.NIL);
    }
    
    public static SubLObject f48618(final SubLObject var117, final SubLObject var410) {
        final SubLThread var411 = SubLProcess.currentSubLThread();
        final SubLObject var412 = module0205.f13136(var117);
        final SubLObject var413 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var414 = f48617(var412);
        SubLObject var415 = (SubLObject)module0765.NIL;
        SubLObject var416 = (SubLObject)module0765.NIL;
        SubLObject var417 = (SubLObject)module0765.NIL;
        SubLObject var418 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var414) {
            return (SubLObject)module0765.NIL;
        }
        if (var412.eql(module0765.$ic226$) && module0765.NIL != conses_high.member(conses_high.third(var413), var410, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            var415 = (SubLObject)module0765.$ic227$;
            var416 = (SubLObject)module0765.$ic228$;
        }
        else {
            var411.resetMultipleValues();
            final SubLObject var413_414 = f48557(var414);
            final SubLObject var415_416 = var411.secondMultipleValue();
            var411.resetMultipleValues();
            var415 = var413_414;
            var416 = var415_416;
        }
        if (module0765.NIL != var415) {
            if (module0765.NIL != module0173.f10969(var412) && module0579.$g4259$.getDynamicValue(var411) == module0765.$ic34$) {
                var415 = module0769.f49022(var415, var412);
            }
            var417 = f48554(var117, var412, var413, var416, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != module0035.f2014(var417)) {
                var418 = Functions.apply(Symbols.symbol_function((SubLObject)module0765.$ic229$), (SubLObject)module0765.NIL, (SubLObject)ConsesLow.cons(var415, Mapping.mapcar((SubLObject)module0765.$ic230$, var417)));
            }
        }
        return var418;
    }
    
    public static SubLObject f48619(final SubLObject var106) {
        final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var108 = module0205.f13204(var107, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0205.f13203(var107, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var110 = module0205.f13136(var108);
        final SubLObject var111 = module0205.f13207(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var112 = Sequences.remove_if((SubLObject)module0765.$ic233$, var111, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        SubLObject var113 = (SubLObject)module0765.NIL;
        SubLObject var114 = (SubLObject)module0765.NIL;
        SubLObject var115 = f48618(var108, var109);
        if (module0765.NIL != var115) {
            module0756.f47723(var106, var115);
            return var106;
        }
        if (module0765.NIL != module0552.f34032(var108)) {
            var113 = module0770.f49097(var110, (SubLObject)module0765.$ic63$, (SubLObject)module0765.UNPROVIDED);
            var115 = (SubLObject)ConsesLow.cons(var113, var115);
            if (module0765.NIL != var112) {
                var115 = (SubLObject)ConsesLow.cons((SubLObject)module0765.$ic234$, var115);
                final SubLObject var116 = f48519(var112, (SubLObject)module0765.$ic225$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                if (var116.isString()) {
                    var114 = var116;
                    var115 = (SubLObject)ConsesLow.cons(var114, var115);
                }
                else {
                    var115 = (SubLObject)module0765.NIL;
                }
            }
            var115 = module0038.f2761(Sequences.nreverse(var115), (SubLObject)module0765.UNPROVIDED);
            module0756.f47723(var106, var115);
        }
        if (module0765.NIL == var115) {
            f48543(var106);
        }
        return var106;
    }
    
    public static SubLObject f48620(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0756.f47809(var106, (SubLObject)module0765.$ic237$)) {
            final SubLObject var108 = module0579.$g4323$.currentBinding(var107);
            try {
                module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var107))) ? module0579.$g4323$.getDynamicValue(var107) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var107);
                final SubLObject var109 = module0754.f47307();
                final SubLObject var18_420 = module0754.$g6064$.currentBinding(var107);
                final SubLObject var110 = module0579.$g4324$.currentBinding(var107);
                final SubLObject var111 = module0579.$g4325$.currentBinding(var107);
                try {
                    module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var107), var107);
                    module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var107))) ? module0579.$g4324$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var107);
                    module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var107)), var107);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var107), module0067.f4903(module0579.$g4323$.getDynamicValue(var107)));
                    }
                    try {
                        final SubLObject var112 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
                        final SubLObject var113 = module0756.f47511(var106);
                        SubLObject var114 = module0751.f46787(var112);
                        SubLObject var115 = (SubLObject)module0765.NIL;
                        var115 = var114.first();
                        while (module0765.NIL != var114) {
                            module0754.f47320(var115, (SubLObject)module0765.$ic238$);
                            var114 = var114.rest();
                            var115 = var114.first();
                        }
                        var107.resetMultipleValues();
                        final SubLObject var116 = f48621(var112, var113);
                        final SubLObject var117 = var107.secondMultipleValue();
                        var107.resetMultipleValues();
                        if (module0765.$ic100$ != var116 && module0765.NIL == module0756.f47479(var106)) {
                            final SubLObject var118 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            module0756.f47745(var106, var116);
                            if (module0765.NIL != var117) {
                                module0756.f47569(var106, var117);
                            }
                            if (!module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED).equal(var112)) {
                                module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            }
                            if (module0765.NIL == module0756.f47479(var106)) {
                                module0756.f47484(var118, var106, (SubLObject)module0765.UNPROVIDED);
                            }
                        }
                    }
                    finally {
                        final SubLObject var18_421 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                            final SubLObject var119 = conses_high.set_difference(module0754.f47307(), var109, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var107), module0754.f47307());
                            }
                            module0580.f35619(var119);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_421, var107);
                        }
                    }
                }
                finally {
                    module0579.$g4325$.rebind(var111, var107);
                    module0579.$g4324$.rebind(var110, var107);
                    module0754.$g6064$.rebind(var18_420, var107);
                }
            }
            finally {
                module0579.$g4323$.rebind(var108, var107);
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48622(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0756.f47511(var106);
        final SubLObject var110 = module0756.f47515(var106);
        var107.resetMultipleValues();
        final SubLObject var111 = f48623(var106, (SubLObject)module0765.$ic236$);
        final SubLObject var112 = var107.secondMultipleValue();
        final SubLObject var113 = var107.thirdMultipleValue();
        var107.resetMultipleValues();
        if (!var112.equal(var108)) {
            final SubLObject var114 = f48624(module0035.f2062(var111), (SubLObject)module0765.$ic236$, var113);
            final SubLObject var115 = module0756.f47511(var106);
            SubLObject var116 = (SubLObject)module0765.NIL;
            if (module0765.NIL != var114) {
                final SubLObject var117 = module0751.f46982((SubLObject)module0765.$ic84$, var109);
                final SubLObject var118 = module0765.$ic239$;
                final SubLObject var119 = module0749.f46494((SubLObject)module0765.$ic240$, var118, (SubLObject)module0765.UNPROVIDED);
                module0756.f47469(var119, var117);
                module0756.f47715(var119);
                var116 = (SubLObject)ConsesLow.cons(var119, var116);
                var116 = (SubLObject)ConsesLow.cons(f48625(var114, var111), var116);
                if (module0765.NIL != module0035.f2002(var114, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED)) {
                    var116 = (SubLObject)ConsesLow.cons(module0749.f46494((SubLObject)module0765.$ic0$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var116);
                }
                var116 = (SubLObject)ConsesLow.cons(module0749.f46494((SubLObject)module0765.$ic241$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var116);
            }
            var116 = (SubLObject)ConsesLow.cons(f48626(var112, var115), var116);
            var116 = Sequences.nreverse(var116);
            module0756.f47507(var106, var116, (SubLObject)module0765.UNPROVIDED);
            module0758.f47878(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        if (module0765.NIL == module0756.f47479(var106)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0765.$ic242$, var108);
            }
            module0756.f47507(var106, var110, (SubLObject)module0765.UNPROVIDED);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48587(final SubLObject var120) {
        final SubLObject var121 = module0772.f49212((SubLObject)module0765.$ic0$);
        if (module0765.NIL != module0751.f46966(module0035.f2114(var120))) {
            final SubLObject var122 = Numbers.subtract(Sequences.length(var120), (SubLObject)((module0765.NIL != module0751.f46964(module0035.f2115(var120))) ? module0765.TWO_INTEGER : module0765.ONE_INTEGER));
            return module0035.f2139(var121, var120, var122);
        }
        return module0035.f1973(var121, var120);
    }
    
    public static SubLObject f48625(final SubLObject var381, final SubLObject var426) {
        SubLObject var427 = (SubLObject)module0765.NIL;
        SubLObject var428 = var381;
        SubLObject var429 = (SubLObject)module0765.NIL;
        var429 = var428.first();
        while (module0765.NIL != var428) {
            var427 = (SubLObject)ConsesLow.cons(f48627(var429, var426), var427);
            var428 = var428.rest();
            var429 = var428.first();
        }
        var427 = Sequences.nreverse(var427);
        return module0756.f47580(var427, (SubLObject)module0765.$ic5$, (SubLObject)module0765.$ic6$);
    }
    
    public static SubLObject f48627(final SubLObject var436, final SubLObject var426) {
        final SubLObject var437 = module0756.f47463(var436, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var438 = module0035.f2293(var426, var436, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        module0756.f47469(var437, var438);
        return var437;
    }
    
    public static SubLObject f48626(final SubLObject var117, final SubLObject var332) {
        return module0756.f47463(var117, var332, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48623(final SubLObject var106, final SubLObject var84) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        var107.resetMultipleValues();
        final SubLObject var109 = f48628(var108, var84);
        final SubLObject var110 = var107.secondMultipleValue();
        final SubLObject var111 = var107.thirdMultipleValue();
        var107.resetMultipleValues();
        module0756.f47745(var106, var110);
        return Values.values(var109, var108, var111);
    }
    
    public static SubLObject f48628(SubLObject var117, final SubLObject var84) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = (SubLObject)((var84 == module0765.$ic236$) ? module0765.$ic243$ : module0765.$ic244$);
        final SubLObject var120 = (SubLObject)((var84 == module0765.$ic236$) ? module0765.$ic245$ : module0765.$ic246$);
        SubLObject var121 = module0751.f46678();
        SubLObject var122 = (SubLObject)module0765.$ic164$;
        SubLObject var123 = (SubLObject)module0765.NIL;
        final SubLObject var124 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == module0579.$g4277$.getDynamicValue(var118) || module0765.NIL != module0579.f35498() || module0765.NIL != module0205.f13145(var120, var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        SubLObject var125 = (SubLObject)module0765.NIL;
        while (module0765.NIL == var125 && module0765.NIL != Functions.funcall(var119, var117)) {
            SubLObject var127;
            final SubLObject var126 = var127 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
            SubLObject var128 = (SubLObject)module0765.NIL;
            SubLObject var129 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var127, var126, (SubLObject)module0765.$ic247$);
            var128 = var127.first();
            var127 = var127.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var127, var126, (SubLObject)module0765.$ic247$);
            var129 = var127.first();
            var127 = var127.rest();
            if (module0765.NIL == var127) {
                if (module0765.NIL != module0754.f47311(var128)) {
                    final SubLObject var84_445 = module0754.f47373(var128, var129, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                    final SubLObject var130 = module0751.f46704(var84_445, var129, Symbols.symbol_function((SubLObject)module0765.EQUAL));
                    final SubLObject var131 = module0751.f46604(var130);
                    final SubLObject var132 = module0751.f46693(module0751.f47200(), var131);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic248$, new SubLObject[] { var128, var84_445, var132 });
                    }
                    module0754.f47313(var128, var84_445, var132);
                }
                if (module0765.NIL != var124) {
                    f48629(var128);
                }
                if (module0765.NIL != module0202.f12594(var129)) {
                    var125 = (SubLObject)module0765.T;
                }
                else if (module0765.NIL != f48630(var129)) {
                    var125 = (SubLObject)module0765.T;
                }
                else {
                    var123 = module0035.f2063(var123, var128, var122, (SubLObject)module0765.UNPROVIDED);
                    var122 = module0751.f47204((SubLObject)module0765.$ic165$, var122);
                    var117 = var129;
                    var121 = module0751.f46793((SubLObject)module0765.TWO_INTEGER, var121);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var126, (SubLObject)module0765.$ic247$);
            }
        }
        return Values.values(var123, var121, var124);
    }
    
    public static SubLObject f48624(final SubLObject var449, final SubLObject var450, SubLObject var428) {
        if (var428 == module0765.UNPROVIDED) {
            var428 = (SubLObject)module0765.NIL;
        }
        SubLObject var451 = (SubLObject)module0765.NIL;
        SubLObject var452 = var449;
        SubLObject var453 = (SubLObject)module0765.NIL;
        var453 = var452.first();
        while (module0765.NIL != var452) {
            if (module0765.NIL != var428) {
                var451 = (SubLObject)ConsesLow.cons(var453, var451);
            }
            else if (module0765.NIL == f48631(var453)) {
                module0754.f47320(var453, var450);
            }
            else if (module0765.NIL == module0004.f104(module0754.f47312(var453), var449, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                var451 = (SubLObject)ConsesLow.cons(var453, var451);
            }
            var452 = var452.rest();
            var453 = var452.first();
        }
        return Sequences.nreverse(var451);
    }
    
    public static SubLObject f48632(final SubLObject var451, final SubLObject var452) {
        SubLObject var453 = var451;
        SubLObject var454 = (SubLObject)module0765.NIL;
        var454 = var453.first();
        while (module0765.NIL != var453) {
            final SubLObject var455 = module0749.f46466(var454);
            final SubLObject var456 = module0035.f2293(var452, var455, Symbols.symbol_function((SubLObject)module0765.EQL), module0751.f46705());
            module0749.f46464(var454, var456);
            var453 = var453.rest();
            var454 = var453.first();
        }
        return var451;
    }
    
    public static SubLObject f48621(final SubLObject var117, final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = (SubLObject)module0765.NIL;
        SubLObject var148 = var117;
        SubLObject var149 = module0751.f46678();
        SubLObject var150 = (SubLObject)module0765.NIL;
        final SubLObject var151 = (SubLObject)module0765.NIL;
        SubLObject var152 = f48633(var148);
        f48634(var117);
        while (module0765.NIL == var152 && module0765.NIL == var151 && module0765.NIL != module0202.f12606(var148)) {
            SubLObject var154;
            final SubLObject var153 = var154 = module0205.f13207(var148, (SubLObject)module0765.UNPROVIDED);
            SubLObject var155 = (SubLObject)module0765.NIL;
            SubLObject var156 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0765.$ic249$);
            var155 = var154.first();
            var154 = var154.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0765.$ic249$);
            var156 = var154.first();
            var154 = var154.rest();
            if (module0765.NIL == var154) {
                if (module0765.NIL != f48631(var155)) {
                    var152 = (SubLObject)module0765.T;
                }
                else if (module0765.NIL != module0754.f47338(var155)) {
                    var152 = (SubLObject)module0765.T;
                }
                else if (module0765.NIL != f48630(var156)) {
                    var152 = (SubLObject)module0765.T;
                }
                else {
                    var148 = var156;
                    var149 = module0751.f46793((SubLObject)module0765.TWO_INTEGER, var149);
                    module0754.f47320(var155, (SubLObject)module0765.$ic236$);
                    var147 = (SubLObject)ConsesLow.cons(var155, var147);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var153, (SubLObject)module0765.$ic249$);
            }
        }
        SubLObject var157 = (SubLObject)module0765.NIL;
        final SubLObject var158 = module0751.f46693(var145, var149);
        var146.resetMultipleValues();
        final SubLObject var159 = f48612(var148, (SubLObject)ConsesLow.list(module0205.f13203(var117, (SubLObject)module0765.UNPROVIDED)), var158, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var160 = var146.secondMultipleValue();
        final SubLObject var161 = var146.thirdMultipleValue();
        var146.resetMultipleValues();
        if (module0765.NIL != module0751.f46788(var159) && module0765.NIL == module0751.f46703(var159)) {
            var149 = module0751.f46672(var159, var149);
            var148 = module0751.f46672(var159, var148);
            if (module0765.NIL == var150) {
                var150 = var160;
            }
            var157 = ConsesLow.append(var161, var157);
        }
        if (module0765.NIL != var151 || module0765.NIL == var148) {
            module0754.f47317(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0765.$ic250$), var157));
        }
        else {
            SubLObject var162 = (SubLObject)ConsesLow.list(module0205.f13203(var117, (SubLObject)module0765.UNPROVIDED));
            SubLObject var163 = (SubLObject)module0765.NIL;
            var163 = var162.first();
            while (module0765.NIL != var162) {
                if (module0765.NIL != module0754.f47311(var163)) {
                    f48568(var163, (SubLObject)module0765.UNPROVIDED);
                }
                module0754.f47327(var163, var117);
                var162 = var162.rest();
                var163 = var162.first();
            }
        }
        final SubLObject var164 = f48635(var149, Sequences.length(var147));
        if (module0765.NIL != module0202.f12597(var148) || module0765.NIL != module0202.f12604(var148)) {
            var149 = var164;
        }
        else if (module0765.NIL != var149 && var149.isList()) {
            var149 = module0205.f13204(var164, (SubLObject)module0765.UNPROVIDED);
        }
        return Values.values(var149, var150);
    }
    
    public static SubLObject f48635(final SubLObject var454, final SubLObject var465) {
        return f48636(var454, var465, module0765.$ic239$);
    }
    
    public static SubLObject f48636(SubLObject var454, final SubLObject var465, final SubLObject var432) {
        SubLObject var466;
        SubLObject var467;
        SubLObject var468;
        for (var466 = (SubLObject)module0765.NIL, var466 = module0048.f_1_(var465); !var466.numL((SubLObject)module0765.ZERO_INTEGER); var466 = module0048.f_1_(var466)) {
            var467 = (SubLObject)module0765.$ic251$;
            for (var468 = (SubLObject)module0765.NIL, var468 = (SubLObject)module0765.ZERO_INTEGER; var468.numL(var466); var468 = Numbers.add(var468, (SubLObject)module0765.ONE_INTEGER)) {
                var467 = module0751.f46793((SubLObject)module0765.TWO_INTEGER, var467);
            }
            var467 = module0751.f46793((SubLObject)module0765.ONE_INTEGER, var467);
            var454 = module0202.f12768(var432, var467, var454);
        }
        return var454;
    }
    
    public static SubLObject f48637(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic252$, var117);
        }
        final SubLObject var119 = module0205.f13132(var117);
        SubLObject var120 = (SubLObject)module0765.NIL;
        final SubLObject var121 = module0147.f9540(module0579.$g4262$.getDynamicValue(var118));
        final SubLObject var122 = module0147.$g2095$.currentBinding(var118);
        final SubLObject var123 = module0147.$g2094$.currentBinding(var118);
        final SubLObject var124 = module0147.$g2096$.currentBinding(var118);
        try {
            module0147.$g2095$.bind(module0147.f9545(var121), var118);
            module0147.$g2094$.bind(module0147.f9546(var121), var118);
            module0147.$g2096$.bind(module0147.f9549(var121), var118);
            if (module0765.NIL == module0202.f12934(var117) && module0765.NIL == module0202.f12598(var117)) {
                var120 = (SubLObject)module0765.T;
            }
        }
        finally {
            module0147.$g2096$.rebind(var124, var118);
            module0147.$g2094$.rebind(var123, var118);
            module0147.$g2095$.rebind(var122, var118);
        }
        if (module0765.NIL == var120) {
            SubLObject var125 = (SubLObject)module0765.ZERO_INTEGER;
            final SubLObject var126 = module0205.f13207(var117, (SubLObject)module0765.$ic80$);
            SubLObject var127;
            SubLObject var128;
            for (var127 = (SubLObject)module0765.NIL, var127 = var126; module0765.NIL == var120 && module0765.NIL != var127; var127 = var127.rest()) {
                var128 = var127.first();
                var125 = Numbers.add(var125, (SubLObject)module0765.ONE_INTEGER);
                if (module0765.NIL != module0202.f12590(var128) || (module0765.NIL != module0201.f12546(var128) && (module0765.NIL == module0754.f47310(var128) || !module0754.f47312(var128).eql(module0754.f47373(var128, var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) || module0765.NIL == f48638(module0048.f_1X(var125), var119)))) {
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic253$, var128);
                    }
                    var120 = (SubLObject)module0765.T;
                }
            }
        }
        if (module0765.NIL != var120) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic254$);
        }
        return (SubLObject)module0765.T;
    }
    
    public static SubLObject f48638(final SubLObject var135, final SubLObject var108) {
        final SubLObject var136 = f48616(var108, (SubLObject)module0765.UNPROVIDED);
        return module0035.sublisp_boolean(conses_high.assoc(var135, var136, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48639(final SubLObject var108, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)module0765.NIL;
        SubLObject var111 = (SubLObject)module0765.NIL;
        final SubLObject var112 = module0579.$g4260$.currentBinding(var109);
        try {
            module0579.$g4260$.bind(var103, var109);
            var111 = module0751.f47009(f48640(var108), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        finally {
            module0579.$g4260$.rebind(var112, var109);
        }
        SubLObject var113 = var111;
        SubLObject var114 = (SubLObject)module0765.NIL;
        var114 = var113.first();
        while (module0765.NIL != var113) {
            var109.resetMultipleValues();
            final SubLObject var115 = module0732.f45021(module0178.f11303(var114));
            final SubLObject var116 = var109.secondMultipleValue();
            final SubLObject var117 = var109.thirdMultipleValue();
            final SubLObject var118 = var109.fourthMultipleValue();
            final SubLObject var119 = var109.fifthMultipleValue();
            var109.resetMultipleValues();
            final SubLObject var120 = module0035.f2114(module0178.f11330(var114));
            final SubLObject var121 = (SubLObject)ConsesLow.list(var115, var116, var117, var118);
            var110 = module0035.f2314(var110, var120, var121, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return var110;
    }
    
    public static SubLObject f48616(final SubLObject var108, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        final SubLObject var110 = module0034.$g879$.getDynamicValue(var109);
        SubLObject var111 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var110) {
            return f48639(var108, var103);
        }
        var111 = module0034.f1857(var110, (SubLObject)module0765.$ic255$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == var111) {
            var111 = module0034.f1807(module0034.f1842(var110), (SubLObject)module0765.$ic255$, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.NIL, (SubLObject)module0765.EQUAL, (SubLObject)module0765.UNPROVIDED);
            module0034.f1860(var110, (SubLObject)module0765.$ic255$, var111);
        }
        final SubLObject var112 = module0034.f1782(var108, var103);
        final SubLObject var113 = module0034.f1814(var111, var112, (SubLObject)module0765.UNPROVIDED);
        if (var113 != module0765.$ic256$) {
            SubLObject var114 = var113;
            SubLObject var115 = (SubLObject)module0765.NIL;
            var115 = var114.first();
            while (module0765.NIL != var114) {
                SubLObject var116 = var115.first();
                final SubLObject var117 = conses_high.second(var115);
                if (var108.equal(var116.first())) {
                    var116 = var116.rest();
                    if (module0765.NIL != var116 && module0765.NIL == var116.rest() && var103.equal(var116.first())) {
                        return module0034.f1959(var117);
                    }
                }
                var114 = var114.rest();
                var115 = var114.first();
            }
        }
        final SubLObject var118 = Values.arg2(var109.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48639(var108, var103)));
        module0034.f1836(var111, var112, var113, var118, (SubLObject)ConsesLow.list(var108, var103));
        return module0034.f1959(var118);
    }
    
    public static SubLObject f48641(final SubLObject var106, final SubLObject var479) {
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic257$, var479);
        }
        final SubLObject var480 = f48642(var479);
        if (module0765.NIL != var480) {
            module0756.f47465(var106, var480);
            module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        return var106;
    }
    
    public static SubLObject f48642(final SubLObject var117) {
        final SubLObject var118 = module0205.f13132(var117);
        SubLObject var119 = (SubLObject)module0765.NIL;
        SubLObject var120 = (SubLObject)module0765.NIL;
        SubLObject var121 = (SubLObject)module0765.NIL;
        SubLObject var122 = (SubLObject)module0765.NIL;
        SubLObject var123 = (SubLObject)module0765.NIL;
        SubLObject var124 = (SubLObject)module0765.NIL;
        SubLObject var125 = (SubLObject)module0765.NIL;
        SubLObject var126 = (SubLObject)module0765.NIL;
        var124 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
        var125 = var124.first();
        for (var126 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var124; var124 = var124.rest(), var125 = var124.first(), var126 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var126)) {
            final SubLObject var127 = module0048.f_1X(var126);
            if (module0765.NIL != module0201.f12546(var125)) {
                final SubLObject var128 = module0035.f2293(f48616(var118, (SubLObject)module0765.UNPROVIDED), var127, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                var122 = var128.first();
                var121 = conses_high.cadr(var128);
                var123 = conses_high.cddr(var128).first();
                var120 = conses_high.cadr(conses_high.cddr(var128));
            }
            else {
                if (module0765.NIL != var119) {
                    final SubLObject var129 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic258$) });
                    module0578.f35476(var129, (SubLObject)ConsesLow.list(var125, var117));
                    return (SubLObject)module0765.NIL;
                }
                var119 = var125;
            }
        }
        if (module0765.NIL == var119 || module0765.NIL == var120 || module0765.NIL == var121) {
            final SubLObject var130 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic259$) });
            module0578.f35476(var130, (SubLObject)ConsesLow.list(var117));
            return (SubLObject)module0765.NIL;
        }
        SubLObject var131 = (SubLObject)module0765.NIL;
        SubLObject var132 = var122;
        SubLObject var133 = (SubLObject)module0765.NIL;
        var133 = var132.first();
        while (module0765.NIL != var132) {
            var131 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0765.$ic260$, var133), var131);
            var132 = var132.rest();
            var133 = var132.first();
        }
        var131 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0765.$ic261$, (SubLObject)ConsesLow.list(module0765.$ic262$, var120, var121)), var131);
        var132 = var123;
        SubLObject var134 = (SubLObject)module0765.NIL;
        var134 = var132.first();
        while (module0765.NIL != var132) {
            var131 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0765.$ic260$, var134), var131);
            var132 = var132.rest();
            var134 = var132.first();
        }
        var131 = Sequences.nreverse(var131);
        return (SubLObject)ConsesLow.list(module0765.$ic263$, module0765.$ic264$, (SubLObject)ConsesLow.list(module0765.$ic265$, (SubLObject)ConsesLow.list(module0765.$ic266$, var119), (SubLObject)module0765.$ic267$, (SubLObject)ConsesLow.list(module0765.$ic268$, reader.bq_cons(module0765.$ic265$, var131))));
    }
    
    public static SubLObject f48643(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var109;
        final SubLObject var108 = var109 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var110 = module0756.f47511(var106);
        final SubLObject var111 = module0579.$g4279$.currentBinding(var107);
        try {
            module0579.$g4279$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.$g4279$.getDynamicValue(var107) && module0765.NIL != f48644(var108, (SubLObject)module0765.UNPROVIDED)), var107);
            if (module0765.NIL == module0751.f46614(var108)) {
                f48634(var108);
                final SubLObject var112 = module0751.f46787(var108);
                final SubLObject var18_488 = module0579.$g4323$.currentBinding(var107);
                try {
                    module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var107))) ? module0579.$g4323$.getDynamicValue(var107) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var107);
                    final SubLObject var113 = module0754.f47307();
                    final SubLObject var18_489 = module0754.$g6064$.currentBinding(var107);
                    final SubLObject var114 = module0579.$g4324$.currentBinding(var107);
                    final SubLObject var115 = module0579.$g4325$.currentBinding(var107);
                    try {
                        module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var107), var107);
                        module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var107))) ? module0579.$g4324$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var107);
                        module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var107)), var107);
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var107), module0067.f4903(module0579.$g4323$.getDynamicValue(var107)));
                        }
                        try {
                            SubLObject var116 = var112;
                            SubLObject var117 = (SubLObject)module0765.NIL;
                            var117 = var116.first();
                            while (module0765.NIL != var116) {
                                module0754.f47320(var117, (SubLObject)module0765.$ic238$);
                                var116 = var116.rest();
                                var117 = var116.first();
                            }
                            var107.resetMultipleValues();
                            final SubLObject var118 = f48645(var108, var110);
                            final SubLObject var119 = var107.secondMultipleValue();
                            var107.resetMultipleValues();
                            final SubLObject var120 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == module0751.f46703(var118));
                            final SubLObject var121 = (SubLObject)((module0765.NIL != var120) ? module0765.NIL : module0751.f46599());
                            if (module0765.NIL != var120) {
                                module0756.f47745(var106, var118);
                                if (module0765.NIL != var119) {
                                    module0756.f47569(var106, var119);
                                }
                                var109 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic271$, var108, var109);
                                }
                            }
                            final SubLObject var122 = module0762.f48153((SubLObject)module0765.$ic269$, (SubLObject)module0765.$ic270$);
                            module0762.f48155((SubLObject)module0765.$ic269$, var122);
                            try {
                                final SubLObject var18_490 = module0579.$g4314$.currentBinding(var107);
                                try {
                                    module0579.$g4314$.bind((SubLObject)ConsesLow.cons((SubLObject)module0765.$ic272$, module0579.$g4314$.getDynamicValue(var107)), var107);
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic213$, (SubLObject)module0765.$ic272$);
                                    }
                                    assert module0765.NIL != module0751.f46598(var121) : var121;
                                    final SubLObject var18_491 = module0579.$g4254$.currentBinding(var107);
                                    try {
                                        module0579.$g4254$.bind(var121, var107);
                                        module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                    }
                                    finally {
                                        module0579.$g4254$.rebind(var18_491, var107);
                                    }
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic215$, (SubLObject)module0765.$ic272$);
                                    }
                                }
                                finally {
                                    module0579.$g4314$.rebind(var18_490, var107);
                                }
                            }
                            finally {
                                final SubLObject var18_492 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                                    module0762.f48154((SubLObject)module0765.$ic269$, var122);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_492, var107);
                                }
                            }
                        }
                        finally {
                            final SubLObject var18_493 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                                final SubLObject var123 = conses_high.set_difference(module0754.f47307(), var113, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var107), module0754.f47307());
                                }
                                module0580.f35619(var123);
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_493, var107);
                            }
                        }
                    }
                    finally {
                        module0579.$g4325$.rebind(var115, var107);
                        module0579.$g4324$.rebind(var114, var107);
                        module0754.$g6064$.rebind(var18_489, var107);
                    }
                }
                finally {
                    module0579.$g4323$.rebind(var18_488, var107);
                }
            }
        }
        finally {
            module0579.$g4279$.rebind(var111, var107);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48646(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        if (module0765.NIL == module0202.f12590(var117)) {
            return var117;
        }
        if (module0765.NIL == module0202.f12598(var117) || module0765.NIL == module0201.f12546(module0205.f13203(var117, (SubLObject)module0765.UNPROVIDED)) || module0765.NIL == module0201.f12546(module0205.f13204(var117, (SubLObject)module0765.UNPROVIDED))) {
            SubLObject var119 = module0202.f12801((SubLObject)module0765.$ic276$, var117, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != module0035.f2014(var119)) {
                var119 = Sequences.remove((SubLObject)module0765.NIL, var119, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            }
            return var119;
        }
        SubLObject var120 = (SubLObject)module0765.NIL;
        SubLObject var121 = (SubLObject)module0765.NIL;
        SubLObject var122 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var117, var117, (SubLObject)module0765.$ic273$);
        var120 = var117.first();
        SubLObject var123 = var117.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var123, var117, (SubLObject)module0765.$ic273$);
        var121 = var123.first();
        var123 = var123.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var123, var117, (SubLObject)module0765.$ic273$);
        var122 = var123.first();
        var123 = var123.rest();
        if (module0765.NIL == var123) {
            if (module0765.NIL != module0173.f10955(var120) && module0765.NIL != module0751.f46849(var120, module0765.$ic274$, module0579.$g4262$.getDynamicValue(var118))) {
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic275$, var121, var122);
                }
                module0754.f47345(var121, var122);
            }
            return (SubLObject)(var120.eql(module0765.$ic274$) ? module0765.NIL : var117);
        }
        cdestructuring_bind.cdestructuring_bind_error(var117, (SubLObject)module0765.$ic273$);
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48645(final SubLObject var117, final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var147 = module0751.f46678();
        SubLObject var148 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0202.f12597(var117)) {
            SubLObject var150;
            final SubLObject var149 = var150 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
            SubLObject var151 = (SubLObject)module0765.NIL;
            SubLObject var152 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0765.$ic277$);
            var151 = var150.first();
            var150 = var150.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0765.$ic277$);
            var152 = var150.first();
            var150 = var150.rest();
            if (module0765.NIL == var150) {
                if (module0765.NIL != module0202.f12590(var151) && module0765.NIL != f48647(var152)) {
                    var146.resetMultipleValues();
                    SubLObject var153 = f48612(var151, (SubLObject)module0765.NIL, module0751.f46693(var145, (SubLObject)module0765.$ic177$), (SubLObject)module0765.NIL);
                    final SubLObject var154 = var146.secondMultipleValue();
                    final SubLObject var155 = var146.thirdMultipleValue();
                    var146.resetMultipleValues();
                    if (var153 != module0765.$ic100$) {
                        SubLObject var156 = module0205.f13183(var153, (SubLObject)module0765.$ic279$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        SubLObject var157 = (SubLObject)module0765.NIL;
                        var157 = var156.first();
                        while (module0765.NIL != var156) {
                            var153 = conses_high.subst(module0751.f46793(module0303.f20124(var157), (SubLObject)module0765.$ic278$), var157, var153, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            var156 = var156.rest();
                            var157 = var156.first();
                        }
                        if (module0765.NIL == var153) {
                            var147 = (SubLObject)module0765.$ic180$;
                        }
                        else if (module0765.NIL != module0751.f46703(var153)) {
                            var147 = module0751.f46678();
                        }
                        else {
                            var153 = conses_high.subst((SubLObject)module0765.$ic177$, (SubLObject)module0765.$ic278$, var153, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            var147 = module0202.f12774(var153, (SubLObject)module0765.$ic180$);
                        }
                        var148 = var154;
                        final SubLObject var158 = (SubLObject)((module0765.NIL != var153) ? module0751.f46672(var153, var117) : module0765.NIL);
                        SubLObject var159 = var155;
                        SubLObject var160 = (SubLObject)module0765.NIL;
                        var160 = var159.first();
                        while (module0765.NIL != var159) {
                            SubLObject var511_512;
                            final SubLObject var509_510 = var511_512 = var160;
                            SubLObject var161 = (SubLObject)module0765.NIL;
                            SubLObject var162 = (SubLObject)module0765.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var511_512, var509_510, (SubLObject)module0765.$ic280$);
                            var161 = var511_512.first();
                            var511_512 = var511_512.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var511_512, var509_510, (SubLObject)module0765.$ic280$);
                            var162 = var511_512.first();
                            var511_512 = var511_512.rest();
                            if (module0765.NIL == var511_512) {
                                if (module0765.NIL == module0205.f13220(var161, var158, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                                    module0754.f47320(var161, (SubLObject)module0765.$ic238$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var509_510, (SubLObject)module0765.$ic280$);
                            }
                            var159 = var159.rest();
                            var160 = var159.first();
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0765.$ic277$);
            }
        }
        return Values.values(var147, var148);
    }
    
    public static SubLObject f48647(final SubLObject var503) {
        final SubLThread var504 = SubLProcess.currentSubLThread();
        if (module0765.NIL == module0202.f12590(var503)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0205.f13145((SubLObject)module0765.$ic281$, var503, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0579.$g4254$.getDynamicValue(var504)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0205.f13145((SubLObject)module0765.$ic282$, var503, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0205.f13145((SubLObject)module0765.$ic283$, var503, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.NIL;
        }
        return (SubLObject)module0765.T;
    }
    
    public static SubLObject f48648(final SubLObject var107) {
        SubLObject var108 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0202.f12590(var107)) {
            SubLObject var109;
            SubLObject var110;
            SubLObject var112;
            SubLObject var111;
            SubLObject var113;
            SubLObject var114;
            for (var109 = (SubLObject)module0765.NIL, var109 = f48649(module0205.f13132(var107)); module0765.NIL == var108 && module0765.NIL != var109; var108 = (SubLObject)SubLObjectFactory.makeBoolean(var113.eql(module0765.$ic285$) && module0765.NIL != module0201.f12546(module0035.f2037(var107, var114, (SubLObject)module0765.UNPROVIDED))), var109 = var109.rest()) {
                var110 = var109.first();
                var111 = (var112 = var110);
                var113 = (SubLObject)module0765.NIL;
                var114 = (SubLObject)module0765.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)module0765.$ic284$);
                var113 = var112.first();
                var112 = (var114 = var112.rest());
            }
        }
        return var108;
    }
    
    public static SubLObject f48650(final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        SubLObject var109 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0202.f12590(var107)) {
            final SubLObject var110 = f48649(module0205.f13132(var107));
            SubLObject var111;
            SubLObject var112;
            SubLObject var114;
            SubLObject var113;
            SubLObject var115;
            SubLObject var116;
            for (var111 = (SubLObject)module0765.NIL, var111 = var110; module0765.NIL == var109 && module0765.NIL != var111; var109 = Equality.eq(var115, module0765.$ic286$), var111 = var111.rest()) {
                var112 = var111.first();
                var113 = (var114 = var112);
                var115 = (SubLObject)module0765.NIL;
                var116 = (SubLObject)module0765.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0765.$ic284$);
                var115 = var114.first();
                var114 = (var116 = var114.rest());
            }
            if (module0765.NIL == var109) {
                final SubLObject var117 = module0278.f18392(var107, module0147.$g2095$.getDynamicValue(var108));
                if (!var107.equal(var117)) {
                    var109 = f48650(var117);
                }
            }
        }
        return var109;
    }
    
    public static SubLObject f48633(final SubLObject var520) {
        return module0205.f13145((SubLObject)module0765.$ic245$, var520, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48651(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0202.f12590(var1) && (module0765.NIL != module0762.f48174(var1) || module0765.NIL != f48650(var1)));
    }
    
    public static SubLObject f48568(final SubLObject var436, SubLObject var117) {
        if (var117 == module0765.UNPROVIDED) {
            var117 = (SubLObject)module0765.$ic287$;
        }
        final SubLThread var437 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0579.$g4281$.getDynamicValue(var437) && module0765.NIL != module0579.$g4279$.getDynamicValue(var437) && module0765.NIL != module0754.f47311(var436)) {
            f48652(var436, var117);
        }
        return module0754.f47312(var436);
    }
    
    public static SubLObject f48652(final SubLObject var436, SubLObject var117) {
        if (var117 == module0765.UNPROVIDED) {
            var117 = (SubLObject)module0765.$ic287$;
        }
        final SubLThread var437 = SubLProcess.currentSubLThread();
        SubLObject var438 = (SubLObject)module0765.NIL;
        final SubLObject var439 = (SubLObject)module0765.NIL;
        final SubLObject var440 = (SubLObject)module0765.T;
        final SubLObject var441 = (SubLObject)module0765.$ic288$;
        if (module0765.NIL != module0202.f12590(var117)) {
            var438 = module0754.f47373(var436, var117, module0579.$g4262$.getDynamicValue(var437), var439, var440, var441);
        }
        else if (module0765.$ic287$ == var117) {
            SubLObject var442 = module0579.$g4320$.getDynamicValue(var437);
            SubLObject var117_525 = (SubLObject)module0765.NIL;
            var117_525 = var442.first();
            while (module0765.NIL != var442) {
                if (module0765.NIL != module0202.f12590(var117_525)) {
                    final SubLObject var443 = module0754.f47373(var436, var117_525, module0579.$g4262$.getDynamicValue(var437), var439, var440, var441);
                    if (module0765.NIL == var438) {
                        var438 = var443;
                    }
                }
                var442 = var442.rest();
                var117_525 = var442.first();
            }
        }
        else {
            final SubLObject var444 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic289$) });
            module0578.f35476(var444, (SubLObject)ConsesLow.list(var117));
        }
        if (module0765.NIL != var438) {
            final SubLObject var445 = (module0765.NIL != module0579.$g4267$.getDynamicValue(var437)) ? f48653(var438) : var438;
            module0754.f47313(var436, var445, (SubLObject)module0765.UNPROVIDED);
        }
        return module0754.f47312(var436);
    }
    
    public static SubLObject f48653(final SubLObject var310) {
        final SubLThread var311 = SubLProcess.currentSubLThread();
        return module0256.f16574(var310, module0579.$g4266$.getDynamicValue(var311), module0579.$g4262$.getDynamicValue(var311), (SubLObject)module0765.UNPROVIDED).first();
    }
    
    public static SubLObject f48612(final SubLObject var117, SubLObject var528, SubLObject var145, SubLObject var529) {
        if (var528 == module0765.UNPROVIDED) {
            var528 = (SubLObject)module0765.NIL;
        }
        if (var145 == module0765.UNPROVIDED) {
            var145 = module0751.f46691();
        }
        if (var529 == module0765.UNPROVIDED) {
            var529 = (SubLObject)module0765.T;
        }
        final SubLThread var530 = SubLProcess.currentSubLThread();
        SubLObject var531 = module0751.f46678();
        SubLObject var532 = (SubLObject)module0765.NIL;
        SubLObject var533 = (SubLObject)module0765.NIL;
        SubLObject var534 = (SubLObject)module0765.NIL;
        if (module0765.NIL == module0579.$g4279$.getDynamicValue(var530)) {
            return Values.values(var531, (SubLObject)module0765.NIL, var534);
        }
        if (module0765.NIL != module0751.f46706(var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            var530.resetMultipleValues();
            final SubLObject var535 = f48654(var117, var145, module0751.f46678(), var529, var528, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var536 = var530.secondMultipleValue();
            var530.resetMultipleValues();
            if (module0765.NIL != var535) {
                var533 = (SubLObject)ConsesLow.cons(var535, var533);
            }
            if (module0765.NIL != var536) {
                var534 = (SubLObject)ConsesLow.cons(var536, var534);
            }
        }
        else if (module0765.NIL != module0202.f12595(var117)) {
            if (!var528.isList()) {
                var528 = (SubLObject)ConsesLow.list(var528);
            }
            f48634(var117);
            final SubLObject var537 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
            SubLObject var538 = (SubLObject)module0765.NIL;
            SubLObject var539 = (SubLObject)module0765.NIL;
            SubLObject var540 = (SubLObject)module0765.NIL;
            var538 = var537;
            var539 = var538.first();
            for (var540 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL == var532 && module0765.NIL != var538; var538 = var538.rest(), var539 = var538.first(), var540 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var540)) {
                final SubLObject var541 = module0303.f20123(module0048.f_1X(var540));
                final SubLObject var542 = module0751.f46693(var145, var541);
                if (module0765.NIL != module0202.f12592(var539) || module0765.NIL != module0202.f12594(var539)) {
                    var532 = (SubLObject)module0765.T;
                }
                else if (module0765.NIL != module0751.f46706(var539, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                    var530.resetMultipleValues();
                    final SubLObject var543 = f48654(var539, var542, var541, var529, var528, var540, var537, var533);
                    final SubLObject var544 = var530.secondMultipleValue();
                    var530.resetMultipleValues();
                    if (module0765.NIL != var543) {
                        var533 = (SubLObject)ConsesLow.cons(var543, var533);
                    }
                    if (module0765.NIL != var544) {
                        var534 = (SubLObject)ConsesLow.cons(var544, var534);
                    }
                }
                else if (module0765.NIL != var541) {
                    var533 = (SubLObject)ConsesLow.cons(var541, var533);
                }
                else {
                    var533 = (SubLObject)ConsesLow.cons(module0751.f46678(), var533);
                }
            }
        }
        else {
            var533 = (SubLObject)ConsesLow.cons(module0751.f46678(), var533);
        }
        var533 = Sequences.nreverse(var533);
        if (module0765.NIL != var532) {
            var531 = (SubLObject)module0765.$ic100$;
            SubLObject var545 = var534;
            SubLObject var546 = (SubLObject)module0765.NIL;
            var546 = var545.first();
            while (module0765.NIL != var545) {
                module0754.f47316(var546);
                var545 = var545.rest();
                var546 = var545.first();
            }
            var534 = (SubLObject)module0765.NIL;
        }
        else if (module0765.NIL == var533) {
            var531 = (SubLObject)module0765.NIL;
        }
        else if (module0765.NIL != module0035.f1997(var533)) {
            var531 = var533.first();
        }
        else if (module0765.NIL == var534) {
            var531 = module0751.f46678();
        }
        else {
            final SubLObject var547 = module0751.f46604((SubLObject)module0765.$ic84$);
            var531 = module0202.f12683(var547, var533, (SubLObject)module0765.UNPROVIDED);
        }
        if (module0765.NIL != module0751.f46788(var531)) {
            f48646(module0751.f46672(var531, var117));
        }
        return Values.values(var531, (SubLObject)((module0765.NIL != module0751.f46703(var531)) ? module0765.NIL : module0756.f47688((SubLObject)module0765.$ic290$, (SubLObject)module0765.UNPROVIDED)), var534);
    }
    
    public static SubLObject f48654(final SubLObject var534, final SubLObject var536, final SubLObject var349, final SubLObject var529, final SubLObject var528, SubLObject var535, SubLObject var533, SubLObject var530) {
        if (var535 == module0765.UNPROVIDED) {
            var535 = (SubLObject)module0765.NIL;
        }
        if (var533 == module0765.UNPROVIDED) {
            var533 = (SubLObject)module0765.NIL;
        }
        if (var530 == module0765.UNPROVIDED) {
            var530 = (SubLObject)module0765.NIL;
        }
        final SubLThread var537 = SubLProcess.currentSubLThread();
        SubLObject var538 = (SubLObject)module0765.NIL;
        SubLObject var539 = (SubLObject)module0765.NIL;
        var537.resetMultipleValues();
        final SubLObject var540 = module0751.f46690(var534, var536);
        final SubLObject var541 = var537.secondMultipleValue();
        final SubLObject var542 = var537.thirdMultipleValue();
        var537.resetMultipleValues();
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic291$, new SubLObject[] { var540, var541, var542 });
        }
        if (module0765.NIL != var528 && module0765.NIL == module0004.f104(var540, var528, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic292$, var534, var528);
            }
            var538 = var349;
        }
        else if (module0765.NIL != var529 && module0765.NIL != f48655(var540, var535, var533, var530)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic293$, var534, var540);
            }
            module0754.f47314(var540, var541);
            var538 = var349;
        }
        else if (module0765.NIL != module0754.f47310(var540) && (module0765.NIL != module0754.f47311(var540) || module0765.NIL != module0751.f46669(var541, module0754.f47312(var540), module0579.$g4262$.getDynamicValue(var537)))) {
            module0754.f47313(var540, var541, var542);
            final SubLObject var543 = (SubLObject)((module0765.NIL != var349) ? module0751.f46793((SubLObject)module0765.TWO_INTEGER, var349) : module0765.$ic180$);
            final SubLObject var544 = module0751.f46825(var543);
            var539 = (SubLObject)ConsesLow.list(var540, var544);
        }
        else if (module0765.NIL != module0754.f47310(var540) && module0765.NIL != module0751.f46669(module0754.f47312(var540), var541, module0579.$g4262$.getDynamicValue(var537))) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic294$, new SubLObject[] { var540, module0754.f47312(var540), var534 });
            }
        }
        else if (module0765.NIL != module0754.f47310(var540)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic295$, new SubLObject[] { var540, module0754.f47312(var540), var534 });
            }
            var538 = var349;
        }
        else {
            module0754.f47313(var540, var541, var542);
            final SubLObject var543 = (SubLObject)((module0765.NIL != module0751.f46703(var349)) ? module0765.$ic180$ : module0751.f46793((SubLObject)module0765.TWO_INTEGER, var349));
            final SubLObject var544 = module0751.f46825(var543);
            var539 = (SubLObject)ConsesLow.list(var540, var544);
        }
        return Values.values(var538, var539);
    }
    
    public static SubLObject f48656(final SubLObject var436, final SubLObject var535, final SubLObject var533) {
        final SubLObject var536 = ConsesLow.nth(var535, var533);
        SubLObject var537 = (SubLObject)module0765.NIL;
        SubLObject var538 = (SubLObject)module0765.NIL;
        SubLObject var539 = (SubLObject)module0765.NIL;
        SubLObject var540 = (SubLObject)module0765.NIL;
        var538 = var533;
        var539 = var538.first();
        for (var540 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL == var537 && module0765.NIL != var538; var538 = var538.rest(), var539 = var538.first(), var540 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var540)) {
            if (var540.numG(var535)) {
                var537 = f48657(var539, var536, var436);
            }
        }
        return var537;
    }
    
    public static SubLObject f48657(final SubLObject var534, final SubLObject var540, final SubLObject var436) {
        SubLObject var541 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0751.f46706(var534, var436, (SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var542 = module0751.f46689(var534);
            final SubLObject var543 = module0751.f46689(var540);
            var541 = f48658(var542, var543);
        }
        return var541;
    }
    
    public static SubLObject f48658(final SubLObject var84, final SubLObject var543) {
        if (module0765.NIL != module0201.f12546(var543) && module0765.NIL == module0201.f12546(var84)) {
            return (SubLObject)module0765.T;
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48655(final SubLObject var436, final SubLObject var535, final SubLObject var533, final SubLObject var530) {
        SubLObject var536 = (SubLObject)module0765.NIL;
        SubLObject var537 = (SubLObject)module0765.NIL;
        SubLObject var538 = (SubLObject)module0765.NIL;
        SubLObject var539 = (SubLObject)module0765.NIL;
        var537 = var533;
        var538 = var537.first();
        for (var539 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL == var536 && module0765.NIL != var537; var537 = var537.rest(), var538 = var537.first(), var539 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var539)) {
            if (var539.numL(var535)) {
                var536 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0004.f104(module0303.f20123(module0048.f_1X(var539)), var530, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0205.f13220(var436, var538, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
            }
            else if (var539.numG(var535)) {
                var536 = module0205.f13220(var436, var538, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var536);
    }
    
    public static SubLObject f48634(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        SubLObject var119 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0205.f13145((SubLObject)module0765.$ic296$, var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var120 = module0765.$g6122$.currentBinding(var118);
            try {
                module0765.$g6122$.bind((SubLObject)module0765.NIL, var118);
                f48659(var117);
                var119 = module0765.$g6122$.getDynamicValue(var118);
            }
            finally {
                module0765.$g6122$.rebind(var120, var118);
            }
        }
        return var119;
    }
    
    public static SubLObject f48659(final SubLObject var117) {
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = module0205.f13136(var117);
        final SubLObject var120 = (SubLObject)module0765.T;
        final SubLObject var121 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0269.f17723(var119) || module0765.NIL != f48660(var119, (SubLObject)module0765.UNPROVIDED));
        if (module0765.NIL != var121) {
            SubLObject var122 = module0205.f13183(var117, (SubLObject)module0765.$ic296$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            SubLObject var123 = (SubLObject)module0765.NIL;
            var123 = var122.first();
            while (module0765.NIL != var122) {
                f48629(var123);
                var122 = var122.rest();
                var123 = var122.first();
            }
        }
        else {
            SubLObject var124 = (SubLObject)module0765.NIL;
            SubLObject var125 = (SubLObject)module0765.NIL;
            SubLObject var126 = (SubLObject)module0765.NIL;
            var124 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
            var125 = var124.first();
            for (var126 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var124; var124 = var124.rest(), var125 = var124.first(), var126 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var126)) {
                if (module0765.NIL == var120 && module0765.NIL != f48661(var125)) {
                    final SubLObject var127 = module0048.f_1X(var126);
                    if (module0765.NIL != f48662(var119, var127, (SubLObject)module0765.UNPROVIDED)) {
                        f48629(var125);
                    }
                }
                else if (module0765.NIL != module0579.$g4282$.getDynamicValue(var118) && module0765.NIL != module0202.f12590(var125)) {
                    f48659(var125);
                }
            }
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48661(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0201.f12546(var1) && module0765.NIL == f48631(var1));
    }
    
    public static SubLObject f48663(final SubLObject var1, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4262$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0269.f17706(var1) && (module0765.NIL != module0751.f46849(var1, module0765.$ic298$, var103) || module0765.NIL != module0751.f46847((SubLObject)ConsesLow.listS(module0765.$ic299$, var1, (SubLObject)module0765.$ic300$), var103)));
    }
    
    public static SubLObject f48660(final SubLObject var1, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var104 = SubLProcess.currentSubLThread();
        final SubLObject var105 = module0034.$g879$.getDynamicValue(var104);
        SubLObject var106 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var105) {
            return f48663(var1, var103);
        }
        var106 = module0034.f1857(var105, (SubLObject)module0765.$ic297$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == var106) {
            var106 = module0034.f1807(module0034.f1842(var105), (SubLObject)module0765.$ic297$, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic301$, (SubLObject)module0765.EQL, (SubLObject)module0765.UNPROVIDED);
            module0034.f1860(var105, (SubLObject)module0765.$ic297$, var106);
        }
        final SubLObject var107 = module0034.f1782(var1, var103);
        final SubLObject var108 = module0034.f1814(var106, var107, (SubLObject)module0765.UNPROVIDED);
        if (var108 != module0765.$ic256$) {
            SubLObject var109 = var108;
            SubLObject var110 = (SubLObject)module0765.NIL;
            var110 = var109.first();
            while (module0765.NIL != var109) {
                SubLObject var111 = var110.first();
                final SubLObject var112 = conses_high.second(var110);
                if (var1.eql(var111.first())) {
                    var111 = var111.rest();
                    if (module0765.NIL != var111 && module0765.NIL == var111.rest() && var103.eql(var111.first())) {
                        return module0034.f1959(var112);
                    }
                }
                var109 = var109.rest();
                var110 = var109.first();
            }
        }
        final SubLObject var113 = Values.arg2(var104.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48663(var1, var103)));
        module0034.f1836(var106, var107, var108, var113, (SubLObject)ConsesLow.list(var1, var103));
        return module0034.f1959(var113);
    }
    
    public static SubLObject f48664(final SubLObject var125, final SubLObject var135, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4262$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0226.f14935(var125, var135, var103) || module0765.NIL != Sequences.find(module0765.$ic303$, module0226.f14882(var125, var135, var103), (SubLObject)module0765.$ic304$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48662(final SubLObject var125, final SubLObject var135, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = module0034.$g879$.getDynamicValue(var136);
        SubLObject var138 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var137) {
            return f48664(var125, var135, var103);
        }
        var138 = module0034.f1857(var137, (SubLObject)module0765.$ic302$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == var138) {
            var138 = module0034.f1807(module0034.f1842(var137), (SubLObject)module0765.$ic302$, (SubLObject)module0765.THREE_INTEGER, (SubLObject)module0765.$ic305$, (SubLObject)module0765.EQL, (SubLObject)module0765.UNPROVIDED);
            module0034.f1860(var137, (SubLObject)module0765.$ic302$, var138);
        }
        final SubLObject var139 = module0034.f1781(var125, var135, var103);
        final SubLObject var140 = module0034.f1814(var138, var139, (SubLObject)module0765.UNPROVIDED);
        if (var140 != module0765.$ic256$) {
            SubLObject var141 = var140;
            SubLObject var142 = (SubLObject)module0765.NIL;
            var142 = var141.first();
            while (module0765.NIL != var141) {
                SubLObject var143 = var142.first();
                final SubLObject var144 = conses_high.second(var142);
                if (var125.eql(var143.first())) {
                    var143 = var143.rest();
                    if (var135.eql(var143.first())) {
                        var143 = var143.rest();
                        if (module0765.NIL != var143 && module0765.NIL == var143.rest() && var103.eql(var143.first())) {
                            return module0034.f1959(var144);
                        }
                    }
                }
                var141 = var141.rest();
                var142 = var141.first();
            }
        }
        final SubLObject var145 = Values.arg2(var136.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48664(var125, var135, var103)));
        module0034.f1836(var138, var139, var140, var145, (SubLObject)ConsesLow.list(var125, var135, var103));
        return module0034.f1959(var145);
    }
    
    public static SubLObject f48629(final SubLObject var436) {
        final SubLThread var437 = SubLProcess.currentSubLThread();
        module0765.$g6122$.setDynamicValue((SubLObject)ConsesLow.cons(var436, module0765.$g6122$.getDynamicValue(var437)), var437);
        return module0754.f47313(var436, (SubLObject)module0765.$ic306$, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48631(final SubLObject var436) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.f35510() && module0765.$ic306$.eql(module0754.f47312(var436)));
    }
    
    public static SubLObject f48665(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        SubLObject var109 = module0205.f13203(var108, (SubLObject)module0765.UNPROVIDED);
        SubLObject var110 = module0205.f13204(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var111 = module0202.f12592(var109);
        final SubLObject var112 = module0202.f12592(var110);
        SubLObject var113 = (SubLObject)module0765.NIL;
        SubLObject var114 = (SubLObject)module0765.NIL;
        SubLObject var115 = (SubLObject)module0765.NIL;
        SubLObject var116 = (SubLObject)module0765.NIL;
        var116 = (SubLObject)module0765.$ic309$;
        var113 = Sequences.cconcatenate((SubLObject)module0765.$ic3$, module0770.f49097(module0765.$ic220$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        if (module0579.$g4259$.getDynamicValue(var107) == module0765.$ic34$) {
            var116 = module0769.f49022(var116, module0765.$ic310$);
        }
        if (module0765.NIL != var111) {
            var109 = conses_high.second(var109);
            var114 = var113;
        }
        else {
            var114 = module0038.$g916$.getGlobalValue();
        }
        if (module0765.NIL != var112) {
            var110 = conses_high.second(var110);
            var115 = var113;
        }
        else {
            var115 = module0038.$g916$.getGlobalValue();
        }
        final SubLObject var117 = module0579.$g4314$.currentBinding(var107);
        try {
            module0579.$g4314$.bind((SubLObject)ConsesLow.cons((SubLObject)module0765.$ic272$, module0579.$g4314$.getDynamicValue(var107)), var107);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic213$, (SubLObject)module0765.$ic272$);
            }
            module0756.f47723(var106, PrintLow.format((SubLObject)module0765.NIL, var116, new SubLObject[] { var114, module0770.f49097(var109, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var115, module0770.f49097(var110, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) }));
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic215$, (SubLObject)module0765.$ic272$);
            }
        }
        finally {
            module0579.$g4314$.rebind(var117, var107);
        }
        return var106;
    }
    
    public static SubLObject f48666(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0205.f13276(var108);
        final SubLObject var110 = module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var111 = module0205.f13204(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var112 = (SubLObject)((module0765.NIL != module0259.f16854(var109, module0765.$ic313$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) ? module0765.TWO_INTEGER : module0765.ONE_INTEGER);
        final SubLObject var113 = Numbers.subtract((SubLObject)module0765.THREE_INTEGER, var112);
        final SubLObject var114 = module0205.f13277(var108, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var115 = module0205.f13370(var108, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != module0004.f104(var114, module0226.f14882(var111, var112, module0579.$g4262$.getDynamicValue(var107)), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic314$, var111, var115);
            }
            SubLObject var116 = (SubLObject)module0765.NIL;
            final SubLObject var117 = module0751.f47009(f48640(var111), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL == var116) {
                SubLObject var118 = var117;
                SubLObject var119 = (SubLObject)module0765.NIL;
                var119 = var118.first();
                while (module0765.NIL == var116 && module0765.NIL != var118) {
                    if (module0765.NIL != f48667(var119, var108)) {
                        final SubLObject var120 = module0764.f48431(var119, var110, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        final SubLObject var121 = module0751.f46982((SubLObject)module0765.$ic165$, module0756.f47511(var106));
                        SubLObject var122 = (SubLObject)module0765.NIL;
                        module0756.f47465(var120, var111);
                        module0756.f47469(var120, var121);
                        if (module0765.NIL == module0751.f46606((SubLObject)module0765.THREE_INTEGER) && module0765.NIL != module0004.f104(var115, module0226.f14882(var111, var113, module0579.$g4262$.getDynamicValue(var107)), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                            var122 = (SubLObject)ConsesLow.list(var120);
                        }
                        else {
                            final SubLObject var123 = module0751.f46684(var109, module0765.$ic315$, (SubLObject)module0765.UNPROVIDED);
                            final SubLObject var124 = (SubLObject)((module0765.NIL != var123) ? module0765.$ic316$ : module0765.$ic317$);
                            final SubLObject var125 = module0763.f48248(var124, (SubLObject)module0765.UNPROVIDED);
                            module0763.f48337(var125, var108, module0756.f47511(var106), (SubLObject)module0765.NIL);
                            var122 = (SubLObject)ConsesLow.list(var120, var125);
                        }
                        module0756.f47507(var106, var122, (SubLObject)module0765.UNPROVIDED);
                        final SubLObject var126 = module0579.$g4287$.currentBinding(var107);
                        try {
                            module0579.$g4287$.bind((SubLObject)module0765.TWO_INTEGER, var107);
                            module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        }
                        finally {
                            module0579.$g4287$.rebind(var126, var107);
                        }
                        var116 = module0756.f47479(var106);
                    }
                    var118 = var118.rest();
                    var119 = var118.first();
                }
            }
        }
        if (module0765.NIL == module0756.f47479(var106) && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic318$, var108);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48640(final SubLObject var557) {
        final SubLThread var558 = SubLProcess.currentSubLThread();
        SubLObject var559 = (SubLObject)module0765.NIL;
        SubLObject var560 = module0764.f48454((SubLObject)module0765.UNPROVIDED);
        SubLObject var561 = (SubLObject)module0765.NIL;
        var561 = var560.first();
        while (module0765.NIL != var560) {
            final SubLObject var562 = module0732.f44992(var561);
            if (var562.isInteger()) {
                final SubLObject var563 = module0147.f9540(module0579.$g4260$.getDynamicValue(var558));
                final SubLObject var564 = module0147.$g2095$.currentBinding(var558);
                final SubLObject var565 = module0147.$g2094$.currentBinding(var558);
                final SubLObject var566 = module0147.$g2096$.currentBinding(var558);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var563), var558);
                    module0147.$g2094$.bind(module0147.f9546(var563), var558);
                    module0147.$g2096$.bind(module0147.f9549(var563), var558);
                    var559 = ConsesLow.append(var559, module0219.f14510(var557, var562, var561, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
                }
                finally {
                    module0147.$g2096$.rebind(var566, var558);
                    module0147.$g2094$.rebind(var565, var558);
                    module0147.$g2095$.rebind(var564, var558);
                }
            }
            var560 = var560.rest();
            var561 = var560.first();
        }
        return var559;
    }
    
    public static SubLObject f48667(final SubLObject var562, final SubLObject var555) {
        final SubLObject var563 = module0178.f11333(var562);
        final SubLObject var564 = module0751.f47155(var563);
        final SubLObject var565 = (SubLObject)((module0765.NIL != var564) ? module0178.f11331(var562, var564) : module0765.NIL);
        if (!var565.isInteger()) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.ONE_INTEGER.eql(var565) && module0765.NIL != module0751.f46684(module0205.f13276(var555), module0765.$ic319$, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.T;
        }
        if (module0765.TWO_INTEGER.eql(var565) && module0765.NIL != module0751.f46684(module0205.f13276(var555), module0765.$ic313$, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)module0765.T;
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48668(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0756.f47511(var106);
        SubLObject var110 = module0751.f46678();
        SubLObject var111 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0751.f47099(module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.$ic322$, (SubLObject)module0765.UNPROVIDED)) {
            SubLObject var113;
            final SubLObject var112 = var113 = module0205.f13304(var108, (SubLObject)module0765.UNPROVIDED);
            SubLObject var114 = (SubLObject)module0765.NIL;
            SubLObject var115 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var113, var112, (SubLObject)module0765.$ic323$);
            var114 = var113.first();
            var113 = var113.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var113, var112, (SubLObject)module0765.$ic323$);
            var115 = var113.first();
            var113 = var113.rest();
            if (module0765.NIL == var113) {
                var107.resetMultipleValues();
                final SubLObject var116 = f48612(var115, (SubLObject)ConsesLow.list(var114), var109, (SubLObject)module0765.NIL);
                final SubLObject var117 = var107.secondMultipleValue();
                final SubLObject var118 = var107.thirdMultipleValue();
                var107.resetMultipleValues();
                if (module0765.NIL != var116) {
                    if (module0765.NIL != module0751.f46703(var116)) {
                        final SubLObject var119 = module0754.f47373(var114, var115, module0579.$g4262$.getDynamicValue(var107), (SubLObject)module0765.NIL, (SubLObject)module0765.NIL, (SubLObject)module0765.$ic288$);
                        if (module0765.NIL != module0206.f13444(var119)) {
                            var110 = module0202.f12768(module0765.$ic324$, var119, module0202.f12768(module0765.$ic325$, (SubLObject)module0765.$ic177$, (SubLObject)module0765.$ic180$));
                        }
                    }
                    else {
                        final SubLObject var120 = module0754.f47312(var114);
                        var110 = module0202.f12768(module0765.$ic324$, var120, module0202.f12768(module0765.$ic325$, (SubLObject)module0765.$ic177$, module0751.f46672(var116, (SubLObject)module0765.$ic180$)));
                        var111 = var117;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var112, (SubLObject)module0765.$ic323$);
            }
            if (module0765.NIL == module0751.f46703(var110)) {
                module0756.f47745(var106, var110);
                final SubLObject var121 = module0762.f48153((SubLObject)module0765.$ic320$, (SubLObject)module0765.NIL);
                module0762.f48155((SubLObject)module0765.$ic320$, var121);
                try {
                    f48669(var106);
                }
                finally {
                    final SubLObject var122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                        module0762.f48154((SubLObject)module0765.$ic320$, var121);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var122, var107);
                    }
                }
                if (module0765.NIL != module0756.f47479(var106) && module0765.NIL != var111) {
                    module0756.f47569(var106, var111);
                }
            }
        }
        return var106;
    }
    
    public static SubLObject f48670(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED);
        if (module0205.f13136(var108).eql(module0765.$ic324$)) {
            return f48669(var106);
        }
        if (module0765.NIL != module0751.f47152(var108)) {
            return var106;
        }
        final SubLObject var110 = module0579.$g4336$.currentBinding(var107);
        try {
            module0579.$g4336$.bind(module0205.f13132(var108), var107);
            final SubLObject var111 = module0756.f47511(var106);
            final SubLObject var18_580 = module0579.$g4335$.currentBinding(var107);
            try {
                module0579.$g4335$.bind(module0751.f46982((SubLObject)module0765.$ic84$, var111), var107);
                final SubLObject var112 = f48671(var108);
                if (module0765.NIL != var112) {
                    SubLObject var113 = (SubLObject)module0765.NIL;
                    SubLObject var114 = (SubLObject)module0765.NIL;
                    final SubLObject var115 = module0205.f13364(var108);
                    final SubLObject var116 = module0205.f13277(var108, (SubLObject)module0765.UNPROVIDED);
                    final SubLObject var117 = f48672(var115);
                    final SubLObject var118 = f48673(var108);
                    final SubLObject var119 = module0751.f46693(var111, var117);
                    final SubLObject var120 = Sequences.position(var116, var118, Symbols.symbol_function((SubLObject)module0765.EQUAL), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                    final SubLObject var18_581 = module0579.$g4304$.currentBinding(var107);
                    try {
                        module0579.$g4304$.bind((SubLObject)module0765.T, var107);
                        if (module0765.NIL == var113) {
                            SubLObject var121 = var112;
                            SubLObject var122 = (SubLObject)module0765.NIL;
                            var122 = var121.first();
                            while (module0765.NIL == var113 && module0765.NIL != var121) {
                                if (module0765.NIL != f48674(var120, var122)) {
                                    final SubLObject var123 = module0756.f47481(var106, (SubLObject)module0765.UNPROVIDED);
                                    final SubLObject var124 = module0751.f46599();
                                    module0751.f46603(var117);
                                    var107.resetMultipleValues();
                                    final SubLObject var125 = f48675(var120, var118, var109, var115, var122, var123, var108, var119);
                                    final SubLObject var126 = var107.secondMultipleValue();
                                    var107.resetMultipleValues();
                                    if (module0765.NIL != module0756.f47497(var122, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0756.f47479(var122)) {
                                        if (module0765.NIL != module0756.f47479(var106) && module0765.NIL != module0579.f35485()) {
                                            final SubLObject var127 = module0756.f47484(var122, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                            module0758.f47911(var127, (SubLObject)module0765.UNPROVIDED);
                                            module0756.f47675(var106, var127);
                                        }
                                        else {
                                            var113 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == module0579.f35485());
                                            module0756.f47484(var122, var106, (SubLObject)module0765.UNPROVIDED);
                                            module0758.f47911(var106, (SubLObject)module0765.UNPROVIDED);
                                        }
                                    }
                                    else if (module0765.NIL != module0756.f47466(var125)) {
                                        if (module0765.NIL != module0751.f47030(var126)) {
                                            module0756.f47783(var106, var126, (SubLObject)module0765.UNPROVIDED);
                                        }
                                        var113 = (SubLObject)module0765.T;
                                        module0756.f47501(var106, var125, (SubLObject)module0765.UNPROVIDED);
                                        module0756.f47608(var106);
                                        var114 = f48676(var122);
                                    }
                                    else {
                                        module0751.f46601(var124);
                                    }
                                }
                                var121 = var121.rest();
                                var122 = var121.first();
                            }
                        }
                        if (module0765.NIL != var113 && module0765.NIL != var114) {
                            SubLObject var128 = var114;
                            SubLObject var129 = (SubLObject)module0765.NIL;
                            var129 = var128.first();
                            while (module0765.NIL != var128) {
                                module0756.f47569(var106, var129);
                                var128 = var128.rest();
                                var129 = var128.first();
                            }
                        }
                    }
                    finally {
                        module0579.$g4304$.rebind(var18_581, var107);
                    }
                }
            }
            finally {
                module0579.$g4335$.rebind(var18_580, var107);
            }
        }
        finally {
            module0579.$g4336$.rebind(var110, var107);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48669(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0765.NIL == module0765.$g6123$.getDynamicValue(var107)) {
            return var106;
        }
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != module0751.f47152(var108)) {
            return var106;
        }
        final SubLObject var110 = module0579.$g4336$.currentBinding(var107);
        try {
            module0579.$g4336$.bind(module0205.f13132(var108), var107);
            final SubLObject var111 = module0756.f47511(var106);
            final SubLObject var18_595 = module0579.$g4335$.currentBinding(var107);
            try {
                module0579.$g4335$.bind(module0751.f46982((SubLObject)module0765.$ic84$, var111), var107);
                SubLObject var112 = (SubLObject)module0765.NIL;
                SubLObject var113 = (SubLObject)module0765.NIL;
                SubLObject var114 = (SubLObject)module0765.NIL;
                SubLObject var115 = (SubLObject)module0765.NIL;
                var107.resetMultipleValues();
                final SubLObject var116 = f48677(var108);
                final SubLObject var117 = var107.secondMultipleValue();
                final SubLObject var118 = var107.thirdMultipleValue();
                var107.resetMultipleValues();
                var107.resetMultipleValues();
                final SubLObject var119 = f48678(var116);
                final SubLObject var120 = var107.secondMultipleValue();
                var107.resetMultipleValues();
                SubLObject var121;
                SubLObject var122;
                SubLObject var123;
                for (var121 = (SubLObject)module0765.NIL, var121 = var119; module0765.NIL == var115 && module0765.NIL != var121; var121 = var121.rest()) {
                    var122 = var121.first();
                    var123 = f48679(var122);
                    if (module0765.NIL != module0035.f2012(var123)) {
                        var115 = (SubLObject)module0765.T;
                    }
                    else {
                        var112 = (SubLObject)ConsesLow.cons(var123, var112);
                    }
                }
                if (module0765.NIL == var115) {
                    var112 = Sequences.nreverse(var112);
                    final SubLObject var124 = module0202.f12768(module0765.$ic328$, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic180$);
                    final SubLObject var125 = module0751.f46693(var111, var124);
                    SubLObject var126 = (SubLObject)module0765.NIL;
                    SubLObject var127 = (SubLObject)module0765.ZERO_INTEGER;
                    final SubLObject var128 = module0035.f1997(var119);
                    SubLObject var129 = (SubLObject)module0765.NIL;
                    SubLObject var602_607 = (SubLObject)module0765.NIL;
                    SubLObject var130 = (SubLObject)module0765.NIL;
                    SubLObject var581_609 = (SubLObject)module0765.NIL;
                    var129 = var119;
                    var602_607 = var129.first();
                    var130 = var112;
                    var581_609 = var130.first();
                    while (module0765.NIL != var130 || module0765.NIL != var129) {
                        if (module0765.NIL == var115) {
                            SubLObject var131 = (SubLObject)module0765.NIL;
                            final SubLObject var132 = Numbers.zerop(var127);
                            SubLObject var133 = (SubLObject)module0765.NIL;
                            final SubLObject var134 = f48680(var602_607, var117, var127, var120);
                            final SubLObject var135 = module0751.f46693(var111, var134);
                            final SubLObject var136 = Sequences.position(var117, var602_607, Symbols.symbol_function((SubLObject)module0765.EQUAL), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            final SubLObject var18_596 = module0579.$g4304$.currentBinding(var107);
                            try {
                                module0579.$g4304$.bind((SubLObject)module0765.T, var107);
                                if (module0765.NIL == var131) {
                                    SubLObject var137 = var581_609;
                                    SubLObject var138 = (SubLObject)module0765.NIL;
                                    var138 = var137.first();
                                    while (module0765.NIL == var131 && module0765.NIL != var137) {
                                        if (module0765.NIL != module0756.f47497(var138, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != f48674(var136, var138)) {
                                            module0756.f47623(var138, module0756.f47633(var106));
                                            final SubLObject var139 = module0756.f47481(var106, (SubLObject)module0765.UNPROVIDED);
                                            final SubLObject var140 = module0751.f46599();
                                            module0751.f46603(var134);
                                            var107.resetMultipleValues();
                                            final SubLObject var141 = f48681(var118, var117, var602_607, var109, var138, var139, var108, var135, var132, var128);
                                            final SubLObject var142 = var107.secondMultipleValue();
                                            var107.resetMultipleValues();
                                            if (module0765.NIL != module0756.f47497(var138, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0756.f47479(var138)) {
                                                var131 = (SubLObject)module0765.T;
                                                final SubLObject var143 = module0756.f47590(var138, (SubLObject)module0765.ZERO_INTEGER);
                                                if (module0765.NIL != var132) {
                                                    final SubLObject var144 = module0756.f47590(var138, (SubLObject)module0765.ONE_INTEGER);
                                                    var113 = (SubLObject)ConsesLow.cons(module0756.f47484(var143, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var113);
                                                    var113 = (SubLObject)ConsesLow.cons(module0756.f47484(var144, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var113);
                                                    module0756.f47723(var144, module0038.$g916$.getGlobalValue());
                                                }
                                                module0756.f47723(var143, module0038.$g916$.getGlobalValue());
                                                module0756.f47501(var143, (SubLObject)module0765.NIL, (SubLObject)module0765.UNPROVIDED);
                                                module0756.f47535(var138);
                                                module0758.f47878(var138, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                var114 = (SubLObject)ConsesLow.cons(var138, var114);
                                            }
                                            else if (module0765.NIL != module0756.f47466(var141)) {
                                                var131 = (SubLObject)module0765.T;
                                                if (module0765.NIL != var132) {
                                                    if (module0765.NIL != module0751.f47030(var142)) {
                                                        module0756.f47783(var106, var142, (SubLObject)module0765.UNPROVIDED);
                                                    }
                                                    module0756.f47501(var106, var141, (SubLObject)module0765.UNPROVIDED);
                                                }
                                                else {
                                                    module0756.f47501(var106, ConsesLow.append(module0756.f47467(var106), var141.rest()), (SubLObject)module0765.UNPROVIDED);
                                                }
                                                var133 = f48676(var138);
                                            }
                                            else {
                                                module0751.f46601(var140);
                                            }
                                        }
                                        var137 = var137.rest();
                                        var138 = var137.first();
                                    }
                                }
                                if (module0765.NIL != var131) {
                                    var126 = ConsesLow.append(var133, var126);
                                    var127 = module0048.f_1X(var127);
                                }
                                else {
                                    var115 = (SubLObject)module0765.T;
                                }
                            }
                            finally {
                                module0579.$g4304$.rebind(var18_596, var107);
                            }
                        }
                        var129 = var129.rest();
                        var602_607 = var129.first();
                        var130 = var130.rest();
                        var581_609 = var130.first();
                    }
                    if (module0765.NIL == var115) {
                        if (module0765.NIL != module0035.f1997(var114)) {
                            final SubLObject var145 = module0035.f2113(var114);
                            var113 = (SubLObject)ConsesLow.cons(var145, var113);
                        }
                        else {
                            final SubLObject var145 = module0756.f47580(Sequences.nreverse(var114), module0756.f47583(var120), (SubLObject)module0765.$ic6$);
                            module0756.f47465(var145, var116);
                            module0756.f47464(var145, var125);
                            var113 = (SubLObject)ConsesLow.cons(var145, var113);
                        }
                        module0756.f47507(var106, Sequences.reverse(var113), (SubLObject)module0765.ZERO_INTEGER);
                        final SubLObject var146 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        module0758.f47878(var146, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47484(var146, var106, (SubLObject)module0765.UNPROVIDED);
                        SubLObject var147 = var126;
                        SubLObject var148 = (SubLObject)module0765.NIL;
                        var148 = var147.first();
                        while (module0765.NIL != var147) {
                            module0756.f47569(var106, var148);
                            var147 = var147.rest();
                            var148 = var147.first();
                        }
                    }
                }
            }
            finally {
                module0579.$g4335$.rebind(var18_595, var107);
            }
        }
        finally {
            module0579.$g4336$.rebind(var110, var107);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48673(final SubLObject var555) {
        final SubLObject var556 = module0205.f13364(var555);
        final SubLObject var557 = f48672(var556);
        return module0751.f46672(var557, var555);
    }
    
    public static SubLObject f48677(final SubLObject var594) {
        SubLObject var596;
        final SubLObject var595 = var596 = module0205.f13207(var594, (SubLObject)module0765.UNPROVIDED);
        SubLObject var597 = (SubLObject)module0765.NIL;
        SubLObject var598 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var596, var595, (SubLObject)module0765.$ic329$);
        var597 = var596.first();
        var596 = var596.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var596, var595, (SubLObject)module0765.$ic329$);
        var598 = var596.first();
        var596 = var596.rest();
        if (module0765.NIL == var596) {
            if (module0765.NIL != module0206.f13453(var598) && module0205.f13276(var598).eql(module0765.$ic325$)) {
                SubLObject var624_625;
                final SubLObject var622_623 = var624_625 = module0205.f13304(var598, (SubLObject)module0765.UNPROVIDED);
                SubLObject var599 = (SubLObject)module0765.NIL;
                SubLObject var600 = (SubLObject)module0765.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var624_625, var622_623, (SubLObject)module0765.$ic330$);
                var599 = var624_625.first();
                var624_625 = var624_625.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var624_625, var622_623, (SubLObject)module0765.$ic330$);
                var600 = var624_625.first();
                var624_625 = var624_625.rest();
                if (module0765.NIL == var624_625) {
                    return Values.values(var600, var599, var597);
                }
                cdestructuring_bind.cdestructuring_bind_error(var622_623, (SubLObject)module0765.$ic330$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var595, (SubLObject)module0765.$ic329$);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48678(final SubLObject var585) {
        if (module0765.NIL != module0202.f12596(var585)) {
            return Values.values(module0205.f13207(var585, (SubLObject)module0765.UNPROVIDED), module0205.f13136(var585));
        }
        return Values.values((SubLObject)ConsesLow.list(var585), (SubLObject)module0765.NIL);
    }
    
    public static SubLObject f48682(final SubLObject var348) {
        final SubLThread var349 = SubLProcess.currentSubLThread();
        final SubLObject var350 = module0751.f46684(var348, module0765.$ic319$, module0579.$g4260$.getDynamicValue(var349));
        final SubLObject var351 = module0751.f46684(var348, module0765.$ic332$, module0579.$g4260$.getDynamicValue(var349));
        SubLObject var352 = (SubLObject)ConsesLow.list((SubLObject)module0765.$ic177$, (SubLObject)((module0765.NIL != var351) ? module0751.f46671((SubLObject)module0765.$ic333$, (SubLObject)module0765.$ic334$, (SubLObject)module0765.UNPROVIDED) : module0765.$ic333$));
        if (module0765.NIL == var350) {
            var352 = Sequences.nreverse(var352);
        }
        return module0202.f12683((SubLObject)module0765.$ic180$, var352, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48672(final SubLObject var348) {
        final SubLThread var349 = SubLProcess.currentSubLThread();
        final SubLObject var350 = module0034.$g879$.getDynamicValue(var349);
        SubLObject var351 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var350) {
            return f48682(var348);
        }
        var351 = module0034.f1857(var350, (SubLObject)module0765.$ic331$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == var351) {
            var351 = module0034.f1807(module0034.f1842(var350), (SubLObject)module0765.$ic331$, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic335$, (SubLObject)module0765.EQUAL, (SubLObject)module0765.UNPROVIDED);
            module0034.f1860(var350, (SubLObject)module0765.$ic331$, var351);
        }
        SubLObject var352 = module0034.f1814(var351, var348, (SubLObject)module0765.$ic256$);
        if (var352 == module0765.$ic256$) {
            var352 = Values.arg2(var349.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48682(var348)));
            module0034.f1816(var351, var348, var352, (SubLObject)module0765.UNPROVIDED);
        }
        return module0034.f1959(var352);
    }
    
    public static SubLObject f48680(final SubLObject var602, final SubLObject var600, final SubLObject var604, final SubLObject var242) {
        final SubLObject var605 = module0202.f12768(module0765.$ic328$, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic180$);
        final SubLObject var606 = (module0765.NIL == var242) ? var605 : module0202.f12768(module0765.$ic328$, module0048.f_1X(var604), var605);
        return f48683(var606, var602, var600);
    }
    
    public static SubLObject f48683(final SubLObject var612, final SubLObject var602, final SubLObject var600) {
        SubLObject var613 = (SubLObject)module0765.NIL;
        SubLObject var614 = (SubLObject)module0765.NIL;
        SubLObject var615 = (SubLObject)module0765.NIL;
        SubLObject var616 = (SubLObject)module0765.NIL;
        var614 = var602;
        var615 = var614.first();
        for (var616 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var614; var614 = var614.rest(), var615 = var614.first(), var616 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var616)) {
            SubLObject var617 = (SubLObject)module0765.NIL;
            if (var615.eql(var600)) {
                var617 = (SubLObject)module0765.$ic177$;
            }
            else if (var615.isAtom()) {
                var617 = module0202.f12768(module0765.$ic328$, var616, var612);
            }
            else if (var615.isList()) {
                var617 = f48683(module0202.f12768(module0765.$ic328$, var616, var612), var615, var600);
            }
            else {
                final SubLObject var618 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic336$) });
                module0578.f35476(var618, (SubLObject)ConsesLow.list(var615));
            }
            var613 = (SubLObject)ConsesLow.cons(var617, var613);
        }
        return Sequences.nreverse(var613);
    }
    
    public static SubLObject f48671(final SubLObject var555) {
        final SubLThread var556 = SubLProcess.currentSubLThread();
        final SubLObject var557 = f48673(var555);
        final SubLObject var558 = module0205.f13136(var557);
        final SubLObject var559 = module0205.f13207(var557, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var560 = f48548(var558, var559, (SubLObject)module0765.NIL);
        SubLObject var561 = (SubLObject)module0765.NIL;
        SubLObject var562 = (SubLObject)module0765.NIL;
        assert module0765.NIL != module0751.f46598((SubLObject)module0765.T) : module0765.T;
        final SubLObject var563 = module0579.$g4254$.currentBinding(var556);
        try {
            module0579.$g4254$.bind((SubLObject)module0765.T, var556);
            var561 = module0763.f48362(var557, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        finally {
            module0579.$g4254$.rebind(var563, var556);
        }
        if (var561.isList()) {
            SubLObject var564 = var561;
            SubLObject var565 = (SubLObject)module0765.NIL;
            var565 = var564.first();
            while (module0765.NIL != var564) {
                if (module0765.NIL != module0756.f47497(var565, (SubLObject)module0765.UNPROVIDED)) {
                    module0756.f47465(var565, var555);
                    var562 = (SubLObject)ConsesLow.cons(var565, var562);
                    if (module0765.NIL != module0259.f16891(var558, module0765.$ic337$)) {
                        var562 = (SubLObject)ConsesLow.cons(module0758.f48034(module0756.f47484(var565, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)), var562);
                    }
                }
                var564 = var564.rest();
                var565 = var564.first();
            }
            var562 = Sequences.nreverse(var562);
        }
        return ConsesLow.append(var562, var560);
    }
    
    public static SubLObject f48679(final SubLObject var602) {
        final SubLThread var603 = SubLProcess.currentSubLThread();
        final SubLObject var604 = module0205.f13136(var602);
        final SubLObject var605 = module0205.f13207(var602, (SubLObject)module0765.UNPROVIDED);
        SubLObject var606 = (SubLObject)module0765.NIL;
        SubLObject var607 = (SubLObject)module0765.NIL;
        SubLObject var608 = (SubLObject)module0765.NIL;
        final SubLObject var609 = module0579.$g4280$.currentBinding(var603);
        try {
            module0579.$g4280$.bind((SubLObject)module0765.ZERO_INTEGER, var603);
            var607 = f48548(var604, var605, (SubLObject)module0765.NIL);
            var608 = module0763.f48362(var602, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        finally {
            module0579.$g4280$.rebind(var609, var603);
        }
        if (var608.isList()) {
            SubLObject var610 = var608;
            SubLObject var611 = (SubLObject)module0765.NIL;
            var611 = var610.first();
            while (module0765.NIL != var610) {
                if (module0765.NIL != module0756.f47497(var611, (SubLObject)module0765.UNPROVIDED)) {
                    module0756.f47465(var611, var602);
                    var606 = (SubLObject)ConsesLow.cons(var611, var606);
                    if (module0765.NIL != module0259.f16891(var604, module0765.$ic337$)) {
                        var606 = (SubLObject)ConsesLow.cons(module0758.f48034(module0756.f47484(var611, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)), var606);
                    }
                }
                var610 = var610.rest();
                var611 = var610.first();
            }
            var606 = Sequences.nreverse(var606);
        }
        return ConsesLow.append(var606, var607);
    }
    
    public static SubLObject f48675(final SubLObject var587, final SubLObject var585, final SubLObject var138, final SubLObject var348, final SubLObject var349, final SubLObject var589, final SubLObject var555, final SubLObject var145) {
        final SubLThread var590 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0756.f47497(var349, (SubLObject)module0765.UNPROVIDED)) {
            module0763.f48337(var349, var585, var145, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var591 = module0205.f13134(var585, var587, (SubLObject)module0765.UNPROVIDED);
            var590.resetMultipleValues();
            final SubLObject var592 = f48684(var349, var591, var138);
            final SubLObject var593 = var590.secondMultipleValue();
            var590.resetMultipleValues();
            if (module0765.NIL != module0107.f7629(module0579.$g4297$.getDynamicValue(var590))) {
                module0758.f47891(var555, module0756.f47480(var349, (SubLObject)module0765.NIL), var138, module0756.f47690(var349));
            }
            return Values.values(var592, var593);
        }
        if (module0765.NIL != assertion_handles_oc.f11035(var349)) {
            var590.resetMultipleValues();
            final SubLObject var594 = f48685(var587, var585, var348, var349, var555, var145);
            final SubLObject var595 = var590.secondMultipleValue();
            var590.resetMultipleValues();
            return Values.values(var594, var595);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48681(final SubLObject var583, final SubLObject var600, final SubLObject var602, final SubLObject var138, final SubLObject var349, final SubLObject var589, final SubLObject var555, final SubLObject var145, final SubLObject var610, final SubLObject var637) {
        final SubLThread var638 = SubLProcess.currentSubLThread();
        final SubLObject var639 = module0205.f13250(var583, var600, var602, Symbols.symbol_function((SubLObject)module0765.EQ), (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != module0756.f47497(var349, (SubLObject)module0765.UNPROVIDED)) {
            module0763.f48337(var349, var639, var145, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != module0756.f47519(var349)) {
                module0758.f47879(var349, var639, module0756.f47633(var349));
                if (module0765.NIL != module0756.f47519(var349)) {
                    return Values.values((SubLObject)module0765.NIL, (SubLObject)module0765.$ic78$);
                }
            }
            var638.resetMultipleValues();
            final SubLObject var640 = f48686(var349, var583, var138, var610, var637);
            final SubLObject var641 = var638.secondMultipleValue();
            var638.resetMultipleValues();
            return Values.values(var640, var641);
        }
        if (module0765.NIL != assertion_handles_oc.f11035(var349)) {
            Errors.error((SubLObject)module0765.$ic338$, var349);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48676(final SubLObject var349) {
        if (module0765.NIL != module0756.f47497(var349, (SubLObject)module0765.UNPROVIDED)) {
            return module0756.f47510(var349);
        }
        if (module0765.NIL != assertion_handles_oc.f11035(var349)) {
            return (SubLObject)ConsesLow.list(var349);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48684(final SubLObject var349, final SubLObject var583, final SubLObject var138) {
        return f48686(var349, var583, var138, (SubLObject)module0765.T, (SubLObject)module0765.T);
    }
    
    public static SubLObject f48687(final SubLObject var349, final SubLObject var639) {
        final SubLThread var640 = SubLProcess.currentSubLThread();
        return module0765.$g6124$.getDynamicValue(var640);
    }
    
    public static SubLObject f48686(final SubLObject var349, final SubLObject var583, final SubLObject var138, final SubLObject var610, final SubLObject var637) {
        final SubLThread var638 = SubLProcess.currentSubLThread();
        var638.resetMultipleValues();
        final SubLObject var639 = f48688(var349, var583);
        final SubLObject var640 = var638.secondMultipleValue();
        var638.resetMultipleValues();
        if (module0765.NIL != var639) {
            final SubLObject var641 = f48689(var639, var138);
            final SubLObject var642 = module0756.f47648(var349);
            final SubLObject var643 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0756.f47478(var639) && module0765.NIL != module0756.f47730(module0756.f47590(var639, (SubLObject)module0765.ZERO_INTEGER)));
            SubLObject var644 = (SubLObject)module0765.NIL;
            SubLObject var645 = (SubLObject)module0765.NIL;
            final SubLObject var646 = module0751.f46669(var583, module0765.$ic339$, (SubLObject)module0765.UNPROVIDED);
            SubLObject var647 = (SubLObject)module0765.NIL;
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic340$);
            }
            if (module0765.NIL != module0756.f47497(var642, (SubLObject)module0765.UNPROVIDED)) {
                module0758.f47912(var349, var642);
            }
            module0756.f47784(var349, module0756.f47488(var641, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
            SubLObject var648 = (SubLObject)module0765.ZERO_INTEGER;
            if (module0743.f45996(var349).isVector()) {
                final SubLObject var649 = module0743.f45996(var349);
                final SubLObject var650 = (SubLObject)module0765.NIL;
                SubLObject var651;
                SubLObject var652;
                SubLObject var653;
                SubLObject var654;
                SubLObject var655;
                SubLObject var656;
                SubLObject var657;
                SubLObject var658;
                for (var651 = Sequences.length(var649), var652 = (SubLObject)module0765.NIL, var652 = (SubLObject)module0765.ZERO_INTEGER; var652.numL(var651); var652 = Numbers.add(var652, (SubLObject)module0765.ONE_INTEGER)) {
                    var653 = ((module0765.NIL != var650) ? Numbers.subtract(var651, var652, (SubLObject)module0765.ONE_INTEGER) : var652);
                    var654 = Vectors.aref(var649, var653);
                    if (module0765.NIL == var643) {
                        f48690(var654, var641, var639);
                    }
                    if (module0765.NIL != var643 && var648.eql(var640)) {
                        var655 = module0749.f46494((SubLObject)module0765.$ic341$, module0756.f47748(), (SubLObject)module0765.UNPROVIDED);
                        module0756.f47503(var655, module0765.$ic342$, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47830(var654, (SubLObject)module0765.ZERO_INTEGER, var655);
                        var647 = (SubLObject)ConsesLow.cons(var641, var647);
                        var647 = (SubLObject)ConsesLow.cons(var654, var647);
                        var644 = (SubLObject)module0765.T;
                    }
                    else if (var648.eql(var640)) {
                        if (module0765.NIL != module0756.f47645(var654)) {
                            if (module0765.NIL != f48687(var349, var654)) {
                                module0756.f47836(module0749.f46494((SubLObject)((module0765.NIL != var646) ? module0765.$ic343$ : module0765.$ic344$), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var654);
                                var647 = module0035.f2083(var654, var647);
                                var647 = Sequences.delete(var645, var647, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                var644 = (SubLObject)module0765.T;
                            }
                            else {
                                var647 = (SubLObject)ConsesLow.cons(var654, var647);
                            }
                        }
                        if (module0765.NIL != module0758.f48000(var654) && module0765.NIL != module0756.f47732(var647.first()) && module0765.NIL != Sequences.find(var645, var647, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic345$);
                            }
                            var656 = var647.first();
                            var657 = Sequences.position(var645, var647, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            var647 = module0035.f2147((SubLObject)module0765.ZERO_INTEGER, var657, var647);
                        }
                        var647 = module0035.f2083(var641, var647);
                    }
                    else if (module0765.NIL != var644) {
                        var647 = (SubLObject)ConsesLow.cons(var654, var647);
                    }
                    else {
                        if (module0765.NIL != var637 && module0765.NIL != f48691(var349)) {
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic346$);
                            }
                        }
                        else if (var654.eql(var642) && module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED) && module0756.f47606(var654, (SubLObject)module0765.UNPROVIDED).eql(module0765.$ic347$)) {
                            var647 = (SubLObject)ConsesLow.cons(module0749.f46494((SubLObject)module0765.$ic348$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var647);
                        }
                        else {
                            if (module0765.NIL != var610) {
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic349$);
                                }
                                var658 = module0756.f47635(var639);
                                var645 = module0749.f46494((SubLObject)module0765.$ic350$, module0756.f47748(), (SubLObject)module0765.UNPROVIDED);
                                module0756.f47620(var645, var658, (SubLObject)module0765.UNPROVIDED);
                                if (module0765.NIL != var646) {
                                    module0772.f49239(var645, (SubLObject)module0765.UNPROVIDED);
                                }
                                var647 = (SubLObject)ConsesLow.cons(var645, var647);
                            }
                            var647 = (SubLObject)ConsesLow.cons(var654, var647);
                        }
                        var644 = (SubLObject)module0765.T;
                    }
                    var648 = Numbers.add(var648, (SubLObject)module0765.ONE_INTEGER);
                }
            }
            final SubLObject var659 = (SubLObject)module0765.ZERO_INTEGER;
            module0756.f47507(var349, Sequences.nreverse(var647), var659);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic351$, module0756.f47588(var349));
            }
            module0756.f47503(var349, module0751.f47125(), (SubLObject)module0765.UNPROVIDED);
            module0758.f47878(var349, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        return Values.values(module0756.f47467(var349), module0756.f47488(var349, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48689(final SubLObject var640, final SubLObject var138) {
        SubLObject var641 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0756.f47478(var640) && module0765.NIL != module0756.f47730(module0756.f47590(var640, (SubLObject)module0765.ZERO_INTEGER))) {
            var641 = module0756.f47484(module0756.f47590(var640, (SubLObject)module0765.ZERO_INTEGER), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            module0756.f47503(var641, module0751.f47118(), (SubLObject)module0765.UNPROVIDED);
        }
        else if (module0765.NIL != module0756.f47591(var640)) {
            var641 = module0756.f47484(var640, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        else if (module0765.NIL != module0756.f47645(var640)) {
            final SubLObject var642 = module0756.f47840((SubLObject)module0765.ONE_INTEGER, var640);
            var641 = module0756.f47484(var642, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        else {
            final SubLObject var643 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic352$) });
            module0578.f35476(var643, (SubLObject)ConsesLow.list(var640));
        }
        if (module0765.NIL != var641) {
            module0756.f47503(var641, module0765.$ic353$, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var644 = module0751.f47099(var138, (SubLObject)module0765.$ic322$, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var645 = module0756.f47790(var644);
            module0756.f47508(var641, module0749.f46382(var645, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
        }
        return var641;
    }
    
    public static SubLObject f48690(final SubLObject var639, final SubLObject var642, final SubLObject var640) {
        if (module0765.NIL != module0756.f47497(var642, (SubLObject)module0765.UNPROVIDED)) {
            SubLObject var643 = module0751.f47162();
            SubLObject var644 = (SubLObject)module0765.NIL;
            var644 = var643.first();
            while (module0765.NIL != var643) {
                if (var640.eql(module0756.f47781(var639, var644))) {
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic354$, new SubLObject[] { var644, var639, var642 });
                    }
                    module0756.f47534(var639, module0751.f46991(var644, var642), (SubLObject)module0765.UNPROVIDED);
                }
                var643 = var643.rest();
                var644 = var643.first();
            }
        }
        return var642;
    }
    
    public static SubLObject f48691(final SubLObject var349) {
        final SubLThread var350 = SubLProcess.currentSubLThread();
        if (module0765.NIL == module0765.$g6125$.getDynamicValue(var350)) {
            return (SubLObject)module0765.NIL;
        }
        if (!module0756.f47606(module0756.f47590(var349, (SubLObject)module0765.ONE_INTEGER), (SubLObject)module0765.UNPROVIDED).eql(module0765.$ic355$)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0035.f2002(module0756.f47516(var349), (SubLObject)module0765.THREE_INTEGER, (SubLObject)module0765.UNPROVIDED) && module0765.NIL == module0751.f47119(module0756.f47726(module0756.f47590(var349, (SubLObject)module0765.TWO_INTEGER)))) {
            return (SubLObject)module0765.T;
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48685(final SubLObject var587, final SubLObject var585, final SubLObject var348, final SubLObject var349, final SubLObject var555, SubLObject var145) {
        if (var145 == module0765.UNPROVIDED) {
            var145 = module0751.f46691();
        }
        final SubLThread var588 = SubLProcess.currentSubLThread();
        var588.resetMultipleValues();
        SubLObject var589 = f48550(var349);
        final SubLObject var590 = var588.secondMultipleValue();
        var588.resetMultipleValues();
        SubLObject var591 = (SubLObject)module0765.NIL;
        final SubLObject var592 = f48554(var585, var348, module0205.f13207(var585, (SubLObject)module0765.UNPROVIDED), var590, var145, (SubLObject)module0765.UNPROVIDED);
        SubLObject var593 = (SubLObject)module0765.NIL;
        SubLObject var594 = (SubLObject)module0765.NIL;
        SubLObject var595 = (SubLObject)module0765.NIL;
        SubLObject var596 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0035.f2014(var592)) {
            assert module0765.NIL != module0751.f46598(module0751.f46607((SubLObject)module0765.ONE_INTEGER, var555)) : module0751.f46607((SubLObject)module0765.ONE_INTEGER, var555);
            final SubLObject var597 = module0579.$g4254$.currentBinding(var588);
            try {
                module0579.$g4254$.bind(module0751.f46607((SubLObject)module0765.ONE_INTEGER, var555), var588);
                final SubLObject var598 = (SubLObject)ConsesLow.list(var587);
                final SubLObject var599 = module0751.f46604(var598);
                final SubLObject var600 = module0751.f46693(var145, var599);
                var588.resetMultipleValues();
                final SubLObject var671_672 = module0770.f49097(module0205.f13134(var585, var587, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.$ic63$, var600);
                final SubLObject var673_674 = var588.secondMultipleValue();
                final SubLObject var675_676 = var588.thirdMultipleValue();
                final SubLObject var677_678 = var588.fourthMultipleValue();
                var588.resetMultipleValues();
                var593 = var671_672;
                var594 = var673_674;
                var595 = var675_676;
                var596 = var677_678;
            }
            finally {
                module0579.$g4254$.rebind(var597, var588);
            }
            final SubLObject var601 = var592;
            final SubLObject var602 = var601.rest();
            final SubLObject var603 = module0205.f13132(var585);
            final SubLObject var604 = module0579.$g4336$.currentBinding(var588);
            try {
                module0579.$g4336$.bind(var603, var588);
                var589 = f48692(var589);
                var591 = f48555(var589, var603, (SubLObject)ConsesLow.cons(var596, var602), var145);
            }
            finally {
                module0579.$g4336$.rebind(var604, var588);
            }
        }
        return Values.values(var591, var594);
    }
    
    public static SubLObject f48692(SubLObject var132) {
        final SubLObject var133 = module0038.f2674(var132, (SubLObject)module0765.$ic356$, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var134 = module0038.f2738(var133, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != module0035.f2002(var134, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0038.f2684(var133, (SubLObject)module0765.$ic357$) && module0765.NIL == module0754.f47343(conses_high.second(var134), module0765.$ic358$, (SubLObject)module0765.$ic359$, (SubLObject)module0765.UNPROVIDED) && module0765.NIL == module0754.f47343(conses_high.second(var134), module0765.$ic360$, (SubLObject)module0765.$ic359$, (SubLObject)module0765.UNPROVIDED) && module0765.NIL == module0754.f47343(conses_high.second(var134), module0765.$ic361$, (SubLObject)module0765.$ic359$, (SubLObject)module0765.UNPROVIDED)) {
            var132 = Sequences.cconcatenate((SubLObject)module0765.$ic356$, module0038.f2674(var133, (SubLObject)module0765.$ic357$, (SubLObject)module0765.UNPROVIDED));
        }
        else {
            var132 = Sequences.cconcatenate((SubLObject)module0765.$ic362$, var133);
        }
        return var132;
    }
    
    public static SubLObject f48674(final SubLObject var587, final SubLObject var349) {
        final SubLThread var588 = SubLProcess.currentSubLThread();
        if (module0765.NIL != assertion_handles_oc.f11035(var349)) {
            var588.resetMultipleValues();
            final SubLObject var589 = f48550(var349);
            final SubLObject var590 = var588.secondMultipleValue();
            var588.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(((var587.eql((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == var590) || var590.first().eql(var587)) && module0765.NIL != f48693(var589) && module0765.NIL != conses_high.member(module0765.$ic363$, f48694(conses_high.second(module0038.f2752(var589, (SubLObject)module0765.UNPROVIDED))), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        }
        if (module0765.NIL != module0756.f47497(var349, (SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var591 = module0751.f46604((SubLObject)ConsesLow.list(var587));
            return f48695(var349, var591);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48694(final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150 = (SubLObject)module0765.NIL;
        final SubLObject var151 = module0580.f35545();
        final SubLObject var152 = module0034.$g879$.currentBinding(var149);
        try {
            module0034.$g879$.bind(var151, var149);
            SubLObject var153 = (SubLObject)module0765.NIL;
            if (module0765.NIL != var151 && module0765.NIL == module0034.f1842(var151)) {
                var153 = module0034.f1869(var151);
                final SubLObject var154 = Threads.current_process();
                if (module0765.NIL == var153) {
                    module0034.f1873(var151, var154);
                }
                else if (!var153.eql(var154)) {
                    Errors.error((SubLObject)module0765.$ic8$);
                }
            }
            try {
                final SubLObject var18_686 = module0584.$g4396$.currentBinding(var149);
                try {
                    module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var149), var149);
                    var150 = module0732.f45117(var148, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                }
                finally {
                    module0584.$g4396$.rebind(var18_686, var149);
                }
            }
            finally {
                final SubLObject var18_687 = Threads.$is_thread_performing_cleanupP$.currentBinding(var149);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var149);
                    if (module0765.NIL != var151 && module0765.NIL == var153) {
                        module0034.f1873(var151, (SubLObject)module0765.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_687, var149);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var152, var149);
        }
        return var150;
    }
    
    public static SubLObject f48695(final SubLObject var106, final SubLObject var141) {
        if (module0765.NIL == module0756.f47478(var106)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL == module0756.f47519(var106)) {
            return module0035.sublisp_boolean(f48688(var106, var141));
        }
        SubLObject var143;
        final SubLObject var142 = var143 = module0756.f47577(var106);
        SubLObject var144 = (SubLObject)module0765.NIL;
        SubLObject var145 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0765.$ic364$);
        var144 = var143.first();
        var143 = var143.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0765.$ic364$);
        var145 = var143.first();
        var143 = var143.rest();
        if (module0765.NIL == var143) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != f48695(var144, var141) && module0765.NIL != f48695(var145, var141));
        }
        cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)module0765.$ic364$);
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48688(final SubLObject var106, final SubLObject var141) {
        SubLObject var142 = (SubLObject)module0765.NIL;
        SubLObject var143 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0756.f47519(var106)) {
            module0758.f47879(var106, var141, (SubLObject)module0765.NIL);
        }
        if (module0765.NIL != module0756.f47478(var106)) {
            if (module0765.NIL == module0756.f47519(var106)) {
                SubLObject var144 = (SubLObject)module0765.ZERO_INTEGER;
                if (module0743.f45996(var106).isVector()) {
                    final SubLObject var145 = module0743.f45996(var106);
                    final SubLObject var146 = (SubLObject)module0765.NIL;
                    SubLObject var147;
                    SubLObject var148;
                    SubLObject var149;
                    SubLObject var150;
                    SubLObject var151;
                    for (var147 = Sequences.length(var145), var148 = (SubLObject)module0765.NIL, var148 = (SubLObject)module0765.ZERO_INTEGER; var148.numL(var147); var148 = Numbers.add(var148, (SubLObject)module0765.ONE_INTEGER)) {
                        var149 = ((module0765.NIL != var146) ? Numbers.subtract(var147, var148, (SubLObject)module0765.ONE_INTEGER) : var148);
                        var150 = Vectors.aref(var145, var149);
                        if (module0765.NIL == var142) {
                            if (module0765.NIL != module0756.f47591(var150) && var141.equal(module0756.f47487(var150, (SubLObject)module0765.UNPROVIDED))) {
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic365$, var150);
                                }
                                var142 = var150;
                                var143 = var144;
                            }
                            else if (var144.eql((SubLObject)module0765.ZERO_INTEGER) && module0765.NIL != module0756.f47591(var150) && module0765.NIL != module0756.f47478(var150)) {
                                var151 = module0756.f47590(var150, (SubLObject)module0765.ZERO_INTEGER);
                                if (module0765.NIL != module0756.f47730(var151) && var141.equal(module0756.f47487(var151, (SubLObject)module0765.UNPROVIDED))) {
                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic365$, var150);
                                    }
                                    var142 = var150;
                                    var143 = var144;
                                }
                            }
                            else if (module0765.NIL != module0756.f47645(var150) && module0765.NIL != f48695(var150, var141)) {
                                var142 = var150;
                                var143 = var144;
                            }
                        }
                        var144 = Numbers.add(var144, (SubLObject)module0765.ONE_INTEGER);
                    }
                }
            }
        }
        return Values.values(var142, var143);
    }
    
    public static SubLObject f48696(final SubLObject var106, final SubLObject var61, SubLObject var695, SubLObject var696, SubLObject var697) {
        if (var695 == module0765.UNPROVIDED) {
            var695 = (SubLObject)module0765.NIL;
        }
        if (var696 == module0765.UNPROVIDED) {
            var696 = Symbols.symbol_function((SubLObject)module0765.EQL);
        }
        if (var697 == module0765.UNPROVIDED) {
            var697 = Symbols.symbol_function((SubLObject)module0765.IDENTITY);
        }
        if (module0765.NIL != module0205.f13220(var61, module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED), var695, var696, var697)) {
            return (SubLObject)module0765.T;
        }
        SubLObject var698 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var698) {
            SubLObject var699;
            SubLObject var700;
            for (var699 = module0756.f47515(var106), var700 = (SubLObject)module0765.NIL, var700 = var699.first(); module0765.NIL == var698 && module0765.NIL != var699; var698 = f48696(var700, var61, var695, var696, var697), var699 = var699.rest(), var700 = var699.first()) {}
        }
        return var698;
    }
    
    public static SubLObject f48697(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0147.f9540(module0579.$g4260$.getDynamicValue(var107));
        final SubLObject var109 = module0147.$g2095$.currentBinding(var107);
        final SubLObject var110 = module0147.$g2094$.currentBinding(var107);
        final SubLObject var111 = module0147.$g2096$.currentBinding(var107);
        try {
            module0147.$g2095$.bind(module0147.f9545(var108), var107);
            module0147.$g2094$.bind(module0147.f9546(var108), var107);
            module0147.$g2096$.bind(module0147.f9549(var108), var107);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic368$);
            }
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic369$, module0751.f46599());
            }
            final SubLObject var112 = module0763.f48259(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED));
            final SubLObject var113 = module0756.f47482(var106);
            final SubLObject var114 = module0756.f47463(var112, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            module0756.f47484(var114, var106, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL == module0756.f47482(var106)) {
                module0756.f47508(var106, var113, (SubLObject)module0765.UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var111, var107);
            module0147.$g2094$.rebind(var110, var107);
            module0147.$g2095$.rebind(var109, var107);
        }
        f48610(var106);
        return var106;
    }
    
    public static SubLObject f48698(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0751.f47099(module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.$ic237$, (SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var109 = module0205.f13132(var108);
            final SubLObject var110 = f48699(var109);
            if (module0765.NIL != module0212.f13762(var109)) {
                final SubLObject var111 = f48700(var109);
                final SubLObject var112 = f48701(var108);
                final SubLObject var113 = (SubLObject)module0765.NIL;
                if (module0765.NIL == module0751.f46703(var112)) {
                    final SubLObject var114 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                    module0756.f47745(var114, var112);
                    final SubLObject var115 = module0756.f47487(var114, (SubLObject)module0765.UNPROVIDED);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic372$, var108, var115);
                    }
                    assert module0765.NIL != module0751.f46598(module0751.f46599()) : module0751.f46599();
                    final SubLObject var116 = module0579.$g4254$.currentBinding(var107);
                    try {
                        module0579.$g4254$.bind(module0751.f46599(), var107);
                        module0751.f46603(var112);
                        f48702(var114, var115, var111, var113, var110);
                    }
                    finally {
                        module0579.$g4254$.rebind(var116, var107);
                    }
                    if (module0765.NIL != module0756.f47479(var114)) {
                        final SubLObject var117 = module0756.f47511(var106);
                        f48703(var114, var109, var117);
                        module0756.f47484(var114, var106, (SubLObject)module0765.UNPROVIDED);
                    }
                }
                if (module0765.NIL == module0756.f47479(var106) && module0765.NIL == var110) {
                    final SubLObject var118 = module0762.f48153((SubLObject)module0765.$ic269$, (SubLObject)module0765.$ic270$);
                    module0762.f48155((SubLObject)module0765.$ic269$, var118);
                    try {
                        f48704(var106);
                    }
                    finally {
                        final SubLObject var119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                            module0762.f48154((SubLObject)module0765.$ic269$, var118);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var119, var107);
                        }
                    }
                }
            }
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic373$, module0756.f47480(var106, (SubLObject)module0765.UNPROVIDED));
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48703(final SubLObject var705, final SubLObject var700, final SubLObject var332) {
        final SubLObject var706 = module0751.f46982((SubLObject)module0765.$ic84$, var332);
        SubLObject var707 = module0756.f47467(var705);
        SubLObject var708 = (SubLObject)module0765.NIL;
        var708 = var707.first();
        while (module0765.NIL != var707) {
            if (module0765.NIL == module0749.f46462(var708) && module0765.NIL == module0749.f46466(var708)) {
                module0749.f46464(var708, var706);
                module0749.f46468(var708, var700);
                module0756.f47719(var708, var700);
            }
            var707 = var707.rest();
            var708 = var707.first();
        }
        return module0756.f47467(var705);
    }
    
    public static SubLObject f48704(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0756.f47511(var106);
        assert module0765.NIL != module0751.f46598((SubLObject)module0765.T) : module0765.T;
        final SubLObject var110 = module0579.$g4254$.currentBinding(var107);
        final SubLObject var111 = module0579.$g4237$.currentBinding(var107);
        try {
            module0579.$g4254$.bind((SubLObject)module0765.T, var107);
            module0579.$g4237$.bind((module0765.NIL != module0579.$g4237$.getDynamicValue(var107)) ? module0579.$g4237$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQUALP), (SubLObject)module0765.UNPROVIDED), var107);
            module0751.f46742(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        finally {
            module0579.$g4237$.rebind(var111, var107);
            module0579.$g4254$.rebind(var110, var107);
        }
        final SubLObject var112 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        if (!var112.equal(var108)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic376$, var108, var112);
            }
            final SubLObject var113 = module0579.$g4323$.currentBinding(var107);
            try {
                module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var107))) ? module0579.$g4323$.getDynamicValue(var107) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var107);
                final SubLObject var114 = module0754.f47307();
                final SubLObject var18_710 = module0754.$g6064$.currentBinding(var107);
                final SubLObject var115 = module0579.$g4324$.currentBinding(var107);
                final SubLObject var116 = module0579.$g4325$.currentBinding(var107);
                try {
                    module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var107), var107);
                    module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var107))) ? module0579.$g4324$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var107);
                    module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var107)), var107);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var107), module0067.f4903(module0579.$g4323$.getDynamicValue(var107)));
                    }
                    try {
                        if (module0765.NIL != module0202.f12597(var112)) {
                            SubLObject var117 = module0751.f46787(var112);
                            SubLObject var118 = (SubLObject)module0765.NIL;
                            var118 = var117.first();
                            while (module0765.NIL != var117) {
                                module0754.f47320(var118, (SubLObject)module0765.$ic236$);
                                var117 = var117.rest();
                                var118 = var117.first();
                            }
                        }
                        module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                    }
                    finally {
                        final SubLObject var18_711 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                            final SubLObject var119 = conses_high.set_difference(module0754.f47307(), var114, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var107), module0754.f47307());
                            }
                            module0580.f35619(var119);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_711, var107);
                        }
                    }
                }
                finally {
                    module0579.$g4325$.rebind(var116, var107);
                    module0579.$g4324$.rebind(var115, var107);
                    module0754.$g6064$.rebind(var18_710, var107);
                }
            }
            finally {
                module0579.$g4323$.rebind(var113, var107);
            }
        }
        if (module0765.NIL != module0756.f47479(var106)) {
            final SubLObject var120 = module0205.f13132(var108);
            final SubLObject var121 = module0751.f46982((SubLObject)module0765.$ic84$, var109);
            final SubLObject var122 = module0756.f47510(var106);
            SubLObject var123 = (SubLObject)module0765.NIL;
            SubLObject var124 = var122;
            SubLObject var125 = (SubLObject)module0765.NIL;
            var125 = var124.first();
            while (module0765.NIL != var124) {
                if (module0765.NIL != assertion_handles_oc.f11035(var125) && module0765.NIL != module0178.f11284(var125) && module0178.f11333(var125).eql(module0765.$ic377$) && module0178.f11334(var125).eql(var120)) {
                    var123 = (SubLObject)ConsesLow.cons(var125, var123);
                }
                var124 = var124.rest();
                var125 = var124.first();
            }
            var124 = module0756.f47467(var106);
            SubLObject var126 = (SubLObject)module0765.NIL;
            var126 = var124.first();
            while (module0765.NIL != var124) {
                if (module0749.f46462(var126).equal(var121) && !module0749.f46466(var126).equal(var120)) {
                    module0749.f46468(var126, var120);
                    module0749.f46464(var126, var121);
                }
                var124 = var124.rest();
                var126 = var124.first();
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48702(final SubLObject var106, final SubLObject var716, final SubLObject var702, final SubLObject var704, final SubLObject var701) {
        final SubLThread var717 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic378$, var716);
        }
        f48705(var106, var716, (SubLObject)module0765.NIL, var702, var704, var701);
        if (module0765.NIL == module0756.f47479(var106)) {
            if (module0765.NIL != var701) {
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic379$, var716);
                }
            }
            else {
                final SubLObject var718 = module0205.f13132(var716);
                SubLObject var719 = (SubLObject)module0765.NIL;
                final SubLObject var720 = module0751.f46623(var718, (SubLObject)module0765.UNPROVIDED);
                SubLObject var721 = (SubLObject)module0765.ZERO_INTEGER;
                final SubLObject var722 = module0751.f46622();
                if (module0765.NIL == var719) {
                    SubLObject var723 = var720;
                    SubLObject var724 = (SubLObject)module0765.NIL;
                    var724 = var723.first();
                    while (module0765.NIL == var719 && module0765.NIL != var723) {
                        final SubLObject var725 = module0202.f12817((SubLObject)module0765.ZERO_INTEGER, var724, var716);
                        f48705(var106, var725, (SubLObject)module0765.NIL, var702, var704, var701);
                        if (module0765.NIL != module0756.f47479(var106)) {
                            f48706(var106, var724, var718);
                            var719 = (SubLObject)module0765.T;
                        }
                        else if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic380$, var724);
                        }
                        var723 = var723.rest();
                        var724 = var723.first();
                    }
                }
                if (module0765.NIL == var719) {
                    final SubLObject var726 = module0137.f8955(module0765.$ic93$);
                    final SubLObject var727 = var718;
                    final SubLObject var728 = (SubLObject)((module0765.$ic95$ == module0765.$ic95$) ? module0765.$ic96$ : module0765.$ic97$);
                    final SubLObject var729 = module0056.f4145(var728);
                    SubLObject var730 = (SubLObject)module0765.NIL;
                    final SubLObject var731 = module0139.$g1635$.currentBinding(var717);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var717);
                        final SubLObject var732 = module0579.$g4262$.getDynamicValue(var717);
                        final SubLObject var18_718 = module0147.$g2095$.currentBinding(var717);
                        final SubLObject var733 = module0147.$g2094$.currentBinding(var717);
                        final SubLObject var734 = module0147.$g2096$.currentBinding(var717);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var732), var717);
                            module0147.$g2094$.bind(module0147.f9546(var732), var717);
                            module0147.$g2096$.bind(module0147.f9549(var732), var717);
                            final SubLObject var735 = module0765.$ic98$;
                            final SubLObject var18_719 = module0141.$g1714$.currentBinding(var717);
                            final SubLObject var45_720 = module0141.$g1715$.currentBinding(var717);
                            try {
                                module0141.$g1714$.bind((module0765.NIL != var735) ? var735 : module0141.f9283(), var717);
                                module0141.$g1715$.bind((SubLObject)((module0765.NIL != var735) ? module0765.$ic99$ : module0141.$g1715$.getDynamicValue(var717)), var717);
                                if (module0765.NIL != var735 && module0765.NIL != module0136.f8864() && module0765.NIL == module0141.f9279(var735)) {
                                    final SubLObject var736 = module0136.$g1591$.getDynamicValue(var717);
                                    if (var736.eql((SubLObject)module0765.$ic100$)) {
                                        module0136.f8870((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic101$, var735, (SubLObject)module0765.$ic102$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                    }
                                    else if (var736.eql((SubLObject)module0765.$ic103$)) {
                                        module0136.f8871((SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic104$, (SubLObject)module0765.$ic101$, var735, (SubLObject)module0765.$ic102$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                    }
                                    else if (var736.eql((SubLObject)module0765.$ic105$)) {
                                        Errors.warn((SubLObject)module0765.$ic101$, var735, (SubLObject)module0765.$ic102$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)module0765.$ic106$, module0136.$g1591$.getDynamicValue(var717));
                                        Errors.cerror((SubLObject)module0765.$ic104$, (SubLObject)module0765.$ic101$, var735, (SubLObject)module0765.$ic102$);
                                    }
                                }
                                final SubLObject var18_720 = module0141.$g1670$.currentBinding(var717);
                                final SubLObject var45_721 = module0141.$g1671$.currentBinding(var717);
                                final SubLObject var47_723 = module0141.$g1672$.currentBinding(var717);
                                final SubLObject var737 = module0141.$g1674$.currentBinding(var717);
                                final SubLObject var738 = module0137.$g1605$.currentBinding(var717);
                                try {
                                    module0141.$g1670$.bind(var726, var717);
                                    module0141.$g1671$.bind(module0244.f15739(var726), var717);
                                    module0141.$g1672$.bind(module0244.f15746(var726), var717);
                                    module0141.$g1674$.bind((SubLObject)module0765.NIL, var717);
                                    module0137.$g1605$.bind(var726, var717);
                                    if (module0765.NIL != module0136.f8865() || module0765.NIL != module0244.f15795(var718, module0137.f8955((SubLObject)module0765.UNPROVIDED))) {
                                        final SubLObject var18_721 = module0141.$g1677$.currentBinding(var717);
                                        final SubLObject var45_722 = module0138.$g1619$.currentBinding(var717);
                                        final SubLObject var47_724 = module0141.$g1674$.currentBinding(var717);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9208(), var717);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var726), var717);
                                            module0141.$g1674$.bind((SubLObject)module0765.NIL, var717);
                                            module0249.f16055(var727, (SubLObject)module0765.UNPROVIDED);
                                            for (var730 = (SubLObject)ConsesLow.list(var718, module0141.f9195()); module0765.NIL != var730 && module0765.NIL == var719; var730 = module0056.f4150(var729)) {
                                                final SubLObject var171_727 = var730.first();
                                                final SubLObject var739 = conses_high.second(var730);
                                                final SubLObject var740 = var171_727;
                                                final SubLObject var18_722 = module0141.$g1674$.currentBinding(var717);
                                                try {
                                                    module0141.$g1674$.bind(var739, var717);
                                                    final SubLObject var741 = var739;
                                                    if (!var718.eql(var740)) {
                                                        if (module0765.NIL == conses_high.member(var740, var720, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                                                            if (var721.numGE(var722)) {
                                                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic381$);
                                                                }
                                                                var719 = (SubLObject)module0765.T;
                                                            }
                                                            else {
                                                                final SubLObject var742 = module0202.f12817((SubLObject)module0765.ZERO_INTEGER, var740, var716);
                                                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic382$, var721, var722);
                                                                }
                                                                f48705(var106, var742, var741, var702, var704, var701);
                                                                if (module0765.NIL != module0756.f47479(var106)) {
                                                                    f48706(var106, var740, var718);
                                                                    var719 = (SubLObject)module0765.T;
                                                                }
                                                                else {
                                                                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                                                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic380$, var740);
                                                                    }
                                                                    var721 = Numbers.add(var721, (SubLObject)module0765.ONE_INTEGER);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    final SubLObject var743 = module0200.f12443(var726);
                                                    SubLObject var744;
                                                    SubLObject var745;
                                                    SubLObject var18_723;
                                                    SubLObject var45_723;
                                                    SubLObject var746;
                                                    SubLObject var747;
                                                    SubLObject var748;
                                                    SubLObject var749;
                                                    SubLObject var750;
                                                    SubLObject var751;
                                                    SubLObject var18_724;
                                                    SubLObject var200_732;
                                                    SubLObject var752;
                                                    SubLObject var753;
                                                    SubLObject var18_725;
                                                    SubLObject var754;
                                                    SubLObject var755;
                                                    SubLObject var756;
                                                    SubLObject var757;
                                                    SubLObject var758;
                                                    SubLObject var759;
                                                    SubLObject var760;
                                                    SubLObject var761;
                                                    SubLObject var137_734;
                                                    SubLObject var762;
                                                    SubLObject var18_726;
                                                    SubLObject var764;
                                                    SubLObject var763;
                                                    SubLObject var765;
                                                    SubLObject var766;
                                                    SubLObject var767;
                                                    SubLObject var768;
                                                    SubLObject var769;
                                                    SubLObject var770;
                                                    for (var744 = (SubLObject)module0765.NIL, var744 = var743; module0765.NIL == var719 && module0765.NIL != var744; var744 = var744.rest()) {
                                                        var745 = var744.first();
                                                        var18_723 = module0137.$g1605$.currentBinding(var717);
                                                        var45_723 = module0141.$g1674$.currentBinding(var717);
                                                        try {
                                                            module0137.$g1605$.bind(var745, var717);
                                                            module0141.$g1674$.bind((SubLObject)((module0765.NIL != module0141.f9205((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0765.NIL == module0141.$g1674$.getDynamicValue(var717)) : module0141.$g1674$.getDynamicValue(var717)), var717);
                                                            var746 = module0228.f15229(var171_727);
                                                            if (module0765.NIL != module0138.f8992(var746)) {
                                                                var747 = module0242.f15664(var746, module0137.f8955((SubLObject)module0765.UNPROVIDED));
                                                                if (module0765.NIL != var747) {
                                                                    var748 = module0245.f15834(var747, module0138.f8979(), module0137.f8955((SubLObject)module0765.UNPROVIDED));
                                                                    if (module0765.NIL != var748) {
                                                                        for (var749 = module0066.f4838(module0067.f4891(var748)); module0765.NIL == var719 && module0765.NIL == module0066.f4841(var749); var749 = module0066.f4840(var749)) {
                                                                            var717.resetMultipleValues();
                                                                            var750 = module0066.f4839(var749);
                                                                            var751 = var717.secondMultipleValue();
                                                                            var717.resetMultipleValues();
                                                                            if (module0765.NIL != module0147.f9507(var750)) {
                                                                                var18_724 = module0138.$g1623$.currentBinding(var717);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var750, var717);
                                                                                    for (var200_732 = module0066.f4838(module0067.f4891(var751)); module0765.NIL == var719 && module0765.NIL == module0066.f4841(var200_732); var200_732 = module0066.f4840(var200_732)) {
                                                                                        var717.resetMultipleValues();
                                                                                        var752 = module0066.f4839(var200_732);
                                                                                        var753 = var717.secondMultipleValue();
                                                                                        var717.resetMultipleValues();
                                                                                        if (module0765.NIL != module0141.f9289(var752)) {
                                                                                            var18_725 = module0138.$g1624$.currentBinding(var717);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var752, var717);
                                                                                                var754 = var753;
                                                                                                if (module0765.NIL != module0077.f5302(var754)) {
                                                                                                    var755 = module0077.f5333(var754);
                                                                                                    for (var756 = module0032.f1741(var755), var757 = (SubLObject)module0765.NIL, var757 = module0032.f1742(var756, var755); module0765.NIL == var719 && module0765.NIL == module0032.f1744(var756, var757); var757 = module0032.f1743(var757)) {
                                                                                                        var758 = module0032.f1745(var756, var757);
                                                                                                        if (module0765.NIL != module0032.f1746(var757, var758) && module0765.NIL == module0249.f16059(var758, (SubLObject)module0765.UNPROVIDED)) {
                                                                                                            module0249.f16055(var758, (SubLObject)module0765.UNPROVIDED);
                                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var758, module0141.f9195()), var729);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var754.isList()) {
                                                                                                    if (module0765.NIL == var719) {
                                                                                                        var759 = var754;
                                                                                                        var760 = (SubLObject)module0765.NIL;
                                                                                                        var760 = var759.first();
                                                                                                        while (module0765.NIL == var719 && module0765.NIL != var759) {
                                                                                                            if (module0765.NIL == module0249.f16059(var760, (SubLObject)module0765.UNPROVIDED)) {
                                                                                                                module0249.f16055(var760, (SubLObject)module0765.UNPROVIDED);
                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var760, module0141.f9195()), var729);
                                                                                                            }
                                                                                                            var759 = var759.rest();
                                                                                                            var760 = var759.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)module0765.$ic107$, var754);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var18_725, var717);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var200_732);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var18_724, var717);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var749);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)module0765.FIVE_INTEGER, (SubLObject)module0765.$ic108$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (module0765.NIL != module0155.f9785(var746, (SubLObject)module0765.UNPROVIDED)) {
                                                                var761 = ((module0765.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var717), module0137.f8955((SubLObject)module0765.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var717), module0137.f8955((SubLObject)module0765.UNPROVIDED)));
                                                                for (var137_734 = (SubLObject)module0765.NIL, var137_734 = var761; module0765.NIL == var719 && module0765.NIL != var137_734; var137_734 = var137_734.rest()) {
                                                                    var762 = var137_734.first();
                                                                    var18_726 = module0138.$g1625$.currentBinding(var717);
                                                                    try {
                                                                        module0138.$g1625$.bind(var762, var717);
                                                                        var763 = (var764 = Functions.funcall(var762, var746));
                                                                        if (module0765.NIL != module0077.f5302(var764)) {
                                                                            var765 = module0077.f5333(var764);
                                                                            for (var766 = module0032.f1741(var765), var767 = (SubLObject)module0765.NIL, var767 = module0032.f1742(var766, var765); module0765.NIL == var719 && module0765.NIL == module0032.f1744(var766, var767); var767 = module0032.f1743(var767)) {
                                                                                var768 = module0032.f1745(var766, var767);
                                                                                if (module0765.NIL != module0032.f1746(var767, var768) && module0765.NIL == module0249.f16059(var768, (SubLObject)module0765.UNPROVIDED)) {
                                                                                    module0249.f16055(var768, (SubLObject)module0765.UNPROVIDED);
                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var768, module0141.f9195()), var729);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var764.isList()) {
                                                                            if (module0765.NIL == var719) {
                                                                                var769 = var764;
                                                                                var770 = (SubLObject)module0765.NIL;
                                                                                var770 = var769.first();
                                                                                while (module0765.NIL == var719 && module0765.NIL != var769) {
                                                                                    if (module0765.NIL == module0249.f16059(var770, (SubLObject)module0765.UNPROVIDED)) {
                                                                                        module0249.f16055(var770, (SubLObject)module0765.UNPROVIDED);
                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var770, module0141.f9195()), var729);
                                                                                    }
                                                                                    var769 = var769.rest();
                                                                                    var770 = var769.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)module0765.$ic107$, var764);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var18_726, var717);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var45_723, var717);
                                                            module0137.$g1605$.rebind(var18_723, var717);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var18_722, var717);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var47_724, var717);
                                            module0138.$g1619$.rebind(var45_722, var717);
                                            module0141.$g1677$.rebind(var18_721, var717);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.$ic109$, var718, module0244.f15748(module0137.f8955((SubLObject)module0765.UNPROVIDED)), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var738, var717);
                                    module0141.$g1674$.rebind(var737, var717);
                                    module0141.$g1672$.rebind(var47_723, var717);
                                    module0141.$g1671$.rebind(var45_721, var717);
                                    module0141.$g1670$.rebind(var18_720, var717);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var45_720, var717);
                                module0141.$g1714$.rebind(var18_719, var717);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var734, var717);
                            module0147.$g2094$.rebind(var733, var717);
                            module0147.$g2095$.rebind(var18_718, var717);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var717));
                    }
                    finally {
                        module0139.$g1635$.rebind(var731, var717);
                    }
                }
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48706(final SubLObject var106, final SubLObject var736, final SubLObject var737) {
        final SubLObject var738 = module0756.f47511(var106);
        final SubLObject var739 = module0751.f46982((SubLObject)module0765.$ic84$, var738);
        SubLObject var740 = module0756.f47467(var106);
        SubLObject var741 = (SubLObject)module0765.NIL;
        var741 = var740.first();
        while (module0765.NIL != var740) {
            if (module0749.f46462(var741).equal(var739) && module0749.f46466(var741).equal(var736)) {
                module0749.f46468(var741, var737);
            }
            var740 = var740.rest();
            var741 = var740.first();
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48707(final SubLObject var700) {
        final SubLObject var701 = module0035.f1997(f48649(var700));
        if (module0765.NIL != var701 && module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic384$, var700);
        }
        return var701;
    }
    
    public static SubLObject f48699(final SubLObject var700) {
        final SubLThread var701 = SubLProcess.currentSubLThread();
        final SubLObject var702 = module0034.$g879$.getDynamicValue(var701);
        SubLObject var703 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var702) {
            return f48707(var700);
        }
        var703 = module0034.f1857(var702, (SubLObject)module0765.$ic383$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == var703) {
            var703 = module0034.f1807(module0034.f1842(var702), (SubLObject)module0765.$ic383$, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic385$, (SubLObject)module0765.EQL, (SubLObject)module0765.UNPROVIDED);
            module0034.f1860(var702, (SubLObject)module0765.$ic383$, var703);
        }
        SubLObject var704 = module0034.f1814(var703, var700, (SubLObject)module0765.$ic256$);
        if (var704 == module0765.$ic256$) {
            var704 = Values.arg2(var701.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48707(var700)));
            module0034.f1816(var703, var700, var704, (SubLObject)module0765.UNPROVIDED);
        }
        return module0034.f1959(var704);
    }
    
    public static SubLObject f48705(final SubLObject var106, final SubLObject var117, final SubLObject var192, final SubLObject var702, final SubLObject var704, final SubLObject var701) {
        final SubLThread var705 = SubLProcess.currentSubLThread();
        final SubLObject var706 = module0084.f5760(module0579.$g4323$.getDynamicValue(var705));
        final SubLObject var707 = module0579.$g4324$.currentBinding(var705);
        final SubLObject var708 = module0580.$g4373$.currentBinding(var705);
        try {
            module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var705))) ? module0579.$g4324$.getDynamicValue(var705) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var705);
            module0580.$g4373$.bind(module0048.f_1X(module0580.$g4373$.getDynamicValue(var705)), var705);
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic386$, module0580.$g4373$.getDynamicValue(var705), module0067.f4903(module0579.$g4323$.getDynamicValue(var705)));
            }
            try {
                final SubLObject var18_739 = module0579.$g4323$.currentBinding(var705);
                try {
                    module0579.$g4323$.bind(var706, var705);
                    final SubLObject var709 = module0756.f47511(var106);
                    final SubLObject var710 = f48708(var117, var192, var702, var701, var709);
                    if (module0765.NIL != module0756.f47497(var710, (SubLObject)module0765.UNPROVIDED)) {
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic387$, module0756.f47487(var710, (SubLObject)module0765.UNPROVIDED));
                        }
                        module0756.f47787(var710, module0756.f47779(var106), (SubLObject)module0765.UNPROVIDED);
                        f48610(var710);
                        if (module0765.NIL != module0756.f47479(var710)) {
                            module0756.f47484(var710, var106, (SubLObject)module0765.UNPROVIDED);
                        }
                    }
                    else if (var710 == module0765.$ic388$ && module0765.NIL == var704) {
                        final SubLObject var711 = f48709(var117, var192, var702, var701);
                        if (module0765.NIL != var711) {
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic389$, var711, var117);
                            }
                            module0756.f47465(var106, var117);
                            module0756.f47569(var106, var711);
                            final SubLObject var712 = f48546(var117, var711, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            if (module0765.NIL != module0756.f47466(var712)) {
                                module0756.f47501(var106, var712, (SubLObject)module0765.UNPROVIDED);
                                module0756.f47608(var106);
                            }
                        }
                    }
                }
                finally {
                    module0579.$g4323$.rebind(var18_739, var705);
                }
            }
            finally {
                final SubLObject var18_740 = Threads.$is_thread_performing_cleanupP$.currentBinding(var705);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var705);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic390$, module0580.$g4373$.getDynamicValue(var705));
                    }
                    if (module0765.NIL != module0756.f47479(var106)) {
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic391$, module0756.f47467(var106));
                        }
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic392$, module0579.$g4323$.getDynamicValue(var705), module0067.f4903(var706));
                        }
                        module0580.f35617(var706);
                    }
                    else if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic393$, module0067.f4903(module0579.$g4323$.getDynamicValue(var705)));
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_740, var705);
                }
            }
        }
        finally {
            module0580.$g4373$.rebind(var708, var705);
            module0579.$g4324$.rebind(var707, var705);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48700(final SubLObject var700) {
        final SubLObject var701 = f48710(var700);
        return (SubLObject)((module0765.NIL != var701) ? f48711(var700, var701) : module0765.NIL);
    }
    
    public static SubLObject f48710(final SubLObject var108) {
        return module0220.f14556(var108, module0765.$ic394$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48711(final SubLObject var700, final SubLObject var33) {
        return conses_high.second(conses_high.assoc(var33, f48712(var700), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48712(final SubLObject var700) {
        if (module0765.NIL != constant_handles_oc.f8463(constants_high_oc.f10737((SubLObject)module0765.$ic395$), (SubLObject)module0765.UNPROVIDED)) {
            SubLObject var701 = (SubLObject)module0765.NIL;
            var701 = module0220.f14601(var700, module0765.$ic396$, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic397$, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL == var701) {
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0765.$ic398$, var700);
                }
            }
            else if (module0765.NIL == module0035.f1995(var701, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.UNPROVIDED)) {
                final SubLObject var702 = Sequences.cconcatenate((SubLObject)module0765.$ic201$, new SubLObject[] { module0006.f205((SubLObject)module0765.ONE_INTEGER), module0765.$ic202$, module0006.f203((SubLObject)module0765.$ic399$) });
                module0578.f35476(var702, (SubLObject)ConsesLow.list(var700, Sequences.length(var701)));
            }
            return var701;
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48701(final SubLObject var117) {
        final SubLObject var118 = module0205.f13136(var117);
        final SubLObject var119 = f48713(var118);
        SubLObject var120 = (SubLObject)module0765.NIL;
        final SubLObject var121 = Sequences.length(var119);
        if (var121.eql((SubLObject)module0765.ZERO_INTEGER)) {
            return module0751.f46678();
        }
        SubLObject var122 = var119;
        SubLObject var123 = (SubLObject)module0765.NIL;
        var123 = var122.first();
        while (module0765.NIL != var122) {
            if (var123.first() == module0765.$ic400$) {
                var120 = (SubLObject)ConsesLow.cons(module0303.f20123(conses_high.second(var123)), var120);
            }
            else {
                SubLObject var125;
                final SubLObject var124 = var125 = var123;
                SubLObject var126 = (SubLObject)module0765.NIL;
                SubLObject var127 = (SubLObject)module0765.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var125, var124, (SubLObject)module0765.$ic401$);
                var126 = var125.first();
                var125 = var125.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var125, var124, (SubLObject)module0765.$ic401$);
                var127 = var125.first();
                var125 = var125.rest();
                if (module0765.NIL == var125) {
                    if (var126.eql(module0765.$ic286$) && module0765.NIL != module0201.f12546(module0205.f13134(var117, var127, (SubLObject)module0765.UNPROVIDED)) && module0765.$ic212$ == module0754.f47319(module0205.f13134(var117, var127, (SubLObject)module0765.UNPROVIDED))) {
                        var126 = module0765.$ic402$;
                    }
                    var120 = (SubLObject)ConsesLow.cons(f48714(var126, module0303.f20123(var127)), var120);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var124, (SubLObject)module0765.$ic401$);
                }
            }
            var122 = var122.rest();
            var123 = var122.first();
        }
        return module0763.f48259(module0202.f12683((SubLObject)module0765.$ic177$, Sequences.nreverse(var120), (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48714(final SubLObject var279, SubLObject var749) {
        final SubLThread var750 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0762.f48165(var749)) {
            final SubLObject var751 = f48715(var749);
            if (module0765.NIL != var751) {
                var749 = var751;
            }
        }
        if (var279.eql(module0765.$ic403$)) {
            return (SubLObject)ConsesLow.list(module0765.$ic404$, module0765.$ic405$, var749);
        }
        if (var749.eql(module0765.$ic406$) && var279.eql(module0765.$ic286$)) {
            return module0762.f48215((SubLObject)module0765.$ic407$);
        }
        final SubLObject var752 = f48716(var279);
        SubLObject var753 = (module0765.NIL != var752) ? var752.first() : module0765.$ic408$;
        if (module0765.NIL != module0751.f46658(module0765.$ic409$, var753, module0579.$g4260$.getDynamicValue(var750))) {
            var753 = module0765.$ic409$;
        }
        return (SubLObject)ConsesLow.list(module0765.$ic410$, (SubLObject)ConsesLow.list(module0765.$ic411$, var279), (SubLObject)ConsesLow.list(module0765.$ic404$, var753, var749));
    }
    
    public static SubLObject f48716(final SubLObject var279) {
        final SubLThread var280 = SubLProcess.currentSubLThread();
        SubLObject var281 = (SubLObject)module0765.NIL;
        final SubLObject var282 = module0584.$g4396$.currentBinding(var280);
        try {
            module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var280), var280);
            final SubLObject var283 = (SubLObject)((module0765.NIL != module0212.f13762(var279)) ? module0220.f14565(var279, module0765.$ic48$, (SubLObject)module0765.FOUR_INTEGER, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED) : module0765.NIL);
            final SubLObject var284 = Sequences.remove_duplicates(module0035.f2077((SubLObject)module0765.$ic412$, var283), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            var281 = module0260.f17086(var284, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        finally {
            module0584.$g4396$.rebind(var282, var280);
        }
        return var281;
    }
    
    public static SubLObject f48717() {
        final SubLObject var754 = module0765.$g6126$.getGlobalValue();
        if (module0765.NIL != var754) {
            module0034.f1818(var754);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48718(final SubLObject var700) {
        return module0034.f1829(module0765.$g6126$.getGlobalValue(), (SubLObject)ConsesLow.list(var700), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48719(final SubLObject var700) {
        return (SubLObject)((module0765.NIL != module0212.f13762(var700)) ? module0220.f14601(var700, module0765.$ic414$, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic397$, (SubLObject)module0765.UNPROVIDED) : module0765.NIL);
    }
    
    public static SubLObject f48649(final SubLObject var700) {
        SubLObject var701 = module0765.$g6126$.getGlobalValue();
        if (module0765.NIL == var701) {
            var701 = module0034.f1934((SubLObject)module0765.$ic413$, (SubLObject)module0765.$ic415$, (SubLObject)module0765.NIL, (SubLObject)module0765.EQ, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.$ic50$);
        }
        SubLObject var702 = module0034.f1814(var701, var700, (SubLObject)module0765.$ic256$);
        if (var702 == module0765.$ic256$) {
            var702 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48719(var700)));
            module0034.f1816(var701, var700, var702, (SubLObject)module0765.UNPROVIDED);
        }
        return module0034.f1959(var702);
    }
    
    public static SubLObject f48713(final SubLObject var700) {
        final SubLObject var701 = Sort.sort(f48712(var700), (SubLObject)module0765.$ic416$, (SubLObject)module0765.$ic417$);
        final SubLObject var702 = Mapping.mapcar((SubLObject)module0765.$ic418$, f48649(var700));
        SubLObject var703 = (SubLObject)module0765.NIL;
        SubLObject var704 = var701;
        SubLObject var705 = (SubLObject)module0765.NIL;
        var705 = var704.first();
        while (module0765.NIL != var704) {
            SubLObject var707;
            final SubLObject var706 = var707 = var705;
            SubLObject var708 = (SubLObject)module0765.NIL;
            SubLObject var709 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var707, var706, (SubLObject)module0765.$ic419$);
            var708 = var707.first();
            var707 = var707.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var707, var706, (SubLObject)module0765.$ic419$);
            var709 = var707.first();
            var707 = var707.rest();
            if (module0765.NIL == var707) {
                final SubLObject var710 = conses_high.assoc(var708, var702, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                var703 = (SubLObject)ConsesLow.cons((SubLObject)((module0765.NIL != var710) ? var710 : ConsesLow.list(var708, (SubLObject)module0765.$ic400$)), var703);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var706, (SubLObject)module0765.$ic419$);
            }
            var704 = var704.rest();
            var705 = var704.first();
        }
        return Sequences.reverse(Mapping.mapcar((SubLObject)module0765.$ic418$, var703));
    }
    
    public static SubLObject f48709(final SubLObject var117, final SubLObject var192, final SubLObject var702, final SubLObject var701) {
        final SubLObject var703 = module0205.f13132(var117);
        final SubLObject var704 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var705 = f48558(var703, var704, (SubLObject)module0765.NIL);
        SubLObject var706 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var706) {
            SubLObject var707 = var705;
            SubLObject var708 = (SubLObject)module0765.NIL;
            var708 = var707.first();
            while (module0765.NIL == var706 && module0765.NIL != var707) {
                if (module0765.NIL != f48720(var708, var703, var192, var702)) {
                    var706 = var708;
                }
                var707 = var707.rest();
                var708 = var707.first();
            }
        }
        if (module0765.NIL == var706 && module0765.NIL != var701) {
            var706 = f48545(var703, module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED));
        }
        return var706;
    }
    
    public static SubLObject f48720(final SubLObject var130, final SubLObject var108, final SubLObject var192, final SubLObject var702) {
        return f48721(var108, var130, var192, var702);
    }
    
    public static SubLObject f48708(final SubLObject var117, final SubLObject var192, final SubLObject var702, final SubLObject var701, final SubLObject var145) {
        final SubLObject var703 = module0205.f13132(var117);
        SubLObject var704 = module0763.f48363(var117, var703, var145, var192, var702);
        if (module0765.NIL == module0756.f47497(var704, (SubLObject)module0765.UNPROVIDED) && module0765.NIL != var701) {
            var704 = module0763.f48363(var117, var703, var192, (SubLObject)module0765.NIL, (SubLObject)module0765.UNPROVIDED);
        }
        if (module0765.NIL != module0756.f47497(var704, (SubLObject)module0765.UNPROVIDED)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic420$, var703);
            }
            module0763.f48337(var704, var117, var145, (SubLObject)module0765.UNPROVIDED);
        }
        else if (var704 == module0765.$ic388$) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic421$, var703);
            }
        }
        else if (module0765.NIL == var704 && module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic422$, var117, var702);
        }
        return var704;
    }
    
    public static SubLObject f48722(final SubLObject var106, final SubLObject var766) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == var766 || (module0765.NIL != var106 && module0765.NIL != f48723(var106, var766)));
    }
    
    public static SubLObject f48723(final SubLObject var106, final SubLObject var135) {
        if (module0765.NIL == module0756.f47478(var106)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED) && module0743.f46013(var106).numG((SubLObject)module0765.ONE_INTEGER) && module0756.f47480(module0756.f47590(var106, (SubLObject)module0765.ONE_INTEGER), (SubLObject)module0765.UNPROVIDED).equal((SubLObject)module0765.$ic1$)) {
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != module0756.f47519(var106)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != f48723(module0756.f47590(var106, (SubLObject)module0765.ZERO_INTEGER), var135) && module0765.NIL != f48723(module0756.f47590(var106, (SubLObject)module0765.ONE_INTEGER), var135));
        }
        final SubLObject var136 = module0303.f20123(var135);
        SubLObject var137 = (SubLObject)module0765.ZERO_INTEGER;
        if (module0743.f45996(var106).isVector()) {
            final SubLObject var138 = module0743.f45996(var106);
            final SubLObject var139 = (SubLObject)module0765.NIL;
            SubLObject var140;
            SubLObject var141;
            SubLObject var142;
            SubLObject var143;
            SubLObject var144;
            for (var140 = Sequences.length(var138), var141 = (SubLObject)module0765.NIL, var141 = (SubLObject)module0765.ZERO_INTEGER; var141.numL(var140); var141 = Numbers.add(var141, (SubLObject)module0765.ONE_INTEGER)) {
                var142 = ((module0765.NIL != var139) ? Numbers.subtract(var140, var141, (SubLObject)module0765.ONE_INTEGER) : var141);
                var143 = Vectors.aref(var138, var142);
                var144 = module0035.remove_if_not((SubLObject)module0765.$ic279$, module0756.f47750(var143, Symbols.symbol_function((SubLObject)module0765.$ic423$), Symbols.symbol_function((SubLObject)module0765.EQ)), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                if (var144.equal((SubLObject)ConsesLow.list(var136))) {
                    return (SubLObject)module0765.T;
                }
                if (var136.equal(module0035.f2114(var144))) {
                    return (SubLObject)module0765.T;
                }
                if (var144.isCons()) {
                    return (SubLObject)module0765.NIL;
                }
                var137 = Numbers.add(var137, (SubLObject)module0765.ONE_INTEGER);
            }
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48721(final SubLObject var108, final SubLObject var769, final SubLObject var192, final SubLObject var135) {
        final SubLThread var770 = SubLProcess.currentSubLThread();
        var770.resetMultipleValues();
        final SubLObject var771 = f48550(var769);
        SubLObject var772 = var770.secondMultipleValue();
        var770.resetMultipleValues();
        if (module0765.NIL == var772) {
            var772 = f48724(var108);
            if (module0765.NIL != var192) {
                var772 = Sequences.reverse(var772);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != f48693(var771) && var135.eql(var772.first()));
    }
    
    public static SubLObject f48693(final SubLObject var771) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0038.f2675(var771, (SubLObject)module0765.$ic424$, (SubLObject)module0765.UNPROVIDED) && module0765.NIL == module0038.f2675(var771, (SubLObject)module0765.$ic425$, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48724(final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)module0765.NIL;
        final SubLObject var111 = module0147.$g2094$.currentBinding(var109);
        final SubLObject var112 = module0147.$g2095$.currentBinding(var109);
        try {
            module0147.$g2094$.bind((SubLObject)module0765.$ic426$, var109);
            module0147.$g2095$.bind(module0765.$ic427$, var109);
            var110 = module0225.f14773(var108);
        }
        finally {
            module0147.$g2095$.rebind(var112, var109);
            module0147.$g2094$.rebind(var111, var109);
        }
        return (SubLObject)((module0765.NIL != var110) ? conses_high.copy_list(module0035.f2160(var110, (SubLObject)module0765.ONE_INTEGER)) : module0765.NIL);
    }
    
    public static SubLObject f48725(final SubLObject var486, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var487 = (SubLObject)module0765.NIL;
        SubLObject var488 = module0155.f9796(var486, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        SubLObject var489 = (SubLObject)module0765.NIL;
        var489 = var488.first();
        while (module0765.NIL != var488) {
            SubLObject var772_773 = module0754.f47360(var489, var486, var103, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != module0754.f47310(var489)) {
                var772_773 = module0035.f2462((SubLObject)ConsesLow.cons(module0754.f47312(var489), var772_773), (SubLObject)module0765.$ic429$, (SubLObject)module0765.UNPROVIDED);
            }
            SubLObject var37_774 = var487;
            SubLObject var490 = (SubLObject)module0765.NIL;
            var490 = var37_774.first();
            while (module0765.NIL != var37_774) {
                var487 = module0035.f2314(var487, var490, var489, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                var37_774 = var37_774.rest();
                var490 = var37_774.first();
            }
            var488 = var488.rest();
            var489 = var488.first();
        }
        var488 = var487;
        SubLObject var491 = (SubLObject)module0765.NIL;
        var491 = var488.first();
        while (module0765.NIL != var488) {
            SubLObject var493;
            final SubLObject var492 = var493 = var491;
            SubLObject var494 = (SubLObject)module0765.NIL;
            SubLObject var495 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var493, var492, (SubLObject)module0765.$ic430$);
            var494 = var493.first();
            var493 = (var495 = var493.rest());
            if (module0765.NIL != module0035.f2002(var495, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.UNPROVIDED)) {
                return (SubLObject)module0765.NIL;
            }
            var488 = var488.rest();
            var491 = var488.first();
        }
        return (SubLObject)module0765.T;
    }
    
    public static SubLObject f48644(final SubLObject var486, SubLObject var103) {
        if (var103 == module0765.UNPROVIDED) {
            var103 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var487 = SubLProcess.currentSubLThread();
        final SubLObject var488 = module0034.$g879$.getDynamicValue(var487);
        SubLObject var489 = (SubLObject)module0765.NIL;
        if (module0765.NIL == var488) {
            return f48725(var486, var103);
        }
        var489 = module0034.f1857(var488, (SubLObject)module0765.$ic428$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == var489) {
            var489 = module0034.f1807(module0034.f1842(var488), (SubLObject)module0765.$ic428$, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.NIL, (SubLObject)module0765.EQUAL, (SubLObject)module0765.UNPROVIDED);
            module0034.f1860(var488, (SubLObject)module0765.$ic428$, var489);
        }
        final SubLObject var490 = module0034.f1782(var486, var103);
        final SubLObject var491 = module0034.f1814(var489, var490, (SubLObject)module0765.UNPROVIDED);
        if (var491 != module0765.$ic256$) {
            SubLObject var492 = var491;
            SubLObject var493 = (SubLObject)module0765.NIL;
            var493 = var492.first();
            while (module0765.NIL != var492) {
                SubLObject var494 = var493.first();
                final SubLObject var495 = conses_high.second(var493);
                if (var486.equal(var494.first())) {
                    var494 = var494.rest();
                    if (module0765.NIL != var494 && module0765.NIL == var494.rest() && var103.equal(var494.first())) {
                        return module0034.f1959(var495);
                    }
                }
                var492 = var492.rest();
                var493 = var492.first();
            }
        }
        final SubLObject var496 = Values.arg2(var487.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48725(var486, var103)));
        module0034.f1836(var489, var490, var491, var496, (SubLObject)ConsesLow.list(var486, var103));
        return module0034.f1959(var496);
    }
    
    public static SubLObject f48726(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0765.NIL != module0751.f47099(module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.$ic237$, (SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var109 = (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL == f48727(var108));
            final SubLObject var110 = module0756.f47511(var106);
            final SubLObject var111 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var112 = module0579.$g4279$.currentBinding(var107);
            try {
                module0579.$g4279$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0579.$g4279$.getDynamicValue(var107) && module0765.NIL != f48644(var108, (SubLObject)module0765.UNPROVIDED)), var107);
                f48634(var108);
                final SubLObject var18_779 = module0579.$g4323$.currentBinding(var107);
                try {
                    module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var107))) ? module0579.$g4323$.getDynamicValue(var107) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var107);
                    final SubLObject var113 = module0754.f47307();
                    final SubLObject var18_780 = module0754.$g6064$.currentBinding(var107);
                    final SubLObject var114 = module0579.$g4324$.currentBinding(var107);
                    final SubLObject var115 = module0579.$g4325$.currentBinding(var107);
                    try {
                        module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var107), var107);
                        module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var107))) ? module0579.$g4324$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var107);
                        module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var107)), var107);
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var107), module0067.f4903(module0579.$g4323$.getDynamicValue(var107)));
                        }
                        try {
                            var107.resetMultipleValues();
                            final SubLObject var116 = f48728(var108, var110);
                            final SubLObject var117 = var107.secondMultipleValue();
                            var107.resetMultipleValues();
                            if (module0765.NIL == module0751.f46703(var116)) {
                                module0756.f47745(var106, var116);
                                if (module0765.NIL != var117) {
                                    module0756.f47569(var106, var117);
                                }
                                final SubLObject var118 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
                                if (module0765.NIL != module0762.f48173(var118)) {
                                    f48729(var106, var109);
                                }
                            }
                            if (module0765.NIL == module0756.f47479(var106)) {
                                final SubLObject var118 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
                                var107.resetMultipleValues();
                                final SubLObject var119 = f48730(var118, var109, var110);
                                final SubLObject var18_781 = module0579.$g4314$.currentBinding(var107);
                                try {
                                    module0579.$g4314$.bind(var107.secondMultipleValue(), var107);
                                    var107.resetMultipleValues();
                                    if (module0765.NIL == module0751.f46703(var119)) {
                                        module0756.f47745(var106, var119);
                                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER)) {
                                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic432$, new SubLObject[] { var108, var118, module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED) });
                                        }
                                    }
                                    if (var118.equal(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED))) {
                                        module0754.f47320(module0205.f13203(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.$ic238$);
                                    }
                                    if (module0765.NIL != f48731(var106)) {
                                        f48732(var106);
                                    }
                                    if (module0765.NIL == module0756.f47479(var106)) {
                                        final SubLObject var120 = module0762.f48153((SubLObject)module0765.$ic431$, (SubLObject)module0765.$ic238$);
                                        module0762.f48155((SubLObject)module0765.$ic431$, var120);
                                        try {
                                            module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                        }
                                        finally {
                                            final SubLObject var18_782 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                                                module0762.f48154((SubLObject)module0765.$ic431$, var120);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_782, var107);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    module0579.$g4314$.rebind(var18_781, var107);
                                }
                            }
                        }
                        finally {
                            final SubLObject var18_783 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                                final SubLObject var121 = conses_high.set_difference(module0754.f47307(), var113, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var107), module0754.f47307());
                                }
                                module0580.f35619(var121);
                                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_783, var107);
                            }
                        }
                    }
                    finally {
                        module0579.$g4325$.rebind(var115, var107);
                        module0579.$g4324$.rebind(var114, var107);
                        module0754.$g6064$.rebind(var18_780, var107);
                    }
                }
                finally {
                    module0579.$g4323$.rebind(var18_779, var107);
                }
                if (module0765.NIL == module0756.f47479(var106)) {
                    module0756.f47485(var106, var111);
                }
            }
            finally {
                module0579.$g4279$.rebind(var112, var107);
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48731(final SubLObject var106) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0202.f12604(module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED)) && module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED) && (module0765.NIL == module0205.f13145((SubLObject)module0765.$ic433$, module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) || module0765.NIL == module0751.f46605()));
    }
    
    public static SubLObject f48732(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0756.f47515(var106);
        var107.resetMultipleValues();
        final SubLObject var110 = f48623(var106, (SubLObject)module0765.$ic238$);
        final SubLObject var111 = var107.secondMultipleValue();
        final SubLObject var112 = var107.thirdMultipleValue();
        var107.resetMultipleValues();
        if (!var111.equal(var108)) {
            final SubLObject var113 = f48624(module0035.f2062(var110), (SubLObject)module0765.$ic236$, var112);
            final SubLObject var114 = module0756.f47511(var106);
            SubLObject var115 = (SubLObject)module0765.NIL;
            if (module0765.NIL != var113) {
                final SubLObject var116 = module0751.f46982((SubLObject)module0765.$ic84$, module0756.f47511(var106));
                final SubLObject var117 = module0765.$ic434$;
                final SubLObject var118 = module0749.f46494((SubLObject)module0765.$ic435$, var117, (SubLObject)module0765.UNPROVIDED);
                module0756.f47469(var118, var116);
                module0756.f47715(var118);
                var115 = (SubLObject)ConsesLow.cons(var118, var115);
                var115 = (SubLObject)ConsesLow.cons(f48625(var113, var110), var115);
                var115 = (SubLObject)ConsesLow.cons(module0749.f46494((SubLObject)module0765.$ic0$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var115);
            }
            var115 = (SubLObject)ConsesLow.cons(f48626(var111, var114), var115);
            var115 = Sequences.nreverse(var115);
            module0756.f47507(var106, var115, (SubLObject)module0765.UNPROVIDED);
            module0758.f47878(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        if (module0765.NIL == module0756.f47479(var106)) {
            if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0765.$ic436$, var108);
            }
            module0756.f47507(var106, var109, (SubLObject)module0765.UNPROVIDED);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48727(final SubLObject var117) {
        return module0035.sublisp_boolean(module0205.f13145((SubLObject)module0765.$ic437$, var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48733(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0202.f12590(var1) && (module0765.NIL != f48734(var1) || module0765.NIL != f48734(module0751.f46810(var1, (SubLObject)module0765.UNPROVIDED))));
    }
    
    public static SubLObject f48734(final SubLObject var117) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0202.f12590(var117) && module0765.NIL != f48735(module0205.f13132(var117)));
    }
    
    public static SubLObject f48735(final SubLObject var498) {
        if (module0765.$g6127$.getGlobalValue() == module0765.$ic438$) {
            module0765.$g6127$.setGlobalValue(module0259.f16848(module0765.$ic439$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED));
        }
        return module0004.f104(var498, module0765.$g6127$.getGlobalValue(), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
    }
    
    public static SubLObject f48736(final SubLObject var117) {
        return f48647(var117);
    }
    
    public static SubLObject f48730(final SubLObject var785, final SubLObject var701, final SubLObject var332) {
        final SubLThread var786 = SubLProcess.currentSubLThread();
        SubLObject var787 = var785;
        SubLObject var788 = module0751.f46678();
        final SubLObject var789 = module0579.$g4314$.getDynamicValue(var786);
        SubLObject var790 = (SubLObject)module0765.ZERO_INTEGER;
        SubLObject var791 = (SubLObject)module0765.NIL;
        if (module0765.NIL == module0579.$g4254$.getDynamicValue(var786) || module0765.NIL != var701) {
            while (module0765.NIL == var791) {
                if (module0765.NIL == module0202.f12604(var787)) {
                    var791 = (SubLObject)module0765.T;
                }
                else {
                    SubLObject var793;
                    final SubLObject var792 = var793 = module0205.f13207(var787, (SubLObject)module0765.UNPROVIDED);
                    SubLObject var794 = (SubLObject)module0765.NIL;
                    SubLObject var795 = (SubLObject)module0765.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var793, var792, (SubLObject)module0765.$ic247$);
                    var794 = var793.first();
                    var793 = var793.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var793, var792, (SubLObject)module0765.$ic247$);
                    var795 = var793.first();
                    var793 = var793.rest();
                    if (module0765.NIL == var793) {
                        if (module0765.NIL != f48631(var794) || module0765.NIL != module0754.f47338(var794) || module0765.NIL == f48736(var795)) {
                            var791 = (SubLObject)module0765.T;
                        }
                        else {
                            final SubLObject var796 = (SubLObject)module0765.$ic238$;
                            var788 = module0751.f46793((SubLObject)module0765.TWO_INTEGER, var788);
                            var787 = var795;
                            var790 = Numbers.add(var790, (SubLObject)module0765.ONE_INTEGER);
                            module0754.f47320(var794, var796);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var792, (SubLObject)module0765.$ic247$);
                    }
                }
            }
        }
        if (module0765.NIL != f48734(var787)) {
            var788 = f48737(var788, var790);
        }
        return Values.values(var788, var789);
    }
    
    public static SubLObject f48630(final SubLObject var520) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0765.NIL != module0202.f12734(var520, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED) && (module0765.NIL != module0202.f12592(var520) || module0765.NIL != module0202.f12589(var520, module0765.$ic440$)));
    }
    
    public static SubLObject f48737(final SubLObject var454, final SubLObject var465) {
        return f48636(var454, var465, module0765.$ic434$);
    }
    
    public static SubLObject f48729(final SubLObject var106, SubLObject var777) {
        if (var777 == module0765.UNPROVIDED) {
            var777 = (SubLObject)module0765.T;
        }
        final SubLThread var778 = SubLProcess.currentSubLThread();
        final SubLObject var779 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        SubLObject var780 = module0205.f13204(var779, (SubLObject)module0765.UNPROVIDED);
        SubLObject var781 = (SubLObject)module0765.$ic180$;
        final SubLObject var782 = module0205.f13203(var779, (SubLObject)module0765.UNPROVIDED);
        SubLObject var783 = Sequences.position(var782, var780, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != var783) {
            final SubLObject var784 = module0579.$g4323$.currentBinding(var778);
            try {
                module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var778))) ? module0579.$g4323$.getDynamicValue(var778) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var778);
                final SubLObject var785 = module0754.f47307();
                final SubLObject var18_793 = module0754.$g6064$.currentBinding(var778);
                final SubLObject var786 = module0579.$g4324$.currentBinding(var778);
                final SubLObject var787 = module0579.$g4325$.currentBinding(var778);
                try {
                    module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var778), var778);
                    module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var778))) ? module0579.$g4324$.getDynamicValue(var778) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var778);
                    module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var778)), var778);
                    if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                        PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var778), module0067.f4903(module0579.$g4323$.getDynamicValue(var778)));
                    }
                    try {
                        if (module0765.NIL == module0754.f47310(var782)) {
                            module0754.f47313(var782, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        }
                        module0754.f47320(var782, (SubLObject)module0765.$ic238$);
                        final SubLObject var788 = f48701(var780);
                        if (module0765.NIL != var788) {
                            var781 = module0751.f46672(var788, var781);
                            var783 = Sequences.position(var782, module0751.f46672(var788, var779), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            var780 = module0751.f46672(var788, var780);
                        }
                        final SubLObject var789 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47745(var789, var781);
                        f48702(var106, var780, var783, (SubLObject)module0765.NIL, var777);
                        if (module0765.NIL != module0756.f47479(var789)) {
                            module0756.f47484(var789, var106, (SubLObject)module0765.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject var18_794 = Threads.$is_thread_performing_cleanupP$.currentBinding(var778);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var778);
                            final SubLObject var790 = conses_high.set_difference(module0754.f47307(), var785, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var778), module0754.f47307());
                            }
                            module0580.f35619(var790);
                            if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_794, var778);
                        }
                    }
                }
                finally {
                    module0579.$g4325$.rebind(var787, var778);
                    module0579.$g4324$.rebind(var786, var778);
                    module0754.$g6064$.rebind(var18_793, var778);
                }
            }
            finally {
                module0579.$g4323$.rebind(var784, var778);
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48728(final SubLObject var785, SubLObject var145) {
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        final SubLThread var786 = SubLProcess.currentSubLThread();
        var786.resetMultipleValues();
        final SubLObject var787 = f48738(var785, var145, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var788 = var786.secondMultipleValue();
        var786.resetMultipleValues();
        return Values.values(var787, var788);
    }
    
    public static SubLObject f48738(final SubLObject var785, SubLObject var145, SubLObject var795) {
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        if (var795 == module0765.UNPROVIDED) {
            var795 = (SubLObject)module0765.NIL;
        }
        final SubLThread var796 = SubLProcess.currentSubLThread();
        SubLObject var797 = module0751.f46678();
        final SubLObject var798 = (SubLObject)module0765.NIL;
        SubLObject var800;
        final SubLObject var799 = var800 = module0205.f13207(var785, (SubLObject)module0765.UNPROVIDED);
        SubLObject var801 = (SubLObject)module0765.NIL;
        SubLObject var802 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var800, var799, (SubLObject)module0765.$ic247$);
        var801 = var800.first();
        var800 = var800.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var800, var799, (SubLObject)module0765.$ic247$);
        var802 = var800.first();
        var800 = var800.rest();
        if (module0765.NIL == var800) {
            final SubLObject var803 = (SubLObject)ConsesLow.cons(var801, var795);
            SubLObject var804 = (SubLObject)module0765.$ic180$;
            final SubLObject var805 = module0751.f46693(var145, var804);
            if (module0765.NIL != module0202.f12597(var802)) {
                SubLObject var803_804;
                final SubLObject var801_802 = var803_804 = module0205.f13207(var802, (SubLObject)module0765.UNPROVIDED);
                SubLObject var806 = (SubLObject)module0765.NIL;
                SubLObject var807 = (SubLObject)module0765.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var803_804, var801_802, (SubLObject)module0765.$ic277$);
                var806 = var803_804.first();
                var803_804 = var803_804.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var803_804, var801_802, (SubLObject)module0765.$ic277$);
                var807 = var803_804.first();
                var803_804 = var803_804.rest();
                if (module0765.NIL == var803_804) {
                    if (module0765.NIL != f48647(var807)) {
                        final SubLObject var808 = module0751.f46693(var805, (SubLObject)module0765.$ic177$);
                        var796.resetMultipleValues();
                        SubLObject var809 = f48612(var806, var803, var808, (SubLObject)module0765.NIL);
                        final SubLObject var367_807 = var796.secondMultipleValue();
                        final SubLObject var810 = var796.thirdMultipleValue();
                        var796.resetMultipleValues();
                        SubLObject var811 = var810;
                        SubLObject var812 = (SubLObject)module0765.NIL;
                        var812 = var811.first();
                        while (module0765.NIL != var811) {
                            SubLObject var811_812;
                            final SubLObject var809_810 = var811_812 = var812;
                            SubLObject var813 = (SubLObject)module0765.NIL;
                            SubLObject var814 = (SubLObject)module0765.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var811_812, var809_810, (SubLObject)module0765.$ic441$);
                            var813 = var811_812.first();
                            var811_812 = var811_812.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var811_812, var809_810, (SubLObject)module0765.$ic441$);
                            var814 = var811_812.first();
                            var811_812 = var811_812.rest();
                            if (module0765.NIL == var811_812) {
                                module0754.f47320(var813, (SubLObject)module0765.$ic238$);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var809_810, (SubLObject)module0765.$ic441$);
                            }
                            var811 = var811.rest();
                            var812 = var811.first();
                        }
                        if (module0765.NIL != module0751.f46703(var809)) {
                            var804 = module0751.f46604((SubLObject)module0765.$ic165$);
                        }
                        else if (module0765.NIL != module0751.f46788(var809)) {
                            var809 = module0751.f46672(var809, module0751.f46604((SubLObject)module0765.$ic170$));
                            final SubLObject var815 = module0751.f46604((SubLObject)module0765.$ic442$);
                            final SubLObject var816 = module0751.f46604((SubLObject)module0765.$ic171$);
                            var804 = module0202.f12768(var815, var809, var816);
                        }
                        else if (module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)module0765.$ic443$, var785);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var801_802, (SubLObject)module0765.$ic277$);
                }
            }
            else if (module0765.NIL != module0202.f12606(var802)) {
                final SubLObject var817 = f48621(var802, var805);
                var804 = module0751.f46672(var817, var804);
            }
            else if (module0765.NIL != module0202.f12604(var802)) {
                final SubLObject var818 = f48738(var802, var805, var803);
                var804 = module0751.f46672(var818, var804);
            }
            if (!var804.eql(module0751.f46604((SubLObject)module0765.$ic165$))) {
                final SubLObject var819 = module0751.f46672(var804, var785);
                if (module0765.NIL != module0754.f47310(var801)) {
                    module0754.f47327(var801, var819);
                }
                f48568(var801, var802);
                var797 = module0202.f12775((SubLObject)module0765.$ic177$, var804);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var799, (SubLObject)module0765.$ic247$);
        }
        return Values.values(var797, var798);
    }
    
    public static SubLObject f48739(final SubLObject var117) {
        final SubLObject var118 = module0282.f18745(var117, (SubLObject)module0765.$ic444$, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL == module0035.f1997(var118)) {
            return (SubLObject)module0765.NIL;
        }
        final SubLObject var119 = var118.first();
        final SubLObject var120 = var119.first();
        return var120;
    }
    
    public static SubLObject f48740(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var109 = module0205.f13277(var108, (SubLObject)module0765.UNPROVIDED);
        if (module0579.$g4259$.getDynamicValue(var107) == module0765.$ic34$) {
            final SubLObject var110 = module0039.f3041(var109);
            module0756.f47723(var106, var110);
            module0756.f47608(var106);
        }
        else if (module0579.$g4259$.getDynamicValue(var107) == module0765.$ic77$ && module0765.NIL != module0579.$g4299$.getDynamicValue(var107)) {
            final SubLObject var111 = module0039.f3038(var109);
            module0756.f47723(var106, var111);
            module0756.f47608(var106);
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48715(final SubLObject var117) {
        return module0751.f46672(f48741(var117), var117);
    }
    
    public static SubLObject f48741(final SubLObject var117) {
        SubLObject var119;
        final SubLObject var118 = var119 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
        SubLObject var120 = (SubLObject)module0765.NIL;
        SubLObject var121 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0765.$ic249$);
        var120 = var119.first();
        var119 = var119.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0765.$ic249$);
        var121 = var119.first();
        var119 = var119.rest();
        if (module0765.NIL == var119) {
            if (conses_high.butlast(var121, (SubLObject)module0765.UNPROVIDED).equal((SubLObject)ConsesLow.list(module0765.$ic447$, var120))) {
                final SubLObject var122 = module0751.f46604((SubLObject)module0765.$ic171$);
                return module0751.f46677(var122);
            }
            if (module0765.NIL == module0202.f12598(var121) || module0765.NIL == conses_high.member(var120, module0205.f13385(var121, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                return (SubLObject)module0765.NIL;
            }
            SubLObject var829_830;
            final SubLObject var827_828 = var829_830 = module0205.f13207(var121, (SubLObject)module0765.UNPROVIDED);
            SubLObject var123 = (SubLObject)module0765.NIL;
            SubLObject var124 = (SubLObject)module0765.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var829_830, var827_828, (SubLObject)module0765.$ic448$);
            var123 = var829_830.first();
            var829_830 = var829_830.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var829_830, var827_828, (SubLObject)module0765.$ic448$);
            var124 = var829_830.first();
            var829_830 = var829_830.rest();
            if (module0765.NIL == var829_830) {
                final SubLObject var125 = var120.eql(var123) ? module0765.$ic449$ : module0765.$ic149$;
                final SubLObject var126 = module0751.f46604((SubLObject)module0765.$ic442$);
                final SubLObject var127 = var120.eql(var124) ? module0751.f46604((SubLObject)module0765.$ic170$) : module0751.f46604((SubLObject)module0765.$ic171$);
                final SubLObject var128 = module0754.f47373(var120, var121, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                return module0202.f12769(var125, var128, var126, var127);
            }
            cdestructuring_bind.cdestructuring_bind_error(var827_828, (SubLObject)module0765.$ic448$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)module0765.$ic249$);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48742(final SubLObject var106) {
        if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED)) {
            final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var108 = f48741(var107);
            if (module0765.NIL != var108) {
                final SubLObject var109 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                module0756.f47745(var109, var108);
                module0756.f47783(var109, module0765.$ic405$, (SubLObject)module0765.UNPROVIDED);
                f48670(var109);
                if (module0765.NIL != module0756.f47479(var109)) {
                    module0756.f47501(var109, (SubLObject)ConsesLow.cons(module0749.f46446((SubLObject)module0765.$ic452$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), module0756.f47467(var109)), (SubLObject)module0765.UNPROVIDED);
                    module0756.f47783(var109, module0765.$ic453$, (SubLObject)module0765.UNPROVIDED);
                    module0756.f47484(var109, var106, (SubLObject)module0765.UNPROVIDED);
                }
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48743(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != f48744(module0205.f13136(var108)) || module0765.NIL != module0751.f47007(module0579.$g4260$.getDynamicValue(var107), module0765.$ic456$)) {
            if (module0579.f35487().isPositive() && !var108.equal(module0579.f35508()) && module0765.NIL == module0756.f47497(module0756.f47633(var106), (SubLObject)module0765.UNPROVIDED) && module0765.NIL != module0578.f35470((SubLObject)module0765.ONE_INTEGER) && module0765.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0765.$ic457$, var106);
            }
            final SubLObject var109 = module0751.f47032(var108);
            final SubLObject var110 = module0751.f47099(var109, module0756.f47488(var106, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL != var110) {
                module0638.f38953(var108, module0579.$g4260$.getDynamicValue(var107), module0579.$g4262$.getDynamicValue(var107), var110);
                if (module0765.NIL != module0751.f46661((SubLObject)module0765.UNPROVIDED)) {
                    final SubLObject var111 = module0756.f47511(var106);
                    var107.resetMultipleValues();
                    final SubLObject var112 = f48745(var108, var110, var111, var106);
                    final SubLObject var113 = var107.secondMultipleValue();
                    final SubLObject var114 = var107.thirdMultipleValue();
                    var107.resetMultipleValues();
                    if (module0765.NIL != module0756.f47466(var112)) {
                        module0756.f47501(var106, var112, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47783(var106, var113, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47608(var106);
                    }
                    if (module0765.NIL == module0756.f47479(var106)) {
                        module0756.f47490(var106);
                        module0756.f47491(var106);
                        return (SubLObject)module0765.NIL;
                    }
                }
            }
        }
        return module0756.f47467(var106);
    }
    
    public static SubLObject f48745(final SubLObject var117, SubLObject var127, SubLObject var145, SubLObject var106) {
        if (var127 == module0765.UNPROVIDED) {
            var127 = (SubLObject)module0765.NIL;
        }
        if (var145 == module0765.UNPROVIDED) {
            var145 = (SubLObject)module0765.NIL;
        }
        if (var106 == module0765.UNPROVIDED) {
            var106 = (SubLObject)module0765.NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        SubLObject var148;
        final SubLObject var147 = var148 = module0205.f13180(var117, (SubLObject)module0765.$ic79$);
        SubLObject var149 = (SubLObject)module0765.NIL;
        SubLObject var150 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var148, var147, (SubLObject)module0765.$ic458$);
        var149 = var148.first();
        var148 = (var150 = var148.rest());
        final SubLObject var151 = module0756.f47484(module0756.f47463(var149, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var152 = module0751.f46982((SubLObject)module0765.$ic84$, var145);
        module0756.f47623(var151, var106);
        module0756.f47543(var106, var151);
        if (module0765.NIL != f48744(var149)) {
            module0770.f49065(var151, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        else {
            module0767.f48924(var151);
        }
        module0756.f47469(var151, var152);
        final SubLObject var153 = module0579.$g4327$.getDynamicValue(var146).first();
        final SubLObject var154 = (SubLObject)((module0765.NIL != var153) ? ((module0765.NIL != module0579.f35511()) ? module0765.$ic459$ : module0765.$ic460$) : module0765.$ic461$);
        if (module0765.NIL != var153) {
            module0579.$g4327$.setDynamicValue(Sequences.remove(var153, module0579.$g4327$.getDynamicValue(var146), (SubLObject)module0765.EQUAL, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var146);
        }
        module0756.f47836(module0749.f46494(var154, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var106);
        if (module0765.NIL != module0035.f2002(var150, (SubLObject)module0765.ZERO_INTEGER, (SubLObject)module0765.UNPROVIDED)) {
            module0756.f47836(module0749.f46494((SubLObject)module0765.$ic65$, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var106);
            final SubLObject var155 = module0202.f12683(module0765.$ic462$, var150, (SubLObject)module0765.UNPROVIDED);
            final SubLObject var156 = module0756.f47484(module0756.f47463(var155, var145, (SubLObject)module0765.UNPROVIDED), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            module0756.f47623(var156, var106);
            module0756.f47836(var156, var106);
            module0770.f49065(var156, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (module0765.NIL == module0756.f47479(var156)) {
                return (SubLObject)module0765.NIL;
            }
        }
        module0758.f47893(var106);
        return Values.values(module0756.f47467(var106), module0765.$ic363$);
    }
    
    public static SubLObject f48744(final SubLObject var545) {
        return module0201.f12546(var545);
    }
    
    public static SubLObject f48746(final SubLObject var106) {
        final SubLObject var107 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var108 = f48747(var107);
        if (module0765.NIL != var108) {
            final SubLObject var109 = f48748(var107, var108);
            module0756.f47745(var106, var109);
            return module0770.f49065(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        }
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48748(final SubLObject var117, final SubLObject var382) {
        SubLObject var383 = (SubLObject)module0765.NIL;
        final SubLObject var384 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED).first();
        SubLObject var385 = (SubLObject)module0765.NIL;
        if (module0765.NIL != module0202.f12594(var117)) {
            var385 = module0765.$ic465$;
        }
        else if (module0765.NIL != module0202.f12595(var117)) {
            var385 = module0765.$ic462$;
        }
        SubLObject var386;
        SubLObject var387;
        SubLObject var388;
        SubLObject var847_849;
        SubLObject var301_850;
        SubLObject var389;
        for (var386 = Sequences.length(var384), var387 = (SubLObject)module0765.NIL, var387 = (SubLObject)module0765.ZERO_INTEGER; var387.numL(var386); var387 = Numbers.add(var387, (SubLObject)module0765.ONE_INTEGER)) {
            if (var387.eql(var382)) {
                var388 = (SubLObject)module0765.NIL;
                for (var847_849 = Sequences.length(var117), var301_850 = (SubLObject)module0765.NIL, var301_850 = (SubLObject)module0765.ZERO_INTEGER; var301_850.numL(var847_849); var301_850 = Numbers.add(var301_850, (SubLObject)module0765.ONE_INTEGER)) {
                    if (!var301_850.eql((SubLObject)module0765.ZERO_INTEGER)) {
                        var389 = module0751.f46793(var301_850, (SubLObject)module0765.$ic251$);
                        var388 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0765.$ic328$, var382, var389), var388);
                    }
                }
                var383 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var385, Sequences.reverse(var388)), var383);
            }
            else {
                var383 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0765.$ic328$, var387, (SubLObject)module0765.$ic177$), var383);
            }
        }
        return Sequences.reverse(var383);
    }
    
    public static SubLObject f48747(final SubLObject var117) {
        if (module0765.NIL == module0202.f12594(var117) && module0765.NIL == module0202.f12595(var117)) {
            return (SubLObject)module0765.NIL;
        }
        final SubLObject var118 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var119 = module0035.find_if_not((SubLObject)module0765.$ic466$, var118, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var120 = (SubLObject)((module0765.NIL != var119) ? module0765.NIL : module0035.f2236(var118));
        return (SubLObject)((module0765.NIL != module0004.f105(var120)) ? var120 : module0765.NIL);
    }
    
    public static SubLObject f48749(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        final SubLObject var108 = module0579.$g4323$.currentBinding(var107);
        try {
            module0579.$g4323$.bind((module0765.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var107))) ? module0579.$g4323$.getDynamicValue(var107) : module0067.f4880((SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED), var107);
            final SubLObject var109 = module0754.f47307();
            final SubLObject var18_853 = module0754.$g6064$.currentBinding(var107);
            final SubLObject var110 = module0579.$g4324$.currentBinding(var107);
            final SubLObject var111 = module0579.$g4325$.currentBinding(var107);
            try {
                module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var107), var107);
                module0579.$g4324$.bind((module0765.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var107))) ? module0579.$g4324$.getDynamicValue(var107) : module0067.f4880(Symbols.symbol_function((SubLObject)module0765.EQL), (SubLObject)module0765.SIXTEEN_INTEGER), var107);
                module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var107)), var107);
                if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                    PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic71$, module0579.$g4325$.getDynamicValue(var107), module0067.f4903(module0579.$g4323$.getDynamicValue(var107)));
                }
                try {
                    final SubLObject var112 = module0756.f47487(var106, (SubLObject)module0765.UNPROVIDED);
                    final SubLObject var113 = f48750(var112, module0751.f46678());
                    if (module0765.NIL == module0751.f46822(var113) && module0765.NIL == module0751.f46703(var113)) {
                        final SubLObject var114 = module0756.f47484(var106, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        module0756.f47745(var114, var113);
                        module0770.f49065(var114, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        if (module0765.NIL != module0756.f47479(var114)) {
                            final SubLObject var115 = module0756.f47480(var114, (SubLObject)module0765.UNPROVIDED);
                            if (module0765.NIL == module0038.f2668((SubLObject)module0765.$ic468$, var115, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                                module0756.f47484(var114, var106, (SubLObject)module0765.UNPROVIDED);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject var18_854 = Threads.$is_thread_performing_cleanupP$.currentBinding(var107);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0765.T, var107);
                        final SubLObject var116 = conses_high.set_difference(module0754.f47307(), var109, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic72$, module0579.$g4325$.getDynamicValue(var107), module0754.f47307());
                        }
                        module0580.f35619(var116);
                        if (module0765.NIL != module0578.f35470((SubLObject)module0765.TWO_INTEGER)) {
                            PrintLow.format((SubLObject)module0765.T, (SubLObject)module0765.$ic73$, module0754.f47307());
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_854, var107);
                    }
                }
            }
            finally {
                module0579.$g4325$.rebind(var111, var107);
                module0579.$g4324$.rebind(var110, var107);
                module0754.$g6064$.rebind(var18_853, var107);
            }
        }
        finally {
            module0579.$g4323$.rebind(var108, var107);
        }
        return var106;
    }
    
    public static SubLObject f48750(final SubLObject var117, SubLObject var856) {
        if (var856 == module0765.UNPROVIDED) {
            var856 = module0751.f46678();
        }
        if (module0765.NIL == module0202.f12606(var117)) {
            return module0751.f46821();
        }
        final SubLObject var857 = module0205.f13134(var117, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED);
        final SubLObject var858 = module0751.f46793((SubLObject)module0765.TWO_INTEGER, var856);
        final SubLObject var859 = f48751(module0205.f13134(var117, (SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.UNPROVIDED), var857, var858, var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
        if (module0765.NIL != var859 && !var859.equal((SubLObject)module0765.$ic100$) && module0765.NIL == module0205.f13220((SubLObject)module0765.$ic100$, var859, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) && module0765.NIL == module0205.f13220(module0765.$ic328$, module0751.f46672(var859, var117), (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(module0751.f46793((SubLObject)module0765.ZERO_INTEGER, var856), module0751.f46793((SubLObject)module0765.ONE_INTEGER, var856), var859);
        }
        return module0751.f46821();
    }
    
    public static SubLObject f48751(final SubLObject var117, final SubLObject var436, final SubLObject var856, SubLObject var859, SubLObject var860, SubLObject var861) {
        if (var860 == module0765.UNPROVIDED) {
            var860 = (SubLObject)module0765.NIL;
        }
        if (var861 == module0765.UNPROVIDED) {
            var861 = (SubLObject)module0765.T;
        }
        if (module0765.NIL == var859) {
            var859 = var117;
        }
        if (module0765.NIL == var860) {
            var860 = module0751.f46793((SubLObject)module0765.ONE_INTEGER, module0751.f46678());
        }
        if (module0765.NIL != var861 && module0765.NIL != module0202.f12606(var117)) {
            return (SubLObject)ConsesLow.list(module0751.f46793((SubLObject)module0765.ZERO_INTEGER, var856), module0751.f46793((SubLObject)module0765.ONE_INTEGER, var856), f48751(module0205.f13204(var117, (SubLObject)module0765.UNPROVIDED), var436, module0751.f46793((SubLObject)module0765.TWO_INTEGER, var856), var859, var861, (SubLObject)module0765.UNPROVIDED));
        }
        if (module0765.NIL == module0202.f12595(var117)) {
            return (SubLObject)module0765.$ic100$;
        }
        if (module0765.NIL == var436) {
            return (SubLObject)module0765.$ic100$;
        }
        final SubLObject var862 = module0205.f13207(var117, (SubLObject)module0765.UNPROVIDED);
        SubLObject var864;
        final SubLObject var863 = var864 = f48752(var862, var856, var436);
        SubLObject var865 = (SubLObject)module0765.NIL;
        SubLObject var866 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var864, var863, (SubLObject)module0765.$ic469$);
        var865 = var864.first();
        var864 = var864.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var864, var863, (SubLObject)module0765.$ic469$);
        var866 = var864.first();
        var864 = var864.rest();
        if (module0765.NIL != var864) {
            cdestructuring_bind.cdestructuring_bind_error(var863, (SubLObject)module0765.$ic469$);
            return (SubLObject)module0765.NIL;
        }
        if (module0765.NIL != var865 && module0765.NIL != module0035.f2004(ConsesLow.append(var865, var866), var862)) {
            final SubLObject var867 = f48753(var865, var859, var436);
            final SubLObject var868 = module0202.f12768(module0765.$ic470$, var860, var867);
            return module0202.f12773((SubLObject)ConsesLow.cons(var868, var866));
        }
        return (SubLObject)module0765.$ic100$;
    }
    
    public static SubLObject f48752(final SubLObject var533, final SubLObject var856, final SubLObject var436) {
        SubLObject var857 = (SubLObject)module0765.NIL;
        SubLObject var858 = (SubLObject)module0765.NIL;
        SubLObject var860;
        final SubLObject var859 = var860 = f48754(var436, var533, var856);
        SubLObject var861 = (SubLObject)module0765.NIL;
        SubLObject var862 = (SubLObject)module0765.NIL;
        SubLObject var863 = (SubLObject)module0765.NIL;
        SubLObject var864 = (SubLObject)module0765.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var860, var859, (SubLObject)module0765.$ic471$);
        var861 = var860.first();
        var860 = var860.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var860, var859, (SubLObject)module0765.$ic471$);
        var862 = var860.first();
        var860 = var860.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var860, var859, (SubLObject)module0765.$ic471$);
        var863 = var860.first();
        var860 = var860.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var860, var859, (SubLObject)module0765.$ic471$);
        var864 = var860.first();
        var860 = var860.rest();
        if (module0765.NIL == var860) {
            final SubLObject var865 = ConsesLow.append(var861, var862);
            if (module0765.NIL == var861 || !Sequences.length(var865).equal((SubLObject)module0765.TWO_INTEGER) || module0765.NIL == var863) {
                return (SubLObject)ConsesLow.list((SubLObject)module0765.NIL, (SubLObject)module0765.NIL);
            }
            var857 = (SubLObject)ConsesLow.cons(var865.first(), var857);
            var858 = (SubLObject)ConsesLow.cons(conses_high.second(var865), var858);
            if (module0765.NIL != var863) {
                var857 = (SubLObject)ConsesLow.cons(var863.first(), var857);
                if (module0765.NIL != var863.rest()) {
                    SubLObject var866 = var863.rest();
                    SubLObject var867 = (SubLObject)module0765.NIL;
                    var867 = var866.first();
                    while (module0765.NIL != var866) {
                        var858 = (SubLObject)ConsesLow.cons(var867, var858);
                        var866 = var866.rest();
                        var867 = var866.first();
                    }
                }
            }
            SubLObject var866 = var864;
            SubLObject var867 = (SubLObject)module0765.NIL;
            var867 = var866.first();
            while (module0765.NIL != var866) {
                var858 = (SubLObject)ConsesLow.cons(var867, var858);
                var866 = var866.rest();
                var867 = var866.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var859, (SubLObject)module0765.$ic471$);
        }
        return (SubLObject)ConsesLow.list(var857, var858);
    }
    
    public static SubLObject f48753(final SubLObject var875, final SubLObject var117, final SubLObject var876) {
        final SubLObject var877 = module0201.f12550((SubLObject)module0765.$ic472$);
        SubLObject var878 = (SubLObject)module0765.NIL;
        SubLObject var879 = var875;
        SubLObject var880 = (SubLObject)module0765.NIL;
        var880 = var879.first();
        while (module0765.NIL != var879) {
            final SubLObject var881 = module0751.f46672(var880, var117);
            var878 = (SubLObject)ConsesLow.cons(f48755(var881, var876, var877, var880), var878);
            var879 = var879.rest();
            var880 = var879.first();
        }
        return module0202.f12768(module0765.$ic473$, var877, module0276.f18287(var878, (SubLObject)module0765.UNPROVIDED));
    }
    
    public static SubLObject f48754(final SubLObject var436, final SubLObject var879, SubLObject var856) {
        if (var856 == module0765.UNPROVIDED) {
            var856 = (SubLObject)module0765.NIL;
        }
        SubLObject var880 = (SubLObject)module0765.NIL;
        SubLObject var881 = (SubLObject)module0765.NIL;
        SubLObject var882 = (SubLObject)module0765.NIL;
        SubLObject var883 = (SubLObject)module0765.NIL;
        SubLObject var884 = (SubLObject)module0765.NIL;
        SubLObject var885 = (SubLObject)module0765.NIL;
        SubLObject var886 = (SubLObject)module0765.NIL;
        SubLObject var887 = (SubLObject)module0765.NIL;
        var885 = var879;
        var886 = var885.first();
        for (var887 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var885; var885 = var885.rest(), var886 = var885.first(), var887 = Numbers.add((SubLObject)module0765.ONE_INTEGER, var887)) {
            final SubLObject var888 = Numbers.add(var887, (SubLObject)module0765.ONE_INTEGER);
            final SubLObject var889 = module0751.f46793(var888, var856);
            final SubLObject var890 = module0202.f12911(var886, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED);
            if (var890.equal((SubLObject)ConsesLow.list(var436))) {
                if (module0765.NIL != module0751.f46706(var886, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED) && module0205.f13134(var886, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED).equal(var436)) {
                    var882 = (SubLObject)ConsesLow.cons(var889, var882);
                }
                else if (module0205.f13134(var886, (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.UNPROVIDED).equal(var436)) {
                    var880 = (SubLObject)ConsesLow.cons(var889, var880);
                }
                else {
                    var881 = (SubLObject)ConsesLow.cons(var889, var881);
                }
            }
            else if (module0765.NIL != Sequences.find(var436, var890, (SubLObject)module0765.EQUAL, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
                var883 = (SubLObject)ConsesLow.cons(var889, var883);
            }
            else {
                var884 = (SubLObject)ConsesLow.cons(module0751.f46793(var888, var856), var884);
            }
        }
        return (SubLObject)ConsesLow.list(ConsesLow.append(var880, var881), var883, var882, var884);
    }
    
    public static SubLObject f48755(final SubLObject var117, final SubLObject var876, final SubLObject var532, SubLObject var856) {
        if (var856 == module0765.UNPROVIDED) {
            var856 = (SubLObject)module0765.NIL;
        }
        if (var117.equal(var876)) {
            return var532;
        }
        if (var117.isAtom()) {
            return var856;
        }
        if (module0765.NIL != module0205.f13221(var876, var117, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED, (SubLObject)module0765.UNPROVIDED)) {
            SubLObject var877 = (SubLObject)module0765.NIL;
            final SubLObject var878 = module0205.f13180(var117, (SubLObject)module0765.$ic80$);
            SubLObject var879 = (SubLObject)module0765.NIL;
            SubLObject var880 = (SubLObject)module0765.NIL;
            SubLObject var881 = (SubLObject)module0765.NIL;
            var879 = var878;
            var880 = var879.first();
            for (var881 = (SubLObject)module0765.ZERO_INTEGER; module0765.NIL != var879; var879 = var879.rest(), var880 = var879.first(), var881 = module0048.f_1X(var881)) {
                var877 = (SubLObject)ConsesLow.cons(f48755(var880, var876, var532, module0751.f46793(var881, var856)), var877);
            }
            return Sequences.reverse(var877);
        }
        return var856;
    }
    
    public static SubLObject f48756() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48515", "S#52991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48516", "S#50954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48518", "S#52992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48517", "S#52993", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48519", "S#52994", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48520", "S#52995", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48525", "S#52996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48526", "S#52997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48524", "S#52359", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0765", "f48530", "S#52998");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48528", "S#52999", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48529", "S#53000", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48533", "S#53001", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48534", "S#53002", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48535", "S#52553", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48536", "S#52554", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48537", "S#52550", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48538", "S#53003", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48531", "S#52551", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48532", "S#52552", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48527", "S#53004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48523", "S#53005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48522", "S#53006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48539", "S#53007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48540", "S#53008", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48541", "S#53009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48542", "S#53010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48543", "S#53011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48544", "S#53012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48547", "S#53013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48549", "S#52710", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48552", "S#53014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48546", "S#53015", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48553", "S#53016", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48555", "S#53017", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48556", "S#53018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48550", "S#52711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48557", "S#53019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48545", "S#53020", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48548", "S#53021", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48559", "S#53022", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48560", "S#53023", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48561", "S#50968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48558", "S#53024", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48562", "S#53025", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48563", "S#53026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48521", "GENERATE-GENFORMAT-ARG", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48567", "S#53027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48564", "S#53028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48565", "S#53029", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48569", "S#53030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48566", "S#53031", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48572", "S#53032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48573", "S#53033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48574", "S#53034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48575", "S#53035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48571", "S#53036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48570", "S#53037", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48576", "S#53038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48577", "S#53039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48578", "S#53040", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48551", "S#52712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48554", "S#53041", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48581", "S#53042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48579", "S#53043", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48580", "S#53044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48583", "S#53045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48582", "S#53046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48584", "S#53047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48590", "S#53048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48591", "S#53049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48593", "S#53050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48595", "S#53051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48594", "S#53052", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48596", "S#53053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48597", "S#53054", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48589", "S#53055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48585", "S#53056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48586", "S#53057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48601", "S#53058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48602", "S#53059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48603", "S#53060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48604", "S#53061", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48600", "S#53062", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48599", "S#53063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48605", "S#53064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48588", "S#53065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48598", "S#53066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48592", "S#53067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48606", "S#53068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48607", "S#53069", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48608", "S#53070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48609", "S#53071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48610", "S#53072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48611", "S#53073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48613", "S#53074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48614", "S#53075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48615", "S#53076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48617", "S#53077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48618", "S#53078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48619", "S#53079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48620", "S#53080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48622", "S#53081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48587", "S#53082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48625", "S#53083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48627", "S#53084", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48626", "S#53085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48623", "S#53086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48628", "S#53087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48624", "S#53088", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48632", "S#53089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48621", "S#53090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48635", "S#53091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48636", "S#53092", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48637", "S#53093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48638", "S#50982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48639", "S#53094", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48616", "S#50983", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48641", "S#53095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48642", "S#53096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48643", "S#53097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48646", "S#53098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48645", "S#53099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48647", "S#53100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48648", "S#52987", 1, 0, false);
        new $f48648$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48650", "S#53101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48633", "S#53102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48651", "S#53103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48568", "S#52353", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48652", "S#53104", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48653", "S#53105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48612", "S#53106", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48654", "S#53107", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48656", "S#53108", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48657", "S#53109", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48658", "S#53110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48655", "S#53111", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48634", "S#53112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48659", "S#53113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48661", "S#52988", 1, 0, false);
        new $f48661$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48663", "S#53114", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48660", "S#53115", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48664", "S#53116", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48662", "S#50976", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48629", "S#53117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48631", "S#50950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48665", "S#53118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48666", "S#53119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48640", "S#53120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48667", "S#53121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48668", "S#53122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48670", "S#53123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48669", "S#53124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48673", "S#53125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48677", "S#53126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48678", "S#53127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48682", "S#53128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48672", "S#53129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48680", "S#53130", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48683", "S#53131", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48671", "S#53132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48679", "S#53133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48675", "S#53134", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48681", "S#53135", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48676", "S#53136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48684", "S#53137", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48687", "S#53138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48686", "S#53139", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48689", "S#53140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48690", "S#53141", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48691", "S#53142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48685", "S#53143", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48692", "S#53144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48674", "S#53145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48694", "S#53146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48695", "S#53147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48688", "S#53148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48696", "S#53149", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48697", "S#53150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48698", "S#53151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48703", "S#53152", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48704", "S#53153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48702", "S#53154", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48706", "S#53155", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48707", "S#53156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48699", "S#53157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48705", "S#53158", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48700", "S#53159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48710", "S#52624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48711", "S#53160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48712", "S#53161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48701", "S#53162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48714", "S#53163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48716", "S#53164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48717", "S#53165", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48718", "S#53166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48719", "S#53167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48649", "S#53168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48713", "S#53169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48709", "S#53170", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48720", "S#53171", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48708", "S#53172", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48722", "S#52709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48723", "S#53173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48721", "S#53174", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48693", "S#53175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48724", "S#53176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48725", "S#53177", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48644", "S#53178", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48726", "S#53179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48731", "S#53180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48732", "S#53181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48727", "S#53182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48733", "S#52990", 1, 0, false);
        new $f48733$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48734", "S#53183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48735", "S#53184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48736", "S#53185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48730", "S#53186", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48630", "S#53187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48737", "S#53188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48729", "S#53189", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48728", "S#53190", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48738", "S#53191", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48739", "S#53192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48740", "S#53193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48715", "S#53194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48741", "S#53195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48742", "S#53196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48743", "S#53197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48745", "S#53198", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48744", "S#53199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48746", "S#53200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48748", "S#53201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48747", "S#53202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48749", "S#53203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48750", "S#53204", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48751", "S#53205", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48752", "S#53206", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48753", "S#53207", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48754", "S#53208", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0765", "f48755", "S#53209", 3, 1, false);
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48757() {
        module0765.$g6117$ = SubLFiles.deflexical("S#53210", (SubLObject)module0765.T);
        module0765.$g6118$ = SubLFiles.defconstant("S#53211", (SubLObject)module0765.$ic124$);
        module0765.$g6119$ = SubLFiles.deflexical("S#53212", (SubLObject)module0765.$ic166$);
        module0765.$g6120$ = SubLFiles.deflexical("S#53213", (SubLObject)module0765.NIL);
        module0765.$g6121$ = SubLFiles.deflexical("S#53214", (SubLObject)module0765.$ic189$);
        module0765.$g6122$ = SubLFiles.defparameter("S#53215", (SubLObject)module0765.NIL);
        module0765.$g6123$ = SubLFiles.defparameter("S#53216", (SubLObject)module0765.T);
        module0765.$g6124$ = SubLFiles.defparameter("S#53217", (SubLObject)module0765.T);
        module0765.$g6125$ = SubLFiles.defparameter("S#53218", (SubLObject)module0765.NIL);
        module0765.$g6126$ = SubLFiles.deflexical("S#53219", (SubLObject)module0765.NIL);
        module0765.$g6127$ = SubLFiles.deflexical("S#53220", (SubLObject)module0765.$ic438$);
        return (SubLObject)module0765.NIL;
    }
    
    public static SubLObject f48758() {
        module0762.f48147((SubLObject)module0765.$ic55$, (SubLObject)module0765.$ic56$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic66$, (SubLObject)module0765.$ic67$, (SubLObject)module0765.$ic68$);
        module0762.f48147((SubLObject)module0765.$ic66$, (SubLObject)module0765.$ic69$, (SubLObject)module0765.$ic68$);
        module0002.f35((SubLObject)module0765.$ic75$, (SubLObject)module0765.$ic76$);
        module0762.f48147((SubLObject)module0765.$ic157$, (SubLObject)module0765.$ic158$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic159$, (SubLObject)module0765.$ic160$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic162$, (SubLObject)module0765.$ic163$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic168$, (SubLObject)module0765.$ic169$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic190$, (SubLObject)module0765.$ic67$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic190$, (SubLObject)module0765.$ic69$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic191$, (SubLObject)module0765.$ic192$, (SubLObject)module0765.$ic68$);
        module0012.f419((SubLObject)module0765.$ic191$);
        module0762.f48147((SubLObject)module0765.$ic210$, (SubLObject)module0765.$ic211$, (SubLObject)module0765.$ic57$);
        module0012.f419((SubLObject)module0765.$ic210$);
        module0762.f48147((SubLObject)module0765.$ic221$, (SubLObject)module0765.$ic222$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic231$, (SubLObject)module0765.$ic232$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic235$, (SubLObject)module0765.$ic236$, (SubLObject)module0765.$ic68$);
        module0034.f1895((SubLObject)module0765.$ic255$);
        module0762.f48147((SubLObject)module0765.$ic269$, (SubLObject)module0765.$ic270$, (SubLObject)module0765.$ic57$);
        module0034.f1895((SubLObject)module0765.$ic297$);
        module0034.f1895((SubLObject)module0765.$ic302$);
        module0762.f48147((SubLObject)module0765.$ic307$, (SubLObject)module0765.$ic308$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic311$, (SubLObject)module0765.$ic312$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic320$, (SubLObject)module0765.$ic321$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic326$, (SubLObject)module0765.$ic327$, (SubLObject)module0765.$ic57$);
        module0034.f1895((SubLObject)module0765.$ic331$);
        module0762.f48147((SubLObject)module0765.$ic366$, (SubLObject)module0765.$ic367$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic370$, (SubLObject)module0765.$ic371$, (SubLObject)module0765.$ic68$);
        module0762.f48147((SubLObject)module0765.$ic374$, (SubLObject)module0765.$ic375$, (SubLObject)module0765.$ic68$);
        module0034.f1895((SubLObject)module0765.$ic383$);
        module0034.f1909((SubLObject)module0765.$ic413$);
        module0034.f1895((SubLObject)module0765.$ic428$);
        module0762.f48147((SubLObject)module0765.$ic431$, (SubLObject)module0765.$ic238$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic445$, (SubLObject)module0765.$ic446$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic450$, (SubLObject)module0765.$ic451$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic454$, (SubLObject)module0765.$ic67$, (SubLObject)module0765.$ic455$);
        module0762.f48147((SubLObject)module0765.$ic463$, (SubLObject)module0765.$ic464$, (SubLObject)module0765.$ic57$);
        module0762.f48147((SubLObject)module0765.$ic467$, (SubLObject)module0765.$ic236$, (SubLObject)module0765.$ic57$);
        return (SubLObject)module0765.NIL;
    }
    
    @Override
    public void declareFunctions() {
        f48756();
    }
    
    @Override
    public void initializeVariables() {
        f48757();
    }
    
    @Override
    public void runTopLevelForms() {
        f48758();
    }
    
    static {
        me = (SubLFile)new module0765();
        module0765.$g6117$ = null;
        module0765.$g6118$ = null;
        module0765.$g6119$ = null;
        module0765.$g6120$ = null;
        module0765.$g6121$ = null;
        module0765.$g6122$ = null;
        module0765.$g6123$ = null;
        module0765.$g6124$ = null;
        module0765.$g6125$ = null;
        module0765.$g6126$ = null;
        module0765.$g6127$ = null;
        $ic0$ = SubLObjectFactory.makeString(",");
        $ic1$ = SubLObjectFactory.makeString("and");
        $ic2$ = SubLObjectFactory.makeString("or");
        $ic3$ = SubLObjectFactory.makeString(" ");
        $ic4$ = SubLObjectFactory.makeSymbol("S#52991", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("AND");
        $ic6$ = SubLObjectFactory.makeKeyword("UNORDERED");
        $ic7$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic8$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic9$ = SubLObjectFactory.makeString("~&Trying default precision: ~S.~%");
        $ic10$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic11$ = SubLObjectFactory.makeString("~&Working on dupe list: ~S~%");
        $ic12$ = SubLObjectFactory.makeString("~&Trying to reparaphrase ~S.~%");
        $ic13$ = SubLObjectFactory.makeString("~&Trying targeted precision ~S for ~S");
        $ic14$ = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $ic15$ = SubLObjectFactory.makeString("~&New paraphrase with precision ~S for ~S:~% ~S");
        $ic16$ = SubLObjectFactory.makeString("~&Trying full precision for ~S");
        $ic17$ = SubLObjectFactory.makeString("~&New paraphrase with full precision for ~S:~% ~S");
        $ic18$ = SubLObjectFactory.makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");
        $ic19$ = SubLObjectFactory.makeKeyword("NEW");
        $ic20$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic21$ = SubLObjectFactory.makeString("~&Suspending bullet use for~% ~S~%");
        $ic22$ = SubLObjectFactory.makeString("~&Turning bullet use back on.~%");
        $ic23$ = SubLObjectFactory.makeString("Not using bullets - *PPH-USE-BULLETED-LISTS?* is NIL.");
        $ic24$ = SubLObjectFactory.makeString("Not using bullets - list is too short");
        $ic25$ = SubLObjectFactory.makeInteger(40);
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39283", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53221", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic28$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic29$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52551", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52552", "CYC"));
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45464", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53222", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $ic34$ = SubLObjectFactory.makeKeyword("HTML");
        $ic35$ = SubLObjectFactory.makeString(">");
        $ic36$ = SubLObjectFactory.makeKeyword("NONE");
        $ic37$ = SubLObjectFactory.makeKeyword("SPACE");
        $ic38$ = SubLObjectFactory.makeKeyword("PERIOD");
        $ic39$ = SubLObjectFactory.makeString(".");
        $ic40$ = SubLObjectFactory.makeKeyword("OR");
        $ic41$ = SubLObjectFactory.makeKeyword("AND-OR");
        $ic42$ = SubLObjectFactory.makeString("and/or");
        $ic43$ = SubLObjectFactory.makeKeyword("BUT");
        $ic44$ = SubLObjectFactory.makeString("but");
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OrdinalAdjective"));
        $ic46$ = SubLObjectFactory.makeString("Can't generate ordinal form of ~S in ~S.");
        $ic47$ = SubLObjectFactory.makeSymbol("?WU");
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic49$ = SubLObjectFactory.makeSymbol("?SENSE");
        $ic50$ = SubLObjectFactory.makeInteger(100);
        $ic51$ = SubLObjectFactory.makeString("st");
        $ic52$ = SubLObjectFactory.makeString("nd");
        $ic53$ = SubLObjectFactory.makeString("rd");
        $ic54$ = SubLObjectFactory.makeString("th");
        $ic55$ = SubLObjectFactory.makeSymbol("S#53010", "CYC");
        $ic56$ = SubLObjectFactory.makeKeyword("NTH-EXPR");
        $ic57$ = SubLObjectFactory.makeKeyword("BEST");
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nthLargestElement"));
        $ic59$ = SubLObjectFactory.makeString("largest");
        $ic60$ = SubLObjectFactory.makeString("smallest");
        $ic61$ = SubLObjectFactory.makeString("all");
        $ic62$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $ic63$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $ic64$ = SubLObjectFactory.makeString("has the");
        $ic65$ = SubLObjectFactory.makeString("of");
        $ic66$ = SubLObjectFactory.makeSymbol("S#53011", "CYC");
        $ic67$ = SubLObjectFactory.makeKeyword("CYCL-SENTENCE");
        $ic68$ = SubLObjectFactory.makeKeyword("DECENT");
        $ic69$ = SubLObjectFactory.makeKeyword("NAUT");
        $ic70$ = SubLObjectFactory.makeString("GENERATE-ATOMIC-FORMULA called on PPH phrase with dtrs:~% ~S~%");
        $ic71$ = SubLObjectFactory.makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");
        $ic72$ = SubLObjectFactory.makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");
        $ic73$ = SubLObjectFactory.makeString("~&... and *pph-var-types* are now ~S~%");
        $ic74$ = SubLObjectFactory.makeString("~&Using template assertion: ~S.~%");
        $ic75$ = SubLObjectFactory.makeSymbol("S#53013", "CYC");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52935", "CYC"));
        $ic77$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic78$ = SubLObjectFactory.makeKeyword("ANY");
        $ic79$ = SubLObjectFactory.makeKeyword("REGULARIZE");
        $ic80$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic81$ = SubLObjectFactory.makeString("Can't use ~S with ~S");
        $ic82$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic83$ = SubLObjectFactory.makeSymbol("S#51695", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)module0765.ZERO_INTEGER);
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~"));
        $ic86$ = SubLObjectFactory.makeString("~");
        $ic87$ = SubLObjectFactory.makeSymbol("S#15600", "CYC");
        $ic88$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genFormat"));
        $ic89$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genFormat-Precise"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genFormat-NP"));
        $ic91$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genQuestion"));
        $ic92$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genFormat-ArgFixed"));
        $ic93$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic94$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic95$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic96$ = SubLObjectFactory.makeKeyword("STACK");
        $ic97$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic98$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic99$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic100$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic101$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic102$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic103$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic104$ = SubLObjectFactory.makeString("continue anyway");
        $ic105$ = SubLObjectFactory.makeKeyword("WARN");
        $ic106$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic107$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic108$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic109$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic110$ = SubLObjectFactory.makeString("~&~S not referenced in ~S.~% Current precision: ~S~%");
        $ic111$ = SubLObjectFactory.makeSymbol("S#51779", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#12343", "CYC");
        $ic113$ = SubLObjectFactory.makeKeyword("GAF");
        $ic114$ = SubLObjectFactory.makeSymbol("S#38937", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#53023", "CYC");
        $ic116$ = SubLObjectFactory.makeString("~&Looking for paraphrase templates for ~S from ~S.~%");
        $ic117$ = SubLObjectFactory.makeString("~&No ~S assertions found for ~S from ~S.~%");
        $ic118$ = SubLObjectFactory.makeString("~&Couldn't find paraphrase template for ~S. Using one for ~S instead.~%");
        $ic119$ = SubLObjectFactory.makeString("~&Paraphrasing ~S with sublist ~S and precision ~S.~%");
        $ic120$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic121$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic122$ = SubLObjectFactory.makeSymbol("S#53027", "CYC");
        $ic123$ = SubLObjectFactory.makeString("~&GENERATE-GENFORMAT-ARG Result: ~S.~%");
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("AND-OR"), (SubLObject)SubLObjectFactory.makeKeyword("SPACE"), (SubLObject)SubLObjectFactory.makeKeyword("PERIOD"));
        $ic125$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycUniversalDate"));
        $ic126$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycUniversalSecond"));
        $ic127$ = SubLObjectFactory.makeString("`~a'");
        $ic128$ = SubLObjectFactory.makeString("~&Using preferred senses ~S~%");
        $ic129$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)module0765.ONE_INTEGER);
        $ic130$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DurationFn"));
        $ic131$ = SubLObjectFactory.makeString("in");
        $ic132$ = SubLObjectFactory.makeString("at");
        $ic133$ = SubLObjectFactory.makeString("on");
        $ic134$ = SubLObjectFactory.makeSymbol("S#51056", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#51062", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#53038", "CYC");
        $ic137$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("agentive-Pl")));
        $ic138$ = SubLObjectFactory.makeSymbol("ATOM");
        $ic139$ = SubLObjectFactory.makeString("~&Couldn't paraphrase args ~S with arg-order-list ~S~%");
        $ic140$ = SubLObjectFactory.makeSymbol("S#39267", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#39070", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");
        $ic143$ = SubLObjectFactory.makeString("~&Couldn't paraphrase ~S.~%");
        $ic144$ = SubLObjectFactory.makeString("~&PROCESS-GEN-FORMAT-ARGLIST:~% Working on ~S.~%Done: ~S.~%");
        $ic145$ = SubLObjectFactory.makeString("Making copy of reused output items:~% ~S");
        $ic146$ = SubLObjectFactory.makeSymbol("S#50800", "CYC");
        $ic147$ = SubLObjectFactory.makeString("Generating with #$genFormat for motherless phrase:~% ~S~%");
        $ic148$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheInstance"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("possessiveRelation"));
        $ic151$ = SubLObjectFactory.makeKeyword("NON-PLURAL-GENERIC");
        $ic152$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $ic153$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NON-PLURAL-GENERIC"), (SubLObject)SubLObjectFactory.makeKeyword("A"));
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SINGULAR-GENERIC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Another-TheWord")));
        $ic155$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ThirdPerson-NLAttr"));
        $ic156$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReflexivePronoun"));
        $ic157$ = SubLObjectFactory.makeSymbol("S#53047", "CYC");
        $ic158$ = SubLObjectFactory.makeKeyword("DATE-NAUT");
        $ic159$ = SubLObjectFactory.makeSymbol("S#53048", "CYC");
        $ic160$ = SubLObjectFactory.makeKeyword("YEAR-NAUT");
        $ic161$ = SubLObjectFactory.makeKeyword("YEAR");
        $ic162$ = SubLObjectFactory.makeSymbol("S#53050", "CYC");
        $ic163$ = SubLObjectFactory.makeKeyword("MONTH-NAUT");
        $ic164$ = ConsesLow.list((SubLObject)module0765.ONE_INTEGER);
        $ic165$ = ConsesLow.list((SubLObject)module0765.TWO_INTEGER);
        $ic166$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)SubLObjectFactory.makeString("January")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)SubLObjectFactory.makeString("February")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)SubLObjectFactory.makeString("March")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("April")), (SubLObject)SubLObjectFactory.makeString("April")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("May")), (SubLObject)SubLObjectFactory.makeString("May")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)SubLObjectFactory.makeString("June")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("July")), (SubLObject)SubLObjectFactory.makeString("July")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("August")), (SubLObject)SubLObjectFactory.makeString("August")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("September")), (SubLObject)SubLObjectFactory.makeString("September")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("October")), (SubLObject)SubLObjectFactory.makeString("October")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("November")), (SubLObject)SubLObjectFactory.makeString("November")), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)SubLObjectFactory.makeString("December")) });
        $ic167$ = SubLObjectFactory.makeKeyword("MONTH");
        $ic168$ = SubLObjectFactory.makeSymbol("S#53053", "CYC");
        $ic169$ = SubLObjectFactory.makeKeyword("DAY-NAUT");
        $ic170$ = ConsesLow.list((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.ONE_INTEGER);
        $ic171$ = ConsesLow.list((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.TWO_INTEGER);
        $ic172$ = SubLObjectFactory.makeKeyword("DAY");
        $ic173$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DecadeFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CenturyFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SeasonFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QuarterFn")));
        $ic174$ = SubLObjectFactory.makeString("~2,'0D");
        $ic175$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMilliSecond"));
        $ic176$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MillisecondsDuration"));
        $ic177$ = SubLObjectFactory.makeKeyword("ARG1");
        $ic178$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CalendarSecond"));
        $ic179$ = SubLObjectFactory.makeString("~3,'0D");
        $ic180$ = SubLObjectFactory.makeKeyword("ARG2");
        $ic181$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMinute"));
        $ic182$ = SubLObjectFactory.makeString(":");
        $ic183$ = SubLObjectFactory.makeSymbol("?PRECISION");
        $ic184$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic185$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $ic186$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRECISION"));
        $ic187$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRECISION"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CalendarCoveringType"))));
        $ic188$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic189$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeString("the year "));
        $ic190$ = SubLObjectFactory.makeSymbol("S#53070", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#53068", "CYC");
        $ic192$ = SubLObjectFactory.makeKeyword("NL-TAGGED-TERM");
        $ic193$ = SubLObjectFactory.makeString("GENERATE-PHRASE-FROM-TEMPLATE called on PPH phrase with dtrs:~% ~S~%");
        $ic194$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic195$ = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-TEMPLATE trying phrase: ~S~%");
        $ic196$ = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-TEMPLATE: too many demerits~%");
        $ic197$ = SubLObjectFactory.makeString("Added ~D template alternatives to~% ~S");
        $ic198$ = SubLObjectFactory.makeKeyword("NO-GEN-TEMPLATES");
        $ic199$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic200$ = SubLObjectFactory.makeKeyword("EXISTING-GEN-TEMPLATES-FAILED");
        $ic201$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic202$ = SubLObjectFactory.makeString(") ");
        $ic203$ = SubLObjectFactory.makeString("Adding too many justifications. Old-just: ~S.~%");
        $ic204$ = SubLObjectFactory.makeString("~&Initial paraphrase agr is ~S~%");
        $ic205$ = SubLObjectFactory.makeString("~&Initial paraphrase category is ~S~%");
        $ic206$ = SubLObjectFactory.makeString("~&Initial paraphrase case is ~S~%");
        $ic207$ = SubLObjectFactory.makeString("~&DO-GENERATE-PHRASE-FROM-TEMPLATE: Too many demerits.~%");
        $ic208$ = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-TEMPLATE found string: ~S");
        $ic209$ = SubLObjectFactory.makeString("~&Updated AGR is ~S.~%");
        $ic210$ = SubLObjectFactory.makeSymbol("S#53073", "CYC");
        $ic211$ = SubLObjectFactory.makeKeyword("NEGATION");
        $ic212$ = SubLObjectFactory.makeKeyword("NO");
        $ic213$ = SubLObjectFactory.makeString("Inside operator scope ~S");
        $ic214$ = SubLObjectFactory.makeString("~&Shadowing discourse context...~%");
        $ic215$ = SubLObjectFactory.makeString("Leaving operator scope ~S");
        $ic216$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WordWithSuffixFn"));
        $ic217$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Nt-TheSuffix"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Aux-Negated"));
        $ic219$ = SubLObjectFactory.makeString("not");
        $ic220$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic221$ = SubLObjectFactory.makeSymbol("S#53076", "CYC");
        $ic222$ = SubLObjectFactory.makeKeyword("FN-TO-ARG-0");
        $ic223$ = SubLObjectFactory.makeString("the");
        $ic224$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51667", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49996", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20618", "CYC"));
        $ic225$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")));
        $ic226$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("importFromAmountDuring"));
        $ic227$ = SubLObjectFactory.makeString("~a export to ~a during ~a");
        $ic228$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0765.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("NON-PLURAL-GENERIC")), (SubLObject)module0765.ONE_INTEGER, (SubLObject)module0765.FOUR_INTEGER);
        $ic229$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic230$ = SubLObjectFactory.makeSymbol("S#51733", "CYC");
        $ic231$ = SubLObjectFactory.makeSymbol("S#53079", "CYC");
        $ic232$ = SubLObjectFactory.makeKeyword("KAPPA-EXPR");
        $ic233$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic234$ = SubLObjectFactory.makeString("for");
        $ic235$ = SubLObjectFactory.makeSymbol("S#53080", "CYC");
        $ic236$ = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $ic237$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("tensed")));
        $ic238$ = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $ic239$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic240$ = SubLObjectFactory.makeString("there is some");
        $ic241$ = SubLObjectFactory.makeString("such that");
        $ic242$ = SubLObjectFactory.makeString("Failed to generate explicit existential for~% ~S~%");
        $ic243$ = SubLObjectFactory.makeSymbol("S#13455", "CYC");
        $ic244$ = SubLObjectFactory.makeSymbol("S#15548", "CYC");
        $ic245$ = SubLObjectFactory.makeSymbol("S#53103", "CYC");
        $ic246$ = SubLObjectFactory.makeSymbol("S#53183", "CYC");
        $ic247$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic248$ = SubLObjectFactory.makeString("Registering ~S as ~S~% with map ~S");
        $ic249$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53223", "CYC"));
        $ic250$ = SubLObjectFactory.makeSymbol("CAR");
        $ic251$ = SubLObjectFactory.makeKeyword("SELF");
        $ic252$ = SubLObjectFactory.makeString("~&Checking formula for relational noun paraphrase:~% ~S~%");
        $ic253$ = SubLObjectFactory.makeString("~&~S not suitable for relational noun paraphrase.~%");
        $ic254$ = SubLObjectFactory.makeString("~&Suitable for relational noun paraphrase.~%");
        $ic255$ = SubLObjectFactory.makeSymbol("S#50983", "CYC");
        $ic256$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic257$ = SubLObjectFactory.makeString("~&Paraphrasing ~S with relational nouns.~%");
        $ic258$ = SubLObjectFactory.makeString("Bad arg: ~S in ~S.~%");
        $ic259$ = SubLObjectFactory.makeString("Don't know how to form a relational noun expression for ~S.");
        $ic260$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLPhraseOfStringFn"));
        $ic261$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HeadWordOfPhraseFn"));
        $ic262$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn-Constrained"));
        $ic263$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFormFn"));
        $ic264$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $ic265$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn"));
        $ic266$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-NP"));
        $ic267$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestHeadVerbForInitialSubjectFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Have-TheWord")));
        $ic268$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn-Indefinite"));
        $ic269$ = SubLObjectFactory.makeSymbol("S#53097", "CYC");
        $ic270$ = SubLObjectFactory.makeKeyword("IMPLICATION");
        $ic271$ = SubLObjectFactory.makeString("~&Removed var typing clauses in ~S~%...to form ~S~%");
        $ic272$ = SubLObjectFactory.makeKeyword("IMPLIES");
        $ic273$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53224", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"));
        $ic274$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("different"));
        $ic275$ = SubLObjectFactory.makeString("~&Registering ~S and ~S as different.~%");
        $ic276$ = SubLObjectFactory.makeSymbol("S#53098", "CYC");
        $ic277$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31793", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31794", "CYC"));
        $ic278$ = SubLObjectFactory.makeKeyword("ANTECEDENT");
        $ic279$ = SubLObjectFactory.makeSymbol("S#15431", "CYC");
        $ic280$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53225", "CYC"));
        $ic281$ = SubLObjectFactory.makeSymbol("S#15566", "CYC");
        $ic282$ = SubLObjectFactory.makeSymbol("S#15477", "CYC");
        $ic283$ = SubLObjectFactory.makeSymbol("S#52987", "CYC");
        $ic284$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#53226", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"));
        $ic285$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Some-NLAttr"));
        $ic286$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Every-NLAttr"));
        $ic287$ = SubLObjectFactory.makeKeyword("USE-CONTEXT");
        $ic288$ = SubLObjectFactory.makeSymbol("S#51110", "CYC");
        $ic289$ = SubLObjectFactory.makeString("Bad FORMULA argument to REGISTER-VAR-BY-ARG-CONSTRAINTS: ~S.");
        $ic290$ = SubLObjectFactory.makeSymbol("S#53106", "CYC");
        $ic291$ = SubLObjectFactory.makeString("~&Found a var-typing clause, with var ~s type ~s~% arg-position: ~S~%");
        $ic292$ = SubLObjectFactory.makeString("~&~S does not type ~S. Keeping it.~%");
        $ic293$ = SubLObjectFactory.makeString("~&~S is only remaining var-typing clause for ~S. Keeping it.~%");
        $ic294$ = SubLObjectFactory.makeString("~&~S is already registered as ~S. Skipping ~S~%");
        $ic295$ = SubLObjectFactory.makeString("~&~S is already registered as ~S. Keeping ~S~%");
        $ic296$ = SubLObjectFactory.makeSymbol("S#52988", "CYC");
        $ic297$ = SubLObjectFactory.makeSymbol("S#53115", "CYC");
        $ic298$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sentenceImplies"));
        $ic299$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic300$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sentenceImplies")));
        $ic301$ = SubLObjectFactory.makeInteger(98);
        $ic302$ = SubLObjectFactory.makeSymbol("S#50976", "CYC");
        $ic303$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic304$ = SubLObjectFactory.makeSymbol("SPEC?");
        $ic305$ = SubLObjectFactory.makeInteger(200);
        $ic306$ = SubLObjectFactory.makeKeyword("EXCEPTION");
        $ic307$ = SubLObjectFactory.makeSymbol("S#53118", "CYC");
        $ic308$ = SubLObjectFactory.makeKeyword("CF-IMPLICATION");
        $ic309$ = SubLObjectFactory.makeString("if it had~a been the case that ~a, it would~a be the case that ~a");
        $ic310$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cfImplies"));
        $ic311$ = SubLObjectFactory.makeSymbol("S#53119", "CYC");
        $ic312$ = SubLObjectFactory.makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT");
        $ic313$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Inverse"));
        $ic314$ = SubLObjectFactory.makeString("Generating relational noun phrase for ~S (of a ~S)");
        $ic315$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-InstanceLevel"));
        $ic316$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-NP")), (SubLObject)SubLObjectFactory.makeKeyword("ARG3"));
        $ic317$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestPPFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Of-TheWord")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn-Indefinite")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Constrained")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeKeyword("ARG3"))));
        $ic318$ = SubLObjectFactory.makeString("Couldn't find an arg-in-reln assertion for~% ~S");
        $ic319$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Canonical"));
        $ic320$ = SubLObjectFactory.makeSymbol("S#53122", "CYC");
        $ic321$ = SubLObjectFactory.makeKeyword("THE-COLLECTION-OF-NAT");
        $ic322$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $ic323$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53227", "CYC"));
        $ic324$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $ic325$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic326$ = SubLObjectFactory.makeSymbol("S#53123", "CYC");
        $ic327$ = SubLObjectFactory.makeKeyword("SUBCOLLECTION-RELATION-NAUT");
        $ic328$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn"));
        $ic329$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52876", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53228", "CYC"));
        $ic330$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53229", "CYC"));
        $ic331$ = SubLObjectFactory.makeSymbol("S#53129", "CYC");
        $ic332$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-TypeLevel"));
        $ic333$ = SubLObjectFactory.makeKeyword("ARG3");
        $ic334$ = SubLObjectFactory.makeKeyword("INDEFINITE");
        $ic335$ = SubLObjectFactory.makeInteger(48);
        $ic336$ = SubLObjectFactory.makeString("~S is neither an atom nor a list!");
        $ic337$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $ic338$ = SubLObjectFactory.makeString("PPH-REL-CLAUSE-FOR-COLL-SUBSET called with assertion-style template ~S");
        $ic339$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Person"));
        $ic340$ = SubLObjectFactory.makeString("~&Trying to make relative clause from template phrase.~%");
        $ic341$ = SubLObjectFactory.makeString("whose");
        $ic342$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $ic343$ = SubLObjectFactory.makeString("whom");
        $ic344$ = SubLObjectFactory.makeString("which");
        $ic345$ = SubLObjectFactory.makeString("Moving rel-clause copula to immediately follow relative pronoun.");
        $ic346$ = SubLObjectFactory.makeString("~&Removing copula from template.~%");
        $ic347$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Have-TheWord"));
        $ic348$ = SubLObjectFactory.makeString("with");
        $ic349$ = SubLObjectFactory.makeString("~&Adding relative pronoun to template.~%");
        $ic350$ = SubLObjectFactory.makeString("that");
        $ic351$ = SubLObjectFactory.makeString("~&Template now has ~D dtrs.~%");
        $ic352$ = SubLObjectFactory.makeString("Can't determine relative clause head dtr from~% ~S");
        $ic353$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Noun"));
        $ic354$ = SubLObjectFactory.makeString("Updating ~S of ~S~% to ~S");
        $ic355$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Be-TheWord"));
        $ic356$ = SubLObjectFactory.makeString("~a ");
        $ic357$ = SubLObjectFactory.makeString("is ");
        $ic358$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic359$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic360$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $ic361$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $ic362$ = SubLObjectFactory.makeString("~a that ");
        $ic363$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"));
        $ic364$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53230", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53231", "CYC"));
        $ic365$ = SubLObjectFactory.makeString("Found extractible dtr: ~% ~S");
        $ic366$ = SubLObjectFactory.makeSymbol("S#53150", "CYC");
        $ic367$ = SubLObjectFactory.makeKeyword("PHRASE-DENOTING-NAUT");
        $ic368$ = SubLObjectFactory.makeString("~&In GENERATE-PHRASE-NAUT.~%");
        $ic369$ = SubLObjectFactory.makeString("~&Precision is ~S.~%");
        $ic370$ = SubLObjectFactory.makeSymbol("S#53151", "CYC");
        $ic371$ = SubLObjectFactory.makeKeyword("SPECIFIED-SCOPE-SENTENCE");
        $ic372$ = SubLObjectFactory.makeString("~&Replacing rule-macro formula~% ~S~% with~% ~S");
        $ic373$ = SubLObjectFactory.makeString("~&GENERATE-SPECIFIED-SCOPE-SENTENCE is returning: ~S");
        $ic374$ = SubLObjectFactory.makeSymbol("S#53153", "CYC");
        $ic375$ = SubLObjectFactory.makeKeyword("RMP-SENTENCE");
        $ic376$ = SubLObjectFactory.makeString("Replacing rule-macro formula~% ~S~% with expanded formula ~S");
        $ic377$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansion"));
        $ic378$ = SubLObjectFactory.makeString("~&Looking for a template for ~S~%");
        $ic379$ = SubLObjectFactory.makeString("Abandoning search because ~S is unambiguous with respect to scope.~%");
        $ic380$ = SubLObjectFactory.makeString("~&No template found for ~S.~%");
        $ic381$ = SubLObjectFactory.makeString("~&Search limit exceeded.~%");
        $ic382$ = SubLObjectFactory.makeString("~&Search level is ~S of ~S~%");
        $ic383$ = SubLObjectFactory.makeSymbol("S#53157", "CYC");
        $ic384$ = SubLObjectFactory.makeString("~&~S is not ambiguous with respect to scope.~%");
        $ic385$ = SubLObjectFactory.makeInteger(212);
        $ic386$ = SubLObjectFactory.makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");
        $ic387$ = SubLObjectFactory.makeString("~&Paraphrasing formula ~S~%");
        $ic388$ = SubLObjectFactory.makeKeyword("GEN-FORMAT");
        $ic389$ = SubLObjectFactory.makeString("~&Found assertion ~S for formula ~S~%");
        $ic390$ = SubLObjectFactory.makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");
        $ic391$ = SubLObjectFactory.makeString("~& Output list: ~S~%");
        $ic392$ = SubLObjectFactory.makeString("~& Setting ~S to~% ~S");
        $ic393$ = SubLObjectFactory.makeString("~% Leaving *PPH-VAR-TYPES* ~S");
        $ic394$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("generateArgWithOutsideScope"));
        $ic395$ = SubLObjectFactory.makeString("relatedArgPositions");
        $ic396$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relatedArgPositions"));
        $ic397$ = ConsesLow.list((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.THREE_INTEGER);
        $ic398$ = SubLObjectFactory.makeString("Couldn't find #$relatedArgPositions assertions for ~S");
        $ic399$ = SubLObjectFactory.makeString("Wrong number of #$relatedArgPositions assertions for ~S: ~D.~%");
        $ic400$ = SubLObjectFactory.makeKeyword("ITSELF");
        $ic401$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"));
        $ic402$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("No-NLAttr"));
        $ic403$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr"));
        $ic404$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Constrained"));
        $ic405$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $ic406$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic407$ = SubLObjectFactory.makeString("everything");
        $ic408$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $ic409$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $ic410$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn"));
        $ic411$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn"));
        $ic412$ = SubLObjectFactory.makeSymbol("S#49061", "CYC");
        $ic413$ = SubLObjectFactory.makeSymbol("S#53168", "CYC");
        $ic414$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("generateQuantOverArg"));
        $ic415$ = SubLObjectFactory.makeSymbol("S#53219", "CYC");
        $ic416$ = SubLObjectFactory.makeSymbol("<");
        $ic417$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic418$ = SubLObjectFactory.makeSymbol("REVERSE");
        $ic419$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53233", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53234", "CYC"));
        $ic420$ = SubLObjectFactory.makeString("~&Found a genTemplate for ~S.~%");
        $ic421$ = SubLObjectFactory.makeString("~&Passing up genTemplates for ~S in favor of genFormats.~%");
        $ic422$ = SubLObjectFactory.makeString("~&Couldn't find any generation templates for~% ~S with wide-scope arg ~S.~%");
        $ic423$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic424$ = SubLObjectFactory.makeString("~a");
        $ic425$ = SubLObjectFactory.makeString("~a and");
        $ic426$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic427$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic428$ = SubLObjectFactory.makeSymbol("S#53178", "CYC");
        $ic429$ = SubLObjectFactory.makeSymbol("S#51433", "CYC");
        $ic430$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC"));
        $ic431$ = SubLObjectFactory.makeSymbol("S#53179", "CYC");
        $ic432$ = SubLObjectFactory.makeString("~&Changed phrase cycl from ~S~% to ~S~% to ~S~%");
        $ic433$ = SubLObjectFactory.makeSymbol("S#15542", "CYC");
        $ic434$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic435$ = SubLObjectFactory.makeString("for every");
        $ic436$ = SubLObjectFactory.makeString("Failed to generate explicit universal for~% ~S~%");
        $ic437$ = SubLObjectFactory.makeSymbol("S#52990", "CYC");
        $ic438$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic439$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier"));
        $ic440$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic441$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53235", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"));
        $ic442$ = ConsesLow.list((SubLObject)module0765.TWO_INTEGER, (SubLObject)module0765.ZERO_INTEGER);
        $ic443$ = SubLObjectFactory.makeString("Couldn't remove var-typing clauses from universal:~% ~S");
        $ic444$ = SubLObjectFactory.makeKeyword("CNF");
        $ic445$ = SubLObjectFactory.makeSymbol("S#53193", "CYC");
        $ic446$ = SubLObjectFactory.makeKeyword("UNICODE-NAUT");
        $ic447$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic448$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53236", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53237", "CYC"));
        $ic449$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $ic450$ = SubLObjectFactory.makeSymbol("S#53196", "CYC");
        $ic451$ = SubLObjectFactory.makeKeyword("SET-NAUT");
        $ic452$ = SubLObjectFactory.makeString("the set of");
        $ic453$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular"));
        $ic454$ = SubLObjectFactory.makeSymbol("S#53197", "CYC");
        $ic455$ = SubLObjectFactory.makeKeyword("FALLBACK");
        $ic456$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CyclishParaphraseMt"));
        $ic457$ = SubLObjectFactory.makeString("Generating with holds-of for motherless phrase:~% ~S~%");
        $ic458$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic459$ = SubLObjectFactory.makeString("doesn't hold");
        $ic460$ = SubLObjectFactory.makeString("does not hold");
        $ic461$ = SubLObjectFactory.makeString("holds");
        $ic462$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"));
        $ic463$ = SubLObjectFactory.makeSymbol("S#53200", "CYC");
        $ic464$ = SubLObjectFactory.makeKeyword("COORDINATION");
        $ic465$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheDisjunctiveCoordinationSet"));
        $ic466$ = SubLObjectFactory.makeSymbol("S#16368", "CYC");
        $ic467$ = SubLObjectFactory.makeSymbol("S#53203", "CYC");
        $ic468$ = SubLObjectFactory.makeString("such that ?X");
        $ic469$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53238", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53239", "CYC"));
        $ic470$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic471$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53240", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53241", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53242", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53243", "CYC"));
        $ic472$ = SubLObjectFactory.makeString("X");
        $ic473$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf"));
    }
    
    public static final class $f48648$UnaryFunction extends UnaryFunction
    {
        public $f48648$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52987"));
        }
        
        @Override
        public SubLObject processItem(final SubLObject var499) {
            return module0765.f48648(var499);
        }
    }
    
    public static final class $f48661$UnaryFunction extends UnaryFunction
    {
        public $f48661$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52988"));
        }
        
        @Override
        public SubLObject processItem(final SubLObject var499) {
            return module0765.f48661(var499);
        }
    }
    
    public static final class $f48733$UnaryFunction extends UnaryFunction
    {
        public $f48733$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52990"));
        }
        
        @Override
        public SubLObject processItem(final SubLObject var499) {
            return module0765.f48733(var499);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0765.class
	Total time: 4647 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/