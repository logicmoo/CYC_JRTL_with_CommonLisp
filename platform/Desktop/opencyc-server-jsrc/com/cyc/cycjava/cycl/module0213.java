package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0213 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0213";
    public static final String myFingerPrint = "d6231599ed3ca608be031af606b7341ebeac81f7f7a89300b8ec63e2ebaed7fc";
    private static SubLSymbol $g2346$;
    private static SubLSymbol $g2347$;
    private static SubLSymbol $g2348$;
    private static SubLSymbol $g2349$;
    private static SubLSymbol $g2350$;
    private static SubLSymbol $g2351$;
    private static SubLSymbol $g2352$;
    private static SubLSymbol $g2353$;
    private static SubLSymbol $g2354$;
    private static SubLSymbol $g2355$;
    private static SubLSymbol $g2356$;
    private static SubLSymbol $g2357$;
    private static SubLSymbol $g2358$;
    private static SubLSymbol $g2359$;
    public static SubLSymbol $g2360$;
    private static SubLSymbol $g2361$;
    private static SubLSymbol $g2362$;
    private static SubLSymbol $g2363$;
    private static SubLSymbol $g2364$;
    private static SubLSymbol $g2365$;
    private static SubLSymbol $g2366$;
    private static SubLSymbol $g2367$;
    private static SubLSymbol $g2368$;
    private static SubLSymbol $g2369$;
    private static SubLSymbol $g2370$;
    private static SubLSymbol $g2371$;
    private static SubLSymbol $g2372$;
    private static SubLSymbol $g2373$;
    private static SubLSymbol $g2374$;
    private static SubLSymbol $g2375$;
    private static SubLSymbol $g2376$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLString $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLString $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLString $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLString $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLString $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLString $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLString $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLFloat $ic64$;
    private static final SubLFloat $ic65$;
    private static final SubLFloat $ic66$;
    private static final SubLFloat $ic67$;
    private static final SubLFloat $ic68$;
    private static final SubLFloat $ic69$;
    private static final SubLFloat $ic70$;
    private static final SubLFloat $ic71$;
    private static final SubLInteger $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
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
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLInteger $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLInteger $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLInteger $ic150$;
    private static final SubLInteger $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLList $ic171$;
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
    private static final SubLList $ic183$;
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
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLList $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLList $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLList $ic216$;
    private static final SubLList $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLList $ic219$;
    private static final SubLList $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLList $ic228$;
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
    private static final SubLList $ic239$;
    private static final SubLList $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLList $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLList $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLObject $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLObject $ic252$;
    private static final SubLObject $ic253$;
    private static final SubLList $ic254$;
    private static final SubLList $ic255$;
    private static final SubLList $ic256$;
    private static final SubLObject $ic257$;
    private static final SubLObject $ic258$;
    private static final SubLObject $ic259$;
    private static final SubLObject $ic260$;
    private static final SubLString $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLList $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLList $ic267$;
    private static final SubLList $ic268$;
    private static final SubLList $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLInteger $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
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
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLList $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLInteger $ic296$;
    private static final SubLString $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLObject $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLList $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLList $ic305$;
    private static final SubLObject $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLString $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLString $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLString $ic315$;
    private static final SubLObject $ic316$;
    private static final SubLObject $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLString $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLInteger $ic321$;
    private static final SubLObject $ic322$;
    private static final SubLString $ic323$;
    private static final SubLString $ic324$;
    private static final SubLString $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLString $ic347$;
    private static final SubLList $ic348$;
    private static final SubLString $ic349$;
    private static final SubLString $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLList $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLString $ic358$;
    private static final SubLString $ic359$;
    
    public static SubLObject f13862(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = constant_handles_oc.f8433();
        final SubLObject var4 = module0164.f10673();
        final SubLObject var5 = module0167.f10796();
        final SubLObject var6 = module0169.f10853();
        final SubLObject var7 = module0170.f10879();
        final SubLObject var8 = module0173.f10962();
        final SubLObject var9 = assertion_handles_oc.f11019();
        final SubLObject var10 = assertion_manager_oc.f11110();
        final SubLObject var11 = module0617.f37888();
        final SubLObject var12 = (SubLObject)ZERO_INTEGER;
        final SubLObject var13 = deduction_handles_oc.f11643();
        final SubLObject var14 = module0186.f11705();
        final SubLObject var15 = module0179.f11409();
        final SubLObject var16 = module0181.f11469();
        final SubLObject var17 = module0190.f11858();
        final SubLObject var18 = module0189.f11808();
        SubLObject var19 = (SubLObject)NIL;
        var19 = Numbers.add(var9, var11, var12);
        final SubLObject var20 = reader.$read_default_float_format$.currentBinding(var2);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic0$, var2);
            PrintLow.format(var1, (SubLObject)$ic1$, module0018.f971());
            PrintLow.format(var1, (SubLObject)$ic2$, var8);
            PrintLow.format(var1, (SubLObject)$ic3$, var3);
            if (!var3.isZero()) {
                PrintLow.format(var1, (SubLObject)$ic4$, var4, module0048.f3314(var4, var3, (SubLObject)THREE_INTEGER));
            }
            PrintLow.format(var1, (SubLObject)$ic5$, var5);
            if (!var5.isZero()) {
                PrintLow.format(var1, (SubLObject)$ic4$, var6, module0048.f3314(var6, var5, (SubLObject)THREE_INTEGER));
                PrintLow.format(var1, (SubLObject)$ic6$, var7, module0048.f3314(var7, var5, (SubLObject)THREE_INTEGER));
            }
            PrintLow.format(var1, (SubLObject)$ic7$, var19);
            PrintLow.format(var1, (SubLObject)$ic8$, var9);
            if (!var9.isZero()) {
                PrintLow.format(var1, (SubLObject)$ic9$, var10, module0048.f3314(var10, var9, (SubLObject)THREE_INTEGER));
            }
            PrintLow.format(var1, (SubLObject)$ic10$, var11);
            PrintLow.format(var1, (SubLObject)$ic11$, var13);
            if (!var13.isZero()) {
                PrintLow.format(var1, (SubLObject)$ic9$, var14, module0048.f3314(var14, var13, (SubLObject)THREE_INTEGER));
            }
            PrintLow.format(var1, (SubLObject)$ic12$, var15);
            if (!var15.isZero()) {
                PrintLow.format(var1, (SubLObject)$ic9$, var16, module0048.f3314(var16, var15, (SubLObject)THREE_INTEGER));
            }
            PrintLow.format(var1, (SubLObject)$ic13$, var17);
            if (!var17.isZero()) {
                PrintLow.format(var1, (SubLObject)$ic4$, var18, module0048.f3314(var18, var17, (SubLObject)THREE_INTEGER));
            }
            streams_high.terpri(var1);
        }
        finally {
            reader.$read_default_float_format$.rebind(var20, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13863(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(var1, (SubLObject)$ic14$, module0018.f971());
        PrintLow.format(var1, (SubLObject)$ic15$, module0173.f10962());
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic16$, Sequences.length(module0269.f17703($ic17$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic18$, Sequences.length(module0259.f16850($ic19$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic20$, Sequences.length(module0259.f16850($ic21$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic22$, Sequences.length(module0259.f16850($ic23$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic24$, Sequences.length(module0269.f17703($ic25$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic26$, Sequences.length(module0269.f17703($ic27$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic28$, Sequences.length(module0269.f17703($ic29$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic30$, Sequences.length(module0259.f16850($ic31$)));
        streams_high.force_output(var1);
        PrintLow.format(var1, (SubLObject)$ic32$, assertion_handles_oc.f11019());
        streams_high.force_output(var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13864(SubLObject var21, SubLObject var22) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)T;
        }
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        SubLObject var24 = (SubLObject)ZERO_INTEGER;
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = module0147.$g2094$.currentBinding(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var23);
        try {
            module0147.$g2094$.bind((SubLObject)$ic33$, var23);
            module0147.$g2095$.bind($ic34$, var23);
            final SubLObject var28 = module0259.f16848($ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0012.$g82$.setDynamicValue((SubLObject)$ic35$, var23);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var23);
            module0012.$g83$.setDynamicValue(Sequences.length(var28), var23);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var23);
            final SubLObject var20_27 = module0012.$g75$.currentBinding(var23);
            final SubLObject var25_28 = module0012.$g76$.currentBinding(var23);
            final SubLObject var29 = module0012.$g77$.currentBinding(var23);
            final SubLObject var30 = module0012.$g78$.currentBinding(var23);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var23);
                module0012.$g76$.bind((SubLObject)NIL, var23);
                module0012.$g77$.bind((SubLObject)T, var23);
                module0012.$g78$.bind(Time.get_universal_time(), var23);
                module0012.f478(module0012.$g82$.getDynamicValue(var23));
                SubLObject var31 = var28;
                SubLObject var32 = (SubLObject)NIL;
                var32 = var31.first();
                while (NIL != var31) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var23), module0012.$g83$.getDynamicValue(var23));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var23), (SubLObject)ONE_INTEGER), var23);
                    if (NIL == module0259.f16902(var32, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        SubLObject var33 = (SubLObject)ZERO_INTEGER;
                        if (NIL != var21) {
                            final SubLObject var34 = var32;
                            if (NIL != module0158.f10038(var34)) {
                                final SubLObject var35 = (SubLObject)NIL;
                                final SubLObject var20_28 = module0012.$g73$.currentBinding(var23);
                                final SubLObject var25_29 = module0012.$g65$.currentBinding(var23);
                                final SubLObject var29_38 = module0012.$g67$.currentBinding(var23);
                                final SubLObject var30_39 = module0012.$g68$.currentBinding(var23);
                                final SubLObject var36 = module0012.$g66$.currentBinding(var23);
                                final SubLObject var37 = module0012.$g69$.currentBinding(var23);
                                final SubLObject var38 = module0012.$g70$.currentBinding(var23);
                                final SubLObject var39 = module0012.$silent_progressP$.currentBinding(var23);
                                try {
                                    module0012.$g73$.bind(Time.get_universal_time(), var23);
                                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var23), var23);
                                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var23);
                                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var23);
                                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var23);
                                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var23);
                                    module0012.$g70$.bind((SubLObject)T, var23);
                                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var23) : T), var23);
                                    module0012.f474(var35);
                                    final SubLObject var40 = module0158.f10039(var34);
                                    SubLObject var41 = (SubLObject)NIL;
                                    final SubLObject var42 = (SubLObject)NIL;
                                    while (NIL == var41) {
                                        final SubLObject var43 = module0052.f3695(var40, var42);
                                        final SubLObject var44 = (SubLObject)makeBoolean(!var42.eql(var43));
                                        if (NIL != var44) {
                                            module0012.f476();
                                            SubLObject var45 = (SubLObject)NIL;
                                            try {
                                                var45 = module0158.f10316(var43, (SubLObject)$ic36$, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var45_50 = (SubLObject)NIL;
                                                final SubLObject var46_51 = (SubLObject)NIL;
                                                while (NIL == var45_50) {
                                                    final SubLObject var46 = module0052.f3695(var45, var46_51);
                                                    final SubLObject var48_53 = (SubLObject)makeBoolean(!var46_51.eql(var46));
                                                    if (NIL != var48_53 && (NIL == var21 || NIL != module0178.f11375(var46))) {
                                                        var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                                                    }
                                                    var45_50 = (SubLObject)makeBoolean(NIL == var48_53);
                                                }
                                            }
                                            finally {
                                                final SubLObject var20_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var23);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var23);
                                                    if (NIL != var45) {
                                                        module0158.f10319(var45);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var20_29, var23);
                                                }
                                            }
                                        }
                                        var41 = (SubLObject)makeBoolean(NIL == var44);
                                    }
                                    module0012.f475();
                                }
                                finally {
                                    module0012.$silent_progressP$.rebind(var39, var23);
                                    module0012.$g70$.rebind(var38, var23);
                                    module0012.$g69$.rebind(var37, var23);
                                    module0012.$g66$.rebind(var36, var23);
                                    module0012.$g68$.rebind(var30_39, var23);
                                    module0012.$g67$.rebind(var29_38, var23);
                                    module0012.$g65$.rebind(var25_29, var23);
                                    module0012.$g73$.rebind(var20_28, var23);
                                }
                            }
                        }
                        else {
                            var33 = module0217.f14247(var32, (SubLObject)UNPROVIDED);
                        }
                        if (var33.isPositive()) {
                            var24 = Numbers.add(var24, var33);
                            var25 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var32, var33), var25);
                        }
                    }
                    var31 = var31.rest();
                    var32 = var31.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var30, var23);
                module0012.$g77$.rebind(var29, var23);
                module0012.$g76$.rebind(var25_28, var23);
                module0012.$g75$.rebind(var20_27, var23);
            }
        }
        finally {
            module0147.$g2095$.rebind(var27, var23);
            module0147.$g2094$.rebind(var26, var23);
        }
        var25 = Sort.sort(var25, Symbols.symbol_function((SubLObject)$ic37$), Symbols.symbol_function((SubLObject)$ic38$));
        return Values.values(var25, var24);
    }
    
    public static SubLObject f13865(final SubLObject var55) {
        if (NIL != module0217.f14342(var55)) {
            return f13866(var55);
        }
        return module0217.f14336(var55);
    }
    
    public static SubLObject f13866(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)ZERO_INTEGER;
        final SubLObject var59 = module0158.f10289(var56);
        if (var59.eql((SubLObject)$ic39$)) {
            if (NIL != module0158.f10270(var56, (SubLObject)NIL)) {
                final SubLObject var60 = module0158.f10271(var56);
                SubLObject var61 = (SubLObject)NIL;
                try {
                    var61 = module0158.f10316(var60, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var62 = (SubLObject)NIL;
                    final SubLObject var63 = (SubLObject)NIL;
                    while (NIL == var62) {
                        final SubLObject var64 = module0052.f3695(var61, var63);
                        final SubLObject var65 = (SubLObject)makeBoolean(!var63.eql(var64));
                        if (NIL != var65) {
                            var58 = Numbers.add(var58, (SubLObject)ONE_INTEGER);
                        }
                        var62 = (SubLObject)makeBoolean(NIL == var65);
                    }
                }
                finally {
                    final SubLObject var66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var57);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var57);
                        if (NIL != var61) {
                            module0158.f10319(var61);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var66, var57);
                    }
                }
            }
        }
        else if (var59.eql((SubLObject)$ic40$) && NIL != module0158.f10286(var56, (SubLObject)NIL)) {
            final SubLObject var67 = assertion_handles_oc.f11010();
            final SubLObject var68 = (SubLObject)$ic41$;
            final SubLObject var69 = module0065.f4733(var67);
            SubLObject var70 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var68) : var68;
            final SubLObject var71 = module0012.$g75$.currentBinding(var57);
            final SubLObject var72 = module0012.$g76$.currentBinding(var57);
            final SubLObject var73 = module0012.$g77$.currentBinding(var57);
            final SubLObject var74 = module0012.$g78$.currentBinding(var57);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var57);
                module0012.$g76$.bind((SubLObject)NIL, var57);
                module0012.$g77$.bind((SubLObject)T, var57);
                module0012.$g78$.bind(Time.get_universal_time(), var57);
                module0012.f478(var68);
                final SubLObject var63_64 = var67;
                if (NIL == module0065.f4772(var63_64, (SubLObject)$ic43$)) {
                    final SubLObject var65_66 = var63_64;
                    if (NIL == module0065.f4775(var65_66, (SubLObject)$ic43$)) {
                        final SubLObject var75 = module0065.f4740(var65_66);
                        final SubLObject var76 = (SubLObject)NIL;
                        SubLObject var77;
                        SubLObject var78;
                        SubLObject var79;
                        SubLObject var80;
                        for (var77 = Sequences.length(var75), var78 = (SubLObject)NIL, var78 = (SubLObject)ZERO_INTEGER; var78.numL(var77); var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER)) {
                            var79 = ((NIL != var76) ? Numbers.subtract(var77, var78, (SubLObject)ONE_INTEGER) : var78);
                            var80 = Vectors.aref(var75, var79);
                            if (NIL == module0065.f4749(var80) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                                if (NIL != module0065.f4749(var80)) {
                                    var80 = (SubLObject)$ic43$;
                                }
                                module0012.note_percent_progress(var70, var69);
                                var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var80, var56, (SubLObject)NIL, (SubLObject)NIL)) {
                                    var58 = Numbers.add(var58, (SubLObject)ONE_INTEGER);
                                }
                            }
                        }
                    }
                    final SubLObject var72_73 = var63_64;
                    if (NIL == module0065.f4777(var72_73) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        final SubLObject var81 = module0065.f4738(var72_73);
                        SubLObject var82 = module0065.f4739(var72_73);
                        final SubLObject var83 = module0065.f4734(var72_73);
                        final SubLObject var84 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                        while (var82.numL(var83)) {
                            final SubLObject var85 = Hashtables.gethash_without_values(var82, var81, var84);
                            if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var85)) {
                                module0012.note_percent_progress(var70, var69);
                                var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var85, var56, (SubLObject)NIL, (SubLObject)NIL)) {
                                    var58 = Numbers.add(var58, (SubLObject)ONE_INTEGER);
                                }
                            }
                            var82 = Numbers.add(var82, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var74, var57);
                module0012.$g77$.rebind(var73, var57);
                module0012.$g76$.rebind(var72, var57);
                module0012.$g75$.rebind(var71, var57);
            }
        }
        return var58;
    }
    
    public static SubLObject f13867(final SubLObject var55, SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)TEN_INTEGER;
        }
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var80 = module0147.f9540(var55);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var78);
        final SubLObject var82 = module0147.$g2094$.currentBinding(var78);
        final SubLObject var83 = module0147.$g2096$.currentBinding(var78);
        try {
            module0147.$g2095$.bind(module0147.f9545(var80), var78);
            module0147.$g2094$.bind(module0147.f9546(var80), var78);
            module0147.$g2096$.bind(module0147.f9549(var80), var78);
            final SubLObject var84 = $ic29$;
            final SubLObject var20_81 = module0137.$g1605$.currentBinding(var78);
            final SubLObject var25_82 = module0139.$g1636$.currentBinding(var78);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic44$), var78);
                module0139.$g1636$.bind(module0139.f9007(), var78);
                SubLObject var83_84 = var84;
                final SubLObject var85 = (SubLObject)$ic47$;
                final SubLObject var86 = module0056.f4145(var85);
                final SubLObject var20_82 = module0139.$g1635$.currentBinding(var78);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var78);
                    final SubLObject var87 = (SubLObject)NIL;
                    final SubLObject var20_83 = module0141.$g1714$.currentBinding(var78);
                    final SubLObject var25_83 = module0141.$g1715$.currentBinding(var78);
                    try {
                        module0141.$g1714$.bind((NIL != var87) ? var87 : module0141.f9283(), var78);
                        module0141.$g1715$.bind((SubLObject)((NIL != var87) ? $ic48$ : module0141.$g1715$.getDynamicValue(var78)), var78);
                        if (NIL != var87 && NIL != module0136.f8864() && NIL == module0141.f9279(var87)) {
                            final SubLObject var88 = module0136.$g1591$.getDynamicValue(var78);
                            if (var88.eql((SubLObject)$ic49$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, var87, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var88.eql((SubLObject)$ic52$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic53$, (SubLObject)$ic50$, var87, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var88.eql((SubLObject)$ic54$)) {
                                Errors.warn((SubLObject)$ic50$, var87, (SubLObject)$ic51$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic55$, module0136.$g1591$.getDynamicValue(var78));
                                Errors.cerror((SubLObject)$ic53$, (SubLObject)$ic50$, var87, (SubLObject)$ic51$);
                            }
                        }
                        final SubLObject var20_84 = module0141.$g1670$.currentBinding(var78);
                        final SubLObject var25_84 = module0141.$g1671$.currentBinding(var78);
                        final SubLObject var29_93 = module0141.$g1672$.currentBinding(var78);
                        final SubLObject var89 = module0141.$g1674$.currentBinding(var78);
                        final SubLObject var90 = module0137.$g1605$.currentBinding(var78);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic44$)), var78);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic44$))), var78);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic44$))), var78);
                            module0141.$g1674$.bind((SubLObject)NIL, var78);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic44$)), var78);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var84, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var20_85 = module0141.$g1677$.currentBinding(var78);
                                final SubLObject var25_85 = module0138.$g1619$.currentBinding(var78);
                                final SubLObject var29_94 = module0141.$g1674$.currentBinding(var78);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var78);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic44$))), var78);
                                    module0141.$g1674$.bind((SubLObject)NIL, var78);
                                    module0249.f16055(var83_84, (SubLObject)UNPROVIDED);
                                    while (NIL != var83_84) {
                                        final SubLObject var91 = var83_84;
                                        SubLObject var93;
                                        final SubLObject var92 = var93 = module0200.f12443(module0137.f8955($ic44$));
                                        SubLObject var94 = (SubLObject)NIL;
                                        var94 = var93.first();
                                        while (NIL != var93) {
                                            final SubLObject var20_86 = module0137.$g1605$.currentBinding(var78);
                                            final SubLObject var25_86 = module0141.$g1674$.currentBinding(var78);
                                            try {
                                                module0137.$g1605$.bind(var94, var78);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var78)) : module0141.$g1674$.getDynamicValue(var78)), var78);
                                                final SubLObject var95 = module0228.f15229(var91);
                                                if (NIL != module0138.f8992(var95)) {
                                                    final SubLObject var96 = module0242.f15664(var95, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var96) {
                                                        final SubLObject var97 = module0245.f15834(var96, module0244.f15780(module0137.f8955($ic44$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var97) {
                                                            SubLObject var98;
                                                            for (var98 = module0066.f4838(module0067.f4891(var97)); NIL == module0066.f4841(var98); var98 = module0066.f4840(var98)) {
                                                                var78.resetMultipleValues();
                                                                final SubLObject var107_108 = module0066.f4839(var98);
                                                                final SubLObject var99 = var78.secondMultipleValue();
                                                                var78.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var107_108)) {
                                                                    final SubLObject var20_87 = module0138.$g1623$.currentBinding(var78);
                                                                    try {
                                                                        module0138.$g1623$.bind(var107_108, var78);
                                                                        SubLObject var106_111;
                                                                        for (var106_111 = module0066.f4838(module0067.f4891(var99)); NIL == module0066.f4841(var106_111); var106_111 = module0066.f4840(var106_111)) {
                                                                            var78.resetMultipleValues();
                                                                            final SubLObject var100 = module0066.f4839(var106_111);
                                                                            final SubLObject var101 = var78.secondMultipleValue();
                                                                            var78.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var100)) {
                                                                                final SubLObject var20_88 = module0138.$g1624$.currentBinding(var78);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var100, var78);
                                                                                    final SubLObject var102 = var101;
                                                                                    if (NIL != module0077.f5302(var102)) {
                                                                                        final SubLObject var103 = module0077.f5333(var102);
                                                                                        SubLObject var104;
                                                                                        SubLObject var105;
                                                                                        SubLObject var106;
                                                                                        SubLObject var107;
                                                                                        for (var104 = module0032.f1741(var103), var105 = (SubLObject)NIL, var105 = module0032.f1742(var104, var103); NIL == module0032.f1744(var104, var105); var105 = module0032.f1743(var105)) {
                                                                                            var106 = module0032.f1745(var104, var105);
                                                                                            if (NIL != module0032.f1746(var105, var106) && NIL == module0249.f16059(var106, module0139.$g1636$.getDynamicValue(var78))) {
                                                                                                module0249.f16055(var106, module0139.$g1636$.getDynamicValue(var78));
                                                                                                if (NIL != module0173.f10955(var106)) {
                                                                                                    var107 = module0217.f14249(var106);
                                                                                                    if (var107.isPositive()) {
                                                                                                        module0067.f4886(var79, var106, var107);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var102.isList()) {
                                                                                        SubLObject var108 = var102;
                                                                                        SubLObject var109 = (SubLObject)NIL;
                                                                                        var109 = var108.first();
                                                                                        while (NIL != var108) {
                                                                                            if (NIL == module0249.f16059(var109, module0139.$g1636$.getDynamicValue(var78))) {
                                                                                                module0249.f16055(var109, module0139.$g1636$.getDynamicValue(var78));
                                                                                                if (NIL != module0173.f10955(var109)) {
                                                                                                    final SubLObject var110 = module0217.f14249(var109);
                                                                                                    if (var110.isPositive()) {
                                                                                                        module0067.f4886(var79, var109, var110);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var108 = var108.rest();
                                                                                            var109 = var108.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic56$, var102);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var20_88, var78);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var106_111);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var20_87, var78);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var98);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var95, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var111 = module0248.f15995(var95);
                                                        SubLObject var112 = (SubLObject)NIL;
                                                        var112 = var111.first();
                                                        while (NIL != var111) {
                                                            SubLObject var114;
                                                            final SubLObject var113 = var114 = var112;
                                                            SubLObject var115 = (SubLObject)NIL;
                                                            SubLObject var123_124 = (SubLObject)NIL;
                                                            SubLObject var116 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic58$);
                                                            var115 = var114.first();
                                                            var114 = var114.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic58$);
                                                            var123_124 = var114.first();
                                                            var114 = var114.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic58$);
                                                            var116 = var114.first();
                                                            var114 = var114.rest();
                                                            if (NIL == var114) {
                                                                if (NIL != module0147.f9507(var123_124)) {
                                                                    final SubLObject var20_89 = module0138.$g1623$.currentBinding(var78);
                                                                    try {
                                                                        module0138.$g1623$.bind(var123_124, var78);
                                                                        if (NIL != module0141.f9289(var116)) {
                                                                            final SubLObject var20_90 = module0138.$g1624$.currentBinding(var78);
                                                                            try {
                                                                                module0138.$g1624$.bind(var116, var78);
                                                                                final SubLObject var102;
                                                                                final SubLObject var117 = var102 = (SubLObject)ConsesLow.list(var115);
                                                                                if (NIL != module0077.f5302(var102)) {
                                                                                    final SubLObject var103 = module0077.f5333(var102);
                                                                                    SubLObject var104;
                                                                                    SubLObject var105;
                                                                                    SubLObject var106;
                                                                                    SubLObject var107;
                                                                                    for (var104 = module0032.f1741(var103), var105 = (SubLObject)NIL, var105 = module0032.f1742(var104, var103); NIL == module0032.f1744(var104, var105); var105 = module0032.f1743(var105)) {
                                                                                        var106 = module0032.f1745(var104, var105);
                                                                                        if (NIL != module0032.f1746(var105, var106) && NIL == module0249.f16059(var106, module0139.$g1636$.getDynamicValue(var78))) {
                                                                                            module0249.f16055(var106, module0139.$g1636$.getDynamicValue(var78));
                                                                                            if (NIL != module0173.f10955(var106)) {
                                                                                                var107 = module0217.f14249(var106);
                                                                                                if (var107.isPositive()) {
                                                                                                    module0067.f4886(var79, var106, var107);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var102.isList()) {
                                                                                    SubLObject var31_128 = var102;
                                                                                    SubLObject var109 = (SubLObject)NIL;
                                                                                    var109 = var31_128.first();
                                                                                    while (NIL != var31_128) {
                                                                                        if (NIL == module0249.f16059(var109, module0139.$g1636$.getDynamicValue(var78))) {
                                                                                            module0249.f16055(var109, module0139.$g1636$.getDynamicValue(var78));
                                                                                            if (NIL != module0173.f10955(var109)) {
                                                                                                final SubLObject var110 = module0217.f14249(var109);
                                                                                                if (var110.isPositive()) {
                                                                                                    module0067.f4886(var79, var109, var110);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var31_128 = var31_128.rest();
                                                                                        var109 = var31_128.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic56$, var102);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var20_90, var78);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var20_89, var78);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)$ic58$);
                                                            }
                                                            var111 = var111.rest();
                                                            var112 = var111.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var95, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var99_130;
                                                    final SubLObject var118 = var99_130 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic44$)), module0141.$g1714$.getDynamicValue(var78), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic44$)), module0141.$g1714$.getDynamicValue(var78), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var119 = (SubLObject)NIL;
                                                    var119 = var99_130.first();
                                                    while (NIL != var99_130) {
                                                        final SubLObject var20_91 = module0138.$g1625$.currentBinding(var78);
                                                        try {
                                                            module0138.$g1625$.bind(var119, var78);
                                                            final SubLObject var121;
                                                            final SubLObject var120 = var121 = Functions.funcall(var119, var95);
                                                            if (NIL != module0077.f5302(var121)) {
                                                                final SubLObject var122 = module0077.f5333(var121);
                                                                SubLObject var123;
                                                                SubLObject var124;
                                                                SubLObject var125;
                                                                SubLObject var126;
                                                                for (var123 = module0032.f1741(var122), var124 = (SubLObject)NIL, var124 = module0032.f1742(var123, var122); NIL == module0032.f1744(var123, var124); var124 = module0032.f1743(var124)) {
                                                                    var125 = module0032.f1745(var123, var124);
                                                                    if (NIL != module0032.f1746(var124, var125) && NIL == module0249.f16059(var125, module0139.$g1636$.getDynamicValue(var78))) {
                                                                        module0249.f16055(var125, module0139.$g1636$.getDynamicValue(var78));
                                                                        if (NIL != module0173.f10955(var125)) {
                                                                            var126 = module0217.f14249(var125);
                                                                            if (var126.isPositive()) {
                                                                                module0067.f4886(var79, var125, var126);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var121.isList()) {
                                                                SubLObject var127 = var121;
                                                                SubLObject var128 = (SubLObject)NIL;
                                                                var128 = var127.first();
                                                                while (NIL != var127) {
                                                                    if (NIL == module0249.f16059(var128, module0139.$g1636$.getDynamicValue(var78))) {
                                                                        module0249.f16055(var128, module0139.$g1636$.getDynamicValue(var78));
                                                                        if (NIL != module0173.f10955(var128)) {
                                                                            final SubLObject var129 = module0217.f14249(var128);
                                                                            if (var129.isPositive()) {
                                                                                module0067.f4886(var79, var128, var129);
                                                                            }
                                                                        }
                                                                    }
                                                                    var127 = var127.rest();
                                                                    var128 = var127.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic56$, var121);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var20_91, var78);
                                                        }
                                                        var99_130 = var99_130.rest();
                                                        var119 = var99_130.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_86, var78);
                                                module0137.$g1605$.rebind(var20_86, var78);
                                            }
                                            var93 = var93.rest();
                                            var94 = var93.first();
                                        }
                                        SubLObject var131;
                                        final SubLObject var130 = var131 = module0200.f12443(module0244.f15771(module0137.f8955($ic44$)));
                                        SubLObject var132 = (SubLObject)NIL;
                                        var132 = var131.first();
                                        while (NIL != var131) {
                                            final SubLObject var20_92 = module0137.$g1605$.currentBinding(var78);
                                            final SubLObject var25_87 = module0141.$g1674$.currentBinding(var78);
                                            try {
                                                module0137.$g1605$.bind(var132, var78);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var78)) : module0141.$g1674$.getDynamicValue(var78)), var78);
                                                final SubLObject var133 = module0228.f15229(var83_84);
                                                if (NIL != module0138.f8992(var133)) {
                                                    final SubLObject var134 = module0242.f15664(var133, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var134) {
                                                        final SubLObject var135 = module0245.f15834(var134, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var135) {
                                                            SubLObject var136;
                                                            for (var136 = module0066.f4838(module0067.f4891(var135)); NIL == module0066.f4841(var136); var136 = module0066.f4840(var136)) {
                                                                var78.resetMultipleValues();
                                                                final SubLObject var107_109 = module0066.f4839(var136);
                                                                final SubLObject var137 = var78.secondMultipleValue();
                                                                var78.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var107_109)) {
                                                                    final SubLObject var20_93 = module0138.$g1623$.currentBinding(var78);
                                                                    try {
                                                                        module0138.$g1623$.bind(var107_109, var78);
                                                                        SubLObject var106_112;
                                                                        for (var106_112 = module0066.f4838(module0067.f4891(var137)); NIL == module0066.f4841(var106_112); var106_112 = module0066.f4840(var106_112)) {
                                                                            var78.resetMultipleValues();
                                                                            final SubLObject var138 = module0066.f4839(var106_112);
                                                                            final SubLObject var139 = var78.secondMultipleValue();
                                                                            var78.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var138)) {
                                                                                final SubLObject var20_94 = module0138.$g1624$.currentBinding(var78);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var138, var78);
                                                                                    final SubLObject var140 = var139;
                                                                                    if (NIL != module0077.f5302(var140)) {
                                                                                        final SubLObject var141 = module0077.f5333(var140);
                                                                                        SubLObject var142;
                                                                                        SubLObject var143;
                                                                                        SubLObject var144;
                                                                                        for (var142 = module0032.f1741(var141), var143 = (SubLObject)NIL, var143 = module0032.f1742(var142, var141); NIL == module0032.f1744(var142, var143); var143 = module0032.f1743(var143)) {
                                                                                            var144 = module0032.f1745(var142, var143);
                                                                                            if (NIL != module0032.f1746(var143, var144) && NIL == module0249.f16059(var144, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var144, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var144, var86);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var140.isList()) {
                                                                                        SubLObject var145 = var140;
                                                                                        SubLObject var146 = (SubLObject)NIL;
                                                                                        var146 = var145.first();
                                                                                        while (NIL != var145) {
                                                                                            if (NIL == module0249.f16059(var146, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var146, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var146, var86);
                                                                                            }
                                                                                            var145 = var145.rest();
                                                                                            var146 = var145.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic56$, var140);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var20_94, var78);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var106_112);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var20_93, var78);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var136);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var133, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var99_131;
                                                    final SubLObject var147 = var99_131 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var78), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var78), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var148 = (SubLObject)NIL;
                                                    var148 = var99_131.first();
                                                    while (NIL != var99_131) {
                                                        final SubLObject var20_95 = module0138.$g1625$.currentBinding(var78);
                                                        try {
                                                            module0138.$g1625$.bind(var148, var78);
                                                            final SubLObject var150;
                                                            final SubLObject var149 = var150 = Functions.funcall(var148, var133);
                                                            if (NIL != module0077.f5302(var150)) {
                                                                final SubLObject var151 = module0077.f5333(var150);
                                                                SubLObject var152;
                                                                SubLObject var153;
                                                                SubLObject var154;
                                                                for (var152 = module0032.f1741(var151), var153 = (SubLObject)NIL, var153 = module0032.f1742(var152, var151); NIL == module0032.f1744(var152, var153); var153 = module0032.f1743(var153)) {
                                                                    var154 = module0032.f1745(var152, var153);
                                                                    if (NIL != module0032.f1746(var153, var154) && NIL == module0249.f16059(var154, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var154, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var154, var86);
                                                                    }
                                                                }
                                                            }
                                                            else if (var150.isList()) {
                                                                SubLObject var155 = var150;
                                                                SubLObject var156 = (SubLObject)NIL;
                                                                var156 = var155.first();
                                                                while (NIL != var155) {
                                                                    if (NIL == module0249.f16059(var156, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var156, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var156, var86);
                                                                    }
                                                                    var155 = var155.rest();
                                                                    var156 = var155.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic56$, var150);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var20_95, var78);
                                                        }
                                                        var99_131 = var99_131.rest();
                                                        var148 = var99_131.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_87, var78);
                                                module0137.$g1605$.rebind(var20_92, var78);
                                            }
                                            var131 = var131.rest();
                                            var132 = var131.first();
                                        }
                                        var83_84 = module0056.f4150(var86);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var29_94, var78);
                                    module0138.$g1619$.rebind(var25_85, var78);
                                    module0141.$g1677$.rebind(var20_85, var78);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic59$, var84, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var90, var78);
                            module0141.$g1674$.rebind(var89, var78);
                            module0141.$g1672$.rebind(var29_93, var78);
                            module0141.$g1671$.rebind(var25_84, var78);
                            module0141.$g1670$.rebind(var20_84, var78);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var25_83, var78);
                        module0141.$g1714$.rebind(var20_83, var78);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var78));
                }
                finally {
                    module0139.$g1635$.rebind(var20_82, var78);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var78));
            }
            finally {
                module0139.$g1636$.rebind(var25_82, var78);
                module0137.$g1605$.rebind(var20_81, var78);
            }
        }
        finally {
            module0147.$g2096$.rebind(var83, var78);
            module0147.$g2094$.rebind(var82, var78);
            module0147.$g2095$.rebind(var81, var78);
        }
        return module0035.f2124(var77, module0035.f2062(module0084.f5795(var79, Symbols.symbol_function((SubLObject)$ic37$))));
    }
    
    public static SubLObject f13868(final SubLObject var144, SubLObject var77, SubLObject var145) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)TEN_INTEGER;
        }
        if (var145 == UNPROVIDED) {
            var145 = (SubLObject)NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var148 = $ic29$;
        final SubLObject var149 = module0137.$g1605$.currentBinding(var146);
        final SubLObject var150 = module0139.$g1636$.currentBinding(var146);
        try {
            module0137.$g1605$.bind(module0137.f8955($ic44$), var146);
            module0139.$g1636$.bind(module0139.f9007(), var146);
            SubLObject var83_146 = var148;
            final SubLObject var151 = (SubLObject)$ic47$;
            final SubLObject var152 = module0056.f4145(var151);
            final SubLObject var20_147 = module0139.$g1635$.currentBinding(var146);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var146);
                final SubLObject var153 = (SubLObject)NIL;
                final SubLObject var20_148 = module0141.$g1714$.currentBinding(var146);
                final SubLObject var25_149 = module0141.$g1715$.currentBinding(var146);
                try {
                    module0141.$g1714$.bind((NIL != var153) ? var153 : module0141.f9283(), var146);
                    module0141.$g1715$.bind((SubLObject)((NIL != var153) ? $ic48$ : module0141.$g1715$.getDynamicValue(var146)), var146);
                    if (NIL != var153 && NIL != module0136.f8864() && NIL == module0141.f9279(var153)) {
                        final SubLObject var154 = module0136.$g1591$.getDynamicValue(var146);
                        if (var154.eql((SubLObject)$ic49$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic50$, var153, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var154.eql((SubLObject)$ic52$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic53$, (SubLObject)$ic50$, var153, (SubLObject)$ic51$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var154.eql((SubLObject)$ic54$)) {
                            Errors.warn((SubLObject)$ic50$, var153, (SubLObject)$ic51$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic55$, module0136.$g1591$.getDynamicValue(var146));
                            Errors.cerror((SubLObject)$ic53$, (SubLObject)$ic50$, var153, (SubLObject)$ic51$);
                        }
                    }
                    final SubLObject var20_149 = module0141.$g1670$.currentBinding(var146);
                    final SubLObject var25_150 = module0141.$g1671$.currentBinding(var146);
                    final SubLObject var155 = module0141.$g1672$.currentBinding(var146);
                    final SubLObject var156 = module0141.$g1674$.currentBinding(var146);
                    final SubLObject var157 = module0137.$g1605$.currentBinding(var146);
                    try {
                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic44$)), var146);
                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic44$))), var146);
                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic44$))), var146);
                        module0141.$g1674$.bind((SubLObject)NIL, var146);
                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic44$)), var146);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var148, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var20_150 = module0141.$g1677$.currentBinding(var146);
                            final SubLObject var25_151 = module0138.$g1619$.currentBinding(var146);
                            final SubLObject var29_154 = module0141.$g1674$.currentBinding(var146);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var146);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic44$))), var146);
                                module0141.$g1674$.bind((SubLObject)NIL, var146);
                                module0249.f16055(var83_146, (SubLObject)UNPROVIDED);
                                while (NIL != var83_146) {
                                    final SubLObject var158 = var83_146;
                                    SubLObject var160;
                                    final SubLObject var159 = var160 = module0200.f12443(module0137.f8955($ic44$));
                                    SubLObject var161 = (SubLObject)NIL;
                                    var161 = var160.first();
                                    while (NIL != var160) {
                                        final SubLObject var20_151 = module0137.$g1605$.currentBinding(var146);
                                        final SubLObject var25_152 = module0141.$g1674$.currentBinding(var146);
                                        try {
                                            module0137.$g1605$.bind(var161, var146);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var146)) : module0141.$g1674$.getDynamicValue(var146)), var146);
                                            final SubLObject var162 = module0228.f15229(var158);
                                            if (NIL != module0138.f8992(var162)) {
                                                final SubLObject var163 = module0242.f15664(var162, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var163) {
                                                    final SubLObject var164 = module0245.f15834(var163, module0244.f15780(module0137.f8955($ic44$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var164) {
                                                        SubLObject var165;
                                                        for (var165 = module0066.f4838(module0067.f4891(var164)); NIL == module0066.f4841(var165); var165 = module0066.f4840(var165)) {
                                                            var146.resetMultipleValues();
                                                            final SubLObject var166 = module0066.f4839(var165);
                                                            final SubLObject var167 = var146.secondMultipleValue();
                                                            var146.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var166)) {
                                                                final SubLObject var20_152 = module0138.$g1623$.currentBinding(var146);
                                                                try {
                                                                    module0138.$g1623$.bind(var166, var146);
                                                                    SubLObject var106_158;
                                                                    for (var106_158 = module0066.f4838(module0067.f4891(var167)); NIL == module0066.f4841(var106_158); var106_158 = module0066.f4840(var106_158)) {
                                                                        var146.resetMultipleValues();
                                                                        final SubLObject var168 = module0066.f4839(var106_158);
                                                                        final SubLObject var169 = var146.secondMultipleValue();
                                                                        var146.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var168)) {
                                                                            final SubLObject var20_153 = module0138.$g1624$.currentBinding(var146);
                                                                            try {
                                                                                module0138.$g1624$.bind(var168, var146);
                                                                                final SubLObject var170 = var169;
                                                                                if (NIL != module0077.f5302(var170)) {
                                                                                    final SubLObject var171 = module0077.f5333(var170);
                                                                                    SubLObject var172;
                                                                                    SubLObject var173;
                                                                                    SubLObject var174;
                                                                                    SubLObject var20_154;
                                                                                    SubLObject var25_153;
                                                                                    SubLObject var175;
                                                                                    for (var172 = module0032.f1741(var171), var173 = (SubLObject)NIL, var173 = module0032.f1742(var172, var171); NIL == module0032.f1744(var172, var173); var173 = module0032.f1743(var173)) {
                                                                                        var174 = module0032.f1745(var172, var173);
                                                                                        if (NIL != module0032.f1746(var173, var174) && NIL == module0249.f16059(var174, module0139.$g1636$.getDynamicValue(var146))) {
                                                                                            module0249.f16055(var174, module0139.$g1636$.getDynamicValue(var146));
                                                                                            if (NIL != module0173.f10955(var174)) {
                                                                                                var20_154 = module0147.$g2094$.currentBinding(var146);
                                                                                                var25_153 = module0147.$g2096$.currentBinding(var146);
                                                                                                try {
                                                                                                    module0147.$g2094$.bind((SubLObject)$ic60$, var146);
                                                                                                    module0147.$g2096$.bind(var144, var146);
                                                                                                    var175 = module0217.f14249(var174);
                                                                                                    if (var175.isPositive()) {
                                                                                                        module0067.f4886(var147, var174, var175);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0147.$g2096$.rebind(var25_153, var146);
                                                                                                    module0147.$g2094$.rebind(var20_154, var146);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var170.isList()) {
                                                                                    SubLObject var176 = var170;
                                                                                    SubLObject var177 = (SubLObject)NIL;
                                                                                    var177 = var176.first();
                                                                                    while (NIL != var176) {
                                                                                        if (NIL == module0249.f16059(var177, module0139.$g1636$.getDynamicValue(var146))) {
                                                                                            module0249.f16055(var177, module0139.$g1636$.getDynamicValue(var146));
                                                                                            if (NIL != module0173.f10955(var177)) {
                                                                                                final SubLObject var20_155 = module0147.$g2094$.currentBinding(var146);
                                                                                                final SubLObject var25_154 = module0147.$g2096$.currentBinding(var146);
                                                                                                try {
                                                                                                    module0147.$g2094$.bind((SubLObject)$ic60$, var146);
                                                                                                    module0147.$g2096$.bind(var144, var146);
                                                                                                    final SubLObject var178 = module0217.f14249(var177);
                                                                                                    if (var178.isPositive()) {
                                                                                                        module0067.f4886(var147, var177, var178);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0147.$g2096$.rebind(var25_154, var146);
                                                                                                    module0147.$g2094$.rebind(var20_155, var146);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var176 = var176.rest();
                                                                                        var177 = var176.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic56$, var170);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var20_153, var146);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var106_158);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var20_152, var146);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var165);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != module0200.f12419(var162, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                    SubLObject var179 = module0248.f15995(var162);
                                                    SubLObject var180 = (SubLObject)NIL;
                                                    var180 = var179.first();
                                                    while (NIL != var179) {
                                                        SubLObject var182;
                                                        final SubLObject var181 = var182 = var180;
                                                        SubLObject var183 = (SubLObject)NIL;
                                                        SubLObject var184 = (SubLObject)NIL;
                                                        SubLObject var185 = (SubLObject)NIL;
                                                        cdestructuring_bind.destructuring_bind_must_consp(var182, var181, (SubLObject)$ic58$);
                                                        var183 = var182.first();
                                                        var182 = var182.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var182, var181, (SubLObject)$ic58$);
                                                        var184 = var182.first();
                                                        var182 = var182.rest();
                                                        cdestructuring_bind.destructuring_bind_must_consp(var182, var181, (SubLObject)$ic58$);
                                                        var185 = var182.first();
                                                        var182 = var182.rest();
                                                        if (NIL == var182) {
                                                            if (NIL != module0147.f9507(var184)) {
                                                                final SubLObject var20_156 = module0138.$g1623$.currentBinding(var146);
                                                                try {
                                                                    module0138.$g1623$.bind(var184, var146);
                                                                    if (NIL != module0141.f9289(var185)) {
                                                                        final SubLObject var20_157 = module0138.$g1624$.currentBinding(var146);
                                                                        try {
                                                                            module0138.$g1624$.bind(var185, var146);
                                                                            final SubLObject var170;
                                                                            final SubLObject var186 = var170 = (SubLObject)ConsesLow.list(var183);
                                                                            if (NIL != module0077.f5302(var170)) {
                                                                                final SubLObject var171 = module0077.f5333(var170);
                                                                                SubLObject var172;
                                                                                SubLObject var173;
                                                                                SubLObject var174;
                                                                                SubLObject var175;
                                                                                SubLObject var20_158;
                                                                                SubLObject var25_155;
                                                                                for (var172 = module0032.f1741(var171), var173 = (SubLObject)NIL, var173 = module0032.f1742(var172, var171); NIL == module0032.f1744(var172, var173); var173 = module0032.f1743(var173)) {
                                                                                    var174 = module0032.f1745(var172, var173);
                                                                                    if (NIL != module0032.f1746(var173, var174) && NIL == module0249.f16059(var174, module0139.$g1636$.getDynamicValue(var146))) {
                                                                                        module0249.f16055(var174, module0139.$g1636$.getDynamicValue(var146));
                                                                                        if (NIL != module0173.f10955(var174)) {
                                                                                            var20_158 = module0147.$g2094$.currentBinding(var146);
                                                                                            var25_155 = module0147.$g2096$.currentBinding(var146);
                                                                                            try {
                                                                                                module0147.$g2094$.bind((SubLObject)$ic60$, var146);
                                                                                                module0147.$g2096$.bind(var144, var146);
                                                                                                var175 = module0217.f14249(var174);
                                                                                                if (var175.isPositive()) {
                                                                                                    module0067.f4886(var147, var174, var175);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0147.$g2096$.rebind(var25_155, var146);
                                                                                                module0147.$g2094$.rebind(var20_158, var146);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var170.isList()) {
                                                                                SubLObject var31_170 = var170;
                                                                                SubLObject var177 = (SubLObject)NIL;
                                                                                var177 = var31_170.first();
                                                                                while (NIL != var31_170) {
                                                                                    if (NIL == module0249.f16059(var177, module0139.$g1636$.getDynamicValue(var146))) {
                                                                                        module0249.f16055(var177, module0139.$g1636$.getDynamicValue(var146));
                                                                                        if (NIL != module0173.f10955(var177)) {
                                                                                            final SubLObject var20_159 = module0147.$g2094$.currentBinding(var146);
                                                                                            final SubLObject var25_156 = module0147.$g2096$.currentBinding(var146);
                                                                                            try {
                                                                                                module0147.$g2094$.bind((SubLObject)$ic60$, var146);
                                                                                                module0147.$g2096$.bind(var144, var146);
                                                                                                final SubLObject var178 = module0217.f14249(var177);
                                                                                                if (var178.isPositive()) {
                                                                                                    module0067.f4886(var147, var177, var178);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0147.$g2096$.rebind(var25_156, var146);
                                                                                                module0147.$g2094$.rebind(var20_159, var146);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var31_170 = var31_170.rest();
                                                                                    var177 = var31_170.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic56$, var170);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var20_157, var146);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var20_156, var146);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            cdestructuring_bind.cdestructuring_bind_error(var181, (SubLObject)$ic58$);
                                                        }
                                                        var179 = var179.rest();
                                                        var180 = var179.first();
                                                    }
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var162, (SubLObject)UNPROVIDED)) {
                                                SubLObject var99_173;
                                                final SubLObject var187 = var99_173 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic44$)), module0141.$g1714$.getDynamicValue(var146), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic44$)), module0141.$g1714$.getDynamicValue(var146), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var188 = (SubLObject)NIL;
                                                var188 = var99_173.first();
                                                while (NIL != var99_173) {
                                                    final SubLObject var20_160 = module0138.$g1625$.currentBinding(var146);
                                                    try {
                                                        module0138.$g1625$.bind(var188, var146);
                                                        final SubLObject var190;
                                                        final SubLObject var189 = var190 = Functions.funcall(var188, var162);
                                                        if (NIL != module0077.f5302(var190)) {
                                                            final SubLObject var191 = module0077.f5333(var190);
                                                            SubLObject var192;
                                                            SubLObject var193;
                                                            SubLObject var194;
                                                            SubLObject var20_161;
                                                            SubLObject var25_157;
                                                            SubLObject var195;
                                                            for (var192 = module0032.f1741(var191), var193 = (SubLObject)NIL, var193 = module0032.f1742(var192, var191); NIL == module0032.f1744(var192, var193); var193 = module0032.f1743(var193)) {
                                                                var194 = module0032.f1745(var192, var193);
                                                                if (NIL != module0032.f1746(var193, var194) && NIL == module0249.f16059(var194, module0139.$g1636$.getDynamicValue(var146))) {
                                                                    module0249.f16055(var194, module0139.$g1636$.getDynamicValue(var146));
                                                                    if (NIL != module0173.f10955(var194)) {
                                                                        var20_161 = module0147.$g2094$.currentBinding(var146);
                                                                        var25_157 = module0147.$g2096$.currentBinding(var146);
                                                                        try {
                                                                            module0147.$g2094$.bind((SubLObject)$ic60$, var146);
                                                                            module0147.$g2096$.bind(var144, var146);
                                                                            var195 = module0217.f14249(var194);
                                                                            if (var195.isPositive()) {
                                                                                module0067.f4886(var147, var194, var195);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0147.$g2096$.rebind(var25_157, var146);
                                                                            module0147.$g2094$.rebind(var20_161, var146);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else if (var190.isList()) {
                                                            SubLObject var196 = var190;
                                                            SubLObject var197 = (SubLObject)NIL;
                                                            var197 = var196.first();
                                                            while (NIL != var196) {
                                                                if (NIL == module0249.f16059(var197, module0139.$g1636$.getDynamicValue(var146))) {
                                                                    module0249.f16055(var197, module0139.$g1636$.getDynamicValue(var146));
                                                                    if (NIL != module0173.f10955(var197)) {
                                                                        final SubLObject var20_162 = module0147.$g2094$.currentBinding(var146);
                                                                        final SubLObject var25_158 = module0147.$g2096$.currentBinding(var146);
                                                                        try {
                                                                            module0147.$g2094$.bind((SubLObject)$ic60$, var146);
                                                                            module0147.$g2096$.bind(var144, var146);
                                                                            final SubLObject var198 = module0217.f14249(var197);
                                                                            if (var198.isPositive()) {
                                                                                module0067.f4886(var147, var197, var198);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0147.$g2096$.rebind(var25_158, var146);
                                                                            module0147.$g2094$.rebind(var20_162, var146);
                                                                        }
                                                                    }
                                                                }
                                                                var196 = var196.rest();
                                                                var197 = var196.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic56$, var190);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var20_160, var146);
                                                    }
                                                    var99_173 = var99_173.rest();
                                                    var188 = var99_173.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var25_152, var146);
                                            module0137.$g1605$.rebind(var20_151, var146);
                                        }
                                        var160 = var160.rest();
                                        var161 = var160.first();
                                    }
                                    SubLObject var200;
                                    final SubLObject var199 = var200 = module0200.f12443(module0244.f15771(module0137.f8955($ic44$)));
                                    SubLObject var201 = (SubLObject)NIL;
                                    var201 = var200.first();
                                    while (NIL != var200) {
                                        final SubLObject var20_163 = module0137.$g1605$.currentBinding(var146);
                                        final SubLObject var25_159 = module0141.$g1674$.currentBinding(var146);
                                        try {
                                            module0137.$g1605$.bind(var201, var146);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var146)) : module0141.$g1674$.getDynamicValue(var146)), var146);
                                            final SubLObject var202 = module0228.f15229(var83_146);
                                            if (NIL != module0138.f8992(var202)) {
                                                final SubLObject var203 = module0242.f15664(var202, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var203) {
                                                    final SubLObject var204 = module0245.f15834(var203, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var204) {
                                                        SubLObject var205;
                                                        for (var205 = module0066.f4838(module0067.f4891(var204)); NIL == module0066.f4841(var205); var205 = module0066.f4840(var205)) {
                                                            var146.resetMultipleValues();
                                                            final SubLObject var206 = module0066.f4839(var205);
                                                            final SubLObject var207 = var146.secondMultipleValue();
                                                            var146.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var206)) {
                                                                final SubLObject var20_164 = module0138.$g1623$.currentBinding(var146);
                                                                try {
                                                                    module0138.$g1623$.bind(var206, var146);
                                                                    SubLObject var106_159;
                                                                    for (var106_159 = module0066.f4838(module0067.f4891(var207)); NIL == module0066.f4841(var106_159); var106_159 = module0066.f4840(var106_159)) {
                                                                        var146.resetMultipleValues();
                                                                        final SubLObject var208 = module0066.f4839(var106_159);
                                                                        final SubLObject var209 = var146.secondMultipleValue();
                                                                        var146.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var208)) {
                                                                            final SubLObject var20_165 = module0138.$g1624$.currentBinding(var146);
                                                                            try {
                                                                                module0138.$g1624$.bind(var208, var146);
                                                                                final SubLObject var210 = var209;
                                                                                if (NIL != module0077.f5302(var210)) {
                                                                                    final SubLObject var211 = module0077.f5333(var210);
                                                                                    SubLObject var212;
                                                                                    SubLObject var213;
                                                                                    SubLObject var214;
                                                                                    for (var212 = module0032.f1741(var211), var213 = (SubLObject)NIL, var213 = module0032.f1742(var212, var211); NIL == module0032.f1744(var212, var213); var213 = module0032.f1743(var213)) {
                                                                                        var214 = module0032.f1745(var212, var213);
                                                                                        if (NIL != module0032.f1746(var213, var214) && NIL == module0249.f16059(var214, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var214, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var214, var152);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var210.isList()) {
                                                                                    SubLObject var215 = var210;
                                                                                    SubLObject var216 = (SubLObject)NIL;
                                                                                    var216 = var215.first();
                                                                                    while (NIL != var215) {
                                                                                        if (NIL == module0249.f16059(var216, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var216, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var216, var152);
                                                                                        }
                                                                                        var215 = var215.rest();
                                                                                        var216 = var215.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic56$, var210);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var20_165, var146);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var106_159);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var20_164, var146);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var205);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var202, (SubLObject)UNPROVIDED)) {
                                                SubLObject var99_174;
                                                final SubLObject var217 = var99_174 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var146), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var146), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var218 = (SubLObject)NIL;
                                                var218 = var99_174.first();
                                                while (NIL != var99_174) {
                                                    final SubLObject var20_166 = module0138.$g1625$.currentBinding(var146);
                                                    try {
                                                        module0138.$g1625$.bind(var218, var146);
                                                        final SubLObject var220;
                                                        final SubLObject var219 = var220 = Functions.funcall(var218, var202);
                                                        if (NIL != module0077.f5302(var220)) {
                                                            final SubLObject var221 = module0077.f5333(var220);
                                                            SubLObject var222;
                                                            SubLObject var223;
                                                            SubLObject var224;
                                                            for (var222 = module0032.f1741(var221), var223 = (SubLObject)NIL, var223 = module0032.f1742(var222, var221); NIL == module0032.f1744(var222, var223); var223 = module0032.f1743(var223)) {
                                                                var224 = module0032.f1745(var222, var223);
                                                                if (NIL != module0032.f1746(var223, var224) && NIL == module0249.f16059(var224, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var224, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var224, var152);
                                                                }
                                                            }
                                                        }
                                                        else if (var220.isList()) {
                                                            SubLObject var225 = var220;
                                                            SubLObject var226 = (SubLObject)NIL;
                                                            var226 = var225.first();
                                                            while (NIL != var225) {
                                                                if (NIL == module0249.f16059(var226, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var226, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var226, var152);
                                                                }
                                                                var225 = var225.rest();
                                                                var226 = var225.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic56$, var220);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var20_166, var146);
                                                    }
                                                    var99_174 = var99_174.rest();
                                                    var218 = var99_174.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var25_159, var146);
                                            module0137.$g1605$.rebind(var20_163, var146);
                                        }
                                        var200 = var200.rest();
                                        var201 = var200.first();
                                    }
                                    var83_146 = module0056.f4150(var152);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var29_154, var146);
                                module0138.$g1619$.rebind(var25_151, var146);
                                module0141.$g1677$.rebind(var20_150, var146);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic59$, var148, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var157, var146);
                        module0141.$g1674$.rebind(var156, var146);
                        module0141.$g1672$.rebind(var155, var146);
                        module0141.$g1671$.rebind(var25_150, var146);
                        module0141.$g1670$.rebind(var20_149, var146);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var25_149, var146);
                    module0141.$g1714$.rebind(var20_148, var146);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var146));
            }
            finally {
                module0139.$g1635$.rebind(var20_147, var146);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var146));
        }
        finally {
            module0139.$g1636$.rebind(var150, var146);
            module0137.$g1605$.rebind(var149, var146);
        }
        final SubLObject var227 = module0084.f5795(var147, Symbols.symbol_function((SubLObject)$ic37$));
        final SubLObject var228 = (NIL != var145) ? var227 : module0035.f2062(var227);
        return module0035.f2124(var77, var228);
    }
    
    public static SubLObject f13869(final SubLObject var55, SubLObject var77, SubLObject var188) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)TEN_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = (SubLObject)NIL;
        }
        final SubLObject var189 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        if (NIL != module0158.f10270(var55, (SubLObject)NIL)) {
            final SubLObject var190 = module0158.f10271(var55);
            SubLObject var191 = (SubLObject)NIL;
            try {
                var191 = module0158.f10316(var190, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var192 = (SubLObject)NIL;
                final SubLObject var193 = (SubLObject)NIL;
                while (NIL == var192) {
                    final SubLObject var194 = module0052.f3695(var191, var193);
                    final SubLObject var195 = (SubLObject)makeBoolean(!var193.eql(var194));
                    if (NIL != var195 && NIL != module0178.f11284(var194)) {
                        final SubLObject var196 = module0178.f11332(var194);
                        module0084.f5775(var189, var196, (SubLObject)ONE_INTEGER);
                    }
                    var192 = (SubLObject)makeBoolean(NIL == var195);
                }
            }
            finally {
                final SubLObject var197 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (NIL != var191) {
                        module0158.f10319(var191);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var197);
                }
            }
        }
        if (NIL == var188) {
            return module0035.f2124(var77, module0035.f2062(module0084.f5795(var189, Symbols.symbol_function((SubLObject)$ic37$))));
        }
        final SubLObject var198 = module0035.f2062(module0084.f5795(var189, Symbols.symbol_function((SubLObject)$ic37$)));
        SubLObject var199 = (SubLObject)ZERO_INTEGER;
        SubLObject var200 = (SubLObject)NIL;
        SubLObject var201 = var198;
        SubLObject var202 = (SubLObject)NIL;
        var202 = var201.first();
        while (NIL != var201) {
            if (NIL == Eval.eval((SubLObject)ConsesLow.list(var188, var202))) {
                var199 = Numbers.add(var199, (SubLObject)ONE_INTEGER);
                var200 = (SubLObject)ConsesLow.cons(var202, var200);
                if (var199.numGE(var77)) {
                    return Sequences.nreverse(var200);
                }
            }
            var201 = var201.rest();
            var202 = var201.first();
        }
        return Sequences.nreverse(var200);
    }
    
    public static SubLObject f13870(final SubLObject var144, SubLObject var77, SubLObject var145) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)TEN_INTEGER;
        }
        if (var145 == UNPROVIDED) {
            var145 = (SubLObject)NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var148 = module0147.$g2094$.currentBinding(var146);
        final SubLObject var149 = module0147.$g2096$.currentBinding(var146);
        try {
            module0147.$g2094$.bind((SubLObject)$ic60$, var146);
            module0147.$g2096$.bind(var144, var146);
            final SubLObject var150 = $ic44$;
            if (NIL != module0158.f10038(var150)) {
                final SubLObject var151 = (SubLObject)NIL;
                final SubLObject var20_193 = module0012.$g73$.currentBinding(var146);
                final SubLObject var25_194 = module0012.$g65$.currentBinding(var146);
                final SubLObject var152 = module0012.$g67$.currentBinding(var146);
                final SubLObject var153 = module0012.$g68$.currentBinding(var146);
                final SubLObject var154 = module0012.$g66$.currentBinding(var146);
                final SubLObject var155 = module0012.$g69$.currentBinding(var146);
                final SubLObject var156 = module0012.$g70$.currentBinding(var146);
                final SubLObject var157 = module0012.$silent_progressP$.currentBinding(var146);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var146);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var146), var146);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var146);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var146);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var146);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var146);
                    module0012.$g70$.bind((SubLObject)T, var146);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var151) ? module0012.$silent_progressP$.getDynamicValue(var146) : T), var146);
                    module0012.f474(var151);
                    final SubLObject var158 = module0158.f10039(var150);
                    SubLObject var159 = (SubLObject)NIL;
                    final SubLObject var160 = (SubLObject)NIL;
                    while (NIL == var159) {
                        final SubLObject var161 = module0052.f3695(var158, var160);
                        final SubLObject var162 = (SubLObject)makeBoolean(!var160.eql(var161));
                        if (NIL != var162) {
                            module0012.f476();
                            SubLObject var163 = (SubLObject)NIL;
                            try {
                                var163 = module0158.f10316(var161, (SubLObject)$ic36$, (SubLObject)$ic61$, (SubLObject)NIL);
                                SubLObject var45_195 = (SubLObject)NIL;
                                final SubLObject var46_196 = (SubLObject)NIL;
                                while (NIL == var45_195) {
                                    final SubLObject var164 = module0052.f3695(var163, var46_196);
                                    final SubLObject var48_198 = (SubLObject)makeBoolean(!var46_196.eql(var164));
                                    if (NIL != var48_198) {
                                        final SubLObject var165 = module0178.f11335(var164);
                                        module0084.f5775(var147, var165, (SubLObject)UNPROVIDED);
                                    }
                                    var45_195 = (SubLObject)makeBoolean(NIL == var48_198);
                                }
                            }
                            finally {
                                final SubLObject var20_194 = Threads.$is_thread_performing_cleanupP$.currentBinding(var146);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var146);
                                    if (NIL != var163) {
                                        module0158.f10319(var163);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var20_194, var146);
                                }
                            }
                        }
                        var159 = (SubLObject)makeBoolean(NIL == var162);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var157, var146);
                    module0012.$g70$.rebind(var156, var146);
                    module0012.$g69$.rebind(var155, var146);
                    module0012.$g66$.rebind(var154, var146);
                    module0012.$g68$.rebind(var153, var146);
                    module0012.$g67$.rebind(var152, var146);
                    module0012.$g65$.rebind(var25_194, var146);
                    module0012.$g73$.rebind(var20_193, var146);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var149, var146);
            module0147.$g2094$.rebind(var148, var146);
        }
        final SubLObject var166 = module0084.f5795(var147, Symbols.symbol_function((SubLObject)$ic37$));
        final SubLObject var167 = (NIL != var145) ? var166 : module0035.f2062(var166);
        return module0035.f2124(var77, var167);
    }
    
    public static SubLObject f13871(final SubLObject var201, final SubLObject var202, final SubLObject var203, final SubLObject var204) {
        final SubLObject var205 = module0064.f4671((SubLObject)UNPROVIDED);
        module0064.f4666(var205, var202);
        module0064.f4667(var205, Symbols.symbol_function((SubLObject)$ic62$));
        module0064.f4668(var205, Symbols.symbol_function((SubLObject)$ic63$));
        module0064.f4669(var205, var203);
        module0064.f4670(var205, var204);
        return module0064.f4688(var201, var205);
    }
    
    public static SubLObject f13872() {
        return $g2346$.getGlobalValue();
    }
    
    public static SubLObject f13873() {
        return $g2347$.getGlobalValue();
    }
    
    public static SubLObject f13874() {
        return $g2348$.getGlobalValue();
    }
    
    public static SubLObject f13875() {
        return $g2349$.getGlobalValue();
    }
    
    public static SubLObject f13876() {
        return $g2350$.getGlobalValue();
    }
    
    public static SubLObject f13877() {
        return $g2351$.getGlobalValue();
    }
    
    public static SubLObject f13878() {
        return $g2352$.getGlobalValue();
    }
    
    public static SubLObject f13879() {
        return $g2353$.getGlobalValue();
    }
    
    public static SubLObject f13880() {
        return Numbers.multiply(f13874(), f13879());
    }
    
    public static SubLObject f13881(final SubLObject var3) {
        final SubLObject var4 = Numbers.truncate(Numbers.divide(var3, $g2347$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var5 = Numbers.truncate(Numbers.multiply(var3, $g2346$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var6 = Numbers.truncate(Numbers.divide(var5, $g2348$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var7 = Numbers.truncate(Numbers.divide(var6, $g2353$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var8 = Numbers.truncate(Numbers.divide(var5, $g2349$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var9 = Numbers.truncate(Numbers.divide(var5, $g2352$.getGlobalValue()), (SubLObject)UNPROVIDED);
        return f13882((SubLObject)NIL, var3, var4, var5, var6, var7, var8, var9);
    }
    
    public static SubLObject f13882(final SubLObject var208, SubLObject var3, SubLObject var5, SubLObject var206, SubLObject var13, SubLObject var15, SubLObject var207, SubLObject var209) {
        var3 = Numbers.ceiling(Numbers.multiply(var3, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        var5 = Numbers.ceiling(Numbers.multiply(var5, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        var206 = Numbers.ceiling(Numbers.multiply(var206, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        var13 = Numbers.ceiling(Numbers.multiply(var13, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        var15 = Numbers.ceiling(Numbers.multiply(var15, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        var207 = Numbers.ceiling(Numbers.multiply(var207, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        var209 = Numbers.ceiling(Numbers.multiply(var209, $g2354$.getGlobalValue()), (SubLObject)UNPROVIDED);
        f13883(var3, var5, var208);
        f13884(var206, var208);
        f13885(var13, var208);
        f13886(var15, var208);
        module0192.f12050(var207, var208);
        module0190.f11880(var209, var208);
        module0193.f12076();
        module0212.f13751(var3);
        assertions_low_oc.f11223(var206);
        module0549.f33890(var3);
        return var3;
    }
    
    public static SubLObject f13883(final SubLObject var3, final SubLObject var5, final SubLObject var208) {
        constant_handles_oc.f8487(var3, var208);
        module0167.f10789(var5, var208);
        module0170.f10873(var5, var208);
        module0169.f10847(var5, var208);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13884(final SubLObject var212, final SubLObject var208) {
        assertion_handles_oc.f11011(var212, var208);
        assertion_manager_oc.setup_assertion_content_table(var212, var208);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13885(final SubLObject var213, final SubLObject var208) {
        deduction_handles_oc.f11635(var213, var208);
        module0186.f11692(var213, var208);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13886(final SubLObject var201, final SubLObject var208) {
        module0179.f11403(var201, var208);
        module0179.f11402();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13887() {
        f13888();
        assertion_handles_oc.f11012((SubLObject)UNPROVIDED);
        deduction_handles_oc.f11636((SubLObject)UNPROVIDED);
        module0179.f11404((SubLObject)UNPROVIDED);
        module0192.f12051((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13888() {
        constant_handles_oc.f8488((SubLObject)UNPROVIDED);
        module0167.f10790((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13889(SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = $g2355$.getDynamicValue();
        }
        f13881(var3);
        return f13890();
    }
    
    public static SubLObject f13890() {
        module0192.f12054();
        module0179.f11442();
        deduction_handles_oc.f11674();
        assertion_handles_oc.f11052();
        module0167.f10831();
        constant_handles_oc.f8483();
        module0126.f8406(Symbols.symbol_function((SubLObject)$ic73$));
        module0190.f11881();
        module0617.f37850();
        f13891();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13892(SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = $g2355$.getDynamicValue();
        }
        final SubLObject var4 = Numbers.truncate(Numbers.divide(var3, $g2347$.getGlobalValue()), (SubLObject)UNPROVIDED);
        f13883(var3, var4, (SubLObject)NIL);
        module0167.f10831();
        constant_handles_oc.f8483();
        module0126.f8406(Symbols.symbol_function((SubLObject)$ic73$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13893() {
        if (NIL != module0306.f20725()) {
            module0306.f20726();
        }
        if (NIL != module0222.f14658()) {
            module0222.f14645();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13894() {
        if (NIL != module0170.f10883()) {
            module0168.f10842();
        }
        if (NIL != module0248.f15986()) {
            module0248.f15988();
        }
        if (NIL != module0322.f21838()) {
            module0322.f21839();
        }
        if (NIL != module0306.f20725()) {
            module0306.f20727();
        }
        if (NIL != module0222.f14658()) {
            module0222.f14659();
        }
        if (NIL != module0225.f14785()) {
            module0225.f14786();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13891() {
        f13893();
        module0343.f23182();
        module0343.f23184();
        module0330.f22360();
        module0303.f20141();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13895() {
        f13894();
        module0343.f23197();
        module0330.f22359();
        module0303.f20138();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13896() {
        assertion_manager_oc.f11130();
        module0186.f11717();
        module0164.f10693();
        module0169.f10864();
        module0170.f10891();
        module0189.f11825();
        module0181.f11481();
        module0242.f15671();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13897(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var2 = constant_handles_oc.f8438();
        final SubLObject var3 = module0167.f10801();
        final SubLObject var4 = assertion_handles_oc.f11023();
        final SubLObject var5 = deduction_handles_oc.f11647();
        final SubLObject var6 = module0179.f11414();
        PrintLow.format(var1, (SubLObject)$ic76$, module0018.f971());
        PrintLow.format(var1, (SubLObject)$ic77$, Numbers.add(var2, var3));
        PrintLow.format(var1, (SubLObject)$ic78$, var2);
        PrintLow.format(var1, (SubLObject)$ic79$, var3);
        PrintLow.format(var1, (SubLObject)$ic80$, var4);
        PrintLow.format(var1, (SubLObject)$ic81$, var5);
        PrintLow.format(var1, (SubLObject)$ic82$, var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13898() {
        final SubLObject var219 = Numbers.add((SubLObject)ONE_INTEGER, module0164.f10677());
        SubLObject var220 = constant_handles_oc.f8425();
        if (NIL == module0065.f4772(var220, (SubLObject)$ic43$)) {
            final SubLObject var65_220 = var220;
            if (NIL == module0065.f4775(var65_220, (SubLObject)$ic43$)) {
                final SubLObject var221 = module0065.f4740(var65_220);
                final SubLObject var222 = (SubLObject)NIL;
                SubLObject var223;
                SubLObject var224;
                SubLObject var225;
                SubLObject var226;
                for (var223 = Sequences.length(var221), var224 = (SubLObject)NIL, var224 = (SubLObject)ZERO_INTEGER; var224.numL(var223); var224 = Numbers.add(var224, (SubLObject)ONE_INTEGER)) {
                    var225 = ((NIL != var222) ? Numbers.subtract(var223, var224, (SubLObject)ONE_INTEGER) : var224);
                    var226 = Vectors.aref(var221, var225);
                    if (NIL == module0065.f4749(var226) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        if (NIL != module0065.f4749(var226)) {
                            var226 = (SubLObject)$ic43$;
                        }
                        if (!var225.numL(var219)) {
                            constants_high_oc.f10741(var226);
                        }
                    }
                }
            }
            final SubLObject var72_223 = var220;
            if (NIL == module0065.f4777(var72_223) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                final SubLObject var227 = module0065.f4738(var72_223);
                SubLObject var228 = module0065.f4739(var72_223);
                final SubLObject var229 = module0065.f4734(var72_223);
                final SubLObject var230 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                while (var228.numL(var229)) {
                    final SubLObject var231 = Hashtables.gethash_without_values(var228, var227, var230);
                    if ((NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var231)) && !var228.numL(var219)) {
                        constants_high_oc.f10741(var231);
                    }
                    var228 = Numbers.add(var228, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var232 = Numbers.add((SubLObject)ONE_INTEGER, module0167.f10810());
        var220 = module0167.f10788();
        if (NIL == module0065.f4772(var220, (SubLObject)$ic43$)) {
            final SubLObject var65_221 = var220;
            if (NIL == module0065.f4775(var65_221, (SubLObject)$ic43$)) {
                final SubLObject var221 = module0065.f4740(var65_221);
                final SubLObject var222 = (SubLObject)NIL;
                SubLObject var223;
                SubLObject var224;
                SubLObject var225;
                SubLObject var233;
                for (var223 = Sequences.length(var221), var224 = (SubLObject)NIL, var224 = (SubLObject)ZERO_INTEGER; var224.numL(var223); var224 = Numbers.add(var224, (SubLObject)ONE_INTEGER)) {
                    var225 = ((NIL != var222) ? Numbers.subtract(var223, var224, (SubLObject)ONE_INTEGER) : var224);
                    var233 = Vectors.aref(var221, var225);
                    if (NIL == module0065.f4749(var233) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        if (NIL != module0065.f4749(var233)) {
                            var233 = (SubLObject)$ic43$;
                        }
                        if (!var225.numL(var232)) {
                            module0172.f10929(var233);
                        }
                    }
                }
            }
            final SubLObject var72_224 = var220;
            if (NIL == module0065.f4777(var72_224) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                final SubLObject var227 = module0065.f4738(var72_224);
                SubLObject var228 = module0065.f4739(var72_224);
                final SubLObject var229 = module0065.f4734(var72_224);
                final SubLObject var230 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                while (var228.numL(var229)) {
                    final SubLObject var234 = Hashtables.gethash_without_values(var228, var227, var230);
                    if ((NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var234)) && !var228.numL(var232)) {
                        module0172.f10929(var234);
                    }
                    var228 = Numbers.add(var228, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var235 = module0179.f11398();
        if (NIL == module0065.f4777(var235)) {
            final SubLObject var236 = module0065.f4738(var235);
            SubLObject var237 = (SubLObject)NIL;
            SubLObject var238 = (SubLObject)NIL;
            final Iterator var239 = Hashtables.getEntrySetIterator(var236);
            try {
                while (Hashtables.iteratorHasNext(var239)) {
                    final Map.Entry var240 = Hashtables.iteratorNextEntry(var239);
                    var237 = Hashtables.getEntryKey(var240);
                    var238 = Hashtables.getEntryValue(var240);
                    module0183.f11621(var238);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var239);
            }
        }
        final SubLObject var241 = Numbers.add((SubLObject)ONE_INTEGER, assertion_handles_oc.f11032());
        var220 = assertion_handles_oc.f11010();
        if (NIL == module0065.f4772(var220, (SubLObject)$ic43$)) {
            final SubLObject var65_222 = var220;
            if (NIL == module0065.f4775(var65_222, (SubLObject)$ic43$)) {
                final SubLObject var221 = module0065.f4740(var65_222);
                final SubLObject var222 = (SubLObject)NIL;
                SubLObject var223;
                SubLObject var224;
                SubLObject var225;
                SubLObject var242;
                for (var223 = Sequences.length(var221), var224 = (SubLObject)NIL, var224 = (SubLObject)ZERO_INTEGER; var224.numL(var223); var224 = Numbers.add(var224, (SubLObject)ONE_INTEGER)) {
                    var225 = ((NIL != var222) ? Numbers.subtract(var223, var224, (SubLObject)ONE_INTEGER) : var224);
                    var242 = Vectors.aref(var221, var225);
                    if (NIL == module0065.f4749(var242) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        if (NIL != module0065.f4749(var242)) {
                            var242 = (SubLObject)$ic43$;
                        }
                        if (!var225.numL(var241)) {
                            module0342.f23126(var242);
                        }
                    }
                }
            }
            final SubLObject var72_225 = var220;
            if (NIL == module0065.f4777(var72_225) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                final SubLObject var227 = module0065.f4738(var72_225);
                SubLObject var228 = module0065.f4739(var72_225);
                final SubLObject var229 = module0065.f4734(var72_225);
                final SubLObject var230 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                while (var228.numL(var229)) {
                    final SubLObject var243 = Hashtables.gethash_without_values(var228, var227, var230);
                    if ((NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var243)) && !var228.numL(var241)) {
                        module0342.f23126(var243);
                    }
                    var228 = Numbers.add(var228, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var244 = Numbers.add((SubLObject)ONE_INTEGER, deduction_handles_oc.f11656());
        var220 = deduction_handles_oc.f11634();
        if (NIL == module0065.f4772(var220, (SubLObject)$ic43$)) {
            final SubLObject var65_223 = var220;
            if (NIL == module0065.f4775(var65_223, (SubLObject)$ic43$)) {
                final SubLObject var221 = module0065.f4740(var65_223);
                final SubLObject var222 = (SubLObject)NIL;
                SubLObject var223;
                SubLObject var224;
                SubLObject var225;
                SubLObject var245;
                for (var223 = Sequences.length(var221), var224 = (SubLObject)NIL, var224 = (SubLObject)ZERO_INTEGER; var224.numL(var223); var224 = Numbers.add(var224, (SubLObject)ONE_INTEGER)) {
                    var225 = ((NIL != var222) ? Numbers.subtract(var223, var224, (SubLObject)ONE_INTEGER) : var224);
                    var245 = Vectors.aref(var221, var225);
                    if (NIL == module0065.f4749(var245) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        if (NIL != module0065.f4749(var245)) {
                            var245 = (SubLObject)$ic43$;
                        }
                        if (!var225.numL(var244)) {
                            module0342.f23129(var245);
                        }
                    }
                }
            }
            final SubLObject var72_226 = var220;
            if (NIL == module0065.f4777(var72_226) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                final SubLObject var227 = module0065.f4738(var72_226);
                SubLObject var228 = module0065.f4739(var72_226);
                final SubLObject var229 = module0065.f4734(var72_226);
                final SubLObject var230 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                while (var228.numL(var229)) {
                    final SubLObject var246 = Hashtables.gethash_without_values(var228, var227, var230);
                    if ((NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var246)) && !var228.numL(var244)) {
                        module0342.f23129(var246);
                    }
                    var228 = Numbers.add(var228, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13899(final SubLObject var241) {
        if (NIL != module0035.f2014(var241) && NIL != module0035.f1995(var241, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var242 = (SubLObject)NIL;
            SubLObject var243 = (SubLObject)NIL;
            SubLObject var244 = (SubLObject)NIL;
            SubLObject var245 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var241, var241, (SubLObject)$ic84$);
            var242 = var241.first();
            SubLObject var246 = var241.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var246, var241, (SubLObject)$ic84$);
            var243 = var246.first();
            var246 = var246.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var246, var241, (SubLObject)$ic84$);
            var244 = var246.first();
            var246 = var246.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var246, var241, (SubLObject)$ic84$);
            var245 = var246.first();
            var246 = var246.rest();
            if (NIL == var246) {
                return (SubLObject)makeBoolean(NIL != constants_high_oc.f10777(var242) && NIL != module0172.f10934(var243) && NIL != module0178.f11387(var244) && NIL != module0188.f11793(var245));
            }
            cdestructuring_bind.cdestructuring_bind_error(var241, (SubLObject)$ic84$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13900() {
        final SubLObject var248 = constants_high_oc.f10778();
        final SubLObject var249 = module0172.f10935();
        final SubLObject var250 = module0178.f11388();
        final SubLObject var251 = module0188.f11794();
        return (SubLObject)ConsesLow.list(var248, var249, var250, var251);
    }
    
    public static SubLObject f13901(final SubLObject var252) {
        assert NIL != f13899(var252) : var252;
        SubLObject var253 = (SubLObject)NIL;
        SubLObject var254 = (SubLObject)NIL;
        SubLObject var255 = (SubLObject)NIL;
        SubLObject var256 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var252, var252, (SubLObject)$ic84$);
        var253 = var252.first();
        SubLObject var257 = var252.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var252, (SubLObject)$ic84$);
        var254 = var257.first();
        var257 = var257.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var252, (SubLObject)$ic84$);
        var255 = var257.first();
        var257 = var257.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var257, var252, (SubLObject)$ic84$);
        var256 = var257.first();
        var257 = var257.rest();
        if (NIL == var257) {
            return (SubLObject)makeBoolean(NIL != constants_high_oc.f10779(var253) && NIL != module0172.f10936(var254) && NIL != module0178.f11389(var255) && NIL != module0188.f11795(var256));
        }
        cdestructuring_bind.cdestructuring_bind_error(var252, (SubLObject)$ic84$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13902(final SubLObject var241) {
        if (NIL != module0035.f2014(var241) && NIL != module0035.f1995(var241, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var242 = (SubLObject)NIL;
            SubLObject var243 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var241, var241, (SubLObject)$ic86$);
            var242 = var241.first();
            SubLObject var244 = var241.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var244, var241, (SubLObject)$ic86$);
            var243 = var244.first();
            var244 = var244.rest();
            if (NIL == var244) {
                return (SubLObject)makeBoolean(NIL != module0178.f11387(var242) && NIL != module0188.f11793(var243));
            }
            cdestructuring_bind.cdestructuring_bind_error(var241, (SubLObject)$ic86$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13903() {
        final SubLObject var250 = module0178.f11388();
        final SubLObject var251 = module0188.f11794();
        return (SubLObject)ConsesLow.list(var250, var251);
    }
    
    public static SubLObject f13904(final SubLObject var257) {
        assert NIL != f13902(var257) : var257;
        SubLObject var258 = (SubLObject)NIL;
        SubLObject var259 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var257, var257, (SubLObject)$ic86$);
        var258 = var257.first();
        SubLObject var260 = var257.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var260, var257, (SubLObject)$ic86$);
        var259 = var260.first();
        var260 = var260.rest();
        if (NIL == var260) {
            return (SubLObject)makeBoolean(NIL != module0178.f11389(var258) && NIL != module0188.f11795(var259));
        }
        cdestructuring_bind.cdestructuring_bind_error(var257, (SubLObject)$ic86$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13905(final SubLObject var241) {
        return module0038.f2794(var241);
    }
    
    public static SubLObject f13906(final SubLObject var241) {
        return module0038.f2801(var241);
    }
    
    public static SubLObject f13907(final SubLObject var241) {
        return module0037.f2583(module0021.f1037(var241));
    }
    
    public static SubLObject f13908(final SubLObject var241) {
        return module0037.f2589(module0021.f1037(var241));
    }
    
    public static SubLObject f13909(final SubLObject var260) {
        assert NIL != f13905(var260) : var260;
        return f13910(var260, (SubLObject)$ic93$);
    }
    
    public static SubLObject f13911(final SubLObject var260) {
        assert NIL != f13906(var260) : var260;
        return f13910(var260, (SubLObject)$ic95$);
    }
    
    public static SubLObject f13912(final SubLObject var260) {
        if (NIL == f13913(var260)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        return f13910(var260, (SubLObject)$ic93$);
    }
    
    public static SubLObject f13914(final SubLObject var260) {
        if (NIL == f13915(var260)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        return f13910(var260, (SubLObject)$ic95$);
    }
    
    public static SubLObject f13913(final SubLObject var241) {
        return module0038.f2794(var241);
    }
    
    public static SubLObject f13915(final SubLObject var241) {
        return module0038.f2801(var241);
    }
    
    public static SubLObject f13916(final SubLObject var241) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        if (NIL == f13915(var241)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var243 = (SubLObject)NIL;
        try {
            var242.throwStack.push($ic101$);
            final SubLObject var244 = Errors.$error_handler$.currentBinding(var242);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic102$), var242);
                try {
                    final SubLObject var245 = f13917(var241);
                    if (var241.equal(f13918(var245))) {
                        return Values.values((SubLObject)T, var245);
                    }
                }
                catch (Throwable var246) {
                    Errors.handleThrowable(var246, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var244, var242);
            }
        }
        catch (Throwable var247) {
            var243 = Errors.handleThrowable(var247, (SubLObject)$ic101$);
        }
        finally {
            var242.throwStack.pop();
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f13919(final SubLObject var266, final SubLObject var267) {
        return (SubLObject)makeBoolean(NIL != f13915(var266) && NIL != f13915(var267) && NIL != Strings.stringE(var266, var267, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13920(final SubLObject var241) {
        return module0037.f2583(module0021.f1041(var241));
    }
    
    public static SubLObject f13918(final SubLObject var241) {
        return module0037.f2589(module0021.f1041(var241));
    }
    
    public static SubLObject f13921(final SubLObject var260) {
        assert NIL != f13913(var260) : var260;
        return f13910(var260, (SubLObject)$ic93$);
    }
    
    public static SubLObject f13922(final SubLObject var260) {
        final SubLObject var261 = f13917(var260);
        if (NIL == module0206.f13450(var261)) {
            Errors.error((SubLObject)$ic109$, var260);
        }
        return var261;
    }
    
    public static SubLObject f13917(final SubLObject var260) {
        assert NIL != f13915(var260) : var260;
        return f13910(var260, (SubLObject)$ic95$);
    }
    
    public static SubLObject f13923(final SubLObject var260) {
        final SubLThread var261 = SubLProcess.currentSubLThread();
        assert NIL != f13915(var260) : var260;
        var261.resetMultipleValues();
        final SubLObject var262 = f13916(var260);
        final SubLObject var263 = var261.secondMultipleValue();
        var261.resetMultipleValues();
        if (NIL != var262) {
            return Values.values(var263, var262);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f13910(final SubLObject var260, final SubLObject var270) {
        final SubLThread var271 = SubLProcess.currentSubLThread();
        SubLObject var272 = (SubLObject)NIL;
        SubLObject var273 = (SubLObject)NIL;
        SubLObject var274 = (SubLObject)NIL;
        if (var270.eql((SubLObject)$ic93$)) {
            var272 = module0037.f2587(var260);
        }
        else if (var270.eql((SubLObject)$ic95$)) {
            var272 = module0037.f2593(var260);
        }
        else {
            Errors.error((SubLObject)$ic112$, var270);
        }
        SubLObject var275 = (SubLObject)NIL;
        try {
            var271.throwStack.push($ic101$);
            final SubLObject var276 = Errors.$error_handler$.currentBinding(var271);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic102$), var271);
                try {
                    var273 = module0021.f1059(var272);
                    var274 = (SubLObject)makeBoolean(NIL == module0035.f2439((SubLObject)$ic113$, var273, (SubLObject)UNPROVIDED));
                }
                catch (Throwable var277) {
                    Errors.handleThrowable(var277, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var276, var271);
            }
        }
        catch (Throwable var278) {
            var275 = Errors.handleThrowable(var278, (SubLObject)$ic101$);
        }
        finally {
            var271.throwStack.pop();
        }
        return Values.values(var273, var274);
    }
    
    public static SubLObject f13924(final SubLObject var241) {
        if (NIL != constant_handles_oc.f8449(var241)) {
            return (SubLObject)makeBoolean(NIL == constant_handles_oc.f8463(var241, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0167.f10813(var241)) {
            return (SubLObject)makeBoolean(NIL == module0167.f10824(var241, (SubLObject)UNPROVIDED));
        }
        if (NIL != assertion_handles_oc.f11035(var241)) {
            return (SubLObject)makeBoolean(NIL == assertion_handles_oc.f11041(var241, (SubLObject)UNPROVIDED));
        }
        if (NIL != deduction_handles_oc.f11659(var241)) {
            return (SubLObject)makeBoolean(NIL == deduction_handles_oc.f11671(var241, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0179.f11424(var241)) {
            return (SubLObject)makeBoolean(NIL == module0179.f11430(var241, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0192.f12006(var241)) {
            return (SubLObject)makeBoolean(NIL == module0192.f12016(var241, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13925(final SubLObject var269, SubLObject var274) {
        if (var274 == UNPROVIDED) {
            var274 = (SubLObject)T;
        }
        if (NIL != constant_handles_oc.f8449(var269) && NIL == module0167.f10813(var269)) {
            final SubLObject var275 = constants_high_oc.f10743(var269);
            return (SubLObject)(var275.isString() ? module0038.f2785(var275) : $ic114$);
        }
        if (NIL != module0603.f36858(var269)) {
            return module0603.f36861(var269);
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic115$, module0228.f15230(var269));
    }
    
    public static SubLObject f13926(final SubLObject var276, SubLObject var277, SubLObject var278, SubLObject var279, SubLObject var280, SubLObject var202, SubLObject var281) {
        if (var277 == UNPROVIDED) {
            var277 = (SubLObject)NIL;
        }
        if (var278 == UNPROVIDED) {
            var278 = (SubLObject)NIL;
        }
        if (var279 == UNPROVIDED) {
            var279 = (SubLObject)NIL;
        }
        if (var280 == UNPROVIDED) {
            var280 = (SubLObject)NIL;
        }
        if (var202 == UNPROVIDED) {
            var202 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var281 == UNPROVIDED) {
            var281 = (SubLObject)NIL;
        }
        final SubLThread var282 = SubLProcess.currentSubLThread();
        SubLObject var283 = (SubLObject)NIL;
        final SubLObject var284 = $g2356$.currentBinding(var282);
        final SubLObject var285 = $g2357$.currentBinding(var282);
        final SubLObject var286 = $g2358$.currentBinding(var282);
        try {
            $g2356$.bind(var279, var282);
            $g2357$.bind(var280, var282);
            $g2358$.bind(var281, var282);
            final SubLObject var287 = (NIL != var277) ? conses_high.copy_list(var276) : var276;
            final SubLObject var288 = (NIL != var278) ? Symbols.symbol_function((SubLObject)$ic116$) : Symbols.symbol_function((SubLObject)$ic117$);
            var283 = Functions.funcall(var288, var287, Symbols.symbol_function((SubLObject)$ic118$), var202);
        }
        finally {
            $g2358$.rebind(var286, var282);
            $g2357$.rebind(var285, var282);
            $g2356$.rebind(var284, var282);
        }
        return var283;
    }
    
    public static SubLObject f13927(final SubLObject var285, final SubLObject var286, SubLObject var279, SubLObject var280, SubLObject var281) {
        if (var279 == UNPROVIDED) {
            var279 = (SubLObject)NIL;
        }
        if (var280 == UNPROVIDED) {
            var280 = (SubLObject)NIL;
        }
        if (var281 == UNPROVIDED) {
            var281 = (SubLObject)NIL;
        }
        final SubLThread var287 = SubLProcess.currentSubLThread();
        SubLObject var288 = (SubLObject)NIL;
        final SubLObject var289 = $g2356$.currentBinding(var287);
        final SubLObject var290 = $g2357$.currentBinding(var287);
        final SubLObject var291 = $g2358$.currentBinding(var287);
        try {
            $g2356$.bind(var279, var287);
            $g2357$.bind(var280, var287);
            $g2358$.bind(var281, var287);
            var288 = f13928(var285, var286);
        }
        finally {
            $g2358$.rebind(var291, var287);
            $g2357$.rebind(var290, var287);
            $g2356$.rebind(var289, var287);
        }
        return var288;
    }
    
    public static SubLObject f13929(final SubLObject var285, final SubLObject var286, SubLObject var280) {
        if (var280 == UNPROVIDED) {
            var280 = (SubLObject)NIL;
        }
        return f13927(var285, var286, (SubLObject)T, var280, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13928(final SubLObject var288, final SubLObject var289) {
        if (var288.eql(var289)) {
            return (SubLObject)NIL;
        }
        if (var288.isAtom()) {
            if (var289.isAtom()) {
                return f13930(var288, var289);
            }
            return (SubLObject)T;
        }
        else {
            if (var289.isAtom()) {
                return (SubLObject)NIL;
            }
            return f13931(var288, var289);
        }
    }
    
    public static SubLObject f13931(final SubLObject var290, final SubLObject var291) {
        SubLObject var292 = (SubLObject)NIL;
        SubLObject var293 = (SubLObject)NIL;
        var292 = var290;
        var293 = var291;
        while (true) {
            final SubLObject var294 = var292.first();
            final SubLObject var295 = var293.first();
            if (NIL != f13928(var294, var295)) {
                return (SubLObject)T;
            }
            if (NIL != f13928(var295, var294)) {
                return (SubLObject)NIL;
            }
            final SubLObject var296 = var292.rest();
            final SubLObject var297 = var293.rest();
            if (var296.isAtom()) {
                if (var297.isAtom()) {
                    return f13930(var296, var297);
                }
                return (SubLObject)T;
            }
            else {
                if (var297.isAtom()) {
                    return (SubLObject)NIL;
                }
                var292 = var292.rest();
                var293 = var293.rest();
            }
        }
    }
    
    public static SubLObject f13930(final SubLObject var298, final SubLObject var299) {
        if (var298.eql(var299)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean((NIL != module0173.f10955(var298) && (NIL == module0173.f10955(var299) || NIL != f13932(var298, var299))) || (NIL == module0173.f10955(var299) && ((NIL != module0193.f12067(var298) && (NIL == module0193.f12067(var299) || NIL != module0193.f12080(var298, var299))) || (NIL == module0193.f12067(var299) && ((var298.isSymbol() && (!var299.isSymbol() || NIL != f13933(var298, var299))) || (!var299.isSymbol() && ((var298.isString() && (!var299.isString() || NIL != Strings.stringL(var298, var299, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) || (!var299.isString() && ((var298.isNumber() && (!var299.isNumber() || var298.numL(var299))) || (var298.isChar() && !var299.isNumber() && (!var299.isChar() || NIL != Characters.charL(var298, var299))))))))))));
    }
    
    public static SubLObject f13933(final SubLObject var300, final SubLObject var301) {
        final SubLThread var302 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean((var300.isKeyword() && (!var301.isKeyword() || NIL != Strings.stringL(Symbols.symbol_name(var300), Symbols.symbol_name(var301), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) || (!var301.isKeyword() && ((NIL != module0193.f12097(var300) && (NIL == module0193.f12097(var301) || (NIL == $g2357$.getDynamicValue(var302) && NIL != Strings.stringL(Symbols.symbol_name(var300), Symbols.symbol_name(var301), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) || (NIL == module0193.f12097(var301) && NIL != Strings.stringL(Symbols.symbol_name(var300), Symbols.symbol_name(var301), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
    }
    
    public static SubLObject f13932(final SubLObject var302, final SubLObject var303) {
        if (NIL != module0167.f10813(var302)) {
            if (NIL != module0167.f10813(var303)) {
                return f13934(var302, var303);
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL != module0167.f10813(var303)) {
                return (SubLObject)T;
            }
            return f13935(var302, var303);
        }
    }
    
    public static SubLObject f13935(final SubLObject var304, final SubLObject var305) {
        final SubLThread var306 = SubLProcess.currentSubLThread();
        if (NIL != $g2358$.getDynamicValue(var306)) {
            return constants_high_oc.f10754(var304, var305);
        }
        if (NIL != $g2356$.getDynamicValue(var306)) {
            return f13930(constants_high_oc.f10743(var304), constants_high_oc.f10743(var305));
        }
        return constants_high_oc.f10760(var304, var305);
    }
    
    public static SubLObject f13934(final SubLObject var306, final SubLObject var307) {
        final SubLThread var308 = SubLProcess.currentSubLThread();
        if (NIL != $g2356$.getDynamicValue(var308) && NIL == $g2358$.getDynamicValue(var308)) {
            return f13928(module0172.f10920(var306), module0172.f10920(var307));
        }
        return f13930(module0167.f10803(var306), module0167.f10803(var307));
    }
    
    public static SubLObject f13936(final SubLObject var302, final SubLObject var303) {
        assert NIL != module0173.f10955(var302) : var302;
        assert NIL != module0173.f10955(var303) : var303;
        if (NIL != constant_handles_oc.f8449(var302)) {
            if (NIL != constant_handles_oc.f8449(var303)) {
                return constants_high_oc.f10754(var302, var303);
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != constant_handles_oc.f8449(var303)) {
                return (SubLObject)NIL;
            }
            return Numbers.numL(module0167.f10803(var302), module0167.f10803(var303));
        }
    }
    
    public static SubLObject f13937(final SubLObject var308) {
        return Sort.sort(var308, Symbols.symbol_function((SubLObject)$ic120$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13938(final SubLObject var309, final SubLObject var310, SubLObject var311) {
        if (var311 == UNPROVIDED) {
            var311 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0035.f2385(var309, var310, $g2359$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || (NIL == module0035.f2385(var310, var309, $g2359$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != f13927(var309, var310, var311, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f13939(final SubLObject var241) {
        final SubLObject var242 = Structures.method_func(var241, $g2360$.getGlobalValue());
        if (NIL != var242) {
            return Functions.funcall(var242, var241);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f13940(final SubLObject var241) {
        return Numbers.add((SubLObject)ONE_INTEGER, f13939(module0178.f11282(var241)));
    }
    
    public static SubLObject f13941(final SubLObject var241) {
        SubLObject var242 = (SubLObject)ZERO_INTEGER;
        SubLObject var243 = (SubLObject)NIL;
        SubLObject var244 = (SubLObject)NIL;
        var243 = var241;
        var244 = var243.first();
        while (var243.rest().isCons()) {
            var242 = Numbers.max(var242, f13939(var244));
            var243 = var243.rest();
            var244 = var243.first();
        }
        var242 = Numbers.max(var242, f13939(var244));
        if (NIL != var243.rest()) {
            var242 = Numbers.max(var242, f13939(var243.rest()));
        }
        return var242;
    }
    
    public static SubLObject f13942(final SubLObject var285, final SubLObject var286) {
        if (var285.equal(var286)) {
            return (SubLObject)ONE_INTEGER;
        }
        final SubLObject var287 = f13943(var285);
        final SubLObject var288 = f13943(var286);
        SubLObject var289 = module0031.f1670(var287);
        SubLObject var290 = (SubLObject)ZERO_INTEGER;
        final SubLObject var291 = module0031.f1696(var288);
        final SubLObject var292 = (SubLObject)NIL;
        SubLObject var293;
        SubLObject var294;
        SubLObject var295;
        SubLObject var296;
        for (var293 = Sequences.length(var291), var294 = (SubLObject)NIL, var294 = (SubLObject)ZERO_INTEGER; var294.numL(var293); var294 = Numbers.add(var294, (SubLObject)ONE_INTEGER)) {
            var295 = ((NIL != var292) ? Numbers.subtract(var293, var294, (SubLObject)ONE_INTEGER) : var294);
            var296 = Vectors.aref(var291, var295);
            if (NIL != module0031.f1697(var296)) {
                if (NIL != module0031.f1688(var296, var287)) {
                    var290 = Numbers.add(var290, (SubLObject)ONE_INTEGER);
                }
                else {
                    var289 = Numbers.add(var289, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return Numbers.divide(var290, var289);
    }
    
    public static SubLObject f13944(final SubLObject var321, SubLObject var322) {
        if (var322 == UNPROVIDED) {
            var322 = (SubLObject)$ic125$;
        }
        final SubLThread var323 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var321) : var321;
        SubLObject var324 = (SubLObject)NIL;
        SubLObject var325 = module0139.f9019((SubLObject)FOUR_INTEGER);
        final SubLObject var326 = module0139.$g1632$.currentBinding(var323);
        final SubLObject var327 = module0139.$g1630$.currentBinding(var323);
        final SubLObject var328 = module0139.$g1631$.currentBinding(var323);
        try {
            module0139.$g1632$.bind(var325, var323);
            module0139.$g1630$.bind((SubLObject)T, var323);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var323)), var323);
            final SubLObject var20_324 = module0147.$g2094$.currentBinding(var323);
            final SubLObject var25_325 = module0147.$g2095$.currentBinding(var323);
            try {
                module0147.$g2094$.bind((SubLObject)$ic33$, var323);
                module0147.$g2095$.bind($ic34$, var323);
                var324 = f13945(module0259.f16848(var321, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var322);
            }
            finally {
                module0147.$g2095$.rebind(var25_325, var323);
                module0147.$g2094$.rebind(var20_324, var323);
            }
            var325 = module0139.$g1632$.getDynamicValue(var323);
        }
        finally {
            module0139.$g1631$.rebind(var328, var323);
            module0139.$g1630$.rebind(var327, var323);
            module0139.$g1632$.rebind(var326, var323);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic126$), var324);
    }
    
    public static SubLObject f13946(final SubLObject var321, SubLObject var322) {
        if (var322 == UNPROVIDED) {
            var322 = (SubLObject)$ic125$;
        }
        final SubLThread var323 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var321) : var321;
        SubLObject var324 = (SubLObject)NIL;
        SubLObject var325 = module0139.f9019((SubLObject)FOUR_INTEGER);
        final SubLObject var326 = module0139.$g1632$.currentBinding(var323);
        final SubLObject var327 = module0139.$g1630$.currentBinding(var323);
        final SubLObject var328 = module0139.$g1631$.currentBinding(var323);
        try {
            module0139.$g1632$.bind(var325, var323);
            module0139.$g1630$.bind((SubLObject)T, var323);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var323)), var323);
            final SubLObject var20_326 = module0147.$g2094$.currentBinding(var323);
            final SubLObject var25_327 = module0147.$g2095$.currentBinding(var323);
            try {
                module0147.$g2094$.bind((SubLObject)$ic33$, var323);
                module0147.$g2095$.bind($ic34$, var323);
                var324 = f13945(module0256.f16552(var321, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var322);
            }
            finally {
                module0147.$g2095$.rebind(var25_327, var323);
                module0147.$g2094$.rebind(var20_326, var323);
            }
            var325 = module0139.$g1632$.getDynamicValue(var323);
        }
        finally {
            module0139.$g1631$.rebind(var328, var323);
            module0139.$g1630$.rebind(var327, var323);
            module0139.$g1632$.rebind(var326, var323);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic126$), var324);
    }
    
    public static SubLObject f13947(final SubLObject var269) {
        final SubLThread var270 = SubLProcess.currentSubLThread();
        final SubLObject var271 = Numbers.add(module0018.$g664$.getDynamicValue(var270), (SubLObject)((NIL != module0269.f17710(var269)) ? module0018.$g665$.getDynamicValue(var270) : ZERO_INTEGER));
        final SubLObject var272 = module0031.f1685(var271, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var273 = module0147.$g2094$.currentBinding(var270);
        final SubLObject var274 = module0147.$g2095$.currentBinding(var270);
        try {
            module0147.$g2094$.bind((SubLObject)$ic33$, var270);
            module0147.$g2095$.bind($ic34$, var270);
            module0031.f1690(var269, var272);
            SubLObject var275 = f13948(var269);
            SubLObject var276 = (SubLObject)NIL;
            var276 = var275.first();
            while (NIL != var275) {
                module0031.f1690(var276, var272);
                var275 = var275.rest();
                var276 = var275.first();
            }
            if (NIL != module0269.f17710(var269)) {
                var275 = module0256.f16531(var269, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var276 = (SubLObject)NIL;
                var276 = var275.first();
                while (NIL != var275) {
                    module0031.f1690(var276, var272);
                    var275 = var275.rest();
                    var276 = var275.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var274, var270);
            module0147.$g2094$.rebind(var273, var270);
        }
        return var272;
    }
    
    public static SubLObject f13943(final SubLObject var269) {
        final SubLThread var270 = SubLProcess.currentSubLThread();
        final SubLObject var271 = module0034.$g879$.getDynamicValue(var270);
        SubLObject var272 = (SubLObject)NIL;
        if (NIL == var271) {
            return f13947(var269);
        }
        var272 = module0034.f1857(var271, (SubLObject)$ic127$, (SubLObject)UNPROVIDED);
        if (NIL == var272) {
            var272 = module0034.f1807(module0034.f1842(var271), (SubLObject)$ic127$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var271, (SubLObject)$ic127$, var272);
        }
        SubLObject var273 = module0034.f1814(var272, var269, (SubLObject)$ic128$);
        if (var273 == $ic128$) {
            var273 = Values.arg2(var270.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13947(var269)));
            module0034.f1816(var272, var269, var273, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var273);
    }
    
    public static SubLObject f13948(final SubLObject var269) {
        return module0259.f16840(var269, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13945(final SubLObject var333, final SubLObject var322) {
        final SubLThread var334 = SubLProcess.currentSubLThread();
        SubLObject var335 = (SubLObject)NIL;
        final SubLObject var337;
        final SubLObject var336 = var337 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var338 = module0034.$g879$.currentBinding(var334);
        try {
            module0034.$g879$.bind(var337, var334);
            SubLObject var339 = (SubLObject)NIL;
            if (NIL != var337 && NIL == module0034.f1842(var337)) {
                var339 = module0034.f1869(var337);
                final SubLObject var340 = Threads.current_process();
                if (NIL == var339) {
                    module0034.f1873(var337, var340);
                }
                else if (!var339.eql(var340)) {
                    Errors.error((SubLObject)$ic129$);
                }
            }
            try {
                if (var322.eql((SubLObject)$ic130$)) {
                    module0012.$g82$.setDynamicValue((SubLObject)$ic131$, var334);
                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var334);
                    module0012.$g83$.setDynamicValue(Sequences.length(var333), var334);
                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var334);
                    final SubLObject var20_339 = module0012.$g75$.currentBinding(var334);
                    final SubLObject var341 = module0012.$g76$.currentBinding(var334);
                    final SubLObject var342 = module0012.$g77$.currentBinding(var334);
                    final SubLObject var343 = module0012.$g78$.currentBinding(var334);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var334);
                        module0012.$g76$.bind((SubLObject)NIL, var334);
                        module0012.$g77$.bind((SubLObject)T, var334);
                        module0012.$g78$.bind(Time.get_universal_time(), var334);
                        module0012.f478(module0012.$g82$.getDynamicValue(var334));
                        SubLObject var344 = var333;
                        SubLObject var345 = (SubLObject)NIL;
                        var345 = var344.first();
                        while (NIL != var344) {
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var334), module0012.$g83$.getDynamicValue(var334));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var334), (SubLObject)ONE_INTEGER), var334);
                            SubLObject var346 = var333;
                            SubLObject var347 = (SubLObject)NIL;
                            var347 = var346.first();
                            while (NIL != var346) {
                                if (!var345.eql(var347)) {
                                    final SubLObject var348 = f13942(var345, var347);
                                    if (!var348.isZero()) {
                                        var335 = (SubLObject)ConsesLow.cons(var348, var335);
                                    }
                                }
                                var346 = var346.rest();
                                var347 = var346.first();
                            }
                            var344 = var344.rest();
                            var345 = var344.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var343, var334);
                        module0012.$g77$.rebind(var342, var334);
                        module0012.$g76$.rebind(var341, var334);
                        module0012.$g75$.rebind(var20_339, var334);
                    }
                }
                else {
                    assert NIL != module0004.f106(var322) : var322;
                    final SubLObject var349 = Functions.apply(Symbols.symbol_function((SubLObject)$ic133$), var333);
                    final SubLObject var350 = Sequences.length(var349);
                    module0012.$g82$.setDynamicValue((SubLObject)$ic134$, var334);
                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var334);
                    module0012.$g83$.setDynamicValue(var322, var334);
                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var334);
                    final SubLObject var20_340 = module0012.$g75$.currentBinding(var334);
                    final SubLObject var351 = module0012.$g76$.currentBinding(var334);
                    final SubLObject var352 = module0012.$g77$.currentBinding(var334);
                    final SubLObject var353 = module0012.$g78$.currentBinding(var334);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var334);
                        module0012.$g76$.bind((SubLObject)NIL, var334);
                        module0012.$g77$.bind((SubLObject)T, var334);
                        module0012.$g78$.bind(Time.get_universal_time(), var334);
                        module0012.f478(module0012.$g82$.getDynamicValue(var334));
                        SubLObject var347;
                        SubLObject var348;
                        SubLObject var354;
                        SubLObject var355;
                        for (var354 = (SubLObject)NIL, var354 = (SubLObject)ZERO_INTEGER; var354.numL(module0012.$g83$.getDynamicValue(var334)); var354 = Numbers.add(var354, (SubLObject)ONE_INTEGER)) {
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var334), module0012.$g83$.getDynamicValue(var334));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var334), (SubLObject)ONE_INTEGER), var334);
                            var355 = Vectors.aref(var349, random.random(var350));
                            var347 = Vectors.aref(var349, random.random(var350));
                            var348 = f13942(var355, var347);
                            if (!var348.isZero()) {
                                var335 = (SubLObject)ConsesLow.cons(var348, var335);
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var353, var334);
                        module0012.$g77$.rebind(var352, var334);
                        module0012.$g76$.rebind(var351, var334);
                        module0012.$g75$.rebind(var20_340, var334);
                    }
                }
            }
            finally {
                final SubLObject var20_341 = Threads.$is_thread_performing_cleanupP$.currentBinding(var334);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var334);
                    if (NIL != var337 && NIL == var339) {
                        module0034.f1873(var337, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var20_341, var334);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var338, var334);
        }
        return (SubLObject)ConsesLow.list(module0048.f3387(var335, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0048.f3384(var335), module0048.f3401(var335));
    }
    
    public static SubLObject f13949(final SubLObject var345, final SubLObject var346, SubLObject var347) {
        if (var347 == UNPROVIDED) {
            var347 = (SubLObject)NIL;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var345) : var345;
        assert NIL != Types.integerp(var346) : var346;
        if (!var345.numLE(var346)) {
            return (SubLObject)NIL;
        }
        SubLObject var349 = (SubLObject)NIL;
        final SubLObject var350 = module0147.$g2094$.currentBinding(var348);
        final SubLObject var351 = module0147.$g2095$.currentBinding(var348);
        try {
            module0147.$g2094$.bind((SubLObject)$ic33$, var348);
            module0147.$g2095$.bind($ic34$, var348);
            if (NIL != module0173.f10955(var347)) {
                final SubLObject var352 = module0617.f37868(var347, (SubLObject)UNPROVIDED);
                module0012.$g82$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic136$, var347), var348);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var348);
                module0012.$g83$.setDynamicValue(Sequences.length(var352), var348);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var348);
                final SubLObject var20_349 = module0012.$g75$.currentBinding(var348);
                final SubLObject var25_350 = module0012.$g76$.currentBinding(var348);
                final SubLObject var353 = module0012.$g77$.currentBinding(var348);
                final SubLObject var354 = module0012.$g78$.currentBinding(var348);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var348);
                    module0012.$g76$.bind((SubLObject)NIL, var348);
                    module0012.$g77$.bind((SubLObject)T, var348);
                    module0012.$g78$.bind(Time.get_universal_time(), var348);
                    module0012.f478(module0012.$g82$.getDynamicValue(var348));
                    SubLObject var355 = var352;
                    SubLObject var356 = (SubLObject)NIL;
                    var356 = var355.first();
                    while (NIL != var355) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var348), module0012.$g83$.getDynamicValue(var348));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var348), (SubLObject)ONE_INTEGER), var348);
                        final SubLObject var357 = module0617.f37872(var356, (SubLObject)UNPROVIDED);
                        if (NIL != var357 && var357.numGE(var345) && var357.numLE(var346)) {
                            var349 = (SubLObject)ConsesLow.cons(var356, var349);
                        }
                        var355 = var355.rest();
                        var356 = var355.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var354, var348);
                    module0012.$g77$.rebind(var353, var348);
                    module0012.$g76$.rebind(var25_350, var348);
                    module0012.$g75$.rebind(var20_349, var348);
                }
            }
            else {
                final SubLObject var358 = constant_handles_oc.f8425();
                final SubLObject var359 = (SubLObject)$ic137$;
                final SubLObject var360 = module0065.f4733(var358);
                SubLObject var361 = (SubLObject)ZERO_INTEGER;
                assert NIL != Types.stringp(var359) : var359;
                final SubLObject var20_350 = module0012.$g75$.currentBinding(var348);
                final SubLObject var25_351 = module0012.$g76$.currentBinding(var348);
                final SubLObject var362 = module0012.$g77$.currentBinding(var348);
                final SubLObject var363 = module0012.$g78$.currentBinding(var348);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var348);
                    module0012.$g76$.bind((SubLObject)NIL, var348);
                    module0012.$g77$.bind((SubLObject)T, var348);
                    module0012.$g78$.bind(Time.get_universal_time(), var348);
                    module0012.f478(var359);
                    final SubLObject var63_354 = var358;
                    if (NIL == module0065.f4772(var63_354, (SubLObject)$ic43$)) {
                        final SubLObject var65_355 = var63_354;
                        if (NIL == module0065.f4775(var65_355, (SubLObject)$ic43$)) {
                            final SubLObject var364 = module0065.f4740(var65_355);
                            final SubLObject var365 = (SubLObject)NIL;
                            SubLObject var366;
                            SubLObject var367;
                            SubLObject var368;
                            SubLObject var369;
                            SubLObject var370;
                            for (var366 = Sequences.length(var364), var367 = (SubLObject)NIL, var367 = (SubLObject)ZERO_INTEGER; var367.numL(var366); var367 = Numbers.add(var367, (SubLObject)ONE_INTEGER)) {
                                var368 = ((NIL != var365) ? Numbers.subtract(var366, var367, (SubLObject)ONE_INTEGER) : var367);
                                var369 = Vectors.aref(var364, var368);
                                if (NIL == module0065.f4749(var369) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                                    if (NIL != module0065.f4749(var369)) {
                                        var369 = (SubLObject)$ic43$;
                                    }
                                    module0012.note_percent_progress(var361, var360);
                                    var361 = Numbers.add(var361, (SubLObject)ONE_INTEGER);
                                    var370 = module0617.f37872(var369, (SubLObject)UNPROVIDED);
                                    if (NIL != var370 && var370.numGE(var345) && var370.numLE(var346)) {
                                        var349 = (SubLObject)ConsesLow.cons(var369, var349);
                                    }
                                }
                            }
                        }
                        final SubLObject var72_356 = var63_354;
                        if (NIL == module0065.f4777(var72_356) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            final SubLObject var371 = module0065.f4738(var72_356);
                            SubLObject var372 = module0065.f4739(var72_356);
                            final SubLObject var373 = module0065.f4734(var72_356);
                            final SubLObject var374 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                            while (var372.numL(var373)) {
                                final SubLObject var375 = Hashtables.gethash_without_values(var372, var371, var374);
                                if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var375)) {
                                    module0012.note_percent_progress(var361, var360);
                                    var361 = Numbers.add(var361, (SubLObject)ONE_INTEGER);
                                    final SubLObject var376 = module0617.f37872(var375, (SubLObject)UNPROVIDED);
                                    if (NIL != var376 && var376.numGE(var345) && var376.numLE(var346)) {
                                        var349 = (SubLObject)ConsesLow.cons(var375, var349);
                                    }
                                }
                                var372 = Numbers.add(var372, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var363, var348);
                    module0012.$g77$.rebind(var362, var348);
                    module0012.$g76$.rebind(var25_351, var348);
                    module0012.$g75$.rebind(var20_350, var348);
                }
            }
            f13950();
            var349 = Sort.sort(var349, Symbols.symbol_function((SubLObject)$ic138$), Symbols.symbol_function((SubLObject)$ic139$));
            var349 = Sort.stable_sort(var349, Symbols.symbol_function((SubLObject)$ic140$), (SubLObject)UNPROVIDED);
            if (NIL == var347) {
                f13951();
                var349 = Sort.stable_sort(var349, Symbols.symbol_function((SubLObject)$ic141$), (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var351, var348);
            module0147.$g2094$.rebind(var350, var348);
        }
        return var349;
    }
    
    public static SubLObject f13952(final SubLObject var190) {
        return module0035.f2399(module0178.f11282(var190), (SubLObject)$ic142$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13953(final SubLObject var190) {
        return module0035.f2399(module0178.f11282(var190), (SubLObject)$ic143$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13954(final SubLObject var345, final SubLObject var346, SubLObject var347) {
        if (var347 == UNPROVIDED) {
            var347 = (SubLObject)NIL;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var345) : var345;
        assert NIL != Types.integerp(var346) : var346;
        if (!var345.numLE(var346)) {
            return (SubLObject)NIL;
        }
        SubLObject var349 = (SubLObject)NIL;
        final SubLObject var350 = assertion_handles_oc.f11010();
        final SubLObject var351 = (SubLObject)$ic144$;
        final SubLObject var352 = module0065.f4733(var350);
        SubLObject var353 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var351) : var351;
        final SubLObject var354 = module0012.$g75$.currentBinding(var348);
        final SubLObject var355 = module0012.$g76$.currentBinding(var348);
        final SubLObject var356 = module0012.$g77$.currentBinding(var348);
        final SubLObject var357 = module0012.$g78$.currentBinding(var348);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var348);
            module0012.$g76$.bind((SubLObject)NIL, var348);
            module0012.$g77$.bind((SubLObject)T, var348);
            module0012.$g78$.bind(Time.get_universal_time(), var348);
            module0012.f478(var351);
            final SubLObject var63_357 = var350;
            if (NIL == module0065.f4772(var63_357, (SubLObject)$ic43$)) {
                final SubLObject var65_358 = var63_357;
                if (NIL == module0065.f4775(var65_358, (SubLObject)$ic43$)) {
                    final SubLObject var358 = module0065.f4740(var65_358);
                    final SubLObject var359 = (SubLObject)NIL;
                    SubLObject var360;
                    SubLObject var361;
                    SubLObject var362;
                    SubLObject var363;
                    SubLObject var364;
                    SubLObject var365;
                    for (var360 = Sequences.length(var358), var361 = (SubLObject)NIL, var361 = (SubLObject)ZERO_INTEGER; var361.numL(var360); var361 = Numbers.add(var361, (SubLObject)ONE_INTEGER)) {
                        var362 = ((NIL != var359) ? Numbers.subtract(var360, var361, (SubLObject)ONE_INTEGER) : var361);
                        var363 = Vectors.aref(var358, var362);
                        if (NIL == module0065.f4749(var363) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var363)) {
                                var363 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var353, var352);
                            var353 = Numbers.add(var353, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11375(var363)) {
                                var364 = module0178.f11295(var363);
                                var365 = module0178.f11296(var363);
                                if (NIL != var365 && (NIL == var347 || var347.eql(var364)) && var365.numGE(var345) && var365.numLE(var346)) {
                                    var349 = (SubLObject)ConsesLow.cons(var363, var349);
                                }
                            }
                        }
                    }
                }
                final SubLObject var72_360 = var63_357;
                if (NIL == module0065.f4777(var72_360) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var366 = module0065.f4738(var72_360);
                    SubLObject var367 = module0065.f4739(var72_360);
                    final SubLObject var368 = module0065.f4734(var72_360);
                    final SubLObject var369 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var367.numL(var368)) {
                        final SubLObject var370 = Hashtables.gethash_without_values(var367, var366, var369);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var370)) {
                            module0012.note_percent_progress(var353, var352);
                            var353 = Numbers.add(var353, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11375(var370)) {
                                final SubLObject var371 = module0178.f11295(var370);
                                final SubLObject var372 = module0178.f11296(var370);
                                if (NIL != var372 && (NIL == var347 || var347.eql(var371)) && var372.numGE(var345) && var372.numLE(var346)) {
                                    var349 = (SubLObject)ConsesLow.cons(var370, var349);
                                }
                            }
                        }
                        var367 = Numbers.add(var367, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var357, var348);
            module0012.$g77$.rebind(var356, var348);
            module0012.$g76$.rebind(var355, var348);
            module0012.$g75$.rebind(var354, var348);
        }
        var349 = Sort.sort(var349, Symbols.symbol_function((SubLObject)$ic138$), Symbols.symbol_function((SubLObject)$ic145$));
        var349 = Sort.stable_sort(var349, Symbols.symbol_function((SubLObject)$ic146$), (SubLObject)UNPROVIDED);
        if (NIL == var347) {
            var349 = Sort.stable_sort(var349, Symbols.symbol_function((SubLObject)$ic147$), (SubLObject)UNPROVIDED);
        }
        return var349;
    }
    
    public static SubLObject f13955(final SubLObject var269, final SubLObject var345, final SubLObject var346, SubLObject var347) {
        if (var347 == UNPROVIDED) {
            var347 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var345) : var345;
        assert NIL != Types.integerp(var346) : var346;
        if (!var345.numLE(var346)) {
            return (SubLObject)NIL;
        }
        SubLObject var348 = (SubLObject)NIL;
        SubLObject var349 = module0226.f15093(var269, (SubLObject)UNPROVIDED);
        SubLObject var350 = (SubLObject)NIL;
        var350 = var349.first();
        while (NIL != var349) {
            if (NIL != module0178.f11375(var350)) {
                final SubLObject var351 = module0178.f11295(var350);
                final SubLObject var352 = module0178.f11296(var350);
                if (NIL != var352 && (NIL == var347 || var347.eql(var351)) && var352.numGE(var345) && var352.numLE(var346)) {
                    var348 = (SubLObject)ConsesLow.cons(var350, var348);
                }
            }
            var349 = var349.rest();
            var350 = var349.first();
        }
        var348 = Sort.sort(var348, Symbols.symbol_function((SubLObject)$ic138$), Symbols.symbol_function((SubLObject)$ic145$));
        var348 = Sort.stable_sort(var348, Symbols.symbol_function((SubLObject)$ic146$), (SubLObject)UNPROVIDED);
        if (NIL == var347) {
            var348 = Sort.stable_sort(var348, Symbols.symbol_function((SubLObject)$ic147$), (SubLObject)UNPROVIDED);
        }
        return var348;
    }
    
    public static SubLObject f13956(final SubLObject var285, final SubLObject var286) {
        return f13927(f13957(var285), f13957(var286), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13950() {
        final SubLObject var361 = $g2361$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13958(final SubLObject var269) {
        return module0034.f1829($g2361$.getGlobalValue(), (SubLObject)ConsesLow.list(var269), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13959(final SubLObject var269) {
        return module0617.f37872(var269, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13957(final SubLObject var269) {
        SubLObject var270 = $g2361$.getGlobalValue();
        if (NIL == var270) {
            var270 = module0034.f1934((SubLObject)$ic148$, (SubLObject)$ic149$, (SubLObject)$ic150$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic151$);
        }
        SubLObject var271 = module0034.f1814(var270, var269, (SubLObject)$ic128$);
        if (var271 == $ic128$) {
            var271 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13959(var269)));
            module0034.f1816(var270, var269, var271, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var271);
    }
    
    public static SubLObject f13960(final SubLObject var285, final SubLObject var286) {
        final SubLObject var287 = f13961(var285);
        final SubLObject var288 = f13961(var286);
        if (NIL != constant_handles_oc.f8449(var287) && NIL != constant_handles_oc.f8449(var288)) {
            return f13927(constants_high_oc.f10743(var287), constants_high_oc.f10743(var288), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f13927(var287, var288, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13951() {
        final SubLObject var361 = $g2362$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13962(final SubLObject var269) {
        return module0034.f1829($g2362$.getGlobalValue(), (SubLObject)ConsesLow.list(var269), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13963(final SubLObject var269) {
        return module0617.f37871(var269, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13961(final SubLObject var269) {
        SubLObject var270 = $g2362$.getGlobalValue();
        if (NIL == var270) {
            var270 = module0034.f1934((SubLObject)$ic152$, (SubLObject)$ic153$, (SubLObject)$ic150$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic151$);
        }
        SubLObject var271 = module0034.f1814(var270, var269, (SubLObject)$ic128$);
        if (var271 == $ic128$) {
            var271 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13963(var269)));
            module0034.f1816(var270, var269, var271, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var271);
    }
    
    public static SubLObject f13964(final SubLObject var366, final SubLObject var367) {
        return f13927(module0178.f11296(var366), module0178.f11296(var367), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13965(final SubLObject var366, final SubLObject var367) {
        final SubLObject var368 = module0178.f11295(var366);
        final SubLObject var369 = module0178.f11295(var367);
        if (NIL != constant_handles_oc.f8449(var368) && NIL != constant_handles_oc.f8449(var369)) {
            return f13927(constants_high_oc.f10743(var368), constants_high_oc.f10743(var369), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f13927(var368, var369, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f13966() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic154$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_371 = var4;
            if (NIL == module0065.f4772(var63_371, (SubLObject)$ic43$)) {
                final SubLObject var65_372 = var63_371;
                if (NIL == module0065.f4775(var65_372, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_372);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11375(var17) && (NIL == var3 || NIL != f13967(var3, var17))) {
                                var3 = var17;
                            }
                        }
                    }
                }
                final SubLObject var72_373 = var63_371;
                if (NIL == module0065.f4777(var72_373) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_373);
                    SubLObject var19 = module0065.f4739(var72_373);
                    final SubLObject var20 = module0065.f4734(var72_373);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11375(var22) && (NIL == var3 || NIL != f13967(var3, var22))) {
                                var3 = var22;
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return var3;
    }
    
    public static SubLObject f13967(final SubLObject var366, final SubLObject var367) {
        if (module0178.f11296(var366).equal(module0178.f11296(var367))) {
            return f13927(module0178.f11298(var366), module0178.f11298(var367), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f13964(var366, var367);
    }
    
    public static SubLObject f13968() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = constant_handles_oc.f8425();
        final SubLObject var5 = (SubLObject)$ic155$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_374 = var4;
            if (NIL == module0065.f4772(var63_374, (SubLObject)$ic43$)) {
                final SubLObject var65_375 = var63_374;
                if (NIL == module0065.f4775(var65_375, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_375);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                        }
                    }
                }
                final SubLObject var72_376 = var63_374;
                if (NIL == module0065.f4777(var72_376) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_376);
                    SubLObject var19 = module0065.f4739(var72_376);
                    final SubLObject var20 = module0065.f4734(var72_376);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var22, var3);
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13969() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0167.f10788();
        final SubLObject var5 = (SubLObject)$ic156$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_377 = var4;
            if (NIL == module0065.f4772(var63_377, (SubLObject)$ic43$)) {
                final SubLObject var65_378 = var63_377;
                if (NIL == module0065.f4775(var65_378, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_378);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                        }
                    }
                }
                final SubLObject var72_379 = var63_377;
                if (NIL == module0065.f4777(var72_379) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_379);
                    SubLObject var19 = module0065.f4739(var72_379);
                    final SubLObject var20 = module0065.f4734(var72_379);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var22, var3);
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13970() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = (SubLObject)$ic157$;
        final SubLObject var5 = module0173.f10962();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var4);
            SubLObject var11 = module0173.f10961();
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                final SubLObject var13 = var12;
                if (NIL == module0065.f4772(var13, (SubLObject)$ic43$)) {
                    final SubLObject var65_384 = var13;
                    if (NIL == module0065.f4775(var65_384, (SubLObject)$ic43$)) {
                        final SubLObject var14 = module0065.f4740(var65_384);
                        final SubLObject var15 = (SubLObject)NIL;
                        SubLObject var16;
                        SubLObject var17;
                        SubLObject var18;
                        SubLObject var19;
                        for (var16 = Sequences.length(var14), var17 = (SubLObject)NIL, var17 = (SubLObject)ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER)) {
                            var18 = ((NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)ONE_INTEGER) : var17);
                            var19 = Vectors.aref(var14, var18);
                            if (NIL == module0065.f4749(var19) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                                if (NIL != module0065.f4749(var19)) {
                                    var19 = (SubLObject)$ic43$;
                                }
                                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                module0012.note_percent_progress(var6, var5);
                                var3 = (SubLObject)ConsesLow.cons(var19, var3);
                            }
                        }
                    }
                    final SubLObject var72_386 = var13;
                    if (NIL == module0065.f4777(var72_386) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        final SubLObject var20 = module0065.f4738(var72_386);
                        SubLObject var21 = module0065.f4739(var72_386);
                        final SubLObject var22 = module0065.f4734(var72_386);
                        final SubLObject var23 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                        while (var21.numL(var22)) {
                            final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                            if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var24)) {
                                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                module0012.note_percent_progress(var6, var5);
                                var3 = (SubLObject)ConsesLow.cons(var24, var3);
                            }
                            var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13971() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = deduction_handles_oc.f11634();
        final SubLObject var5 = (SubLObject)$ic158$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_387 = var4;
            if (NIL == module0065.f4772(var63_387, (SubLObject)$ic43$)) {
                final SubLObject var65_388 = var63_387;
                if (NIL == module0065.f4775(var65_388, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_388);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                        }
                    }
                }
                final SubLObject var72_389 = var63_387;
                if (NIL == module0065.f4777(var72_389) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_389);
                    SubLObject var19 = module0065.f4739(var72_389);
                    final SubLObject var20 = module0065.f4734(var72_389);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var22, var3);
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13972() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0179.f11398();
        final SubLObject var5 = (SubLObject)$ic159$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_390 = var4;
            if (NIL == module0065.f4772(var63_390, (SubLObject)$ic43$)) {
                final SubLObject var65_391 = var63_390;
                if (NIL == module0065.f4775(var65_391, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_391);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                        }
                    }
                }
                final SubLObject var72_392 = var63_390;
                if (NIL == module0065.f4777(var72_392) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_392);
                    SubLObject var19 = module0065.f4739(var72_392);
                    final SubLObject var20 = module0065.f4734(var72_392);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var22, var3);
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13973() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic160$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_393 = var4;
            if (NIL == module0065.f4772(var63_393, (SubLObject)$ic43$)) {
                final SubLObject var65_394 = var63_393;
                if (NIL == module0065.f4775(var65_394, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_394);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                        }
                    }
                }
                final SubLObject var72_395 = var63_393;
                if (NIL == module0065.f4777(var72_395) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_395);
                    SubLObject var19 = module0065.f4739(var72_395);
                    final SubLObject var20 = module0065.f4734(var72_395);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var3 = (SubLObject)ConsesLow.cons(var22, var3);
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13974() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic161$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_396 = var4;
            if (NIL == module0065.f4772(var63_396, (SubLObject)$ic43$)) {
                final SubLObject var65_397 = var63_396;
                if (NIL == module0065.f4775(var65_397, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_397);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11284(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var72_398 = var63_396;
                if (NIL == module0065.f4777(var72_398) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_398);
                    SubLObject var19 = module0065.f4739(var72_398);
                    final SubLObject var20 = module0065.f4734(var72_398);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11284(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13975() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic162$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_399 = var4;
            if (NIL == module0065.f4772(var63_399, (SubLObject)$ic43$)) {
                final SubLObject var65_400 = var63_399;
                if (NIL == module0065.f4775(var65_400, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_400);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11317(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var72_401 = var63_399;
                if (NIL == module0065.f4777(var72_401) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_401);
                    SubLObject var19 = module0065.f4739(var72_401);
                    final SubLObject var20 = module0065.f4734(var72_401);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11317(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13976() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic163$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_402 = var4;
            if (NIL == module0065.f4772(var63_402, (SubLObject)$ic43$)) {
                final SubLObject var65_403 = var63_402;
                if (NIL == module0065.f4775(var65_403, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_403);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11316(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var72_404 = var63_402;
                if (NIL == module0065.f4777(var72_404) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_404);
                    SubLObject var19 = module0065.f4739(var72_404);
                    final SubLObject var20 = module0065.f4734(var72_404);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11316(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13977() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic164$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_405 = var4;
            if (NIL == module0065.f4772(var63_405, (SubLObject)$ic43$)) {
                final SubLObject var65_406 = var63_405;
                if (NIL == module0065.f4775(var65_406, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_406);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11290(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var72_407 = var63_405;
                if (NIL == module0065.f4777(var72_407) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_407);
                    SubLObject var19 = module0065.f4739(var72_407);
                    final SubLObject var20 = module0065.f4734(var72_407);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11290(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13978() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic165$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_408 = var4;
            if (NIL == module0065.f4772(var63_408, (SubLObject)$ic43$)) {
                final SubLObject var65_409 = var63_408;
                if (NIL == module0065.f4775(var65_409, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_409);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11313(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var72_410 = var63_408;
                if (NIL == module0065.f4777(var72_410) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_410);
                    SubLObject var19 = module0065.f4739(var72_410);
                    final SubLObject var20 = module0065.f4734(var72_410);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11313(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13979() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = assertion_handles_oc.f11010();
        final SubLObject var5 = (SubLObject)$ic166$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_411 = var4;
            if (NIL == module0065.f4772(var63_411, (SubLObject)$ic43$)) {
                final SubLObject var65_412 = var63_411;
                if (NIL == module0065.f4775(var65_412, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_412);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11311(var17)) {
                                var3 = (SubLObject)ConsesLow.cons(var17, var3);
                            }
                        }
                    }
                }
                final SubLObject var72_413 = var63_411;
                if (NIL == module0065.f4777(var72_413) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var18 = module0065.f4738(var72_413);
                    SubLObject var19 = module0065.f4739(var72_413);
                    final SubLObject var20 = module0065.f4734(var72_413);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            if (NIL != module0178.f11311(var22)) {
                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f13980() {
        return Sort.sort(Sequences.remove_if((SubLObject)$ic167$, f13976(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic168$, (SubLObject)$ic169$);
    }
    
    public static SubLObject f13981() {
        SubLObject var192 = (SubLObject)NIL;
        final SubLObject var193 = Numbers.add((SubLObject)ONE_INTEGER, module0167.f10810());
        final SubLObject var194 = module0167.f10788();
        if (NIL == module0065.f4772(var194, (SubLObject)$ic43$)) {
            final SubLObject var65_414 = var194;
            if (NIL == module0065.f4775(var65_414, (SubLObject)$ic43$)) {
                final SubLObject var195 = module0065.f4740(var65_414);
                final SubLObject var196 = (SubLObject)NIL;
                SubLObject var197;
                SubLObject var198;
                SubLObject var199;
                SubLObject var200;
                for (var197 = Sequences.length(var195), var198 = (SubLObject)NIL, var198 = (SubLObject)ZERO_INTEGER; var198.numL(var197); var198 = Numbers.add(var198, (SubLObject)ONE_INTEGER)) {
                    var199 = ((NIL != var196) ? Numbers.subtract(var197, var198, (SubLObject)ONE_INTEGER) : var198);
                    var200 = Vectors.aref(var195, var199);
                    if (NIL == module0065.f4749(var200) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        if (NIL != module0065.f4749(var200)) {
                            var200 = (SubLObject)$ic43$;
                        }
                        if (!var199.numL(var193)) {
                            var192 = (SubLObject)ConsesLow.cons(var200, var192);
                        }
                    }
                }
            }
            final SubLObject var72_415 = var194;
            if (NIL == module0065.f4777(var72_415) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                final SubLObject var201 = module0065.f4738(var72_415);
                SubLObject var202 = module0065.f4739(var72_415);
                final SubLObject var203 = module0065.f4734(var72_415);
                final SubLObject var204 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                while (var202.numL(var203)) {
                    final SubLObject var205 = Hashtables.gethash_without_values(var202, var201, var204);
                    if ((NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var205)) && !var202.numL(var193)) {
                        var192 = (SubLObject)ConsesLow.cons(var205, var192);
                    }
                    var202 = Numbers.add(var202, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var192);
    }
    
    public static SubLObject f13982() {
        return (SubLObject)ConsesLow.list(constant_handles_oc.f8433(), module0167.f10796(), assertion_handles_oc.f11019(), module0179.f11409(), deduction_handles_oc.f11643());
    }
    
    public static SubLObject f13983(final SubLObject var416, final SubLObject var417) {
        return Numbers.subtract(var416.first(), var417.first());
    }
    
    public static SubLObject f13984(final SubLObject var416, final SubLObject var417) {
        return Numbers.subtract(conses_high.second(var416), conses_high.second(var417));
    }
    
    public static SubLObject f13985(final SubLObject var416, final SubLObject var417) {
        return Numbers.subtract(conses_high.third(var416), conses_high.third(var417));
    }
    
    public static SubLObject f13986(final SubLObject var416, final SubLObject var417) {
        return Numbers.subtract(conses_high.fourth(var416), conses_high.fourth(var417));
    }
    
    public static SubLObject f13987(final SubLObject var416, final SubLObject var417) {
        return Numbers.subtract(conses_high.fifth(var416), conses_high.fifth(var417));
    }
    
    public static SubLObject f13988(final SubLObject var416, final SubLObject var417) {
        return Equality.equal(var416, var417);
    }
    
    public static SubLObject f13989(final SubLObject var418, final SubLObject var419) {
        SubLObject var421;
        final SubLObject var420 = var421 = var418.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic170$);
        final SubLObject var422 = var421.rest();
        var421 = var421.first();
        SubLObject var423 = (SubLObject)NIL;
        SubLObject var424 = var421;
        SubLObject var425 = (SubLObject)NIL;
        SubLObject var426_427 = (SubLObject)NIL;
        while (NIL != var424) {
            cdestructuring_bind.destructuring_bind_must_consp(var424, var420, (SubLObject)$ic170$);
            var426_427 = var424.first();
            var424 = var424.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var424, var420, (SubLObject)$ic170$);
            if (NIL == conses_high.member(var426_427, (SubLObject)$ic171$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var425 = (SubLObject)T;
            }
            if (var426_427 == $ic172$) {
                var423 = var424.first();
            }
            var424 = var424.rest();
        }
        if (NIL != var425 && NIL == var423) {
            cdestructuring_bind.cdestructuring_bind_error(var420, (SubLObject)$ic170$);
        }
        final SubLObject var426 = cdestructuring_bind.property_list_member((SubLObject)$ic173$, var421);
        final SubLObject var427 = (SubLObject)((NIL != var426) ? conses_high.cadr(var426) : NIL);
        final SubLObject var428 = cdestructuring_bind.property_list_member((SubLObject)$ic174$, var421);
        final SubLObject var429 = (SubLObject)((NIL != var428) ? conses_high.cadr(var428) : NIL);
        final SubLObject var430;
        var421 = (var430 = var422);
        final SubLObject var431 = (SubLObject)$ic175$;
        final SubLObject var432 = (SubLObject)$ic176$;
        final SubLObject var433 = (SubLObject)$ic177$;
        final SubLObject var434 = (SubLObject)$ic178$;
        final SubLObject var435 = (SubLObject)$ic179$;
        final SubLObject var436 = (SubLObject)$ic180$;
        final SubLObject var437 = (SubLObject)$ic181$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic182$, (SubLObject)ConsesLow.list(reader.bq_cons(var431, (SubLObject)$ic183$)), ConsesLow.append(var430, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic182$, (SubLObject)ConsesLow.list(reader.bq_cons(var432, (SubLObject)$ic183$), (SubLObject)ConsesLow.list(var433, (SubLObject)ConsesLow.list((SubLObject)$ic184$, var432, var431)), (SubLObject)ConsesLow.list(var434, (SubLObject)ConsesLow.list((SubLObject)$ic185$, var432, var431)), (SubLObject)ConsesLow.list(var435, (SubLObject)ConsesLow.list((SubLObject)$ic186$, var432, var431)), (SubLObject)ConsesLow.list(var436, (SubLObject)ConsesLow.list((SubLObject)$ic187$, var432, var431)), (SubLObject)ConsesLow.list(var437, (SubLObject)ConsesLow.list((SubLObject)$ic188$, var432, var431))), (SubLObject)ConsesLow.list((SubLObject)$ic189$, (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.list((SubLObject)$ic191$, var433), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var434), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var435), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var436), (SubLObject)ConsesLow.list((SubLObject)$ic191$, var437)), (SubLObject)ConsesLow.list((SubLObject)$ic192$, (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var427), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic195$, var427)), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic191$, var433), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic196$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var433), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var433), (SubLObject)$ic199$), (SubLObject)$ic200$), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.list((SubLObject)$ic201$, var433), (SubLObject)$ic202$))), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic191$, var434), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic203$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var434), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var434), (SubLObject)$ic199$), (SubLObject)$ic200$), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.list((SubLObject)$ic201$, var434), (SubLObject)$ic202$))), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic191$, var435), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic204$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var435), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var435), (SubLObject)$ic199$), (SubLObject)$ic200$), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.list((SubLObject)$ic201$, var435), (SubLObject)$ic202$))), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic191$, var436), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic205$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var436), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var436), (SubLObject)$ic199$), (SubLObject)$ic200$), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.list((SubLObject)$ic201$, var436), (SubLObject)$ic202$))), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic191$, var437), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic206$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var437), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic197$, var437), (SubLObject)$ic199$), (SubLObject)$ic200$), (SubLObject)ConsesLow.listS((SubLObject)$ic198$, (SubLObject)ConsesLow.list((SubLObject)$ic201$, var437), (SubLObject)$ic202$)))), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var429), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)T, (SubLObject)$ic195$, var429))), (SubLObject)$ic207$))));
    }
    
    public static SubLObject f13990() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = constant_handles_oc.f8425();
        final SubLObject var5 = (SubLObject)$ic208$;
        final SubLObject var6 = module0065.f4733(var4);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var5) : var5;
        final SubLObject var8 = module0012.$g75$.currentBinding(var2);
        final SubLObject var9 = module0012.$g76$.currentBinding(var2);
        final SubLObject var10 = module0012.$g77$.currentBinding(var2);
        final SubLObject var11 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var5);
            final SubLObject var63_434 = var4;
            if (NIL == module0065.f4772(var63_434, (SubLObject)$ic43$)) {
                final SubLObject var65_435 = var63_434;
                if (NIL == module0065.f4775(var65_435, (SubLObject)$ic43$)) {
                    final SubLObject var12 = module0065.f4740(var65_435);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var19;
                    SubLObject var20;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic43$;
                            }
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            var18 = module0617.f37872(var17, (SubLObject)UNPROVIDED);
                            var19 = module0617.f37875(var17, (SubLObject)UNPROVIDED);
                            var20 = f13991(var17);
                            if (NIL == var18) {
                                var18 = f13992(var17);
                            }
                            if (NIL == var19) {
                                var19 = (SubLObject)$ic209$;
                            }
                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var17, var18, var19, var20, var18), var3);
                        }
                    }
                }
                final SubLObject var72_440 = var63_434;
                if (NIL == module0065.f4777(var72_440) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                    final SubLObject var21 = module0065.f4738(var72_440);
                    SubLObject var22 = module0065.f4739(var72_440);
                    final SubLObject var23 = module0065.f4734(var72_440);
                    final SubLObject var24 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                    while (var22.numL(var23)) {
                        final SubLObject var25 = Hashtables.gethash_without_values(var22, var21, var24);
                        if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var25)) {
                            module0012.note_percent_progress(var7, var6);
                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                            SubLObject var26 = module0617.f37872(var25, (SubLObject)UNPROVIDED);
                            SubLObject var27 = module0617.f37875(var25, (SubLObject)UNPROVIDED);
                            final SubLObject var28 = f13991(var25);
                            if (NIL == var26) {
                                var26 = f13992(var25);
                            }
                            if (NIL == var27) {
                                var27 = (SubLObject)$ic209$;
                            }
                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, var26, var27, var28, var26), var3);
                        }
                        var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var11, var2);
            module0012.$g77$.rebind(var10, var2);
            module0012.$g76$.rebind(var9, var2);
            module0012.$g75$.rebind(var8, var2);
        }
        var3 = Sequences.nreverse(var3);
        var3 = Sort.stable_sort(var3, (SubLObject)$ic210$, Symbols.symbol_function((SubLObject)$ic211$));
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = var3;
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            final SubLObject var32 = conses_high.second(var31);
            if (var32.isNumber()) {
                var29 = var32;
            }
            else {
                ConsesLow.rplaca(conses_high.nthcdr((SubLObject)FOUR_INTEGER, var31), var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        var3 = Sort.stable_sort(var3, (SubLObject)$ic212$, Symbols.symbol_function((SubLObject)$ic38$));
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic213$), var3);
    }
    
    public static SubLObject f13992(final SubLObject var436) {
        SubLObject var437 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var438 = module0226.f15093(var436, (SubLObject)NIL);
        SubLObject var439 = (SubLObject)NIL;
        var439 = var438.first();
        while (NIL != var438) {
            final SubLObject var440 = module0178.f11296(var439);
            if (NIL != var440 && var440.numL(var437)) {
                var437 = var440;
            }
            var438 = var438.rest();
            var439 = var438.first();
        }
        if (var437.numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            return (SubLObject)$ic214$;
        }
        return var437;
    }
    
    public static SubLObject f13991(final SubLObject var436) {
        SubLObject var437 = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject var438 = module0226.f15093(var436, (SubLObject)NIL);
        SubLObject var439 = (SubLObject)NIL;
        var439 = var438.first();
        while (NIL != var438) {
            final SubLObject var440 = assertion_handles_oc.f11025(var439);
            if (NIL != var440 && var440.numL(var437)) {
                var437 = var440;
            }
            var438 = var438.rest();
            var439 = var438.first();
        }
        if (var437.numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            return (SubLObject)$ic215$;
        }
        return var437;
    }
    
    public static SubLObject f13993(final SubLObject var446, final SubLObject var447) {
        SubLObject var448 = (SubLObject)NIL;
        SubLObject var449 = (SubLObject)NIL;
        SubLObject var450 = (SubLObject)NIL;
        SubLObject var451 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var446, var446, (SubLObject)$ic216$);
        var448 = var446.first();
        SubLObject var452 = var446.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var452, var446, (SubLObject)$ic216$);
        var449 = var452.first();
        var452 = var452.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var452, var446, (SubLObject)$ic216$);
        var450 = var452.first();
        var452 = var452.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var452, var446, (SubLObject)$ic216$);
        var451 = var452.first();
        var452 = var452.rest();
        if (NIL == var452) {
            SubLObject var453 = (SubLObject)NIL;
            SubLObject var454 = (SubLObject)NIL;
            SubLObject var455 = (SubLObject)NIL;
            SubLObject var456 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var447, var447, (SubLObject)$ic217$);
            var453 = var447.first();
            SubLObject var456_457 = var447.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var456_457, var447, (SubLObject)$ic217$);
            var454 = var456_457.first();
            var456_457 = var456_457.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var456_457, var447, (SubLObject)$ic217$);
            var455 = var456_457.first();
            var456_457 = var456_457.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var456_457, var447, (SubLObject)$ic217$);
            var456 = var456_457.first();
            var456_457 = var456_457.rest();
            if (NIL == var456_457) {
                if (var451.isNumber() && var456.isNumber() && var451.numL(var456)) {
                    return (SubLObject)T;
                }
                if (var451.isNumber() && var456.isNumber() && var451.numG(var456)) {
                    return (SubLObject)NIL;
                }
                if (var449.isNumber() && var454.isNumber() && var449.numL(var454)) {
                    return (SubLObject)T;
                }
                if (var449.isNumber() && var454.isNumber() && var449.numG(var454)) {
                    return (SubLObject)NIL;
                }
                if (var450.isNumber() && var455.isNumber() && var450.numL(var455)) {
                    return (SubLObject)T;
                }
                if (var450.isNumber() && var455.isNumber() && var450.numG(var455)) {
                    return (SubLObject)NIL;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var447, (SubLObject)$ic217$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var446, (SubLObject)$ic216$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13994(final SubLObject var462, final SubLObject var463) {
        return (SubLObject)(var462.isNumber() ? (var463.isNumber() ? Numbers.numL(var462, var463) : T) : (var463.isNumber() ? NIL : NIL));
    }
    
    public static SubLObject f13995(final SubLObject var464) {
        if (NIL != module0259.f16854(var464, $ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return $ic17$;
        }
        if (NIL != module0259.f16854(var464, $ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return $ic27$;
        }
        if (NIL != module0259.f16854(var464, $ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return $ic29$;
        }
        if (NIL != module0259.f16854(var464, $ic218$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return $ic218$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13996(final SubLObject var418, final SubLObject var419) {
        SubLObject var421;
        final SubLObject var420 = var421 = var418.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic219$);
        final SubLObject var422 = var421.rest();
        var421 = var421.first();
        SubLObject var423 = (SubLObject)NIL;
        SubLObject var424 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic219$);
        var423 = var421.first();
        var421 = var421.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic219$);
        var424 = var421.first();
        var421 = var421.rest();
        SubLObject var425 = (SubLObject)NIL;
        SubLObject var426 = var421;
        SubLObject var427 = (SubLObject)NIL;
        SubLObject var472_473 = (SubLObject)NIL;
        while (NIL != var426) {
            cdestructuring_bind.destructuring_bind_must_consp(var426, var420, (SubLObject)$ic219$);
            var472_473 = var426.first();
            var426 = var426.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var426, var420, (SubLObject)$ic219$);
            if (NIL == conses_high.member(var472_473, (SubLObject)$ic220$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var427 = (SubLObject)T;
            }
            if (var472_473 == $ic172$) {
                var425 = var426.first();
            }
            var426 = var426.rest();
        }
        if (NIL != var427 && NIL == var425) {
            cdestructuring_bind.cdestructuring_bind_error(var420, (SubLObject)$ic219$);
        }
        final SubLObject var428 = cdestructuring_bind.property_list_member((SubLObject)$ic221$, var421);
        final SubLObject var429 = (SubLObject)((NIL != var428) ? conses_high.cadr(var428) : NIL);
        final SubLObject var430 = cdestructuring_bind.property_list_member((SubLObject)$ic222$, var421);
        final SubLObject var431 = (SubLObject)((NIL != var430) ? conses_high.cadr(var430) : NIL);
        final SubLObject var432 = cdestructuring_bind.property_list_member((SubLObject)$ic223$, var421);
        final SubLObject var433 = (SubLObject)((NIL != var432) ? conses_high.cadr(var432) : NIL);
        final SubLObject var434 = cdestructuring_bind.property_list_member((SubLObject)$ic224$, var421);
        final SubLObject var435 = (SubLObject)((NIL != var434) ? conses_high.cadr(var434) : NIL);
        final SubLObject var436 = cdestructuring_bind.property_list_member((SubLObject)$ic225$, var421);
        final SubLObject var437 = (SubLObject)((NIL != var436) ? conses_high.cadr(var436) : NIL);
        final SubLObject var438;
        var421 = (var438 = var422);
        final SubLObject var439 = (SubLObject)$ic226$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic182$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var439, (SubLObject)ConsesLow.listS((SubLObject)$ic227$, var424, (SubLObject)$ic228$))), (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic229$, var431), (SubLObject)ConsesLow.list((SubLObject)$ic230$, var431, var439)), (SubLObject)ConsesLow.list((SubLObject)$ic231$, (SubLObject)ConsesLow.list(var423, var439, (SubLObject)$ic223$, var433, (SubLObject)$ic225$, var437), (SubLObject)ConsesLow.listS((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic232$, (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.list((SubLObject)$ic233$, var435), (SubLObject)ConsesLow.list((SubLObject)EQ, var435, (SubLObject)ConsesLow.list((SubLObject)$ic234$, var423))), (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.list((SubLObject)$ic233$, var431), (SubLObject)ConsesLow.list((SubLObject)EQUAL, var431, (SubLObject)ConsesLow.list((SubLObject)$ic235$, (SubLObject)ConsesLow.list((SubLObject)$ic236$, var423)))), (SubLObject)ConsesLow.list((SubLObject)$ic198$, var429, (SubLObject)ConsesLow.list((SubLObject)EQUAL, var424, (SubLObject)ConsesLow.list((SubLObject)$ic237$, (SubLObject)ConsesLow.list((SubLObject)$ic236$, var423), var429)), (SubLObject)ConsesLow.list((SubLObject)$ic238$, var424, (SubLObject)ConsesLow.list((SubLObject)$ic236$, var423)))), ConsesLow.append(var438, (SubLObject)NIL))));
    }
    
    public static SubLObject f13997(final SubLObject var418, final SubLObject var419) {
        SubLObject var421;
        final SubLObject var420 = var421 = var418.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic239$);
        final SubLObject var422 = var421.rest();
        var421 = var421.first();
        SubLObject var423 = (SubLObject)NIL;
        SubLObject var424 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic239$);
        var423 = var421.first();
        var421 = var421.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var421, var420, (SubLObject)$ic239$);
        var424 = var421.first();
        var421 = var421.rest();
        SubLObject var425 = (SubLObject)NIL;
        SubLObject var426 = var421;
        SubLObject var427 = (SubLObject)NIL;
        SubLObject var491_492 = (SubLObject)NIL;
        while (NIL != var426) {
            cdestructuring_bind.destructuring_bind_must_consp(var426, var420, (SubLObject)$ic239$);
            var491_492 = var426.first();
            var426 = var426.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var426, var420, (SubLObject)$ic239$);
            if (NIL == conses_high.member(var491_492, (SubLObject)$ic240$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var427 = (SubLObject)T;
            }
            if (var491_492 == $ic172$) {
                var425 = var426.first();
            }
            var426 = var426.rest();
        }
        if (NIL != var427 && NIL == var425) {
            cdestructuring_bind.cdestructuring_bind_error(var420, (SubLObject)$ic239$);
        }
        final SubLObject var428 = cdestructuring_bind.property_list_member((SubLObject)$ic223$, var421);
        final SubLObject var429 = (SubLObject)((NIL != var428) ? conses_high.cadr(var428) : NIL);
        final SubLObject var430 = cdestructuring_bind.property_list_member((SubLObject)$ic225$, var421);
        final SubLObject var431 = (SubLObject)((NIL != var430) ? conses_high.cadr(var430) : NIL);
        final SubLObject var432;
        var421 = (var432 = var422);
        final SubLObject var433 = (SubLObject)$ic241$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic182$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var433, (SubLObject)ConsesLow.listS((SubLObject)$ic227$, var424, (SubLObject)$ic242$))), (SubLObject)ConsesLow.list((SubLObject)$ic231$, (SubLObject)ConsesLow.list(var423, var433, (SubLObject)$ic223$, var429, (SubLObject)$ic225$, var431), (SubLObject)ConsesLow.listS((SubLObject)$ic193$, (SubLObject)ConsesLow.list((SubLObject)$ic232$, (SubLObject)ConsesLow.list((SubLObject)$ic243$, (SubLObject)ConsesLow.list((SubLObject)$ic238$, var424, (SubLObject)ConsesLow.list((SubLObject)$ic236$, var423))), (SubLObject)ConsesLow.list((SubLObject)$ic190$, (SubLObject)ConsesLow.listS((SubLObject)$ic244$, var424, (SubLObject)ConsesLow.list((SubLObject)$ic236$, var423), (SubLObject)$ic245$), (SubLObject)ConsesLow.listS((SubLObject)$ic244$, var424, (SubLObject)ConsesLow.list((SubLObject)$ic246$, var423), (SubLObject)$ic245$))), ConsesLow.append(var432, (SubLObject)NIL))));
    }
    
    public static SubLObject f13998(final SubLObject var495, final SubLObject var269, final SubLObject var496, SubLObject var477, SubLObject var479, SubLObject var55) {
        if (var477 == UNPROVIDED) {
            var477 = (SubLObject)NIL;
        }
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)NIL;
        }
        final SubLThread var497 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var495) : var495;
        assert NIL != module0172.f10917(var269) : var269;
        assert NIL != module0004.f105(var496) : var496;
        SubLObject var498 = (SubLObject)NIL;
        try {
            var497.throwStack.push($ic249$);
            final SubLObject var499 = var55;
            final SubLObject var500 = module0147.$g2094$.currentBinding(var497);
            final SubLObject var501 = module0147.$g2095$.currentBinding(var497);
            try {
                module0147.$g2094$.bind(module0147.f9536(var499), var497);
                module0147.$g2095$.bind(module0147.f9537(var499), var497);
                SubLObject var502 = module0205.f13183(var269, (SubLObject)$ic229$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0212.f13762(var477)) {
                    var502 = (SubLObject)ConsesLow.cons(var477, var502);
                }
                SubLObject var503 = module0218.f14453(var502, (SubLObject)UNPROVIDED);
                SubLObject var504 = (SubLObject)NIL;
                var504 = var503.first();
                while (NIL != var503) {
                    if ((NIL == var479 || NIL != module0178.f11343(var504, var479)) && (NIL == var477 || var477.equal(module0205.f13136(module0178.f11303(var504)))) && NIL != ((NIL != var496) ? Equality.equal(var269, module0205.f13134(module0178.f11303(var504), var496, (SubLObject)UNPROVIDED)) : module0202.f12962(var269, module0178.f11303(var504)))) {
                        Functions.funcall(var495, var504);
                    }
                    var503 = var503.rest();
                    var504 = var503.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var501, var497);
                module0147.$g2094$.rebind(var500, var497);
            }
        }
        catch (Throwable var505) {
            var498 = Errors.handleThrowable(var505, (SubLObject)$ic249$);
        }
        finally {
            var497.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13999(final SubLObject var495, final SubLObject var269, SubLObject var479) {
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        assert NIL != Types.function_spec_p(var495) : var495;
        assert NIL != module0172.f10917(var269) : var269;
        final SubLObject var496 = module0205.f13183(var269, (SubLObject)$ic229$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var497 = module0218.f14453(var496, (SubLObject)UNPROVIDED);
        SubLObject var498 = (SubLObject)NIL;
        var498 = var497.first();
        while (NIL != var497) {
            if ((NIL == var479 || NIL != module0178.f11343(var498, var479)) && NIL == module0202.f12962(var269, module0178.f11303(var498)) && (NIL != module0205.f13220(var269, module0178.f11303(var498), (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) || NIL != module0205.f13220(var269, module0178.f11287(var498), (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED))) {
                Functions.funcall(var495, var498);
            }
            var497 = var497.rest();
            var498 = var497.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14000(final SubLObject var501, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = $ic250$;
        }
        final SubLThread var502 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12676(var501) : var501;
        final SubLObject var503 = f14001(var501, var55);
        if ($ic252$.eql(var503)) {
            return var503;
        }
        SubLObject var504 = module0202.f12768($ic253$, var503, var501);
        if (NIL != $g2363$.getDynamicValue(var502)) {
            var504 = module0293.f19713(var504, var55, (SubLObject)$ic254$);
            var504 = module0293.f19713(var504, var55, (SubLObject)$ic255$);
        }
        return var504;
    }
    
    public static SubLObject f14001(final SubLObject var501, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12678(var501)) {
            SubLObject var503;
            final SubLObject var502 = var503 = module0205.f13304(var501, (SubLObject)UNPROVIDED);
            SubLObject var504 = (SubLObject)NIL;
            SubLObject var505 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var503, var502, (SubLObject)$ic256$);
            var504 = var503.first();
            var503 = var503.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var503, var502, (SubLObject)$ic256$);
            var505 = var503.first();
            var503 = var503.rest();
            if (NIL != var503) {
                cdestructuring_bind.cdestructuring_bind_error(var502, (SubLObject)$ic256$);
                return (SubLObject)NIL;
            }
            final SubLObject var506 = module0307.f20803(var504, var505, var55, (SubLObject)UNPROVIDED);
            if (NIL == var506) {
                return $ic252$;
            }
            if (NIL != module0035.f1997(var506)) {
                return var506.first();
            }
            if (NIL != module0035.f1998(var506)) {
                return module0202.f12768($ic257$, var506.first(), conses_high.second(var506));
            }
            return module0202.f12643($ic258$, module0202.f12720($ic259$, var506, (SubLObject)UNPROVIDED));
        }
        else {
            if (NIL != module0202.f12680(var501)) {
                return $ic260$;
            }
            if (NIL != module0202.f12679(var501)) {
                return $ic252$;
            }
            return Errors.error((SubLObject)$ic261$, var501);
        }
    }
    
    public static SubLObject f14002() {
        final SubLObject var361 = $g2364$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14003(final SubLObject var507, final SubLObject var55) {
        return module0034.f1829($g2364$.getGlobalValue(), (SubLObject)ConsesLow.list(var507, var55), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14004(final SubLObject var507, final SubLObject var55) {
        return module0256.f16570(var507, var55, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14005(final SubLObject var507, final SubLObject var55) {
        SubLObject var508 = $g2364$.getGlobalValue();
        if (NIL == var508) {
            var508 = module0034.f1934((SubLObject)$ic262$, (SubLObject)$ic263$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic264$);
        }
        final SubLObject var509 = module0034.f1782(var507, var55);
        final SubLObject var510 = module0034.f1814(var508, var509, (SubLObject)UNPROVIDED);
        if (var510 != $ic128$) {
            SubLObject var511 = var510;
            SubLObject var512 = (SubLObject)NIL;
            var512 = var511.first();
            while (NIL != var511) {
                SubLObject var513 = var512.first();
                final SubLObject var514 = conses_high.second(var512);
                if (var507.eql(var513.first())) {
                    var513 = var513.rest();
                    if (NIL != var513 && NIL == var513.rest() && var55.eql(var513.first())) {
                        return module0034.f1959(var514);
                    }
                }
                var511 = var511.rest();
                var512 = var511.first();
            }
        }
        final SubLObject var515 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14004(var507, var55)));
        module0034.f1836(var508, var509, var510, var515, (SubLObject)ConsesLow.list(var507, var55));
        return module0034.f1959(var515);
    }
    
    public static SubLObject f14006(final SubLObject var515, SubLObject var516, SubLObject var55) {
        if (var516 == UNPROVIDED) {
            var516 = (SubLObject)$ic265$;
        }
        if (var55 == UNPROVIDED) {
            var55 = $ic34$;
        }
        final SubLObject var517 = f14005(var515, var55);
        final SubLObject var518 = f14005(var516, var55);
        return Numbers.divide(var517, var518);
    }
    
    public static SubLObject f14007(final SubLObject var507, final SubLObject var55) {
        return Sequences.count_if((SubLObject)$ic266$, module0256.f16569(var507, var55, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14008(final SubLObject var515, SubLObject var516, SubLObject var55) {
        if (var516 == UNPROVIDED) {
            var516 = (SubLObject)$ic265$;
        }
        if (var55 == UNPROVIDED) {
            var55 = $ic34$;
        }
        final SubLObject var517 = f14007(var515, var55);
        final SubLObject var518 = f14007(var516, var55);
        return Numbers.divide(var517, var518);
    }
    
    public static SubLObject f14009(final SubLObject var77, final SubLObject var519, final SubLObject var520, final SubLObject var521) {
        final SubLThread var522 = SubLProcess.currentSubLThread();
        SubLObject var523 = (SubLObject)$ic265$;
        final SubLObject var524 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var525 = var523;
        final SubLObject var526 = (SubLObject)ONE_INTEGER;
        SubLObject var528;
        SubLObject var527 = var528 = module0549.f33901($ic260$);
        final SubLObject var529 = (SubLObject)ZERO_INTEGER;
        final SubLObject var530 = module0147.$g2094$.currentBinding(var522);
        final SubLObject var531 = module0147.$g2095$.currentBinding(var522);
        try {
            module0147.$g2094$.bind((SubLObject)$ic33$, var522);
            module0147.$g2095$.bind($ic34$, var522);
            final SubLObject var532 = module0139.$g1630$.getDynamicValue(var522);
            final SubLObject var20_530 = module0139.$g1631$.currentBinding(var522);
            final SubLObject var25_531 = module0139.$g1632$.currentBinding(var522);
            final SubLObject var533 = module0139.$g1630$.currentBinding(var522);
            try {
                module0139.$g1631$.bind(module0139.f9015(var532, (SubLObject)SIX_INTEGER), var522);
                module0139.$g1632$.bind(module0139.f9016(var532), var522);
                module0139.$g1630$.bind((SubLObject)T, var522);
                while (NIL != module0035.f1993(var525, var77, (SubLObject)UNPROVIDED) || var526.numL(var529) || var527.numG(var519) || var528.numL(var520)) {
                    final SubLObject var534 = module0048.f3381(var523, Symbols.symbol_function((SubLObject)$ic270$));
                    var523 = Sequences.remove(var534, var523, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0077.f5326(var534, var524);
                    var523 = f14010(var534, var523, var524, var520);
                    var523 = Sort.sort(var523, Symbols.symbol_function((SubLObject)$ic37$), Symbols.symbol_function((SubLObject)$ic270$));
                    var525 = module0035.f2124(var77, var523);
                    var527 = module0549.f33901(var525.first());
                    var528 = module0549.f33901(module0035.f2114(var525));
                    print_high.print((SubLObject)ConsesLow.list(var527, var528, var534, Sequences.length(var523)), (SubLObject)UNPROVIDED);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0139.$g1630$.rebind(var533, var522);
                module0139.$g1632$.rebind(var25_531, var522);
                module0139.$g1631$.rebind(var20_530, var522);
            }
        }
        finally {
            module0147.$g2095$.rebind(var531, var522);
            module0147.$g2094$.rebind(var530, var522);
        }
        SubLObject var535;
        for (var535 = (SubLObject)NIL, var535 = (SubLObject)ZERO_INTEGER; var535.numL(var521); var535 = Numbers.add(var535, (SubLObject)ONE_INTEGER)) {
            var525 = f14011(var523, var77);
        }
        return var525;
    }
    
    public static SubLObject f14012(final SubLObject var507) {
        final SubLThread var508 = SubLProcess.currentSubLThread();
        streams_high.terpri((SubLObject)UNPROVIDED);
        streams_high.terpri((SubLObject)UNPROVIDED);
        SubLObject var509 = var507;
        SubLObject var510 = (SubLObject)NIL;
        var510 = var509.first();
        while (NIL != var509) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic271$, module0549.f33901(var510), var510);
            var509 = var509.rest();
            var510 = var509.first();
        }
        final SubLObject var511 = reader.$read_default_float_format$.currentBinding(var508);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic0$, var508);
            PrintLow.format((SubLObject)T, (SubLObject)$ic272$, Numbers.multiply((SubLObject)$ic273$, module0048.f3302(f14013(var507), (SubLObject)FOUR_INTEGER)));
        }
        finally {
            reader.$read_default_float_format$.rebind(var511, var508);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14011(final SubLObject var507, final SubLObject var77) {
        PrintLow.format((SubLObject)T, (SubLObject)$ic274$);
        SubLObject var508 = (SubLObject)NIL;
        final SubLObject var509 = module0035.f2124(var77, var507);
        SubLObject var510 = var507;
        SubLObject var511 = (SubLObject)NIL;
        var511 = var510.first();
        while (NIL != var510) {
            final SubLObject var512 = f14014(var511, Sequences.remove(var511, var509, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            PrintLow.format((SubLObject)T, (SubLObject)$ic275$, new SubLObject[] { var511, var512, var512 });
            streams_high.force_output((SubLObject)UNPROVIDED);
            var508 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var511, var512), var508);
            var510 = var510.rest();
            var511 = var510.first();
        }
        final SubLObject var513 = module0035.f2124(var77, module0035.f2062(module0035.f2326(var508, Symbols.symbol_function((SubLObject)$ic37$))));
        return var513;
    }
    
    public static SubLObject f14010(final SubLObject var532, final SubLObject var535, final SubLObject var523, final SubLObject var520) {
        final SubLThread var536 = SubLProcess.currentSubLThread();
        SubLObject var537 = (SubLObject)NIL;
        final SubLObject var538 = $g2369$.currentBinding(var536);
        try {
            $g2369$.bind(var520, var536);
            SubLObject var540;
            final SubLObject var539 = var540 = Sequences.remove_if((SubLObject)$ic276$, module0256.f16539(var532, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var541 = (SubLObject)NIL;
            var541 = var540.first();
            while (NIL != var540) {
                if (NIL == module0077.f5320(var541, var523) && NIL == module0078.f5361(f14015(var541), Mapping.mapcar((SubLObject)$ic277$, var535))) {
                    var537 = (SubLObject)ConsesLow.cons(var541, var537);
                }
                var540 = var540.rest();
                var541 = var540.first();
            }
        }
        finally {
            $g2369$.rebind(var538, var536);
        }
        return ConsesLow.append(var537, var535);
    }
    
    public static SubLObject f14016() {
        final SubLObject var361 = $g2370$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14017() {
        return module0034.f1829($g2370$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14018() {
        return module0078.f5348((SubLObject)ConsesLow.list(module0078.f5367(module0259.f16856($g2365$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), module0078.f5367(module0259.f16984($g2366$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), module0078.f5367(module0256.f16569($g2368$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), module0078.f5367($g2367$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)), Symbols.symbol_function((SubLObject)EQL));
    }
    
    public static SubLObject f14019() {
        SubLObject var362 = $g2370$.getGlobalValue();
        if (NIL == var362) {
            var362 = module0034.f1934((SubLObject)$ic278$, (SubLObject)$ic279$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic280$);
        }
        SubLObject var363 = module0034.f1810(var362, (SubLObject)UNPROVIDED);
        if (var363 == $ic128$) {
            var363 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14018()));
            module0034.f1812(var362, var363, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var363);
    }
    
    public static SubLObject f14020(final SubLObject var199) {
        final SubLThread var200 = SubLProcess.currentSubLThread();
        if (NIL != module0167.f10813(var199)) {
            return (SubLObject)T;
        }
        if (NIL != $g2369$.getDynamicValue(var200) && module0549.f33901(var199).numL($g2369$.getDynamicValue(var200))) {
            return (SubLObject)T;
        }
        if (NIL != module0077.f5320(var199, f14019())) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14014(final SubLObject var199, final SubLObject var507) {
        final SubLObject var508 = f14015(var199);
        final SubLObject var509 = module0077.f5311(var508);
        final SubLObject var510 = module0078.f5348(Mapping.mapcar((SubLObject)$ic277$, var507), Symbols.symbol_function((SubLObject)EQL));
        final SubLObject var511 = module0078.f5351((SubLObject)ConsesLow.list(var508, var510), Symbols.symbol_function((SubLObject)EQL));
        final SubLObject var512 = module0077.f5311(var511);
        final SubLObject var513 = Numbers.subtract(var509, var512);
        return var513;
    }
    
    public static SubLObject f14021(final SubLObject var545, final SubLObject var546) {
        final SubLObject var547 = f14015(var545);
        final SubLObject var548 = module0077.f5311(var547);
        final SubLObject var549 = f14015(var546);
        final SubLObject var550 = module0077.f5311(var549);
        final SubLObject var551 = module0078.f5351((SubLObject)ConsesLow.list(var547, var549), Symbols.symbol_function((SubLObject)EQL));
        final SubLObject var552 = module0077.f5311(var551);
        final SubLObject var553 = Numbers.subtract(var548, var552);
        final SubLObject var554 = Numbers.subtract(var550, var552);
        return Values.values(var553, var554);
    }
    
    public static SubLObject f14022() {
        final SubLObject var361 = $g2371$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14023(final SubLObject var199) {
        return module0034.f1829($g2371$.getGlobalValue(), (SubLObject)ConsesLow.list(var199), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14024(final SubLObject var199) {
        return module0078.f5367(module0256.f16552(var199, $ic34$, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14015(final SubLObject var199) {
        SubLObject var200 = $g2371$.getGlobalValue();
        if (NIL == var200) {
            var200 = module0034.f1934((SubLObject)$ic277$, (SubLObject)$ic281$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1949((SubLObject)$ic282$);
        }
        SubLObject var201 = module0034.f1814(var200, var199, (SubLObject)$ic128$);
        if (var201 == $ic128$) {
            var201 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14024(var199)));
            module0034.f1816(var200, var199, var201, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var201);
    }
    
    public static SubLObject f14025() {
        final SubLObject var361 = $g2372$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14026(final SubLObject var199) {
        return module0034.f1829($g2372$.getGlobalValue(), (SubLObject)ConsesLow.list(var199), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14027(final SubLObject var199) {
        return module0078.f5367(module0256.f16531(var199, $ic34$, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14028(final SubLObject var199) {
        SubLObject var200 = $g2372$.getGlobalValue();
        if (NIL == var200) {
            var200 = module0034.f1934((SubLObject)$ic283$, (SubLObject)$ic284$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1949((SubLObject)$ic285$);
        }
        SubLObject var201 = module0034.f1814(var200, var199, (SubLObject)$ic128$);
        if (var201 == $ic128$) {
            var201 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14027(var199)));
            module0034.f1816(var200, var199, var201, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var201);
    }
    
    public static SubLObject f14013(final SubLObject var507) {
        final SubLObject var508 = module0078.f5348(Mapping.mapcar((SubLObject)$ic277$, var507), (SubLObject)UNPROVIDED);
        final SubLObject var509 = module0077.f5311(var508);
        final SubLObject var510 = module0077.f5311(f14015($ic260$));
        return Numbers.divide(var509, var510);
    }
    
    public static SubLObject f14029(final SubLObject var507) {
        final SubLThread var508 = SubLProcess.currentSubLThread();
        SubLObject var509 = (SubLObject)NIL;
        final SubLObject var510 = module0147.$g2094$.currentBinding(var508);
        final SubLObject var511 = module0147.$g2095$.currentBinding(var508);
        try {
            module0147.$g2094$.bind((SubLObject)$ic33$, var508);
            module0147.$g2095$.bind($ic34$, var508);
            final SubLObject var512 = f14015($ic260$);
            final SubLObject var513 = module0078.f5348(Mapping.mapcar((SubLObject)$ic277$, var507), (SubLObject)UNPROVIDED);
            final SubLObject var514 = module0078.f5348((SubLObject)ConsesLow.listS(var513, Mapping.mapcar((SubLObject)$ic283$, var507)), (SubLObject)UNPROVIDED);
            final SubLObject var515 = Sequences.remove_if((SubLObject)$ic276$, module0077.f5312(module0078.f5356(var512, var514, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var516 = (SubLObject)NIL;
            SubLObject var517 = var515;
            SubLObject var518 = (SubLObject)NIL;
            var518 = var517.first();
            while (NIL != var517) {
                if (NIL == module0078.f5353((SubLObject)ConsesLow.list(f14015(var518), var514))) {
                    var516 = (SubLObject)ConsesLow.cons(var518, var516);
                }
                var517 = var517.rest();
                var518 = var517.first();
            }
            final SubLObject var519 = module0256.f16538(var516, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var509 = Sort.sort(var519, Symbols.symbol_function((SubLObject)$ic37$), (SubLObject)$ic270$);
        }
        finally {
            module0147.$g2095$.rebind(var511, var508);
            module0147.$g2094$.rebind(var510, var508);
        }
        return var509;
    }
    
    public static SubLObject f14030(final SubLObject var561) {
        return f14031(module0038.f2698(module0194.f12113(var561, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f14031(final SubLObject var562) {
        return Sequences.remove_if((SubLObject)$ic286$, var562, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14032(final SubLObject var563) {
        return module0035.f2169(var563, (SubLObject)$ic287$);
    }
    
    public static SubLObject f14033(final SubLObject var507) {
        assert NIL != module0035.f2015(var507) : var507;
        SubLObject var508 = var507;
        SubLObject var509 = (SubLObject)NIL;
        var509 = var508.first();
        while (NIL != var508) {
            assert NIL != module0269.f17710(var509) : var509;
            var508 = var508.rest();
            var509 = var508.first();
        }
        if (NIL == var507) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var507)) {
            return (SubLObject)ConsesLow.list(var507);
        }
        SubLObject var510 = (SubLObject)NIL;
        var508 = var507;
        SubLObject var511 = (SubLObject)NIL;
        var511 = var508.first();
        while (NIL != var508) {
            final SubLObject var512 = module0078.f5367(module0256.f16575(var511, Sequences.remove(var511, var507, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            var510 = module0035.f2063(var510, var511, var512, (SubLObject)UNPROVIDED);
            var508 = var508.rest();
            var511 = var508.first();
        }
        var510 = Sequences.nreverse(var510);
        return f14034(var510);
    }
    
    public static SubLObject f14034(final SubLObject var566) {
        final SubLObject var567 = module0048.f3381(Mapping.mapcar((SubLObject)$ic290$, module0035.f2319(var566)), (SubLObject)UNPROVIDED);
        SubLObject var568 = (SubLObject)NIL;
        SubLObject var569 = var566;
        SubLObject var570 = (SubLObject)NIL;
        var570 = var569.first();
        while (NIL != var569) {
            SubLObject var572;
            final SubLObject var571 = var572 = var570;
            SubLObject var573 = (SubLObject)NIL;
            SubLObject var574 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var572, var571, (SubLObject)$ic291$);
            var573 = var572.first();
            var572 = (var574 = var572.rest());
            if (var567.numE(module0077.f5311(var574))) {
                var568 = (SubLObject)ConsesLow.cons(var573, var568);
            }
            var569 = var569.rest();
            var570 = var569.first();
        }
        final SubLObject var575 = f14035(var568, var566);
        if (NIL != var575) {
            var568 = (SubLObject)ConsesLow.list(var575);
        }
        final SubLObject var576 = module0035.f2220(module0035.f2062(var566), var568, (SubLObject)UNPROVIDED);
        final SubLObject var577 = f14033(var576);
        if (NIL == var577) {
            return Mapping.mapcar((SubLObject)$ic292$, var568);
        }
        SubLObject var578 = (SubLObject)NIL;
        SubLObject var579 = var577;
        SubLObject var580 = (SubLObject)NIL;
        var580 = var579.first();
        while (NIL != var579) {
            final SubLObject var581 = var580.first();
            SubLObject var582 = (SubLObject)NIL;
            SubLObject var99_578 = var568;
            SubLObject var583 = (SubLObject)NIL;
            var583 = var99_578.first();
            while (NIL != var99_578) {
                final SubLObject var584 = module0035.f2293(var566, var583, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0077.f5320(var581, var584)) {
                    var578 = (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(var583), var580), var578);
                    var582 = (SubLObject)T;
                }
                var99_578 = var99_578.rest();
                var583 = var99_578.first();
            }
            if (NIL == var582) {
                var578 = (SubLObject)ConsesLow.cons(var580, var578);
            }
            var579 = var579.rest();
            var580 = var579.first();
        }
        return Sequences.nreverse(var578);
    }
    
    public static SubLObject f14035(final SubLObject var568, final SubLObject var566) {
        SubLObject var569 = var568;
        SubLObject var570 = (SubLObject)NIL;
        var570 = var569.first();
        while (NIL != var569) {
            final SubLObject var571 = module0035.f2293(var566, var570, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var572 = module0077.f5333(var571);
            SubLObject var573;
            SubLObject var574;
            SubLObject var575;
            SubLObject var576;
            for (var573 = module0032.f1741(var572), var574 = (SubLObject)NIL, var574 = module0032.f1742(var573, var572); NIL == module0032.f1744(var573, var574); var574 = module0032.f1743(var574)) {
                var575 = module0032.f1745(var573, var574);
                if (NIL != module0032.f1746(var574, var575)) {
                    var576 = module0035.f2293(var566, var575, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0077.f5320(var570, var576)) {
                        return var570;
                    }
                }
            }
            var569 = var569.rest();
            var570 = var569.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14036(final SubLObject var191) {
        assert NIL != module0035.f2015(var191) : var191;
        SubLObject var192 = var191;
        SubLObject var193 = (SubLObject)NIL;
        var193 = var192.first();
        while (NIL != var192) {
            assert NIL != module0269.f17716(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        if (NIL == var191) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var191)) {
            return (SubLObject)ConsesLow.list(var191);
        }
        SubLObject var194 = (SubLObject)NIL;
        var192 = var191;
        SubLObject var195 = (SubLObject)NIL;
        var195 = var192.first();
        while (NIL != var192) {
            final SubLObject var196 = module0078.f5367(module0260.f17043(var195, Sequences.remove(var195, var191, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            var194 = module0035.f2063(var194, var195, var196, (SubLObject)UNPROVIDED);
            var192 = var192.rest();
            var195 = var192.first();
        }
        var194 = Sequences.nreverse(var194);
        return f14037(var194);
    }
    
    public static SubLObject f14037(final SubLObject var584) {
        final SubLObject var585 = module0048.f3381(Mapping.mapcar((SubLObject)$ic290$, module0035.f2319(var584)), (SubLObject)UNPROVIDED);
        SubLObject var586 = (SubLObject)NIL;
        SubLObject var587 = var584;
        SubLObject var588 = (SubLObject)NIL;
        var588 = var587.first();
        while (NIL != var587) {
            SubLObject var590;
            final SubLObject var589 = var590 = var588;
            SubLObject var591 = (SubLObject)NIL;
            SubLObject var592 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var590, var589, (SubLObject)$ic294$);
            var591 = var590.first();
            var590 = (var592 = var590.rest());
            if (var585.numE(module0077.f5311(var592))) {
                var586 = (SubLObject)ConsesLow.cons(var591, var586);
            }
            var587 = var587.rest();
            var588 = var587.first();
        }
        final SubLObject var593 = f14038(var586, var584);
        if (NIL != var593) {
            var586 = (SubLObject)ConsesLow.list(var593);
        }
        final SubLObject var594 = module0035.f2220(module0035.f2062(var584), var586, (SubLObject)UNPROVIDED);
        final SubLObject var595 = f14036(var594);
        if (NIL == var595) {
            return Mapping.mapcar((SubLObject)$ic292$, var586);
        }
        SubLObject var596 = (SubLObject)NIL;
        SubLObject var597 = var595;
        SubLObject var598 = (SubLObject)NIL;
        var598 = var597.first();
        while (NIL != var597) {
            final SubLObject var599 = var598.first();
            SubLObject var600 = (SubLObject)NIL;
            SubLObject var99_592 = var586;
            SubLObject var601 = (SubLObject)NIL;
            var601 = var99_592.first();
            while (NIL != var99_592) {
                final SubLObject var602 = module0035.f2293(var584, var601, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0077.f5320(var599, var602)) {
                    var596 = (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(var601), var598), var596);
                    var600 = (SubLObject)T;
                }
                var99_592 = var99_592.rest();
                var601 = var99_592.first();
            }
            if (NIL == var600) {
                var596 = (SubLObject)ConsesLow.cons(var598, var596);
            }
            var597 = var597.rest();
            var598 = var597.first();
        }
        return Sequences.nreverse(var596);
    }
    
    public static SubLObject f14038(final SubLObject var586, final SubLObject var584) {
        SubLObject var587 = var586;
        SubLObject var588 = (SubLObject)NIL;
        var588 = var587.first();
        while (NIL != var587) {
            final SubLObject var589 = module0035.f2293(var584, var588, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var590 = module0077.f5333(var589);
            SubLObject var591;
            SubLObject var592;
            SubLObject var593;
            SubLObject var594;
            for (var591 = module0032.f1741(var590), var592 = (SubLObject)NIL, var592 = module0032.f1742(var591, var590); NIL == module0032.f1744(var591, var592); var592 = module0032.f1743(var592)) {
                var593 = module0032.f1745(var591, var592);
                if (NIL != module0032.f1746(var592, var593)) {
                    var594 = module0035.f2293(var584, var593, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0077.f5320(var588, var594)) {
                        return var588;
                    }
                }
            }
            var587 = var587.rest();
            var588 = var587.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14039(final SubLObject var597) {
        final SubLObject var598 = module0035.f2293($g2373$.getGlobalValue(), var597, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        assert NIL != module0173.f10955(var598) : var598;
        return var598;
    }
    
    public static SubLObject f14040(final SubLObject var598) {
        final SubLObject var599 = module0035.f2304($g2373$.getGlobalValue(), var598, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        assert NIL != module0004.f105(var599) : var599;
        return var599;
    }
    
    public static SubLObject f14041() {
        SubLObject var599;
        for (var599 = (SubLObject)NIL; NIL == f14042(var599); var599 = module0178.f11386()) {}
        return var599;
    }
    
    public static SubLObject f14043() {
        SubLObject var599;
        for (var599 = (SubLObject)NIL; NIL == f14044(var599); var599 = module0178.f11386()) {}
        return var599;
    }
    
    public static SubLObject f14045() {
        SubLObject var599;
        for (var599 = (SubLObject)NIL; NIL == f14046(var599); var599 = module0178.f11386()) {}
        return var599;
    }
    
    public static SubLObject f14047() {
        SubLObject var599;
        for (var599 = (SubLObject)NIL; NIL == f14048(var599); var599 = module0178.f11386()) {}
        return var599;
    }
    
    public static SubLObject f14042(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var241) && NIL != module0333.f22416(module0178.f11332(var241)));
    }
    
    public static SubLObject f14044(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var241) && NIL == module0333.f22416(module0178.f11332(var241)));
    }
    
    public static SubLObject f14046(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var241) && NIL != module0244.f15730(module0178.f11332(var241)));
    }
    
    public static SubLObject f14048(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var241) && NIL == module0244.f15730(module0178.f11332(var241)));
    }
    
    public static SubLObject f14049(final SubLObject var600, SubLObject var601) {
        if (var601 == UNPROVIDED) {
            var601 = (SubLObject)NIL;
        }
        final SubLObject var602 = Numbers.add(module0202.f12725(var600, (SubLObject)UNPROVIDED), (SubLObject)((NIL != var601) ? ONE_INTEGER : ZERO_INTEGER));
        final SubLObject var603 = Numbers.add(random.random(var602), (SubLObject)((NIL != var601) ? ZERO_INTEGER : ONE_INTEGER));
        return var603;
    }
    
    public static SubLObject f14050(final SubLObject var600, SubLObject var601) {
        if (var601 == UNPROVIDED) {
            var601 = (SubLObject)NIL;
        }
        return f14051(var600, var601, (SubLObject)NIL);
    }
    
    public static SubLObject f14052(final SubLObject var600, SubLObject var601) {
        if (var601 == UNPROVIDED) {
            var601 = (SubLObject)NIL;
        }
        return f14051(var600, var601, (SubLObject)T);
    }
    
    public static SubLObject f14051(final SubLObject var600, final SubLObject var601, final SubLObject var602) {
        SubLObject var603 = (SubLObject)NIL;
        SubLObject var604 = (SubLObject)ZERO_INTEGER;
        while (NIL == var603) {
            var604 = Numbers.add(var604, (SubLObject)ONE_INTEGER);
            if (var604.numG((SubLObject)$ic296$)) {
                if (NIL == var602) {
                    Errors.warn((SubLObject)$ic297$, var600);
                    return (SubLObject)NIL;
                }
                Errors.error((SubLObject)$ic297$, var600);
            }
            final SubLObject var605 = f14049(var600, var601);
            if (NIL != module0202.f12691(module0205.f13134(var600, var605, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
                var603 = var605;
            }
        }
        return var603;
    }
    
    public static SubLObject f14053(final SubLObject var600, SubLObject var601) {
        if (var601 == UNPROVIDED) {
            var601 = (SubLObject)NIL;
        }
        final SubLObject var602 = f14049(var600, var601);
        final SubLObject var603 = module0279.f18513(var600, (SubLObject)UNPROVIDED);
        return module0202.f12817(var602, var603, var600);
    }
    
    public static SubLObject f14054() {
        SubLObject var32;
        for (var32 = (SubLObject)NIL; NIL == module0269.f17716(var32); var32 = module0173.f10963()) {}
        return var32;
    }
    
    public static SubLObject f14055() {
        SubLObject var32;
        for (var32 = (SubLObject)NIL; NIL == module0269.f17716(var32) || NIL == module0259.f16854(var32, $ic298$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); var32 = module0173.f10963()) {}
        return var32;
    }
    
    public static SubLObject f14056(final SubLObject var506, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var507 = SubLProcess.currentSubLThread();
        SubLObject var508 = (SubLObject)NIL;
        final SubLObject var509 = var55;
        final SubLObject var510 = module0147.$g2095$.currentBinding(var507);
        final SubLObject var511 = module0147.$g2094$.currentBinding(var507);
        final SubLObject var512 = module0147.$g2096$.currentBinding(var507);
        try {
            module0147.$g2095$.bind(module0147.f9545(var509), var507);
            module0147.$g2094$.bind(module0147.f9546(var509), var507);
            module0147.$g2096$.bind(module0147.f9549(var509), var507);
            var508 = module0205.f13183(var506, (SubLObject)$ic299$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var512, var507);
            module0147.$g2094$.rebind(var511, var507);
            module0147.$g2095$.rebind(var510, var507);
        }
        return var508;
    }
    
    public static SubLObject f14057(final SubLObject var241) {
        return module0305.f20438(var241, $ic300$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14058(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0269.f17716(var241) && NIL == module0269.f17761(var241) && NIL == module0269.f17781(var241));
    }
    
    public static SubLObject f14059(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0269.f17716(var241) && (NIL != module0269.f17761(var241) || NIL != module0269.f17781(var241)));
    }
    
    public static SubLObject f14060(final SubLObject var604) {
        return (SubLObject)makeBoolean(NIL == module0269.f17761(var604) && NIL == module0269.f17781(var604));
    }
    
    public static SubLObject f14061(final SubLObject var604) {
        return (SubLObject)makeBoolean(NIL != module0269.f17761(var604) || NIL != module0269.f17781(var604));
    }
    
    public static SubLObject f14062(final SubLObject var562) {
        SubLObject var563 = (SubLObject)NIL;
        SubLObject var564 = module0038.f2689(constant_reader_oc.f8495(), var562, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var565 = (SubLObject)NIL;
        var565 = var564.first();
        while (NIL != var564) {
            final SubLObject var566 = Numbers.add(var565, (SubLObject)TWO_INTEGER);
            final SubLObject var567 = module0035.position_if_not((SubLObject)$ic301$, var562, Symbols.symbol_function((SubLObject)IDENTITY), var566, (SubLObject)UNPROVIDED);
            final SubLObject var568 = module0038.f2623(var562, var566, var567);
            SubLObject var569 = constant_handles_oc.f8463(constants_high_oc.f10737(var568), (SubLObject)UNPROVIDED);
            for (SubLObject var570 = var568; NIL == var569 && NIL != module0038.f2611(var570) && NIL != conses_high.member(module0038.f2637(var570), (SubLObject)$ic302$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); var570 = module0038.f2666(var570, (SubLObject)UNPROVIDED), var569 = constants_high_oc.f10737(var570)) {}
            if (NIL == var569) {
                var563 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var566, var568), var563);
            }
            var564 = var564.rest();
            var565 = var564.first();
        }
        return var563;
    }
    
    public static SubLObject f14063(final SubLObject var190) {
        assert NIL != module0178.f11284(var190) : var190;
        SubLObject var192;
        final SubLObject var191 = var192 = module0543.f33671(var190);
        final SubLObject var193 = module0205.f13180(var191, (SubLObject)$ic304$);
        SubLObject var194 = (SubLObject)NIL;
        SubLObject var195 = (SubLObject)NIL;
        SubLObject var196 = (SubLObject)NIL;
        var194 = var193;
        var195 = var194.first();
        for (var196 = (SubLObject)ZERO_INTEGER; NIL != var194; var194 = var194.rest(), var195 = var194.first(), var196 = module0048.f_1X(var196)) {
            if (var195.isString()) {
                SubLObject var197 = var195;
                SubLObject var198 = module0035.f2325(f14062(var195), Symbols.symbol_function((SubLObject)$ic37$));
                SubLObject var199 = (SubLObject)NIL;
                var199 = var198.first();
                while (NIL != var198) {
                    SubLObject var201;
                    final SubLObject var200 = var201 = var199;
                    SubLObject var202 = (SubLObject)NIL;
                    SubLObject var203 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var201, var200, (SubLObject)$ic305$);
                    var202 = var201.first();
                    var201 = (var203 = var201.rest());
                    var197 = f14064(var197, var203, var202, (SubLObject)UNPROVIDED);
                    var198 = var198.rest();
                    var199 = var198.first();
                }
                if (!var197.eql(var195)) {
                    var192 = module0202.f12817(var196, var197, var192);
                }
            }
        }
        if (!var192.eql(var191)) {
            module0543.f33670(var190, var192, module0211.f13701(var190));
        }
        return (SubLObject)(var192.eql(var191) ? NIL : var192);
    }
    
    public static SubLObject f14064(final SubLObject var562, final SubLObject var275, final SubLObject var607, SubLObject var619) {
        if (var619 == UNPROVIDED) {
            var619 = (SubLObject)NIL;
        }
        final SubLObject var620 = f14065(var275);
        SubLObject var621 = var562;
        if (NIL != module0035.f1997(var620)) {
            var621 = module0038.f2671(var621, var607, Sequences.length(var275), constants_high_oc.f10743(var620.first()));
        }
        else if (NIL == var619 && NIL != module0035.f2012(var620) && NIL != module0038.f2611(var275) && Characters.CHAR_s.eql(module0038.f2637(var275))) {
            var621 = f14064(var562, module0038.f2666(var275, (SubLObject)UNPROVIDED), var607, (SubLObject)T);
        }
        return var621;
    }
    
    public static SubLObject f14065(final SubLObject var562) {
        return module0220.f14565(var562, $ic306$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14066(final SubLObject var385) {
        final SubLThread var386 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var385) : var385;
        SubLObject var387 = (SubLObject)NIL;
        final SubLObject var388 = $g2374$.currentBinding(var386);
        final SubLObject var389 = $g2375$.currentBinding(var386);
        try {
            $g2374$.bind(var385, var386);
            $g2375$.bind(module0032.f1726(module0217.f14357(var385), Symbols.symbol_function((SubLObject)EQL)), var386);
            if (NIL != module0158.f10282(var385, (SubLObject)NIL)) {
                final SubLObject var390 = module0158.f10283(var385, (SubLObject)NIL);
                SubLObject var391 = (SubLObject)NIL;
                final SubLObject var392 = (SubLObject)NIL;
                while (NIL == var391) {
                    final SubLObject var393 = module0052.f3695(var390, var392);
                    final SubLObject var394 = (SubLObject)makeBoolean(!var392.eql(var393));
                    if (NIL != var394) {
                        SubLObject var395 = (SubLObject)NIL;
                        try {
                            var395 = module0158.f10316(var393, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var45_622 = (SubLObject)NIL;
                            final SubLObject var46_623 = (SubLObject)NIL;
                            while (NIL == var45_622) {
                                final SubLObject var396 = module0052.f3695(var395, var46_623);
                                final SubLObject var48_624 = (SubLObject)makeBoolean(!var46_623.eql(var396));
                                if (NIL != var48_624 && NIL != module0158.f10284(var396, var393)) {
                                    final SubLObject var397 = module0178.f11289(var396);
                                    module0035.f2439(Symbols.symbol_function((SubLObject)$ic307$), var397, (SubLObject)UNPROVIDED);
                                }
                                var45_622 = (SubLObject)makeBoolean(NIL == var48_624);
                            }
                        }
                        finally {
                            final SubLObject var20_626 = Threads.$is_thread_performing_cleanupP$.currentBinding(var386);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var386);
                                if (NIL != var395) {
                                    module0158.f10319(var395);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var20_626, var386);
                            }
                        }
                    }
                    var391 = (SubLObject)makeBoolean(NIL == var394);
                }
            }
            var387 = module0032.f1753($g2375$.getDynamicValue(var386));
        }
        finally {
            $g2375$.rebind(var389, var386);
            $g2374$.rebind(var388, var386);
        }
        return var387;
    }
    
    public static SubLObject f14067(final SubLObject var627) {
        final SubLThread var628 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var627) && !var627.eql($g2374$.getDynamicValue(var628))) {
            $g2375$.setDynamicValue(module0032.f1736(var627, $g2375$.getDynamicValue(var628), Symbols.symbol_function((SubLObject)EQL)), var628);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14068() {
        final SubLObject var361 = $g2376$.getGlobalValue();
        if (NIL != var361) {
            module0034.f1818(var361);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14069(final SubLObject var269) {
        return module0034.f1829($g2376$.getGlobalValue(), (SubLObject)ConsesLow.list(var269), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14070(final SubLObject var269) {
        return f13918(var269);
    }
    
    public static SubLObject f14071(final SubLObject var269) {
        SubLObject var270 = $g2376$.getGlobalValue();
        if (NIL == var270) {
            var270 = module0034.f1934((SubLObject)$ic308$, (SubLObject)$ic309$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var271 = module0034.f1814(var270, var269, (SubLObject)$ic128$);
        if (var271 == $ic128$) {
            var271 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f14070(var269)));
            module0034.f1816(var270, var269, var271, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var271);
    }
    
    public static SubLObject f14072(final SubLObject var385, SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var386 = f14066(var385);
        streams_high.write_string(f14071(var385), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var387 = var386;
        SubLObject var388 = (SubLObject)NIL;
        var388 = var387.first();
        while (NIL != var387) {
            streams_high.write_string((SubLObject)$ic310$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_string(f14071(var388), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var387 = var387.rest();
            var388 = var387.first();
        }
        streams_high.terpri(var1);
        return Sequences.length(var386);
    }
    
    public static SubLObject f14073(final SubLObject var629) {
        final SubLThread var630 = SubLProcess.currentSubLThread();
        SubLObject var631 = (SubLObject)NIL;
        try {
            final SubLObject var632 = stream_macros.$stream_requires_locking$.currentBinding(var630);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var630);
                var631 = compatibility.open_text(var629, (SubLObject)$ic311$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var632, var630);
            }
            if (!var631.isStream()) {
                Errors.error((SubLObject)$ic312$, var629);
            }
            final SubLObject var1_631 = var631;
            final SubLObject var633 = (SubLObject)$ic313$;
            final SubLObject var634 = module0173.f10962();
            SubLObject var635 = (SubLObject)ZERO_INTEGER;
            final SubLObject var636 = module0012.$g75$.currentBinding(var630);
            final SubLObject var637 = module0012.$g76$.currentBinding(var630);
            final SubLObject var638 = module0012.$g77$.currentBinding(var630);
            final SubLObject var639 = module0012.$g78$.currentBinding(var630);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var630);
                module0012.$g76$.bind((SubLObject)NIL, var630);
                module0012.$g77$.bind((SubLObject)T, var630);
                module0012.$g78$.bind(Time.get_universal_time(), var630);
                module0012.f478(var633);
                SubLObject var640 = module0173.f10961();
                SubLObject var641 = (SubLObject)NIL;
                var641 = var640.first();
                while (NIL != var640) {
                    final SubLObject var642 = var641;
                    if (NIL == module0065.f4772(var642, (SubLObject)$ic43$)) {
                        final SubLObject var65_632 = var642;
                        if (NIL == module0065.f4775(var65_632, (SubLObject)$ic43$)) {
                            final SubLObject var643 = module0065.f4740(var65_632);
                            final SubLObject var644 = (SubLObject)NIL;
                            SubLObject var645;
                            SubLObject var646;
                            SubLObject var647;
                            SubLObject var648;
                            SubLObject var649;
                            SubLObject var20_634;
                            for (var645 = Sequences.length(var643), var646 = (SubLObject)NIL, var646 = (SubLObject)ZERO_INTEGER; var646.numL(var645); var646 = Numbers.add(var646, (SubLObject)ONE_INTEGER)) {
                                var647 = ((NIL != var644) ? Numbers.subtract(var645, var646, (SubLObject)ONE_INTEGER) : var646);
                                var648 = Vectors.aref(var643, var647);
                                if (NIL == module0065.f4749(var648) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                                    if (NIL != module0065.f4749(var648)) {
                                        var648 = (SubLObject)$ic43$;
                                    }
                                    var635 = Numbers.add(var635, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var635, var634);
                                    var649 = (SubLObject)NIL;
                                    try {
                                        var630.throwStack.push(module0003.$g3$.getGlobalValue());
                                        var20_634 = Errors.$error_handler$.currentBinding(var630);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)$ic314$, var630);
                                            try {
                                                f14072(var648, var1_631);
                                            }
                                            catch (Throwable var650) {
                                                Errors.handleThrowable(var650, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(var20_634, var630);
                                        }
                                    }
                                    catch (Throwable var651) {
                                        var649 = Errors.handleThrowable(var651, module0003.$g3$.getGlobalValue());
                                    }
                                    finally {
                                        var630.throwStack.pop();
                                    }
                                    if (var649.isString()) {
                                        Errors.warn((SubLObject)$ic315$, var649);
                                    }
                                }
                            }
                        }
                        final SubLObject var72_635 = var642;
                        if (NIL == module0065.f4777(var72_635) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                            final SubLObject var652 = module0065.f4738(var72_635);
                            SubLObject var653 = module0065.f4739(var72_635);
                            final SubLObject var654 = module0065.f4734(var72_635);
                            final SubLObject var655 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                            while (var653.numL(var654)) {
                                final SubLObject var656 = Hashtables.gethash_without_values(var653, var652, var655);
                                if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var656)) {
                                    var635 = Numbers.add(var635, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var635, var634);
                                    SubLObject var657 = (SubLObject)NIL;
                                    try {
                                        var630.throwStack.push(module0003.$g3$.getGlobalValue());
                                        final SubLObject var20_635 = Errors.$error_handler$.currentBinding(var630);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)$ic314$, var630);
                                            try {
                                                f14072(var656, var1_631);
                                            }
                                            catch (Throwable var658) {
                                                Errors.handleThrowable(var658, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(var20_635, var630);
                                        }
                                    }
                                    catch (Throwable var659) {
                                        var657 = Errors.handleThrowable(var659, module0003.$g3$.getGlobalValue());
                                    }
                                    finally {
                                        var630.throwStack.pop();
                                    }
                                    if (var657.isString()) {
                                        Errors.warn((SubLObject)$ic315$, var657);
                                    }
                                }
                                var653 = Numbers.add(var653, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    var640 = var640.rest();
                    var641 = var640.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var639, var630);
                module0012.$g77$.rebind(var638, var630);
                module0012.$g76$.rebind(var637, var630);
                module0012.$g75$.rebind(var636, var630);
            }
        }
        finally {
            final SubLObject var660 = Threads.$is_thread_performing_cleanupP$.currentBinding(var630);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var630);
                if (var631.isStream()) {
                    streams_high.close(var631, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var660, var630);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14074(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var241) && NIL != module0259.f16975(var241, $ic316$, $ic317$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14075(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var241) && NIL == f14074(var241));
    }
    
    public static SubLObject f14076(final SubLObject var506) {
        return module0205.f13183(var506, (SubLObject)$ic318$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14077(final SubLObject var55, SubLObject var637) {
        if (var637 == UNPROVIDED) {
            var637 = (SubLObject)$ic319$;
        }
        assert NIL != module0269.f17731(var55) : var55;
        final SubLObject var638 = Sequences.cconcatenate(var637, module0038.f2638(random.random((SubLObject)$ic321$)));
        final SubLObject var639 = module0540.f33504(var638);
        return module0540.f33516((SubLObject)ConsesLow.list($ic322$, var639, var55), module0132.$g1548$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14078(final SubLObject var241, SubLObject var639) {
        if (var639 == UNPROVIDED) {
            var639 = (SubLObject)T;
        }
        final SubLThread var640 = SubLProcess.currentSubLThread();
        dumper_oc.$g2377$.setDynamicValue((SubLObject)NIL, var640);
        final SubLObject var641 = print_high.$print_pretty$.currentBinding(var640);
        final SubLObject var642 = print_high.$print_length$.currentBinding(var640);
        final SubLObject var643 = print_high.$print_level$.currentBinding(var640);
        try {
            print_high.$print_pretty$.bind((SubLObject)NIL, var640);
            print_high.$print_length$.bind((SubLObject)NIL, var640);
            print_high.$print_level$.bind((SubLObject)NIL, var640);
            if (NIL == var241 || NIL != constant_handles_oc.f8449(var241) || var241.isString() || var241.isNumber() || var241.isKeyword()) {
                final SubLObject var644 = print_high.prin1_to_string(var241);
                if (NIL != var639 && !var241.equalp(Eval.eval(reader.read_from_string(var644, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
                    Errors.warn((SubLObject)$ic323$, var241);
                    return (SubLObject)NIL;
                }
                return var644;
            }
            else if (var241.isSymbol()) {
                SubLObject var644 = print_high.prin1_to_string(var241);
                var644 = Sequences.cconcatenate((SubLObject)$ic324$, var644);
                if (NIL != var639 && !var241.equalp(Eval.eval(reader.read_from_string(var644, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
                    Errors.warn((SubLObject)$ic323$, var241);
                    return (SubLObject)NIL;
                }
                return var644;
            }
            else if (NIL != Guids.guid_p(var241)) {
                final SubLObject var644 = Sequences.cconcatenate((SubLObject)$ic325$, new SubLObject[] { print_high.prin1_to_string(Guids.guid_to_string(var241)), $ic326$ });
                if (NIL != var639 && !var241.equalp(Eval.eval(reader.read_from_string(var644, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
                    Errors.warn((SubLObject)$ic323$, var241);
                    return (SubLObject)NIL;
                }
                return var644;
            }
            else {
                if (NIL == module0193.f12067(var241)) {
                    final SubLObject var645 = module0036.f2531(var241, (SubLObject)$ic328$, (SubLObject)$ic329$, (SubLObject)UNPROVIDED);
                    final SubLObject var646 = print_high.prin1_to_string(var645);
                    SubLObject var647 = module0038.f2658(var646);
                    if (NIL != module0038.f2668((SubLObject)$ic330$, var647, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        SubLObject var648;
                        SubLObject var649;
                        SubLObject var650;
                        SubLObject var651;
                        SubLObject var653;
                        SubLObject var652;
                        SubLObject var654;
                        SubLObject var655;
                        SubLObject var656;
                        SubLObject var657 = null;
                        for (var647 = module0038.f2659((SubLObject)$ic331$, (SubLObject)$ic332$, var647, (SubLObject)UNPROVIDED), var647 = module0038.f2659((SubLObject)$ic333$, (SubLObject)$ic334$, var647, (SubLObject)UNPROVIDED), var647 = module0038.f2659((SubLObject)$ic335$, (SubLObject)$ic336$, var647, (SubLObject)UNPROVIDED), var647 = module0038.f2659((SubLObject)$ic337$, (SubLObject)$ic338$, var647, (SubLObject)UNPROVIDED), var647 = module0038.f2659((SubLObject)$ic339$, (SubLObject)$ic340$, var647, (SubLObject)UNPROVIDED), var647 = module0038.f2659((SubLObject)$ic341$, (SubLObject)$ic342$, var647, (SubLObject)UNPROVIDED), var647 = module0038.f2659((SubLObject)$ic343$, (SubLObject)$ic344$, var647, (SubLObject)UNPROVIDED); NIL != module0038.f2668((SubLObject)$ic345$, var647, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); var647 = module0038.f2659(Sequences.cconcatenate((SubLObject)$ic349$, new SubLObject[] { var657, $ic326$ }), Sequences.cconcatenate((SubLObject)$ic345$, var657), var647, (SubLObject)UNPROVIDED)) {
                            var648 = var647;
                            var649 = (SubLObject)$ic346$;
                            var650 = Sequences.cconcatenate(var649, new SubLObject[] { $ic310$, $ic347$ });
                            var651 = module0045.f3140(var650, var648, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
                            if (var651.isCons()) {
                                var652 = (var653 = var651);
                                var654 = (SubLObject)NIL;
                                var655 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var653, var652, (SubLObject)$ic348$);
                                var654 = var653.first();
                                var653 = (var655 = var653.rest());
                                var656 = Numbers.add(var654, Sequences.length(var649), Sequences.length((SubLObject)$ic310$));
                                var657 = module0038.f2623(var648, var656, var655);
                            }
                        }
                    }
                    if (!var646.equalp(var647)) {
                        var647 = Sequences.cconcatenate((SubLObject)$ic343$, var647);
                    }
                    else if (var645.isList()) {
                        var647 = Sequences.cconcatenate((SubLObject)$ic324$, var647);
                    }
                    final SubLObject var20_648 = module0018.$g574$.currentBinding(var640);
                    try {
                        module0018.$g574$.bind((SubLObject)T, var640);
                        if (NIL != var639 && !var241.equalp(Eval.eval(reader.read_from_string(var647, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
                            Errors.warn((SubLObject)$ic350$, var241);
                            return (SubLObject)NIL;
                        }
                    }
                    finally {
                        module0018.$g574$.rebind(var20_648, var640);
                    }
                    return var647;
                }
                final SubLObject var644 = Sequences.cconcatenate((SubLObject)$ic327$, new SubLObject[] { print_high.prin1_to_string(module0193.f12073(var241)), $ic326$ });
                if (NIL != var639 && !var241.equalp(Eval.eval(reader.read_from_string(var644, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
                    Errors.warn((SubLObject)$ic323$, var241);
                    return (SubLObject)NIL;
                }
                return var644;
            }
        }
        finally {
            print_high.$print_level$.rebind(var643, var640);
            print_high.$print_length$.rebind(var642, var640);
            print_high.$print_pretty$.rebind(var641, var640);
        }
    }
    
    public static SubLObject f14079(final SubLObject var649) {
        return (SubLObject)makeBoolean(NIL != module0167.f10813(var649) || NIL != module0193.f12067(var649) || NIL != Guids.guid_p(var649) || NIL != assertion_handles_oc.f11035(var649) || NIL != module0179.f11424(var649) || NIL != deduction_handles_oc.f11659(var649));
    }
    
    public static SubLObject f14080(final SubLObject var650) {
        if (NIL != module0167.f10813(var650)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic351$, module0205.f13144(module0172.f10915(var650)));
        }
        if (NIL != module0193.f12067(var650)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic352$, module0193.f12073(var650));
        }
        if (NIL != Guids.guid_p(var650)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic353$, Guids.guid_to_string(var650));
        }
        if (NIL != assertion_handles_oc.f11035(var650)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic354$, module0178.f11282(var650), (SubLObject)$ic355$, module0178.f11287(var650));
        }
        if (NIL != deduction_handles_oc.f11659(var650)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic356$, module0188.f11781(var650), (SubLObject)$ic355$, module0188.f11770(var650), module0188.f11789(var650));
        }
        if (NIL != module0179.f11424(var650)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic357$, module0183.f11557(var650));
        }
        Errors.error((SubLObject)$ic358$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14081(final SubLObject var651, final SubLObject var652) {
        return Equality.eq(var651, var652);
    }
    
    public static SubLObject f14082(final SubLObject var241) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var241) && NIL != module0202.f12598(module0178.f11285(var241)));
    }
    
    public static SubLObject f14083(final SubLObject var385) {
        assert NIL != module0173.f10955(var385) : var385;
        if (NIL != constant_handles_oc.f8449(var385)) {
            return constants_high_oc.f10743(var385);
        }
        return module0038.f2962(module0038.f2699((SubLObject)$ic359$, (SubLObject)$ic310$, module0038.f2638(var385), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14084() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13862", "KB-STATISTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13863", "S#16718", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13864", "S#16719", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13865", "S#16720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13866", "S#16721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13867", "S#16722", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13868", "S#16723", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13869", "S#16724", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13870", "S#16725", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13871", "S#16726", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13872", "S#16727", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13873", "S#16728", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13874", "S#16729", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13875", "S#16730", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13876", "S#16731", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13877", "S#16732", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13878", "S#16733", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13879", "S#14362", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13880", "S#16734", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13881", "S#16735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13882", "S#16736", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13883", "S#16737", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13884", "S#16738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13885", "S#16739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13886", "S#14363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13887", "S#16740", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13888", "S#16741", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13889", "S#16742", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13890", "S#16743", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13892", "S#16744", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13893", "S#16745", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13894", "S#16746", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13891", "S#16747", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13895", "S#16748", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13896", "S#16749", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13897", "SHOW-NEW-KB-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13898", "CLEAR-NEW-KB-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13899", "S#16750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13900", "S#16751", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13901", "S#16752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13902", "S#16753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13903", "S#16754", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13904", "S#16755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13905", "HL-INTERNAL-ID-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13906", "COMPACT-HL-INTERNAL-ID-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13907", "HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13908", "COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13909", "FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13911", "FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13912", "MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13914", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13913", "HL-EXTERNAL-ID-STRING-P", 1, 0, false);
        new $f13913$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13915", "COMPACT-HL-EXTERNAL-ID-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13916", "COMPACT-HL-EXTERNAL-ID-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13919", "COMPACT-HL-EXTERNAL-ID-STRING=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13920", "HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13918", "COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13921", "FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13922", "FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13917", "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13923", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13910", "S#16756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13924", "S#16757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13925", "S#16758", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13926", "S#13269", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13927", "S#3846", 2, 3, false);
        new $f13927$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13929", "S#16759", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13928", "S#16703", 2, 0, false);
        new $f13928$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13931", "S#16760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13930", "S#16761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13933", "S#16762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13932", "S#16763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13935", "S#16764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13934", "S#16765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13936", "S#16704", 2, 0, false);
        new $f13936$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13937", "S#16766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13938", "S#16581", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13939", "S#16767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13940", "S#16768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13941", "S#16769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13942", "S#16770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13944", "S#16771", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13946", "S#16772", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13947", "S#16773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13943", "S#16774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13948", "S#16775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13945", "S#16776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13949", "S#16777", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13952", "S#16778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13953", "S#16779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13954", "S#16780", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13955", "S#16781", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13956", "S#16782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13950", "S#16783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13958", "S#16784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13959", "S#16785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13957", "S#16786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13960", "S#16787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13951", "S#16788", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13962", "S#16789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13963", "S#16790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13961", "S#16791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13964", "S#16792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13965", "S#16793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13966", "S#16794", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13967", "S#16795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13968", "ALL-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13969", "S#16030", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13970", "S#16796", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13971", "S#16797", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13972", "S#16798", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13973", "S#16031", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13974", "S#16799", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13975", "S#16800", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13976", "S#16801", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13977", "S#16802", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13978", "S#16803", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13979", "S#16804", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13980", "S#16805", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13981", "S#16806", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13982", "S#16807", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13983", "S#16808", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13984", "S#16809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13985", "S#16810", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13986", "S#16811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13987", "S#16812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13988", "S#16813", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0213", "f13989", "S#16814");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13990", "S#16815", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13992", "S#16816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13991", "S#16817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13993", "S#16818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13994", "S#16819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13995", "S#16820", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0213", "f13996", "S#16821");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0213", "f13997", "S#16822");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13998", "S#16823", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f13999", "S#16824", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14000", "S#16825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14001", "S#16826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14002", "S#16708", 0, 0, false);
        new $f14002$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14003", "S#16827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14004", "S#16828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14005", "S#16829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14006", "S#16830", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14007", "S#16831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14008", "S#16832", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14009", "S#16833", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14012", "S#16834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14011", "S#16835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14010", "S#16836", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14016", "S#16710", 0, 0, false);
        new $f14016$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14017", "S#16837", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14018", "S#16838", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14019", "S#16839", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14020", "S#16840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14014", "S#16841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14021", "S#16842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14022", "S#16843", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14023", "S#16844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14024", "S#16845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14015", "S#16846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14025", "S#16847", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14026", "S#16848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14027", "S#16849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14028", "S#16850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14013", "S#16851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14029", "S#16852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14030", "S#16853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14031", "S#16854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14032", "S#16855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14033", "S#16856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14034", "S#16857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14035", "S#16858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14036", "S#16859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14037", "S#16860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14038", "S#16861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14039", "S#16862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14040", "S#16863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14041", "S#16864", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14043", "S#16865", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14045", "S#16866", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14047", "S#16867", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14042", "S#16868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14044", "S#16869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14046", "S#16870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14048", "S#16871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14049", "S#16872", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14050", "S#16873", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14052", "S#16874", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14051", "S#16875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14053", "S#16876", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14054", "S#16877", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14055", "S#16878", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14056", "S#16879", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14057", "S#16880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14058", "S#16881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14059", "S#16882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14060", "S#16883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14061", "S#16884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14062", "S#16885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14063", "S#16886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14064", "S#16887", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14065", "S#16888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14066", "S#16889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14067", "S#16890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14068", "S#16891", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14069", "S#16892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14070", "S#16893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14071", "S#16894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14072", "S#16895", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14073", "S#16896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14074", "S#16897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14075", "S#16898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14076", "S#16899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14077", "S#16900", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14078", "S#16901", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14079", "S#16902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14080", "S#16903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14081", "S#2879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14082", "S#16904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0213", "f14083", "S#16905", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14085() {
        $g2346$ = SubLFiles.deflexical("S#16906", (SubLObject)$ic64$);
        $g2347$ = SubLFiles.deflexical("S#16907", (SubLObject)$ic65$);
        $g2348$ = SubLFiles.deflexical("S#16908", (SubLObject)$ic66$);
        $g2349$ = SubLFiles.deflexical("S#16909", (SubLObject)$ic67$);
        $g2350$ = SubLFiles.deflexical("S#16910", (SubLObject)$ic68$);
        $g2351$ = SubLFiles.deflexical("S#16911", (SubLObject)$ic69$);
        $g2352$ = SubLFiles.deflexical("S#16912", (SubLObject)$ic70$);
        $g2353$ = SubLFiles.deflexical("S#16913", (SubLObject)TEN_INTEGER);
        $g2354$ = SubLFiles.deflexical("S#16914", (SubLObject)$ic71$);
        $g2355$ = SubLFiles.defparameter("S#16915", (SubLObject)$ic72$);
        $g2356$ = SubLFiles.defparameter("S#16916", (SubLObject)T);
        $g2357$ = SubLFiles.defparameter("S#16917", (SubLObject)NIL);
        $g2358$ = SubLFiles.defparameter("S#16918", (SubLObject)NIL);
        $g2359$ = SubLFiles.deflexical("S#16919", (SubLObject)$ic121$);
        $g2360$ = SubLFiles.deflexical("S#16920", Vectors.make_vector((SubLObject)$ic122$, (SubLObject)NIL));
        $g2361$ = SubLFiles.deflexical("S#16921", (SubLObject)NIL);
        $g2362$ = SubLFiles.deflexical("S#16922", (SubLObject)NIL);
        $g2363$ = SubLFiles.defparameter("S#16923", (SubLObject)T);
        $g2364$ = SubLFiles.deflexical("S#16924", (SubLObject)NIL);
        $g2365$ = SubLFiles.deflexical("S#16925", (SubLObject)$ic267$);
        $g2366$ = SubLFiles.deflexical("S#16926", (SubLObject)$ic268$);
        $g2367$ = SubLFiles.deflexical("S#16927", (SubLObject)$ic269$);
        $g2368$ = SubLFiles.deflexical("S#16928", (SubLObject)NIL);
        $g2369$ = SubLFiles.defparameter("S#16929", (SubLObject)NIL);
        $g2370$ = SubLFiles.deflexical("S#16930", (SubLObject)NIL);
        $g2371$ = SubLFiles.deflexical("S#16931", (SubLObject)NIL);
        $g2372$ = SubLFiles.deflexical("S#16932", (SubLObject)NIL);
        $g2373$ = SubLFiles.deflexical("S#16933", (SubLObject)$ic295$);
        $g2374$ = SubLFiles.defparameter("S#16934", (SubLObject)NIL);
        $g2375$ = SubLFiles.defparameter("S#16935", (SubLObject)NIL);
        $g2376$ = SubLFiles.deflexical("S#16936", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14086() {
        Storage.register_low_memory_callback(Symbols.symbol_function((SubLObject)$ic74$));
        module0002.f38((SubLObject)$ic75$);
        module0002.f38((SubLObject)$ic83$);
        module0002.f38((SubLObject)$ic88$);
        module0002.f38((SubLObject)$ic89$);
        module0002.f38((SubLObject)$ic90$);
        module0002.f38((SubLObject)$ic91$);
        module0002.f38((SubLObject)$ic92$);
        module0002.f38((SubLObject)$ic94$);
        module0002.f38((SubLObject)$ic96$);
        module0002.f38((SubLObject)$ic97$);
        module0002.f38((SubLObject)$ic98$);
        module0002.f38((SubLObject)$ic99$);
        module0002.f38((SubLObject)$ic100$);
        module0002.f38((SubLObject)$ic104$);
        module0002.f38((SubLObject)$ic105$);
        module0002.f38((SubLObject)$ic106$);
        module0002.f38((SubLObject)$ic107$);
        module0002.f38((SubLObject)$ic108$);
        module0002.f38((SubLObject)$ic110$);
        module0002.f38((SubLObject)$ic111$);
        Structures.register_method($g2360$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic123$));
        Structures.register_method($g2360$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic124$));
        module0034.f1895((SubLObject)$ic127$);
        module0034.f1909((SubLObject)$ic148$);
        module0034.f1909((SubLObject)$ic152$);
        module0034.f1909((SubLObject)$ic262$);
        module0034.f1909((SubLObject)$ic278$);
        module0034.f1909((SubLObject)$ic277$);
        module0034.f1909((SubLObject)$ic283$);
        module0012.f419((SubLObject)$ic307$);
        module0034.f1909((SubLObject)$ic308$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f14084();
    }
    
    public void initializeVariables() {
        f14085();
    }
    
    public void runTopLevelForms() {
        f14086();
    }
    
    static {
        me = (SubLFile)new module0213();
        $g2346$ = null;
        $g2347$ = null;
        $g2348$ = null;
        $g2349$ = null;
        $g2350$ = null;
        $g2351$ = null;
        $g2352$ = null;
        $g2353$ = null;
        $g2354$ = null;
        $g2355$ = null;
        $g2356$ = null;
        $g2357$ = null;
        $g2358$ = null;
        $g2359$ = null;
        $g2360$ = null;
        $g2361$ = null;
        $g2362$ = null;
        $g2363$ = null;
        $g2364$ = null;
        $g2365$ = null;
        $g2366$ = null;
        $g2367$ = null;
        $g2368$ = null;
        $g2369$ = null;
        $g2370$ = null;
        $g2371$ = null;
        $g2372$ = null;
        $g2373$ = null;
        $g2374$ = null;
        $g2375$ = null;
        $g2376$ = null;
        $ic0$ = makeSymbol("DOUBLE-FLOAT");
        $ic1$ = makeString("~%;;; KB ~S statistics");
        $ic2$ = makeString("~%FORTs                   : ~9,' D");
        $ic3$ = makeString("~% Constants              : ~9,' D");
        $ic4$ = makeString("~%  cached indexing       : ~9,' D  (~A%)");
        $ic5$ = makeString("~% NARTs                  : ~9,' D");
        $ic6$ = makeString("~%  cached HL formulas    : ~9,' D  (~A%)");
        $ic7$ = makeString("~%Assertions              : ~9,' D");
        $ic8$ = makeString("~% KB Assertions          : ~9,' D");
        $ic9$ = makeString("~%  cached                : ~9,' D  (~A%)");
        $ic10$ = makeString("~% Bookkeeping Assertions : ~9,' D");
        $ic11$ = makeString("~%Deductions              : ~9,' D");
        $ic12$ = makeString("~%KB HL supports          : ~9,' D");
        $ic13$ = makeString("~%Unrepresented terms     : ~9,' D");
        $ic14$ = makeString("~%;;; KB ~S content statistics");
        $ic15$ = makeString("~%Terms                   : ~9,' D");
        $ic16$ = makeString("~% Collections            : ~9,' D");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic18$ = makeString("~%  FirstOrderCollections : ~9,' D");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("FirstOrderCollection"));
        $ic20$ = makeString("~%  SecondOrderCollections: ~9,' D");
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("SecondOrderCollection"));
        $ic22$ = makeString("~%  ThirdOrderCollections : ~9,' D");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("ThirdOrderCollection"));
        $ic24$ = makeString("~% Relations              : ~9,' D");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("Relation"));
        $ic26$ = makeString("~%  Denotational Functions: ~9,' D");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational"));
        $ic28$ = makeString("~%  Predicates            : ~9,' D");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic30$ = makeString("~% Individuals            : ~9,' D");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic32$ = makeString("~%KB Assertions           : ~9,' D");
        $ic33$ = makeSymbol("S#12274", "CYC");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic35$ = makeString("Calculating cardinalities of predicate extents");
        $ic36$ = makeKeyword("GAF");
        $ic37$ = makeSymbol(">");
        $ic38$ = makeSymbol("CDR");
        $ic39$ = makeKeyword("MT");
        $ic40$ = makeKeyword("BROAD-MT");
        $ic41$ = makeString("do-broad-mt-index");
        $ic42$ = makeSymbol("STRINGP");
        $ic43$ = makeKeyword("SKIP");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic45$ = makeKeyword("BREADTH");
        $ic46$ = makeKeyword("QUEUE");
        $ic47$ = makeKeyword("STACK");
        $ic48$ = makeSymbol("S#11450", "CYC");
        $ic49$ = makeKeyword("ERROR");
        $ic50$ = makeString("~A is not a ~A");
        $ic51$ = makeSymbol("S#11592", "CYC");
        $ic52$ = makeKeyword("CERROR");
        $ic53$ = makeString("continue anyway");
        $ic54$ = makeKeyword("WARN");
        $ic55$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic56$ = makeString("~A is neither SET-P nor LISTP.");
        $ic57$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic58$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic59$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic60$ = makeSymbol("S#12277", "CYC");
        $ic61$ = makeKeyword("TRUE");
        $ic62$ = makeSymbol("=");
        $ic63$ = makeSymbol("<");
        $ic64$ = (SubLFloat)makeDouble(17.1);
        $ic65$ = (SubLFloat)makeDouble(1.41);
        $ic66$ = (SubLFloat)makeDouble(2.67);
        $ic67$ = (SubLFloat)makeDouble(39.3);
        $ic68$ = (SubLFloat)makeDouble(30.3);
        $ic69$ = (SubLFloat)makeDouble(1.12);
        $ic70$ = (SubLFloat)makeDouble(7.97);
        $ic71$ = (SubLFloat)makeDouble(1.05);
        $ic72$ = makeInteger(50000);
        $ic73$ = makeSymbol("S#10562", "CYC");
        $ic74$ = makeSymbol("S#16749", "CYC");
        $ic75$ = makeSymbol("SHOW-NEW-KB-STATE");
        $ic76$ = makeString("~&;;; KB ~S new KB objects~%");
        $ic77$ = makeString("~&New FORTs               : ~9,' D~%");
        $ic78$ = makeString("~& New Constants          : ~9,' D~%");
        $ic79$ = makeString("~& New NARTs              : ~9,' D~%");
        $ic80$ = makeString("~&New Assertions          : ~9,' D~%");
        $ic81$ = makeString("~&New Deductions          : ~9,' D~%");
        $ic82$ = makeString("~&New KB HL Supports      : ~9,' D~%");
        $ic83$ = makeSymbol("CLEAR-NEW-KB-STATE");
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("S#16937", "CYC"), (SubLObject)makeSymbol("S#16938", "CYC"), (SubLObject)makeSymbol("S#16939", "CYC"), (SubLObject)makeSymbol("S#16940", "CYC"));
        $ic85$ = makeSymbol("S#16750", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#16939", "CYC"), (SubLObject)makeSymbol("S#16940", "CYC"));
        $ic87$ = makeSymbol("S#16753", "CYC");
        $ic88$ = makeSymbol("HL-INTERNAL-ID-STRING-P");
        $ic89$ = makeSymbol("COMPACT-HL-INTERNAL-ID-STRING-P");
        $ic90$ = makeSymbol("HL-INTERNAL-ID-STRING");
        $ic91$ = makeSymbol("COMPACT-HL-INTERNAL-ID-STRING");
        $ic92$ = makeSymbol("FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");
        $ic93$ = makeKeyword("HEX");
        $ic94$ = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");
        $ic95$ = makeKeyword("64");
        $ic96$ = makeSymbol("MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");
        $ic97$ = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");
        $ic98$ = makeSymbol("HL-EXTERNAL-ID-STRING-P");
        $ic99$ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING-P");
        $ic100$ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING?");
        $ic101$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic102$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic103$ = makeSymbol("S#5859", "CYC");
        $ic104$ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING=");
        $ic105$ = makeSymbol("HL-EXTERNAL-ID-STRING");
        $ic106$ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
        $ic107$ = makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING");
        $ic108$ = makeSymbol("FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic109$ = makeString("Invalid hl external id, '~A',  for a cycl term.~%.");
        $ic110$ = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic111$ = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $ic112$ = makeString("invalid mode ~S");
        $ic113$ = makeSymbol("S#16757", "CYC");
        $ic114$ = makeString("an unnamed constant");
        $ic115$ = makeString("~a");
        $ic116$ = makeSymbol("STABLE-SORT");
        $ic117$ = makeSymbol("SORT");
        $ic118$ = makeSymbol("S#16703", "CYC");
        $ic119$ = makeSymbol("FORT-P");
        $ic120$ = makeSymbol("S#16704", "CYC");
        $ic121$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("negationPreds")), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), constant_handles_oc.f8479((SubLObject)makeString("negationMt")), constant_handles_oc.f8479((SubLObject)makeString("defnIff")), constant_handles_oc.f8479((SubLObject)makeString("defnSufficient")), constant_handles_oc.f8479((SubLObject)makeString("defnNecessary")), constant_handles_oc.f8479((SubLObject)makeString("resultIsa")), constant_handles_oc.f8479((SubLObject)makeString("resultIsaArg")), constant_handles_oc.f8479((SubLObject)makeString("resultGenl")), constant_handles_oc.f8479((SubLObject)makeString("resultGenlArg")), constant_handles_oc.f8479((SubLObject)makeString("arity")), constant_handles_oc.f8479((SubLObject)makeString("arityMin")), constant_handles_oc.f8479((SubLObject)makeString("arityMax")), constant_handles_oc.f8479((SubLObject)makeString("argsIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsGenl")), constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), constant_handles_oc.f8479((SubLObject)makeString("argIsa")), constant_handles_oc.f8479((SubLObject)makeString("argGenl")), constant_handles_oc.f8479((SubLObject)makeString("fanOutArg")), constant_handles_oc.f8479((SubLObject)makeString("evaluationDefn")), constant_handles_oc.f8479((SubLObject)makeString("afterAdding")), constant_handles_oc.f8479((SubLObject)makeString("afterRemoving")) });
        $ic122$ = makeInteger(256);
        $ic123$ = makeSymbol("S#16768", "CYC");
        $ic124$ = makeSymbol("S#16769", "CYC");
        $ic125$ = makeInteger(500);
        $ic126$ = makeSymbol("VALUES");
        $ic127$ = makeSymbol("S#16774", "CYC");
        $ic128$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic129$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic130$ = makeKeyword("ALL");
        $ic131$ = makeString("cdolist");
        $ic132$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic133$ = makeSymbol("VECTOR");
        $ic134$ = makeString("cdotimes");
        $ic135$ = makeSymbol("INTEGERP");
        $ic136$ = makeString("examining creation times by ~S");
        $ic137$ = makeString("examining all creation times");
        $ic138$ = makeSymbol("S#3846", "CYC");
        $ic139$ = makeSymbol("CONSTANT-NAME");
        $ic140$ = makeSymbol("S#16782", "CYC");
        $ic141$ = makeSymbol("S#16787", "CYC");
        $ic142$ = makeSymbol("S#12591", "CYC");
        $ic143$ = makeSymbol("TERM-OF-UNIT");
        $ic144$ = makeString("examining assertion timestamps");
        $ic145$ = makeSymbol("ASSERTION-CNF");
        $ic146$ = makeSymbol("S#16792", "CYC");
        $ic147$ = makeSymbol("S#16793", "CYC");
        $ic148$ = makeSymbol("S#16786", "CYC");
        $ic149$ = makeSymbol("S#16921", "CYC");
        $ic150$ = makeInteger(512);
        $ic151$ = makeInteger(200);
        $ic152$ = makeSymbol("S#16791", "CYC");
        $ic153$ = makeSymbol("S#16922", "CYC");
        $ic154$ = makeString("searching for probably most recent assertion");
        $ic155$ = makeString("Gathering all constants");
        $ic156$ = makeString("Gathering all narts");
        $ic157$ = makeString("Gathering all forts");
        $ic158$ = makeString("Gathering all deductions");
        $ic159$ = makeString("Gathering all KB HL supports");
        $ic160$ = makeString("Gathering all assertions");
        $ic161$ = makeString("Gathering all gafs");
        $ic162$ = makeString("Gathering all forward gafs");
        $ic163$ = makeString("Gathering all backward gafs");
        $ic164$ = makeString("Gathering all rules");
        $ic165$ = makeString("Gathering all forward rules");
        $ic166$ = makeString("Gathering all backward rules");
        $ic167$ = makeSymbol("DEDUCED-ASSERTION?");
        $ic168$ = makeSymbol("S#3701", "CYC");
        $ic169$ = makeSymbol("ASSERTED-WHEN");
        $ic170$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#16941", "CYC"), (SubLObject)makeSymbol("S#16942", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic171$ = ConsesLow.list((SubLObject)makeKeyword("KB-CHANGED-MESSAGE"), (SubLObject)makeKeyword("KB-UNCHANGED-MESSAGE"));
        $ic172$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic173$ = makeKeyword("KB-CHANGED-MESSAGE");
        $ic174$ = makeKeyword("KB-UNCHANGED-MESSAGE");
        $ic175$ = makeUninternedSymbol("US#230FB88");
        $ic176$ = makeUninternedSymbol("US#230FB8B");
        $ic177$ = makeUninternedSymbol("US#7016630");
        $ic178$ = makeUninternedSymbol("US#D90EE2");
        $ic179$ = makeUninternedSymbol("US#60908A5");
        $ic180$ = makeUninternedSymbol("US#4E69BC2");
        $ic181$ = makeUninternedSymbol("US#4EC8ABD");
        $ic182$ = makeSymbol("CLET");
        $ic183$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16807", "CYC")));
        $ic184$ = makeSymbol("S#16808", "CYC");
        $ic185$ = makeSymbol("S#16809", "CYC");
        $ic186$ = makeSymbol("S#16810", "CYC");
        $ic187$ = makeSymbol("S#16811", "CYC");
        $ic188$ = makeSymbol("S#16812", "CYC");
        $ic189$ = makeSymbol("PIF");
        $ic190$ = makeSymbol("COR");
        $ic191$ = makeSymbol("S#93", "CYC");
        $ic192$ = makeSymbol("PROGN");
        $ic193$ = makeSymbol("PWHEN");
        $ic194$ = makeSymbol("FORMAT");
        $ic195$ = makeString("~&~A~%");
        $ic196$ = makeString("  ~s constant~A ~A~%");
        $ic197$ = makeSymbol("ABS");
        $ic198$ = makeSymbol("FIF");
        $ic199$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic200$ = ConsesLow.list((SubLObject)makeString("s were"), (SubLObject)makeString(" was"));
        $ic201$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic202$ = ConsesLow.list((SubLObject)makeString("created"), (SubLObject)makeString("destroyed"));
        $ic203$ = makeString("  ~s nart~A ~A~%");
        $ic204$ = makeString("  ~s assertion~A ~A~%");
        $ic205$ = makeString("  ~s kb-hl-support~A ~A~%");
        $ic206$ = makeString("  ~s deduction~A ~A~%");
        $ic207$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORCE-OUTPUT"), (SubLObject)T));
        $ic208$ = makeString("mapping Cyc constants");
        $ic209$ = makeKeyword("UNKNOWN-SECOND");
        $ic210$ = makeSymbol("S#16819", "CYC");
        $ic211$ = makeSymbol("FOURTH");
        $ic212$ = makeSymbol("S#16818", "CYC");
        $ic213$ = makeSymbol("FIRST");
        $ic214$ = makeKeyword("UNKNOWN-DATE");
        $ic215$ = makeKeyword("UNKNOWN-ID");
        $ic216$ = ConsesLow.list((SubLObject)makeSymbol("S#16943", "CYC"), (SubLObject)makeSymbol("S#16944", "CYC"), (SubLObject)makeSymbol("S#16945", "CYC"), (SubLObject)makeSymbol("S#16946", "CYC"));
        $ic217$ = ConsesLow.list((SubLObject)makeSymbol("S#16947", "CYC"), (SubLObject)makeSymbol("S#16948", "CYC"), (SubLObject)makeSymbol("S#16949", "CYC"), (SubLObject)makeSymbol("S#16950", "CYC"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)makeString("Microtheory"));
        $ic219$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic220$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic221$ = makeKeyword("INDEX");
        $ic222$ = makeKeyword("PREDICATE");
        $ic223$ = makeKeyword("TRUTH");
        $ic224$ = makeKeyword("DIRECTION");
        $ic225$ = makeKeyword("DONE");
        $ic226$ = makeUninternedSymbol("US#40E3221");
        $ic227$ = makeSymbol("EXPRESSION-GATHER");
        $ic228$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("INDEXED-TERM-P")), (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUAL));
        $ic229$ = makeSymbol("INDEXED-TERM-P");
        $ic230$ = makeSymbol("CPUSH");
        $ic231$ = makeSymbol("S#13025", "CYC");
        $ic232$ = makeSymbol("CAND");
        $ic233$ = makeSymbol("NULL");
        $ic234$ = makeSymbol("ASSERTION-DIRECTION");
        $ic235$ = makeSymbol("FORMULA-OPERATOR");
        $ic236$ = makeSymbol("ASSERTION-FORMULA");
        $ic237$ = makeSymbol("S#15512", "CYC");
        $ic238$ = makeSymbol("S#15841", "CYC");
        $ic239$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic240$ = ConsesLow.list((SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DONE"));
        $ic241$ = makeUninternedSymbol("US#40E3221");
        $ic242$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("INDEXED-TERM-P")), (SubLObject)NIL);
        $ic243$ = makeSymbol("CNOT");
        $ic244$ = makeSymbol("EXPRESSION-FIND");
        $ic245$ = ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQUAL));
        $ic246$ = makeSymbol("ASSERTION-MT");
        $ic247$ = makeSymbol("FUNCTION-SPEC-P");
        $ic248$ = makeSymbol("NAUT-P");
        $ic249$ = makeKeyword("MAPPING-DONE");
        $ic250$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic251$ = makeSymbol("S#15602", "CYC");
        $ic252$ = constant_handles_oc.f8479((SubLObject)makeString("Nothing"));
        $ic253$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn"));
        $ic254$ = ConsesLow.list((SubLObject)makeKeyword("IGNORE-RL-MODULES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionSimplifierRLModule"))));
        $ic255$ = ConsesLow.list((SubLObject)makeKeyword("FOCUS"), constant_handles_oc.f8479((SubLObject)makeString("SubcollectionSimplifierRLModule")));
        $ic256$ = ConsesLow.list((SubLObject)makeSymbol("S#16951", "CYC"), (SubLObject)makeSymbol("S#63", "CYC"));
        $ic257$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersection2Fn"));
        $ic258$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersectionFn"));
        $ic259$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic260$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic261$ = makeString("~S was not a set");
        $ic262$ = makeSymbol("S#16829", "CYC");
        $ic263$ = makeSymbol("S#16924", "CYC");
        $ic264$ = makeSymbol("S#16708", "CYC");
        $ic265$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic266$ = makeSymbol("CONSTANT-P");
        $ic267$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UnderspecifiedCollectionType")), constant_handles_oc.f8479((SubLObject)makeString("CycKBSubsetCollection")));
        $ic268$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("WorkflowConstant")), constant_handles_oc.f8479((SubLObject)makeString("TPTP-PLA001-1-ProblemFORT")), constant_handles_oc.f8479((SubLObject)makeString("PoorlyOntologized")), constant_handles_oc.f8479((SubLObject)makeString("StubTerm")), constant_handles_oc.f8479((SubLObject)makeString("IndeterminateTerm")));
        $ic269$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PotentialCBRNEThreat")), constant_handles_oc.f8479((SubLObject)makeString("Y2KThing")), constant_handles_oc.f8479((SubLObject)makeString("BPVMilitaryUnit")), constant_handles_oc.f8479((SubLObject)makeString("BPVEvent")), constant_handles_oc.f8479((SubLObject)makeString("BPVArtifact")), constant_handles_oc.f8479((SubLObject)makeString("BPVAgent")), constant_handles_oc.f8479((SubLObject)makeString("HPKB-TransnationalAgent")));
        $ic270$ = makeSymbol("SPEC-CARDINALITY");
        $ic271$ = makeString("~5,d ~s~%");
        $ic272$ = makeString("~%Total coverage: ~S%~%");
        $ic273$ = makeInteger(100);
        $ic274$ = makeString("~%Optimizing coverage via relative overlap:~%");
        $ic275$ = makeString("~s: ~s unique spec~p~%");
        $ic276$ = makeSymbol("S#16840", "CYC");
        $ic277$ = makeSymbol("S#16846", "CYC");
        $ic278$ = makeSymbol("S#16839", "CYC");
        $ic279$ = makeSymbol("S#16930", "CYC");
        $ic280$ = makeSymbol("S#16710", "CYC");
        $ic281$ = makeSymbol("S#16931", "CYC");
        $ic282$ = makeSymbol("S#16843", "CYC");
        $ic283$ = makeSymbol("S#16850", "CYC");
        $ic284$ = makeSymbol("S#16932", "CYC");
        $ic285$ = makeSymbol("S#16847", "CYC");
        $ic286$ = makeSymbol("S#16855", "CYC");
        $ic287$ = ConsesLow.list((SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_greater, (SubLObject)Characters.CHAR_hash);
        $ic288$ = makeSymbol("S#747", "CYC");
        $ic289$ = makeSymbol("COLLECTION-P");
        $ic290$ = makeSymbol("S#707", "CYC");
        $ic291$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("SET"));
        $ic292$ = makeSymbol("LIST");
        $ic293$ = makeSymbol("PREDICATE-P");
        $ic294$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("SET"));
        $ic295$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("UnaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)THREE_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("TernaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)FOUR_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("QuaternaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)FIVE_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("QuintaryPredicate"))));
        $ic296$ = makeInteger(10000);
        $ic297$ = makeString("All args of ~s were open");
        $ic298$ = constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate"));
        $ic299$ = makeSymbol("S#16880", "CYC");
        $ic300$ = constant_handles_oc.f8479((SubLObject)makeString("Date"));
        $ic301$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic302$ = ConsesLow.list((SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_colon);
        $ic303$ = makeSymbol("S#11995", "CYC");
        $ic304$ = makeKeyword("IGNORE");
        $ic305$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"));
        $ic306$ = constant_handles_oc.f8479((SubLObject)makeString("oldConstantName"));
        $ic307$ = makeSymbol("S#16890", "CYC");
        $ic308$ = makeSymbol("S#16894", "CYC");
        $ic309$ = makeSymbol("S#16936", "CYC");
        $ic310$ = makeString(" ");
        $ic311$ = makeKeyword("OUTPUT");
        $ic312$ = makeString("Unable to open ~S");
        $ic313$ = makeString("Writing coasserted forts");
        $ic314$ = makeSymbol("S#38", "CYC");
        $ic315$ = makeString("~A");
        $ic316$ = constant_handles_oc.f8479((SubLObject)makeString("CoreUnionConstant"));
        $ic317$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic318$ = makeSymbol("S#16898", "CYC");
        $ic319$ = makeString("SpecMt");
        $ic320$ = makeSymbol("S#16717", "CYC");
        $ic321$ = makeInteger(100000);
        $ic322$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic323$ = makeString("Unable to create HL object evaluatably: ~S~%");
        $ic324$ = makeString("'");
        $ic325$ = makeString("(string-to-guid ");
        $ic326$ = makeString(")");
        $ic327$ = makeString("(find-variable-by-id ");
        $ic328$ = makeSymbol("S#16902", "CYC");
        $ic329$ = makeSymbol("S#16903", "CYC");
        $ic330$ = makeString("AAAAAAAAAAAAA");
        $ic331$ = makeString(",(find-nart `");
        $ic332$ = makeString("(AAAAAAAAAAAAAFIND-NART ");
        $ic333$ = makeString(",(find-variable-by-id ");
        $ic334$ = makeString("(AAAAAAAAAAAAAFIND-VARIABLE-BY-ID ");
        $ic335$ = makeString(",(string-to-guid ");
        $ic336$ = makeString("(AAAAAAAAAAAAASTRING-TO-GUID ");
        $ic337$ = makeString(",(find-assertion `");
        $ic338$ = makeString("(AAAAAAAAAAAAAFIND-ASSERTION ");
        $ic339$ = makeString(",(find-deduction `");
        $ic340$ = makeString("(AAAAAAAAAAAAAFIND-DEDUCTION ");
        $ic341$ = makeString(",(find-kb-hl-support `");
        $ic342$ = makeString("(AAAAAAAAAAAAAFIND-KB-HL-SUPPORT ");
        $ic343$ = makeString("`");
        $ic344$ = makeString("(AAAAAAAAAAAAA) ");
        $ic345$ = makeString(" AAAAAAAAAAAAAFIND-VARIABLE-BY-ID ");
        $ic346$ = makeString("AAAAAAAAAAAAAFIND-VARIABLE-BY-ID");
        $ic347$ = makeString("[0-9]+");
        $ic348$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic349$ = makeString(" . ,(find-variable-by-id ");
        $ic350$ = makeString("Unable to create HL object evaluatably: ~S");
        $ic351$ = makeSymbol("S#16952", "CYC");
        $ic352$ = makeSymbol("S#16953", "CYC");
        $ic353$ = makeSymbol("S#16954", "CYC");
        $ic354$ = makeSymbol("S#16955", "CYC");
        $ic355$ = ConsesLow.list((SubLObject)makeSymbol("S#16956", "CYC"));
        $ic356$ = makeSymbol("S#16957", "CYC");
        $ic357$ = makeSymbol("S#16958", "CYC");
        $ic358$ = makeString("Unexpected situation.");
        $ic359$ = makeString("-");
    }
    
    public static final class $f13913$UnaryFunction extends UnaryFunction
    {
        public $f13913$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-EXTERNAL-ID-STRING-P"));
        }
        
        public SubLObject processItem(final SubLObject var261) {
            return f13913(var261);
        }
    }
    
    public static final class $f13927$BinaryFunction extends BinaryFunction
    {
        public $f13927$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3846"));
        }
        
        public SubLObject processItem(final SubLObject var261, final SubLObject var287) {
            return f13927(var261, var287, (SubLObject)$f13927$BinaryFunction.UNPROVIDED, (SubLObject)$f13927$BinaryFunction.UNPROVIDED, (SubLObject)$f13927$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f13928$BinaryFunction extends BinaryFunction
    {
        public $f13928$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16703"));
        }
        
        public SubLObject processItem(final SubLObject var261, final SubLObject var287) {
            return f13928(var261, var287);
        }
    }
    
    public static final class $f13936$BinaryFunction extends BinaryFunction
    {
        public $f13936$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16704"));
        }
        
        public SubLObject processItem(final SubLObject var261, final SubLObject var287) {
            return f13936(var261, var287);
        }
    }
    
    public static final class $f14002$ZeroArityFunction extends ZeroArityFunction
    {
        public $f14002$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16708"));
        }
        
        public SubLObject processItem() {
            return f14002();
        }
    }
    
    public static final class $f14016$ZeroArityFunction extends ZeroArityFunction
    {
        public $f14016$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16710"));
        }
        
        public SubLObject processItem() {
            return f14016();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4510 ms
	
	Decompiled with Procyon 0.5.32.
*/