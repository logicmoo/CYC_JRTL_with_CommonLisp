package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0226 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0226";
    public static final String myFingerPrint = "b267448b3babdc7f707f7e41fc4ed3f2dc6352d7ae048375bb4c5d7b91f84553";
    private static SubLSymbol $g2413$;
    private static SubLSymbol $g2414$;
    private static SubLSymbol $g2415$;
    private static SubLSymbol $g2416$;
    private static SubLSymbol $g2417$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLString $ic93$;
    private static final SubLList $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLString $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLString $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLString $ic155$;
    private static final SubLList $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLObject $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLObject $ic166$;
    private static final SubLObject $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLObject $ic169$;
    private static final SubLObject $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLList $ic176$;
    private static final SubLList $ic177$;
    private static final SubLList $ic178$;
    private static final SubLList $ic179$;
    private static final SubLList $ic180$;
    private static final SubLList $ic181$;
    private static final SubLList $ic182$;
    private static final SubLList $ic183$;
    private static final SubLList $ic184$;
    private static final SubLList $ic185$;
    private static final SubLObject $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLObject $ic189$;
    private static final SubLObject $ic190$;
    private static final SubLObject $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLList $ic193$;
    private static final SubLString $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLString $ic200$;
    private static final SubLObject $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLObject $ic203$;
    private static final SubLObject $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLObject $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLObject $ic211$;
    private static final SubLObject $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLList $ic215$;
    private static final SubLString $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLList $ic218$;
    private static final SubLObject $ic219$;
    private static final SubLList $ic220$;
    private static final SubLList $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLString $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLString $ic226$;
    private static final SubLObject $ic227$;
    private static final SubLObject $ic228$;
    private static final SubLObject $ic229$;
    private static final SubLObject $ic230$;
    private static final SubLObject $ic231$;
    private static final SubLObject $ic232$;
    private static final SubLObject $ic233$;
    private static final SubLObject $ic234$;
    private static final SubLString $ic235$;
    private static final SubLObject $ic236$;
    private static final SubLObject $ic237$;
    private static final SubLList $ic238$;
    private static final SubLObject $ic239$;
    private static final SubLObject $ic240$;
    private static final SubLList $ic241$;
    private static final SubLList $ic242$;
    private static final SubLList $ic243$;
    private static final SubLList $ic244$;
    private static final SubLList $ic245$;
    private static final SubLList $ic246$;
    private static final SubLList $ic247$;
    private static final SubLList $ic248$;
    private static final SubLList $ic249$;
    private static final SubLList $ic250$;
    private static final SubLObject $ic251$;
    private static final SubLObject $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLList $ic255$;
    private static final SubLList $ic256$;
    private static final SubLList $ic257$;
    private static final SubLList $ic258$;
    private static final SubLList $ic259$;
    private static final SubLList $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLObject $ic262$;
    private static final SubLObject $ic263$;
    private static final SubLObject $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLObject $ic266$;
    private static final SubLObject $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLObject $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLList $ic271$;
    private static final SubLString $ic272$;
    private static final SubLList $ic273$;
    private static final SubLList $ic274$;
    private static final SubLObject $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLList $ic277$;
    private static final SubLString $ic278$;
    private static final SubLList $ic279$;
    private static final SubLList $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLObject $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLString $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLString $ic294$;
    private static final SubLString $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLString $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLList $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLString $ic303$;
    private static final SubLString $ic304$;
    private static final SubLObject $ic305$;
    private static final SubLObject $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLList $ic308$;
    private static final SubLString $ic309$;
    private static final SubLList $ic310$;
    private static final SubLList $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLObject $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLList $ic320$;
    private static final SubLString $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLList $ic325$;
    private static final SubLString $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLList $ic329$;
    private static final SubLList $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLString $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLString $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLString $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLString $ic354$;
    private static final SubLList $ic355$;
    private static final SubLString $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLObject $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLObject $ic360$;
    private static final SubLObject $ic361$;
    private static final SubLObject $ic362$;
    private static final SubLObject $ic363$;
    private static final SubLObject $ic364$;
    private static final SubLObject $ic365$;
    private static final SubLList $ic366$;
    private static final SubLObject $ic367$;
    private static final SubLObject $ic368$;
    private static final SubLObject $ic369$;
    private static final SubLObject $ic370$;
    private static final SubLObject $ic371$;
    private static final SubLString $ic372$;
    private static final SubLString $ic373$;
    private static final SubLObject $ic374$;
    private static final SubLObject $ic375$;
    private static final SubLSymbol $ic376$;
    private static final SubLList $ic377$;
    private static final SubLObject $ic378$;
    private static final SubLList $ic379$;
    private static final SubLSymbol $ic380$;
    private static final SubLList $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLInteger $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLSymbol $ic386$;
    
    public static SubLObject f14792(final SubLObject var1) {
        return module0269.f17734(var1);
    }
    
    public static SubLObject f14793(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var2);
            module0147.$g2095$.bind($ic5$, var2);
            var3 = module0269.f17734(var1);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f14794(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var6) && NIL != module0259.f16854(var6, $ic6$, module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14795(final SubLObject var7) {
        return module0269.f17788(var7);
    }
    
    public static SubLObject f14796(final SubLObject var7) {
        return module0269.f17776(var7);
    }
    
    public static SubLObject f14797(final SubLObject var7) {
        return module0269.f17804(var7);
    }
    
    public static SubLObject f14798(final SubLObject var7) {
        return module0269.f17752(var7);
    }
    
    public static SubLObject f14799(final SubLObject var7) {
        return module0269.f17740(var7);
    }
    
    public static SubLObject f14800(final SubLObject var7) {
        return module0269.f17806(var7);
    }
    
    public static SubLObject f14801(final SubLObject var7) {
        return module0269.f17742(var7);
    }
    
    public static SubLObject f14802(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var11 = module0147.$g2095$.currentBinding(var8);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var8);
            module0147.$g2095$.bind($ic5$, var8);
            var9 = module0269.f17809(var7, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var11, var8);
            module0147.$g2094$.rebind(var10, var8);
        }
        return var9;
    }
    
    public static SubLObject f14803(final SubLObject var7) {
        return f14802(var7);
    }
    
    public static SubLObject f14804(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var8) && NIL != f14803(module0178.f11332(var8)));
    }
    
    public static SubLObject f14805(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0269.f17761(var1) || NIL != module0269.f17781(var1));
    }
    
    public static SubLObject f14806(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != module0269.f17708(var9) && NIL != module0269.f17760(var9));
    }
    
    public static SubLObject f14807(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0269.f17716(var7) && module0225.f14739(var7).eql((SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f14808(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0269.f17716(var7) && module0225.f14739(var7).eql((SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f14809(final SubLObject var10) {
        return module0259.f16891(var10, $ic25$);
    }
    
    public static SubLObject f14810(final SubLObject var10) {
        return module0259.f16891(var10, $ic26$);
    }
    
    public static SubLObject f14811(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL == f14812(var10));
    }
    
    public static SubLObject f14812(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0269.f17713(var10, (SubLObject)UNPROVIDED) || NIL != module0305.f20438(var10, $ic30$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14813(final SubLObject var6) {
        return module0259.f16891(var6, $ic33$);
    }
    
    public static SubLObject f14814(final SubLObject var6) {
        return module0259.f16891(var6, $ic30$);
    }
    
    public static SubLObject f14815(final SubLObject var6) {
        return module0259.f16891(var6, $ic34$);
    }
    
    public static SubLObject f14816(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != module0269.f17709(var6) && NIL != module0259.f16891(var6, $ic35$));
    }
    
    public static SubLObject f14817(final SubLObject var6) {
        return module0259.f16891(var6, $ic36$);
    }
    
    public static SubLObject f14818(final SubLObject var6) {
        return module0259.f16891(var6, $ic37$);
    }
    
    public static SubLObject f14819(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != module0206.f13453(var6) && NIL != f14818(module0205.f13276(var6)));
    }
    
    public static SubLObject f14820(final SubLObject var7) {
        return module0220.f14548(var7, $ic38$, module0132.$g1550$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14821(final SubLObject var7) {
        final SubLObject var8 = module0220.f14556(var7, $ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (NIL != var8) ? var8 : module0132.$g1573$.getGlobalValue();
    }
    
    public static SubLObject f14822(final SubLObject var12) {
        return module0220.f14548(var12, $ic40$, module0132.$g1551$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14823(final SubLObject var12) {
        final SubLObject var13 = module0220.f14556(var12, $ic41$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (NIL != var13) ? var13 : module0132.$g1573$.getGlobalValue();
    }
    
    public static SubLObject f14824(final SubLObject var13) {
        if (NIL != module0202.f12590(var13)) {
            final SubLObject var14 = module0202.f12832(var13, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != module0173.f10955(var14) && (NIL != f14820(var14) || NIL != f14825(var13)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14826(final SubLObject var13) {
        if (NIL != f14825(var13)) {
            return f14823(module0205.f13380(module0202.f12826(var13), (SubLObject)UNPROVIDED));
        }
        return f14821(module0202.f12832(var13, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14825(final SubLObject var13) {
        if (NIL != module0202.f12598(var13)) {
            final SubLObject var14 = module0202.f12832(var13, (SubLObject)UNPROVIDED);
            final SubLObject var15 = module0202.f12835(var13, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(($ic42$.eql(var14) || $ic43$.eql(var14)) && NIL != module0173.f10955(var15) && NIL != f14822(var15));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14827(final SubLObject var15) {
        if (NIL != module0232.f15312(var15)) {
            final SubLObject var16 = module0204.f13054(var15);
            return f14824(var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14828() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g2413$.getDynamicValue(var2);
    }
    
    public static SubLObject f14829(final SubLObject var17, final SubLObject var18) {
        return (SubLObject)makeBoolean(var17.eql(var18) || NIL != module0161.f10514(var17, var18) || (NIL != f14828() && NIL != module0262.f17338(var18, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f14830(final SubLObject var19, final SubLObject var15) {
        if (NIL != f14827(var15)) {
            final SubLObject var20 = module0204.f13054(var15);
            final SubLObject var21 = f14826(var20);
            if (NIL != var21 && NIL == f14829(var19, var21)) {
                return var21;
            }
        }
        return var19;
    }
    
    public static SubLObject f14831(final SubLObject var20) {
        return f14824(module0178.f11285(var20));
    }
    
    public static SubLObject f14832(final SubLObject var21) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14833(final SubLObject var8) {
        return (NIL != module0178.f11284(var8)) ? f14831(var8) : f14832(var8);
    }
    
    public static SubLObject f14834(final SubLObject var8) {
        if (NIL != module0178.f11284(var8)) {
            return f14826(module0178.f11285(var8));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14835(final SubLObject var8) {
        if (NIL != f14833(var8)) {
            final SubLObject var9 = f14834(var8);
            final SubLObject var10 = module0178.f11287(var8);
            return f14829(var10, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14836(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var12) && NIL != module0220.f14547(var12, $ic44$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14837(final SubLObject var1, final SubLObject var23) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && var23.isNumber() && var23.numG((SubLObject)ZERO_INTEGER) && NIL != module0220.f14581($ic45$, var1, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14838(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL != module0220.f14547(var1, $ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14839(final SubLObject var1, final SubLObject var23) {
        return (SubLObject)makeBoolean(NIL != f14837(var1, var23) || NIL != module0220.f14581($ic46$, var1, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14840(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f14838(var1) || NIL != module0220.f14547(var1, $ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14841(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic47$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14842(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var7, $ic48$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14843(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14844(var7, var19));
    }
    
    public static SubLObject f14844(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        return (SubLObject)((NIL != module0222.f14635($ic50$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? module0220.f14551(var7, $ic50$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f14845(final SubLObject var7, final SubLObject var24, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14846(var7, var24, var23, var19));
    }
    
    public static SubLObject f14846(final SubLObject var7, final SubLObject var24, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        assert NIL != module0004.f106(var23) : var23;
        if (NIL != module0222.f14635($ic52$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var25 = module0202.f12769($ic52$, var7, var24, var23);
            return module0217.f14427(var25, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14847(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14848(var7, var19));
    }
    
    public static SubLObject f14848(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        return (SubLObject)((NIL != module0222.f14635($ic53$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? module0220.f14551(var7, $ic53$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f14849(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        return module0220.f14551(var7, $ic54$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14850(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14851(var7, var19));
    }
    
    public static SubLObject f14851(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        return (SubLObject)((NIL != module0222.f14635($ic55$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? module0220.f14551(var7, $ic55$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f14852(final SubLObject var7, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14853(var7, var23, var19));
    }
    
    public static SubLObject f14853(final SubLObject var7, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        assert NIL != module0004.f106(var23) : var23;
        return (SubLObject)((NIL != module0222.f14635($ic56$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) ? module0220.f14575($ic56$, var7, var23, var19, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f14854(final SubLObject var7, final SubLObject var24, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14855(var7, var24, var23, var19));
    }
    
    public static SubLObject f14855(final SubLObject var7, final SubLObject var24, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        assert NIL != module0004.f106(var23) : var23;
        if (NIL != module0222.f14635($ic57$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var25 = module0202.f12769($ic57$, var7, var24, var23);
            return module0217.f14427(var25, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14856(final SubLObject var7, final SubLObject var24, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14857(var7, var24, var23, var19));
    }
    
    public static SubLObject f14857(final SubLObject var7, final SubLObject var24, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var7) : var7;
        assert NIL != module0004.f106(var23) : var23;
        if (NIL != module0222.f14635($ic58$, var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var25 = module0202.f12769($ic58$, var7, var24, var23);
            return module0217.f14427(var25, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14858(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14859(var12, var19));
    }
    
    public static SubLObject f14859(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14551(var12, $ic59$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14860(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14551(var12, $ic60$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14861(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f14862(var12, var19));
    }
    
    public static SubLObject f14862(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14551(var12, $ic61$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14863(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var7, $ic62$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14864(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var7, $ic63$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14865(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var7, $ic64$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14866(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var7, $ic65$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14867(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic66$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14868(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic67$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14869(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic68$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14870(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic69$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14871(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic70$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14872(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var12, $ic71$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14873(final SubLObject var7) {
        return module0222.f14635(module0131.$g1512$.getGlobalValue(), var7, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14874(final SubLObject var7, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var7) && NIL != f14873(var7)) {
            var20 = module0220.f14566(var7, module0131.$g1512$.getGlobalValue(), var19, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic72$);
            var20 = Sort.sort(var20, Symbols.symbol_function((SubLObject)$ic73$), (SubLObject)UNPROVIDED);
        }
        return var20;
    }
    
    public static SubLObject f14875(final SubLObject var26) {
        assert NIL != module0173.f10955(var26) : var26;
        return module0222.f14635($ic74$, var26, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14876(final SubLObject var26) {
        assert NIL != module0173.f10955(var26) : var26;
        return module0222.f14635($ic75$, var26, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14877(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var9) && NIL != module0222.f14635($ic76$, var9, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14878(final SubLObject var9, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var9) && NIL != f14877(var9) && NIL != module0220.f14548(var9, $ic76$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f14879(final SubLObject var21, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = var19;
        final SubLObject var25 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var26 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var27 = module0147.$g2096$.currentBinding(var22);
        try {
            module0147.$g2095$.bind(module0147.f9545(var24), var22);
            module0147.$g2094$.bind(module0147.f9546(var24), var22);
            module0147.$g2096$.bind(module0147.f9549(var24), var22);
            var23 = module0220.f14562(var21, $ic77$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var27, var22);
            module0147.$g2094$.rebind(var26, var22);
            module0147.$g2095$.rebind(var25, var22);
        }
        return var23;
    }
    
    public static SubLObject f14880(final SubLObject var9, final SubLObject var21, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var9) && NIL != module0178.f11290(var21)) {
            final SubLObject var24 = var19;
            final SubLObject var25 = module0147.$g2095$.currentBinding(var22);
            final SubLObject var26 = module0147.$g2094$.currentBinding(var22);
            final SubLObject var27 = module0147.$g2096$.currentBinding(var22);
            try {
                module0147.$g2095$.bind(module0147.f9545(var24), var22);
                module0147.$g2094$.bind(module0147.f9546(var24), var22);
                module0147.$g2096$.bind(module0147.f9549(var24), var22);
                var23 = module0220.f14578($ic77$, var9, var21, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var27, var22);
                module0147.$g2094$.rebind(var26, var22);
                module0147.$g2095$.rebind(var25, var22);
            }
        }
        return var23;
    }
    
    public static SubLObject f14881(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14882(var1, (SubLObject)ONE_INTEGER, var19);
    }
    
    public static SubLObject f14883(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14882(var1, (SubLObject)TWO_INTEGER, var19);
    }
    
    public static SubLObject f14884(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14882(var1, (SubLObject)THREE_INTEGER, var19);
    }
    
    public static SubLObject f14885(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14882(var1, (SubLObject)FOUR_INTEGER, var19);
    }
    
    public static SubLObject f14886(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14882(var1, (SubLObject)FIVE_INTEGER, var19);
    }
    
    public static SubLObject f14887(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14882(var1, (SubLObject)SIX_INTEGER, var19);
    }
    
    public static SubLObject f14888(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14566(var1, $ic78$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14888(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14889(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14566(var1, $ic80$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14888(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14890(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0308.f20903(var1)) {
            SubLObject var21 = module0220.f14566(var1, $ic81$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                if (var22.isInteger()) {
                    if (NIL == var20) {
                        var20 = var22;
                    }
                    else if (var22.numL(var20)) {
                        var20 = var22;
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return var20;
    }
    
    public static SubLObject f14891(final SubLObject var31, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var32 = f14890(var31, var19);
        return (SubLObject)makeBoolean(var32.isInteger() && var23.numGE(var32));
    }
    
    public static SubLObject f14892(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0308.f20906(var1)) {
            SubLObject var21 = module0220.f14566(var1, $ic82$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                if (var22.isInteger()) {
                    if (NIL == var20) {
                        var20 = var22;
                    }
                    else if (var22.numL(var20)) {
                        var20 = var22;
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return var20;
    }
    
    public static SubLObject f14893(final SubLObject var31, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var32 = f14892(var31, var19);
        return (SubLObject)makeBoolean(var32.isInteger() && var23.numGE(var32));
    }
    
    public static SubLObject f14882(final SubLObject var1, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var23) : var23;
        return f14894(var1, var23, var19);
    }
    
    public static SubLObject f14895(final SubLObject var1, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var23) : var23;
        if (NIL != module0270.f17856()) {
            return conses_high.copy_list(module0270.f17861(var1, var23, module0147.f9552(var19)));
        }
        return f14896(var1, var23, var19);
    }
    
    public static SubLObject f14897(final SubLObject var1, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var24 = f14882(var1, var23, var19);
        return (SubLObject)((NIL != var24) ? var24 : ConsesLow.list($ic36$));
    }
    
    public static SubLObject f14894(final SubLObject var1, final SubLObject var23, final SubLObject var19) {
        if (NIL != module0173.f10955(var1)) {
            return f14898(var1, var23, var19);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14882(module0172.f10921(var1), var23, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14898(final SubLObject var1, final SubLObject var23, final SubLObject var19) {
        SubLObject var24 = (SubLObject)NIL;
        if (NIL != module0308.f20902(var1)) {
            var24 = ConsesLow.nconc(var24, module0220.f14566(var1, $ic78$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0308.f20903(var1)) {
            var24 = ConsesLow.nconc(var24, f14899(var1, var23, $ic81$, var19));
        }
        if (NIL != module0004.f105(var23)) {
            final SubLObject var25 = f14900(var23);
            if (NIL != var25) {
                if (NIL != module0308.f20914(var25, var23)) {
                    var24 = ConsesLow.nconc(var24, module0308.f20907(var1, var23, var19));
                }
                else {
                    var24 = ConsesLow.nconc(var24, module0220.f14566(var1, var25, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
            }
        }
        return module0035.f2273(var24);
    }
    
    public static SubLObject f14896(final SubLObject var1, final SubLObject var23, final SubLObject var19) {
        if (NIL != module0173.f10955(var1)) {
            if (NIL != module0202.f12628(var1)) {
                return (SubLObject)ConsesLow.list($ic89$);
            }
            if (NIL != module0202.f12626(var1) && var23.numE(module0202.f12750(var1))) {
                return (SubLObject)ConsesLow.list($ic89$);
            }
            if (NIL != module0202.f12626(var1) && var23.numE(module0202.f12746(var1))) {
                return (SubLObject)ConsesLow.list($ic90$);
            }
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var25 = f14901(var23, var1, var19);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                if (NIL != module0004.f104(var26, module0146.$g1972$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, module0220.f14566(var1, var26, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                else if (NIL != module0004.f104(var26, module0146.$g1973$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, f14902(var1, var23, var26, var19));
                }
                else if (NIL != module0259.f16854(var26, $ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, module0220.f14566(var1, var26, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                else if (NIL != module0259.f16854(var26, $ic92$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, f14902(var1, var23, var26, var19));
                }
                else {
                    module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic93$, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            return module0035.f2272(var24);
        }
        else {
            if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
                return f14895(module0172.f10921(var1), var23, var19);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f14899(final SubLObject var1, final SubLObject var23, final SubLObject var34, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = module0220.f14602(var1, var34, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        SubLObject var37 = (SubLObject)NIL;
        var37 = var36.first();
        while (NIL != var36) {
            final SubLObject var38 = var37.first();
            final SubLObject var39 = conses_high.second(var37);
            if (NIL != module0173.f10955(var39) && var38.isInteger() && (var23.numE(var38) || (var23.numG(var38) && var34.eql($ic81$)))) {
                var35 = (SubLObject)ConsesLow.cons(var39, var35);
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        return var35;
    }
    
    public static SubLObject f14902(final SubLObject var1, final SubLObject var23, final SubLObject var35, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = module0220.f14602(var1, var35, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        SubLObject var38 = (SubLObject)NIL;
        var38 = var37.first();
        while (NIL != var37) {
            final SubLObject var39 = var38.first();
            final SubLObject var40 = conses_high.second(var38);
            if (NIL != module0173.f10955(var40) && var39.isInteger() && (var23.numE(var39) || (var23.numG(var39) && var35.eql($ic82$)))) {
                var36 = (SubLObject)ConsesLow.cons(var40, var36);
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return var36;
    }
    
    public static SubLObject f14900(final SubLObject var40) {
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return $ic95$;
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return $ic96$;
        }
        if (var40.eql((SubLObject)THREE_INTEGER)) {
            return $ic97$;
        }
        if (var40.eql((SubLObject)FOUR_INTEGER)) {
            return $ic98$;
        }
        if (var40.eql((SubLObject)FIVE_INTEGER)) {
            return $ic99$;
        }
        if (var40.eql((SubLObject)SIX_INTEGER)) {
            return $ic100$;
        }
        if (var40.eql((SubLObject)ZERO_INTEGER)) {
            return $ic78$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic101$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14903(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != var31) {
            final SubLObject var41 = f14890(var31, var19);
            return var41.isInteger() ? (var40.numGE(var41) ? $ic81$ : f14900(var40)) : ((NIL != module0225.f14775(var31)) ? $ic78$ : f14900(var40));
        }
        if (NIL != module0202.f12908(var40)) {
            return f14900(var40);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic101$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14904(final SubLObject var23, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12908(var23)) {
            SubLObject var32 = (SubLObject)NIL;
            final SubLObject var33 = f14900(var23);
            if (NIL != var33) {
                var32 = (SubLObject)ConsesLow.cons(var33, var32);
            }
            final SubLObject var34 = $ic78$;
            if (NIL == conses_high.member(var34, var32, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var32 = (SubLObject)ConsesLow.cons(var34, var32);
            }
            if (NIL != module0173.f10955(var31) && NIL != f14891(var31, var23, var19)) {
                var32 = (SubLObject)ConsesLow.cons($ic81$, var32);
            }
            return Sequences.nreverse(var32);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic102$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14905(final SubLObject var40) {
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return $ic103$;
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return $ic104$;
        }
        if (var40.eql((SubLObject)THREE_INTEGER)) {
            return $ic105$;
        }
        if (var40.eql((SubLObject)FOUR_INTEGER)) {
            return $ic106$;
        }
        if (var40.eql((SubLObject)FIVE_INTEGER)) {
            return $ic107$;
        }
        if (var40.eql((SubLObject)ZERO_INTEGER)) {
            return $ic108$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic109$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14906(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != var31) {
            return (NIL != module0225.f14775(var31)) ? $ic108$ : f14905(var40);
        }
        if (NIL != module0202.f12908(var40)) {
            return f14905(var40);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic109$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14907(final SubLObject var23, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12908(var23)) {
            SubLObject var32 = (SubLObject)NIL;
            final SubLObject var33 = f14905(var23);
            if (NIL != var33) {
                var32 = (SubLObject)ConsesLow.cons(var33, var32);
            }
            final SubLObject var34 = $ic108$;
            if (NIL == conses_high.member(var34, var32, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var32 = (SubLObject)ConsesLow.cons(var34, var32);
            }
            return Sequences.nreverse(var32);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic110$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14908(final SubLObject var40) {
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return $ic111$;
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return $ic112$;
        }
        if (var40.eql((SubLObject)THREE_INTEGER)) {
            return $ic113$;
        }
        if (var40.eql((SubLObject)FOUR_INTEGER)) {
            return $ic114$;
        }
        if (var40.eql((SubLObject)FIVE_INTEGER)) {
            return $ic115$;
        }
        if (var40.eql((SubLObject)SIX_INTEGER)) {
            return $ic116$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic117$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14909(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != var31) {
            final SubLObject var41 = f14892(var31, var19);
            return var41.isInteger() ? (var40.numGE(var41) ? $ic82$ : f14908(var40)) : ((NIL != module0225.f14775(var31)) ? $ic80$ : f14908(var40));
        }
        if (NIL != module0202.f12908(var40)) {
            return f14908(var40);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic117$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14901(final SubLObject var23, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12908(var23)) {
            SubLObject var32 = (SubLObject)NIL;
            final SubLObject var33 = f14908(var23);
            if (NIL != var33) {
                var32 = (SubLObject)ConsesLow.cons(var33, var32);
            }
            if (NIL != module0173.f10955(var31) && NIL != module0308.f20905(var31)) {
                final SubLObject var34 = $ic80$;
                if (NIL == conses_high.member(var34, var32, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var32 = (SubLObject)ConsesLow.cons(var34, var32);
                }
            }
            if (NIL != module0173.f10955(var31) && NIL != f14893(var31, var23, var19)) {
                var32 = (SubLObject)ConsesLow.cons($ic82$, var32);
            }
            return Sequences.nreverse(var32);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic118$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14910(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return f14903((SubLObject)TWO_INTEGER, var31, var19);
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return f14903((SubLObject)ONE_INTEGER, var31, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14911(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return f14906((SubLObject)TWO_INTEGER, var31, var19);
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return f14906((SubLObject)ONE_INTEGER, var31, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14912(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return f14909((SubLObject)TWO_INTEGER, var31, var19);
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return f14909((SubLObject)ONE_INTEGER, var31, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14913(final SubLObject var23) {
        if (var23.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var23.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        return Errors.error((SubLObject)$ic119$, var23);
    }
    
    public static SubLObject f14914(final SubLObject var44) {
        if (var44.eql($ic95$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var44.eql($ic96$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var44.eql($ic97$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var44.eql($ic98$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var44.eql($ic99$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var44.eql($ic100$)) {
            return (SubLObject)SIX_INTEGER;
        }
        if (var44.eql($ic78$)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14915(final SubLObject var45) {
        if (var45.eql($ic111$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var45.eql($ic112$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var45.eql($ic113$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var45.eql($ic114$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var45.eql($ic115$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var45.eql($ic116$)) {
            return (SubLObject)SIX_INTEGER;
        }
        if (var45.eql($ic80$)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14916(final SubLObject var46) {
        if (var46.eql($ic120$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var46.eql($ic121$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var46.eql($ic122$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var46.eql($ic123$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var46.eql($ic124$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var46.eql($ic125$)) {
            return (SubLObject)SIX_INTEGER;
        }
        if (var46.eql($ic126$)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14917(final SubLObject var1, final SubLObject var47, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0212.f13762(var1) : var1;
        assert NIL != Types.integerp(var47) : var47;
        if (NIL != module0173.f10955(var1)) {
            return module0256.f16529(f14882(var1, var47, var19), var19, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14917(module0172.f10921(var1), var47, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14918(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14919(var1, var19);
    }
    
    public static SubLObject f14920(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14919(var1, var19);
    }
    
    public static SubLObject f14919(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14921(var1, var19);
    }
    
    public static SubLObject f14921(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            final SubLObject var21;
            final SubLObject var20 = var21 = module0225.f14739(var1);
            if (var21.eql((SubLObject)ONE_INTEGER)) {
                return f14882(var1, (SubLObject)ONE_INTEGER, var19);
            }
            if (var21.eql((SubLObject)TWO_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(f14882(var1, (SubLObject)ONE_INTEGER, var19), f14882(var1, (SubLObject)TWO_INTEGER, var19)));
            }
            if (var21.eql((SubLObject)THREE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(f14882(var1, (SubLObject)ONE_INTEGER, var19), f14882(var1, (SubLObject)TWO_INTEGER, var19), f14882(var1, (SubLObject)THREE_INTEGER, var19)));
            }
            if (var21.eql((SubLObject)FOUR_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14882(var1, (SubLObject)ONE_INTEGER, var19), f14882(var1, (SubLObject)TWO_INTEGER, var19), f14882(var1, (SubLObject)THREE_INTEGER, var19), f14882(var1, (SubLObject)FOUR_INTEGER, var19) }));
            }
            if (var21.eql((SubLObject)FIVE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14882(var1, (SubLObject)ONE_INTEGER, var19), f14882(var1, (SubLObject)TWO_INTEGER, var19), f14882(var1, (SubLObject)THREE_INTEGER, var19), f14882(var1, (SubLObject)FOUR_INTEGER, var19), f14882(var1, (SubLObject)FIVE_INTEGER, var19) }));
            }
            if (var21.eql((SubLObject)SIX_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14882(var1, (SubLObject)ONE_INTEGER, var19), f14882(var1, (SubLObject)TWO_INTEGER, var19), f14882(var1, (SubLObject)THREE_INTEGER, var19), f14882(var1, (SubLObject)FOUR_INTEGER, var19), f14882(var1, (SubLObject)FIVE_INTEGER, var19), f14882(var1, (SubLObject)SIX_INTEGER, var19) }));
            }
            return f14888(var1, var19);
        }
        else {
            if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
                return f14921(module0172.f10921(var1), var19);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f14922(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14923(var1, var19);
    }
    
    public static SubLObject f14923(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            final SubLObject var21;
            final SubLObject var20 = var21 = module0225.f14739(var1);
            if (var21.eql((SubLObject)ONE_INTEGER)) {
                return f14895(var1, (SubLObject)ONE_INTEGER, var19);
            }
            if (var21.eql((SubLObject)TWO_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(f14895(var1, (SubLObject)ONE_INTEGER, var19), f14895(var1, (SubLObject)TWO_INTEGER, var19)));
            }
            if (var21.eql((SubLObject)THREE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(f14895(var1, (SubLObject)ONE_INTEGER, var19), f14895(var1, (SubLObject)TWO_INTEGER, var19), f14895(var1, (SubLObject)THREE_INTEGER, var19)));
            }
            if (var21.eql((SubLObject)FOUR_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14895(var1, (SubLObject)ONE_INTEGER, var19), f14895(var1, (SubLObject)TWO_INTEGER, var19), f14895(var1, (SubLObject)THREE_INTEGER, var19), f14895(var1, (SubLObject)FOUR_INTEGER, var19) }));
            }
            if (var21.eql((SubLObject)FIVE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14895(var1, (SubLObject)ONE_INTEGER, var19), f14895(var1, (SubLObject)TWO_INTEGER, var19), f14895(var1, (SubLObject)THREE_INTEGER, var19), f14895(var1, (SubLObject)FOUR_INTEGER, var19), f14895(var1, (SubLObject)FIVE_INTEGER, var19) }));
            }
            if (var21.eql((SubLObject)SIX_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14895(var1, (SubLObject)ONE_INTEGER, var19), f14895(var1, (SubLObject)TWO_INTEGER, var19), f14895(var1, (SubLObject)THREE_INTEGER, var19), f14895(var1, (SubLObject)FOUR_INTEGER, var19), f14895(var1, (SubLObject)FIVE_INTEGER, var19), f14895(var1, (SubLObject)SIX_INTEGER, var19) }));
            }
            return f14889(var1, var19);
        }
        else {
            if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
                return f14923(module0172.f10921(var1), var19);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f14924(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14925(var12, (SubLObject)ONE_INTEGER, var19);
    }
    
    public static SubLObject f14926(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14925(var12, (SubLObject)TWO_INTEGER, var19);
    }
    
    public static SubLObject f14927(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14925(var12, (SubLObject)THREE_INTEGER, var19);
    }
    
    public static SubLObject f14928(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14925(var12, (SubLObject)FOUR_INTEGER, var19);
    }
    
    public static SubLObject f14929(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14925(var12, (SubLObject)FIVE_INTEGER, var19);
    }
    
    public static SubLObject f14930(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14925(var12, (SubLObject)SIX_INTEGER, var19);
    }
    
    public static SubLObject f14931(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14566(var12, $ic78$, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var12, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14931(module0172.f10921(var12), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14932(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14933(var12, var19);
    }
    
    public static SubLObject f14933(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14924(var12, var19), f14926(var12, var19), f14927(var12, var19), f14928(var12, var19), f14929(var12, var19), f14930(var12, var19) }));
    }
    
    public static SubLObject f14925(final SubLObject var12, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var23) : var23;
        if (NIL != module0173.f10955(var12)) {
            SubLObject var24 = f14931(var12, var19);
            final SubLObject var25 = f14900(var23);
            if (NIL != module0173.f10955(var25)) {
                var24 = ConsesLow.nconc(new SubLObject[] { module0220.f14566(var12, var25, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) });
            }
            else {
                var24 = ConsesLow.nconc(new SubLObject[] { module0220.f14597(var12, $ic133$, var23, var19, (SubLObject)THREE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) });
            }
            return module0035.f2272(var24);
        }
        if (NIL != module0155.f9779(var12, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14925(module0172.f10921(var12), var23, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14934(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)ONE_INTEGER, var19);
    }
    
    public static SubLObject f14936(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)TWO_INTEGER, var19);
    }
    
    public static SubLObject f14937(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)THREE_INTEGER, var19);
    }
    
    public static SubLObject f14938(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)FOUR_INTEGER, var19);
    }
    
    public static SubLObject f14939(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)FIVE_INTEGER, var19);
    }
    
    public static SubLObject f14940(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)SIX_INTEGER, var19);
    }
    
    public static SubLObject f14941(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14935(var1, (SubLObject)ZERO_INTEGER, var19);
    }
    
    public static SubLObject f14935(final SubLObject var1, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var23) : var23;
        if (NIL != module0173.f10955(var1)) {
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var25 = f14942(var23, var1, var19);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                if (NIL != module0004.f104(var26, module0146.$g1974$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, module0220.f14566(var1, var26, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                else if (NIL != module0004.f104(var26, module0146.$g1975$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, f14943(var1, var23, var26, var19));
                }
                else if (NIL != module0259.f16854(var26, $ic137$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, module0220.f14566(var1, var26, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                else if (NIL != module0259.f16854(var26, $ic138$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var24 = ConsesLow.nconc(var24, f14943(var1, var23, var26, var19));
                }
                else {
                    module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic139$, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            return module0035.f2272(var24);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14935(module0172.f10921(var1), var23, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14943(final SubLObject var1, final SubLObject var23, final SubLObject var49, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = module0220.f14602(var1, var49, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        SubLObject var52 = (SubLObject)NIL;
        var52 = var51.first();
        while (NIL != var51) {
            final SubLObject var53 = var52.first();
            final SubLObject var54 = conses_high.second(var52);
            if (NIL != module0173.f10955(var54) && var53.isInteger() && (var23.numE(var53) || (var23.numG(var53) && var49.eql($ic81$)))) {
                var50 = (SubLObject)ConsesLow.cons(var54, var50);
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        return var50;
    }
    
    public static SubLObject f14944(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0308.f20904(var1)) {
            SubLObject var21 = module0220.f14566(var1, $ic142$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                if (var22.isInteger()) {
                    if (NIL == var20) {
                        var20 = var22;
                    }
                    else if (var22.numL(var20)) {
                        var20 = var22;
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return var20;
    }
    
    public static SubLObject f14945(final SubLObject var31, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var32 = f14944(var31, var19);
        return (SubLObject)makeBoolean(var32.isInteger() && var23.numGE(var32));
    }
    
    public static SubLObject f14946(final SubLObject var40) {
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return $ic120$;
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return $ic121$;
        }
        if (var40.eql((SubLObject)THREE_INTEGER)) {
            return $ic122$;
        }
        if (var40.eql((SubLObject)FOUR_INTEGER)) {
            return $ic123$;
        }
        if (var40.eql((SubLObject)FIVE_INTEGER)) {
            return $ic124$;
        }
        if (var40.eql((SubLObject)SIX_INTEGER)) {
            return $ic125$;
        }
        if (var40.eql((SubLObject)ZERO_INTEGER)) {
            return $ic126$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic143$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14947(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != var31) {
            final SubLObject var41 = f14944(var31, var19);
            return var41.isInteger() ? (var40.numGE(var41) ? $ic142$ : f14946(var40)) : ((NIL != module0225.f14775(var31)) ? $ic126$ : f14946(var40));
        }
        if (NIL != module0202.f12908(var40)) {
            return f14946(var40);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic143$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14942(final SubLObject var23, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12908(var23)) {
            SubLObject var32 = (SubLObject)NIL;
            final SubLObject var33 = f14946(var23);
            if (NIL != var33) {
                var32 = (SubLObject)ConsesLow.cons(var33, var32);
            }
            final SubLObject var34 = $ic126$;
            if (NIL == conses_high.member(var34, var32, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var32 = (SubLObject)ConsesLow.cons(var34, var32);
            }
            if (NIL != module0173.f10955(var31) && NIL != f14945(var31, var23, var19)) {
                var32 = (SubLObject)ConsesLow.cons($ic142$, var32);
            }
            return Sequences.nreverse(var32);
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic144$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14948(final SubLObject var40, SubLObject var31, SubLObject var19) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var40.eql((SubLObject)ONE_INTEGER)) {
            return f14947((SubLObject)TWO_INTEGER, var31, var19);
        }
        if (var40.eql((SubLObject)TWO_INTEGER)) {
            return f14947((SubLObject)ONE_INTEGER, var31, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14949(final SubLObject var1, final SubLObject var47, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var47) : var47;
        return module0256.f16529(f14935(var1, var47, var19), var19, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14950(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14951(var1, var19);
    }
    
    public static SubLObject f14951(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var1)) {
            if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
                f14951(module0172.f10921(var1), var19);
            }
            return (SubLObject)NIL;
        }
        final SubLObject var21;
        final SubLObject var20 = var21 = module0225.f14739(var1);
        if (var21.eql((SubLObject)ONE_INTEGER)) {
            return f14935(var1, (SubLObject)ONE_INTEGER, var19);
        }
        if (var21.eql((SubLObject)TWO_INTEGER)) {
            return module0035.f2272(ConsesLow.nconc(f14935(var1, (SubLObject)ONE_INTEGER, var19), f14935(var1, (SubLObject)TWO_INTEGER, var19)));
        }
        if (var21.eql((SubLObject)THREE_INTEGER)) {
            return module0035.f2272(ConsesLow.nconc(f14935(var1, (SubLObject)ONE_INTEGER, var19), f14935(var1, (SubLObject)TWO_INTEGER, var19), f14935(var1, (SubLObject)THREE_INTEGER, var19)));
        }
        if (var21.eql((SubLObject)FOUR_INTEGER)) {
            return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14935(var1, (SubLObject)ONE_INTEGER, var19), f14935(var1, (SubLObject)TWO_INTEGER, var19), f14935(var1, (SubLObject)THREE_INTEGER, var19), f14935(var1, (SubLObject)FOUR_INTEGER, var19) }));
        }
        if (var21.eql((SubLObject)FIVE_INTEGER)) {
            return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14935(var1, (SubLObject)ONE_INTEGER, var19), f14935(var1, (SubLObject)TWO_INTEGER, var19), f14935(var1, (SubLObject)THREE_INTEGER, var19), f14935(var1, (SubLObject)FOUR_INTEGER, var19), f14935(var1, (SubLObject)FIVE_INTEGER, var19) }));
        }
        if (var21.eql((SubLObject)SIX_INTEGER)) {
            return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f14935(var1, (SubLObject)ONE_INTEGER, var19), f14935(var1, (SubLObject)TWO_INTEGER, var19), f14935(var1, (SubLObject)THREE_INTEGER, var19), f14935(var1, (SubLObject)FOUR_INTEGER, var19), f14935(var1, (SubLObject)FIVE_INTEGER, var19), f14935(var1, (SubLObject)SIX_INTEGER, var19) }));
        }
        return f14941(var1, var19);
    }
    
    public static SubLObject f14952(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)ONE_INTEGER, var19);
    }
    
    public static SubLObject f14954(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)TWO_INTEGER, var19);
    }
    
    public static SubLObject f14955(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)THREE_INTEGER, var19);
    }
    
    public static SubLObject f14956(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)FOUR_INTEGER, var19);
    }
    
    public static SubLObject f14957(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)FIVE_INTEGER, var19);
    }
    
    public static SubLObject f14958(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)SIX_INTEGER, var19);
    }
    
    public static SubLObject f14959(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14953(var12, (SubLObject)ZERO_INTEGER, var19);
    }
    
    public static SubLObject f14953(final SubLObject var12, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var23) : var23;
        if (NIL != module0173.f10955(var12)) {
            SubLObject var24 = f14959(var12, var19);
            final SubLObject var25 = f14946(var23);
            if (NIL != module0173.f10955(var25)) {
                var24 = ConsesLow.nconc(new SubLObject[] { module0220.f14566(var12, var25, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) });
            }
            else {
                var24 = ConsesLow.nconc(new SubLObject[] { module0220.f14597(var12, $ic149$, var23, var19, (SubLObject)THREE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) });
            }
            return module0035.f2272(var24);
        }
        if (NIL != module0155.f9779(var12, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14953(module0172.f10921(var12), var23, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14960(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14602(var1, $ic152$, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14960(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14961(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14602(var1, $ic157$, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14961(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14962(final SubLObject var1, final SubLObject var52, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14566(var1, var52, var19, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14962(module0172.f10921(var1), var52, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14963(final SubLObject var1, final SubLObject var52, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14566(var1, var52, var19, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14963(module0172.f10921(var1), var52, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14964(final SubLObject var52) {
        if (var52.eql($ic157$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var52.eql($ic158$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var52.eql($ic159$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var52.eql($ic160$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var52.eql($ic152$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var52.eql($ic161$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var52.eql($ic162$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var52.eql($ic163$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var52.eql($ic164$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var52.eql($ic165$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var52.eql($ic166$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var52.eql($ic167$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var52.eql($ic168$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var52.eql($ic169$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var52.eql($ic170$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var52.eql($ic171$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var52.eql($ic172$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var52.eql($ic173$)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var52.eql($ic174$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var52.eql($ic175$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14965(final SubLObject var53) {
        if (var53.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic176$;
        }
        if (var53.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic177$;
        }
        if (var53.eql((SubLObject)THREE_INTEGER)) {
            return (SubLObject)$ic178$;
        }
        if (var53.eql((SubLObject)FOUR_INTEGER)) {
            return (SubLObject)$ic179$;
        }
        if (var53.eql((SubLObject)FIVE_INTEGER)) {
            return (SubLObject)$ic180$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14966(final SubLObject var53) {
        if (var53.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic181$;
        }
        if (var53.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic182$;
        }
        if (var53.eql((SubLObject)THREE_INTEGER)) {
            return (SubLObject)$ic183$;
        }
        if (var53.eql((SubLObject)FOUR_INTEGER)) {
            return (SubLObject)$ic184$;
        }
        if (var53.eql((SubLObject)FIVE_INTEGER)) {
            return (SubLObject)$ic185$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14967(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f14968(var54, var19) || NIL != f14969(var54, var19));
    }
    
    public static SubLObject f14968(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f14970(var54, var19) || NIL != f14971(var54, var19));
    }
    
    public static SubLObject f14971(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var54, $ic186$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14970(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var54, $ic187$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14969(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var54, $ic188$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14972(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f14973(var54, var19) || NIL != f14974(var54, var19));
    }
    
    public static SubLObject f14974(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var54, $ic189$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14973(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var54, $ic190$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14975(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14548(var54, $ic191$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14976(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return conses_high.nunion(f14977(var54, var19), f14978(var54, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14977(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return conses_high.nunion(f14979(var54, var19), f14980(var54, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f14979(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var54)) {
            return module0202.f12758(module0220.f14566(var54, $ic186$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0155.f9779(var54, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14979(module0172.f10921(var54), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14978(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var54)) {
            return module0202.f12758(module0220.f14566(var54, $ic188$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0155.f9779(var54, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14979(module0172.f10921(var54), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14980(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var54)) {
            return module0202.f12758(module0220.f14566(var54, $ic187$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0155.f9779(var54, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14979(module0172.f10921(var54), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14981(final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        final SubLObject var57 = var19;
        final SubLObject var58 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var59 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind(module0147.f9531(var57), var55);
            module0147.$g2095$.bind(module0147.f9534(var57), var55);
            SubLObject var60 = module0305.f20345(var54);
            SubLObject var61 = (SubLObject)NIL;
            var61 = var60.first();
            while (NIL != var60) {
                if (NIL != module0147.f9507(module0178.f11287(var61))) {
                    final SubLObject var62 = module0202.f12757(module0178.f11335(var61));
                    if (NIL == conses_high.member(var62, var56, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var56 = (SubLObject)ConsesLow.cons(var62, var56);
                    }
                }
                var60 = var60.rest();
                var61 = var60.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var59, var55);
            module0147.$g2094$.rebind(var58, var55);
        }
        return var56;
    }
    
    public static SubLObject f14982(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14548(var57, $ic201$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14982(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14983(module0205.f13276(var57), var19);
        }
        if (NIL != f14984(var57)) {
            return f14882(module0205.f13368(var57, (SubLObject)UNPROVIDED), module0205.f13277(var57, (SubLObject)UNPROVIDED), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14985(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14548(var57, $ic202$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14985(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14986(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14987(final SubLObject var58, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var59 = module0205.f13276(var58);
        if (NIL != module0173.f10955(var59)) {
            return module0220.f14548(var59, $ic203$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var59)) {
            return f14987(module0172.f10921(var59), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14988(final SubLObject var58, final SubLObject var54, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0205.f13276(var58);
        if (NIL != module0173.f10955(var60)) {
            SubLObject var61 = (SubLObject)NIL;
            final SubLObject var62 = var19;
            final SubLObject var63 = module0147.$g2094$.currentBinding(var59);
            final SubLObject var64 = module0147.$g2095$.currentBinding(var59);
            try {
                module0147.$g2094$.bind(module0147.f9531(var62), var59);
                module0147.$g2095$.bind(module0147.f9534(var62), var59);
                if (NIL == var61) {
                    SubLObject var65 = module0220.f14562(var60, $ic204$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                    SubLObject var66 = (SubLObject)NIL;
                    var66 = var65.first();
                    while (NIL == var61 && NIL != var65) {
                        if (NIL != module0256.f16576(var66, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            SubLObject var67 = (SubLObject)NIL;
                            if (NIL == var67) {
                                SubLObject var59_62;
                                SubLObject var68;
                                for (var59_62 = module0205.f13304(var58, (SubLObject)UNPROVIDED), var68 = (SubLObject)NIL, var68 = var59_62.first(); NIL == var67 && NIL != var59_62; var67 = (SubLObject)makeBoolean(NIL == module0305.f20438(var68, var66, (SubLObject)UNPROVIDED)), var59_62 = var59_62.rest(), var68 = var59_62.first()) {}
                            }
                            var61 = (SubLObject)makeBoolean(NIL == var67);
                        }
                        var65 = var65.rest();
                        var66 = var65.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var64, var59);
                module0147.$g2094$.rebind(var63, var59);
            }
            return var61;
        }
        if (NIL != module0279.f18541(var60)) {
            return f14988(module0202.f12786(module0172.f10921(var60), module0205.f13304(var58, (SubLObject)UNPROVIDED)), var54, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14989(final SubLObject var58, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var59 = module0205.f13276(var58);
        SubLObject var60 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var59)) {
            final SubLObject var61 = var59;
            if (var61.eql($ic205$)) {
                final SubLObject var62 = module0205.f13277(var58, (SubLObject)UNPROVIDED);
                final SubLObject var63 = module0205.f13368(var58, (SubLObject)UNPROVIDED);
                final SubLObject var64 = module0205.f13132(var63);
                SubLObject var63_65 = (SubLObject)NIL;
                if (NIL != module0173.f10955(var64) && var62.isInteger() && NIL == var63_65) {
                    SubLObject var65;
                    SubLObject var66;
                    for (var65 = f14904(var62, var64, var19), var66 = (SubLObject)NIL, var66 = var65.first(); NIL == var63_65 && NIL != var65; var63_65 = module0220.f14548(var64, var66, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65 = var65.rest(), var66 = var65.first()) {}
                }
            }
            if (NIL == var60) {
                SubLObject var67 = module0220.f14566(var59, $ic202$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var62 = (SubLObject)NIL;
                var62 = var67.first();
                while (NIL == var60 && NIL != var67) {
                    if (var62.isInteger()) {
                        var60 = module0035.sublisp_boolean(f14935(var59, var62, var19));
                    }
                    var67 = var67.rest();
                    var62 = var67.first();
                }
            }
            return var60;
        }
        if (NIL != module0279.f18541(var59)) {
            return f14989(module0202.f12786(module0172.f10921(var59), module0205.f13304(var58, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14984(final SubLObject var10) {
        return (SubLObject)makeBoolean(var10.isCons() && $ic206$.eql(module0205.f13276(var10)));
    }
    
    public static SubLObject f14983(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g607$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            final SubLObject var76 = module0139.$g1635$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic207$), var67);
                module0018.$g606$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g607$.bind($ic208$, var67);
                module0018.$g609$.bind($ic201$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                module0139.$g1635$.bind(module0139.f9007(), var67);
                final SubLObject var4_73 = module0139.$g1636$.currentBinding(var67);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var67);
                    final SubLObject var4_74 = module0139.$g1644$.currentBinding(var67);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var67);
                        if (NIL == var68) {
                            SubLObject var77;
                            SubLObject var78;
                            for (var77 = f14990(var66, var19), var78 = (SubLObject)NIL, var78 = var77.first(); NIL == var68 && NIL != var77; var68 = module0256.f16591(Symbols.symbol_function((SubLObject)$ic209$), var78, var19, (SubLObject)UNPROVIDED), var77 = var77.rest(), var78 = var77.first()) {}
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_74, var67);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1636$.rebind(var4_73, var67);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
            }
            finally {
                module0139.$g1635$.rebind(var76, var67);
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g607$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f14983(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14986(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g607$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            final SubLObject var76 = module0139.$g1635$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic207$), var67);
                module0018.$g606$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g607$.bind($ic208$, var67);
                module0018.$g609$.bind($ic202$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                module0139.$g1635$.bind(module0139.f9007(), var67);
                final SubLObject var4_77 = module0139.$g1636$.currentBinding(var67);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var67);
                    final SubLObject var4_78 = module0139.$g1644$.currentBinding(var67);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var67);
                        if (NIL == var68) {
                            SubLObject var77;
                            SubLObject var78;
                            for (var77 = f14990(var66, var19), var78 = (SubLObject)NIL, var78 = var77.first(); NIL == var68 && NIL != var77; var68 = module0256.f16591(Symbols.symbol_function((SubLObject)$ic209$), var78, var19, (SubLObject)UNPROVIDED), var77 = var77.rest(), var78 = var77.first()) {}
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_78, var67);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1636$.rebind(var4_77, var67);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
            }
            finally {
                module0139.$g1635$.rebind(var76, var67);
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g607$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f14986(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14991(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14548(var57, $ic210$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14991(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14992(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14992(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g607$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            final SubLObject var76 = module0139.$g1635$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic207$), var67);
                module0018.$g606$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g607$.bind($ic208$, var67);
                module0018.$g609$.bind($ic210$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                module0139.$g1635$.bind(module0139.f9007(), var67);
                final SubLObject var4_80 = module0139.$g1636$.currentBinding(var67);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var67);
                    final SubLObject var4_81 = module0139.$g1644$.currentBinding(var67);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var67);
                        if (NIL == var68) {
                            SubLObject var77;
                            SubLObject var78;
                            for (var77 = f14993(var66, var19), var78 = (SubLObject)NIL, var78 = var77.first(); NIL == var68 && NIL != var77; var68 = module0256.f16591(Symbols.symbol_function((SubLObject)$ic209$), var78, var19, (SubLObject)UNPROVIDED), var77 = var77.rest(), var78 = var77.first()) {}
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_81, var67);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1636$.rebind(var4_80, var67);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
            }
            finally {
                module0139.$g1635$.rebind(var76, var67);
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g607$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f14992(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14994(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14548(var57, $ic211$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14994(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14995(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14995(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g607$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            final SubLObject var76 = module0139.$g1635$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic207$), var67);
                module0018.$g606$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g607$.bind($ic208$, var67);
                module0018.$g609$.bind($ic211$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                module0139.$g1635$.bind(module0139.f9007(), var67);
                final SubLObject var4_84 = module0139.$g1636$.currentBinding(var67);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var67);
                    final SubLObject var4_85 = module0139.$g1644$.currentBinding(var67);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var67);
                        if (NIL == var68) {
                            SubLObject var77;
                            SubLObject var78;
                            for (var77 = f14996(var66, var19), var78 = (SubLObject)NIL, var78 = var77.first(); NIL == var68 && NIL != var77; var68 = module0256.f16591(Symbols.symbol_function((SubLObject)$ic209$), var78, var19, (SubLObject)UNPROVIDED), var77 = var77.rest(), var78 = var77.first()) {}
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_85, var67);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1636$.rebind(var4_84, var67);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
            }
            finally {
                module0139.$g1635$.rebind(var76, var67);
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g607$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f14995(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14997(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14548(var57, $ic212$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14997(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f14998(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14999(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14548(var57, $ic213$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14999(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15000(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15001(final SubLObject var58, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var59 = module0205.f13276(var58);
        SubLObject var60 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var59)) {
            final SubLObject var61 = var59;
            if (var61.eql($ic205$)) {
                final SubLObject var62 = module0205.f13277(var58, (SubLObject)UNPROVIDED);
                final SubLObject var63 = module0205.f13368(var58, (SubLObject)UNPROVIDED);
                final SubLObject var64 = module0205.f13132(var63);
                SubLObject var63_87 = (SubLObject)NIL;
                if (NIL != module0173.f10955(var64) && var62.isInteger() && NIL == var63_87) {
                    SubLObject var65;
                    SubLObject var66;
                    for (var65 = f14942(var62, var64, var19), var66 = (SubLObject)NIL, var66 = var65.first(); NIL == var63_87 && NIL != var65; var63_87 = module0220.f14548(var64, var66, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65 = var65.rest(), var66 = var65.first()) {}
                }
            }
            if (NIL == var60) {
                SubLObject var67 = module0220.f14566(var59, $ic213$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var62 = (SubLObject)NIL;
                var62 = var67.first();
                while (NIL == var60 && NIL != var67) {
                    if (var62.isInteger()) {
                        var60 = module0035.sublisp_boolean(f14935(var59, var62, var19));
                    }
                    var67 = var67.rest();
                    var62 = var67.first();
                }
            }
            return var60;
        }
        if (NIL != module0279.f18541(var59)) {
            return f15001(module0202.f12786(module0172.f10921(var59), module0205.f13304(var58, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14998(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g607$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            final SubLObject var76 = module0139.$g1635$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic207$), var67);
                module0018.$g606$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g607$.bind($ic208$, var67);
                module0018.$g609$.bind($ic212$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                module0139.$g1635$.bind(module0139.f9007(), var67);
                final SubLObject var4_89 = module0139.$g1636$.currentBinding(var67);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var67);
                    final SubLObject var4_90 = module0139.$g1644$.currentBinding(var67);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var67);
                        if (NIL == var68) {
                            SubLObject var77;
                            SubLObject var78;
                            for (var77 = f14990(var66, var19), var78 = (SubLObject)NIL, var78 = var77.first(); NIL == var68 && NIL != var77; var68 = module0256.f16591(Symbols.symbol_function((SubLObject)$ic209$), var78, var19, (SubLObject)UNPROVIDED), var77 = var77.rest(), var78 = var77.first()) {}
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_90, var67);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1636$.rebind(var4_89, var67);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
            }
            finally {
                module0139.$g1635$.rebind(var76, var67);
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g607$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f14998(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15000(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g607$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            final SubLObject var76 = module0139.$g1635$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic207$), var67);
                module0018.$g606$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g607$.bind($ic208$, var67);
                module0018.$g609$.bind($ic213$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                module0139.$g1635$.bind(module0139.f9007(), var67);
                final SubLObject var4_92 = module0139.$g1636$.currentBinding(var67);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var67);
                    final SubLObject var4_93 = module0139.$g1644$.currentBinding(var67);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var67);
                        if (NIL == var68) {
                            SubLObject var77;
                            SubLObject var78;
                            for (var77 = f14990(var66, var19), var78 = (SubLObject)NIL, var78 = var77.first(); NIL == var68 && NIL != var77; var68 = module0256.f16591(Symbols.symbol_function((SubLObject)$ic209$), var78, var19, (SubLObject)UNPROVIDED), var77 = var77.rest(), var78 = var77.first()) {}
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_93, var67);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1636$.rebind(var4_92, var67);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
            }
            finally {
                module0139.$g1635$.rebind(var76, var67);
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g607$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f15000(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15002(final SubLObject var9, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var9)) {
            return module0220.f14557(var9, $ic201$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var9, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15002(module0172.f10921(var9), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15003(final SubLObject var9, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f14990(var9, var19);
    }
    
    public static SubLObject f14990(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14566(var57, $ic201$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14990(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15004(module0205.f13276(var57), var19);
        }
        if (NIL != f14984(var57)) {
            return f14882(module0205.f13368(var57, (SubLObject)UNPROVIDED), module0205.f13277(var57, (SubLObject)UNPROVIDED), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15005(final SubLObject var94, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var95 = module0205.f13276(var94);
        if (NIL != module0173.f10955(var95)) {
            SubLObject var96 = (SubLObject)NIL;
            final SubLObject var97 = var95;
            if (var97.eql($ic205$)) {
                final SubLObject var98 = module0205.f13277(var94, (SubLObject)UNPROVIDED);
                final SubLObject var99 = module0205.f13368(var94, (SubLObject)UNPROVIDED);
                final SubLObject var100 = module0205.f13132(var99);
                if (var98.isInteger()) {
                    var96 = ConsesLow.nconc(var96, f14882(var100, var98, var19));
                }
            }
            SubLObject var101 = module0220.f14566(var95, $ic202$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var102 = (SubLObject)NIL;
            var102 = var101.first();
            while (NIL != var101) {
                if (var102.isInteger()) {
                    var96 = ConsesLow.nconc(var96, f14935(var95, var102, var19));
                }
                var101 = var101.rest();
                var102 = var101.first();
            }
            return var96;
        }
        if (NIL != module0279.f18541(var95)) {
            return f15005(module0202.f12786(module0172.f10921(var95), module0205.f13304(var94, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15006(final SubLObject var95, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var96 = module0205.f13276(var95);
        if (NIL != module0173.f10955(var96)) {
            SubLObject var97 = (SubLObject)NIL;
            SubLObject var98 = module0220.f14566(var96, $ic202$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var99 = (SubLObject)NIL;
            var99 = var98.first();
            while (NIL != var98) {
                if (var99.isInteger()) {
                    final SubLObject var100 = module0205.f13362(var95, var99, (SubLObject)UNPROVIDED);
                    if (NIL != module0173.f10955(var100)) {
                        var97 = (SubLObject)ConsesLow.cons(var100, var97);
                    }
                    else if (NIL != module0210.f13598(var100)) {
                        var97 = ConsesLow.nconc(var97, module0256.f16528(var100, var19, (SubLObject)UNPROVIDED));
                    }
                }
                var98 = var98.rest();
                var99 = var98.first();
            }
            return module0035.f2272(var97);
        }
        if (NIL != module0279.f18541(var96)) {
            return f15006(module0202.f12786(module0172.f10921(var96), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        if (NIL != module0155.f9779(var96, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15007(module0202.f12786(module0172.f10921(var96), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15008(final SubLObject var94, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var95 = module0205.f13276(var94);
        if (NIL != module0173.f10955(var95)) {
            SubLObject var96 = (SubLObject)NIL;
            SubLObject var97 = module0220.f14566(var95, $ic203$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var98 = (SubLObject)NIL;
            var98 = var97.first();
            while (NIL != var97) {
                if (var98.isInteger()) {
                    final SubLObject var99 = module0205.f13362(var94, var98, (SubLObject)UNPROVIDED);
                    var96 = ConsesLow.nconc(var96, module0259.f16821(var99, var19, (SubLObject)UNPROVIDED));
                }
                var97 = var97.rest();
                var98 = var97.first();
            }
            return module0035.f2272(var96);
        }
        if (NIL != module0279.f18541(var95)) {
            return f15008(module0202.f12786(module0172.f10921(var95), module0205.f13304(var94, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15009(final SubLObject var94, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        final SubLObject var96 = module0205.f13276(var94);
        if (NIL != module0173.f10955(var96)) {
            SubLObject var97 = (SubLObject)NIL;
            final SubLObject var98 = var19;
            final SubLObject var99 = module0147.$g2094$.currentBinding(var95);
            final SubLObject var100 = module0147.$g2095$.currentBinding(var95);
            try {
                module0147.$g2094$.bind(module0147.f9531(var98), var95);
                module0147.$g2095$.bind(module0147.f9534(var98), var95);
                SubLObject var101 = module0220.f14562(var96, $ic204$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                SubLObject var102 = (SubLObject)NIL;
                var102 = var101.first();
                while (NIL != var101) {
                    SubLObject var103 = (SubLObject)NIL;
                    if (NIL == var103) {
                        SubLObject var104;
                        SubLObject var105;
                        for (var104 = module0205.f13304(var94, (SubLObject)UNPROVIDED), var105 = (SubLObject)NIL, var105 = var104.first(); NIL == var103 && NIL != var104; var103 = (SubLObject)makeBoolean(NIL == module0305.f20438(var105, var102, (SubLObject)UNPROVIDED)), var104 = var104.rest(), var105 = var104.first()) {}
                    }
                    if (NIL == var103) {
                        var97 = (SubLObject)ConsesLow.cons(var102, var97);
                    }
                    var101 = var101.rest();
                    var102 = var101.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var100, var95);
                module0147.$g2094$.rebind(var99, var95);
            }
            return var97;
        }
        if (NIL != module0279.f18541(var96)) {
            return f15009(module0202.f12786(module0172.f10921(var96), module0205.f13304(var94, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15010(final SubLObject var95, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var96 = module0205.f13276(var95);
        if (NIL != module0173.f10955(var96)) {
            if (NIL == module0222.f14655(var96, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            final SubLObject var97 = module0220.f14602(var96, $ic217$, (SubLObject)ONE_INTEGER, (SubLObject)$ic218$, var19, (SubLObject)UNPROVIDED);
            SubLObject var98 = (SubLObject)NIL;
            SubLObject var99 = var97;
            SubLObject var100 = (SubLObject)NIL;
            var100 = var99.first();
            while (NIL != var99) {
                final SubLObject var101 = var100.first();
                final SubLObject var102 = conses_high.second(var100);
                final SubLObject var103 = conses_high.third(var100);
                final SubLObject var104 = module0205.f13362(var95, var101, (SubLObject)UNPROVIDED);
                if (NIL != module0259.f16854(var104, var102, var19, (SubLObject)UNPROVIDED)) {
                    var98 = (SubLObject)ConsesLow.cons(var103, var98);
                }
                var99 = var99.rest();
                var100 = var99.first();
            }
            return module0256.f16529(module0035.f2272(var98), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            if (NIL != module0279.f18541(var96)) {
                return f15010(module0202.f12786(module0172.f10921(var96), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f15011(final SubLObject var95, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var96 = module0205.f13276(var95);
        if (NIL != module0173.f10955(var96)) {
            final SubLObject var97 = module0220.f14602(var96, $ic219$, (SubLObject)ONE_INTEGER, (SubLObject)$ic220$, var19, (SubLObject)$ic72$);
            SubLObject var98 = (SubLObject)NIL;
            SubLObject var99 = var97;
            SubLObject var100 = (SubLObject)NIL;
            var100 = var99.first();
            while (NIL != var99) {
                SubLObject var102;
                final SubLObject var101 = var102 = var100;
                SubLObject var103 = (SubLObject)NIL;
                SubLObject var104 = (SubLObject)NIL;
                SubLObject var105 = (SubLObject)NIL;
                SubLObject var106 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)$ic221$);
                var103 = var102.first();
                var102 = var102.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)$ic221$);
                var104 = var102.first();
                var102 = var102.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)$ic221$);
                var105 = var102.first();
                var102 = var102.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var102, var101, (SubLObject)$ic221$);
                var106 = var102.first();
                var102 = var102.rest();
                if (NIL == var102) {
                    final SubLObject var107 = module0205.f13362(var95, var103, (SubLObject)UNPROVIDED);
                    SubLObject var108 = (SubLObject)NIL;
                    if (NIL != module0173.f10955(var107)) {
                        var108 = module0220.f14566(var107, var104, var19, var105, var106, (SubLObject)$ic72$);
                    }
                    else {
                        var108 = (SubLObject)NIL;
                    }
                    var98 = ConsesLow.nconc(var98, var108);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var101, (SubLObject)$ic221$);
                }
                var99 = var99.rest();
                var100 = var99.first();
            }
            return module0256.f16529(module0035.f2272(var98), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var96)) {
            return f15011(module0202.f12786(module0172.f10921(var96), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15004(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g608$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic222$), var67);
                module0018.$g606$.bind((SubLObject)ONE_INTEGER, var67);
                module0018.$g608$.bind($ic208$, var67);
                module0018.$g609$.bind($ic201$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                final SubLObject var4_110 = module0139.$g1635$.currentBinding(var67);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var67);
                    final SubLObject var4_111 = module0139.$g1636$.currentBinding(var67);
                    try {
                        module0139.$g1636$.bind(module0139.f9007(), var67);
                        final SubLObject var4_112 = module0139.$g1644$.currentBinding(var67);
                        try {
                            module0139.$g1644$.bind((SubLObject)T, var67);
                            SubLObject var76 = f14990(var66, var19);
                            SubLObject var77 = (SubLObject)NIL;
                            var77 = var76.first();
                            while (NIL != var76) {
                                var68 = ConsesLow.nconc(var68, module0256.f16589(Symbols.symbol_function((SubLObject)$ic209$), var77, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                var76 = var76.rest();
                                var77 = var76.first();
                            }
                        }
                        finally {
                            module0139.$g1644$.rebind(var4_112, var67);
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                    }
                    finally {
                        module0139.$g1636$.rebind(var4_111, var67);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1635$.rebind(var4_110, var67);
                }
                var68 = module0256.f16529(module0035.f2272(var68), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g608$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f15004(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15007(final SubLObject var95, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = module0205.f13276(var95);
        final SubLObject var98 = module0205.f13276(var97);
        if (NIL != module0173.f10955(var98)) {
            SubLObject var99 = (SubLObject)NIL;
            final SubLObject var100 = module0018.$g605$.currentBinding(var96);
            final SubLObject var101 = module0018.$g606$.currentBinding(var96);
            final SubLObject var102 = module0018.$g608$.currentBinding(var96);
            final SubLObject var103 = module0018.$g609$.currentBinding(var96);
            final SubLObject var104 = module0018.$g610$.currentBinding(var96);
            final SubLObject var105 = module0018.$g611$.currentBinding(var96);
            final SubLObject var106 = module0018.$g612$.currentBinding(var96);
            final SubLObject var107 = module0139.$g1635$.currentBinding(var96);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic222$), var96);
                module0018.$g606$.bind((SubLObject)ONE_INTEGER, var96);
                module0018.$g608$.bind($ic208$, var96);
                module0018.$g609$.bind($ic202$, var96);
                module0018.$g610$.bind(var19, var96);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var96);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var96);
                module0139.$g1635$.bind(module0139.f9007(), var96);
                final SubLObject var4_114 = module0139.$g1636$.currentBinding(var96);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var96);
                    final SubLObject var4_115 = module0139.$g1644$.currentBinding(var96);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var96);
                        SubLObject var108 = f14990(var98, var19);
                        SubLObject var109 = (SubLObject)NIL;
                        var109 = var108.first();
                        while (NIL != var108) {
                            var99 = ConsesLow.nconc(var99, module0256.f16589(Symbols.symbol_function((SubLObject)$ic209$), var109, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            var108 = var108.rest();
                            var109 = var108.first();
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_115, var96);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var96));
                }
                finally {
                    module0139.$g1636$.rebind(var4_114, var96);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var96));
            }
            finally {
                module0139.$g1635$.rebind(var107, var96);
                module0018.$g612$.rebind(var106, var96);
                module0018.$g611$.rebind(var105, var96);
                module0018.$g610$.rebind(var104, var96);
                module0018.$g609$.rebind(var103, var96);
                module0018.$g608$.rebind(var102, var96);
                module0018.$g606$.rebind(var101, var96);
                module0018.$g605$.rebind(var100, var96);
            }
            if (NIL != module0173.f10955(var97)) {
                SubLObject var110 = module0220.f14566(var97, $ic202$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var111 = (SubLObject)NIL;
                var111 = var110.first();
                while (NIL != var110) {
                    if (var111.isInteger()) {
                        final SubLObject var112 = module0205.f13362(var95, var111, (SubLObject)UNPROVIDED);
                        if (NIL != module0173.f10955(var112)) {
                            var99 = (SubLObject)ConsesLow.cons(var112, var99);
                        }
                    }
                    var110 = var110.rest();
                    var111 = var110.first();
                }
            }
            return module0256.f16529(module0035.f2272(var99), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var98)) {
            return f15007(module0202.f12786(module0202.f12786(module0172.f10921(var98), module0205.f13304(var97, (SubLObject)UNPROVIDED)), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14993(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL == module0269.f17771(var57, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57) && NIL != module0269.f17770(var57)) {
            return module0220.f14566(var57, $ic210$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14993(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15012(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15012(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g608$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic222$), var67);
                module0018.$g606$.bind((SubLObject)ONE_INTEGER, var67);
                module0018.$g608$.bind($ic208$, var67);
                module0018.$g609$.bind($ic210$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                final SubLObject var4_118 = module0139.$g1635$.currentBinding(var67);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var67);
                    final SubLObject var4_119 = module0139.$g1636$.currentBinding(var67);
                    try {
                        module0139.$g1636$.bind(module0139.f9007(), var67);
                        final SubLObject var4_120 = module0139.$g1644$.currentBinding(var67);
                        try {
                            module0139.$g1644$.bind((SubLObject)T, var67);
                            SubLObject var76 = f14993(var66, var19);
                            SubLObject var77 = (SubLObject)NIL;
                            var77 = var76.first();
                            while (NIL != var76) {
                                var68 = ConsesLow.nconc(var68, module0256.f16589(Symbols.symbol_function((SubLObject)$ic209$), var77, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                var76 = var76.rest();
                                var77 = var76.first();
                            }
                        }
                        finally {
                            module0139.$g1644$.rebind(var4_120, var67);
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                    }
                    finally {
                        module0139.$g1636$.rebind(var4_119, var67);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1635$.rebind(var4_118, var67);
                }
                var68 = module0256.f16529(module0035.f2272(var68), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g608$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f15012(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14996(final SubLObject var57, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14566(var57, $ic211$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var57)) {
            return f14996(module0172.f10921(var57), var19);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15013(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15013(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g608$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic222$), var67);
                module0018.$g606$.bind((SubLObject)ONE_INTEGER, var67);
                module0018.$g608$.bind($ic208$, var67);
                module0018.$g609$.bind($ic211$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                final SubLObject var4_122 = module0139.$g1635$.currentBinding(var67);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var67);
                    final SubLObject var4_123 = module0139.$g1636$.currentBinding(var67);
                    try {
                        module0139.$g1636$.bind(module0139.f9007(), var67);
                        final SubLObject var4_124 = module0139.$g1644$.currentBinding(var67);
                        try {
                            module0139.$g1644$.bind((SubLObject)T, var67);
                            SubLObject var76 = f14996(var66, var19);
                            SubLObject var77 = (SubLObject)NIL;
                            var77 = var76.first();
                            while (NIL != var76) {
                                var68 = ConsesLow.nconc(var68, module0256.f16589(Symbols.symbol_function((SubLObject)$ic209$), var77, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                var76 = var76.rest();
                                var77 = var76.first();
                            }
                        }
                        finally {
                            module0139.$g1644$.rebind(var4_124, var67);
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                    }
                    finally {
                        module0139.$g1636$.rebind(var4_123, var67);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1635$.rebind(var4_122, var67);
                }
                var68 = module0256.f16529(module0035.f2272(var68), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g608$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f15013(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15014(final SubLObject var57, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0173.f10955(var57)) {
            return module0220.f14566(var57, $ic212$, var19, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, var125);
        }
        if (NIL != module0279.f18541(var57)) {
            return f15014(module0172.f10921(var57), var19, var125);
        }
        if (NIL != module0155.f9779(var57, Symbols.symbol_function((SubLObject)$ic79$), var19) && var125.eql((SubLObject)$ic72$)) {
            return f15015(module0205.f13276(var57), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15016(final SubLObject var95, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var96 = module0205.f13276(var95);
        if (NIL != module0173.f10955(var96)) {
            SubLObject var97 = (SubLObject)NIL;
            SubLObject var98 = module0220.f14566(var96, $ic213$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var99 = (SubLObject)NIL;
            var99 = var98.first();
            while (NIL != var98) {
                if (var99.isInteger()) {
                    final SubLObject var100 = module0205.f13362(var95, var99, (SubLObject)UNPROVIDED);
                    if (NIL != module0173.f10955(var100)) {
                        var97 = (SubLObject)ConsesLow.cons(var100, var97);
                    }
                    else if (NIL != module0210.f13598(var100)) {
                        var97 = ConsesLow.nconc(var97, module0256.f16528(var100, var19, (SubLObject)UNPROVIDED));
                    }
                }
                var98 = var98.rest();
                var99 = var98.first();
            }
            return var97;
        }
        if (NIL != module0279.f18541(var96)) {
            return f15016(module0202.f12786(module0172.f10921(var96), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        if (NIL != module0155.f9779(var96, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15017(module0202.f12786(module0172.f10921(var96), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15018(final SubLObject var94, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var95 = module0205.f13276(var94);
        if (NIL != module0173.f10955(var95)) {
            SubLObject var96 = (SubLObject)NIL;
            final SubLObject var97 = var95;
            if (var97.eql($ic205$)) {
                final SubLObject var98 = module0205.f13277(var94, (SubLObject)UNPROVIDED);
                final SubLObject var99 = module0205.f13368(var94, (SubLObject)UNPROVIDED);
                final SubLObject var100 = module0205.f13132(var99);
                if (var98.isInteger()) {
                    var96 = ConsesLow.nconc(var96, f14935(var100, var98, var19));
                }
            }
            SubLObject var101 = module0220.f14566(var95, $ic213$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var102 = (SubLObject)NIL;
            var102 = var101.first();
            while (NIL != var101) {
                if (var102.isInteger()) {
                    var96 = ConsesLow.nconc(var96, f14935(var95, var102, var19));
                }
                var101 = var101.rest();
                var102 = var101.first();
            }
            return var96;
        }
        if (NIL != module0279.f18541(var95)) {
            return f15018(module0202.f12786(module0172.f10921(var95), module0205.f13304(var94, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15019(final SubLObject var58, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var59 = module0205.f13276(var58);
        if (NIL != module0173.f10955(var59)) {
            final SubLObject var60 = module0220.f14602(var59, $ic227$, (SubLObject)ONE_INTEGER, (SubLObject)$ic218$, var19, (SubLObject)UNPROVIDED);
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                final SubLObject var64 = var63.first();
                final SubLObject var65 = conses_high.second(var63);
                final SubLObject var66 = conses_high.third(var63);
                final SubLObject var67 = module0205.f13362(var58, var64, (SubLObject)UNPROVIDED);
                if (NIL != module0210.f13565(var67) && NIL != module0210.f13565(var65) && NIL != module0173.f10955(var66) && NIL != module0256.f16596(var67, var65, var19, (SubLObject)UNPROVIDED)) {
                    var61 = (SubLObject)ConsesLow.cons(var66, var61);
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
            return module0256.f16529(module0035.f2272(var61), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var59)) {
            return f15019(module0202.f12786(module0172.f10921(var59), module0205.f13304(var58, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15020(final SubLObject var58, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var59 = module0205.f13276(var58);
        if (NIL != module0173.f10955(var59)) {
            final SubLObject var60 = module0220.f14602(var59, $ic228$, (SubLObject)ONE_INTEGER, (SubLObject)$ic220$, var19, (SubLObject)$ic72$);
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = var60;
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                SubLObject var65;
                final SubLObject var64 = var65 = var63;
                SubLObject var66 = (SubLObject)NIL;
                SubLObject var67 = (SubLObject)NIL;
                SubLObject var68 = (SubLObject)NIL;
                SubLObject var69 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic221$);
                var66 = var65.first();
                var65 = var65.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic221$);
                var67 = var65.first();
                var65 = var65.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic221$);
                var68 = var65.first();
                var65 = var65.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic221$);
                var69 = var65.first();
                var65 = var65.rest();
                if (NIL == var65) {
                    final SubLObject var70 = module0205.f13362(var58, var66, (SubLObject)UNPROVIDED);
                    SubLObject var71 = (SubLObject)NIL;
                    if (NIL != module0173.f10955(var70)) {
                        var71 = module0220.f14566(var70, var67, var19, var68, var69, (SubLObject)$ic72$);
                    }
                    else {
                        var71 = (SubLObject)NIL;
                    }
                    var61 = ConsesLow.nconc(var61, var71);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var64, (SubLObject)$ic221$);
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
            return module0256.f16529(module0035.f2272(var61), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var59)) {
            return f15019(module0202.f12786(module0172.f10921(var59), module0205.f13304(var58, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15015(final SubLObject var66, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var67 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var66)) {
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0018.$g605$.currentBinding(var67);
            final SubLObject var70 = module0018.$g606$.currentBinding(var67);
            final SubLObject var71 = module0018.$g608$.currentBinding(var67);
            final SubLObject var72 = module0018.$g609$.currentBinding(var67);
            final SubLObject var73 = module0018.$g610$.currentBinding(var67);
            final SubLObject var74 = module0018.$g611$.currentBinding(var67);
            final SubLObject var75 = module0018.$g612$.currentBinding(var67);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic222$), var67);
                module0018.$g606$.bind((SubLObject)ONE_INTEGER, var67);
                module0018.$g608$.bind($ic208$, var67);
                module0018.$g609$.bind($ic212$, var67);
                module0018.$g610$.bind(var19, var67);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var67);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var67);
                final SubLObject var4_130 = module0139.$g1635$.currentBinding(var67);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var67);
                    final SubLObject var4_131 = module0139.$g1636$.currentBinding(var67);
                    try {
                        module0139.$g1636$.bind(module0139.f9007(), var67);
                        final SubLObject var4_132 = module0139.$g1644$.currentBinding(var67);
                        try {
                            module0139.$g1644$.bind((SubLObject)T, var67);
                            SubLObject var76 = f14990(var66, var19);
                            SubLObject var77 = (SubLObject)NIL;
                            var77 = var76.first();
                            while (NIL != var76) {
                                var68 = ConsesLow.nconc(var68, module0256.f16589(Symbols.symbol_function((SubLObject)$ic209$), var77, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                var76 = var76.rest();
                                var77 = var76.first();
                            }
                        }
                        finally {
                            module0139.$g1644$.rebind(var4_132, var67);
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var67));
                    }
                    finally {
                        module0139.$g1636$.rebind(var4_131, var67);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var67));
                }
                finally {
                    module0139.$g1635$.rebind(var4_130, var67);
                }
                var68 = module0256.f16529(module0035.f2272(var68), var19, (SubLObject)UNPROVIDED);
            }
            finally {
                module0018.$g612$.rebind(var75, var67);
                module0018.$g611$.rebind(var74, var67);
                module0018.$g610$.rebind(var73, var67);
                module0018.$g609$.rebind(var72, var67);
                module0018.$g608$.rebind(var71, var67);
                module0018.$g606$.rebind(var70, var67);
                module0018.$g605$.rebind(var69, var67);
            }
            return var68;
        }
        if (NIL != module0279.f18541(var66)) {
            return f15015(module0172.f10921(var66), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15017(final SubLObject var95, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = module0205.f13276(var95);
        final SubLObject var98 = module0205.f13276(var97);
        if (NIL != module0173.f10955(var98)) {
            SubLObject var99 = (SubLObject)NIL;
            final SubLObject var100 = module0018.$g605$.currentBinding(var96);
            final SubLObject var101 = module0018.$g606$.currentBinding(var96);
            final SubLObject var102 = module0018.$g608$.currentBinding(var96);
            final SubLObject var103 = module0018.$g609$.currentBinding(var96);
            final SubLObject var104 = module0018.$g610$.currentBinding(var96);
            final SubLObject var105 = module0018.$g611$.currentBinding(var96);
            final SubLObject var106 = module0018.$g612$.currentBinding(var96);
            final SubLObject var107 = module0139.$g1635$.currentBinding(var96);
            try {
                module0018.$g605$.bind(Symbols.symbol_function((SubLObject)$ic222$), var96);
                module0018.$g606$.bind((SubLObject)ONE_INTEGER, var96);
                module0018.$g608$.bind($ic208$, var96);
                module0018.$g609$.bind($ic213$, var96);
                module0018.$g610$.bind(var19, var96);
                module0018.$g611$.bind((SubLObject)TWO_INTEGER, var96);
                module0018.$g612$.bind((SubLObject)ONE_INTEGER, var96);
                module0139.$g1635$.bind(module0139.f9007(), var96);
                final SubLObject var4_134 = module0139.$g1636$.currentBinding(var96);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var96);
                    final SubLObject var4_135 = module0139.$g1644$.currentBinding(var96);
                    try {
                        module0139.$g1644$.bind((SubLObject)T, var96);
                        SubLObject var108 = f14990(var98, var19);
                        SubLObject var109 = (SubLObject)NIL;
                        var109 = var108.first();
                        while (NIL != var108) {
                            var99 = ConsesLow.nconc(var99, module0256.f16589(Symbols.symbol_function((SubLObject)$ic209$), var109, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            var108 = var108.rest();
                            var109 = var108.first();
                        }
                    }
                    finally {
                        module0139.$g1644$.rebind(var4_135, var96);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var96));
                }
                finally {
                    module0139.$g1636$.rebind(var4_134, var96);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var96));
            }
            finally {
                module0139.$g1635$.rebind(var107, var96);
                module0018.$g612$.rebind(var106, var96);
                module0018.$g611$.rebind(var105, var96);
                module0018.$g610$.rebind(var104, var96);
                module0018.$g609$.rebind(var103, var96);
                module0018.$g608$.rebind(var102, var96);
                module0018.$g606$.rebind(var101, var96);
                module0018.$g605$.rebind(var100, var96);
            }
            if (NIL != module0173.f10955(var97)) {
                SubLObject var110 = module0220.f14566(var97, $ic213$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var111 = (SubLObject)NIL;
                var111 = var110.first();
                while (NIL != var110) {
                    if (var111.isInteger()) {
                        final SubLObject var112 = module0205.f13362(var95, var111, (SubLObject)UNPROVIDED);
                        if (NIL != module0173.f10955(var112)) {
                            var99 = (SubLObject)ConsesLow.cons(var112, var99);
                        }
                    }
                    var110 = var110.rest();
                    var111 = var110.first();
                }
            }
            return module0256.f16529(module0035.f2272(var99), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0279.f18541(var98)) {
            return f15017(module0202.f12786(module0202.f12786(module0172.f10921(var98), module0205.f13304(var97, (SubLObject)UNPROVIDED)), module0205.f13304(var95, (SubLObject)UNPROVIDED)), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15021(final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14566(var12, $ic201$, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, var125);
        }
        if (NIL != module0279.f18541(var12)) {
            return f15021(module0172.f10921(var12), var19, var125);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15022(final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14566(var12, $ic212$, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, var125);
        }
        if (NIL != module0279.f18541(var12)) {
            return f15022(module0172.f10921(var12), var19, var125);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15023(final SubLObject var137, final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var138 = module0205.f13276(var137);
            if (NIL != module0173.f10955(var138)) {
                SubLObject var139 = (SubLObject)NIL;
                SubLObject var140 = module0220.f14566(var138, $ic213$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var141 = (SubLObject)NIL;
                var141 = var140.first();
                while (NIL != var140) {
                    if (NIL != module0004.f105(var141)) {
                        final SubLObject var142 = module0205.f13362(var137, var141, (SubLObject)UNPROVIDED);
                        if (NIL != module0210.f13565(var142) && NIL != module0256.f16596(var142, var12, var19, (SubLObject)UNPROVIDED)) {
                            var139 = (SubLObject)ConsesLow.cons(var141, var139);
                        }
                    }
                    var140 = var140.rest();
                    var141 = var140.first();
                }
                return Sequences.nreverse(var139);
            }
            if (NIL != module0279.f18541(var138)) {
                return f15023(module0202.f12786(module0172.f10921(var138), module0205.f13304(var137, (SubLObject)UNPROVIDED)), var12, var19, var125);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15024(final SubLObject var137, final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var138 = module0205.f13276(var137);
            if (NIL != module0173.f10955(var138)) {
                SubLObject var139 = (SubLObject)NIL;
                SubLObject var140 = module0220.f14566(var138, $ic202$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var141 = (SubLObject)NIL;
                var141 = var140.first();
                while (NIL != var140) {
                    if (NIL != module0004.f105(var141)) {
                        final SubLObject var142 = module0205.f13362(var137, var141, (SubLObject)UNPROVIDED);
                        if (NIL != module0210.f13565(var142) && NIL != module0256.f16596(var142, var12, var19, (SubLObject)UNPROVIDED)) {
                            var139 = (SubLObject)ConsesLow.cons(var141, var139);
                        }
                    }
                    var140 = var140.rest();
                    var141 = var140.first();
                }
                return Sequences.nreverse(var139);
            }
            if (NIL != module0279.f18541(var138)) {
                return f15024(module0202.f12786(module0172.f10921(var138), module0205.f13304(var137, (SubLObject)UNPROVIDED)), var12, var19, var125);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15025(final SubLObject var58, final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var126 = module0205.f13276(var58);
            if (NIL != module0173.f10955(var126)) {
                SubLObject var127 = (SubLObject)NIL;
                SubLObject var128 = module0220.f14566(var126, $ic203$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var129 = (SubLObject)NIL;
                var129 = var128.first();
                while (NIL != var128) {
                    if (NIL != module0004.f105(var129)) {
                        final SubLObject var130 = module0205.f13362(var58, var129, (SubLObject)UNPROVIDED);
                        if (NIL != module0259.f16854(var130, var12, var19, (SubLObject)UNPROVIDED)) {
                            var127 = (SubLObject)ConsesLow.cons(var129, var127);
                        }
                    }
                    var128 = var128.rest();
                    var129 = var128.first();
                }
                return Sequences.nreverse(var127);
            }
            if (NIL != module0279.f18541(var126)) {
                return f15025(module0202.f12786(module0172.f10921(var126), module0205.f13304(var58, (SubLObject)UNPROVIDED)), var12, var19, var125);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15026(final SubLObject var137, final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var138 = module0205.f13276(var137);
            if (NIL != module0173.f10955(var138)) {
                SubLObject var139 = (SubLObject)NIL;
                SubLObject var140 = module0220.f14602(var138, $ic217$, (SubLObject)ONE_INTEGER, (SubLObject)$ic218$, var19, (SubLObject)UNPROVIDED);
                SubLObject var141 = (SubLObject)NIL;
                var141 = var140.first();
                while (NIL != var140) {
                    final SubLObject var142 = var141.first();
                    final SubLObject var143 = conses_high.second(var141);
                    final SubLObject var144 = conses_high.third(var141);
                    final SubLObject var145 = module0205.f13362(var137, var142, (SubLObject)UNPROVIDED);
                    if (NIL != module0210.f13565(var143) && NIL != module0210.f13565(var144) && NIL != module0259.f16854(var145, var143, var19, (SubLObject)UNPROVIDED) && NIL != module0256.f16596(var144, var12, var19, (SubLObject)UNPROVIDED)) {
                        var139 = (SubLObject)ConsesLow.cons(var141, var139);
                    }
                    var140 = var140.rest();
                    var141 = var140.first();
                }
                return Sequences.nreverse(var139);
            }
            if (NIL != module0279.f18541(var138)) {
                return f15026(module0202.f12786(module0172.f10921(var138), module0205.f13304(var137, (SubLObject)UNPROVIDED)), var12, var19, var125);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15027(final SubLObject var137, final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var138 = module0205.f13276(var137);
            if (NIL != module0173.f10955(var138)) {
                final SubLObject var139 = module0220.f14602(var138, $ic219$, (SubLObject)ONE_INTEGER, (SubLObject)$ic220$, var19, (SubLObject)$ic72$);
                SubLObject var140 = (SubLObject)NIL;
                SubLObject var141 = var139;
                SubLObject var142 = (SubLObject)NIL;
                var142 = var141.first();
                while (NIL != var141) {
                    final SubLObject var143 = var142.first();
                    final SubLObject var144 = conses_high.second(var142);
                    final SubLObject var145 = conses_high.third(var142);
                    final SubLObject var146 = conses_high.fourth(var142);
                    final SubLObject var147 = module0205.f13362(var137, var143, (SubLObject)UNPROVIDED);
                    final SubLObject var148 = module0220.f14560(var147, var144, var19, var145, (SubLObject)$ic72$);
                    SubLObject var149 = (SubLObject)NIL;
                    SubLObject var30_142 = var148;
                    SubLObject var150 = (SubLObject)NIL;
                    var150 = var30_142.first();
                    while (NIL != var30_142) {
                        final SubLObject var151 = module0178.f11331(var150, var146);
                        if (NIL != module0256.f16596(var151, var12, var19, (SubLObject)UNPROVIDED)) {
                            var149 = (SubLObject)ConsesLow.cons(module0178.f11285(var150), var149);
                        }
                        var30_142 = var30_142.rest();
                        var150 = var30_142.first();
                    }
                    if (NIL != var149) {
                        var140 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var149, var143, var145, var146), var140);
                    }
                    var141 = var141.rest();
                    var142 = var141.first();
                }
                return Sequences.nreverse(var140);
            }
            if (NIL != module0279.f18541(var138)) {
                return f15027(module0202.f12786(module0172.f10921(var138), module0205.f13304(var137, (SubLObject)UNPROVIDED)), var12, var19, var125);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15028(final SubLObject var137, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var138 = module0205.f13276(var137);
            if (NIL != module0173.f10955(var138)) {
                SubLObject var139 = (SubLObject)NIL;
                SubLObject var140 = module0220.f14602(var138, $ic227$, (SubLObject)ONE_INTEGER, (SubLObject)$ic218$, var19, (SubLObject)UNPROVIDED);
                SubLObject var141 = (SubLObject)NIL;
                var141 = var140.first();
                while (NIL != var140) {
                    final SubLObject var142 = var141.first();
                    final SubLObject var143 = conses_high.second(var141);
                    final SubLObject var144 = conses_high.third(var141);
                    final SubLObject var145 = module0205.f13362(var137, var142, (SubLObject)UNPROVIDED);
                    if (NIL != module0210.f13565(var145) && NIL != module0210.f13565(var143) && NIL != module0210.f13565(var144) && NIL != module0256.f16596(var145, var143, var19, (SubLObject)UNPROVIDED) && NIL != module0256.f16596(var144, var12, var19, (SubLObject)UNPROVIDED)) {
                        var139 = (SubLObject)ConsesLow.cons(var141, var139);
                    }
                    var140 = var140.rest();
                    var141 = var140.first();
                }
                return Sequences.nreverse(var139);
            }
            if (NIL != module0279.f18541(var138)) {
                return f15028(module0202.f12786(module0172.f10921(var138), module0205.f13304(var137, (SubLObject)UNPROVIDED)), var12, var19);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15029(final SubLObject var137, final SubLObject var12, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        if (NIL != module0210.f13565(var12)) {
            final SubLObject var138 = module0205.f13276(var137);
            if (NIL != module0173.f10955(var138)) {
                final SubLObject var139 = module0220.f14602(var138, $ic228$, (SubLObject)ONE_INTEGER, (SubLObject)$ic220$, var19, (SubLObject)$ic72$);
                SubLObject var140 = (SubLObject)NIL;
                SubLObject var141 = var139;
                SubLObject var142 = (SubLObject)NIL;
                var142 = var141.first();
                while (NIL != var141) {
                    final SubLObject var143 = var142.first();
                    final SubLObject var144 = conses_high.second(var142);
                    final SubLObject var145 = conses_high.third(var142);
                    final SubLObject var146 = conses_high.fourth(var142);
                    final SubLObject var147 = module0205.f13362(var137, var143, (SubLObject)UNPROVIDED);
                    final SubLObject var148 = module0220.f14560(var147, var144, var19, var145, (SubLObject)$ic72$);
                    SubLObject var149 = (SubLObject)NIL;
                    SubLObject var30_144 = var148;
                    SubLObject var150 = (SubLObject)NIL;
                    var150 = var30_144.first();
                    while (NIL != var30_144) {
                        final SubLObject var151 = module0178.f11331(var150, var146);
                        if (NIL != module0256.f16596(var151, var12, var19, (SubLObject)UNPROVIDED)) {
                            var149 = (SubLObject)ConsesLow.cons(module0178.f11285(var150), var149);
                        }
                        var30_144 = var30_144.rest();
                        var150 = var30_144.first();
                    }
                    if (NIL != var149) {
                        var140 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var149, var143, var145, var146), var140);
                    }
                    var141 = var141.rest();
                    var142 = var141.first();
                }
                return Sequences.nreverse(var140);
            }
            if (NIL != module0279.f18541(var138)) {
                return f15029(module0202.f12786(module0172.f10921(var138), module0205.f13304(var137, (SubLObject)UNPROVIDED)), var12, var19, var125);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15030(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15031(var1, (SubLObject)ONE_INTEGER, var19);
    }
    
    public static SubLObject f15032(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15031(var1, (SubLObject)TWO_INTEGER, var19);
    }
    
    public static SubLObject f15033(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15031(var1, (SubLObject)THREE_INTEGER, var19);
    }
    
    public static SubLObject f15034(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15031(var1, (SubLObject)FOUR_INTEGER, var19);
    }
    
    public static SubLObject f15035(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15031(var1, (SubLObject)FIVE_INTEGER, var19);
    }
    
    public static SubLObject f15036(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15031(var1, (SubLObject)SIX_INTEGER, var19);
    }
    
    public static SubLObject f15037(final SubLObject var47) {
        if (var47.eql((SubLObject)ONE_INTEGER)) {
            return f15038((SubLObject)TWO_INTEGER);
        }
        if (var47.eql((SubLObject)TWO_INTEGER)) {
            return f15038((SubLObject)ONE_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15038(final SubLObject var47) {
        if (var47.eql((SubLObject)ONE_INTEGER)) {
            return $ic229$;
        }
        if (var47.eql((SubLObject)TWO_INTEGER)) {
            return $ic230$;
        }
        if (var47.eql((SubLObject)THREE_INTEGER)) {
            return $ic231$;
        }
        if (var47.eql((SubLObject)FOUR_INTEGER)) {
            return $ic232$;
        }
        if (var47.eql((SubLObject)FIVE_INTEGER)) {
            return $ic233$;
        }
        if (var47.eql((SubLObject)SIX_INTEGER)) {
            return $ic234$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic235$, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15031(final SubLObject var1, final SubLObject var47, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            SubLObject var48 = (SubLObject)NIL;
            final SubLObject var49 = f15038(var47);
            if (NIL != module0173.f10955(var49)) {
                var48 = ConsesLow.nconc(var48, module0220.f14566(var1, var49, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            if (NIL == module0004.f104($ic236$, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != f15039(var1, var47, var19)) {
                var48 = (SubLObject)ConsesLow.cons($ic236$, var48);
            }
            return module0035.f2269(var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15031(module0172.f10921(var1), var47, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15039(final SubLObject var1, final SubLObject var47, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0222.f14635($ic236$, var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0220.f14582($ic236$, var1, var47, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15040(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            final SubLObject var21;
            final SubLObject var20 = var21 = module0225.f14739(var1);
            if (var21.eql((SubLObject)ONE_INTEGER)) {
                return ConsesLow.nconc(f15031(var1, (SubLObject)ONE_INTEGER, var19), f15031(var1, (SubLObject)TWO_INTEGER, var19));
            }
            if (var21.eql((SubLObject)TWO_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(f15031(var1, (SubLObject)ONE_INTEGER, var19), f15031(var1, (SubLObject)TWO_INTEGER, var19)));
            }
            if (var21.eql((SubLObject)THREE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(f15031(var1, (SubLObject)ONE_INTEGER, var19), f15031(var1, (SubLObject)TWO_INTEGER, var19), f15031(var1, (SubLObject)THREE_INTEGER, var19)));
            }
            if (var21.eql((SubLObject)FOUR_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f15031(var1, (SubLObject)ONE_INTEGER, var19), f15031(var1, (SubLObject)TWO_INTEGER, var19), f15031(var1, (SubLObject)THREE_INTEGER, var19), f15031(var1, (SubLObject)FOUR_INTEGER, var19) }));
            }
            if (var21.eql((SubLObject)FIVE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f15031(var1, (SubLObject)ONE_INTEGER, var19), f15031(var1, (SubLObject)TWO_INTEGER, var19), f15031(var1, (SubLObject)THREE_INTEGER, var19), f15031(var1, (SubLObject)FOUR_INTEGER, var19), f15031(var1, (SubLObject)FIVE_INTEGER, var19) }));
            }
            if (var21.eql((SubLObject)FIVE_INTEGER)) {
                return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f15031(var1, (SubLObject)ONE_INTEGER, var19), f15031(var1, (SubLObject)TWO_INTEGER, var19), f15031(var1, (SubLObject)THREE_INTEGER, var19), f15031(var1, (SubLObject)FOUR_INTEGER, var19), f15031(var1, (SubLObject)FIVE_INTEGER, var19), f15031(var1, (SubLObject)SIX_INTEGER, var19) }));
            }
        }
        else if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15040(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15041(final SubLObject var1, final SubLObject var47, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return (SubLObject)makeBoolean(NIL != module0220.f14582(f15038(var47), var1, $ic237$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14582(f15038(var47), var1, $ic236$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15041(module0172.f10921(var1), var47, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15042(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15043(var146, (SubLObject)ONE_INTEGER, var19);
    }
    
    public static SubLObject f15044(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15043(var146, (SubLObject)TWO_INTEGER, var19);
    }
    
    public static SubLObject f15045(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15043(var146, (SubLObject)THREE_INTEGER, var19);
    }
    
    public static SubLObject f15046(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15043(var146, (SubLObject)FOUR_INTEGER, var19);
    }
    
    public static SubLObject f15047(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15043(var146, (SubLObject)FIVE_INTEGER, var19);
    }
    
    public static SubLObject f15048(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15043(var146, (SubLObject)SIX_INTEGER, var19);
    }
    
    public static SubLObject f15049(final SubLObject var146, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0035.f2272(ConsesLow.nconc(new SubLObject[] { f15042(var146, var19), f15044(var146, var19), f15045(var146, var19), f15046(var146, var19), f15047(var146, var19), f15048(var146, var19) }));
    }
    
    public static SubLObject f15043(final SubLObject var146, final SubLObject var47, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var146)) {
            final SubLObject var147 = f15038(var47);
            if (NIL != module0173.f10955(var147)) {
                return module0220.f14566(var146, var147, var19, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            }
        }
        else if (NIL != module0155.f9779(var146, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15043(module0172.f10921(var146), var19, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15050(final SubLObject var1, final SubLObject var148, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14566(var1, var148, var19, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15050(module0172.f10921(var1), var148, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15051(final SubLObject var100, final SubLObject var149) {
        final SubLObject var150 = f15052(var100);
        final SubLObject var151 = f15053(var149);
        SubLObject var152 = (SubLObject)NIL;
        if (NIL == var152) {
            SubLObject var153 = var150;
            SubLObject var154 = (SubLObject)NIL;
            var154 = var153.first();
            while (NIL == var152 && NIL != var153) {
                if (NIL != module0004.f104(var154, var151, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var152 = var154;
                }
                var153 = var153.rest();
                var154 = var153.first();
            }
        }
        return var152;
    }
    
    public static SubLObject f15054(final SubLObject var100, final SubLObject var149) {
        if (NIL != module0004.f104(var100, (SubLObject)$ic238$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var149, (SubLObject)$ic238$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f15051(var149, var100);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15055(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14602(var1, $ic239$, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15055(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15056(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return module0220.f14602(var1, $ic240$, (SubLObject)ONE_INTEGER, (SubLObject)$ic94$, var19, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0155.f9779(var1, Symbols.symbol_function((SubLObject)$ic79$), var19)) {
            return f15056(module0172.f10921(var1), var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15053(final SubLObject var53) {
        if (var53.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic241$;
        }
        if (var53.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic242$;
        }
        if (var53.eql((SubLObject)THREE_INTEGER)) {
            return (SubLObject)$ic243$;
        }
        if (var53.eql((SubLObject)FOUR_INTEGER)) {
            return (SubLObject)$ic244$;
        }
        if (var53.eql((SubLObject)FIVE_INTEGER)) {
            return (SubLObject)$ic245$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15052(final SubLObject var53) {
        if (var53.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic246$;
        }
        if (var53.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic247$;
        }
        if (var53.eql((SubLObject)THREE_INTEGER)) {
            return (SubLObject)$ic248$;
        }
        if (var53.eql((SubLObject)FOUR_INTEGER)) {
            return (SubLObject)$ic249$;
        }
        if (var53.eql((SubLObject)FIVE_INTEGER)) {
            return (SubLObject)$ic250$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15057(final SubLObject var154) {
        if (var154.eql($ic251$)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var154.eql($ic252$)) {
            return (SubLObject)TWO_INTEGER;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic253$, var154, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15058(final SubLObject var23) {
        if (var23.eql((SubLObject)ONE_INTEGER)) {
            return $ic251$;
        }
        if (var23.eql((SubLObject)TWO_INTEGER)) {
            return $ic252$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic254$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15059(final SubLObject var23) {
        if (var23.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic255$;
        }
        if (var23.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic256$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic254$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15060(final SubLObject var23) {
        if (var23.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic257$;
        }
        if (var23.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic258$;
        }
        module0202.f12747((SubLObject)THREE_INTEGER, (SubLObject)$ic254$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15061(final SubLObject var23) {
        if (var23.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic259$;
        }
        if (var23.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic260$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15062(final SubLObject var26, final SubLObject var152, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)$ic238$;
        }
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = var155;
        SubLObject var158 = (SubLObject)NIL;
        var158 = var157.first();
        while (NIL != var157) {
            var156 = module0217.f14234(var26, var158, var152, var156);
            var157 = var157.rest();
            var158 = var157.first();
        }
        return var156;
    }
    
    public static SubLObject f15063(final SubLObject var26, final SubLObject var157, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)$ic238$;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        SubLObject var159 = (SubLObject)NIL;
        final SubLObject var160 = module0018.$g584$.currentBinding(var158);
        final SubLObject var161 = module0018.$g598$.currentBinding(var158);
        final SubLObject var162 = module0018.$g599$.currentBinding(var158);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var158);
            module0018.$g598$.bind(var26, var158);
            module0018.$g599$.bind(var155, var158);
            final SubLObject var4_158 = module0147.$g2094$.currentBinding(var158);
            final SubLObject var5_159 = module0147.$g2095$.currentBinding(var158);
            try {
                module0147.$g2094$.bind((SubLObject)$ic4$, var158);
                module0147.$g2095$.bind($ic5$, var158);
                module0259.f16869(Symbols.symbol_function((SubLObject)$ic261$), var157, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var5_159, var158);
                module0147.$g2094$.rebind(var4_158, var158);
            }
            var159 = module0035.f2272(module0018.$g584$.getDynamicValue(var158));
        }
        finally {
            module0018.$g599$.rebind(var162, var158);
            module0018.$g598$.rebind(var161, var158);
            module0018.$g584$.rebind(var160, var158);
        }
        return var159;
    }
    
    public static SubLObject f15064(final SubLObject var152) {
        final SubLThread var153 = SubLProcess.currentSubLThread();
        module0018.$g584$.setDynamicValue(ConsesLow.nconc(module0018.$g584$.getDynamicValue(var153), f15062(module0018.$g598$.getDynamicValue(var153), var152, module0018.$g599$.getDynamicValue(var153))), var153);
        return module0018.$g584$.getDynamicValue(var153);
    }
    
    public static SubLObject f15065(final SubLObject var26) {
        return f15063(var26, $ic262$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15066(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var152.eql($ic43$)) {
            return Equality.eql(var10, $ic36$);
        }
        if (var152.eql($ic263$)) {
            return Equality.eql(var10, module0132.$g1543$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15067(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15068(final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var153 = f15069(var152, var19);
        if (NIL != var153) {
            return var153;
        }
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f15069(final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0220.f14557(var152, $ic264$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15070(final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLObject var154;
        final SubLObject var153 = var154 = f15068(var152, var19);
        if (var154.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var154.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15071(final SubLObject var152, final SubLObject var160, final SubLObject var161, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15072(f15073(var152, var19), var160, var161, var19);
    }
    
    public static SubLObject f15072(final SubLObject var152, final SubLObject var160, final SubLObject var161, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != f15074(var152)) {
            return module0316.f21362(var152, (SubLObject)$ic265$, var160, var161, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15074(final SubLObject var152) {
        return (SubLObject)makeBoolean(NIL != f14800(var152) && NIL != f14797(var152) && NIL != f14795(var152));
    }
    
    public static SubLObject f15073(final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var152.eql($ic43$)) {
            return $ic266$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15075(final SubLObject var26, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = $ic267$;
        }
        assert NIL != module0173.f10955(var26) : var26;
        assert NIL != module0161.f10481(var19) : var19;
        return module0220.f14554(var26, $ic269$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15076(final SubLObject var26, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var26) : var26;
        return module0220.f14557(var26, $ic275$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15077(final SubLObject var162, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var162)) {
            return module0220.f14557(var162, $ic275$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15078(final SubLObject var26, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL == module0173.f10955(var26)) {
            return (SubLObject)NIL;
        }
        return module0220.f14566(var26, $ic283$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15079(final SubLObject var163, SubLObject var152, SubLObject var156, SubLObject var164, SubLObject var19) {
        if (var152 == UNPROVIDED) {
            var152 = $ic275$;
        }
        if (var156 == UNPROVIDED) {
            var156 = (SubLObject)TWO_INTEGER;
        }
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)ONE_INTEGER;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        SubLObject var166 = (SubLObject)NIL;
        final SubLObject var167 = var19;
        final SubLObject var168 = module0147.$g2094$.currentBinding(var165);
        final SubLObject var169 = module0147.$g2095$.currentBinding(var165);
        final SubLObject var170 = module0018.$g603$.currentBinding(var165);
        final SubLObject var171 = module0018.$g587$.currentBinding(var165);
        final SubLObject var172 = module0018.$g589$.currentBinding(var165);
        final SubLObject var173 = module0018.$g590$.currentBinding(var165);
        final SubLObject var174 = module0018.$g584$.currentBinding(var165);
        try {
            module0147.$g2094$.bind(module0147.f9531(var167), var165);
            module0147.$g2095$.bind(module0147.f9534(var167), var165);
            module0018.$g603$.bind(Symbols.symbol_function((SubLObject)$ic284$), var165);
            module0018.$g587$.bind(var163.isString() ? var163 : module0038.f2638(var163), var165);
            module0018.$g589$.bind(var156, var165);
            module0018.$g590$.bind(var164, var165);
            module0018.$g584$.bind((SubLObject)NIL, var165);
            module0219.f14478(Symbols.symbol_function((SubLObject)$ic285$), var152, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var166 = module0018.$g584$.getDynamicValue(var165);
        }
        finally {
            module0018.$g584$.rebind(var174, var165);
            module0018.$g590$.rebind(var173, var165);
            module0018.$g589$.rebind(var172, var165);
            module0018.$g587$.rebind(var171, var165);
            module0018.$g603$.rebind(var170, var165);
            module0147.$g2095$.rebind(var169, var165);
            module0147.$g2094$.rebind(var168, var165);
        }
        return var166;
    }
    
    public static SubLObject f15080(final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        SubLObject var167 = (SubLObject)NIL;
        final SubLObject var168 = assertion_handles_oc.f11010();
        final SubLObject var169 = (SubLObject)$ic286$;
        final SubLObject var170 = module0065.f4733(var168);
        SubLObject var171 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var169) : var169;
        final SubLObject var172 = module0012.$g75$.currentBinding(var166);
        final SubLObject var173 = module0012.$g76$.currentBinding(var166);
        final SubLObject var174 = module0012.$g77$.currentBinding(var166);
        final SubLObject var175 = module0012.$g78$.currentBinding(var166);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var166);
            module0012.$g76$.bind((SubLObject)NIL, var166);
            module0012.$g77$.bind((SubLObject)T, var166);
            module0012.$g78$.bind(Time.get_universal_time(), var166);
            module0012.f478(var169);
            final SubLObject var170_171 = var168;
            if (NIL == module0065.f4772(var170_171, (SubLObject)$ic288$)) {
                final SubLObject var172_173 = var170_171;
                if (NIL == module0065.f4775(var172_173, (SubLObject)$ic288$)) {
                    final SubLObject var176 = module0065.f4740(var172_173);
                    final SubLObject var177 = (SubLObject)NIL;
                    SubLObject var178;
                    SubLObject var179;
                    SubLObject var180;
                    SubLObject var181;
                    for (var178 = Sequences.length(var176), var179 = (SubLObject)NIL, var179 = (SubLObject)ZERO_INTEGER; var179.numL(var178); var179 = Numbers.add(var179, (SubLObject)ONE_INTEGER)) {
                        var180 = ((NIL != var177) ? Numbers.subtract(var178, var179, (SubLObject)ONE_INTEGER) : var179);
                        var181 = Vectors.aref(var176, var180);
                        if (NIL == module0065.f4749(var181) || NIL == module0065.f4773((SubLObject)$ic288$)) {
                            if (NIL != module0065.f4749(var181)) {
                                var181 = (SubLObject)$ic288$;
                            }
                            module0012.note_percent_progress(var171, var170);
                            var171 = Numbers.add(var171, (SubLObject)ONE_INTEGER);
                            if (NIL != f15081(var165, var181)) {
                                var167 = (SubLObject)ConsesLow.cons(var181, var167);
                            }
                        }
                    }
                }
                final SubLObject var179_180 = var170_171;
                if (NIL == module0065.f4777(var179_180) || NIL == module0065.f4773((SubLObject)$ic288$)) {
                    final SubLObject var182 = module0065.f4738(var179_180);
                    SubLObject var183 = module0065.f4739(var179_180);
                    final SubLObject var184 = module0065.f4734(var179_180);
                    final SubLObject var185 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic288$)) ? NIL : $ic288$);
                    while (var183.numL(var184)) {
                        final SubLObject var186 = Hashtables.gethash_without_values(var183, var182, var185);
                        if (NIL == module0065.f4773((SubLObject)$ic288$) || NIL == module0065.f4749(var186)) {
                            module0012.note_percent_progress(var171, var170);
                            var171 = Numbers.add(var171, (SubLObject)ONE_INTEGER);
                            if (NIL != f15081(var165, var186)) {
                                var167 = (SubLObject)ConsesLow.cons(var186, var167);
                            }
                        }
                        var183 = Numbers.add(var183, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var175, var166);
            module0012.$g77$.rebind(var174, var166);
            module0012.$g76$.rebind(var173, var166);
            module0012.$g75$.rebind(var172, var166);
        }
        return var167;
    }
    
    public static SubLObject f15081(final SubLObject var165, final SubLObject var8) {
        if (NIL != module0178.f11284(var8)) {
            final SubLObject var166 = module0178.f11285(var8);
            SubLObject var167 = (SubLObject)NIL;
            if (NIL == var167) {
                SubLObject var168 = module0202.f12829(var166, (SubLObject)UNPROVIDED);
                SubLObject var169 = (SubLObject)NIL;
                var169 = var168.first();
                while (NIL == var167 && NIL != var168) {
                    if (var169.isString() && NIL != f15082(var165, var169, Symbols.symbol_function((SubLObject)$ic289$))) {
                        var167 = (SubLObject)T;
                    }
                    var168 = var168.rest();
                    var169 = var168.first();
                }
            }
            return var167;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15083(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        SubLObject var187 = (SubLObject)NIL;
        final SubLObject var188 = assertion_handles_oc.f11010();
        final SubLObject var189 = (SubLObject)$ic286$;
        final SubLObject var190 = module0065.f4733(var188);
        SubLObject var191 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var189) : var189;
        final SubLObject var192 = module0012.$g75$.currentBinding(var186);
        final SubLObject var193 = module0012.$g76$.currentBinding(var186);
        final SubLObject var194 = module0012.$g77$.currentBinding(var186);
        final SubLObject var195 = module0012.$g78$.currentBinding(var186);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var186);
            module0012.$g76$.bind((SubLObject)NIL, var186);
            module0012.$g77$.bind((SubLObject)T, var186);
            module0012.$g78$.bind(Time.get_universal_time(), var186);
            module0012.f478(var189);
            final SubLObject var170_186 = var188;
            if (NIL == module0065.f4772(var170_186, (SubLObject)$ic288$)) {
                final SubLObject var172_187 = var170_186;
                if (NIL == module0065.f4775(var172_187, (SubLObject)$ic288$)) {
                    final SubLObject var196 = module0065.f4740(var172_187);
                    final SubLObject var197 = (SubLObject)NIL;
                    SubLObject var198;
                    SubLObject var199;
                    SubLObject var200;
                    SubLObject var201;
                    for (var198 = Sequences.length(var196), var199 = (SubLObject)NIL, var199 = (SubLObject)ZERO_INTEGER; var199.numL(var198); var199 = Numbers.add(var199, (SubLObject)ONE_INTEGER)) {
                        var200 = ((NIL != var197) ? Numbers.subtract(var198, var199, (SubLObject)ONE_INTEGER) : var199);
                        var201 = Vectors.aref(var196, var200);
                        if (NIL == module0065.f4749(var201) || NIL == module0065.f4773((SubLObject)$ic288$)) {
                            if (NIL != module0065.f4749(var201)) {
                                var201 = (SubLObject)$ic288$;
                            }
                            module0012.note_percent_progress(var191, var190);
                            var191 = Numbers.add(var191, (SubLObject)ONE_INTEGER);
                            if (NIL != f15084(var185, var201)) {
                                var187 = (SubLObject)ConsesLow.cons(var201, var187);
                            }
                        }
                    }
                }
                final SubLObject var179_188 = var170_186;
                if (NIL == module0065.f4777(var179_188) || NIL == module0065.f4773((SubLObject)$ic288$)) {
                    final SubLObject var202 = module0065.f4738(var179_188);
                    SubLObject var203 = module0065.f4739(var179_188);
                    final SubLObject var204 = module0065.f4734(var179_188);
                    final SubLObject var205 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic288$)) ? NIL : $ic288$);
                    while (var203.numL(var204)) {
                        final SubLObject var206 = Hashtables.gethash_without_values(var203, var202, var205);
                        if (NIL == module0065.f4773((SubLObject)$ic288$) || NIL == module0065.f4749(var206)) {
                            module0012.note_percent_progress(var191, var190);
                            var191 = Numbers.add(var191, (SubLObject)ONE_INTEGER);
                            if (NIL != f15084(var185, var206)) {
                                var187 = (SubLObject)ConsesLow.cons(var206, var187);
                            }
                        }
                        var203 = Numbers.add(var203, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var195, var186);
            module0012.$g77$.rebind(var194, var186);
            module0012.$g76$.rebind(var193, var186);
            module0012.$g75$.rebind(var192, var186);
        }
        return var187;
    }
    
    public static SubLObject f15084(final SubLObject var185, final SubLObject var8) {
        if (NIL != module0178.f11284(var8)) {
            final SubLObject var186 = module0178.f11285(var8);
            SubLObject var187 = (SubLObject)NIL;
            if (NIL == var187) {
                SubLObject var188 = module0202.f12829(var186, (SubLObject)UNPROVIDED);
                SubLObject var189 = (SubLObject)NIL;
                var189 = var188.first();
                while (NIL == var187 && NIL != var188) {
                    if (var189.isString() && NIL != f15082(var185, var189, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var187 = (SubLObject)T;
                    }
                    var188 = var188.rest();
                    var189 = var188.first();
                }
            }
            return var187;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15082(final SubLObject var189, final SubLObject var190, SubLObject var191) {
        if (var191 == UNPROVIDED) {
            var191 = Symbols.symbol_function((SubLObject)$ic290$);
        }
        if (var190.isString()) {
            SubLObject var192 = (SubLObject)NIL;
            if (NIL == var192) {
                SubLObject var193;
                SubLObject var194;
                for (var193 = var189, var194 = (SubLObject)NIL, var194 = var193.first(); NIL == var192 && NIL != var193; var192 = module0038.f2668(Functions.funcall(var191, var194), var190, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var193 = var193.rest(), var194 = var193.first()) {}
            }
            return var192;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15085(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0178.f11284(var8) && (NIL == module0018.$g603$.getDynamicValue(var9) || NIL != Functions.funcall(module0018.$g603$.getDynamicValue(var9), var8))) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(module0178.f11331(var8, module0018.$g590$.getDynamicValue(var9)), module0018.$g584$.getDynamicValue(var9)), var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15086(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0178.f11284(var8)) {
            final SubLObject var10 = module0178.f11331(var8, module0018.$g589$.getDynamicValue(var9));
            return module0038.f2668(module0018.$g587$.getDynamicValue(var9), var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15087(final SubLObject var194, final SubLObject var195, SubLObject var19, SubLObject var156, SubLObject var164, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = module0147.$g2095$.getDynamicValue();
        }
        if (var156 == UNPROVIDED) {
            var156 = (SubLObject)ONE_INTEGER;
        }
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)TWO_INTEGER;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        final SubLThread var196 = SubLProcess.currentSubLThread();
        SubLObject var197 = (SubLObject)NIL;
        final SubLObject var198 = (SubLObject)NIL;
        final SubLObject var199 = module0147.$g2094$.currentBinding(var196);
        final SubLObject var200 = module0147.$g2095$.currentBinding(var196);
        try {
            module0147.$g2094$.bind((SubLObject)$ic291$, var196);
            module0147.$g2095$.bind(var19, var196);
            if (NIL != module0158.f10010(var194, var156, var195)) {
                final SubLObject var201 = module0158.f10011(var194, var156, var195);
                SubLObject var202 = var198;
                final SubLObject var203 = (SubLObject)NIL;
                while (NIL == var202) {
                    final SubLObject var204 = module0052.f3695(var201, var203);
                    final SubLObject var205 = (SubLObject)makeBoolean(!var203.eql(var204));
                    if (NIL != var205) {
                        SubLObject var206 = (SubLObject)NIL;
                        try {
                            var206 = module0158.f10316(var204, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                            SubLObject var199_204 = var198;
                            final SubLObject var200_205 = (SubLObject)NIL;
                            while (NIL == var199_204) {
                                final SubLObject var207 = module0052.f3695(var206, var200_205);
                                final SubLObject var202_206 = (SubLObject)makeBoolean(!var200_205.eql(var207));
                                if (NIL != var202_206 && NIL != f15088(var207, var125)) {
                                    final SubLObject var208 = module0178.f11331(var207, var164);
                                    if (NIL == conses_high.member(var208, var197, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var197 = (SubLObject)ConsesLow.cons(var208, var197);
                                    }
                                }
                                var199_204 = (SubLObject)makeBoolean(NIL == var202_206 || NIL != var198);
                            }
                        }
                        finally {
                            final SubLObject var4_207 = Threads.$is_thread_performing_cleanupP$.currentBinding(var196);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var196);
                                if (NIL != var206) {
                                    module0158.f10319(var206);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_207, var196);
                            }
                        }
                    }
                    var202 = (SubLObject)makeBoolean(NIL == var205 || NIL != var198);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var200, var196);
            module0147.$g2094$.rebind(var199, var196);
        }
        return var197;
    }
    
    public static SubLObject f15088(final SubLObject var8, final SubLObject var125) {
        if (NIL != module0342.f23104(var8)) {
            return (SubLObject)NIL;
        }
        SubLObject var126 = (SubLObject)NIL;
        if (NIL == var126) {
            SubLObject var127;
            SubLObject var128;
            for (var127 = module0178.f11299(var8), var128 = (SubLObject)NIL, var128 = var127.first(); NIL == var126 && NIL != var127; var126 = Equality.eq(var125, module0191.f11924(var128)), var127 = var127.rest(), var128 = var127.first()) {}
        }
        return var126;
    }
    
    public static SubLObject f15089(final SubLObject var10, SubLObject var210, SubLObject var211) {
        if (var210 == UNPROVIDED) {
            var210 = f15090(var10);
        }
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)T;
        }
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            f15089(module0172.f10921(var10), var210, var211);
        }
        else if (NIL != module0173.f10955(var10)) {
            if (NIL != var210) {
                SubLObject var212 = var210;
                SubLObject var213 = (SubLObject)NIL;
                var213 = var212.first();
                while (NIL != var212) {
                    f15091(var10, var213, var211);
                    var212 = var212.rest();
                    var213 = var212.first();
                }
            }
            else {
                f15091(var10, var210, var211);
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15092(final SubLObject var26, SubLObject var210, SubLObject var211) {
        if (var210 == UNPROVIDED) {
            var210 = f15090(var26);
        }
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)T;
        }
        return f15089(var26, var210, var211);
    }
    
    public static SubLObject f15091(final SubLObject var26, SubLObject var19, SubLObject var211) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)T;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var26) : var26;
        final SubLObject var213 = module0018.$g584$.currentBinding(var212);
        final SubLObject var214 = module0018.$g593$.currentBinding(var212);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var212);
            module0018.$g593$.bind((SubLObject)NIL, var212);
            if (NIL != var19) {
                final SubLObject var4_212 = module0147.$g2094$.currentBinding(var212);
                final SubLObject var5_213 = module0147.$g2095$.currentBinding(var212);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic291$, var212);
                    module0147.$g2095$.bind(var19, var212);
                    module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var26);
                }
                finally {
                    module0147.$g2095$.rebind(var5_213, var212);
                    module0147.$g2094$.rebind(var4_212, var212);
                }
            }
            else {
                final SubLObject var4_213 = module0147.$g2094$.currentBinding(var212);
                final SubLObject var5_214 = module0147.$g2095$.currentBinding(var212);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic4$, var212);
                    module0147.$g2095$.bind($ic5$, var212);
                    module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var26);
                }
                finally {
                    module0147.$g2095$.rebind(var5_214, var212);
                    module0147.$g2094$.rebind(var4_213, var212);
                }
            }
            module0018.$g584$.setDynamicValue(Sequences.delete_duplicates(module0018.$g584$.getDynamicValue(var212), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var212);
            if (NIL != var19) {
                PrintLow.format(var211, (SubLObject)$ic294$, var19);
            }
            else {
                streams_high.terpri(var211);
            }
            SubLObject var215 = module0018.$g584$.getDynamicValue(var212);
            SubLObject var216 = (SubLObject)NIL;
            var216 = var215.first();
            while (NIL != var215) {
                PrintLow.format(var211, (SubLObject)$ic295$, module0538.f33478(var216, (SubLObject)UNPROVIDED));
                var215 = var215.rest();
                var216 = var215.first();
            }
        }
        finally {
            module0018.$g593$.rebind(var214, var212);
            module0018.$g584$.rebind(var213, var212);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15090(final SubLObject var26) {
        if (NIL != module0173.f10955(var26)) {
            SubLObject var27 = (SubLObject)NIL;
            SubLObject var28 = f15093(var26, (SubLObject)UNPROVIDED);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                final SubLObject var30 = module0178.f11287(var29);
                if (NIL == conses_high.member(var30, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var27 = (SubLObject)ConsesLow.cons(var30, var27);
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
            return Sequences.nreverse(var27);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15094(final SubLObject var10, SubLObject var19, SubLObject var211) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)T;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            f15094(module0172.f10921(var10), var19, var211);
        }
        else if (NIL != module0173.f10955(var10)) {
            if ($ic296$.eql(var19)) {
                final SubLObject var213 = module0147.$g2094$.currentBinding(var212);
                final SubLObject var214 = module0147.$g2095$.currentBinding(var212);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic4$, var212);
                    module0147.$g2095$.bind($ic5$, var212);
                    f15095(var10, var211);
                }
                finally {
                    module0147.$g2095$.rebind(var214, var212);
                    module0147.$g2094$.rebind(var213, var212);
                }
            }
            else {
                final SubLObject var215 = var19;
                final SubLObject var216 = module0147.$g2094$.currentBinding(var212);
                final SubLObject var217 = module0147.$g2095$.currentBinding(var212);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var215), var212);
                    module0147.$g2095$.bind(module0147.f9534(var215), var212);
                    f15095(var10, var211);
                }
                finally {
                    module0147.$g2095$.rebind(var217, var212);
                    module0147.$g2094$.rebind(var216, var212);
                }
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15096(final SubLObject var26, SubLObject var19, SubLObject var211) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic296$;
        }
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)T;
        }
        return f15094(var26, var19, var211);
    }
    
    public static SubLObject f15095(final SubLObject var26, SubLObject var211) {
        if (var211 == UNPROVIDED) {
            var211 = (SubLObject)T;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)NIL;
        SubLObject var214 = (SubLObject)$ic300$;
        SubLObject var215 = (SubLObject)NIL;
        var215 = var214.first();
        while (NIL != var214) {
            if (NIL != module0220.f14544(var26, var215, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                PrintLow.format(var211, (SubLObject)$ic297$, var215);
                final SubLObject var216 = module0018.$g601$.currentBinding(var212);
                final SubLObject var217 = module0018.$g590$.currentBinding(var212);
                try {
                    module0018.$g601$.bind(Symbols.symbol_function((SubLObject)$ic298$), var212);
                    module0018.$g590$.bind((SubLObject)TWO_INTEGER, var212);
                    module0219.f14477(Symbols.symbol_function((SubLObject)$ic299$), var26, (SubLObject)ONE_INTEGER, var215, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0018.$g590$.rebind(var217, var212);
                    module0018.$g601$.rebind(var216, var212);
                }
            }
            else {
                var213 = (SubLObject)ConsesLow.cons(var215, var213);
            }
            var214 = var214.rest();
            var215 = var214.first();
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic301$);
        var214 = var213;
        SubLObject var218 = (SubLObject)NIL;
        var218 = var214.first();
        while (NIL != var214) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic302$, var218);
            var214 = var214.rest();
            var218 = var214.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15097(final SubLObject var53, SubLObject var211) {
        if (var211 == UNPROVIDED) {
            var211 = module0018.$g592$.getDynamicValue();
        }
        PrintLow.format(var211, (SubLObject)$ic303$, var53);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15098(final SubLObject var8, SubLObject var218, SubLObject var211) {
        if (var218 == UNPROVIDED) {
            var218 = module0018.$g591$.getDynamicValue();
        }
        if (var211 == UNPROVIDED) {
            var211 = module0018.$g592$.getDynamicValue();
        }
        PrintLow.format(var211, (SubLObject)$ic303$, module0178.f11331(var8, var218.first()));
        SubLObject var219 = var218.rest();
        SubLObject var220 = (SubLObject)NIL;
        var220 = var219.first();
        while (NIL != var219) {
            PrintLow.format(var211, (SubLObject)$ic304$, module0178.f11331(var8, var220));
            var219 = var219.rest();
            var220 = var219.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15099(final SubLObject var1, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1) && NIL != f15100(var1)) {
            return module0220.f14566(var1, $ic305$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15101(final SubLObject var1, final SubLObject var23, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return module0004.f104(var23, f15099(var1, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15100(final SubLObject var1) {
        return module0222.f14635($ic305$, var1, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15093(final SubLObject var10, SubLObject var219) {
        if (var219 == UNPROVIDED) {
            var219 = (SubLObject)NIL;
        }
        assert NIL != module0212.f13762(var10) : var10;
        return f15102(var10, $ic306$, var219);
    }
    
    public static SubLObject f15102(final SubLObject var10, SubLObject var19, SubLObject var219) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var219 == UNPROVIDED) {
            var219 = (SubLObject)NIL;
        }
        final SubLThread var220 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var10) : var10;
        SubLObject var221 = (SubLObject)NIL;
        final SubLObject var222 = var19;
        final SubLObject var223 = module0147.$g2095$.currentBinding(var220);
        final SubLObject var224 = module0147.$g2094$.currentBinding(var220);
        final SubLObject var225 = module0147.$g2096$.currentBinding(var220);
        try {
            module0147.$g2095$.bind(module0147.f9545(var222), var220);
            module0147.$g2094$.bind(module0147.f9546(var222), var220);
            module0147.$g2096$.bind(module0147.f9549(var222), var220);
            var221 = module0219.f14503(var10, var219);
        }
        finally {
            module0147.$g2096$.rebind(var225, var220);
            module0147.$g2094$.rebind(var224, var220);
            module0147.$g2095$.rebind(var223, var220);
        }
        return var221;
    }
    
    public static SubLObject f15103(final SubLObject var26) {
        return f15093(var26, (SubLObject)T);
    }
    
    public static SubLObject f15104(final SubLObject var26) {
        if (NIL != module0173.f10955(var26)) {
            return f15093(var26, (SubLObject)T);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15105(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var10) : var10;
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0018.$g584$.currentBinding(var20);
        final SubLObject var23 = module0018.$g594$.currentBinding(var20);
        final SubLObject var24 = module0018.$g596$.currentBinding(var20);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var20);
            module0018.$g594$.bind((SubLObject)T, var20);
            module0018.$g596$.bind((SubLObject)$ic312$, var20);
            SubLObject var25 = (SubLObject)NIL;
            try {
                var20.throwStack.push($ic313$);
                if (NIL != var19) {
                    final SubLObject var4_221 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_222 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var20);
                        module0147.$g2095$.bind(var19, var20);
                        module0219.f14491(Symbols.symbol_function((SubLObject)$ic315$), var10);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_222, var20);
                        module0147.$g2094$.rebind(var4_221, var20);
                    }
                }
                else {
                    final SubLObject var4_222 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_223 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var20);
                        module0147.$g2095$.bind($ic5$, var20);
                        module0219.f14491(Symbols.symbol_function((SubLObject)$ic315$), var10);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_223, var20);
                        module0147.$g2094$.rebind(var4_222, var20);
                    }
                }
            }
            catch (Throwable var26) {
                var25 = Errors.handleThrowable(var26, (SubLObject)$ic313$);
            }
            finally {
                var20.throwStack.pop();
            }
            var21 = module0018.$g584$.getDynamicValue(var20);
        }
        finally {
            module0018.$g596$.rebind(var24, var20);
            module0018.$g594$.rebind(var23, var20);
            module0018.$g584$.rebind(var22, var20);
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f15106(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var10) : var10;
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0018.$g584$.currentBinding(var20);
        final SubLObject var23 = module0018.$g593$.currentBinding(var20);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var20);
            module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var20);
            if (NIL != var19) {
                final SubLObject var4_226 = module0147.$g2094$.currentBinding(var20);
                final SubLObject var5_227 = module0147.$g2095$.currentBinding(var20);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic314$, var20);
                    module0147.$g2095$.bind(module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var10), var20);
                }
                finally {
                    module0147.$g2095$.rebind(var5_227, var20);
                    module0147.$g2094$.rebind(var4_226, var20);
                }
            }
            else {
                final SubLObject var4_227 = module0147.$g2094$.currentBinding(var20);
                final SubLObject var5_228 = module0147.$g2095$.currentBinding(var20);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic4$, var20);
                    module0147.$g2095$.bind($ic5$, var20);
                    module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var10);
                }
                finally {
                    module0147.$g2095$.rebind(var5_228, var20);
                    module0147.$g2094$.rebind(var4_227, var20);
                }
            }
            var21 = module0018.$g584$.getDynamicValue(var20);
        }
        finally {
            module0018.$g593$.rebind(var23, var20);
            module0018.$g584$.rebind(var22, var20);
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f15107(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic316$), f15106(var10, var19));
    }
    
    public static SubLObject f15108(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0178.f11309(var8, module0018.$g615$.getDynamicValue(var9));
    }
    
    public static SubLObject f15109(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var10) : var10;
        SubLObject var154 = (SubLObject)NIL;
        final SubLObject var155 = module0018.$g584$.currentBinding(var153);
        final SubLObject var156 = module0018.$g593$.currentBinding(var153);
        final SubLObject var157 = module0018.$g615$.currentBinding(var153);
        final SubLObject var158 = module0018.$g603$.currentBinding(var153);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var153);
            module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var153);
            module0018.$g615$.bind(var152, var153);
            module0018.$g603$.bind(Symbols.symbol_function((SubLObject)$ic317$), var153);
            if (NIL != var19) {
                final SubLObject var4_230 = module0147.$g2094$.currentBinding(var153);
                final SubLObject var5_231 = module0147.$g2095$.currentBinding(var153);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic314$, var153);
                    module0147.$g2095$.bind(var19, var153);
                    module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var10);
                }
                finally {
                    module0147.$g2095$.rebind(var5_231, var153);
                    module0147.$g2094$.rebind(var4_230, var153);
                }
            }
            else {
                final SubLObject var4_231 = module0147.$g2094$.currentBinding(var153);
                final SubLObject var5_232 = module0147.$g2095$.currentBinding(var153);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic4$, var153);
                    module0147.$g2095$.bind($ic5$, var153);
                    module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var10);
                }
                finally {
                    module0147.$g2095$.rebind(var5_232, var153);
                    module0147.$g2094$.rebind(var4_231, var153);
                }
            }
            var154 = module0018.$g584$.getDynamicValue(var153);
        }
        finally {
            module0018.$g603$.rebind(var158, var153);
            module0018.$g615$.rebind(var157, var153);
            module0018.$g593$.rebind(var156, var153);
            module0018.$g584$.rebind(var155, var153);
        }
        return Sequences.nreverse(var154);
    }
    
    public static SubLObject f15110(final SubLObject var10, SubLObject var19, SubLObject var125, SubLObject var234, SubLObject var219) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var234 == UNPROVIDED) {
            var234 = (SubLObject)NIL;
        }
        if (var219 == UNPROVIDED) {
            var219 = (SubLObject)NIL;
        }
        final SubLThread var235 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var10) : var10;
        SubLObject var236 = (SubLObject)NIL;
        final SubLObject var237 = module0018.$g584$.currentBinding(var235);
        final SubLObject var238 = module0018.$g593$.currentBinding(var235);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var235);
            module0018.$g593$.bind((SubLObject)NIL, var235);
            final SubLObject var239 = var19;
            final SubLObject var4_235 = module0147.$g2094$.currentBinding(var235);
            final SubLObject var5_236 = module0147.$g2095$.currentBinding(var235);
            try {
                module0147.$g2094$.bind(module0147.f9531(var239), var235);
                module0147.$g2095$.bind(module0147.f9534(var239), var235);
                module0219.f14492(Symbols.symbol_function((SubLObject)$ic293$), var10, var125, var234);
            }
            finally {
                module0147.$g2095$.rebind(var5_236, var235);
                module0147.$g2094$.rebind(var4_235, var235);
            }
            if (NIL != var219) {
                module0018.$g584$.setDynamicValue(Sequences.delete_duplicates(module0018.$g584$.getDynamicValue(var235), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var235);
            }
            var236 = module0018.$g584$.getDynamicValue(var235);
        }
        finally {
            module0018.$g593$.rebind(var238, var235);
            module0018.$g584$.rebind(var237, var235);
        }
        return Sequences.nreverse(var236);
    }
    
    public static SubLObject f15111(final SubLObject var10) {
        if (NIL == module0173.f10955(var10)) {
            return (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(module0220.f14547(var10, $ic318$, (SubLObject)ONE_INTEGER, (SubLObject)$ic72$));
    }
    
    public static SubLObject f15112(final SubLObject var237) {
        final SubLThread var238 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var237) : var237;
        final SubLObject var239 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var240 = module0147.$g2094$.currentBinding(var238);
        final SubLObject var241 = module0147.$g2095$.currentBinding(var238);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var238);
            module0147.$g2095$.bind($ic5$, var238);
            if (NIL != module0158.f10282(var237, (SubLObject)NIL)) {
                final SubLObject var242 = module0158.f10283(var237, (SubLObject)NIL);
                SubLObject var243 = (SubLObject)NIL;
                final SubLObject var244 = (SubLObject)NIL;
                while (NIL == var243) {
                    final SubLObject var245 = module0052.f3695(var242, var244);
                    final SubLObject var246 = (SubLObject)makeBoolean(!var244.eql(var245));
                    if (NIL != var246) {
                        SubLObject var247 = (SubLObject)NIL;
                        try {
                            var247 = module0158.f10316(var245, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var199_240 = (SubLObject)NIL;
                            final SubLObject var200_241 = (SubLObject)NIL;
                            while (NIL == var199_240) {
                                final SubLObject var248 = module0052.f3695(var247, var200_241);
                                final SubLObject var202_242 = (SubLObject)makeBoolean(!var200_241.eql(var248));
                                if (NIL != var202_242 && NIL != module0158.f10284(var248, var245)) {
                                    final SubLObject var249 = module0178.f11295(var248);
                                    if (NIL != var249) {
                                        module0084.f5775(var239, var249, (SubLObject)UNPROVIDED);
                                    }
                                }
                                var199_240 = (SubLObject)makeBoolean(NIL == var202_242);
                            }
                        }
                        finally {
                            final SubLObject var4_244 = Threads.$is_thread_performing_cleanupP$.currentBinding(var238);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var238);
                                if (NIL != var247) {
                                    module0158.f10319(var247);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_244, var238);
                            }
                        }
                    }
                    var243 = (SubLObject)makeBoolean(NIL == var246);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var241, var238);
            module0147.$g2094$.rebind(var240, var238);
        }
        SubLObject var250 = (SubLObject)NIL;
        SubLObject var251 = (SubLObject)ZERO_INTEGER;
        SubLObject var252;
        for (var252 = module0066.f4838(module0067.f4891(var239)); NIL == module0066.f4841(var252); var252 = module0066.f4840(var252)) {
            var238.resetMultipleValues();
            final SubLObject var253 = module0066.f4839(var252);
            final SubLObject var254 = var238.secondMultipleValue();
            var238.resetMultipleValues();
            if (var254.numG(var251)) {
                var250 = var253;
                var251 = var254;
            }
        }
        module0066.f4842(var252);
        return Values.values(var250, var251);
    }
    
    public static SubLObject f15113(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15113(module0172.f10921(var10), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            final SubLObject var23 = module0018.$g584$.currentBinding(var20);
            final SubLObject var24 = module0018.$g593$.currentBinding(var20);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var20);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var20);
                if (NIL != var19) {
                    final SubLObject var4_250 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_251 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var20);
                        module0147.$g2095$.bind(var19, var20);
                        var22 = module0259.f16840(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_251, var20);
                        module0147.$g2094$.rebind(var4_250, var20);
                    }
                }
                else {
                    final SubLObject var4_251 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_252 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var20);
                        module0147.$g2095$.bind($ic5$, var20);
                        var22 = module0259.f16840(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_252, var20);
                        module0147.$g2094$.rebind(var4_251, var20);
                    }
                }
                SubLObject var25 = var22;
                SubLObject var26 = (SubLObject)NIL;
                var26 = var25.first();
                while (NIL != var25) {
                    f15114(var26, var19);
                    var25 = var25.rest();
                    var26 = var25.first();
                }
                var21 = module0018.$g584$.getDynamicValue(var20);
            }
            finally {
                module0018.$g593$.rebind(var24, var20);
                module0018.$g584$.rebind(var23, var20);
            }
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15115(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15113(var10, var19);
    }
    
    public static SubLObject f15114(final SubLObject var12, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0147.f9540(var19);
        final SubLObject var22 = module0147.$g2095$.currentBinding(var20);
        final SubLObject var23 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var24 = module0147.$g2096$.currentBinding(var20);
        try {
            module0147.$g2095$.bind(module0147.f9545(var21), var20);
            module0147.$g2094$.bind(module0147.f9546(var21), var20);
            module0147.$g2096$.bind(module0147.f9549(var21), var20);
            module0219.f14483(Symbols.symbol_function((SubLObject)$ic293$), var12, (SubLObject)$ic322$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0219.f14483(Symbols.symbol_function((SubLObject)$ic293$), var12, (SubLObject)$ic323$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var24, var20);
            module0147.$g2094$.rebind(var23, var20);
            module0147.$g2095$.rebind(var22, var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15116(final SubLObject var10, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15117(var10, var12, var19);
    }
    
    public static SubLObject f15117(final SubLObject var10, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15113(module0172.f10921(var10), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            final SubLObject var23 = module0018.$g584$.currentBinding(var20);
            final SubLObject var24 = module0018.$g593$.currentBinding(var20);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var20);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var20);
                if (NIL != var19) {
                    final SubLObject var4_254 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_255 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var20);
                        module0147.$g2095$.bind(var19, var20);
                        var22 = module0259.f16851(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_255, var20);
                        module0147.$g2094$.rebind(var4_254, var20);
                    }
                }
                else {
                    final SubLObject var4_255 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_256 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var20);
                        module0147.$g2095$.bind($ic5$, var20);
                        var22 = module0259.f16851(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_256, var20);
                        module0147.$g2094$.rebind(var4_255, var20);
                    }
                }
                SubLObject var25 = var22;
                SubLObject var26 = (SubLObject)NIL;
                var26 = var25.first();
                while (NIL != var25) {
                    f15114(var26, var19);
                    var25 = var25.rest();
                    var26 = var25.first();
                }
                var21 = module0018.$g584$.getDynamicValue(var20);
            }
            finally {
                module0018.$g593$.rebind(var24, var20);
                module0018.$g584$.rebind(var23, var20);
            }
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15118(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15119(var10, var152, var19);
    }
    
    public static SubLObject f15119(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15113(module0172.f10921(var10), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var154 = (SubLObject)NIL;
            final SubLObject var155 = module0018.$g584$.currentBinding(var153);
            final SubLObject var156 = module0018.$g593$.currentBinding(var153);
            final SubLObject var157 = module0018.$g615$.currentBinding(var153);
            final SubLObject var158 = module0018.$g603$.currentBinding(var153);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var153);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var153);
                module0018.$g615$.bind(var152, var153);
                module0018.$g603$.bind(Symbols.symbol_function((SubLObject)$ic317$), var153);
                SubLObject var159 = module0259.f16840(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var160 = (SubLObject)NIL;
                var160 = var159.first();
                while (NIL != var159) {
                    f15114(var160, var19);
                    var159 = var159.rest();
                    var160 = var159.first();
                }
                var154 = module0018.$g584$.getDynamicValue(var153);
            }
            finally {
                module0018.$g603$.rebind(var158, var153);
                module0018.$g615$.rebind(var157, var153);
                module0018.$g593$.rebind(var156, var153);
                module0018.$g584$.rebind(var155, var153);
            }
            return var154;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15120(final SubLObject var10, final SubLObject var12, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15121(var10, var12, var152, var19);
    }
    
    public static SubLObject f15121(final SubLObject var10, final SubLObject var12, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15113(module0172.f10921(var10), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var154 = (SubLObject)NIL;
            SubLObject var155 = (SubLObject)NIL;
            final SubLObject var156 = module0018.$g584$.currentBinding(var153);
            final SubLObject var157 = module0018.$g593$.currentBinding(var153);
            final SubLObject var158 = module0018.$g615$.currentBinding(var153);
            final SubLObject var159 = module0018.$g603$.currentBinding(var153);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var153);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var153);
                module0018.$g615$.bind(var152, var153);
                module0018.$g603$.bind(Symbols.symbol_function((SubLObject)$ic317$), var153);
                if (NIL != var19) {
                    final SubLObject var4_258 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var5_259 = module0147.$g2095$.currentBinding(var153);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var153);
                        module0147.$g2095$.bind(var19, var153);
                        var155 = module0259.f16851(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_259, var153);
                        module0147.$g2094$.rebind(var4_258, var153);
                    }
                }
                else {
                    final SubLObject var4_259 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var5_260 = module0147.$g2095$.currentBinding(var153);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var153);
                        module0147.$g2095$.bind($ic5$, var153);
                        var155 = module0259.f16851(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_260, var153);
                        module0147.$g2094$.rebind(var4_259, var153);
                    }
                }
                SubLObject var160 = var155;
                SubLObject var161 = (SubLObject)NIL;
                var161 = var160.first();
                while (NIL != var160) {
                    f15114(var161, var19);
                    var160 = var160.rest();
                    var161 = var160.first();
                }
                var154 = module0018.$g584$.getDynamicValue(var153);
            }
            finally {
                module0018.$g603$.rebind(var159, var153);
                module0018.$g615$.rebind(var158, var153);
                module0018.$g593$.rebind(var157, var153);
                module0018.$g584$.rebind(var156, var153);
            }
            return var154;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15122(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15122(module0172.f10921(var10), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            final SubLObject var23 = module0018.$g584$.currentBinding(var20);
            final SubLObject var24 = module0018.$g593$.currentBinding(var20);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var20);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var20);
                if (NIL != var19) {
                    final SubLObject var4_263 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_264 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var20);
                        module0147.$g2095$.bind(var19, var20);
                        var22 = module0256.f16531(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_264, var20);
                        module0147.$g2094$.rebind(var4_263, var20);
                    }
                }
                else {
                    final SubLObject var4_264 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_265 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var20);
                        module0147.$g2095$.bind($ic5$, var20);
                        var22 = module0256.f16531(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_265, var20);
                        module0147.$g2094$.rebind(var4_264, var20);
                    }
                }
                SubLObject var25 = var22;
                SubLObject var26 = (SubLObject)NIL;
                var26 = var25.first();
                while (NIL != var25) {
                    f15114(var26, var19);
                    var25 = var25.rest();
                    var26 = var25.first();
                }
                var21 = module0018.$g584$.getDynamicValue(var20);
            }
            finally {
                module0018.$g593$.rebind(var24, var20);
                module0018.$g584$.rebind(var23, var20);
            }
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15123(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15122(var10, var19);
    }
    
    public static SubLObject f15124(final SubLObject var10, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15125(var10, var12, var19);
    }
    
    public static SubLObject f15125(final SubLObject var10, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15125(module0172.f10921(var10), var12, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            final SubLObject var23 = module0018.$g584$.currentBinding(var20);
            final SubLObject var24 = module0018.$g593$.currentBinding(var20);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var20);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var20);
                if (NIL != var19) {
                    final SubLObject var4_267 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_268 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var20);
                        module0147.$g2095$.bind(var19, var20);
                        var22 = module0256.f16565(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_268, var20);
                        module0147.$g2094$.rebind(var4_267, var20);
                    }
                }
                else {
                    final SubLObject var4_268 = module0147.$g2094$.currentBinding(var20);
                    final SubLObject var5_269 = module0147.$g2095$.currentBinding(var20);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var20);
                        module0147.$g2095$.bind($ic5$, var20);
                        var22 = module0256.f16565(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_269, var20);
                        module0147.$g2094$.rebind(var4_268, var20);
                    }
                }
                SubLObject var25 = var22;
                SubLObject var26 = (SubLObject)NIL;
                var26 = var25.first();
                while (NIL != var25) {
                    f15114(var26, var19);
                    var25 = var25.rest();
                    var26 = var25.first();
                }
                var21 = module0018.$g584$.getDynamicValue(var20);
            }
            finally {
                module0018.$g593$.rebind(var24, var20);
                module0018.$g584$.rebind(var23, var20);
            }
            return var21;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15126(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15127(var10, var152, var19);
    }
    
    public static SubLObject f15127(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15127(module0172.f10921(var10), var152, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var154 = (SubLObject)NIL;
            SubLObject var155 = (SubLObject)NIL;
            final SubLObject var156 = module0018.$g584$.currentBinding(var153);
            final SubLObject var157 = module0018.$g593$.currentBinding(var153);
            final SubLObject var158 = module0018.$g615$.currentBinding(var153);
            final SubLObject var159 = module0018.$g603$.currentBinding(var153);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var153);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var153);
                module0018.$g615$.bind(var152, var153);
                module0018.$g603$.bind(Symbols.symbol_function((SubLObject)$ic317$), var153);
                if (NIL != var19) {
                    final SubLObject var4_271 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var5_272 = module0147.$g2095$.currentBinding(var153);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var153);
                        module0147.$g2095$.bind(var19, var153);
                        var155 = module0256.f16531(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_272, var153);
                        module0147.$g2094$.rebind(var4_271, var153);
                    }
                }
                else {
                    final SubLObject var4_272 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var5_273 = module0147.$g2095$.currentBinding(var153);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var153);
                        module0147.$g2095$.bind($ic5$, var153);
                        var155 = module0256.f16531(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_273, var153);
                        module0147.$g2094$.rebind(var4_272, var153);
                    }
                }
                SubLObject var160 = var155;
                SubLObject var161 = (SubLObject)NIL;
                var161 = var160.first();
                while (NIL != var160) {
                    f15114(var161, var19);
                    var160 = var160.rest();
                    var161 = var160.first();
                }
                var154 = module0018.$g584$.getDynamicValue(var153);
            }
            finally {
                module0018.$g603$.rebind(var159, var153);
                module0018.$g615$.rebind(var158, var153);
                module0018.$g593$.rebind(var157, var153);
                module0018.$g584$.rebind(var156, var153);
            }
            return var154;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15128(final SubLObject var10, final SubLObject var12, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15129(var10, var12, var152, var19);
    }
    
    public static SubLObject f15129(final SubLObject var10, final SubLObject var12, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15127(module0172.f10921(var10), var152, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var10)) {
            SubLObject var154 = (SubLObject)NIL;
            SubLObject var155 = (SubLObject)NIL;
            final SubLObject var156 = module0018.$g584$.currentBinding(var153);
            final SubLObject var157 = module0018.$g593$.currentBinding(var153);
            final SubLObject var158 = module0018.$g615$.currentBinding(var153);
            final SubLObject var159 = module0018.$g603$.currentBinding(var153);
            try {
                module0018.$g584$.bind((SubLObject)NIL, var153);
                module0018.$g593$.bind(Symbols.symbol_function((SubLObject)EQL), var153);
                module0018.$g615$.bind(var152, var153);
                module0018.$g603$.bind(Symbols.symbol_function((SubLObject)$ic317$), var153);
                if (NIL != var19) {
                    final SubLObject var4_275 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var5_276 = module0147.$g2095$.currentBinding(var153);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic314$, var153);
                        module0147.$g2095$.bind(var19, var153);
                        var155 = module0256.f16565(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_276, var153);
                        module0147.$g2094$.rebind(var4_275, var153);
                    }
                }
                else {
                    final SubLObject var4_276 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var5_277 = module0147.$g2095$.currentBinding(var153);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic4$, var153);
                        module0147.$g2095$.bind($ic5$, var153);
                        var155 = module0256.f16565(var10, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var5_277, var153);
                        module0147.$g2094$.rebind(var4_276, var153);
                    }
                }
                SubLObject var160 = var155;
                SubLObject var161 = (SubLObject)NIL;
                var161 = var160.first();
                while (NIL != var160) {
                    f15114(var161, var19);
                    var160 = var160.rest();
                    var161 = var160.first();
                }
                var154 = module0018.$g584$.getDynamicValue(var153);
            }
            finally {
                module0018.$g603$.rebind(var159, var153);
                module0018.$g615$.rebind(var158, var153);
                module0018.$g593$.rebind(var157, var153);
                module0018.$g584$.rebind(var156, var153);
            }
            return var154;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15130(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15130(module0172.f10921(var10), var19);
        }
        if (NIL != module0173.f10955(var10)) {
            return conses_high.nunion(f15106(var10, var19), conses_high.nunion(f15122(var10, var19), f15113(var10, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15131(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15130(var10, var19);
    }
    
    public static SubLObject f15132(final SubLObject var10, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15133(var10, var12, var19);
    }
    
    public static SubLObject f15133(final SubLObject var10, final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15133(module0172.f10921(var10), var12, var19);
        }
        if (NIL != module0210.f13593(var12, (SubLObject)UNPROVIDED)) {
            return f15133(var10, module0172.f10921(var12), var19);
        }
        if (NIL != module0173.f10955(var10) && NIL != module0269.f17705(var12)) {
            return conses_high.nunion(f15106(var10, var19), conses_high.nunion(f15125(var10, var12, var19), f15117(var10, var12, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15134(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15135(var10, var152, var19);
    }
    
    public static SubLObject f15135(final SubLObject var10, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15130(module0172.f10921(var10), var152);
        }
        if (NIL != module0173.f10955(var10) && NIL != module0173.f10955(var152)) {
            return conses_high.nunion(f15109(var10, var152, var19), conses_high.nunion(f15127(var10, var152, var19), f15119(var10, var152, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15136(final SubLObject var10, final SubLObject var12, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return f15137(var10, var12, var152, var19);
    }
    
    public static SubLObject f15137(final SubLObject var10, final SubLObject var12, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15133(module0172.f10921(var10), var12, var19);
        }
        if (NIL != module0210.f13593(var12, (SubLObject)UNPROVIDED)) {
            return f15133(var10, module0172.f10921(var12), var19);
        }
        if (NIL != module0173.f10955(var10) && NIL != module0269.f17705(var12)) {
            return conses_high.nunion(f15106(var10, var19), conses_high.nunion(f15129(var10, var12, var152, var19), f15121(var10, var12, var152, var19), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15138(final SubLObject var26, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)$ic72$;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)NIL;
        final SubLObject var128 = var19;
        final SubLObject var129 = module0147.$g2094$.currentBinding(var126);
        final SubLObject var130 = module0147.$g2095$.currentBinding(var126);
        try {
            module0147.$g2094$.bind(module0147.f9531(var128), var126);
            module0147.$g2095$.bind(module0147.f9534(var128), var126);
            final SubLObject var131 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var26, (SubLObject)NIL, var131)) {
                final SubLObject var132 = module0158.f10011(var26, (SubLObject)NIL, var131);
                SubLObject var133 = (SubLObject)NIL;
                final SubLObject var134 = (SubLObject)NIL;
                while (NIL == var133) {
                    final SubLObject var135 = module0052.f3695(var132, var134);
                    final SubLObject var136 = (SubLObject)makeBoolean(!var134.eql(var135));
                    if (NIL != var136) {
                        SubLObject var137 = (SubLObject)NIL;
                        try {
                            var137 = module0158.f10316(var135, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                            SubLObject var199_279 = (SubLObject)NIL;
                            final SubLObject var200_280 = (SubLObject)NIL;
                            while (NIL == var199_279) {
                                final SubLObject var138 = module0052.f3695(var137, var200_280);
                                final SubLObject var202_282 = (SubLObject)makeBoolean(!var200_280.eql(var138));
                                if (NIL != var202_282) {
                                    var127 = (SubLObject)ConsesLow.cons(var138, var127);
                                }
                                var199_279 = (SubLObject)makeBoolean(NIL == var202_282);
                            }
                        }
                        finally {
                            final SubLObject var4_283 = Threads.$is_thread_performing_cleanupP$.currentBinding(var126);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var126);
                                if (NIL != var137) {
                                    module0158.f10319(var137);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_283, var126);
                            }
                        }
                    }
                    var133 = (SubLObject)makeBoolean(NIL == var136);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var130, var126);
            module0147.$g2094$.rebind(var129, var126);
        }
        return var127;
    }
    
    public static SubLObject f15139(final SubLObject var26, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = module0018.$g584$.currentBinding(var27);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var27);
            final SubLObject var30 = var19;
            final SubLObject var4_284 = module0147.$g2094$.currentBinding(var27);
            final SubLObject var31 = module0147.$g2095$.currentBinding(var27);
            try {
                module0147.$g2094$.bind(module0147.f9531(var30), var27);
                module0147.$g2095$.bind(module0147.f9534(var30), var27);
                module0219.f14491(Symbols.symbol_function((SubLObject)$ic293$), var26);
                var28 = module0018.$g584$.getDynamicValue(var27);
            }
            finally {
                module0147.$g2095$.rebind(var31, var27);
                module0147.$g2094$.rebind(var4_284, var27);
            }
        }
        finally {
            module0018.$g584$.rebind(var29, var27);
        }
        return var28;
    }
    
    public static SubLObject f15140(final SubLObject var26, final SubLObject var285, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        SubLObject var287 = (SubLObject)NIL;
        final SubLObject var288 = module0018.$g603$.currentBinding(var286);
        try {
            module0018.$g603$.bind(var285, var286);
            var287 = f15138(var26, var19, var125);
        }
        finally {
            module0018.$g603$.rebind(var288, var286);
        }
        return var287;
    }
    
    public static SubLObject f15141(final SubLObject var26, final SubLObject var285, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        SubLObject var287 = (SubLObject)NIL;
        final SubLObject var288 = module0018.$g603$.currentBinding(var286);
        try {
            module0018.$g603$.bind(var285, var286);
            var287 = f15139(var26, var19);
        }
        finally {
            module0018.$g603$.rebind(var288, var286);
        }
        return var287;
    }
    
    public static SubLObject f15142(final SubLObject var195) {
        return module0219.f14512(var195, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f15143(final SubLObject var10, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0210.f13593(var10, (SubLObject)UNPROVIDED)) {
            return f15143(module0172.f10921(var10), var19);
        }
        if (NIL != module0173.f10955(var10)) {
            return f15144(var10, var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15144(final SubLObject var26, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic327$), module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic328$), f15138(var26, var19, (SubLObject)$ic72$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15145(final SubLObject var286, final SubLObject var287) {
        SubLObject var289;
        final SubLObject var288 = var289 = var286.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var289, var288, (SubLObject)$ic329$);
        final SubLObject var290 = var289.rest();
        var289 = var289.first();
        SubLObject var291 = (SubLObject)NIL;
        SubLObject var292 = (SubLObject)NIL;
        SubLObject var293 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var289, var288, (SubLObject)$ic329$);
        var291 = var289.first();
        var289 = var289.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var289, var288, (SubLObject)$ic329$);
        var292 = var289.first();
        var289 = var289.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var289, var288, (SubLObject)$ic329$);
        var293 = var289.first();
        var289 = var289.rest();
        SubLObject var294 = (SubLObject)NIL;
        SubLObject var295 = var289;
        SubLObject var296 = (SubLObject)NIL;
        SubLObject var296_297 = (SubLObject)NIL;
        while (NIL != var295) {
            cdestructuring_bind.destructuring_bind_must_consp(var295, var288, (SubLObject)$ic329$);
            var296_297 = var295.first();
            var295 = var295.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var295, var288, (SubLObject)$ic329$);
            if (NIL == conses_high.member(var296_297, (SubLObject)$ic330$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var296 = (SubLObject)T;
            }
            if (var296_297 == $ic331$) {
                var294 = var295.first();
            }
            var295 = var295.rest();
        }
        if (NIL != var296 && NIL == var294) {
            cdestructuring_bind.cdestructuring_bind_error(var288, (SubLObject)$ic329$);
        }
        final SubLObject var297 = cdestructuring_bind.property_list_member((SubLObject)$ic332$, var289);
        final SubLObject var298 = (SubLObject)((NIL != var297) ? conses_high.cadr(var297) : NIL);
        final SubLObject var299 = cdestructuring_bind.property_list_member((SubLObject)$ic333$, var289);
        final SubLObject var300 = (SubLObject)((NIL != var299) ? conses_high.cadr(var299) : NIL);
        final SubLObject var301 = cdestructuring_bind.property_list_member((SubLObject)$ic334$, var289);
        final SubLObject var302 = (SubLObject)((NIL != var301) ? conses_high.cadr(var301) : NIL);
        final SubLObject var303;
        var289 = (var303 = var290);
        final SubLObject var304 = (SubLObject)$ic335$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic336$, (SubLObject)ConsesLow.list(var304, var293, var298, var300, var302), (SubLObject)ConsesLow.list((SubLObject)$ic337$, var298, (SubLObject)ConsesLow.listS((SubLObject)$ic338$, (SubLObject)ConsesLow.list(var291, var292, (SubLObject)$ic334$, var302, (SubLObject)$ic339$, var304, (SubLObject)$ic333$, var300), ConsesLow.append(var303, (SubLObject)NIL))));
    }
    
    public static SubLObject f15146(final SubLObject var10, final SubLObject var292, SubLObject var19, SubLObject var125) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        final SubLThread var293 = SubLProcess.currentSubLThread();
        SubLObject var294 = (SubLObject)NIL;
        final SubLObject var295 = module0137.$g1605$.currentBinding(var293);
        final SubLObject var296 = module0139.$g1636$.currentBinding(var293);
        try {
            module0137.$g1605$.bind(module0137.f8955($ic42$), var293);
            module0139.$g1636$.bind(module0139.f9007(), var293);
            SubLObject var305_306 = var292;
            final SubLObject var297 = (SubLObject)$ic344$;
            final SubLObject var298 = module0056.f4145(var297);
            final SubLObject var4_309 = module0139.$g1635$.currentBinding(var293);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var293);
                final SubLObject var299 = var19;
                final SubLObject var4_310 = module0147.$g2095$.currentBinding(var293);
                final SubLObject var5_311 = module0147.$g2094$.currentBinding(var293);
                final SubLObject var300 = module0147.$g2096$.currentBinding(var293);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var299), var293);
                    module0147.$g2094$.bind(module0147.f9546(var299), var293);
                    module0147.$g2096$.bind(module0147.f9549(var299), var293);
                    final SubLObject var301 = var125;
                    final SubLObject var4_311 = module0141.$g1714$.currentBinding(var293);
                    final SubLObject var5_312 = module0141.$g1715$.currentBinding(var293);
                    try {
                        module0141.$g1714$.bind((NIL != var301) ? var301 : module0141.f9283(), var293);
                        module0141.$g1715$.bind((SubLObject)((NIL != var301) ? $ic345$ : module0141.$g1715$.getDynamicValue(var293)), var293);
                        if (NIL != var301 && NIL != module0136.f8864() && NIL == module0141.f9279(var301)) {
                            final SubLObject var302 = module0136.$g1591$.getDynamicValue(var293);
                            if (var302.eql((SubLObject)$ic346$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic347$, var301, (SubLObject)$ic348$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var302.eql((SubLObject)$ic349$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic350$, (SubLObject)$ic347$, var301, (SubLObject)$ic348$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var302.eql((SubLObject)$ic351$)) {
                                Errors.warn((SubLObject)$ic347$, var301, (SubLObject)$ic348$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic352$, module0136.$g1591$.getDynamicValue(var293));
                                Errors.cerror((SubLObject)$ic350$, (SubLObject)$ic347$, var301, (SubLObject)$ic348$);
                            }
                        }
                        final SubLObject var4_312 = module0141.$g1670$.currentBinding(var293);
                        final SubLObject var5_313 = module0141.$g1671$.currentBinding(var293);
                        final SubLObject var29_317 = module0141.$g1672$.currentBinding(var293);
                        final SubLObject var303 = module0141.$g1674$.currentBinding(var293);
                        final SubLObject var304 = module0137.$g1605$.currentBinding(var293);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic42$)), var293);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic42$))), var293);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic42$))), var293);
                            module0141.$g1674$.bind((SubLObject)NIL, var293);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic42$)), var293);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var292, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var4_313 = module0141.$g1677$.currentBinding(var293);
                                final SubLObject var5_314 = module0138.$g1619$.currentBinding(var293);
                                final SubLObject var29_318 = module0141.$g1674$.currentBinding(var293);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var293);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic42$))), var293);
                                    module0141.$g1674$.bind((SubLObject)NIL, var293);
                                    module0249.f16055(var305_306, (SubLObject)UNPROVIDED);
                                    while (NIL != var305_306) {
                                        final SubLObject var305 = var305_306;
                                        SubLObject var307;
                                        final SubLObject var306 = var307 = module0200.f12443(module0137.f8955($ic42$));
                                        SubLObject var308 = (SubLObject)NIL;
                                        var308 = var307.first();
                                        while (NIL != var307) {
                                            final SubLObject var4_314 = module0137.$g1605$.currentBinding(var293);
                                            final SubLObject var5_315 = module0141.$g1674$.currentBinding(var293);
                                            try {
                                                module0137.$g1605$.bind(var308, var293);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var293)) : module0141.$g1674$.getDynamicValue(var293)), var293);
                                                final SubLObject var309 = module0228.f15229(var305);
                                                if (NIL != module0138.f8992(var309)) {
                                                    final SubLObject var310 = module0242.f15664(var309, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var310) {
                                                        final SubLObject var311 = module0245.f15834(var310, module0244.f15780(module0137.f8955($ic42$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var311) {
                                                            SubLObject var312;
                                                            for (var312 = module0066.f4838(module0067.f4891(var311)); NIL == module0066.f4841(var312); var312 = module0066.f4840(var312)) {
                                                                var293.resetMultipleValues();
                                                                final SubLObject var329_330 = module0066.f4839(var312);
                                                                final SubLObject var313 = var293.secondMultipleValue();
                                                                var293.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var329_330)) {
                                                                    final SubLObject var4_315 = module0138.$g1623$.currentBinding(var293);
                                                                    try {
                                                                        module0138.$g1623$.bind(var329_330, var293);
                                                                        SubLObject var247_333;
                                                                        for (var247_333 = module0066.f4838(module0067.f4891(var313)); NIL == module0066.f4841(var247_333); var247_333 = module0066.f4840(var247_333)) {
                                                                            var293.resetMultipleValues();
                                                                            final SubLObject var314 = module0066.f4839(var247_333);
                                                                            final SubLObject var315 = var293.secondMultipleValue();
                                                                            var293.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var314)) {
                                                                                final SubLObject var4_316 = module0138.$g1624$.currentBinding(var293);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var314, var293);
                                                                                    final SubLObject var316 = var315;
                                                                                    if (NIL != module0077.f5302(var316)) {
                                                                                        final SubLObject var317 = module0077.f5333(var316);
                                                                                        SubLObject var318;
                                                                                        SubLObject var319;
                                                                                        SubLObject var320;
                                                                                        SubLObject var28_342;
                                                                                        SubLObject var4_317;
                                                                                        SubLObject var5_316;
                                                                                        SubLObject var29_319;
                                                                                        SubLObject var197_346;
                                                                                        SubLObject var321;
                                                                                        SubLObject var322;
                                                                                        SubLObject var323;
                                                                                        SubLObject var324;
                                                                                        SubLObject var325;
                                                                                        SubLObject var326;
                                                                                        SubLObject var199_347;
                                                                                        SubLObject var200_348;
                                                                                        SubLObject var327;
                                                                                        SubLObject var202_350;
                                                                                        SubLObject var4_318;
                                                                                        for (var318 = module0032.f1741(var317), var319 = (SubLObject)NIL, var319 = module0032.f1742(var318, var317); NIL == module0032.f1744(var318, var319); var319 = module0032.f1743(var319)) {
                                                                                            var320 = module0032.f1745(var318, var319);
                                                                                            if (NIL != module0032.f1746(var319, var320) && NIL == module0249.f16059(var320, module0139.$g1636$.getDynamicValue(var293))) {
                                                                                                module0249.f16055(var320, module0139.$g1636$.getDynamicValue(var293));
                                                                                                if (NIL != module0173.f10955(var320)) {
                                                                                                    var28_342 = var19;
                                                                                                    var4_317 = module0147.$g2095$.currentBinding(var293);
                                                                                                    var5_316 = module0147.$g2094$.currentBinding(var293);
                                                                                                    var29_319 = module0147.$g2096$.currentBinding(var293);
                                                                                                    try {
                                                                                                        module0147.$g2095$.bind(module0147.f9545(var28_342), var293);
                                                                                                        module0147.$g2094$.bind(module0147.f9546(var28_342), var293);
                                                                                                        module0147.$g2096$.bind(module0147.f9549(var28_342), var293);
                                                                                                        var197_346 = var320;
                                                                                                        if (NIL != module0158.f10010(var10, (SubLObject)NIL, var197_346)) {
                                                                                                            var321 = module0158.f10011(var10, (SubLObject)NIL, var197_346);
                                                                                                            var322 = (SubLObject)NIL;
                                                                                                            var323 = (SubLObject)NIL;
                                                                                                            while (NIL == var322) {
                                                                                                                var324 = module0052.f3695(var321, var323);
                                                                                                                var325 = (SubLObject)makeBoolean(!var323.eql(var324));
                                                                                                                if (NIL != var325) {
                                                                                                                    var326 = (SubLObject)NIL;
                                                                                                                    try {
                                                                                                                        var326 = module0158.f10316(var324, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                                                                                                                        var199_347 = (SubLObject)NIL;
                                                                                                                        var200_348 = (SubLObject)NIL;
                                                                                                                        while (NIL == var199_347) {
                                                                                                                            var327 = module0052.f3695(var326, var200_348);
                                                                                                                            var202_350 = (SubLObject)makeBoolean(!var200_348.eql(var327));
                                                                                                                            if (NIL != var202_350) {
                                                                                                                                var294 = (SubLObject)ConsesLow.cons(var327, var294);
                                                                                                                            }
                                                                                                                            var199_347 = (SubLObject)makeBoolean(NIL == var202_350);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    finally {
                                                                                                                        var4_318 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                                                                                                                        try {
                                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                                                                                                                            if (NIL != var326) {
                                                                                                                                module0158.f10319(var326);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var4_318, var293);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                var322 = (SubLObject)makeBoolean(NIL == var325);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0147.$g2096$.rebind(var29_319, var293);
                                                                                                        module0147.$g2094$.rebind(var5_316, var293);
                                                                                                        module0147.$g2095$.rebind(var4_317, var293);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var316.isList()) {
                                                                                        SubLObject var328 = var316;
                                                                                        SubLObject var329 = (SubLObject)NIL;
                                                                                        var329 = var328.first();
                                                                                        while (NIL != var328) {
                                                                                            if (NIL == module0249.f16059(var329, module0139.$g1636$.getDynamicValue(var293))) {
                                                                                                module0249.f16055(var329, module0139.$g1636$.getDynamicValue(var293));
                                                                                                if (NIL != module0173.f10955(var329)) {
                                                                                                    final SubLObject var28_343 = var19;
                                                                                                    final SubLObject var4_319 = module0147.$g2095$.currentBinding(var293);
                                                                                                    final SubLObject var5_317 = module0147.$g2094$.currentBinding(var293);
                                                                                                    final SubLObject var29_320 = module0147.$g2096$.currentBinding(var293);
                                                                                                    try {
                                                                                                        module0147.$g2095$.bind(module0147.f9545(var28_343), var293);
                                                                                                        module0147.$g2094$.bind(module0147.f9546(var28_343), var293);
                                                                                                        module0147.$g2096$.bind(module0147.f9549(var28_343), var293);
                                                                                                        final SubLObject var197_347 = var329;
                                                                                                        if (NIL != module0158.f10010(var10, (SubLObject)NIL, var197_347)) {
                                                                                                            final SubLObject var330 = module0158.f10011(var10, (SubLObject)NIL, var197_347);
                                                                                                            SubLObject var331 = (SubLObject)NIL;
                                                                                                            final SubLObject var332 = (SubLObject)NIL;
                                                                                                            while (NIL == var331) {
                                                                                                                final SubLObject var333 = module0052.f3695(var330, var332);
                                                                                                                final SubLObject var334 = (SubLObject)makeBoolean(!var332.eql(var333));
                                                                                                                if (NIL != var334) {
                                                                                                                    SubLObject var335 = (SubLObject)NIL;
                                                                                                                    try {
                                                                                                                        var335 = module0158.f10316(var333, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                                                                                                                        SubLObject var199_348 = (SubLObject)NIL;
                                                                                                                        final SubLObject var200_349 = (SubLObject)NIL;
                                                                                                                        while (NIL == var199_348) {
                                                                                                                            final SubLObject var336 = module0052.f3695(var335, var200_349);
                                                                                                                            final SubLObject var202_351 = (SubLObject)makeBoolean(!var200_349.eql(var336));
                                                                                                                            if (NIL != var202_351) {
                                                                                                                                var294 = (SubLObject)ConsesLow.cons(var336, var294);
                                                                                                                            }
                                                                                                                            var199_348 = (SubLObject)makeBoolean(NIL == var202_351);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    finally {
                                                                                                                        final SubLObject var4_320 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                                                                                                                        try {
                                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                                                                                                                            if (NIL != var335) {
                                                                                                                                module0158.f10319(var335);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var4_320, var293);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                var331 = (SubLObject)makeBoolean(NIL == var334);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0147.$g2096$.rebind(var29_320, var293);
                                                                                                        module0147.$g2094$.rebind(var5_317, var293);
                                                                                                        module0147.$g2095$.rebind(var4_319, var293);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var328 = var328.rest();
                                                                                            var329 = var328.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic353$, var316);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var4_316, var293);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var247_333);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var4_315, var293);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var312);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic354$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var309, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var337 = module0248.f15995(var309);
                                                        SubLObject var338 = (SubLObject)NIL;
                                                        var338 = var337.first();
                                                        while (NIL != var337) {
                                                            SubLObject var340;
                                                            final SubLObject var339 = var340 = var338;
                                                            SubLObject var341 = (SubLObject)NIL;
                                                            SubLObject var365_366 = (SubLObject)NIL;
                                                            SubLObject var342 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var340, var339, (SubLObject)$ic355$);
                                                            var341 = var340.first();
                                                            var340 = var340.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var340, var339, (SubLObject)$ic355$);
                                                            var365_366 = var340.first();
                                                            var340 = var340.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var340, var339, (SubLObject)$ic355$);
                                                            var342 = var340.first();
                                                            var340 = var340.rest();
                                                            if (NIL == var340) {
                                                                if (NIL != module0147.f9507(var365_366)) {
                                                                    final SubLObject var4_321 = module0138.$g1623$.currentBinding(var293);
                                                                    try {
                                                                        module0138.$g1623$.bind(var365_366, var293);
                                                                        if (NIL != module0141.f9289(var342)) {
                                                                            final SubLObject var4_322 = module0138.$g1624$.currentBinding(var293);
                                                                            try {
                                                                                module0138.$g1624$.bind(var342, var293);
                                                                                final SubLObject var316;
                                                                                final SubLObject var343 = var316 = (SubLObject)ConsesLow.list(var341);
                                                                                if (NIL != module0077.f5302(var316)) {
                                                                                    final SubLObject var317 = module0077.f5333(var316);
                                                                                    SubLObject var318;
                                                                                    SubLObject var319;
                                                                                    SubLObject var320;
                                                                                    SubLObject var321;
                                                                                    SubLObject var322;
                                                                                    SubLObject var323;
                                                                                    SubLObject var324;
                                                                                    SubLObject var325;
                                                                                    SubLObject var326;
                                                                                    SubLObject var327;
                                                                                    SubLObject var28_344;
                                                                                    SubLObject var4_323;
                                                                                    SubLObject var5_318;
                                                                                    SubLObject var29_321;
                                                                                    SubLObject var197_348;
                                                                                    SubLObject var199_349;
                                                                                    SubLObject var200_350;
                                                                                    SubLObject var202_352;
                                                                                    SubLObject var4_324;
                                                                                    for (var318 = module0032.f1741(var317), var319 = (SubLObject)NIL, var319 = module0032.f1742(var318, var317); NIL == module0032.f1744(var318, var319); var319 = module0032.f1743(var319)) {
                                                                                        var320 = module0032.f1745(var318, var319);
                                                                                        if (NIL != module0032.f1746(var319, var320) && NIL == module0249.f16059(var320, module0139.$g1636$.getDynamicValue(var293))) {
                                                                                            module0249.f16055(var320, module0139.$g1636$.getDynamicValue(var293));
                                                                                            if (NIL != module0173.f10955(var320)) {
                                                                                                var28_344 = var19;
                                                                                                var4_323 = module0147.$g2095$.currentBinding(var293);
                                                                                                var5_318 = module0147.$g2094$.currentBinding(var293);
                                                                                                var29_321 = module0147.$g2096$.currentBinding(var293);
                                                                                                try {
                                                                                                    module0147.$g2095$.bind(module0147.f9545(var28_344), var293);
                                                                                                    module0147.$g2094$.bind(module0147.f9546(var28_344), var293);
                                                                                                    module0147.$g2096$.bind(module0147.f9549(var28_344), var293);
                                                                                                    var197_348 = var320;
                                                                                                    if (NIL != module0158.f10010(var10, (SubLObject)NIL, var197_348)) {
                                                                                                        var321 = module0158.f10011(var10, (SubLObject)NIL, var197_348);
                                                                                                        var322 = (SubLObject)NIL;
                                                                                                        var323 = (SubLObject)NIL;
                                                                                                        while (NIL == var322) {
                                                                                                            var324 = module0052.f3695(var321, var323);
                                                                                                            var325 = (SubLObject)makeBoolean(!var323.eql(var324));
                                                                                                            if (NIL != var325) {
                                                                                                                var326 = (SubLObject)NIL;
                                                                                                                try {
                                                                                                                    var326 = module0158.f10316(var324, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                                                                                                                    var199_349 = (SubLObject)NIL;
                                                                                                                    var200_350 = (SubLObject)NIL;
                                                                                                                    while (NIL == var199_349) {
                                                                                                                        var327 = module0052.f3695(var326, var200_350);
                                                                                                                        var202_352 = (SubLObject)makeBoolean(!var200_350.eql(var327));
                                                                                                                        if (NIL != var202_352) {
                                                                                                                            var294 = (SubLObject)ConsesLow.cons(var327, var294);
                                                                                                                        }
                                                                                                                        var199_349 = (SubLObject)makeBoolean(NIL == var202_352);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    var4_324 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                                                                                                                    try {
                                                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                                                                                                                        if (NIL != var326) {
                                                                                                                            module0158.f10319(var326);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    finally {
                                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_324, var293);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            var322 = (SubLObject)makeBoolean(NIL == var325);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0147.$g2096$.rebind(var29_321, var293);
                                                                                                    module0147.$g2094$.rebind(var5_318, var293);
                                                                                                    module0147.$g2095$.rebind(var4_323, var293);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var316.isList()) {
                                                                                    SubLObject var59_379 = var316;
                                                                                    SubLObject var329 = (SubLObject)NIL;
                                                                                    var329 = var59_379.first();
                                                                                    while (NIL != var59_379) {
                                                                                        if (NIL == module0249.f16059(var329, module0139.$g1636$.getDynamicValue(var293))) {
                                                                                            module0249.f16055(var329, module0139.$g1636$.getDynamicValue(var293));
                                                                                            if (NIL != module0173.f10955(var329)) {
                                                                                                final SubLObject var28_345 = var19;
                                                                                                final SubLObject var4_325 = module0147.$g2095$.currentBinding(var293);
                                                                                                final SubLObject var5_319 = module0147.$g2094$.currentBinding(var293);
                                                                                                final SubLObject var29_322 = module0147.$g2096$.currentBinding(var293);
                                                                                                try {
                                                                                                    module0147.$g2095$.bind(module0147.f9545(var28_345), var293);
                                                                                                    module0147.$g2094$.bind(module0147.f9546(var28_345), var293);
                                                                                                    module0147.$g2096$.bind(module0147.f9549(var28_345), var293);
                                                                                                    final SubLObject var197_349 = var329;
                                                                                                    if (NIL != module0158.f10010(var10, (SubLObject)NIL, var197_349)) {
                                                                                                        final SubLObject var330 = module0158.f10011(var10, (SubLObject)NIL, var197_349);
                                                                                                        SubLObject var331 = (SubLObject)NIL;
                                                                                                        final SubLObject var332 = (SubLObject)NIL;
                                                                                                        while (NIL == var331) {
                                                                                                            final SubLObject var333 = module0052.f3695(var330, var332);
                                                                                                            final SubLObject var334 = (SubLObject)makeBoolean(!var332.eql(var333));
                                                                                                            if (NIL != var334) {
                                                                                                                SubLObject var335 = (SubLObject)NIL;
                                                                                                                try {
                                                                                                                    var335 = module0158.f10316(var333, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                                                                                                                    SubLObject var199_350 = (SubLObject)NIL;
                                                                                                                    final SubLObject var200_351 = (SubLObject)NIL;
                                                                                                                    while (NIL == var199_350) {
                                                                                                                        final SubLObject var336 = module0052.f3695(var335, var200_351);
                                                                                                                        final SubLObject var202_353 = (SubLObject)makeBoolean(!var200_351.eql(var336));
                                                                                                                        if (NIL != var202_353) {
                                                                                                                            var294 = (SubLObject)ConsesLow.cons(var336, var294);
                                                                                                                        }
                                                                                                                        var199_350 = (SubLObject)makeBoolean(NIL == var202_353);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    final SubLObject var4_326 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                                                                                                                    try {
                                                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                                                                                                                        if (NIL != var335) {
                                                                                                                            module0158.f10319(var335);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    finally {
                                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_326, var293);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            var331 = (SubLObject)makeBoolean(NIL == var334);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0147.$g2096$.rebind(var29_322, var293);
                                                                                                    module0147.$g2094$.rebind(var5_319, var293);
                                                                                                    module0147.$g2095$.rebind(var4_325, var293);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var59_379 = var59_379.rest();
                                                                                        var329 = var59_379.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic353$, var316);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var4_322, var293);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var4_321, var293);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var339, (SubLObject)$ic355$);
                                                            }
                                                            var337 = var337.rest();
                                                            var338 = var337.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var309, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var30_390;
                                                    final SubLObject var344 = var30_390 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic42$)), module0141.$g1714$.getDynamicValue(var293), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic42$)), module0141.$g1714$.getDynamicValue(var293), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var345 = (SubLObject)NIL;
                                                    var345 = var30_390.first();
                                                    while (NIL != var30_390) {
                                                        final SubLObject var4_327 = module0138.$g1625$.currentBinding(var293);
                                                        try {
                                                            module0138.$g1625$.bind(var345, var293);
                                                            final SubLObject var347;
                                                            final SubLObject var346 = var347 = Functions.funcall(var345, var309);
                                                            if (NIL != module0077.f5302(var347)) {
                                                                final SubLObject var348 = module0077.f5333(var347);
                                                                SubLObject var349;
                                                                SubLObject var350;
                                                                SubLObject var351;
                                                                SubLObject var28_346;
                                                                SubLObject var4_328;
                                                                SubLObject var5_320;
                                                                SubLObject var29_323;
                                                                SubLObject var197_350;
                                                                SubLObject var352;
                                                                SubLObject var353;
                                                                SubLObject var354;
                                                                SubLObject var355;
                                                                SubLObject var356;
                                                                SubLObject var357;
                                                                SubLObject var199_351;
                                                                SubLObject var200_352;
                                                                SubLObject var358;
                                                                SubLObject var202_354;
                                                                SubLObject var4_329;
                                                                for (var349 = module0032.f1741(var348), var350 = (SubLObject)NIL, var350 = module0032.f1742(var349, var348); NIL == module0032.f1744(var349, var350); var350 = module0032.f1743(var350)) {
                                                                    var351 = module0032.f1745(var349, var350);
                                                                    if (NIL != module0032.f1746(var350, var351) && NIL == module0249.f16059(var351, module0139.$g1636$.getDynamicValue(var293))) {
                                                                        module0249.f16055(var351, module0139.$g1636$.getDynamicValue(var293));
                                                                        if (NIL != module0173.f10955(var351)) {
                                                                            var28_346 = var19;
                                                                            var4_328 = module0147.$g2095$.currentBinding(var293);
                                                                            var5_320 = module0147.$g2094$.currentBinding(var293);
                                                                            var29_323 = module0147.$g2096$.currentBinding(var293);
                                                                            try {
                                                                                module0147.$g2095$.bind(module0147.f9545(var28_346), var293);
                                                                                module0147.$g2094$.bind(module0147.f9546(var28_346), var293);
                                                                                module0147.$g2096$.bind(module0147.f9549(var28_346), var293);
                                                                                var197_350 = var351;
                                                                                if (NIL != module0158.f10010(var10, (SubLObject)NIL, var197_350)) {
                                                                                    var352 = module0158.f10011(var10, (SubLObject)NIL, var197_350);
                                                                                    var353 = (SubLObject)NIL;
                                                                                    var354 = (SubLObject)NIL;
                                                                                    while (NIL == var353) {
                                                                                        var355 = module0052.f3695(var352, var354);
                                                                                        var356 = (SubLObject)makeBoolean(!var354.eql(var355));
                                                                                        if (NIL != var356) {
                                                                                            var357 = (SubLObject)NIL;
                                                                                            try {
                                                                                                var357 = module0158.f10316(var355, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                                                                                                var199_351 = (SubLObject)NIL;
                                                                                                var200_352 = (SubLObject)NIL;
                                                                                                while (NIL == var199_351) {
                                                                                                    var358 = module0052.f3695(var357, var200_352);
                                                                                                    var202_354 = (SubLObject)makeBoolean(!var200_352.eql(var358));
                                                                                                    if (NIL != var202_354) {
                                                                                                        var294 = (SubLObject)ConsesLow.cons(var358, var294);
                                                                                                    }
                                                                                                    var199_351 = (SubLObject)makeBoolean(NIL == var202_354);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                var4_329 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                                                                                                try {
                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                                                                                                    if (NIL != var357) {
                                                                                                        module0158.f10319(var357);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_329, var293);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var353 = (SubLObject)makeBoolean(NIL == var356);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0147.$g2096$.rebind(var29_323, var293);
                                                                                module0147.$g2094$.rebind(var5_320, var293);
                                                                                module0147.$g2095$.rebind(var4_328, var293);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var347.isList()) {
                                                                SubLObject var359 = var347;
                                                                SubLObject var360 = (SubLObject)NIL;
                                                                var360 = var359.first();
                                                                while (NIL != var359) {
                                                                    if (NIL == module0249.f16059(var360, module0139.$g1636$.getDynamicValue(var293))) {
                                                                        module0249.f16055(var360, module0139.$g1636$.getDynamicValue(var293));
                                                                        if (NIL != module0173.f10955(var360)) {
                                                                            final SubLObject var28_347 = var19;
                                                                            final SubLObject var4_330 = module0147.$g2095$.currentBinding(var293);
                                                                            final SubLObject var5_321 = module0147.$g2094$.currentBinding(var293);
                                                                            final SubLObject var29_324 = module0147.$g2096$.currentBinding(var293);
                                                                            try {
                                                                                module0147.$g2095$.bind(module0147.f9545(var28_347), var293);
                                                                                module0147.$g2094$.bind(module0147.f9546(var28_347), var293);
                                                                                module0147.$g2096$.bind(module0147.f9549(var28_347), var293);
                                                                                final SubLObject var197_351 = var360;
                                                                                if (NIL != module0158.f10010(var10, (SubLObject)NIL, var197_351)) {
                                                                                    final SubLObject var361 = module0158.f10011(var10, (SubLObject)NIL, var197_351);
                                                                                    SubLObject var362 = (SubLObject)NIL;
                                                                                    final SubLObject var363 = (SubLObject)NIL;
                                                                                    while (NIL == var362) {
                                                                                        final SubLObject var364 = module0052.f3695(var361, var363);
                                                                                        final SubLObject var365 = (SubLObject)makeBoolean(!var363.eql(var364));
                                                                                        if (NIL != var365) {
                                                                                            SubLObject var366 = (SubLObject)NIL;
                                                                                            try {
                                                                                                var366 = module0158.f10316(var364, (SubLObject)$ic292$, var125, (SubLObject)NIL);
                                                                                                SubLObject var199_352 = (SubLObject)NIL;
                                                                                                final SubLObject var200_353 = (SubLObject)NIL;
                                                                                                while (NIL == var199_352) {
                                                                                                    final SubLObject var367 = module0052.f3695(var366, var200_353);
                                                                                                    final SubLObject var202_355 = (SubLObject)makeBoolean(!var200_353.eql(var367));
                                                                                                    if (NIL != var202_355) {
                                                                                                        var294 = (SubLObject)ConsesLow.cons(var367, var294);
                                                                                                    }
                                                                                                    var199_352 = (SubLObject)makeBoolean(NIL == var202_355);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                final SubLObject var4_331 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                                                                                                try {
                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                                                                                                    if (NIL != var366) {
                                                                                                        module0158.f10319(var366);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_331, var293);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var362 = (SubLObject)makeBoolean(NIL == var365);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0147.$g2096$.rebind(var29_324, var293);
                                                                                module0147.$g2094$.rebind(var5_321, var293);
                                                                                module0147.$g2095$.rebind(var4_330, var293);
                                                                            }
                                                                        }
                                                                    }
                                                                    var359 = var359.rest();
                                                                    var360 = var359.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic353$, var347);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var4_327, var293);
                                                        }
                                                        var30_390 = var30_390.rest();
                                                        var345 = var30_390.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var5_315, var293);
                                                module0137.$g1605$.rebind(var4_314, var293);
                                            }
                                            var307 = var307.rest();
                                            var308 = var307.first();
                                        }
                                        SubLObject var369;
                                        final SubLObject var368 = var369 = module0200.f12443(module0244.f15771(module0137.f8955($ic42$)));
                                        SubLObject var370 = (SubLObject)NIL;
                                        var370 = var369.first();
                                        while (NIL != var369) {
                                            final SubLObject var4_332 = module0137.$g1605$.currentBinding(var293);
                                            final SubLObject var5_322 = module0141.$g1674$.currentBinding(var293);
                                            try {
                                                module0137.$g1605$.bind(var370, var293);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var293)) : module0141.$g1674$.getDynamicValue(var293)), var293);
                                                final SubLObject var371 = module0228.f15229(var305_306);
                                                if (NIL != module0138.f8992(var371)) {
                                                    final SubLObject var372 = module0242.f15664(var371, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var372) {
                                                        final SubLObject var373 = module0245.f15834(var372, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var373) {
                                                            SubLObject var374;
                                                            for (var374 = module0066.f4838(module0067.f4891(var373)); NIL == module0066.f4841(var374); var374 = module0066.f4840(var374)) {
                                                                var293.resetMultipleValues();
                                                                final SubLObject var329_331 = module0066.f4839(var374);
                                                                final SubLObject var375 = var293.secondMultipleValue();
                                                                var293.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var329_331)) {
                                                                    final SubLObject var4_333 = module0138.$g1623$.currentBinding(var293);
                                                                    try {
                                                                        module0138.$g1623$.bind(var329_331, var293);
                                                                        SubLObject var247_334;
                                                                        for (var247_334 = module0066.f4838(module0067.f4891(var375)); NIL == module0066.f4841(var247_334); var247_334 = module0066.f4840(var247_334)) {
                                                                            var293.resetMultipleValues();
                                                                            final SubLObject var376 = module0066.f4839(var247_334);
                                                                            final SubLObject var377 = var293.secondMultipleValue();
                                                                            var293.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var376)) {
                                                                                final SubLObject var4_334 = module0138.$g1624$.currentBinding(var293);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var376, var293);
                                                                                    final SubLObject var378 = var377;
                                                                                    if (NIL != module0077.f5302(var378)) {
                                                                                        final SubLObject var379 = module0077.f5333(var378);
                                                                                        SubLObject var380;
                                                                                        SubLObject var381;
                                                                                        SubLObject var382;
                                                                                        for (var380 = module0032.f1741(var379), var381 = (SubLObject)NIL, var381 = module0032.f1742(var380, var379); NIL == module0032.f1744(var380, var381); var381 = module0032.f1743(var381)) {
                                                                                            var382 = module0032.f1745(var380, var381);
                                                                                            if (NIL != module0032.f1746(var381, var382) && NIL == module0249.f16059(var382, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var382, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var382, var298);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var378.isList()) {
                                                                                        SubLObject var383 = var378;
                                                                                        SubLObject var384 = (SubLObject)NIL;
                                                                                        var384 = var383.first();
                                                                                        while (NIL != var383) {
                                                                                            if (NIL == module0249.f16059(var384, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var384, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var384, var298);
                                                                                            }
                                                                                            var383 = var383.rest();
                                                                                            var384 = var383.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic353$, var378);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var4_334, var293);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var247_334);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var4_333, var293);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var374);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic354$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var371, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var30_391;
                                                    final SubLObject var385 = var30_391 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var293), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var293), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var386 = (SubLObject)NIL;
                                                    var386 = var30_391.first();
                                                    while (NIL != var30_391) {
                                                        final SubLObject var4_335 = module0138.$g1625$.currentBinding(var293);
                                                        try {
                                                            module0138.$g1625$.bind(var386, var293);
                                                            final SubLObject var388;
                                                            final SubLObject var387 = var388 = Functions.funcall(var386, var371);
                                                            if (NIL != module0077.f5302(var388)) {
                                                                final SubLObject var389 = module0077.f5333(var388);
                                                                SubLObject var390;
                                                                SubLObject var391;
                                                                SubLObject var392;
                                                                for (var390 = module0032.f1741(var389), var391 = (SubLObject)NIL, var391 = module0032.f1742(var390, var389); NIL == module0032.f1744(var390, var391); var391 = module0032.f1743(var391)) {
                                                                    var392 = module0032.f1745(var390, var391);
                                                                    if (NIL != module0032.f1746(var391, var392) && NIL == module0249.f16059(var392, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var392, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var392, var298);
                                                                    }
                                                                }
                                                            }
                                                            else if (var388.isList()) {
                                                                SubLObject var393 = var388;
                                                                SubLObject var394 = (SubLObject)NIL;
                                                                var394 = var393.first();
                                                                while (NIL != var393) {
                                                                    if (NIL == module0249.f16059(var394, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var394, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var394, var298);
                                                                    }
                                                                    var393 = var393.rest();
                                                                    var394 = var393.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic353$, var388);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var4_335, var293);
                                                        }
                                                        var30_391 = var30_391.rest();
                                                        var386 = var30_391.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var5_322, var293);
                                                module0137.$g1605$.rebind(var4_332, var293);
                                            }
                                            var369 = var369.rest();
                                            var370 = var369.first();
                                        }
                                        var305_306 = module0056.f4150(var298);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var29_318, var293);
                                    module0138.$g1619$.rebind(var5_314, var293);
                                    module0141.$g1677$.rebind(var4_313, var293);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic356$, var292, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var304, var293);
                            module0141.$g1674$.rebind(var303, var293);
                            module0141.$g1672$.rebind(var29_317, var293);
                            module0141.$g1671$.rebind(var5_313, var293);
                            module0141.$g1670$.rebind(var4_312, var293);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var5_312, var293);
                        module0141.$g1714$.rebind(var4_311, var293);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var300, var293);
                    module0147.$g2094$.rebind(var5_311, var293);
                    module0147.$g2095$.rebind(var4_310, var293);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var293));
            }
            finally {
                module0139.$g1635$.rebind(var4_309, var293);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var293));
        }
        finally {
            module0139.$g1636$.rebind(var296, var293);
            module0137.$g1605$.rebind(var295, var293);
        }
        return var294;
    }
    
    public static SubLObject f15147(final SubLObject var54, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        SubLObject var154 = (SubLObject)NIL;
        final SubLObject var155 = module0018.$g584$.currentBinding(var153);
        final SubLObject var156 = module0018.$g585$.currentBinding(var153);
        final SubLObject var157 = module0018.$g590$.currentBinding(var153);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var153);
            module0018.$g585$.bind(var152, var153);
            module0018.$g590$.bind((SubLObject)THREE_INTEGER, var153);
            final SubLObject var158 = var19;
            final SubLObject var4_422 = module0147.$g2094$.currentBinding(var153);
            final SubLObject var5_423 = module0147.$g2095$.currentBinding(var153);
            try {
                module0147.$g2094$.bind(module0147.f9531(var158), var153);
                module0147.$g2095$.bind(module0147.f9534(var158), var153);
                module0219.f14477(Symbols.symbol_function((SubLObject)$ic357$), var54, (SubLObject)TWO_INTEGER, $ic358$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var154 = module0018.$g584$.getDynamicValue(var153);
            }
            finally {
                module0147.$g2095$.rebind(var5_423, var153);
                module0147.$g2094$.rebind(var4_422, var153);
            }
        }
        finally {
            module0018.$g590$.rebind(var157, var153);
            module0018.$g585$.rebind(var156, var153);
            module0018.$g584$.rebind(var155, var153);
        }
        return var154;
    }
    
    public static SubLObject f15148(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0018.$g585$.getDynamicValue(var9).eql(module0178.f11334(var8))) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(module0178.f11336(var8), module0018.$g584$.getDynamicValue(var9)), var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15149(final SubLObject var54, final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        SubLObject var154 = (SubLObject)NIL;
        final SubLObject var155 = module0018.$g584$.currentBinding(var153);
        final SubLObject var156 = module0018.$g585$.currentBinding(var153);
        final SubLObject var157 = module0018.$g590$.currentBinding(var153);
        try {
            module0018.$g584$.bind((SubLObject)NIL, var153);
            module0018.$g585$.bind(var152, var153);
            module0018.$g590$.bind((SubLObject)THREE_INTEGER, var153);
            final SubLObject var158 = var19;
            final SubLObject var4_424 = module0147.$g2094$.currentBinding(var153);
            final SubLObject var5_425 = module0147.$g2095$.currentBinding(var153);
            try {
                module0147.$g2094$.bind(module0147.f9531(var158), var153);
                module0147.$g2095$.bind(module0147.f9534(var158), var153);
                module0221.f14612(Symbols.symbol_function((SubLObject)$ic359$), var54, (SubLObject)TWO_INTEGER, $ic358$);
                var154 = module0018.$g584$.getDynamicValue(var153);
            }
            finally {
                module0147.$g2095$.rebind(var5_425, var153);
                module0147.$g2094$.rebind(var4_424, var153);
            }
        }
        finally {
            module0018.$g590$.rebind(var157, var153);
            module0018.$g585$.rebind(var156, var153);
            module0018.$g584$.rebind(var155, var153);
        }
        return var154;
    }
    
    public static SubLObject f15150(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0260.f17091(module0178.f11334(var8), module0018.$g585$.getDynamicValue(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(module0178.f11336(var8), module0018.$g584$.getDynamicValue(var9)), var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15151(final SubLObject var26) {
        if (NIL != module0173.f10955(var26)) {
            return module0035.sublisp_boolean(module0220.f14548(var26, $ic360$, module0132.$g1549$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15152(final SubLObject var26) {
        if (NIL != module0173.f10955(var26)) {
            return module0220.f14557(var26, $ic360$, module0132.$g1549$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15153(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var6) && NIL != module0222.f14635($ic361$, var6, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15154(final SubLObject var152, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var152)) {
            return module0220.f14548(var152, $ic362$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)makeBoolean(NIL == module0155.f9779(var152, (SubLObject)$ic79$, var19));
    }
    
    public static SubLObject f15155(final SubLObject var12, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var12)) {
            return module0220.f14548(var12, $ic363$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15156(final SubLObject var19) {
        final SubLObject var20 = module0162.f10628(var19);
        if (NIL != module0173.f10955(var20) && NIL != module0161.f10479(var20)) {
            return module0220.f14547(var20, $ic364$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15157(final SubLObject var6) {
        return module0259.f16976(var6, $ic365$);
    }
    
    public static SubLObject f15158(final SubLObject var6) {
        return module0004.f104(var6, $g2414$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15159(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var6) && NIL != module0269.f17708(var6) && NIL == module0269.f17801(var6) && NIL != module0259.f16854(var6, $ic367$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15160(final SubLObject var10) {
        if (NIL != module0193.f12067(var10) || NIL == module0206.f13451(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12590(var10) && NIL != f15158(module0205.f13136(var10))) {
            return (SubLObject)T;
        }
        return module0259.f16975(var10, $ic368$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15161(final SubLObject var10) {
        if (NIL != module0193.f12067(var10) || NIL != module0206.f13478(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12590(var10) && NIL != f15158(module0205.f13136(var10))) {
            return (SubLObject)T;
        }
        if (NIL != module0202.f12590(var10) && NIL != f15159(module0205.f13136(var10))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15162(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != f15161(var10) || NIL != module0259.f16975(var10, $ic369$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15163(final SubLObject var21) {
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = $ic370$;
        if (NIL != module0158.f10010(var21, (SubLObject)NIL, var23)) {
            final SubLObject var24 = module0158.f10011(var21, (SubLObject)NIL, var23);
            SubLObject var25 = (SubLObject)NIL;
            final SubLObject var26 = (SubLObject)NIL;
            while (NIL == var25) {
                final SubLObject var27 = module0052.f3695(var24, var26);
                final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                if (NIL != var28) {
                    SubLObject var29 = (SubLObject)NIL;
                    try {
                        var29 = module0158.f10316(var27, (SubLObject)$ic292$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var199_428 = (SubLObject)NIL;
                        final SubLObject var200_429 = (SubLObject)NIL;
                        while (NIL == var199_428) {
                            final SubLObject var30 = module0052.f3695(var29, var200_429);
                            final SubLObject var202_430 = (SubLObject)makeBoolean(!var200_429.eql(var30));
                            if (NIL != var202_430) {
                                var22 = (SubLObject)T;
                            }
                            var199_428 = (SubLObject)makeBoolean(NIL == var202_430);
                        }
                    }
                    finally {
                        final SubLObject var31 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var29) {
                                module0158.f10319(var29);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var31);
                        }
                    }
                }
                var25 = (SubLObject)makeBoolean(NIL == var28);
            }
        }
        return var22;
    }
    
    public static SubLObject f15164(final SubLObject var10) {
        return module0259.f16975(var10, $ic371$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15165(final SubLObject var26) {
        final SubLObject var27 = f15166(var26);
        SubLObject var28 = f15167(var26);
        if (NIL != var28) {
            var28 = Sequences.cconcatenate(var28, (SubLObject)$ic372$);
        }
        return (NIL != var27) ? var27 : var28;
    }
    
    public static SubLObject f15166(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && NIL == module0173.f10955(var26)) {
            Errors.error((SubLObject)$ic373$, var26);
        }
        return module0220.f14556(var26, $ic374$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15167(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && NIL == module0173.f10955(var26)) {
            Errors.error((SubLObject)$ic373$, var26);
        }
        return module0220.f14556(var26, $ic375$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15168() {
        final SubLObject var433 = $g2415$.getGlobalValue();
        if (NIL != var433) {
            module0034.f1818(var433);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15169(SubLObject var434) {
        if (var434 == UNPROVIDED) {
            var434 = Environment.get_user_name((SubLObject)UNPROVIDED);
        }
        return module0034.f1829($g2415$.getGlobalValue(), (SubLObject)ConsesLow.list(var434), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15170(final SubLObject var434) {
        if (var434.isString()) {
            final SubLObject var435 = (SubLObject)$ic377$;
            return module0409.f28506((SubLObject)ConsesLow.list($ic378$, (SubLObject)$ic379$, (SubLObject)ConsesLow.list($ic375$, (SubLObject)$ic380$, var434)), var435, (SubLObject)$ic381$).first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15171(SubLObject var434) {
        if (var434 == UNPROVIDED) {
            var434 = Environment.get_user_name((SubLObject)UNPROVIDED);
        }
        SubLObject var435 = $g2415$.getGlobalValue();
        if (NIL == var435) {
            var435 = module0034.f1934((SubLObject)$ic376$, (SubLObject)$ic382$, (SubLObject)$ic383$, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic384$);
        }
        SubLObject var436 = module0034.f1814(var435, var434, (SubLObject)$ic385$);
        if (var436 == $ic385$) {
            var436 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f15170(var434)));
            module0034.f1816(var435, var434, var436, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var436);
    }
    
    public static SubLObject f15172(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var6)) {
            final SubLObject var8 = module0217.f14358(var6);
            if (var8.numL($g2416$.getDynamicValue(var7))) {
                $g2416$.setDynamicValue(var8, var7);
                $g2417$.setDynamicValue(var6, var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15173(final SubLObject var438, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        final SubLThread var439 = SubLProcess.currentSubLThread();
        SubLObject var440 = (SubLObject)NIL;
        SubLObject var441 = (SubLObject)NIL;
        final SubLObject var442 = $g2417$.currentBinding(var439);
        final SubLObject var443 = $g2416$.currentBinding(var439);
        try {
            $g2417$.bind((SubLObject)NIL, var439);
            $g2416$.bind(Numbers.$most_positive_fixnum$.getGlobalValue(), var439);
            final SubLObject var444 = var19;
            final SubLObject var4_440 = module0147.$g2095$.currentBinding(var439);
            final SubLObject var5_441 = module0147.$g2094$.currentBinding(var439);
            final SubLObject var445 = module0147.$g2096$.currentBinding(var439);
            try {
                module0147.$g2095$.bind(module0147.f9545(var444), var439);
                module0147.$g2094$.bind(module0147.f9546(var444), var439);
                module0147.$g2096$.bind(module0147.f9549(var444), var439);
                module0205.f13228((SubLObject)$ic386$, var438, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var445, var439);
                module0147.$g2094$.rebind(var5_441, var439);
                module0147.$g2095$.rebind(var4_440, var439);
            }
            var440 = $g2417$.getDynamicValue(var439);
            var441 = $g2416$.getDynamicValue(var439);
        }
        finally {
            $g2416$.rebind(var443, var439);
            $g2417$.rebind(var442, var439);
        }
        return Values.values(var440, var441);
    }
    
    public static SubLObject f15174() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14792", "RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14793", "S#17601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14794", "S#17602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14795", "REFLEXIVE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14796", "IRREFLEXIVE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14797", "SYMMETRIC-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14798", "ASYMMETRIC-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14799", "ANTI-SYMMETRIC-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14800", "TRANSITIVE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14801", "S#17603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14802", "S#17604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14803", "S#17605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14804", "S#17606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14805", "S#17607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14806", "COMMUTATIVE-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14807", "BINARY-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14808", "S#17608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14809", "S#17609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14810", "S#17610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14811", "INDIVIDUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14812", "SET-OR-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14813", "S#17611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14814", "S#17612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14815", "S#17613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14816", "S#17614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14817", "S#17615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14818", "S#17616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14819", "S#17617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14820", "S#17618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14821", "S#17619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14822", "S#17620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14823", "S#17621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14824", "S#17622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14826", "S#17623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14825", "S#17624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14827", "S#17625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14828", "S#17626", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14829", "S#17627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14830", "S#14912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14831", "S#17628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14832", "S#17629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14833", "S#14570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14834", "S#17630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14835", "S#17631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14836", "S#17632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14837", "S#16024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14838", "S#17633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14839", "S#17634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14840", "S#17635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14841", "S#17636", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14842", "S#17637", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14843", "S#17638", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14844", "S#17639", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14845", "S#17640", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14846", "S#17641", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14847", "S#12601", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14848", "S#17642", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14849", "S#17643", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14850", "S#17644", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14851", "S#17645", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14852", "S#17646", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14853", "S#17647", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14854", "S#17648", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14855", "S#17649", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14856", "S#17650", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14857", "S#17651", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14858", "S#12600", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14859", "S#17652", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14860", "S#17653", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14861", "S#17654", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14862", "S#17655", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14863", "S#17656", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14864", "S#17657", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14865", "S#17658", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14866", "S#17659", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14867", "S#17660", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14868", "S#17661", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14869", "S#17662", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14870", "S#17663", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14871", "S#17664", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14872", "S#17665", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14873", "S#17666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14874", "S#17667", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14875", "S#17668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14876", "S#17669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14877", "S#13724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14878", "S#13482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14879", "S#17670", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14880", "S#17671", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14881", "ARG1-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14883", "ARG2-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14884", "S#17672", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14885", "S#17673", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14886", "S#17674", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14887", "S#17675", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14888", "S#17676", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14889", "S#17677", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14890", "S#17678", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14891", "S#17679", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14892", "S#17680", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14893", "S#17681", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14882", "ARGN-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14895", "ARGN-QUOTED-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14897", "S#17682", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14894", "S#17683", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14898", "S#17684", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14896", "S#17685", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14899", "S#17686", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14902", "S#17687", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14900", "S#17688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14903", "S#17689", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14904", "S#17690", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14905", "S#17691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14906", "S#17692", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14907", "S#17693", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14908", "S#17694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14909", "S#17695", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14901", "S#17696", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14910", "S#17697", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14911", "S#17698", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14912", "S#17699", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14913", "S#17700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14914", "S#17701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14915", "S#17702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14916", "S#17703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14917", "MIN-ARGN-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14918", "S#17704", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14920", "S#17705", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14919", "S#17706", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14921", "S#17707", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14922", "S#17708", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14923", "S#17709", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14924", "S#17710", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14926", "S#17711", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14927", "S#17712", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14928", "S#17713", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14929", "S#17714", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14930", "S#17715", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14931", "S#17716", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14932", "S#17717", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14933", "S#17718", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14925", "ARGN-ISA-OF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14934", "S#17719", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14936", "S#17720", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14937", "S#17721", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14938", "S#17722", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14939", "S#17723", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14940", "S#17724", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14941", "S#17725", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14935", "ARGN-GENL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14943", "S#17726", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14944", "S#17727", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14945", "S#17728", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14946", "S#17729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14947", "S#17730", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14942", "S#17731", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14948", "S#17732", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14949", "MIN-ARGN-GENL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14950", "S#17733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14951", "S#17734", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14952", "S#17735", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14954", "S#17736", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14955", "S#17737", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14956", "S#17738", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14957", "S#17739", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14958", "S#17740", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14959", "S#17741", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14953", "ARGN-GENL-OF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14960", "INTER-ARG-ISA1-2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14961", "S#17742", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14962", "S#17743", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14963", "S#17744", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14964", "S#17745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14965", "S#17746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14966", "S#17747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14967", "S#17748", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14968", "S#17749", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14971", "S#17750", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14970", "S#17751", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14969", "S#17752", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14972", "S#17753", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14974", "S#17754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14973", "S#17755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14975", "S#17756", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14976", "DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14977", "S#17757", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14979", "DEFINING-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14978", "NECESSARY-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14980", "SUFFICIENT-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14981", "ALL-SUFFICIENT-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14982", "S#17758", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14985", "S#17759", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14987", "S#17760", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14988", "S#17761", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14989", "S#17762", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14984", "S#17763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14983", "S#17764", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14986", "S#17765", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14991", "S#17766", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14992", "S#17767", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14994", "S#17768", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14995", "S#17769", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14997", "S#17770", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14999", "S#17771", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15001", "S#17772", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14998", "S#17773", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15000", "S#17774", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15002", "S#17775", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15003", "S#17776", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14990", "RESULT-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15005", "S#17777", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15006", "S#17778", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15008", "S#17779", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15009", "S#17780", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15010", "S#17781", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15011", "RESULT-INTER-ARG-ISA-RELN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15004", "S#17782", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15007", "S#17783", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14993", "EVALUATION-RESULT-QUOTED-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15012", "S#17784", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f14996", "RESULT-QUOTED-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15013", "S#17785", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15014", "RESULT-GENL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15016", "S#17786", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15018", "S#17787", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15019", "S#17788", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15020", "RESULT-INTER-ARG-GENL-RELN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15015", "S#17789", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15017", "S#17790", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15021", "S#17791", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15022", "S#17792", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15023", "S#17793", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15024", "S#17794", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15025", "S#17795", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15026", "S#17796", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15027", "S#17797", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15028", "S#17798", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15029", "S#17799", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15030", "ARG1-FORMAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15032", "ARG2-FORMAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15033", "S#17800", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15034", "S#17801", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15035", "S#17802", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15036", "S#17803", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15037", "S#17804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15038", "S#17805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15031", "S#17806", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15039", "S#17807", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15040", "S#17808", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15041", "S#17809", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15042", "S#17810", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15044", "S#17811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15045", "S#17812", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15046", "S#17813", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15047", "S#17814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15048", "S#17815", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15049", "S#17816", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15043", "S#17817", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15050", "S#17818", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15051", "S#17819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15054", "S#17820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15055", "S#17821", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15056", "S#17822", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15053", "S#17823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15052", "S#17824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15057", "S#17825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15058", "S#17826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15059", "S#17827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15060", "S#17828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15061", "S#17829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15062", "S#17830", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15063", "S#17831", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15064", "S#17832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15065", "S#17833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15066", "S#17834", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15067", "S#17835", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15068", "S#10893", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15069", "S#10894", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15070", "S#17836", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15071", "S#17837", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15072", "S#17838", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15074", "S#17839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15073", "S#17840", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15075", "REVIEWER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15076", "COMMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15077", "COMMENT-IF-FORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15078", "CYCLIST-NOTES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15079", "S#17841", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15080", "S#17842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15081", "S#17843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15083", "S#17844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15084", "S#17845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15082", "S#17846", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15085", "S#17847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15086", "S#17848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15087", "S#17849", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15088", "S#17423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15089", "S#17850", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15092", "S#17851", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15091", "S#17852", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15090", "S#17853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15094", "S#17854", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15096", "S#17855", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15095", "S#17856", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15097", "S#17857", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15098", "S#17858", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15099", "S#15531", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15101", "S#17859", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15100", "S#17860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15093", "ALL-TERM-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15102", "S#17861", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15103", "S#17862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15104", "S#17863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15105", "S#17864", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15106", "S#17865", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15107", "S#17866", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15108", "S#17867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15109", "S#17868", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15110", "S#17869", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15111", "S#13723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15112", "S#17870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15113", "ISA-RELEVANT-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15115", "S#17871", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15114", "S#17872", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15116", "S#17873", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15117", "ISA-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15118", "S#17874", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15119", "S#17875", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15120", "S#17876", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15121", "S#17877", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15122", "S#17878", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15123", "S#17879", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15124", "S#17880", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15125", "S#17881", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15126", "S#17882", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15127", "S#17883", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15128", "S#17884", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15129", "S#17885", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15130", "S#17886", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15131", "S#17887", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15132", "S#17888", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15133", "S#17889", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15134", "S#17890", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15135", "S#17891", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15136", "S#17892", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15137", "S#17893", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15138", "S#17894", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15139", "S#17895", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15140", "S#17896", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15141", "S#17300", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15142", "S#17897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15143", "S#17898", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15144", "S#17899", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0226", "f15145", "DO-GAFS-WRT-PRED-TYPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15146", "S#17900", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15147", "S#17901", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15148", "S#17902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15149", "S#17903", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15150", "S#17904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15151", "S#17905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15152", "S#17906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15153", "S#17907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15154", "S#17908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15155", "S#17909", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15156", "S#17910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15157", "S#17911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15158", "S#17912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15159", "S#17913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15160", "S#17914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15161", "S#17599", 1, 0, false);
        new $f15161$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15162", "S#17915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15163", "S#17916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15164", "S#17917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15165", "S#17918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15166", "S#17919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15167", "S#17920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15168", "S#17600", 0, 0, false);
        new $f15168$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15169", "S#17921", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15170", "S#17922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15171", "S#17923", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15172", "S#17924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0226", "f15173", "S#17303", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15175() {
        $g2413$ = SubLFiles.defparameter("S#17925", (SubLObject)T);
        $g2414$ = SubLFiles.deflexical("S#17926", (SubLObject)$ic366$);
        $g2415$ = SubLFiles.deflexical("S#17927", (SubLObject)NIL);
        $g2416$ = SubLFiles.defparameter("S#17928", (SubLObject)NIL);
        $g2417$ = SubLFiles.defparameter("S#17929", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15176() {
        module0012.f368((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic10$, (SubLObject)$ic8$, (SubLObject)$ic11$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic12$, (SubLObject)$ic8$, (SubLObject)$ic13$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic14$, (SubLObject)$ic8$, (SubLObject)$ic15$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic16$, (SubLObject)$ic8$, (SubLObject)$ic17$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic18$, (SubLObject)$ic8$, (SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic23$, (SubLObject)$ic8$, (SubLObject)$ic24$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic31$, (SubLObject)$ic28$, (SubLObject)$ic32$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic84$, (SubLObject)$ic85$, (SubLObject)$ic86$, (SubLObject)$ic87$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic88$, (SubLObject)$ic85$, (SubLObject)$ic86$, (SubLObject)$ic87$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic128$, (SubLObject)$ic129$, (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic132$);
        module0012.f368((SubLObject)$ic134$, (SubLObject)$ic135$, (SubLObject)$ic136$, (SubLObject)$ic87$, (SubLObject)$ic132$);
        module0012.f368((SubLObject)$ic140$, (SubLObject)$ic85$, (SubLObject)$ic141$, (SubLObject)$ic87$, (SubLObject)$ic132$);
        module0012.f368((SubLObject)$ic145$, (SubLObject)$ic129$, (SubLObject)$ic146$, (SubLObject)$ic147$, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic150$, (SubLObject)$ic135$, (SubLObject)$ic151$, (SubLObject)$ic87$, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic153$, (SubLObject)$ic154$, (SubLObject)$ic155$, (SubLObject)NIL, (SubLObject)$ic156$);
        module0012.f368((SubLObject)$ic192$, (SubLObject)$ic193$, (SubLObject)$ic194$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic195$, (SubLObject)$ic193$, (SubLObject)$ic196$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic197$, (SubLObject)$ic193$, (SubLObject)$ic198$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic199$, (SubLObject)$ic193$, (SubLObject)$ic200$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic214$, (SubLObject)$ic215$, (SubLObject)$ic216$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic223$, (SubLObject)$ic215$, (SubLObject)$ic224$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic225$, (SubLObject)$ic215$, (SubLObject)$ic226$, (SubLObject)NIL, (SubLObject)$ic148$);
        module0012.f368((SubLObject)$ic270$, (SubLObject)$ic271$, (SubLObject)$ic272$, (SubLObject)$ic273$, (SubLObject)$ic274$);
        module0012.f368((SubLObject)$ic276$, (SubLObject)$ic277$, (SubLObject)$ic278$, (SubLObject)$ic279$, (SubLObject)$ic280$);
        module0002.f38((SubLObject)$ic281$);
        module0002.f38((SubLObject)$ic282$);
        module0012.f368((SubLObject)$ic307$, (SubLObject)$ic308$, (SubLObject)$ic309$, (SubLObject)$ic310$, (SubLObject)$ic311$);
        module0012.f368((SubLObject)$ic319$, (SubLObject)$ic320$, (SubLObject)$ic321$, (SubLObject)NIL, (SubLObject)$ic311$);
        module0012.f368((SubLObject)$ic324$, (SubLObject)$ic325$, (SubLObject)$ic326$, (SubLObject)NIL, (SubLObject)$ic311$);
        module0012.f375((SubLObject)$ic340$, (SubLObject)$ic329$, (SubLObject)$ic341$);
        module0034.f1909((SubLObject)$ic376$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15174();
    }
    
    public void initializeVariables() {
        f15175();
    }
    
    public void runTopLevelForms() {
        f15176();
    }
    
    static {
        me = (SubLFile)new module0226();
        $g2413$ = null;
        $g2414$ = null;
        $g2415$ = null;
        $g2416$ = null;
        $g2417$ = null;
        $ic0$ = makeSymbol("RELATION?");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"));
        $ic2$ = makeString("Return T iff RELATION is a relationship.");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic4$ = makeSymbol("S#12274", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("AtemporalNecessarilyEssentialCollectionType"));
        $ic7$ = makeSymbol("REFLEXIVE-PREDICATE?");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"));
        $ic9$ = makeString("Return T iff PREDICATE is a reflexive predicate.");
        $ic10$ = makeSymbol("IRREFLEXIVE-PREDICATE?");
        $ic11$ = makeString("Return T iff PREDICATE is an irreflexive predicate.");
        $ic12$ = makeSymbol("SYMMETRIC-PREDICATE?");
        $ic13$ = makeString("Return T iff PREDICATE is a symmetric predicate.");
        $ic14$ = makeSymbol("ASYMMETRIC-PREDICATE?");
        $ic15$ = makeString("Return T iff PREDICATE is an asymmetric predicate.");
        $ic16$ = makeSymbol("ANTI-SYMMETRIC-PREDICATE?");
        $ic17$ = makeString("Return T iff PREDICATE is an anti-symmetric predicate.");
        $ic18$ = makeSymbol("TRANSITIVE-PREDICATE?");
        $ic19$ = makeString("Return T iff PREDICATE is a transitive predicate.");
        $ic20$ = makeSymbol("COMMUTATIVE-FUNCTION?");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"));
        $ic22$ = makeString("Return T iff FUNCTION is a commutative function.");
        $ic23$ = makeSymbol("BINARY-PREDICATE?");
        $ic24$ = makeString("Return T iff PREDICATE is a predicate of arity 2.");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("Cyclist"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("HumanCyclist"));
        $ic27$ = makeSymbol("INDIVIDUAL?");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"));
        $ic29$ = makeString("Return T iff TERM is an individual (i.e., *not* a collection).");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("Set-Mathematical"));
        $ic31$ = makeSymbol("SET-OR-COLLECTION?");
        $ic32$ = makeString("Return T iff TERM is a set or collection (i.e., *not* an individual).");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("Individual"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("SetOrCollection"));
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("FirstOrderCollection"));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("SubcollectionRelationFunction"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("decontextualizedPredicate"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("predicateConventionMt"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("decontextualizedCollection"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("collectionConventionMt"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("quotedCollection"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("quotedArgument"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("opaqueArgument"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("minimizeCollectionExtent"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("minimizeExtent"));
        $ic49$ = makeSymbol("FORT-P");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentAsserted"));
        $ic51$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentAssertedForValueInArg"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerable"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerableViaBackchain"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentDecidable"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerableForArg"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerableForValueInArg"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("completeExtentDecidableForValueInArg"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("completelyEnumerableCollection"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("collectionCompletelyEnumerableViaBackchain"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("completelyDecidableCollection"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("backchainRequired"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("backchainEncouraged"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("backchainDiscouraged"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("backchainForbidden"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("collectionIsaBackchainRequired"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("collectionGenlsBackchainRequired"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("collectionBackchainRequired"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("collectionIsaBackchainEncouraged"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("collectionGenlsBackchainEncouraged"));
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("collectionBackchainEncouraged"));
        $ic72$ = makeKeyword("TRUE");
        $ic73$ = makeSymbol("<");
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("highlyRelevantTerm"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("irrelevantTerm"));
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("skolemizeForward"));
        $ic77$ = constant_handles_oc.f8479((SubLObject)makeString("forwardReificationRule"));
        $ic78$ = constant_handles_oc.f8479((SubLObject)makeString("argsIsa"));
        $ic79$ = makeSymbol("S#12629", "CYC");
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("argAndRestIsa"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("argAndRestQuotedIsa"));
        $ic83$ = makeSymbol("INTEGERP");
        $ic84$ = makeSymbol("ARGN-ISA");
        $ic85$ = ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic86$ = makeString("Returns a list of the local isa constraints applied to the ARGNUMth argument of \nRELATION (#$argsIsa conjoins with #$arg1Isa et al).");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic88$ = makeSymbol("ARGN-QUOTED-ISA");
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("CycLSentence-Assertible"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("CycLVariable"));
        $ic91$ = constant_handles_oc.f8479((SubLObject)makeString("ArgQuotedIsaBinaryPredicate"));
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("ArgQuotedIsaTernaryPredicate"));
        $ic93$ = makeString("illegal arg-quoted-isa-pred encountered in argn-isa: ~s");
        $ic94$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER);
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Isa"));
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Isa"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("arg3Isa"));
        $ic98$ = constant_handles_oc.f8479((SubLObject)makeString("arg4Isa"));
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("arg5Isa"));
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("arg6Isa"));
        $ic101$ = makeString("illegal index specification for arg-isa-pred: ~s");
        $ic102$ = makeString("illegal argnum specification for arg-isa-preds: ~s");
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("arg1NotIsa"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("arg2NotIsa"));
        $ic105$ = constant_handles_oc.f8479((SubLObject)makeString("arg3NotIsa"));
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("arg4NotIsa"));
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("arg5NotIsa"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("argsNotIsa"));
        $ic109$ = makeString("illegal index specification for arg-not-isa-pred: ~s");
        $ic110$ = makeString("illegal argnum specification for arg-not-isa-preds: ~s");
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa"));
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("arg6QuotedIsa"));
        $ic117$ = makeString("illegal index specification for arg-quoted-isa-pred: ~s");
        $ic118$ = makeString("illegal argnum specification for arg-quoted-isa-preds: ~s");
        $ic119$ = makeString("invalid argument to inverse-argnum: ~s");
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Genl"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Genl"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("arg3Genl"));
        $ic123$ = constant_handles_oc.f8479((SubLObject)makeString("arg4Genl"));
        $ic124$ = constant_handles_oc.f8479((SubLObject)makeString("arg5Genl"));
        $ic125$ = constant_handles_oc.f8479((SubLObject)makeString("arg6Genl"));
        $ic126$ = constant_handles_oc.f8479((SubLObject)makeString("argsGenl"));
        $ic127$ = makeSymbol("INDEXED-TERM-P");
        $ic128$ = makeSymbol("MIN-ARGN-ISA");
        $ic129$ = ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic130$ = makeString("Returns a list of the most specific local isa-constraints applicable \nto argument N of RELATION.");
        $ic131$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic132$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("INDEXED-TERM-P")));
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("argIsa"));
        $ic134$ = makeSymbol("ARGN-ISA-OF");
        $ic135$ = ConsesLow.list((SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic136$ = makeString("Returns the relations for which COLLECTION is a \nlocal isa constraint applied to argument ARGNUM.");
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("ArgGenlBinaryPredicate"));
        $ic138$ = constant_handles_oc.f8479((SubLObject)makeString("ArgGenlTernaryPredicate"));
        $ic139$ = makeString("illegal arg-genl-pred encountered in argn-genl: ~s");
        $ic140$ = makeSymbol("ARGN-GENL");
        $ic141$ = makeString("Returns the local genl constraints applied to the ARGNUMth argument of RELATION.");
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("argAndRestGenl"));
        $ic143$ = makeString("illegal index specification for arg-genl-pred: ~s");
        $ic144$ = makeString("illegal argnum specification for arg-genl-preds: ~s");
        $ic145$ = makeSymbol("MIN-ARGN-GENL");
        $ic146$ = makeString("Return a list of the most specific local genl constraints applicable \nto the argument N of RELATION.");
        $ic147$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("FORT-P")));
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("argGenl"));
        $ic150$ = makeSymbol("ARGN-GENL-OF");
        $ic151$ = makeString("Returns a list of the predicates for which COLLECTION is a \nlocal genl constraint applied to the Nth argument.");
        $ic152$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-2"));
        $ic153$ = makeSymbol("INTER-ARG-ISA1-2");
        $ic154$ = ConsesLow.list((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic155$ = makeString("return a list of pairs of (<arg1-isa> <arg2-isa>) that are \nthe #$interArgIsa1-2 constraints of RELATION");
        $ic156$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("LISTP")));
        $ic157$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-1"));
        $ic158$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-1"));
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-1"));
        $ic160$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-1"));
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-2"));
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-2"));
        $ic163$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-2"));
        $ic164$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-3"));
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-3"));
        $ic166$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-3"));
        $ic167$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-3"));
        $ic168$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-4"));
        $ic169$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-4"));
        $ic170$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-4"));
        $ic171$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-4"));
        $ic172$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-5"));
        $ic173$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-5"));
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-5"));
        $ic175$ = constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-5"));
        $ic176$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-1")));
        $ic177$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-2")));
        $ic178$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-3")));
        $ic179$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-4")));
        $ic180$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-5")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-5")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-5")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-5")));
        $ic181$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa1-5")));
        $ic182$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-5")));
        $ic183$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa3-5")));
        $ic184$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa4-5")));
        $ic185$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgIsa5-4")));
        $ic186$ = constant_handles_oc.f8479((SubLObject)makeString("defnIff"));
        $ic187$ = constant_handles_oc.f8479((SubLObject)makeString("defnSufficient"));
        $ic188$ = constant_handles_oc.f8479((SubLObject)makeString("defnNecessary"));
        $ic189$ = constant_handles_oc.f8479((SubLObject)makeString("quotedDefnIff"));
        $ic190$ = constant_handles_oc.f8479((SubLObject)makeString("quotedDefnSufficient"));
        $ic191$ = constant_handles_oc.f8479((SubLObject)makeString("quotedDefnNecessary"));
        $ic192$ = makeSymbol("DEFINING-DEFNS");
        $ic193$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic194$ = makeString("Return a list of the local defining (necessary and sufficient definitions) of collection COL.");
        $ic195$ = makeSymbol("NECESSARY-DEFNS");
        $ic196$ = makeString("Return a list of the local necessary definitions of collection COL.");
        $ic197$ = makeSymbol("SUFFICIENT-DEFNS");
        $ic198$ = makeString("Return a list of the local sufficient definitions of collection COL.");
        $ic199$ = makeSymbol("ALL-SUFFICIENT-DEFNS");
        $ic200$ = makeString("Return a list of all sufficient definitions of collection COL.");
        $ic201$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsa"));
        $ic202$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsaArg"));
        $ic203$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsaArgIsa"));
        $ic204$ = constant_handles_oc.f8479((SubLObject)makeString("closedUnder"));
        $ic205$ = constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn"));
        $ic206$ = constant_handles_oc.f8479((SubLObject)makeString("FunctionToArg"));
        $ic207$ = makeSymbol("PRED-U-V-HOLDS-IN-RELEVANT-MTS");
        $ic208$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic209$ = makeSymbol("S#1772", "CYC");
        $ic210$ = constant_handles_oc.f8479((SubLObject)makeString("evaluationResultQuotedIsa"));
        $ic211$ = constant_handles_oc.f8479((SubLObject)makeString("resultQuotedIsa"));
        $ic212$ = constant_handles_oc.f8479((SubLObject)makeString("resultGenl"));
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("resultGenlArg"));
        $ic214$ = makeSymbol("RESULT-ISA");
        $ic215$ = ConsesLow.list((SubLObject)makeSymbol("S#9145", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic216$ = makeString("Return a list of the collections that include as instances \nthe results of non-predicate function constant FUNCTOR.");
        $ic217$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultIsa"));
        $ic218$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)FOUR_INTEGER);
        $ic219$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultIsaReln"));
        $ic220$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)FIVE_INTEGER);
        $ic221$ = ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#891", "CYC"), (SubLObject)makeSymbol("S#17930", "CYC"), (SubLObject)makeSymbol("S#17931", "CYC"));
        $ic222$ = makeSymbol("S#17390", "CYC");
        $ic223$ = makeSymbol("EVALUATION-RESULT-QUOTED-ISA");
        $ic224$ = makeString("return the collections that include as quoted instances the evaluation results of non-predicate function constant FUNCTOR.");
        $ic225$ = makeSymbol("RESULT-QUOTED-ISA");
        $ic226$ = makeString("return the collections that include as quoted instances the results of non-predicate function constant FUNCTOR.");
        $ic227$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultGenl"));
        $ic228$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultGenlReln"));
        $ic229$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Format"));
        $ic230$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Format"));
        $ic231$ = constant_handles_oc.f8479((SubLObject)makeString("arg3Format"));
        $ic232$ = constant_handles_oc.f8479((SubLObject)makeString("arg4Format"));
        $ic233$ = constant_handles_oc.f8479((SubLObject)makeString("arg5Format"));
        $ic234$ = constant_handles_oc.f8479((SubLObject)makeString("arg6Format"));
        $ic235$ = makeString("illegal arg specification for argn-format-pred: ~s");
        $ic236$ = constant_handles_oc.f8479((SubLObject)makeString("singleEntryFormatInArgs"));
        $ic237$ = constant_handles_oc.f8479((SubLObject)makeString("SingleEntry"));
        $ic238$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
        $ic239$ = constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-2"));
        $ic240$ = constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-1"));
        $ic241$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-1")));
        $ic242$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-2")));
        $ic243$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-3")));
        $ic244$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-4")));
        $ic245$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-5")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-5")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-5")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-5")));
        $ic246$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat1-5")));
        $ic247$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat2-5")));
        $ic248$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-4")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat3-5")));
        $ic249$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat4-5")));
        $ic250$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-1")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-2")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-3")), constant_handles_oc.f8479((SubLObject)makeString("interArgFormat5-4")));
        $ic251$ = constant_handles_oc.f8479((SubLObject)makeString("requiredArg1Pred"));
        $ic252$ = constant_handles_oc.f8479((SubLObject)makeString("requiredArg2Pred"));
        $ic253$ = makeString("illegal required-pred for required-pred-arg: ~s");
        $ic254$ = makeString("illegal arg number for required-pred-arg: ~s");
        $ic255$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("requiredArg1Pred")));
        $ic256$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("requiredArg2Pred")));
        $ic257$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAll")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMany")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin")), constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance")));
        $ic258$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationExistsAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsCountAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsMaxAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsMinAll")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll")));
        $ic259$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("relationExistsAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsAllMany")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsCountAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsCountInstance")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsExists")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsInstance")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsMaxAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsMaxInstance")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsMinAll")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsMinInstance")) });
        $ic260$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMany")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin")), constant_handles_oc.f8479((SubLObject)makeString("relationExistsExists")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMany")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMax")), constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMin")) });
        $ic261$ = makeSymbol("S#17832", "CYC");
        $ic262$ = constant_handles_oc.f8479((SubLObject)makeString("ArgTypePredicate"));
        $ic263$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic264$ = constant_handles_oc.f8479((SubLObject)makeString("fanOutArg"));
        $ic265$ = makeKeyword("SUPERIOR?");
        $ic266$ = constant_handles_oc.f8479((SubLObject)makeString("coExtensional"));
        $ic267$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic268$ = makeSymbol("S#12263", "CYC");
        $ic269$ = constant_handles_oc.f8479((SubLObject)makeString("myReviewer"));
        $ic270$ = makeSymbol("REVIEWER");
        $ic271$ = ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"))));
        $ic272$ = makeString("Identify the cyclist who reviewed FORT.");
        $ic273$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12263", "CYC")));
        $ic274$ = ConsesLow.list((SubLObject)makeSymbol("FORT-P"));
        $ic275$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic276$ = makeSymbol("COMMENT");
        $ic277$ = ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic278$ = makeString("Return the comment string for FORT.");
        $ic279$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("FORT-P")));
        $ic280$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"));
        $ic281$ = makeSymbol("COMMENT-IF-FORT");
        $ic282$ = makeSymbol("CYCLIST-NOTES");
        $ic283$ = constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes"));
        $ic284$ = makeSymbol("S#17848", "CYC");
        $ic285$ = makeSymbol("S#17847", "CYC");
        $ic286$ = makeString("mapping Cyc assertions");
        $ic287$ = makeSymbol("STRINGP");
        $ic288$ = makeKeyword("SKIP");
        $ic289$ = makeSymbol("CONSTANT-NAME");
        $ic290$ = makeSymbol("S#3851", "CYC");
        $ic291$ = makeSymbol("S#12276", "CYC");
        $ic292$ = makeKeyword("GAF");
        $ic293$ = makeSymbol("S#17324", "CYC");
        $ic294$ = makeString("~%~%in mt : ~s.");
        $ic295$ = makeString("~%EL : ~S.");
        $ic296$ = makeKeyword("ALL");
        $ic297$ = makeString("~%~a : ");
        $ic298$ = makeSymbol("S#17857", "CYC");
        $ic299$ = makeSymbol("S#17351", "CYC");
        $ic300$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")));
        $ic301$ = makeString("~%~%missing doc preds:");
        $ic302$ = makeString(" ~A");
        $ic303$ = makeString("~%  ~a");
        $ic304$ = makeString("~%    ~a");
        $ic305$ = constant_handles_oc.f8479((SubLObject)makeString("scopingArg"));
        $ic306$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic307$ = makeSymbol("ALL-TERM-ASSERTIONS");
        $ic308$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#17361", "CYC"));
        $ic309$ = makeString("Return a list of all the assertions indexed via the indexed term TERM.");
        $ic310$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("INDEXED-TERM-P")));
        $ic311$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("ASSERTION-P")));
        $ic312$ = makeSymbol("S#17343", "CYC");
        $ic313$ = makeKeyword("MAPPING-DONE");
        $ic314$ = makeSymbol("S#12278", "CYC");
        $ic315$ = makeSymbol("S#17348", "CYC");
        $ic316$ = makeSymbol("ASSERTION-FI-FORMULA");
        $ic317$ = makeSymbol("S#17867", "CYC");
        $ic318$ = constant_handles_oc.f8479((SubLObject)makeString("retainTerm"));
        $ic319$ = makeSymbol("ISA-RELEVANT-ASSERTIONS");
        $ic320$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic321$ = makeString("Return a list of all (e.g., inheritance) rules relevant to TERM \nby virtue of the collections of which it is an instance.");
        $ic322$ = makeKeyword("NEG");
        $ic323$ = makeKeyword("POS");
        $ic324$ = makeSymbol("ISA-RELEVANT-ASSERTIONS-WRT-TYPE");
        $ic325$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#12458", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic326$ = makeString("Returns a list of all (e.g., inheritance) rules that may apply \nto TERM by virtue of it being an instance of COLLECTION.");
        $ic327$ = makeSymbol("ASSERTION-FORMULA");
        $ic328$ = makeSymbol("S#11995", "CYC");
        $ic329$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#17932", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic330$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DONE"));
        $ic331$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic332$ = makeKeyword("MT");
        $ic333$ = makeKeyword("TRUTH");
        $ic334$ = makeKeyword("DONE");
        $ic335$ = makeUninternedSymbol("US#37F0605");
        $ic336$ = makeSymbol("DO-ALL-FORT-INSTANCES");
        $ic337$ = makeSymbol("S#11680", "CYC");
        $ic338$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic339$ = makeKeyword("PREDICATE");
        $ic340$ = makeSymbol("DO-GAFS-WRT-PRED-TYPE");
        $ic341$ = makeString("iterate over every gaf assertion mentioning TERM and having as a predicate some instance of PRED-TYPE");
        $ic342$ = makeKeyword("BREADTH");
        $ic343$ = makeKeyword("QUEUE");
        $ic344$ = makeKeyword("STACK");
        $ic345$ = makeSymbol("S#11450", "CYC");
        $ic346$ = makeKeyword("ERROR");
        $ic347$ = makeString("~A is not a ~A");
        $ic348$ = makeSymbol("S#11592", "CYC");
        $ic349$ = makeKeyword("CERROR");
        $ic350$ = makeString("continue anyway");
        $ic351$ = makeKeyword("WARN");
        $ic352$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic353$ = makeString("~A is neither SET-P nor LISTP.");
        $ic354$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic355$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic356$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic357$ = makeSymbol("S#17902", "CYC");
        $ic358$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic359$ = makeSymbol("S#17904", "CYC");
        $ic360$ = constant_handles_oc.f8479((SubLObject)makeString("definingMt"));
        $ic361$ = constant_handles_oc.f8479((SubLObject)makeString("hypotheticalTerm"));
        $ic362$ = constant_handles_oc.f8479((SubLObject)makeString("notAssertible"));
        $ic363$ = constant_handles_oc.f8479((SubLObject)makeString("notAssertibleCollection"));
        $ic364$ = constant_handles_oc.f8479((SubLObject)makeString("notAssertibleMt"));
        $ic365$ = constant_handles_oc.f8479((SubLObject)makeString("IndexicalConcept"));
        $ic366$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), constant_handles_oc.f8479((SubLObject)makeString("RelationInstanceExistsFn")), constant_handles_oc.f8479((SubLObject)makeString("RelationExistsInstanceFn")));
        $ic367$ = constant_handles_oc.f8479((SubLObject)makeString("IndeterminateTermDenotingFunction"));
        $ic368$ = constant_handles_oc.f8479((SubLObject)makeString("IndeterminateTerm"));
        $ic369$ = constant_handles_oc.f8479((SubLObject)makeString("NonSkolemIndeterminateTerm"));
        $ic370$ = constant_handles_oc.f8479((SubLObject)makeString("nonAbducibleRule"));
        $ic371$ = constant_handles_oc.f8479((SubLObject)makeString("TermExemptFromUniqueNamesAssumption"));
        $ic372$ = makeString("@cyc.com");
        $ic373$ = makeString("Can't get the email address of a non-fort: ~s");
        $ic374$ = constant_handles_oc.f8479((SubLObject)makeString("preferredEMailAddressText"));
        $ic375$ = constant_handles_oc.f8479((SubLObject)makeString("localEMailAddressText"));
        $ic376$ = makeSymbol("S#17923", "CYC");
        $ic377$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtSpace")), constant_handles_oc.f8479((SubLObject)makeString("CyclistsMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("Now"))));
        $ic378$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic379$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?CYCLIST"), constant_handles_oc.f8479((SubLObject)makeString("HumanCyclist")));
        $ic380$ = makeSymbol("?CYCLIST");
        $ic381$ = ConsesLow.list(new SubLObject[] { makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("ALLOWED-MODULES"), ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("JOIN")), makeKeyword("RETURN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)makeSymbol("?CYCLIST")) });
        $ic382$ = makeSymbol("S#17927", "CYC");
        $ic383$ = makeInteger(64);
        $ic384$ = makeSymbol("S#17600", "CYC");
        $ic385$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic386$ = makeSymbol("S#17924", "CYC");
    }
    
    public static final class $f15161$UnaryFunction extends UnaryFunction
    {
        public $f15161$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17599"));
        }
        
        public SubLObject processItem(final SubLObject var427) {
            return f15161(var427);
        }
    }
    
    public static final class $f15168$ZeroArityFunction extends ZeroArityFunction
    {
        public $f15168$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#17600"));
        }
        
        public SubLObject processItem() {
            return f15168();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 5698 ms
	
	Decompiled with Procyon 0.5.32.
*/