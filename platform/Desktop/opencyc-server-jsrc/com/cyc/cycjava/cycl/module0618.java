package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0618 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0618";
    public static final String myFingerPrint = "2a27ad4a5d58c90a711e472a077cedd6bf37f074de7e3e38054b4a8e42a408a2";
    private static SubLSymbol $g4738$;
    private static SubLSymbol $g4739$;
    private static SubLSymbol $g4740$;
    private static SubLSymbol $g4741$;
    private static SubLSymbol $g4742$;
    public static SubLSymbol $g4743$;
    private static SubLSymbol $g4744$;
    public static SubLSymbol $g4745$;
    private static SubLSymbol $g4746$;
    public static SubLSymbol $g4747$;
    private static SubLSymbol $g4748$;
    public static SubLSymbol $g4749$;
    private static SubLSymbol $g4750$;
    private static SubLSymbol $g4751$;
    private static SubLSymbol $g4752$;
    private static SubLSymbol $g4753$;
    private static SubLSymbol $g4754$;
    private static SubLSymbol $g4755$;
    public static SubLSymbol $g4756$;
    public static SubLSymbol $g2377$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLSymbol $ic39$;
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
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLInteger $ic68$;
    private static final SubLInteger $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
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
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLList $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
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
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
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
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLInteger $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLList $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLList $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
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
    private static final SubLSymbol $ic258$;
    private static final SubLString $ic259$;
    private static final SubLSymbol $ic260$;
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
    private static final SubLString $ic289$;
    private static final SubLString $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLString $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLString $ic303$;
    private static final SubLInteger $ic304$;
    private static final SubLString $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLString $ic308$;
    private static final SubLString $ic309$;
    private static final SubLString $ic310$;
    private static final SubLString $ic311$;
    private static final SubLInteger $ic312$;
    private static final SubLString $ic313$;
    private static final SubLString $ic314$;
    private static final SubLString $ic315$;
    private static final SubLInteger $ic316$;
    private static final SubLString $ic317$;
    private static final SubLString $ic318$;
    private static final SubLString $ic319$;
    private static final SubLString $ic320$;
    private static final SubLString $ic321$;
    private static final SubLString $ic322$;
    private static final SubLString $ic323$;
    private static final SubLString $ic324$;
    private static final SubLInteger $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLString $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLObject $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLObject $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLList $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLList $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLList $ic354$;
    private static final SubLList $ic355$;
    private static final SubLList $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLString $ic359$;
    private static final SubLString $ic360$;
    private static final SubLString $ic361$;
    private static final SubLString $ic362$;
    private static final SubLString $ic363$;
    private static final SubLString $ic364$;
    
    public static SubLObject f37906() {
        return module0618.$g4738$.getGlobalValue();
    }
    
    public static SubLObject f37907(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0618.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic6$, reader.bq_cons((SubLObject)module0618.$ic7$, ConsesLow.append(var5, (SubLObject)module0618.NIL))))))));
    }
    
    public static SubLObject f37908(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic8$, (SubLObject)module0618.$ic9$, ConsesLow.append(var5, (SubLObject)module0618.NIL));
    }
    
    public static SubLObject f37909(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic8$, (SubLObject)module0618.$ic10$, ConsesLow.append(var5, (SubLObject)module0618.NIL));
    }
    
    public static SubLObject f37910(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic8$, (SubLObject)module0618.$ic11$, ConsesLow.append(var5, (SubLObject)module0618.NIL));
    }
    
    public static SubLObject f37911(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic12$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0618.NIL;
        SubLObject var7 = (SubLObject)module0618.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic12$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic12$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0618.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var7)), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0618.$ic13$, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0618.$ic12$);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37912(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0618.NIL;
        SubLObject var7 = (SubLObject)module0618.NIL;
        SubLObject var8 = (SubLObject)module0618.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0618.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0618.$ic15$;
            return (SubLObject)ConsesLow.list((SubLObject)module0618.$ic16$, (SubLObject)ConsesLow.list(var10, var7), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic17$, (SubLObject)ConsesLow.list(var6, var10, var8), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic18$, (SubLObject)ConsesLow.listS((SubLObject)module0618.EQ, var8, (SubLObject)module0618.$ic19$), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic20$, var6, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic21$, var6))), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic22$, reader.bq_cons((SubLObject)module0618.$ic23$, ConsesLow.append(var9, (SubLObject)module0618.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic24$, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0618.$ic14$);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37913(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0618.NIL;
        SubLObject var7 = (SubLObject)module0618.NIL;
        SubLObject var8 = (SubLObject)module0618.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0618.$ic14$);
        var8 = var4.first();
        var4 = var4.rest();
        if (module0618.NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)module0618.$ic25$;
            return (SubLObject)ConsesLow.list((SubLObject)module0618.$ic16$, (SubLObject)ConsesLow.list(var10, var7), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic26$, (SubLObject)ConsesLow.list(var6, var10, var8), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic18$, (SubLObject)ConsesLow.listS((SubLObject)module0618.EQ, var8, (SubLObject)module0618.$ic19$), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic20$, var6, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic21$, var6))), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic22$, reader.bq_cons((SubLObject)module0618.$ic23$, ConsesLow.append(var9, (SubLObject)module0618.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic24$, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0618.$ic14$);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37914(final SubLObject var16) {
        assert module0618.NIL != Types.stringp(var16) : var16;
        return Sequences.fill(var16, (SubLObject)Characters.CHAR_space, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
    }
    
    public static SubLObject f37915(SubLObject var25, SubLObject var26) {
        if (var25 == module0618.UNPROVIDED) {
            var25 = module0018.f971();
        }
        if (var26 == module0618.UNPROVIDED) {
            var26 = module0618.$g4739$.getDynamicValue();
        }
        final SubLObject var27 = var25.isInteger() ? module0574.f35166(var25) : Strings.string(var25);
        final SubLObject var28 = ConsesLow.append(var26, (SubLObject)ConsesLow.list(var27));
        return module0075.f5175(var28, (SubLObject)module0618.NIL, (SubLObject)module0618.NIL);
    }
    
    public static SubLObject f37916(final SubLObject var29, final SubLObject var28, SubLObject var30) {
        if (var30 == module0618.UNPROVIDED) {
            var30 = module0618.$g4740$.getDynamicValue();
        }
        return module0075.f5176(var28, var29, var30);
    }
    
    public static SubLObject f37917(final SubLObject var29, final SubLObject var28, SubLObject var30) {
        if (var30 == module0618.UNPROVIDED) {
            var30 = module0618.$g4741$.getDynamicValue();
        }
        return module0075.f5176(var28, var29, var30);
    }
    
    public static SubLObject f37918(SubLObject var31) {
        if (var31 == module0618.UNPROVIDED) {
            var31 = module0174.f11019();
        }
        return Numbers.multiply(module0618.$g4742$.getGlobalValue(), var31);
    }
    
    public static SubLObject f37919(final SubLObject var16, SubLObject var32) {
        if (var32 == module0618.UNPROVIDED) {
            var32 = (SubLObject)module0618.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        assert module0618.NIL != Types.stringp(var16) : var16;
        if (module0618.NIL != module0618.$g4743$.getDynamicValue(var33) && module0618.NIL == Filesys.probe_file(var16)) {
            if (module0618.NIL != var32) {
                Errors.warn((SubLObject)module0618.$ic32$, var16);
            }
            else {
                Errors.error((SubLObject)module0618.$ic32$, var16);
            }
            return (SubLObject)module0618.NIL;
        }
        return (SubLObject)module0618.T;
    }
    
    public static SubLObject f37920(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert module0618.NIL != Types.stringp(var28) : var28;
        if (module0618.NIL != module0618.$g4743$.getDynamicValue(var29)) {
            if (module0618.NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && module0618.NIL == Filesys.directory_p(var28)) {
                Errors.error((SubLObject)module0618.$ic33$, var28);
            }
            if (module0618.NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && module0618.NIL == module0075.f5192(var28, (SubLObject)module0618.UNPROVIDED)) {
                Errors.error((SubLObject)module0618.$ic34$, var28);
            }
            final SubLObject var30 = f37918((SubLObject)module0618.UNPROVIDED);
            if (module0618.NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && module0618.NIL == module0075.f5192(var28, var30)) {
                Errors.error((SubLObject)module0618.$ic35$, var28, var30);
            }
        }
        return (SubLObject)module0618.T;
    }
    
    public static SubLObject f37921() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4744$.getDynamicValue(var33)) {
            final SubLObject var34 = (SubLObject)module0618.$ic36$;
            final SubLObject var35 = module0012.$g73$.currentBinding(var33);
            final SubLObject var36 = module0012.$g65$.currentBinding(var33);
            final SubLObject var37 = module0012.$g67$.currentBinding(var33);
            final SubLObject var38 = module0012.$g68$.currentBinding(var33);
            final SubLObject var39 = module0012.$g66$.currentBinding(var33);
            final SubLObject var40 = module0012.$g69$.currentBinding(var33);
            final SubLObject var41 = module0012.$g70$.currentBinding(var33);
            final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var33);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var33);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var33), var33);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var33);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                module0012.$g70$.bind((SubLObject)module0618.T, var33);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var33) : module0618.T), var33);
                module0012.f474(var34);
                Storage.gc_dynamic();
                Storage.room((SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var42, var33);
                module0012.$g70$.rebind(var41, var33);
                module0012.$g69$.rebind(var40, var33);
                module0012.$g66$.rebind(var39, var33);
                module0012.$g68$.rebind(var38, var33);
                module0012.$g67$.rebind(var37, var33);
                module0012.$g65$.rebind(var36, var33);
                module0012.$g73$.rebind(var35, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37922(SubLObject var28, SubLObject var44, SubLObject var45) {
        if (var28 == module0618.UNPROVIDED) {
            var28 = (SubLObject)module0618.NIL;
        }
        if (var44 == module0618.UNPROVIDED) {
            var44 = (SubLObject)module0618.NIL;
        }
        if (var45 == module0618.UNPROVIDED) {
            var45 = (SubLObject)module0618.NIL;
        }
        f37923(var44, var45);
        return f37924(var28);
    }
    
    public static SubLObject f37924(SubLObject var28) {
        if (var28 == module0618.UNPROVIDED) {
            var28 = (SubLObject)module0618.NIL;
        }
        f37925();
        return f37926(var28);
    }
    
    public static SubLObject f37925() {
        f37927();
        module0177.f11231();
        f37928();
        f37929();
        f37930();
        module0549.f33888();
        module0322.f21839();
        module0295.f19904();
        module0730.f44629();
        f37931();
        module0287.f19238((SubLObject)module0618.T, (SubLObject)module0618.NIL);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37927() {
        module0178.f11370();
        module0569.f34940((SubLObject)module0618.UNPROVIDED);
        module0569.f34903();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37923(SubLObject var44, SubLObject var45) {
        if (var44 == module0618.UNPROVIDED) {
            var44 = (SubLObject)module0618.NIL;
        }
        if (var45 == module0618.UNPROVIDED) {
            var45 = (SubLObject)module0618.NIL;
        }
        if (module0618.NIL == var44) {
            final SubLObject var46 = f37915(module0018.f968(), (SubLObject)module0618.UNPROVIDED);
            var44 = f37916((SubLObject)module0618.$ic37$, var46, (SubLObject)module0618.UNPROVIDED);
        }
        if (module0618.NIL == var45) {
            var45 = module0572.f35051();
        }
        module0414.f28950(var44, var45);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37932(SubLObject var47, SubLObject var44, SubLObject var45) {
        if (var47 == module0618.UNPROVIDED) {
            var47 = (SubLObject)module0618.NIL;
        }
        if (var44 == module0618.UNPROVIDED) {
            var44 = (SubLObject)module0618.NIL;
        }
        if (var45 == module0618.UNPROVIDED) {
            var45 = (SubLObject)module0618.NIL;
        }
        f37923(var44, var45);
        f37933(var47);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37933(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var48);
        final SubLObject var50 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var48);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var48);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var48), var48);
            f37934(var47);
            final SubLObject var36_48 = module0021.$g777$.currentBinding(var48);
            try {
                module0021.$g777$.bind((SubLObject)module0618.NIL, var48);
                module0021.f1149(f37935());
                final SubLObject var36_49 = module0166.$g2180$.currentBinding(var48);
                final SubLObject var37_50 = module0111.$g1393$.currentBinding(var48);
                final SubLObject var51 = module0172.$g2190$.currentBinding(var48);
                final SubLObject var52 = module0111.$g1395$.currentBinding(var48);
                final SubLObject var53 = module0190.$g2246$.currentBinding(var48);
                final SubLObject var54 = module0178.$g2211$.currentBinding(var48);
                final SubLObject var55 = module0111.$g1397$.currentBinding(var48);
                final SubLObject var56 = module0188.$g2234$.currentBinding(var48);
                final SubLObject var57 = module0111.$g1399$.currentBinding(var48);
                final SubLObject var58 = module0183.$g2226$.currentBinding(var48);
                final SubLObject var59 = module0111.$g1401$.currentBinding(var48);
                final SubLObject var60 = module0192.$g2256$.currentBinding(var48);
                final SubLObject var61 = module0111.$g1403$.currentBinding(var48);
                try {
                    module0166.$g2180$.bind(module0128.f8431(), var48);
                    module0111.$g1393$.bind((SubLObject)module0618.$ic39$, var48);
                    module0172.$g2190$.bind(module0167.f10794(), var48);
                    module0111.$g1395$.bind((SubLObject)module0618.$ic40$, var48);
                    module0190.$g2246$.bind(module0190.f11889(), var48);
                    module0178.$g2211$.bind(module0174.f11017(), var48);
                    module0111.$g1397$.bind((SubLObject)module0618.$ic41$, var48);
                    module0188.$g2234$.bind(module0184.f11641(), var48);
                    module0111.$g1399$.bind((SubLObject)module0618.$ic42$, var48);
                    module0183.$g2226$.bind(module0179.f11408(), var48);
                    module0111.$g1401$.bind((SubLObject)module0618.$ic43$, var48);
                    module0192.$g2256$.bind(module0192.f12059(), var48);
                    module0111.$g1403$.bind((SubLObject)module0618.$ic44$, var48);
                    f37936(var47);
                    f37937(var47);
                }
                finally {
                    module0111.$g1403$.rebind(var61, var48);
                    module0192.$g2256$.rebind(var60, var48);
                    module0111.$g1401$.rebind(var59, var48);
                    module0183.$g2226$.rebind(var58, var48);
                    module0111.$g1399$.rebind(var57, var48);
                    module0188.$g2234$.rebind(var56, var48);
                    module0111.$g1397$.rebind(var55, var48);
                    module0178.$g2211$.rebind(var54, var48);
                    module0190.$g2246$.rebind(var53, var48);
                    module0111.$g1395$.rebind(var52, var48);
                    module0172.$g2190$.rebind(var51, var48);
                    module0111.$g1393$.rebind(var37_50, var48);
                    module0166.$g2180$.rebind(var36_49, var48);
                }
            }
            finally {
                module0021.$g777$.rebind(var36_48, var48);
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var50, var48);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var49, var48);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37938(final SubLObject var56, final SubLObject var47, final SubLObject var57) {
        f37939(var56, var47);
        return Mapper.write_image(var57, (SubLObject)module0618.UNPROVIDED);
    }
    
    public static SubLObject f37940(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f37941(var47);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue()) {
            module0107.f7594(var47, var49);
        }
        final SubLObject var50 = module0021.$g777$.currentBinding(var48);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var48);
            module0021.f1149(var49);
            final SubLObject var36_59 = module0111.$g1394$.currentBinding(var48);
            final SubLObject var51 = module0111.$g1396$.currentBinding(var48);
            final SubLObject var52 = module0111.$g1398$.currentBinding(var48);
            final SubLObject var53 = module0111.$g1400$.currentBinding(var48);
            final SubLObject var54 = module0111.$g1402$.currentBinding(var48);
            final SubLObject var55 = module0111.$g1404$.currentBinding(var48);
            try {
                module0111.$g1394$.bind((SubLObject)module0618.$ic45$, var48);
                module0111.$g1396$.bind((SubLObject)module0618.$ic46$, var48);
                module0111.$g1398$.bind((SubLObject)module0618.$ic47$, var48);
                module0111.$g1400$.bind((SubLObject)module0618.$ic48$, var48);
                module0111.$g1402$.bind((SubLObject)module0618.$ic49$, var48);
                module0111.$g1404$.bind((SubLObject)module0618.$ic50$, var48);
                f37942(var47);
            }
            finally {
                module0111.$g1404$.rebind(var55, var48);
                module0111.$g1402$.rebind(var54, var48);
                module0111.$g1400$.rebind(var53, var48);
                module0111.$g1398$.rebind(var52, var48);
                module0111.$g1396$.rebind(var51, var48);
                module0111.$g1394$.rebind(var36_59, var48);
            }
        }
        finally {
            module0021.$g777$.rebind(var50, var48);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37939(final SubLObject var56, final SubLObject var47) {
        f37940(var47);
        module0018.f970(var56);
        f37943((SubLObject)module0618.UNPROVIDED);
        return var56;
    }
    
    public static SubLObject f37944(final SubLObject var47, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = f37941(var47);
        final SubLObject var63 = module0021.$g777$.currentBinding(var61);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var61);
            module0021.f1149(var62);
            final SubLObject var36_61 = module0166.$g2180$.currentBinding(var61);
            final SubLObject var64 = module0111.$g1393$.currentBinding(var61);
            final SubLObject var65 = module0172.$g2190$.currentBinding(var61);
            final SubLObject var66 = module0111.$g1395$.currentBinding(var61);
            final SubLObject var67 = module0190.$g2246$.currentBinding(var61);
            final SubLObject var68 = module0178.$g2211$.currentBinding(var61);
            final SubLObject var69 = module0111.$g1397$.currentBinding(var61);
            final SubLObject var70 = module0188.$g2234$.currentBinding(var61);
            final SubLObject var71 = module0111.$g1399$.currentBinding(var61);
            final SubLObject var72 = module0183.$g2226$.currentBinding(var61);
            final SubLObject var73 = module0111.$g1401$.currentBinding(var61);
            final SubLObject var74 = module0192.$g2256$.currentBinding(var61);
            final SubLObject var75 = module0111.$g1403$.currentBinding(var61);
            try {
                module0166.$g2180$.bind(module0128.f8431(), var61);
                module0111.$g1393$.bind((SubLObject)module0618.$ic39$, var61);
                module0172.$g2190$.bind(module0167.f10794(), var61);
                module0111.$g1395$.bind((SubLObject)module0618.$ic40$, var61);
                module0190.$g2246$.bind(module0190.f11889(), var61);
                module0178.$g2211$.bind(module0174.f11017(), var61);
                module0111.$g1397$.bind((SubLObject)module0618.$ic41$, var61);
                module0188.$g2234$.bind(module0184.f11641(), var61);
                module0111.$g1399$.bind((SubLObject)module0618.$ic42$, var61);
                module0183.$g2226$.bind(module0179.f11408(), var61);
                module0111.$g1401$.bind((SubLObject)module0618.$ic43$, var61);
                module0192.$g2256$.bind(module0192.f12059(), var61);
                module0111.$g1403$.bind((SubLObject)module0618.$ic44$, var61);
                f37945(var60);
            }
            finally {
                module0111.$g1403$.rebind(var75, var61);
                module0192.$g2256$.rebind(var74, var61);
                module0111.$g1401$.rebind(var73, var61);
                module0183.$g2226$.rebind(var72, var61);
                module0111.$g1399$.rebind(var71, var61);
                module0188.$g2234$.rebind(var70, var61);
                module0111.$g1397$.rebind(var69, var61);
                module0178.$g2211$.rebind(var68, var61);
                module0190.$g2246$.rebind(var67, var61);
                module0111.$g1395$.rebind(var66, var61);
                module0172.$g2190$.rebind(var65, var61);
                module0111.$g1393$.rebind(var64, var61);
                module0166.$g2180$.rebind(var36_61, var61);
            }
        }
        finally {
            module0021.$g777$.rebind(var63, var61);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37946(final SubLObject var56, final SubLObject var47, SubLObject var60) {
        if (var60 == module0618.UNPROVIDED) {
            var60 = (SubLObject)module0618.NIL;
        }
        f37939(var56, var47);
        module0107.f7576((SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == var60) {
            var60 = var47;
        }
        f37944(var47, var60);
        return var56;
    }
    
    public static SubLObject f37926(SubLObject var28) {
        if (var28 == module0618.UNPROVIDED) {
            var28 = (SubLObject)module0618.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL == var28) {
            final SubLObject var30 = Numbers.add((SubLObject)module0618.ONE_INTEGER, module0018.f971());
            var28 = f37915(var30, (SubLObject)module0618.UNPROVIDED);
        }
        if (module0618.NIL == Filesys.probe_file(var28)) {
            Errors.cerror((SubLObject)module0618.$ic52$, (SubLObject)module0618.$ic33$, var28);
            module0075.f5241(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        }
        f37920(var28);
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic53$, new SubLObject[] { module0018.f971(), var28, module0051.f3552((SubLObject)module0618.UNPROVIDED) });
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        SubLObject var31 = (SubLObject)module0618.NIL;
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            if (module0018.f971().isInteger() && module0574.f35163().isInteger() && module0574.f35163().numG((SubLObject)module0618.ZERO_INTEGER)) {
                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic54$, module0574.f35163());
            }
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        final SubLObject var32 = Time.get_internal_real_time();
        f37934(var28);
        final SubLObject var33 = module0021.$g777$.currentBinding(var29);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
            module0021.f1149(f37935());
            final SubLObject var36_65 = module0166.$g2180$.currentBinding(var29);
            final SubLObject var34 = module0111.$g1393$.currentBinding(var29);
            final SubLObject var35 = module0172.$g2190$.currentBinding(var29);
            final SubLObject var36 = module0111.$g1395$.currentBinding(var29);
            final SubLObject var37 = module0190.$g2246$.currentBinding(var29);
            final SubLObject var38 = module0178.$g2211$.currentBinding(var29);
            final SubLObject var39 = module0111.$g1397$.currentBinding(var29);
            final SubLObject var40 = module0188.$g2234$.currentBinding(var29);
            final SubLObject var41 = module0111.$g1399$.currentBinding(var29);
            final SubLObject var42 = module0183.$g2226$.currentBinding(var29);
            final SubLObject var43 = module0111.$g1401$.currentBinding(var29);
            final SubLObject var44 = module0192.$g2256$.currentBinding(var29);
            final SubLObject var45 = module0111.$g1403$.currentBinding(var29);
            try {
                module0166.$g2180$.bind(module0128.f8431(), var29);
                module0111.$g1393$.bind((SubLObject)module0618.$ic39$, var29);
                module0172.$g2190$.bind(module0167.f10794(), var29);
                module0111.$g1395$.bind((SubLObject)module0618.$ic40$, var29);
                module0190.$g2246$.bind(module0190.f11889(), var29);
                module0178.$g2211$.bind(module0174.f11017(), var29);
                module0111.$g1397$.bind((SubLObject)module0618.$ic41$, var29);
                module0188.$g2234$.bind(module0184.f11641(), var29);
                module0111.$g1399$.bind((SubLObject)module0618.$ic42$, var29);
                module0183.$g2226$.bind(module0179.f11408(), var29);
                module0111.$g1401$.bind((SubLObject)module0618.$ic43$, var29);
                module0192.$g2256$.bind(module0192.f12059(), var29);
                module0111.$g1403$.bind((SubLObject)module0618.$ic44$, var29);
                f37947(var28);
                f37948(var28, (SubLObject)module0618.UNPROVIDED);
            }
            finally {
                module0111.$g1403$.rebind(var45, var29);
                module0192.$g2256$.rebind(var44, var29);
                module0111.$g1401$.rebind(var43, var29);
                module0183.$g2226$.rebind(var42, var29);
                module0111.$g1399$.rebind(var41, var29);
                module0188.$g2234$.rebind(var40, var29);
                module0111.$g1397$.rebind(var39, var29);
                module0178.$g2211$.rebind(var38, var29);
                module0190.$g2246$.rebind(var37, var29);
                module0111.$g1395$.rebind(var36, var29);
                module0172.$g2190$.rebind(var35, var29);
                module0111.$g1393$.rebind(var34, var29);
                module0166.$g2180$.rebind(var36_65, var29);
            }
        }
        finally {
            module0021.$g777$.rebind(var33, var29);
        }
        var31 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var32), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic55$, new SubLObject[] { module0018.f971(), module0051.f3664(var31), module0051.f3552((SubLObject)module0618.UNPROVIDED) });
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37949(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic56$, var28, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        SubLObject var30 = (SubLObject)module0618.NIL;
        final SubLObject var31 = module0018.$g694$.currentBinding(var29);
        try {
            module0018.$g694$.bind((SubLObject)module0618.NIL, var29);
            final SubLObject var32 = Time.get_internal_real_time();
            f37950(var28);
            f37951();
            if (module0618.NIL != f37906()) {
                module0243.f15704();
                f37921();
            }
            else {
                module0213.f13896();
                module0243.f15705(var28);
                f37921();
            }
            var30 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var32), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic57$, new SubLObject[] { module0018.f971(), module0051.f3664(var30), module0051.f3552((SubLObject)module0618.UNPROVIDED) });
                module0213.f13862(StreamsLow.$standard_output$.getDynamicValue(var29));
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
            }
        }
        finally {
            module0018.$g694$.rebind(var31, var29);
        }
        return module0018.f971();
    }
    
    public static SubLObject f37952() {
        return module0618.$g4746$.getGlobalValue();
    }
    
    public static SubLObject f37953(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0618.NIL;
        try {
            var29.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var31 = Errors.$error_handler$.currentBinding(var29);
            try {
                Errors.$error_handler$.bind((SubLObject)module0618.$ic59$, var29);
                try {
                    f37954(var28);
                }
                catch (Throwable var32) {
                    Errors.handleThrowable(var32, (SubLObject)module0618.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var31, var29);
            }
        }
        catch (Throwable var33) {
            var30 = Errors.handleThrowable(var33, module0003.$g3$.getGlobalValue());
        }
        finally {
            var29.throwStack.pop();
        }
        if (var30.isString()) {
            Errors.warn((SubLObject)module0618.$ic60$, var28);
            module0618.$g4746$.setGlobalValue((SubLObject)ConsesLow.list((SubLObject)module0618.$ic61$, (SubLObject)module0618.$ic62$));
        }
        return f37952();
    }
    
    public static SubLObject f37954(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic63$, var28, (SubLObject)module0618.NIL);
        SubLObject var31 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var32 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var31 = compatibility.open_text(var30, (SubLObject)module0618.$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var32, var29);
            }
            if (!var31.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var30);
            }
            final SubLObject var33 = var31;
            module0618.$g4746$.setGlobalValue(reader.read(var33, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
        }
        finally {
            final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var31.isStream()) {
                    streams_high.close(var31, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var34, var29);
            }
        }
        return f37952();
    }
    
    public static SubLObject f37947(final SubLObject var28) {
        f37936(var28);
        f37937(var28);
        f37955(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37950(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f37921();
        final SubLObject var30 = f37941(var28);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue()) {
            module0107.f7594(var28, var30);
            f37921();
        }
        f37953(var28);
        final SubLObject var31 = module0021.$g777$.currentBinding(var29);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
            module0021.f1149(var30);
            final SubLObject var36_73 = module0111.$g1394$.currentBinding(var29);
            final SubLObject var32 = module0111.$g1396$.currentBinding(var29);
            final SubLObject var33 = module0111.$g1398$.currentBinding(var29);
            final SubLObject var34 = module0111.$g1400$.currentBinding(var29);
            final SubLObject var35 = module0111.$g1402$.currentBinding(var29);
            final SubLObject var36 = module0111.$g1404$.currentBinding(var29);
            try {
                module0111.$g1394$.bind((SubLObject)module0618.$ic45$, var29);
                module0111.$g1396$.bind((SubLObject)module0618.$ic46$, var29);
                module0111.$g1398$.bind((SubLObject)module0618.$ic47$, var29);
                module0111.$g1400$.bind((SubLObject)module0618.$ic48$, var29);
                module0111.$g1402$.bind((SubLObject)module0618.$ic49$, var29);
                module0111.$g1404$.bind((SubLObject)module0618.$ic50$, var29);
                f37942(var28);
                f37956(var28);
            }
            finally {
                module0111.$g1404$.rebind(var36, var29);
                module0111.$g1402$.rebind(var35, var29);
                module0111.$g1400$.rebind(var34, var29);
                module0111.$g1398$.rebind(var33, var29);
                module0111.$g1396$.rebind(var32, var29);
                module0111.$g1394$.rebind(var36_73, var29);
            }
        }
        finally {
            module0021.$g777$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37936(final SubLObject var28) {
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37937(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic66$);
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        f37957(var28);
        f37958(var28);
        f37959(var28);
        f37960(var28);
        f37961(var28);
        f37962(var28);
        f37963(var28);
        f37964(var28);
        f37965(var28);
        f37966(var28, (SubLObject)module0618.UNPROVIDED);
        module0243.f15707(var28, (SubLObject)module0618.UNPROVIDED);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37942(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic67$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        final SubLObject var30 = module0012.$g64$.currentBinding(var29);
        final SubLObject var31 = module0021.$g750$.currentBinding(var29);
        try {
            module0012.$g64$.bind((SubLObject)module0618.T, var29);
            module0021.$g750$.bind((SubLObject)module0618.T, var29);
            f37967(var28);
            f37921();
            f37968(var28);
            f37921();
            f37969(var28);
            f37921();
            f37970(var28);
            f37921();
            f37971(var28);
            f37921();
            f37972(var28);
            f37921();
            f37973(var28);
            f37921();
            f37974(var28);
            f37921();
            f37975(var28);
            f37921();
            f37976(var28);
            f37921();
            f37977(var28);
            f37921();
        }
        finally {
            module0021.$g750$.rebind(var31, var29);
            module0012.$g64$.rebind(var30, var29);
        }
        f37978();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37978() {
        f37979();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37980() {
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37981() {
        module0594.f36354();
        module0222.f14644();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37945(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0176.$g2196$.getGlobalValue();
        final SubLObject var31 = module0160.f10437(var30);
        final SubLObject var32 = module0160.f10418(var30);
        try {
            module0160.f10447(var30);
            module0160.f10417(var30);
            final SubLObject var74_77 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_78 = module0160.f10437(var74_77);
            final SubLObject var76_79 = module0160.f10418(var74_77);
            try {
                module0160.f10447(var74_77);
                module0160.f10417(var74_77);
                final SubLObject var74_78 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_79 = module0160.f10437(var74_78);
                final SubLObject var76_80 = module0160.f10418(var74_78);
                try {
                    module0160.f10447(var74_78);
                    module0160.f10417(var74_78);
                    final SubLObject var74_79 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_80 = module0160.f10437(var74_79);
                    final SubLObject var76_81 = module0160.f10418(var74_79);
                    try {
                        module0160.f10447(var74_79);
                        module0160.f10417(var74_79);
                        final SubLObject var74_80 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_81 = module0160.f10437(var74_80);
                        final SubLObject var76_82 = module0160.f10418(var74_80);
                        try {
                            module0160.f10447(var74_80);
                            module0160.f10417(var74_80);
                            final SubLObject var33 = module0018.$g694$.currentBinding(var29);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var29);
                                f37955(var28);
                                f37948(var28, (SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                module0018.$g694$.rebind(var33, var29);
                            }
                        }
                        finally {
                            final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                if (module0618.NIL != var75_81) {
                                    module0160.f10446(var74_80);
                                }
                                if (module0618.NIL == var76_82) {
                                    module0160.f10414(var74_80, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var34, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (module0618.NIL != var75_80) {
                                module0160.f10446(var74_79);
                            }
                            if (module0618.NIL == var76_81) {
                                module0160.f10414(var74_79, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var35, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (module0618.NIL != var75_79) {
                            module0160.f10446(var74_78);
                        }
                        if (module0618.NIL == var76_80) {
                            module0160.f10414(var74_78, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36, var29);
                    }
                }
            }
            finally {
                final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (module0618.NIL != var75_78) {
                        module0160.f10446(var74_77);
                    }
                    if (module0618.NIL == var76_79) {
                        module0160.f10414(var74_77, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var37, var29);
                }
            }
        }
        finally {
            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (module0618.NIL != var31) {
                    module0160.f10446(var30);
                }
                if (module0618.NIL == var32) {
                    module0160.f10414(var30, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var38, var29);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37956(final SubLObject var28) {
        f37982(var28);
        f37983(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37984() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_89 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_90 = module0160.f10437(var74_89);
            final SubLObject var76_91 = module0160.f10418(var74_89);
            try {
                module0160.f10447(var74_89);
                module0160.f10417(var74_89);
                final SubLObject var74_90 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_91 = module0160.f10437(var74_90);
                final SubLObject var76_92 = module0160.f10418(var74_90);
                try {
                    module0160.f10447(var74_90);
                    module0160.f10417(var74_90);
                    final SubLObject var74_91 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_92 = module0160.f10437(var74_91);
                    final SubLObject var76_93 = module0160.f10418(var74_91);
                    try {
                        module0160.f10447(var74_91);
                        module0160.f10417(var74_91);
                        final SubLObject var74_92 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_93 = module0160.f10437(var74_92);
                        final SubLObject var76_94 = module0160.f10418(var74_92);
                        try {
                            module0160.f10447(var74_92);
                            module0160.f10417(var74_92);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                f37985();
                                f37986((SubLObject)module0618.UNPROVIDED);
                                f37987();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_93) {
                                    module0160.f10446(var74_92);
                                }
                                if (module0618.NIL == var76_94) {
                                    module0160.f10414(var74_92, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_92) {
                                module0160.f10446(var74_91);
                            }
                            if (module0618.NIL == var76_93) {
                                module0160.f10414(var74_91, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_91) {
                            module0160.f10446(var74_90);
                        }
                        if (module0618.NIL == var76_92) {
                            module0160.f10414(var74_90, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_90) {
                        module0160.f10446(var74_89);
                    }
                    if (module0618.NIL == var76_91) {
                        module0160.f10414(var74_89, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37943(SubLObject var101) {
        if (var101 == module0618.UNPROVIDED) {
            var101 = (SubLObject)module0618.NIL;
        }
        final SubLThread var102 = SubLProcess.currentSubLThread();
        final SubLObject var103 = module0176.$g2196$.getGlobalValue();
        final SubLObject var104 = module0160.f10437(var103);
        final SubLObject var105 = module0160.f10418(var103);
        try {
            module0160.f10447(var103);
            module0160.f10417(var103);
            final SubLObject var74_102 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_103 = module0160.f10437(var74_102);
            final SubLObject var76_104 = module0160.f10418(var74_102);
            try {
                module0160.f10447(var74_102);
                module0160.f10417(var74_102);
                final SubLObject var74_103 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_104 = module0160.f10437(var74_103);
                final SubLObject var76_105 = module0160.f10418(var74_103);
                try {
                    module0160.f10447(var74_103);
                    module0160.f10417(var74_103);
                    final SubLObject var74_104 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_105 = module0160.f10437(var74_104);
                    final SubLObject var76_106 = module0160.f10418(var74_104);
                    try {
                        module0160.f10447(var74_104);
                        module0160.f10417(var74_104);
                        final SubLObject var74_105 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_106 = module0160.f10437(var74_105);
                        final SubLObject var76_107 = module0160.f10418(var74_105);
                        try {
                            module0160.f10447(var74_105);
                            module0160.f10417(var74_105);
                            final SubLObject var106 = module0018.$g694$.currentBinding(var102);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var102);
                                if (module0618.NIL == var101) {
                                    f37985();
                                }
                                f37986(var101);
                            }
                            finally {
                                module0018.$g694$.rebind(var106, var102);
                            }
                        }
                        finally {
                            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                                if (module0618.NIL != var75_106) {
                                    module0160.f10446(var74_105);
                                }
                                if (module0618.NIL == var76_107) {
                                    module0160.f10414(var74_105, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var107, var102);
                            }
                        }
                    }
                    finally {
                        final SubLObject var108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                            if (module0618.NIL != var75_105) {
                                module0160.f10446(var74_104);
                            }
                            if (module0618.NIL == var76_106) {
                                module0160.f10414(var74_104, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var108, var102);
                        }
                    }
                }
                finally {
                    final SubLObject var109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                        if (module0618.NIL != var75_104) {
                            module0160.f10446(var74_103);
                        }
                        if (module0618.NIL == var76_105) {
                            module0160.f10414(var74_103, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var109, var102);
                    }
                }
            }
            finally {
                final SubLObject var110 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                    if (module0618.NIL != var75_103) {
                        module0160.f10446(var74_102);
                    }
                    if (module0618.NIL == var76_104) {
                        module0160.f10414(var74_102, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var110, var102);
                }
            }
        }
        finally {
            final SubLObject var111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                if (module0618.NIL != var104) {
                    module0160.f10446(var103);
                }
                if (module0618.NIL == var105) {
                    module0160.f10414(var103, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var111, var102);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37988() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_114 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_115 = module0160.f10437(var74_114);
            final SubLObject var76_116 = module0160.f10418(var74_114);
            try {
                module0160.f10447(var74_114);
                module0160.f10417(var74_114);
                final SubLObject var74_115 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_116 = module0160.f10437(var74_115);
                final SubLObject var76_117 = module0160.f10418(var74_115);
                try {
                    module0160.f10447(var74_115);
                    module0160.f10417(var74_115);
                    final SubLObject var74_116 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_117 = module0160.f10437(var74_116);
                    final SubLObject var76_118 = module0160.f10418(var74_116);
                    try {
                        module0160.f10447(var74_116);
                        module0160.f10417(var74_116);
                        final SubLObject var74_117 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_118 = module0160.f10437(var74_117);
                        final SubLObject var76_119 = module0160.f10418(var74_117);
                        try {
                            module0160.f10447(var74_117);
                            module0160.f10417(var74_117);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                f37985();
                                f37989((SubLObject)module0618.UNPROVIDED);
                                f37981();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_118) {
                                    module0160.f10446(var74_117);
                                }
                                if (module0618.NIL == var76_119) {
                                    module0160.f10414(var74_117, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_117) {
                                module0160.f10446(var74_116);
                            }
                            if (module0618.NIL == var76_118) {
                                module0160.f10414(var74_116, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_116) {
                            module0160.f10446(var74_115);
                        }
                        if (module0618.NIL == var76_117) {
                            module0160.f10414(var74_115, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_115) {
                        module0160.f10446(var74_114);
                    }
                    if (module0618.NIL == var76_116) {
                        module0160.f10414(var74_114, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37955(final SubLObject var28) {
        f37990(var28);
        f37991(var28);
        f37992(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37982(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic70$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        final SubLObject var30 = module0012.$g64$.currentBinding(var29);
        final SubLObject var31 = module0021.$g750$.currentBinding(var29);
        try {
            module0012.$g64$.bind((SubLObject)module0618.T, var29);
            module0021.$g750$.bind((SubLObject)module0618.T, var29);
            f37993(var28);
            f37921();
            f37994(var28);
            f37921();
            f37995(var28);
            f37921();
        }
        finally {
            module0021.$g750$.rebind(var31, var29);
            module0012.$g64$.rebind(var30, var29);
        }
        f37980();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37985() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_126 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_127 = module0160.f10437(var74_126);
            final SubLObject var76_128 = module0160.f10418(var74_126);
            try {
                module0160.f10447(var74_126);
                module0160.f10417(var74_126);
                final SubLObject var74_127 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_128 = module0160.f10437(var74_127);
                final SubLObject var76_129 = module0160.f10418(var74_127);
                try {
                    module0160.f10447(var74_127);
                    module0160.f10417(var74_127);
                    final SubLObject var74_128 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_129 = module0160.f10437(var74_128);
                    final SubLObject var76_130 = module0160.f10418(var74_128);
                    try {
                        module0160.f10447(var74_128);
                        module0160.f10417(var74_128);
                        final SubLObject var74_129 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_130 = module0160.f10437(var74_129);
                        final SubLObject var76_131 = module0160.f10418(var74_129);
                        try {
                            module0160.f10447(var74_129);
                            module0160.f10417(var74_129);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                module0177.f11231();
                                f37928();
                                f37980();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_130) {
                                    module0160.f10446(var74_129);
                                }
                                if (module0618.NIL == var76_131) {
                                    module0160.f10414(var74_129, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_129) {
                                module0160.f10446(var74_128);
                            }
                            if (module0618.NIL == var76_130) {
                                module0160.f10414(var74_128, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_128) {
                            module0160.f10446(var74_127);
                        }
                        if (module0618.NIL == var76_129) {
                            module0160.f10414(var74_127, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_127) {
                        module0160.f10446(var74_126);
                    }
                    if (module0618.NIL == var76_128) {
                        module0160.f10414(var74_126, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37948(final SubLObject var28, final SubLObject var138) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       com/cyc/cycjava/cycl/module0618.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //     4: if_acmpne       11
        //     7: getstatic       com/cyc/cycjava/cycl/module0618.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    10: astore_1        
        //    11: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLProcess.currentSubLThread:()Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;
        //    14: astore_2        
        //    15: getstatic       com/cyc/cycjava/cycl/module0618.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    18: aload_1         
        //    19: if_acmpne       27
        //    22: aload_0         
        //    23: invokestatic    com/cyc/cycjava/cycl/module0618.f37996:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    26: pop            
        //    27: aload_0         
        //    28: invokestatic    com/cyc/cycjava/cycl/module0618.f37997:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    31: pop            
        //    32: aload_0         
        //    33: invokestatic    com/cyc/cycjava/cycl/module0618.f37998:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    36: pop            
        //    37: aload_0         
        //    38: invokestatic    com/cyc/cycjava/cycl/module0618.f37999:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    41: pop            
        //    42: aload_0         
        //    43: invokestatic    com/cyc/cycjava/cycl/module0618.f38000:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    46: pop            
        //    47: aload_0         
        //    48: invokestatic    com/cyc/cycjava/cycl/module0618.f38001:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    51: pop            
        //    52: aload_0         
        //    53: invokestatic    com/cyc/cycjava/cycl/module0618.f38002:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    56: pop            
        //    57: aload_0         
        //    58: invokestatic    com/cyc/cycjava/cycl/module0618.f38003:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    61: pop            
        //    62: aload_0         
        //    63: invokestatic    com/cyc/cycjava/cycl/module0618.f38004:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    66: pop            
        //    67: aload_0         
        //    68: invokestatic    com/cyc/cycjava/cycl/module0618.f38005:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    71: pop            
        //    72: aload_0         
        //    73: invokestatic    com/cyc/cycjava/cycl/module0618.f38006:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    76: pop            
        //    77: aload_0         
        //    78: invokestatic    com/cyc/cycjava/cycl/module0730.f44633:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    81: pop            
        //    82: aload_0         
        //    83: invokestatic    com/cyc/cycjava/cycl/module0741.f45914:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    86: pop            
        //    87: getstatic       com/cyc/cycjava/cycl/module0618.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //    90: aload_1         
        //    91: if_acmpne       99
        //    94: aload_0         
        //    95: invokestatic    com/cyc/cycjava/cycl/module0618.f38007:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //    98: pop            
        //    99: getstatic       com/cyc/cycjava/cycl/module0618.$ic71$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   102: aload_0         
        //   103: getstatic       com/cyc/cycjava/cycl/module0618.$ic72$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   106: invokestatic    com/cyc/cycjava/cycl/module0618.f37916:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   109: astore_3        
        //   110: aload_3         
        //   111: astore          var140
        //   113: getstatic       com/cyc/cycjava/cycl/module0618.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   116: astore          var141
        //   118: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   121: aload_2         
        //   122: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   127: astore          var36
        //   129: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   132: getstatic       com/cyc/cycjava/cycl/module0618.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   135: aload_2         
        //   136: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   141: aload           var140
        //   143: getstatic       com/cyc/cycjava/cycl/module0618.$ic73$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   146: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/compatibility.open_text:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   149: astore          var141
        //   151: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   154: aload           var36
        //   156: aload_2         
        //   157: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   162: goto            181
        //   165: astore          7
        //   167: getstatic       com/cyc/tool/subl/jrtl/translatedCode/sublisp/stream_macros.$stream_requires_locking$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   170: aload           var36
        //   172: aload_2         
        //   173: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   178: aload           7
        //   180: athrow         
        //   181: aload           var141
        //   183: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //   188: ifne            200
        //   191: getstatic       com/cyc/cycjava/cycl/module0618.$ic65$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        //   194: aload           var140
        //   196: invokestatic    com/cyc/tool/subl/jrtl/nativeCode/subLisp/Errors.error:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   199: pop            
        //   200: aload           var141
        //   202: astore          var20_142
        //   204: getstatic       com/cyc/cycjava/cycl/module0618.$ic73$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   207: getstatic       com/cyc/cycjava/cycl/module0618.$ic64$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   210: if_acmpne       220
        //   213: aload           var20_142
        //   215: invokestatic    com/cyc/cycjava/cycl/module0075.f5283:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   218: astore          var20_142
        //   220: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   223: aload_2         
        //   224: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   229: astore          var36
        //   231: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   234: getstatic       com/cyc/cycjava/cycl/module0618.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   237: aload_2         
        //   238: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   243: aload           var20_142
        //   245: getstatic       com/cyc/cycjava/cycl/module0618.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   248: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   251: pop            
        //   252: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   255: aload           var36
        //   257: aload_2         
        //   258: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   263: goto            282
        //   266: astore          8
        //   268: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   271: aload           var36
        //   273: aload_2         
        //   274: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   279: aload           8
        //   281: athrow         
        //   282: goto            352
        //   285: astore          9
        //   287: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   290: aload_2         
        //   291: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   296: astore          var36
        //   298: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   301: getstatic       com/cyc/cycjava/cycl/module0618.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   304: aload_2         
        //   305: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   310: aload           var20_142
        //   312: getstatic       com/cyc/cycjava/cycl/module0618.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   315: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   318: pop            
        //   319: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   322: aload           var36
        //   324: aload_2         
        //   325: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   330: goto            349
        //   333: astore          11
        //   335: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   338: aload           var36
        //   340: aload_2         
        //   341: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   346: aload           11
        //   348: athrow         
        //   349: aload           9
        //   351: athrow         
        //   352: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   355: aload_2         
        //   356: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   361: astore          var36
        //   363: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   366: getstatic       com/cyc/cycjava/cycl/module0618.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   369: aload_2         
        //   370: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   375: aload           var141
        //   377: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //   382: ifeq            394
        //   385: aload           var141
        //   387: getstatic       com/cyc/cycjava/cycl/module0618.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   390: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   393: pop            
        //   394: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   397: aload           var36
        //   399: aload_2         
        //   400: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   405: goto            424
        //   408: astore          12
        //   410: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   413: aload           var36
        //   415: aload_2         
        //   416: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   421: aload           12
        //   423: athrow         
        //   424: goto            504
        //   427: astore          13
        //   429: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   432: aload_2         
        //   433: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.currentBinding:(Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   438: astore          var36
        //   440: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   443: getstatic       com/cyc/cycjava/cycl/module0618.T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        //   446: aload_2         
        //   447: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.bind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   452: aload           var141
        //   454: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject.isStream:()Z
        //   459: ifeq            471
        //   462: aload           var141
        //   464: getstatic       com/cyc/cycjava/cycl/module0618.UNPROVIDED:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   467: invokestatic    com/cyc/tool/subl/jrtl/translatedCode/sublisp/streams_high.close:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   470: pop            
        //   471: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   474: aload           var36
        //   476: aload_2         
        //   477: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   482: goto            501
        //   485: astore          15
        //   487: getstatic       com/cyc/tool/subl/jrtl/nativeCode/subLisp/Threads.$is_thread_performing_cleanupP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        //   490: aload           var36
        //   492: aload_2         
        //   493: invokeinterface com/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol.rebind:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/subLisp/SubLThread;)V
        //   498: aload           15
        //   500: athrow         
        //   501: aload           13
        //   503: athrow         
        //   504: aload           var140
        //   506: invokestatic    com/cyc/cycjava/cycl/module0618.f37914:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        //   509: pop            
        //   510: getstatic       com/cyc/cycjava/cycl/module0618.NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        //   513: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  129    151    165    181    Any
        //  165    167    165    181    Any
        //  231    252    266    282    Any
        //  266    268    266    282    Any
        //  298    319    333    335    Any
        //  333    335    333    335    Any
        //  285    287    285    287    Any
        //  363    394    408    424    Any
        //  408    410    408    424    Any
        //  118    352    427    504    Any
        //  440    471    485    501    Any
        //  485    487    485    501    Any
        //  427    429    427    504    Any
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
        //     at java.util.ArrayList$Itr.next(ArrayList.java:859)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2863)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at org.sf.feeling.decompiler.procyon.decompiler.ProcyonDecompiler.decompile(ProcyonDecompiler.java:113)
        //     at org.sf.feeling.decompiler.editor.BaseDecompilerSourceMapper.decompile(BaseDecompilerSourceMapper.java:353)
        //     at org.sf.feeling.decompiler.editor.BaseDecompilerSourceMapper.findSource(BaseDecompilerSourceMapper.java:168)
        //     at org.sf.feeling.decompiler.editor.DecompilerSourceMapper.findSource(DecompilerSourceMapper.java:72)
        //     at org.sf.feeling.decompiler.util.DecompileUtil.decompile(DecompileUtil.java:47)
        //     at org.sf.feeling.decompiler.actions.ExportSourceAction.exportPackageSources(ExportSourceAction.java:324)
        //     at org.sf.feeling.decompiler.actions.ExportSourceAction.access$0(ExportSourceAction.java:257)
        //     at org.sf.feeling.decompiler.actions.ExportSourceAction$1.run(ExportSourceAction.java:171)
        //     at org.eclipse.jface.operation.ModalContext$ModalContextThread.run(ModalContext.java:119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static SubLObject f37983(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic74$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        final SubLObject var30 = module0012.$g64$.currentBinding(var29);
        final SubLObject var31 = module0021.$g750$.currentBinding(var29);
        try {
            module0012.$g64$.bind((SubLObject)module0618.T, var29);
            module0021.$g750$.bind((SubLObject)module0618.T, var29);
            f38008(var28);
            f37921();
            f38009(var28);
            f37921();
            f38010(var28);
            f37921();
            f38011(var28);
            f37921();
            f38012(var28);
            f37921();
            f38013(var28);
            f37921();
            f38014(var28);
            f37921();
            f38015(var28);
            f37921();
            f38016(var28);
            f37921();
            f38017(var28);
            f37921();
            f37981();
            f38018(var28);
            f37921();
            module0730.f44636(var28);
            f37921();
        }
        finally {
            module0021.$g750$.rebind(var31, var29);
            module0012.$g64$.rebind(var30, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37986(SubLObject var101) {
        if (var101 == module0618.UNPROVIDED) {
            var101 = (SubLObject)module0618.NIL;
        }
        final SubLThread var102 = SubLProcess.currentSubLThread();
        final SubLObject var103 = module0176.$g2196$.getGlobalValue();
        final SubLObject var104 = module0160.f10437(var103);
        final SubLObject var105 = module0160.f10418(var103);
        try {
            module0160.f10447(var103);
            module0160.f10417(var103);
            final SubLObject var74_143 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_144 = module0160.f10437(var74_143);
            final SubLObject var76_145 = module0160.f10418(var74_143);
            try {
                module0160.f10447(var74_143);
                module0160.f10417(var74_143);
                final SubLObject var74_144 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_145 = module0160.f10437(var74_144);
                final SubLObject var76_146 = module0160.f10418(var74_144);
                try {
                    module0160.f10447(var74_144);
                    module0160.f10417(var74_144);
                    final SubLObject var74_145 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_146 = module0160.f10437(var74_145);
                    final SubLObject var76_147 = module0160.f10418(var74_145);
                    try {
                        module0160.f10447(var74_145);
                        module0160.f10417(var74_145);
                        final SubLObject var74_146 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_147 = module0160.f10437(var74_146);
                        final SubLObject var76_148 = module0160.f10418(var74_146);
                        try {
                            module0160.f10447(var74_146);
                            module0160.f10417(var74_146);
                            final SubLObject var106 = module0018.$g694$.currentBinding(var102);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var102);
                                f37989(var101);
                                f37981();
                                f38019((SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                module0018.$g694$.rebind(var106, var102);
                            }
                        }
                        finally {
                            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                                if (module0618.NIL != var75_147) {
                                    module0160.f10446(var74_146);
                                }
                                if (module0618.NIL == var76_148) {
                                    module0160.f10414(var74_146, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var107, var102);
                            }
                        }
                    }
                    finally {
                        final SubLObject var108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                            if (module0618.NIL != var75_146) {
                                module0160.f10446(var74_145);
                            }
                            if (module0618.NIL == var76_147) {
                                module0160.f10414(var74_145, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var108, var102);
                        }
                    }
                }
                finally {
                    final SubLObject var109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                        if (module0618.NIL != var75_145) {
                            module0160.f10446(var74_144);
                        }
                        if (module0618.NIL == var76_146) {
                            module0160.f10414(var74_144, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var109, var102);
                    }
                }
            }
            finally {
                final SubLObject var110 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                    if (module0618.NIL != var75_144) {
                        module0160.f10446(var74_143);
                    }
                    if (module0618.NIL == var76_145) {
                        module0160.f10414(var74_143, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var110, var102);
                }
            }
        }
        finally {
            final SubLObject var111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                if (module0618.NIL != var104) {
                    module0160.f10446(var103);
                }
                if (module0618.NIL == var105) {
                    module0160.f10414(var103, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var111, var102);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37989(SubLObject var101) {
        if (var101 == module0618.UNPROVIDED) {
            var101 = (SubLObject)module0618.NIL;
        }
        final SubLThread var102 = SubLProcess.currentSubLThread();
        final SubLObject var103 = module0176.$g2196$.getGlobalValue();
        final SubLObject var104 = module0160.f10437(var103);
        final SubLObject var105 = module0160.f10418(var103);
        try {
            module0160.f10447(var103);
            module0160.f10417(var103);
            final SubLObject var74_155 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_156 = module0160.f10437(var74_155);
            final SubLObject var76_157 = module0160.f10418(var74_155);
            try {
                module0160.f10447(var74_155);
                module0160.f10417(var74_155);
                final SubLObject var74_156 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_157 = module0160.f10437(var74_156);
                final SubLObject var76_158 = module0160.f10418(var74_156);
                try {
                    module0160.f10447(var74_156);
                    module0160.f10417(var74_156);
                    final SubLObject var74_157 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_158 = module0160.f10437(var74_157);
                    final SubLObject var76_159 = module0160.f10418(var74_157);
                    try {
                        module0160.f10447(var74_157);
                        module0160.f10417(var74_157);
                        final SubLObject var74_158 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_159 = module0160.f10437(var74_158);
                        final SubLObject var76_160 = module0160.f10418(var74_158);
                        try {
                            module0160.f10447(var74_158);
                            module0160.f10417(var74_158);
                            final SubLObject var106 = module0018.$g694$.currentBinding(var102);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var102);
                                if (module0618.NIL == var101) {
                                    module0168.f10843();
                                }
                                module0225.f14786();
                                module0222.f14659();
                                f37929();
                                module0248.f15988();
                                f37930();
                                module0549.f33888();
                                module0287.f19238((SubLObject)module0618.T, (SubLObject)module0618.NIL);
                                f38020();
                                module0306.f20727();
                                module0322.f21839();
                                if (module0618.NIL != module0131.f8536()) {
                                    module0295.f19904();
                                }
                                else {
                                    Errors.warn((SubLObject)module0618.$ic75$);
                                }
                                if (module0618.NIL != module0131.f8548()) {
                                    module0730.f44626();
                                    if (module0618.NIL == module0730.f44632()) {
                                        module0730.f44631();
                                    }
                                }
                                else {
                                    Errors.warn((SubLObject)module0618.$ic76$);
                                }
                            }
                            finally {
                                module0018.$g694$.rebind(var106, var102);
                            }
                        }
                        finally {
                            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                                if (module0618.NIL != var75_159) {
                                    module0160.f10446(var74_158);
                                }
                                if (module0618.NIL == var76_160) {
                                    module0160.f10414(var74_158, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var107, var102);
                            }
                        }
                    }
                    finally {
                        final SubLObject var108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                            if (module0618.NIL != var75_158) {
                                module0160.f10446(var74_157);
                            }
                            if (module0618.NIL == var76_159) {
                                module0160.f10414(var74_157, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var108, var102);
                        }
                    }
                }
                finally {
                    final SubLObject var109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                        if (module0618.NIL != var75_157) {
                            module0160.f10446(var74_156);
                        }
                        if (module0618.NIL == var76_158) {
                            module0160.f10414(var74_156, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var109, var102);
                    }
                }
            }
            finally {
                final SubLObject var110 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                    if (module0618.NIL != var75_156) {
                        module0160.f10446(var74_155);
                    }
                    if (module0618.NIL == var76_157) {
                        module0160.f10414(var74_155, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var110, var102);
                }
            }
        }
        finally {
            final SubLObject var111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                if (module0618.NIL != var104) {
                    module0160.f10446(var103);
                }
                if (module0618.NIL == var105) {
                    module0160.f10414(var103, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var111, var102);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38019(SubLObject var101) {
        if (var101 == module0618.UNPROVIDED) {
            var101 = (SubLObject)module0618.NIL;
        }
        final SubLThread var102 = SubLProcess.currentSubLThread();
        final SubLObject var103 = module0176.$g2196$.getGlobalValue();
        final SubLObject var104 = module0160.f10437(var103);
        final SubLObject var105 = module0160.f10418(var103);
        try {
            module0160.f10447(var103);
            module0160.f10417(var103);
            final SubLObject var74_167 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_168 = module0160.f10437(var74_167);
            final SubLObject var76_169 = module0160.f10418(var74_167);
            try {
                module0160.f10447(var74_167);
                module0160.f10417(var74_167);
                final SubLObject var74_168 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_169 = module0160.f10437(var74_168);
                final SubLObject var76_170 = module0160.f10418(var74_168);
                try {
                    module0160.f10447(var74_168);
                    module0160.f10417(var74_168);
                    final SubLObject var74_169 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_170 = module0160.f10437(var74_169);
                    final SubLObject var76_171 = module0160.f10418(var74_169);
                    try {
                        module0160.f10447(var74_169);
                        module0160.f10417(var74_169);
                        final SubLObject var74_170 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_171 = module0160.f10437(var74_170);
                        final SubLObject var76_172 = module0160.f10418(var74_170);
                        try {
                            module0160.f10447(var74_170);
                            module0160.f10417(var74_170);
                            final SubLObject var106 = module0018.$g694$.currentBinding(var102);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var102);
                                if (module0618.NIL != module0131.f8548() && module0618.NIL != module0018.f984()) {
                                    module0741.f45910();
                                }
                            }
                            finally {
                                module0018.$g694$.rebind(var106, var102);
                            }
                        }
                        finally {
                            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                                if (module0618.NIL != var75_171) {
                                    module0160.f10446(var74_170);
                                }
                                if (module0618.NIL == var76_172) {
                                    module0160.f10414(var74_170, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var107, var102);
                            }
                        }
                    }
                    finally {
                        final SubLObject var108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                            if (module0618.NIL != var75_170) {
                                module0160.f10446(var74_169);
                            }
                            if (module0618.NIL == var76_171) {
                                module0160.f10414(var74_169, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var108, var102);
                        }
                    }
                }
                finally {
                    final SubLObject var109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                        if (module0618.NIL != var75_169) {
                            module0160.f10446(var74_168);
                        }
                        if (module0618.NIL == var76_170) {
                            module0160.f10414(var74_168, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var109, var102);
                    }
                }
            }
            finally {
                final SubLObject var110 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                    if (module0618.NIL != var75_168) {
                        module0160.f10446(var74_167);
                    }
                    if (module0618.NIL == var76_169) {
                        module0160.f10414(var74_167, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var110, var102);
                }
            }
        }
        finally {
            final SubLObject var111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var102);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var102);
                if (module0618.NIL != var104) {
                    module0160.f10446(var103);
                }
                if (module0618.NIL == var105) {
                    module0160.f10414(var103, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var111, var102);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37987() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var33)) {
            module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var33), (SubLObject)module0618.$ic77$, module0051.f3552((SubLObject)module0618.UNPROVIDED), (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        }
        final SubLObject var34 = module0152.$g2102$.currentBinding(var33);
        try {
            module0152.$g2102$.bind(module0151.f9695(), var33);
            final SubLObject var35 = module0152.$g2102$.getDynamicValue(var33);
            final SubLObject var36_180 = module0034.$g879$.currentBinding(var33);
            try {
                module0034.$g879$.bind(var35, var33);
                SubLObject var36 = (SubLObject)module0618.NIL;
                if (module0618.NIL != var35 && module0618.NIL == module0034.f1842(var35)) {
                    var36 = module0034.f1869(var35);
                    final SubLObject var37 = Threads.current_process();
                    if (module0618.NIL == var36) {
                        module0034.f1873(var35, var37);
                    }
                    else if (!var36.eql(var37)) {
                        Errors.error((SubLObject)module0618.$ic78$);
                    }
                }
                try {
                    if (module0618.NIL == module0151.f9690()) {
                        module0274.f18061();
                    }
                }
                finally {
                    final SubLObject var36_181 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        final SubLObject var38 = module0139.$g1630$.getDynamicValue(var33);
                        final SubLObject var36_182 = module0139.$g1631$.currentBinding(var33);
                        final SubLObject var39 = module0139.$g1632$.currentBinding(var33);
                        final SubLObject var40 = module0139.$g1630$.currentBinding(var33);
                        try {
                            module0139.$g1631$.bind(module0139.f9015(var38, (SubLObject)module0618.TWELVE_INTEGER), var33);
                            module0139.$g1632$.bind(module0139.f9016(var38), var33);
                            module0139.$g1630$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != module0131.f8542()) {
                                module0770.f49100();
                                f37921();
                            }
                            else {
                                Errors.warn((SubLObject)module0618.$ic79$);
                            }
                        }
                        finally {
                            module0139.$g1630$.rebind(var40, var33);
                            module0139.$g1632$.rebind(var39, var33);
                            module0139.$g1631$.rebind(var36_182, var33);
                        }
                        if (module0618.NIL != var35 && module0618.NIL == var36) {
                            module0034.f1873(var35, (SubLObject)module0618.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_181, var33);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var36_180, var33);
            }
        }
        finally {
            module0152.$g2102$.rebind(var34, var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38021(final SubLObject var20) {
        return module0021.f1038(module0107.f7573(), var20);
    }
    
    public static SubLObject f38022(final SubLObject var20) {
        final SubLObject var21 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        assert module0618.NIL != Types.stringp(var21) : var21;
        return var21;
    }
    
    public static SubLObject f38023(final SubLObject var187, final SubLObject var16, final SubLObject var188, final SubLObject var189) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        assert module0618.NIL != Types.stringp(var187) : var187;
        assert module0618.NIL != Types.stringp(var16) : var16;
        assert module0618.NIL != Types.symbolp(var188) : var188;
        assert module0618.NIL != Types.stringp(var189) : var189;
        final SubLObject var191 = f37916(var16, var187, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var191, (SubLObject)module0618.T)) {
            final SubLObject var192 = var191;
            SubLObject var193 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var194 = stream_macros.$stream_requires_locking$.currentBinding(var190);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var190);
                    var193 = compatibility.open_binary(var192, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var194, var190);
                }
                if (!var193.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var192);
                }
                SubLObject var20_193 = var193;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_193 = module0075.f5283(var20_193);
                }
                try {
                    final SubLObject var195 = streams_high.file_length(var20_193);
                    f38022(var20_193);
                    final SubLObject var196 = module0012.$g73$.currentBinding(var190);
                    final SubLObject var197 = module0012.$g65$.currentBinding(var190);
                    final SubLObject var198 = module0012.$g67$.currentBinding(var190);
                    final SubLObject var199 = module0012.$g68$.currentBinding(var190);
                    final SubLObject var200 = module0012.$g66$.currentBinding(var190);
                    final SubLObject var201 = module0012.$g69$.currentBinding(var190);
                    final SubLObject var202 = module0012.$g70$.currentBinding(var190);
                    final SubLObject var203 = module0012.$silent_progressP$.currentBinding(var190);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var190);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var190), var190);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var190);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var190);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var190);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var190);
                        module0012.$g70$.bind((SubLObject)module0618.T, var190);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var189) ? module0012.$silent_progressP$.getDynamicValue(var190) : module0618.T), var190);
                        module0012.f474(var189);
                        Functions.funcall(var188, var20_193);
                        if (module0021.f1060(var20_193, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var195, compatibility.get_file_position(var20_193)), var191);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var203, var190);
                        module0012.$g70$.rebind(var202, var190);
                        module0012.$g69$.rebind(var201, var190);
                        module0012.$g66$.rebind(var200, var190);
                        module0012.$g68$.rebind(var199, var190);
                        module0012.$g67$.rebind(var198, var190);
                        module0012.$g65$.rebind(var197, var190);
                        module0012.$g73$.rebind(var196, var190);
                    }
                }
                finally {
                    final SubLObject var204 = Threads.$is_thread_performing_cleanupP$.currentBinding(var190);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var190);
                        streams_high.close(var20_193, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var204, var190);
                    }
                }
            }
            finally {
                final SubLObject var205 = Threads.$is_thread_performing_cleanupP$.currentBinding(var190);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var190);
                    if (var193.isStream()) {
                        streams_high.close(var193, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var205, var190);
                }
            }
            f37914(var192);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38024(final SubLObject var28, final SubLObject var16, final SubLObject var195) {
        final SubLThread var196 = SubLProcess.currentSubLThread();
        final SubLObject var198;
        final SubLObject var197 = var198 = f37916(var16, var28, (SubLObject)module0618.$ic72$);
        SubLObject var199 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var200 = stream_macros.$stream_requires_locking$.currentBinding(var196);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var196);
                var199 = compatibility.open_text(var198, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var200, var196);
            }
            if (!var199.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var198);
            }
            SubLObject var20_198 = var199;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_198 = module0075.f5283(var20_198);
            }
            try {
                PrintLow.format(var20_198, (SubLObject)module0618.$ic83$, var195);
            }
            finally {
                final SubLObject var201 = Threads.$is_thread_performing_cleanupP$.currentBinding(var196);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var196);
                    streams_high.close(var20_198, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var201, var196);
                }
            }
        }
        finally {
            final SubLObject var202 = Threads.$is_thread_performing_cleanupP$.currentBinding(var196);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var196);
                if (var199.isStream()) {
                    streams_high.close(var199, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var202, var196);
            }
        }
        f37914(var198);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38025(final SubLObject var28, final SubLObject var16) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0618.NIL;
        final SubLObject var31 = f37916(var16, var28, (SubLObject)module0618.$ic72$);
        if (module0618.NIL != f37919(var31, (SubLObject)module0618.T)) {
            final SubLObject var32 = var31;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_text(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_202 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_202 = module0075.f5283(var20_202);
                }
                try {
                    final SubLObject var35 = reader.read(var20_202, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                    assert module0618.NIL != module0004.f106(var35) : var35;
                    var30 = var35;
                }
                finally {
                    final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_202, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36, var29);
                    }
                }
            }
            finally {
                final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var37, var29);
                }
            }
            f37914(var32);
        }
        return var30;
    }
    
    public static SubLObject f37935() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        return module0618.$g4748$.getDynamicValue(var33);
    }
    
    public static SubLObject f37934(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = PrintLow.format((SubLObject)module0618.NIL, (SubLObject)module0618.$ic86$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
        final SubLObject var31 = module0012.$g73$.currentBinding(var29);
        final SubLObject var32 = module0012.$g65$.currentBinding(var29);
        final SubLObject var33 = module0012.$g67$.currentBinding(var29);
        final SubLObject var34 = module0012.$g68$.currentBinding(var29);
        final SubLObject var35 = module0012.$g66$.currentBinding(var29);
        final SubLObject var36 = module0012.$g69$.currentBinding(var29);
        final SubLObject var37 = module0012.$g70$.currentBinding(var29);
        final SubLObject var38 = module0012.$silent_progressP$.currentBinding(var29);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var29);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g70$.bind((SubLObject)module0618.T, var29);
            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var30) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
            module0012.f474(var30);
            final SubLObject var40;
            final SubLObject var39 = var40 = f37916((SubLObject)module0618.$ic87$, var28, (SubLObject)module0618.UNPROVIDED);
            SubLObject var41 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_205 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var41 = compatibility.open_binary(var40, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_205, var29);
                }
                if (!var41.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var40);
                }
                SubLObject var20_206 = var41;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_206 = module0075.f5283(var20_206);
                }
                try {
                    f38021(var20_206);
                    f38026(f37935(), var20_206);
                }
                finally {
                    final SubLObject var36_206 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_206, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_206, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_207 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var41.isStream()) {
                        streams_high.close(var41, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_207, var29);
                }
            }
            f37914(var40);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var38, var29);
            module0012.$g70$.rebind(var37, var29);
            module0012.$g69$.rebind(var36, var29);
            module0012.$g66$.rebind(var35, var29);
            module0012.$g68$.rebind(var34, var29);
            module0012.$g67$.rebind(var33, var29);
            module0012.$g65$.rebind(var32, var29);
            module0012.$g73$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38026(final SubLObject var58, final SubLObject var20) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0021.$g777$.currentBinding(var59);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var59);
            module0021.f1149((SubLObject)module0618.NIL);
            module0021.f1038(var58, var20);
        }
        finally {
            module0021.$g777$.rebind(var60, var59);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37941(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic87$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var31 = (SubLObject)module0618.NIL;
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var32 = (SubLObject)module0618.$ic88$;
            final SubLObject var33 = module0012.$g73$.currentBinding(var29);
            final SubLObject var34 = module0012.$g65$.currentBinding(var29);
            final SubLObject var35 = module0012.$g67$.currentBinding(var29);
            final SubLObject var36 = module0012.$g68$.currentBinding(var29);
            final SubLObject var37 = module0012.$g66$.currentBinding(var29);
            final SubLObject var38 = module0012.$g69$.currentBinding(var29);
            final SubLObject var39 = module0012.$g70$.currentBinding(var29);
            final SubLObject var40 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                final SubLObject var41 = var30;
                SubLObject var42 = (SubLObject)module0618.NIL;
                try {
                    final SubLObject var36_211 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                        var42 = compatibility.open_binary(var41, (SubLObject)module0618.$ic64$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var36_211, var29);
                    }
                    if (!var42.isStream()) {
                        Errors.error((SubLObject)module0618.$ic65$, var41);
                    }
                    SubLObject var20_212 = var42;
                    if (module0618.$ic64$ == module0618.$ic64$) {
                        var20_212 = module0075.f5283(var20_212);
                    }
                    try {
                        final SubLObject var36_212 = module0021.$g777$.currentBinding(var29);
                        try {
                            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
                            module0021.f1149((SubLObject)module0618.NIL);
                            f38022(var20_212);
                            var31 = module0021.f1060(var20_212, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            module0021.$g777$.rebind(var36_212, var29);
                        }
                    }
                    finally {
                        final SubLObject var36_213 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            streams_high.close(var20_212, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_213, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var36_214 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (var42.isStream()) {
                            streams_high.close(var42, (SubLObject)module0618.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_214, var29);
                    }
                }
                f37914(var41);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var40, var29);
                module0012.$g70$.rebind(var39, var29);
                module0012.$g69$.rebind(var38, var29);
                module0012.$g66$.rebind(var37, var29);
                module0012.$g68$.rebind(var36, var29);
                module0012.$g67$.rebind(var35, var29);
                module0012.$g65$.rebind(var34, var29);
                module0012.$g73$.rebind(var33, var29);
            }
        }
        return var31;
    }
    
    public static SubLObject f38027(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0618.NIL;
        final SubLObject var31 = module0618.$g4745$.currentBinding(var29);
        final SubLObject var32 = module0012.$silent_progressP$.currentBinding(var29);
        try {
            module0618.$g4745$.bind((SubLObject)module0618.NIL, var29);
            module0012.$silent_progressP$.bind((SubLObject)module0618.T, var29);
            var30 = f37941(var28);
        }
        finally {
            module0012.$silent_progressP$.rebind(var32, var29);
            module0618.$g4745$.rebind(var31, var29);
        }
        return var30;
    }
    
    public static SubLObject f37967(final SubLObject var28) {
        final SubLObject var29 = f38028(var28);
        final SubLObject var30 = f38029(var28);
        final SubLObject var31 = f38030(var28);
        final SubLObject var32 = f38031(var28);
        final SubLObject var33 = f38032(var28);
        final SubLObject var34 = f38033(var28);
        final SubLObject var35 = f38034(var28);
        assert module0618.NIL != Types.integerp(var29) : var29;
        if (module0618.NIL != var30 && module0618.NIL != var31 && module0618.NIL != var32 && module0618.NIL != var33 && module0618.NIL != var34 && module0618.NIL != var35) {
            module0213.f13882((SubLObject)module0618.T, var29, var30, var31, var32, var33, var34, var35);
            module0213.f13890();
        }
        else {
            module0213.f13889(var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38035(final SubLObject var28) {
        final SubLObject var29 = f38028(var28);
        return var29;
    }
    
    public static SubLObject f37957(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f38024(var28, (SubLObject)module0618.$ic90$, module0128.f8433());
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic91$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_224 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_224 = module0075.f5283(var20_224);
            }
            try {
                f38021(var20_224);
                module0021.f1038(module0128.f8433(), var20_224);
                final SubLObject var34 = module0128.f8425();
                final SubLObject var35 = (SubLObject)module0618.$ic92$;
                final SubLObject var36 = module0065.f4733(var34);
                SubLObject var37 = (SubLObject)module0618.ZERO_INTEGER;
                assert module0618.NIL != Types.stringp(var35) : var35;
                final SubLObject var38 = module0012.$g75$.currentBinding(var29);
                final SubLObject var39 = module0012.$g76$.currentBinding(var29);
                final SubLObject var40 = module0012.$g77$.currentBinding(var29);
                final SubLObject var41 = module0012.$g78$.currentBinding(var29);
                try {
                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                    module0012.$g77$.bind((SubLObject)module0618.T, var29);
                    module0012.$g78$.bind(Time.get_universal_time(), var29);
                    module0012.f478(var35);
                    final SubLObject var229_230 = var34;
                    if (module0618.NIL == module0065.f4772(var229_230, (SubLObject)module0618.$ic93$)) {
                        final SubLObject var231_232 = var229_230;
                        if (module0618.NIL == module0065.f4775(var231_232, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var42 = module0065.f4740(var231_232);
                            final SubLObject var43 = (SubLObject)module0618.NIL;
                            SubLObject var44;
                            SubLObject var45;
                            SubLObject var46;
                            SubLObject var47;
                            for (var44 = Sequences.length(var42), var45 = (SubLObject)module0618.NIL, var45 = (SubLObject)module0618.ZERO_INTEGER; var45.numL(var44); var45 = Numbers.add(var45, (SubLObject)module0618.ONE_INTEGER)) {
                                var46 = ((module0618.NIL != var43) ? Numbers.subtract(var44, var45, (SubLObject)module0618.ONE_INTEGER) : var45);
                                var47 = Vectors.aref(var42, var46);
                                if (module0618.NIL == module0065.f4749(var47) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    if (module0618.NIL != module0065.f4749(var47)) {
                                        var47 = (SubLObject)module0618.$ic93$;
                                    }
                                    module0012.note_percent_progress(var37, var36);
                                    var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                                    f38036(var47, var20_224);
                                }
                            }
                        }
                        final SubLObject var239_240 = var229_230;
                        if (module0618.NIL == module0065.f4777(var239_240) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                            final SubLObject var48 = module0065.f4738(var239_240);
                            SubLObject var49 = module0065.f4739(var239_240);
                            final SubLObject var50 = module0065.f4734(var239_240);
                            final SubLObject var51 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                            while (var49.numL(var50)) {
                                final SubLObject var52 = Hashtables.gethash_without_values(var49, var48, var51);
                                if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var52)) {
                                    module0012.note_percent_progress(var37, var36);
                                    var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                                    f38036(var52, var20_224);
                                }
                                var49 = Numbers.add(var49, (SubLObject)module0618.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var41, var29);
                    module0012.$g77$.rebind(var40, var29);
                    module0012.$g76$.rebind(var39, var29);
                    module0012.$g75$.rebind(var38, var29);
                }
            }
            finally {
                final SubLObject var53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_224, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var53, var29);
                }
            }
        }
        finally {
            final SubLObject var54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var54, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38028(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f38025(var28, (SubLObject)module0618.$ic90$);
        if (module0618.NIL != var30) {
            return Values.values(var30, (SubLObject)module0618.T);
        }
        SubLObject var31 = (SubLObject)module0618.NIL;
        final SubLObject var32 = f37916((SubLObject)module0618.$ic91$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var32, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var33 = var32;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var35 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var35, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_246 = var34;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_246 = module0075.f5283(var20_246);
                }
                try {
                    f38022(var20_246);
                    final SubLObject var36 = var31 = module0021.f1060(var20_246, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_246, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var37, var29);
                    }
                }
            }
            finally {
                final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38, var29);
                }
            }
            f37914(var33);
        }
        return Values.values(var31, (SubLObject)module0618.NIL);
    }
    
    public static SubLObject f37968(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic91$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_248 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_248 = module0075.f5283(var20_248);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_248);
                    f38022(var20_248);
                    final SubLObject var35 = module0021.f1060(var20_248, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                    final SubLObject var36 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic94$);
                        SubLObject var40;
                        for (var40 = (SubLObject)module0618.NIL, var40 = module0021.f1060(var20_248, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var40 != module0618.$ic81$; var40 = module0021.f1060(var20_248, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_248), var34);
                            if (var40.isInteger()) {
                                f38037(var40, var20_248);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var39, var29);
                        module0012.$g77$.rebind(var38, var29);
                        module0012.$g76$.rebind(var37, var29);
                        module0012.$g75$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_248, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                    }
                }
            }
            finally {
                final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                }
            }
            f37914(var31);
        }
        var29.resetMultipleValues();
        SubLObject var43 = f38028(var28);
        final SubLObject var44 = var29.secondMultipleValue();
        var29.resetMultipleValues();
        if (module0618.NIL == var44) {
            var43 = (SubLObject)module0618.NIL;
        }
        module0128.f8488(var43);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38038(final SubLObject var28, final SubLObject var251) {
        final SubLThread var252 = SubLProcess.currentSubLThread();
        final SubLObject var253 = f37916((SubLObject)module0618.$ic91$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var254 = (SubLObject)module0618.MINUS_ONE_INTEGER;
        SubLObject var255 = (SubLObject)module0618.NIL;
        SubLObject var256 = (SubLObject)module0618.NIL;
        if (module0618.NIL != f37919(var253, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var257 = var253;
            SubLObject var258 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var259 = stream_macros.$stream_requires_locking$.currentBinding(var252);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var252);
                    var258 = compatibility.open_binary(var257, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var259, var252);
                }
                if (!var258.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var257);
                }
                SubLObject var20_255 = var258;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_255 = module0075.f5283(var20_255);
                }
                try {
                    final SubLObject var260 = streams_high.file_length(var20_255);
                    if (module0618.NIL == Errors.$ignore_mustsP$.getDynamicValue(var252) && !var251.numL(var260)) {
                        Errors.error((SubLObject)module0618.$ic95$, var251, var253, var260);
                    }
                    f38022(var20_255);
                    final SubLObject var261 = module0021.f1060(var20_255, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                    final SubLObject var262 = compatibility.get_file_position(var20_255);
                    if (var251.numL(var262)) {
                        Errors.error((SubLObject)module0618.$ic96$, var251, var262);
                    }
                    SubLObject var263;
                    for (var263 = (SubLObject)module0618.NIL, var263 = module0021.f1060(var20_255, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var263 != module0618.$ic81$ && module0618.NIL == module0004.f106(var254); var263 = module0021.f1060(var20_255, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                        var255 = module0021.f1060(var20_255, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        var256 = module0021.f1060(var20_255, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        if (var251.numL(compatibility.get_file_position(var20_255))) {
                            var254 = var263;
                        }
                    }
                }
                finally {
                    final SubLObject var264 = Threads.$is_thread_performing_cleanupP$.currentBinding(var252);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var252);
                        streams_high.close(var20_255, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var264, var252);
                    }
                }
            }
            finally {
                final SubLObject var265 = Threads.$is_thread_performing_cleanupP$.currentBinding(var252);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var252);
                    if (var258.isStream()) {
                        streams_high.close(var258, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var265, var252);
                }
            }
            f37914(var257);
        }
        if (module0618.NIL != module0004.f106(var254)) {
            Errors.warn((SubLObject)module0618.$ic97$, new SubLObject[] { var251, var255, var254, var256 });
            return var254;
        }
        Errors.error((SubLObject)module0618.$ic98$, var251);
        return (SubLObject)module0618.MINUS_ONE_INTEGER;
    }
    
    public static SubLObject f38036(final SubLObject var238, final SubLObject var20) {
        final SubLObject var239 = module0166.f10780(var238);
        final SubLObject var240 = module0166.f10743(var238);
        final SubLObject var241 = module0166.f10744(var238);
        f38039(var20, var239, var240, var241);
        return var238;
    }
    
    public static SubLObject f38039(final SubLObject var20, final SubLObject var249, final SubLObject var29, final SubLObject var253) {
        module0021.f1038(var249, var20);
        module0021.f1038(var29, var20);
        module0021.f1038(var253, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38037(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var251 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        return f38040(var249, var250, var251);
    }
    
    public static SubLObject f38040(final SubLObject var249, final SubLObject var29, final SubLObject var253) {
        final SubLObject var254 = module0128.f8477(var29, (SubLObject)module0618.T);
        module0165.f10729(var254, var249, var253);
        return var254;
    }
    
    public static SubLObject f38041(final SubLObject var257) {
        final SubLThread var258 = SubLProcess.currentSubLThread();
        assert module0618.NIL != Types.stringp(var257) : var257;
        final SubLObject var260;
        final SubLObject var259 = var260 = f37916((SubLObject)module0618.$ic91$, var257, (SubLObject)module0618.$ic72$);
        SubLObject var261 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var262 = stream_macros.$stream_requires_locking$.currentBinding(var258);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var258);
                var261 = compatibility.open_text(var260, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var262, var258);
            }
            if (!var261.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var260);
            }
            SubLObject var20_259 = var261;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_259 = module0075.f5283(var20_259);
            }
            try {
                streams_high.write_char((SubLObject)Characters.CHAR_space, var20_259);
                print_high.prin1(module0107.f7573(), var20_259);
                streams_high.terpri(var20_259);
                streams_high.write_char((SubLObject)Characters.CHAR_space, var20_259);
                print_high.prin1(module0128.f8433(), var20_259);
                streams_high.terpri(var20_259);
                final SubLObject var263 = module0128.f8425();
                final SubLObject var264 = (SubLObject)module0618.$ic92$;
                final SubLObject var265 = module0065.f4733(var263);
                SubLObject var266 = (SubLObject)module0618.ZERO_INTEGER;
                assert module0618.NIL != Types.stringp(var264) : var264;
                final SubLObject var267 = module0012.$g75$.currentBinding(var258);
                final SubLObject var268 = module0012.$g76$.currentBinding(var258);
                final SubLObject var269 = module0012.$g77$.currentBinding(var258);
                final SubLObject var270 = module0012.$g78$.currentBinding(var258);
                try {
                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var258);
                    module0012.$g76$.bind((SubLObject)module0618.NIL, var258);
                    module0012.$g77$.bind((SubLObject)module0618.T, var258);
                    module0012.$g78$.bind(Time.get_universal_time(), var258);
                    module0012.f478(var264);
                    final SubLObject var229_260 = var263;
                    if (module0618.NIL == module0065.f4772(var229_260, (SubLObject)module0618.$ic93$)) {
                        final SubLObject var231_261 = var229_260;
                        if (module0618.NIL == module0065.f4775(var231_261, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var271 = module0065.f4740(var231_261);
                            final SubLObject var272 = (SubLObject)module0618.NIL;
                            SubLObject var273;
                            SubLObject var274;
                            SubLObject var275;
                            SubLObject var276;
                            SubLObject var277;
                            for (var273 = Sequences.length(var271), var274 = (SubLObject)module0618.NIL, var274 = (SubLObject)module0618.ZERO_INTEGER; var274.numL(var273); var274 = Numbers.add(var274, (SubLObject)module0618.ONE_INTEGER)) {
                                var275 = ((module0618.NIL != var272) ? Numbers.subtract(var273, var274, (SubLObject)module0618.ONE_INTEGER) : var274);
                                var276 = Vectors.aref(var271, var275);
                                if (module0618.NIL == module0065.f4749(var276) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    if (module0618.NIL != module0065.f4749(var276)) {
                                        var276 = (SubLObject)module0618.$ic93$;
                                    }
                                    module0012.note_percent_progress(var266, var265);
                                    var266 = Numbers.add(var266, (SubLObject)module0618.ONE_INTEGER);
                                    var277 = module0166.f10743(var276);
                                    if (var277.isString()) {
                                        print_high.prin1(var277, var20_259);
                                        streams_high.write_char((SubLObject)Characters.CHAR_space, var20_259);
                                    }
                                    print_high.prin1(module0166.f10780(var276), var20_259);
                                    streams_high.terpri(var20_259);
                                }
                            }
                        }
                        final SubLObject var239_262 = var229_260;
                        if (module0618.NIL == module0065.f4777(var239_262) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                            final SubLObject var278 = module0065.f4738(var239_262);
                            SubLObject var279 = module0065.f4739(var239_262);
                            final SubLObject var280 = module0065.f4734(var239_262);
                            final SubLObject var281 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                            while (var279.numL(var280)) {
                                final SubLObject var282 = Hashtables.gethash_without_values(var279, var278, var281);
                                if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var282)) {
                                    module0012.note_percent_progress(var266, var265);
                                    var266 = Numbers.add(var266, (SubLObject)module0618.ONE_INTEGER);
                                    final SubLObject var283 = module0166.f10743(var282);
                                    if (var283.isString()) {
                                        print_high.prin1(var283, var20_259);
                                        streams_high.write_char((SubLObject)Characters.CHAR_space, var20_259);
                                    }
                                    print_high.prin1(module0166.f10780(var282), var20_259);
                                    streams_high.terpri(var20_259);
                                }
                                var279 = Numbers.add(var279, (SubLObject)module0618.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var270, var258);
                    module0012.$g77$.rebind(var269, var258);
                    module0012.$g76$.rebind(var268, var258);
                    module0012.$g75$.rebind(var267, var258);
                }
            }
            finally {
                final SubLObject var284 = Threads.$is_thread_performing_cleanupP$.currentBinding(var258);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var258);
                    streams_high.close(var20_259, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var284, var258);
                }
            }
        }
        finally {
            final SubLObject var285 = Threads.$is_thread_performing_cleanupP$.currentBinding(var258);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var258);
                if (var261.isStream()) {
                    streams_high.close(var261, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var285, var258);
            }
        }
        f37914(var260);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38042(final SubLObject var28) {
        final SubLObject var29 = f38029(var28);
        return var29;
    }
    
    public static SubLObject f37958(final SubLObject var28) {
        return f38024(var28, (SubLObject)module0618.$ic99$, module0167.f10796());
    }
    
    public static SubLObject f37969(final SubLObject var28) {
        final SubLObject var29 = f38029(var28);
        if (module0618.NIL != var29) {
            f38043(var29);
        }
        else {
            f38044(var28);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38029(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic99$);
    }
    
    public static SubLObject f38043(final SubLObject var217) {
        SubLObject var218;
        for (var218 = (SubLObject)module0618.NIL, var218 = (SubLObject)module0618.ZERO_INTEGER; var218.numL(var217); var218 = Numbers.add(var218, (SubLObject)module0618.ONE_INTEGER)) {
            module0167.f10828(var218);
        }
        return module0167.f10790(var217);
    }
    
    public static SubLObject f38044(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic100$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_264 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_264 = module0075.f5283(var20_264);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_264);
                    f38022(var20_264);
                    final SubLObject var35 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic101$);
                        SubLObject var39;
                        for (var39 = (SubLObject)module0618.NIL, var39 = module0021.f1060(var20_264, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var39 != module0618.$ic81$; var39 = module0021.f1060(var20_264, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_264), var34);
                            if (var39.isInteger()) {
                                f38045(var39, var20_264);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var38, var29);
                        module0012.$g77$.rebind(var37, var29);
                        module0012.$g76$.rebind(var36, var29);
                        module0012.$g75$.rebind(var35, var29);
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_264, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var29);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                }
            }
            f37914(var31);
        }
        module0167.f10790((SubLObject)module0618.UNPROVIDED);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38046(final SubLObject var265, final SubLObject var20) {
        module0021.f1038(module0172.f10937(var265), var20);
        return var265;
    }
    
    public static SubLObject f38045(final SubLObject var249, final SubLObject var20) {
        return module0167.f10828(var249);
    }
    
    public static SubLObject f38047(final SubLObject var28) {
        final SubLObject var29 = f38030(var28);
        return var29;
    }
    
    public static SubLObject f37959(final SubLObject var28) {
        return f38024(var28, (SubLObject)module0618.$ic102$, module0174.f11019());
    }
    
    public static SubLObject f37970(final SubLObject var28) {
        final SubLObject var29 = f38030(var28);
        if (module0618.NIL != var29) {
            f38048(var29);
        }
        else {
            f38049(var28);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38030(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic102$);
    }
    
    public static SubLObject f38048(final SubLObject var31) {
        SubLObject var32;
        for (var32 = (SubLObject)module0618.NIL, var32 = (SubLObject)module0618.ZERO_INTEGER; var32.numL(var31); var32 = Numbers.add(var32, (SubLObject)module0618.ONE_INTEGER)) {
            module0174.f11049(var32);
        }
        module0174.f11012(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38049(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic103$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_267 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_267 = module0075.f5283(var20_267);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_267);
                    f38022(var20_267);
                    final SubLObject var35 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic104$);
                        SubLObject var39;
                        for (var39 = (SubLObject)module0618.NIL, var39 = module0021.f1060(var20_267, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var39 != module0618.$ic81$; var39 = module0021.f1060(var20_267, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_267), var34);
                            if (var39.isInteger()) {
                                f38050(var39, var20_267);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var38, var29);
                        module0012.$g77$.rebind(var37, var29);
                        module0012.$g76$.rebind(var36, var29);
                        module0012.$g75$.rebind(var35, var29);
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_267, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var29);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                }
            }
            f37914(var31);
        }
        module0174.f11012((SubLObject)module0618.UNPROVIDED);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38051(final SubLObject var268, final SubLObject var20) {
        module0021.f1038(module0178.f11391(var268), var20);
        return var268;
    }
    
    public static SubLObject f38050(final SubLObject var249, final SubLObject var20) {
        return module0174.f11049(var249);
    }
    
    public static SubLObject f38052(final SubLObject var28) {
        final SubLObject var29 = f38032(var28);
        return var29;
    }
    
    public static SubLObject f37960(final SubLObject var28) {
        return f38024(var28, (SubLObject)module0618.$ic105$, module0179.f11409());
    }
    
    public static SubLObject f37971(final SubLObject var28) {
        final SubLObject var29 = f38032(var28);
        if (module0618.NIL != var29) {
            f38053(var29);
        }
        else {
            f38054(var28);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38032(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic105$);
    }
    
    public static SubLObject f38053(final SubLObject var219) {
        SubLObject var220;
        for (var220 = (SubLObject)module0618.NIL, var220 = (SubLObject)module0618.ZERO_INTEGER; var220.numL(var219); var220 = Numbers.add(var220, (SubLObject)module0618.ONE_INTEGER)) {
            module0179.f11439(var220);
        }
        return module0179.f11404(var219);
    }
    
    public static SubLObject f38054(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic106$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_270 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_270 = module0075.f5283(var20_270);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_270);
                    f38022(var20_270);
                    final SubLObject var35 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic107$);
                        SubLObject var39;
                        for (var39 = (SubLObject)module0618.NIL, var39 = module0021.f1060(var20_270, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var39 != module0618.$ic81$; var39 = module0021.f1060(var20_270, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_270), var34);
                            if (var39.isInteger()) {
                                f38055(var39, var20_270);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var38, var29);
                        module0012.$g77$.rebind(var37, var29);
                        module0012.$g76$.rebind(var36, var29);
                        module0012.$g75$.rebind(var35, var29);
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_270, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var29);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                }
            }
            f37914(var31);
        }
        module0179.f11404((SubLObject)module0618.UNPROVIDED);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38056(final SubLObject var271, final SubLObject var20) {
        module0021.f1038(module0183.f11581(var271), var20);
        return var271;
    }
    
    public static SubLObject f38055(final SubLObject var249, final SubLObject var20) {
        return module0179.f11439(var249);
    }
    
    public static SubLObject f38057(final SubLObject var28) {
        final SubLObject var29 = f38034(var28);
        return var29;
    }
    
    public static SubLObject f37990(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f38024(var28, (SubLObject)module0618.$ic108$, module0190.f11858());
        final SubLObject var30 = f37916((SubLObject)module0618.$ic109$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var32 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_274 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_274, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_275 = var34;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_275 = module0075.f5283(var20_275);
                }
                try {
                    f38021(var20_275);
                    if (module0618.NIL != module0190.f11841()) {
                        SubLObject var35 = Sequences.cconcatenate((SubLObject)module0618.$ic110$, (SubLObject)module0618.$ic111$);
                        final SubLObject var36 = module0190.$g2240$.getGlobalValue();
                        SubLObject var37 = (SubLObject)module0618.NIL;
                        try {
                            var37 = Locks.seize_lock(var36);
                            final SubLObject var38 = module0190.f11842();
                            module0012.$g82$.setDynamicValue(var35, var29);
                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var29);
                            module0012.$g83$.setDynamicValue(module0093.f6612(var38), var29);
                            module0012.$g84$.setDynamicValue((SubLObject)module0618.ZERO_INTEGER, var29);
                            final SubLObject var36_275 = module0012.$g75$.currentBinding(var29);
                            final SubLObject var37_281 = module0012.$g76$.currentBinding(var29);
                            final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                            final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                            try {
                                module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                module0012.$g78$.bind(Time.get_universal_time(), var29);
                                module0012.f478(module0012.$g82$.getDynamicValue(var29));
                                SubLObject var41 = (SubLObject)module0618.NIL;
                                SubLObject var45;
                                for (SubLObject var42 = (SubLObject)module0618.NIL; module0618.NIL == var42; var42 = Types.sublisp_null(var45)) {
                                    var29.resetMultipleValues();
                                    final SubLObject var43 = module0093.f6632(var38, var41, (SubLObject)module0618.NIL);
                                    final SubLObject var44 = var29.secondMultipleValue();
                                    var45 = var29.thirdMultipleValue();
                                    var29.resetMultipleValues();
                                    if (module0618.NIL != var45) {
                                        final SubLObject var46 = var43;
                                        final SubLObject var47 = var44;
                                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var29), module0012.$g83$.getDynamicValue(var29));
                                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var29), (SubLObject)module0618.ONE_INTEGER), var29);
                                        if (module0618.NIL == module0190.f11843(var46) && module0618.NIL != module0190.f11844(var46)) {
                                            final SubLObject var48 = module0190.f11845(var46);
                                            f38058(var47, var20_275);
                                        }
                                    }
                                    var41 = var45;
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var40, var29);
                                module0012.$g77$.rebind(var39, var29);
                                module0012.$g76$.rebind(var37_281, var29);
                                module0012.$g75$.rebind(var36_275, var29);
                            }
                        }
                        finally {
                            if (module0618.NIL != var37) {
                                Locks.release_lock(var36);
                            }
                        }
                        var35 = Sequences.cconcatenate((SubLObject)module0618.$ic110$, (SubLObject)module0618.$ic112$);
                        if (module0618.NIL != module0190.f11841()) {
                            final SubLObject var49 = module0190.f11847();
                            module0012.$g82$.setDynamicValue(var35, var29);
                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var29);
                            module0012.$g83$.setDynamicValue(Sequences.length(var49), var29);
                            module0012.$g84$.setDynamicValue((SubLObject)module0618.ZERO_INTEGER, var29);
                            final SubLObject var36_276 = module0012.$g75$.currentBinding(var29);
                            final SubLObject var37_282 = module0012.$g76$.currentBinding(var29);
                            final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                            final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                            try {
                                module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                module0012.$g78$.bind(Time.get_universal_time(), var29);
                                module0012.f478(module0012.$g82$.getDynamicValue(var29));
                                SubLObject var50 = var49;
                                SubLObject var51 = (SubLObject)module0618.NIL;
                                var51 = var50.first();
                                while (module0618.NIL != var50) {
                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var29), module0012.$g83$.getDynamicValue(var29));
                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var29), (SubLObject)module0618.ONE_INTEGER), var29);
                                    final SubLObject var52 = module0190.f11845(var51);
                                    final SubLObject var53 = module0190.f11848(var52);
                                    f38058(var53, var20_275);
                                    var50 = var50.rest();
                                    var51 = var50.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var40, var29);
                                module0012.$g77$.rebind(var39, var29);
                                module0012.$g76$.rebind(var37_282, var29);
                                module0012.$g75$.rebind(var36_276, var29);
                            }
                        }
                        else {
                            final SubLObject var54 = module0190.f11849();
                            final SubLObject var55 = var35;
                            final SubLObject var56 = module0065.f4737(var54);
                            SubLObject var57 = (SubLObject)module0618.ZERO_INTEGER;
                            assert module0618.NIL != Types.stringp(var55) : var55;
                            final SubLObject var36_277 = module0012.$g75$.currentBinding(var29);
                            final SubLObject var37_283 = module0012.$g76$.currentBinding(var29);
                            final SubLObject var58 = module0012.$g77$.currentBinding(var29);
                            final SubLObject var59 = module0012.$g78$.currentBinding(var29);
                            try {
                                module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                module0012.$g78$.bind(Time.get_universal_time(), var29);
                                module0012.f478(var55);
                                final SubLObject var239_301 = var54;
                                if (module0618.NIL == module0065.f4777(var239_301) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    final SubLObject var60 = module0065.f4738(var239_301);
                                    SubLObject var61 = module0065.f4739(var239_301);
                                    final SubLObject var62 = module0065.f4734(var239_301);
                                    final SubLObject var63 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                    while (var61.numL(var62)) {
                                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var64)) {
                                            module0012.note_percent_progress(var57, var56);
                                            var57 = Numbers.add(var57, (SubLObject)module0618.ONE_INTEGER);
                                            f38058(var64, var20_275);
                                        }
                                        var61 = Numbers.add(var61, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var59, var29);
                                module0012.$g77$.rebind(var58, var29);
                                module0012.$g76$.rebind(var37_283, var29);
                                module0012.$g75$.rebind(var36_277, var29);
                            }
                        }
                    }
                    else {
                        final SubLObject var65 = module0190.f11849();
                        final SubLObject var66 = (SubLObject)module0618.$ic110$;
                        final SubLObject var67 = module0065.f4733(var65);
                        SubLObject var68 = (SubLObject)module0618.ZERO_INTEGER;
                        assert module0618.NIL != Types.stringp(var66) : var66;
                        final SubLObject var36_278 = module0012.$g75$.currentBinding(var29);
                        final SubLObject var37_284 = module0012.$g76$.currentBinding(var29);
                        final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                        final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                        try {
                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                            module0012.$g77$.bind((SubLObject)module0618.T, var29);
                            module0012.$g78$.bind(Time.get_universal_time(), var29);
                            module0012.f478(var66);
                            final SubLObject var229_304 = var65;
                            if (module0618.NIL == module0065.f4772(var229_304, (SubLObject)module0618.$ic93$)) {
                                final SubLObject var231_305 = var229_304;
                                if (module0618.NIL == module0065.f4775(var231_305, (SubLObject)module0618.$ic93$)) {
                                    final SubLObject var69 = module0065.f4740(var231_305);
                                    final SubLObject var70 = (SubLObject)module0618.NIL;
                                    SubLObject var71;
                                    SubLObject var72;
                                    SubLObject var73;
                                    SubLObject var74;
                                    for (var71 = Sequences.length(var69), var72 = (SubLObject)module0618.NIL, var72 = (SubLObject)module0618.ZERO_INTEGER; var72.numL(var71); var72 = Numbers.add(var72, (SubLObject)module0618.ONE_INTEGER)) {
                                        var73 = ((module0618.NIL != var70) ? Numbers.subtract(var71, var72, (SubLObject)module0618.ONE_INTEGER) : var72);
                                        var74 = Vectors.aref(var69, var73);
                                        if (module0618.NIL == module0065.f4749(var74) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                            if (module0618.NIL != module0065.f4749(var74)) {
                                                var74 = (SubLObject)module0618.$ic93$;
                                            }
                                            module0012.note_percent_progress(var68, var67);
                                            var68 = Numbers.add(var68, (SubLObject)module0618.ONE_INTEGER);
                                            f38058(var74, var20_275);
                                        }
                                    }
                                }
                                final SubLObject var239_302 = var229_304;
                                if (module0618.NIL == module0065.f4777(var239_302) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    final SubLObject var75 = module0065.f4738(var239_302);
                                    SubLObject var76 = module0065.f4739(var239_302);
                                    final SubLObject var77 = module0065.f4734(var239_302);
                                    final SubLObject var78 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                    while (var76.numL(var77)) {
                                        final SubLObject var47 = Hashtables.gethash_without_values(var76, var75, var78);
                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var47)) {
                                            module0012.note_percent_progress(var68, var67);
                                            var68 = Numbers.add(var68, (SubLObject)module0618.ONE_INTEGER);
                                            f38058(var47, var20_275);
                                        }
                                        var76 = Numbers.add(var76, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var40, var29);
                            module0012.$g77$.rebind(var39, var29);
                            module0012.$g76$.rebind(var37_284, var29);
                            module0012.$g75$.rebind(var36_278, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var36_279 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_275, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_279, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_280 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_280, var29);
                }
            }
            f37914(var33);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var32, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37993(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0190.f11841() && module0618.NIL != Filesys.probe_file(f37917((SubLObject)module0618.$ic109$, var28, (SubLObject)module0618.UNPROVIDED))) {
            final SubLObject var30 = (SubLObject)module0618.$ic113$;
            final SubLObject var31 = module0012.$g73$.currentBinding(var29);
            final SubLObject var32 = module0012.$g65$.currentBinding(var29);
            final SubLObject var33 = module0012.$g67$.currentBinding(var29);
            final SubLObject var34 = module0012.$g68$.currentBinding(var29);
            final SubLObject var35 = module0012.$g66$.currentBinding(var29);
            final SubLObject var36 = module0012.$g69$.currentBinding(var29);
            final SubLObject var37 = module0012.$g70$.currentBinding(var29);
            final SubLObject var38 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var30) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var30);
                module0190.f11901(f37917((SubLObject)module0618.$ic109$, var28, (SubLObject)module0618.UNPROVIDED));
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var38, var29);
                module0012.$g70$.rebind(var37, var29);
                module0012.$g69$.rebind(var36, var29);
                module0012.$g66$.rebind(var35, var29);
                module0012.$g68$.rebind(var34, var29);
                module0012.$g67$.rebind(var33, var29);
                module0012.$g65$.rebind(var32, var29);
                module0012.$g73$.rebind(var31, var29);
            }
        }
        else {
            if (module0618.NIL != module0190.f11841()) {
                Errors.warn((SubLObject)module0618.$ic114$, f37917((SubLObject)module0618.$ic109$, var28, (SubLObject)module0618.UNPROVIDED));
            }
            final SubLObject var39 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
            final SubLObject var40 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
            try {
                StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
                StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
                final SubLObject var41 = f37916((SubLObject)module0618.$ic109$, var28, (SubLObject)module0618.UNPROVIDED);
                final SubLObject var42 = module0190.$g2239$.getGlobalValue();
                final SubLObject var43 = module0190.$g2238$.getGlobalValue();
                if (module0618.NIL != f37919(var41, (SubLObject)module0618.T)) {
                    final SubLObject var44 = var41;
                    SubLObject var45 = (SubLObject)module0618.NIL;
                    try {
                        final SubLObject var36_312 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                            var45 = compatibility.open_binary(var44, (SubLObject)module0618.$ic64$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var36_312, var29);
                        }
                        if (!var45.isStream()) {
                            Errors.error((SubLObject)module0618.$ic65$, var44);
                        }
                        SubLObject var20_313 = var45;
                        if (module0618.$ic64$ == module0618.$ic64$) {
                            var20_313 = module0075.f5283(var20_313);
                        }
                        try {
                            final SubLObject var47;
                            final SubLObject var46 = var47 = module0065.f4743(var42);
                            SubLObject var48 = (SubLObject)module0618.NIL;
                            try {
                                var48 = Locks.seize_lock(var47);
                                final SubLObject var49 = streams_high.file_length(var20_313);
                                SubLObject var50 = (SubLObject)module0618.ZERO_INTEGER;
                                f38022(var20_313);
                                final SubLObject var36_313 = module0012.$g75$.currentBinding(var29);
                                final SubLObject var37_319 = module0012.$g76$.currentBinding(var29);
                                final SubLObject var51 = module0012.$g77$.currentBinding(var29);
                                final SubLObject var52 = module0012.$g78$.currentBinding(var29);
                                try {
                                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                    module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                    module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                    module0012.$g78$.bind(Time.get_universal_time(), var29);
                                    module0012.f478((SubLObject)module0618.$ic115$);
                                    SubLObject var53;
                                    for (var53 = (SubLObject)module0618.NIL, var53 = module0021.f1060(var20_313, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var53 != module0618.$ic81$; var53 = module0021.f1060(var20_313, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                                        var50 = Numbers.add(var50, (SubLObject)module0618.ONE_INTEGER);
                                        if (var50.numE((SubLObject)module0618.$ic116$)) {
                                            module0012.note_percent_progress(compatibility.get_file_position(var20_313), var49);
                                            var50 = (SubLObject)module0618.ZERO_INTEGER;
                                        }
                                        if (var53.isInteger()) {
                                            f38059(var53, var20_313, var42, var43);
                                        }
                                    }
                                    module0012.f479();
                                }
                                finally {
                                    module0012.$g78$.rebind(var52, var29);
                                    module0012.$g77$.rebind(var51, var29);
                                    module0012.$g76$.rebind(var37_319, var29);
                                    module0012.$g75$.rebind(var36_313, var29);
                                }
                            }
                            finally {
                                if (module0618.NIL != var48) {
                                    Locks.release_lock(var47);
                                }
                            }
                        }
                        finally {
                            final SubLObject var36_314 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                streams_high.close(var20_313, (SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var36_314, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var36_315 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (var45.isStream()) {
                                streams_high.close(var45, (SubLObject)module0618.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_315, var29);
                        }
                    }
                    f37914(var44);
                }
            }
            finally {
                StreamsLow.$stream_initial_output_buffer_size$.rebind(var40, var29);
                StreamsLow.$stream_initial_input_buffer_size$.rebind(var39, var29);
            }
        }
        final SubLObject var54 = f38034(var28);
        module0190.f11876(var54);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38058(final SubLObject var288, final SubLObject var20) {
        final SubLObject var289 = module0190.f11886(var288);
        module0021.f1038(var289, var20);
        module0021.f1038(var288, var20);
        return var288;
    }
    
    public static SubLObject f38059(final SubLObject var249, final SubLObject var20, final SubLObject var309, final SubLObject var310) {
        final SubLObject var311 = module0021.f1060(var20, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != module0212.f13763(var311)) {
            module0190.f11871(var311, var249, var309, var310);
            return var311;
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38034(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic108$);
    }
    
    public static SubLObject f38060(final SubLObject var28) {
        final SubLObject var29 = f38033(var28);
        return var29;
    }
    
    public static SubLObject f37961(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f38024(var28, (SubLObject)module0618.$ic117$, module0192.f12046());
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic118$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_325 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_325 = module0075.f5283(var20_325);
            }
            try {
                f38021(var20_325);
                final SubLObject var34 = module0192.f12045();
                final SubLObject var35 = (SubLObject)module0618.$ic119$;
                final SubLObject var36 = module0065.f4733(var34);
                SubLObject var37 = (SubLObject)module0618.ZERO_INTEGER;
                assert module0618.NIL != Types.stringp(var35) : var35;
                final SubLObject var38 = module0012.$g75$.currentBinding(var29);
                final SubLObject var39 = module0012.$g76$.currentBinding(var29);
                final SubLObject var40 = module0012.$g77$.currentBinding(var29);
                final SubLObject var41 = module0012.$g78$.currentBinding(var29);
                try {
                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                    module0012.$g77$.bind((SubLObject)module0618.T, var29);
                    module0012.$g78$.bind(Time.get_universal_time(), var29);
                    module0012.f478(var35);
                    final SubLObject var229_326 = var34;
                    if (module0618.NIL == module0065.f4772(var229_326, (SubLObject)module0618.$ic93$)) {
                        final SubLObject var231_327 = var229_326;
                        if (module0618.NIL == module0065.f4775(var231_327, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var42 = module0065.f4740(var231_327);
                            final SubLObject var43 = (SubLObject)module0618.NIL;
                            SubLObject var44;
                            SubLObject var45;
                            SubLObject var46;
                            SubLObject var47;
                            for (var44 = Sequences.length(var42), var45 = (SubLObject)module0618.NIL, var45 = (SubLObject)module0618.ZERO_INTEGER; var45.numL(var44); var45 = Numbers.add(var45, (SubLObject)module0618.ONE_INTEGER)) {
                                var46 = ((module0618.NIL != var43) ? Numbers.subtract(var44, var45, (SubLObject)module0618.ONE_INTEGER) : var45);
                                var47 = Vectors.aref(var42, var46);
                                if (module0618.NIL == module0065.f4749(var47) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    if (module0618.NIL != module0065.f4749(var47)) {
                                        var47 = (SubLObject)module0618.$ic93$;
                                    }
                                    module0012.note_percent_progress(var37, var36);
                                    var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                                    f38061(var47, var20_325);
                                }
                            }
                        }
                        final SubLObject var239_329 = var229_326;
                        if (module0618.NIL == module0065.f4777(var239_329) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                            final SubLObject var48 = module0065.f4738(var239_329);
                            SubLObject var49 = module0065.f4739(var239_329);
                            final SubLObject var50 = module0065.f4734(var239_329);
                            final SubLObject var51 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                            while (var49.numL(var50)) {
                                final SubLObject var52 = Hashtables.gethash_without_values(var49, var48, var51);
                                if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var52)) {
                                    module0012.note_percent_progress(var37, var36);
                                    var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                                    f38061(var52, var20_325);
                                }
                                var49 = Numbers.add(var49, (SubLObject)module0618.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var41, var29);
                    module0012.$g77$.rebind(var40, var29);
                    module0012.$g76$.rebind(var39, var29);
                    module0012.$g75$.rebind(var38, var29);
                }
            }
            finally {
                final SubLObject var53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_325, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var53, var29);
                }
            }
        }
        finally {
            final SubLObject var54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var54, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37972(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic118$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_331 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_331 = module0075.f5283(var20_331);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_331);
                    f38022(var20_331);
                    final SubLObject var35 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic120$);
                        SubLObject var39;
                        for (var39 = (SubLObject)module0618.NIL, var39 = module0021.f1060(var20_331, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var39 != module0618.$ic81$; var39 = module0021.f1060(var20_331, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_331), var34);
                            if (var39.isInteger()) {
                                f38062(var39, var20_331);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var38, var29);
                        module0012.$g77$.rebind(var37, var29);
                        module0012.$g76$.rebind(var36, var29);
                        module0012.$g75$.rebind(var35, var29);
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_331, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var29);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                }
            }
            f37914(var31);
        }
        final SubLObject var42 = f38033(var28);
        module0192.f12051(var42);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38061(final SubLObject var328, final SubLObject var20) {
        module0021.f1038(module0192.f12056(var328), var20);
        module0021.f1038(module0192.f12017(var328), var20);
        module0021.f1038(module0192.f12029(var328), var20);
        return var328;
    }
    
    public static SubLObject f38062(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var251 = module0192.f12035(var250, var249);
        module0192.f12030(var251, module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
        return var251;
    }
    
    public static SubLObject f38033(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic117$);
    }
    
    public static SubLObject f38063(final SubLObject var28) {
        final SubLObject var29 = f38031(var28);
        return var29;
    }
    
    public static SubLObject f37962(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0176.$g2196$.getGlobalValue();
        final SubLObject var31 = module0160.f10437(var30);
        final SubLObject var32 = module0160.f10418(var30);
        try {
            module0160.f10447(var30);
            module0160.f10417(var30);
            final SubLObject var74_333 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_334 = module0160.f10437(var74_333);
            final SubLObject var76_335 = module0160.f10418(var74_333);
            try {
                module0160.f10447(var74_333);
                module0160.f10417(var74_333);
                final SubLObject var74_334 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_335 = module0160.f10437(var74_334);
                final SubLObject var76_336 = module0160.f10418(var74_334);
                try {
                    module0160.f10447(var74_334);
                    module0160.f10417(var74_334);
                    final SubLObject var74_335 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_336 = module0160.f10437(var74_335);
                    final SubLObject var76_337 = module0160.f10418(var74_335);
                    try {
                        module0160.f10447(var74_335);
                        module0160.f10417(var74_335);
                        final SubLObject var74_336 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_337 = module0160.f10437(var74_336);
                        final SubLObject var76_338 = module0160.f10418(var74_336);
                        try {
                            module0160.f10447(var74_336);
                            module0160.f10417(var74_336);
                            final SubLObject var33 = module0018.$g694$.currentBinding(var29);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var29);
                                f38024(var28, (SubLObject)module0618.$ic121$, module0184.f11643());
                                final SubLObject var34 = f37916((SubLObject)module0618.$ic122$, var28, (SubLObject)module0618.UNPROVIDED);
                                final SubLObject var35 = f37916((SubLObject)module0618.$ic123$, var28, (SubLObject)module0618.UNPROVIDED);
                                final SubLObject var36_347 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
                                final SubLObject var36 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
                                try {
                                    StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
                                    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
                                    final SubLObject var37 = var34;
                                    SubLObject var38 = (SubLObject)module0618.NIL;
                                    try {
                                        final SubLObject var36_348 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                                            var38 = compatibility.open_binary(var37, (SubLObject)module0618.$ic73$);
                                        }
                                        finally {
                                            stream_macros.$stream_requires_locking$.rebind(var36_348, var29);
                                        }
                                        if (!var38.isStream()) {
                                            Errors.error((SubLObject)module0618.$ic65$, var37);
                                        }
                                        SubLObject var20_350 = var38;
                                        if (module0618.$ic73$ == module0618.$ic64$) {
                                            var20_350 = module0075.f5283(var20_350);
                                        }
                                        try {
                                            final SubLObject var191_351 = var35;
                                            SubLObject var352_353 = (SubLObject)module0618.NIL;
                                            try {
                                                final SubLObject var36_349 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                                                try {
                                                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                                                    var352_353 = compatibility.open_binary(var191_351, (SubLObject)module0618.$ic73$);
                                                }
                                                finally {
                                                    stream_macros.$stream_requires_locking$.rebind(var36_349, var29);
                                                }
                                                if (!var352_353.isStream()) {
                                                    Errors.error((SubLObject)module0618.$ic65$, var191_351);
                                                }
                                                SubLObject var39 = var352_353;
                                                if (module0618.$ic73$ == module0618.$ic64$) {
                                                    var39 = module0075.f5283(var39);
                                                }
                                                try {
                                                    f38021(var20_350);
                                                    final SubLObject var40 = module0095.f6846(var20_350, var39);
                                                    final SubLObject var41 = module0184.f11634();
                                                    final SubLObject var42 = (SubLObject)module0618.$ic124$;
                                                    final SubLObject var43 = module0065.f4733(var41);
                                                    SubLObject var44 = (SubLObject)module0618.ZERO_INTEGER;
                                                    assert module0618.NIL != Types.stringp(var42) : var42;
                                                    final SubLObject var36_350 = module0012.$g75$.currentBinding(var29);
                                                    final SubLObject var37_358 = module0012.$g76$.currentBinding(var29);
                                                    final SubLObject var45 = module0012.$g77$.currentBinding(var29);
                                                    final SubLObject var46 = module0012.$g78$.currentBinding(var29);
                                                    try {
                                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                                                        module0012.f478(var42);
                                                        final SubLObject var229_359 = var41;
                                                        if (module0618.NIL == module0065.f4772(var229_359, (SubLObject)module0618.$ic93$)) {
                                                            final SubLObject var231_360 = var229_359;
                                                            if (module0618.NIL == module0065.f4775(var231_360, (SubLObject)module0618.$ic93$)) {
                                                                final SubLObject var47 = module0065.f4740(var231_360);
                                                                final SubLObject var48 = (SubLObject)module0618.NIL;
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                SubLObject var52;
                                                                for (var49 = Sequences.length(var47), var50 = (SubLObject)module0618.NIL, var50 = (SubLObject)module0618.ZERO_INTEGER; var50.numL(var49); var50 = Numbers.add(var50, (SubLObject)module0618.ONE_INTEGER)) {
                                                                    var51 = ((module0618.NIL != var48) ? Numbers.subtract(var49, var50, (SubLObject)module0618.ONE_INTEGER) : var50);
                                                                    var52 = Vectors.aref(var47, var51);
                                                                    if (module0618.NIL == module0065.f4749(var52) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                                        if (module0618.NIL != module0065.f4749(var52)) {
                                                                            var52 = (SubLObject)module0618.$ic93$;
                                                                        }
                                                                        module0012.note_percent_progress(var44, var43);
                                                                        var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER);
                                                                        module0095.f6862(var40);
                                                                        f38064(var52, var20_350);
                                                                    }
                                                                }
                                                            }
                                                            final SubLObject var239_362 = var229_359;
                                                            if (module0618.NIL == module0065.f4777(var239_362) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                                final SubLObject var53 = module0065.f4738(var239_362);
                                                                SubLObject var54 = module0065.f4739(var239_362);
                                                                final SubLObject var55 = module0065.f4734(var239_362);
                                                                final SubLObject var56 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                                while (var54.numL(var55)) {
                                                                    final SubLObject var57 = Hashtables.gethash_without_values(var54, var53, var56);
                                                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var57)) {
                                                                        module0012.note_percent_progress(var44, var43);
                                                                        var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER);
                                                                        module0095.f6862(var40);
                                                                        f38064(var57, var20_350);
                                                                    }
                                                                    var54 = Numbers.add(var54, (SubLObject)module0618.ONE_INTEGER);
                                                                }
                                                            }
                                                        }
                                                        module0012.f479();
                                                    }
                                                    finally {
                                                        module0012.$g78$.rebind(var46, var29);
                                                        module0012.$g77$.rebind(var45, var29);
                                                        module0012.$g76$.rebind(var37_358, var29);
                                                        module0012.$g75$.rebind(var36_350, var29);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var36_351 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                                        streams_high.close(var39, (SubLObject)module0618.UNPROVIDED);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_351, var29);
                                                    }
                                                }
                                            }
                                            finally {
                                                final SubLObject var36_352 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                                    if (var352_353.isStream()) {
                                                        streams_high.close(var352_353, (SubLObject)module0618.UNPROVIDED);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var36_352, var29);
                                                }
                                            }
                                            f37914(var191_351);
                                        }
                                        finally {
                                            final SubLObject var36_353 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                                streams_high.close(var20_350, (SubLObject)module0618.UNPROVIDED);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var36_353, var29);
                                            }
                                        }
                                    }
                                    finally {
                                        final SubLObject var36_354 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                            if (var38.isStream()) {
                                                streams_high.close(var38, (SubLObject)module0618.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36_354, var29);
                                        }
                                    }
                                    f37914(var37);
                                }
                                finally {
                                    StreamsLow.$stream_initial_output_buffer_size$.rebind(var36, var29);
                                    StreamsLow.$stream_initial_input_buffer_size$.rebind(var36_347, var29);
                                }
                            }
                            finally {
                                module0018.$g694$.rebind(var33, var29);
                            }
                        }
                        finally {
                            final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                if (module0618.NIL != var75_337) {
                                    module0160.f10446(var74_336);
                                }
                                if (module0618.NIL == var76_338) {
                                    module0160.f10414(var74_336, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var58, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (module0618.NIL != var75_336) {
                                module0160.f10446(var74_335);
                            }
                            if (module0618.NIL == var76_337) {
                                module0160.f10414(var74_335, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var59, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (module0618.NIL != var75_335) {
                            module0160.f10446(var74_334);
                        }
                        if (module0618.NIL == var76_336) {
                            module0160.f10414(var74_334, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var60, var29);
                    }
                }
            }
            finally {
                final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (module0618.NIL != var75_334) {
                        module0160.f10446(var74_333);
                    }
                    if (module0618.NIL == var76_335) {
                        module0160.f10414(var74_333, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var61, var29);
                }
            }
        }
        finally {
            final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (module0618.NIL != var31) {
                    module0160.f10446(var30);
                }
                if (module0618.NIL == var32) {
                    module0160.f10414(var30, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var62, var29);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37973(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic122$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic123$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic125$, var30, var31);
            SubLObject var32 = (SubLObject)module0618.NIL;
            SubLObject var33 = module0012.$g64$.currentBinding(var29);
            SubLObject var34 = module0021.$g750$.currentBinding(var29);
            try {
                module0012.$g64$.bind((SubLObject)module0618.NIL, var29);
                module0021.$g750$.bind((SubLObject)module0618.NIL, var29);
                var32 = module0095.f6856(var31);
            }
            finally {
                module0021.$g750$.rebind(var34, var29);
                module0012.$g64$.rebind(var33, var29);
            }
            module0012.$g82$.setDynamicValue((SubLObject)module0618.$ic126$, var29);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var29);
            module0012.$g83$.setDynamicValue(var32, var29);
            module0012.$g84$.setDynamicValue((SubLObject)module0618.ZERO_INTEGER, var29);
            var33 = module0012.$g75$.currentBinding(var29);
            var34 = module0012.$g76$.currentBinding(var29);
            final SubLObject var35 = module0012.$g77$.currentBinding(var29);
            final SubLObject var36 = module0012.$g78$.currentBinding(var29);
            try {
                module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                module0012.$g77$.bind((SubLObject)module0618.T, var29);
                module0012.$g78$.bind(Time.get_universal_time(), var29);
                module0012.f478(module0012.$g82$.getDynamicValue(var29));
                SubLObject var37;
                SubLObject var36_369;
                SubLObject var37_370;
                for (var37 = (SubLObject)module0618.NIL, var37 = (SubLObject)module0618.ZERO_INTEGER; var37.numL(module0012.$g83$.getDynamicValue(var29)); var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER)) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var29), module0012.$g83$.getDynamicValue(var29));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var29), (SubLObject)module0618.ONE_INTEGER), var29);
                    var36_369 = module0012.$g64$.currentBinding(var29);
                    var37_370 = module0021.$g750$.currentBinding(var29);
                    try {
                        module0012.$g64$.bind((SubLObject)module0618.T, var29);
                        module0021.$g750$.bind((SubLObject)module0618.T, var29);
                        module0184.f11672(var37);
                    }
                    finally {
                        module0021.$g750$.rebind(var37_370, var29);
                        module0012.$g64$.rebind(var36_369, var29);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var36, var29);
                module0012.$g77$.rebind(var35, var29);
                module0012.$g76$.rebind(var34, var29);
                module0012.$g75$.rebind(var33, var29);
            }
            module0186.f11718();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var39;
            final SubLObject var38 = var39 = var30;
            SubLObject var40 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var41 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var40 = compatibility.open_binary(var39, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var41, var29);
                }
                if (!var40.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var39);
                }
                SubLObject var20_372 = var40;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_372 = module0075.f5283(var20_372);
                }
                try {
                    final SubLObject var42 = streams_high.file_length(var20_372);
                    f38022(var20_372);
                    final SubLObject var43 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var44 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var45 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var46 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic127$);
                        SubLObject var47;
                        for (var47 = (SubLObject)module0618.NIL, var47 = module0021.f1060(var20_372, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var47 != module0618.$ic81$; var47 = module0021.f1060(var20_372, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_372), var42);
                            if (var47.isInteger()) {
                                module0184.f11672(var47);
                                f38065(var47, var20_372);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var46, var29);
                        module0012.$g77$.rebind(var45, var29);
                        module0012.$g76$.rebind(var44, var29);
                        module0012.$g75$.rebind(var43, var29);
                    }
                }
                finally {
                    final SubLObject var48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_372, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var48, var29);
                    }
                }
            }
            finally {
                final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var40.isStream()) {
                        streams_high.close(var40, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var49, var29);
                }
            }
            f37914(var39);
        }
        final SubLObject var50 = f38031(var28);
        module0184.f11636(var50);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38064(final SubLObject var361, final SubLObject var20) {
        module0021.f1038(module0188.f11796(var361), var20);
        module0187.f11740(var361, var20);
        return var361;
    }
    
    public static SubLObject f38065(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0188.f11797(var249);
        module0187.f11744(var250, var20);
        return var250;
    }
    
    public static SubLObject f38066(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38065(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f38031(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic121$);
    }
    
    public static SubLObject f37963(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0176.$g2196$.getGlobalValue();
        final SubLObject var31 = module0160.f10437(var30);
        final SubLObject var32 = module0160.f10418(var30);
        try {
            module0160.f10447(var30);
            module0160.f10417(var30);
            final SubLObject var74_375 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_376 = module0160.f10437(var74_375);
            final SubLObject var76_377 = module0160.f10418(var74_375);
            try {
                module0160.f10447(var74_375);
                module0160.f10417(var74_375);
                final SubLObject var74_376 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_377 = module0160.f10437(var74_376);
                final SubLObject var76_378 = module0160.f10418(var74_376);
                try {
                    module0160.f10447(var74_376);
                    module0160.f10417(var74_376);
                    final SubLObject var74_377 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_378 = module0160.f10437(var74_377);
                    final SubLObject var76_379 = module0160.f10418(var74_377);
                    try {
                        module0160.f10447(var74_377);
                        module0160.f10417(var74_377);
                        final SubLObject var74_378 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_379 = module0160.f10437(var74_378);
                        final SubLObject var76_380 = module0160.f10418(var74_378);
                        try {
                            module0160.f10447(var74_378);
                            module0160.f10417(var74_378);
                            final SubLObject var33 = module0018.$g694$.currentBinding(var29);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var29);
                                final SubLObject var34 = f37916((SubLObject)module0618.$ic129$, var28, (SubLObject)module0618.UNPROVIDED);
                                final SubLObject var35 = f37916((SubLObject)module0618.$ic130$, var28, (SubLObject)module0618.UNPROVIDED);
                                final SubLObject var36_389 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
                                final SubLObject var36 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
                                try {
                                    StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
                                    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
                                    final SubLObject var37 = var34;
                                    SubLObject var38 = (SubLObject)module0618.NIL;
                                    try {
                                        final SubLObject var36_390 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                                            var38 = compatibility.open_binary(var37, (SubLObject)module0618.$ic73$);
                                        }
                                        finally {
                                            stream_macros.$stream_requires_locking$.rebind(var36_390, var29);
                                        }
                                        if (!var38.isStream()) {
                                            Errors.error((SubLObject)module0618.$ic65$, var37);
                                        }
                                        SubLObject var20_392 = var38;
                                        if (module0618.$ic73$ == module0618.$ic64$) {
                                            var20_392 = module0075.f5283(var20_392);
                                        }
                                        try {
                                            final SubLObject var191_393 = var35;
                                            SubLObject var394_395 = (SubLObject)module0618.NIL;
                                            try {
                                                final SubLObject var36_391 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                                                try {
                                                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                                                    var394_395 = compatibility.open_binary(var191_393, (SubLObject)module0618.$ic73$);
                                                }
                                                finally {
                                                    stream_macros.$stream_requires_locking$.rebind(var36_391, var29);
                                                }
                                                if (!var394_395.isStream()) {
                                                    Errors.error((SubLObject)module0618.$ic65$, var191_393);
                                                }
                                                SubLObject var39 = var394_395;
                                                if (module0618.$ic73$ == module0618.$ic64$) {
                                                    var39 = module0075.f5283(var39);
                                                }
                                                try {
                                                    f38021(var20_392);
                                                    final SubLObject var40 = module0095.f6846(var20_392, var39);
                                                    final SubLObject var41 = module0174.f11010();
                                                    final SubLObject var42 = (SubLObject)module0618.$ic131$;
                                                    final SubLObject var43 = module0065.f4733(var41);
                                                    SubLObject var44 = (SubLObject)module0618.ZERO_INTEGER;
                                                    assert module0618.NIL != Types.stringp(var42) : var42;
                                                    final SubLObject var36_392 = module0012.$g75$.currentBinding(var29);
                                                    final SubLObject var37_398 = module0012.$g76$.currentBinding(var29);
                                                    final SubLObject var45 = module0012.$g77$.currentBinding(var29);
                                                    final SubLObject var46 = module0012.$g78$.currentBinding(var29);
                                                    try {
                                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                                                        module0012.f478(var42);
                                                        final SubLObject var229_399 = var41;
                                                        if (module0618.NIL == module0065.f4772(var229_399, (SubLObject)module0618.$ic93$)) {
                                                            final SubLObject var231_400 = var229_399;
                                                            if (module0618.NIL == module0065.f4775(var231_400, (SubLObject)module0618.$ic93$)) {
                                                                final SubLObject var47 = module0065.f4740(var231_400);
                                                                final SubLObject var48 = (SubLObject)module0618.NIL;
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                SubLObject var52;
                                                                for (var49 = Sequences.length(var47), var50 = (SubLObject)module0618.NIL, var50 = (SubLObject)module0618.ZERO_INTEGER; var50.numL(var49); var50 = Numbers.add(var50, (SubLObject)module0618.ONE_INTEGER)) {
                                                                    var51 = ((module0618.NIL != var48) ? Numbers.subtract(var49, var50, (SubLObject)module0618.ONE_INTEGER) : var50);
                                                                    var52 = Vectors.aref(var47, var51);
                                                                    if (module0618.NIL == module0065.f4749(var52) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                                        if (module0618.NIL != module0065.f4749(var52)) {
                                                                            var52 = (SubLObject)module0618.$ic93$;
                                                                        }
                                                                        module0012.note_percent_progress(var44, var43);
                                                                        var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER);
                                                                        module0095.f6862(var40);
                                                                        f38067(var52, var20_392);
                                                                    }
                                                                }
                                                            }
                                                            final SubLObject var239_401 = var229_399;
                                                            if (module0618.NIL == module0065.f4777(var239_401) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                                final SubLObject var53 = module0065.f4738(var239_401);
                                                                SubLObject var54 = module0065.f4739(var239_401);
                                                                final SubLObject var55 = module0065.f4734(var239_401);
                                                                final SubLObject var56 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                                while (var54.numL(var55)) {
                                                                    final SubLObject var57 = Hashtables.gethash_without_values(var54, var53, var56);
                                                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var57)) {
                                                                        module0012.note_percent_progress(var44, var43);
                                                                        var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER);
                                                                        module0095.f6862(var40);
                                                                        f38067(var57, var20_392);
                                                                    }
                                                                    var54 = Numbers.add(var54, (SubLObject)module0618.ONE_INTEGER);
                                                                }
                                                            }
                                                        }
                                                        module0012.f479();
                                                    }
                                                    finally {
                                                        module0012.$g78$.rebind(var46, var29);
                                                        module0012.$g77$.rebind(var45, var29);
                                                        module0012.$g76$.rebind(var37_398, var29);
                                                        module0012.$g75$.rebind(var36_392, var29);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var36_393 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                                        streams_high.close(var39, (SubLObject)module0618.UNPROVIDED);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_393, var29);
                                                    }
                                                }
                                            }
                                            finally {
                                                final SubLObject var36_394 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                                    if (var394_395.isStream()) {
                                                        streams_high.close(var394_395, (SubLObject)module0618.UNPROVIDED);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var36_394, var29);
                                                }
                                            }
                                            f37914(var191_393);
                                        }
                                        finally {
                                            final SubLObject var36_395 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                                streams_high.close(var20_392, (SubLObject)module0618.UNPROVIDED);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var36_395, var29);
                                            }
                                        }
                                    }
                                    finally {
                                        final SubLObject var36_396 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                            if (var38.isStream()) {
                                                streams_high.close(var38, (SubLObject)module0618.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36_396, var29);
                                        }
                                    }
                                    f37914(var37);
                                }
                                finally {
                                    StreamsLow.$stream_initial_output_buffer_size$.rebind(var36, var29);
                                    StreamsLow.$stream_initial_input_buffer_size$.rebind(var36_389, var29);
                                }
                            }
                            finally {
                                module0018.$g694$.rebind(var33, var29);
                            }
                        }
                        finally {
                            final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                if (module0618.NIL != var75_379) {
                                    module0160.f10446(var74_378);
                                }
                                if (module0618.NIL == var76_380) {
                                    module0160.f10414(var74_378, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var58, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (module0618.NIL != var75_378) {
                                module0160.f10446(var74_377);
                            }
                            if (module0618.NIL == var76_379) {
                                module0160.f10414(var74_377, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var59, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (module0618.NIL != var75_377) {
                            module0160.f10446(var74_376);
                        }
                        if (module0618.NIL == var76_378) {
                            module0160.f10414(var74_376, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var60, var29);
                    }
                }
            }
            finally {
                final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (module0618.NIL != var75_376) {
                        module0160.f10446(var74_375);
                    }
                    if (module0618.NIL == var76_377) {
                        module0160.f10414(var74_375, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var61, var29);
                }
            }
        }
        finally {
            final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (module0618.NIL != var31) {
                    module0160.f10446(var30);
                }
                if (module0618.NIL == var32) {
                    module0160.f10414(var30, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var62, var29);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37974(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic129$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic130$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic132$, var30, var31);
            module0176.f11131();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var33;
            final SubLObject var32 = var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var35 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var35, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_408 = var34;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_408 = module0075.f5283(var20_408);
                }
                try {
                    final SubLObject var36 = streams_high.file_length(var20_408);
                    f38022(var20_408);
                    final SubLObject var37 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic133$);
                        SubLObject var41;
                        for (var41 = (SubLObject)module0618.NIL, var41 = module0021.f1060(var20_408, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var41 != module0618.$ic81$; var41 = module0021.f1060(var20_408, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_408), var36);
                            if (var41.isInteger()) {
                                f38068(var41, var20_408);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var38, var29);
                        module0012.$g75$.rebind(var37, var29);
                    }
                }
                finally {
                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_408, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                    }
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
            f37914(var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38067(final SubLObject var268, final SubLObject var20) {
        module0021.f1038(module0178.f11391(var268), var20);
        module0177.f11162(var268, var20);
        return var268;
    }
    
    public static SubLObject f38068(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0178.f11392(var249);
        module0177.f11171(var250, var20);
        return var250;
    }
    
    public static SubLObject f38069(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38068(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f37964(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic135$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic136$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var34, var29);
            }
            if (!var33.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var32);
            }
            SubLObject var20_412 = var33;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_412 = module0075.f5283(var20_412);
            }
            try {
                final SubLObject var191_413 = var31;
                SubLObject var414_415 = (SubLObject)module0618.NIL;
                try {
                    final SubLObject var35 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                        var414_415 = compatibility.open_binary(var191_413, (SubLObject)module0618.$ic73$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var35, var29);
                    }
                    if (!var414_415.isStream()) {
                        Errors.error((SubLObject)module0618.$ic65$, var191_413);
                    }
                    SubLObject var36 = var414_415;
                    if (module0618.$ic73$ == module0618.$ic64$) {
                        var36 = module0075.f5283(var36);
                    }
                    try {
                        f38021(var20_412);
                        final SubLObject var37 = module0095.f6846(var20_412, var36);
                        final SubLObject var38 = module0179.f11398();
                        final SubLObject var39 = (SubLObject)module0618.$ic137$;
                        final SubLObject var40 = module0065.f4733(var38);
                        SubLObject var41 = (SubLObject)module0618.ZERO_INTEGER;
                        assert module0618.NIL != Types.stringp(var39) : var39;
                        final SubLObject var42 = module0012.$g75$.currentBinding(var29);
                        final SubLObject var43 = module0012.$g76$.currentBinding(var29);
                        final SubLObject var44 = module0012.$g77$.currentBinding(var29);
                        final SubLObject var45 = module0012.$g78$.currentBinding(var29);
                        try {
                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                            module0012.$g77$.bind((SubLObject)module0618.T, var29);
                            module0012.$g78$.bind(Time.get_universal_time(), var29);
                            module0012.f478(var39);
                            final SubLObject var229_416 = var38;
                            if (module0618.NIL == module0065.f4772(var229_416, (SubLObject)module0618.$ic93$)) {
                                final SubLObject var231_417 = var229_416;
                                if (module0618.NIL == module0065.f4775(var231_417, (SubLObject)module0618.$ic93$)) {
                                    final SubLObject var46 = module0065.f4740(var231_417);
                                    final SubLObject var47 = (SubLObject)module0618.NIL;
                                    SubLObject var48;
                                    SubLObject var49;
                                    SubLObject var50;
                                    SubLObject var51;
                                    for (var48 = Sequences.length(var46), var49 = (SubLObject)module0618.NIL, var49 = (SubLObject)module0618.ZERO_INTEGER; var49.numL(var48); var49 = Numbers.add(var49, (SubLObject)module0618.ONE_INTEGER)) {
                                        var50 = ((module0618.NIL != var47) ? Numbers.subtract(var48, var49, (SubLObject)module0618.ONE_INTEGER) : var49);
                                        var51 = Vectors.aref(var46, var50);
                                        if (module0618.NIL == module0065.f4749(var51) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                            if (module0618.NIL != module0065.f4749(var51)) {
                                                var51 = (SubLObject)module0618.$ic93$;
                                            }
                                            module0012.note_percent_progress(var41, var40);
                                            var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                            module0095.f6862(var37);
                                            f38070(var51, var20_412);
                                        }
                                    }
                                }
                                final SubLObject var239_418 = var229_416;
                                if (module0618.NIL == module0065.f4777(var239_418) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    final SubLObject var52 = module0065.f4738(var239_418);
                                    SubLObject var53 = module0065.f4739(var239_418);
                                    final SubLObject var54 = module0065.f4734(var239_418);
                                    final SubLObject var55 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                    while (var53.numL(var54)) {
                                        final SubLObject var56 = Hashtables.gethash_without_values(var53, var52, var55);
                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var56)) {
                                            module0012.note_percent_progress(var41, var40);
                                            var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                            module0095.f6862(var37);
                                            f38070(var56, var20_412);
                                        }
                                        var53 = Numbers.add(var53, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var45, var29);
                            module0012.$g77$.rebind(var44, var29);
                            module0012.$g76$.rebind(var43, var29);
                            module0012.$g75$.rebind(var42, var29);
                        }
                    }
                    finally {
                        final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            streams_high.close(var36, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var57, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (var414_415.isStream()) {
                            streams_high.close(var414_415, (SubLObject)module0618.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var58, var29);
                    }
                }
                f37914(var191_413);
            }
            finally {
                final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_412, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var59, var29);
                }
            }
        }
        finally {
            final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var33.isStream()) {
                    streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var60, var29);
            }
        }
        f37914(var32);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37975(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic135$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic136$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic138$, var30, var31);
            module0181.f11482();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var32 = var30;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_421 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_421 = module0075.f5283(var20_421);
                }
                try {
                    final SubLObject var35 = module0179.f11409();
                    SubLObject var36 = (SubLObject)module0618.ZERO_INTEGER;
                    f38022(var20_421);
                    final SubLObject var37 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic139$);
                        SubLObject var41;
                        for (var41 = (SubLObject)module0618.NIL, var41 = module0021.f1060(var20_421, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var41 != module0618.$ic81$; var41 = module0021.f1060(var20_421, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            var36 = Numbers.add(var36, (SubLObject)module0618.ONE_INTEGER);
                            module0012.note_percent_progress(var36, var35);
                            if (var41.isInteger()) {
                                f38071(var41, var20_421);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var38, var29);
                        module0012.$g75$.rebind(var37, var29);
                    }
                }
                finally {
                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_421, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                    }
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
            f37914(var32);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38070(final SubLObject var271, final SubLObject var20) {
        module0021.f1038(module0183.f11581(var271), var20);
        return module0182.f11507(var271, var20);
    }
    
    public static SubLObject f38071(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0183.f11582(var249);
        module0182.f11509(var250, var20);
        return var250;
    }
    
    public static SubLObject f38072(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38071(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f38073(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var31 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var32 = f37916((SubLObject)module0618.$ic141$, var28, (SubLObject)module0618.UNPROVIDED);
            final SubLObject var33 = (SubLObject)module0618.$ic142$;
            final SubLObject var36_424 = module0012.$g73$.currentBinding(var29);
            final SubLObject var37_425 = module0012.$g65$.currentBinding(var29);
            final SubLObject var34 = module0012.$g67$.currentBinding(var29);
            final SubLObject var35 = module0012.$g68$.currentBinding(var29);
            final SubLObject var36 = module0012.$g66$.currentBinding(var29);
            final SubLObject var37 = module0012.$g69$.currentBinding(var29);
            final SubLObject var38 = module0012.$g70$.currentBinding(var29);
            final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var33) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var33);
                module0183.f11584(var32);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var37_425, var29);
                module0012.$g73$.rebind(var36_424, var29);
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var31, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var30, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38074(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic141$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = (SubLObject)module0618.$ic143$;
            final SubLObject var32 = module0012.$g73$.currentBinding(var29);
            final SubLObject var33 = module0012.$g65$.currentBinding(var29);
            final SubLObject var34 = module0012.$g67$.currentBinding(var29);
            final SubLObject var35 = module0012.$g68$.currentBinding(var29);
            final SubLObject var36 = module0012.$g66$.currentBinding(var29);
            final SubLObject var37 = module0012.$g69$.currentBinding(var29);
            final SubLObject var38 = module0012.$g70$.currentBinding(var29);
            final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var31) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var31);
                module0183.f11585(var30);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var32, var29);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37965(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic144$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = (SubLObject)module0618.$ic145$;
        final SubLObject var32 = module0012.$g73$.currentBinding(var29);
        final SubLObject var33 = module0012.$g65$.currentBinding(var29);
        final SubLObject var34 = module0012.$g67$.currentBinding(var29);
        final SubLObject var35 = module0012.$g68$.currentBinding(var29);
        final SubLObject var36 = module0012.$g66$.currentBinding(var29);
        final SubLObject var37 = module0012.$g69$.currentBinding(var29);
        final SubLObject var38 = module0012.$g70$.currentBinding(var29);
        final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var29);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var29);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g70$.bind((SubLObject)module0618.T, var29);
            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var31) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
            module0012.f474(var31);
            final SubLObject var40 = var30;
            SubLObject var41 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_427 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var41 = compatibility.open_binary(var40, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_427, var29);
                }
                if (!var41.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var40);
                }
                SubLObject var20_428 = var41;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_428 = module0075.f5283(var20_428);
                }
                try {
                    f38021(var20_428);
                    module0021.f1038(module0617.f37851(), var20_428);
                    SubLObject var42 = module0617.f37852();
                    SubLObject var43 = (SubLObject)module0618.NIL;
                    var43 = var42.first();
                    while (module0618.NIL != var42) {
                        SubLObject var45;
                        final SubLObject var44 = var45 = var43;
                        SubLObject var46 = (SubLObject)module0618.NIL;
                        SubLObject var47 = (SubLObject)module0618.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0618.$ic146$);
                        var46 = var45.first();
                        var45 = (var47 = var45.rest());
                        f38075(var46, var47, var20_428);
                        var42 = var42.rest();
                        var43 = var42.first();
                    }
                    module0021.f1038((SubLObject)module0618.NIL, var20_428);
                    module0021.f1038((SubLObject)module0618.NIL, var20_428);
                    module0021.f1038((SubLObject)module0618.NIL, var20_428);
                }
                finally {
                    final SubLObject var36_428 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_428, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_428, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_429 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var41.isStream()) {
                        streams_high.close(var41, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_429, var29);
                }
            }
            f37914(var40);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var39, var29);
            module0012.$g70$.rebind(var38, var29);
            module0012.$g69$.rebind(var37, var29);
            module0012.$g66$.rebind(var36, var29);
            module0012.$g68$.rebind(var35, var29);
            module0012.$g67$.rebind(var34, var29);
            module0012.$g65$.rebind(var33, var29);
            module0012.$g73$.rebind(var32, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38075(final SubLObject var433, final SubLObject var434, final SubLObject var20) {
        final SubLThread var435 = SubLProcess.currentSubLThread();
        module0021.f1038(var433, var20);
        module0021.f1038(module0617.f37854(var434), var20);
        SubLObject var436;
        for (var436 = module0066.f4838(module0067.f4891(var434)); module0618.NIL == module0066.f4841(var436); var436 = module0066.f4840(var436)) {
            var435.resetMultipleValues();
            final SubLObject var437 = module0066.f4839(var436);
            final SubLObject var438 = var435.secondMultipleValue();
            var435.resetMultipleValues();
            f38076(var437, var438, var20);
        }
        module0066.f4842(var436);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38076(final SubLObject var373, final SubLObject var374, final SubLObject var20) {
        module0021.f1038(var373, var20);
        module0021.f1038(var374, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37976(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic144$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = (SubLObject)module0618.$ic147$;
            final SubLObject var32 = module0012.$g73$.currentBinding(var29);
            final SubLObject var33 = module0012.$g65$.currentBinding(var29);
            final SubLObject var34 = module0012.$g67$.currentBinding(var29);
            final SubLObject var35 = module0012.$g68$.currentBinding(var29);
            final SubLObject var36 = module0012.$g66$.currentBinding(var29);
            final SubLObject var37 = module0012.$g69$.currentBinding(var29);
            final SubLObject var38 = module0012.$g70$.currentBinding(var29);
            final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var31) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var31);
                final SubLObject var40 = var30;
                SubLObject var41 = (SubLObject)module0618.NIL;
                try {
                    final SubLObject var36_439 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                        var41 = compatibility.open_binary(var40, (SubLObject)module0618.$ic64$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var36_439, var29);
                    }
                    if (!var41.isStream()) {
                        Errors.error((SubLObject)module0618.$ic65$, var40);
                    }
                    SubLObject var20_440 = var41;
                    if (module0618.$ic64$ == module0618.$ic64$) {
                        var20_440 = module0075.f5283(var20_440);
                    }
                    try {
                        final SubLObject var42 = streams_high.file_length(var20_440);
                        f38022(var20_440);
                        module0617.f37857();
                        SubLObject var43;
                        SubLObject var44;
                        for (var43 = module0021.f1060(var20_440, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED), var44 = (SubLObject)module0618.NIL, var44 = (SubLObject)module0618.ZERO_INTEGER; var44.numL(var43); var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER)) {
                            f38077(var20_440);
                        }
                        module0021.f1060(var20_440, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        module0021.f1060(var20_440, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        module0021.f1060(var20_440, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        if (module0021.f1060(var20_440, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var42, compatibility.get_file_position(var20_440)), var30);
                        }
                    }
                    finally {
                        final SubLObject var36_440 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            streams_high.close(var20_440, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_440, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var36_441 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (var41.isStream()) {
                            streams_high.close(var41, (SubLObject)module0618.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_441, var29);
                    }
                }
                f37914(var40);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var32, var29);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38077(final SubLObject var20) {
        final SubLObject var21 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        SubLObject var22;
        SubLObject var23;
        for (var22 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED), var23 = (SubLObject)module0618.NIL, var23 = (SubLObject)module0618.ZERO_INTEGER; var23.numL(var22); var23 = Numbers.add(var23, (SubLObject)module0618.ONE_INTEGER)) {
            f38078(var21, var20);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38078(final SubLObject var433, final SubLObject var20) {
        final SubLObject var434 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var435 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        module0617.f37858(var433, var434, var435);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37966(final SubLObject var28, SubLObject var446) {
        if (var446 == module0618.UNPROVIDED) {
            var446 = (SubLObject)module0618.T;
        }
        final SubLThread var447 = SubLProcess.currentSubLThread();
        final SubLObject var448 = (SubLObject)module0618.$ic148$;
        final SubLObject var449 = module0012.$g73$.currentBinding(var447);
        final SubLObject var450 = module0012.$g65$.currentBinding(var447);
        final SubLObject var451 = module0012.$g67$.currentBinding(var447);
        final SubLObject var452 = module0012.$g68$.currentBinding(var447);
        final SubLObject var453 = module0012.$g66$.currentBinding(var447);
        final SubLObject var454 = module0012.$g69$.currentBinding(var447);
        final SubLObject var455 = module0012.$g70$.currentBinding(var447);
        final SubLObject var456 = module0012.$silent_progressP$.currentBinding(var447);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var447);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var447), var447);
            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var447);
            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var447);
            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var447);
            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var447);
            module0012.$g70$.bind((SubLObject)module0618.T, var447);
            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var448) ? module0012.$silent_progressP$.getDynamicValue(var447) : module0618.T), var447);
            module0012.f474(var448);
            f38079(var28, var446);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var456, var447);
            module0012.$g70$.rebind(var455, var447);
            module0012.$g69$.rebind(var454, var447);
            module0012.$g66$.rebind(var453, var447);
            module0012.$g68$.rebind(var452, var447);
            module0012.$g67$.rebind(var451, var447);
            module0012.$g65$.rebind(var450, var447);
            module0012.$g73$.rebind(var449, var447);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38079(final SubLObject var28, SubLObject var446) {
        if (var446 == module0618.UNPROVIDED) {
            var446 = (SubLObject)module0618.T;
        }
        final SubLObject var447 = f37916((SubLObject)module0618.$ic37$, var28, (SubLObject)module0618.UNPROVIDED);
        module0414.f28934(var447, var446);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37977(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = (SubLObject)module0618.$ic149$;
        final SubLObject var31 = module0012.$g73$.currentBinding(var29);
        final SubLObject var32 = module0012.$g65$.currentBinding(var29);
        final SubLObject var33 = module0012.$g67$.currentBinding(var29);
        final SubLObject var34 = module0012.$g68$.currentBinding(var29);
        final SubLObject var35 = module0012.$g66$.currentBinding(var29);
        final SubLObject var36 = module0012.$g69$.currentBinding(var29);
        final SubLObject var37 = module0012.$g70$.currentBinding(var29);
        final SubLObject var38 = module0012.$silent_progressP$.currentBinding(var29);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var29);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
            module0012.$g70$.bind((SubLObject)module0618.T, var29);
            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var30) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
            module0012.f474(var30);
            f38080(var28);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var38, var29);
            module0012.$g70$.rebind(var37, var29);
            module0012.$g69$.rebind(var36, var29);
            module0012.$g66$.rebind(var35, var29);
            module0012.$g68$.rebind(var34, var29);
            module0012.$g67$.rebind(var33, var29);
            module0012.$g65$.rebind(var32, var29);
            module0012.$g73$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38080(final SubLObject var28) {
        final SubLObject var29 = f37916((SubLObject)module0618.$ic37$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var29, (SubLObject)module0618.T)) {
            module0414.f28936(var29, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38081(SubLObject var28) {
        if (var28 == module0618.UNPROVIDED) {
            var28 = f37915(module0018.f971(), (SubLObject)module0618.UNPROVIDED);
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0618.NIL;
        final SubLObject var31 = f37941(var28);
        final SubLObject var32 = module0021.$g777$.currentBinding(var29);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
            module0021.f1149(var31);
            final SubLObject var36_448 = module0111.$g1394$.currentBinding(var29);
            final SubLObject var33 = module0111.$g1396$.currentBinding(var29);
            final SubLObject var34 = module0111.$g1398$.currentBinding(var29);
            final SubLObject var35 = module0111.$g1400$.currentBinding(var29);
            final SubLObject var36 = module0111.$g1402$.currentBinding(var29);
            final SubLObject var37 = module0111.$g1404$.currentBinding(var29);
            final SubLObject var38 = module0012.$g64$.currentBinding(var29);
            final SubLObject var39 = module0021.$g750$.currentBinding(var29);
            try {
                module0111.$g1394$.bind((SubLObject)module0618.$ic45$, var29);
                module0111.$g1396$.bind((SubLObject)module0618.$ic46$, var29);
                module0111.$g1398$.bind((SubLObject)module0618.$ic47$, var29);
                module0111.$g1400$.bind((SubLObject)module0618.$ic48$, var29);
                module0111.$g1402$.bind((SubLObject)module0618.$ic49$, var29);
                module0111.$g1404$.bind((SubLObject)module0618.$ic50$, var29);
                module0012.$g64$.bind((SubLObject)module0618.T, var29);
                module0021.$g750$.bind((SubLObject)module0618.T, var29);
                var30 = f37977(var28);
            }
            finally {
                module0021.$g750$.rebind(var39, var29);
                module0012.$g64$.rebind(var38, var29);
                module0111.$g1404$.rebind(var37, var29);
                module0111.$g1402$.rebind(var36, var29);
                module0111.$g1400$.rebind(var35, var29);
                module0111.$g1398$.rebind(var34, var29);
                module0111.$g1396$.rebind(var33, var29);
                module0111.$g1394$.rebind(var36_448, var29);
            }
        }
        finally {
            module0021.$g777$.rebind(var32, var29);
        }
        return var30;
    }
    
    public static SubLObject f37991(final SubLObject var28) {
        f38082(var28);
        f38083(var28);
        f38084(var28);
        f38085(var28);
        f38086(var28);
        f38087(var28);
        f38073(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37994(final SubLObject var28) {
        f38088(var28);
        f37921();
        f38089(var28);
        f37921();
        f38090(var28);
        f37921();
        f38091(var28);
        f37921();
        f38092(var28);
        f37921();
        f38093(var28);
        f37921();
        f38074(var28);
        f37921();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37928() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_449 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_450 = module0160.f10437(var74_449);
            final SubLObject var76_451 = module0160.f10418(var74_449);
            try {
                module0160.f10447(var74_449);
                module0160.f10417(var74_449);
                final SubLObject var74_450 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_451 = module0160.f10437(var74_450);
                final SubLObject var76_452 = module0160.f10418(var74_450);
                try {
                    module0160.f10447(var74_450);
                    module0160.f10417(var74_450);
                    final SubLObject var74_451 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_452 = module0160.f10437(var74_451);
                    final SubLObject var76_453 = module0160.f10418(var74_451);
                    try {
                        module0160.f10447(var74_451);
                        module0160.f10417(var74_451);
                        final SubLObject var74_452 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_453 = module0160.f10437(var74_452);
                        final SubLObject var76_454 = module0160.f10418(var74_452);
                        try {
                            module0160.f10447(var74_452);
                            module0160.f10417(var74_452);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                module0217.f14410();
                                module0217.f14359();
                                module0617.f37901();
                                module0182.f11542();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_453) {
                                    module0160.f10446(var74_452);
                                }
                                if (module0618.NIL == var76_454) {
                                    module0160.f10414(var74_452, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_452) {
                                module0160.f10446(var74_451);
                            }
                            if (module0618.NIL == var76_453) {
                                module0160.f10414(var74_451, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_451) {
                            module0160.f10446(var74_450);
                        }
                        if (module0618.NIL == var76_452) {
                            module0160.f10414(var74_450, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_450) {
                        module0160.f10446(var74_449);
                    }
                    if (module0618.NIL == var76_451) {
                        module0160.f10414(var74_449, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38094(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0021.$g777$.currentBinding(var29);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
            module0021.f1149(f37935());
            f37991(var28);
        }
        finally {
            module0021.$g777$.rebind(var30, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38095(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0021.$g777$.currentBinding(var29);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
            module0021.f1149(f37935());
            final SubLObject var36_461 = module0012.$g64$.currentBinding(var29);
            final SubLObject var31 = module0021.$g750$.currentBinding(var29);
            try {
                module0012.$g64$.bind((SubLObject)module0618.T, var29);
                module0021.$g750$.bind((SubLObject)module0618.T, var29);
                f37994(var28);
            }
            finally {
                module0021.$g750$.rebind(var31, var29);
                module0012.$g64$.rebind(var36_461, var29);
            }
        }
        finally {
            module0021.$g777$.rebind(var30, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38082(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic150$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic151$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var33 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var34 = var30;
            SubLObject var35 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_465 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var35 = compatibility.open_binary(var34, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_465, var29);
                }
                if (!var35.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var34);
                }
                SubLObject var20_466 = var35;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_466 = module0075.f5283(var20_466);
                }
                try {
                    final SubLObject var191_467 = var31;
                    SubLObject var468_469 = (SubLObject)module0618.NIL;
                    try {
                        final SubLObject var36_466 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                            var468_469 = compatibility.open_binary(var191_467, (SubLObject)module0618.$ic73$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var36_466, var29);
                        }
                        if (!var468_469.isStream()) {
                            Errors.error((SubLObject)module0618.$ic65$, var191_467);
                        }
                        SubLObject var36 = var468_469;
                        if (module0618.$ic73$ == module0618.$ic64$) {
                            var36 = module0075.f5283(var36);
                        }
                        try {
                            f38021(var20_466);
                            final SubLObject var37 = module0095.f6846(var20_466, var36);
                            final SubLObject var38 = module0128.f8425();
                            final SubLObject var39 = (SubLObject)module0618.$ic152$;
                            final SubLObject var40 = module0065.f4733(var38);
                            SubLObject var41 = (SubLObject)module0618.ZERO_INTEGER;
                            assert module0618.NIL != Types.stringp(var39) : var39;
                            final SubLObject var36_467 = module0012.$g75$.currentBinding(var29);
                            final SubLObject var37_472 = module0012.$g76$.currentBinding(var29);
                            final SubLObject var42 = module0012.$g77$.currentBinding(var29);
                            final SubLObject var43 = module0012.$g78$.currentBinding(var29);
                            try {
                                module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                module0012.$g78$.bind(Time.get_universal_time(), var29);
                                module0012.f478(var39);
                                final SubLObject var229_473 = var38;
                                if (module0618.NIL == module0065.f4772(var229_473, (SubLObject)module0618.$ic93$)) {
                                    final SubLObject var231_474 = var229_473;
                                    if (module0618.NIL == module0065.f4775(var231_474, (SubLObject)module0618.$ic93$)) {
                                        final SubLObject var44 = module0065.f4740(var231_474);
                                        final SubLObject var45 = (SubLObject)module0618.NIL;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        for (var46 = Sequences.length(var44), var47 = (SubLObject)module0618.NIL, var47 = (SubLObject)module0618.ZERO_INTEGER; var47.numL(var46); var47 = Numbers.add(var47, (SubLObject)module0618.ONE_INTEGER)) {
                                            var48 = ((module0618.NIL != var45) ? Numbers.subtract(var46, var47, (SubLObject)module0618.ONE_INTEGER) : var47);
                                            var49 = Vectors.aref(var44, var48);
                                            if (module0618.NIL == module0065.f4749(var49) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                if (module0618.NIL != module0065.f4749(var49)) {
                                                    var49 = (SubLObject)module0618.$ic93$;
                                                }
                                                module0012.note_percent_progress(var41, var40);
                                                var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                                module0095.f6862(var37);
                                                f38096(var49, var20_466);
                                            }
                                        }
                                    }
                                    final SubLObject var239_475 = var229_473;
                                    if (module0618.NIL == module0065.f4777(var239_475) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                        final SubLObject var50 = module0065.f4738(var239_475);
                                        SubLObject var51 = module0065.f4739(var239_475);
                                        final SubLObject var52 = module0065.f4734(var239_475);
                                        final SubLObject var53 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                        while (var51.numL(var52)) {
                                            final SubLObject var54 = Hashtables.gethash_without_values(var51, var50, var53);
                                            if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var54)) {
                                                module0012.note_percent_progress(var41, var40);
                                                var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                                module0095.f6862(var37);
                                                f38096(var54, var20_466);
                                            }
                                            var51 = Numbers.add(var51, (SubLObject)module0618.ONE_INTEGER);
                                        }
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var43, var29);
                                module0012.$g77$.rebind(var42, var29);
                                module0012.$g76$.rebind(var37_472, var29);
                                module0012.$g75$.rebind(var36_467, var29);
                            }
                        }
                        finally {
                            final SubLObject var36_468 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                streams_high.close(var36, (SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var36_468, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var36_469 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (var468_469.isStream()) {
                                streams_high.close(var468_469, (SubLObject)module0618.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_469, var29);
                        }
                    }
                    f37914(var191_467);
                }
                finally {
                    final SubLObject var36_470 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_466, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_470, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_471 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var35.isStream()) {
                        streams_high.close(var35, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_471, var29);
                }
            }
            f37914(var34);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var33, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var32, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38088(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic150$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic151$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic153$, var30, var31);
            module0164.f10694();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var32 = var30;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_481 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_481 = module0075.f5283(var20_481);
                }
                try {
                    final SubLObject var35 = module0128.f8433();
                    SubLObject var36 = (SubLObject)module0618.ZERO_INTEGER;
                    f38022(var20_481);
                    final SubLObject var37 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic154$);
                        SubLObject var41;
                        for (var41 = (SubLObject)module0618.NIL, var41 = module0021.f1060(var20_481, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var41 != module0618.$ic81$; var41 = module0021.f1060(var20_481, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            var36 = Numbers.add(var36, (SubLObject)module0618.ONE_INTEGER);
                            module0012.note_percent_progress(var36, var35);
                            if (var41.isInteger()) {
                                f38097(var41, var20_481);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var38, var29);
                        module0012.$g75$.rebind(var37, var29);
                    }
                }
                finally {
                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_481, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                    }
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
            f37914(var32);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38096(final SubLObject var238, final SubLObject var20) {
        final SubLObject var239 = module0165.f10719(var238);
        module0021.f1038(module0166.f10780(var238), var20);
        module0021.f1038(var239, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38097(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0166.f10781(var249);
        return module0165.f10725(var250, module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
    }
    
    public static SubLObject f38098(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38097(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f38083(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic156$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic157$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var33 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var34 = var30;
            SubLObject var35 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_483 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var35 = compatibility.open_binary(var34, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_483, var29);
                }
                if (!var35.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var34);
                }
                SubLObject var20_484 = var35;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_484 = module0075.f5283(var20_484);
                }
                try {
                    final SubLObject var191_485 = var31;
                    SubLObject var486_487 = (SubLObject)module0618.NIL;
                    try {
                        final SubLObject var36_484 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                            var486_487 = compatibility.open_binary(var191_485, (SubLObject)module0618.$ic73$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var36_484, var29);
                        }
                        if (!var486_487.isStream()) {
                            Errors.error((SubLObject)module0618.$ic65$, var191_485);
                        }
                        SubLObject var36 = var486_487;
                        if (module0618.$ic73$ == module0618.$ic64$) {
                            var36 = module0075.f5283(var36);
                        }
                        try {
                            f38021(var20_484);
                            final SubLObject var37 = module0095.f6846(var20_484, var36);
                            final SubLObject var38 = module0167.f10788();
                            final SubLObject var39 = (SubLObject)module0618.$ic158$;
                            final SubLObject var40 = module0065.f4733(var38);
                            SubLObject var41 = (SubLObject)module0618.ZERO_INTEGER;
                            assert module0618.NIL != Types.stringp(var39) : var39;
                            final SubLObject var36_485 = module0012.$g75$.currentBinding(var29);
                            final SubLObject var37_490 = module0012.$g76$.currentBinding(var29);
                            final SubLObject var42 = module0012.$g77$.currentBinding(var29);
                            final SubLObject var43 = module0012.$g78$.currentBinding(var29);
                            try {
                                module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                module0012.$g78$.bind(Time.get_universal_time(), var29);
                                module0012.f478(var39);
                                final SubLObject var229_491 = var38;
                                if (module0618.NIL == module0065.f4772(var229_491, (SubLObject)module0618.$ic93$)) {
                                    final SubLObject var231_492 = var229_491;
                                    if (module0618.NIL == module0065.f4775(var231_492, (SubLObject)module0618.$ic93$)) {
                                        final SubLObject var44 = module0065.f4740(var231_492);
                                        final SubLObject var45 = (SubLObject)module0618.NIL;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        for (var46 = Sequences.length(var44), var47 = (SubLObject)module0618.NIL, var47 = (SubLObject)module0618.ZERO_INTEGER; var47.numL(var46); var47 = Numbers.add(var47, (SubLObject)module0618.ONE_INTEGER)) {
                                            var48 = ((module0618.NIL != var45) ? Numbers.subtract(var46, var47, (SubLObject)module0618.ONE_INTEGER) : var47);
                                            var49 = Vectors.aref(var44, var48);
                                            if (module0618.NIL == module0065.f4749(var49) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                if (module0618.NIL != module0065.f4749(var49)) {
                                                    var49 = (SubLObject)module0618.$ic93$;
                                                }
                                                module0012.note_percent_progress(var41, var40);
                                                var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                                module0095.f6862(var37);
                                                f38099(var49, var20_484);
                                            }
                                        }
                                    }
                                    final SubLObject var239_493 = var229_491;
                                    if (module0618.NIL == module0065.f4777(var239_493) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                        final SubLObject var50 = module0065.f4738(var239_493);
                                        SubLObject var51 = module0065.f4739(var239_493);
                                        final SubLObject var52 = module0065.f4734(var239_493);
                                        final SubLObject var53 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                        while (var51.numL(var52)) {
                                            final SubLObject var54 = Hashtables.gethash_without_values(var51, var50, var53);
                                            if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var54)) {
                                                module0012.note_percent_progress(var41, var40);
                                                var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                                module0095.f6862(var37);
                                                f38099(var54, var20_484);
                                            }
                                            var51 = Numbers.add(var51, (SubLObject)module0618.ONE_INTEGER);
                                        }
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var43, var29);
                                module0012.$g77$.rebind(var42, var29);
                                module0012.$g76$.rebind(var37_490, var29);
                                module0012.$g75$.rebind(var36_485, var29);
                            }
                        }
                        finally {
                            final SubLObject var36_486 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                streams_high.close(var36, (SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var36_486, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var36_487 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (var486_487.isStream()) {
                                streams_high.close(var486_487, (SubLObject)module0618.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_487, var29);
                        }
                    }
                    f37914(var191_485);
                }
                finally {
                    final SubLObject var36_488 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_484, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_488, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_489 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var35.isStream()) {
                        streams_high.close(var35, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_489, var29);
                }
            }
            f37914(var34);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var33, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var32, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38089(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic156$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic157$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic159$, var30, var31);
            module0169.f10865();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var32 = var30;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_499 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_499 = module0075.f5283(var20_499);
                }
                try {
                    final SubLObject var35 = module0167.f10796();
                    SubLObject var36 = (SubLObject)module0618.ZERO_INTEGER;
                    f38022(var20_499);
                    final SubLObject var37 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic160$);
                        SubLObject var41;
                        for (var41 = (SubLObject)module0618.NIL, var41 = module0021.f1060(var20_499, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var41 != module0618.$ic81$; var41 = module0021.f1060(var20_499, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            var36 = Numbers.add(var36, (SubLObject)module0618.ONE_INTEGER);
                            module0012.note_percent_progress(var36, var35);
                            if (var41.isInteger()) {
                                f38100(var41, var20_499);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var38, var29);
                        module0012.$g75$.rebind(var37, var29);
                    }
                }
                finally {
                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_499, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                    }
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
            f37914(var32);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38099(final SubLObject var265, final SubLObject var20) {
        final SubLObject var266 = module0171.f10901(var265);
        module0021.f1038(module0172.f10937(var265), var20);
        module0021.f1038(var266, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38100(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0172.f10938(var249);
        return module0171.f10910(var250, module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
    }
    
    public static SubLObject f38101(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38100(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f38084(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic162$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic163$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var33 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var34 = var30;
            SubLObject var35 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_501 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var35 = compatibility.open_binary(var34, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_501, var29);
                }
                if (!var35.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var34);
                }
                SubLObject var20_502 = var35;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_502 = module0075.f5283(var20_502);
                }
                try {
                    final SubLObject var191_503 = var31;
                    SubLObject var504_505 = (SubLObject)module0618.NIL;
                    try {
                        final SubLObject var36_502 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                            var504_505 = compatibility.open_binary(var191_503, (SubLObject)module0618.$ic73$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var36_502, var29);
                        }
                        if (!var504_505.isStream()) {
                            Errors.error((SubLObject)module0618.$ic65$, var191_503);
                        }
                        SubLObject var36 = var504_505;
                        if (module0618.$ic73$ == module0618.$ic64$) {
                            var36 = module0075.f5283(var36);
                        }
                        try {
                            f38021(var20_502);
                            final SubLObject var37 = module0095.f6846(var20_502, var36);
                            if (module0618.NIL != module0190.f11841()) {
                                SubLObject var38 = Sequences.cconcatenate((SubLObject)module0618.$ic164$, (SubLObject)module0618.$ic111$);
                                final SubLObject var39 = module0190.$g2240$.getGlobalValue();
                                SubLObject var40 = (SubLObject)module0618.NIL;
                                try {
                                    var40 = Locks.seize_lock(var39);
                                    final SubLObject var41 = module0190.f11842();
                                    module0012.$g82$.setDynamicValue(var38, var29);
                                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var29);
                                    module0012.$g83$.setDynamicValue(module0093.f6612(var41), var29);
                                    module0012.$g84$.setDynamicValue((SubLObject)module0618.ZERO_INTEGER, var29);
                                    final SubLObject var36_503 = module0012.$g75$.currentBinding(var29);
                                    final SubLObject var37_510 = module0012.$g76$.currentBinding(var29);
                                    final SubLObject var42 = module0012.$g77$.currentBinding(var29);
                                    final SubLObject var43 = module0012.$g78$.currentBinding(var29);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                                        module0012.f478(module0012.$g82$.getDynamicValue(var29));
                                        SubLObject var44 = (SubLObject)module0618.NIL;
                                        SubLObject var48;
                                        for (SubLObject var45 = (SubLObject)module0618.NIL; module0618.NIL == var45; var45 = Types.sublisp_null(var48)) {
                                            var29.resetMultipleValues();
                                            final SubLObject var46 = module0093.f6632(var41, var44, (SubLObject)module0618.NIL);
                                            final SubLObject var47 = var29.secondMultipleValue();
                                            var48 = var29.thirdMultipleValue();
                                            var29.resetMultipleValues();
                                            if (module0618.NIL != var48) {
                                                final SubLObject var49 = var46;
                                                final SubLObject var50 = var47;
                                                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var29), module0012.$g83$.getDynamicValue(var29));
                                                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var29), (SubLObject)module0618.ONE_INTEGER), var29);
                                                if (module0618.NIL == module0190.f11843(var49) && module0618.NIL != module0190.f11844(var49)) {
                                                    final SubLObject var51 = module0190.f11845(var49);
                                                    module0095.f6862(var37);
                                                    f38102(var50, var20_502);
                                                }
                                            }
                                            var44 = var48;
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var43, var29);
                                        module0012.$g77$.rebind(var42, var29);
                                        module0012.$g76$.rebind(var37_510, var29);
                                        module0012.$g75$.rebind(var36_503, var29);
                                    }
                                }
                                finally {
                                    if (module0618.NIL != var40) {
                                        Locks.release_lock(var39);
                                    }
                                }
                                var38 = Sequences.cconcatenate((SubLObject)module0618.$ic164$, (SubLObject)module0618.$ic112$);
                                if (module0618.NIL != module0190.f11841()) {
                                    final SubLObject var52 = module0190.f11847();
                                    module0012.$g82$.setDynamicValue(var38, var29);
                                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var29);
                                    module0012.$g83$.setDynamicValue(Sequences.length(var52), var29);
                                    module0012.$g84$.setDynamicValue((SubLObject)module0618.ZERO_INTEGER, var29);
                                    final SubLObject var36_504 = module0012.$g75$.currentBinding(var29);
                                    final SubLObject var37_511 = module0012.$g76$.currentBinding(var29);
                                    final SubLObject var42 = module0012.$g77$.currentBinding(var29);
                                    final SubLObject var43 = module0012.$g78$.currentBinding(var29);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                                        module0012.f478(module0012.$g82$.getDynamicValue(var29));
                                        SubLObject var53 = var52;
                                        SubLObject var54 = (SubLObject)module0618.NIL;
                                        var54 = var53.first();
                                        while (module0618.NIL != var53) {
                                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var29), module0012.$g83$.getDynamicValue(var29));
                                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var29), (SubLObject)module0618.ONE_INTEGER), var29);
                                            final SubLObject var55 = module0190.f11845(var54);
                                            final SubLObject var56 = module0190.f11848(var55);
                                            module0095.f6862(var37);
                                            f38102(var56, var20_502);
                                            var53 = var53.rest();
                                            var54 = var53.first();
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var43, var29);
                                        module0012.$g77$.rebind(var42, var29);
                                        module0012.$g76$.rebind(var37_511, var29);
                                        module0012.$g75$.rebind(var36_504, var29);
                                    }
                                }
                                else {
                                    final SubLObject var57 = module0190.f11849();
                                    final SubLObject var58 = var38;
                                    final SubLObject var59 = module0065.f4737(var57);
                                    SubLObject var60 = (SubLObject)module0618.ZERO_INTEGER;
                                    assert module0618.NIL != Types.stringp(var58) : var58;
                                    final SubLObject var36_505 = module0012.$g75$.currentBinding(var29);
                                    final SubLObject var37_512 = module0012.$g76$.currentBinding(var29);
                                    final SubLObject var61 = module0012.$g77$.currentBinding(var29);
                                    final SubLObject var62 = module0012.$g78$.currentBinding(var29);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                                        module0012.f478(var58);
                                        final SubLObject var239_516 = var57;
                                        if (module0618.NIL == module0065.f4777(var239_516) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                            final SubLObject var63 = module0065.f4738(var239_516);
                                            SubLObject var64 = module0065.f4739(var239_516);
                                            final SubLObject var65 = module0065.f4734(var239_516);
                                            final SubLObject var66 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                            while (var64.numL(var65)) {
                                                final SubLObject var67 = Hashtables.gethash_without_values(var64, var63, var66);
                                                if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var67)) {
                                                    module0012.note_percent_progress(var60, var59);
                                                    var60 = Numbers.add(var60, (SubLObject)module0618.ONE_INTEGER);
                                                    module0095.f6862(var37);
                                                    f38102(var67, var20_502);
                                                }
                                                var64 = Numbers.add(var64, (SubLObject)module0618.ONE_INTEGER);
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var62, var29);
                                        module0012.$g77$.rebind(var61, var29);
                                        module0012.$g76$.rebind(var37_512, var29);
                                        module0012.$g75$.rebind(var36_505, var29);
                                    }
                                }
                            }
                            else {
                                final SubLObject var68 = module0190.f11849();
                                final SubLObject var69 = (SubLObject)module0618.$ic164$;
                                final SubLObject var70 = module0065.f4733(var68);
                                SubLObject var71 = (SubLObject)module0618.ZERO_INTEGER;
                                assert module0618.NIL != Types.stringp(var69) : var69;
                                final SubLObject var36_506 = module0012.$g75$.currentBinding(var29);
                                final SubLObject var37_513 = module0012.$g76$.currentBinding(var29);
                                final SubLObject var42 = module0012.$g77$.currentBinding(var29);
                                final SubLObject var43 = module0012.$g78$.currentBinding(var29);
                                try {
                                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                    module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                    module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                    module0012.$g78$.bind(Time.get_universal_time(), var29);
                                    module0012.f478(var69);
                                    final SubLObject var229_519 = var68;
                                    if (module0618.NIL == module0065.f4772(var229_519, (SubLObject)module0618.$ic93$)) {
                                        final SubLObject var231_520 = var229_519;
                                        if (module0618.NIL == module0065.f4775(var231_520, (SubLObject)module0618.$ic93$)) {
                                            final SubLObject var72 = module0065.f4740(var231_520);
                                            final SubLObject var73 = (SubLObject)module0618.NIL;
                                            SubLObject var74;
                                            SubLObject var75;
                                            SubLObject var76;
                                            SubLObject var77;
                                            for (var74 = Sequences.length(var72), var75 = (SubLObject)module0618.NIL, var75 = (SubLObject)module0618.ZERO_INTEGER; var75.numL(var74); var75 = Numbers.add(var75, (SubLObject)module0618.ONE_INTEGER)) {
                                                var76 = ((module0618.NIL != var73) ? Numbers.subtract(var74, var75, (SubLObject)module0618.ONE_INTEGER) : var75);
                                                var77 = Vectors.aref(var72, var76);
                                                if (module0618.NIL == module0065.f4749(var77) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                    if (module0618.NIL != module0065.f4749(var77)) {
                                                        var77 = (SubLObject)module0618.$ic93$;
                                                    }
                                                    module0012.note_percent_progress(var71, var70);
                                                    var71 = Numbers.add(var71, (SubLObject)module0618.ONE_INTEGER);
                                                    module0095.f6862(var37);
                                                    f38102(var77, var20_502);
                                                }
                                            }
                                        }
                                        final SubLObject var239_517 = var229_519;
                                        if (module0618.NIL == module0065.f4777(var239_517) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                            final SubLObject var78 = module0065.f4738(var239_517);
                                            SubLObject var79 = module0065.f4739(var239_517);
                                            final SubLObject var80 = module0065.f4734(var239_517);
                                            final SubLObject var81 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                            while (var79.numL(var80)) {
                                                final SubLObject var50 = Hashtables.gethash_without_values(var79, var78, var81);
                                                if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var50)) {
                                                    module0012.note_percent_progress(var71, var70);
                                                    var71 = Numbers.add(var71, (SubLObject)module0618.ONE_INTEGER);
                                                    module0095.f6862(var37);
                                                    f38102(var50, var20_502);
                                                }
                                                var79 = Numbers.add(var79, (SubLObject)module0618.ONE_INTEGER);
                                            }
                                        }
                                    }
                                    module0012.f479();
                                }
                                finally {
                                    module0012.$g78$.rebind(var43, var29);
                                    module0012.$g77$.rebind(var42, var29);
                                    module0012.$g76$.rebind(var37_513, var29);
                                    module0012.$g75$.rebind(var36_506, var29);
                                }
                            }
                        }
                        finally {
                            final SubLObject var36_507 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                streams_high.close(var36, (SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var36_507, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var36_508 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (var504_505.isStream()) {
                                streams_high.close(var504_505, (SubLObject)module0618.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_508, var29);
                        }
                    }
                    f37914(var191_503);
                }
                finally {
                    final SubLObject var36_509 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_502, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_509, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_510 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var35.isStream()) {
                        streams_high.close(var35, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_510, var29);
                }
            }
            f37914(var34);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var33, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var32, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38090(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic162$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic163$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic165$, var30, var31);
            module0189.f11826();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var32 = var30;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_527 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_527 = module0075.f5283(var20_527);
                }
                try {
                    final SubLObject var35 = module0190.f11858();
                    SubLObject var36 = (SubLObject)module0618.ZERO_INTEGER;
                    f38022(var20_527);
                    final SubLObject var37 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic166$);
                        SubLObject var41;
                        for (var41 = (SubLObject)module0618.NIL, var41 = module0021.f1060(var20_527, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var41 != module0618.$ic81$; var41 = module0021.f1060(var20_527, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            var36 = Numbers.add(var36, (SubLObject)module0618.ONE_INTEGER);
                            module0012.note_percent_progress(var36, var35);
                            if (var41.isInteger()) {
                                f38103(var41, var20_527);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var38, var29);
                        module0012.$g75$.rebind(var37, var29);
                    }
                }
                finally {
                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_527, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                    }
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
            f37914(var32);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38102(final SubLObject var511, final SubLObject var20) {
        final SubLObject var512 = module0190.f11878(var511);
        module0021.f1038(module0190.f11886(var511), var20);
        module0021.f1038(var512, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38103(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0190.f11887(var249);
        return module0190.f11883(var250, module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED), (SubLObject)module0618.UNPROVIDED);
    }
    
    public static SubLObject f38104(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38103(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f38085(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic168$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var32 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_529 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_529, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_530 = var34;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_530 = module0075.f5283(var20_530);
                }
                try {
                    f38021(var20_530);
                    final SubLObject var35 = module0174.f11010();
                    final SubLObject var36 = (SubLObject)module0618.$ic169$;
                    final SubLObject var37 = module0065.f4733(var35);
                    SubLObject var38 = (SubLObject)module0618.ZERO_INTEGER;
                    assert module0618.NIL != Types.stringp(var36) : var36;
                    final SubLObject var36_530 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var37_532 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478(var36);
                        final SubLObject var229_533 = var35;
                        if (module0618.NIL == module0065.f4772(var229_533, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var231_534 = var229_533;
                            if (module0618.NIL == module0065.f4775(var231_534, (SubLObject)module0618.$ic93$)) {
                                final SubLObject var41 = module0065.f4740(var231_534);
                                final SubLObject var42 = (SubLObject)module0618.NIL;
                                SubLObject var43;
                                SubLObject var44;
                                SubLObject var45;
                                SubLObject var46;
                                for (var43 = Sequences.length(var41), var44 = (SubLObject)module0618.NIL, var44 = (SubLObject)module0618.ZERO_INTEGER; var44.numL(var43); var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER)) {
                                    var45 = ((module0618.NIL != var42) ? Numbers.subtract(var43, var44, (SubLObject)module0618.ONE_INTEGER) : var44);
                                    var46 = Vectors.aref(var41, var45);
                                    if (module0618.NIL == module0065.f4749(var46) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                        if (module0618.NIL != module0065.f4749(var46)) {
                                            var46 = (SubLObject)module0618.$ic93$;
                                        }
                                        module0012.note_percent_progress(var38, var37);
                                        var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER);
                                        if (module0618.NIL != module0211.f13700(var46)) {
                                            f38105(var46, var20_530);
                                        }
                                    }
                                }
                            }
                            final SubLObject var239_535 = var229_533;
                            if (module0618.NIL == module0065.f4777(var239_535) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                final SubLObject var47 = module0065.f4738(var239_535);
                                SubLObject var48 = module0065.f4739(var239_535);
                                final SubLObject var49 = module0065.f4734(var239_535);
                                final SubLObject var50 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                while (var48.numL(var49)) {
                                    final SubLObject var51 = Hashtables.gethash_without_values(var48, var47, var50);
                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var51)) {
                                        module0012.note_percent_progress(var38, var37);
                                        var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER);
                                        if (module0618.NIL != module0211.f13700(var51)) {
                                            f38105(var51, var20_530);
                                        }
                                    }
                                    var48 = Numbers.add(var48, (SubLObject)module0618.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var37_532, var29);
                        module0012.$g75$.rebind(var36_530, var29);
                    }
                }
                finally {
                    final SubLObject var36_531 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_530, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_531, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_532 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_532, var29);
                }
            }
            f37914(var33);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var32, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38091(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic168$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_539 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_539 = module0075.f5283(var20_539);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_539);
                    f38022(var20_539);
                    final SubLObject var35 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic170$);
                        SubLObject var39;
                        for (var39 = (SubLObject)module0618.NIL, var39 = module0021.f1060(var20_539, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var39 != module0618.$ic81$; var39 = module0021.f1060(var20_539, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_539), var34);
                            if (var39.isInteger()) {
                                f38106(var39, var20_539);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var38, var29);
                        module0012.$g77$.rebind(var37, var29);
                        module0012.$g76$.rebind(var36, var29);
                        module0012.$g75$.rebind(var35, var29);
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_539, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var29);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38105(final SubLObject var268, final SubLObject var20) {
        final SubLObject var269 = module0177.f11242(var268);
        module0021.f1038(module0178.f11391(var268), var20);
        module0021.f1038(var269, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38106(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0178.f11392(var249);
        return module0177.f11244(var250, module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
    }
    
    public static SubLObject f38086(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic171$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var32 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_542 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_542, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_543 = var34;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_543 = module0075.f5283(var20_543);
                }
                try {
                    f38021(var20_543);
                    final SubLObject var35 = (SubLObject)module0618.$ic172$;
                    final SubLObject var36_543 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37_545 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var41 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0223.f14692(var20_543);
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var41, var29);
                        module0012.$g70$.rebind(var40, var29);
                        module0012.$g69$.rebind(var39, var29);
                        module0012.$g66$.rebind(var38, var29);
                        module0012.$g68$.rebind(var37, var29);
                        module0012.$g67$.rebind(var36, var29);
                        module0012.$g65$.rebind(var37_545, var29);
                        module0012.$g73$.rebind(var36_543, var29);
                    }
                }
                finally {
                    final SubLObject var36_544 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_543, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_544, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_545 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_545, var29);
                }
            }
            f37914(var33);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var32, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38092(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic171$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_549 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_549 = module0075.f5283(var20_549);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_549);
                    f38022(var20_549);
                    final SubLObject var35 = (SubLObject)module0618.$ic173$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0223.f14694(var20_549);
                        if (module0021.f1060(var20_549, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_549)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_549, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38087(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic174$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var32 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_551 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_551, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_552 = var34;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_552 = module0075.f5283(var20_552);
                }
                try {
                    f38021(var20_552);
                    final SubLObject var35 = (SubLObject)module0618.$ic175$;
                    final SubLObject var36_552 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37_554 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var41 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        f38107(var20_552);
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var41, var29);
                        module0012.$g70$.rebind(var40, var29);
                        module0012.$g69$.rebind(var39, var29);
                        module0012.$g66$.rebind(var38, var29);
                        module0012.$g68$.rebind(var37, var29);
                        module0012.$g67$.rebind(var36, var29);
                        module0012.$g65$.rebind(var37_554, var29);
                        module0012.$g73$.rebind(var36_552, var29);
                    }
                }
                finally {
                    final SubLObject var36_553 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_552, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_553, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_554 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_554, var29);
                }
            }
            f37914(var33);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var32, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var31, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38093(final SubLObject var28) {
        return f38023(var28, (SubLObject)module0618.$ic174$, (SubLObject)module0618.$ic176$, (SubLObject)module0618.$ic177$);
    }
    
    public static SubLObject f38107(final SubLObject var20) {
        module0021.f1038(module0617.f37860(), var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38108(final SubLObject var20) {
        final SubLObject var21 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        module0617.f37862(var21);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37992(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var31 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var32 = f37916((SubLObject)module0618.$ic178$, var28, (SubLObject)module0618.UNPROVIDED);
            final SubLObject var33 = (SubLObject)module0618.$ic179$;
            final SubLObject var36_557 = module0012.$g73$.currentBinding(var29);
            final SubLObject var37_558 = module0012.$g65$.currentBinding(var29);
            final SubLObject var34 = module0012.$g67$.currentBinding(var29);
            final SubLObject var35 = module0012.$g68$.currentBinding(var29);
            final SubLObject var36 = module0012.$g66$.currentBinding(var29);
            final SubLObject var37 = module0012.$g69$.currentBinding(var29);
            final SubLObject var38 = module0012.$g70$.currentBinding(var29);
            final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var33) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var33);
                final SubLObject var40 = var32;
                SubLObject var41 = (SubLObject)module0618.NIL;
                try {
                    final SubLObject var36_558 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                        var41 = compatibility.open_binary(var40, (SubLObject)module0618.$ic73$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var36_558, var29);
                    }
                    if (!var41.isStream()) {
                        Errors.error((SubLObject)module0618.$ic65$, var40);
                    }
                    SubLObject var20_561 = var41;
                    if (module0618.$ic73$ == module0618.$ic64$) {
                        var20_561 = module0075.f5283(var20_561);
                    }
                    try {
                        f38021(var20_561);
                        module0177.f11229(var20_561);
                    }
                    finally {
                        final SubLObject var36_559 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            streams_high.close(var20_561, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_559, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var36_560 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (var41.isStream()) {
                            streams_high.close(var41, (SubLObject)module0618.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_560, var29);
                    }
                }
                f37914(var40);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var37_558, var29);
                module0012.$g73$.rebind(var36_557, var29);
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var31, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var30, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37995(final SubLObject var28) {
        return f38023(var28, (SubLObject)module0618.$ic178$, (SubLObject)module0618.$ic180$, (SubLObject)module0618.$ic181$);
    }
    
    public static SubLObject f37996(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic182$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic183$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var33 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var34 = var30;
            SubLObject var35 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_567 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var35 = compatibility.open_binary(var34, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_567, var29);
                }
                if (!var35.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var34);
                }
                SubLObject var20_568 = var35;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_568 = module0075.f5283(var20_568);
                }
                try {
                    final SubLObject var191_569 = var31;
                    SubLObject var570_571 = (SubLObject)module0618.NIL;
                    try {
                        final SubLObject var36_568 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                            var570_571 = compatibility.open_binary(var191_569, (SubLObject)module0618.$ic73$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var36_568, var29);
                        }
                        if (!var570_571.isStream()) {
                            Errors.error((SubLObject)module0618.$ic65$, var191_569);
                        }
                        SubLObject var36 = var570_571;
                        if (module0618.$ic73$ == module0618.$ic64$) {
                            var36 = module0075.f5283(var36);
                        }
                        try {
                            f38021(var20_568);
                            final SubLObject var37 = module0095.f6846(var20_568, var36);
                            SubLObject var38 = (SubLObject)module0618.NIL;
                            try {
                                var29.throwStack.push(module0003.$g3$.getGlobalValue());
                                final SubLObject var36_569 = Errors.$error_handler$.currentBinding(var29);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)module0618.$ic59$, var29);
                                    try {
                                        final SubLObject var39 = module0167.f10788();
                                        final SubLObject var40 = (SubLObject)module0618.$ic184$;
                                        final SubLObject var41 = module0065.f4733(var39);
                                        SubLObject var42 = (SubLObject)module0618.ZERO_INTEGER;
                                        assert module0618.NIL != Types.stringp(var40) : var40;
                                        final SubLObject var36_570 = module0012.$g75$.currentBinding(var29);
                                        final SubLObject var37_576 = module0012.$g76$.currentBinding(var29);
                                        final SubLObject var43 = module0012.$g77$.currentBinding(var29);
                                        final SubLObject var44 = module0012.$g78$.currentBinding(var29);
                                        try {
                                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                                            module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                                            module0012.$g77$.bind((SubLObject)module0618.T, var29);
                                            module0012.$g78$.bind(Time.get_universal_time(), var29);
                                            module0012.f478(var40);
                                            final SubLObject var229_577 = var39;
                                            if (module0618.NIL == module0065.f4772(var229_577, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var231_578 = var229_577;
                                                if (module0618.NIL == module0065.f4775(var231_578, (SubLObject)module0618.$ic93$)) {
                                                    final SubLObject var45 = module0065.f4740(var231_578);
                                                    final SubLObject var46 = (SubLObject)module0618.NIL;
                                                    SubLObject var47;
                                                    SubLObject var48;
                                                    SubLObject var49;
                                                    SubLObject var50;
                                                    SubLObject var51;
                                                    for (var47 = Sequences.length(var45), var48 = (SubLObject)module0618.NIL, var48 = (SubLObject)module0618.ZERO_INTEGER; var48.numL(var47); var48 = Numbers.add(var48, (SubLObject)module0618.ONE_INTEGER)) {
                                                        var49 = ((module0618.NIL != var46) ? Numbers.subtract(var47, var48, (SubLObject)module0618.ONE_INTEGER) : var48);
                                                        var50 = Vectors.aref(var45, var49);
                                                        if (module0618.NIL == module0065.f4749(var50) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                            if (module0618.NIL != module0065.f4749(var50)) {
                                                                var50 = (SubLObject)module0618.$ic93$;
                                                            }
                                                            module0012.note_percent_progress(var42, var41);
                                                            var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                                            var51 = module0172.f10915(var50);
                                                            module0095.f6862(var37);
                                                            f38109(var50, var51, var20_568);
                                                        }
                                                    }
                                                }
                                                final SubLObject var239_580 = var229_577;
                                                if (module0618.NIL == module0065.f4777(var239_580) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                    final SubLObject var52 = module0065.f4738(var239_580);
                                                    SubLObject var53 = module0065.f4739(var239_580);
                                                    final SubLObject var54 = module0065.f4734(var239_580);
                                                    final SubLObject var55 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                    while (var53.numL(var54)) {
                                                        final SubLObject var56 = Hashtables.gethash_without_values(var53, var52, var55);
                                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var56)) {
                                                            module0012.note_percent_progress(var42, var41);
                                                            var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                                            final SubLObject var57 = module0172.f10915(var56);
                                                            module0095.f6862(var37);
                                                            f38109(var56, var57, var20_568);
                                                        }
                                                        var53 = Numbers.add(var53, (SubLObject)module0618.ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            module0012.f479();
                                        }
                                        finally {
                                            module0012.$g78$.rebind(var44, var29);
                                            module0012.$g77$.rebind(var43, var29);
                                            module0012.$g76$.rebind(var37_576, var29);
                                            module0012.$g75$.rebind(var36_570, var29);
                                        }
                                    }
                                    catch (Throwable var58) {
                                        Errors.handleThrowable(var58, (SubLObject)module0618.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var36_569, var29);
                                }
                            }
                            catch (Throwable var59) {
                                var38 = Errors.handleThrowable(var59, module0003.$g3$.getGlobalValue());
                            }
                            finally {
                                var29.throwStack.pop();
                            }
                            if (var38.isString()) {
                                Errors.warn((SubLObject)module0618.$ic185$, var38);
                            }
                        }
                        finally {
                            final SubLObject var36_571 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                                streams_high.close(var36, (SubLObject)module0618.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var36_571, var29);
                            }
                        }
                    }
                    finally {
                        final SubLObject var36_572 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (var570_571.isStream()) {
                                streams_high.close(var570_571, (SubLObject)module0618.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_572, var29);
                        }
                    }
                    f37914(var191_569);
                }
                finally {
                    final SubLObject var36_573 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_568, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_573, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_574 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var35.isStream()) {
                        streams_high.close(var35, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_574, var29);
                }
            }
            f37914(var34);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var33, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var32, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38008(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic182$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic183$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue() && module0618.NIL != Filesys.probe_file(var31)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic186$, var30, var31);
            module0170.f10892();
        }
        else if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var33;
            final SubLObject var32 = var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var35 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var35, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_587 = var34;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_587 = module0075.f5283(var20_587);
                }
                try {
                    final SubLObject var36 = streams_high.file_length(var20_587);
                    f38022(var20_587);
                    final SubLObject var37 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic187$);
                        SubLObject var41;
                        for (var41 = (SubLObject)module0618.NIL, var41 = module0021.f1060(var20_587, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var41 != module0618.$ic81$; var41 = module0021.f1060(var20_587, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_587), var36);
                            if (var41.isInteger()) {
                                f38110(var41, var20_587);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var40, var29);
                        module0012.$g77$.rebind(var39, var29);
                        module0012.$g76$.rebind(var38, var29);
                        module0012.$g75$.rebind(var37, var29);
                    }
                }
                finally {
                    final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_587, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                    }
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
            f37914(var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38109(final SubLObject var265, final SubLObject var579, final SubLObject var20) {
        module0021.f1038(module0172.f10937(var265), var20);
        module0021.f1038(var579, var20);
        return var265;
    }
    
    public static SubLObject f38110(final SubLObject var249, final SubLObject var20) {
        final SubLObject var250 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        module0171.f10898(var249, var250);
        return var250;
    }
    
    public static SubLObject f38111(final SubLObject var249, final SubLObject var20) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        SubLObject var251 = (SubLObject)module0618.NIL;
        final SubLObject var252 = module0021.$g753$.currentBinding(var250);
        try {
            module0021.$g753$.bind((SubLObject)module0618.NIL, var250);
            var251 = f38110(var249, var20);
        }
        finally {
            module0021.$g753$.rebind(var252, var250);
        }
        return var251;
    }
    
    public static SubLObject f37997(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic188$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_589 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_589 = module0075.f5283(var20_589);
            }
            try {
                f38021(var20_589);
                final SubLObject var34 = (SubLObject)module0618.$ic189$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0021.f1038((SubLObject)module0618.NIL, var20_589);
                    module0021.f1038(module0146.$g2067$.getGlobalValue(), var20_589);
                    module0021.f1038((SubLObject)module0618.NIL, var20_589);
                    module0021.f1038(Numbers.add(module0018.f971(), (SubLObject)module0618.ONE_INTEGER), var20_589);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_589, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38009(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic188$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_591 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_591 = module0075.f5283(var20_591);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_591);
                    f38022(var20_591);
                    final SubLObject var35 = (SubLObject)module0618.$ic190$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0021.f1060(var20_591, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        module0146.$g2067$.setGlobalValue(module0021.f1060(var20_591, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0021.f1060(var20_591, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        module0018.f969(module0021.f1060(var20_591, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        if (module0021.f1060(var20_591, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_591)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_591, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37998(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic191$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var32 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_594 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_594, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_595 = var34;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_595 = module0075.f5283(var20_595);
                }
                try {
                    f38021(var20_595);
                    final SubLObject var35 = f37916((SubLObject)module0618.$ic192$, var28, (SubLObject)module0618.UNPROVIDED);
                    final SubLObject var36 = f37916((SubLObject)module0618.$ic193$, var28, (SubLObject)module0618.UNPROVIDED);
                    SubLObject var37 = (SubLObject)module0618.NIL;
                    try {
                        var37 = module0095.f6845(var35, var36, (SubLObject)module0618.$ic73$, (SubLObject)module0618.$ic38$, (SubLObject)module0618.$ic38$, (SubLObject)module0618.UNPROVIDED);
                        final SubLObject var38 = module0095.f6852(var37);
                        f38021(var38);
                        final SubLObject var39 = (SubLObject)module0618.$ic194$;
                        final SubLObject var36_595 = module0012.$g73$.currentBinding(var29);
                        final SubLObject var37_599 = module0012.$g65$.currentBinding(var29);
                        final SubLObject var40 = module0012.$g67$.currentBinding(var29);
                        final SubLObject var41 = module0012.$g68$.currentBinding(var29);
                        final SubLObject var42 = module0012.$g66$.currentBinding(var29);
                        final SubLObject var43 = module0012.$g69$.currentBinding(var29);
                        final SubLObject var44 = module0012.$g70$.currentBinding(var29);
                        final SubLObject var45 = module0012.$silent_progressP$.currentBinding(var29);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var29);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g70$.bind((SubLObject)module0618.T, var29);
                            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var39) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                            module0012.f474(var39);
                            final SubLObject var46 = module0137.f8937();
                            module0021.f1038(Sequences.length(var46), var20_595);
                            SubLObject var47 = var46;
                            SubLObject var48 = (SubLObject)module0618.NIL;
                            var48 = var47.first();
                            while (module0618.NIL != var47) {
                                module0242.f15669(var48);
                                final SubLObject var49 = module0096.f6947(module0137.f8919(var48), var37, (SubLObject)module0618.$ic195$);
                                module0021.f1038(module0137.f8917(var48), var20_595);
                                module0021.f1038(var49, var20_595);
                                module0242.f15670(var48);
                                var47 = var47.rest();
                                var48 = var47.first();
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var45, var29);
                            module0012.$g70$.rebind(var44, var29);
                            module0012.$g69$.rebind(var43, var29);
                            module0012.$g66$.rebind(var42, var29);
                            module0012.$g68$.rebind(var41, var29);
                            module0012.$g67$.rebind(var40, var29);
                            module0012.$g65$.rebind(var37_599, var29);
                            module0012.$g73$.rebind(var36_595, var29);
                        }
                    }
                    finally {
                        final SubLObject var36_596 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            if (module0618.NIL != module0095.f6844(var37)) {
                                module0095.f6849(var37);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_596, var29);
                        }
                    }
                    f37914(var36);
                    f37914(var35);
                    f38112(var20_595);
                }
                finally {
                    final SubLObject var36_597 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_595, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_597, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_598 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_598, var29);
                }
            }
            f37914(var33);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var32, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var31, var29);
        }
        f38113(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38114(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic191$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_607 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_607 = module0075.f5283(var20_607);
            }
            try {
                f38021(var20_607);
                final SubLObject var34 = (SubLObject)module0618.$ic196$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    final SubLObject var43 = module0067.f4903(module0137.f8931());
                    module0021.f1038(Sequences.length(var43), var20_607);
                    SubLObject var44 = var43;
                    SubLObject var45 = (SubLObject)module0618.NIL;
                    var45 = var44.first();
                    while (module0618.NIL != var44) {
                        module0021.f1038(module0137.f8917(var45), var20_607);
                        module0021.f1038(module0137.f8919(var45), var20_607);
                        var44 = var44.rest();
                        var45 = var44.first();
                    }
                    f38112(var20_607);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_607, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var46, var29);
                }
            }
        }
        finally {
            final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var47, var29);
            }
        }
        f37914(var31);
        f38113(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38010(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic191$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic192$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = f37916((SubLObject)module0618.$ic193$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            if (module0618.NIL != f37919(var31, (SubLObject)module0618.$ic197$) && module0618.NIL != f37919(var32, (SubLObject)module0618.$ic197$)) {
                module0242.f15656(var31, var32);
            }
            final SubLObject var33 = var30;
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var35 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var35, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_609 = var34;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_609 = module0075.f5283(var20_609);
                }
                try {
                    final SubLObject var36 = streams_high.file_length(var20_609);
                    f38022(var20_609);
                    module0324.f21913();
                    final SubLObject var37 = module0021.f1060(var20_609, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                    final SubLObject var38 = module0021.$g747$.currentBinding(var29);
                    final SubLObject var39 = module0021.$g748$.currentBinding(var29);
                    try {
                        module0021.$g747$.bind((SubLObject)module0618.T, var29);
                        module0021.$g748$.bind((SubLObject)module0618.NIL, var29);
                        final SubLObject var40 = (SubLObject)module0618.$ic198$;
                        final SubLObject var36_611 = module0012.$g73$.currentBinding(var29);
                        final SubLObject var37_612 = module0012.$g65$.currentBinding(var29);
                        final SubLObject var41 = module0012.$g67$.currentBinding(var29);
                        final SubLObject var42 = module0012.$g68$.currentBinding(var29);
                        final SubLObject var43 = module0012.$g66$.currentBinding(var29);
                        final SubLObject var44 = module0012.$g69$.currentBinding(var29);
                        final SubLObject var45 = module0012.$g70$.currentBinding(var29);
                        final SubLObject var46 = module0012.$silent_progressP$.currentBinding(var29);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var29);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g70$.bind((SubLObject)module0618.T, var29);
                            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                            module0012.f474(var40);
                            module0255.f16518((SubLObject)module0618.T);
                            SubLObject var47;
                            SubLObject var48;
                            SubLObject var49;
                            SubLObject var50;
                            for (var47 = (SubLObject)module0618.NIL, var47 = (SubLObject)module0618.ZERO_INTEGER; var47.numL(var37); var47 = Numbers.add(var47, (SubLObject)module0618.ONE_INTEGER)) {
                                if (module0021.f1088(var20_609, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED).eql((SubLObject)module0618.$ic199$)) {
                                    var48 = module0021.f1060(var20_609, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                                    var49 = module0021.f1060(var20_609, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                                    var50 = module0137.f8955(var48);
                                    if (module0618.NIL != module0128.f8463(var48, (SubLObject)module0618.UNPROVIDED) && var49.isHashtable() && module0618.NIL != module0137.f8885(var50)) {
                                        module0137.f8914(var50, (SubLObject)module0618.$ic200$, var49);
                                    }
                                }
                            }
                            if (module0618.NIL != module0137.f8931()) {
                                module0255.f16517();
                            }
                            f38115(var20_609);
                            if (module0021.f1060(var20_609, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                                Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var36, compatibility.get_file_position(var20_609)), var30);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var46, var29);
                            module0012.$g70$.rebind(var45, var29);
                            module0012.$g69$.rebind(var44, var29);
                            module0012.$g66$.rebind(var43, var29);
                            module0012.$g68$.rebind(var42, var29);
                            module0012.$g67$.rebind(var41, var29);
                            module0012.$g65$.rebind(var37_612, var29);
                            module0012.$g73$.rebind(var36_611, var29);
                        }
                    }
                    finally {
                        module0021.$g748$.rebind(var39, var29);
                        module0021.$g747$.rebind(var38, var29);
                    }
                }
                finally {
                    final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_609, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var51, var29);
                    }
                }
            }
            finally {
                final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var52, var29);
                }
            }
            f37914(var33);
        }
        final SubLObject var53 = module0147.$g2094$.currentBinding(var29);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var29);
        try {
            module0147.$g2094$.bind((SubLObject)module0618.$ic201$, var29);
            module0147.$g2095$.bind(module0618.$ic202$, var29);
            SubLObject var55 = module0137.f8931();
            SubLObject var56 = (SubLObject)module0618.NIL;
            var56 = var55.first();
            while (module0618.NIL != var55) {
                SubLObject var58;
                final SubLObject var57 = var58 = var56;
                SubLObject var59 = (SubLObject)module0618.NIL;
                SubLObject var60 = (SubLObject)module0618.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)module0618.$ic203$);
                var59 = var58.first();
                var58 = (var60 = var58.rest());
                final SubLObject var61 = module0244.f15766(var60);
                if (!var61.isHashtable() || (module0618.NIL != module0030.f1594(var61) && (!module0217.f14247(module0137.f8917(var60), (SubLObject)module0618.UNPROVIDED).isZero() || module0618.NIL != module0260.f17042(module0137.f8917(var60), (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                    module0248.f15948(var60);
                }
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var54, var29);
            module0147.$g2094$.rebind(var53, var29);
        }
        f38116(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37929() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_618 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_619 = module0160.f10437(var74_618);
            final SubLObject var76_620 = module0160.f10418(var74_618);
            try {
                module0160.f10447(var74_618);
                module0160.f10417(var74_618);
                final SubLObject var74_619 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_620 = module0160.f10437(var74_619);
                final SubLObject var76_621 = module0160.f10418(var74_619);
                try {
                    module0160.f10447(var74_619);
                    module0160.f10417(var74_619);
                    final SubLObject var74_620 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_621 = module0160.f10437(var74_620);
                    final SubLObject var76_622 = module0160.f10418(var74_620);
                    try {
                        module0160.f10447(var74_620);
                        module0160.f10417(var74_620);
                        final SubLObject var74_621 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_622 = module0160.f10437(var74_621);
                        final SubLObject var76_623 = module0160.f10418(var74_621);
                        try {
                            module0160.f10447(var74_621);
                            module0160.f10417(var74_621);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                module0248.f15945();
                                if (module0618.NIL != module0131.f8563()) {
                                    module0328.f22150();
                                    f38117();
                                }
                                else {
                                    Errors.warn((SubLObject)module0618.$ic204$);
                                }
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_622) {
                                    module0160.f10446(var74_621);
                                }
                                if (module0618.NIL == var76_623) {
                                    module0160.f10414(var74_621, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_621) {
                                module0160.f10446(var74_620);
                            }
                            if (module0618.NIL == var76_622) {
                                module0160.f10414(var74_620, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_620) {
                            module0160.f10446(var74_619);
                        }
                        if (module0618.NIL == var76_621) {
                            module0160.f10414(var74_619, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_619) {
                        module0160.f10446(var74_618);
                    }
                    if (module0618.NIL == var76_620) {
                        module0160.f10414(var74_618, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38112(final SubLObject var20) {
        f38118(var20);
        f38119(var20);
        f38120(var20);
        module0021.f1038((SubLObject)module0618.$ic205$, var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38118(final SubLObject var20) {
        module0021.f1038((SubLObject)module0618.$ic206$, var20);
        module0021.f1038(module0248.$g2467$.getGlobalValue(), var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38119(final SubLObject var20) {
        module0021.f1038((SubLObject)module0618.$ic207$, var20);
        module0021.f1038(module0248.f15984(), var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38120(final SubLObject var20) {
        module0021.f1038((SubLObject)module0618.$ic208$, var20);
        module0021.f1038(module0248.f15985(), var20);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38115(final SubLObject var20) {
        SubLObject var21 = (SubLObject)module0618.NIL;
        while (module0618.$ic205$ != var21) {
            var21 = module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
            if (var21.isHashtable()) {
                module0248.$g2467$.setGlobalValue(var21);
                module0248.f15988();
                var21 = (SubLObject)module0618.$ic205$;
            }
            else {
                final SubLObject var22 = var21;
                if (var22.eql((SubLObject)module0618.$ic206$)) {
                    f38121(var20);
                }
                else if (var22.eql((SubLObject)module0618.$ic207$)) {
                    f38122(var20);
                }
                else if (var22.eql((SubLObject)module0618.$ic208$)) {
                    f38123(var20);
                }
                else {
                    if (var22.eql((SubLObject)module0618.$ic205$)) {
                        continue;
                    }
                    Errors.warn((SubLObject)module0618.$ic209$, var21);
                }
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38121(final SubLObject var20) {
        module0248.$g2467$.setGlobalValue(module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38122(final SubLObject var20) {
        module0248.f15982(module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38123(final SubLObject var20) {
        module0248.f15983(module0021.f1060(var20, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37999(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic210$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_633 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_633 = module0075.f5283(var20_633);
            }
            try {
                f38021(var20_633);
                final SubLObject var34 = (SubLObject)module0618.$ic211$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0021.f1038(module0268.$g2548$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2550$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2540$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2541$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2534$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2535$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2536$.getGlobalValue(), var20_633);
                    module0021.f1038(module0268.$g2537$.getGlobalValue(), var20_633);
                    if (module0618.NIL != module0067.f4852(module0268.$g2553$.getGlobalValue()) && module0618.NIL != module0067.f4852(module0268.$g2554$.getGlobalValue())) {
                        module0021.f1038(module0268.$g2553$.getGlobalValue(), var20_633);
                        module0021.f1038(module0268.$g2554$.getGlobalValue(), var20_633);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_633, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38011(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic210$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_635 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_635 = module0075.f5283(var20_635);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_635);
                    f38022(var20_635);
                    final SubLObject var35 = (SubLObject)module0618.$ic212$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0268.$g2548$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2550$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2540$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2541$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2534$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2535$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2536$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0268.$g2537$.setGlobalValue(module0021.f1060(var20_635, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        SubLObject var44 = module0021.f1060(var20_635, (SubLObject)module0618.NIL, (SubLObject)module0618.NIL);
                        if (module0618.NIL != var44) {
                            module0268.$g2553$.setGlobalValue(var44);
                        }
                        var44 = module0021.f1060(var20_635, (SubLObject)module0618.NIL, (SubLObject)module0618.NIL);
                        if (module0618.NIL != var44) {
                            module0268.$g2554$.setGlobalValue(var44);
                        }
                        module0268.f17598();
                        if (module0021.f1060(var20_635, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_635)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_635, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                    }
                }
            }
            finally {
                final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var46, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37930() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_637 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_638 = module0160.f10437(var74_637);
            final SubLObject var76_639 = module0160.f10418(var74_637);
            try {
                module0160.f10447(var74_637);
                module0160.f10417(var74_637);
                final SubLObject var74_638 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_639 = module0160.f10437(var74_638);
                final SubLObject var76_640 = module0160.f10418(var74_638);
                try {
                    module0160.f10447(var74_638);
                    module0160.f10417(var74_638);
                    final SubLObject var74_639 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_640 = module0160.f10437(var74_639);
                    final SubLObject var76_641 = module0160.f10418(var74_639);
                    try {
                        module0160.f10447(var74_639);
                        module0160.f10417(var74_639);
                        final SubLObject var74_640 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_641 = module0160.f10437(var74_640);
                        final SubLObject var76_642 = module0160.f10418(var74_640);
                        try {
                            module0160.f10447(var74_640);
                            module0160.f10417(var74_640);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                module0268.f17651();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_641) {
                                    module0160.f10446(var74_640);
                                }
                                if (module0618.NIL == var76_642) {
                                    module0160.f10414(var74_640, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_640) {
                                module0160.f10446(var74_639);
                            }
                            if (module0618.NIL == var76_641) {
                                module0160.f10414(var74_639, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_639) {
                            module0160.f10446(var74_638);
                        }
                        if (module0618.NIL == var76_640) {
                            module0160.f10414(var74_638, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_638) {
                        module0160.f10446(var74_637);
                    }
                    if (module0618.NIL == var76_639) {
                        module0160.f10414(var74_637, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38000(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic213$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_650 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_650 = module0075.f5283(var20_650);
            }
            try {
                f38021(var20_650);
                final SubLObject var34 = (SubLObject)module0618.$ic214$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0549.f33947(var20_650);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_650, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38012(final SubLObject var28) {
        return f38023(var28, (SubLObject)module0618.$ic213$, (SubLObject)module0618.$ic215$, (SubLObject)module0618.$ic216$);
    }
    
    public static SubLObject f38124(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic8$, (SubLObject)module0618.$ic217$, ConsesLow.append(var5, (SubLObject)module0618.NIL));
    }
    
    public static SubLObject f38001(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4749$.getDynamicValue(var29)) {
            f38020();
        }
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic218$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_655 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_655 = module0075.f5283(var20_655);
            }
            try {
                f38021(var20_655);
                final SubLObject var34 = (SubLObject)module0618.$ic219$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0021.f1038(module0308.$g2788$.getGlobalValue(), var20_655);
                    module0021.f1038((SubLObject)module0618.NIL, var20_655);
                    module0021.f1038((SubLObject)module0618.NIL, var20_655);
                    module0021.f1038((SubLObject)module0618.NIL, var20_655);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_655, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38013(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic218$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_657 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_657 = module0075.f5283(var20_657);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_657);
                    f38022(var20_657);
                    final SubLObject var35 = (SubLObject)module0618.$ic220$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        SubLObject var44 = (SubLObject)module0618.NIL;
                        module0308.$g2788$.setGlobalValue(module0021.f1060(var20_657, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        var44 = module0021.f1060(var20_657, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        var44 = module0021.f1060(var20_657, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        var44 = module0021.f1060(var20_657, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
                        module0308.f20913();
                        if (module0021.f1060(var20_657, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_657)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_657, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                    }
                }
            }
            finally {
                final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var46, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38020() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_659 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_660 = module0160.f10437(var74_659);
            final SubLObject var76_661 = module0160.f10418(var74_659);
            try {
                module0160.f10447(var74_659);
                module0160.f10417(var74_659);
                final SubLObject var74_660 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_661 = module0160.f10437(var74_660);
                final SubLObject var76_662 = module0160.f10418(var74_660);
                try {
                    module0160.f10447(var74_660);
                    module0160.f10417(var74_660);
                    final SubLObject var74_661 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_662 = module0160.f10437(var74_661);
                    final SubLObject var76_663 = module0160.f10418(var74_661);
                    try {
                        module0160.f10447(var74_661);
                        module0160.f10417(var74_661);
                        final SubLObject var74_662 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_663 = module0160.f10437(var74_662);
                        final SubLObject var76_664 = module0160.f10418(var74_662);
                        try {
                            module0160.f10447(var74_662);
                            module0160.f10417(var74_662);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                final SubLObject var38 = (SubLObject)module0618.$ic221$;
                                final SubLObject var36_671 = module0012.$g73$.currentBinding(var33);
                                final SubLObject var39 = module0012.$g65$.currentBinding(var33);
                                final SubLObject var40 = module0012.$g67$.currentBinding(var33);
                                final SubLObject var41 = module0012.$g68$.currentBinding(var33);
                                final SubLObject var42 = module0012.$g66$.currentBinding(var33);
                                final SubLObject var43 = module0012.$g69$.currentBinding(var33);
                                final SubLObject var44 = module0012.$g70$.currentBinding(var33);
                                final SubLObject var45 = module0012.$silent_progressP$.currentBinding(var33);
                                try {
                                    module0012.$g73$.bind(Time.get_universal_time(), var33);
                                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var33), var33);
                                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var33);
                                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                                    module0012.$g70$.bind((SubLObject)module0618.T, var33);
                                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var38) ? module0012.$silent_progressP$.getDynamicValue(var33) : module0618.T), var33);
                                    module0012.f474(var38);
                                    module0308.f20911();
                                    module0012.f475();
                                }
                                finally {
                                    module0012.$silent_progressP$.rebind(var45, var33);
                                    module0012.$g70$.rebind(var44, var33);
                                    module0012.$g69$.rebind(var43, var33);
                                    module0012.$g66$.rebind(var42, var33);
                                    module0012.$g68$.rebind(var41, var33);
                                    module0012.$g67$.rebind(var40, var33);
                                    module0012.$g65$.rebind(var39, var33);
                                    module0012.$g73$.rebind(var36_671, var33);
                                }
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_663) {
                                    module0160.f10446(var74_662);
                                }
                                if (module0618.NIL == var76_664) {
                                    module0160.f10414(var74_662, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var46, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_662) {
                                module0160.f10446(var74_661);
                            }
                            if (module0618.NIL == var76_663) {
                                module0160.f10414(var74_661, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var47, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_661) {
                            module0160.f10446(var74_660);
                        }
                        if (module0618.NIL == var76_662) {
                            module0160.f10414(var74_660, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var48, var33);
                    }
                }
            }
            finally {
                final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_660) {
                        module0160.f10446(var74_659);
                    }
                    if (module0618.NIL == var76_661) {
                        module0160.f10414(var74_659, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var49, var33);
                }
            }
        }
        finally {
            final SubLObject var50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var50, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38002(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic222$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_673 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_673 = module0075.f5283(var20_673);
            }
            try {
                f38021(var20_673);
                final SubLObject var34 = (SubLObject)module0618.$ic223$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0306.f20728(var20_673);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_673, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38014(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic222$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_675 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_675 = module0075.f5283(var20_675);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_675);
                    f38022(var20_675);
                    final SubLObject var35 = (SubLObject)module0618.$ic224$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0306.f20729(var20_675);
                        if (module0021.f1060(var20_675, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_675)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_675, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38005(final SubLObject var187) {
        final SubLThread var188 = SubLProcess.currentSubLThread();
        final SubLObject var189 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var188);
        final SubLObject var190 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var188);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var188);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var188), var188);
            final SubLObject var191 = f37916((SubLObject)module0618.$ic225$, var187, (SubLObject)module0618.UNPROVIDED);
            final SubLObject var192 = module0322.f21840(var187);
            final SubLObject var193 = module0322.f21841(var187);
            SubLObject var194 = (SubLObject)module0618.NIL;
            try {
                var194 = module0095.f6845(var192, var193, (SubLObject)module0618.$ic73$, (SubLObject)module0618.$ic38$, (SubLObject)module0618.$ic38$, (SubLObject)module0618.UNPROVIDED);
                final SubLObject var195 = var191;
                SubLObject var196 = (SubLObject)module0618.NIL;
                try {
                    final SubLObject var36_680 = stream_macros.$stream_requires_locking$.currentBinding(var188);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var188);
                        var196 = compatibility.open_binary(var195, (SubLObject)module0618.$ic73$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var36_680, var188);
                    }
                    if (!var196.isStream()) {
                        Errors.error((SubLObject)module0618.$ic65$, var195);
                    }
                    SubLObject var20_681 = var196;
                    if (module0618.$ic73$ == module0618.$ic64$) {
                        var20_681 = module0075.f5283(var20_681);
                    }
                    try {
                        f38021(var20_681);
                        final SubLObject var197 = (SubLObject)module0618.$ic226$;
                        final SubLObject var36_681 = module0012.$g73$.currentBinding(var188);
                        final SubLObject var37_683 = module0012.$g65$.currentBinding(var188);
                        final SubLObject var198 = module0012.$g67$.currentBinding(var188);
                        final SubLObject var199 = module0012.$g68$.currentBinding(var188);
                        final SubLObject var200 = module0012.$g66$.currentBinding(var188);
                        final SubLObject var201 = module0012.$g69$.currentBinding(var188);
                        final SubLObject var202 = module0012.$g70$.currentBinding(var188);
                        final SubLObject var203 = module0012.$silent_progressP$.currentBinding(var188);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var188);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var188), var188);
                            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var188);
                            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var188);
                            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var188);
                            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var188);
                            module0012.$g70$.bind((SubLObject)module0618.T, var188);
                            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var197) ? module0012.$silent_progressP$.getDynamicValue(var188) : module0618.T), var188);
                            module0012.f474(var197);
                            module0322.f21844(var20_681, var194);
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var203, var188);
                            module0012.$g70$.rebind(var202, var188);
                            module0012.$g69$.rebind(var201, var188);
                            module0012.$g66$.rebind(var200, var188);
                            module0012.$g68$.rebind(var199, var188);
                            module0012.$g67$.rebind(var198, var188);
                            module0012.$g65$.rebind(var37_683, var188);
                            module0012.$g73$.rebind(var36_681, var188);
                        }
                    }
                    finally {
                        final SubLObject var36_682 = Threads.$is_thread_performing_cleanupP$.currentBinding(var188);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var188);
                            streams_high.close(var20_681, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var36_682, var188);
                        }
                    }
                }
                finally {
                    final SubLObject var36_683 = Threads.$is_thread_performing_cleanupP$.currentBinding(var188);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var188);
                        if (var196.isStream()) {
                            streams_high.close(var196, (SubLObject)module0618.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_683, var188);
                    }
                }
                f37914(var195);
            }
            finally {
                final SubLObject var36_684 = Threads.$is_thread_performing_cleanupP$.currentBinding(var188);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var188);
                    if (module0618.NIL != module0095.f6844(var194)) {
                        module0095.f6849(var194);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_684, var188);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var190, var188);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var189, var188);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38017(final SubLObject var187) {
        final SubLObject var188 = f38023(var187, (SubLObject)module0618.$ic225$, (SubLObject)module0618.$ic227$, (SubLObject)module0618.$ic228$);
        module0322.f21842(var187, module0021.f1153());
        return var188;
    }
    
    public static SubLObject f38006(final SubLObject var187) {
        final SubLThread var188 = SubLProcess.currentSubLThread();
        final SubLObject var190;
        final SubLObject var189 = var190 = f37916((SubLObject)module0618.$ic229$, var187, (SubLObject)module0618.UNPROVIDED);
        SubLObject var191 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var192 = stream_macros.$stream_requires_locking$.currentBinding(var188);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var188);
                var191 = compatibility.open_binary(var190, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var192, var188);
            }
            if (!var191.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var190);
            }
            SubLObject var20_689 = var191;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_689 = module0075.f5283(var20_689);
            }
            try {
                f38021(var20_689);
                final SubLObject var193 = (SubLObject)module0618.$ic230$;
                final SubLObject var194 = module0012.$g73$.currentBinding(var188);
                final SubLObject var195 = module0012.$g65$.currentBinding(var188);
                final SubLObject var196 = module0012.$g67$.currentBinding(var188);
                final SubLObject var197 = module0012.$g68$.currentBinding(var188);
                final SubLObject var198 = module0012.$g66$.currentBinding(var188);
                final SubLObject var199 = module0012.$g69$.currentBinding(var188);
                final SubLObject var200 = module0012.$g70$.currentBinding(var188);
                final SubLObject var201 = module0012.$silent_progressP$.currentBinding(var188);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var188);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var188), var188);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var188);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var188);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var188);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var188);
                    module0012.$g70$.bind((SubLObject)module0618.T, var188);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var193) ? module0012.$silent_progressP$.getDynamicValue(var188) : module0618.T), var188);
                    module0012.f474(var193);
                    module0295.f19905(var20_689);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var201, var188);
                    module0012.$g70$.rebind(var200, var188);
                    module0012.$g69$.rebind(var199, var188);
                    module0012.$g66$.rebind(var198, var188);
                    module0012.$g68$.rebind(var197, var188);
                    module0012.$g67$.rebind(var196, var188);
                    module0012.$g65$.rebind(var195, var188);
                    module0012.$g73$.rebind(var194, var188);
                }
            }
            finally {
                final SubLObject var202 = Threads.$is_thread_performing_cleanupP$.currentBinding(var188);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var188);
                    streams_high.close(var20_689, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var202, var188);
                }
            }
        }
        finally {
            final SubLObject var203 = Threads.$is_thread_performing_cleanupP$.currentBinding(var188);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var188);
                if (var191.isStream()) {
                    streams_high.close(var191, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var203, var188);
            }
        }
        f37914(var190);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38018(final SubLObject var187) {
        return f38023(var187, (SubLObject)module0618.$ic229$, (SubLObject)module0618.$ic231$, (SubLObject)module0618.$ic232$);
    }
    
    public static SubLObject f38113(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        final SubLObject var31 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind((SubLObject)module0618.$ic38$, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            final SubLObject var33;
            final SubLObject var32 = var33 = f37916((SubLObject)module0618.$ic233$, var28, (SubLObject)module0618.UNPROVIDED);
            SubLObject var34 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var36_691 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var34 = compatibility.open_binary(var33, (SubLObject)module0618.$ic73$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var36_691, var29);
                }
                if (!var34.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var33);
                }
                SubLObject var20_692 = var34;
                if (module0618.$ic73$ == module0618.$ic64$) {
                    var20_692 = module0075.f5283(var20_692);
                }
                try {
                    f38021(var20_692);
                    final SubLObject var35 = (SubLObject)module0618.$ic234$;
                    final SubLObject var36_692 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37_694 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var36 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var41 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0021.f1038(module0142.$g1720$.getGlobalValue(), var20_692);
                        module0021.f1038(module0142.$g1721$.getGlobalValue(), var20_692);
                        module0021.f1038(module0142.$g1722$.getGlobalValue(), var20_692);
                        module0021.f1038(module0142.$g1723$.getGlobalValue(), var20_692);
                        module0021.f1038(module0323.$g2828$.getGlobalValue(), var20_692);
                        module0021.f1038(module0323.$g2829$.getGlobalValue(), var20_692);
                        module0021.f1038(module0323.$g2830$.getGlobalValue(), var20_692);
                        module0021.f1038(module0323.$g2831$.getGlobalValue(), var20_692);
                        module0021.f1038(module0323.$g2832$.getGlobalValue(), var20_692);
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var41, var29);
                        module0012.$g70$.rebind(var40, var29);
                        module0012.$g69$.rebind(var39, var29);
                        module0012.$g66$.rebind(var38, var29);
                        module0012.$g68$.rebind(var37, var29);
                        module0012.$g67$.rebind(var36, var29);
                        module0012.$g65$.rebind(var37_694, var29);
                        module0012.$g73$.rebind(var36_692, var29);
                    }
                }
                finally {
                    final SubLObject var36_693 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_692, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_693, var29);
                    }
                }
            }
            finally {
                final SubLObject var36_694 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var34.isStream()) {
                        streams_high.close(var34, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var36_694, var29);
                }
            }
            f37914(var33);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var31, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var30, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38116(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = f37916((SubLObject)module0618.$ic233$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL == Filesys.probe_file(var30)) {
            var30 = f37916((SubLObject)module0618.$ic235$, var28, (SubLObject)module0618.UNPROVIDED);
        }
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.UNPROVIDED)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_698 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_698 = module0075.f5283(var20_698);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_698);
                    f38022(var20_698);
                    final SubLObject var35 = (SubLObject)module0618.$ic236$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0142.$g1720$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0142.$g1721$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0142.$g1722$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0142.$g1723$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0323.$g2828$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0323.$g2829$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0323.$g2830$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0323.$g2831$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        module0323.$g2832$.setGlobalValue(module0021.f1060(var20_698, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED));
                        if (module0021.f1060(var20_698, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic237$, Numbers.subtract(var34, compatibility.get_file_position(var20_698)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_698, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38117() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_699 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_700 = module0160.f10437(var74_699);
            final SubLObject var76_701 = module0160.f10418(var74_699);
            try {
                module0160.f10447(var74_699);
                module0160.f10417(var74_699);
                final SubLObject var74_700 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_701 = module0160.f10437(var74_700);
                final SubLObject var76_702 = module0160.f10418(var74_700);
                try {
                    module0160.f10447(var74_700);
                    module0160.f10417(var74_700);
                    final SubLObject var74_701 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_702 = module0160.f10437(var74_701);
                    final SubLObject var76_703 = module0160.f10418(var74_701);
                    try {
                        module0160.f10447(var74_701);
                        module0160.f10417(var74_701);
                        final SubLObject var74_702 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_703 = module0160.f10437(var74_702);
                        final SubLObject var76_704 = module0160.f10418(var74_702);
                        try {
                            module0160.f10447(var74_702);
                            module0160.f10417(var74_702);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                module0248.f15949();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_703) {
                                    module0160.f10446(var74_702);
                                }
                                if (module0618.NIL == var76_704) {
                                    module0160.f10414(var74_702, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_702) {
                                module0160.f10446(var74_701);
                            }
                            if (module0618.NIL == var76_703) {
                                module0160.f10414(var74_701, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_701) {
                            module0160.f10446(var74_700);
                        }
                        if (module0618.NIL == var76_702) {
                            module0160.f10414(var74_700, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_700) {
                        module0160.f10446(var74_699);
                    }
                    if (module0618.NIL == var76_701) {
                        module0160.f10414(var74_699, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38003(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic238$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_712 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_712 = module0075.f5283(var20_712);
            }
            try {
                f38021(var20_712);
                final SubLObject var34 = (SubLObject)module0618.$ic239$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0222.f14660(var20_712);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_712, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38015(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic238$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_714 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_714 = module0075.f5283(var20_714);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_714);
                    f38022(var20_714);
                    final SubLObject var35 = (SubLObject)module0618.$ic240$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0222.f14661(var20_714);
                        if (module0021.f1060(var20_714, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_714)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_714, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38004(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic241$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_716 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_716 = module0075.f5283(var20_716);
            }
            try {
                f38021(var20_716);
                final SubLObject var34 = (SubLObject)module0618.$ic242$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0225.f14787(var20_716);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_716, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38016(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic241$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_718 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_718 = module0075.f5283(var20_718);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_718);
                    f38022(var20_718);
                    final SubLObject var35 = (SubLObject)module0618.$ic243$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0225.f14788(var20_718);
                        if (module0021.f1060(var20_718, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_718)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_718, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38125(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f38024(var28, (SubLObject)module0618.$ic244$, module0749.f46511());
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic245$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_721 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_721 = module0075.f5283(var20_721);
            }
            try {
                f38021(var20_721);
                final SubLObject var34 = module0749.f46501();
                final SubLObject var35 = (SubLObject)module0618.$ic246$;
                final SubLObject var36 = module0065.f4733(var34);
                SubLObject var37 = (SubLObject)module0618.ZERO_INTEGER;
                assert module0618.NIL != Types.stringp(var35) : var35;
                final SubLObject var38 = module0012.$g75$.currentBinding(var29);
                final SubLObject var39 = module0012.$g76$.currentBinding(var29);
                final SubLObject var40 = module0012.$g77$.currentBinding(var29);
                final SubLObject var41 = module0012.$g78$.currentBinding(var29);
                try {
                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                    module0012.$g77$.bind((SubLObject)module0618.T, var29);
                    module0012.$g78$.bind(Time.get_universal_time(), var29);
                    module0012.f478(var35);
                    final SubLObject var229_722 = var34;
                    if (module0618.NIL == module0065.f4772(var229_722, (SubLObject)module0618.$ic93$)) {
                        final SubLObject var231_723 = var229_722;
                        if (module0618.NIL == module0065.f4775(var231_723, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var42 = module0065.f4740(var231_723);
                            final SubLObject var43 = (SubLObject)module0618.NIL;
                            SubLObject var44;
                            SubLObject var45;
                            SubLObject var46;
                            SubLObject var47;
                            for (var44 = Sequences.length(var42), var45 = (SubLObject)module0618.NIL, var45 = (SubLObject)module0618.ZERO_INTEGER; var45.numL(var44); var45 = Numbers.add(var45, (SubLObject)module0618.ONE_INTEGER)) {
                                var46 = ((module0618.NIL != var43) ? Numbers.subtract(var44, var45, (SubLObject)module0618.ONE_INTEGER) : var45);
                                var47 = Vectors.aref(var42, var46);
                                if (module0618.NIL == module0065.f4749(var47) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    if (module0618.NIL != module0065.f4749(var47)) {
                                        var47 = (SubLObject)module0618.$ic93$;
                                    }
                                    module0012.note_percent_progress(var37, var36);
                                    var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                                    if (!var46.equal(module0756.f47475(var47))) {
                                        Errors.warn((SubLObject)module0618.$ic247$, var47);
                                    }
                                    else {
                                        f38126(var47, var20_721);
                                    }
                                }
                            }
                        }
                        final SubLObject var726_727 = var229_722;
                        if (module0618.NIL == module0065.f4777(var726_727)) {
                            final SubLObject var48 = module0065.f4738(var726_727);
                            SubLObject var49 = (SubLObject)module0618.NIL;
                            SubLObject var50 = (SubLObject)module0618.NIL;
                            final Iterator var51 = Hashtables.getEntrySetIterator(var48);
                            try {
                                while (Hashtables.iteratorHasNext(var51)) {
                                    final Map.Entry var52 = Hashtables.iteratorNextEntry(var51);
                                    var49 = Hashtables.getEntryKey(var52);
                                    var50 = Hashtables.getEntryValue(var52);
                                    module0012.note_percent_progress(var37, var36);
                                    var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                                    if (!var49.equal(module0756.f47475(var50))) {
                                        Errors.warn((SubLObject)module0618.$ic247$, var50);
                                    }
                                    else {
                                        f38126(var50, var20_721);
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var51);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var41, var29);
                    module0012.$g77$.rebind(var40, var29);
                    module0012.$g76$.rebind(var39, var29);
                    module0012.$g75$.rebind(var38, var29);
                }
            }
            finally {
                final SubLObject var53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_721, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var53, var29);
                }
            }
        }
        finally {
            final SubLObject var54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var54, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38127(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic245$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f38128(var28);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            module0749.f46504((SubLObject)((module0618.NIL != var31) ? var31 : module0618.ZERO_INTEGER));
            final SubLObject var32 = var30;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_733 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_733 = module0075.f5283(var20_733);
                }
                try {
                    final SubLObject var35 = streams_high.file_length(var20_733);
                    f38022(var20_733);
                    final SubLObject var36 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic248$);
                        SubLObject var40;
                        for (var40 = (SubLObject)module0618.NIL, var40 = module0021.f1060(var20_733, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var40 != module0618.$ic81$; var40 = module0021.f1060(var20_733, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_733), var35);
                            if (var40.isInteger()) {
                                f38129(var40, var20_733);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var39, var29);
                        module0012.$g77$.rebind(var38, var29);
                        module0012.$g76$.rebind(var37, var29);
                        module0012.$g75$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_733, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                    }
                }
            }
            finally {
                final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                }
            }
            f37914(var32);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38128(final SubLObject var28) {
        return f38025(var28, (SubLObject)module0618.$ic244$);
    }
    
    public static SubLObject f38126(final SubLObject var725, final SubLObject var20) {
        module0021.f1038(module0756.f47475(var725), var20);
        return var725;
    }
    
    public static SubLObject f38129(final SubLObject var249, final SubLObject var20) {
        return module0749.f46493(var249);
    }
    
    public static SubLObject f38130(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic249$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic250$, var28, (SubLObject)module0618.UNPROVIDED);
        final SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var34, var29);
            }
            if (!var33.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var32);
            }
            SubLObject var20_737 = var33;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_737 = module0075.f5283(var20_737);
            }
            try {
                final SubLObject var191_738 = var31;
                SubLObject var739_740 = (SubLObject)module0618.NIL;
                try {
                    final SubLObject var35 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                        var739_740 = compatibility.open_binary(var191_738, (SubLObject)module0618.$ic73$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var35, var29);
                    }
                    if (!var739_740.isStream()) {
                        Errors.error((SubLObject)module0618.$ic65$, var191_738);
                    }
                    SubLObject var36 = var739_740;
                    if (module0618.$ic73$ == module0618.$ic64$) {
                        var36 = module0075.f5283(var36);
                    }
                    try {
                        f38021(var20_737);
                        final SubLObject var37 = module0095.f6846(var20_737, var36);
                        final SubLObject var38 = module0749.f46501();
                        final SubLObject var39 = (SubLObject)module0618.$ic251$;
                        final SubLObject var40 = module0065.f4733(var38);
                        SubLObject var41 = (SubLObject)module0618.ZERO_INTEGER;
                        assert module0618.NIL != Types.stringp(var39) : var39;
                        final SubLObject var42 = module0012.$g75$.currentBinding(var29);
                        final SubLObject var43 = module0012.$g76$.currentBinding(var29);
                        final SubLObject var44 = module0012.$g77$.currentBinding(var29);
                        final SubLObject var45 = module0012.$g78$.currentBinding(var29);
                        try {
                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                            module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                            module0012.$g77$.bind((SubLObject)module0618.T, var29);
                            module0012.$g78$.bind(Time.get_universal_time(), var29);
                            module0012.f478(var39);
                            final SubLObject var229_741 = var38;
                            if (module0618.NIL == module0065.f4772(var229_741, (SubLObject)module0618.$ic93$)) {
                                final SubLObject var231_742 = var229_741;
                                if (module0618.NIL == module0065.f4775(var231_742, (SubLObject)module0618.$ic93$)) {
                                    final SubLObject var46 = module0065.f4740(var231_742);
                                    final SubLObject var47 = (SubLObject)module0618.NIL;
                                    SubLObject var48;
                                    SubLObject var49;
                                    SubLObject var50;
                                    SubLObject var51;
                                    for (var48 = Sequences.length(var46), var49 = (SubLObject)module0618.NIL, var49 = (SubLObject)module0618.ZERO_INTEGER; var49.numL(var48); var49 = Numbers.add(var49, (SubLObject)module0618.ONE_INTEGER)) {
                                        var50 = ((module0618.NIL != var47) ? Numbers.subtract(var48, var49, (SubLObject)module0618.ONE_INTEGER) : var49);
                                        var51 = Vectors.aref(var46, var50);
                                        if (module0618.NIL == module0065.f4749(var51) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                            if (module0618.NIL != module0065.f4749(var51)) {
                                                var51 = (SubLObject)module0618.$ic93$;
                                            }
                                            module0012.note_percent_progress(var41, var40);
                                            var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                            if (!var50.equal(module0756.f47475(var51))) {
                                                Errors.warn((SubLObject)module0618.$ic247$, var51);
                                            }
                                            else {
                                                module0095.f6862(var37);
                                                f38131(var51, var20_737);
                                            }
                                        }
                                    }
                                }
                                final SubLObject var726_743 = var229_741;
                                if (module0618.NIL == module0065.f4777(var726_743)) {
                                    final SubLObject var52 = module0065.f4738(var726_743);
                                    SubLObject var53 = (SubLObject)module0618.NIL;
                                    SubLObject var54 = (SubLObject)module0618.NIL;
                                    final Iterator var55 = Hashtables.getEntrySetIterator(var52);
                                    try {
                                        while (Hashtables.iteratorHasNext(var55)) {
                                            final Map.Entry var56 = Hashtables.iteratorNextEntry(var55);
                                            var53 = Hashtables.getEntryKey(var56);
                                            var54 = Hashtables.getEntryValue(var56);
                                            module0012.note_percent_progress(var41, var40);
                                            var41 = Numbers.add(var41, (SubLObject)module0618.ONE_INTEGER);
                                            if (!var53.equal(module0756.f47475(var54))) {
                                                Errors.warn((SubLObject)module0618.$ic247$, var54);
                                            }
                                            else {
                                                module0095.f6862(var37);
                                                f38131(var54, var20_737);
                                            }
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(var55);
                                    }
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var45, var29);
                            module0012.$g77$.rebind(var44, var29);
                            module0012.$g76$.rebind(var43, var29);
                            module0012.$g75$.rebind(var42, var29);
                        }
                    }
                    finally {
                        final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                            streams_high.close(var36, (SubLObject)module0618.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var57, var29);
                        }
                    }
                }
                finally {
                    final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        if (var739_740.isStream()) {
                            streams_high.close(var739_740, (SubLObject)module0618.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var58, var29);
                    }
                }
                f37914(var191_738);
            }
            finally {
                final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_737, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var59, var29);
                }
            }
        }
        finally {
            final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var33.isStream()) {
                    streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var60, var29);
            }
        }
        f37914(var32);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38132(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic249$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var32;
            final SubLObject var31 = var32 = var30;
            SubLObject var33 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var34 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var33 = compatibility.open_binary(var32, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var34, var29);
                }
                if (!var33.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var32);
                }
                SubLObject var20_746 = var33;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_746 = module0075.f5283(var20_746);
                }
                try {
                    final SubLObject var35 = streams_high.file_length(var20_746);
                    f38022(var20_746);
                    final SubLObject var36 = module0012.$g75$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g76$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g77$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g78$.currentBinding(var29);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var29);
                        module0012.$g77$.bind((SubLObject)module0618.T, var29);
                        module0012.$g78$.bind(Time.get_universal_time(), var29);
                        module0012.f478((SubLObject)module0618.$ic252$);
                        SubLObject var40;
                        for (var40 = (SubLObject)module0618.NIL, var40 = module0021.f1060(var20_746, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED); var40 != module0618.$ic81$; var40 = module0021.f1060(var20_746, (SubLObject)module0618.NIL, (SubLObject)module0618.UNPROVIDED)) {
                            module0012.note_percent_progress(compatibility.get_file_position(var20_746), var35);
                            if (var40.isInteger()) {
                                f38133(var40, var20_746);
                            }
                            else {
                                Errors.warn((SubLObject)module0618.$ic253$);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var39, var29);
                        module0012.$g77$.rebind(var38, var29);
                        module0012.$g76$.rebind(var37, var29);
                        module0012.$g75$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_746, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var41, var29);
                    }
                }
            }
            finally {
                final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var42, var29);
                }
            }
            f37914(var32);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38131(final SubLObject var725, final SubLObject var20) {
        module0021.f1038(module0756.f47475(var725), var20);
        module0749.f46514(var725, var20);
        return var725;
    }
    
    public static SubLObject f38133(final SubLObject var724, final SubLObject var20) {
        final SubLObject var725 = module0749.f46371(var724);
        module0749.f46515(var725, var20);
        return var725;
    }
    
    public static SubLObject f38134(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var31;
        final SubLObject var30 = var31 = f37916((SubLObject)module0618.$ic254$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_748 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_748 = module0075.f5283(var20_748);
            }
            try {
                f38021(var20_748);
                final SubLObject var34 = (SubLObject)module0618.$ic255$;
                final SubLObject var35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var37 = module0012.$g67$.currentBinding(var29);
                final SubLObject var38 = module0012.$g68$.currentBinding(var29);
                final SubLObject var39 = module0012.$g66$.currentBinding(var29);
                final SubLObject var40 = module0012.$g69$.currentBinding(var29);
                final SubLObject var41 = module0012.$g70$.currentBinding(var29);
                final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)module0618.T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                    module0012.f474(var34);
                    module0749.f46518(var20_748);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var42, var29);
                    module0012.$g70$.rebind(var41, var29);
                    module0012.$g69$.rebind(var40, var29);
                    module0012.$g66$.rebind(var39, var29);
                    module0012.$g68$.rebind(var38, var29);
                    module0012.$g67$.rebind(var37, var29);
                    module0012.$g65$.rebind(var36, var29);
                    module0012.$g73$.rebind(var35, var29);
                }
            }
            finally {
                final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_748, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var43, var29);
                }
            }
        }
        finally {
            final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38135(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic254$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = var30;
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_750 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_750 = module0075.f5283(var20_750);
                }
                try {
                    final SubLObject var34 = streams_high.file_length(var20_750);
                    f38022(var20_750);
                    final SubLObject var35 = (SubLObject)module0618.$ic256$;
                    final SubLObject var36 = module0012.$g73$.currentBinding(var29);
                    final SubLObject var37 = module0012.$g65$.currentBinding(var29);
                    final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                    final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                    final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                    final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                    final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                    final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var29);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                        module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                        module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                        module0012.$g70$.bind((SubLObject)module0618.T, var29);
                        module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                        module0012.f474(var35);
                        module0749.f46519(var20_750);
                        if (module0021.f1060(var20_750, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$) != module0618.$ic81$) {
                            Errors.warn((SubLObject)module0618.$ic82$, Numbers.subtract(var34, compatibility.get_file_position(var20_750)), var30);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var43, var29);
                        module0012.$g70$.rebind(var42, var29);
                        module0012.$g69$.rebind(var41, var29);
                        module0012.$g66$.rebind(var40, var29);
                        module0012.$g68$.rebind(var39, var29);
                        module0012.$g67$.rebind(var38, var29);
                        module0012.$g65$.rebind(var37, var29);
                        module0012.$g73$.rebind(var36, var29);
                    }
                }
                finally {
                    final SubLObject var44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_750, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var44, var29);
                    }
                }
            }
            finally {
                final SubLObject var45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var45, var29);
                }
            }
            f37914(var31);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38136(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0767.f48865((SubLObject)module0618.UNPROVIDED);
        final SubLObject var31 = f37916((SubLObject)module0618.$ic257$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var33, var29);
            }
            if (!var32.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var31);
            }
            SubLObject var20_753 = var32;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_753 = module0075.f5283(var20_753);
            }
            try {
                f38021(var20_753);
                module0021.f1038(var30, var20_753);
            }
            finally {
                final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_753, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var34, var29);
                }
            }
        }
        finally {
            final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var32.isStream()) {
                    streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var35, var29);
            }
        }
        f37914(var31);
        return (SubLObject)module0618.$ic258$;
    }
    
    public static SubLObject f38137(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL == module0762.f48217()) {
            module0762.f48216();
        }
        final SubLObject var30 = f37916((SubLObject)module0618.$ic259$, var28, (SubLObject)module0618.UNPROVIDED);
        SubLObject var31 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var32 = stream_macros.$stream_requires_locking$.currentBinding(var29);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                var31 = compatibility.open_binary(var30, (SubLObject)module0618.$ic73$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var32, var29);
            }
            if (!var31.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var30);
            }
            SubLObject var20_755 = var31;
            if (module0618.$ic73$ == module0618.$ic64$) {
                var20_755 = module0075.f5283(var20_755);
            }
            try {
                f38021(var20_755);
                module0021.f1038(module0579.$g4318$.getDynamicValue(var29), var20_755);
            }
            finally {
                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    streams_high.close(var20_755, (SubLObject)module0618.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var29);
                }
            }
        }
        finally {
            final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                if (var31.isStream()) {
                    streams_high.close(var31, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var34, var29);
            }
        }
        f37914(var30);
        return (SubLObject)module0618.$ic258$;
    }
    
    public static SubLObject f38138(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = f37916((SubLObject)module0618.$ic259$, var28, (SubLObject)module0618.UNPROVIDED);
        if (module0618.NIL != f37919(var30, (SubLObject)module0618.T)) {
            final SubLObject var31 = f37916((SubLObject)module0618.$ic259$, var28, (SubLObject)module0618.UNPROVIDED);
            SubLObject var32 = (SubLObject)module0618.NIL;
            try {
                final SubLObject var33 = stream_macros.$stream_requires_locking$.currentBinding(var29);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var29);
                    var32 = compatibility.open_binary(var31, (SubLObject)module0618.$ic64$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var33, var29);
                }
                if (!var32.isStream()) {
                    Errors.error((SubLObject)module0618.$ic65$, var31);
                }
                SubLObject var20_758 = var32;
                if (module0618.$ic64$ == module0618.$ic64$) {
                    var20_758 = module0075.f5283(var20_758);
                }
                try {
                    f38022(var20_758);
                    module0579.$g4318$.setDynamicValue(module0021.f1060(var20_758, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED), var29);
                }
                finally {
                    final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                        streams_high.close(var20_758, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var34, var29);
                    }
                }
            }
            finally {
                final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var29);
                    if (var32.isStream()) {
                        streams_high.close(var32, (SubLObject)module0618.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var35, var29);
                }
            }
            f37914(var31);
        }
        else {
            module0762.f48216();
        }
        return (SubLObject)module0618.$ic260$;
    }
    
    public static SubLObject f38139(final SubLObject var28) {
        module0770.f49100();
        module0749.f46507((SubLObject)module0618.T);
        f38125(var28);
        f38130(var28);
        f38134(var28);
        f38137(var28);
        f38136(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37931() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0176.$g2196$.getGlobalValue();
        final SubLObject var35 = module0160.f10437(var34);
        final SubLObject var36 = module0160.f10418(var34);
        try {
            module0160.f10447(var34);
            module0160.f10417(var34);
            final SubLObject var74_759 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_760 = module0160.f10437(var74_759);
            final SubLObject var76_761 = module0160.f10418(var74_759);
            try {
                module0160.f10447(var74_759);
                module0160.f10417(var74_759);
                final SubLObject var74_760 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_761 = module0160.f10437(var74_760);
                final SubLObject var76_762 = module0160.f10418(var74_760);
                try {
                    module0160.f10447(var74_760);
                    module0160.f10417(var74_760);
                    final SubLObject var74_761 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_762 = module0160.f10437(var74_761);
                    final SubLObject var76_763 = module0160.f10418(var74_761);
                    try {
                        module0160.f10447(var74_761);
                        module0160.f10417(var74_761);
                        final SubLObject var74_762 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_763 = module0160.f10437(var74_762);
                        final SubLObject var76_764 = module0160.f10418(var74_762);
                        try {
                            module0160.f10447(var74_762);
                            module0160.f10417(var74_762);
                            final SubLObject var37 = module0018.$g694$.currentBinding(var33);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var33);
                                module0749.f46338();
                                module0763.f48234();
                            }
                            finally {
                                module0018.$g694$.rebind(var37, var33);
                            }
                        }
                        finally {
                            final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                                if (module0618.NIL != var75_763) {
                                    module0160.f10446(var74_762);
                                }
                                if (module0618.NIL == var76_764) {
                                    module0160.f10414(var74_762, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38, var33);
                            }
                        }
                    }
                    finally {
                        final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_762) {
                                module0160.f10446(var74_761);
                            }
                            if (module0618.NIL == var76_763) {
                                module0160.f10414(var74_761, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var39, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_761) {
                            module0160.f10446(var74_760);
                        }
                        if (module0618.NIL == var76_762) {
                            module0160.f10414(var74_760, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var40, var33);
                    }
                }
            }
            finally {
                final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_760) {
                        module0160.f10446(var74_759);
                    }
                    if (module0618.NIL == var76_761) {
                        module0160.f10414(var74_759, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var41, var33);
                }
            }
        }
        finally {
            final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var35) {
                    module0160.f10446(var34);
                }
                if (module0618.NIL == var36) {
                    module0160.f10414(var34, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var42, var33);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38140(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != Filesys.probe_file(f37916((SubLObject)module0618.$ic245$, var28, (SubLObject)module0618.UNPROVIDED)) && module0618.NIL != Filesys.probe_file(f37916((SubLObject)module0618.$ic250$, var28, (SubLObject)module0618.UNPROVIDED)) && module0618.NIL != Filesys.probe_file(f37916((SubLObject)module0618.$ic249$, var28, (SubLObject)module0618.UNPROVIDED)) && module0618.NIL != Filesys.probe_file(f37916((SubLObject)module0618.$ic254$, var28, (SubLObject)module0618.UNPROVIDED))) {
            final SubLObject var30 = (SubLObject)module0618.$ic261$;
            final SubLObject var31 = module0012.$g73$.currentBinding(var29);
            final SubLObject var32 = module0012.$g65$.currentBinding(var29);
            final SubLObject var33 = module0012.$g67$.currentBinding(var29);
            final SubLObject var34 = module0012.$g68$.currentBinding(var29);
            final SubLObject var35 = module0012.$g66$.currentBinding(var29);
            final SubLObject var36 = module0012.$g69$.currentBinding(var29);
            final SubLObject var37 = module0012.$g70$.currentBinding(var29);
            final SubLObject var38 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var30) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var30);
                module0579.f35514();
                module0749.f46338();
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var38, var29);
                module0012.$g70$.rebind(var37, var29);
                module0012.$g69$.rebind(var36, var29);
                module0012.$g66$.rebind(var35, var29);
                module0012.$g68$.rebind(var34, var29);
                module0012.$g67$.rebind(var33, var29);
                module0012.$g65$.rebind(var32, var29);
                module0012.$g73$.rebind(var31, var29);
            }
            f38138(var28);
            f38127(var28);
            f38132(var28);
            f38135(var28);
            module0770.f49102((SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
            module0749.f46337();
            if (module0618.NIL == f38128(var28)) {
                module0749.f46507((SubLObject)module0618.NIL);
            }
            module0770.f49098();
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38007(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic262$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        f38041(var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37951() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var33)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var33), (SubLObject)module0618.$ic263$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var33));
        }
        module0137.f8960();
        f37921();
        module0127.f8417();
        f37921();
        module0213.f13895();
        f37921();
        module0543.f33694();
        f37921();
        module0012.f582();
        f37921();
        if (module0618.NIL != module0131.f8536()) {
            if (module0618.NIL == module0291.f19549()) {
                module0291.f19650();
            }
            if (module0618.NIL == module0291.f19548()) {
                module0295.f19904();
            }
        }
        if (module0618.NIL != module0131.f8548()) {
            module0730.f44626();
            f37921();
        }
        module0626.f38525();
        f37921();
        f37987();
        f37921();
        if (module0618.NIL == module0018.f973()) {
            module0110.$g1389$.setDynamicValue((SubLObject)module0618.T, var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f37979() {
        module0291.f19556();
        module0751.f46590();
        module0610.f37195();
        module0612.f37379();
        module0324.f21912();
        if (module0618.NIL == module0131.f8563()) {
            module0161.f10474();
        }
        module0730.f44625();
        module0791.f50537();
        module0633.f38712();
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38141() {
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic264$, module0131.f8536());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic265$, module0131.f8542());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic266$, module0131.f8569());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic267$, module0131.f8539());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic268$, module0131.f8560());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic269$, module0131.f8566());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic270$, module0131.f8563());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic271$, module0131.f8548());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic272$, module0131.f8545());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic273$, module0131.f8551());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic274$, module0131.f8554());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic275$, module0131.f8557());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic276$, module0131.f8572());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic277$, module0131.f8581());
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic278$, module0131.f8578());
        streams_high.force_output((SubLObject)module0618.T);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38142(SubLObject var771) {
        if (var771 == module0618.UNPROVIDED) {
            var771 = (SubLObject)module0618.$ic279$;
        }
        module0018.$g694$.setDynamicValue((SubLObject)module0618.NIL);
        f38143(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic280$));
        f38144(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic281$));
        f38145(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic282$));
        f38146(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic283$));
        f38147(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic284$));
        f38148(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic285$));
        f38149(Sequences.cconcatenate(var771, (SubLObject)module0618.$ic286$));
        f37966(var771, (SubLObject)module0618.NIL);
        module0243.f15707(var771, (SubLObject)module0618.T);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38150(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        module0018.$g694$.setDynamicValue((SubLObject)module0618.NIL, var29);
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var29)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var29), (SubLObject)module0618.$ic287$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var29));
        }
        final SubLObject var30 = (SubLObject)module0618.T;
        final SubLObject var31 = module0018.$g694$.currentBinding(var29);
        try {
            module0018.$g694$.bind((SubLObject)module0618.NIL, var29);
            module0561.f34593();
            module0248.f15987();
            module0110.f7678();
            SubLObject var32 = (SubLObject)module0618.$ic288$;
            final SubLObject var36_773 = module0012.$g73$.currentBinding(var29);
            SubLObject var33 = module0012.$g65$.currentBinding(var29);
            SubLObject var34 = module0012.$g67$.currentBinding(var29);
            SubLObject var35 = module0012.$g68$.currentBinding(var29);
            SubLObject var36 = module0012.$g66$.currentBinding(var29);
            SubLObject var37 = module0012.$g69$.currentBinding(var29);
            SubLObject var38 = module0012.$g70$.currentBinding(var29);
            SubLObject var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic280$), (SubLObject)module0618.UNPROVIDED);
                module0128.f8474();
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_773, var29);
            }
            var32 = (SubLObject)module0618.$ic289$;
            final SubLObject var36_774 = module0012.$g73$.currentBinding(var29);
            var33 = module0012.$g65$.currentBinding(var29);
            var34 = module0012.$g67$.currentBinding(var29);
            var35 = module0012.$g68$.currentBinding(var29);
            var36 = module0012.$g66$.currentBinding(var29);
            var37 = module0012.$g69$.currentBinding(var29);
            var38 = module0012.$g70$.currentBinding(var29);
            var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic281$), (SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_774, var29);
            }
            var32 = (SubLObject)module0618.$ic290$;
            final SubLObject var36_775 = module0012.$g73$.currentBinding(var29);
            var33 = module0012.$g65$.currentBinding(var29);
            var34 = module0012.$g67$.currentBinding(var29);
            var35 = module0012.$g68$.currentBinding(var29);
            var36 = module0012.$g66$.currentBinding(var29);
            var37 = module0012.$g69$.currentBinding(var29);
            var38 = module0012.$g70$.currentBinding(var29);
            var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic282$), (SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_775, var29);
            }
            var32 = (SubLObject)module0618.$ic291$;
            final SubLObject var36_776 = module0012.$g73$.currentBinding(var29);
            var33 = module0012.$g65$.currentBinding(var29);
            var34 = module0012.$g67$.currentBinding(var29);
            var35 = module0012.$g68$.currentBinding(var29);
            var36 = module0012.$g66$.currentBinding(var29);
            var37 = module0012.$g69$.currentBinding(var29);
            var38 = module0012.$g70$.currentBinding(var29);
            var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic283$), (SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_776, var29);
            }
            var32 = (SubLObject)module0618.$ic292$;
            final SubLObject var36_777 = module0012.$g73$.currentBinding(var29);
            var33 = module0012.$g65$.currentBinding(var29);
            var34 = module0012.$g67$.currentBinding(var29);
            var35 = module0012.$g68$.currentBinding(var29);
            var36 = module0012.$g66$.currentBinding(var29);
            var37 = module0012.$g69$.currentBinding(var29);
            var38 = module0012.$g70$.currentBinding(var29);
            var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic284$), (SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_777, var29);
            }
            var32 = (SubLObject)module0618.$ic293$;
            final SubLObject var36_778 = module0012.$g73$.currentBinding(var29);
            var33 = module0012.$g65$.currentBinding(var29);
            var34 = module0012.$g67$.currentBinding(var29);
            var35 = module0012.$g68$.currentBinding(var29);
            var36 = module0012.$g66$.currentBinding(var29);
            var37 = module0012.$g69$.currentBinding(var29);
            var38 = module0012.$g70$.currentBinding(var29);
            var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic285$), (SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_778, var29);
            }
            var32 = (SubLObject)module0618.$ic294$;
            final SubLObject var36_779 = module0012.$g73$.currentBinding(var29);
            var33 = module0012.$g65$.currentBinding(var29);
            var34 = module0012.$g67$.currentBinding(var29);
            var35 = module0012.$g68$.currentBinding(var29);
            var36 = module0012.$g66$.currentBinding(var29);
            var37 = module0012.$g69$.currentBinding(var29);
            var38 = module0012.$g70$.currentBinding(var29);
            var39 = module0012.$silent_progressP$.currentBinding(var29);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var29);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var29);
                module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var29);
                module0012.$g70$.bind((SubLObject)module0618.T, var29);
                module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var29) : module0618.T), var29);
                module0012.f474(var32);
                f38151(Sequences.cconcatenate(var28, (SubLObject)module0618.$ic286$), (SubLObject)module0618.UNPROVIDED);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var39, var29);
                module0012.$g70$.rebind(var38, var29);
                module0012.$g69$.rebind(var37, var29);
                module0012.$g66$.rebind(var36, var29);
                module0012.$g68$.rebind(var35, var29);
                module0012.$g67$.rebind(var34, var29);
                module0012.$g65$.rebind(var33, var29);
                module0012.$g73$.rebind(var36_779, var29);
            }
            f37977(var28);
            f37978();
            module0152.$g2105$.setDynamicValue((SubLObject)module0618.$ic295$, var29);
            module0528.f32921();
            return (SubLObject)module0618.NIL;
        }
        finally {
            module0018.$g694$.rebind(var31, var29);
        }
    }
    
    public static SubLObject f38152() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var33)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var33), (SubLObject)module0618.$ic297$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var33));
        }
        module0018.$g694$.setDynamicValue((SubLObject)module0618.NIL, var33);
        f37978();
        module0152.$g2105$.setDynamicValue((SubLObject)module0618.$ic295$, var33);
        module0528.f32921();
        module0128.f8474();
        final SubLObject var34 = module0618.$g4749$.currentBinding(var33);
        try {
            module0618.$g4749$.bind((SubLObject)module0618.NIL, var33);
            module0549.f33890(module0128.f8433());
            f37978();
            module0107.f7579();
            module0107.f7583();
            f37943((SubLObject)module0618.T);
            module0271.f17872();
            module0018.$g574$.setDynamicValue((SubLObject)module0618.NIL, var33);
            module0152.$g2105$.setDynamicValue((SubLObject)module0618.$ic298$, var33);
            module0146.$g2057$.setDynamicValue((SubLObject)module0618.T, var33);
        }
        finally {
            module0618.$g4749$.rebind(var34, var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38153(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0012.$g64$.currentBinding(var29);
        final SubLObject var31 = module0021.$g750$.currentBinding(var29);
        try {
            module0012.$g64$.bind((SubLObject)module0618.T, var29);
            module0021.$g750$.bind((SubLObject)module0618.T, var29);
            f37977(var28);
        }
        finally {
            module0021.$g750$.rebind(var31, var29);
            module0012.$g64$.rebind(var30, var29);
        }
        module0018.$g694$.setDynamicValue((SubLObject)module0618.NIL, var29);
        f37978();
        module0152.$g2105$.setDynamicValue((SubLObject)module0618.$ic295$, var29);
        module0528.f32921();
        module0128.f8474();
        final SubLObject var32 = f37941(var28);
        if (module0618.NIL == module0618.$g4738$.getGlobalValue()) {
            module0107.f7594(var28, var32);
            f37921();
        }
        f37953(var28);
        final SubLObject var33 = module0021.$g777$.currentBinding(var29);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var29);
            module0021.f1149(var32);
            final SubLObject var36_780 = module0111.$g1394$.currentBinding(var29);
            final SubLObject var34 = module0111.$g1396$.currentBinding(var29);
            final SubLObject var35 = module0111.$g1398$.currentBinding(var29);
            final SubLObject var36 = module0111.$g1400$.currentBinding(var29);
            final SubLObject var37 = module0111.$g1402$.currentBinding(var29);
            final SubLObject var38 = module0111.$g1404$.currentBinding(var29);
            try {
                module0111.$g1394$.bind((SubLObject)module0618.$ic45$, var29);
                module0111.$g1396$.bind((SubLObject)module0618.$ic46$, var29);
                module0111.$g1398$.bind((SubLObject)module0618.$ic47$, var29);
                module0111.$g1400$.bind((SubLObject)module0618.$ic48$, var29);
                module0111.$g1402$.bind((SubLObject)module0618.$ic49$, var29);
                module0111.$g1404$.bind((SubLObject)module0618.$ic50$, var29);
                f37956(var28);
            }
            finally {
                module0111.$g1404$.rebind(var38, var29);
                module0111.$g1402$.rebind(var37, var29);
                module0111.$g1400$.rebind(var36, var29);
                module0111.$g1398$.rebind(var35, var29);
                module0111.$g1396$.rebind(var34, var29);
                module0111.$g1394$.rebind(var36_780, var29);
            }
        }
        finally {
            module0021.$g777$.rebind(var33, var29);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38154(final SubLObject var56, final SubLObject var781, final SubLObject var28) {
        final SubLThread var782 = SubLProcess.currentSubLThread();
        if (module0618.NIL != module0618.$g4745$.getDynamicValue(var782)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var782), (SubLObject)module0618.$ic299$, module0051.f3552((SubLObject)module0618.UNPROVIDED));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var782));
        }
        module0018.$g694$.setDynamicValue((SubLObject)module0618.NIL, var782);
        module0018.f970(var56);
        f37934(var28);
        final SubLObject var783 = module0021.$g777$.currentBinding(var782);
        try {
            module0021.$g777$.bind((SubLObject)module0618.NIL, var782);
            module0021.f1149(f37935());
            f37948(var28, (SubLObject)module0618.T);
        }
        finally {
            module0021.$g777$.rebind(var783, var782);
        }
        SubLObject var784 = (SubLObject)module0618.$ic300$;
        SubLObject var785 = module0012.$g73$.currentBinding(var782);
        SubLObject var786 = module0012.$g65$.currentBinding(var782);
        SubLObject var787 = module0012.$g67$.currentBinding(var782);
        SubLObject var788 = module0012.$g68$.currentBinding(var782);
        SubLObject var789 = module0012.$g66$.currentBinding(var782);
        SubLObject var790 = module0012.$g69$.currentBinding(var782);
        SubLObject var791 = module0012.$g70$.currentBinding(var782);
        SubLObject var792 = module0012.$silent_progressP$.currentBinding(var782);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var782);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var782), var782);
            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var782);
            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var782);
            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var782);
            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var782);
            module0012.$g70$.bind((SubLObject)module0618.T, var782);
            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var784) ? module0012.$silent_progressP$.getDynamicValue(var782) : module0618.T), var782);
            module0012.f474(var784);
            Filesys.copy_file(Sequences.cconcatenate(var781, (SubLObject)module0618.$ic301$), Sequences.cconcatenate(var28, (SubLObject)module0618.$ic301$));
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var792, var782);
            module0012.$g70$.rebind(var791, var782);
            module0012.$g69$.rebind(var790, var782);
            module0012.$g66$.rebind(var789, var782);
            module0012.$g68$.rebind(var788, var782);
            module0012.$g67$.rebind(var787, var782);
            module0012.$g65$.rebind(var786, var782);
            module0012.$g73$.rebind(var785, var782);
        }
        var784 = (SubLObject)module0618.$ic302$;
        var785 = module0012.$g73$.currentBinding(var782);
        var786 = module0012.$g65$.currentBinding(var782);
        var787 = module0012.$g67$.currentBinding(var782);
        var788 = module0012.$g68$.currentBinding(var782);
        var789 = module0012.$g66$.currentBinding(var782);
        var790 = module0012.$g69$.currentBinding(var782);
        var791 = module0012.$g70$.currentBinding(var782);
        var792 = module0012.$silent_progressP$.currentBinding(var782);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var782);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var782), var782);
            module0012.$g67$.bind((SubLObject)module0618.ONE_INTEGER, var782);
            module0012.$g68$.bind((SubLObject)module0618.ZERO_INTEGER, var782);
            module0012.$g66$.bind((SubLObject)module0618.ZERO_INTEGER, var782);
            module0012.$g69$.bind((SubLObject)module0618.ZERO_INTEGER, var782);
            module0012.$g70$.bind((SubLObject)module0618.T, var782);
            module0012.$silent_progressP$.bind((SubLObject)((module0618.NIL != var784) ? module0012.$silent_progressP$.getDynamicValue(var782) : module0618.T), var782);
            module0012.f474(var784);
            Filesys.copy_file(Sequences.cconcatenate(var781, (SubLObject)module0618.$ic303$), Sequences.cconcatenate(var28, (SubLObject)module0618.$ic303$));
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var792, var782);
            module0012.$g70$.rebind(var791, var782);
            module0012.$g69$.rebind(var790, var782);
            module0012.$g66$.rebind(var789, var782);
            module0012.$g68$.rebind(var788, var782);
            module0012.$g67$.rebind(var787, var782);
            module0012.$g65$.rebind(var786, var782);
            module0012.$g73$.rebind(var785, var782);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38155(final SubLObject var56, final SubLObject var781, final SubLObject var28) {
        f38150(var781);
        f38152();
        f38154(var56, var781, var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38156(final SubLObject var56, final SubLObject var781, final SubLObject var28) {
        f38152();
        f38154(var56, var781, var28);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38151(final SubLObject var756, SubLObject var782) {
        if (var782 == module0618.UNPROVIDED) {
            var782 = (SubLObject)module0618.TEN_INTEGER;
        }
        final SubLThread var783 = SubLProcess.currentSubLThread();
        SubLObject var784 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var785 = stream_macros.$stream_requires_locking$.currentBinding(var783);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var783);
                var784 = compatibility.open_text(var756, (SubLObject)module0618.$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var785, var783);
            }
            if (!var784.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var756);
            }
            final SubLObject var786 = var784;
            final SubLObject var787 = module0075.f5279(var786, (SubLObject)module0618.$ic304$);
            final SubLObject var788 = module0131.$g1531$.currentBinding(var783);
            final SubLObject var789 = module0018.$g574$.currentBinding(var783);
            try {
                module0131.$g1531$.bind((SubLObject)module0618.NIL, var783);
                module0018.$g574$.bind((SubLObject)module0618.T, var783);
                try {
                    SubLObject var790 = (SubLObject)module0618.NIL;
                    SubLObject var791 = (SubLObject)module0618.ZERO_INTEGER;
                    while (module0618.$ic81$ != var790) {
                        module0012.f476();
                        while (module0618.$ic81$ != var790 && var791.numL(var782)) {
                            var791 = Numbers.add(var791, (SubLObject)module0618.ONE_INTEGER);
                            var790 = reader.read(var787, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$, (SubLObject)module0618.UNPROVIDED);
                            if (module0618.$ic81$ != var790) {
                                Eval.eval(var790);
                            }
                        }
                        var791 = (SubLObject)module0618.ZERO_INTEGER;
                    }
                }
                finally {
                    final SubLObject var36_787 = Threads.$is_thread_performing_cleanupP$.currentBinding(var783);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var783);
                        streams_high.close(var787, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_787, var783);
                    }
                }
            }
            finally {
                module0018.$g574$.rebind(var789, var783);
                module0131.$g1531$.rebind(var788, var783);
            }
        }
        finally {
            final SubLObject var792 = Threads.$is_thread_performing_cleanupP$.currentBinding(var783);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var783);
                if (var784.isStream()) {
                    streams_high.close(var784, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var792, var783);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38157(final SubLObject var788) {
        final SubLThread var789 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic305$, var788);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var789));
        final SubLObject var790 = var788.first();
        final SubLObject var791 = conses_high.second(var788);
        final SubLObject var792 = conses_high.third(var788);
        final SubLObject var793 = conses_high.fourth(var788);
        final SubLObject var794 = (SubLObject)ConsesLow.cons(var791, Mapping.mapcar((SubLObject)module0618.$ic306$, var792));
        final SubLObject var795 = Eval.eval(var794);
        if (var790 == module0618.$ic307$ && !var795.equal(var793.first())) {
            Errors.error((SubLObject)module0618.$ic308$, var788, var795);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38158(final SubLObject var756, SubLObject var782) {
        if (var782 == module0618.UNPROVIDED) {
            var782 = (SubLObject)module0618.TEN_INTEGER;
        }
        final SubLThread var783 = SubLProcess.currentSubLThread();
        SubLObject var784 = (SubLObject)module0618.NIL;
        try {
            final SubLObject var785 = stream_macros.$stream_requires_locking$.currentBinding(var783);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var783);
                var784 = compatibility.open_text(var756, (SubLObject)module0618.$ic64$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var785, var783);
            }
            if (!var784.isStream()) {
                Errors.error((SubLObject)module0618.$ic65$, var756);
            }
            final SubLObject var786 = var784;
            final SubLObject var787 = module0075.f5279(var786, (SubLObject)module0618.$ic304$);
            final SubLObject var788 = module0018.$g574$.currentBinding(var783);
            try {
                module0018.$g574$.bind((SubLObject)module0618.T, var783);
                try {
                    SubLObject var789 = (SubLObject)module0618.NIL;
                    SubLObject var790 = (SubLObject)module0618.ZERO_INTEGER;
                    while (module0618.$ic81$ != var789) {
                        while (module0618.$ic81$ != var789 && var790.numL(var782)) {
                            var790 = Numbers.add(var790, (SubLObject)module0618.ONE_INTEGER);
                            var789 = module0021.f1060(var787, (SubLObject)module0618.NIL, (SubLObject)module0618.$ic81$);
                            if (module0618.$ic81$ != var789) {
                                f38157(var789);
                            }
                        }
                        var790 = (SubLObject)module0618.ZERO_INTEGER;
                    }
                }
                finally {
                    final SubLObject var36_795 = Threads.$is_thread_performing_cleanupP$.currentBinding(var783);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var783);
                        streams_high.close(var787, (SubLObject)module0618.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var36_795, var783);
                    }
                }
            }
            finally {
                module0018.$g574$.rebind(var788, var783);
            }
        }
        finally {
            final SubLObject var791 = Threads.$is_thread_performing_cleanupP$.currentBinding(var783);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var783);
                if (var784.isStream()) {
                    streams_high.close(var784, (SubLObject)module0618.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var791, var783);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38143(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0077.f5328(module0618.$g4750$.getGlobalValue());
        module0018.$g694$.setDynamicValue((SubLObject)module0618.NIL, var17);
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_796 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_797 = module0160.f10437(var74_796);
            final SubLObject var76_798 = module0160.f10418(var74_796);
            try {
                module0160.f10447(var74_796);
                module0160.f10417(var74_796);
                final SubLObject var74_797 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_798 = module0160.f10437(var74_797);
                final SubLObject var76_799 = module0160.f10418(var74_797);
                try {
                    module0160.f10447(var74_797);
                    module0160.f10417(var74_797);
                    final SubLObject var74_798 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_799 = module0160.f10437(var74_798);
                    final SubLObject var76_800 = module0160.f10418(var74_798);
                    try {
                        module0160.f10447(var74_798);
                        module0160.f10417(var74_798);
                        final SubLObject var74_799 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_800 = module0160.f10437(var74_799);
                        final SubLObject var76_801 = module0160.f10418(var74_799);
                        try {
                            module0160.f10447(var74_799);
                            module0160.f10417(var74_799);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_809 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_809, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    SubLObject var28 = (SubLObject)module0618.NIL;
                                    SubLObject var29 = (SubLObject)module0618.NIL;
                                    SubLObject var30 = (SubLObject)module0618.NIL;
                                    final SubLObject var31 = module0128.f8425();
                                    final SubLObject var32 = (SubLObject)module0618.$ic309$;
                                    final SubLObject var33 = module0065.f4733(var31);
                                    SubLObject var34 = (SubLObject)module0618.ZERO_INTEGER;
                                    assert module0618.NIL != Types.stringp(var32) : var32;
                                    final SubLObject var36_810 = module0012.$g75$.currentBinding(var17);
                                    final SubLObject var37_812 = module0012.$g76$.currentBinding(var17);
                                    final SubLObject var38_813 = module0012.$g77$.currentBinding(var17);
                                    final SubLObject var39_814 = module0012.$g78$.currentBinding(var17);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var17);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var17);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var17);
                                        module0012.$g78$.bind(Time.get_universal_time(), var17);
                                        module0012.f478(var32);
                                        final SubLObject var229_815 = var31;
                                        if (module0618.NIL == module0065.f4772(var229_815, (SubLObject)module0618.$ic93$)) {
                                            final SubLObject var231_816 = var229_815;
                                            if (module0618.NIL == module0065.f4775(var231_816, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var35 = module0065.f4740(var231_816);
                                                final SubLObject var36 = (SubLObject)module0618.NIL;
                                                SubLObject var37;
                                                SubLObject var38;
                                                SubLObject var39;
                                                SubLObject var40;
                                                for (var37 = Sequences.length(var35), var38 = (SubLObject)module0618.NIL, var38 = (SubLObject)module0618.ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER)) {
                                                    var39 = ((module0618.NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)module0618.ONE_INTEGER) : var38);
                                                    var40 = Vectors.aref(var35, var39);
                                                    if (module0618.NIL == module0065.f4749(var40) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                        if (module0618.NIL != module0065.f4749(var40)) {
                                                            var40 = (SubLObject)module0618.$ic93$;
                                                        }
                                                        module0012.note_percent_progress(var34, var33);
                                                        var34 = Numbers.add(var34, (SubLObject)module0618.ONE_INTEGER);
                                                        var30 = (SubLObject)module0618.NIL;
                                                        var28 = module0213.f14078(module0166.f10743(var40), (SubLObject)module0618.UNPROVIDED);
                                                        if (module0618.NIL == var30 && module0618.NIL == var28) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        var29 = module0213.f14078(module0166.f10744(var40), (SubLObject)module0618.UNPROVIDED);
                                                        if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        if (module0618.NIL == var30 && module0618.NIL == module0166.f10737(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        if (module0618.NIL == var30 && module0618.NIL == module0166.f10746(Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        if (module0618.NIL != var30) {
                                                            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic310$, var40, module0128.f8440(var40));
                                                            module0077.f5326(var40, module0618.$g4750$.getGlobalValue());
                                                        }
                                                        else {
                                                            PrintLow.format(var27, (SubLObject)module0618.$ic311$, var28, var29);
                                                        }
                                                    }
                                                }
                                            }
                                            final SubLObject var239_817 = var229_815;
                                            if (module0618.NIL == module0065.f4777(var239_817) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                final SubLObject var41 = module0065.f4738(var239_817);
                                                SubLObject var42 = module0065.f4739(var239_817);
                                                final SubLObject var43 = module0065.f4734(var239_817);
                                                final SubLObject var44 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                while (var42.numL(var43)) {
                                                    final SubLObject var45 = Hashtables.gethash_without_values(var42, var41, var44);
                                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var45)) {
                                                        module0012.note_percent_progress(var34, var33);
                                                        var34 = Numbers.add(var34, (SubLObject)module0618.ONE_INTEGER);
                                                        var30 = (SubLObject)module0618.NIL;
                                                        var28 = module0213.f14078(module0166.f10743(var45), (SubLObject)module0618.UNPROVIDED);
                                                        if (module0618.NIL == var30 && module0618.NIL == var28) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        var29 = module0213.f14078(module0166.f10744(var45), (SubLObject)module0618.UNPROVIDED);
                                                        if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        if (module0618.NIL == var30 && module0618.NIL == module0166.f10737(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        if (module0618.NIL == var30 && module0618.NIL == module0166.f10746(Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                            var30 = (SubLObject)module0618.T;
                                                        }
                                                        if (module0618.NIL != var30) {
                                                            PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic310$, var45, module0128.f8440(var45));
                                                            module0077.f5326(var45, module0618.$g4750$.getGlobalValue());
                                                        }
                                                        else {
                                                            PrintLow.format(var27, (SubLObject)module0618.$ic311$, var28, var29);
                                                        }
                                                    }
                                                    var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                                }
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var39_814, var17);
                                        module0012.$g77$.rebind(var38_813, var17);
                                        module0012.$g76$.rebind(var37_812, var17);
                                        module0012.$g75$.rebind(var36_810, var17);
                                    }
                                    streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                }
                                finally {
                                    final SubLObject var36_811 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_811, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_800) {
                                    module0160.f10446(var74_799);
                                }
                                if (module0618.NIL == var76_801) {
                                    module0160.f10414(var74_799, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var46, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_799) {
                                module0160.f10446(var74_798);
                            }
                            if (module0618.NIL == var76_800) {
                                module0160.f10414(var74_798, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var47, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_798) {
                            module0160.f10446(var74_797);
                        }
                        if (module0618.NIL == var76_799) {
                            module0160.f10414(var74_797, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var48, var17);
                    }
                }
            }
            finally {
                final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_797) {
                        module0160.f10446(var74_796);
                    }
                    if (module0618.NIL == var76_798) {
                        module0160.f10414(var74_796, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var49, var17);
                }
            }
        }
        finally {
            final SubLObject var50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var50, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38144(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0077.f5328(module0618.$g4751$.getGlobalValue());
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_819 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_820 = module0160.f10437(var74_819);
            final SubLObject var76_821 = module0160.f10418(var74_819);
            try {
                module0160.f10447(var74_819);
                module0160.f10417(var74_819);
                final SubLObject var74_820 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_821 = module0160.f10437(var74_820);
                final SubLObject var76_822 = module0160.f10418(var74_820);
                try {
                    module0160.f10447(var74_820);
                    module0160.f10417(var74_820);
                    final SubLObject var74_821 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_822 = module0160.f10437(var74_821);
                    final SubLObject var76_823 = module0160.f10418(var74_821);
                    try {
                        module0160.f10447(var74_821);
                        module0160.f10417(var74_821);
                        final SubLObject var74_822 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_823 = module0160.f10437(var74_822);
                        final SubLObject var76_824 = module0160.f10418(var74_822);
                        try {
                            module0160.f10447(var74_822);
                            module0160.f10417(var74_822);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_832 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_832, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    SubLObject var28 = (SubLObject)module0618.NIL;
                                    SubLObject var29 = (SubLObject)module0618.NIL;
                                    final SubLObject var30 = module0077.f5313((SubLObject)module0618.EQL, (SubLObject)module0618.$ic312$);
                                    final SubLObject var31 = module0167.f10788();
                                    final SubLObject var32 = (SubLObject)module0618.$ic313$;
                                    final SubLObject var33 = module0065.f4733(var31);
                                    SubLObject var34 = (SubLObject)module0618.ZERO_INTEGER;
                                    assert module0618.NIL != Types.stringp(var32) : var32;
                                    final SubLObject var36_833 = module0012.$g75$.currentBinding(var17);
                                    final SubLObject var37_835 = module0012.$g76$.currentBinding(var17);
                                    final SubLObject var38_836 = module0012.$g77$.currentBinding(var17);
                                    final SubLObject var39_837 = module0012.$g78$.currentBinding(var17);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var17);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var17);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var17);
                                        module0012.$g78$.bind(Time.get_universal_time(), var17);
                                        module0012.f478(var32);
                                        final SubLObject var229_838 = var31;
                                        if (module0618.NIL == module0065.f4772(var229_838, (SubLObject)module0618.$ic93$)) {
                                            final SubLObject var231_839 = var229_838;
                                            if (module0618.NIL == module0065.f4775(var231_839, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var35 = module0065.f4740(var231_839);
                                                final SubLObject var36 = (SubLObject)module0618.NIL;
                                                SubLObject var37;
                                                SubLObject var38;
                                                SubLObject var39;
                                                SubLObject var40;
                                                for (var37 = Sequences.length(var35), var38 = (SubLObject)module0618.NIL, var38 = (SubLObject)module0618.ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER)) {
                                                    var39 = ((module0618.NIL != var36) ? Numbers.subtract(var37, var38, (SubLObject)module0618.ONE_INTEGER) : var38);
                                                    var40 = Vectors.aref(var35, var39);
                                                    if (module0618.NIL == module0065.f4749(var40) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                        if (module0618.NIL != module0065.f4749(var40)) {
                                                            var40 = (SubLObject)module0618.$ic93$;
                                                        }
                                                        module0012.note_percent_progress(var34, var33);
                                                        var34 = Numbers.add(var34, (SubLObject)module0618.ONE_INTEGER);
                                                        if (module0618.ZERO_INTEGER.numE(f38159(var40))) {
                                                            var29 = (SubLObject)module0618.NIL;
                                                            var28 = module0213.f14078(module0172.f10915(var40), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var28) {
                                                                var29 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL == var29 && module0618.NIL == module0172.f10921(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                var29 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL != var29) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic314$, var40, module0167.f10803(var40));
                                                                module0077.f5326(var40, module0618.$g4751$.getGlobalValue());
                                                            }
                                                            else {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic315$, var28);
                                                            }
                                                        }
                                                        else {
                                                            module0077.f5326(var40, var30);
                                                        }
                                                    }
                                                }
                                            }
                                            final SubLObject var239_840 = var229_838;
                                            if (module0618.NIL == module0065.f4777(var239_840) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                final SubLObject var41 = module0065.f4738(var239_840);
                                                SubLObject var42 = module0065.f4739(var239_840);
                                                final SubLObject var43 = module0065.f4734(var239_840);
                                                final SubLObject var44 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                while (var42.numL(var43)) {
                                                    final SubLObject var45 = Hashtables.gethash_without_values(var42, var41, var44);
                                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var45)) {
                                                        module0012.note_percent_progress(var34, var33);
                                                        var34 = Numbers.add(var34, (SubLObject)module0618.ONE_INTEGER);
                                                        if (module0618.ZERO_INTEGER.numE(f38159(var45))) {
                                                            var29 = (SubLObject)module0618.NIL;
                                                            var28 = module0213.f14078(module0172.f10915(var45), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var28) {
                                                                var29 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL == var29 && module0618.NIL == module0172.f10921(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                var29 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL != var29) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic314$, var45, module0167.f10803(var45));
                                                                module0077.f5326(var45, module0618.$g4751$.getGlobalValue());
                                                            }
                                                            else {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic315$, var28);
                                                            }
                                                        }
                                                        else {
                                                            module0077.f5326(var45, var30);
                                                        }
                                                    }
                                                    var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                                }
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var39_837, var17);
                                        module0012.$g77$.rebind(var38_836, var17);
                                        module0012.$g76$.rebind(var37_835, var17);
                                        module0012.$g75$.rebind(var36_833, var17);
                                    }
                                    SubLObject var46 = (SubLObject)module0618.ONE_INTEGER;
                                    while (module0077.f5311(var30).numG((SubLObject)module0618.ZERO_INTEGER)) {
                                        SubLObject var47 = module0077.f5312(var30);
                                        SubLObject var48 = (SubLObject)module0618.NIL;
                                        var48 = var47.first();
                                        while (module0618.NIL != var47) {
                                            if (var46.numE(f38159(var48))) {
                                                var29 = (SubLObject)module0618.NIL;
                                                var28 = module0213.f14078(module0172.f10915(var48), (SubLObject)module0618.UNPROVIDED);
                                                if (module0618.NIL == var28) {
                                                    var29 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL == var29 && module0618.NIL == module0172.f10921(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                    var29 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL != var29) {
                                                    PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic314$, var48, module0167.f10803(var48));
                                                    module0077.f5326(var48, module0618.$g4751$.getGlobalValue());
                                                }
                                                else {
                                                    PrintLow.format(var27, (SubLObject)module0618.$ic315$, var28);
                                                }
                                                module0077.f5327(var48, var30);
                                            }
                                            var47 = var47.rest();
                                            var48 = var47.first();
                                        }
                                        var46 = Numbers.add(var46, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                    streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                }
                                finally {
                                    final SubLObject var36_834 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_834, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_823) {
                                    module0160.f10446(var74_822);
                                }
                                if (module0618.NIL == var76_824) {
                                    module0160.f10414(var74_822, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var49, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_822) {
                                module0160.f10446(var74_821);
                            }
                            if (module0618.NIL == var76_823) {
                                module0160.f10414(var74_821, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var50, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_821) {
                            module0160.f10446(var74_820);
                        }
                        if (module0618.NIL == var76_822) {
                            module0160.f10414(var74_820, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var51, var17);
                    }
                }
            }
            finally {
                final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_820) {
                        module0160.f10446(var74_819);
                    }
                    if (module0618.NIL == var76_821) {
                        module0160.f10414(var74_819, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var52, var17);
                }
            }
        }
        finally {
            final SubLObject var53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var53, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38145(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0077.f5328(module0618.$g4752$.getGlobalValue());
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_843 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_844 = module0160.f10437(var74_843);
            final SubLObject var76_845 = module0160.f10418(var74_843);
            try {
                module0160.f10447(var74_843);
                module0160.f10417(var74_843);
                final SubLObject var74_844 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_845 = module0160.f10437(var74_844);
                final SubLObject var76_846 = module0160.f10418(var74_844);
                try {
                    module0160.f10447(var74_844);
                    module0160.f10417(var74_844);
                    final SubLObject var74_845 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_846 = module0160.f10437(var74_845);
                    final SubLObject var76_847 = module0160.f10418(var74_845);
                    try {
                        module0160.f10447(var74_845);
                        module0160.f10417(var74_845);
                        final SubLObject var74_846 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_847 = module0160.f10437(var74_846);
                        final SubLObject var76_848 = module0160.f10418(var74_846);
                        try {
                            module0160.f10447(var74_846);
                            module0160.f10417(var74_846);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_856 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_856, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    SubLObject var28 = (SubLObject)module0618.NIL;
                                    SubLObject var29 = (SubLObject)module0618.NIL;
                                    SubLObject var30 = (SubLObject)module0618.NIL;
                                    final SubLObject var31 = module0077.f5313((SubLObject)module0618.EQL, (SubLObject)module0618.$ic316$);
                                    final SubLObject var32 = module0174.f11010();
                                    final SubLObject var33 = (SubLObject)module0618.$ic317$;
                                    final SubLObject var34 = module0065.f4733(var32);
                                    SubLObject var35 = (SubLObject)module0618.ZERO_INTEGER;
                                    assert module0618.NIL != Types.stringp(var33) : var33;
                                    final SubLObject var36_857 = module0012.$g75$.currentBinding(var17);
                                    final SubLObject var37_861 = module0012.$g76$.currentBinding(var17);
                                    final SubLObject var38_862 = module0012.$g77$.currentBinding(var17);
                                    final SubLObject var39_863 = module0012.$g78$.currentBinding(var17);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var17);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var17);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var17);
                                        module0012.$g78$.bind(Time.get_universal_time(), var17);
                                        module0012.f478(var33);
                                        final SubLObject var229_864 = var32;
                                        if (module0618.NIL == module0065.f4772(var229_864, (SubLObject)module0618.$ic93$)) {
                                            final SubLObject var231_865 = var229_864;
                                            if (module0618.NIL == module0065.f4775(var231_865, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var36 = module0065.f4740(var231_865);
                                                final SubLObject var37 = (SubLObject)module0618.NIL;
                                                SubLObject var38;
                                                SubLObject var39;
                                                SubLObject var40;
                                                SubLObject var41;
                                                SubLObject var42;
                                                SubLObject var43;
                                                SubLObject var44;
                                                SubLObject var45;
                                                for (var38 = Sequences.length(var36), var39 = (SubLObject)module0618.NIL, var39 = (SubLObject)module0618.ZERO_INTEGER; var39.numL(var38); var39 = Numbers.add(var39, (SubLObject)module0618.ONE_INTEGER)) {
                                                    var40 = ((module0618.NIL != var37) ? Numbers.subtract(var38, var39, (SubLObject)module0618.ONE_INTEGER) : var39);
                                                    var41 = Vectors.aref(var36, var40);
                                                    if (module0618.NIL == module0065.f4749(var41) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                        if (module0618.NIL != module0065.f4749(var41)) {
                                                            var41 = (SubLObject)module0618.$ic93$;
                                                        }
                                                        module0012.note_percent_progress(var35, var34);
                                                        var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER);
                                                        if (module0618.ONE_INTEGER.numE(module0213.f13939(var41))) {
                                                            var30 = (SubLObject)module0618.NIL;
                                                            var28 = module0213.f14078(module0178.f11282(var41), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var28) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            var29 = module0213.f14078(module0178.f11287(var41), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL == var30 && module0618.NIL == module0217.f14415(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL != var30) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic318$, var41, module0174.f11025(var41));
                                                                module0077.f5326(var41, module0618.$g4752$.getGlobalValue());
                                                            }
                                                            else {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic319$, new SubLObject[] { var28, var29, module0178.f11294(var41), module0178.f11291(var41), module0178.f11292(var41), module0178.f11293(var41), module0178.f11378(var41) });
                                                            }
                                                            var42 = module0178.f11295(var41);
                                                            var43 = module0178.f11296(var41);
                                                            var44 = module0178.f11297(var41);
                                                            var45 = module0178.f11298(var41);
                                                            if (module0618.NIL != var42 || module0618.NIL != var43 || module0618.NIL != var44 || module0618.NIL != var45) {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic320$, new SubLObject[] { module0213.f14078(var42, (SubLObject)module0618.UNPROVIDED), var43, module0213.f14078(var44, (SubLObject)module0618.UNPROVIDED), var45 });
                                                            }
                                                        }
                                                        else {
                                                            module0077.f5326(var41, var31);
                                                        }
                                                    }
                                                }
                                            }
                                            final SubLObject var239_870 = var229_864;
                                            if (module0618.NIL == module0065.f4777(var239_870) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                final SubLObject var46 = module0065.f4738(var239_870);
                                                SubLObject var47 = module0065.f4739(var239_870);
                                                final SubLObject var48 = module0065.f4734(var239_870);
                                                final SubLObject var49 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                while (var47.numL(var48)) {
                                                    final SubLObject var50 = Hashtables.gethash_without_values(var47, var46, var49);
                                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var50)) {
                                                        module0012.note_percent_progress(var35, var34);
                                                        var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER);
                                                        if (module0618.ONE_INTEGER.numE(module0213.f13939(var50))) {
                                                            var30 = (SubLObject)module0618.NIL;
                                                            var28 = module0213.f14078(module0178.f11282(var50), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var28) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            var29 = module0213.f14078(module0178.f11287(var50), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL == var30 && module0618.NIL == module0217.f14415(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL != var30) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic318$, var50, module0174.f11025(var50));
                                                                module0077.f5326(var50, module0618.$g4752$.getGlobalValue());
                                                            }
                                                            else {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic319$, new SubLObject[] { var28, var29, module0178.f11294(var50), module0178.f11291(var50), module0178.f11292(var50), module0178.f11293(var50), module0178.f11378(var50) });
                                                            }
                                                            final SubLObject var51 = module0178.f11295(var50);
                                                            final SubLObject var52 = module0178.f11296(var50);
                                                            final SubLObject var53 = module0178.f11297(var50);
                                                            final SubLObject var54 = module0178.f11298(var50);
                                                            if (module0618.NIL != var51 || module0618.NIL != var52 || module0618.NIL != var53 || module0618.NIL != var54) {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic320$, new SubLObject[] { module0213.f14078(var51, (SubLObject)module0618.UNPROVIDED), var52, module0213.f14078(var53, (SubLObject)module0618.UNPROVIDED), var54 });
                                                            }
                                                        }
                                                        else {
                                                            module0077.f5326(var50, var31);
                                                        }
                                                    }
                                                    var47 = Numbers.add(var47, (SubLObject)module0618.ONE_INTEGER);
                                                }
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var39_863, var17);
                                        module0012.$g77$.rebind(var38_862, var17);
                                        module0012.$g76$.rebind(var37_861, var17);
                                        module0012.$g75$.rebind(var36_857, var17);
                                    }
                                    SubLObject var55 = (SubLObject)module0618.ONE_INTEGER;
                                    while (module0077.f5311(var31).numG((SubLObject)module0618.ZERO_INTEGER)) {
                                        SubLObject var56 = module0077.f5312(var31);
                                        SubLObject var57 = (SubLObject)module0618.NIL;
                                        var57 = var56.first();
                                        while (module0618.NIL != var56) {
                                            if (var55.numE(module0213.f13939(var57))) {
                                                var30 = (SubLObject)module0618.NIL;
                                                var28 = module0213.f14078(module0178.f11282(var57), (SubLObject)module0618.UNPROVIDED);
                                                if (module0618.NIL == var28) {
                                                    var30 = (SubLObject)module0618.T;
                                                }
                                                var29 = module0213.f14078(module0178.f11287(var57), (SubLObject)module0618.UNPROVIDED);
                                                if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                    var30 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL == var30 && module0618.NIL == module0217.f14415(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                    var30 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL != var30) {
                                                    PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic318$, var57, module0174.f11025(var57));
                                                    module0077.f5326(var57, module0618.$g4752$.getGlobalValue());
                                                }
                                                else {
                                                    PrintLow.format(var27, (SubLObject)module0618.$ic319$, new SubLObject[] { var28, var29, module0178.f11294(var57), module0178.f11291(var57), module0178.f11292(var57), module0178.f11293(var57), module0178.f11378(var57) });
                                                }
                                                final SubLObject var58 = module0178.f11295(var57);
                                                final SubLObject var59 = module0178.f11296(var57);
                                                final SubLObject var60 = module0178.f11297(var57);
                                                final SubLObject var61 = module0178.f11298(var57);
                                                if (module0618.NIL != var58 || module0618.NIL != var59 || module0618.NIL != var60 || module0618.NIL != var61) {
                                                    PrintLow.format(var27, (SubLObject)module0618.$ic320$, new SubLObject[] { module0213.f14078(var58, (SubLObject)module0618.UNPROVIDED), var59, module0213.f14078(var60, (SubLObject)module0618.UNPROVIDED), var61 });
                                                }
                                                module0077.f5327(var57, var31);
                                            }
                                            var56 = var56.rest();
                                            var57 = var56.first();
                                        }
                                        var55 = Numbers.add(var55, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                    streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                }
                                finally {
                                    final SubLObject var36_858 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_858, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_847) {
                                    module0160.f10446(var74_846);
                                }
                                if (module0618.NIL == var76_848) {
                                    module0160.f10414(var74_846, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var62, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_846) {
                                module0160.f10446(var74_845);
                            }
                            if (module0618.NIL == var76_847) {
                                module0160.f10414(var74_845, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var63, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_845) {
                            module0160.f10446(var74_844);
                        }
                        if (module0618.NIL == var76_846) {
                            module0160.f10414(var74_844, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var64, var17);
                    }
                }
            }
            finally {
                final SubLObject var65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_844) {
                        module0160.f10446(var74_843);
                    }
                    if (module0618.NIL == var76_845) {
                        module0160.f10414(var74_843, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var65, var17);
                }
            }
        }
        finally {
            final SubLObject var66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var66, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38146(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0077.f5328(module0618.$g4753$.getGlobalValue());
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_872 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_873 = module0160.f10437(var74_872);
            final SubLObject var76_874 = module0160.f10418(var74_872);
            try {
                module0160.f10447(var74_872);
                module0160.f10417(var74_872);
                final SubLObject var74_873 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_874 = module0160.f10437(var74_873);
                final SubLObject var76_875 = module0160.f10418(var74_873);
                try {
                    module0160.f10447(var74_873);
                    module0160.f10417(var74_873);
                    final SubLObject var74_874 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_875 = module0160.f10437(var74_874);
                    final SubLObject var76_876 = module0160.f10418(var74_874);
                    try {
                        module0160.f10447(var74_874);
                        module0160.f10417(var74_874);
                        final SubLObject var74_875 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_876 = module0160.f10437(var74_875);
                        final SubLObject var76_877 = module0160.f10418(var74_875);
                        try {
                            module0160.f10447(var74_875);
                            module0160.f10417(var74_875);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_885 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_885, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    SubLObject var28 = (SubLObject)module0618.NIL;
                                    SubLObject var29 = (SubLObject)module0618.NIL;
                                    SubLObject var30 = (SubLObject)module0618.NIL;
                                    final SubLObject var31 = module0077.f5313((SubLObject)module0618.EQL, (SubLObject)module0618.$ic316$);
                                    final SubLObject var32 = module0179.f11398();
                                    final SubLObject var33 = (SubLObject)module0618.$ic321$;
                                    final SubLObject var34 = module0065.f4733(var32);
                                    SubLObject var35 = (SubLObject)module0618.ZERO_INTEGER;
                                    assert module0618.NIL != Types.stringp(var33) : var33;
                                    final SubLObject var36_886 = module0012.$g75$.currentBinding(var17);
                                    final SubLObject var37_890 = module0012.$g76$.currentBinding(var17);
                                    final SubLObject var38_891 = module0012.$g77$.currentBinding(var17);
                                    final SubLObject var39_892 = module0012.$g78$.currentBinding(var17);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var17);
                                        module0012.$g76$.bind((SubLObject)module0618.NIL, var17);
                                        module0012.$g77$.bind((SubLObject)module0618.T, var17);
                                        module0012.$g78$.bind(Time.get_universal_time(), var17);
                                        module0012.f478(var33);
                                        final SubLObject var229_893 = var32;
                                        if (module0618.NIL == module0065.f4772(var229_893, (SubLObject)module0618.$ic93$)) {
                                            final SubLObject var231_894 = var229_893;
                                            if (module0618.NIL == module0065.f4775(var231_894, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var36 = module0065.f4740(var231_894);
                                                final SubLObject var37 = (SubLObject)module0618.NIL;
                                                SubLObject var38;
                                                SubLObject var39;
                                                SubLObject var40;
                                                SubLObject var41;
                                                for (var38 = Sequences.length(var36), var39 = (SubLObject)module0618.NIL, var39 = (SubLObject)module0618.ZERO_INTEGER; var39.numL(var38); var39 = Numbers.add(var39, (SubLObject)module0618.ONE_INTEGER)) {
                                                    var40 = ((module0618.NIL != var37) ? Numbers.subtract(var38, var39, (SubLObject)module0618.ONE_INTEGER) : var39);
                                                    var41 = Vectors.aref(var36, var40);
                                                    if (module0618.NIL == module0065.f4749(var41) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                        if (module0618.NIL != module0065.f4749(var41)) {
                                                            var41 = (SubLObject)module0618.$ic93$;
                                                        }
                                                        module0012.note_percent_progress(var35, var34);
                                                        var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER);
                                                        if (module0618.ZERO_INTEGER.numE(f38160(var41))) {
                                                            var30 = (SubLObject)module0618.NIL;
                                                            var28 = module0213.f14078(module0183.f11557(var41), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var28) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            var29 = module0213.f14078(module0183.f11558(var41), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL == var30 && module0618.NIL == module0183.f11552(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL != var30) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic322$, var41, module0179.f11415(var41));
                                                                module0077.f5326(var41, module0618.$g4753$.getGlobalValue());
                                                            }
                                                            else {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic323$, var28, var29);
                                                            }
                                                        }
                                                        else {
                                                            module0077.f5326(var41, var31);
                                                        }
                                                    }
                                                }
                                            }
                                            final SubLObject var239_895 = var229_893;
                                            if (module0618.NIL == module0065.f4777(var239_895) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                final SubLObject var42 = module0065.f4738(var239_895);
                                                SubLObject var43 = module0065.f4739(var239_895);
                                                final SubLObject var44 = module0065.f4734(var239_895);
                                                final SubLObject var45 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                while (var43.numL(var44)) {
                                                    final SubLObject var46 = Hashtables.gethash_without_values(var43, var42, var45);
                                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var46)) {
                                                        module0012.note_percent_progress(var35, var34);
                                                        var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER);
                                                        if (module0618.ZERO_INTEGER.numE(f38160(var46))) {
                                                            var30 = (SubLObject)module0618.NIL;
                                                            var28 = module0213.f14078(module0183.f11557(var46), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var28) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            var29 = module0213.f14078(module0183.f11558(var46), (SubLObject)module0618.UNPROVIDED);
                                                            if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL == var30 && module0618.NIL == module0183.f11552(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                var30 = (SubLObject)module0618.T;
                                                            }
                                                            if (module0618.NIL != var30) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic322$, var46, module0179.f11415(var46));
                                                                module0077.f5326(var46, module0618.$g4753$.getGlobalValue());
                                                            }
                                                            else {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic323$, var28, var29);
                                                            }
                                                        }
                                                        else {
                                                            module0077.f5326(var46, var31);
                                                        }
                                                    }
                                                    var43 = Numbers.add(var43, (SubLObject)module0618.ONE_INTEGER);
                                                }
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var39_892, var17);
                                        module0012.$g77$.rebind(var38_891, var17);
                                        module0012.$g76$.rebind(var37_890, var17);
                                        module0012.$g75$.rebind(var36_886, var17);
                                    }
                                    SubLObject var47 = (SubLObject)module0618.ONE_INTEGER;
                                    while (module0077.f5311(var31).numG((SubLObject)module0618.ZERO_INTEGER)) {
                                        SubLObject var48 = module0077.f5312(var31);
                                        SubLObject var49 = (SubLObject)module0618.NIL;
                                        var49 = var48.first();
                                        while (module0618.NIL != var48) {
                                            if (var47.numE(f38160(var49))) {
                                                var30 = (SubLObject)module0618.NIL;
                                                var28 = module0213.f14078(module0183.f11557(var49), (SubLObject)module0618.UNPROVIDED);
                                                if (module0618.NIL == var28) {
                                                    var30 = (SubLObject)module0618.T;
                                                }
                                                var29 = module0213.f14078(module0183.f11558(var49), (SubLObject)module0618.UNPROVIDED);
                                                if (module0618.NIL == var30 && module0618.NIL == var29) {
                                                    var30 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL == var30 && module0618.NIL == module0183.f11552(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                    var30 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL != var30) {
                                                    PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic322$, var49, module0179.f11415(var49));
                                                    module0077.f5326(var49, module0618.$g4753$.getGlobalValue());
                                                }
                                                else {
                                                    PrintLow.format(var27, (SubLObject)module0618.$ic323$, var28, var29);
                                                }
                                                module0077.f5327(var49, var31);
                                            }
                                            var48 = var48.rest();
                                            var49 = var48.first();
                                        }
                                        var47 = Numbers.add(var47, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                    streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                }
                                finally {
                                    final SubLObject var36_887 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_887, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_876) {
                                    module0160.f10446(var74_875);
                                }
                                if (module0618.NIL == var76_877) {
                                    module0160.f10414(var74_875, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var50, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_875) {
                                module0160.f10446(var74_874);
                            }
                            if (module0618.NIL == var76_876) {
                                module0160.f10414(var74_874, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var51, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_874) {
                            module0160.f10446(var74_873);
                        }
                        if (module0618.NIL == var76_875) {
                            module0160.f10414(var74_873, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var52, var17);
                    }
                }
            }
            finally {
                final SubLObject var53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_873) {
                        module0160.f10446(var74_872);
                    }
                    if (module0618.NIL == var76_874) {
                        module0160.f10414(var74_872, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var53, var17);
                }
            }
        }
        finally {
            final SubLObject var54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var54, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38148(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_897 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_898 = module0160.f10437(var74_897);
            final SubLObject var76_899 = module0160.f10418(var74_897);
            try {
                module0160.f10447(var74_897);
                module0160.f10417(var74_897);
                final SubLObject var74_898 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_899 = module0160.f10437(var74_898);
                final SubLObject var76_900 = module0160.f10418(var74_898);
                try {
                    module0160.f10447(var74_898);
                    module0160.f10417(var74_898);
                    final SubLObject var74_899 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_900 = module0160.f10437(var74_899);
                    final SubLObject var76_901 = module0160.f10418(var74_899);
                    try {
                        module0160.f10447(var74_899);
                        module0160.f10417(var74_899);
                        final SubLObject var74_900 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_901 = module0160.f10437(var74_900);
                        final SubLObject var76_902 = module0160.f10418(var74_900);
                        try {
                            module0160.f10447(var74_900);
                            module0160.f10417(var74_900);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_910 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_910, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    try {
                                        final SubLObject var28 = module0179.f11398();
                                        final SubLObject var29 = (SubLObject)module0618.$ic324$;
                                        final SubLObject var30 = module0065.f4733(var28);
                                        SubLObject var31 = (SubLObject)module0618.ZERO_INTEGER;
                                        assert module0618.NIL != Types.stringp(var29) : var29;
                                        final SubLObject var36_911 = module0012.$g75$.currentBinding(var17);
                                        final SubLObject var37_912 = module0012.$g76$.currentBinding(var17);
                                        final SubLObject var38_913 = module0012.$g77$.currentBinding(var17);
                                        final SubLObject var39_914 = module0012.$g78$.currentBinding(var17);
                                        try {
                                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var17);
                                            module0012.$g76$.bind((SubLObject)module0618.NIL, var17);
                                            module0012.$g77$.bind((SubLObject)module0618.T, var17);
                                            module0012.$g78$.bind(Time.get_universal_time(), var17);
                                            module0012.f478(var29);
                                            final SubLObject var229_915 = var28;
                                            if (module0618.NIL == module0065.f4772(var229_915, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var231_916 = var229_915;
                                                if (module0618.NIL == module0065.f4775(var231_916, (SubLObject)module0618.$ic93$)) {
                                                    final SubLObject var32 = module0065.f4740(var231_916);
                                                    final SubLObject var33 = (SubLObject)module0618.NIL;
                                                    SubLObject var34;
                                                    SubLObject var35;
                                                    SubLObject var36;
                                                    SubLObject var37;
                                                    SubLObject var38;
                                                    SubLObject var39;
                                                    SubLObject var41;
                                                    SubLObject var40;
                                                    SubLObject var42;
                                                    for (var34 = Sequences.length(var32), var35 = (SubLObject)module0618.NIL, var35 = (SubLObject)module0618.ZERO_INTEGER; var35.numL(var34); var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER)) {
                                                        var36 = ((module0618.NIL != var33) ? Numbers.subtract(var34, var35, (SubLObject)module0618.ONE_INTEGER) : var35);
                                                        var37 = Vectors.aref(var32, var36);
                                                        if (module0618.NIL == module0065.f4749(var37) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                            if (module0618.NIL != module0065.f4749(var37)) {
                                                                var37 = (SubLObject)module0618.$ic93$;
                                                            }
                                                            module0012.note_percent_progress(var31, var30);
                                                            var31 = Numbers.add(var31, (SubLObject)module0618.ONE_INTEGER);
                                                            if (Sequences.length(module0180.f11455(var37)).numL((SubLObject)module0618.$ic325$)) {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic326$, module0213.f14078(var37, (SubLObject)module0618.UNPROVIDED), module0213.f14078(module0180.f11455(var37), (SubLObject)module0618.UNPROVIDED));
                                                            }
                                                            else {
                                                                var38 = module0180.f11455(var37);
                                                                var39 = (SubLObject)module0618.ZERO_INTEGER;
                                                                var40 = (var41 = (SubLObject)module0618.$ic325$);
                                                                var42 = Sequences.length(var38);
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic327$);
                                                                while (var39.numL(var42)) {
                                                                    PrintLow.format(var27, (SubLObject)module0618.$ic328$, module0213.f14078(Sequences.subseq(var38, var39, var41.numG(var42) ? var42 : var41), (SubLObject)module0618.UNPROVIDED));
                                                                    var39 = Numbers.add(var39, var40);
                                                                    var41 = Numbers.add(var41, var40);
                                                                }
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic329$, module0213.f14078(var37, (SubLObject)module0618.UNPROVIDED));
                                                            }
                                                        }
                                                    }
                                                }
                                                final SubLObject var239_922 = var229_915;
                                                if (module0618.NIL == module0065.f4777(var239_922) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                    final SubLObject var43 = module0065.f4738(var239_922);
                                                    SubLObject var44 = module0065.f4739(var239_922);
                                                    final SubLObject var45 = module0065.f4734(var239_922);
                                                    final SubLObject var46 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                    while (var44.numL(var45)) {
                                                        final SubLObject var47 = Hashtables.gethash_without_values(var44, var43, var46);
                                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var47)) {
                                                            module0012.note_percent_progress(var31, var30);
                                                            var31 = Numbers.add(var31, (SubLObject)module0618.ONE_INTEGER);
                                                            if (Sequences.length(module0180.f11455(var47)).numL((SubLObject)module0618.$ic325$)) {
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic326$, module0213.f14078(var47, (SubLObject)module0618.UNPROVIDED), module0213.f14078(module0180.f11455(var47), (SubLObject)module0618.UNPROVIDED));
                                                            }
                                                            else {
                                                                final SubLObject var48 = module0180.f11455(var47);
                                                                SubLObject var49 = (SubLObject)module0618.ZERO_INTEGER;
                                                                SubLObject var51;
                                                                final SubLObject var50 = var51 = (SubLObject)module0618.$ic325$;
                                                                final SubLObject var52 = Sequences.length(var48);
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic327$);
                                                                while (var49.numL(var52)) {
                                                                    PrintLow.format(var27, (SubLObject)module0618.$ic328$, module0213.f14078(Sequences.subseq(var48, var49, var51.numG(var52) ? var52 : var51), (SubLObject)module0618.UNPROVIDED));
                                                                    var49 = Numbers.add(var49, var50);
                                                                    var51 = Numbers.add(var51, var50);
                                                                }
                                                                PrintLow.format(var27, (SubLObject)module0618.$ic329$, module0213.f14078(var47, (SubLObject)module0618.UNPROVIDED));
                                                            }
                                                        }
                                                        var44 = Numbers.add(var44, (SubLObject)module0618.ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            module0012.f479();
                                        }
                                        finally {
                                            module0012.$g78$.rebind(var39_914, var17);
                                            module0012.$g77$.rebind(var38_913, var17);
                                            module0012.$g76$.rebind(var37_912, var17);
                                            module0012.$g75$.rebind(var36_911, var17);
                                        }
                                    }
                                    finally {
                                        final SubLObject var36_912 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                            streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36_912, var17);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var36_913 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_913, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var53 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_901) {
                                    module0160.f10446(var74_900);
                                }
                                if (module0618.NIL == var76_902) {
                                    module0160.f10414(var74_900, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var53, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_900) {
                                module0160.f10446(var74_899);
                            }
                            if (module0618.NIL == var76_901) {
                                module0160.f10414(var74_899, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var54, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_899) {
                            module0160.f10446(var74_898);
                        }
                        if (module0618.NIL == var76_900) {
                            module0160.f10414(var74_898, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var55, var17);
                    }
                }
            }
            finally {
                final SubLObject var56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_898) {
                        module0160.f10446(var74_897);
                    }
                    if (module0618.NIL == var76_899) {
                        module0160.f10414(var74_897, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var56, var17);
                }
            }
        }
        finally {
            final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var57, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38161(final SubLObject var925) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0618.NIL != module0077.f5320(var925, module0618.$g4753$.getGlobalValue()) || module0618.NIL != module0077.f5320(var925, module0618.$g4752$.getGlobalValue()) || module0618.NIL != module0077.f5320(var925, module0618.$g4754$.getGlobalValue()));
    }
    
    public static SubLObject f38162(final SubLObject var361) {
        if (module0618.NIL != f38161(var361)) {
            return (SubLObject)module0618.T;
        }
        if (module0618.NIL != f38161(module0188.f11781(var361))) {
            return (SubLObject)module0618.T;
        }
        SubLObject var363;
        final SubLObject var362 = var363 = module0188.f11770(var361);
        SubLObject var364 = (SubLObject)module0618.NIL;
        var364 = var363.first();
        while (module0618.NIL != var363) {
            if (module0618.NIL != f38161(var364)) {
                return (SubLObject)module0618.T;
            }
            var363 = var363.rest();
            var364 = var363.first();
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38147(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        module0077.f5328(module0618.$g4754$.getGlobalValue());
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_928 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_929 = module0160.f10437(var74_928);
            final SubLObject var76_930 = module0160.f10418(var74_928);
            try {
                module0160.f10447(var74_928);
                module0160.f10417(var74_928);
                final SubLObject var74_929 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_930 = module0160.f10437(var74_929);
                final SubLObject var76_931 = module0160.f10418(var74_929);
                try {
                    module0160.f10447(var74_929);
                    module0160.f10417(var74_929);
                    final SubLObject var74_930 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_931 = module0160.f10437(var74_930);
                    final SubLObject var76_932 = module0160.f10418(var74_930);
                    try {
                        module0160.f10447(var74_930);
                        module0160.f10417(var74_930);
                        final SubLObject var74_931 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_932 = module0160.f10437(var74_931);
                        final SubLObject var76_933 = module0160.f10418(var74_931);
                        try {
                            module0160.f10447(var74_931);
                            module0160.f10417(var74_931);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_941 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_941, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    try {
                                        SubLObject var28 = (SubLObject)module0618.NIL;
                                        SubLObject var29 = (SubLObject)module0618.NIL;
                                        SubLObject var30 = (SubLObject)module0618.NIL;
                                        SubLObject var31 = (SubLObject)module0618.NIL;
                                        final SubLObject var32 = module0184.f11634();
                                        final SubLObject var33 = (SubLObject)module0618.$ic330$;
                                        final SubLObject var34 = module0065.f4733(var32);
                                        SubLObject var35 = (SubLObject)module0618.ZERO_INTEGER;
                                        assert module0618.NIL != Types.stringp(var33) : var33;
                                        final SubLObject var36_942 = module0012.$g75$.currentBinding(var17);
                                        final SubLObject var37_945 = module0012.$g76$.currentBinding(var17);
                                        final SubLObject var38_946 = module0012.$g77$.currentBinding(var17);
                                        final SubLObject var39_947 = module0012.$g78$.currentBinding(var17);
                                        try {
                                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var17);
                                            module0012.$g76$.bind((SubLObject)module0618.NIL, var17);
                                            module0012.$g77$.bind((SubLObject)module0618.T, var17);
                                            module0012.$g78$.bind(Time.get_universal_time(), var17);
                                            module0012.f478(var33);
                                            final SubLObject var229_948 = var32;
                                            if (module0618.NIL == module0065.f4772(var229_948, (SubLObject)module0618.$ic93$)) {
                                                final SubLObject var231_949 = var229_948;
                                                if (module0618.NIL == module0065.f4775(var231_949, (SubLObject)module0618.$ic93$)) {
                                                    final SubLObject var36 = module0065.f4740(var231_949);
                                                    final SubLObject var37 = (SubLObject)module0618.NIL;
                                                    SubLObject var38;
                                                    SubLObject var39;
                                                    SubLObject var40;
                                                    SubLObject var41;
                                                    for (var38 = Sequences.length(var36), var39 = (SubLObject)module0618.NIL, var39 = (SubLObject)module0618.ZERO_INTEGER; var39.numL(var38); var39 = Numbers.add(var39, (SubLObject)module0618.ONE_INTEGER)) {
                                                        var40 = ((module0618.NIL != var37) ? Numbers.subtract(var38, var39, (SubLObject)module0618.ONE_INTEGER) : var39);
                                                        var41 = Vectors.aref(var36, var40);
                                                        if (module0618.NIL == module0065.f4749(var41) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                            if (module0618.NIL != module0065.f4749(var41)) {
                                                                var41 = (SubLObject)module0618.$ic93$;
                                                            }
                                                            module0012.note_percent_progress(var35, var34);
                                                            var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER);
                                                            if (module0618.NIL != f38162(var41)) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic331$, var41, module0184.f11649(var41));
                                                                module0077.f5326(var41, module0618.$g4753$.getGlobalValue());
                                                            }
                                                            else {
                                                                var31 = (SubLObject)module0618.NIL;
                                                                var28 = module0213.f14078(module0188.f11781(var41), (SubLObject)module0618.UNPROVIDED);
                                                                if (module0618.NIL == var28) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                var29 = module0213.f14078(module0188.f11770(var41), (SubLObject)module0618.UNPROVIDED);
                                                                if (module0618.NIL == var31 && module0618.NIL == var29) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                var30 = module0213.f14078(module0188.f11789(var41), (SubLObject)module0618.UNPROVIDED);
                                                                if (module0618.NIL == var31 && module0618.NIL == var30) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                if (module0618.NIL == var31 && module0618.NIL == module0188.f11778(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var30, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                if (module0618.NIL != var31) {
                                                                    PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic331$, var41, module0184.f11649(var41));
                                                                    module0077.f5326(var41, module0618.$g4754$.getGlobalValue());
                                                                }
                                                                else {
                                                                    PrintLow.format(var27, (SubLObject)module0618.$ic332$, new SubLObject[] { var28, var29, var30, module0213.f14078(module0188.f11790(var41), (SubLObject)module0618.UNPROVIDED) });
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                final SubLObject var239_950 = var229_948;
                                                if (module0618.NIL == module0065.f4777(var239_950) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                                    final SubLObject var42 = module0065.f4738(var239_950);
                                                    SubLObject var43 = module0065.f4739(var239_950);
                                                    final SubLObject var44 = module0065.f4734(var239_950);
                                                    final SubLObject var45 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                                    while (var43.numL(var44)) {
                                                        final SubLObject var46 = Hashtables.gethash_without_values(var43, var42, var45);
                                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var46)) {
                                                            module0012.note_percent_progress(var35, var34);
                                                            var35 = Numbers.add(var35, (SubLObject)module0618.ONE_INTEGER);
                                                            if (module0618.NIL != f38162(var46)) {
                                                                PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic331$, var46, module0184.f11649(var46));
                                                                module0077.f5326(var46, module0618.$g4753$.getGlobalValue());
                                                            }
                                                            else {
                                                                var31 = (SubLObject)module0618.NIL;
                                                                var28 = module0213.f14078(module0188.f11781(var46), (SubLObject)module0618.UNPROVIDED);
                                                                if (module0618.NIL == var28) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                var29 = module0213.f14078(module0188.f11770(var46), (SubLObject)module0618.UNPROVIDED);
                                                                if (module0618.NIL == var31 && module0618.NIL == var29) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                var30 = module0213.f14078(module0188.f11789(var46), (SubLObject)module0618.UNPROVIDED);
                                                                if (module0618.NIL == var31 && module0618.NIL == var30) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                if (module0618.NIL == var31 && module0618.NIL == module0188.f11778(Eval.eval(reader.read_from_string(var28, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var29, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)), Eval.eval(reader.read_from_string(var30, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED)))) {
                                                                    var31 = (SubLObject)module0618.T;
                                                                }
                                                                if (module0618.NIL != var31) {
                                                                    PrintLow.format((SubLObject)module0618.T, (SubLObject)module0618.$ic331$, var46, module0184.f11649(var46));
                                                                    module0077.f5326(var46, module0618.$g4754$.getGlobalValue());
                                                                }
                                                                else {
                                                                    PrintLow.format(var27, (SubLObject)module0618.$ic332$, new SubLObject[] { var28, var29, var30, module0213.f14078(module0188.f11790(var46), (SubLObject)module0618.UNPROVIDED) });
                                                                }
                                                            }
                                                        }
                                                        var43 = Numbers.add(var43, (SubLObject)module0618.ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            module0012.f479();
                                        }
                                        finally {
                                            module0012.$g78$.rebind(var39_947, var17);
                                            module0012.$g77$.rebind(var38_946, var17);
                                            module0012.$g76$.rebind(var37_945, var17);
                                            module0012.$g75$.rebind(var36_942, var17);
                                        }
                                    }
                                    finally {
                                        final SubLObject var36_943 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                            streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36_943, var17);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var36_944 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_944, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_932) {
                                    module0160.f10446(var74_931);
                                }
                                if (module0618.NIL == var76_933) {
                                    module0160.f10414(var74_931, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var47, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_931) {
                                module0160.f10446(var74_930);
                            }
                            if (module0618.NIL == var76_932) {
                                module0160.f10414(var74_930, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var48, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_930) {
                            module0160.f10446(var74_929);
                        }
                        if (module0618.NIL == var76_931) {
                            module0160.f10414(var74_929, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var49, var17);
                    }
                }
            }
            finally {
                final SubLObject var50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_929) {
                        module0160.f10446(var74_928);
                    }
                    if (module0618.NIL == var76_930) {
                        module0160.f10414(var74_928, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var50, var17);
                }
            }
        }
        finally {
            final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var51, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38149(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0176.$g2196$.getGlobalValue();
        final SubLObject var19 = module0160.f10437(var18);
        final SubLObject var20 = module0160.f10418(var18);
        try {
            module0160.f10447(var18);
            module0160.f10417(var18);
            final SubLObject var74_953 = module0186.$g2230$.getGlobalValue();
            final SubLObject var75_954 = module0160.f10437(var74_953);
            final SubLObject var76_955 = module0160.f10418(var74_953);
            try {
                module0160.f10447(var74_953);
                module0160.f10417(var74_953);
                final SubLObject var74_954 = module0181.$g2216$.getGlobalValue();
                final SubLObject var75_955 = module0160.f10437(var74_954);
                final SubLObject var76_956 = module0160.f10418(var74_954);
                try {
                    module0160.f10447(var74_954);
                    module0160.f10417(var74_954);
                    final SubLObject var74_955 = module0169.$g2183$.getGlobalValue();
                    final SubLObject var75_956 = module0160.f10437(var74_955);
                    final SubLObject var76_957 = module0160.f10418(var74_955);
                    try {
                        module0160.f10447(var74_955);
                        module0160.f10417(var74_955);
                        final SubLObject var74_956 = module0164.$g2172$.getGlobalValue();
                        final SubLObject var75_957 = module0160.f10437(var74_956);
                        final SubLObject var76_958 = module0160.f10418(var74_956);
                        try {
                            module0160.f10447(var74_956);
                            module0160.f10417(var74_956);
                            final SubLObject var21 = module0018.$g694$.currentBinding(var17);
                            final SubLObject var22 = print_high.$print_pretty$.currentBinding(var17);
                            final SubLObject var23 = print_high.$print_length$.currentBinding(var17);
                            final SubLObject var24 = print_high.$print_level$.currentBinding(var17);
                            try {
                                module0018.$g694$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_pretty$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_length$.bind((SubLObject)module0618.NIL, var17);
                                print_high.$print_level$.bind((SubLObject)module0618.NIL, var17);
                                SubLObject var25 = (SubLObject)module0618.NIL;
                                try {
                                    final SubLObject var36_966 = stream_macros.$stream_requires_locking$.currentBinding(var17);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0618.NIL, var17);
                                        var25 = compatibility.open_text(var16, (SubLObject)module0618.$ic73$);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(var36_966, var17);
                                    }
                                    if (!var25.isStream()) {
                                        Errors.error((SubLObject)module0618.$ic65$, var16);
                                    }
                                    final SubLObject var26 = var25;
                                    final SubLObject var27 = module0075.f5279(var26, (SubLObject)module0618.$ic304$);
                                    try {
                                        SubLObject var28 = (SubLObject)module0618.ZERO_INTEGER;
                                        SubLObject var29 = module0617.f37852();
                                        SubLObject var30 = (SubLObject)module0618.NIL;
                                        var30 = var29.first();
                                        while (module0618.NIL != var29) {
                                            SubLObject var32;
                                            final SubLObject var31 = var32 = var30;
                                            SubLObject var33 = (SubLObject)module0618.NIL;
                                            SubLObject var34 = (SubLObject)module0618.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0618.$ic146$);
                                            var33 = var32.first();
                                            var32 = (var34 = var32.rest());
                                            SubLObject var35;
                                            for (var35 = module0066.f4838(module0067.f4891(var34)); module0618.NIL == module0066.f4841(var35); var35 = module0066.f4840(var35)) {
                                                var17.resetMultipleValues();
                                                final SubLObject var36 = module0066.f4839(var35);
                                                final SubLObject var37 = var17.secondMultipleValue();
                                                var17.resetMultipleValues();
                                                SubLObject var38 = (SubLObject)module0618.NIL;
                                                if (module0618.NIL != module0173.f10955(var33) && module0618.NIL == module0173.f10969(var33)) {
                                                    var38 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL != module0173.f10955(var36) && module0618.NIL == module0173.f10969(var36)) {
                                                    var38 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL != module0173.f10955(var37) && module0618.NIL == module0173.f10969(var37)) {
                                                    var38 = (SubLObject)module0618.T;
                                                }
                                                if (module0618.NIL != var38) {
                                                    var28 = Numbers.add(var28, (SubLObject)module0618.ONE_INTEGER);
                                                    Errors.warn((SubLObject)module0618.$ic333$, new SubLObject[] { var28, var33, var36, var37 });
                                                }
                                                else {
                                                    PrintLow.format(var27, (SubLObject)module0618.$ic334$, new SubLObject[] { module0213.f14078(var33, (SubLObject)module0618.UNPROVIDED), module0213.f14078(var36, (SubLObject)module0618.UNPROVIDED), module0213.f14078(var37, (SubLObject)module0618.UNPROVIDED), module0618.$ic335$ });
                                                }
                                            }
                                            module0066.f4842(var35);
                                            var29 = var29.rest();
                                            var30 = var29.first();
                                        }
                                    }
                                    finally {
                                        final SubLObject var36_967 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                            streams_high.close(var27, (SubLObject)module0618.UNPROVIDED);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36_967, var17);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var36_968 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                        if (var25.isStream()) {
                                            streams_high.close(var25, (SubLObject)module0618.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36_968, var17);
                                    }
                                }
                            }
                            finally {
                                print_high.$print_level$.rebind(var24, var17);
                                print_high.$print_length$.rebind(var23, var17);
                                print_high.$print_pretty$.rebind(var22, var17);
                                module0018.$g694$.rebind(var21, var17);
                            }
                        }
                        finally {
                            final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                                if (module0618.NIL != var75_957) {
                                    module0160.f10446(var74_956);
                                }
                                if (module0618.NIL == var76_958) {
                                    module0160.f10414(var74_956, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var39, var17);
                            }
                        }
                    }
                    finally {
                        final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                            if (module0618.NIL != var75_956) {
                                module0160.f10446(var74_955);
                            }
                            if (module0618.NIL == var76_957) {
                                module0160.f10414(var74_955, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var40, var17);
                        }
                    }
                }
                finally {
                    final SubLObject var41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                        if (module0618.NIL != var75_955) {
                            module0160.f10446(var74_954);
                        }
                        if (module0618.NIL == var76_956) {
                            module0160.f10414(var74_954, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var41, var17);
                    }
                }
            }
            finally {
                final SubLObject var42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                    if (module0618.NIL != var75_954) {
                        module0160.f10446(var74_953);
                    }
                    if (module0618.NIL == var76_955) {
                        module0160.f10414(var74_953, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var42, var17);
                }
            }
        }
        finally {
            final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var17);
                if (module0618.NIL != var19) {
                    module0160.f10446(var18);
                }
                if (module0618.NIL == var20) {
                    module0160.f10414(var18, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var43, var17);
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38163(final SubLObject var265, SubLObject var972) {
        if (var972 == module0618.UNPROVIDED) {
            var972 = (SubLObject)module0618.ZERO_INTEGER;
        }
        final SubLObject var973 = module0172.f10915(var265);
        final SubLObject var974 = module0035.f2399(var973, (SubLObject)module0618.$ic336$, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED, (SubLObject)module0618.UNPROVIDED);
        SubLObject var975 = var972;
        SubLObject var976 = var974;
        SubLObject var977 = (SubLObject)module0618.NIL;
        var977 = var976.first();
        while (module0618.NIL != var976) {
            var975 = Numbers.max(f38163(var977, Numbers.add(var972, (SubLObject)module0618.ONE_INTEGER)), module0618.EMPTY_SUBL_OBJECT_ARRAY);
            var976 = var976.rest();
            var977 = var976.first();
        }
        return var975;
    }
    
    public static SubLObject f38159(final SubLObject var265) {
        return f38163(var265, (SubLObject)module0618.ZERO_INTEGER);
    }
    
    public static SubLObject f38164(final SubLObject var271, SubLObject var972) {
        if (var972 == module0618.UNPROVIDED) {
            var972 = (SubLObject)module0618.ZERO_INTEGER;
        }
        SubLObject var973 = var972;
        SubLObject var974 = module0183.f11558(var271);
        SubLObject var975 = (SubLObject)module0618.NIL;
        var975 = var974.first();
        while (module0618.NIL != var974) {
            if (module0618.NIL != module0179.f11424(var975)) {
                var973 = Numbers.max(f38164(var975, Numbers.add(var972, (SubLObject)module0618.ONE_INTEGER)), module0618.EMPTY_SUBL_OBJECT_ARRAY);
            }
            var974 = var974.rest();
            var975 = var974.first();
        }
        return var973;
    }
    
    public static SubLObject f38160(final SubLObject var271) {
        return f38164(var271, (SubLObject)module0618.ZERO_INTEGER);
    }
    
    public static SubLObject f38165(SubLObject var978) {
        if (var978 == module0618.UNPROVIDED) {
            var978 = (SubLObject)module0618.NIL;
        }
        final SubLThread var979 = SubLProcess.currentSubLThread();
        SubLObject var980 = (SubLObject)module0618.NIL;
        final SubLObject var981 = module0164.$g2172$.getGlobalValue();
        final SubLObject var982 = module0160.f10437(var981);
        final SubLObject var983 = module0160.f10418(var981);
        try {
            module0160.f10447(var981);
            module0160.f10417(var981);
            final SubLObject var74_979 = module0169.$g2183$.getGlobalValue();
            final SubLObject var75_980 = module0160.f10437(var74_979);
            final SubLObject var76_981 = module0160.f10418(var74_979);
            try {
                module0160.f10447(var74_979);
                module0160.f10417(var74_979);
                final SubLObject var984 = module0167.f10788();
                final SubLObject var985 = (SubLObject)module0618.$ic337$;
                final SubLObject var986 = module0065.f4733(var984);
                SubLObject var987 = (SubLObject)module0618.ZERO_INTEGER;
                assert module0618.NIL != Types.stringp(var985) : var985;
                final SubLObject var988 = module0012.$g75$.currentBinding(var979);
                final SubLObject var989 = module0012.$g76$.currentBinding(var979);
                final SubLObject var990 = module0012.$g77$.currentBinding(var979);
                final SubLObject var991 = module0012.$g78$.currentBinding(var979);
                try {
                    module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var979);
                    module0012.$g76$.bind((SubLObject)module0618.NIL, var979);
                    module0012.$g77$.bind((SubLObject)module0618.T, var979);
                    module0012.$g78$.bind(Time.get_universal_time(), var979);
                    module0012.f478(var985);
                    final SubLObject var229_982 = var984;
                    if (module0618.NIL == module0065.f4772(var229_982, (SubLObject)module0618.$ic93$)) {
                        final SubLObject var231_983 = var229_982;
                        if (module0618.NIL == module0065.f4775(var231_983, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var992 = module0065.f4740(var231_983);
                            final SubLObject var993 = (SubLObject)module0618.NIL;
                            SubLObject var994;
                            SubLObject var995;
                            SubLObject var996;
                            SubLObject var997;
                            SubLObject var36_984;
                            for (var994 = Sequences.length(var992), var995 = (SubLObject)module0618.NIL, var995 = (SubLObject)module0618.ZERO_INTEGER; var995.numL(var994); var995 = Numbers.add(var995, (SubLObject)module0618.ONE_INTEGER)) {
                                var996 = ((module0618.NIL != var993) ? Numbers.subtract(var994, var995, (SubLObject)module0618.ONE_INTEGER) : var995);
                                var997 = Vectors.aref(var992, var996);
                                if (module0618.NIL == module0065.f4749(var997) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    if (module0618.NIL != module0065.f4749(var997)) {
                                        var997 = (SubLObject)module0618.$ic93$;
                                    }
                                    module0012.note_percent_progress(var987, var986);
                                    var987 = Numbers.add(var987, (SubLObject)module0618.ONE_INTEGER);
                                    var36_984 = module0018.$g574$.currentBinding(var979);
                                    try {
                                        module0018.$g574$.bind((SubLObject)((module0618.NIL != var978) ? module0618.T : module0618.NIL), var979);
                                        if (module0618.NIL == module0172.f10921(module0172.f10915(var997))) {
                                            var980 = (SubLObject)ConsesLow.cons(var997, var980);
                                            Errors.warn((SubLObject)module0618.$ic338$, module0167.f10803(var997), var997);
                                        }
                                    }
                                    finally {
                                        module0018.$g574$.rebind(var36_984, var979);
                                    }
                                }
                            }
                        }
                        final SubLObject var239_985 = var229_982;
                        if (module0618.NIL == module0065.f4777(var239_985) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                            final SubLObject var998 = module0065.f4738(var239_985);
                            SubLObject var999 = module0065.f4739(var239_985);
                            final SubLObject var1000 = module0065.f4734(var239_985);
                            final SubLObject var1001 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                            while (var999.numL(var1000)) {
                                final SubLObject var1002 = Hashtables.gethash_without_values(var999, var998, var1001);
                                if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var1002)) {
                                    module0012.note_percent_progress(var987, var986);
                                    var987 = Numbers.add(var987, (SubLObject)module0618.ONE_INTEGER);
                                    final SubLObject var36_985 = module0018.$g574$.currentBinding(var979);
                                    try {
                                        module0018.$g574$.bind((SubLObject)((module0618.NIL != var978) ? module0618.T : module0618.NIL), var979);
                                        if (module0618.NIL == module0172.f10921(module0172.f10915(var1002))) {
                                            var980 = (SubLObject)ConsesLow.cons(var1002, var980);
                                            Errors.warn((SubLObject)module0618.$ic338$, module0167.f10803(var1002), var1002);
                                        }
                                    }
                                    finally {
                                        module0018.$g574$.rebind(var36_985, var979);
                                    }
                                }
                                var999 = Numbers.add(var999, (SubLObject)module0618.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var991, var979);
                    module0012.$g77$.rebind(var990, var979);
                    module0012.$g76$.rebind(var989, var979);
                    module0012.$g75$.rebind(var988, var979);
                }
            }
            finally {
                final SubLObject var1003 = Threads.$is_thread_performing_cleanupP$.currentBinding(var979);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var979);
                    if (module0618.NIL != var75_980) {
                        module0160.f10446(var74_979);
                    }
                    if (module0618.NIL == var76_981) {
                        module0160.f10414(var74_979, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var1003, var979);
                }
            }
        }
        finally {
            final SubLObject var1004 = Threads.$is_thread_performing_cleanupP$.currentBinding(var979);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var979);
                if (module0618.NIL != var982) {
                    module0160.f10446(var981);
                }
                if (module0618.NIL == var983) {
                    module0160.f10414(var981, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var1004, var979);
            }
        }
        return var980;
    }
    
    public static SubLObject f38166() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0618.NIL;
        final SubLObject var35 = module0176.$g2196$.getGlobalValue();
        final SubLObject var36 = module0160.f10437(var35);
        final SubLObject var37 = module0160.f10418(var35);
        try {
            module0160.f10447(var35);
            module0160.f10417(var35);
            final SubLObject var74_987 = module0169.$g2183$.getGlobalValue();
            final SubLObject var75_988 = module0160.f10437(var74_987);
            final SubLObject var76_989 = module0160.f10418(var74_987);
            try {
                module0160.f10447(var74_987);
                module0160.f10417(var74_987);
                final SubLObject var74_988 = module0164.$g2172$.getGlobalValue();
                final SubLObject var75_989 = module0160.f10437(var74_988);
                final SubLObject var76_990 = module0160.f10418(var74_988);
                try {
                    module0160.f10447(var74_988);
                    module0160.f10417(var74_988);
                    SubLObject var38 = (SubLObject)module0618.ZERO_INTEGER;
                    final SubLObject var39 = module0174.f11010();
                    final SubLObject var40 = (SubLObject)module0618.$ic339$;
                    final SubLObject var41 = module0065.f4733(var39);
                    SubLObject var42 = (SubLObject)module0618.ZERO_INTEGER;
                    assert module0618.NIL != Types.stringp(var40) : var40;
                    final SubLObject var43 = module0012.$g75$.currentBinding(var33);
                    final SubLObject var44 = module0012.$g76$.currentBinding(var33);
                    final SubLObject var45 = module0012.$g77$.currentBinding(var33);
                    final SubLObject var46 = module0012.$g78$.currentBinding(var33);
                    try {
                        module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                        module0012.$g76$.bind((SubLObject)module0618.NIL, var33);
                        module0012.$g77$.bind((SubLObject)module0618.T, var33);
                        module0012.$g78$.bind(Time.get_universal_time(), var33);
                        module0012.f478(var40);
                        final SubLObject var229_993 = var39;
                        if (module0618.NIL == module0065.f4772(var229_993, (SubLObject)module0618.$ic93$)) {
                            final SubLObject var231_994 = var229_993;
                            if (module0618.NIL == module0065.f4775(var231_994, (SubLObject)module0618.$ic93$)) {
                                final SubLObject var47 = module0065.f4740(var231_994);
                                final SubLObject var48 = (SubLObject)module0618.NIL;
                                SubLObject var49;
                                SubLObject var50;
                                SubLObject var51;
                                SubLObject var52;
                                SubLObject var36_995;
                                for (var49 = Sequences.length(var47), var50 = (SubLObject)module0618.NIL, var50 = (SubLObject)module0618.ZERO_INTEGER; var50.numL(var49); var50 = Numbers.add(var50, (SubLObject)module0618.ONE_INTEGER)) {
                                    var51 = ((module0618.NIL != var48) ? Numbers.subtract(var49, var50, (SubLObject)module0618.ONE_INTEGER) : var50);
                                    var52 = Vectors.aref(var47, var51);
                                    if (module0618.NIL == module0065.f4749(var52) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                        if (module0618.NIL != module0065.f4749(var52)) {
                                            var52 = (SubLObject)module0618.$ic93$;
                                        }
                                        module0012.note_percent_progress(var42, var41);
                                        var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                        var36_995 = module0618.$g4756$.currentBinding(var33);
                                        try {
                                            module0618.$g4756$.bind(var52, var33);
                                            module0213.f14078(module0178.f11282(var52), (SubLObject)module0618.T);
                                            if (module0618.NIL != module0618.$g2377$.getDynamicValue(var33)) {
                                                var34 = (SubLObject)ConsesLow.cons(var52, var34);
                                            }
                                            else if (module0618.NIL == module0217.f14415(module0178.f11282(var52), module0178.f11287(var52))) {
                                                var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER);
                                                var34 = (SubLObject)ConsesLow.cons(var52, var34);
                                                Errors.warn((SubLObject)module0618.$ic340$, var38, module0174.f11025(var52), var52);
                                            }
                                        }
                                        finally {
                                            module0618.$g4756$.rebind(var36_995, var33);
                                        }
                                    }
                                }
                            }
                            final SubLObject var239_996 = var229_993;
                            if (module0618.NIL == module0065.f4777(var239_996) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                final SubLObject var53 = module0065.f4738(var239_996);
                                SubLObject var54 = module0065.f4739(var239_996);
                                final SubLObject var55 = module0065.f4734(var239_996);
                                final SubLObject var56 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                while (var54.numL(var55)) {
                                    final SubLObject var57 = Hashtables.gethash_without_values(var54, var53, var56);
                                    if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var57)) {
                                        module0012.note_percent_progress(var42, var41);
                                        var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                        final SubLObject var36_996 = module0618.$g4756$.currentBinding(var33);
                                        try {
                                            module0618.$g4756$.bind(var57, var33);
                                            module0213.f14078(module0178.f11282(var57), (SubLObject)module0618.T);
                                            if (module0618.NIL != module0618.$g2377$.getDynamicValue(var33)) {
                                                var34 = (SubLObject)ConsesLow.cons(var57, var34);
                                            }
                                            else if (module0618.NIL == module0217.f14415(module0178.f11282(var57), module0178.f11287(var57))) {
                                                var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER);
                                                var34 = (SubLObject)ConsesLow.cons(var57, var34);
                                                Errors.warn((SubLObject)module0618.$ic340$, var38, module0174.f11025(var57), var57);
                                            }
                                        }
                                        finally {
                                            module0618.$g4756$.rebind(var36_996, var33);
                                        }
                                    }
                                    var54 = Numbers.add(var54, (SubLObject)module0618.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var46, var33);
                        module0012.$g77$.rebind(var45, var33);
                        module0012.$g76$.rebind(var44, var33);
                        module0012.$g75$.rebind(var43, var33);
                    }
                }
                finally {
                    final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_989) {
                            module0160.f10446(var74_988);
                        }
                        if (module0618.NIL == var76_990) {
                            module0160.f10414(var74_988, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var58, var33);
                    }
                }
            }
            finally {
                final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_988) {
                        module0160.f10446(var74_987);
                    }
                    if (module0618.NIL == var76_989) {
                        module0160.f10414(var74_987, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var59, var33);
                }
            }
        }
        finally {
            final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var36) {
                    module0160.f10446(var35);
                }
                if (module0618.NIL == var37) {
                    module0160.f10414(var35, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var60, var33);
            }
        }
        return var34;
    }
    
    public static SubLObject f38167() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0618.NIL;
        final SubLObject var35 = module0186.$g2230$.getGlobalValue();
        final SubLObject var36 = module0160.f10437(var35);
        final SubLObject var37 = module0160.f10418(var35);
        try {
            module0160.f10447(var35);
            module0160.f10417(var35);
            final SubLObject var74_998 = module0176.$g2196$.getGlobalValue();
            final SubLObject var75_999 = module0160.f10437(var74_998);
            final SubLObject var76_1000 = module0160.f10418(var74_998);
            try {
                module0160.f10447(var74_998);
                module0160.f10417(var74_998);
                final SubLObject var74_999 = module0169.$g2183$.getGlobalValue();
                final SubLObject var75_1000 = module0160.f10437(var74_999);
                final SubLObject var76_1001 = module0160.f10418(var74_999);
                try {
                    module0160.f10447(var74_999);
                    module0160.f10417(var74_999);
                    final SubLObject var74_1000 = module0164.$g2172$.getGlobalValue();
                    final SubLObject var75_1001 = module0160.f10437(var74_1000);
                    final SubLObject var76_1002 = module0160.f10418(var74_1000);
                    try {
                        module0160.f10447(var74_1000);
                        module0160.f10417(var74_1000);
                        SubLObject var38 = (SubLObject)module0618.ZERO_INTEGER;
                        final SubLObject var39 = module0184.f11634();
                        final SubLObject var40 = (SubLObject)module0618.$ic341$;
                        final SubLObject var41 = module0065.f4733(var39);
                        SubLObject var42 = (SubLObject)module0618.ZERO_INTEGER;
                        assert module0618.NIL != Types.stringp(var40) : var40;
                        final SubLObject var43 = module0012.$g75$.currentBinding(var33);
                        final SubLObject var44 = module0012.$g76$.currentBinding(var33);
                        final SubLObject var45 = module0012.$g77$.currentBinding(var33);
                        final SubLObject var46 = module0012.$g78$.currentBinding(var33);
                        try {
                            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
                            module0012.$g76$.bind((SubLObject)module0618.NIL, var33);
                            module0012.$g77$.bind((SubLObject)module0618.T, var33);
                            module0012.$g78$.bind(Time.get_universal_time(), var33);
                            module0012.f478(var40);
                            final SubLObject var229_1007 = var39;
                            if (module0618.NIL == module0065.f4772(var229_1007, (SubLObject)module0618.$ic93$)) {
                                final SubLObject var231_1008 = var229_1007;
                                if (module0618.NIL == module0065.f4775(var231_1008, (SubLObject)module0618.$ic93$)) {
                                    final SubLObject var47 = module0065.f4740(var231_1008);
                                    final SubLObject var48 = (SubLObject)module0618.NIL;
                                    SubLObject var49;
                                    SubLObject var50;
                                    SubLObject var51;
                                    SubLObject var52;
                                    for (var49 = Sequences.length(var47), var50 = (SubLObject)module0618.NIL, var50 = (SubLObject)module0618.ZERO_INTEGER; var50.numL(var49); var50 = Numbers.add(var50, (SubLObject)module0618.ONE_INTEGER)) {
                                        var51 = ((module0618.NIL != var48) ? Numbers.subtract(var49, var50, (SubLObject)module0618.ONE_INTEGER) : var50);
                                        var52 = Vectors.aref(var47, var51);
                                        if (module0618.NIL == module0065.f4749(var52) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                            if (module0618.NIL != module0065.f4749(var52)) {
                                                var52 = (SubLObject)module0618.$ic93$;
                                            }
                                            module0012.note_percent_progress(var42, var41);
                                            var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                            if (module0618.NIL == module0188.f11778(module0188.f11781(var52), module0188.f11770(var52), module0188.f11789(var52))) {
                                                var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER);
                                                var34 = (SubLObject)ConsesLow.cons(var52, var34);
                                                Errors.warn((SubLObject)module0618.$ic342$, var38, module0184.f11649(var52), var52);
                                            }
                                        }
                                    }
                                }
                                final SubLObject var239_1009 = var229_1007;
                                if (module0618.NIL == module0065.f4777(var239_1009) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                                    final SubLObject var53 = module0065.f4738(var239_1009);
                                    SubLObject var54 = module0065.f4739(var239_1009);
                                    final SubLObject var55 = module0065.f4734(var239_1009);
                                    final SubLObject var56 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                                    while (var54.numL(var55)) {
                                        final SubLObject var57 = Hashtables.gethash_without_values(var54, var53, var56);
                                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var57)) {
                                            module0012.note_percent_progress(var42, var41);
                                            var42 = Numbers.add(var42, (SubLObject)module0618.ONE_INTEGER);
                                            if (module0618.NIL == module0188.f11778(module0188.f11781(var57), module0188.f11770(var57), module0188.f11789(var57))) {
                                                var38 = Numbers.add(var38, (SubLObject)module0618.ONE_INTEGER);
                                                var34 = (SubLObject)ConsesLow.cons(var57, var34);
                                                Errors.warn((SubLObject)module0618.$ic342$, var38, module0184.f11649(var57), var57);
                                            }
                                        }
                                        var54 = Numbers.add(var54, (SubLObject)module0618.ONE_INTEGER);
                                    }
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var46, var33);
                            module0012.$g77$.rebind(var45, var33);
                            module0012.$g76$.rebind(var44, var33);
                            module0012.$g75$.rebind(var43, var33);
                        }
                    }
                    finally {
                        final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                            if (module0618.NIL != var75_1001) {
                                module0160.f10446(var74_1000);
                            }
                            if (module0618.NIL == var76_1002) {
                                module0160.f10414(var74_1000, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var58, var33);
                        }
                    }
                }
                finally {
                    final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                        if (module0618.NIL != var75_1000) {
                            module0160.f10446(var74_999);
                        }
                        if (module0618.NIL == var76_1001) {
                            module0160.f10414(var74_999, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var59, var33);
                    }
                }
            }
            finally {
                final SubLObject var60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                    if (module0618.NIL != var75_999) {
                        module0160.f10446(var74_998);
                    }
                    if (module0618.NIL == var76_1000) {
                        module0160.f10414(var74_998, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var60, var33);
                }
            }
        }
        finally {
            final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0618.T, var33);
                if (module0618.NIL != var36) {
                    module0160.f10446(var35);
                }
                if (module0618.NIL == var37) {
                    module0160.f10414(var35, (SubLObject)module0618.$ic68$, (SubLObject)module0618.$ic69$);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var61, var33);
            }
        }
        return var34;
    }
    
    public static SubLObject f38168() {
        for (SubLObject var1010 = f38165((SubLObject)module0618.UNPROVIDED); module0618.NIL != var1010; var1010 = f38165((SubLObject)module0618.UNPROVIDED)) {
            SubLObject var1011 = var1010;
            SubLObject var1012 = (SubLObject)module0618.NIL;
            var1012 = var1011.first();
            while (module0618.NIL != var1011) {
                f38169(var1012);
                var1011 = var1011.rest();
                var1012 = var1011.first();
            }
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38169(final SubLObject var1011) {
        final SubLThread var1012 = SubLProcess.currentSubLThread();
        SubLObject var1013 = module0219.f14526(var1011, (SubLObject)module0618.UNPROVIDED);
        SubLObject var1014 = (SubLObject)module0618.NIL;
        var1014 = var1013.first();
        while (module0618.NIL != var1013) {
            f38170(var1014, (SubLObject)module0618.UNPROVIDED);
            var1013 = var1013.rest();
            var1014 = var1013.first();
        }
        final SubLObject var1015 = module0111.$g1405$.currentBinding(var1012);
        try {
            module0111.$g1405$.bind(module0618.$ic343$, var1012);
            module0540.f33510(var1011);
        }
        finally {
            module0111.$g1405$.rebind(var1015, var1012);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38171(final SubLObject var265) {
        return (SubLObject)ConsesLow.list((SubLObject)module0618.$ic344$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0618.$ic345$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic346$, module0167.f10803(var265)))), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic18$, (SubLObject)module0618.$ic345$, (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0618.EQUAL, (SubLObject)module0618.$ic347$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic348$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic349$, module0213.f14078(module0172.f10915(var265), (SubLObject)module0618.UNPROVIDED)))), (SubLObject)module0618.$ic350$))));
    }
    
    public static SubLObject f38172(final SubLObject var268) {
        return (SubLObject)ConsesLow.list((SubLObject)module0618.$ic344$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0618.$ic351$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic352$, module0174.f11025(var268)))), (SubLObject)ConsesLow.list((SubLObject)module0618.$ic18$, (SubLObject)module0618.$ic351$, (SubLObject)ConsesLow.listS((SubLObject)module0618.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic353$, (SubLObject)ConsesLow.list((SubLObject)module0618.EQUAL, (SubLObject)module0618.$ic354$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic348$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic349$, module0213.f14078(module0178.f11287(var268), (SubLObject)module0618.UNPROVIDED)))), (SubLObject)ConsesLow.list((SubLObject)module0618.EQUAL, (SubLObject)module0618.$ic355$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic348$, (SubLObject)ConsesLow.list((SubLObject)module0618.$ic349$, module0213.f14078(module0205.f13144(module0178.f11282(var268)), (SubLObject)module0618.UNPROVIDED))))), (SubLObject)module0618.$ic356$))));
    }
    
    public static SubLObject f38170(final SubLObject var268, SubLObject var1012) {
        if (var1012 == module0618.UNPROVIDED) {
            var1012 = (SubLObject)module0618.NIL;
        }
        if (module0618.NIL == var1012 && module0618.NIL != module0228.f15209(var268)) {
            return (SubLObject)module0618.NIL;
        }
        final SubLObject var1013 = module0211.f13701(var268);
        SubLObject var1014 = (SubLObject)module0618.NIL;
        var1014 = module0543.f33675(var268, var1013);
        if (module0618.NIL == var1014) {
            Errors.warn((SubLObject)module0618.$ic357$, module0174.f11025(var268), var268);
        }
        else {
            Errors.warn((SubLObject)module0618.$ic358$, module0174.f11025(var268), var268);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38173() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0174.f11010();
        final SubLObject var35 = (SubLObject)module0618.$ic359$;
        final SubLObject var36 = module0065.f4733(var34);
        SubLObject var37 = (SubLObject)module0618.ZERO_INTEGER;
        assert module0618.NIL != Types.stringp(var35) : var35;
        final SubLObject var38 = module0012.$g75$.currentBinding(var33);
        final SubLObject var39 = module0012.$g76$.currentBinding(var33);
        final SubLObject var40 = module0012.$g77$.currentBinding(var33);
        final SubLObject var41 = module0012.$g78$.currentBinding(var33);
        try {
            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
            module0012.$g76$.bind((SubLObject)module0618.NIL, var33);
            module0012.$g77$.bind((SubLObject)module0618.T, var33);
            module0012.$g78$.bind(Time.get_universal_time(), var33);
            module0012.f478(var35);
            final SubLObject var229_1015 = var34;
            if (module0618.NIL == module0065.f4772(var229_1015, (SubLObject)module0618.$ic93$)) {
                final SubLObject var231_1016 = var229_1015;
                if (module0618.NIL == module0065.f4775(var231_1016, (SubLObject)module0618.$ic93$)) {
                    final SubLObject var42 = module0065.f4740(var231_1016);
                    final SubLObject var43 = (SubLObject)module0618.NIL;
                    SubLObject var44;
                    SubLObject var45;
                    SubLObject var46;
                    SubLObject var47;
                    SubLObject var48;
                    SubLObject var49;
                    SubLObject var50;
                    SubLObject var51;
                    for (var44 = Sequences.length(var42), var45 = (SubLObject)module0618.NIL, var45 = (SubLObject)module0618.ZERO_INTEGER; var45.numL(var44); var45 = Numbers.add(var45, (SubLObject)module0618.ONE_INTEGER)) {
                        var46 = ((module0618.NIL != var43) ? Numbers.subtract(var44, var45, (SubLObject)module0618.ONE_INTEGER) : var45);
                        var47 = Vectors.aref(var42, var46);
                        if (module0618.NIL == module0065.f4749(var47) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                            if (module0618.NIL != module0065.f4749(var47)) {
                                var47 = (SubLObject)module0618.$ic93$;
                            }
                            module0012.note_percent_progress(var37, var36);
                            var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                            var48 = module0178.f11300(var47);
                            for (var49 = module0032.f1741(var48), var50 = (SubLObject)module0618.NIL, var50 = module0032.f1742(var49, var48); module0618.NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
                                var51 = module0032.f1745(var49, var50);
                                if (module0618.NIL != module0032.f1746(var50, var51)) {
                                    if (module0618.NIL == module0184.f11659(var51)) {
                                        Errors.error((SubLObject)module0618.$ic360$, var51);
                                    }
                                    if (module0618.NIL != module0179.f11424(module0188.f11781(var51))) {
                                        return var47;
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var239_1021 = var229_1015;
                if (module0618.NIL == module0065.f4777(var239_1021) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                    final SubLObject var52 = module0065.f4738(var239_1021);
                    SubLObject var53 = module0065.f4739(var239_1021);
                    final SubLObject var54 = module0065.f4734(var239_1021);
                    final SubLObject var55 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                    while (var53.numL(var54)) {
                        final SubLObject var56 = Hashtables.gethash_without_values(var53, var52, var55);
                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var56)) {
                            module0012.note_percent_progress(var37, var36);
                            var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                            final SubLObject var57 = module0178.f11300(var56);
                            SubLObject var58;
                            SubLObject var59;
                            SubLObject var60;
                            for (var58 = module0032.f1741(var57), var59 = (SubLObject)module0618.NIL, var59 = module0032.f1742(var58, var57); module0618.NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                var60 = module0032.f1745(var58, var59);
                                if (module0618.NIL != module0032.f1746(var59, var60)) {
                                    if (module0618.NIL == module0184.f11659(var60)) {
                                        Errors.error((SubLObject)module0618.$ic360$, var60);
                                    }
                                    if (module0618.NIL != module0179.f11424(module0188.f11781(var60))) {
                                        return var56;
                                    }
                                }
                            }
                        }
                        var53 = Numbers.add(var53, (SubLObject)module0618.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var41, var33);
            module0012.$g77$.rebind(var40, var33);
            module0012.$g76$.rebind(var39, var33);
            module0012.$g75$.rebind(var38, var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38174() {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0174.f11010();
        final SubLObject var35 = (SubLObject)module0618.$ic361$;
        final SubLObject var36 = module0065.f4733(var34);
        SubLObject var37 = (SubLObject)module0618.ZERO_INTEGER;
        assert module0618.NIL != Types.stringp(var35) : var35;
        final SubLObject var38 = module0012.$g75$.currentBinding(var33);
        final SubLObject var39 = module0012.$g76$.currentBinding(var33);
        final SubLObject var40 = module0012.$g77$.currentBinding(var33);
        final SubLObject var41 = module0012.$g78$.currentBinding(var33);
        try {
            module0012.$g75$.bind((SubLObject)module0618.ZERO_INTEGER, var33);
            module0012.$g76$.bind((SubLObject)module0618.NIL, var33);
            module0012.$g77$.bind((SubLObject)module0618.T, var33);
            module0012.$g78$.bind(Time.get_universal_time(), var33);
            module0012.f478(var35);
            final SubLObject var229_1022 = var34;
            if (module0618.NIL == module0065.f4772(var229_1022, (SubLObject)module0618.$ic93$)) {
                final SubLObject var231_1023 = var229_1022;
                if (module0618.NIL == module0065.f4775(var231_1023, (SubLObject)module0618.$ic93$)) {
                    final SubLObject var42 = module0065.f4740(var231_1023);
                    final SubLObject var43 = (SubLObject)module0618.NIL;
                    SubLObject var44;
                    SubLObject var45;
                    SubLObject var46;
                    SubLObject var47;
                    for (var44 = Sequences.length(var42), var45 = (SubLObject)module0618.NIL, var45 = (SubLObject)module0618.ZERO_INTEGER; var45.numL(var44); var45 = Numbers.add(var45, (SubLObject)module0618.ONE_INTEGER)) {
                        var46 = ((module0618.NIL != var43) ? Numbers.subtract(var44, var45, (SubLObject)module0618.ONE_INTEGER) : var45);
                        var47 = Vectors.aref(var42, var46);
                        if (module0618.NIL == module0065.f4749(var47) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                            if (module0618.NIL != module0065.f4749(var47)) {
                                var47 = (SubLObject)module0618.$ic93$;
                            }
                            module0012.note_percent_progress(var37, var36);
                            var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                            if (module0213.f13939(var47).numG((SubLObject)module0618.TWO_INTEGER)) {
                                Errors.warn((SubLObject)module0618.$ic362$, module0178.f11282(var47));
                                Errors.warn((SubLObject)module0618.$ic363$, module0178.f11287(var47));
                                Errors.warn((SubLObject)module0618.$ic364$, module0174.f11025(var47));
                                return (SubLObject)module0618.NIL;
                            }
                        }
                    }
                }
                final SubLObject var239_1024 = var229_1022;
                if (module0618.NIL == module0065.f4777(var239_1024) || module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$)) {
                    final SubLObject var48 = module0065.f4738(var239_1024);
                    SubLObject var49 = module0065.f4739(var239_1024);
                    final SubLObject var50 = module0065.f4734(var239_1024);
                    final SubLObject var51 = (SubLObject)((module0618.NIL != module0065.f4773((SubLObject)module0618.$ic93$)) ? module0618.NIL : module0618.$ic93$);
                    while (var49.numL(var50)) {
                        final SubLObject var52 = Hashtables.gethash_without_values(var49, var48, var51);
                        if (module0618.NIL == module0065.f4773((SubLObject)module0618.$ic93$) || module0618.NIL == module0065.f4749(var52)) {
                            module0012.note_percent_progress(var37, var36);
                            var37 = Numbers.add(var37, (SubLObject)module0618.ONE_INTEGER);
                            if (module0213.f13939(var52).numG((SubLObject)module0618.TWO_INTEGER)) {
                                Errors.warn((SubLObject)module0618.$ic362$, module0178.f11282(var52));
                                Errors.warn((SubLObject)module0618.$ic363$, module0178.f11287(var52));
                                Errors.warn((SubLObject)module0618.$ic364$, module0174.f11025(var52));
                                return (SubLObject)module0618.NIL;
                            }
                        }
                        var49 = Numbers.add(var49, (SubLObject)module0618.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var41, var33);
            module0012.$g77$.rebind(var40, var33);
            module0012.$g76$.rebind(var39, var33);
            module0012.$g75$.rebind(var38, var33);
        }
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38175() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37906", "S#9560", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37907", "S#41519");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37908", "S#41520");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37909", "S#41521");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37910", "S#41522");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37911", "S#41523");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37912", "S#41524");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f37913", "S#41525");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37914", "S#41526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37915", "S#38547", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37916", "S#18453", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37917", "S#41527", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37918", "S#41528", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37919", "S#41529", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37920", "S#41530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37921", "S#41531", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37922", "S#41532", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37924", "DUMP-STANDARD-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37925", "S#41533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37927", "S#41534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37923", "S#41535", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37932", "S#41536", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37933", "S#38546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37938", "S#41537", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37940", "S#41538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37939", "S#41539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37944", "S#41540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37946", "LOAD-NON-COMPUTABLE-KB-PLUS-REBUILD-AND-DUMP-COMPUTABLE-KB", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37926", "DUMP-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37949", "LOAD-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37952", "S#41541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37953", "S#41542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37954", "S#41543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37947", "S#41544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37950", "S#41545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37936", "S#41546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37937", "S#41547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37942", "S#41548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37978", "S#37835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37980", "S#41549", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37981", "S#41550", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37945", "S#41551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37956", "S#41552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37984", "S#37837", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37943", "S#41553", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37988", "S#37954", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37955", "S#41554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37982", "S#41555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37985", "S#41556", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37948", "S#41557", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37983", "S#41558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37986", "S#41559", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37989", "S#41560", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38019", "S#37955", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37987", "S#41561", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38021", "S#40107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38022", "S#40108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38023", "S#41562", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38024", "S#41563", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38025", "S#41564", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37935", "S#37598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37934", "S#41565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38026", "S#37599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37941", "S#41566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38027", "S#9553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37967", "S#41567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38035", "S#41568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37957", "S#41569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38028", "S#41570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37968", "S#41571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38038", "S#41572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38036", "S#41573", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38039", "S#41574", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38037", "S#41575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38040", "S#41576", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38041", "S#41577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38042", "S#13600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37958", "S#41578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37969", "S#41579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38029", "S#41580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38043", "S#41581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38044", "S#41582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38046", "S#41583", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38045", "S#41584", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38047", "S#13807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37959", "S#41585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37970", "S#41586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38030", "S#41587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38048", "S#41588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38049", "S#41589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38051", "S#41590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38050", "S#41591", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38052", "S#41592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37960", "S#41593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37971", "S#41594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38032", "S#41595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38053", "S#41596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38054", "S#41597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38056", "S#41598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38055", "S#41599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38057", "S#41600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37990", "S#41601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37993", "S#41602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38058", "S#41603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38059", "S#41604", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38034", "S#41605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38060", "S#41606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37961", "S#41607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37972", "S#41608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38061", "S#41609", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38062", "S#41610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38033", "S#41611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38063", "S#14449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37962", "S#41612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37973", "S#41613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38064", "S#41614", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38065", "S#41615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38066", "S#14536", 2, 0, false);
        new $f38066$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38031", "S#41616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37963", "S#41617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37974", "S#41618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38067", "S#41619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38068", "S#41620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38069", "S#13954", 2, 0, false);
        new $f38069$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37964", "S#41621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37975", "S#41622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38070", "S#41623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38071", "S#41624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38072", "S#14301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38073", "S#41625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38074", "S#41626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37965", "S#41627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38075", "S#41628", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38076", "S#41629", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37976", "S#41630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38077", "S#41631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38078", "S#41632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37966", "S#41633", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38079", "S#37958", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37977", "S#41634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38080", "S#37959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38081", "S#41635", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37991", "S#41636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37994", "S#41637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37928", "S#41638", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38094", "S#41639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38095", "S#41640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38082", "S#41641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38088", "S#41642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38096", "S#41643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38097", "S#41644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38098", "S#13528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38083", "S#41645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38089", "S#41646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38099", "S#41647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38100", "S#41648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38101", "S#13688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38084", "S#41649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38090", "S#41650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38102", "S#41651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38103", "S#41652", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38104", "S#14624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38085", "S#41653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38091", "S#41654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38105", "S#41655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38106", "S#41656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38086", "S#41657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38092", "S#41658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38087", "S#41659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38093", "S#41660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38107", "S#41661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38108", "S#41662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37992", "S#41663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37995", "S#41664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37996", "S#41665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38008", "S#41666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38109", "S#41667", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38110", "S#41668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38111", "S#13712", 2, 0, false);
        new $f38111$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37997", "S#41669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38009", "S#41670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37998", "S#41671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38114", "S#41672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38010", "S#41673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37929", "S#41674", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38112", "S#41675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38118", "S#41676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38119", "S#41677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38120", "S#41678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38115", "S#41679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38121", "S#41680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38122", "S#41681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38123", "S#41682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37999", "S#41683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38011", "S#41684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37930", "S#41685", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38000", "S#41686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38012", "S#41687", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0618", "f38124", "S#41688");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38001", "S#41689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38013", "S#41690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38020", "S#41691", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38002", "S#41692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38014", "S#41693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38005", "S#41694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38017", "S#41695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38006", "S#41696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38018", "S#41697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38113", "S#41698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38116", "S#41699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38117", "S#41700", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38003", "S#41701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38015", "S#41702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38004", "S#41703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38016", "S#41704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38125", "S#41705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38127", "S#41706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38128", "S#41707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38126", "S#41708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38129", "S#41709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38130", "S#41710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38132", "S#41711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38131", "S#41712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38133", "S#41713", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38134", "S#41714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38135", "S#41715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38136", "S#41716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38137", "S#41717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38138", "S#41718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38139", "S#41719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37931", "S#41720", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38140", "S#41721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38007", "S#41722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37951", "S#37836", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f37979", "S#37834", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38141", "S#41723", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38142", "S#41724", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38150", "S#41725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38152", "S#41726", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38153", "S#41727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38154", "S#41728", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38155", "S#41729", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38156", "S#41730", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38151", "S#41731", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38157", "S#41732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38158", "S#41733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38143", "S#41734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38144", "S#41735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38145", "S#41736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38146", "S#41737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38148", "S#41738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38161", "S#41739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38162", "S#41740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38147", "S#41741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38149", "S#41742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38163", "S#41743", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38159", "S#41744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38164", "S#41745", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38160", "S#41746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38165", "S#41747", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38166", "S#41748", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38167", "S#41749", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38168", "S#41750", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38169", "S#41751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38171", "S#41752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38172", "S#41753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38170", "S#41754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38173", "S#41755", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0618", "f38174", "S#41756", 0, 0, false);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38176() {
        module0618.$g4738$ = SubLFiles.deflexical("S#41757", (SubLObject)((module0618.NIL != Symbols.boundp((SubLObject)module0618.$ic0$)) ? module0618.$g4738$.getGlobalValue() : module0618.NIL));
        module0618.$g4739$ = SubLFiles.defparameter("S#41758", (SubLObject)module0618.$ic28$);
        module0618.$g4740$ = SubLFiles.defparameter("S#41759", (SubLObject)module0618.$ic29$);
        module0618.$g4741$ = SubLFiles.defparameter("S#41760", (SubLObject)module0618.$ic30$);
        module0618.$g4742$ = SubLFiles.deflexical("S#41761", (SubLObject)module0618.$ic31$);
        module0618.$g4743$ = SubLFiles.defparameter("S#41762", (SubLObject)module0618.T);
        module0618.$g4744$ = SubLFiles.defparameter("S#41763", (SubLObject)module0618.NIL);
        module0618.$g4745$ = SubLFiles.defparameter("S#41764", (SubLObject)module0618.T);
        module0618.$g4746$ = SubLFiles.deflexical("S#41765", (SubLObject)((module0618.NIL != Symbols.boundp((SubLObject)module0618.$ic58$)) ? module0618.$g4746$.getGlobalValue() : module0618.NIL));
        module0618.$g4747$ = SubLFiles.deflexical("S#41766", (SubLObject)module0618.$ic85$);
        module0618.$g4748$ = SubLFiles.defparameter("S#41767", module0618.$g4747$.getGlobalValue());
        module0618.$g4749$ = SubLFiles.defparameter("S#41768", (SubLObject)module0618.T);
        module0618.$g4750$ = SubLFiles.defconstant("S#41769", module0077.f5313(Symbols.symbol_function((SubLObject)module0618.EQL), (SubLObject)module0618.ZERO_INTEGER));
        module0618.$g4751$ = SubLFiles.defconstant("S#41770", module0077.f5313(Symbols.symbol_function((SubLObject)module0618.EQL), (SubLObject)module0618.ZERO_INTEGER));
        module0618.$g4752$ = SubLFiles.defconstant("S#41771", module0077.f5313(Symbols.symbol_function((SubLObject)module0618.EQL), (SubLObject)module0618.ZERO_INTEGER));
        module0618.$g4753$ = SubLFiles.defconstant("S#41772", module0077.f5313(Symbols.symbol_function((SubLObject)module0618.EQL), (SubLObject)module0618.ZERO_INTEGER));
        module0618.$g4754$ = SubLFiles.defconstant("S#41773", module0077.f5313(Symbols.symbol_function((SubLObject)module0618.EQL), (SubLObject)module0618.ZERO_INTEGER));
        module0618.$g4755$ = SubLFiles.defconstant("S#41774", module0077.f5313(Symbols.symbol_function((SubLObject)module0618.EQL), (SubLObject)module0618.ZERO_INTEGER));
        module0618.$g4756$ = SubLFiles.defparameter("S#41775", (SubLObject)module0618.NIL);
        module0618.$g2377$ = SubLFiles.defparameter("S#41776", (SubLObject)module0618.NIL);
        return (SubLObject)module0618.NIL;
    }
    
    public static SubLObject f38177() {
        module0003.f57((SubLObject)module0618.$ic0$);
        module0002.f38((SubLObject)module0618.$ic51$);
        module0003.f57((SubLObject)module0618.$ic58$);
        module0012.f419((SubLObject)module0618.$ic128$);
        module0012.f419((SubLObject)module0618.$ic134$);
        module0012.f419((SubLObject)module0618.$ic140$);
        module0012.f419((SubLObject)module0618.$ic155$);
        module0012.f419((SubLObject)module0618.$ic161$);
        module0012.f419((SubLObject)module0618.$ic167$);
        return (SubLObject)module0618.NIL;
    }
    
    public void declareFunctions() {
        f38175();
    }
    
    public void initializeVariables() {
        f38176();
    }
    
    public void runTopLevelForms() {
        f38177();
    }
    
    static {
        me = (SubLFile)new module0618();
        module0618.$g4738$ = null;
        module0618.$g4739$ = null;
        module0618.$g4740$ = null;
        module0618.$g4741$ = null;
        module0618.$g4742$ = null;
        module0618.$g4743$ = null;
        module0618.$g4744$ = null;
        module0618.$g4745$ = null;
        module0618.$g4746$ = null;
        module0618.$g4747$ = null;
        module0618.$g4748$ = null;
        module0618.$g4749$ = null;
        module0618.$g4750$ = null;
        module0618.$g4751$ = null;
        module0618.$g4752$ = null;
        module0618.$g4753$ = null;
        module0618.$g4754$ = null;
        module0618.$g4755$ = null;
        module0618.$g4756$ = null;
        module0618.$g2377$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#41757", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#10592", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#13649", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#14673", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#13855", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#14493", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#14253", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#14833", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("CLET");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9676", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13585", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9678", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13740", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9680", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14177", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9682", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14593", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9684", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14397", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9686", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14832", "CYC"))));
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#622", "CYC"), (SubLObject)module0618.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2213", "CYC"), (SubLObject)module0618.T));
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#622", "CYC"), (SubLObject)module0618.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2213", "CYC"), (SubLObject)module0618.NIL));
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25433", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#41526", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic15$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic16$ = SubLObjectFactory.makeSymbol("S#41523", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic18$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $ic20$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic21$ = SubLObjectFactory.makeSymbol("S#6888", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic23$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic24$ = SubLObjectFactory.makeSymbol("CLOSE");
        $ic25$ = SubLObjectFactory.makeUninternedSymbol("US#2150FF3");
        $ic26$ = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $ic27$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("units"));
        $ic29$ = SubLObjectFactory.makeString("cfasl");
        $ic30$ = SubLObjectFactory.makeString("fht");
        $ic31$ = SubLObjectFactory.makeInteger(192);
        $ic32$ = SubLObjectFactory.makeString("file ~s not found");
        $ic33$ = SubLObjectFactory.makeString("Directory ~S does not exist.");
        $ic34$ = SubLObjectFactory.makeString("Directory ~S cannot be written to.");
        $ic35$ = SubLObjectFactory.makeString("Directory ~S does not have enough space available, ~S bytes, for the KB dump.");
        $ic36$ = SubLObjectFactory.makeString("KB Load GC checkpoint reached ...");
        $ic37$ = SubLObjectFactory.makeString("rule-utility-experience");
        $ic38$ = SubLObjectFactory.makeInteger(4000000);
        $ic39$ = SubLObjectFactory.makeSymbol("S#13584", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#13739", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#14176", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#14592", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#14396", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#14831", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#13585", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#13740", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#14177", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#14593", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#14397", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#14832", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("LOAD-NON-COMPUTABLE-KB-PLUS-REBUILD-AND-DUMP-COMPUTABLE-KB");
        $ic52$ = SubLObjectFactory.makeString("Create directory and continue.");
        $ic53$ = SubLObjectFactory.makeString("~&~%;;; Dumping KB ~A to ~A at ~A~%");
        $ic54$ = SubLObjectFactory.makeString("~&  ~S transcript operations processed~%");
        $ic55$ = SubLObjectFactory.makeString("~&~%;;; Dump of KB ~A completed (~A) at ~A~%");
        $ic56$ = SubLObjectFactory.makeString("~&~%;;; Loading KB from ~A at ~A~%");
        $ic57$ = SubLObjectFactory.makeString("~&~%;;; Load of KB ~A completed (~A) at ~A~%");
        $ic58$ = SubLObjectFactory.makeSymbol("S#41765", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic60$ = SubLObjectFactory.makeString("Could not load KB manifest from ~A. Defaulting to undefined.~%");
        $ic61$ = SubLObjectFactory.makeKeyword("ID");
        $ic62$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic63$ = SubLObjectFactory.makeString("manifest");
        $ic64$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic65$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic66$ = SubLObjectFactory.makeString("~&~%;;; Dumping essential KB~%");
        $ic67$ = SubLObjectFactory.makeString("~&~%;;; Loading essential KB at ~A~%");
        $ic68$ = SubLObjectFactory.makeInteger(2048);
        $ic69$ = SubLObjectFactory.makeInteger(256);
        $ic70$ = SubLObjectFactory.makeString("~&~%;;; Loading computable KB at ~A~%");
        $ic71$ = SubLObjectFactory.makeString("done");
        $ic72$ = SubLObjectFactory.makeString("text");
        $ic73$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic74$ = SubLObjectFactory.makeString("~&~%;;; Loading computable remaining HL at ~A~%");
        $ic75$ = SubLObjectFactory.makeString("Cannot initialize reformulator due to missing KB content.");
        $ic76$ = SubLObjectFactory.makeString("Cannot initialize lexicon cache due to missing KB content.");
        $ic77$ = SubLObjectFactory.makeString("~&~%;;; Rebuilding computable-but-not-dumpable-yet-KB at ~A~%");
        $ic78$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic79$ = SubLObjectFactory.makeString("Cannot initialize paraphrase code due to missing KB content.");
        $ic80$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic81$ = SubLObjectFactory.makeKeyword("EOF");
        $ic82$ = SubLObjectFactory.makeString("~d bytes of unread stuff in ~S");
        $ic83$ = SubLObjectFactory.makeString("~a~%");
        $ic84$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic85$ = ConsesLow.list(new SubLObject[] { module0618.EQUAL, SubLObjectFactory.makeKeyword("TRUE-DEF"), module0618.EQ, SubLObjectFactory.makeKeyword("ASSERT-INFO"), SubLObjectFactory.makeKeyword("ASSERTED-TRUE-DEF"), module0618.EQUALP, SubLObjectFactory.makeKeyword("DEPENDENTS"), SubLObjectFactory.makeKeyword("TRUE-MON"), SubLObjectFactory.makeKeyword("CODE"), SubLObjectFactory.makeKeyword("ASSERTED-TRUE-MON"), SubLObjectFactory.makeKeyword("COMPLEX"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("INVERSE"), SubLObjectFactory.makeKeyword("SPEC-PRED"), SubLObjectFactory.makeKeyword("EVAL"), SubLObjectFactory.makeKeyword("ISA"), SubLObjectFactory.makeKeyword("WEAK"), SubLObjectFactory.makeKeyword("ACTION"), SubLObjectFactory.makeKeyword("DEFINITIONAL"), module0618.EQL, SubLObjectFactory.makeKeyword("SIGN"), SubLObjectFactory.makeKeyword("DONT-CARE"), SubLObjectFactory.makeKeyword("PPH-UNKNOWN-ARG-POSITION"), SubLObjectFactory.makeKeyword("SUBJECT"), SubLObjectFactory.makeKeyword("GAF-ARG"), SubLObjectFactory.makeKeyword("VARIABLE-NAMES"), SubLObjectFactory.makeKeyword("ARG1"), SubLObjectFactory.makeKeyword("GENLS"), SubLObjectFactory.makeKeyword("PPH-UNKNOWN-CYCL"), SubLObjectFactory.makeKeyword("ARG2"), SubLObjectFactory.makeKeyword("OBJECT"), SubLObjectFactory.makeKeyword("BEGINNING-OF-TIME"), SubLObjectFactory.makeKeyword("END-OF-TIME"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("BACKWARD"), SubLObjectFactory.makeKeyword("OTHER"), SubLObjectFactory.makeKeyword("EQUALITY"), SubLObjectFactory.makeKeyword("PPH-EMPTY-INFO-VECTOR"), SubLObjectFactory.makeKeyword("TVA"), SubLObjectFactory.makeKeyword("GENLPREDS"), SubLObjectFactory.makeKeyword("NOUN"), SubLObjectFactory.makeKeyword("NART-ARG"), SubLObjectFactory.makeKeyword("OBLIQUE-OBJECT"), SubLObjectFactory.makeKeyword("ELEMENTOF"), SubLObjectFactory.makeSymbol("QUOTE"), module0618.T, SubLObjectFactory.makeKeyword("ADMIT"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("POS-PRED") });
        $ic86$ = SubLObjectFactory.makeString("Dumping special objects at ~A ...");
        $ic87$ = SubLObjectFactory.makeString("special");
        $ic88$ = SubLObjectFactory.makeString("Loading special objects ...");
        $ic89$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic90$ = SubLObjectFactory.makeString("constant-count");
        $ic91$ = SubLObjectFactory.makeString("constant-shell");
        $ic92$ = SubLObjectFactory.makeString("Dumping constant shells");
        $ic93$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic94$ = SubLObjectFactory.makeString("Loading constant shells");
        $ic95$ = SubLObjectFactory.makeString("The specified file position ~A is past the length of the file ~A of ~A bytes.");
        $ic96$ = SubLObjectFactory.makeString("~A lies within the file header [0,~A) and designates no constant.");
        $ic97$ = SubLObjectFactory.makeString("~A specifies a file position in the definition of ~A (suid: ~A // guid: ~A).~%");
        $ic98$ = SubLObjectFactory.makeString("~A should have been found but was not ... error in the algorithm?");
        $ic99$ = SubLObjectFactory.makeString("nart-count");
        $ic100$ = SubLObjectFactory.makeString("nat-shell");
        $ic101$ = SubLObjectFactory.makeString("Loading NART shells");
        $ic102$ = SubLObjectFactory.makeString("assertion-count");
        $ic103$ = SubLObjectFactory.makeString("assertion-shell");
        $ic104$ = SubLObjectFactory.makeString("Loading assertion shells");
        $ic105$ = SubLObjectFactory.makeString("kb-hl-support-count");
        $ic106$ = SubLObjectFactory.makeString("kb-hl-support-shell");
        $ic107$ = SubLObjectFactory.makeString("Loading KB HL support shells");
        $ic108$ = SubLObjectFactory.makeString("unrepresented-term-count");
        $ic109$ = SubLObjectFactory.makeString("unrepresented-terms");
        $ic110$ = SubLObjectFactory.makeString("Dumping KB unrepresented terms");
        $ic111$ = SubLObjectFactory.makeString(" -- Old Space");
        $ic112$ = SubLObjectFactory.makeString(" -- New Space");
        $ic113$ = SubLObjectFactory.makeString("Reconnecting to unrepresented terms FHT ....");
        $ic114$ = SubLObjectFactory.makeString("Could not locate ~A, faling back on ID-INDEX implementation.~A");
        $ic115$ = SubLObjectFactory.makeString("Loading KB unrepresented terms");
        $ic116$ = SubLObjectFactory.makeInteger(500);
        $ic117$ = SubLObjectFactory.makeString("clause-struc-count");
        $ic118$ = SubLObjectFactory.makeString("clause-struc");
        $ic119$ = SubLObjectFactory.makeString("Dumping clause-struc definitions");
        $ic120$ = SubLObjectFactory.makeString("Loading clause-struc definitions");
        $ic121$ = SubLObjectFactory.makeString("deduction-count");
        $ic122$ = SubLObjectFactory.makeString("deduction");
        $ic123$ = SubLObjectFactory.makeString("deduction-index");
        $ic124$ = SubLObjectFactory.makeString("Dumping deduction definitions");
        $ic125$ = SubLObjectFactory.makeString("~&Deduction definitions will be swapped in lazily from ~A and ~A~%");
        $ic126$ = SubLObjectFactory.makeString("Initializing deduction handles only");
        $ic127$ = SubLObjectFactory.makeString("Loading deduction definitions");
        $ic128$ = SubLObjectFactory.makeSymbol("S#14536", "CYC");
        $ic129$ = SubLObjectFactory.makeString("assertion");
        $ic130$ = SubLObjectFactory.makeString("assertion-index");
        $ic131$ = SubLObjectFactory.makeString("Dumping assertion definitions");
        $ic132$ = SubLObjectFactory.makeString("~&Assertion definitions will be swapped in lazily from ~A and ~A~%");
        $ic133$ = SubLObjectFactory.makeString("Loading assertion definitions");
        $ic134$ = SubLObjectFactory.makeSymbol("S#13954", "CYC");
        $ic135$ = SubLObjectFactory.makeString("kb-hl-support");
        $ic136$ = SubLObjectFactory.makeString("kb-hl-support-index");
        $ic137$ = SubLObjectFactory.makeString("Dumping KB HL support definitions");
        $ic138$ = SubLObjectFactory.makeString("~&KB HL supports will be swapped in lazily from ~A and ~A~%");
        $ic139$ = SubLObjectFactory.makeString("Loading KB HL support definitions");
        $ic140$ = SubLObjectFactory.makeSymbol("S#14301", "CYC");
        $ic141$ = SubLObjectFactory.makeString("kb-hl-support-indexing");
        $ic142$ = SubLObjectFactory.makeString("Dumping KB HL support indexing ...");
        $ic143$ = SubLObjectFactory.makeString("Loading KB HL support indexing ...");
        $ic144$ = SubLObjectFactory.makeString("bookkeeping-assertions");
        $ic145$ = SubLObjectFactory.makeString("Dumping bookkeeping assertions ...");
        $ic146$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17133", "CYC"));
        $ic147$ = SubLObjectFactory.makeString("Loading bookkeeping assertions ...");
        $ic148$ = SubLObjectFactory.makeString("Dumping rule utility experience ...");
        $ic149$ = SubLObjectFactory.makeString("Loading rule utility experience ...");
        $ic150$ = SubLObjectFactory.makeString("indices");
        $ic151$ = SubLObjectFactory.makeString("indices-index");
        $ic152$ = SubLObjectFactory.makeString("Dumping constant indices");
        $ic153$ = SubLObjectFactory.makeString("~&Constant indexing will be swapped in lazily from ~A and ~A~%");
        $ic154$ = SubLObjectFactory.makeString("Loading constant indices");
        $ic155$ = SubLObjectFactory.makeSymbol("S#13528", "CYC");
        $ic156$ = SubLObjectFactory.makeString("nat-indices");
        $ic157$ = SubLObjectFactory.makeString("nat-indices-index");
        $ic158$ = SubLObjectFactory.makeString("Dumping NART indices");
        $ic159$ = SubLObjectFactory.makeString("~&NART indexing will be swapped in lazily from ~A and ~A~%");
        $ic160$ = SubLObjectFactory.makeString("Loading NART indices");
        $ic161$ = SubLObjectFactory.makeSymbol("S#13688", "CYC");
        $ic162$ = SubLObjectFactory.makeString("unrepresented-term-indices");
        $ic163$ = SubLObjectFactory.makeString("unrepresented-term-indices-index");
        $ic164$ = SubLObjectFactory.makeString("Dumping unrepresented term indices");
        $ic165$ = SubLObjectFactory.makeString("~&Unrepresented term indexing will be swapped in lazily from ~A and ~A~%");
        $ic166$ = SubLObjectFactory.makeString("Loading unrepresented term indices");
        $ic167$ = SubLObjectFactory.makeSymbol("S#14624", "CYC");
        $ic168$ = SubLObjectFactory.makeString("assertion-indices");
        $ic169$ = SubLObjectFactory.makeString("Dumping assertion indices");
        $ic170$ = SubLObjectFactory.makeString("Loading assertion indices");
        $ic171$ = SubLObjectFactory.makeString("auxiliary-indices");
        $ic172$ = SubLObjectFactory.makeString("Dumping auxiliary indices ...");
        $ic173$ = SubLObjectFactory.makeString("Loading auxiliary indices");
        $ic174$ = SubLObjectFactory.makeString("bookkeeping-indices");
        $ic175$ = SubLObjectFactory.makeString("Dumping bookkeeping indices");
        $ic176$ = SubLObjectFactory.makeSymbol("S#41662", "CYC");
        $ic177$ = SubLObjectFactory.makeString("Loading bookkeeping indices ...");
        $ic178$ = SubLObjectFactory.makeString("rule-set");
        $ic179$ = SubLObjectFactory.makeString("Dumping rule set ...");
        $ic180$ = SubLObjectFactory.makeSymbol("S#14035", "CYC");
        $ic181$ = SubLObjectFactory.makeString("Loading rule set ...");
        $ic182$ = SubLObjectFactory.makeString("nart-hl-formula");
        $ic183$ = SubLObjectFactory.makeString("nart-hl-formula-index");
        $ic184$ = SubLObjectFactory.makeString("Dumping NART HL formulas");
        $ic185$ = SubLObjectFactory.makeString("~A");
        $ic186$ = SubLObjectFactory.makeString("~&NART HL formulas will be swapped in lazily from ~A and ~A~%");
        $ic187$ = SubLObjectFactory.makeString("Loading nart-hl-formula definitions");
        $ic188$ = SubLObjectFactory.makeString("misc");
        $ic189$ = SubLObjectFactory.makeString("Dumping miscellaneous stuff ...");
        $ic190$ = SubLObjectFactory.makeString("Loading miscellaneous stuff ...");
        $ic191$ = SubLObjectFactory.makeString("sbhl-modules");
        $ic192$ = SubLObjectFactory.makeString("sbhl-module-graphs");
        $ic193$ = SubLObjectFactory.makeString("sbhl-module-graphs-index");
        $ic194$ = SubLObjectFactory.makeString("Dumping SBHL modules and graphs ...");
        $ic195$ = SubLObjectFactory.makeKeyword("SWAPPED-OUT");
        $ic196$ = SubLObjectFactory.makeString("Dumping SBHL graphs ...");
        $ic197$ = SubLObjectFactory.makeKeyword("WARN-ONLY");
        $ic198$ = SubLObjectFactory.makeString("Loading SBHL graphs ...");
        $ic199$ = SubLObjectFactory.makeInteger(30);
        $ic200$ = SubLObjectFactory.makeKeyword("GRAPH");
        $ic201$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic202$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic203$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic204$ = SubLObjectFactory.makeString("Cannot initialize SBHL Time due to missing KB content.");
        $ic205$ = SubLObjectFactory.makeKeyword("END");
        $ic206$ = SubLObjectFactory.makeKeyword("ISA-ARG2-NAUT-TABLE");
        $ic207$ = SubLObjectFactory.makeKeyword("NON-FORT-ISA-TABLE");
        $ic208$ = SubLObjectFactory.makeKeyword("NON-FORT-INSTANCE-TABLE");
        $ic209$ = SubLObjectFactory.makeString("Could not handle SBHL miscellany token ~s");
        $ic210$ = SubLObjectFactory.makeString("sbhl-cache");
        $ic211$ = SubLObjectFactory.makeString("Dumping SBHL cache ...");
        $ic212$ = SubLObjectFactory.makeString("Loading SBHL cache ...");
        $ic213$ = SubLObjectFactory.makeString("cardinality-estimates");
        $ic214$ = SubLObjectFactory.makeString("Dumping cardinality estimates ...");
        $ic215$ = SubLObjectFactory.makeSymbol("S#37327", "CYC");
        $ic216$ = SubLObjectFactory.makeString("Loading cardinality estimates ...");
        $ic217$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41768", "CYC"), (SubLObject)module0618.NIL));
        $ic218$ = SubLObjectFactory.makeString("arg-type-cache");
        $ic219$ = SubLObjectFactory.makeString("Dumping arg-type cache ...");
        $ic220$ = SubLObjectFactory.makeString("Loading arg-type cache ...");
        $ic221$ = SubLObjectFactory.makeString("Rebuilding arg-type cache");
        $ic222$ = SubLObjectFactory.makeString("defns-cache");
        $ic223$ = SubLObjectFactory.makeString("Dumping defns cache ...");
        $ic224$ = SubLObjectFactory.makeString("Loading defns cache ...");
        $ic225$ = SubLObjectFactory.makeString("tva-cache");
        $ic226$ = SubLObjectFactory.makeString("Dumping TVA cache ...");
        $ic227$ = SubLObjectFactory.makeSymbol("S#24403", "CYC");
        $ic228$ = SubLObjectFactory.makeString("Loading TVA cache ...");
        $ic229$ = SubLObjectFactory.makeString("reformulator-rules");
        $ic230$ = SubLObjectFactory.makeString("Dumping reformulator rules ...");
        $ic231$ = SubLObjectFactory.makeSymbol("S#22532", "CYC");
        $ic232$ = SubLObjectFactory.makeString("Loading reformulator rules ...");
        $ic233$ = SubLObjectFactory.makeString("sbhl-time");
        $ic234$ = SubLObjectFactory.makeString("Dumping sbhl time state ...");
        $ic235$ = SubLObjectFactory.makeString("sbhl");
        $ic236$ = SubLObjectFactory.makeString("Loading SBHL time state ...");
        $ic237$ = SubLObjectFactory.makeString("~d bytes of unread sbhl time state in ~S");
        $ic238$ = SubLObjectFactory.makeString("somewhere-cache");
        $ic239$ = SubLObjectFactory.makeString("Dumping somewhere rules cache ...");
        $ic240$ = SubLObjectFactory.makeString("Loading somewhere cache ...");
        $ic241$ = SubLObjectFactory.makeString("arity-cache");
        $ic242$ = SubLObjectFactory.makeString("Dumping arity cache ...");
        $ic243$ = SubLObjectFactory.makeString("Loading arity cache ...");
        $ic244$ = SubLObjectFactory.makeString("pph-phrase-count");
        $ic245$ = SubLObjectFactory.makeString("pph-phrase-shell");
        $ic246$ = SubLObjectFactory.makeString("Dumping pph-phrase shells");
        $ic247$ = SubLObjectFactory.makeString("PPH phrase ~A indexed incorrectly.");
        $ic248$ = SubLObjectFactory.makeString("Loading pph-phrase shells");
        $ic249$ = SubLObjectFactory.makeString("pph-phrase");
        $ic250$ = SubLObjectFactory.makeString("pph-phrase-index");
        $ic251$ = SubLObjectFactory.makeString("Dumping pph-phrase definitions");
        $ic252$ = SubLObjectFactory.makeString("Loading pph-phrase definitions");
        $ic253$ = SubLObjectFactory.makeString("pph-phrase definitions out of sync on load");
        $ic254$ = SubLObjectFactory.makeString("gen-template-store");
        $ic255$ = SubLObjectFactory.makeString("Dumping #$genTemplate store ...");
        $ic256$ = SubLObjectFactory.makeString("Loading #$genTemplate store ...");
        $ic257$ = SubLObjectFactory.makeString("pph-name-string-preds");
        $ic258$ = SubLObjectFactory.makeKeyword("DUMPED");
        $ic259$ = SubLObjectFactory.makeString("pph-phrase-fns");
        $ic260$ = SubLObjectFactory.makeKeyword("LOADED");
        $ic261$ = SubLObjectFactory.makeString("Initializing minor paraphrase CycL structures ...");
        $ic262$ = SubLObjectFactory.makeString("~&~%;;; Performing other KB dump activities at ~A~%");
        $ic263$ = SubLObjectFactory.makeString("~&~%;;; Performing KB initializations at ~A~%");
        $ic264$ = SubLObjectFactory.makeString("Reformulator: ~A~%");
        $ic265$ = SubLObjectFactory.makeString("Paraphrase: ~A~%");
        $ic266$ = SubLObjectFactory.makeString("Cyc Task Scheduler: ~A~%");
        $ic267$ = SubLObjectFactory.makeString("SKSI: ~A~%");
        $ic268$ = SubLObjectFactory.makeString("Quant: ~A~%");
        $ic269$ = SubLObjectFactory.makeString("Date: ~A~%");
        $ic270$ = SubLObjectFactory.makeString("Time: ~A~%");
        $ic271$ = SubLObjectFactory.makeString("Lexicon: ~A~%");
        $ic272$ = SubLObjectFactory.makeString("NL: ~A~%");
        $ic273$ = SubLObjectFactory.makeString("RTP: ~A~%");
        $ic274$ = SubLObjectFactory.makeString("RKF: ~A~%");
        $ic275$ = SubLObjectFactory.makeString("Thesaurus: ~A~%");
        $ic276$ = SubLObjectFactory.makeString("Wordnet: ~A~%");
        $ic277$ = SubLObjectFactory.makeString("Planner: ~A~%");
        $ic278$ = SubLObjectFactory.makeString("Secure: ~A~%");
        $ic279$ = SubLObjectFactory.makeString("/scratch/");
        $ic280$ = SubLObjectFactory.makeString("load-all-constants.lisp");
        $ic281$ = SubLObjectFactory.makeString("load-all-narts.lisp");
        $ic282$ = SubLObjectFactory.makeString("load-all-assertions.lisp");
        $ic283$ = SubLObjectFactory.makeString("load-all-kb-hl-supports.lisp");
        $ic284$ = SubLObjectFactory.makeString("load-all-deductions.lisp");
        $ic285$ = SubLObjectFactory.makeString("load-all-kb-hl-support-dependents.lisp");
        $ic286$ = SubLObjectFactory.makeString("load-all-bookkeeping-gafs.lisp");
        $ic287$ = SubLObjectFactory.makeString("~&~%;;; Loading evaluatable essential KB at ~A~%");
        $ic288$ = SubLObjectFactory.makeString("Loading constants");
        $ic289$ = SubLObjectFactory.makeString("Loading narts");
        $ic290$ = SubLObjectFactory.makeString("Loading assertions");
        $ic291$ = SubLObjectFactory.makeString("Loading KB HL supports");
        $ic292$ = SubLObjectFactory.makeString("Loading deductions");
        $ic293$ = SubLObjectFactory.makeString("Loading KB HL support dependents");
        $ic294$ = SubLObjectFactory.makeString("Loading bookkeeping data");
        $ic295$ = SubLObjectFactory.makeKeyword("STRICT");
        $ic296$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic297$ = SubLObjectFactory.makeString("~&~%;;; Rebuilding Computable KB at ~A~%");
        $ic298$ = SubLObjectFactory.makeKeyword("ASSERTIVE");
        $ic299$ = SubLObjectFactory.makeString("~&~%;;; Dumping Computable KB at ~A~%");
        $ic300$ = SubLObjectFactory.makeString("Dumping rule utility experience");
        $ic301$ = SubLObjectFactory.makeString("rule-utility-experience.cfasl");
        $ic302$ = SubLObjectFactory.makeString("Dumping sbhl caching policies");
        $ic303$ = SubLObjectFactory.makeString("standard-kb-sbhl-caching-policies.cfasl");
        $ic304$ = SubLObjectFactory.makeInteger(8000000);
        $ic305$ = SubLObjectFactory.makeString("Operation ~S~%");
        $ic306$ = SubLObjectFactory.makeSymbol("S#2613", "CYC");
        $ic307$ = SubLObjectFactory.makeKeyword("ACCESSOR");
        $ic308$ = SubLObjectFactory.makeString("Failed operation: ~S, Got: ~S~%");
        $ic309$ = SubLObjectFactory.makeString("Dumping forms to create all constants ...");
        $ic310$ = SubLObjectFactory.makeString("Found unfindable constant: ~A with id ~A.~%");
        $ic311$ = SubLObjectFactory.makeString("(kb-create-constant ~A ~A)~%");
        $ic312$ = SubLObjectFactory.makeInteger(150000);
        $ic313$ = SubLObjectFactory.makeString("Dumping forms to create all narts ....");
        $ic314$ = SubLObjectFactory.makeString("Found unfindable nart: ~A with id ~A.~%");
        $ic315$ = SubLObjectFactory.makeString("(kb-create-nart ~A)~%");
        $ic316$ = SubLObjectFactory.makeInteger(350000);
        $ic317$ = SubLObjectFactory.makeString("Dumping forms to create all  assertions ....");
        $ic318$ = SubLObjectFactory.makeString("Found unfindable assertion: ~A with id ~A.~%");
        $ic319$ = SubLObjectFactory.makeString("(kb-create-assertion ~A ~A '~S ~S ~S ~S ~S)~%");
        $ic320$ = SubLObjectFactory.makeString("(kb-timestamp-asserted-assertion ~A ~S ~A ~S)~%");
        $ic321$ = SubLObjectFactory.makeString("Dumping forms to create all KB HL supports...");
        $ic322$ = SubLObjectFactory.makeString("Found unfindable kb-hl-support ~A with id ~A~%");
        $ic323$ = SubLObjectFactory.makeString("(create-kb-hl-support ~A ~A)~%");
        $ic324$ = SubLObjectFactory.makeString("Dumping forms to create all KB HL support dependents...");
        $ic325$ = SubLObjectFactory.makeInteger(2500);
        $ic326$ = SubLObjectFactory.makeString("(kb-kb-hl-support-set-dependents ~A ~A)~%");
        $ic327$ = SubLObjectFactory.makeString("(clet ((deps nil))~%");
        $ic328$ = SubLObjectFactory.makeString("  (csetq deps (append deps ~A))~%");
        $ic329$ = SubLObjectFactory.makeString("  (kb-kb-hl-support-set-dependents ~A deps))~%");
        $ic330$ = SubLObjectFactory.makeString("Dumping forms to create all deductions...");
        $ic331$ = SubLObjectFactory.makeString("Found unfindable deduction ~A with id ~A~%");
        $ic332$ = SubLObjectFactory.makeString("(kb-create-deduction ~A ~A ~A ~A)~%");
        $ic333$ = SubLObjectFactory.makeString("Got bad bookkeeping gaf ~S: (~S ~S ~S)");
        $ic334$ = SubLObjectFactory.makeString("(hl-assert-bookkeeping-binary-gaf ~A ~A ~A ~A)~%");
        $ic335$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic336$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic337$ = SubLObjectFactory.makeString("Testing that narts are findable....");
        $ic338$ = SubLObjectFactory.makeString("Unfindable nart ~S: ~S");
        $ic339$ = SubLObjectFactory.makeString("Testing that assertions are findable....");
        $ic340$ = SubLObjectFactory.makeString("(~S) Unfindable assertion id ~S: ~S");
        $ic341$ = SubLObjectFactory.makeString("Testing that deductions are findable....");
        $ic342$ = SubLObjectFactory.makeString("(~S) Unfindable deduction id ~S: ~S");
        $ic343$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycAdministrator"));
        $ic344$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $ic345$ = SubLObjectFactory.makeSymbol("S#41777", "CYC");
        $ic346$ = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $ic347$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-HL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("S#41777", "CYC")));
        $ic348$ = SubLObjectFactory.makeSymbol("EVAL");
        $ic349$ = SubLObjectFactory.makeSymbol("READ-FROM-STRING");
        $ic350$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-KILL"), (SubLObject)SubLObjectFactory.makeSymbol("S#41777", "CYC")));
        $ic351$ = SubLObjectFactory.makeSymbol("S#41778", "CYC");
        $ic352$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $ic353$ = SubLObjectFactory.makeSymbol("CAND");
        $ic354$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("S#41778", "CYC"));
        $ic355$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("S#41778", "CYC")));
        $ic356$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14111", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41778", "CYC")));
        $ic357$ = SubLObjectFactory.makeString("Deleting potentially bad assertion ~A: ~A");
        $ic358$ = SubLObjectFactory.makeString("Recanonicalized ~A: ~A");
        $ic359$ = SubLObjectFactory.makeString("Finding assertions ....");
        $ic360$ = SubLObjectFactory.makeString("Expected a deduction got: ~S~%");
        $ic361$ = SubLObjectFactory.makeString("Finding cnf with non trivial term order ....");
        $ic362$ = SubLObjectFactory.makeString("Found cnf ~A");
        $ic363$ = SubLObjectFactory.makeString("Found mt ~A");
        $ic364$ = SubLObjectFactory.makeString("Found id ~A");
    }
    
    public static final class $f38066$BinaryFunction extends BinaryFunction
    {
        public $f38066$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14536"));
        }
        
        public SubLObject processItem(final SubLObject var373, final SubLObject var374) {
            return module0618.f38066(var373, var374);
        }
    }
    
    public static final class $f38069$BinaryFunction extends BinaryFunction
    {
        public $f38069$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13954"));
        }
        
        public SubLObject processItem(final SubLObject var373, final SubLObject var374) {
            return module0618.f38069(var373, var374);
        }
    }
    
    public static final class $f38111$BinaryFunction extends BinaryFunction
    {
        public $f38111$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13712"));
        }
        
        public SubLObject processItem(final SubLObject var373, final SubLObject var374) {
            return module0618.f38111(var373, var374);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0618.class
	Total time: 10076 ms
	 var138 
	var33 
	var138 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var28 
	var138 
	var28 
	var28 
	var139 
	var139 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	var33 
	Decompiled with Procyon 0.5.32.
*/