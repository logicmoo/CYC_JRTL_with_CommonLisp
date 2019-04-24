package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0767 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0767";
    public static final String myFingerPrint = "675e3b7143bdc66699575efe7f7ac50ffe2e65c835ab4dd3b3c9174b370d27e8";
    private static SubLSymbol $g6130$;
    private static SubLSymbol $g6131$;
    public static SubLSymbol $g6132$;
    private static SubLSymbol $g6133$;
    private static SubLSymbol $g6134$;
    private static SubLSymbol $g6135$;
    private static SubLSymbol $g6137$;
    private static SubLSymbol $g6138$;
    private static SubLSymbol $g6139$;
    private static SubLSymbol $g6136$;
    private static SubLSymbol $g6140$;
    private static SubLSymbol $g6141$;
    private static SubLSymbol $g6142$;
    private static SubLSymbol $g6143$;
    private static SubLSymbol $g6144$;
    private static SubLSymbol $g6145$;
    private static SubLSymbol $g6146$;
    private static SubLSymbol $g6147$;
    private static SubLSymbol $g6148$;
    private static SubLSymbol $g6149$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLString $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLString $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLString $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLList $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLList $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLList $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLInteger $ic154$;
    private static final SubLList $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLObject $ic176$;
    private static final SubLObject $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLList $ic181$;
    private static final SubLList $ic182$;
    private static final SubLList $ic183$;
    private static final SubLList $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLString $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLInteger $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLObject $ic197$;
    private static final SubLObject $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLInteger $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLString $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLObject $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLObject $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLString $ic219$;
    private static final SubLObject $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLObject $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLInteger $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLObject $ic229$;
    private static final SubLList $ic230$;
    private static final SubLObject $ic231$;
    private static final SubLList $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLObject $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLList $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLObject $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLObject $ic247$;
    private static final SubLObject $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLString $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLString $ic261$;
    private static final SubLObject $ic262$;
    private static final SubLString $ic263$;
    private static final SubLString $ic264$;
    private static final SubLString $ic265$;
    private static final SubLString $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLList $ic268$;
    private static final SubLList $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLInteger $ic271$;
    private static final SubLString $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLString $ic275$;
    private static final SubLObject $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLObject $ic278$;
    private static final SubLList $ic279$;
    private static final SubLList $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLObject $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLObject $ic292$;
    private static final SubLObject $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLObject $ic299$;
    private static final SubLList $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLObject $ic302$;
    private static final SubLObject $ic303$;
    private static final SubLObject $ic304$;
    private static final SubLList $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLObject $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLObject $ic311$;
    private static final SubLList $ic312$;
    private static final SubLObject $ic313$;
    private static final SubLObject $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLList $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLList $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLObject $ic325$;
    private static final SubLObject $ic326$;
    private static final SubLList $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLList $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLObject $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLObject $ic333$;
    private static final SubLList $ic334$;
    private static final SubLObject $ic335$;
    private static final SubLObject $ic336$;
    private static final SubLList $ic337$;
    private static final SubLObject $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLList $ic340$;
    private static final SubLObject $ic341$;
    private static final SubLObject $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLList $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLObject $ic351$;
    private static final SubLObject $ic352$;
    private static final SubLList $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLObject $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLInteger $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLList $ic360$;
    private static final SubLObject $ic361$;
    private static final SubLString $ic362$;
    private static final SubLObject $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLList $ic365$;
    private static final SubLList $ic366$;
    private static final SubLString $ic367$;
    private static final SubLList $ic368$;
    private static final SubLObject $ic369$;
    private static final SubLObject $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLObject $ic372$;
    private static final SubLString $ic373$;
    private static final SubLObject $ic374$;
    private static final SubLObject $ic375$;
    private static final SubLObject $ic376$;
    private static final SubLObject $ic377$;
    private static final SubLObject $ic378$;
    private static final SubLObject $ic379$;
    private static final SubLObject $ic380$;
    private static final SubLObject $ic381$;
    private static final SubLObject $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLObject $ic384$;
    private static final SubLList $ic385$;
    private static final SubLList $ic386$;
    private static final SubLString $ic387$;
    private static final SubLList $ic388$;
    private static final SubLObject $ic389$;
    private static final SubLObject $ic390$;
    private static final SubLObject $ic391$;
    private static final SubLSymbol $ic392$;
    private static final SubLObject $ic393$;
    private static final SubLObject $ic394$;
    private static final SubLString $ic395$;
    private static final SubLObject $ic396$;
    private static final SubLObject $ic397$;
    private static final SubLObject $ic398$;
    private static final SubLObject $ic399$;
    private static final SubLString $ic400$;
    
    public static SubLObject f48780(final SubLObject var1, final SubLObject var2) {
        if (var1.eql((SubLObject)module0767.$ic0$)) {
            return f48781(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic1$)) {
            return module0765.f48543(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic2$)) {
            return f48782(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic3$)) {
            return f48783(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic4$)) {
            return f48784(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic5$)) {
            return f48785(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic6$)) {
            return f48786(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic7$)) {
            return f48787(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic8$)) {
            return module0765.f48608(var2);
        }
        if (var1.eql((SubLObject)module0767.$ic9$)) {
            return f48788(var2);
        }
        return Functions.funcall(var1, var2);
    }
    
    public static SubLObject f48789(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = f48790(module0205.f13144(var4));
        module0756.f47715(var2);
        if (module0579.$g4259$.getDynamicValue(var3) == module0767.$ic13$ && module0767.NIL != module0579.$g4242$.getDynamicValue(var3)) {
            module0769.f49040(var2);
        }
        module0756.f47723(var2, var5);
        module0756.f47783(var2, module0767.$ic14$, (SubLObject)module0767.UNPROVIDED);
        return var2;
    }
    
    public static SubLObject f48791() {
        final SubLObject var7 = module0767.$g6131$.getGlobalValue();
        if (module0767.NIL != var7) {
            module0034.f1818(var7);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48792(final SubLObject var5) {
        return module0034.f1829(module0767.$g6131$.getGlobalValue(), (SubLObject)ConsesLow.list(var5), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48793(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0767.NIL;
        final SubLObject var8 = module0579.$g4262$.currentBinding(var6);
        try {
            module0579.$g4262$.bind(module0767.$ic16$, var6);
            final SubLObject var9 = f48794(var5, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var9_11 = module0579.$g4259$.currentBinding(var6);
            try {
                module0579.$g4259$.bind((SubLObject)module0767.$ic17$, var6);
                final SubLObject var10 = (SubLObject)(var9.eql(module0767.$ic18$) ? module0767.$ic19$ : f48795(module0770.f49097(var9, (SubLObject)module0767.$ic20$, (SubLObject)module0767.UNPROVIDED)));
                final SubLObject var11 = module0067.f4885(module0767.$g6130$.getGlobalValue(), var10, (SubLObject)module0767.ONE_INTEGER);
                final SubLObject var12 = module0038.f2638(var11);
                module0084.f5775(module0767.$g6130$.getGlobalValue(), var10, (SubLObject)module0767.UNPROVIDED);
                var7 = Sequences.cconcatenate(var10, new SubLObject[] { module0767.$ic21$, var12 });
            }
            finally {
                module0579.$g4259$.rebind(var9_11, var6);
            }
        }
        finally {
            module0579.$g4262$.rebind(var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f48790(final SubLObject var5) {
        SubLObject var6 = module0767.$g6131$.getGlobalValue();
        if (module0767.NIL == var6) {
            var6 = module0034.f1934((SubLObject)module0767.$ic15$, (SubLObject)module0767.$ic22$, (SubLObject)module0767.NIL, (SubLObject)module0767.EQUAL, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.ZERO_INTEGER);
        }
        SubLObject var7 = module0034.f1814(var6, var5, (SubLObject)module0767.$ic23$);
        if (var7 == module0767.$ic23$) {
            var7 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48793(var5)));
            module0034.f1816(var6, var5, var7, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var7);
    }
    
    public static SubLObject f48795(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0767.NIL;
        final SubLObject var9 = module0580.f35545();
        final SubLObject var10 = module0034.$g879$.currentBinding(var7);
        try {
            module0034.$g879$.bind(var9, var7);
            SubLObject var11 = (SubLObject)module0767.NIL;
            if (module0767.NIL != var9 && module0767.NIL == module0034.f1842(var9)) {
                var11 = module0034.f1869(var9);
                final SubLObject var12 = Threads.current_process();
                if (module0767.NIL == var11) {
                    module0034.f1873(var9, var12);
                }
                else if (!var11.eql(var12)) {
                    Errors.error((SubLObject)module0767.$ic24$);
                }
            }
            try {
                var8 = module0038.f2773(var6);
            }
            finally {
                final SubLObject var9_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var7);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0767.T, var7);
                    if (module0767.NIL != var9 && module0767.NIL == var11) {
                        module0034.f1873(var9, (SubLObject)module0767.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var9_21, var7);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var10, var7);
        }
        return var8;
    }
    
    public static SubLObject f48794(final SubLObject var22, SubLObject var23) {
        if (var23 == module0767.UNPROVIDED) {
            var23 = (SubLObject)module0767.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0767.NIL;
        final SubLObject var26 = module0147.f9540(module0579.$g4262$.getDynamicValue(var24));
        final SubLObject var27 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var24);
            module0147.$g2094$.bind(module0147.f9546(var26), var24);
            module0147.$g2096$.bind(module0147.f9549(var26), var24);
            final SubLObject var30 = conses_high.set_difference(module0259.f16822(var22, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), var23, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED).first();
            var25 = ((module0767.NIL != var30) ? var30 : module0767.$ic18$);
        }
        finally {
            module0147.$g2096$.rebind(var29, var24);
            module0147.$g2094$.rebind(var28, var24);
            module0147.$g2095$.rebind(var27, var24);
        }
        return var25;
    }
    
    public static SubLObject f48796(final SubLObject var28, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)module0767.NIL;
        SubLObject var32 = (SubLObject)module0767.NIL;
        final SubLObject var33 = module0147.$g2094$.currentBinding(var30);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var30);
        try {
            module0147.$g2094$.bind((SubLObject)module0767.$ic25$, var30);
            module0147.$g2095$.bind(module0767.$ic26$, var30);
            var31 = module0226.f14882(var28, var29, (SubLObject)module0767.UNPROVIDED).first();
            if (module0767.NIL != var31) {
                var32 = module0751.f46669(var31, module0767.$ic27$, (SubLObject)module0767.UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var34, var30);
            module0147.$g2094$.rebind(var33, var30);
        }
        return var32;
    }
    
    public static SubLObject f48797(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = module0756.f47488(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var6 = f48798((SubLObject)module0767.$ic31$, var4, var5, (SubLObject)module0767.$ic12$, module0751.f47118());
        if (module0767.NIL != module0749.f46482(var6) && module0767.NIL != module0581.f35648(module0749.f46455(var6))) {
            module0756.f47501(var2, (SubLObject)ConsesLow.list(var6), (SubLObject)module0767.UNPROVIDED);
            module0756.f47715(var2);
            module0756.f47608(var2);
        }
        if (module0767.NIL == module0756.f47479(var2)) {
            final SubLObject var7 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var8 = module0233.f15376(module0579.$g4278$.getDynamicValue(var3), var7);
            if (module0767.NIL != module0201.f12546(var8)) {
                var3.resetMultipleValues();
                final SubLObject var9 = f48799(var8, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                final SubLObject var10 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (module0767.NIL != var9) {
                    module0756.f47608(var2);
                    module0756.f47501(var2, var9, (SubLObject)module0767.UNPROVIDED);
                    f48800(var8, var2, (SubLObject)module0767.UNPROVIDED);
                    module0756.f47783(var2, (module0767.NIL != var10) ? var10 : module0767.$ic32$, (SubLObject)module0767.UNPROVIDED);
                    module0756.f47465(var2, var8);
                }
            }
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48783(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        var3.resetMultipleValues();
        final SubLObject var5 = (module0767.NIL != module0579.$g4279$.getDynamicValue(var3) && (module0767.NIL != module0756.f47591(var2) || module0767.NIL != module0758.f47984(var2) || module0767.NIL != module0758.f47983(var2) || module0767.NIL == module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED) || module0767.NIL != module0754.f47341(var4) || (module0767.NIL != module0756.f47727(var2) && module0767.NIL == module0754.f47311(var4))) && module0767.NIL != f48801(var4, (SubLObject)module0767.UNPROVIDED)) ? f48802(var2) : f48799(var4, (SubLObject)module0767.T, var2);
        final SubLObject var6 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        module0756.f47501(var2, var5, (SubLObject)module0767.UNPROVIDED);
        f48800(var4, var2, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL != module0756.f47466(var5)) {
            module0756.f47608(var2);
        }
        if (module0767.NIL != module0756.f47479(var2)) {
            module0756.f47783(var2, (module0767.NIL != var6) ? var6 : module0767.$ic32$, (SubLObject)module0767.UNPROVIDED);
        }
        else if (module0767.NIL != module0756.f47478(var2)) {
            module0756.f47491(var2);
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48800(final SubLObject var35, final SubLObject var2, SubLObject var37) {
        if (var37 == module0767.UNPROVIDED) {
            var37 = module0756.f47511(var2);
        }
        final SubLObject var38 = module0751.f46982((SubLObject)module0767.NIL, var37);
        return f48803(var2, var35, var38);
    }
    
    public static SubLObject f48804(final SubLObject var2, final SubLObject var30, final SubLObject var39) {
        SubLObject var40 = var39;
        SubLObject var41 = (SubLObject)module0767.NIL;
        var41 = var40.first();
        while (module0767.NIL != var40) {
            SubLObject var43;
            final SubLObject var42 = var43 = var41;
            SubLObject var44 = (SubLObject)module0767.NIL;
            SubLObject var45 = (SubLObject)module0767.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0767.$ic35$);
            var44 = var43.first();
            var43 = (var45 = var43.rest());
            final SubLObject var46 = module0751.f46621(var30, var44);
            if (module0767.NIL != var46) {
                f48803(var2, var46, var45);
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var2;
    }
    
    public static SubLObject f48805(final SubLObject var2, final SubLObject var30, final SubLObject var47) {
        return f48803(var2, var30, var47);
    }
    
    public static SubLObject f48803(final SubLObject var2, final SubLObject var48, final SubLObject var49) {
        SubLObject var50 = (SubLObject)module0767.NIL;
        SubLObject var51 = (SubLObject)module0767.NIL;
        SubLObject var52 = module0756.f47467(var2);
        SubLObject var53 = (SubLObject)module0767.NIL;
        var53 = var52.first();
        while (module0767.NIL != var52) {
            if (var48.equal(module0749.f46466(var53))) {
                var50 = (SubLObject)module0767.T;
                module0749.f46464(var53, var49);
            }
            else if (module0749.f46474(var53).isString() || module0749.f46476(var53).isString()) {
                var51 = (SubLObject)module0767.T;
            }
            else if (module0767.NIL == module0756.f47476(module0749.f46466(var53)) && module0767.NIL == module0751.f46829(module0749.f46462(var53))) {
                var51 = (SubLObject)module0767.T;
            }
            var52 = var52.rest();
            var53 = var52.first();
        }
        if (module0767.NIL == var50 && module0767.NIL == var51) {
            module0756.f47709(var2, var49, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            module0756.f47468(var2, var48);
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48801(final SubLObject var35, SubLObject var53) {
        if (var53 == module0767.UNPROVIDED) {
            var53 = (SubLObject)module0767.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == module0765.f48631(var35) && module0767.NIL == module0754.f47338(var35) && (module0767.NIL == var53 || module0767.NIL != module0754.f47318(var35) || module0767.NIL != module0754.f47325(var35)) && module0767.NIL == module0754.f47336(var35));
    }
    
    public static SubLObject f48799(final SubLObject var35, SubLObject var54, SubLObject var55) {
        if (var54 == module0767.UNPROVIDED) {
            var54 = (SubLObject)module0767.NIL;
        }
        if (var55 == module0767.UNPROVIDED) {
            var55 = module0749.f46494((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        }
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = (module0579.$g4259$.getDynamicValue(var56) == module0767.$ic17$) ? module0201.f12548(var35) : module0201.f12563(var35);
        SubLObject var58 = module0767.$ic32$;
        module0756.f47723(var55, var57);
        module0756.f47465(var55, var35);
        module0756.f47468(var55, var35);
        f48806(var55);
        if (module0767.NIL != module0751.f46661((SubLObject)module0767.UNPROVIDED)) {
            SubLObject var59 = (SubLObject)module0767.NIL;
            if (module0767.NIL != var54 && module0767.NIL != module0579.$g4276$.getDynamicValue(var56) && module0767.NIL == module0754.f47339(var35) && (module0767.NIL == module0756.f47481(var55, (SubLObject)module0767.UNPROVIDED) || module0767.NIL != module0756.f47591(var55) || module0767.NIL != module0758.f47984(var55) || module0767.NIL != module0758.f47983(var55))) {
                var59 = f48807(var55, (SubLObject)module0767.UNPROVIDED);
            }
            if (module0767.NIL != module0751.f46684(var35, module0767.$ic27$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0756.f47727(var55)) {
                var56.resetMultipleValues();
                final SubLObject var60 = f48808(module0756.f47488(var55, (SubLObject)module0767.UNPROVIDED));
                final SubLObject var61 = var56.secondMultipleValue();
                var56.resetMultipleValues();
                var59 = (SubLObject)ConsesLow.cons(var60, var59);
                var58 = ((module0767.NIL != var61) ? var61 : var58);
            }
            module0756.f47501(var55, ConsesLow.append(var59, module0756.f47467(var55)), (SubLObject)module0767.UNPROVIDED);
        }
        return Values.values(module0756.f47467(var55), var58);
    }
    
    public static SubLObject f48808(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0767.NIL;
        SubLObject var63 = module0767.$ic32$;
        var61.resetMultipleValues();
        final SubLObject var62_63 = module0764.f48440(module0767.$ic36$, module0767.$ic37$, var60, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var64_65 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        var62 = var62_63;
        var63 = var64_65;
        final SubLObject var64 = (SubLObject)((module0767.NIL != var62) ? var62 : module0767.$ic38$);
        final SubLObject var65 = Sequences.cconcatenate(module0006.f203(var64), (SubLObject)module0767.$ic39$);
        return Values.values(module0772.f49212(var65), var63);
    }
    
    public static SubLObject f48806(final SubLObject var55) {
        if (module0767.NIL != f48809()) {
            module0769.f49040(var55);
        }
        return var55;
    }
    
    public static SubLObject f48809() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0579.$g4259$.getDynamicValue(var4) == module0767.$ic13$ && module0767.NIL != module0579.$g4241$.getDynamicValue(var4));
    }
    
    public static SubLObject f48807(final SubLObject var55, SubLObject var68) {
        if (var68 == module0767.UNPROVIDED) {
            var68 = f48810(var55);
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = module0756.f47487(var55, (SubLObject)module0767.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0579.$g4268$.getDynamicValue(var69)) {
            final SubLObject var72 = var68;
            if (var72.eql((SubLObject)module0767.$ic40$)) {
                if (module0767.NIL == f48811(var70)) {
                    var71 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic41$, (SubLObject)module0767.NIL, var70, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
                }
            }
            else if (var72.eql((SubLObject)module0767.$ic42$)) {
                var71 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic43$, (SubLObject)module0767.NIL, var70, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
            }
            else if (var72.eql((SubLObject)module0767.$ic44$)) {
                var71 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic45$, (SubLObject)module0767.NIL, var70, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
            }
            else if (var72.eql((SubLObject)module0767.$ic46$)) {
                var71 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic47$, (SubLObject)module0767.NIL, var70, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
            }
        }
        return var71;
    }
    
    public static SubLObject f48811(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = Sequences.find_if((SubLObject)module0767.$ic48$, module0579.$g4320$.getDynamicValue(var36), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var38 = (SubLObject)((module0767.NIL != var37) ? module0205.f13378(var37) : module0767.NIL);
        final SubLObject var39 = (SubLObject)((module0767.NIL != module0212.f13762(var38)) ? module0205.f13319(var38, (SubLObject)module0767.UNPROVIDED) : module0767.NIL);
        SubLObject var40 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var40) {
            SubLObject var41 = var39;
            SubLObject var42 = (SubLObject)module0767.NIL;
            var42 = var41.first();
            while (module0767.NIL == var40 && module0767.NIL != var41) {
                if (var35.eql(module0205.f13384(var37, var42, (SubLObject)module0767.UNPROVIDED))) {
                    var40 = (SubLObject)module0767.T;
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        return var40;
    }
    
    public static SubLObject f48802(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var6 = (SubLObject)((module0767.NIL != module0756.f47728(var2)) ? module0756.f47691(var2) : module0767.NIL);
        final SubLObject var7 = (module0767.NIL != var6) ? var6 : module0767.$ic49$;
        final SubLObject var8 = module0754.f47312(var4);
        final SubLObject var9 = (SubLObject)((module0767.NIL != var8) ? module0754.f47335(var8) : module0767.NIL);
        final SubLObject var10 = module0755.f47386(var4);
        final SubLObject var11 = f48810(var2);
        SubLObject var12 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic50$, new SubLObject[] { var4, var8, module0579.$g4314$.getDynamicValue(var3) });
        }
        if (module0767.NIL != module0758.f47880(var2) && module0767.NIL != var8 && module0767.NIL != var10 && module0767.NIL == var9 && module0767.NIL == module0731.f44892(var5) && (module0767.NIL != module0754.f47344(var4) || module0767.NIL == module0764.f48499(var4))) {
            final SubLObject var13 = module0764.f48494(var2);
            if (module0767.NIL != module0756.f47466(var13)) {
                module0756.f47501(var2, var13, (SubLObject)module0767.UNPROVIDED);
                var12 = module0756.f47691(var2);
                module0756.f47608(var2);
            }
        }
        if (module0767.NIL == module0756.f47479(var2)) {
            final SubLObject var14 = module0756.f47511(var2);
            final SubLObject var15 = f48812(var4, var11, var5, var7, var14, var2);
            final SubLObject var16 = (SubLObject)((module0767.NIL != module0756.f47479(var15)) ? module0756.f47467(var15) : module0767.NIL);
            if (module0767.NIL != module0756.f47466(var16)) {
                var12 = module0756.f47691(var2);
                module0756.f47484(var15, var2, (SubLObject)module0767.UNPROVIDED);
                module0756.f47608(var2);
            }
        }
        return Values.values((SubLObject)((module0767.NIL != module0756.f47479(var2)) ? module0756.f47467(var2) : module0767.NIL), (SubLObject)((module0767.NIL != module0756.f47479(var2)) ? var12 : module0767.NIL));
    }
    
    public static SubLObject f48812(final SubLObject var35, final SubLObject var68, final SubLObject var83, SubLObject var77, SubLObject var37, SubLObject var84) {
        if (var77 == module0767.UNPROVIDED) {
            var77 = (SubLObject)module0767.NIL;
        }
        if (var37 == module0767.UNPROVIDED) {
            var37 = module0751.f47200();
        }
        if (var84 == module0767.UNPROVIDED) {
            var84 = (SubLObject)module0767.NIL;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        if (module0767.NIL == var84) {
            var84 = module0756.f47463(var35, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        }
        final SubLObject var86 = f48813(var35, (SubLObject)module0767.T);
        final SubLObject var87 = module0754.f47333(var35);
        final SubLObject var88 = module0731.f44892(var83);
        final SubLObject var89 = f48814(var35);
        final SubLObject var90 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != var83 && (module0767.NIL != module0751.f46640(var83, module0767.$ic51$, (SubLObject)module0767.UNPROVIDED) || module0767.NIL != module0751.f46640(var83, (SubLObject)module0767.$ic52$, (SubLObject)module0767.UNPROVIDED)));
        final SubLObject var91 = (SubLObject)((module0767.NIL != var88) ? module0767.$ic53$ : ((module0767.NIL != var90) ? module0767.$ic54$ : module0767.$ic55$));
        final SubLObject var92 = (module0767.NIL != module0751.f46658(var77, module0767.$ic56$, (SubLObject)module0767.UNPROVIDED)) ? var77 : module0767.$ic32$;
        final SubLObject var93 = Functions.funcall(var91, var86, var68, var92, var89);
        final SubLObject var94 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == var77 || module0767.NIL != module0751.f47099((SubLObject)ConsesLow.list(var77), (SubLObject)ConsesLow.list(var92), (SubLObject)module0767.UNPROVIDED));
        SubLObject var95 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var94 && module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0767.$ic57$, var77, var92);
        }
        if (module0767.NIL != var94) {
            SubLObject var96 = module0579.$g4336$.currentBinding(var85);
            try {
                module0579.$g4336$.bind(module0756.f47746(), var85);
                var95 = module0756.f47484(module0756.f47463(var93, var87, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0579.$g4336$.rebind(var96, var85);
            }
            module0756.f47821(var84, var95);
            module0758.f47898(var95, var86, var87);
            module0756.f47503(var95, var83, (SubLObject)module0767.UNPROVIDED);
            var96 = module0579.$g4270$.currentBinding(var85);
            try {
                module0579.$g4270$.bind((SubLObject)module0767.NIL, var85);
                module0758.f47878(var84, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0579.$g4270$.rebind(var96, var85);
            }
            if (module0767.NIL != module0756.f47479(var84)) {
                module0754.f47315(var35, var86);
                if (module0767.NIL == var89) {
                    f48815(var95, var35, var68);
                }
                f48804(var84, var86, var87);
                f48800(var35, var84, var37);
            }
        }
        return var84;
    }
    
    public static SubLObject f48814(final SubLObject var35) {
        return f48816(var35);
    }
    
    public static SubLObject f48813(final SubLObject var35, SubLObject var93) {
        if (var93 == module0767.UNPROVIDED) {
            var93 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != module0751.f46605() || module0767.NIL != module0579.f35506());
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        final SubLObject var95 = module0754.f47312(var35);
        final SubLObject var96 = module0754.f47319(var35);
        return (module0767.NIL != var93) ? var95 : f48817(var95, var96, module0579.$g4262$.getDynamicValue(var94));
    }
    
    public static SubLObject f48817(final SubLObject var94, final SubLObject var95, final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        SubLObject var98 = var94;
        final SubLObject var99 = module0579.$g4262$.currentBinding(var97);
        try {
            module0579.$g4262$.bind(var96, var97);
            if (module0767.NIL != module0751.f46684(var94, module0767.$ic58$, (SubLObject)module0767.UNPROVIDED)) {
                final SubLObject var100 = module0035.f2467(module0751.f46781((SubLObject)module0767.$ic59$, (SubLObject)ConsesLow.listS(module0767.$ic60$, var94, (SubLObject)module0767.$ic61$), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.$ic62$, (SubLObject)module0767.UNPROVIDED);
                SubLObject var101 = (SubLObject)module0767.NIL;
                if (module0767.NIL == var101) {
                    SubLObject var102 = var100;
                    SubLObject var103 = (SubLObject)module0767.NIL;
                    var103 = var102.first();
                    while (module0767.NIL == var101 && module0767.NIL != var102) {
                        if (module0767.NIL == f48818(var103)) {
                            var98 = module0751.f46677(var103);
                            var101 = (SubLObject)module0767.T;
                        }
                        var102 = var102.rest();
                        var103 = var102.first();
                    }
                }
            }
            else if (var95 == module0767.$ic63$ && module0767.NIL == module0201.f12546(var94) && module0767.NIL == module0751.f46605()) {
                final SubLObject var104 = module0751.f46994(var94, var96, (SubLObject)module0767.NIL);
                var98 = ((module0767.NIL != var104) ? var104 : var94);
            }
        }
        finally {
            module0579.$g4262$.rebind(var99, var97);
        }
        return var98;
    }
    
    public static SubLObject f48818(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0767.NIL;
        SubLObject var33 = (SubLObject)module0767.ZERO_INTEGER;
        if (module0767.NIL != module0004.f105(module0767.$g6132$.getDynamicValue(var31))) {
            final SubLObject var34 = module0147.f9540(module0579.$g4262$.getDynamicValue(var31));
            final SubLObject var35 = module0147.$g2095$.currentBinding(var31);
            final SubLObject var36 = module0147.$g2094$.currentBinding(var31);
            final SubLObject var37 = module0147.$g2096$.currentBinding(var31);
            try {
                module0147.$g2095$.bind(module0147.f9545(var34), var31);
                module0147.$g2094$.bind(module0147.f9546(var34), var31);
                module0147.$g2096$.bind(module0147.f9549(var34), var31);
                if (module0767.NIL == var32) {
                    final SubLObject var38 = module0767.$ic60$;
                    final SubLObject var39 = (SubLObject)module0767.$ic66$;
                    final SubLObject var40 = module0056.f4145(var39);
                    SubLObject var41 = (SubLObject)module0767.NIL;
                    final SubLObject var9_107 = module0139.$g1635$.currentBinding(var31);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var31);
                        final SubLObject var42 = module0767.$ic67$;
                        final SubLObject var9_108 = module0141.$g1714$.currentBinding(var31);
                        final SubLObject var25_110 = module0141.$g1715$.currentBinding(var31);
                        try {
                            module0141.$g1714$.bind((module0767.NIL != var42) ? var42 : module0141.f9283(), var31);
                            module0141.$g1715$.bind((SubLObject)((module0767.NIL != var42) ? module0767.$ic68$ : module0141.$g1715$.getDynamicValue(var31)), var31);
                            if (module0767.NIL != var42 && module0767.NIL != module0136.f8864() && module0767.NIL == module0141.f9279(var42)) {
                                final SubLObject var43 = module0136.$g1591$.getDynamicValue(var31);
                                if (var43.eql((SubLObject)module0767.$ic69$)) {
                                    module0136.f8870((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic70$, var42, (SubLObject)module0767.$ic71$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                }
                                else if (var43.eql((SubLObject)module0767.$ic72$)) {
                                    module0136.f8871((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic73$, (SubLObject)module0767.$ic70$, var42, (SubLObject)module0767.$ic71$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                }
                                else if (var43.eql((SubLObject)module0767.$ic74$)) {
                                    Errors.warn((SubLObject)module0767.$ic70$, var42, (SubLObject)module0767.$ic71$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0767.$ic75$, module0136.$g1591$.getDynamicValue(var31));
                                    Errors.cerror((SubLObject)module0767.$ic73$, (SubLObject)module0767.$ic70$, var42, (SubLObject)module0767.$ic71$);
                                }
                            }
                            final SubLObject var9_109 = module0141.$g1670$.currentBinding(var31);
                            final SubLObject var25_111 = module0141.$g1671$.currentBinding(var31);
                            final SubLObject var26_113 = module0141.$g1672$.currentBinding(var31);
                            final SubLObject var44 = module0141.$g1674$.currentBinding(var31);
                            final SubLObject var45 = module0137.$g1605$.currentBinding(var31);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0767.$ic76$), var31);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0767.$ic76$)), var31);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0767.$ic76$)), var31);
                                module0141.$g1674$.bind((SubLObject)module0767.NIL, var31);
                                module0137.$g1605$.bind(module0137.f8955(module0767.$ic76$), var31);
                                if (module0767.NIL != module0136.f8865() || module0767.NIL != module0244.f15795(module0767.$ic60$, module0137.f8955((SubLObject)module0767.UNPROVIDED))) {
                                    final SubLObject var9_110 = module0141.$g1677$.currentBinding(var31);
                                    final SubLObject var25_112 = module0138.$g1619$.currentBinding(var31);
                                    final SubLObject var26_114 = module0141.$g1674$.currentBinding(var31);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var31);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0767.$ic76$)), var31);
                                        module0141.$g1674$.bind((SubLObject)module0767.NIL, var31);
                                        module0249.f16055(var38, (SubLObject)module0767.UNPROVIDED);
                                        for (var41 = (SubLObject)ConsesLow.list(module0767.$ic60$, module0141.f9195()); module0767.NIL != var41 && module0767.NIL == var32; var41 = module0056.f4150(var40)) {
                                            final SubLObject var103_119 = var41.first();
                                            final SubLObject var46 = conses_high.second(var41);
                                            final SubLObject var47 = var103_119;
                                            final SubLObject var9_111 = module0141.$g1674$.currentBinding(var31);
                                            try {
                                                module0141.$g1674$.bind(var46, var31);
                                                final SubLObject var48 = var46;
                                                final SubLObject var49 = (SubLObject)((module0767.NIL != var48) ? module0767.ONE_INTEGER : module0767.TWO_INTEGER);
                                                final SubLObject var50 = module0220.f14566(var30, var47, module0579.$g4262$.getDynamicValue(var31), var49, Numbers.subtract((SubLObject)module0767.THREE_INTEGER, var49), (SubLObject)module0767.UNPROVIDED);
                                                if (module0767.NIL == var32) {
                                                    SubLObject var51 = var50;
                                                    SubLObject var52 = (SubLObject)module0767.NIL;
                                                    var52 = var51.first();
                                                    while (module0767.NIL == var32 && module0767.NIL != var51) {
                                                        if (module0767.NIL != module0751.f46684(var52, module0767.$ic58$, (SubLObject)module0767.UNPROVIDED)) {
                                                            var33 = Numbers.add(var33, (SubLObject)module0767.ONE_INTEGER);
                                                            if (var33.numGE(module0767.$g6132$.getDynamicValue(var31))) {
                                                                var32 = (SubLObject)module0767.T;
                                                                if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
                                                                    Errors.warn((SubLObject)module0767.$ic77$, var30, module0767.$g6132$.getDynamicValue(var31));
                                                                }
                                                            }
                                                        }
                                                        var51 = var51.rest();
                                                        var52 = var51.first();
                                                    }
                                                }
                                                final SubLObject var53 = module0200.f12443(module0137.f8955(module0767.$ic76$));
                                                SubLObject var54;
                                                SubLObject var55;
                                                SubLObject var9_112;
                                                SubLObject var25_113;
                                                SubLObject var56;
                                                SubLObject var57;
                                                SubLObject var58;
                                                SubLObject var59;
                                                SubLObject var60;
                                                SubLObject var61;
                                                SubLObject var9_113;
                                                SubLObject var133_137;
                                                SubLObject var62;
                                                SubLObject var63;
                                                SubLObject var9_114;
                                                SubLObject var64;
                                                SubLObject var65;
                                                SubLObject var66;
                                                SubLObject var67;
                                                SubLObject var68;
                                                SubLObject var69;
                                                SubLObject var70;
                                                SubLObject var71;
                                                SubLObject var126_147;
                                                SubLObject var72;
                                                SubLObject var9_115;
                                                SubLObject var74;
                                                SubLObject var73;
                                                SubLObject var75;
                                                SubLObject var76;
                                                SubLObject var77;
                                                SubLObject var78;
                                                SubLObject var79;
                                                SubLObject var80;
                                                for (var54 = (SubLObject)module0767.NIL, var54 = var53; module0767.NIL == var32 && module0767.NIL != var54; var54 = var54.rest()) {
                                                    var55 = var54.first();
                                                    var9_112 = module0137.$g1605$.currentBinding(var31);
                                                    var25_113 = module0141.$g1674$.currentBinding(var31);
                                                    try {
                                                        module0137.$g1605$.bind(var55, var31);
                                                        module0141.$g1674$.bind((SubLObject)((module0767.NIL != module0141.f9205((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0767.NIL == module0141.$g1674$.getDynamicValue(var31)) : module0141.$g1674$.getDynamicValue(var31)), var31);
                                                        var56 = module0228.f15229(var103_119);
                                                        if (module0767.NIL != module0138.f8992(var56)) {
                                                            var57 = module0242.f15664(var56, module0137.f8955((SubLObject)module0767.UNPROVIDED));
                                                            if (module0767.NIL != var57) {
                                                                var58 = module0245.f15834(var57, module0138.f8979(), module0137.f8955((SubLObject)module0767.UNPROVIDED));
                                                                if (module0767.NIL != var58) {
                                                                    for (var59 = module0066.f4838(module0067.f4891(var58)); module0767.NIL == var32 && module0767.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
                                                                        var31.resetMultipleValues();
                                                                        var60 = module0066.f4839(var59);
                                                                        var61 = var31.secondMultipleValue();
                                                                        var31.resetMultipleValues();
                                                                        if (module0767.NIL != module0147.f9507(var60)) {
                                                                            var9_113 = module0138.$g1623$.currentBinding(var31);
                                                                            try {
                                                                                module0138.$g1623$.bind(var60, var31);
                                                                                for (var133_137 = module0066.f4838(module0067.f4891(var61)); module0767.NIL == var32 && module0767.NIL == module0066.f4841(var133_137); var133_137 = module0066.f4840(var133_137)) {
                                                                                    var31.resetMultipleValues();
                                                                                    var62 = module0066.f4839(var133_137);
                                                                                    var63 = var31.secondMultipleValue();
                                                                                    var31.resetMultipleValues();
                                                                                    if (module0767.NIL != module0141.f9289(var62)) {
                                                                                        var9_114 = module0138.$g1624$.currentBinding(var31);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var62, var31);
                                                                                            var64 = var63;
                                                                                            if (module0767.NIL != module0077.f5302(var64)) {
                                                                                                var65 = module0077.f5333(var64);
                                                                                                for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0767.NIL, var67 = module0032.f1742(var66, var65); module0767.NIL == var32 && module0767.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                                                    var68 = module0032.f1745(var66, var67);
                                                                                                    if (module0767.NIL != module0032.f1746(var67, var68) && module0767.NIL == module0249.f16059(var68, (SubLObject)module0767.UNPROVIDED)) {
                                                                                                        module0249.f16055(var68, (SubLObject)module0767.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var68, module0141.f9195()), var40);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var64.isList()) {
                                                                                                if (module0767.NIL == var32) {
                                                                                                    var69 = var64;
                                                                                                    var70 = (SubLObject)module0767.NIL;
                                                                                                    var70 = var69.first();
                                                                                                    while (module0767.NIL == var32 && module0767.NIL != var69) {
                                                                                                        if (module0767.NIL == module0249.f16059(var70, (SubLObject)module0767.UNPROVIDED)) {
                                                                                                            module0249.f16055(var70, (SubLObject)module0767.UNPROVIDED);
                                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var70, module0141.f9195()), var40);
                                                                                                        }
                                                                                                        var69 = var69.rest();
                                                                                                        var70 = var69.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0767.$ic78$, var64);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var9_114, var31);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var133_137);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var9_113, var31);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var59);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)module0767.FIVE_INTEGER, (SubLObject)module0767.$ic79$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (module0767.NIL != module0155.f9785(var56, (SubLObject)module0767.UNPROVIDED)) {
                                                            var71 = ((module0767.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var31), module0137.f8955((SubLObject)module0767.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var31), module0137.f8955((SubLObject)module0767.UNPROVIDED)));
                                                            for (var126_147 = (SubLObject)module0767.NIL, var126_147 = var71; module0767.NIL == var32 && module0767.NIL != var126_147; var126_147 = var126_147.rest()) {
                                                                var72 = var126_147.first();
                                                                var9_115 = module0138.$g1625$.currentBinding(var31);
                                                                try {
                                                                    module0138.$g1625$.bind(var72, var31);
                                                                    var73 = (var74 = Functions.funcall(var72, var56));
                                                                    if (module0767.NIL != module0077.f5302(var74)) {
                                                                        var75 = module0077.f5333(var74);
                                                                        for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0767.NIL, var77 = module0032.f1742(var76, var75); module0767.NIL == var32 && module0767.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                                                                            var78 = module0032.f1745(var76, var77);
                                                                            if (module0767.NIL != module0032.f1746(var77, var78) && module0767.NIL == module0249.f16059(var78, (SubLObject)module0767.UNPROVIDED)) {
                                                                                module0249.f16055(var78, (SubLObject)module0767.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var78, module0141.f9195()), var40);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var74.isList()) {
                                                                        if (module0767.NIL == var32) {
                                                                            var79 = var74;
                                                                            var80 = (SubLObject)module0767.NIL;
                                                                            var80 = var79.first();
                                                                            while (module0767.NIL == var32 && module0767.NIL != var79) {
                                                                                if (module0767.NIL == module0249.f16059(var80, (SubLObject)module0767.UNPROVIDED)) {
                                                                                    module0249.f16055(var80, (SubLObject)module0767.UNPROVIDED);
                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var80, module0141.f9195()), var40);
                                                                                }
                                                                                var79 = var79.rest();
                                                                                var80 = var79.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)module0767.$ic78$, var74);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var9_115, var31);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var25_113, var31);
                                                        module0137.$g1605$.rebind(var9_112, var31);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_111, var31);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var26_114, var31);
                                        module0138.$g1619$.rebind(var25_112, var31);
                                        module0141.$g1677$.rebind(var9_110, var31);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.$ic80$, module0767.$ic60$, module0244.f15748(module0137.f8955((SubLObject)module0767.UNPROVIDED)), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var45, var31);
                                module0141.$g1674$.rebind(var44, var31);
                                module0141.$g1672$.rebind(var26_113, var31);
                                module0141.$g1671$.rebind(var25_111, var31);
                                module0141.$g1670$.rebind(var9_109, var31);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var25_110, var31);
                            module0141.$g1714$.rebind(var9_108, var31);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var31));
                    }
                    finally {
                        module0139.$g1635$.rebind(var9_107, var31);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var37, var31);
                module0147.$g2094$.rebind(var36, var31);
                module0147.$g2095$.rebind(var35, var31);
            }
        }
        return var32;
    }
    
    public static SubLObject f48819(final SubLObject var49) {
        final SubLObject var50 = module0751.f46604(var49);
        return module0751.f46693(module0751.f47200(), var50);
    }
    
    public static SubLObject f48810(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0756.f47487(var55, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var58 = f48820(var55);
        if (module0767.ONE_INTEGER.numE(module0755.f47397(var57))) {
            return (SubLObject)module0767.$ic81$;
        }
        if (module0767.NIL != module0755.f47391(var57)) {
            return (SubLObject)module0767.$ic82$;
        }
        if (module0767.NIL != module0579.$g4326$.getDynamicValue(var56) && module0767.NIL != module0754.f47325(var57)) {
            return (SubLObject)module0767.$ic83$;
        }
        if (module0767.NIL != var58 && module0767.NIL != Sequences.find(var58, module0579.$g4327$.getDynamicValue(var56), (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            module0579.$g4327$.setDynamicValue(Sequences.remove(var58, module0579.$g4327$.getDynamicValue(var56), (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), var56);
            return (SubLObject)module0767.$ic44$;
        }
        if (module0767.NIL != var58 || (module0767.NIL != f48821(var55) && module0767.NIL != f48822(var55))) {
            final SubLObject var59 = module0756.f47751(var55, var57);
            return (SubLObject)((module0767.NIL != var59) ? module0767.$ic46$ : module0767.$ic40$);
        }
        if (module0754.f47319(var57) == module0767.$ic42$) {
            return (SubLObject)module0767.$ic42$;
        }
        return (SubLObject)module0767.$ic40$;
    }
    
    public static SubLObject f48821(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0756.f47487(var55, (SubLObject)module0767.UNPROVIDED);
        for (SubLObject var58 = module0756.f47633(var55); module0767.NIL != module0756.f47497(var58, (SubLObject)module0767.UNPROVIDED); var58 = module0756.f47633(var58)) {
            SubLObject var59 = module0756.f47510(var58);
            SubLObject var60 = (SubLObject)module0767.NIL;
            var60 = var59.first();
            while (module0767.NIL != var59) {
                var56.resetMultipleValues();
                final SubLObject var61 = module0337.f22630(var60, (SubLObject)module0767.$ic84$);
                final SubLObject var62 = var56.secondMultipleValue();
                var56.resetMultipleValues();
                if (module0767.NIL != var61) {
                    final SubLObject var63 = module0035.f2294(var62, (SubLObject)module0767.$ic85$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                    if (module0767.NIL != module0004.f104(var57, var63, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic86$, var57);
                        }
                        return (SubLObject)module0767.T;
                    }
                }
                var59 = var59.rest();
                var60 = var59.first();
            }
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48822(final SubLObject var55) {
        if (module0767.NIL == module0751.f46661((SubLObject)module0767.UNPROVIDED)) {
            return (SubLObject)module0767.NIL;
        }
        SubLObject var56 = var55;
        for (SubLObject var57 = module0756.f47633(var55); module0767.NIL != module0756.f47497(var57, (SubLObject)module0767.UNPROVIDED); var57 = module0756.f47633(var57)) {
            SubLObject var58 = (SubLObject)module0767.$ic87$;
            SubLObject var59 = (SubLObject)module0767.ZERO_INTEGER;
            if (module0743.f45996(var57).isVector()) {
                final SubLObject var60 = module0743.f45996(var57);
                final SubLObject var61 = (SubLObject)module0767.NIL;
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                SubLObject var65;
                SubLObject var66;
                for (var62 = Sequences.length(var60), var63 = (SubLObject)module0767.NIL, var63 = (SubLObject)module0767.ZERO_INTEGER; var63.numL(var62); var63 = Numbers.add(var63, (SubLObject)module0767.ONE_INTEGER)) {
                    var64 = ((module0767.NIL != var61) ? Numbers.subtract(var62, var63, (SubLObject)module0767.ONE_INTEGER) : var63);
                    var65 = Vectors.aref(var60, var64);
                    var66 = var58;
                    if (var66.eql((SubLObject)module0767.$ic87$)) {
                        if (module0767.NIL != module0756.f47479(var65) && module0756.f47480(var65, (SubLObject)module0767.UNPROVIDED).equalp((SubLObject)module0767.$ic88$)) {
                            var58 = (SubLObject)module0767.$ic89$;
                        }
                    }
                    else if (var66.eql((SubLObject)module0767.$ic89$)) {
                        if (var65.eql(var56)) {
                            var58 = (SubLObject)module0767.$ic90$;
                        }
                    }
                    else if (var66.eql((SubLObject)module0767.$ic90$) && module0767.NIL != module0756.f47479(var65) && module0756.f47480(var65, (SubLObject)module0767.UNPROVIDED).equalp((SubLObject)module0767.$ic91$)) {
                        return (SubLObject)module0767.T;
                    }
                    var59 = Numbers.add(var59, (SubLObject)module0767.ONE_INTEGER);
                }
            }
            var56 = var57;
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48820(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0756.f47487(var55, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var58 = module0756.f47711(var55);
        final SubLObject var59 = module0579.f35508();
        if (module0767.NIL == module0202.f12590(var59)) {
            return (SubLObject)module0767.NIL;
        }
        final SubLObject var60 = (module0767.NIL != module0751.f46924(var58)) ? module0205.f13394(var59, var58, (SubLObject)module0767.UNPROVIDED) : var59;
        if (!var60.equal(var57)) {
            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0767.$ic92$, new SubLObject[] { var58, module0579.f35508(), var57, var60, module0579.$g4320$.getDynamicValue(var56) });
            }
            return (SubLObject)module0767.NIL;
        }
        return f48823(var57, var58, var59);
    }
    
    public static SubLObject f48823(final SubLObject var35, final SubLObject var49, final SubLObject var48) {
        SubLObject var50 = (SubLObject)module0767.NIL;
        SubLObject var51 = var49;
        SubLObject var52 = (SubLObject)module0767.NIL;
        SubLObject var53 = (SubLObject)module0767.NIL;
        SubLObject var54 = (SubLObject)module0767.NIL;
        if (module0767.NIL != conses_high.member(var35, module0155.f9795(var48, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            var54 = (SubLObject)module0767.T;
        }
        while (module0767.NIL != var51) {
            final SubLObject var55 = module0205.f13394(var48, var50, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var56 = module0205.f13132(var55);
            if (var35.equal(module0205.f13203(var55, (SubLObject)module0767.UNPROVIDED))) {
                if (var56.equal(module0767.$ic93$)) {
                    var53 = (SubLObject)module0767.T;
                    if (module0767.NIL != var52) {
                        return var52;
                    }
                }
                else if (var56.equal(module0767.$ic94$)) {
                    var54 = (SubLObject)module0767.T;
                }
            }
            if (var51.first().equal(f48824(var56))) {
                if (module0767.NIL != var54) {
                    return ConsesLow.append(var50, (SubLObject)ConsesLow.list((SubLObject)module0767.ZERO_INTEGER));
                }
                var52 = ConsesLow.append(var50, (SubLObject)ConsesLow.list((SubLObject)module0767.ZERO_INTEGER));
            }
            var50 = ConsesLow.append(var50, (SubLObject)ConsesLow.list(var51.first()));
            var51 = var51.rest();
        }
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic95$);
        }
        if (module0767.NIL == var53 && module0767.NIL == var54 && module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0767.$ic96$);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48825(final SubLObject var176) {
        return module0004.f104(var176, (SubLObject)module0767.$ic97$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48824(final SubLObject var176) {
        return (SubLObject)((module0767.NIL != f48825(var176)) ? module0767.ONE_INTEGER : module0767.NIL);
    }
    
    public static SubLObject f48826(final SubLObject var35, final SubLObject var55, final SubLObject var68) {
        final SubLObject var69 = f48827(var35, var55);
        if (module0767.NIL == var69) {
            f48815(var55, var35, var68);
        }
        return module0756.f47467(var55);
    }
    
    public static SubLObject f48827(final SubLObject var35, final SubLObject var55) {
        if (module0767.NIL != f48816(var35)) {
            return f48828(var55);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48816(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0767.NIL;
        final SubLObject var37 = (SubLObject)module0767.NIL;
        if ((module0767.NIL == module0755.f47386(var35) || module0767.NIL != module0754.f47350(var35)) && module0767.NIL == var36) {
            SubLObject var38 = module0754.f47348(var35);
            SubLObject var39 = (SubLObject)module0767.NIL;
            var39 = var38.first();
            while (module0767.NIL == var36 && module0767.NIL != var38) {
                if (module0767.NIL != module0755.f47386(var39) && module0767.NIL != module0754.f47346(var35, var39, var37)) {
                    var36 = (SubLObject)module0767.T;
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        return var36;
    }
    
    public static SubLObject f48828(final SubLObject var55) {
        if (module0767.NIL != module0751.f46661((SubLObject)module0767.UNPROVIDED)) {
            f48829(var55);
        }
        return module0756.f47467(var55);
    }
    
    public static SubLObject f48829(final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0756.f47467(var55);
        var56.resetMultipleValues();
        final SubLObject var58 = f48830(var57);
        final SubLObject var59 = var56.secondMultipleValue();
        var56.resetMultipleValues();
        final SubLObject var60 = f48831(var58, var59);
        module0756.f47501(var55, var60, (SubLObject)module0767.UNPROVIDED);
        return module0756.f47467(var55);
    }
    
    public static SubLObject f48830(final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        SubLObject var183 = (SubLObject)module0767.NIL;
        SubLObject var184 = (SubLObject)module0767.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var181, var181, (SubLObject)module0767.$ic98$);
        var183 = var181.first();
        final SubLObject var185 = var184 = var181.rest();
        var182.resetMultipleValues();
        final SubLObject var186 = module0751.f46654(module0749.f46455(var183), (SubLObject)module0767.UNPROVIDED);
        final SubLObject var187 = var182.secondMultipleValue();
        var182.resetMultipleValues();
        final SubLObject var188 = module0756.f47713(var181, (SubLObject)module0767.NIL);
        SubLObject var189 = (SubLObject)module0767.NIL;
        SubLObject var190 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0751.f46633(var186)) {
            if (module0767.NIL != module0038.f2653(var187)) {
                module0749.f46457(var183, var186);
                final SubLObject var191 = module0749.f46447(var183);
                module0749.f46457(var191, var187);
                var184 = (SubLObject)ConsesLow.cons(var191, var184);
            }
            var189 = (SubLObject)ConsesLow.list(var183);
            var190 = var184;
        }
        else if (module0767.NIL != Strings.string_equal(var188, (SubLObject)module0767.$ic99$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            var189 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic100$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
            var190 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic101$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
        }
        else if (module0767.NIL != Strings.string_equal(var188, (SubLObject)module0767.$ic102$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            var189 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic41$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
            var190 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic101$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
        }
        else if (module0767.NIL != Strings.string_equal(var188, (SubLObject)module0767.$ic103$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            var189 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic43$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
            var190 = (SubLObject)ConsesLow.list(module0749.f46446((SubLObject)module0767.$ic101$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
        }
        else {
            var190 = var181;
        }
        return Values.values(var189, var190);
    }
    
    public static SubLObject f48831(final SubLObject var182, final SubLObject var183) {
        if (module0767.NIL == var182) {
            return var183;
        }
        final SubLObject var184 = module0772.f49212((SubLObject)module0767.$ic104$);
        if (module0767.NIL != module0751.f46635(module0756.f47713(var182, (SubLObject)module0767.UNPROVIDED))) {
            module0749.f46457(var184, (SubLObject)module0767.$ic105$);
            return (SubLObject)ConsesLow.cons(var184, var183);
        }
        return ConsesLow.append(var182, (SubLObject)ConsesLow.cons(var184, var183));
    }
    
    public static SubLObject f48815(final SubLObject var55, final SubLObject var35, final SubLObject var68) {
        final SubLObject var69 = module0756.f47481(var55, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == module0751.f46640(var69, module0767.$ic51$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0751.f46640(var69, (SubLObject)module0767.$ic52$, (SubLObject)module0767.UNPROVIDED) && (module0767.NIL != module0754.f47338(var35) || (module0767.NIL != f48816(var35) && module0767.NIL == module0756.f47751(var55, var35)))) {
            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic106$, var35);
            }
            f48832(var55, var35, var68);
        }
        return module0756.f47467(var55);
    }
    
    public static SubLObject f48832(final SubLObject var55, final SubLObject var35, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = module0756.f47467(var55);
        final SubLObject var71 = f48799(var35, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var72 = (SubLObject)module0767.NIL;
        SubLObject var73 = (SubLObject)module0767.NIL;
        var69.resetMultipleValues();
        final SubLObject var74 = f48830(var70);
        final SubLObject var75 = var69.secondMultipleValue();
        var69.resetMultipleValues();
        var70 = ConsesLow.append(var74, var75);
        if (module0767.NIL != module0754.f47339(var35)) {
            var73 = var71;
        }
        else if (module0767.NIL != var72 && module0767.NIL != module0754.f47311(var35) && module0754.f47319(var35) == module0767.$ic63$) {
            var73 = var71;
        }
        else if (module0767.NIL != module0754.f47311(var35) && module0767.NIL != module0751.f46661((SubLObject)module0767.UNPROVIDED)) {
            final SubLObject var76 = f48807(var55, var68);
            final SubLObject var77 = (module0767.NIL != var76) ? var76 : var70;
            var73 = ConsesLow.append(var77, var71);
        }
        else {
            var73 = ConsesLow.append(var70, var71);
        }
        module0756.f47501(var55, var73, (SubLObject)module0767.UNPROVIDED);
        return module0756.f47467(var55);
    }
    
    public static SubLObject f48833(final SubLObject var2) {
        module0756.f47723(var2, module0751.f46728(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED)));
        module0756.f47783(var2, module0767.$ic49$, (SubLObject)module0767.UNPROVIDED);
        return var2;
    }
    
    public static SubLObject f48834(final SubLObject var2) {
        module0756.f47723(var2, Sequences.cconcatenate((SubLObject)module0767.$ic111$, module0006.f203(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED))));
        return var2;
    }
    
    public static SubLObject f48835(final SubLObject var2) {
        module0756.f47723(var2, Sequences.cconcatenate((SubLObject)module0767.$ic114$, module0006.f203(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED))));
        return var2;
    }
    
    public static SubLObject f48781(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0767.NIL == module0756.f47479(var2)) {
            SubLObject var4 = (SubLObject)module0767.NIL;
            final SubLObject var5 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != module0751.f46605()) {
                final SubLObject var6 = f48798((SubLObject)module0767.$ic116$, var5, (SubLObject)module0767.$ic46$, (SubLObject)module0767.$ic117$, module0751.f47118());
                if (module0767.NIL != module0749.f46482(var6)) {
                    module0756.f47501(var2, (SubLObject)ConsesLow.list(var6), (SubLObject)module0767.UNPROVIDED);
                    var4 = module0749.f46470(var6);
                    module0756.f47715(var2);
                    module0756.f47608(var2);
                }
            }
            if (module0767.NIL != var4) {
                module0756.f47783(var2, var4, (SubLObject)module0767.UNPROVIDED);
            }
            else {
                SubLObject var7 = (SubLObject)module0767.NIL;
                if (module0767.NIL != module0751.f46605()) {
                    final SubLObject var8 = module0755.f47383((SubLObject)module0767.UNPROVIDED);
                    final SubLObject var9 = module0579.$g4321$.currentBinding(var3);
                    try {
                        module0579.$g4321$.bind(module0755.f47382(), var3);
                        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic118$);
                        }
                        f48836(var2, (SubLObject)module0767.$ic117$);
                        var7 = module0580.f35577(module0579.$g4321$.getDynamicValue(var3), var8);
                    }
                    finally {
                        module0579.$g4321$.rebind(var9, var3);
                    }
                }
                if (module0767.NIL == module0756.f47479(var2)) {
                    final SubLObject var8 = module0755.f47383((SubLObject)module0767.UNPROVIDED);
                    final SubLObject var9 = module0579.$g4321$.currentBinding(var3);
                    try {
                        module0579.$g4321$.bind(module0755.f47382(), var3);
                        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic118$);
                        }
                        f48836(var2, (SubLObject)module0767.$ic119$);
                        var7 = module0580.f35577(module0579.$g4321$.getDynamicValue(var3), var8);
                    }
                    finally {
                        module0579.$g4321$.rebind(var9, var3);
                    }
                }
                if (module0767.NIL != module0756.f47479(var2)) {
                    module0755.f47448(var7);
                }
                else {
                    if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic120$);
                    }
                    f48836(var2, (SubLObject)module0767.$ic46$);
                }
            }
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48837(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = module0166.f10743(var4);
        SubLObject var6 = module0038.f2621(module0038.f2621(var5, (SubLObject)module0767.$ic123$, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.$ic124$, (SubLObject)module0767.UNPROVIDED);
        var6 = module0038.f2674(var6, (SubLObject)module0767.$ic125$, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var7 = module0580.f35545();
        final SubLObject var8 = module0034.$g879$.currentBinding(var3);
        try {
            module0034.$g879$.bind(var7, var3);
            SubLObject var9 = (SubLObject)module0767.NIL;
            if (module0767.NIL != var7 && module0767.NIL == module0034.f1842(var7)) {
                var9 = module0034.f1869(var7);
                final SubLObject var10 = Threads.current_process();
                if (module0767.NIL == var9) {
                    module0034.f1873(var7, var10);
                }
                else if (!var9.eql(var10)) {
                    Errors.error((SubLObject)module0767.$ic24$);
                }
            }
            try {
                if (module0767.NIL == module0731.f44814(var6, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0256.f16604(module0767.$ic126$, module0731.f44778(var4, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                    var6 = module0038.f2815(var6);
                }
            }
            finally {
                final SubLObject var9_205 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0767.T, var3);
                    if (module0767.NIL != var7 && module0767.NIL == var9) {
                        module0034.f1873(var7, (SubLObject)module0767.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var9_205, var3);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var8, var3);
        }
        final SubLObject var11 = Sequences.cconcatenate((SubLObject)module0767.$ic127$, module0751.f46728(var6));
        module0756.f47723(var2, var11);
        return var2;
    }
    
    public static SubLObject f48838(final SubLObject var2) {
        final SubLObject var3 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var4 = f48839(var3);
        if (module0767.NIL != var4) {
            final SubLObject var5 = var4.first();
            final SubLObject var6 = module0756.f47511(var2);
            final SubLObject var7 = module0751.f47211(var6);
            module0749.f46468(var5, var3);
            module0749.f46464(var5, var7);
            module0756.f47501(var2, (SubLObject)ConsesLow.list(var5), (SubLObject)module0767.UNPROVIDED);
            module0756.f47715(var2);
            module0756.f47608(var2);
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48839(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        SubLObject var209 = (SubLObject)module0767.NIL;
        final SubLObject var210 = module0147.f9540(module0579.$g4260$.getDynamicValue(var208));
        final SubLObject var211 = module0147.$g2095$.currentBinding(var208);
        final SubLObject var212 = module0147.$g2094$.currentBinding(var208);
        final SubLObject var213 = module0147.$g2096$.currentBinding(var208);
        try {
            module0147.$g2095$.bind(module0147.f9545(var210), var208);
            module0147.$g2094$.bind(module0147.f9546(var210), var208);
            module0147.$g2096$.bind(module0147.f9549(var210), var208);
            final SubLObject var214 = module0220.f14557(var207, module0767.$ic128$, module0579.$g4260$.getDynamicValue(var208), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != var214) {
                var209 = f48840(var207, module0581.f35652(var214));
            }
        }
        finally {
            module0147.$g2096$.rebind(var213, var208);
            module0147.$g2094$.rebind(var212, var208);
            module0147.$g2095$.rebind(var211, var208);
        }
        return var209;
    }
    
    public static SubLObject f48840(final SubLObject var207, final SubLObject var210) {
        final SubLThread var211 = SubLProcess.currentSubLThread();
        if (module0767.NIL != module0581.f35648(var210)) {
            SubLObject var212 = (SubLObject)module0767.NIL;
            if (module0767.$ic13$ == module0579.$g4259$.getDynamicValue(var211)) {
                var212 = f48841(var210);
            }
            else {
                var212 = module0756.f47778(var210, (SubLObject)module0767.NIL, (SubLObject)module0767.NIL, module0767.$ic128$);
            }
            if (module0767.NIL != var212) {
                final SubLObject var213 = module0749.f46484(var212);
                module0749.f46468(var213, var207);
                module0749.f46472(var213, module0767.$ic128$);
                return (SubLObject)ConsesLow.list(var213);
            }
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48841(final SubLObject var210) {
        SubLObject var211 = (SubLObject)module0767.NIL;
        SubLObject var212 = (SubLObject)module0767.NIL;
        SubLObject var213 = (SubLObject)module0767.NIL;
        SubLObject var214 = (SubLObject)module0767.NIL;
        for (SubLObject var215 = var210, var216 = (SubLObject)(var215.isList() ? module0767.NIL : Sequences.length(var215)), var217 = (SubLObject)module0767.ZERO_INTEGER, var218 = module0005.f149(var217, var216, var215); module0767.NIL == var218; var218 = module0005.f149(var217, var216, var215)) {
            final SubLObject var219 = module0005.f150(var217, var215);
            if (!var217.isInteger() || !var217.numL((SubLObject)module0767.ZERO_INTEGER)) {
                if (!module0767.NIL.isInteger() || !var217.isInteger() || !var217.numGE((SubLObject)module0767.NIL)) {
                    final SubLObject var220 = var219.isChar() ? var219 : module0581.f35660(var219);
                    if (!var220.isInteger() && module0767.NIL == Characters.digit_char_p(var220, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != var212) {
                        final SubLObject var221 = module0581.f35667(Sequences.nreverse(var211));
                        final SubLObject var222 = module0772.f49212(var221);
                        module0769.f49043(var222);
                        var214 = (SubLObject)ConsesLow.cons(var222, var214);
                        var211 = (SubLObject)module0767.NIL;
                        var212 = (SubLObject)module0767.NIL;
                    }
                    if (var220.isInteger()) {
                        var211 = (SubLObject)ConsesLow.cons(var220, var211);
                    }
                    else if (!Characters.CHAR_space.eql(var220)) {
                        if (module0767.NIL != var213 && module0767.NIL != module0581.f35676(var220, (SubLObject)Characters.CHAR_rparen)) {
                            final SubLObject var221 = module0581.f35667(Sequences.nreverse(var211));
                            final SubLObject var222 = module0772.f49212(var221);
                            module0769.f49042(var222);
                            var214 = (SubLObject)ConsesLow.cons(var222, var214);
                            var211 = (SubLObject)module0767.NIL;
                            var213 = (SubLObject)module0767.NIL;
                        }
                        else if (module0767.NIL == var212 && module0767.NIL == var213 && module0767.NIL != Characters.digit_char_p(var220, (SubLObject)module0767.UNPROVIDED)) {
                            if (module0767.NIL != var211) {
                                final SubLObject var221 = module0581.f35667(Sequences.nreverse(var211));
                                var214 = (SubLObject)ConsesLow.cons(module0772.f49212(var221), var214);
                            }
                            var211 = (SubLObject)ConsesLow.list(var220);
                            var212 = (SubLObject)module0767.T;
                        }
                        else if (module0767.NIL == var213 && module0767.NIL != module0581.f35676(var220, (SubLObject)Characters.CHAR_lparen) && module0767.NIL == Characters.alpha_char_p(Strings.sublisp_char(var210, module0048.f_1X(var217)))) {
                            if (module0767.NIL != var211) {
                                final SubLObject var221 = module0581.f35667(Sequences.nreverse(var211));
                                var214 = (SubLObject)ConsesLow.cons(module0772.f49212(var221), var214);
                            }
                            var211 = (SubLObject)module0767.NIL;
                            var213 = (SubLObject)module0767.T;
                        }
                        else {
                            var211 = (SubLObject)ConsesLow.cons(var220, var211);
                        }
                    }
                }
            }
            var215 = module0005.f151(var215);
            var217 = Numbers.add(var217, (SubLObject)module0767.ONE_INTEGER);
        }
        if (module0767.NIL != var211) {
            final SubLObject var223 = module0581.f35667(Sequences.nreverse(var211));
            final SubLObject var224 = module0751.f46705();
            final SubLObject var225 = (module0767.NIL == var214) ? module0756.f47746() : module0756.f47748();
            final SubLObject var226 = module0749.f46446(var223, var224, var225, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != var212) {
                module0769.f49043(var226);
            }
            var214 = (SubLObject)ConsesLow.cons(var226, var214);
        }
        return Sequences.nreverse(var214);
    }
    
    public static SubLObject f48842(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        final SubLObject var209 = f48843(var207);
        SubLObject var210 = Types.sublisp_null(var209);
        SubLObject var211 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var210) {
            SubLObject var213;
            final SubLObject var212 = var213 = var209;
            SubLObject var214 = (SubLObject)module0767.NIL;
            SubLObject var215 = (SubLObject)module0767.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var213, var212, (SubLObject)module0767.$ic129$);
            var214 = var213.first();
            var213 = var213.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var213, var212, (SubLObject)module0767.$ic129$);
            var215 = var213.first();
            var213 = var213.rest();
            if (module0767.NIL == var213) {
                var211 = (SubLObject)ConsesLow.list(module0758.f47956(var214, var215));
                var210 = Types.sublisp_null(var211);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var212, (SubLObject)module0767.$ic129$);
            }
            if (module0767.NIL == var210) {
                final SubLObject var216 = f48844(var207);
                if (module0767.NIL != module0172.f10917(var216) && module0205.f13276(var216).eql(module0767.$ic130$)) {
                    final SubLObject var217 = module0205.f13277(var216, (SubLObject)module0767.UNPROVIDED);
                    final SubLObject var218 = module0749.f46446(print_high.princ_to_string(var217), (SubLObject)module0767.NIL, var217, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                    if (module0579.$g4259$.getDynamicValue(var208) == module0767.$ic13$) {
                        module0769.f49042(var218);
                    }
                    var211 = (SubLObject)ConsesLow.cons(var218, var211);
                }
            }
        }
        if (module0767.NIL == var210 && module0767.NIL != var211) {
            final SubLObject var219 = module0749.f46484(Sequences.nreverse(var211));
            module0749.f46468(var219, var207);
            module0749.f46472(var219, module0767.$ic128$);
            return var219;
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48843(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        if (module0767.NIL != module0337.f22630(module0228.f15230(var207), (SubLObject)module0767.$ic131$)) {
            return reader.bq_cons((SubLObject)ConsesLow.list(module0767.$ic132$, module0205.f13277(var207, (SubLObject)module0767.UNPROVIDED)), (SubLObject)module0767.$ic133$);
        }
        return module0751.f46854((SubLObject)module0767.$ic134$, (SubLObject)ConsesLow.listS(module0767.$ic135$, var207, (SubLObject)module0767.$ic134$), module0579.$g4262$.getDynamicValue(var208), (SubLObject)module0767.NIL, (SubLObject)module0767.ONE_INTEGER).first();
    }
    
    public static SubLObject f48844(final SubLObject var207) {
        SubLObject var208 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var208) {
            SubLObject var209 = f48845(var207);
            SubLObject var210 = (SubLObject)module0767.NIL;
            var210 = var209.first();
            while (module0767.NIL == var208 && module0767.NIL != var209) {
                final SubLObject var211 = module0202.f12643(module0767.$ic136$, var210);
                if (module0767.NIL == var208) {
                    SubLObject var73_236 = module0751.f46770((SubLObject)module0767.$ic137$, (SubLObject)ConsesLow.listS(module0767.$ic138$, var211, (SubLObject)module0767.$ic139$), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                    SubLObject var212 = (SubLObject)module0767.NIL;
                    var212 = var73_236.first();
                    while (module0767.NIL == var208 && module0767.NIL != var73_236) {
                        if (module0767.NIL != module0172.f10917(var212) && module0205.f13276(var212).eql(module0767.$ic130$)) {
                            var208 = var212;
                        }
                        var73_236 = var73_236.rest();
                        var212 = var73_236.first();
                    }
                }
                var209 = var209.rest();
                var210 = var209.first();
            }
        }
        return var208;
    }
    
    public static SubLObject f48845(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        SubLObject var209 = module0751.f46770((SubLObject)module0767.$ic140$, (SubLObject)ConsesLow.listS(module0767.$ic141$, var207, (SubLObject)module0767.$ic142$), module0579.$g4262$.getDynamicValue(var208), (SubLObject)module0767.NIL, (SubLObject)module0767.ONE_INTEGER);
        if (module0767.NIL != module0167.f10813(var207) && module0205.f13276(var207).eql(module0767.$ic143$)) {
            var209 = (SubLObject)ConsesLow.cons(module0205.f13277(var207, (SubLObject)module0767.UNPROVIDED), var209);
        }
        return var209;
    }
    
    public static SubLObject f48846(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0767.$ic147$;
        if (module0579.$g4259$.getDynamicValue(var3) == module0767.$ic13$) {
            var4 = module0769.f49022(var4, module0767.$ic148$);
        }
        module0756.f47723(var2, var4);
        return var2;
    }
    
    public static SubLObject f48847(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0767.$ic151$;
        if (module0579.$g4259$.getDynamicValue(var3) == module0767.$ic13$) {
            var4 = module0769.f49022(var4, module0767.$ic152$);
        }
        module0756.f47723(var2, var4);
        return var2;
    }
    
    public static SubLObject f48848(final SubLObject var1) {
        return Hashtables.gethash(var1, module0767.$g6133$.getGlobalValue(), (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48836(final SubLObject var2, SubLObject var238) {
        if (var238 == module0767.UNPROVIDED) {
            var238 = (SubLObject)module0767.$ic46$;
        }
        final SubLThread var239 = SubLProcess.currentSubLThread();
        final SubLObject var240 = module0228.f15229(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED));
        final SubLObject var241 = module0756.f47726(var2);
        final SubLObject var242 = module0756.f47488(var2, (SubLObject)module0767.NIL);
        SubLObject var243 = module0756.f47479(var2);
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic156$, var242);
        }
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic157$, module0751.f46599());
        }
        SubLObject var245;
        final SubLObject var244 = var245 = module0756.f47628(var2);
        final SubLObject var246 = (SubLObject)((var238 == module0767.$ic117$) ? module0767.$ic158$ : module0767.$g6134$.getDynamicValue(var239));
        final SubLObject var247 = (SubLObject)((module0767.NIL != module0579.f35485()) ? module0756.f47484(var2, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) : module0767.NIL);
        final SubLObject var248 = f48849(var238);
        SubLObject var249 = (SubLObject)module0767.NIL;
        final SubLObject var250 = module0579.$g4287$.currentBinding(var239);
        try {
            module0579.$g4287$.bind(module0580.f35610(var248), var239);
            if (module0767.NIL == var243) {
                SubLObject var251 = var246;
                SubLObject var252 = (SubLObject)module0767.NIL;
                var252 = var251.first();
                while (module0767.NIL == var243 && module0767.NIL != var251) {
                    if (var252.isCons() && var252.first() == module0767.$ic159$) {
                        final SubLObject var253 = var252.rest();
                        var245 = Numbers.add(var245, var253);
                        if (module0767.NIL != module0579.f35496(var245, (SubLObject)module0767.UNPROVIDED)) {
                            var243 = (SubLObject)module0767.T;
                        }
                    }
                    else if (module0767.NIL != Symbols.fboundp(var252) && module0767.NIL == f48850(var252)) {
                        SubLObject var254 = (SubLObject)module0767.NIL;
                        SubLObject var255 = (SubLObject)module0767.NIL;
                        SubLObject var256 = (SubLObject)module0767.NIL;
                        final SubLObject var9_250 = Errors.$continue_cerrorP$.currentBinding(var239);
                        final SubLObject var257 = module0578.$g4234$.currentBinding(var239);
                        try {
                            Errors.$continue_cerrorP$.bind((SubLObject)module0767.NIL, var239);
                            module0578.$g4234$.bind((SubLObject)module0767.T, var239);
                            if (module0767.NIL != module0578.f35473()) {
                                var239.resetMultipleValues();
                                final SubLObject var251_252 = f48798(var252, var240, var242, var238, var241);
                                final SubLObject var253_254 = var239.secondMultipleValue();
                                var239.resetMultipleValues();
                                var255 = var251_252;
                                var256 = var253_254;
                            }
                            else {
                                try {
                                    var239.throwStack.push(module0003.$g3$.getGlobalValue());
                                    final SubLObject var9_251 = Errors.$error_handler$.currentBinding(var239);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)module0767.$ic160$, var239);
                                        try {
                                            var239.resetMultipleValues();
                                            final SubLObject var256_257 = f48798(var252, var240, var242, var238, var241);
                                            final SubLObject var258_259 = var239.secondMultipleValue();
                                            var239.resetMultipleValues();
                                            var255 = var256_257;
                                            var256 = var258_259;
                                        }
                                        catch (Throwable var258) {
                                            Errors.handleThrowable(var258, (SubLObject)module0767.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var9_251, var239);
                                    }
                                }
                                catch (Throwable var259) {
                                    var254 = Errors.handleThrowable(var259, module0003.$g3$.getGlobalValue());
                                }
                                finally {
                                    var239.throwStack.pop();
                                }
                                if (var254.isString() && module0767.NIL == module0578.f35477()) {
                                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var254), (SubLObject)module0767.$ic161$), module0579.f35508());
                                }
                            }
                        }
                        finally {
                            module0578.$g4234$.rebind(var257, var239);
                            Errors.$continue_cerrorP$.rebind(var9_250, var239);
                        }
                        if (module0767.NIL == var254) {
                            if (module0767.NIL != module0749.f46482(var255)) {
                                if (module0767.NIL != module0756.f47479(var2)) {
                                    var256 = (SubLObject)ConsesLow.cons(var255, var256);
                                }
                                else {
                                    f48851(var2, var255, var240, var252, var241, var245, var244, var242, var238);
                                    var249 = (SubLObject)ConsesLow.cons(var255, var249);
                                }
                                SubLObject var260 = (SubLObject)module0767.ZERO_INTEGER;
                                SubLObject var261 = var256;
                                SubLObject var262 = (SubLObject)module0767.NIL;
                                var262 = var261.first();
                                while (module0767.NIL != var261) {
                                    if (module0767.NIL == module0004.f104(var262, var249, Symbols.symbol_function((SubLObject)module0767.EQUALP), (SubLObject)module0767.UNPROVIDED)) {
                                        var249 = (SubLObject)ConsesLow.cons(var262, var249);
                                        if (module0767.NIL != module0579.f35485() && module0767.NIL != module0749.f46482(var262)) {
                                            final SubLObject var263 = module0756.f47484(var247, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                            f48851(var263, var262, var240, var252, var241, var245, var244, var242, var238);
                                            if (module0767.NIL != module0756.f47479(var263)) {
                                                module0756.f47675(var2, var263);
                                                var260 = Numbers.add(var260, (SubLObject)module0767.ONE_INTEGER);
                                            }
                                        }
                                    }
                                    var261 = var261.rest();
                                    var262 = var261.first();
                                }
                                if (var260.isPositive() && module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic162$, var260, var2);
                                }
                                if (module0767.NIL == module0579.f35485()) {
                                    var243 = (SubLObject)module0767.T;
                                }
                            }
                            else if (module0767.NIL != module0578.f35470((SubLObject)module0767.THREE_INTEGER)) {
                                PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic163$, var252, var240);
                            }
                        }
                    }
                    else if (module0767.NIL != module0580.f35596()) {
                        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)module0767.$ic164$);
                        }
                        module0770.f49117();
                    }
                    var251 = var251.rest();
                    var252 = var251.first();
                }
            }
        }
        finally {
            module0579.$g4287$.rebind(var250, var239);
        }
        if (module0767.NIL == var243) {
            final SubLObject var264 = f48852(var2, var242);
            if (module0767.NIL == f48853(var264, var242)) {
                module0756.f47784(var2, var242, (SubLObject)module0767.UNPROVIDED);
                f48836(var2, var238);
            }
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48853(final SubLObject var266, final SubLObject var267) {
        if (var267.eql(var267)) {
            return (SubLObject)module0767.T;
        }
        if (var266.isList() && var267.isList()) {
            return module0035.f2201(var266, var267, (SubLObject)module0767.UNPROVIDED);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48850(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0004.f104(var1, module0579.$g4246$.getDynamicValue(var2), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48851(final SubLObject var2, final SubLObject var268, final SubLObject var22, final SubLObject var245, SubLObject var75, final SubLObject var240, final SubLObject var239, final SubLObject var32, final SubLObject var238) {
        final SubLObject var269 = module0749.f46470(var268);
        if (module0767.NIL != var269) {
            module0756.f47783(var2, var269, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL == var75) {
                var75 = module0756.f47726(var2);
            }
        }
        final SubLObject var270 = module0756.f47711(var2);
        module0749.f46464(var268, var270);
        module0756.f47501(var2, (SubLObject)ConsesLow.list(var268), (SubLObject)module0767.UNPROVIDED);
        module0756.f47715(var2);
        module0756.f47569(var2, module0756.f47688(var245, (SubLObject)module0767.UNPROVIDED));
        module0756.f47687(var2, var268);
        module0756.f47608(var2);
        final SubLObject var271 = Numbers.subtract(var240, var239);
        if (var271.isPositive()) {
            module0756.f47500(var2, var240, var245);
            module0756.f47663(var2, (SubLObject)module0767.$ic165$, (SubLObject)module0767.$ic166$, (SubLObject)ConsesLow.list((SubLObject)module0767.$ic167$, var22, (SubLObject)module0767.$ic168$, var32, (SubLObject)module0767.$ic169$, var271, (SubLObject)module0767.$ic170$, var245));
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48849(final SubLObject var238) {
        if (var238.eql((SubLObject)module0767.$ic119$)) {
            return module0579.$g4288$.getGlobalValue();
        }
        return module0048.f3326();
    }
    
    public static SubLObject f48798(final SubLObject var271, final SubLObject var22, final SubLObject var32, final SubLObject var238, final SubLObject var83) {
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.THREE_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic171$, var271, var22);
        }
        SubLObject var273 = (SubLObject)module0767.NIL;
        SubLObject var274 = (SubLObject)module0767.NIL;
        var272.resetMultipleValues();
        final SubLObject var275 = Functions.funcall(var271, var22, var32);
        SubLObject var276 = var272.secondMultipleValue();
        var272.resetMultipleValues();
        if (!var276.isList()) {
            var276 = (SubLObject)module0767.NIL;
        }
        var273 = f48854(var275, var22, var83, var238, var32, var271);
        SubLObject var277 = var276;
        SubLObject var278 = (SubLObject)module0767.NIL;
        var278 = var277.first();
        while (module0767.NIL != var277) {
            final SubLObject var279 = f48854(var278, var22, var83, var238, var32, var271);
            if (module0767.NIL != var279) {
                final SubLObject var280 = var279;
                if (module0767.NIL == conses_high.member(var280, var274, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.$ic172$))) {
                    var274 = (SubLObject)ConsesLow.cons(var280, var274);
                }
            }
            var277 = var277.rest();
            var278 = var277.first();
        }
        return Values.values(var273, Sequences.nreverse(var274));
    }
    
    public static SubLObject f48854(final SubLObject var274, final SubLObject var22, final SubLObject var83, final SubLObject var238, SubLObject var32, final SubLObject var271) {
        SubLObject var275 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0749.f46482(var274)) {
            var275 = var274;
        }
        else if (module0767.NIL != module0035.f2014(var274) && module0767.NIL != module0035.f2000(var274, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.UNPROVIDED)) {
            SubLObject var276 = (SubLObject)module0767.NIL;
            SubLObject var277 = (SubLObject)module0767.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var274, var274, (SubLObject)module0767.$ic173$);
            var276 = var274.first();
            SubLObject var278 = var274.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var278, var274, (SubLObject)module0767.$ic173$);
            var277 = var278.first();
            var278 = var278.rest();
            final SubLObject var279 = (SubLObject)(var278.isCons() ? var278.first() : module0767.ZERO_INTEGER);
            cdestructuring_bind.destructuring_bind_must_listp(var278, var274, (SubLObject)module0767.$ic173$);
            var278 = var278.rest();
            final SubLObject var280 = (SubLObject)(var278.isCons() ? var278.first() : module0767.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var278, var274, (SubLObject)module0767.$ic173$);
            var278 = var278.rest();
            if (module0767.NIL == var278) {
                if (module0767.NIL != module0581.f35648(var276) && module0767.NIL == module0579.f35496(var279, (SubLObject)module0767.UNPROVIDED)) {
                    var275 = module0749.f46451(module0749.f46446(var276, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), var279, var280);
                    module0749.f46472(var275, var277);
                    module0749.f46468(var275, var22);
                    if (module0767.NIL == module0751.f46997(var276, var22)) {
                        module0753.f47267(var275, f48855(var83, var271));
                        if (module0767.NIL == module0751.f46997(module0749.f46455(var275), var22)) {
                            var275 = (SubLObject)module0767.NIL;
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var274, (SubLObject)module0767.$ic173$);
            }
        }
        if (module0767.NIL != var275 && module0767.NIL != var83) {
            module0753.f47267(var275, f48855(var83, var271));
        }
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic174$, var271, var275);
        }
        if (module0767.NIL != module0749.f46482(var275)) {
            if (var271.eql((SubLObject)module0767.$ic175$) && var32.equal(module0745.f46232((SubLObject)module0767.UNPROVIDED))) {
                var32 = (SubLObject)module0767.$ic46$;
            }
            var275 = f48856(var275, var238, var32, var83);
        }
        return var275;
    }
    
    public static SubLObject f48855(final SubLObject var283, final SubLObject var271) {
        if (var271 == module0767.$ic175$) {
            return module0767.$ic176$;
        }
        return var283;
    }
    
    public static SubLObject f48856(SubLObject var272, final SubLObject var238, final SubLObject var32, final SubLObject var83) {
        final SubLObject var273 = module0749.f46470(var272);
        SubLObject var274 = (SubLObject)module0767.T;
        if (module0767.NIL == f48857(var273, var238, var32, var272)) {
            var274 = (SubLObject)module0767.NIL;
        }
        else if (var238 != module0767.$ic46$) {
            if (module0767.NIL != module0751.f47107(var273)) {
                if (module0767.NIL != module0751.f47126(var83)) {
                    if (module0767.NIL != module0751.f46661((SubLObject)module0767.UNPROVIDED) && module0767.$ic177$.eql(var273) && module0767.NIL != module0038.f2675(module0749.f46455(var272), (SubLObject)module0767.$ic178$, Symbols.symbol_function((SubLObject)module0767.EQUALP))) {
                        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic179$);
                        }
                        module0749.f46457(var272, module0038.f2674(module0749.f46455(var272), (SubLObject)module0767.$ic178$, Symbols.symbol_function((SubLObject)module0767.EQUALP)));
                    }
                    else {
                        var274 = (SubLObject)module0767.NIL;
                    }
                }
            }
        }
        if (module0767.NIL == var274) {
            var272 = (SubLObject)module0767.NIL;
        }
        return var272;
    }
    
    public static SubLObject f48852(final SubLObject var2, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = module0756.f47488(var2, (SubLObject)module0767.UNPROVIDED);
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = var32;
        if (module0767.NIL != module0756.f47591(var2) && module0767.NIL == module0762.f48210(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED)) && module0767.NIL != module0751.f46877(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED))) {
            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic180$, module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED));
            }
            final SubLObject var35 = module0147.f9540(module0579.$g4260$.getDynamicValue(var33));
            final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
            final SubLObject var37 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var38 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2095$.bind(module0147.f9545(var35), var33);
                module0147.$g2094$.bind(module0147.f9546(var35), var33);
                module0147.$g2096$.bind(module0147.f9549(var35), var33);
                var34 = module0751.f47099(var32, (SubLObject)module0767.$ic181$, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var38, var33);
                module0147.$g2094$.rebind(var37, var33);
                module0147.$g2095$.rebind(var36, var33);
            }
        }
        else if (module0767.NIL != module0035.f2014(var32) && module0767.NIL == module0756.f47727(var2) && module0767.NIL != module0751.f47099((SubLObject)module0767.$ic182$, var32, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0751.f47099((SubLObject)module0767.$ic183$, var32, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0751.f47099((SubLObject)module0767.$ic184$, var32, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0004.f104(module0767.$ic185$, var32, (SubLObject)module0767.$ic186$, (SubLObject)module0767.UNPROVIDED)) {
            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic187$, var32);
            }
            var34 = (SubLObject)ConsesLow.cons(module0767.$ic185$, var32);
        }
        else if (module0767.NIL == var32 && module0767.NIL != module0756.f47727(var2)) {
            var34 = module0731.f44657();
        }
        return var34;
    }
    
    public static SubLObject f48857(final SubLObject var28, final SubLObject var238, final SubLObject var32, final SubLObject var272) {
        final SubLThread var273 = SubLProcess.currentSubLThread();
        if (var238 == module0767.$ic46$) {
            return (SubLObject)module0767.T;
        }
        if (var32 == module0767.$ic46$) {
            return (SubLObject)module0767.T;
        }
        if (module0767.NIL == var32 && module0767.NIL != module0731.f44750(module0749.f46455(var272), module0579.$g4260$.getDynamicValue(var273))) {
            return (SubLObject)module0767.T;
        }
        if (module0767.NIL == var28) {
            return (SubLObject)module0767.NIL;
        }
        if (module0767.NIL != module0751.f47030(var28) || module0767.NIL != module0751.f47107(var28)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var238 == module0767.$ic12$ || module0767.NIL != conses_high.member(var28, var32, (SubLObject)module0767.$ic188$, (SubLObject)module0767.UNPROVIDED));
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48858(final SubLObject var286, final SubLObject var287) {
        final SubLThread var288 = SubLProcess.currentSubLThread();
        return module0751.f46849(var286, var287, module0579.$g4260$.getDynamicValue(var288));
    }
    
    public static SubLObject f48859(final SubLObject var22, SubLObject var32, SubLObject var238, SubLObject var288, SubLObject var289) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.$ic190$;
        }
        if (var238 == module0767.UNPROVIDED) {
            var238 = (SubLObject)module0767.$ic46$;
        }
        if (var288 == module0767.UNPROVIDED) {
            var288 = module0751.f46599();
        }
        if (var289 == module0767.UNPROVIDED) {
            var289 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var290 = SubLProcess.currentSubLThread();
        if (module0767.NIL == var32) {
            final SubLObject var291 = Sequences.cconcatenate((SubLObject)module0767.$ic191$, new SubLObject[] { module0006.f205((SubLObject)module0767.ONE_INTEGER), module0767.$ic192$, module0006.f203((SubLObject)module0767.$ic193$) });
            module0578.f35476(var291, (SubLObject)ConsesLow.list(var22));
        }
        if (var32 == module0767.$ic190$) {
            var32 = module0751.f47032(var22);
        }
        final SubLObject var292 = module0228.f15229(var22);
        final SubLObject var293 = module0749.f46494((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        module0756.f47465(var293, var292);
        if (module0767.NIL != var32) {
            module0756.f47784(var293, var32, (SubLObject)module0767.UNPROVIDED);
        }
        assert module0767.NIL != module0751.f46598(var288) : var288;
        final SubLObject var294 = module0579.$g4254$.currentBinding(var290);
        final SubLObject var295 = module0579.$g4259$.currentBinding(var290);
        try {
            module0579.$g4254$.bind(var288, var290);
            module0579.$g4259$.bind(var289, var290);
            f48836(var293, var238);
        }
        finally {
            module0579.$g4259$.rebind(var295, var290);
            module0579.$g4254$.rebind(var294, var290);
        }
        return module0756.f47467(var293);
    }
    
    public static SubLObject f48860(final SubLObject var22, SubLObject var32, SubLObject var238, SubLObject var288, SubLObject var289) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.$ic190$;
        }
        if (var238 == module0767.UNPROVIDED) {
            var238 = (SubLObject)module0767.$ic46$;
        }
        if (var288 == module0767.UNPROVIDED) {
            var288 = module0751.f46599();
        }
        if (var289 == module0767.UNPROVIDED) {
            var289 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var290 = SubLProcess.currentSubLThread();
        final SubLObject var291 = module0034.$g879$.getDynamicValue(var290);
        SubLObject var292 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var291) {
            return f48859(var22, var32, var238, var288, var289);
        }
        var292 = module0034.f1857(var291, (SubLObject)module0767.$ic189$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var292) {
            var292 = module0034.f1807(module0034.f1842(var291), (SubLObject)module0767.$ic189$, (SubLObject)module0767.FIVE_INTEGER, (SubLObject)module0767.$ic195$, (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var291, (SubLObject)module0767.$ic189$, var292);
        }
        final SubLObject var293 = module0034.f1779(var22, var32, var238, var288, var289);
        final SubLObject var294 = module0034.f1814(var292, var293, (SubLObject)module0767.UNPROVIDED);
        if (var294 != module0767.$ic23$) {
            SubLObject var295 = var294;
            SubLObject var296 = (SubLObject)module0767.NIL;
            var296 = var295.first();
            while (module0767.NIL != var295) {
                SubLObject var297 = var296.first();
                final SubLObject var298 = conses_high.second(var296);
                if (var22.equal(var297.first())) {
                    var297 = var297.rest();
                    if (var32.equal(var297.first())) {
                        var297 = var297.rest();
                        if (var238.equal(var297.first())) {
                            var297 = var297.rest();
                            if (var288.equal(var297.first())) {
                                var297 = var297.rest();
                                if (module0767.NIL != var297 && module0767.NIL == var297.rest() && var289.equal(var297.first())) {
                                    return module0034.f1959(var298);
                                }
                            }
                        }
                    }
                }
                var295 = var295.rest();
                var296 = var295.first();
            }
        }
        final SubLObject var299 = Values.arg2(var290.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48859(var22, var32, var238, var288, var289)));
        module0034.f1836(var292, var293, var294, var299, (SubLObject)ConsesLow.list(var22, var32, var238, var288, var289));
        return module0034.f1959(var299);
    }
    
    public static SubLObject f48861() {
        final SubLObject var7 = module0767.$g6135$.getGlobalValue();
        if (module0767.NIL != var7) {
            module0034.f1818(var7);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48862(SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0767.$g6135$.getGlobalValue(), (SubLObject)ConsesLow.list(var300), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48863(final SubLObject var300) {
        final SubLThread var301 = SubLProcess.currentSubLThread();
        SubLObject var302 = (SubLObject)module0767.NIL;
        final SubLObject var303 = module0147.f9540(var300);
        final SubLObject var304 = module0147.$g2095$.currentBinding(var301);
        final SubLObject var305 = module0147.$g2094$.currentBinding(var301);
        final SubLObject var306 = module0147.$g2096$.currentBinding(var301);
        try {
            module0147.$g2095$.bind(module0147.f9545(var303), var301);
            module0147.$g2094$.bind(module0147.f9546(var303), var301);
            module0147.$g2096$.bind(module0147.f9549(var303), var301);
            var302 = Sequences.remove(module0767.$ic197$, Sequences.delete_duplicates(ConsesLow.append(module0259.f16848(module0767.$ic198$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), module0260.f17034(module0767.$ic14$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var307 = ConsesLow.nconc(module0035.f2220(var302, module0259.f16848(module0767.$ic198$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED), module0767.$g6136$.getGlobalValue());
            var302 = module0035.delete_if_not((SubLObject)module0767.$ic199$, Sequences.delete_if((SubLObject)module0767.$ic200$, conses_high.set_difference(var302, var307, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            var302 = f48864(var302);
            var302 = (SubLObject)ConsesLow.cons(module0767.$ic197$, var302);
        }
        finally {
            module0147.$g2096$.rebind(var306, var301);
            module0147.$g2094$.rebind(var305, var301);
            module0147.$g2095$.rebind(var304, var301);
        }
        return var302;
    }
    
    public static SubLObject f48865(SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var301 = module0767.$g6135$.getGlobalValue();
        if (module0767.NIL == var301) {
            var301 = module0034.f1934((SubLObject)module0767.$ic196$, (SubLObject)module0767.$ic201$, (SubLObject)module0767.$ic202$, (SubLObject)module0767.EQUAL, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0767.$ic203$);
        }
        SubLObject var302 = module0034.f1814(var301, var300, (SubLObject)module0767.$ic23$);
        if (var302 == module0767.$ic23$) {
            var302 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48863(var300)));
            module0034.f1816(var301, var300, var302, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var302);
    }
    
    public static SubLObject f48866() {
        final SubLObject var7 = module0767.$g6137$.getGlobalValue();
        if (module0767.NIL != var7) {
            module0034.f1818(var7);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48867(SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0767.$g6137$.getGlobalValue(), (SubLObject)ConsesLow.list(var300), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48868(final SubLObject var300) {
        return (SubLObject)ConsesLow.cons(module0767.$ic205$, Sequences.remove(module0767.$ic205$, module0259.f16849(module0767.$ic206$, var300, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
    }
    
    public static SubLObject f48869(SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var301 = module0767.$g6137$.getGlobalValue();
        if (module0767.NIL == var301) {
            var301 = module0034.f1934((SubLObject)module0767.$ic204$, (SubLObject)module0767.$ic207$, (SubLObject)module0767.$ic202$, (SubLObject)module0767.EQUAL, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0767.$ic208$);
        }
        SubLObject var302 = module0034.f1814(var301, var300, (SubLObject)module0767.$ic23$);
        if (var302 == module0767.$ic23$) {
            var302 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48868(var300)));
            module0034.f1816(var301, var300, var302, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var302);
    }
    
    public static SubLObject f48870(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.$ic46$;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0767.NIL;
        SubLObject var35 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0212.f13762(var22) && module0767.NIL != var32) {
            SubLObject var36 = module0147.f9540(module0579.$g4260$.getDynamicValue(var33));
            SubLObject var37 = module0147.$g2095$.currentBinding(var33);
            SubLObject var38 = module0147.$g2094$.currentBinding(var33);
            SubLObject var39 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2095$.bind(module0147.f9545(var36), var33);
                module0147.$g2094$.bind(module0147.f9546(var36), var33);
                module0147.$g2096$.bind(module0147.f9549(var36), var33);
                var33.resetMultipleValues();
                final SubLObject var305_306 = f48871(var22, var32, var34);
                final SubLObject var307_308 = var33.secondMultipleValue();
                var33.resetMultipleValues();
                var34 = var305_306;
                var35 = var307_308;
            }
            finally {
                module0147.$g2096$.rebind(var39, var33);
                module0147.$g2094$.rebind(var38, var33);
                module0147.$g2095$.rebind(var37, var33);
            }
            if (module0767.NIL != module0035.f2012(var34) || module0767.NIL != module0579.f35485()) {
                var36 = module0147.f9540(f48872((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
                var37 = module0147.$g2095$.currentBinding(var33);
                var38 = module0147.$g2094$.currentBinding(var33);
                var39 = module0147.$g2096$.currentBinding(var33);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var36), var33);
                    module0147.$g2094$.bind(module0147.f9546(var36), var33);
                    module0147.$g2096$.bind(module0147.f9549(var36), var33);
                    var33.resetMultipleValues();
                    final SubLObject var309_310 = f48871(var22, var32, var34);
                    final SubLObject var311_312 = var33.secondMultipleValue();
                    var33.resetMultipleValues();
                    var34 = var309_310;
                    var35 = var311_312;
                }
                finally {
                    module0147.$g2096$.rebind(var39, var33);
                    module0147.$g2094$.rebind(var38, var33);
                    module0147.$g2095$.rebind(var37, var33);
                }
                if (module0767.NIL != module0579.$g4261$.getDynamicValue(var33) && (module0767.NIL != module0035.f2012(var34) || module0767.NIL != module0579.f35485())) {
                    final SubLObject var40 = f48873();
                    if (module0767.NIL == module0161.f10514(var40, module0579.$g4260$.getDynamicValue(var33))) {
                        var37 = module0579.$g4260$.currentBinding(var33);
                        try {
                            module0579.$g4260$.bind(var40, var33);
                            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
                                Errors.warn((SubLObject)module0767.$ic209$, module0579.$g4260$.getDynamicValue(var33));
                            }
                            final SubLObject var41 = module0147.f9540(f48872((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
                            final SubLObject var9_314 = module0147.$g2095$.currentBinding(var33);
                            final SubLObject var42 = module0147.$g2094$.currentBinding(var33);
                            final SubLObject var43 = module0147.$g2096$.currentBinding(var33);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var41), var33);
                                module0147.$g2094$.bind(module0147.f9546(var41), var33);
                                module0147.$g2096$.bind(module0147.f9549(var41), var33);
                                var33.resetMultipleValues();
                                final SubLObject var315_316 = f48871(var22, var32, var34);
                                final SubLObject var317_318 = var33.secondMultipleValue();
                                var33.resetMultipleValues();
                                var34 = var315_316;
                                var35 = var317_318;
                            }
                            finally {
                                module0147.$g2096$.rebind(var43, var33);
                                module0147.$g2094$.rebind(var42, var33);
                                module0147.$g2095$.rebind(var9_314, var33);
                            }
                        }
                        finally {
                            module0579.$g4260$.rebind(var37, var33);
                        }
                    }
                }
            }
        }
        var34 = Sequences.nreverse(var34);
        var35 = Sequences.nreverse(var35);
        return Values.values(var34.first(), ConsesLow.append(var34.rest(), var35));
    }
    
    public static SubLObject f48871(final SubLObject var22, final SubLObject var32, final SubLObject var319) {
        final SubLThread var320 = SubLProcess.currentSubLThread();
        SubLObject var321 = var319;
        SubLObject var322 = (SubLObject)module0767.NIL;
        final SubLObject var323 = f48874(var32);
        SubLObject var324 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var324) {
            SubLObject var325 = var323;
            SubLObject var326 = (SubLObject)module0767.NIL;
            var326 = var325.first();
            while (module0767.NIL == var324 && module0767.NIL != var325) {
                if (module0767.NIL != module0222.f14640(var326, var22, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.T)) {
                    var320.resetMultipleValues();
                    final SubLObject var327 = f48875(var22, var326);
                    final SubLObject var328 = var320.secondMultipleValue();
                    var320.resetMultipleValues();
                    SubLObject var329 = (SubLObject)module0767.NIL;
                    SubLObject var325_326 = (SubLObject)module0767.NIL;
                    SubLObject var330 = (SubLObject)module0767.NIL;
                    SubLObject var328_329 = (SubLObject)module0767.NIL;
                    var329 = (SubLObject)ConsesLow.list(var327, var328);
                    var325_326 = var329.first();
                    var330 = (SubLObject)ConsesLow.list((SubLObject)module0767.NIL, (SubLObject)module0767.T);
                    var328_329 = var330.first();
                    while (module0767.NIL != var330 || module0767.NIL != var329) {
                        if (module0767.NIL == var324) {
                            SubLObject var73_330 = var325_326;
                            SubLObject var331 = (SubLObject)module0767.NIL;
                            var331 = var73_330.first();
                            while (module0767.NIL == var324 && module0767.NIL != var73_330) {
                                SubLObject var333;
                                final SubLObject var332 = var333 = var331;
                                SubLObject var334 = (SubLObject)module0767.NIL;
                                SubLObject var335 = (SubLObject)module0767.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var333, var332, (SubLObject)module0767.$ic210$);
                                var334 = var333.first();
                                var333 = (var335 = var333.rest());
                                if (module0767.NIL != f48876(var334, var22, var335, var32)) {
                                    var334 = f48877(var334, var22);
                                    if (module0767.NIL != var328_329) {
                                        final SubLObject var336 = (SubLObject)ConsesLow.list(var334, var335);
                                        if (module0767.NIL == conses_high.member(var336, var322, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                            var322 = (SubLObject)ConsesLow.cons(var336, var322);
                                        }
                                    }
                                    else {
                                        final SubLObject var336 = (SubLObject)ConsesLow.list(var334, var335);
                                        if (module0767.NIL == conses_high.member(var336, var321, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                            var321 = (SubLObject)ConsesLow.cons(var336, var321);
                                        }
                                    }
                                }
                                if (module0767.NIL == module0579.f35485()) {
                                    var324 = (SubLObject)module0767.T;
                                }
                                var73_330 = var73_330.rest();
                                var331 = var73_330.first();
                            }
                        }
                        var329 = var329.rest();
                        var325_326 = var329.first();
                        var330 = var330.rest();
                        var328_329 = var330.first();
                    }
                }
                var325 = var325.rest();
                var326 = var325.first();
            }
        }
        return Values.values(var321, var322);
    }
    
    public static SubLObject f48874(final SubLObject var32) {
        return (var32 == module0767.$ic46$ || module0767.NIL != Sequences.find(module0767.$ic56$, var32, Symbols.symbol_function((SubLObject)module0767.$ic211$), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) ? f48865((SubLObject)module0767.UNPROVIDED) : f48878(var32);
    }
    
    public static SubLObject f48876(final SubLObject var6, final SubLObject var22, final SubLObject var28, final SubLObject var32) {
        SubLObject var33 = (SubLObject)module0767.T;
        if (var32.eql((SubLObject)module0767.$ic46$)) {
            var33 = (SubLObject)module0767.T;
        }
        else if (module0767.NIL == var33) {
            SubLObject var34;
            SubLObject var35;
            for (var34 = var32, var35 = (SubLObject)module0767.NIL, var35 = var34.first(); module0767.NIL == var33 && module0767.NIL != var34; var33 = module0764.f48427(var6, var22, var28, var35), var34 = var34.rest(), var35 = var34.first()) {}
        }
        return var33;
    }
    
    public static SubLObject f48878(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0767.NIL;
        SubLObject var35 = var32;
        SubLObject var36 = (SubLObject)module0767.NIL;
        var36 = var35.first();
        while (module0767.NIL != var35) {
            if (module0767.NIL != module0751.f46849(var36, module0767.$ic185$, (SubLObject)module0767.UNPROVIDED) || module0767.NIL != module0751.f46849(var36, module0767.$ic212$, (SubLObject)module0767.UNPROVIDED)) {
                final SubLObject var37 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == f48879(var36));
                final SubLObject var38 = var36;
                final SubLObject var39 = (SubLObject)module0767.$ic66$;
                final SubLObject var40 = module0056.f4145(var39);
                SubLObject var41 = (SubLObject)module0767.NIL;
                final SubLObject var42 = module0139.$g1635$.currentBinding(var33);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var33);
                    final SubLObject var43 = (SubLObject)module0767.NIL;
                    final SubLObject var9_341 = module0141.$g1714$.currentBinding(var33);
                    final SubLObject var44 = module0141.$g1715$.currentBinding(var33);
                    try {
                        module0141.$g1714$.bind((module0767.NIL != var43) ? var43 : module0141.f9283(), var33);
                        module0141.$g1715$.bind((SubLObject)((module0767.NIL != var43) ? module0767.$ic68$ : module0141.$g1715$.getDynamicValue(var33)), var33);
                        if (module0767.NIL != var43 && module0767.NIL != module0136.f8864() && module0767.NIL == module0141.f9279(var43)) {
                            final SubLObject var45 = module0136.$g1591$.getDynamicValue(var33);
                            if (var45.eql((SubLObject)module0767.$ic69$)) {
                                module0136.f8870((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic70$, var43, (SubLObject)module0767.$ic71$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                            }
                            else if (var45.eql((SubLObject)module0767.$ic72$)) {
                                module0136.f8871((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic73$, (SubLObject)module0767.$ic70$, var43, (SubLObject)module0767.$ic71$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                            }
                            else if (var45.eql((SubLObject)module0767.$ic74$)) {
                                Errors.warn((SubLObject)module0767.$ic70$, var43, (SubLObject)module0767.$ic71$);
                            }
                            else {
                                Errors.warn((SubLObject)module0767.$ic75$, module0136.$g1591$.getDynamicValue(var33));
                                Errors.cerror((SubLObject)module0767.$ic73$, (SubLObject)module0767.$ic70$, var43, (SubLObject)module0767.$ic71$);
                            }
                        }
                        final SubLObject var9_342 = module0141.$g1670$.currentBinding(var33);
                        final SubLObject var25_343 = module0141.$g1671$.currentBinding(var33);
                        final SubLObject var46 = module0141.$g1672$.currentBinding(var33);
                        final SubLObject var47 = module0141.$g1674$.currentBinding(var33);
                        final SubLObject var48 = module0137.$g1605$.currentBinding(var33);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0767.$ic76$), var33);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0767.$ic76$)), var33);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0767.$ic76$)), var33);
                            module0141.$g1674$.bind((SubLObject)module0767.NIL, var33);
                            module0137.$g1605$.bind(module0137.f8955(module0767.$ic76$), var33);
                            if (module0767.NIL != module0136.f8865() || module0767.NIL != module0244.f15795(var36, module0137.f8955((SubLObject)module0767.UNPROVIDED))) {
                                final SubLObject var9_343 = module0141.$g1677$.currentBinding(var33);
                                final SubLObject var25_344 = module0138.$g1619$.currentBinding(var33);
                                final SubLObject var26_346 = module0141.$g1674$.currentBinding(var33);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var33);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0767.$ic76$)), var33);
                                    module0141.$g1674$.bind((SubLObject)module0767.NIL, var33);
                                    module0249.f16055(var38, (SubLObject)module0767.UNPROVIDED);
                                    for (var41 = (SubLObject)ConsesLow.list(var36, module0141.f9195()); module0767.NIL != var41; var41 = module0056.f4150(var40)) {
                                        final SubLObject var337_347 = var41.first();
                                        final SubLObject var49 = conses_high.second(var41);
                                        final SubLObject var50 = var337_347;
                                        final SubLObject var9_344 = module0141.$g1674$.currentBinding(var33);
                                        try {
                                            module0141.$g1674$.bind(var49, var33);
                                            if (module0767.NIL != module0250.f16115(module0141.f9190(), var337_347) && (module0767.NIL != var37 || module0767.NIL != f48879(var50))) {
                                                final SubLObject var51 = var50;
                                                if (module0767.NIL == conses_high.member(var51, var34, Symbols.symbol_function((SubLObject)module0767.EQL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                                    var34 = (SubLObject)ConsesLow.cons(var51, var34);
                                                }
                                            }
                                            SubLObject var40_350;
                                            final SubLObject var52 = var40_350 = module0200.f12443(module0137.f8955(module0767.$ic76$));
                                            SubLObject var53 = (SubLObject)module0767.NIL;
                                            var53 = var40_350.first();
                                            while (module0767.NIL != var40_350) {
                                                final SubLObject var9_345 = module0137.$g1605$.currentBinding(var33);
                                                final SubLObject var25_345 = module0141.$g1674$.currentBinding(var33);
                                                try {
                                                    module0137.$g1605$.bind(var53, var33);
                                                    module0141.$g1674$.bind((SubLObject)((module0767.NIL != module0141.f9205((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0767.NIL == module0141.$g1674$.getDynamicValue(var33)) : module0141.$g1674$.getDynamicValue(var33)), var33);
                                                    final SubLObject var54 = module0228.f15229(var337_347);
                                                    if (module0767.NIL != module0138.f8992(var54)) {
                                                        final SubLObject var55 = module0242.f15664(var54, module0137.f8955((SubLObject)module0767.UNPROVIDED));
                                                        if (module0767.NIL != var55) {
                                                            final SubLObject var56 = module0245.f15834(var55, module0138.f8979(), module0137.f8955((SubLObject)module0767.UNPROVIDED));
                                                            if (module0767.NIL != var56) {
                                                                SubLObject var57;
                                                                for (var57 = module0066.f4838(module0067.f4891(var56)); module0767.NIL == module0066.f4841(var57); var57 = module0066.f4840(var57)) {
                                                                    var33.resetMultipleValues();
                                                                    final SubLObject var58 = module0066.f4839(var57);
                                                                    final SubLObject var59 = var33.secondMultipleValue();
                                                                    var33.resetMultipleValues();
                                                                    if (module0767.NIL != module0147.f9507(var58)) {
                                                                        final SubLObject var9_346 = module0138.$g1623$.currentBinding(var33);
                                                                        try {
                                                                            module0138.$g1623$.bind(var58, var33);
                                                                            SubLObject var133_354;
                                                                            for (var133_354 = module0066.f4838(module0067.f4891(var59)); module0767.NIL == module0066.f4841(var133_354); var133_354 = module0066.f4840(var133_354)) {
                                                                                var33.resetMultipleValues();
                                                                                final SubLObject var60 = module0066.f4839(var133_354);
                                                                                final SubLObject var61 = var33.secondMultipleValue();
                                                                                var33.resetMultipleValues();
                                                                                if (module0767.NIL != module0141.f9289(var60)) {
                                                                                    final SubLObject var9_347 = module0138.$g1624$.currentBinding(var33);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60, var33);
                                                                                        final SubLObject var62 = var61;
                                                                                        if (module0767.NIL != module0077.f5302(var62)) {
                                                                                            final SubLObject var63 = module0077.f5333(var62);
                                                                                            SubLObject var64;
                                                                                            SubLObject var65;
                                                                                            SubLObject var66;
                                                                                            for (var64 = module0032.f1741(var63), var65 = (SubLObject)module0767.NIL, var65 = module0032.f1742(var64, var63); module0767.NIL == module0032.f1744(var64, var65); var65 = module0032.f1743(var65)) {
                                                                                                var66 = module0032.f1745(var64, var65);
                                                                                                if (module0767.NIL != module0032.f1746(var65, var66) && module0767.NIL == module0249.f16059(var66, (SubLObject)module0767.UNPROVIDED)) {
                                                                                                    module0249.f16055(var66, (SubLObject)module0767.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var66, module0141.f9195()), var40);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var62.isList()) {
                                                                                            SubLObject var67 = var62;
                                                                                            SubLObject var68 = (SubLObject)module0767.NIL;
                                                                                            var68 = var67.first();
                                                                                            while (module0767.NIL != var67) {
                                                                                                if (module0767.NIL == module0249.f16059(var68, (SubLObject)module0767.UNPROVIDED)) {
                                                                                                    module0249.f16055(var68, (SubLObject)module0767.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var68, module0141.f9195()), var40);
                                                                                                }
                                                                                                var67 = var67.rest();
                                                                                                var68 = var67.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0767.$ic78$, var62);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var9_347, var33);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var133_354);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var9_346, var33);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var57);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0767.FIVE_INTEGER, (SubLObject)module0767.$ic79$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0767.NIL != module0155.f9785(var54, (SubLObject)module0767.UNPROVIDED)) {
                                                        SubLObject var40_351;
                                                        final SubLObject var69 = var40_351 = ((module0767.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var33), module0137.f8955((SubLObject)module0767.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var33), module0137.f8955((SubLObject)module0767.UNPROVIDED)));
                                                        SubLObject var70 = (SubLObject)module0767.NIL;
                                                        var70 = var40_351.first();
                                                        while (module0767.NIL != var40_351) {
                                                            final SubLObject var9_348 = module0138.$g1625$.currentBinding(var33);
                                                            try {
                                                                module0138.$g1625$.bind(var70, var33);
                                                                final SubLObject var72;
                                                                final SubLObject var71 = var72 = Functions.funcall(var70, var54);
                                                                if (module0767.NIL != module0077.f5302(var72)) {
                                                                    final SubLObject var73 = module0077.f5333(var72);
                                                                    SubLObject var74;
                                                                    SubLObject var75;
                                                                    SubLObject var76;
                                                                    for (var74 = module0032.f1741(var73), var75 = (SubLObject)module0767.NIL, var75 = module0032.f1742(var74, var73); module0767.NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                                                        var76 = module0032.f1745(var74, var75);
                                                                        if (module0767.NIL != module0032.f1746(var75, var76) && module0767.NIL == module0249.f16059(var76, (SubLObject)module0767.UNPROVIDED)) {
                                                                            module0249.f16055(var76, (SubLObject)module0767.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var76, module0141.f9195()), var40);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var72.isList()) {
                                                                    SubLObject var77 = var72;
                                                                    SubLObject var78 = (SubLObject)module0767.NIL;
                                                                    var78 = var77.first();
                                                                    while (module0767.NIL != var77) {
                                                                        if (module0767.NIL == module0249.f16059(var78, (SubLObject)module0767.UNPROVIDED)) {
                                                                            module0249.f16055(var78, (SubLObject)module0767.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var78, module0141.f9195()), var40);
                                                                        }
                                                                        var77 = var77.rest();
                                                                        var78 = var77.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0767.$ic78$, var72);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var9_348, var33);
                                                            }
                                                            var40_351 = var40_351.rest();
                                                            var70 = var40_351.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var25_345, var33);
                                                    module0137.$g1605$.rebind(var9_345, var33);
                                                }
                                                var40_350 = var40_350.rest();
                                                var53 = var40_350.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var9_344, var33);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var26_346, var33);
                                    module0138.$g1619$.rebind(var25_344, var33);
                                    module0141.$g1677$.rebind(var9_343, var33);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.$ic80$, var36, module0244.f15748(module0137.f8955((SubLObject)module0767.UNPROVIDED)), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var48, var33);
                            module0141.$g1674$.rebind(var47, var33);
                            module0141.$g1672$.rebind(var46, var33);
                            module0141.$g1671$.rebind(var25_343, var33);
                            module0141.$g1670$.rebind(var9_342, var33);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var44, var33);
                        module0141.$g1714$.rebind(var9_341, var33);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var33));
                }
                finally {
                    module0139.$g1635$.rebind(var42, var33);
                }
            }
            var35 = var35.rest();
            var36 = var35.first();
        }
        return f48864(var34);
    }
    
    public static SubLObject f48879(final SubLObject var334) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var334.eql(module0767.$ic185$) || module0767.NIL != module0004.f104(var334, f48865((SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
    }
    
    public static SubLObject f48880() {
        final SubLObject var7 = module0767.$g6138$.getGlobalValue();
        if (module0767.NIL != var7) {
            module0034.f1818(var7);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48881(SubLObject var359, SubLObject var96) {
        if (var359 == module0767.UNPROVIDED) {
            var359 = module0579.$g4260$.getDynamicValue();
        }
        if (var96 == module0767.UNPROVIDED) {
            var96 = module0579.$g4262$.getDynamicValue();
        }
        return module0034.f1829(module0767.$g6138$.getGlobalValue(), (SubLObject)ConsesLow.list(var359, var96), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48882(final SubLObject var359, final SubLObject var96) {
        return module0751.f46998((SubLObject)ConsesLow.list(module0767.$ic214$, var359, var96));
    }
    
    public static SubLObject f48872(SubLObject var359, SubLObject var96) {
        if (var359 == module0767.UNPROVIDED) {
            var359 = module0579.$g4260$.getDynamicValue();
        }
        if (var96 == module0767.UNPROVIDED) {
            var96 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var360 = module0767.$g6138$.getGlobalValue();
        if (module0767.NIL == var360) {
            var360 = module0034.f1934((SubLObject)module0767.$ic213$, (SubLObject)module0767.$ic215$, (SubLObject)module0767.NIL, (SubLObject)module0767.EQUAL, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.ZERO_INTEGER);
            module0034.f1943((SubLObject)module0767.$ic216$);
        }
        final SubLObject var361 = module0034.f1782(var359, var96);
        final SubLObject var362 = module0034.f1814(var360, var361, (SubLObject)module0767.UNPROVIDED);
        if (var362 != module0767.$ic23$) {
            SubLObject var363 = var362;
            SubLObject var364 = (SubLObject)module0767.NIL;
            var364 = var363.first();
            while (module0767.NIL != var363) {
                SubLObject var365 = var364.first();
                final SubLObject var366 = conses_high.second(var364);
                if (var359.equal(var365.first())) {
                    var365 = var365.rest();
                    if (module0767.NIL != var365 && module0767.NIL == var365.rest() && var96.equal(var365.first())) {
                        return module0034.f1959(var366);
                    }
                }
                var363 = var363.rest();
                var364 = var363.first();
            }
        }
        final SubLObject var367 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48882(var359, var96)));
        module0034.f1836(var360, var361, var362, var367, (SubLObject)ConsesLow.list(var359, var96));
        return module0034.f1959(var367);
    }
    
    public static SubLObject f48873() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f48883(module0579.$g4260$.getDynamicValue(var4));
        final SubLObject var6 = module0767.$ic217$;
        final SubLObject var7 = (SubLObject)((module0767.NIL != module0212.f13762(var5)) ? module0220.f14556(var5, var6, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) : module0767.NIL);
        return (module0767.NIL != var7) ? var7 : module0579.$g4260$.getDynamicValue(var4);
    }
    
    public static SubLObject f48884(final SubLObject var367) {
        return module0222.f14635(module0767.$ic218$, var367, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48875(final SubLObject var22, final SubLObject var321) {
        final SubLThread var322 = SubLProcess.currentSubLThread();
        final SubLObject var323 = module0764.f48446(var22, (SubLObject)ConsesLow.list(var321), (SubLObject)module0767.NIL);
        SubLObject var324 = (SubLObject)module0767.NIL;
        SubLObject var325 = (SubLObject)module0767.NIL;
        SubLObject var326 = (SubLObject)module0767.NIL;
        if (module0767.NIL != var323) {
            if (module0767.NIL == var326) {
                SubLObject var327 = var323;
                SubLObject var328 = (SubLObject)module0767.NIL;
                var328 = var327.first();
                while (module0767.NIL == var326 && module0767.NIL != var327) {
                    final SubLObject var329 = f48884(var328);
                    if (module0767.NIL == var326) {
                        SubLObject var73_371 = f48885(var328);
                        SubLObject var330 = (SubLObject)module0767.NIL;
                        var330 = var73_371.first();
                        while (module0767.NIL == var326 && module0767.NIL != var73_371) {
                            if (module0767.NIL != module0751.f46997(var330, var22)) {
                                if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic219$, var22, var328);
                                }
                                module0758.f47891(var22, var330, (SubLObject)ConsesLow.list(var321), (SubLObject)ConsesLow.list(var328));
                                if (module0767.NIL != var329) {
                                    final SubLObject var331 = (SubLObject)ConsesLow.cons(var330, var321);
                                    if (module0767.NIL == conses_high.member(var331, var325, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                        var325 = (SubLObject)ConsesLow.cons(var331, var325);
                                    }
                                }
                                else {
                                    final SubLObject var331 = (SubLObject)ConsesLow.cons(var330, var321);
                                    if (module0767.NIL == conses_high.member(var331, var324, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                        var324 = (SubLObject)ConsesLow.cons(var331, var324);
                                    }
                                }
                            }
                            else if (module0767.NIL != module0753.f47261(var330)) {
                                final SubLObject var332 = module0753.f47277(var22, var330);
                                if (module0767.NIL != module0751.f46997(var332, var22)) {
                                    if (module0767.NIL != var329) {
                                        final SubLObject var333 = (SubLObject)ConsesLow.cons(var332, var321);
                                        if (module0767.NIL == conses_high.member(var333, var325, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                            var325 = (SubLObject)ConsesLow.cons(var333, var325);
                                        }
                                    }
                                    else {
                                        final SubLObject var333 = (SubLObject)ConsesLow.cons(var332, var321);
                                        if (module0767.NIL == conses_high.member(var333, var324, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                            var324 = (SubLObject)ConsesLow.cons(var333, var324);
                                        }
                                    }
                                }
                            }
                            var326 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == module0579.f35485() && module0767.NIL != var324);
                            var73_371 = var73_371.rest();
                            var330 = var73_371.first();
                        }
                    }
                    var327 = var327.rest();
                    var328 = var327.first();
                }
            }
        }
        else if (var321.eql(module0767.$ic128$) && module0767.NIL != module0751.f46877(var22) && module0767.NIL != module0751.f46684(var22, module0767.$ic220$, module0579.$g4262$.getDynamicValue(var322))) {
            final SubLObject var334 = f48842(var22);
            final SubLObject var335 = (SubLObject)ConsesLow.cons(module0756.f47721(var334, (SubLObject)module0767.T), module0749.f46470(var334));
            if (module0767.NIL == conses_high.member(var335, var324, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                var324 = (SubLObject)ConsesLow.cons(var335, var324);
            }
        }
        return Values.values(var324, var325, var326);
    }
    
    public static SubLObject f48886(final SubLObject var370) {
        SubLObject var371 = (SubLObject)module0767.NIL;
        final SubLObject var372 = module0178.f11335(var370);
        if (var372.isString() || module0767.NIL != module0208.f13537(var372, (SubLObject)module0767.UNPROVIDED)) {
            final SubLObject var373 = module0581.f35652(var372);
            var371 = (SubLObject)ConsesLow.cons(var373, var371);
            if (module0767.NIL != module0581.f35648(var373) && module0767.NIL != module0581.f35655(var373, (SubLObject)module0767.$ic178$, Symbols.symbol_function((SubLObject)module0767.EQUALP))) {
                var371 = module0035.f2083(module0581.f35657(var373, (SubLObject)module0767.$ic178$, Symbols.symbol_function((SubLObject)module0767.EQUALP)), var371);
            }
        }
        return var371;
    }
    
    public static SubLObject f48885(final SubLObject var370) {
        final SubLThread var371 = SubLProcess.currentSubLThread();
        final SubLObject var372 = module0034.$g879$.getDynamicValue(var371);
        SubLObject var373 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var372) {
            return f48886(var370);
        }
        var373 = module0034.f1857(var372, (SubLObject)module0767.$ic221$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var373) {
            var373 = module0034.f1807(module0034.f1842(var372), (SubLObject)module0767.$ic221$, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.NIL, (SubLObject)module0767.EQL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var372, (SubLObject)module0767.$ic221$, var373);
        }
        SubLObject var374 = module0034.f1814(var373, var370, (SubLObject)module0767.$ic23$);
        if (var374 == module0767.$ic23$) {
            var374 = Values.arg2(var371.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48886(var370)));
            module0034.f1816(var373, var370, var374, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var374);
    }
    
    public static SubLObject f48887(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == module0035.find_if_not((SubLObject)module0767.$ic222$, var32, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
    }
    
    public static SubLObject f48888(final SubLObject var28) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == f48889(var28, (SubLObject)module0767.UNPROVIDED));
    }
    
    public static SubLObject f48890() {
        f48791();
        return (SubLObject)module0767.$ic223$;
    }
    
    public static SubLObject f48889(final SubLObject var28, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        return module0004.f104(var28, f48891(var300), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48892() {
        final SubLObject var7 = module0767.$g6139$.getGlobalValue();
        if (module0767.NIL != var7) {
            module0034.f1818(var7);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48893(SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0767.$g6139$.getGlobalValue(), (SubLObject)ConsesLow.list(var300), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48894(final SubLObject var300) {
        return module0260.f17034(module0767.$ic225$, var300, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48891(SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var301 = module0767.$g6139$.getGlobalValue();
        if (module0767.NIL == var301) {
            var301 = module0034.f1934((SubLObject)module0767.$ic224$, (SubLObject)module0767.$ic226$, (SubLObject)module0767.$ic227$, (SubLObject)module0767.EQUAL, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0767.$ic228$);
        }
        SubLObject var302 = module0034.f1814(var301, var300, (SubLObject)module0767.$ic23$);
        if (var302 == module0767.$ic23$) {
            var302 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48894(var300)));
            module0034.f1816(var301, var300, var302, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var302);
    }
    
    public static SubLObject f48895(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        return f48870(var22, (SubLObject)module0767.$ic46$);
    }
    
    public static SubLObject f48896(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        SubLObject var33 = f48874(var32);
        var33 = Sequences.delete(module0767.$ic229$, var33, (SubLObject)module0767.$ic186$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        return f48870(var22, var33);
    }
    
    public static SubLObject f48877(final SubLObject var6, final SubLObject var22) {
        if (module0767.NIL == module0581.f35648(var6)) {
            return (SubLObject)module0767.NIL;
        }
        final SubLObject var23 = module0581.f35658(var6);
        if (module0767.NIL != module0035.f2002(var6, (SubLObject)module0767.ZERO_INTEGER, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != f48897(var6) && module0767.NIL == f48898(var22)) {
            module0581.f35661(var23);
        }
        return var23;
    }
    
    public static SubLObject f48897(final SubLObject var6) {
        if (module0767.NIL != module0751.f46661((SubLObject)module0767.UNPROVIDED)) {
            return module0581.f35662(var6, (SubLObject)module0767.$ic230$);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48898(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        return module0751.f46684(var22, module0767.$ic231$, module0579.$g4262$.getDynamicValue(var23));
    }
    
    public static SubLObject f48864(final SubLObject var301) {
        return Sort.sort(var301, (SubLObject)module0767.$ic233$, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48899(final SubLObject var286, final SubLObject var287) {
        if (module0767.NIL != module0004.f104(var287, module0767.$g6136$.getGlobalValue(), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0004.f104(var286, module0767.$g6136$.getGlobalValue(), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            return (SubLObject)module0767.T;
        }
        if (module0767.NIL != module0004.f104(var286, module0767.$g6136$.getGlobalValue(), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0004.f104(var287, module0767.$g6136$.getGlobalValue(), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            return (SubLObject)module0767.NIL;
        }
        if (module0767.NIL != module0751.f46684(var286, module0767.$ic198$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0751.f46684(var287, module0767.$ic198$, (SubLObject)module0767.UNPROVIDED)) {
            return (SubLObject)module0767.T;
        }
        if (module0767.NIL != module0751.f46684(var287, module0767.$ic198$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0751.f46684(var286, module0767.$ic198$, (SubLObject)module0767.UNPROVIDED)) {
            return (SubLObject)module0767.NIL;
        }
        return module0549.f33911(var287, var286);
    }
    
    public static SubLObject f48900(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0173.f10955(var22) && module0579.$g4260$.getDynamicValue(var33).equal(module0745.f46233((SubLObject)module0767.UNPROVIDED))) {
            var33.resetMultipleValues();
            final SubLObject var35 = module0751.f46992(var22, var32, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var36 = var33.secondMultipleValue();
            final SubLObject var37 = var33.thirdMultipleValue();
            final SubLObject var38 = var33.fourthMultipleValue();
            var33.resetMultipleValues();
            if (module0767.NIL != module0581.f35648(var35)) {
                var34 = (SubLObject)ConsesLow.list(var35, var36, var37, var38);
            }
        }
        return var34;
    }
    
    public static SubLObject f48901(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        if (module0767.NIL == module0212.f13762(var22)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0767.NIL, (SubLObject)module0767.NIL);
        }
        SubLObject var33 = (SubLObject)module0767.NIL;
        SubLObject var34 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var33) {
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var35 = f48869((SubLObject)module0767.UNPROVIDED), var36 = (SubLObject)module0767.NIL, var36 = var35.first(); module0767.NIL == var33 && module0767.NIL != var35; var33 = (SubLObject)((module0767.NIL != var37) ? module0581.f35652(var37) : module0767.NIL), var34 = var36, var35 = var35.rest(), var36 = var35.first()) {
                var37 = module0220.f14556(var22, var36, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
        }
        if (module0767.NIL != module0581.f35648(var33)) {
            var33 = f48877(var33, var22);
        }
        return (SubLObject)ConsesLow.list(var33, var34);
    }
    
    public static SubLObject f48902(final SubLObject var207, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        final SubLObject var208 = f48839(var207);
        return (SubLObject)((module0767.NIL != module0756.f47600(var208) && module0767.NIL != module0035.f1997(var208)) ? var208.first() : module0767.NIL);
    }
    
    public static SubLObject f48903(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0767.NIL;
        SubLObject var35 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0212.f13762(var22)) {
            final SubLObject var36 = module0147.f9540(module0579.$g4260$.getDynamicValue(var33));
            final SubLObject var37 = module0147.$g2095$.currentBinding(var33);
            final SubLObject var38 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var39 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2095$.bind(module0147.f9545(var36), var33);
                module0147.$g2094$.bind(module0147.f9546(var36), var33);
                module0147.$g2096$.bind(module0147.f9549(var36), var33);
                var34 = module0220.f14553(var22, module0767.$ic234$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var39, var33);
                module0147.$g2094$.rebind(var38, var33);
                module0147.$g2095$.rebind(var37, var33);
            }
            if (module0767.NIL != module0038.f2653(var34) && module0767.NIL != module0751.f46997(var34, var22)) {
                var34 = f48877(var34, var22);
                var35 = module0749.f46446(var34, module0751.f46705(), var22, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                module0749.f46472(var35, module0767.$ic234$);
                if (module0579.$g4259$.getDynamicValue(var33) == module0767.$ic13$) {
                    module0769.f49041(var35);
                }
            }
        }
        return var35;
    }
    
    public static SubLObject f48904(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0767.NIL == module0212.f13762(var22)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0767.NIL, (SubLObject)module0767.NIL);
        }
        final SubLObject var34 = (SubLObject)module0767.$ic235$;
        SubLObject var35 = (SubLObject)module0767.NIL;
        SubLObject var36 = (SubLObject)module0767.NIL;
        SubLObject var37 = var34;
        SubLObject var38 = (SubLObject)module0767.NIL;
        var38 = var37.first();
        while (module0767.NIL != var37) {
            if (module0767.NIL != module0128.f8463(var38, (SubLObject)module0767.UNPROVIDED)) {
                final SubLObject var39 = module0147.$g2094$.currentBinding(var33);
                final SubLObject var40 = module0147.$g2095$.currentBinding(var33);
                try {
                    module0147.$g2094$.bind((SubLObject)module0767.$ic25$, var33);
                    module0147.$g2095$.bind(module0767.$ic26$, var33);
                    SubLObject var41 = (SubLObject)module0767.NIL;
                    final SubLObject var42 = var38;
                    if (module0767.NIL != module0158.f10010(var22, (SubLObject)module0767.ONE_INTEGER, var42)) {
                        final SubLObject var43 = module0158.f10011(var22, (SubLObject)module0767.ONE_INTEGER, var42);
                        SubLObject var44 = (SubLObject)module0767.NIL;
                        final SubLObject var45 = (SubLObject)module0767.NIL;
                        while (module0767.NIL == var44) {
                            final SubLObject var46 = module0052.f3695(var43, var45);
                            final SubLObject var47 = (SubLObject)SubLObjectFactory.makeBoolean(!var45.eql(var46));
                            if (module0767.NIL != var47) {
                                SubLObject var48 = (SubLObject)module0767.NIL;
                                try {
                                    var48 = module0158.f10316(var46, (SubLObject)module0767.$ic236$, (SubLObject)module0767.NIL, (SubLObject)module0767.NIL);
                                    SubLObject var386_391 = (SubLObject)module0767.NIL;
                                    final SubLObject var387_392 = (SubLObject)module0767.NIL;
                                    while (module0767.NIL == var386_391) {
                                        final SubLObject var49 = module0052.f3695(var48, var387_392);
                                        final SubLObject var389_394 = (SubLObject)SubLObjectFactory.makeBoolean(!var387_392.eql(var49));
                                        if (module0767.NIL != var389_394) {
                                            var41 = module0178.f11331(var49, (SubLObject)module0767.TWO_INTEGER);
                                            final SubLObject var50 = (SubLObject)ConsesLow.list(var41, var38);
                                            if (module0767.NIL == var35) {
                                                var35 = var50;
                                            }
                                            else {
                                                final SubLObject var51 = var50;
                                                if (module0767.NIL == conses_high.member(var51, var36, Symbols.symbol_function((SubLObject)module0767.EQUAL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                                                    var36 = (SubLObject)ConsesLow.cons(var51, var36);
                                                }
                                            }
                                        }
                                        var386_391 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == var389_394);
                                    }
                                }
                                finally {
                                    final SubLObject var9_396 = Threads.$is_thread_performing_cleanupP$.currentBinding(var33);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0767.T, var33);
                                        if (module0767.NIL != var48) {
                                            module0158.f10319(var48);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var9_396, var33);
                                    }
                                }
                            }
                            var44 = (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL == var47);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var40, var33);
                    module0147.$g2094$.rebind(var39, var33);
                }
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return Values.values(var35, var36);
    }
    
    public static SubLObject f48905(final SubLObject var397, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        final SubLThread var398 = SubLProcess.currentSubLThread();
        SubLObject var399 = (SubLObject)module0767.NIL;
        SubLObject var400 = (SubLObject)module0767.NIL;
        final SubLObject var401 = module0749.f46494((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        module0756.f47465(var401, var397);
        module0756.f47784(var401, var32, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var402 = module0579.$g4246$.currentBinding(var398);
        try {
            module0579.$g4246$.bind((SubLObject)module0767.$ic237$, var398);
            f48906(var401);
        }
        finally {
            module0579.$g4246$.rebind(var402, var398);
        }
        if (module0767.NIL != module0756.f47479(var401)) {
            final SubLObject var403 = (SubLObject)module0767.NIL;
            var399 = module0756.f47480(var401, var403);
            var400 = module0756.f47691(var401);
        }
        return (SubLObject)ConsesLow.list(var399, var400);
    }
    
    public static SubLObject f48787(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)((module0767.NIL != module0751.f46605() || module0767.NIL == module0579.$g4255$.getDynamicValue(var3)) ? module0767.$ic117$ : module0767.$ic119$);
        final SubLObject var5 = module0579.$g4287$.currentBinding(var3);
        try {
            module0579.$g4287$.bind((SubLObject)module0767.ZERO_INTEGER, var3);
            f48907(var2, var4);
        }
        finally {
            module0579.$g4287$.rebind(var5, var3);
        }
        return var2;
    }
    
    public static SubLObject f48786(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0767.NIL != module0579.$g4255$.getDynamicValue(var3) && module0767.NIL != module0751.f46605()) {
            final SubLObject var4 = (SubLObject)module0767.$ic119$;
            f48907(var2, var4);
        }
        return var2;
    }
    
    public static SubLObject f48785(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0579.$g4287$.currentBinding(var3);
        try {
            module0579.$g4287$.bind(module0580.f35610((SubLObject)module0767.TWO_INTEGER), var3);
            f48784(var2);
        }
        finally {
            module0579.$g4287$.rebind(var4, var3);
        }
        return var2;
    }
    
    public static SubLObject f48908(final SubLObject var288) {
        if (var288.eql((SubLObject)module0767.$ic117$)) {
            return (SubLObject)module0767.$ic237$;
        }
        if (var288.eql((SubLObject)module0767.$ic119$)) {
            return (SubLObject)module0767.NIL;
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48907(final SubLObject var2, final SubLObject var288) {
        final SubLThread var289 = SubLProcess.currentSubLThread();
        final SubLObject var290 = module0756.f47483(var2);
        final SubLObject var291 = f48852(var2, (SubLObject)module0767.UNPROVIDED);
        SubLObject var292 = f48908(var288);
        var292 = ConsesLow.append(var292, module0579.$g4246$.getDynamicValue(var289));
        if (module0767.NIL == module0579.$g4307$.getDynamicValue(var289)) {
            final SubLObject var293 = (SubLObject)module0767.$ic175$;
            if (module0767.NIL == conses_high.member(var293, var292, Symbols.symbol_function((SubLObject)module0767.EQ), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                var292 = (SubLObject)ConsesLow.cons(var293, var292);
            }
        }
        if (module0767.NIL != var291) {
            module0756.f47784(var2, var291, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var294 = module0579.$g4246$.currentBinding(var289);
            try {
                module0579.$g4246$.bind(var292, var289);
                final SubLObject var295 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
                final SubLObject var296 = module0756.f47711(var2);
                final SubLObject var297 = module0756.f47488(var2, (SubLObject)module0767.UNPROVIDED);
                SubLObject var298 = (SubLObject)module0767.NIL;
                final SubLObject var299 = (SubLObject)ConsesLow.cons(var295, module0220.f14562(var295, module0767.$ic239$, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic145$));
                SubLObject var300 = (SubLObject)module0767.NIL;
                if (module0767.NIL == var300) {
                    SubLObject var301 = var299;
                    SubLObject var302 = (SubLObject)module0767.NIL;
                    var302 = var301.first();
                    while (module0767.NIL == var300 && module0767.NIL != var301) {
                        var298 = f48860(var302, var297, var288, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                        if (module0767.NIL != module0756.f47466(var298)) {
                            module0756.f47501(var2, var298, (SubLObject)module0767.UNPROVIDED);
                            module0756.f47468(var2, var295);
                            module0756.f47469(var2, var296);
                            module0756.f47608(var2);
                            var300 = (SubLObject)module0767.T;
                        }
                        var301 = var301.rest();
                        var302 = var301.first();
                    }
                }
                if (module0767.NIL == module0756.f47479(var2)) {
                    if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic240$, new SubLObject[] { var288, var297, var295 });
                    }
                    module0756.f47485(var2, var290);
                    if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic241$);
                    }
                }
                else if (module0767.NIL != module0035.f1997(var298)) {
                    final SubLObject var303 = var298.first();
                    final SubLObject var304 = module0749.f46470(var303);
                    module0749.f46464(var303, var296);
                    if (module0767.NIL != var304) {
                        module0756.f47783(var2, var304, (SubLObject)module0767.UNPROVIDED);
                    }
                    module0756.f47715(var2);
                }
                else {
                    module0756.f47709(var2, var296, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                    module0756.f47715(var2);
                }
            }
            finally {
                module0579.$g4246$.rebind(var294, var289);
            }
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48784(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = module0172.f10915(var4);
        final SubLObject var6 = module0751.f47211(module0756.f47511(var2));
        final SubLObject var7 = module0579.$g4259$.currentBinding(var3);
        try {
            module0579.$g4259$.bind((SubLObject)((module0767.NIL != module0579.$g4307$.getDynamicValue(var3)) ? module0767.$ic17$ : module0579.$g4259$.getDynamicValue(var3)), var3);
            final SubLObject var8 = (SubLObject)((module0767.NIL != module0751.f46605()) ? module0767.NIL : module0751.f46599());
            module0756.f47465(var2, var5);
            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic242$, var5, module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED));
            }
            final SubLObject var9_409 = module0579.$g4254$.currentBinding(var3);
            try {
                module0579.$g4254$.bind(var8, var3);
                module0770.f49065(var2, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0579.$g4254$.rebind(var9_409, var3);
            }
            f48909(var2);
            module0756.f47465(var2, var4);
            if (module0767.NIL != module0756.f47479(var2)) {
                if (module0767.NIL == module0756.f47510(var2) && module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic243$, module0756.f47480(var2, (SubLObject)module0767.NIL), var5);
                }
            }
        }
        finally {
            module0579.$g4259$.rebind(var7, var3);
        }
        if (module0767.NIL == module0756.f47479(var2) && module0767.NIL == module0579.f35496(module0756.f47627(var2), (SubLObject)module0767.UNPROVIDED)) {
            module0756.f47723(var2, module0764.f48445(var4, (SubLObject)module0767.$ic46$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
        }
        if (module0767.NIL != module0579.$g4307$.getDynamicValue(var3)) {
            module0756.f47709(var2, var6, (SubLObject)module0767.NIL, (SubLObject)module0767.NIL, module0756.f47691(var2));
            module0756.f47468(var2, var4);
        }
        module0756.f47715(var2);
        module0756.f47465(var2, var4);
        module0758.f47890(var2);
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48909(final SubLObject var2) {
        if (module0767.NIL != module0756.f47479(var2) && module0767.NIL != module0206.f13453(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED))) {
            final SubLObject var3 = module0756.f47510(var2);
            final SubLObject var4 = module0205.f13276(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED));
            SubLObject var5 = (SubLObject)module0767.NIL;
            if (module0767.NIL == var5) {
                SubLObject var6 = var3;
                SubLObject var7 = (SubLObject)module0767.NIL;
                var7 = var6.first();
                while (module0767.NIL == var5 && module0767.NIL != var6) {
                    if (module0767.NIL != f48910(var7, var4, (SubLObject)module0767.UNPROVIDED)) {
                        var5 = (SubLObject)module0767.T;
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
            if (module0767.NIL != var5) {
                module0756.f47630(var2, (SubLObject)module0767.MINUS_ONE_INTEGER, (SubLObject)module0767.$ic244$);
            }
        }
        return module0756.f47627(var2);
    }
    
    public static SubLObject f48911(final SubLObject var411, final SubLObject var176, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var412 = SubLProcess.currentSubLThread();
        final SubLObject var413 = module0147.f9540(var300);
        final SubLObject var414 = module0147.$g2095$.currentBinding(var412);
        final SubLObject var415 = module0147.$g2094$.currentBinding(var412);
        final SubLObject var416 = module0147.$g2096$.currentBinding(var412);
        try {
            module0147.$g2095$.bind(module0147.f9545(var413), var412);
            module0147.$g2094$.bind(module0147.f9546(var413), var412);
            module0147.$g2096$.bind(module0147.f9549(var413), var412);
            if (module0767.NIL == module0174.f11035(var411)) {
                return (SubLObject)module0767.NIL;
            }
            if (module0767.NIL == module0178.f11284(var411)) {
                return (SubLObject)module0767.NIL;
            }
            if (module0178.f11332(var411).eql(module0767.$ic247$) && module0178.f11334(var411).eql(var176)) {
                return (SubLObject)module0767.T;
            }
            if (module0178.f11332(var411).eql(module0767.$ic248$) && module0767.NIL == module0220.f14548(var176, module0767.$ic247$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                return (SubLObject)module0767.T;
            }
            return (SubLObject)module0767.NIL;
        }
        finally {
            module0147.$g2096$.rebind(var416, var412);
            module0147.$g2094$.rebind(var415, var412);
            module0147.$g2095$.rebind(var414, var412);
        }
    }
    
    public static SubLObject f48910(final SubLObject var411, final SubLObject var176, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var412 = SubLProcess.currentSubLThread();
        final SubLObject var413 = module0034.$g879$.getDynamicValue(var412);
        SubLObject var414 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var413) {
            return f48911(var411, var176, var300);
        }
        var414 = module0034.f1857(var413, (SubLObject)module0767.$ic245$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var414) {
            var414 = module0034.f1807(module0034.f1842(var413), (SubLObject)module0767.$ic245$, (SubLObject)module0767.THREE_INTEGER, (SubLObject)module0767.NIL, (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var413, (SubLObject)module0767.$ic245$, var414);
        }
        final SubLObject var415 = module0034.f1781(var411, var176, var300);
        final SubLObject var416 = module0034.f1814(var414, var415, (SubLObject)module0767.UNPROVIDED);
        if (var416 != module0767.$ic23$) {
            SubLObject var417 = var416;
            SubLObject var418 = (SubLObject)module0767.NIL;
            var418 = var417.first();
            while (module0767.NIL != var417) {
                SubLObject var419 = var418.first();
                final SubLObject var420 = conses_high.second(var418);
                if (var411.equal(var419.first())) {
                    var419 = var419.rest();
                    if (var176.equal(var419.first())) {
                        var419 = var419.rest();
                        if (module0767.NIL != var419 && module0767.NIL == var419.rest() && var300.equal(var419.first())) {
                            return module0034.f1959(var420);
                        }
                    }
                }
                var417 = var417.rest();
                var418 = var417.first();
            }
        }
        final SubLObject var421 = Values.arg2(var412.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48911(var411, var176, var300)));
        module0034.f1836(var414, var415, var416, var421, (SubLObject)ConsesLow.list(var411, var176, var300));
        return module0034.f1959(var421);
    }
    
    public static SubLObject f48912(final SubLObject var2) {
        final SubLObject var3 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var4 = module0612.f37514(var3);
        final SubLObject var5 = module0756.f47463(var4, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        module0770.f49065(var5, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var6 = module0756.f47480(var5, (SubLObject)module0767.UNPROVIDED);
        module0756.f47723(var2, var6);
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48913(final SubLObject var2) {
        final SubLObject var3 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var4 = print_high.princ_to_string(var3);
        final SubLObject var5 = module0038.f2623(var4, (SubLObject)module0767.ZERO_INTEGER, (SubLObject)module0767.FOUR_INTEGER);
        final SubLObject var6 = module0038.f2623(var4, (SubLObject)module0767.FOUR_INTEGER, (SubLObject)module0767.SIX_INTEGER);
        final SubLObject var7 = module0038.f2623(var4, (SubLObject)module0767.SIX_INTEGER, (SubLObject)module0767.EIGHT_INTEGER);
        module0756.f47723(var2, Sequences.cconcatenate(var6, new SubLObject[] { module0767.$ic21$, var7, module0767.$ic21$, var5 }));
        return var2;
    }
    
    public static SubLObject f48914(final SubLObject var2, SubLObject var288) {
        if (var288 == module0767.UNPROVIDED) {
            var288 = (SubLObject)module0767.$ic254$;
        }
        SubLObject var289 = module0051.f3634(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED));
        final SubLObject var290 = var288;
        if (var290.eql((SubLObject)module0767.$ic255$)) {
            var289 = module0038.f2621(var289, (SubLObject)module0767.$ic256$, (SubLObject)module0767.UNPROVIDED);
        }
        module0756.f47723(var2, var289);
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48915(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = f48916(var4, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var6 = (SubLObject)module0767.TEN_INTEGER;
        if (module0579.$g4290$.getDynamicValue(var3).isInteger() && Numbers.round(var4, (SubLObject)module0767.UNPROVIDED).numE(var4) && (var4.isZero() || Numbers.log(Numbers.abs(var4), (SubLObject)module0767.TEN_INTEGER).numLE(var6))) {
            module0756.f47723(var2, f48917(Numbers.round(var4, (SubLObject)module0767.UNPROVIDED)));
        }
        else if (module0767.NIL != module0038.f2673(var5, (SubLObject)module0767.$ic259$, (SubLObject)module0767.UNPROVIDED) || module0767.NIL == Sequences.find_if((SubLObject)module0767.$ic260$, var5, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            final SubLObject var7 = module0038.f2621(var5, (SubLObject)module0767.$ic259$, (SubLObject)module0767.UNPROVIDED);
            module0756.f47723(var2, var7);
        }
        else if (module0767.NIL != module0579.$g4275$.getDynamicValue(var3) && module0579.$g4259$.getDynamicValue(var3) == module0767.$ic13$) {
            final SubLObject var8 = module0756.f47711(var2);
            var3.resetMultipleValues();
            final SubLObject var9 = f48918(var4, var5, var8);
            final SubLObject var10 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            module0756.f47501(var2, (SubLObject)ConsesLow.list(var9, var10), (SubLObject)module0767.UNPROVIDED);
            module0756.f47608(var2);
        }
        else {
            module0756.f47723(var2, var5);
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48918(final SubLObject var420, final SubLObject var421, final SubLObject var49) {
        final SubLObject var422 = Sequences.position_if((SubLObject)module0767.$ic260$, var421, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var423 = module0581.f35672((SubLObject)ConsesLow.list(module0038.f2621(module0038.f2623(var421, (SubLObject)module0767.ZERO_INTEGER, var422), (SubLObject)module0767.$ic261$, (SubLObject)module0767.UNPROVIDED), module0758.f47958(module0767.$ic262$), (SubLObject)module0767.$ic263$));
        final SubLObject var424 = module0749.f46446(var423, var49, var420, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var425 = module0038.f2674(module0038.f2623(var421, module0048.f_1X(var422), (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.$ic264$, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var426 = module0749.f46446(var425, var49, var420, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        module0769.f49042(var426);
        return Values.values(var424, var426);
    }
    
    public static SubLObject f48916(final SubLObject var420, SubLObject var429) {
        if (var429 == module0767.UNPROVIDED) {
            var429 = module0579.$g4291$.getDynamicValue();
        }
        final SubLObject var430 = (module0767.NIL != module0004.f105(var429)) ? module0048.f3302(var420, var429) : var420;
        final SubLObject var431 = Strings.string_upcase(module0038.f2699((SubLObject)module0767.$ic265$, (SubLObject)module0767.$ic266$, module0038.f2638(var430), Symbols.symbol_function((SubLObject)module0767.EQUALP)), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        return var431;
    }
    
    public static SubLObject f48917(final SubLObject var431) {
        final SubLThread var432 = SubLProcess.currentSubLThread();
        final SubLObject var433 = Sequences.reverse(module0038.f2638(var431));
        SubLObject var434 = (SubLObject)module0767.NIL;
        if (!module0579.$g4290$.getDynamicValue(var432).isInteger() || module0767.NIL == module0035.f2002(var433, module0579.$g4290$.getDynamicValue(var432), (SubLObject)module0767.UNPROVIDED)) {
            return print_high.princ_to_string(var431);
        }
        final SubLObject var435 = var433;
        SubLObject var435_436;
        SubLObject var436;
        SubLObject var437;
        SubLObject var438;
        for (var436 = (var435_436 = Sequences.length(var435)), var437 = (SubLObject)module0767.NIL, var437 = (SubLObject)module0767.ZERO_INTEGER; !var437.numGE(var435_436); var437 = module0048.f_1X(var437)) {
            var438 = Strings.sublisp_char(var435, var437);
            var434 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)module0767.ONE_INTEGER, var438), var434);
            if (module0767.NIL != module0035.f2000(var433, Numbers.add((SubLObject)module0767.TWO_INTEGER, var437), (SubLObject)module0767.UNPROVIDED) && Numbers.rem(Numbers.add((SubLObject)module0767.ONE_INTEGER, var437), (SubLObject)module0767.THREE_INTEGER).isZero()) {
                var434 = (SubLObject)ConsesLow.cons((SubLObject)module0767.$ic91$, var434);
            }
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)module0767.$ic267$), var434);
    }
    
    public static SubLObject f48919(final SubLObject var431) {
        assert module0767.NIL != Types.integerp(var431) : var431;
        SubLObject var432 = (SubLObject)module0767.NIL;
        if (var431.numL((SubLObject)module0767.$ic271$)) {
            if (var431.numL((SubLObject)module0767.ZERO_INTEGER)) {
                return (SubLObject)module0767.NIL;
            }
            if (var431.numG((SubLObject)module0767.TWENTY_INTEGER) && Numbers.mod(var431, (SubLObject)module0767.TEN_INTEGER).isPositive()) {
                final SubLObject var433 = Numbers.subtract(var431, Numbers.mod(var431, (SubLObject)module0767.TEN_INTEGER));
                final SubLObject var434 = f48919(var433);
                if (module0767.NIL != var434) {
                    var432 = Sequences.cconcatenate(var434, new SubLObject[] { module0767.$ic272$, f48919(Numbers.mod(var431, (SubLObject)module0767.TEN_INTEGER)) });
                }
            }
            else if (var431.numL((SubLObject)module0767.TWENTY_INTEGER)) {
                var432 = ConsesLow.nth(var431, module0767.$g6140$.getGlobalValue());
            }
            else {
                var432 = conses_high.assoc(var431, module0767.$g6141$.getGlobalValue(), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED).rest();
            }
        }
        return var432;
    }
    
    public static SubLObject f48920(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = (module0767.NIL != module0004.f105(module0579.$g4291$.getDynamicValue(var3))) ? module0048.f3302(var4, module0579.$g4291$.getDynamicValue(var3)) : var4;
        SubLObject var6 = (SubLObject)module0767.NIL;
        if (module0767.NIL != f48921(var2)) {
            var6 = module0765.f48539(var4);
        }
        else if (var4.isInteger()) {
            if (var4.numL((SubLObject)module0767.$ic271$) && module0767.NIL != module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0751.f46640(module0751.f47113(module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED), (SubLObject)module0767.UNPROVIDED), module0767.$ic51$, (SubLObject)module0767.UNPROVIDED)) {
                var6 = f48919(var5);
            }
            else if (module0579.$g4290$.getDynamicValue(var3).isInteger()) {
                var6 = f48917(var5);
            }
        }
        if (module0767.NIL != var6) {
            module0756.f47723(var2, var6);
            if (module0767.NIL == module0751.f46997(var6, var4)) {
                final SubLObject var7 = module0756.f47467(var2);
                if (module0767.NIL != module0035.f1997(var7)) {
                    module0753.f47267(var7.first(), (SubLObject)module0767.$ic46$);
                }
                else if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0767.$ic275$, var7);
                }
            }
        }
        return var2;
    }
    
    public static SubLObject f48921(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != module0048.f3293(module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED)) && module0767.NIL != module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0751.f46640(module0756.f47481(var2, (SubLObject)module0767.UNPROVIDED), module0767.$ic276$, (SubLObject)module0767.UNPROVIDED));
    }
    
    public static SubLObject f48922(final SubLObject var443) {
        return module0434.f30578((SubLObject)module0767.$ic277$, (SubLObject)ConsesLow.listS(module0767.$ic278$, var443, (SubLObject)module0767.$ic279$), module0767.$ic16$, (SubLObject)module0767.$ic280$).first();
    }
    
    public static SubLObject f48923(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = f48922(var4);
        final SubLObject var6 = PrintLow.format((SubLObject)module0767.NIL, (SubLObject)module0767.$ic283$, var5);
        if (module0767.$ic13$ == module0579.$g4259$.getDynamicValue(var3)) {
            module0756.f47725(var2, var6, (SubLObject)module0767.NIL);
            module0756.f47723(var2, (SubLObject)module0767.$ic284$);
        }
        else {
            module0756.f47723(var2, var5);
        }
        return var2;
    }
    
    public static SubLObject f48924(final SubLObject var2) {
        final SubLObject var3 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var4 = f48925(var3);
        module0756.f47715(var2);
        module0756.f47723(var2, var4);
        return var2;
    }
    
    public static SubLObject f48925(final SubLObject var5) {
        return print_high.princ_to_string(var5);
    }
    
    public static SubLObject f48926() {
        if (module0767.NIL == module0767.$g6142$.getGlobalValue() && module0767.NIL != module0018.f971()) {
            module0767.$g6142$.setGlobalValue(module0767.$ic289$);
        }
        return module0767.$g6142$.getGlobalValue();
    }
    
    public static SubLObject f48927(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = module0751.f46613(var4);
        final SubLObject var6 = module0205.f13132(var5);
        final SubLObject var7 = module0178.f11287(var4);
        final SubLObject var8 = f48928(var4, var6);
        if (module0767.NIL != var8) {
            module0756.f47723(var2, var8);
            return var2;
        }
        module0756.f47465(var2, var5);
        final SubLObject var9 = f48929(var4);
        if (module0767.NIL != var9 && (!f48926().eql(var9) || module0767.NIL != module0579.$g4257$.getDynamicValue(var3))) {
            final SubLObject var10 = (SubLObject)ConsesLow.listS(module0767.$ic292$, (SubLObject)ConsesLow.list(module0767.$ic293$, var9), (SubLObject)module0767.$ic294$);
            module0756.f47745(var2, var10);
        }
        final SubLObject var11 = module0580.f35634(var2);
        try {
            final SubLObject var12 = module0579.$g4262$.currentBinding(var3);
            try {
                module0579.$g4262$.bind(module0751.f46998((SubLObject)ConsesLow.list(module0767.$ic214$, var7, module0579.$g4262$.getDynamicValue(var3))), var3);
                module0770.f49065(var2, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0579.$g4262$.rebind(var12, var3);
            }
        }
        finally {
            final SubLObject var13 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0767.T, var3);
                module0580.f35635(var2, var11, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var13, var3);
            }
        }
        module0756.f47465(var2, var4);
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48929(final SubLObject var446) {
        final SubLThread var447 = SubLProcess.currentSubLThread();
        final SubLObject var448 = module0178.f11287(var446);
        SubLObject var449 = f48930(var448);
        if (module0767.NIL != module0767.$g6143$.getDynamicValue(var447)) {
            if (module0767.NIL != f48931(var446, var449)) {
                var449 = (SubLObject)module0767.NIL;
            }
            var447.resetMultipleValues();
            SubLObject var450 = module0337.f22630(var449, (SubLObject)module0767.$ic295$);
            SubLObject var451 = var447.secondMultipleValue();
            var447.resetMultipleValues();
            if (module0767.NIL != var450) {
                final SubLObject var452 = module0035.f2294(var451, (SubLObject)module0767.$ic296$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                final SubLObject var453 = module0035.f2294(var451, (SubLObject)module0767.$ic297$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                if (module0767.NIL != f48932(var446, var452)) {
                    var449 = (SubLObject)ConsesLow.list(module0767.$ic298$, var453);
                }
                else if (module0767.NIL != f48932(var446, var453)) {
                    var449 = (SubLObject)ConsesLow.list(module0767.$ic299$, var452);
                }
            }
            var447.resetMultipleValues();
            var450 = module0337.f22630(var449, (SubLObject)module0767.$ic300$);
            var451 = var447.secondMultipleValue();
            var447.resetMultipleValues();
            if (module0767.NIL != var450) {
                final SubLObject var454 = module0035.f2294(var451, (SubLObject)module0767.$ic301$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                final SubLObject var455 = module0035.f2294(var451, (SubLObject)module0767.$ic296$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                final SubLObject var456 = module0035.f2294(var451, (SubLObject)module0767.$ic297$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                if (module0767.NIL != f48932(var446, var455)) {
                    var449 = (SubLObject)ConsesLow.list(module0767.$ic302$, (SubLObject)ConsesLow.list(module0767.$ic303$, var456), var454);
                }
                else if (module0767.NIL != f48932(var446, var456)) {
                    var449 = (SubLObject)ConsesLow.list(module0767.$ic302$, (SubLObject)ConsesLow.list(module0767.$ic304$, var455), var454);
                }
            }
        }
        return var449;
    }
    
    public static SubLObject f48931(final SubLObject var446, final SubLObject var449) {
        final SubLThread var450 = SubLProcess.currentSubLThread();
        SubLObject var451 = (SubLObject)module0767.NIL;
        var450.resetMultipleValues();
        final SubLObject var452 = module0337.f22630(var449, (SubLObject)module0767.$ic305$);
        final SubLObject var453 = var450.secondMultipleValue();
        var450.resetMultipleValues();
        if (module0767.NIL != var452) {
            final SubLObject var454 = module0035.f2294(var453, (SubLObject)module0767.$ic306$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != f48932(var446, var454)) {
                var451 = (SubLObject)module0767.T;
            }
        }
        return var451;
    }
    
    public static SubLObject f48932(final SubLObject var446, final SubLObject var416) {
        SubLObject var447 = (SubLObject)module0767.NIL;
        if (module0767.NIL == f48933(var416)) {
            var447 = (SubLObject)module0767.T;
        }
        else if (module0767.NIL != module0004.f104(module0612.f37536(var416), f48934(var446), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            var447 = (SubLObject)module0767.T;
        }
        return var447;
    }
    
    public static SubLObject f48933(final SubLObject var408) {
        final SubLThread var409 = SubLProcess.currentSubLThread();
        SubLObject var410 = (SubLObject)module0767.NIL;
        final SubLObject var411 = module0147.$g2094$.currentBinding(var409);
        final SubLObject var412 = module0147.$g2095$.currentBinding(var409);
        try {
            module0147.$g2094$.bind((SubLObject)module0767.$ic25$, var409);
            module0147.$g2095$.bind(module0767.$ic26$, var409);
            SubLObject var413 = module0205.f13183(var408, (SubLObject)module0767.$ic307$, (SubLObject)module0767.NIL, Symbols.symbol_function((SubLObject)module0767.EQUAL), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != module0212.f13762((SubLObject)module0767.NIL)) {
                var413 = (SubLObject)ConsesLow.cons((SubLObject)module0767.NIL, var413);
            }
            SubLObject var414;
            SubLObject var415;
            for (var414 = (SubLObject)module0767.NIL, var414 = module0218.f14453(var413, (SubLObject)module0767.UNPROVIDED); module0767.NIL == var410 && module0767.NIL != var414; var414 = var414.rest()) {
                var415 = var414.first();
                if (module0767.NIL != module0202.f12962(var408, module0178.f11303(var415))) {
                    var410 = (SubLObject)module0767.T;
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var412, var409);
            module0147.$g2094$.rebind(var411, var409);
        }
        return var410;
    }
    
    public static SubLObject f48935(final SubLObject var411) {
        return f48936(var411, (SubLObject)module0767.NIL);
    }
    
    public static SubLObject f48934(final SubLObject var411) {
        final SubLThread var412 = SubLProcess.currentSubLThread();
        final SubLObject var413 = module0034.$g879$.getDynamicValue(var412);
        SubLObject var414 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var413) {
            return f48935(var411);
        }
        var414 = module0034.f1857(var413, (SubLObject)module0767.$ic308$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var414) {
            var414 = module0034.f1807(module0034.f1842(var413), (SubLObject)module0767.$ic308$, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.NIL, (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var413, (SubLObject)module0767.$ic308$, var414);
        }
        SubLObject var415 = module0034.f1814(var414, var411, (SubLObject)module0767.$ic23$);
        if (var415 == module0767.$ic23$) {
            var415 = Values.arg2(var412.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48935(var411)));
            module0034.f1816(var414, var411, var415, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var415);
    }
    
    public static SubLObject f48936(final SubLObject var411, SubLObject var458) {
        SubLObject var459 = (SubLObject)module0767.NIL;
        if (module0767.NIL == module0077.f5302(var458) || module0767.NIL == module0077.f5320(var411, var458)) {
            if (module0767.NIL != module0077.f5302(var458)) {
                module0077.f5326(var411, var458);
            }
            if (module0767.NIL != module0174.f11035(var411)) {
                final SubLObject var460 = module0178.f11296(var411);
                if (module0767.NIL == conses_high.member(var460, var459, Symbols.symbol_function((SubLObject)module0767.EQL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                    var459 = (SubLObject)ConsesLow.cons(var460, var459);
                }
            }
            if (module0767.NIL == module0174.f11035(var411) || module0767.NIL != module0178.f11376(var411)) {
                SubLObject var461 = module0775.f49824(var411);
                SubLObject var462 = (SubLObject)module0767.NIL;
                var462 = var461.first();
                while (module0767.NIL != var461) {
                    if (module0767.NIL == module0077.f5302(var458)) {
                        var458 = module0077.f5313(Symbols.symbol_function((SubLObject)module0767.EQUAL), (SubLObject)module0767.UNPROVIDED);
                        module0077.f5326(var411, var458);
                    }
                    SubLObject var40_461 = f48936(var462, var458);
                    SubLObject var463 = (SubLObject)module0767.NIL;
                    var463 = var40_461.first();
                    while (module0767.NIL != var40_461) {
                        final SubLObject var464 = var463;
                        if (module0767.NIL == conses_high.member(var464, var459, Symbols.symbol_function((SubLObject)module0767.EQL), Symbols.symbol_function((SubLObject)module0767.IDENTITY))) {
                            var459 = (SubLObject)ConsesLow.cons(var464, var459);
                        }
                        var40_461 = var40_461.rest();
                        var463 = var40_461.first();
                    }
                    var461 = var461.rest();
                    var462 = var461.first();
                }
            }
        }
        return Sequences.delete((SubLObject)module0767.NIL, var459, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48930(final SubLObject var300) {
        final SubLThread var301 = SubLProcess.currentSubLThread();
        SubLObject var302 = f48926();
        final SubLObject var303 = module0161.f10576(var300);
        SubLObject var304 = (SubLObject)module0767.NIL;
        SubLObject var305 = (SubLObject)module0767.NIL;
        var301.resetMultipleValues();
        final SubLObject var465_466 = module0161.f10612(var300, (SubLObject)module0767.NIL, (SubLObject)module0767.NIL);
        final SubLObject var467_468 = var301.secondMultipleValue();
        var301.resetMultipleValues();
        var304 = var465_466;
        var305 = var467_468;
        if (module0767.NIL != var304) {
            var302 = var304;
        }
        if (module0767.NIL != module0222.f14640(module0767.$ic309$, var300, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.UNPROVIDED)) {
            final SubLObject var306 = module0751.f46781((SubLObject)module0767.$ic310$, (SubLObject)ConsesLow.list(module0767.$ic311$, (SubLObject)ConsesLow.listS(module0767.$ic309$, var300, (SubLObject)module0767.$ic312$)), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != var306) {
                var302 = var306.first();
            }
        }
        return (module0767.NIL != f48937(var303)) ? f48938(var302) : var302;
    }
    
    public static SubLObject f48937(final SubLObject var463) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != var463 && module0767.NIL != module0751.f47007(var463, module0767.$ic313$) && module0767.NIL != module0751.f47007(module0767.$ic314$, var463));
    }
    
    public static SubLObject f48938(final SubLObject var470) {
        final SubLThread var471 = SubLProcess.currentSubLThread();
        SubLObject var472 = var470;
        if (module0767.NIL != module0612.f37382(var470)) {
            var472 = f48939(var470, (SubLObject)module0767.$ic324$);
        }
        var471.resetMultipleValues();
        SubLObject var473 = module0337.f22630(var470, (SubLObject)module0767.$ic295$);
        SubLObject var474 = var471.secondMultipleValue();
        var471.resetMultipleValues();
        if (module0767.NIL != var473) {
            final SubLObject var475 = module0035.f2294(var474, (SubLObject)module0767.$ic296$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var476 = module0035.f2294(var474, (SubLObject)module0767.$ic297$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            SubLObject var477 = f48939(var476, (SubLObject)module0767.$ic324$);
            SubLObject var478 = f48939(var475, (SubLObject)module0767.$ic324$);
            if (module0767.NIL == module0751.f46848((SubLObject)ConsesLow.list(module0767.$ic325$, var478, var477), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                var477 = var476;
                var478 = var475;
            }
            var472 = (SubLObject)ConsesLow.list(module0767.$ic326$, var477, var478);
        }
        var471.resetMultipleValues();
        var473 = module0337.f22630(var470, (SubLObject)module0767.$ic327$);
        var474 = var471.secondMultipleValue();
        var471.resetMultipleValues();
        if (module0767.NIL != var473) {
            final SubLObject var475 = module0035.f2294(var474, (SubLObject)module0767.$ic296$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var479 = f48939(var475, (SubLObject)module0767.$ic328$);
            var472 = module0202.f12820((SubLObject)module0767.$ic329$, var479, var472);
        }
        var471.resetMultipleValues();
        var473 = module0337.f22630(var470, (SubLObject)module0767.$ic300$);
        var474 = var471.secondMultipleValue();
        var471.resetMultipleValues();
        if (module0767.NIL != var473) {
            final SubLObject var480 = module0035.f2294(var474, (SubLObject)module0767.$ic301$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var481 = module0035.f2294(var474, (SubLObject)module0767.$ic296$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var482 = module0035.f2294(var474, (SubLObject)module0767.$ic297$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var483 = f48939(var482, (SubLObject)module0767.$ic330$);
            final SubLObject var484 = f48939(var481, (SubLObject)module0767.$ic328$);
            var472 = (SubLObject)ConsesLow.list(module0767.$ic302$, (SubLObject)ConsesLow.list(module0767.$ic331$, var483, var484), var480);
        }
        return var472;
    }
    
    public static SubLObject f48940(final SubLObject var416, final SubLObject var30) {
        SubLObject var417 = var416;
        if (module0767.NIL != module0612.f37382(var416)) {
            final SubLObject var418 = module0612.f37528();
            SubLObject var419 = (SubLObject)module0767.NIL;
            if (module0767.NIL == module0751.f47047(var418, var416)) {
                if (module0767.NIL != module0751.f47047(module0612.f37424(var418, module0767.$ic333$, (SubLObject)module0767.UNPROVIDED), var416)) {
                    if (module0767.NIL != module0751.f46851((SubLObject)module0767.$ic334$, (SubLObject)ConsesLow.list(module0767.$ic335$, var416))) {
                        var419 = module0767.$ic336$;
                    }
                }
                else if (module0767.NIL != module0751.f46851((SubLObject)module0767.$ic337$, (SubLObject)ConsesLow.list(module0767.$ic335$, var416))) {
                    var419 = module0767.$ic338$;
                }
            }
            if (module0767.NIL != var419) {
                var417 = module0612.f37424(var416, var419, (SubLObject)module0767.UNPROVIDED);
                if (!var417.equal(var416)) {
                    if (var30.eql((SubLObject)module0767.$ic330$)) {
                        var417 = module0614.f37626(var417);
                    }
                    else if (var30.eql((SubLObject)module0767.$ic328$)) {
                        var417 = module0614.f37625(var417);
                    }
                }
            }
        }
        else if (module0767.NIL != module0202.f12589(var416, module0767.$ic302$) && module0767.NIL != module0612.f37382(module0205.f13277(var416, (SubLObject)module0767.UNPROVIDED))) {
            final SubLObject var420 = module0205.f13277(var416, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var421 = f48939(var420, var30);
            if (!var420.equal(var421)) {
                var417 = var421;
            }
        }
        else if (module0767.NIL != module0202.f12589(var416, module0767.$ic304$) && module0767.NIL != module0612.f37382(module0205.f13277(var416, (SubLObject)module0767.UNPROVIDED)) && var30 == module0767.$ic328$) {
            final SubLObject var420 = module0205.f13277(var416, (SubLObject)module0767.UNPROVIDED);
            final SubLObject var421 = f48939(var420, var30);
            if (var420.equal(var421)) {
                var417 = module0614.f37625(var421);
            }
            else {
                var417 = var421;
            }
        }
        return var417;
    }
    
    public static SubLObject f48939(final SubLObject var416, final SubLObject var30) {
        final SubLThread var417 = SubLProcess.currentSubLThread();
        final SubLObject var418 = module0034.$g879$.getDynamicValue(var417);
        SubLObject var419 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var418) {
            return f48940(var416, var30);
        }
        var419 = module0034.f1857(var418, (SubLObject)module0767.$ic332$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var419) {
            var419 = module0034.f1807(module0034.f1842(var418), (SubLObject)module0767.$ic332$, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.NIL, (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var418, (SubLObject)module0767.$ic332$, var419);
        }
        final SubLObject var420 = module0034.f1782(var416, var30);
        final SubLObject var421 = module0034.f1814(var419, var420, (SubLObject)module0767.UNPROVIDED);
        if (var421 != module0767.$ic23$) {
            SubLObject var422 = var421;
            SubLObject var423 = (SubLObject)module0767.NIL;
            var423 = var422.first();
            while (module0767.NIL != var422) {
                SubLObject var424 = var423.first();
                final SubLObject var425 = conses_high.second(var423);
                if (var416.equal(var424.first())) {
                    var424 = var424.rest();
                    if (module0767.NIL != var424 && module0767.NIL == var424.rest() && var30.equal(var424.first())) {
                        return module0034.f1959(var425);
                    }
                }
                var422 = var422.rest();
                var423 = var422.first();
            }
        }
        final SubLObject var426 = Values.arg2(var417.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48940(var416, var30)));
        module0034.f1836(var419, var420, var421, var426, (SubLObject)ConsesLow.list(var416, var30));
        return module0034.f1959(var426);
    }
    
    public static SubLObject f48941(final SubLObject var446) {
        final SubLObject var447 = module0751.f46613(var446);
        final SubLObject var448 = module0205.f13132(var447);
        final SubLObject var449 = f48928(var446, var448);
        return module0035.sublisp_boolean(var449);
    }
    
    public static SubLObject f48928(final SubLObject var446, final SubLObject var28) {
        final SubLThread var447 = SubLProcess.currentSubLThread();
        SubLObject var448 = (SubLObject)module0767.NIL;
        final SubLObject var449 = module0147.f9540(module0579.$g4260$.getDynamicValue(var447));
        final SubLObject var450 = module0147.$g2095$.currentBinding(var447);
        final SubLObject var451 = module0147.$g2094$.currentBinding(var447);
        final SubLObject var452 = module0147.$g2096$.currentBinding(var447);
        try {
            module0147.$g2095$.bind(module0147.f9545(var449), var447);
            module0147.$g2094$.bind(module0147.f9546(var449), var447);
            module0147.$g2096$.bind(module0147.f9549(var449), var447);
            if (module0767.NIL != module0173.f10955(var28) && module0767.NIL != module0220.f14544(var28, module0767.$ic341$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                var448 = module0220.f14553(var446, module0767.$ic342$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var452, var447);
            module0147.$g2094$.rebind(var451, var447);
            module0147.$g2095$.rebind(var450, var447);
        }
        return var448;
    }
    
    public static SubLObject f48942(final SubLObject var81) {
        SubLObject var82 = (SubLObject)module0767.NIL;
        assert module0767.NIL != module0756.f47600(var81) : var81;
        SubLObject var83 = (SubLObject)module0767.ZERO_INTEGER;
        SubLObject var84 = (SubLObject)module0767.ZERO_INTEGER;
        final SubLObject var85 = module0756.f47713(var81, (SubLObject)module0767.T);
        final SubLObject var86 = module0751.f46648(var85, (SubLObject)module0767.NIL);
        final SubLObject var87 = module0749.f46562(var81);
        while (module0767.NIL == module0749.f46563(var87)) {
            final SubLObject var88 = module0749.f46564(var87);
            final SubLObject var89 = module0756.f47721(var88, (SubLObject)module0767.NIL);
            var83 = module0580.f35585(var89, var86, var84);
            if (var83.numG(var84)) {
                final SubLObject var90 = module0580.f35583(var83, var84);
                final SubLObject var91 = module0751.f46705();
                final SubLObject var92 = (SubLObject)module0767.NIL;
                final SubLObject var93 = (SubLObject)module0767.NIL;
                final SubLObject var94 = module0756.f47748();
                final SubLObject var95 = module0772.f49212(var90);
                final SubLObject var478_488 = var84;
                final SubLObject var96 = (SubLObject)ConsesLow.list(var93, var92, var91, var90);
                final SubLObject var97 = Sequences.position_if((SubLObject)module0767.$ic344$, var96, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                SubLObject var98 = Sequences.nreverse(conses_high.nthcdr(var97, var96));
                if (module0767.NIL != module0035.f1997(var98)) {
                    var98 = var98.first();
                }
                var82 = (SubLObject)ConsesLow.cons(var98, var82);
            }
            var84 = module0580.f35582(var83, var89);
            final SubLObject var90 = module0756.f47721(var88, (SubLObject)module0767.NIL);
            final SubLObject var91 = module0749.f46462(var88);
            final SubLObject var92 = module0749.f46474(var88);
            final SubLObject var93 = module0749.f46476(var88);
            final SubLObject var94 = module0749.f46466(var88);
            final SubLObject var95 = var88;
            final SubLObject var99 = (SubLObject)ConsesLow.list(var93, var92, var91, var90);
            final SubLObject var100 = Sequences.position_if((SubLObject)module0767.$ic344$, var99, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            SubLObject var101 = Sequences.nreverse(conses_high.nthcdr(var100, var99));
            if (module0767.NIL != module0035.f1997(var101)) {
                var101 = var101.first();
            }
            var82 = (SubLObject)ConsesLow.cons(var101, var82);
        }
        return Sequences.nreverse(var82);
    }
    
    public static SubLObject f48943(final SubLObject var492, final SubLObject var446) {
        SubLObject var493 = (SubLObject)module0767.NIL;
        SubLObject var494 = var492;
        SubLObject var495 = (SubLObject)module0767.NIL;
        var495 = var494.first();
        while (module0767.NIL != var494) {
            if (var495.isString()) {
                var493 = (SubLObject)ConsesLow.cons(module0772.f49212(var495), var493);
            }
            else {
                SubLObject var497;
                final SubLObject var496 = var497 = var495;
                SubLObject var498 = (SubLObject)module0767.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var497, var496, (SubLObject)module0767.$ic345$);
                var498 = var497.first();
                var497 = var497.rest();
                final SubLObject var499 = var497.isCons() ? var497.first() : module0751.f46705();
                cdestructuring_bind.destructuring_bind_must_listp(var497, var496, (SubLObject)module0767.$ic345$);
                var497 = var497.rest();
                final SubLObject var500 = (SubLObject)(var497.isCons() ? var497.first() : module0767.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var497, var496, (SubLObject)module0767.$ic345$);
                var497 = var497.rest();
                final SubLObject var501 = (SubLObject)(var497.isCons() ? var497.first() : module0767.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var497, var496, (SubLObject)module0767.$ic345$);
                var497 = var497.rest();
                if (module0767.NIL == var497) {
                    final SubLObject var502 = (module0767.NIL != module0751.f46924(var499)) ? module0751.f46621(var446, var499) : module0756.f47748();
                    var493 = (SubLObject)ConsesLow.cons(module0749.f46446(var498, var499, var502, var500, var501, (SubLObject)module0767.UNPROVIDED), var493);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var496, (SubLObject)module0767.$ic345$);
                }
            }
            var494 = var494.rest();
            var495 = var494.first();
        }
        return module0770.f49055(Sequences.nreverse(var493), var446);
    }
    
    public static SubLObject f48944(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != var5 && module0767.NIL == module0751.f46829(var5));
    }
    
    public static SubLObject f48788(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0579.$g4259$.getDynamicValue(var3) == module0767.$ic13$) {
            f48945(var2);
        }
        if (module0767.NIL == module0756.f47479(var2)) {
            final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
            if (var4.isString()) {
                module0756.f47723(var2, var4);
            }
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48945(final SubLObject var2) {
        final SubLObject var3 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        if (var3.isString()) {
            final SubLObject var4 = f48946(var3, module0756.f47711(var2));
            module0756.f47501(var2, var4, (SubLObject)module0767.UNPROVIDED);
            module0756.f47608(var2);
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48946(final SubLObject var6, SubLObject var49) {
        if (var49 == module0767.UNPROVIDED) {
            var49 = module0751.f46705();
        }
        SubLObject var50 = (SubLObject)module0767.NIL;
        SubLObject var51 = module0038.$g916$.getGlobalValue();
        SubLObject var52 = (SubLObject)module0767.ZERO_INTEGER;
        SubLObject var435_498;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        for (var53 = (var435_498 = Sequences.length(var6)), var54 = (SubLObject)module0767.NIL, var54 = (SubLObject)module0767.ZERO_INTEGER; !var54.numGE(var435_498); var54 = module0048.f_1X(var54)) {
            var55 = Strings.sublisp_char(var6, var54);
            if (Characters.CHAR_hash.eql(var55) && (!var54.isPositive() || module0767.NIL == module0126.f8387(Strings.sublisp_char(var6, module0048.f_1_(var54)))) && module0767.NIL != module0035.f2002(var6, var54, (SubLObject)module0767.UNPROVIDED) && Characters.CHAR_dollar.eql(Strings.sublisp_char(var6, module0048.f_1X(var54)))) {
                var56 = Numbers.add(var54, (SubLObject)module0767.TWO_INTEGER);
                var57 = module0035.position_if_not((SubLObject)module0767.$ic347$, var6, Symbols.symbol_function((SubLObject)module0767.IDENTITY), var56, (SubLObject)module0767.UNPROVIDED);
                var58 = module0038.f2623(var6, var56, var57);
                var59 = module0166.f10737(var58);
                if (module0767.NIL != module0128.f8463(var59, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0769.f49012(var59) && module0767.NIL != module0035.sublisp_boolean(module0769.f49014(var59))) {
                    var51 = Sequences.cconcatenate(var51, module0038.f2623(var6, var52, var54));
                    var52 = var57;
                    if (module0767.NIL != module0038.f2653(var51)) {
                        var50 = (SubLObject)ConsesLow.cons(module0772.f49212(var51), var50);
                        var51 = module0038.$g916$.getGlobalValue();
                    }
                    var60 = module0749.f46446(var58, module0751.f46705(), var59, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                    module0756.f47719(var60, var59);
                    var50 = (SubLObject)ConsesLow.cons(var60, var50);
                }
            }
        }
        if (module0767.NIL != var52) {
            var51 = Sequences.cconcatenate(var51, module0038.f2623(var6, var52, (SubLObject)module0767.UNPROVIDED));
        }
        if (module0767.NIL != module0038.f2653(var51)) {
            final SubLObject var61 = (module0767.NIL != module0035.f2012(var50)) ? module0749.f46446(var6, var49, var6, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) : module0772.f49212(var51);
            var50 = (SubLObject)ConsesLow.cons(var61, var50);
        }
        return Sequences.nreverse(var50);
    }
    
    public static SubLObject f48782(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = module0756.f47488(var2, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL != module0269.f17715(var4.first()) || module0767.NIL != module0269.f17723(var4.first())) {
            module0638.f38953(module0228.f15229(var4), module0579.$g4260$.getDynamicValue(var3), module0579.$g4262$.getDynamicValue(var3), var5);
        }
        if (module0767.NIL != module0035.f2014(var4)) {
            SubLObject var6 = (SubLObject)module0767.NIL;
            final SubLObject var7 = module0756.f47511(var2);
            SubLObject var8 = (SubLObject)module0767.NIL;
            SubLObject var9 = (SubLObject)module0767.NIL;
            SubLObject var10 = (SubLObject)module0767.NIL;
            var8 = var4;
            var9 = var8.first();
            for (var10 = (SubLObject)module0767.ZERO_INTEGER; module0767.NIL != var8; var8 = var8.rest(), var9 = var8.first(), var10 = Numbers.add((SubLObject)module0767.ONE_INTEGER, var10)) {
                SubLObject var11 = module0770.f49074(var9, (SubLObject)module0767.$ic46$, module0579.$g4260$.getDynamicValue(var3), module0579.$g4262$.getDynamicValue(var3), module0579.$g4259$.getDynamicValue(var3), (SubLObject)module0767.UNPROVIDED);
                SubLObject var12 = (SubLObject)module0767.NIL;
                var12 = var11.first();
                while (module0767.NIL != var11) {
                    final SubLObject var13 = (SubLObject)ConsesLow.list(var10);
                    final SubLObject var14 = module0751.f46982(var13, var7);
                    if (module0767.NIL != module0751.f46924(var14)) {
                        module0751.f47205(var14, var12);
                    }
                    var6 = (SubLObject)ConsesLow.cons(var12, var6);
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            final SubLObject var15 = Sequences.nreverse(var6);
            if (module0767.NIL != module0756.f47466(var15)) {
                module0756.f47501(var2, var15, (SubLObject)module0767.UNPROVIDED);
                module0756.f47608(var2);
            }
        }
        return module0756.f47467(var2);
    }
    
    public static SubLObject f48947(final SubLObject var2) {
        final SubLObject var3 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL != module0202.f12734(var3, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0751.f46684(module0205.f13203(var3, (SubLObject)module0767.UNPROVIDED), module0767.$ic351$, (SubLObject)module0767.UNPROVIDED)) {
            module0756.f47465(var2, Sequences.reverse(var3));
        }
        return f48782(var2);
    }
    
    public static SubLObject f48906(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0756.f47487(var2, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var5 = f48948(var4, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL != var5) {
            module0756.f47745(var2, var5);
            final SubLObject var6 = module0579.$g4246$.currentBinding(var3);
            try {
                module0579.$g4246$.bind((SubLObject)module0767.$ic237$, var3);
                module0770.f49065(var2, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            }
            finally {
                module0579.$g4246$.rebind(var6, var3);
            }
        }
        if (module0767.NIL != module0756.f47479(var2)) {
            module0756.f47783(var2, module0767.$ic177$, (SubLObject)module0767.UNPROVIDED);
        }
        return var2;
    }
    
    public static SubLObject f48948(final SubLObject var397, SubLObject var509) {
        if (var509 == module0767.UNPROVIDED) {
            var509 = (SubLObject)module0767.NIL;
        }
        SubLObject var510 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var509 && module0767.NIL != f48949(var397)) {
            var509 = f48950(var397, (SubLObject)module0767.UNPROVIDED);
        }
        if (module0767.NIL != module0202.f12590(var509)) {
            final SubLObject var511 = module0205.f13132(var509);
            final SubLObject var512 = f48951(var509);
            final SubLObject var513 = f48952(var509);
            if (module0767.NIL != var513) {
                var510 = (SubLObject)ConsesLow.list(module0767.$ic352$, var513, var511, var512);
            }
        }
        return var510;
    }
    
    public static SubLObject f48949(final SubLObject var397) {
        final SubLThread var398 = SubLProcess.currentSubLThread();
        if (module0767.NIL == module0210.f13565(var397)) {
            return (SubLObject)module0767.NIL;
        }
        if (module0767.NIL != module0751.f47050(var397, f48953(), module0579.$g4262$.getDynamicValue(var398))) {
            return (SubLObject)module0767.NIL;
        }
        return (SubLObject)module0767.T;
    }
    
    public static SubLObject f48953() {
        return module0767.$g6144$.getGlobalValue();
    }
    
    public static SubLObject f48954() {
        final SubLObject var7 = module0767.$g6145$.getGlobalValue();
        if (module0767.NIL != var7) {
            module0034.f1818(var7);
        }
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48955() {
        return module0034.f1829(module0767.$g6145$.getGlobalValue(), (SubLObject)ConsesLow.list(module0767.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48956() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0767.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0767.$ic25$, var4);
            module0147.$g2095$.bind(module0767.$ic26$, var4);
            final SubLObject var8 = module0767.$ic355$;
            final SubLObject var9 = (SubLObject)module0767.$ic66$;
            final SubLObject var10 = module0056.f4145(var9);
            SubLObject var11 = (SubLObject)module0767.NIL;
            final SubLObject var9_513 = module0139.$g1635$.currentBinding(var4);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var4);
                final SubLObject var12 = (SubLObject)module0767.NIL;
                final SubLObject var9_514 = module0141.$g1714$.currentBinding(var4);
                final SubLObject var25_515 = module0141.$g1715$.currentBinding(var4);
                try {
                    module0141.$g1714$.bind((module0767.NIL != var12) ? var12 : module0141.f9283(), var4);
                    module0141.$g1715$.bind((SubLObject)((module0767.NIL != var12) ? module0767.$ic68$ : module0141.$g1715$.getDynamicValue(var4)), var4);
                    if (module0767.NIL != var12 && module0767.NIL != module0136.f8864() && module0767.NIL == module0141.f9279(var12)) {
                        final SubLObject var13 = module0136.$g1591$.getDynamicValue(var4);
                        if (var13.eql((SubLObject)module0767.$ic69$)) {
                            module0136.f8870((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic70$, var12, (SubLObject)module0767.$ic71$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                        }
                        else if (var13.eql((SubLObject)module0767.$ic72$)) {
                            module0136.f8871((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.$ic73$, (SubLObject)module0767.$ic70$, var12, (SubLObject)module0767.$ic71$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                        }
                        else if (var13.eql((SubLObject)module0767.$ic74$)) {
                            Errors.warn((SubLObject)module0767.$ic70$, var12, (SubLObject)module0767.$ic71$);
                        }
                        else {
                            Errors.warn((SubLObject)module0767.$ic75$, module0136.$g1591$.getDynamicValue(var4));
                            Errors.cerror((SubLObject)module0767.$ic73$, (SubLObject)module0767.$ic70$, var12, (SubLObject)module0767.$ic71$);
                        }
                    }
                    final SubLObject var9_515 = module0141.$g1670$.currentBinding(var4);
                    final SubLObject var25_516 = module0141.$g1671$.currentBinding(var4);
                    final SubLObject var14 = module0141.$g1672$.currentBinding(var4);
                    final SubLObject var15 = module0141.$g1674$.currentBinding(var4);
                    final SubLObject var16 = module0137.$g1605$.currentBinding(var4);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0767.$ic76$), var4);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0767.$ic76$)), var4);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0767.$ic76$)), var4);
                        module0141.$g1674$.bind((SubLObject)module0767.NIL, var4);
                        module0137.$g1605$.bind(module0137.f8955(module0767.$ic76$), var4);
                        if (module0767.NIL != module0136.f8865() || module0767.NIL != module0244.f15795(module0767.$ic355$, module0137.f8955((SubLObject)module0767.UNPROVIDED))) {
                            final SubLObject var9_516 = module0141.$g1677$.currentBinding(var4);
                            final SubLObject var25_517 = module0138.$g1619$.currentBinding(var4);
                            final SubLObject var26_520 = module0141.$g1674$.currentBinding(var4);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var4);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0767.$ic76$)), var4);
                                module0141.$g1674$.bind((SubLObject)module0767.NIL, var4);
                                module0249.f16055(var8, (SubLObject)module0767.UNPROVIDED);
                                for (var11 = (SubLObject)ConsesLow.list(module0767.$ic355$, module0141.f9195()); module0767.NIL != var11; var11 = module0056.f4150(var10)) {
                                    final SubLObject var337_521 = var11.first();
                                    final SubLObject var17 = conses_high.second(var11);
                                    final SubLObject var18 = var337_521;
                                    final SubLObject var9_517 = module0141.$g1674$.currentBinding(var4);
                                    try {
                                        module0141.$g1674$.bind(var17, var4);
                                        if (module0767.NIL != module0250.f16115(module0141.f9190(), var337_521) && !module0217.f14247(var18, (SubLObject)module0767.UNPROVIDED).isZero() && !module0226.f15068(var18, (SubLObject)module0767.UNPROVIDED).eql((SubLObject)module0767.TWO_INTEGER)) {
                                            var5 = (SubLObject)ConsesLow.cons(var18, var5);
                                        }
                                        SubLObject var20;
                                        final SubLObject var19 = var20 = module0200.f12443(module0137.f8955(module0767.$ic76$));
                                        SubLObject var21 = (SubLObject)module0767.NIL;
                                        var21 = var20.first();
                                        while (module0767.NIL != var20) {
                                            final SubLObject var9_518 = module0137.$g1605$.currentBinding(var4);
                                            final SubLObject var25_518 = module0141.$g1674$.currentBinding(var4);
                                            try {
                                                module0137.$g1605$.bind(var21, var4);
                                                module0141.$g1674$.bind((SubLObject)((module0767.NIL != module0141.f9205((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0767.NIL == module0141.$g1674$.getDynamicValue(var4)) : module0141.$g1674$.getDynamicValue(var4)), var4);
                                                final SubLObject var22 = module0228.f15229(var337_521);
                                                if (module0767.NIL != module0138.f8992(var22)) {
                                                    final SubLObject var23 = module0242.f15664(var22, module0137.f8955((SubLObject)module0767.UNPROVIDED));
                                                    if (module0767.NIL != var23) {
                                                        final SubLObject var24 = module0245.f15834(var23, module0138.f8979(), module0137.f8955((SubLObject)module0767.UNPROVIDED));
                                                        if (module0767.NIL != var24) {
                                                            SubLObject var25;
                                                            for (var25 = module0066.f4838(module0067.f4891(var24)); module0767.NIL == module0066.f4841(var25); var25 = module0066.f4840(var25)) {
                                                                var4.resetMultipleValues();
                                                                final SubLObject var26 = module0066.f4839(var25);
                                                                final SubLObject var27 = var4.secondMultipleValue();
                                                                var4.resetMultipleValues();
                                                                if (module0767.NIL != module0147.f9507(var26)) {
                                                                    final SubLObject var9_519 = module0138.$g1623$.currentBinding(var4);
                                                                    try {
                                                                        module0138.$g1623$.bind(var26, var4);
                                                                        SubLObject var133_526;
                                                                        for (var133_526 = module0066.f4838(module0067.f4891(var27)); module0767.NIL == module0066.f4841(var133_526); var133_526 = module0066.f4840(var133_526)) {
                                                                            var4.resetMultipleValues();
                                                                            final SubLObject var28 = module0066.f4839(var133_526);
                                                                            final SubLObject var29 = var4.secondMultipleValue();
                                                                            var4.resetMultipleValues();
                                                                            if (module0767.NIL != module0141.f9289(var28)) {
                                                                                final SubLObject var9_520 = module0138.$g1624$.currentBinding(var4);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var28, var4);
                                                                                    final SubLObject var30 = var29;
                                                                                    if (module0767.NIL != module0077.f5302(var30)) {
                                                                                        final SubLObject var31 = module0077.f5333(var30);
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        SubLObject var34;
                                                                                        for (var32 = module0032.f1741(var31), var33 = (SubLObject)module0767.NIL, var33 = module0032.f1742(var32, var31); module0767.NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
                                                                                            var34 = module0032.f1745(var32, var33);
                                                                                            if (module0767.NIL != module0032.f1746(var33, var34) && module0767.NIL == module0249.f16059(var34, (SubLObject)module0767.UNPROVIDED)) {
                                                                                                module0249.f16055(var34, (SubLObject)module0767.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var34, module0141.f9195()), var10);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var30.isList()) {
                                                                                        SubLObject var35 = var30;
                                                                                        SubLObject var36 = (SubLObject)module0767.NIL;
                                                                                        var36 = var35.first();
                                                                                        while (module0767.NIL != var35) {
                                                                                            if (module0767.NIL == module0249.f16059(var36, (SubLObject)module0767.UNPROVIDED)) {
                                                                                                module0249.f16055(var36, (SubLObject)module0767.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var36, module0141.f9195()), var10);
                                                                                            }
                                                                                            var35 = var35.rest();
                                                                                            var36 = var35.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0767.$ic78$, var30);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var9_520, var4);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var133_526);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var9_519, var4);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var25);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0767.FIVE_INTEGER, (SubLObject)module0767.$ic79$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0767.NIL != module0155.f9785(var22, (SubLObject)module0767.UNPROVIDED)) {
                                                    SubLObject var40_528;
                                                    final SubLObject var37 = var40_528 = ((module0767.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0767.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var4), module0137.f8955((SubLObject)module0767.UNPROVIDED)));
                                                    SubLObject var38 = (SubLObject)module0767.NIL;
                                                    var38 = var40_528.first();
                                                    while (module0767.NIL != var40_528) {
                                                        final SubLObject var9_521 = module0138.$g1625$.currentBinding(var4);
                                                        try {
                                                            module0138.$g1625$.bind(var38, var4);
                                                            final SubLObject var40;
                                                            final SubLObject var39 = var40 = Functions.funcall(var38, var22);
                                                            if (module0767.NIL != module0077.f5302(var40)) {
                                                                final SubLObject var41 = module0077.f5333(var40);
                                                                SubLObject var42;
                                                                SubLObject var43;
                                                                SubLObject var44;
                                                                for (var42 = module0032.f1741(var41), var43 = (SubLObject)module0767.NIL, var43 = module0032.f1742(var42, var41); module0767.NIL == module0032.f1744(var42, var43); var43 = module0032.f1743(var43)) {
                                                                    var44 = module0032.f1745(var42, var43);
                                                                    if (module0767.NIL != module0032.f1746(var43, var44) && module0767.NIL == module0249.f16059(var44, (SubLObject)module0767.UNPROVIDED)) {
                                                                        module0249.f16055(var44, (SubLObject)module0767.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var44, module0141.f9195()), var10);
                                                                    }
                                                                }
                                                            }
                                                            else if (var40.isList()) {
                                                                SubLObject var45 = var40;
                                                                SubLObject var46 = (SubLObject)module0767.NIL;
                                                                var46 = var45.first();
                                                                while (module0767.NIL != var45) {
                                                                    if (module0767.NIL == module0249.f16059(var46, (SubLObject)module0767.UNPROVIDED)) {
                                                                        module0249.f16055(var46, (SubLObject)module0767.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var46, module0141.f9195()), var10);
                                                                    }
                                                                    var45 = var45.rest();
                                                                    var46 = var45.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0767.$ic78$, var40);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var9_521, var4);
                                                        }
                                                        var40_528 = var40_528.rest();
                                                        var38 = var40_528.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var25_518, var4);
                                                module0137.$g1605$.rebind(var9_518, var4);
                                            }
                                            var20 = var20.rest();
                                            var21 = var20.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var9_517, var4);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var26_520, var4);
                                module0138.$g1619$.rebind(var25_517, var4);
                                module0141.$g1677$.rebind(var9_516, var4);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.$ic80$, module0767.$ic355$, module0244.f15748(module0137.f8955((SubLObject)module0767.UNPROVIDED)), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var16, var4);
                        module0141.$g1674$.rebind(var15, var4);
                        module0141.$g1672$.rebind(var14, var4);
                        module0141.$g1671$.rebind(var25_516, var4);
                        module0141.$g1670$.rebind(var9_515, var4);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var25_515, var4);
                    module0141.$g1714$.rebind(var9_514, var4);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var4));
            }
            finally {
                module0139.$g1635$.rebind(var9_513, var4);
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f48957() {
        SubLObject var15 = module0767.$g6145$.getGlobalValue();
        if (module0767.NIL == var15) {
            var15 = module0034.f1934((SubLObject)module0767.$ic354$, (SubLObject)module0767.$ic356$, (SubLObject)module0767.NIL, (SubLObject)module0767.EQL, (SubLObject)module0767.ZERO_INTEGER, (SubLObject)module0767.ZERO_INTEGER);
        }
        SubLObject var16 = module0034.f1810(var15, (SubLObject)module0767.UNPROVIDED);
        if (var16 == module0767.$ic23$) {
            var16 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48956()));
            module0034.f1812(var15, var16, (SubLObject)module0767.UNPROVIDED);
        }
        return module0034.f1959(var16);
    }
    
    public static SubLObject f48958(final SubLObject var397, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var398 = SubLProcess.currentSubLThread();
        SubLObject var399 = (SubLObject)module0767.NIL;
        final SubLObject var400 = (SubLObject)module0767.$ic145$;
        if (module0767.NIL == var399) {
            SubLObject var401 = f48957();
            SubLObject var402 = (SubLObject)module0767.NIL;
            var402 = var401.first();
            while (module0767.NIL == var399 && module0767.NIL != var401) {
                final SubLObject var403 = module0147.f9540(var300);
                final SubLObject var404 = module0147.$g2095$.currentBinding(var398);
                final SubLObject var405 = module0147.$g2094$.currentBinding(var398);
                final SubLObject var406 = module0147.$g2096$.currentBinding(var398);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var403), var398);
                    module0147.$g2094$.bind(module0147.f9546(var403), var398);
                    module0147.$g2096$.bind(module0147.f9549(var403), var398);
                    if (module0767.NIL != module0220.f14544(var397, var402, (SubLObject)module0767.TWO_INTEGER, var400)) {
                        final SubLObject var407 = module0220.f14553(var397, var402, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.ONE_INTEGER, var400);
                        if (module0767.NIL != module0212.f13762(var407) && ConsesLow.list(var397).equal(module0220.f14562(var407, var402, (SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.TWO_INTEGER, var400))) {
                            var399 = module0202.f12768(var402, var407, var397);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var406, var398);
                    module0147.$g2094$.rebind(var405, var398);
                    module0147.$g2095$.rebind(var404, var398);
                }
                var401 = var401.rest();
                var402 = var401.first();
            }
        }
        return var399;
    }
    
    public static SubLObject f48950(final SubLObject var397, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var398 = SubLProcess.currentSubLThread();
        final SubLObject var399 = module0034.$g879$.getDynamicValue(var398);
        SubLObject var400 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var399) {
            return f48958(var397, var300);
        }
        var400 = module0034.f1857(var399, (SubLObject)module0767.$ic357$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var400) {
            var400 = module0034.f1807(module0034.f1842(var399), (SubLObject)module0767.$ic357$, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.$ic358$, (SubLObject)module0767.EQL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var399, (SubLObject)module0767.$ic357$, var400);
        }
        final SubLObject var401 = module0034.f1782(var397, var300);
        final SubLObject var402 = module0034.f1814(var400, var401, (SubLObject)module0767.UNPROVIDED);
        if (var402 != module0767.$ic23$) {
            SubLObject var403 = var402;
            SubLObject var404 = (SubLObject)module0767.NIL;
            var404 = var403.first();
            while (module0767.NIL != var403) {
                SubLObject var405 = var404.first();
                final SubLObject var406 = conses_high.second(var404);
                if (var397.eql(var405.first())) {
                    var405 = var405.rest();
                    if (module0767.NIL != var405 && module0767.NIL == var405.rest() && var300.eql(var405.first())) {
                        return module0034.f1959(var406);
                    }
                }
                var403 = var403.rest();
                var404 = var403.first();
            }
        }
        final SubLObject var407 = Values.arg2(var398.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48958(var397, var300)));
        module0034.f1836(var400, var401, var402, var407, (SubLObject)ConsesLow.list(var397, var300));
        return module0034.f1959(var407);
    }
    
    public static SubLObject f48951(final SubLObject var509) {
        final SubLThread var510 = SubLProcess.currentSubLThread();
        final SubLObject var511 = (SubLObject)module0767.$ic359$;
        final SubLObject var512 = module0205.f13204(var509, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var513 = module0202.f12817((SubLObject)module0767.ONE_INTEGER, var511, var509);
        final SubLObject var514 = Sequences.remove(var512, module0751.f46770(var511, var513, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED), Symbols.symbol_function((SubLObject)module0767.EQUAL), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        final SubLObject var515 = (SubLObject)module0767.TEN_INTEGER;
        final SubLObject var516 = module0761.f48137((SubLObject)module0767.UNPROVIDED);
        final SubLObject var517 = (SubLObject)((module0767.NIL != var516) ? Sequences.find(module0579.$g4284$.getDynamicValue(var510), var514, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) : module0767.NIL);
        final SubLObject var518 = (SubLObject)((module0767.NIL != var516) ? Sequences.find(module0579.$g4283$.getDynamicValue(var510), var514, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED) : module0767.NIL);
        if (module0767.NIL != var517 && module0767.NIL != var518) {
            return module0764.f48501((SubLObject)module0767.$ic360$, module0767.$ic361$);
        }
        if (module0767.NIL != var517) {
            return var517;
        }
        if (module0767.NIL != var518) {
            return var518;
        }
        if (module0767.NIL != module0035.f1997(var514)) {
            return var514.first();
        }
        if (module0767.NIL == var514) {
            if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0767.$ic362$, var512);
            }
            return module0205.f13203(var509, (SubLObject)module0767.UNPROVIDED);
        }
        return module0202.f12683(module0767.$ic363$, module0035.f2124(var515, var514), (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48959(final SubLObject var511, final SubLObject var397, final SubLObject var282) {
        final SubLThread var512 = SubLProcess.currentSubLThread();
        SubLObject var513 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var513) {
            SubLObject var514 = var282;
            SubLObject var515 = (SubLObject)module0767.NIL;
            var515 = var514.first();
            while (module0767.NIL == var513 && module0767.NIL != var514) {
                if (module0767.NIL != module0178.f11284(var515) && module0178.f11334(var515).equal(var511) && module0178.f11335(var515).equal(var397) && module0767.NIL != module0260.f17091(module0178.f11333(var515), module0767.$ic355$, module0579.$g4262$.getDynamicValue(var512), (SubLObject)module0767.UNPROVIDED) && module0767.NIL == Sequences.remove(var397, module0751.f46770((SubLObject)module0767.$ic364$, module0202.f12817((SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.$ic364$, module0178.f11285(var515)), module0579.$g4262$.getDynamicValue(var512), (SubLObject)module0767.NIL, (SubLObject)module0767.TWO_INTEGER), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                    var513 = var515;
                }
                var514 = var514.rest();
                var515 = var514.first();
            }
        }
        return var513;
    }
    
    public static SubLObject f48952(final SubLObject var509) {
        final SubLThread var510 = SubLProcess.currentSubLThread();
        SubLObject var512;
        final SubLObject var511 = var512 = module0205.f13180(var509, (SubLObject)module0767.UNPROVIDED);
        SubLObject var513 = (SubLObject)module0767.NIL;
        SubLObject var514 = (SubLObject)module0767.NIL;
        SubLObject var515 = (SubLObject)module0767.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var512, var511, (SubLObject)module0767.$ic365$);
        var513 = var512.first();
        var512 = var512.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var512, var511, (SubLObject)module0767.$ic365$);
        var514 = var512.first();
        var512 = var512.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var512, var511, (SubLObject)module0767.$ic365$);
        var515 = var512.first();
        var512 = var512.rest();
        if (module0767.NIL == var512) {
            SubLObject var516 = (SubLObject)module0767.NIL;
            if (module0767.NIL == var516) {
                SubLObject var517 = module0226.f14882(var513, (SubLObject)module0767.TWO_INTEGER, module0579.$g4262$.getDynamicValue(var510));
                SubLObject var518 = (SubLObject)module0767.NIL;
                var518 = var517.first();
                while (module0767.NIL == var516 && module0767.NIL != var517) {
                    if (module0767.NIL == var516) {
                        SubLObject var73_541 = module0259.f16821(var515, module0579.$g4262$.getDynamicValue(var510), (SubLObject)module0767.UNPROVIDED);
                        SubLObject var519 = (SubLObject)module0767.NIL;
                        var519 = var73_541.first();
                        while (module0767.NIL == var516 && module0767.NIL != var73_541) {
                            if (module0767.NIL != module0751.f46669(var519, var518, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0751.f46709(var519, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
                                var516 = var519;
                            }
                            var73_541 = var73_541.rest();
                            var519 = var73_541.first();
                        }
                    }
                    var517 = var517.rest();
                    var518 = var517.first();
                }
            }
            return var516;
        }
        cdestructuring_bind.cdestructuring_bind_error(var511, (SubLObject)module0767.$ic365$);
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48960(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0767.NIL;
        final SubLObject var8 = module0147.f9540(module0579.$g4262$.getDynamicValue(var6));
        final SubLObject var9 = module0147.$g2095$.currentBinding(var6);
        final SubLObject var10 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var11 = module0147.$g2096$.currentBinding(var6);
        try {
            module0147.$g2095$.bind(module0147.f9545(var8), var6);
            module0147.$g2094$.bind(module0147.f9546(var8), var6);
            module0147.$g2096$.bind(module0147.f9549(var8), var6);
            if (module0767.NIL == var7) {
                SubLObject var12 = module0767.$g6146$.getDynamicValue(var6);
                SubLObject var13 = (SubLObject)module0767.NIL;
                var13 = var12.first();
                while (module0767.NIL == var7 && module0767.NIL != var12) {
                    if (module0767.NIL != module0751.f46684(var5, var13, (SubLObject)module0767.UNPROVIDED)) {
                        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic367$, var5, var13);
                        }
                        var7 = (SubLObject)module0767.T;
                    }
                    var12 = var12.rest();
                    var13 = var12.first();
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var11, var6);
            module0147.$g2094$.rebind(var10, var6);
            module0147.$g2095$.rebind(var9, var6);
        }
        if (module0767.NIL == var7) {
            var7 = module0004.f104(var5, module0767.$g6147$.getDynamicValue(var6), Symbols.symbol_function((SubLObject)module0767.EQUAL), (SubLObject)module0767.UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f48961(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        return (SubLObject)((module0767.NIL != f48960(var22)) ? f48962(var22, (SubLObject)module0767.UNPROVIDED) : ConsesLow.list((SubLObject)module0767.NIL, (SubLObject)module0767.NIL));
    }
    
    public static SubLObject f48963(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        SubLObject var33 = (SubLObject)ConsesLow.list((SubLObject)module0767.NIL, (SubLObject)module0767.NIL);
        if (module0767.NIL != module0751.f47049(var22)) {
            var33 = f48964(var22, (SubLObject)module0767.UNPROVIDED);
        }
        return var33;
    }
    
    public static SubLObject f48964(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        return reader.bq_cons(module0603.f36861(var22), (SubLObject)module0767.$ic368$);
    }
    
    public static SubLObject f48965(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.$ic46$;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0767.NIL;
        if (module0767.NIL != module0579.$g4248$.getDynamicValue(var33)) {
            final SubLObject var35 = module0751.f46994(var22, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
            if (module0767.NIL != var35) {
                final SubLObject var36 = (module0767.NIL != module0751.f46684(var22, var35, (SubLObject)module0767.UNPROVIDED)) ? var35 : module0751.f46677(var35);
                final SubLObject var37 = module0763.f48248((SubLObject)ConsesLow.list(module0767.$ic369$, (SubLObject)ConsesLow.list(module0767.$ic370$, module0767.$ic49$, var36)), (SubLObject)module0767.UNPROVIDED);
                module0756.f47465(var37, var22);
                module0756.f47784(var37, var32, (SubLObject)module0767.UNPROVIDED);
                final SubLObject var38 = module0579.$g4287$.currentBinding(var33);
                try {
                    module0579.$g4287$.bind((SubLObject)module0767.TWO_INTEGER, var33);
                    module0770.f49065(var37, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                }
                finally {
                    module0579.$g4287$.rebind(var38, var33);
                }
                if (module0767.NIL != module0756.f47479(var37)) {
                    module0756.f47709(var37, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
                    module0756.f47468(var37, var22);
                    var34 = module0756.f47467(var37).first();
                }
            }
        }
        return var34;
    }
    
    public static SubLObject f48962(final SubLObject var22, SubLObject var32) {
        if (var32 == module0767.UNPROVIDED) {
            var32 = (SubLObject)module0767.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0767.NIL;
        if (module0767.NIL == module0579.$g4247$.getDynamicValue(var33)) {
            var34 = print_high.prin1_to_string(var22);
        }
        else if (module0767.NIL != module0603.f36858(var22)) {
            var34 = module0603.f36861(var22);
        }
        else {
            var34 = module0213.f13925(var22, (SubLObject)module0767.UNPROVIDED);
            var34 = ((module0767.NIL != module0269.f17710(var22)) ? module0038.f2789(var34) : module0038.f2770(var34));
        }
        return reader.bq_cons(var34, (SubLObject)module0767.$ic368$);
    }
    
    public static SubLObject f48966(final SubLObject var546, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        return module0259.f16854(var546, module0767.$ic372$, var300, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48967(final SubLObject var546, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var547 = SubLProcess.currentSubLThread();
        final SubLObject var548 = module0034.$g879$.getDynamicValue(var547);
        SubLObject var549 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var548) {
            return f48966(var546, var300);
        }
        var549 = module0034.f1857(var548, (SubLObject)module0767.$ic371$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var549) {
            var549 = module0034.f1807(module0034.f1842(var548), (SubLObject)module0767.$ic371$, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.NIL, (SubLObject)module0767.EQL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var548, (SubLObject)module0767.$ic371$, var549);
        }
        final SubLObject var550 = module0034.f1782(var546, var300);
        final SubLObject var551 = module0034.f1814(var549, var550, (SubLObject)module0767.UNPROVIDED);
        if (var551 != module0767.$ic23$) {
            SubLObject var552 = var551;
            SubLObject var553 = (SubLObject)module0767.NIL;
            var553 = var552.first();
            while (module0767.NIL != var552) {
                SubLObject var554 = var553.first();
                final SubLObject var555 = conses_high.second(var553);
                if (var546.eql(var554.first())) {
                    var554 = var554.rest();
                    if (module0767.NIL != var554 && module0767.NIL == var554.rest() && var300.eql(var554.first())) {
                        return module0034.f1959(var555);
                    }
                }
                var552 = var552.rest();
                var553 = var552.first();
            }
        }
        final SubLObject var556 = Values.arg2(var547.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48966(var546, var300)));
        module0034.f1836(var549, var550, var551, var556, (SubLObject)ConsesLow.list(var546, var300));
        return module0034.f1959(var556);
    }
    
    public static SubLObject f48968(final SubLObject var547) {
        if (module0767.NIL != module0201.f12546(var547)) {
            return f48969(var547);
        }
        return f48970(var547, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48971(final SubLObject var547) {
        if (module0767.NIL != module0201.f12546(var547)) {
            return f48972(var547);
        }
        return f48973(var547);
    }
    
    public static SubLObject f48974(final SubLObject var548, final SubLObject var549) {
        return Equality.equal(f48968(var548), f48968(var549));
    }
    
    public static SubLObject f48975(final SubLObject var548, final SubLObject var549) {
        return Equality.equal(f48971(var548), f48971(var549));
    }
    
    public static SubLObject f48976(final SubLObject var548, final SubLObject var549) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != f48974(var548, var549) && module0767.NIL != f48975(var548, var549));
    }
    
    public static SubLObject f48977(final SubLObject var550, final SubLObject var551) {
        if (var550.eql(var551)) {
            return var550;
        }
        if (module0767.NIL == module0751.f46661((SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0578.f35470((SubLObject)module0767.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0767.T, (SubLObject)module0767.$ic373$);
        }
        if (module0767.NIL != module0004.f104(module0767.$ic374$, (SubLObject)ConsesLow.list(var550, var551), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            return module0767.$ic374$;
        }
        if (module0767.NIL != module0004.f104(module0767.$ic375$, (SubLObject)ConsesLow.list(var550, var551), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            return module0767.$ic375$;
        }
        if (module0767.NIL != module0004.f104(module0767.$ic376$, (SubLObject)ConsesLow.list(var550, var551), (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED)) {
            return module0767.$ic376$;
        }
        return module0767.$ic377$;
    }
    
    public static SubLObject f48978(final SubLObject var552, final SubLObject var553) {
        return (var552.eql(module0767.$ic378$) || var553.eql(module0767.$ic378$)) ? module0767.$ic378$ : module0767.$ic379$;
    }
    
    public static SubLObject f48979(final SubLObject var554, final SubLObject var555) {
        if (var554.eql(module0767.$ic380$) && var555.eql(module0767.$ic380$)) {
            return module0767.$ic380$;
        }
        if (var554.eql(module0767.$ic381$) || var555.eql(module0767.$ic381$)) {
            return module0767.$ic381$;
        }
        return module0767.$ic382$;
    }
    
    public static SubLObject f48969(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = (SubLObject)((module0767.NIL != module0754.f47310(var35)) ? module0754.f47332(var35) : module0767.NIL);
        final SubLObject var38 = f48883(module0579.$g4260$.getDynamicValue(var36));
        return (module0767.NIL != var37 && module0767.NIL != var38) ? f48980(var37, var38) : ((module0767.NIL != var38) ? f48981(var38, (SubLObject)module0767.UNPROVIDED) : f48982());
    }
    
    public static SubLObject f48980(final SubLObject var30, final SubLObject var556) {
        final SubLThread var557 = SubLProcess.currentSubLThread();
        if (module0767.NIL != module0751.f46676(var30)) {
            return f48981(var556, (SubLObject)module0767.UNPROVIDED);
        }
        if (module0767.NIL != module0201.f12546(var30)) {
            return f48981(var556, (SubLObject)module0767.UNPROVIDED);
        }
        final SubLObject var558 = module0751.f46781((SubLObject)module0767.$ic383$, (SubLObject)ConsesLow.listS(module0767.$ic384$, var556, var30, (SubLObject)module0767.$ic385$), module0579.$g4260$.getDynamicValue(var557), (SubLObject)module0767.$ic386$).first();
        if (module0767.NIL == var558 && module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0767.$ic387$, var30, var556);
        }
        return (module0767.NIL != var558) ? var558 : f48981(var556, (SubLObject)module0767.UNPROVIDED);
    }
    
    public static SubLObject f48883(final SubLObject var300) {
        return module0732.f45147(var300);
    }
    
    public static SubLObject f48983(final SubLObject var300) {
        final SubLObject var301 = f48883(var300);
        SubLObject var302 = conses_high.member(var301, module0767.$g6148$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0767.EQUAL), (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var302 && module0767.NIL != module0751.f46684(var301, module0767.$ic389$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL != module0751.f46848((SubLObject)ConsesLow.list(module0767.$ic390$, module0767.$ic391$, var301), module0767.$ic16$, (SubLObject)module0767.UNPROVIDED)) {
            var302 = (SubLObject)module0767.T;
            module0767.$g6148$.setGlobalValue((SubLObject)ConsesLow.cons(var301, module0767.$g6148$.getGlobalValue()));
        }
        return var302;
    }
    
    public static SubLObject f48984(final SubLObject var300) {
        final SubLObject var301 = f48883(var300);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0767.NIL != var301 && module0767.NIL == f48983(var300));
    }
    
    public static SubLObject f48982() {
        return module0767.$g6149$.getGlobalValue();
    }
    
    public static SubLObject f48985(final SubLObject var364, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0767.$ic393$;
        }
        final SubLObject var365 = module0751.f46781((SubLObject)module0767.$ic383$, (SubLObject)ConsesLow.listS(module0767.$ic394$, var364, (SubLObject)module0767.$ic385$), var300, (SubLObject)module0767.UNPROVIDED).first();
        return (module0767.NIL != var365) ? var365 : f48982();
    }
    
    public static SubLObject f48981(final SubLObject var364, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = module0767.$ic393$;
        }
        final SubLThread var365 = SubLProcess.currentSubLThread();
        final SubLObject var366 = module0034.$g879$.getDynamicValue(var365);
        SubLObject var367 = (SubLObject)module0767.NIL;
        if (module0767.NIL == var366) {
            return f48985(var364, var300);
        }
        var367 = module0034.f1857(var366, (SubLObject)module0767.$ic392$, (SubLObject)module0767.UNPROVIDED);
        if (module0767.NIL == var367) {
            var367 = module0034.f1807(module0034.f1842(var366), (SubLObject)module0767.$ic392$, (SubLObject)module0767.TWO_INTEGER, (SubLObject)module0767.EIGHT_INTEGER, (SubLObject)module0767.EQUAL, (SubLObject)module0767.UNPROVIDED);
            module0034.f1860(var366, (SubLObject)module0767.$ic392$, var367);
        }
        final SubLObject var368 = module0034.f1782(var364, var300);
        final SubLObject var369 = module0034.f1814(var367, var368, (SubLObject)module0767.UNPROVIDED);
        if (var369 != module0767.$ic23$) {
            SubLObject var370 = var369;
            SubLObject var371 = (SubLObject)module0767.NIL;
            var371 = var370.first();
            while (module0767.NIL != var370) {
                SubLObject var372 = var371.first();
                final SubLObject var373 = conses_high.second(var371);
                if (var364.equal(var372.first())) {
                    var372 = var372.rest();
                    if (module0767.NIL != var372 && module0767.NIL == var372.rest() && var300.equal(var372.first())) {
                        return module0034.f1959(var373);
                    }
                }
                var370 = var370.rest();
                var371 = var370.first();
            }
        }
        final SubLObject var374 = Values.arg2(var365.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48985(var364, var300)));
        module0034.f1836(var367, var368, var369, var374, (SubLObject)ConsesLow.list(var364, var300));
        return module0034.f1959(var374);
    }
    
    public static SubLObject f48972(final SubLObject var35) {
        if (module0767.NIL != module0755.f47386(var35)) {
            return module0755.f47393(var35);
        }
        if (module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0767.$ic395$, var35);
        }
        return module0767.$ic379$;
    }
    
    public static SubLObject f48973(final SubLObject var22) {
        if (module0767.NIL != module0755.f47386(var22)) {
            return module0755.f47393(var22);
        }
        return f48986(var22);
    }
    
    public static SubLObject f48986(final SubLObject var22) {
        if (module0767.NIL != module0751.f46684(var22, module0767.$ic396$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0751.f46684(var22, module0767.$ic397$, (SubLObject)module0767.UNPROVIDED) && module0767.NIL == module0751.f46684(var22, module0767.$ic398$, (SubLObject)module0767.UNPROVIDED)) {
            return module0767.$ic378$;
        }
        return module0767.$ic379$;
    }
    
    public static SubLObject f48970(final SubLObject var22, SubLObject var300) {
        if (var300 == module0767.UNPROVIDED) {
            var300 = f48872((SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED);
        }
        final SubLThread var301 = SubLProcess.currentSubLThread();
        final SubLObject var302 = f48883(module0579.$g4260$.getDynamicValue(var301));
        SubLObject var303 = (SubLObject)module0767.NIL;
        SubLObject var304 = (SubLObject)module0767.NIL;
        if (module0767.NIL != var302 && module0767.NIL != module0202.f12691(var22, (SubLObject)module0767.UNPROVIDED)) {
            final SubLObject var305 = module0003.f61();
            try {
                var301.throwStack.push(var305);
                final SubLObject var306 = module0003.$g4$.currentBinding(var301);
                try {
                    module0003.$g4$.bind((SubLObject)module0767.T, var301);
                    SubLObject var307 = (SubLObject)module0767.NIL;
                    try {
                        final SubLObject var9_562 = module0003.$g5$.currentBinding(var301);
                        try {
                            module0003.$g5$.bind(Numbers.add((SubLObject)module0767.ONE_INTEGER, module0003.$g5$.getDynamicValue(var301)), var301);
                            var307 = module0003.f62((SubLObject)module0767.TWO_INTEGER, var305);
                            var303 = module0751.f46781((SubLObject)module0767.$ic383$, (SubLObject)ConsesLow.listS(module0767.$ic399$, var302, var22, (SubLObject)module0767.$ic385$), var300, (SubLObject)module0767.$ic386$).first();
                        }
                        finally {
                            module0003.$g5$.rebind(var9_562, var301);
                        }
                    }
                    finally {
                        final SubLObject var9_563 = Threads.$is_thread_performing_cleanupP$.currentBinding(var301);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0767.T, var301);
                            module0003.f64(var307);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var9_563, var301);
                        }
                    }
                }
                finally {
                    module0003.$g4$.rebind(var306, var301);
                }
            }
            catch (Throwable var308) {
                var304 = Errors.handleThrowable(var308, var305);
            }
            finally {
                var301.throwStack.pop();
            }
        }
        if (module0767.NIL == var303 && module0767.NIL != module0578.f35470((SubLObject)module0767.ONE_INTEGER) && module0767.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0767.$ic400$, var22, var300);
        }
        return (module0767.NIL != var303) ? var303 : ((module0767.NIL != var302) ? f48981(var302, (SubLObject)module0767.UNPROVIDED) : f48982());
    }
    
    public static SubLObject f48987(final SubLObject var547) {
        if (module0767.NIL != module0755.f47386(var547)) {
            return module0755.f47390(var547);
        }
        return f48988();
    }
    
    public static SubLObject f48988() {
        return module0767.$ic380$;
    }
    
    public static SubLObject f48989() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48780", "S#53275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48789", "S#53276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48791", "S#53277", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48792", "S#53278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48793", "S#53279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48790", "S#53280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48795", "S#53281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48794", "S#53282", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48796", "S#53283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48797", "S#53284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48783", "S#53285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48800", "S#53286", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48804", "S#53287", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48805", "S#53288", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48803", "S#53289", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48801", "S#53290", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48799", "S#51737", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48808", "S#53291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48806", "S#53292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48809", "S#53293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48807", "S#53294", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48811", "S#53295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48802", "S#53296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48812", "S#53297", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48814", "S#53298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48813", "S#53299", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48817", "S#53300", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48818", "S#53301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48819", "S#53302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48810", "S#53303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48821", "S#53304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48822", "S#53305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48820", "S#53306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48823", "S#53307", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48825", "S#53308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48824", "S#53309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48826", "S#53310", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48827", "S#53311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48816", "S#53312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48828", "S#53313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48829", "S#53314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48830", "S#53315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48831", "S#53316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48815", "S#53317", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48832", "S#53318", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48833", "S#53319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48834", "S#53320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48835", "S#53321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48781", "S#51664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48837", "S#53322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48838", "S#53323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48839", "S#53324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48840", "S#52888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48841", "S#53325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48842", "S#53326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48843", "S#53327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48844", "S#53328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48845", "S#53329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48846", "S#53330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48847", "S#53331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48848", "S#53332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48836", "S#53333", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48853", "S#53334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48850", "S#53335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48851", "S#53336", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48849", "S#53337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48798", "S#52889", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48854", "S#53338", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48855", "S#53339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48856", "S#53340", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48852", "S#52986", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48857", "S#53341", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48858", "S#52887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48859", "S#53342", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48860", "S#49151", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48861", "S#53343", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48862", "S#53344", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48863", "S#53345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48865", "S#41506", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48866", "S#53346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48867", "S#53347", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48868", "S#53348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48869", "S#52890", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48870", "S#53349", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48871", "S#53350", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48874", "S#53351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48876", "S#53352", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48878", "S#53353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48879", "S#53354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48880", "S#53355", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48881", "S#53356", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48882", "S#53357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48872", "S#39293", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48873", "S#39292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48884", "S#53358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48875", "S#53359", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48886", "S#53360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48885", "S#53361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48887", "S#53362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48888", "S#53363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48890", "S#53364", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48889", "S#53365", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48892", "S#53366", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48893", "S#53367", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48894", "S#53368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48891", "S#53369", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48895", "S#53370", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48896", "S#53371", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48877", "S#53372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48897", "S#53373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48898", "S#53374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48864", "S#53375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48899", "S#53376", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48900", "S#50606", 1, 1, false);
        new $f48900$UnaryFunction();
        new $f48900$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48901", "S#53377", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48902", "S#53378", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48903", "S#53379", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48904", "S#53380", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48905", "S#53381", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48787", "S#53382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48786", "S#53383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48785", "S#53384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48908", "S#53385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48907", "S#53386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48784", "S#53387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48909", "S#53388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48911", "S#53389", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48910", "S#53390", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48912", "S#52984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48913", "S#53391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48914", "S#52985", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48915", "S#52358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48918", "S#53392", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48916", "S#53393", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48917", "S#53394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48919", "S#50945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48920", "S#53395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48921", "S#53396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48922", "S#53397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48923", "S#53398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48924", "S#52356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48925", "S#53399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48926", "S#52547", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48927", "S#53400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48929", "S#53401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48931", "S#53402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48932", "S#53403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48933", "S#53404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48935", "S#53405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48934", "S#53406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48936", "S#53407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48930", "S#52546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48937", "S#53408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48938", "S#53409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48940", "S#53410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48939", "S#53411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48941", "S#53412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48928", "S#53413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48942", "S#53414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48943", "S#53415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48944", "S#53416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48788", "S#53417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48945", "S#53418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48946", "S#53419", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48782", "S#53420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48947", "S#53421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48906", "S#53422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48948", "S#53423", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48949", "S#53424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48953", "S#53425", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48954", "S#53426", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48955", "S#53427", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48956", "S#53428", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48957", "S#53429", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48958", "S#53430", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48950", "S#53431", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48951", "S#53432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48959", "S#53433", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48952", "S#53434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48960", "S#53435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48961", "S#53436", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48963", "S#53437", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48964", "S#53438", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48965", "S#53439", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48962", "S#53440", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48966", "S#53441", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48967", "S#53442", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48968", "S#51844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48971", "S#51936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48974", "S#53443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48975", "S#53444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48976", "S#53445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48977", "S#51934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48978", "S#53446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48979", "S#51933", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48969", "S#53447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48980", "S#53448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48883", "S#53449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48983", "S#53450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48984", "S#50998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48982", "S#53451", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48985", "S#53452", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48981", "S#53453", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48972", "S#53454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48973", "S#53455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48986", "S#51840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48970", "S#53456", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48987", "S#51935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0767", "f48988", "S#51836", 0, 0, false);
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48990() {
        module0767.$g6130$ = SubLFiles.deflexical("S#53457", module0067.f4880(Symbols.symbol_function((SubLObject)module0767.EQUAL), (SubLObject)module0767.UNPROVIDED));
        module0767.$g6131$ = SubLFiles.deflexical("S#53458", (SubLObject)module0767.NIL);
        module0767.$g6132$ = SubLFiles.defparameter("S#53459", (SubLObject)module0767.NIL);
        module0767.$g6133$ = SubLFiles.deflexical("S#53460", (module0767.NIL != Symbols.boundp((SubLObject)module0767.$ic153$)) ? module0767.$g6133$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0767.$ic154$, (SubLObject)module0767.UNPROVIDED, (SubLObject)module0767.UNPROVIDED));
        module0767.$g6134$ = SubLFiles.defparameter("S#53461", (SubLObject)module0767.$ic155$);
        module0767.$g6135$ = SubLFiles.deflexical("S#53462", (SubLObject)module0767.NIL);
        module0767.$g6137$ = SubLFiles.deflexical("S#53463", (SubLObject)module0767.NIL);
        module0767.$g6138$ = SubLFiles.deflexical("S#53464", (SubLObject)module0767.NIL);
        module0767.$g6139$ = SubLFiles.deflexical("S#53465", (SubLObject)module0767.NIL);
        module0767.$g6136$ = SubLFiles.deflexical("S#53466", (SubLObject)module0767.$ic232$);
        module0767.$g6140$ = SubLFiles.deflexical("S#53467", (SubLObject)module0767.$ic268$);
        module0767.$g6141$ = SubLFiles.deflexical("S#53468", (SubLObject)module0767.$ic269$);
        module0767.$g6142$ = SubLFiles.deflexical("S#53469", (SubLObject)((module0767.NIL != Symbols.boundp((SubLObject)module0767.$ic288$)) ? module0767.$g6142$.getGlobalValue() : module0767.NIL));
        module0767.$g6143$ = SubLFiles.defparameter("S#53470", (SubLObject)module0767.NIL);
        module0767.$g6144$ = SubLFiles.deflexical("S#53471", (SubLObject)module0767.$ic353$);
        module0767.$g6145$ = SubLFiles.deflexical("S#53472", (SubLObject)module0767.NIL);
        module0767.$g6146$ = SubLFiles.defparameter("S#53473", (SubLObject)module0767.NIL);
        module0767.$g6147$ = SubLFiles.defparameter("S#53474", (SubLObject)module0767.$ic366$);
        module0767.$g6148$ = SubLFiles.deflexical("S#53475", (SubLObject)module0767.$ic388$);
        module0767.$g6149$ = SubLFiles.deflexical("S#53476", module0767.$ic376$);
        return (SubLObject)module0767.NIL;
    }
    
    public static SubLObject f48991() {
        module0762.f48147((SubLObject)module0767.$ic10$, (SubLObject)module0767.$ic11$, (SubLObject)module0767.$ic12$);
        module0034.f1909((SubLObject)module0767.$ic15$);
        module0762.f48147((SubLObject)module0767.$ic28$, (SubLObject)module0767.$ic29$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic3$, (SubLObject)module0767.$ic33$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic3$, (SubLObject)module0767.$ic34$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic107$, (SubLObject)module0767.$ic108$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic109$, (SubLObject)module0767.$ic110$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic112$, (SubLObject)module0767.$ic113$, (SubLObject)module0767.$ic12$);
        module0762.f48147((SubLObject)module0767.$ic0$, (SubLObject)module0767.$ic115$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic121$, (SubLObject)module0767.$ic122$, (SubLObject)module0767.$ic12$);
        module0762.f48147((SubLObject)module0767.$ic144$, (SubLObject)module0767.$ic145$, (SubLObject)module0767.$ic146$);
        module0762.f48147((SubLObject)module0767.$ic149$, (SubLObject)module0767.$ic150$, (SubLObject)module0767.$ic146$);
        module0003.f57((SubLObject)module0767.$ic153$);
        module0034.f1895((SubLObject)module0767.$ic189$);
        module0034.f1909((SubLObject)module0767.$ic196$);
        module0034.f1909((SubLObject)module0767.$ic204$);
        module0034.f1909((SubLObject)module0767.$ic213$);
        module0034.f1895((SubLObject)module0767.$ic221$);
        module0034.f1909((SubLObject)module0767.$ic224$);
        module0762.f48147((SubLObject)module0767.$ic7$, (SubLObject)module0767.$ic238$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic6$, (SubLObject)module0767.$ic238$, (SubLObject)module0767.$ic12$);
        module0762.f48147((SubLObject)module0767.$ic5$, (SubLObject)module0767.$ic238$, (SubLObject)module0767.$ic12$);
        module0762.f48147((SubLObject)module0767.$ic4$, (SubLObject)module0767.$ic238$, (SubLObject)module0767.$ic146$);
        module0034.f1895((SubLObject)module0767.$ic245$);
        module0762.f48147((SubLObject)module0767.$ic249$, (SubLObject)module0767.$ic250$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic251$, (SubLObject)module0767.$ic250$, (SubLObject)module0767.$ic146$);
        module0762.f48147((SubLObject)module0767.$ic252$, (SubLObject)module0767.$ic253$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic257$, (SubLObject)module0767.$ic258$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic273$, (SubLObject)module0767.$ic274$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic281$, (SubLObject)module0767.$ic282$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic285$, (SubLObject)module0767.$ic286$, (SubLObject)module0767.$ic146$);
        module0762.f48147((SubLObject)module0767.$ic285$, (SubLObject)module0767.$ic287$, (SubLObject)module0767.$ic146$);
        module0003.f57((SubLObject)module0767.$ic288$);
        module0762.f48147((SubLObject)module0767.$ic290$, (SubLObject)module0767.$ic291$, (SubLObject)module0767.$ic30$);
        module0034.f1895((SubLObject)module0767.$ic308$);
        module0027.f1449((SubLObject)module0767.$ic315$, (SubLObject)ConsesLow.list(new SubLObject[] { module0767.$ic316$, module0767.EQUAL, module0767.$ic317$, module0767.NIL, module0767.$ic318$, module0767.$ic319$, module0767.$ic320$, module0767.$ic321$, module0767.$ic322$, module0767.T }), (SubLObject)module0767.$ic323$);
        module0034.f1895((SubLObject)module0767.$ic332$);
        module0027.f1449((SubLObject)module0767.$ic339$, (SubLObject)ConsesLow.list(new SubLObject[] { module0767.$ic316$, module0767.EQUAL, module0767.$ic317$, module0767.NIL, module0767.$ic318$, module0767.$ic319$, module0767.$ic320$, module0767.$ic321$, module0767.$ic322$, module0767.T }), (SubLObject)module0767.$ic340$);
        module0762.f48147((SubLObject)module0767.$ic9$, (SubLObject)module0767.$ic346$, (SubLObject)module0767.$ic30$);
        module0762.f48147((SubLObject)module0767.$ic2$, (SubLObject)module0767.$ic348$, (SubLObject)module0767.$ic12$);
        module0762.f48147((SubLObject)module0767.$ic349$, (SubLObject)module0767.$ic350$, (SubLObject)module0767.$ic12$);
        module0034.f1909((SubLObject)module0767.$ic354$);
        module0034.f1895((SubLObject)module0767.$ic357$);
        module0034.f1895((SubLObject)module0767.$ic371$);
        module0034.f1895((SubLObject)module0767.$ic392$);
        return (SubLObject)module0767.NIL;
    }
    
    public void declareFunctions() {
        f48989();
    }
    
    public void initializeVariables() {
        f48990();
    }
    
    public void runTopLevelForms() {
        f48991();
    }
    
    static {
        me = (SubLFile)new module0767();
        module0767.$g6130$ = null;
        module0767.$g6131$ = null;
        module0767.$g6132$ = null;
        module0767.$g6133$ = null;
        module0767.$g6134$ = null;
        module0767.$g6135$ = null;
        module0767.$g6137$ = null;
        module0767.$g6138$ = null;
        module0767.$g6139$ = null;
        module0767.$g6136$ = null;
        module0767.$g6140$ = null;
        module0767.$g6141$ = null;
        module0767.$g6142$ = null;
        module0767.$g6143$ = null;
        module0767.$g6144$ = null;
        module0767.$g6145$ = null;
        module0767.$g6146$ = null;
        module0767.$g6147$ = null;
        module0767.$g6148$ = null;
        module0767.$g6149$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#51664", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#53011", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#53420", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#53285", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#53387", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#53384", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#53383", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#53382", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#53070", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#53417", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#53276", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("SKOLEM-TERM");
        $ic12$ = SubLObjectFactory.makeKeyword("DECENT");
        $ic13$ = SubLObjectFactory.makeKeyword("HTML");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameString"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#53280", "CYC");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic17$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic19$ = SubLObjectFactory.makeString("Object");
        $ic20$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("massNumber")));
        $ic21$ = SubLObjectFactory.makeString("-");
        $ic22$ = SubLObjectFactory.makeSymbol("S#53458", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic24$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#53284", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("HYPOTHETICAL");
        $ic30$ = SubLObjectFactory.makeKeyword("BEST");
        $ic31$ = SubLObjectFactory.makeSymbol("S#53349", "CYC");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $ic33$ = SubLObjectFactory.makeKeyword("VARIABLE");
        $ic34$ = SubLObjectFactory.makeKeyword("LEXIFIED-VARIABLE");
        $ic35$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39248", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39249", "CYC"));
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Instance-TheWord"));
        $ic37$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $ic38$ = SubLObjectFactory.makeString("instance");
        $ic39$ = SubLObjectFactory.makeString(" of");
        $ic40$ = SubLObjectFactory.makeKeyword("INDEFINITE");
        $ic41$ = SubLObjectFactory.makeString("some");
        $ic42$ = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $ic43$ = SubLObjectFactory.makeString("every");
        $ic44$ = SubLObjectFactory.makeKeyword("NO");
        $ic45$ = SubLObjectFactory.makeString("no");
        $ic46$ = SubLObjectFactory.makeKeyword("ANY");
        $ic47$ = SubLObjectFactory.makeString("any");
        $ic48$ = SubLObjectFactory.makeSymbol("S#15821", "CYC");
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $ic50$ = SubLObjectFactory.makeString("~&Paraphrasing ~S as ~S in context ~S.~%");
        $ic51$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic52$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $ic53$ = SubLObjectFactory.makeSymbol("S#51086", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#51074", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#51073", "CYC");
        $ic56$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $ic57$ = SubLObjectFactory.makeString("Can't reconcile ~S with ~S");
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FacetingCollectionType"));
        $ic59$ = SubLObjectFactory.makeSymbol("?TG");
        $ic60$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("typeGenls"));
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TG"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#51433", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $ic64$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic65$ = SubLObjectFactory.makeKeyword("STACK");
        $ic66$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic68$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic70$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic71$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic72$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic73$ = SubLObjectFactory.makeString("continue anyway");
        $ic74$ = SubLObjectFactory.makeKeyword("WARN");
        $ic75$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic77$ = SubLObjectFactory.makeString("Skipping ~S as too highly faceted (threshold = ~S).");
        $ic78$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic79$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic80$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic81$ = SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSB");
        $ic82$ = SubLObjectFactory.makeKeyword("DEFINITE");
        $ic83$ = SubLObjectFactory.makeKeyword("WHAT");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CODE"), (SubLObject)SubLObjectFactory.makeSymbol("S#51659", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC")));
        $ic85$ = SubLObjectFactory.makeSymbol("S#4", "CYC");
        $ic86$ = SubLObjectFactory.makeString("Bound by universal introduction: ~S");
        $ic87$ = SubLObjectFactory.makeKeyword("START");
        $ic88$ = SubLObjectFactory.makeString("if");
        $ic89$ = SubLObjectFactory.makeKeyword("FOUND-IF");
        $ic90$ = SubLObjectFactory.makeKeyword("FOUND-VAR-DTR");
        $ic91$ = SubLObjectFactory.makeString(",");
        $ic92$ = SubLObjectFactory.makeString("Arg position ~S applied to top-level cycl ~S does not yield correct var ~S but rather ~S!~%*pph-cycls*: ~S~%");
        $ic93$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic94$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic95$ = SubLObjectFactory.makeString("Var ~S at arg-position ~S in cycl ~S not in non-veridical environment.~%");
        $ic96$ = SubLObjectFactory.makeString("Quantifier for var ~S not found in top-level cycl!~%");
        $ic97$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence")));
        $ic98$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#53477", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53478", "CYC"));
        $ic99$ = SubLObjectFactory.makeString("it");
        $ic100$ = SubLObjectFactory.makeString("the");
        $ic101$ = SubLObjectFactory.makeString("thing");
        $ic102$ = SubLObjectFactory.makeString("something");
        $ic103$ = SubLObjectFactory.makeString("everything");
        $ic104$ = SubLObjectFactory.makeString("other");
        $ic105$ = SubLObjectFactory.makeString("another");
        $ic106$ = SubLObjectFactory.makeString("Explicitifying ~S");
        $ic107$ = SubLObjectFactory.makeSymbol("S#53319", "CYC");
        $ic108$ = SubLObjectFactory.makeKeyword("KEYWORD");
        $ic109$ = SubLObjectFactory.makeSymbol("S#53320", "CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("CYCL-SYMBOL");
        $ic111$ = SubLObjectFactory.makeString("the SubL symbol ");
        $ic112$ = SubLObjectFactory.makeSymbol("S#53321", "CYC");
        $ic113$ = SubLObjectFactory.makeKeyword("NON-CYCL-SYMBOL");
        $ic114$ = SubLObjectFactory.makeString("the symbol ");
        $ic115$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic116$ = SubLObjectFactory.makeSymbol("S#53379", "CYC");
        $ic117$ = SubLObjectFactory.makeKeyword("PRECISE");
        $ic118$ = SubLObjectFactory.makeString("~&Shadowing discourse context...~%");
        $ic119$ = SubLObjectFactory.makeKeyword("GOOD");
        $ic120$ = SubLObjectFactory.makeString("~&GENERATE-CONSTANT-DEFAULT: Trying again with :ANY quality.~%");
        $ic121$ = SubLObjectFactory.makeSymbol("S#53322", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("LEXICAL-WORD");
        $ic123$ = SubLObjectFactory.makeString("-TheWord");
        $ic124$ = SubLObjectFactory.makeString("-MWW");
        $ic125$ = SubLObjectFactory.makeString("RKF-");
        $ic126$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $ic127$ = SubLObjectFactory.makeString("the word ");
        $ic128$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("chemicalFormulaString"));
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52300", "CYC"));
        $ic130$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ElectronicCharge"));
        $ic131$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ElementalSubstanceFn")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $ic132$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0767.ONE_INTEGER));
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("?QUANTITIES"));
        $ic135$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeAtomicComposition-List"));
        $ic136$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $ic137$ = SubLObjectFactory.makeSymbol("?CHARGE");
        $ic138$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("chargeOfObject"));
        $ic139$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CHARGE"));
        $ic140$ = SubLObjectFactory.makeSymbol("?MOLECULE-TYPE");
        $ic141$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("moleculesOfCompoundType"));
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MOLECULE-TYPE"));
        $ic143$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ChemicalSubstanceFn"));
        $ic144$ = SubLObjectFactory.makeSymbol("S#53330", "CYC");
        $ic145$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic146$ = SubLObjectFactory.makeKeyword("FALLBACK");
        $ic147$ = SubLObjectFactory.makeString("some statement in the KB is true");
        $ic148$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic149$ = SubLObjectFactory.makeSymbol("S#53331", "CYC");
        $ic150$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic151$ = SubLObjectFactory.makeString("some statement in the KB is false");
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic153$ = SubLObjectFactory.makeSymbol("S#53460", "CYC");
        $ic154$ = SubLObjectFactory.makeInteger(256);
        $ic155$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#50606", "CYC"), SubLObjectFactory.makeSymbol("S#52894", "CYC"), SubLObjectFactory.makeSymbol("S#52885", "CYC"), SubLObjectFactory.makeSymbol("S#52886", "CYC"), SubLObjectFactory.makeSymbol("S#53437", "CYC"), SubLObjectFactory.makeSymbol("S#53436", "CYC"), SubLObjectFactory.makeSymbol("S#52923", "CYC"), SubLObjectFactory.makeSymbol("S#53371", "CYC"), SubLObjectFactory.makeSymbol("S#53378", "CYC"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"), (SubLObject)module0767.TWO_INTEGER), SubLObjectFactory.makeSymbol("S#53479", "CYC"), SubLObjectFactory.makeSymbol("S#52922", "CYC"), SubLObjectFactory.makeSymbol("S#53349", "CYC"), SubLObjectFactory.makeSymbol("S#53379", "CYC"), SubLObjectFactory.makeSymbol("S#53370", "CYC"), SubLObjectFactory.makeSymbol("S#53380", "CYC"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"), (SubLObject)module0767.ONE_INTEGER), SubLObjectFactory.makeSymbol("S#52924", "CYC"), SubLObjectFactory.makeSymbol("S#53381", "CYC"), SubLObjectFactory.makeSymbol("S#53439", "CYC"), SubLObjectFactory.makeSymbol("S#53377", "CYC"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"), (SubLObject)module0767.ONE_INTEGER), SubLObjectFactory.makeSymbol("S#53440", "CYC"), SubLObjectFactory.makeSymbol("S#53438", "CYC") });
        $ic156$ = SubLObjectFactory.makeString("~&SELECT-STRING-METHOD: NL-PREDS is ~S.~%");
        $ic157$ = SubLObjectFactory.makeString("~&SELECT-STRING-METHOD: Precision is ~S.~%");
        $ic158$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52898", "CYC"));
        $ic159$ = SubLObjectFactory.makeSymbol("S#52972", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic161$ = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $ic162$ = SubLObjectFactory.makeString("Added ~S alternatives for~% ~S");
        $ic163$ = SubLObjectFactory.makeString("~&SELECT-STRING-METHOD: the function ~S returned NIL for ~S.~%");
        $ic164$ = SubLObjectFactory.makeString("PPH timeout time reached.");
        $ic165$ = SubLObjectFactory.makeSymbol("S#53333", "CYC");
        $ic166$ = SubLObjectFactory.makeKeyword("DEMERITS");
        $ic167$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic168$ = SubLObjectFactory.makeKeyword("NL-PREDS");
        $ic169$ = SubLObjectFactory.makeKeyword("INCREMENTAL-DEMERITS");
        $ic170$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic171$ = SubLObjectFactory.makeString("~&SELECT-STRING-METHOD: Calling ~S on ~S.~%");
        $ic172$ = SubLObjectFactory.makeSymbol("S#50691", "CYC");
        $ic173$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"), (SubLObject)module0767.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"));
        $ic174$ = SubLObjectFactory.makeString("~&SELECT-STRING-METHOD: Function ~S returned ~S.~%");
        $ic175$ = SubLObjectFactory.makeSymbol("S#50606", "CYC");
        $ic176$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Noun"));
        $ic177$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definiteDescriptions"));
        $ic178$ = SubLObjectFactory.makeString("the ");
        $ic179$ = SubLObjectFactory.makeString("Removing determiner to form Nbar.");
        $ic180$ = SubLObjectFactory.makeString("Paraphrasing ~S as an NP.");
        $ic181$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings")));
        $ic182$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $ic183$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic")));
        $ic184$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("massNumber-Generic")));
        $ic185$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings"));
        $ic186$ = SubLObjectFactory.makeSymbol("S#51008", "CYC");
        $ic187$ = SubLObjectFactory.makeString("Adding #$properNameStrings to ~S");
        $ic188$ = SubLObjectFactory.makeSymbol("S#51012", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#49151", "CYC");
        $ic190$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic191$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic192$ = SubLObjectFactory.makeString(") ");
        $ic193$ = SubLObjectFactory.makeString("Trying to paraphrase ~S with no NL preds.");
        $ic194$ = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $ic195$ = SubLObjectFactory.makeInteger(500);
        $ic196$ = SubLObjectFactory.makeSymbol("S#41506", "CYC");
        $ic197$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $ic198$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Strict"));
        $ic199$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic200$ = SubLObjectFactory.makeSymbol("S#19639", "CYC");
        $ic201$ = SubLObjectFactory.makeSymbol("S#53462", "CYC");
        $ic202$ = SubLObjectFactory.makeInteger(128);
        $ic203$ = SubLObjectFactory.makeSymbol("S#53343", "CYC");
        $ic204$ = SubLObjectFactory.makeSymbol("S#52890", "CYC");
        $ic205$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredTermStrings"));
        $ic206$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Loose"));
        $ic207$ = SubLObjectFactory.makeSymbol("S#53463", "CYC");
        $ic208$ = SubLObjectFactory.makeSymbol("S#53346", "CYC");
        $ic209$ = SubLObjectFactory.makeString("Broadening *PPH-LANGUAGE-MT* to ~S");
        $ic210$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic211$ = SubLObjectFactory.makeSymbol("SPEC-POS-PRED?");
        $ic212$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationString"));
        $ic213$ = SubLObjectFactory.makeSymbol("S#39293", "CYC");
        $ic214$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic215$ = SubLObjectFactory.makeSymbol("S#53464", "CYC");
        $ic216$ = SubLObjectFactory.makeSymbol("S#53355", "CYC");
        $ic217$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("validatedLexicalPSCForLanguage"));
        $ic218$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("dispreferredLexification"));
        $ic219$ = SubLObjectFactory.makeString("Generated name for ~S from~% ~S");
        $ic220$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ChemicalSubstanceType"));
        $ic221$ = SubLObjectFactory.makeSymbol("S#53361", "CYC");
        $ic222$ = SubLObjectFactory.makeSymbol("S#53363", "CYC");
        $ic223$ = SubLObjectFactory.makeKeyword("CLEARED");
        $ic224$ = SubLObjectFactory.makeSymbol("S#53369", "CYC");
        $ic225$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationString-PN"));
        $ic226$ = SubLObjectFactory.makeSymbol("S#53465", "CYC");
        $ic227$ = SubLObjectFactory.makeInteger(25);
        $ic228$ = SubLObjectFactory.makeSymbol("S#53366", "CYC");
        $ic229$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $ic230$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The "), (SubLObject)SubLObjectFactory.makeString("A "), (SubLObject)SubLObjectFactory.makeString("An "));
        $ic231$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Artifact-Generic"));
        $ic232$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("middleName")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("scientificName")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("nicknames")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("firstName")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("givenNames")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("familyName")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("formerName")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("placeName-LocalLongForm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("placeName-LocalShortForm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryName-LocalLongForm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryName-LocalShortForm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("epistleAddresseeText")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationString-PN")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("internetCountryCode")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryCodeDigraph")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("geopoliticalEntityCodeDigraph")) });
        $ic233$ = SubLObjectFactory.makeSymbol("S#53376", "CYC");
        $ic234$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("scientificName"));
        $ic235$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("prettyString-Canonical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("prettyString")));
        $ic236$ = SubLObjectFactory.makeKeyword("GAF");
        $ic237$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53381", "CYC"));
        $ic238$ = SubLObjectFactory.makeKeyword("NART");
        $ic239$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $ic240$ = SubLObjectFactory.makeString("Couldn't find ~S lexification with preds ~S for~% ~S");
        $ic241$ = SubLObjectFactory.makeString("Reverted to original phrase.");
        $ic242$ = SubLObjectFactory.makeString("~&GENERATE-NART-AS-NAUT paraphrasing ~S with category ~S.~%");
        $ic243$ = SubLObjectFactory.makeString("~&GENERATE-NART-AS-NAUT found unjustified string ~S for ~S.~%");
        $ic244$ = SubLObjectFactory.makeKeyword("OK-NAT-TEMPLATE");
        $ic245$ = SubLObjectFactory.makeSymbol("S#53390", "CYC");
        $ic246$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic247$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained"));
        $ic248$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate"));
        $ic249$ = SubLObjectFactory.makeSymbol("S#52984", "CYC");
        $ic250$ = SubLObjectFactory.makeKeyword("UNIVERSAL-DATE");
        $ic251$ = SubLObjectFactory.makeSymbol("S#53391", "CYC");
        $ic252$ = SubLObjectFactory.makeSymbol("S#52985", "CYC");
        $ic253$ = SubLObjectFactory.makeKeyword("UNIVERSAL-SECOND");
        $ic254$ = SubLObjectFactory.makeKeyword("SECOND");
        $ic255$ = SubLObjectFactory.makeKeyword("MINUTE");
        $ic256$ = SubLObjectFactory.makeString(":00");
        $ic257$ = SubLObjectFactory.makeSymbol("S#52358", "CYC");
        $ic258$ = SubLObjectFactory.makeKeyword("FLOAT");
        $ic259$ = SubLObjectFactory.makeString("E0");
        $ic260$ = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $ic261$ = SubLObjectFactory.makeString(".0");
        $ic262$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MultiplicationSign-TheSymbol"));
        $ic263$ = SubLObjectFactory.makeString("10");
        $ic264$ = SubLObjectFactory.makeString("+");
        $ic265$ = SubLObjectFactory.makeString("E");
        $ic266$ = SubLObjectFactory.makeString("d");
        $ic267$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic268$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("no"), SubLObjectFactory.makeString("one"), SubLObjectFactory.makeString("two"), SubLObjectFactory.makeString("three"), SubLObjectFactory.makeString("four"), SubLObjectFactory.makeString("five"), SubLObjectFactory.makeString("six"), SubLObjectFactory.makeString("seven"), SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("nine"), SubLObjectFactory.makeString("ten"), SubLObjectFactory.makeString("eleven"), SubLObjectFactory.makeString("twelve"), SubLObjectFactory.makeString("thirteen"), SubLObjectFactory.makeString("fourteen"), SubLObjectFactory.makeString("fifteen"), SubLObjectFactory.makeString("sixteen"), SubLObjectFactory.makeString("seventeen"), SubLObjectFactory.makeString("eighteen"), SubLObjectFactory.makeString("nineteen") });
        $ic269$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0767.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeString("twenty")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeString("thirty")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)SubLObjectFactory.makeString("forty")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeString("fifty")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)SubLObjectFactory.makeString("sixty")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(70), (SubLObject)SubLObjectFactory.makeString("seventy")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(80), (SubLObject)SubLObjectFactory.makeString("eighty")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(90), (SubLObject)SubLObjectFactory.makeString("ninety")));
        $ic270$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic271$ = SubLObjectFactory.makeInteger(100);
        $ic272$ = SubLObjectFactory.makeString(" ");
        $ic273$ = SubLObjectFactory.makeSymbol("S#53395", "CYC");
        $ic274$ = SubLObjectFactory.makeKeyword("NUMBER");
        $ic275$ = SubLObjectFactory.makeString("Was anticipating a singleton output list, got: ~S.  Not adding disambiguation string.");
        $ic276$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OrdinalAdjective"));
        $ic277$ = SubLObjectFactory.makeSymbol("?STRING");
        $ic278$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("imageURLPathname"));
        $ic279$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $ic280$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW"));
        $ic281$ = SubLObjectFactory.makeSymbol("S#53398", "CYC");
        $ic282$ = SubLObjectFactory.makeKeyword("IMAGE-URL");
        $ic283$ = SubLObjectFactory.makeString("<img src=\"~A\">");
        $ic284$ = SubLObjectFactory.makeString("");
        $ic285$ = SubLObjectFactory.makeSymbol("S#52356", "CYC");
        $ic286$ = SubLObjectFactory.makeKeyword("OBJECT");
        $ic287$ = SubLObjectFactory.makeKeyword("SYMBOL");
        $ic288$ = SubLObjectFactory.makeSymbol("S#53469", "CYC");
        $ic289$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $ic290$ = SubLObjectFactory.makeSymbol("S#53400", "CYC");
        $ic291$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic292$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic293$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn"));
        $ic294$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELF"));
        $ic295$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#53480", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#53481", "CYC")));
        $ic296$ = SubLObjectFactory.makeSymbol("S#53481", "CYC");
        $ic297$ = SubLObjectFactory.makeSymbol("S#53480", "CYC");
        $ic298$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive"));
        $ic299$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive"));
        $ic300$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalBetweenFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#53480", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#53481", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GUID")));
        $ic301$ = SubLObjectFactory.makeSymbol("GUID");
        $ic302$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn"));
        $ic303$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn"));
        $ic304$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn"));
        $ic305$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13151", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic306$ = SubLObjectFactory.makeSymbol("S#13151", "CYC");
        $ic307$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic308$ = SubLObjectFactory.makeSymbol("S#53406", "CYC");
        $ic309$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("mtTimeIndex"));
        $ic310$ = SubLObjectFactory.makeSymbol("?TIME-INDEX");
        $ic311$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $ic312$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TIME-INDEX"));
        $ic313$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleHeadMt"));
        $ic314$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"));
        $ic315$ = SubLObjectFactory.makeSymbol("S#52546", "CYC");
        $ic316$ = SubLObjectFactory.makeKeyword("TEST");
        $ic317$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic318$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic319$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53482", "CYC"));
        $ic320$ = SubLObjectFactory.makeKeyword("KB");
        $ic321$ = SubLObjectFactory.makeKeyword("FULL");
        $ic322$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic323$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CIAWorldFactbook1995Mt"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1994))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1994))))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1994))));
        $ic324$ = SubLObjectFactory.makeKeyword("SUBSUMING");
        $ic325$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("startsAfterEndingOf"));
        $ic326$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $ic327$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#53481", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic328$ = SubLObjectFactory.makeKeyword("FOLLOWING");
        $ic329$ = ConsesLow.list((SubLObject)module0767.ONE_INTEGER, (SubLObject)module0767.ONE_INTEGER);
        $ic330$ = SubLObjectFactory.makeKeyword("PRECEDING");
        $ic331$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalBetweenFn"));
        $ic332$ = SubLObjectFactory.makeSymbol("S#53411", "CYC");
        $ic333$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarYear"));
        $ic334$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)module0767.ONE_INTEGER);
        $ic335$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DurationFn"));
        $ic336$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDay"));
        $ic337$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearsDuration")), (SubLObject)module0767.ONE_INTEGER);
        $ic338$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CalendarMonth"));
        $ic339$ = SubLObjectFactory.makeSymbol("S#53409", "CYC");
        $ic340$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1956)))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1956)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)module0767.SIXTEEN_INTEGER, (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(42), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)module0767.TWENTY_INTEGER, (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)module0767.ELEVEN_INTEGER, (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("August")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2004)))))))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("August")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2004)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DecadeFn")), (SubLObject)SubLObjectFactory.makeInteger(198))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DecadeFn")), (SubLObject)SubLObjectFactory.makeInteger(198))));
        $ic341$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genWithGloss"));
        $ic342$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("englishGloss"));
        $ic343$ = SubLObjectFactory.makeSymbol("S#39267", "CYC");
        $ic344$ = SubLObjectFactory.makeSymbol("S#53416", "CYC");
        $ic345$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39273", "CYC"))), (SubLObject)SubLObjectFactory.makeSymbol("S#51675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51676", "CYC"));
        $ic346$ = SubLObjectFactory.makeKeyword("STRING");
        $ic347$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic348$ = SubLObjectFactory.makeKeyword("LIST");
        $ic349$ = SubLObjectFactory.makeSymbol("S#53421", "CYC");
        $ic350$ = SubLObjectFactory.makeKeyword("ROP-EXPRESSION");
        $ic351$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $ic352$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationFromFn"));
        $ic353$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("GAFGathering")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("StringBasedSearching")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ObtainingAStringBasedSearchResult")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("LexicalItem")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SKSSchema-LogicalOrPhysical")));
        $ic354$ = SubLObjectFactory.makeSymbol("S#53429", "CYC");
        $ic355$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("possessiveRelation"));
        $ic356$ = SubLObjectFactory.makeSymbol("S#53472", "CYC");
        $ic357$ = SubLObjectFactory.makeSymbol("S#53431", "CYC");
        $ic358$ = SubLObjectFactory.makeInteger(200);
        $ic359$ = SubLObjectFactory.makeSymbol("?POSSESSOR");
        $ic360$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr")));
        $ic361$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePronoun-Pre"));
        $ic362$ = SubLObjectFactory.makeString("Couldn't find possessor for ~S");
        $ic363$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"));
        $ic364$ = SubLObjectFactory.makeSymbol("?POSSESSED");
        $ic365$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53483", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53484", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53485", "CYC"));
        $ic366$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Individual")));
        $ic367$ = SubLObjectFactory.makeString("~S is an instance of ~S, so using unlexified form.~%");
        $ic368$ = ConsesLow.list((SubLObject)module0767.NIL);
        $ic369$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn-Definite"));
        $ic370$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Constrained"));
        $ic371$ = SubLObjectFactory.makeSymbol("S#53442", "CYC");
        $ic372$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLGenderAttribute"));
        $ic373$ = SubLObjectFactory.makeString("Defaulting to English gender unification in non-English context");
        $ic374$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Masculine-NLAttr"));
        $ic375$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Feminine-NLAttr"));
        $ic376$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Neuter-NLAttr"));
        $ic377$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr"));
        $ic378$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr"));
        $ic379$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $ic380$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThirdPerson-NLAttr"));
        $ic381$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr"));
        $ic382$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"));
        $ic383$ = SubLObjectFactory.makeSymbol("?GENDER");
        $ic384$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("languageUsesGrammaticalGender"));
        $ic385$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GENDER"));
        $ic386$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0767.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0767.ONE_INTEGER);
        $ic387$ = SubLObjectFactory.makeString("Couldn't find gender for ~S in ~S");
        $ic388$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLanguage")));
        $ic389$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LanguageDialect"));
        $ic390$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("dialects"));
        $ic391$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $ic392$ = SubLObjectFactory.makeSymbol("S#53453", "CYC");
        $ic393$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $ic394$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defaultGrammaticalGender"));
        $ic395$ = SubLObjectFactory.makeString("pph-number-of-var guessing that ~S is singular because it's not a discourse referent~%");
        $ic396$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Group"));
        $ic397$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $ic398$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConceptualWorkSeries"));
        $ic399$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("licensedGrammaticalGender"));
        $ic400$ = SubLObjectFactory.makeString("Couldn't find a gender for ~S in ~S");
    }
    
    public static final class $f48900$UnaryFunction extends UnaryFunction
    {
        public $f48900$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50606"));
        }
        
        public SubLObject processItem(final SubLObject var378) {
            return module0767.f48900(var378, (SubLObject)$f48900$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f48900$BinaryFunction extends BinaryFunction
    {
        public $f48900$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50606"));
        }
        
        public SubLObject processItem(final SubLObject var378, final SubLObject var379) {
            return module0767.f48900(var378, var379);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0767.class
	Total time: 3177 ms
	
	Decompiled with Procyon 0.5.32.
*/