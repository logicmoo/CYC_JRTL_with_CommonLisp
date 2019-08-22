package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0775 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0775";
    public static final String myFingerPrint = "cfef052bb6f0059ef40a2ead2542a08e9b5ad89f13a924a29606f0a91d5b93d9";
    private static SubLSymbol $g6217$;
    private static SubLSymbol $g6218$;
    private static SubLSymbol $g6219$;
    public static SubLSymbol $g6220$;
    private static SubLSymbol $g6221$;
    private static SubLSymbol $g6222$;
    private static SubLSymbol $g6223$;
    private static SubLSymbol $g6224$;
    private static SubLSymbol $g6225$;
    public static SubLSymbol $g6226$;
    private static SubLSymbol $g6227$;
    private static SubLSymbol $g6228$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLObject $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLList $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLList $ic182$;
    private static final SubLObject $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLList $ic185$;
    private static final SubLList $ic186$;
    private static final SubLList $ic187$;
    private static final SubLString $ic188$;
    private static final SubLList $ic189$;
    private static final SubLObject $ic190$;
    private static final SubLList $ic191$;
    private static final SubLObject $ic192$;
    private static final SubLObject $ic193$;
    private static final SubLObject $ic194$;
    private static final SubLString $ic195$;
    private static final SubLObject $ic196$;
    private static final SubLObject $ic197$;
    private static final SubLString $ic198$;
    private static final SubLObject $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLObject $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLObject $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLList $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLString $ic215$;
    private static final SubLObject $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLString $ic218$;
    private static final SubLObject $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLList $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLObject $ic230$;
    private static final SubLObject $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLObject $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLObject $ic236$;
    private static final SubLList $ic237$;
    private static final SubLList $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLObject $ic240$;
    private static final SubLList $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLObject $ic244$;
    private static final SubLString $ic245$;
    private static final SubLObject $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLObject $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLObject $ic252$;
    private static final SubLList $ic253$;
    private static final SubLList $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLObject $ic258$;
    private static final SubLList $ic259$;
    private static final SubLString $ic260$;
    private static final SubLList $ic261$;
    private static final SubLString $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLObject $ic264$;
    private static final SubLList $ic265$;
    private static final SubLString $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLList $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLString $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLString $ic285$;
    private static final SubLString $ic286$;
    private static final SubLString $ic287$;
    private static final SubLString $ic288$;
    private static final SubLString $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLString $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLString $ic303$;
    private static final SubLList $ic304$;
    private static final SubLString $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLString $ic308$;
    private static final SubLList $ic309$;
    private static final SubLList $ic310$;
    private static final SubLString $ic311$;
    private static final SubLString $ic312$;
    private static final SubLString $ic313$;
    private static final SubLString $ic314$;
    private static final SubLString $ic315$;
    private static final SubLString $ic316$;
    private static final SubLString $ic317$;
    private static final SubLString $ic318$;
    private static final SubLString $ic319$;
    private static final SubLString $ic320$;
    private static final SubLString $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLList $ic324$;
    private static final SubLString $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLString $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLString $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLList $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLString $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLObject $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLList $ic353$;
    private static final SubLObject $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLList $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLList $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLString $ic370$;
    private static final SubLList $ic371$;
    private static final SubLList $ic372$;
    private static final SubLSymbol $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLList $ic375$;
    private static final SubLObject $ic376$;
    private static final SubLList $ic377$;
    private static final SubLList $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLString $ic380$;
    private static final SubLFloat $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLObject $ic387$;
    private static final SubLObject $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLSymbol $ic391$;
    private static final SubLSymbol $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLObject $ic396$;
    private static final SubLString $ic397$;
    private static final SubLObject $ic398$;
    
    
    public static SubLObject f49669(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != module0004.f106(var1) : var1;
        assert NIL != module0004.f106(var2) : var2;
        assert NIL != module0004.f106(var3) : var3;
        final SubLObject var6 = inference_datastructures_inference_oc.f25617(var1, var2, var3);
        final SubLObject var7 = inference_datastructures_inference_oc.f25732(var6);
        final SubLObject var8 = f49670(var7);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0579.$g4296$.currentBinding(var5);
        final SubLObject var11 = module0579.$g4278$.currentBinding(var5);
        final SubLObject var12 = module0579.$g4273$.currentBinding(var5);
        final SubLObject var13 = module0579.$g4238$.currentBinding(var5);
        final SubLObject var14 = module0579.$g4350$.currentBinding(var5);
        final SubLObject var15 = module0579.$g4351$.currentBinding(var5);
        final SubLObject var16 = module0579.$g4352$.currentBinding(var5);
        final SubLObject var17 = module0579.$g4355$.currentBinding(var5);
        final SubLObject var18 = module0579.$g4353$.currentBinding(var5);
        try {
            module0579.$g4296$.bind(var6, var5);
            module0579.$g4278$.bind(inference_datastructures_inference_oc.f25491(inference_datastructures_inference_oc.f25732(var6)), var5);
            module0579.$g4273$.bind((SubLObject)T, var5);
            module0579.$g4238$.bind((SubLObject)T, var5);
            module0579.$g4350$.bind((SubLObject)NIL, var5);
            module0579.$g4351$.bind(f49671(), var5);
            module0579.$g4352$.bind(f49672(), var5);
            module0579.$g4355$.bind((SubLObject)ZERO_INTEGER, var5);
            module0579.$g4353$.bind((SubLObject)NIL, var5);
            var5.resetMultipleValues();
            final SubLObject var19 = module0580.f35615();
            final SubLObject var20 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            final SubLObject var10_21 = module0579.$g4298$.currentBinding(var5);
            final SubLObject var11_22 = module0579.$g4301$.currentBinding(var5);
            try {
                module0579.$g4298$.bind((NIL != var19) ? var19 : module0579.$g4298$.getDynamicValue(var5), var5);
                module0579.$g4301$.bind((NIL != var20) ? var20 : module0579.$g4301$.getDynamicValue(var5), var5);
                SubLObject var21 = inference_datastructures_inference_oc.f25744(var6);
                SubLObject var22 = (SubLObject)NIL;
                var22 = var21.first();
                while (NIL != var21) {
                    if (NIL == var9) {
                        SubLObject var23_25 = inference_datastructures_inference_oc.f25785(var22);
                        SubLObject var23 = (SubLObject)NIL;
                        var23 = var23_25.first();
                        while (NIL != var23_25) {
                            if (NIL == var9) {
                                final SubLObject var24 = f49673(var23, var8);
                                final SubLObject var25 = module0770.f49058(var24, (SubLObject)$ic2$, (SubLObject)$ic3$, var4, var8, (SubLObject)UNPROVIDED);
                                if (NIL != var24 && NIL != var25) {
                                    var9 = (SubLObject)ConsesLow.list(var25, var24);
                                }
                            }
                            var23_25 = var23_25.rest();
                            var23 = var23_25.first();
                        }
                    }
                    var21 = var21.rest();
                    var22 = var21.first();
                }
            }
            finally {
                module0579.$g4301$.rebind(var11_22, var5);
                module0579.$g4298$.rebind(var10_21, var5);
            }
        }
        finally {
            module0579.$g4353$.rebind(var18, var5);
            module0579.$g4355$.rebind(var17, var5);
            module0579.$g4352$.rebind(var16, var5);
            module0579.$g4351$.rebind(var15, var5);
            module0579.$g4350$.rebind(var14, var5);
            module0579.$g4238$.rebind(var13, var5);
            module0579.$g4273$.rebind(var12, var5);
            module0579.$g4278$.rebind(var11, var5);
            module0579.$g4296$.rebind(var10, var5);
        }
        if (NIL == var9) {
            Errors.error((SubLObject)$ic4$, var1, var2, var3);
        }
        return var9;
    }
    
    public static SubLObject f49674(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = inference_datastructures_inference_oc.f25732(var6);
        final SubLObject var9 = f49670(var8);
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0579.$g4296$.currentBinding(var7);
        final SubLObject var13 = module0579.$g4278$.currentBinding(var7);
        final SubLObject var14 = module0579.$g4273$.currentBinding(var7);
        final SubLObject var15 = module0579.$g4238$.currentBinding(var7);
        final SubLObject var16 = module0579.$g4350$.currentBinding(var7);
        final SubLObject var17 = module0579.$g4351$.currentBinding(var7);
        final SubLObject var18 = module0579.$g4352$.currentBinding(var7);
        final SubLObject var19 = module0579.$g4355$.currentBinding(var7);
        final SubLObject var20 = module0579.$g4353$.currentBinding(var7);
        try {
            module0579.$g4296$.bind(var6, var7);
            module0579.$g4278$.bind(inference_datastructures_inference_oc.f25491(inference_datastructures_inference_oc.f25732(var6)), var7);
            module0579.$g4273$.bind((SubLObject)T, var7);
            module0579.$g4238$.bind((SubLObject)T, var7);
            module0579.$g4350$.bind((SubLObject)NIL, var7);
            module0579.$g4351$.bind(f49671(), var7);
            module0579.$g4352$.bind(f49672(), var7);
            module0579.$g4355$.bind((SubLObject)ZERO_INTEGER, var7);
            module0579.$g4353$.bind((SubLObject)NIL, var7);
            var7.resetMultipleValues();
            final SubLObject var21 = module0580.f35615();
            final SubLObject var22 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            final SubLObject var10_32 = module0579.$g4298$.currentBinding(var7);
            final SubLObject var11_33 = module0579.$g4301$.currentBinding(var7);
            try {
                module0579.$g4298$.bind((NIL != var21) ? var21 : module0579.$g4298$.getDynamicValue(var7), var7);
                module0579.$g4301$.bind((NIL != var22) ? var22 : module0579.$g4301$.getDynamicValue(var7), var7);
                module0580.f35614();
                SubLObject var23 = inference_datastructures_inference_oc.f25744(var6);
                SubLObject var24 = (SubLObject)NIL;
                var24 = var23.first();
                while (NIL != var23) {
                    SubLObject var23_34 = inference_datastructures_inference_oc.f25785(var24);
                    SubLObject var25 = (SubLObject)NIL;
                    var25 = var23_34.first();
                    while (NIL != var23_34) {
                        if (NIL == module0004.f104(var25, var11, (SubLObject)$ic5$, (SubLObject)UNPROVIDED)) {
                            final SubLObject var26 = print_high.princ_to_string(var10);
                            final SubLObject var10_33 = module0579.$g4344$.currentBinding(var7);
                            try {
                                module0579.$g4344$.bind(module0373.f26231(var25), var7);
                                f49675(var25, var9);
                                f49676(var25, var9, var26);
                            }
                            finally {
                                module0579.$g4344$.rebind(var10_33, var7);
                            }
                            var11 = (SubLObject)ConsesLow.cons(var25, var11);
                            var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                        }
                        var23_34 = var23_34.rest();
                        var25 = var23_34.first();
                    }
                    var23 = var23.rest();
                    var24 = var23.first();
                }
            }
            finally {
                module0579.$g4301$.rebind(var11_33, var7);
                module0579.$g4298$.rebind(var10_32, var7);
            }
        }
        finally {
            module0579.$g4353$.rebind(var20, var7);
            module0579.$g4355$.rebind(var19, var7);
            module0579.$g4352$.rebind(var18, var7);
            module0579.$g4351$.rebind(var17, var7);
            module0579.$g4350$.rebind(var16, var7);
            module0579.$g4238$.rebind(var15, var7);
            module0579.$g4273$.rebind(var14, var7);
            module0579.$g4278$.rebind(var13, var7);
            module0579.$g4296$.rebind(var12, var7);
        }
        return var6;
    }
    
    public static SubLObject f49677(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)$ic6$;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL != module0366.f24916(var26) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && NIL == f49678(var26, var6)) {
            Errors.error((SubLObject)$ic7$, var26, var6);
        }
        final SubLObject var28 = inference_datastructures_inference_oc.f25732(var6);
        final SubLObject var29 = f49670(var28);
        final SubLObject var30 = f49679(var6);
        final SubLObject var31 = (NIL != module0366.f24916(var26)) ? var26 : f49680(var30);
        final SubLObject var32 = module0579.$g4344$.currentBinding(var27);
        final SubLObject var33 = module0579.$g4296$.currentBinding(var27);
        final SubLObject var34 = module0579.$g4278$.currentBinding(var27);
        final SubLObject var35 = module0579.$g4273$.currentBinding(var27);
        final SubLObject var36 = module0579.$g4238$.currentBinding(var27);
        final SubLObject var37 = module0579.$g4350$.currentBinding(var27);
        final SubLObject var38 = module0579.$g4351$.currentBinding(var27);
        final SubLObject var39 = module0579.$g4352$.currentBinding(var27);
        final SubLObject var40 = module0579.$g4355$.currentBinding(var27);
        final SubLObject var41 = module0579.$g4353$.currentBinding(var27);
        try {
            module0579.$g4344$.bind(module0373.f26231(var31), var27);
            module0579.$g4296$.bind(var6, var27);
            module0579.$g4278$.bind(inference_datastructures_inference_oc.f25491(inference_datastructures_inference_oc.f25732(var6)), var27);
            module0579.$g4273$.bind((SubLObject)T, var27);
            module0579.$g4238$.bind((SubLObject)T, var27);
            module0579.$g4350$.bind((SubLObject)NIL, var27);
            module0579.$g4351$.bind(f49671(), var27);
            module0579.$g4352$.bind(f49672(), var27);
            module0579.$g4355$.bind((SubLObject)ZERO_INTEGER, var27);
            module0579.$g4353$.bind((SubLObject)NIL, var27);
            var27.resetMultipleValues();
            final SubLObject var42 = module0580.f35615();
            final SubLObject var43 = var27.secondMultipleValue();
            var27.resetMultipleValues();
            final SubLObject var10_40 = module0579.$g4298$.currentBinding(var27);
            final SubLObject var11_41 = module0579.$g4301$.currentBinding(var27);
            try {
                module0579.$g4298$.bind((NIL != var42) ? var42 : module0579.$g4298$.getDynamicValue(var27), var27);
                module0579.$g4301$.bind((NIL != var43) ? var43 : module0579.$g4301$.getDynamicValue(var27), var27);
                module0580.f35614();
                f49675(var31, var29);
                f49676(var31, var29, (SubLObject)$ic8$);
            }
            finally {
                module0579.$g4301$.rebind(var11_41, var27);
                module0579.$g4298$.rebind(var10_40, var27);
            }
        }
        finally {
            module0579.$g4353$.rebind(var41, var27);
            module0579.$g4355$.rebind(var40, var27);
            module0579.$g4352$.rebind(var39, var27);
            module0579.$g4351$.rebind(var38, var27);
            module0579.$g4350$.rebind(var37, var27);
            module0579.$g4238$.rebind(var36, var27);
            module0579.$g4273$.rebind(var35, var27);
            module0579.$g4278$.rebind(var34, var27);
            module0579.$g4296$.rebind(var33, var27);
            module0579.$g4344$.rebind(var32, var27);
        }
        return var6;
    }
    
    public static SubLObject f49681(final SubLObject var42, final SubLObject var2, final SubLObject var3, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = inference_datastructures_inference_oc.f25617(var42, var2, var3);
        final SubLObject var46 = module0361.f24320(var42, var43);
        SubLObject var47 = (SubLObject)NIL;
        assert NIL != inference_datastructures_inference_oc.f25684(var45) : var45;
        assert NIL != module0366.f24916(var46) : var46;
        SubLObject var48 = (SubLObject)NIL;
        try {
            var48 = streams_high.make_private_string_output_stream();
            final SubLObject var49 = module0015.$g131$.currentBinding(var44);
            final SubLObject var50 = module0579.$g4309$.currentBinding(var44);
            try {
                module0015.$g131$.bind(var48, var44);
                module0579.$g4309$.bind((SubLObject)NIL, var44);
                f49677(var45, var46);
            }
            finally {
                module0579.$g4309$.rebind(var50, var44);
                module0015.$g131$.rebind(var49, var44);
            }
            var47 = streams_high.get_output_stream_string(var48);
        }
        finally {
            final SubLObject var51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var44);
                streams_high.close(var48, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var51, var44);
            }
        }
        return var47;
    }
    
    public static SubLObject f49675(final SubLObject var26, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (NIL == f49682(var26)) {
            final SubLObject var31 = f49683(var26, var29);
            if (NIL != module0035.f2002(var31, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39021((SubLObject)$ic11$);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var32 = module0015.$g533$.currentBinding(var30);
                try {
                    module0015.$g533$.bind((SubLObject)T, var30);
                    SubLObject var33 = var31;
                    SubLObject var34 = (SubLObject)NIL;
                    var34 = var33.first();
                    while (NIL != var33) {
                        module0642.f39020(module0015.$g275$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_48 = module0015.$g533$.currentBinding(var30);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var30);
                            f49684(var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_48, var30);
                        }
                        module0642.f39020(module0015.$g276$.getGlobalValue());
                        var33 = var33.rest();
                        var34 = var33.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var32, var30);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0579.$g4347$.getDynamicValue(var30)) {
                final SubLObject var35 = module0579.$g4348$.getDynamicValue(var30);
                final SubLObject var36 = module0035.remove_if_not((SubLObject)$ic12$, f49685(var26, var29, var35, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var37 = (SubLObject)ONE_INTEGER;
                if (NIL != module0035.f2000(var36, var37, (SubLObject)UNPROVIDED)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    if (NIL != var35) {
                        module0642.f39021((SubLObject)$ic13$);
                    }
                    module0642.f39021((SubLObject)$ic14$);
                    module0642.f39020(module0015.$g264$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var38 = module0015.$g533$.currentBinding(var30);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var30);
                        SubLObject var39 = var36;
                        SubLObject var40 = (SubLObject)NIL;
                        var40 = var39.first();
                        while (NIL != var39) {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_49 = module0015.$g533$.currentBinding(var30);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var30);
                                f49686(var40);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_49, var30);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                            var39 = var39.rest();
                            var40 = var39.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var38, var30);
                    }
                    module0642.f39020(module0015.$g265$.getGlobalValue());
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
        }
        return var26;
    }
    
    public static SubLObject f49685(final SubLObject var26, final SubLObject var29, SubLObject var49, SubLObject var54) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)T;
        }
        SubLObject var55 = (SubLObject)NIL;
        if (NIL != module0373.f26173(var26)) {
            var55 = f49687(var26, var29, var49, var54);
        }
        else if (NIL == f49688(var26)) {
            if (NIL != module0376.f26656(var26)) {
                var55 = f49689(var26, var29, var49, var54);
            }
            else if (NIL != module0377.f26776(var26)) {
                var55 = module0035.delete_if_not((SubLObject)$ic15$, ConsesLow.append(f49689(var26, var29, var49, var54), f49687(var26, var29, (NIL != module0004.f106(var49)) ? module0048.f_1_(var49) : var49, var54)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return Sequences.delete_if((SubLObject)$ic16$, Sequences.delete_duplicates(var55, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49687(final SubLObject var26, final SubLObject var29, final SubLObject var49, final SubLObject var54) {
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = f49690(var26);
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            SubLObject var23_56 = f49685(var57, var29, var49, var54);
            SubLObject var58 = (SubLObject)NIL;
            var58 = var23_56.first();
            while (NIL != var23_56) {
                var55 = (SubLObject)ConsesLow.cons(var58, var55);
                var23_56 = var23_56.rest();
                var58 = var23_56.first();
            }
            var56 = var56.rest();
            var57 = var56.first();
        }
        var55 = Sequences.nreverse(var55);
        return var55;
    }
    
    public static SubLObject f49689(final SubLObject var26, final SubLObject var29, final SubLObject var49, final SubLObject var54) {
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = f49691(module0366.f24966(var26));
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            SubLObject var23_59 = f49692(f49693(var57, module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var49, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var58 = (SubLObject)NIL;
            var58 = var23_59.first();
            while (NIL != var23_59) {
                if (NIL != assertion_handles_oc.f11035(var58) && NIL == f49694(var58, var29)) {
                    var55 = (SubLObject)ConsesLow.cons(var58, var55);
                }
                var23_59 = var23_59.rest();
                var58 = var23_59.first();
            }
            var56 = var56.rest();
            var57 = var56.first();
        }
        return var55;
    }
    
    public static SubLObject f49695(final SubLObject var26, final SubLObject var29, SubLObject var49, SubLObject var54) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)T;
        }
        SubLObject var55 = (SubLObject)NIL;
        if (NIL != module0373.f26173(var26)) {
            var55 = f49696(var26, var29, var49, var54);
        }
        else if (NIL != f49688(var26)) {
            var55 = f49697(var26, var29, var49, var54);
        }
        else if (NIL == module0376.f26656(var26)) {
            if (NIL != module0377.f26776(var26)) {
                var55 = module0035.delete_if_not((SubLObject)$ic18$, ConsesLow.append(f49697(var26, var29, var49, var54), f49696(var26, var29, (NIL != module0004.f106(var49)) ? module0048.f_1_(var49) : var49, var54)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return Sequences.delete_if((SubLObject)$ic16$, Sequences.delete_duplicates(var55, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49696(final SubLObject var26, final SubLObject var29, final SubLObject var49, final SubLObject var54) {
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = f49690(var26);
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            SubLObject var23_62 = f49695(var57, var29, var49, var54);
            SubLObject var58 = (SubLObject)NIL;
            var58 = var23_62.first();
            while (NIL != var23_62) {
                final SubLObject var59 = var58;
                if (NIL == conses_high.member(var59, var55, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var55 = (SubLObject)ConsesLow.cons(var59, var55);
                }
                var23_62 = var23_62.rest();
                var58 = var23_62.first();
            }
            var56 = var56.rest();
            var57 = var56.first();
        }
        var55 = Sequences.nreverse(var55);
        return var55;
    }
    
    public static SubLObject f49697(final SubLObject var26, final SubLObject var29, final SubLObject var49, final SubLObject var54) {
        SubLObject var55 = (SubLObject)NIL;
        SubLObject var56 = f49691(module0366.f24966(var26));
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            SubLObject var23_64 = f49692(f49693(var57, module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var49, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var58 = (SubLObject)NIL;
            var58 = var23_64.first();
            while (NIL != var23_64) {
                if (NIL != module0773.f49539(var58)) {
                    final SubLObject var59 = var58;
                    if (NIL == conses_high.member(var59, var55, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var55 = (SubLObject)ConsesLow.cons(var59, var55);
                    }
                }
                var23_64 = var23_64.rest();
                var58 = var23_64.first();
            }
            var56 = var56.rest();
            var57 = var56.first();
        }
        return var55;
    }
    
    public static SubLObject f49688(final SubLObject var26) {
        if (NIL != module0373.f26177(var26)) {
            final SubLObject var27 = module0373.f26181(var26);
            return (SubLObject)makeBoolean(NIL != module0340.f22789(var27) && NIL != conses_high.member((SubLObject)$ic19$, module0340.f22792(var27), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49692(final SubLObject var66, SubLObject var49, SubLObject var54, SubLObject var67, SubLObject var68) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)T;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)ZERO_INTEGER;
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        SubLObject var69 = (SubLObject)NIL;
        final SubLObject var70 = (SubLObject)makeBoolean(var49.isInteger() && var67.numG(var49));
        if (NIL != f49698(var66)) {
            if (NIL == var54 || NIL == var70) {
                SubLObject var71 = f49699(var66);
                SubLObject var72 = (SubLObject)NIL;
                var72 = var71.first();
                while (NIL != var71) {
                    SubLObject var23_72 = f49692(var72, var49, var54, module0048.f_1X(var67), var68);
                    SubLObject var73 = (SubLObject)NIL;
                    var73 = var23_72.first();
                    while (NIL != var23_72) {
                        if (NIL == var70 || NIL != f49700(var73)) {
                            var69 = (SubLObject)ConsesLow.cons(var73, var69);
                        }
                        var23_72 = var23_72.rest();
                        var73 = var23_72.first();
                    }
                    var71 = var71.rest();
                    var72 = var71.first();
                }
            }
            if (NIL == var68 || NIL == var69) {
                var69 = (SubLObject)ConsesLow.cons(f49701(var66), var69);
            }
        }
        return Sequences.delete_duplicates(var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49702(final SubLObject var66, SubLObject var49, SubLObject var54, SubLObject var67) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)T;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)ZERO_INTEGER;
        }
        return f49692(var66, var49, var54, var67, (SubLObject)T);
    }
    
    public static SubLObject f49700(final SubLObject var58) {
        if (NIL != assertion_handles_oc.f11035(var58) && NIL != f49703(var58)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49683(final SubLObject var26, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)NIL;
        if (NIL != module0373.f26173(var26)) {
            SubLObject var32 = f49690(var26);
            SubLObject var33 = (SubLObject)NIL;
            var33 = var32.first();
            while (NIL != var32) {
                SubLObject var23_73 = f49683(var33, var29);
                SubLObject var34 = (SubLObject)NIL;
                var34 = var23_73.first();
                while (NIL != var23_73) {
                    var31 = (SubLObject)ConsesLow.cons(var34, var31);
                    var23_73 = var23_73.rest();
                    var34 = var23_73.first();
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
            var31 = Sequences.nreverse(var31);
        }
        else if (NIL != f49704(var26)) {
            var31 = (SubLObject)ConsesLow.cons(f49705(var26, var29), var31);
            var31 = ConsesLow.append(f49706(var26, var29), var31);
        }
        final SubLObject var35 = module0579.$g4262$.currentBinding(var30);
        try {
            module0579.$g4262$.bind(var29, var30);
            var31 = Sequences.delete_if((SubLObject)$ic20$, Sequences.delete_if((SubLObject)$ic21$, Sequences.delete_duplicates(var31, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic22$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0579.$g4262$.rebind(var35, var30);
        }
        return var31;
    }
    
    public static SubLObject f49707(final SubLObject var74) {
        if (NIL != assertion_handles_oc.f11035(var74)) {
            return f49708(var74);
        }
        return var74;
    }
    
    public static SubLObject f49679(final SubLObject var6) {
        assert NIL != inference_datastructures_inference_oc.f25684(var6) : var6;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = inference_datastructures_inference_oc.f25744(var6);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            var7 = (SubLObject)ConsesLow.cons(f49709(var9), var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f49709(final SubLObject var24) {
        return inference_datastructures_inference_oc.f25790(var24);
    }
    
    public static SubLObject f49710(final SubLObject var75, final SubLObject var76) {
        return (SubLObject)makeBoolean(NIL != f49711(var75, var76) && NIL != module0035.f2007(module0537.f33307(var76), module0537.f33307(var75)));
    }
    
    public static SubLObject f49712(final SubLObject var6, final SubLObject var26) {
        assert NIL != inference_datastructures_inference_oc.f25684(var6) : var6;
        assert NIL != module0366.f24916(var26) : var26;
        SubLObject var27 = inference_datastructures_inference_oc.f25744(var6);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            SubLObject var23_77 = inference_datastructures_inference_oc.f25785(var28);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var23_77.first();
            while (NIL != var23_77) {
                if (var26.eql(var29)) {
                    return var28;
                }
                var23_77 = var23_77.rest();
                var29 = var23_77.first();
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49680(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var41;
        final SubLObject var40 = var41 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var42 = module0034.$g879$.currentBinding(var38);
        try {
            module0034.$g879$.bind(var41, var38);
            SubLObject var43 = (SubLObject)NIL;
            if (NIL != var41 && NIL == module0034.f1842(var41)) {
                var43 = module0034.f1869(var41);
                final SubLObject var44 = Threads.current_process();
                if (NIL == var43) {
                    module0034.f1873(var41, var44);
                }
                else if (!var43.eql(var44)) {
                    Errors.error((SubLObject)$ic23$);
                }
            }
            try {
                var39 = module0035.f2378(var37, (SubLObject)$ic24$, (SubLObject)$ic25$);
            }
            finally {
                final SubLObject var10_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                    if (NIL != var41 && NIL == var43) {
                        module0034.f1873(var41, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_84, var38);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var42, var38);
        }
        return var39;
    }
    
    public static SubLObject f49713(final SubLObject var26) {
        return f49714(var26);
    }
    
    public static SubLObject f49715(final SubLObject var26) {
        if (NIL == module0366.f24938(var26)) {
            return (SubLObject)ONE_INTEGER;
        }
        return module0048.f_1X(module0048.f3381(Mapping.mapcar((SubLObject)$ic26$, module0366.f24938(var26)), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49714(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        final SubLObject var28 = module0034.$g879$.getDynamicValue(var27);
        SubLObject var29 = (SubLObject)NIL;
        if (NIL == var28) {
            return f49715(var26);
        }
        var29 = module0034.f1857(var28, (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
        if (NIL == var29) {
            var29 = module0034.f1807(module0034.f1842(var28), (SubLObject)$ic26$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var28, (SubLObject)$ic26$, var29);
        }
        SubLObject var30 = module0034.f1814(var29, var26, (SubLObject)$ic27$);
        if (var30 == $ic27$) {
            var30 = Values.arg2(var27.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49715(var26)));
            module0034.f1816(var29, var26, var30, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var30);
    }
    
    public static SubLObject f49711(final SubLObject var75, final SubLObject var76) {
        final SubLObject var77 = module0366.f24967(var75);
        final SubLObject var78 = module0366.f24967(var76);
        return (SubLObject)makeBoolean(NIL != module0035.f2004(var77, var78) && NIL != module0035.f2014(var77) && NIL != module0191.f11993(var77) && NIL != module0191.f11993(var78) && NIL == conses_high.set_difference(var77, var78, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic28$));
    }
    
    public static SubLObject f49676(final SubLObject var26, final SubLObject var29, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)$ic8$;
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = f49705(var26, var29);
        final SubLObject var93 = f49673(var26, var29);
        final SubLObject var94 = module0579.$g4262$.currentBinding(var91);
        final SubLObject var95 = module0579.$g4355$.currentBinding(var91);
        try {
            module0579.$g4262$.bind(var29, var91);
            module0579.$g4355$.bind(module0048.f_1X(module0579.$g4355$.getDynamicValue(var91)), var91);
            var91.resetMultipleValues();
            final SubLObject var96 = f49716(var26, f49717(), var29);
            final SubLObject var97 = var91.secondMultipleValue();
            var91.resetMultipleValues();
            if (NIL == conses_high.member(var26, module0579.$g4350$.getDynamicValue(var91), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != module0373.f26173(var26)) {
                    SubLObject var98 = (SubLObject)NIL;
                    SubLObject var99 = (SubLObject)NIL;
                    SubLObject var100 = (SubLObject)NIL;
                    var98 = f49690(var26);
                    var99 = var98.first();
                    for (var100 = (SubLObject)ZERO_INTEGER; NIL != var98; var98 = var98.rest(), var99 = var98.first(), var100 = Numbers.add((SubLObject)ONE_INTEGER, var100)) {
                        final SubLObject var101 = Sequences.cconcatenate(var90, print_high.princ_to_string(var100));
                        final SubLObject var10_96 = module0579.$g4355$.currentBinding(var91);
                        try {
                            module0579.$g4355$.bind(module0048.f_1_(module0579.$g4355$.getDynamicValue(var91)), var91);
                            f49676(var99, var29, var101);
                        }
                        finally {
                            module0579.$g4355$.rebind(var10_96, var91);
                        }
                    }
                    f49718(var26);
                }
                else if (NIL != f49719(var92, var29)) {
                    if (NIL != module0579.$g4349$.getDynamicValue(var91)) {
                        f49720(var26, var29);
                    }
                    f49718(var26);
                }
                else if (NIL != var96 && NIL != module0751.f46661((SubLObject)UNPROVIDED)) {
                    f49721(var26, var29, var97);
                }
                else if (NIL != f49722(var26)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    f49723(var93);
                    if (NIL != f49724(var26)) {
                        f49725(var90);
                    }
                }
                else if (NIL == f49726(var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    if (NIL == f49727(var26, var29, (SubLObject)UNPROVIDED)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f49723(var93);
                        f49718(var26);
                    }
                    else if (NIL != f49728(var26) && NIL == f49729(var26)) {
                        final SubLObject var102 = module0366.f24966(var26);
                        if (module0579.$g4355$.getDynamicValue(var91).isPositive()) {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_97 = module0015.$g533$.currentBinding(var91);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var91);
                                f49730(var102, var90);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_97, var91);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        else {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            f49730(var102, var90);
                        }
                        f49718(var26);
                    }
                    else {
                        final SubLObject var103 = (SubLObject)$ic29$;
                        if (NIL != f49731()) {
                            f49732(var26, var92, var29, var90, var103);
                        }
                        else {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_98 = module0015.$g533$.currentBinding(var91);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var91);
                                f49732(var26, var92, var29, var90, var103);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_98, var91);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        f49718(var26);
                    }
                }
            }
        }
        finally {
            module0579.$g4355$.rebind(var95, var91);
            module0579.$g4262$.rebind(var94, var91);
        }
        return var26;
    }
    
    public static SubLObject f49731() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return Numbers.numE(module0579.$g4355$.getDynamicValue(var5), module0579.$g4356$.getGlobalValue());
    }
    
    public static SubLObject f49725(final SubLObject var35) {
        f49733((SubLObject)$ic30$, var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49734(final SubLObject var35) {
        f49733((SubLObject)$ic31$, var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49733(final SubLObject var101, final SubLObject var35) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4309$.getDynamicValue(var102)) {
            final SubLObject var103 = Sequences.cconcatenate((SubLObject)$ic32$, var35);
            module0642.f39020(module0016.$g545$.getGlobalValue());
            module0642.f39020(module0016.$g546$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic33$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0016.$g547$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var104 = module0015.$g533$.currentBinding(var102);
            try {
                module0015.$g533$.bind((SubLObject)T, var102);
                module0642.f39028((SubLObject)UNPROVIDED);
                module0016.f886(var103);
                module0016.f889(module0016.$g555$.getGlobalValue());
                module0642.f39020((SubLObject)$ic35$);
                module0016.f890();
                module0016.f887();
                module0642.f39028((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var104, var102);
            }
            module0642.f39020(module0016.$g548$.getGlobalValue());
            module0642.f39028((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0016.f923(var103, (SubLObject)$ic36$);
            module0016.f908(var103, (SubLObject)$ic37$, (SubLObject)$ic38$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var103) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var103);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var104 = module0015.$g533$.currentBinding(var102);
            try {
                module0015.$g533$.bind((SubLObject)T, var102);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_103 = module0015.$g533$.currentBinding(var102);
                try {
                    module0015.$g533$.bind((SubLObject)T, var102);
                    module0642.f39020(module0015.$g275$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_104 = module0015.$g533$.currentBinding(var102);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var102);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019(var101);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_104, var102);
                    }
                    module0642.f39020(module0015.$g276$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_103, var102);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var104, var102);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var102), (SubLObject)$ic39$, var101);
            module0642.f39020(module0015.$g225$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49727(final SubLObject var26, final SubLObject var29, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f49722(var26)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49704(var26)) {
            return (SubLObject)T;
        }
        if (NIL != f49735(var26, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var29)) {
            return (SubLObject)T;
        }
        if (NIL != f49728(var26)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49719(f49705(var26, var29), var29)) {
            return (SubLObject)NIL;
        }
        module0077.f5326(var26, var31);
        SubLObject var32 = module0366.f24938(var26);
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            if (NIL == module0077.f5320(var33, var31) && NIL != f49727(var33, var29, var31)) {
                return (SubLObject)T;
            }
            var32 = var32.rest();
            var33 = var32.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49671() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL != module0054.f3959(module0579.$g4351$.getDynamicValue(var5))) {
            return module0579.$g4351$.getDynamicValue(var5);
        }
        return module0054.f3968();
    }
    
    public static SubLObject f49718(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL != module0054.f3959(module0579.$g4351$.getDynamicValue(var27))) {
            module0054.f3973(var26, module0579.$g4351$.getDynamicValue(var27));
            SubLObject var28 = module0366.f24938(var26);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                f49718(var29);
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return var26;
    }
    
    public static SubLObject f49717() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0054.f3959(module0579.$g4351$.getDynamicValue(var5))) ? module0054.f3975(module0579.$g4351$.getDynamicValue(var5)) : NIL);
    }
    
    public static SubLObject f49722(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0054.f3959(module0579.$g4351$.getDynamicValue(var27)) && NIL != module0054.f3979(module0373.f26241(var26), module0579.$g4351$.getDynamicValue(var27), (SubLObject)$ic40$, (SubLObject)$ic41$));
    }
    
    public static SubLObject f49736(final SubLObject var105, final SubLObject var106) {
        SubLObject var107 = (SubLObject)makeBoolean(NIL == module0035.f2004(var105, var106));
        if (NIL == var107) {
            SubLObject var108 = (SubLObject)NIL;
            SubLObject var109_110 = (SubLObject)NIL;
            SubLObject var109 = (SubLObject)NIL;
            SubLObject var112_113 = (SubLObject)NIL;
            var108 = var105;
            var109_110 = var108.first();
            var109 = var106;
            var112_113 = var109.first();
            while (NIL == var107 && (NIL != var109 || NIL != var108)) {
                if (NIL == f49737(module0232.f15306(var109_110), module0232.f15306(var112_113)) || NIL == f49737(module0232.f15308(var109_110), module0232.f15308(var112_113))) {
                    var107 = (SubLObject)T;
                }
                var108 = var108.rest();
                var109_110 = var108.first();
                var109 = var109.rest();
                var112_113 = var109.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var107);
    }
    
    public static SubLObject f49737(final SubLObject var114, final SubLObject var115) {
        SubLObject var116 = (SubLObject)NIL;
        var116 = (SubLObject)makeBoolean(NIL == module0035.f2004(var114, var115));
        if (NIL == var116) {
            SubLObject var117 = (SubLObject)NIL;
            SubLObject var117_118 = (SubLObject)NIL;
            SubLObject var118 = (SubLObject)NIL;
            SubLObject var120_121 = (SubLObject)NIL;
            var117 = var114;
            var117_118 = var117.first();
            var118 = var115;
            var120_121 = var118.first();
            while (NIL == var116 && (NIL != var118 || NIL != var117)) {
                SubLObject var120;
                final SubLObject var119 = var120 = var117_118;
                SubLObject var121 = (SubLObject)NIL;
                SubLObject var122 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var120, var119, (SubLObject)$ic42$);
                var121 = var120.first();
                var120 = var120.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var120, var119, (SubLObject)$ic42$);
                var122 = var120.first();
                var120 = var120.rest();
                if (NIL == var120) {
                    SubLObject var128_129;
                    final SubLObject var126_127 = var128_129 = var120_121;
                    SubLObject var123 = (SubLObject)NIL;
                    SubLObject var124 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var128_129, var126_127, (SubLObject)$ic43$);
                    var123 = var128_129.first();
                    var128_129 = var128_129.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var128_129, var126_127, (SubLObject)$ic43$);
                    var124 = var128_129.first();
                    var128_129 = var128_129.rest();
                    if (NIL == var128_129) {
                        var116 = (SubLObject)makeBoolean(!var122.equal(var124));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var126_127, (SubLObject)$ic43$);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var119, (SubLObject)$ic42$);
                }
                var117 = var117.rest();
                var117_118 = var117.first();
                var118 = var118.rest();
                var120_121 = var118.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var116);
    }
    
    public static SubLObject f49672() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL != module0077.f5302(module0579.$g4352$.getDynamicValue(var5))) {
            return module0579.$g4352$.getDynamicValue(var5);
        }
        return module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49738(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL != module0077.f5302(module0579.$g4352$.getDynamicValue(var27))) {
            module0077.f5326(var26, module0579.$g4352$.getDynamicValue(var27));
        }
        return var26;
    }
    
    public static SubLObject f49724(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0077.f5302(module0579.$g4352$.getDynamicValue(var27)) && NIL != module0078.f5362(module0373.f26241(var26), module0579.$g4352$.getDynamicValue(var27), (SubLObject)$ic40$, (SubLObject)$ic41$));
    }
    
    public static SubLObject f49739(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0579.$g4353$.getDynamicValue(var59).isList()) {
            module0579.$g4353$.setDynamicValue((SubLObject)ConsesLow.cons(var58, module0579.$g4353$.getDynamicValue(var59)), var59);
        }
        return var58;
    }
    
    public static SubLObject f49716(final SubLObject var75, final SubLObject var76, final SubLObject var29) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        if (NIL != module0366.f24916(var75) && NIL != module0366.f24916(var76) && NIL != f49704(var75) && NIL != f49724(var76)) {
            var77.resetMultipleValues();
            final SubLObject var133_134 = f49740(var75, var76, var29, (SubLObject)UNPROVIDED);
            final SubLObject var135_136 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            var78 = var133_134;
            var79 = var135_136;
        }
        return Values.values(var78, var79);
    }
    
    public static SubLObject f49740(final SubLObject var75, final SubLObject var76, final SubLObject var29, SubLObject var137) {
        if (var137 == UNPROVIDED) {
            var137 = (SubLObject)NIL;
        }
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = (SubLObject)NIL;
        if (!module0366.f24989(var75).eql(module0366.f24989(var76)) || (NIL != module0377.f26776(var75) && !module0377.f26777(var75).eql(module0377.f26777(var76)))) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var140 = f49705(var75, var29);
        final SubLObject var141 = f49705(var76, var29);
        final SubLObject var142 = module0366.f24938(var75);
        final SubLObject var143 = module0366.f24938(var76);
        if (NIL != f49741(var75) && !module0205.f13132(var140).equal(module0205.f13132(var141))) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL == module0035.f2004(var142, var143)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL != var142) {
            SubLObject var144 = (SubLObject)NIL;
            SubLObject var143_144 = (SubLObject)NIL;
            SubLObject var145 = (SubLObject)NIL;
            SubLObject var146_147 = (SubLObject)NIL;
            var144 = var142;
            var143_144 = var144.first();
            var145 = var143;
            var146_147 = var145.first();
            while (NIL != var145 || NIL != var144) {
                var138.resetMultipleValues();
                final SubLObject var146 = f49740(var143_144, var146_147, var29, (SubLObject)T);
                final SubLObject var147 = var138.secondMultipleValue();
                var138.resetMultipleValues();
                if (NIL == var146) {
                    return Values.values((SubLObject)NIL, (SubLObject)NIL);
                }
                SubLObject var148 = var147;
                SubLObject var149 = (SubLObject)NIL;
                var149 = var148.first();
                while (NIL != var148) {
                    final SubLObject var150 = var149;
                    if (NIL == conses_high.member(var150, var139, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var139 = (SubLObject)ConsesLow.cons(var150, var139);
                    }
                    var148 = var148.rest();
                    var149 = var148.first();
                }
                var144 = var144.rest();
                var143_144 = var144.first();
                var145 = var145.rest();
                var146_147 = var145.first();
            }
        }
        else if (NIL != var137 && !var140.equal(var141)) {
            var139 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var140, var141), var139);
        }
        return Values.values((SubLObject)T, var139);
    }
    
    public static SubLObject f49721(final SubLObject var26, final SubLObject var29, final SubLObject var93) {
        final SubLThread var94 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic44$);
        if (NIL != var93) {
            module0642.f39019((SubLObject)$ic45$);
            module0642.f39020(module0015.$g264$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var95 = module0015.$g533$.currentBinding(var94);
            try {
                module0015.$g533$.bind((SubLObject)T, var94);
                SubLObject var96 = var93;
                SubLObject var97 = (SubLObject)NIL;
                var97 = var96.first();
                while (NIL != var96) {
                    module0642.f39020(module0015.$g275$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_150 = module0015.$g533$.currentBinding(var94);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var94);
                        f49684(var97.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_150, var94);
                    }
                    module0642.f39020(module0015.$g276$.getGlobalValue());
                    var96 = var96.rest();
                    var97 = var96.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var95, var94);
            }
            module0642.f39020(module0015.$g265$.getGlobalValue());
        }
        module0642.f39019((SubLObject)$ic46$);
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var98 = f49742(var26, var29);
        f49723(var98);
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f49720(final SubLObject var26, final SubLObject var29) {
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic47$);
        f49684(f49705(var26, var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f49732(final SubLObject var26, final SubLObject var91, final SubLObject var29, final SubLObject var90, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        final SubLObject var100 = var99;
        if (var100.eql((SubLObject)$ic29$)) {
            f49743(var26, var29, var90);
        }
        else {
            f49744(var26, var91, var29, var90);
        }
        return var26;
    }
    
    public static SubLObject f49743(final SubLObject var26, final SubLObject var29, final SubLObject var90) {
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != f49704(var26)) {
            f49745(var26, var29, var90, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var91 = f49673(var26, var29);
            f49723(var91);
            SubLObject var92 = f49735(var26, (SubLObject)T, (SubLObject)NIL, (SubLObject)NIL, var29);
            if (NIL != module0202.f12590(var91)) {
                var92 = Sequences.remove(var91, var92, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var92) {
                f49746(var92, var90, (SubLObject)UNPROVIDED);
            }
        }
        return var26;
    }
    
    public static SubLObject f49735(final SubLObject var26, SubLObject var152, SubLObject var153, SubLObject var154, SubLObject var155) {
        if (var152 == UNPROVIDED) {
            var152 = (SubLObject)NIL;
        }
        if (var153 == UNPROVIDED) {
            var153 = (SubLObject)NIL;
        }
        if (var154 == UNPROVIDED) {
            var154 = (SubLObject)NIL;
        }
        if (var155 == UNPROVIDED) {
            var155 = f49747();
        }
        if (NIL != f49704(var26) && NIL != f49748(f49749(var26), var155)) {
            return (SubLObject)NIL;
        }
        final SubLObject var156 = module0366.f24966(var26);
        final SubLObject var157 = conses_high.set_difference(var156, f49750(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var158 = f49751(var157, var154);
        final SubLObject var159 = Sequences.find_if((SubLObject)$ic48$, var156, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var160 = (SubLObject)((NIL != var159) ? f49752(var159, var155) : NIL);
        if (NIL != var160 && NIL != var158) {
            var158 = f49753(var158, var160);
        }
        if (NIL != var158 && NIL != var153) {
            SubLObject var161 = (SubLObject)NIL;
            if (NIL == var161) {
                SubLObject var162 = var158;
                SubLObject var163 = (SubLObject)NIL;
                var163 = var162.first();
                while (NIL == var161 && NIL != var162) {
                    if (NIL == f49694(var163, var153)) {
                        var161 = (SubLObject)T;
                    }
                    var162 = var162.rest();
                    var163 = var162.first();
                }
            }
            if (NIL == var161) {
                var158 = var157;
            }
        }
        if (NIL != var152) {
            SubLObject var164 = module0366.f24938(var26);
            SubLObject var165 = (SubLObject)NIL;
            var165 = var164.first();
            while (NIL != var164) {
                var158 = ConsesLow.append(var158, f49735(var165, (SubLObject)T, var153, var154, var155));
                var164 = var164.rest();
                var165 = var164.first();
            }
        }
        return f49754(var158);
    }
    
    public static SubLObject f49748(final SubLObject var159, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49747();
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0147.f9540(var155);
        final SubLObject var162 = module0147.$g2095$.currentBinding(var160);
        final SubLObject var163 = module0147.$g2094$.currentBinding(var160);
        final SubLObject var164 = module0147.$g2096$.currentBinding(var160);
        try {
            module0147.$g2095$.bind(module0147.f9545(var161), var160);
            module0147.$g2094$.bind(module0147.f9546(var161), var160);
            module0147.$g2096$.bind(module0147.f9549(var161), var160);
            return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var159) && NIL != module0220.f14544(var159, $ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2096$.rebind(var164, var160);
            module0147.$g2094$.rebind(var163, var160);
            module0147.$g2095$.rebind(var162, var160);
        }
    }
    
    public static SubLObject f49751(final SubLObject var97, final SubLObject var154) {
        SubLObject var155 = (SubLObject)NIL;
        SubLObject var156 = var97;
        SubLObject var157 = (SubLObject)NIL;
        var157 = var156.first();
        while (NIL != var156) {
            if (NIL == f49755(var157, var154, (SubLObject)UNPROVIDED)) {
                var155 = (SubLObject)ConsesLow.cons(var157, var155);
            }
            var156 = var156.rest();
            var157 = var156.first();
        }
        return Sequences.nreverse(var155);
    }
    
    public static SubLObject f49756(final SubLObject var26) {
        return Sequences.remove_if((SubLObject)$ic51$, module0366.f24966(var26), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49704(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != module0377.f26776(var26) || NIL != f49729(var26));
    }
    
    public static SubLObject f49749(final SubLObject var26) {
        if (NIL != module0377.f26776(var26)) {
            return module0377.f26777(var26);
        }
        if (NIL != f49741(var26)) {
            return f49757(var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49706(final SubLObject var26, final SubLObject var29) {
        SubLObject var30 = (SubLObject)NIL;
        if (NIL != f49729(var26)) {
            SubLObject var31 = f49691(module0366.f24966(var26));
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL != var31) {
                if (NIL != f49694(var32, var29) && NIL == module0178.f11375(var32)) {
                    SubLObject var23_164 = f49758(var32, var29, (SubLObject)UNPROVIDED);
                    SubLObject var33 = (SubLObject)NIL;
                    var33 = var23_164.first();
                    while (NIL != var23_164) {
                        var30 = (SubLObject)ConsesLow.cons(var33, var30);
                        var23_164 = var23_164.rest();
                        var33 = var23_164.first();
                    }
                    if (NIL == f49741(var26)) {
                        var30 = (SubLObject)ConsesLow.cons(f49759(var32, (SubLObject)UNPROVIDED), var30);
                    }
                }
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        else {
            SubLObject var31 = module0366.f24938(var26);
            SubLObject var34 = (SubLObject)NIL;
            var34 = var31.first();
            while (NIL != var31) {
                SubLObject var23_165 = f49706(var34, var29);
                SubLObject var35 = (SubLObject)NIL;
                var35 = var23_165.first();
                while (NIL != var23_165) {
                    var30 = (SubLObject)ConsesLow.cons(var35, var30);
                    var23_165 = var23_165.rest();
                    var35 = var23_165.first();
                }
                if (NIL != f49704(var34)) {
                    var30 = (SubLObject)ConsesLow.cons(f49705(var34, var29), var30);
                }
                var31 = var31.rest();
                var34 = var31.first();
            }
        }
        return var30;
    }
    
    public static SubLObject f49758(final SubLObject var168, final SubLObject var29, SubLObject var169) {
        if (var169 == UNPROVIDED) {
            var169 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        SubLObject var170 = (SubLObject)NIL;
        module0077.f5326(f49759(var168, (SubLObject)UNPROVIDED), var169);
        SubLObject var171 = f49760(var168, (SubLObject)T, var169);
        SubLObject var172 = (SubLObject)NIL;
        var172 = var171.first();
        while (NIL != var171) {
            if (NIL == module0077.f5320(f49759(var172, (SubLObject)UNPROVIDED), var169) && NIL != f49694(var172, var29) && NIL == module0178.f11375(var172)) {
                module0077.f5326(f49759(var172, (SubLObject)UNPROVIDED), var169);
                SubLObject var23_170 = f49758(var172, var29, var169);
                SubLObject var173 = (SubLObject)NIL;
                var173 = var23_170.first();
                while (NIL != var23_170) {
                    var170 = (SubLObject)ConsesLow.cons(var173, var170);
                    var23_170 = var23_170.rest();
                    var173 = var23_170.first();
                }
                var170 = (SubLObject)ConsesLow.cons(f49759(var172, (SubLObject)UNPROVIDED), var170);
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return var170;
    }
    
    public static SubLObject f49729(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != f49761(var26) || NIL != f49741(var26));
    }
    
    public static SubLObject f49761(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != module0376.f26656(var26) && NIL == var27) {
            SubLObject var28 = module0366.f24966(var26);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL == var27 && NIL != var28) {
                if (NIL != module0191.f11952(var29) && module0191.f11965(var29) == $ic52$ && NIL != module0202.f12597(module0191.f11967(var29))) {
                    var27 = var29;
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return var27;
    }
    
    public static SubLObject f49741(final SubLObject var26) {
        return assertion_handles_oc.f11035(f49757(var26));
    }
    
    public static SubLObject f49757(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != module0376.f26656(var26)) {
            final SubLObject var28 = module0366.f24966(var26);
            if (NIL != module0035.f1997(var28)) {
                final SubLObject var29 = f49762(var28.first());
                if (NIL != assertion_handles_oc.f11035(var29) && NIL == module0178.f11375(var29) && NIL == var27) {
                    SubLObject var30 = f49699(f49763(var29, (SubLObject)UNPROVIDED));
                    SubLObject var31 = (SubLObject)NIL;
                    var31 = var30.first();
                    while (NIL == var27 && NIL != var30) {
                        if (NIL != module0178.f11290(f49701(var31))) {
                            var27 = var29;
                        }
                        var30 = var30.rest();
                        var31 = var30.first();
                    }
                }
            }
        }
        return var27;
    }
    
    public static SubLObject f49745(final SubLObject var26, final SubLObject var29, final SubLObject var90, SubLObject var137) {
        if (var137 == UNPROVIDED) {
            var137 = (SubLObject)NIL;
        }
        final SubLThread var138 = SubLProcess.currentSubLThread();
        final SubLObject var139 = f49742(var26, var29);
        if (NIL == f49764(var139)) {
            final SubLObject var140 = f49705(var26, var29);
            final SubLObject var141 = (SubLObject)((NIL != module0202.f12925(var140)) ? f49765(var140, var29, (SubLObject)T) : NIL);
            if (NIL == assertion_handles_oc.f11035(var141)) {
                if (NIL == var137 && NIL == f49731()) {
                    f49766(var139, var137, (SubLObject)T);
                }
                SubLObject var142 = (SubLObject)ZERO_INTEGER;
                SubLObject var143 = module0366.f24938(var26);
                SubLObject var144 = (SubLObject)NIL;
                var144 = var143.first();
                while (NIL != var143) {
                    final SubLObject var145 = Sequences.cconcatenate(var90, new SubLObject[] { $ic53$, print_high.princ_to_string(var142) });
                    f49745(var144, var29, var145, (SubLObject)T);
                    var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                    var143 = var143.rest();
                    var144 = var143.first();
                }
                if (var142.isPositive()) {
                    f49738(var26);
                }
                if (NIL != f49704(var26) && NIL == f49722(var26)) {
                    if (NIL != f49682(var26)) {
                        f49768(var26, var29, var90, var137);
                        return var26;
                    }
                    f49769(var26, var29, var90, (SubLObject)$ic29$);
                    if (NIL != var137) {
                        module0579.$g4350$.setDynamicValue((SubLObject)ConsesLow.cons(var26, module0579.$g4350$.getDynamicValue(var138)), var138);
                    }
                    f49766(var139, var137, (SubLObject)NIL);
                    f49718(var26);
                }
            }
            else {
                if (NIL != module0178.f11376(var141)) {
                    if (NIL == var137 && NIL == f49731()) {
                        f49766(var141, (SubLObject)NIL, (SubLObject)T);
                    }
                    final SubLObject var146 = f49767(var141, var29, var90, (SubLObject)$ic29$);
                    if (NIL != var146) {
                        f49738(var26);
                    }
                    f49766(var141, var137, (SubLObject)NIL);
                    f49718(var26);
                    return var26;
                }
                return var26;
            }
        }
        return var26;
    }
    
    public static SubLObject f49766(final SubLObject var27, SubLObject var137, SubLObject var176) {
        if (var137 == UNPROVIDED) {
            var137 = (SubLObject)NIL;
        }
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)NIL;
        }
        module0642.f39026((SubLObject)TWO_INTEGER);
        if (NIL != var176) {
            module0642.f39021((SubLObject)$ic54$);
        }
        else if (NIL != var137) {
            module0642.f39021((SubLObject)$ic55$);
        }
        else {
            module0642.f39021((SubLObject)$ic56$);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        f49723(var27);
        return var27;
    }
    
    public static SubLObject f49723(final SubLObject var27) {
        if (NIL != assertion_handles_oc.f11035(var27)) {
            f49686(var27);
        }
        else {
            f49684(var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var27;
    }
    
    public static SubLObject f49742(final SubLObject var26, final SubLObject var29) {
        if (NIL != f49741(var26)) {
            return f49757(var26);
        }
        return f49673(var26, var29);
    }
    
    public static SubLObject f49744(final SubLObject var26, final SubLObject var91, final SubLObject var29, final SubLObject var90) {
        module0642.f39026((SubLObject)UNPROVIDED);
        f49684(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0377.f26776(var26)) {
            f49770(var26, var29, var90, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var92 = f49735(var26, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var29);
            SubLObject var93 = (SubLObject)$ic57$;
            if (NIL != var92) {
                f49746(var92, var90, var93);
            }
            if (NIL != module0366.f24974(var26)) {
                if (NIL != module0366.f24965(var26)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                final SubLObject var94 = f49690(var26);
                var93 = (SubLObject)$ic57$;
                f49771(var94, var29, var90, var93);
            }
        }
        return var26;
    }
    
    public static SubLObject f49769(final SubLObject var26, final SubLObject var29, final SubLObject var90, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        if (NIL != module0377.f26776(var26)) {
            f49770(var26, var29, var90, var99);
        }
        else if (NIL != f49761(var26)) {
            f49772(var26, var29, var90, var99);
        }
        else if (NIL != f49741(var26)) {
            f49773(var26, var29, var90, var99);
        }
        return var26;
    }
    
    public static SubLObject f49770(final SubLObject var26, final SubLObject var29, final SubLObject var90, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        f49774(var26, var29, var90, var99);
        final SubLObject var100 = module0377.f26779(var26);
        if (NIL != f49775(var100, var29)) {
            final SubLObject var101 = var99;
            if (var101.eql((SubLObject)$ic29$)) {
                final SubLObject var102 = Sequences.cconcatenate(var90, (SubLObject)$ic58$);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic59$);
                f49676(var100, var29, var102);
            }
            else {
                final SubLObject var103 = (SubLObject)$ic60$;
                f49771((SubLObject)ConsesLow.list(var100), var29, var90, var103);
            }
            f49738(var26);
        }
        f49718(var26);
        return var26;
    }
    
    public static SubLObject f49775(final SubLObject var55, final SubLObject var29) {
        if (NIL != f49776(var55, var29)) {
            return (SubLObject)T;
        }
        SubLObject var56 = module0366.f24938(var55);
        SubLObject var57 = (SubLObject)NIL;
        var57 = var56.first();
        while (NIL != var56) {
            if (NIL != f49775(var57, var29)) {
                return (SubLObject)T;
            }
            var56 = var56.rest();
            var57 = var56.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49776(final SubLObject var26, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0004.f104(var26, module0579.$g4350$.getDynamicValue(var30), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0373.f26173(var26) && NIL == f49722(var26) && NIL == f49719(f49705(var26, var29), var29) && (NIL != f49704(var26) || NIL != f49735(var26, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var29)));
    }
    
    public static SubLObject f49777(final SubLObject var26, final SubLObject var29, final SubLObject var90) {
        f49772(var26, var29, var90, (SubLObject)$ic29$);
        final SubLObject var91 = f49742(var26, var29);
        f49766(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f49772(final SubLObject var26, final SubLObject var29, final SubLObject var90, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        final SubLObject var100 = module0366.f24966(var26);
        final SubLObject var101 = f49778(var26, var100, (SubLObject)UNPROVIDED);
        f49779(var101, var90, var29, var99);
        if (NIL != var101) {
            f49738(var26);
        }
        return var26;
    }
    
    public static SubLObject f49780(final SubLObject var26, final SubLObject var29, final SubLObject var90) {
        f49773(var26, var29, var90, (SubLObject)$ic29$);
        final SubLObject var91 = f49742(var26, var29);
        f49766(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f49773(final SubLObject var26, final SubLObject var29, final SubLObject var90, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        final SubLObject var100 = f49757(var26);
        if (NIL != assertion_handles_oc.f11035(var100)) {
            f49767(var100, var29, var90, var99);
            f49738(var26);
        }
        return var26;
    }
    
    public static SubLObject f49767(final SubLObject var180, final SubLObject var29, final SubLObject var90, final SubLObject var99) {
        final SubLObject var181 = f49763(var180, (SubLObject)UNPROVIDED);
        SubLObject var182 = (SubLObject)NIL;
        if (NIL != var181) {
            f49779(var181, var90, var29, var99);
            if (NIL != f49699(var181)) {
                var182 = (SubLObject)T;
            }
        }
        return var182;
    }
    
    public static SubLObject f49781(final SubLObject var66) {
        return module0035.sublisp_boolean(Sequences.find_if((SubLObject)$ic61$, f49699(var66), (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49779(final SubLObject var66, final SubLObject var90, final SubLObject var29, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = f49699(var66);
        final SubLObject var102 = Sequences.find_if((SubLObject)$ic61$, var101, (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var103 = Sequences.remove(var102, var101, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var104 = f49782(var102, var103);
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var66_186 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        var106 = var104;
        var66_186 = var106.first();
        for (var107 = (SubLObject)ZERO_INTEGER; NIL != var106; var106 = var106.rest(), var66_186 = var106.first(), var107 = Numbers.add((SubLObject)ONE_INTEGER, var107)) {
            SubLObject var109;
            final SubLObject var108 = var109 = var66_186;
            SubLObject var110 = (SubLObject)NIL;
            SubLObject var111 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)$ic63$);
            var110 = var109.first();
            var109 = (var111 = var109.rest());
            if (NIL != assertion_handles_oc.f11035(var110) && NIL != module0035.f2014(var111)) {
                final SubLObject var112 = Sequences.cconcatenate(var90, new SubLObject[] { $ic64$, print_high.princ_to_string(var107) });
                if (NIL != f49781(var66_186)) {
                    f49779(var66_186, var112, var29, var99);
                    var105 = (SubLObject)ConsesLow.cons(var66_186, var105);
                    f49739(var110);
                    f49766(var110, (SubLObject)T, (SubLObject)NIL);
                }
            }
        }
        if (NIL != var105) {
            var104 = conses_high.set_difference(var104, var105, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115 = (SubLObject)NIL;
        SubLObject var116 = (SubLObject)NIL;
        SubLObject var66_187 = (SubLObject)NIL;
        SubLObject var117 = (SubLObject)NIL;
        var116 = var104;
        var66_187 = var116.first();
        for (var117 = (SubLObject)ZERO_INTEGER; NIL != var116; var116 = var116.rest(), var66_187 = var116.first(), var117 = Numbers.add((SubLObject)ONE_INTEGER, var117)) {
            final SubLObject var110 = f49701(var66_187);
            if (NIL != assertion_handles_oc.f11035(var110)) {
                if (NIL != f49694(var110, var29)) {
                    var113 = (SubLObject)ConsesLow.cons(var66_187, var113);
                    var114 = (SubLObject)ConsesLow.cons(var110, var114);
                }
                else {
                    var115 = (SubLObject)ConsesLow.cons(var110, var115);
                    var113 = (SubLObject)ConsesLow.cons(var66_187, var113);
                }
            }
        }
        f49783(Sequences.nreverse(var114), (SubLObject)NIL, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f49783(Sequences.nreverse(var115), (SubLObject)NIL, (SubLObject)$ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var113) {
            SubLObject var118 = var113;
            SubLObject var119 = (SubLObject)NIL;
            var119 = var118.first();
            while (NIL != var118) {
                final SubLObject var120 = f49701(var119);
                f49739(var120);
                var118 = var118.rest();
                var119 = var118.first();
            }
            var104 = conses_high.set_difference(var104, var113, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        final SubLObject var121 = f49701(var102);
        if (NIL != var121 && NIL == f49755(var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39021((SubLObject)$ic67$);
            module0642.f39026((SubLObject)UNPROVIDED);
            f49784(var121, var90, (SubLObject)UNPROVIDED);
            module0084.f5765(module0579.$g4354$.getGlobalValue(), var121, f49701(var66), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        if (NIL != var104) {
            final SubLObject var122 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic68$), var104);
            final SubLObject var123 = var99;
            if (var123.eql((SubLObject)$ic29$)) {
                final SubLObject var124 = Sequences.cconcatenate(var90, (SubLObject)$ic58$);
                final SubLObject var125 = (SubLObject)$ic59$;
                module0642.f39026((SubLObject)TWO_INTEGER);
                if (NIL != module0579.$g4309$.getDynamicValue(var100)) {
                    f49746(var122, var124, var125);
                }
                else {
                    f49785(var125, var122);
                }
            }
            else {
                final SubLObject var126 = (SubLObject)$ic60$;
                f49746(var122, var90, var126);
            }
        }
        return var66;
    }
    
    public static SubLObject f49782(final SubLObject var197, final SubLObject var198) {
        final SubLObject var199 = f49701(var197);
        final SubLObject var200 = (SubLObject)((NIL != module0191.f11950(var199)) ? module0232.f15306(f49786(var199)) : NIL);
        SubLObject var201 = (SubLObject)NIL;
        SubLObject var202 = var198;
        SubLObject var203 = (SubLObject)NIL;
        var203 = var202.first();
        while (NIL != var202) {
            final SubLObject var204 = f49701(var203);
            if (NIL != module0004.f104(module0191.f11967(var204), var200, Symbols.symbol_function((SubLObject)$ic69$), (SubLObject)UNPROVIDED) && NIL == f49755(var204, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var201 = (SubLObject)ConsesLow.cons(var203, var201);
            }
            var202 = var202.rest();
            var203 = var202.first();
        }
        return Sequences.nreverse(var201);
    }
    
    public static SubLObject f49774(final SubLObject var26, final SubLObject var29, final SubLObject var90, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0377.f26777(var26);
        final SubLObject var102 = Sequences.cconcatenate((SubLObject)$ic70$, var90);
        if (NIL == f49787(var101, var29)) {
            if (NIL != module0178.f11361(var101, (SubLObject)UNPROVIDED)) {
                f49788(var101, var26, var29, var90, var102, var99);
            }
            else if (NIL != module0579.$g4309$.getDynamicValue(var100)) {
                module0642.f39020(module0016.$g545$.getGlobalValue());
                module0642.f39020(module0016.$g546$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0016.$g547$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic34$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                SubLObject var103 = module0015.$g533$.currentBinding(var100);
                try {
                    module0015.$g533$.bind((SubLObject)T, var100);
                    module0642.f39028((SubLObject)UNPROVIDED);
                    module0016.f886(var102);
                    module0016.f889(module0016.$g555$.getGlobalValue());
                    module0642.f39020((SubLObject)$ic35$);
                    module0016.f890();
                    module0016.f887();
                    module0642.f39028((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var103, var100);
                }
                module0642.f39020(module0016.$g548$.getGlobalValue());
                module0642.f39028((SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0016.f923(var102, (SubLObject)$ic71$);
                module0016.f908(var102, (SubLObject)$ic37$, (SubLObject)$ic38$);
                module0642.f39020(module0015.$g144$.getGlobalValue());
                if (NIL != var102) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var102);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                var103 = module0015.$g533$.currentBinding(var100);
                try {
                    module0015.$g533$.bind((SubLObject)T, var100);
                    module0642.f39020(module0015.$g264$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_202 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        module0642.f39020(module0015.$g275$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_203 = module0015.$g533$.currentBinding(var100);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var100);
                            f49789(var101);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_203, var100);
                        }
                        module0642.f39020(module0015.$g276$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_202, var100);
                    }
                    module0642.f39020(module0015.$g265$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var103, var100);
                }
                module0642.f39020(module0015.$g145$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var103 = module0015.$g533$.currentBinding(var100);
                try {
                    module0015.$g533$.bind((SubLObject)T, var100);
                    module0642.f39020(module0015.$g275$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_204 = module0015.$g533$.currentBinding(var100);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var100);
                        f49789(var101);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_204, var100);
                    }
                    module0642.f39020(module0015.$g276$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var103, var100);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
            }
        }
        return var26;
    }
    
    public static SubLObject f49788(final SubLObject var201, final SubLObject var26, final SubLObject var29, final SubLObject var90, final SubLObject var102, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic2$;
        }
        final SubLThread var202 = SubLProcess.currentSubLThread();
        var202.resetMultipleValues();
        final SubLObject var203 = f49790(var201, var26, var29);
        final SubLObject var204 = var202.secondMultipleValue();
        final SubLObject var205 = var202.thirdMultipleValue();
        var202.resetMultipleValues();
        final SubLObject var206 = f49742(var26, var29);
        final SubLObject var207 = module0377.f26833(var26);
        final SubLObject var208 = f49791(var203, var206, var207);
        if (NIL != var204 && $ic29$ == var99) {
            f49792(var204, var26, var29, var90);
        }
        final SubLObject var209 = module0377.f26778(var26);
        if (NIL != module0579.$g4309$.getDynamicValue(var202) && var99 == $ic2$) {
            module0642.f39020(module0016.$g545$.getGlobalValue());
            module0642.f39020(module0016.$g546$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic33$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0016.$g547$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var210 = module0015.$g533$.currentBinding(var202);
            try {
                module0015.$g533$.bind((SubLObject)T, var202);
                module0642.f39028((SubLObject)UNPROVIDED);
                module0016.f886(var102);
                module0016.f889(module0016.$g555$.getGlobalValue());
                module0642.f39020((SubLObject)$ic35$);
                module0016.f890();
                module0016.f887();
                module0642.f39028((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var210, var202);
            }
            module0642.f39020(module0016.$g548$.getGlobalValue());
            module0642.f39028((SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var211 = (SubLObject)$ic72$;
            module0016.f923(var102, var211);
            module0016.f908(var102, (SubLObject)$ic37$, (SubLObject)$ic38$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var102) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var102);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var210 = module0015.$g533$.currentBinding(var202);
            try {
                module0015.$g533$.bind((SubLObject)T, var202);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_211 = module0015.$g533$.currentBinding(var202);
                try {
                    module0015.$g533$.bind((SubLObject)T, var202);
                    module0642.f39020(module0015.$g275$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_212 = module0015.$g533$.currentBinding(var202);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var202);
                        f49793(var208, var201, var29, var204, var209, var90, var99);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_212, var202);
                    }
                    module0642.f39020(module0015.$g276$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_211, var202);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var210, var202);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else if (var99 == $ic29$) {
            if (NIL == f49755(var201, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0642.f39021((SubLObject)$ic67$);
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != var205) {
                    f49793(var208, var201, var29, var204, var209, var90, var99);
                }
                else {
                    f49784(var201, var90, (SubLObject)UNPROVIDED);
                }
            }
        }
        else {
            module0642.f39020(module0015.$g264$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var210 = module0015.$g533$.currentBinding(var202);
            try {
                module0015.$g533$.bind((SubLObject)T, var202);
                module0642.f39020(module0015.$g275$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_213 = module0015.$g533$.currentBinding(var202);
                try {
                    module0015.$g533$.bind((SubLObject)T, var202);
                    f49684(var208, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f49746((SubLObject)ConsesLow.list(var201), var90, (SubLObject)$ic72$);
                    if (NIL != var209) {
                        f49746(var209, var90, (SubLObject)$ic73$);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var10_213, var202);
                }
                module0642.f39020(module0015.$g276$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var210, var202);
            }
            module0642.f39020(module0015.$g265$.getGlobalValue());
        }
        return var201;
    }
    
    public static SubLObject f49791(final SubLObject var214, SubLObject var27, final SubLObject var208) {
        final SubLObject var215 = (SubLObject)((NIL != module0202.f12597(var214)) ? $ic74$ : ((NIL != module0202.f12594(var214)) ? $ic75$ : NIL));
        if (NIL != var215) {
            SubLObject var216 = (SubLObject)((var215 == $ic74$) ? module0205.f13203(var214, (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var217 = (var215 == $ic74$) ? module0205.f13204(var214, (SubLObject)UNPROVIDED) : var214;
            if (var215 == $ic75$) {
                if (NIL != assertion_handles_oc.f11035(var27)) {
                    var27 = module0289.f19396(var27);
                }
                SubLObject var218 = (SubLObject)NIL;
                final SubLObject var219 = module0233.f15376(var208, var27);
                SubLObject var220 = (SubLObject)NIL;
                SubLObject var221 = module0205.f13207(var217, (SubLObject)UNPROVIDED);
                SubLObject var222 = (SubLObject)NIL;
                var222 = var221.first();
                while (NIL != var221) {
                    if (module0233.f15376(var208, var222).equal(var219)) {
                        var218 = (SubLObject)T;
                        var220 = var222;
                    }
                    else {
                        final SubLObject var223 = (var215 == $ic74$) ? module0202.f12771(var222) : var222;
                        if (NIL == f49794(var223, (SubLObject)UNPROVIDED)) {
                            var216 = ((NIL != var216) ? module0276.f18287((SubLObject)ConsesLow.list(var216, var223), (SubLObject)T) : var223);
                        }
                    }
                    var221 = var221.rest();
                    var222 = var221.first();
                }
                if (NIL != var218) {
                    if (var215 == $ic75$) {
                        var216 = module0202.f12771(var216);
                    }
                    return module0202.f12774(var216, var220);
                }
            }
        }
        return var214;
    }
    
    public static SubLObject f49792(final SubLObject var206, final SubLObject var26, final SubLObject var29, final SubLObject var90) {
        final SubLThread var207 = SubLProcess.currentSubLThread();
        SubLObject var208 = (SubLObject)NIL;
        SubLObject var209 = (SubLObject)NIL;
        SubLObject var210 = (SubLObject)NIL;
        SubLObject var211 = var206;
        SubLObject var212 = (SubLObject)NIL;
        var212 = var211.first();
        while (NIL != var211) {
            if (NIL != f49795(var212, f49705(var212, var29), var29)) {
                if (NIL == f49722(var212)) {
                    if (NIL == f49796(var212, var29)) {
                        var210 = (SubLObject)ConsesLow.cons(var212, var210);
                    }
                    else if (NIL != f49797(var212)) {
                        var208 = (SubLObject)ConsesLow.cons(f49673(var212, var29), var208);
                    }
                    else {
                        var209 = (SubLObject)ConsesLow.cons(var212, var209);
                    }
                }
            }
            var211 = var211.rest();
            var212 = var211.first();
        }
        f49783(Sequences.nreverse(var208), (SubLObject)NIL, (SubLObject)$ic65$, var90, var29);
        f49783(Sequences.nreverse(var209), (SubLObject)T, (SubLObject)$ic76$, var90, var29);
        f49783(Sequences.nreverse(var210), (SubLObject)T, (SubLObject)$ic66$, var90, var29);
        module0579.$g4350$.setDynamicValue(ConsesLow.append(module0579.$g4350$.getDynamicValue(var207), var206), var207);
        return var26;
    }
    
    public static SubLObject f49783(final SubLObject var226, final SubLObject var227, final SubLObject var228, SubLObject var90, SubLObject var29) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)NIL;
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)NIL;
        }
        if (NIL != var226) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            if (var228.eql((SubLObject)$ic65$)) {
                module0642.f39021((SubLObject)$ic77$);
            }
            else if (var228.eql((SubLObject)$ic76$)) {
                module0642.f39021((SubLObject)$ic78$);
            }
            else if (var228.eql((SubLObject)$ic66$)) {
                module0642.f39021((SubLObject)$ic79$);
            }
            else {
                module0642.f39021((SubLObject)$ic80$);
            }
            if (NIL != var227) {
                SubLObject var229 = (SubLObject)NIL;
                SubLObject var230 = (SubLObject)NIL;
                SubLObject var231 = (SubLObject)NIL;
                var229 = var226;
                var230 = var229.first();
                for (var231 = (SubLObject)ZERO_INTEGER; NIL != var229; var229 = var229.rest(), var230 = var229.first(), var231 = Numbers.add((SubLObject)ONE_INTEGER, var231)) {
                    final SubLObject var232 = Sequences.cconcatenate(var90, new SubLObject[] { $ic53$, print_high.princ_to_string(var228), print_high.princ_to_string(var231) });
                    f49676(var230, var29, var232);
                }
            }
            else {
                SubLObject var233 = var226;
                SubLObject var234 = (SubLObject)NIL;
                var234 = var233.first();
                while (NIL != var233) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    f49723(var234);
                    var233 = var233.rest();
                    var234 = var233.first();
                }
            }
        }
        return var226;
    }
    
    public static SubLObject f49793(final SubLObject var209, final SubLObject var201, final SubLObject var29, final SubLObject var206, final SubLObject var210, final SubLObject var90, final SubLObject var99) {
        final SubLThread var211 = SubLProcess.currentSubLThread();
        f49684(var209, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        f49746((SubLObject)ConsesLow.list(var201), var90, (SubLObject)$ic72$);
        if (NIL != var206 && $ic2$ == var99) {
            final SubLObject var212 = Sequences.cconcatenate(var90, (SubLObject)$ic81$);
            module0642.f39026((SubLObject)UNPROVIDED);
            f49771(var206, var29, var212, (SubLObject)UNPROVIDED);
            module0579.$g4350$.setDynamicValue(ConsesLow.append(module0579.$g4350$.getDynamicValue(var211), var206), var211);
        }
        if (NIL != var210) {
            f49746(var210, var90, (SubLObject)$ic73$);
        }
        return var201;
    }
    
    public static SubLObject f49798(final SubLObject var58, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        if (NIL != $g6217$.getDynamicValue(var156)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49800(var58)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49787(var58, var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49719(f49759(var58, (SubLObject)UNPROVIDED), var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49801(module0191.f11976(var58), var155)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49799() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = module0579.$g4262$.getDynamicValue(var5);
        if (NIL != module0761.f48134()) {
            final SubLObject var7 = f49802(module0579.$g4283$.getDynamicValue(var5), (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                var6 = module0751.f46998((SubLObject)ConsesLow.list($ic82$, var6, var7));
            }
        }
        return var6;
    }
    
    public static SubLObject f49803(SubLObject var230, SubLObject var155) {
        if (var230 == UNPROVIDED) {
            var230 = module0579.$g4283$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var231 = SubLProcess.currentSubLThread();
        SubLObject var232 = module0172.f10921((SubLObject)ConsesLow.list($ic84$, var230));
        if (NIL == var232 && NIL != module0212.f13762(var230)) {
            final SubLObject var233 = module0147.f9540(var155);
            final SubLObject var234 = module0147.$g2095$.currentBinding(var231);
            final SubLObject var235 = module0147.$g2094$.currentBinding(var231);
            final SubLObject var236 = module0147.$g2096$.currentBinding(var231);
            try {
                module0147.$g2095$.bind(module0147.f9545(var233), var231);
                module0147.$g2094$.bind(module0147.f9546(var233), var231);
                module0147.$g2096$.bind(module0147.f9549(var233), var231);
                SubLObject var237 = var230;
                final SubLObject var238 = (SubLObject)$ic87$;
                final SubLObject var239 = module0056.f4145(var238);
                final SubLObject var10_234 = module0139.$g1635$.currentBinding(var231);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var231);
                    final SubLObject var240 = (SubLObject)NIL;
                    final SubLObject var10_235 = module0141.$g1714$.currentBinding(var231);
                    final SubLObject var11_237 = module0141.$g1715$.currentBinding(var231);
                    try {
                        module0141.$g1714$.bind((NIL != var240) ? var240 : module0141.f9283(), var231);
                        module0141.$g1715$.bind((SubLObject)((NIL != var240) ? $ic88$ : module0141.$g1715$.getDynamicValue(var231)), var231);
                        if (NIL != var240 && NIL != module0136.f8864() && NIL == module0141.f9279(var240)) {
                            final SubLObject var241 = module0136.$g1591$.getDynamicValue(var231);
                            if (var241.eql((SubLObject)$ic89$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic90$, var240, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var241.eql((SubLObject)$ic92$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic93$, (SubLObject)$ic90$, var240, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var241.eql((SubLObject)$ic94$)) {
                                Errors.warn((SubLObject)$ic90$, var240, (SubLObject)$ic91$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic95$, module0136.$g1591$.getDynamicValue(var231));
                                Errors.cerror((SubLObject)$ic93$, (SubLObject)$ic90$, var240, (SubLObject)$ic91$);
                            }
                        }
                        final SubLObject var10_236 = module0141.$g1670$.currentBinding(var231);
                        final SubLObject var11_238 = module0141.$g1671$.currentBinding(var231);
                        final SubLObject var12_240 = module0141.$g1672$.currentBinding(var231);
                        final SubLObject var242 = module0141.$g1674$.currentBinding(var231);
                        final SubLObject var243 = module0137.$g1605$.currentBinding(var231);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic96$), var231);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic96$)), var231);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic96$)), var231);
                            module0141.$g1674$.bind((SubLObject)NIL, var231);
                            module0137.$g1605$.bind(module0137.f8955($ic96$), var231);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var230, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var10_237 = module0141.$g1677$.currentBinding(var231);
                                final SubLObject var11_239 = module0138.$g1619$.currentBinding(var231);
                                final SubLObject var12_241 = module0141.$g1674$.currentBinding(var231);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var231);
                                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var231);
                                    module0141.$g1674$.bind((SubLObject)NIL, var231);
                                    SubLObject var245;
                                    final SubLObject var244 = var245 = module0200.f12443(module0137.f8955($ic96$));
                                    SubLObject var246 = (SubLObject)NIL;
                                    var246 = var245.first();
                                    while (NIL != var245) {
                                        final SubLObject var10_238 = module0137.$g1605$.currentBinding(var231);
                                        final SubLObject var11_240 = module0141.$g1674$.currentBinding(var231);
                                        try {
                                            module0137.$g1605$.bind(var246, var231);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var231)) : module0141.$g1674$.getDynamicValue(var231)), var231);
                                            final SubLObject var247 = module0228.f15229(var237);
                                            if (NIL != module0138.f8992(var247)) {
                                                final SubLObject var248 = module0242.f15664(var247, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var248) {
                                                    final SubLObject var249 = module0245.f15834(var248, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var249) {
                                                        SubLObject var250;
                                                        for (var250 = module0066.f4838(module0067.f4891(var249)); NIL == module0066.f4841(var250); var250 = module0066.f4840(var250)) {
                                                            var231.resetMultipleValues();
                                                            final SubLObject var252_253 = module0066.f4839(var250);
                                                            final SubLObject var251 = var231.secondMultipleValue();
                                                            var231.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var252_253)) {
                                                                final SubLObject var10_239 = module0138.$g1623$.currentBinding(var231);
                                                                try {
                                                                    module0138.$g1623$.bind(var252_253, var231);
                                                                    SubLObject var251_256;
                                                                    for (var251_256 = module0066.f4838(module0067.f4891(var251)); NIL == module0066.f4841(var251_256); var251_256 = module0066.f4840(var251_256)) {
                                                                        var231.resetMultipleValues();
                                                                        final SubLObject var252 = module0066.f4839(var251_256);
                                                                        final SubLObject var253 = var231.secondMultipleValue();
                                                                        var231.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var252)) {
                                                                            final SubLObject var10_240 = module0138.$g1624$.currentBinding(var231);
                                                                            try {
                                                                                module0138.$g1624$.bind(var252, var231);
                                                                                final SubLObject var254 = var253;
                                                                                if (NIL != module0077.f5302(var254)) {
                                                                                    final SubLObject var255 = module0077.f5333(var254);
                                                                                    SubLObject var256;
                                                                                    SubLObject var257;
                                                                                    SubLObject var258;
                                                                                    for (var256 = module0032.f1741(var255), var257 = (SubLObject)NIL, var257 = module0032.f1742(var256, var255); NIL == module0032.f1744(var256, var257); var257 = module0032.f1743(var257)) {
                                                                                        var258 = module0032.f1745(var256, var257);
                                                                                        if (NIL != module0032.f1746(var257, var258) && NIL == module0249.f16059(var258, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var258, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var258, var239);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var254.isList()) {
                                                                                    SubLObject var259 = var254;
                                                                                    SubLObject var260 = (SubLObject)NIL;
                                                                                    var260 = var259.first();
                                                                                    while (NIL != var259) {
                                                                                        if (NIL == module0249.f16059(var260, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var260, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var260, var239);
                                                                                        }
                                                                                        var259 = var259.rest();
                                                                                        var260 = var259.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic97$, var254);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var10_240, var231);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var251_256);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var10_239, var231);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var250);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var247, (SubLObject)UNPROVIDED)) {
                                                SubLObject var23_266;
                                                final SubLObject var261 = var23_266 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var262 = (SubLObject)NIL;
                                                var262 = var23_266.first();
                                                while (NIL != var23_266) {
                                                    final SubLObject var10_241 = module0138.$g1625$.currentBinding(var231);
                                                    try {
                                                        module0138.$g1625$.bind(var262, var231);
                                                        final SubLObject var264;
                                                        final SubLObject var263 = var264 = Functions.funcall(var262, var247);
                                                        if (NIL != module0077.f5302(var264)) {
                                                            final SubLObject var265 = module0077.f5333(var264);
                                                            SubLObject var266;
                                                            SubLObject var267;
                                                            SubLObject var268;
                                                            for (var266 = module0032.f1741(var265), var267 = (SubLObject)NIL, var267 = module0032.f1742(var266, var265); NIL == module0032.f1744(var266, var267); var267 = module0032.f1743(var267)) {
                                                                var268 = module0032.f1745(var266, var267);
                                                                if (NIL != module0032.f1746(var267, var268) && NIL == module0249.f16059(var268, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var268, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var268, var239);
                                                                }
                                                            }
                                                        }
                                                        else if (var264.isList()) {
                                                            SubLObject var269 = var264;
                                                            SubLObject var270 = (SubLObject)NIL;
                                                            var270 = var269.first();
                                                            while (NIL != var269) {
                                                                if (NIL == module0249.f16059(var270, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var270, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var270, var239);
                                                                }
                                                                var269 = var269.rest();
                                                                var270 = var269.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic97$, var264);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var10_241, var231);
                                                    }
                                                    var23_266 = var23_266.rest();
                                                    var262 = var23_266.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var11_240, var231);
                                            module0137.$g1605$.rebind(var10_238, var231);
                                        }
                                        var245 = var245.rest();
                                        var246 = var245.first();
                                    }
                                    var237 = module0056.f4150(var239);
                                    final SubLObject var10_242 = module0137.$g1605$.currentBinding(var231);
                                    final SubLObject var11_241 = module0141.$g1674$.currentBinding(var231);
                                    final SubLObject var12_242 = module0138.$g1619$.currentBinding(var231);
                                    try {
                                        module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var231);
                                        module0141.$g1674$.bind((SubLObject)NIL, var231);
                                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var231);
                                        while (NIL != var237) {
                                            final SubLObject var271 = var237;
                                            final SubLObject var272 = module0172.f10921((SubLObject)ConsesLow.list($ic99$, var271));
                                            if (NIL != var232 && NIL != var272) {
                                                var232 = module0751.f46998((SubLObject)ConsesLow.list($ic82$, var232, var272));
                                            }
                                            else if (NIL != var272) {
                                                var232 = var272;
                                            }
                                            SubLObject var274;
                                            final SubLObject var273 = var274 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
                                            SubLObject var275 = (SubLObject)NIL;
                                            var275 = var274.first();
                                            while (NIL != var274) {
                                                final SubLObject var10_243 = module0137.$g1605$.currentBinding(var231);
                                                final SubLObject var11_242 = module0141.$g1674$.currentBinding(var231);
                                                try {
                                                    module0137.$g1605$.bind(var275, var231);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var231)) : module0141.$g1674$.getDynamicValue(var231)), var231);
                                                    final SubLObject var276 = module0228.f15229(var237);
                                                    if (NIL != module0138.f8992(var276)) {
                                                        final SubLObject var277 = module0242.f15664(var276, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var277) {
                                                            final SubLObject var278 = module0245.f15834(var277, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var278) {
                                                                SubLObject var279;
                                                                for (var279 = module0066.f4838(module0067.f4891(var278)); NIL == module0066.f4841(var279); var279 = module0066.f4840(var279)) {
                                                                    var231.resetMultipleValues();
                                                                    final SubLObject var252_254 = module0066.f4839(var279);
                                                                    final SubLObject var280 = var231.secondMultipleValue();
                                                                    var231.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var252_254)) {
                                                                        final SubLObject var10_244 = module0138.$g1623$.currentBinding(var231);
                                                                        try {
                                                                            module0138.$g1623$.bind(var252_254, var231);
                                                                            SubLObject var251_257;
                                                                            for (var251_257 = module0066.f4838(module0067.f4891(var280)); NIL == module0066.f4841(var251_257); var251_257 = module0066.f4840(var251_257)) {
                                                                                var231.resetMultipleValues();
                                                                                final SubLObject var281 = module0066.f4839(var251_257);
                                                                                final SubLObject var282 = var231.secondMultipleValue();
                                                                                var231.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var281)) {
                                                                                    final SubLObject var10_245 = module0138.$g1624$.currentBinding(var231);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var281, var231);
                                                                                        final SubLObject var283 = var282;
                                                                                        if (NIL != module0077.f5302(var283)) {
                                                                                            final SubLObject var284 = module0077.f5333(var283);
                                                                                            SubLObject var285;
                                                                                            SubLObject var286;
                                                                                            SubLObject var287;
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)NIL, var286 = module0032.f1742(var285, var284); NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (NIL != module0032.f1746(var286, var287) && NIL == module0249.f16059(var287, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var287, var239);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            SubLObject var288 = var283;
                                                                                            SubLObject var289 = (SubLObject)NIL;
                                                                                            var289 = var288.first();
                                                                                            while (NIL != var288) {
                                                                                                if (NIL == module0249.f16059(var289, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var289, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var289, var239);
                                                                                                }
                                                                                                var288 = var288.rest();
                                                                                                var289 = var288.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic97$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var10_245, var231);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var251_257);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var10_244, var231);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var279);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var276, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var23_267;
                                                        final SubLObject var290 = var23_267 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var291 = (SubLObject)NIL;
                                                        var291 = var23_267.first();
                                                        while (NIL != var23_267) {
                                                            final SubLObject var10_246 = module0138.$g1625$.currentBinding(var231);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var231);
                                                                final SubLObject var293;
                                                                final SubLObject var292 = var293 = Functions.funcall(var291, var276);
                                                                if (NIL != module0077.f5302(var293)) {
                                                                    final SubLObject var294 = module0077.f5333(var293);
                                                                    SubLObject var260;
                                                                    SubLObject var295;
                                                                    SubLObject var296;
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)NIL, var296 = module0032.f1742(var295, var294); NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var260 = module0032.f1745(var295, var296);
                                                                        if (NIL != module0032.f1746(var296, var260) && NIL == module0249.f16059(var260, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var260, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var260, var239);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    SubLObject var297 = var293;
                                                                    SubLObject var298 = (SubLObject)NIL;
                                                                    var298 = var297.first();
                                                                    while (NIL != var297) {
                                                                        if (NIL == module0249.f16059(var298, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var298, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var298, var239);
                                                                        }
                                                                        var297 = var297.rest();
                                                                        var298 = var297.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic97$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var10_246, var231);
                                                            }
                                                            var23_267 = var23_267.rest();
                                                            var291 = var23_267.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var11_242, var231);
                                                    module0137.$g1605$.rebind(var10_243, var231);
                                                }
                                                var274 = var274.rest();
                                                var275 = var274.first();
                                            }
                                            var237 = module0056.f4150(var239);
                                        }
                                    }
                                    finally {
                                        module0138.$g1619$.rebind(var12_242, var231);
                                        module0141.$g1674$.rebind(var11_241, var231);
                                        module0137.$g1605$.rebind(var10_242, var231);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var12_241, var231);
                                    module0138.$g1619$.rebind(var11_239, var231);
                                    module0141.$g1677$.rebind(var10_237, var231);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic100$, var230, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var243, var231);
                            module0141.$g1674$.rebind(var242, var231);
                            module0141.$g1672$.rebind(var12_240, var231);
                            module0141.$g1671$.rebind(var11_238, var231);
                            module0141.$g1670$.rebind(var10_236, var231);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var11_237, var231);
                        module0141.$g1714$.rebind(var10_235, var231);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var231));
                }
                finally {
                    module0139.$g1635$.rebind(var10_234, var231);
                }
            }
            finally {
                module0147.$g2096$.rebind(var236, var231);
                module0147.$g2094$.rebind(var235, var231);
                module0147.$g2095$.rebind(var234, var231);
            }
        }
        return var232;
    }
    
    public static SubLObject f49802(SubLObject var230, SubLObject var155) {
        if (var230 == UNPROVIDED) {
            var230 = module0579.$g4283$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var231 = SubLProcess.currentSubLThread();
        final SubLObject var232 = module0034.$g879$.getDynamicValue(var231);
        SubLObject var233 = (SubLObject)NIL;
        if (NIL == var232) {
            return f49803(var230, var155);
        }
        var233 = module0034.f1857(var232, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
        if (NIL == var233) {
            var233 = module0034.f1807(module0034.f1842(var232), (SubLObject)$ic83$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var232, (SubLObject)$ic83$, var233);
        }
        final SubLObject var234 = module0034.f1782(var230, var155);
        final SubLObject var235 = module0034.f1814(var233, var234, (SubLObject)UNPROVIDED);
        if (var235 != $ic27$) {
            SubLObject var236 = var235;
            SubLObject var237 = (SubLObject)NIL;
            var237 = var236.first();
            while (NIL != var236) {
                SubLObject var238 = var237.first();
                final SubLObject var239 = conses_high.second(var237);
                if (var230.eql(var238.first())) {
                    var238 = var238.rest();
                    if (NIL != var238 && NIL == var238.rest() && var155.eql(var238.first())) {
                        return module0034.f1959(var239);
                    }
                }
                var236 = var236.rest();
                var237 = var236.first();
            }
        }
        final SubLObject var240 = Values.arg2(var231.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49803(var230, var155)));
        module0034.f1836(var233, var234, var235, var240, (SubLObject)ConsesLow.list(var230, var155));
        return module0034.f1959(var240);
    }
    
    public static SubLObject f49747() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = module0579.$g4262$.getDynamicValue(var5);
        if (NIL != module0761.f48134()) {
            final SubLObject var7 = f49804(module0579.$g4283$.getDynamicValue(var5), (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                var6 = module0751.f46998((SubLObject)ConsesLow.list($ic82$, var6, var7));
            }
        }
        return var6;
    }
    
    public static SubLObject f49805(SubLObject var230, SubLObject var155) {
        if (var230 == UNPROVIDED) {
            var230 = module0579.$g4283$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var231 = SubLProcess.currentSubLThread();
        SubLObject var232 = module0172.f10921((SubLObject)ConsesLow.list($ic102$, var230));
        if (NIL == var232 && NIL != module0212.f13762(var230)) {
            final SubLObject var233 = module0147.f9540(var155);
            final SubLObject var234 = module0147.$g2095$.currentBinding(var231);
            final SubLObject var235 = module0147.$g2094$.currentBinding(var231);
            final SubLObject var236 = module0147.$g2096$.currentBinding(var231);
            try {
                module0147.$g2095$.bind(module0147.f9545(var233), var231);
                module0147.$g2094$.bind(module0147.f9546(var233), var231);
                module0147.$g2096$.bind(module0147.f9549(var233), var231);
                SubLObject var237 = var230;
                final SubLObject var238 = (SubLObject)$ic87$;
                final SubLObject var239 = module0056.f4145(var238);
                final SubLObject var10_291 = module0139.$g1635$.currentBinding(var231);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var231);
                    final SubLObject var240 = (SubLObject)NIL;
                    final SubLObject var10_292 = module0141.$g1714$.currentBinding(var231);
                    final SubLObject var11_293 = module0141.$g1715$.currentBinding(var231);
                    try {
                        module0141.$g1714$.bind((NIL != var240) ? var240 : module0141.f9283(), var231);
                        module0141.$g1715$.bind((SubLObject)((NIL != var240) ? $ic88$ : module0141.$g1715$.getDynamicValue(var231)), var231);
                        if (NIL != var240 && NIL != module0136.f8864() && NIL == module0141.f9279(var240)) {
                            final SubLObject var241 = module0136.$g1591$.getDynamicValue(var231);
                            if (var241.eql((SubLObject)$ic89$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic90$, var240, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var241.eql((SubLObject)$ic92$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic93$, (SubLObject)$ic90$, var240, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var241.eql((SubLObject)$ic94$)) {
                                Errors.warn((SubLObject)$ic90$, var240, (SubLObject)$ic91$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic95$, module0136.$g1591$.getDynamicValue(var231));
                                Errors.cerror((SubLObject)$ic93$, (SubLObject)$ic90$, var240, (SubLObject)$ic91$);
                            }
                        }
                        final SubLObject var10_293 = module0141.$g1670$.currentBinding(var231);
                        final SubLObject var11_294 = module0141.$g1671$.currentBinding(var231);
                        final SubLObject var12_296 = module0141.$g1672$.currentBinding(var231);
                        final SubLObject var242 = module0141.$g1674$.currentBinding(var231);
                        final SubLObject var243 = module0137.$g1605$.currentBinding(var231);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic96$), var231);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic96$)), var231);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic96$)), var231);
                            module0141.$g1674$.bind((SubLObject)NIL, var231);
                            module0137.$g1605$.bind(module0137.f8955($ic96$), var231);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var230, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var10_294 = module0141.$g1677$.currentBinding(var231);
                                final SubLObject var11_295 = module0138.$g1619$.currentBinding(var231);
                                final SubLObject var12_297 = module0141.$g1674$.currentBinding(var231);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var231);
                                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var231);
                                    module0141.$g1674$.bind((SubLObject)NIL, var231);
                                    SubLObject var245;
                                    final SubLObject var244 = var245 = module0200.f12443(module0137.f8955($ic96$));
                                    SubLObject var246 = (SubLObject)NIL;
                                    var246 = var245.first();
                                    while (NIL != var245) {
                                        final SubLObject var10_295 = module0137.$g1605$.currentBinding(var231);
                                        final SubLObject var11_296 = module0141.$g1674$.currentBinding(var231);
                                        try {
                                            module0137.$g1605$.bind(var246, var231);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var231)) : module0141.$g1674$.getDynamicValue(var231)), var231);
                                            final SubLObject var247 = module0228.f15229(var237);
                                            if (NIL != module0138.f8992(var247)) {
                                                final SubLObject var248 = module0242.f15664(var247, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var248) {
                                                    final SubLObject var249 = module0245.f15834(var248, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var249) {
                                                        SubLObject var250;
                                                        for (var250 = module0066.f4838(module0067.f4891(var249)); NIL == module0066.f4841(var250); var250 = module0066.f4840(var250)) {
                                                            var231.resetMultipleValues();
                                                            final SubLObject var252_302 = module0066.f4839(var250);
                                                            final SubLObject var251 = var231.secondMultipleValue();
                                                            var231.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var252_302)) {
                                                                final SubLObject var10_296 = module0138.$g1623$.currentBinding(var231);
                                                                try {
                                                                    module0138.$g1623$.bind(var252_302, var231);
                                                                    SubLObject var251_304;
                                                                    for (var251_304 = module0066.f4838(module0067.f4891(var251)); NIL == module0066.f4841(var251_304); var251_304 = module0066.f4840(var251_304)) {
                                                                        var231.resetMultipleValues();
                                                                        final SubLObject var252 = module0066.f4839(var251_304);
                                                                        final SubLObject var253 = var231.secondMultipleValue();
                                                                        var231.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var252)) {
                                                                            final SubLObject var10_297 = module0138.$g1624$.currentBinding(var231);
                                                                            try {
                                                                                module0138.$g1624$.bind(var252, var231);
                                                                                final SubLObject var254 = var253;
                                                                                if (NIL != module0077.f5302(var254)) {
                                                                                    final SubLObject var255 = module0077.f5333(var254);
                                                                                    SubLObject var256;
                                                                                    SubLObject var257;
                                                                                    SubLObject var258;
                                                                                    for (var256 = module0032.f1741(var255), var257 = (SubLObject)NIL, var257 = module0032.f1742(var256, var255); NIL == module0032.f1744(var256, var257); var257 = module0032.f1743(var257)) {
                                                                                        var258 = module0032.f1745(var256, var257);
                                                                                        if (NIL != module0032.f1746(var257, var258) && NIL == module0249.f16059(var258, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var258, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var258, var239);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var254.isList()) {
                                                                                    SubLObject var259 = var254;
                                                                                    SubLObject var260 = (SubLObject)NIL;
                                                                                    var260 = var259.first();
                                                                                    while (NIL != var259) {
                                                                                        if (NIL == module0249.f16059(var260, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var260, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var260, var239);
                                                                                        }
                                                                                        var259 = var259.rest();
                                                                                        var260 = var259.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic97$, var254);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var10_297, var231);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var251_304);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var10_296, var231);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var250);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var247, (SubLObject)UNPROVIDED)) {
                                                SubLObject var23_306;
                                                final SubLObject var261 = var23_306 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var262 = (SubLObject)NIL;
                                                var262 = var23_306.first();
                                                while (NIL != var23_306) {
                                                    final SubLObject var10_298 = module0138.$g1625$.currentBinding(var231);
                                                    try {
                                                        module0138.$g1625$.bind(var262, var231);
                                                        final SubLObject var264;
                                                        final SubLObject var263 = var264 = Functions.funcall(var262, var247);
                                                        if (NIL != module0077.f5302(var264)) {
                                                            final SubLObject var265 = module0077.f5333(var264);
                                                            SubLObject var266;
                                                            SubLObject var267;
                                                            SubLObject var268;
                                                            for (var266 = module0032.f1741(var265), var267 = (SubLObject)NIL, var267 = module0032.f1742(var266, var265); NIL == module0032.f1744(var266, var267); var267 = module0032.f1743(var267)) {
                                                                var268 = module0032.f1745(var266, var267);
                                                                if (NIL != module0032.f1746(var267, var268) && NIL == module0249.f16059(var268, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var268, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var268, var239);
                                                                }
                                                            }
                                                        }
                                                        else if (var264.isList()) {
                                                            SubLObject var269 = var264;
                                                            SubLObject var270 = (SubLObject)NIL;
                                                            var270 = var269.first();
                                                            while (NIL != var269) {
                                                                if (NIL == module0249.f16059(var270, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var270, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var270, var239);
                                                                }
                                                                var269 = var269.rest();
                                                                var270 = var269.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic97$, var264);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var10_298, var231);
                                                    }
                                                    var23_306 = var23_306.rest();
                                                    var262 = var23_306.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var11_296, var231);
                                            module0137.$g1605$.rebind(var10_295, var231);
                                        }
                                        var245 = var245.rest();
                                        var246 = var245.first();
                                    }
                                    var237 = module0056.f4150(var239);
                                    final SubLObject var10_299 = module0137.$g1605$.currentBinding(var231);
                                    final SubLObject var11_297 = module0141.$g1674$.currentBinding(var231);
                                    final SubLObject var12_298 = module0138.$g1619$.currentBinding(var231);
                                    try {
                                        module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var231);
                                        module0141.$g1674$.bind((SubLObject)NIL, var231);
                                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var231);
                                        while (NIL != var237) {
                                            final SubLObject var271 = var237;
                                            final SubLObject var272 = module0172.f10921((SubLObject)ConsesLow.list($ic103$, var271));
                                            if (NIL != var232 && NIL != var272) {
                                                var232 = module0751.f46998((SubLObject)ConsesLow.list($ic82$, var232, var272));
                                            }
                                            else if (NIL != var272) {
                                                var232 = var272;
                                            }
                                            SubLObject var274;
                                            final SubLObject var273 = var274 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
                                            SubLObject var275 = (SubLObject)NIL;
                                            var275 = var274.first();
                                            while (NIL != var274) {
                                                final SubLObject var10_300 = module0137.$g1605$.currentBinding(var231);
                                                final SubLObject var11_298 = module0141.$g1674$.currentBinding(var231);
                                                try {
                                                    module0137.$g1605$.bind(var275, var231);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var231)) : module0141.$g1674$.getDynamicValue(var231)), var231);
                                                    final SubLObject var276 = module0228.f15229(var237);
                                                    if (NIL != module0138.f8992(var276)) {
                                                        final SubLObject var277 = module0242.f15664(var276, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var277) {
                                                            final SubLObject var278 = module0245.f15834(var277, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var278) {
                                                                SubLObject var279;
                                                                for (var279 = module0066.f4838(module0067.f4891(var278)); NIL == module0066.f4841(var279); var279 = module0066.f4840(var279)) {
                                                                    var231.resetMultipleValues();
                                                                    final SubLObject var252_303 = module0066.f4839(var279);
                                                                    final SubLObject var280 = var231.secondMultipleValue();
                                                                    var231.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var252_303)) {
                                                                        final SubLObject var10_301 = module0138.$g1623$.currentBinding(var231);
                                                                        try {
                                                                            module0138.$g1623$.bind(var252_303, var231);
                                                                            SubLObject var251_305;
                                                                            for (var251_305 = module0066.f4838(module0067.f4891(var280)); NIL == module0066.f4841(var251_305); var251_305 = module0066.f4840(var251_305)) {
                                                                                var231.resetMultipleValues();
                                                                                final SubLObject var281 = module0066.f4839(var251_305);
                                                                                final SubLObject var282 = var231.secondMultipleValue();
                                                                                var231.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var281)) {
                                                                                    final SubLObject var10_302 = module0138.$g1624$.currentBinding(var231);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var281, var231);
                                                                                        final SubLObject var283 = var282;
                                                                                        if (NIL != module0077.f5302(var283)) {
                                                                                            final SubLObject var284 = module0077.f5333(var283);
                                                                                            SubLObject var285;
                                                                                            SubLObject var286;
                                                                                            SubLObject var287;
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)NIL, var286 = module0032.f1742(var285, var284); NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (NIL != module0032.f1746(var286, var287) && NIL == module0249.f16059(var287, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var287, var239);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            SubLObject var288 = var283;
                                                                                            SubLObject var289 = (SubLObject)NIL;
                                                                                            var289 = var288.first();
                                                                                            while (NIL != var288) {
                                                                                                if (NIL == module0249.f16059(var289, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var289, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var289, var239);
                                                                                                }
                                                                                                var288 = var288.rest();
                                                                                                var289 = var288.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic97$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var10_302, var231);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var251_305);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var10_301, var231);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var279);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var276, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var23_307;
                                                        final SubLObject var290 = var23_307 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var231), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var291 = (SubLObject)NIL;
                                                        var291 = var23_307.first();
                                                        while (NIL != var23_307) {
                                                            final SubLObject var10_303 = module0138.$g1625$.currentBinding(var231);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var231);
                                                                final SubLObject var293;
                                                                final SubLObject var292 = var293 = Functions.funcall(var291, var276);
                                                                if (NIL != module0077.f5302(var293)) {
                                                                    final SubLObject var294 = module0077.f5333(var293);
                                                                    SubLObject var260;
                                                                    SubLObject var295;
                                                                    SubLObject var296;
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)NIL, var296 = module0032.f1742(var295, var294); NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var260 = module0032.f1745(var295, var296);
                                                                        if (NIL != module0032.f1746(var296, var260) && NIL == module0249.f16059(var260, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var260, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var260, var239);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    SubLObject var297 = var293;
                                                                    SubLObject var298 = (SubLObject)NIL;
                                                                    var298 = var297.first();
                                                                    while (NIL != var297) {
                                                                        if (NIL == module0249.f16059(var298, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var298, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var298, var239);
                                                                        }
                                                                        var297 = var297.rest();
                                                                        var298 = var297.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic97$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var10_303, var231);
                                                            }
                                                            var23_307 = var23_307.rest();
                                                            var291 = var23_307.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var11_298, var231);
                                                    module0137.$g1605$.rebind(var10_300, var231);
                                                }
                                                var274 = var274.rest();
                                                var275 = var274.first();
                                            }
                                            var237 = module0056.f4150(var239);
                                        }
                                    }
                                    finally {
                                        module0138.$g1619$.rebind(var12_298, var231);
                                        module0141.$g1674$.rebind(var11_297, var231);
                                        module0137.$g1605$.rebind(var10_299, var231);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var12_297, var231);
                                    module0138.$g1619$.rebind(var11_295, var231);
                                    module0141.$g1677$.rebind(var10_294, var231);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic100$, var230, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var243, var231);
                            module0141.$g1674$.rebind(var242, var231);
                            module0141.$g1672$.rebind(var12_296, var231);
                            module0141.$g1671$.rebind(var11_294, var231);
                            module0141.$g1670$.rebind(var10_293, var231);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var11_293, var231);
                        module0141.$g1714$.rebind(var10_292, var231);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var231));
                }
                finally {
                    module0139.$g1635$.rebind(var10_291, var231);
                }
            }
            finally {
                module0147.$g2096$.rebind(var236, var231);
                module0147.$g2094$.rebind(var235, var231);
                module0147.$g2095$.rebind(var234, var231);
            }
        }
        return var232;
    }
    
    public static SubLObject f49804(SubLObject var230, SubLObject var155) {
        if (var230 == UNPROVIDED) {
            var230 = module0579.$g4283$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var231 = SubLProcess.currentSubLThread();
        final SubLObject var232 = module0034.$g879$.getDynamicValue(var231);
        SubLObject var233 = (SubLObject)NIL;
        if (NIL == var232) {
            return f49805(var230, var155);
        }
        var233 = module0034.f1857(var232, (SubLObject)$ic101$, (SubLObject)UNPROVIDED);
        if (NIL == var233) {
            var233 = module0034.f1807(module0034.f1842(var232), (SubLObject)$ic101$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var232, (SubLObject)$ic101$, var233);
        }
        final SubLObject var234 = module0034.f1782(var230, var155);
        final SubLObject var235 = module0034.f1814(var233, var234, (SubLObject)UNPROVIDED);
        if (var235 != $ic27$) {
            SubLObject var236 = var235;
            SubLObject var237 = (SubLObject)NIL;
            var237 = var236.first();
            while (NIL != var236) {
                SubLObject var238 = var237.first();
                final SubLObject var239 = conses_high.second(var237);
                if (var230.eql(var238.first())) {
                    var238 = var238.rest();
                    if (NIL != var238 && NIL == var238.rest() && var155.eql(var238.first())) {
                        return module0034.f1959(var239);
                    }
                }
                var236 = var236.rest();
                var237 = var236.first();
            }
        }
        final SubLObject var240 = Values.arg2(var231.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49805(var230, var155)));
        module0034.f1836(var233, var234, var235, var240, (SubLObject)ConsesLow.list(var230, var155));
        return module0034.f1959(var240);
    }
    
    public static SubLObject f49800(final SubLObject var320) {
        if (NIL == assertion_handles_oc.f11035(var320) || NIL == module0178.f11290(var320)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0220.f14547(var320, $ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49787(final SubLObject var320, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var320) && NIL != f49806(var320, var155));
    }
    
    public static SubLObject f49806(final SubLObject var168, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        if (NIL != f49801(module0191.f11976(var168), var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49807(var168, (SubLObject)$ic105$, var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49719(module0178.f11303(var168), var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49808(var168, var155)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49808(final SubLObject var168, final SubLObject var155) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        if (NIL != module0178.f11375(var168)) {
            return (SubLObject)NIL;
        }
        SubLObject var170 = (SubLObject)NIL;
        final SubLObject var171 = module0205.f13207(var168, (SubLObject)$ic106$);
        SubLObject var172;
        SubLObject var173;
        SubLObject var322_325;
        SubLObject var323_326;
        SubLObject var174;
        for (var172 = (SubLObject)NIL, var172 = var171; NIL == var170 && NIL != var172; var172 = var172.rest()) {
            var173 = var172.first();
            if (NIL != module0167.f10813(var173)) {
                var322_325 = module0205.f13207(var173, (SubLObject)$ic106$);
                for (var323_326 = (SubLObject)NIL, var323_326 = var322_325; NIL == var170 && NIL != var323_326; var323_326 = var323_326.rest()) {
                    var174 = var323_326.first();
                    if (NIL != module0004.f104(var174, module0205.f13207(var168, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                        var170 = (SubLObject)T;
                    }
                }
            }
        }
        final SubLObject var175 = module0147.f9540(var155);
        final SubLObject var176 = module0147.$g2095$.currentBinding(var169);
        final SubLObject var177 = module0147.$g2094$.currentBinding(var169);
        final SubLObject var178 = module0147.$g2096$.currentBinding(var169);
        try {
            module0147.$g2095$.bind(module0147.f9545(var175), var169);
            module0147.$g2094$.bind(module0147.f9546(var175), var169);
            module0147.$g2096$.bind(module0147.f9549(var175), var169);
            SubLObject var179;
            SubLObject var180;
            SubLObject var323_327;
            SubLObject var181;
            for (var179 = (SubLObject)NIL, var179 = module0178.f11299(var168); NIL == var170 && NIL != var179; var179 = var179.rest()) {
                var180 = var179.first();
                if (NIL != deduction_handles_oc.f11659(var180)) {
                    for (var323_327 = (SubLObject)NIL, var323_327 = module0188.f11770(var180); NIL == var170 && NIL != var323_327; var323_327 = var323_327.rest()) {
                        var181 = var323_327.first();
                        if (NIL != assertion_handles_oc.f11035(var181) && NIL != module0220.f14544(var181, $ic107$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var170 = (SubLObject)T;
                        }
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var178, var169);
            module0147.$g2094$.rebind(var177, var169);
            module0147.$g2095$.rebind(var176, var169);
        }
        return var170;
    }
    
    public static SubLObject f49801(final SubLObject var320, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        if (NIL == module0161.f10481(var320)) {
            return (SubLObject)NIL;
        }
        final SubLObject var321 = module0161.f10557(var320);
        if (NIL != module0222.f14640($ic108$, var321, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f49807(var321, (SubLObject)$ic109$, var155)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49795(final SubLObject var26, final SubLObject var331, final SubLObject var155) {
        final SubLThread var332 = SubLProcess.currentSubLThread();
        if (NIL != $g6217$.getDynamicValue(var332)) {
            return (SubLObject)T;
        }
        if (NIL != module0373.f26173(var26)) {
            return (SubLObject)T;
        }
        if (NIL != f49809(var26)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49719(var331, var155)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49726(var331, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49809(final SubLObject var26) {
        return module0004.f104(var26, f49810(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49810() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)(module0579.$g4344$.getDynamicValue(var5).isList() ? module0579.$g4344$.getDynamicValue(var5) : NIL);
    }
    
    public static SubLObject f49811(final SubLObject var332, final SubLObject var333) {
        SubLObject var335;
        final SubLObject var334 = var335 = var332.rest();
        SubLObject var336 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic110$);
        var336 = var335.first();
        final SubLObject var337;
        var335 = (var337 = var335.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic111$, (SubLObject)$ic112$, (SubLObject)ConsesLow.list((SubLObject)$ic113$, (SubLObject)ConsesLow.list((SubLObject)$ic114$, (SubLObject)$ic115$, var336), reader.bq_cons((SubLObject)$ic116$, ConsesLow.append(var337, (SubLObject)NIL))));
    }
    
    public static SubLObject f49812(final SubLObject var332, final SubLObject var333) {
        final SubLObject var334 = var332.rest();
        final SubLObject var336;
        final SubLObject var335 = var336 = var334;
        return (SubLObject)ConsesLow.list((SubLObject)$ic111$, (SubLObject)$ic112$, (SubLObject)ConsesLow.list((SubLObject)$ic113$, (SubLObject)$ic117$, reader.bq_cons((SubLObject)$ic116$, ConsesLow.append(var336, (SubLObject)NIL))));
    }
    
    public static SubLObject f49771(final SubLObject var178, final SubLObject var29, final SubLObject var35, SubLObject var177) {
        if (var177 == UNPROVIDED) {
            var177 = (SubLObject)$ic57$;
        }
        final SubLThread var179 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4309$.getDynamicValue(var179)) {
            final SubLObject var180 = Sequences.cconcatenate((SubLObject)$ic118$, var35);
            module0642.f39020(module0016.$g545$.getGlobalValue());
            module0642.f39020(module0016.$g546$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic33$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0016.$g547$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var181 = module0015.$g533$.currentBinding(var179);
            try {
                module0015.$g533$.bind((SubLObject)T, var179);
                module0642.f39028((SubLObject)UNPROVIDED);
                module0016.f886(var180);
                module0016.f889(module0016.$g555$.getGlobalValue());
                module0642.f39020((SubLObject)$ic35$);
                module0016.f890();
                module0016.f887();
                module0642.f39028((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var181, var179);
            }
            module0642.f39020(module0016.$g548$.getGlobalValue());
            module0642.f39028((SubLObject)UNPROVIDED);
            module0016.f923(var180, var177);
            module0016.f908(var180, (SubLObject)$ic37$, (SubLObject)$ic38$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var180) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var180);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var181 = module0015.$g533$.currentBinding(var179);
            try {
                module0015.$g533$.bind((SubLObject)T, var179);
                if (NIL != module0035.f1997(var178)) {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic119$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_340 = module0015.$g533$.currentBinding(var179);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var179);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_341 = module0015.$g533$.currentBinding(var179);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var179);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic120$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_342 = module0015.$g533$.currentBinding(var179);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var179);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_342, var179);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_343 = module0015.$g533$.currentBinding(var179);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var179);
                                final SubLObject var182 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic121$, var35);
                                f49676(var178.first(), var29, var182);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_343, var179);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_341, var179);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_340, var179);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                else {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic119$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_344 = module0015.$g533$.currentBinding(var179);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var179);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_345 = module0015.$g533$.currentBinding(var179);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var179);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic120$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_346 = module0015.$g533$.currentBinding(var179);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var179);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_346, var179);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_347 = module0015.$g533$.currentBinding(var179);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var179);
                                SubLObject var183 = (SubLObject)NIL;
                                SubLObject var184 = (SubLObject)NIL;
                                SubLObject var185 = (SubLObject)NIL;
                                var183 = var178;
                                var184 = var183.first();
                                for (var185 = (SubLObject)ZERO_INTEGER; NIL != var183; var183 = var183.rest(), var184 = var183.first(), var185 = Numbers.add((SubLObject)ONE_INTEGER, var185)) {
                                    final SubLObject var186 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic122$, var35, var185);
                                    f49676(var184, var29, var186);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var10_347, var179);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_345, var179);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_344, var179);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var181, var179);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic119$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var187 = module0015.$g533$.currentBinding(var179);
        try {
            module0015.$g533$.bind((SubLObject)T, var179);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_348 = module0015.$g533$.currentBinding(var179);
            try {
                module0015.$g533$.bind((SubLObject)T, var179);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic120$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_349 = module0015.$g533$.currentBinding(var179);
                try {
                    module0015.$g533$.bind((SubLObject)T, var179);
                }
                finally {
                    module0015.$g533$.rebind(var10_349, var179);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_350 = module0015.$g533$.currentBinding(var179);
                try {
                    module0015.$g533$.bind((SubLObject)T, var179);
                    module0642.f39021(var177);
                    module0642.f39020(module0015.$g264$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_351 = module0015.$g533$.currentBinding(var179);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var179);
                        SubLObject var188 = (SubLObject)NIL;
                        SubLObject var189 = (SubLObject)NIL;
                        SubLObject var190 = (SubLObject)NIL;
                        var188 = var178;
                        var189 = var188.first();
                        for (var190 = (SubLObject)ZERO_INTEGER; NIL != var188; var188 = var188.rest(), var189 = var188.first(), var190 = Numbers.add((SubLObject)ONE_INTEGER, var190)) {
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_352 = module0015.$g533$.currentBinding(var179);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var179);
                                f49676(var189, var29, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_352, var179);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var10_351, var179);
                    }
                    module0642.f39020(module0015.$g265$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_350, var179);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var10_348, var179);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var187, var179);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49813(final SubLObject var354) {
        if (NIL != module0004.f106(var354)) {
            $g6218$.setGlobalValue(var354);
        }
        return $g6218$.getGlobalValue();
    }
    
    public static SubLObject f49784(final SubLObject var58, SubLObject var35, SubLObject var355) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)$ic123$;
        }
        if (var355 == UNPROVIDED) {
            var355 = (SubLObject)$ic124$;
        }
        final SubLThread var356 = SubLProcess.currentSubLThread();
        if (NIL != module0191.f11950(var58)) {
            final SubLObject var357 = module0579.$g4262$.currentBinding(var356);
            try {
                module0579.$g4262$.bind(module0767.f48872(module0191.f11976(var58), (SubLObject)UNPROVIDED), var356);
                if (NIL != assertion_handles_oc.f11035(var58)) {
                    final SubLObject var10_356 = module0579.$g4238$.currentBinding(var356);
                    try {
                        module0579.$g4238$.bind((SubLObject)makeBoolean(NIL != module0579.$g4238$.getDynamicValue(var356) || NIL != module0178.f11290(var58)), var356);
                        f49686(var58);
                        if (NIL != module0178.f11375(var58)) {
                            f49814(var58, var35);
                        }
                    }
                    finally {
                        module0579.$g4238$.rebind(var10_356, var356);
                    }
                }
                else if (var355.isList() && NIL != conses_high.member(var58, var355, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    f49789(var58);
                }
                else if (NIL != module0579.$g4357$.getDynamicValue(var356) && var355 == $ic124$ && NIL != f49815(var58)) {
                    f49789(var58);
                }
                else {
                    final SubLObject var358 = f49759(var58, (SubLObject)UNPROVIDED);
                    final SubLObject var359 = module0751.f46848((SubLObject)ConsesLow.list($ic125$, module0205.f13132(var358)), module0579.$g4262$.getDynamicValue(var356), (SubLObject)UNPROVIDED);
                    final SubLObject var360 = (SubLObject)((NIL != module0579.$g4345$.getDynamicValue(var356) && $g6219$.getDynamicValue(var356).numL($g6218$.getGlobalValue())) ? f49816(var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                    if (NIL != var359) {
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        f49684(var358, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    else {
                        f49684(var358, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var360) {
                        final SubLObject var10_357 = $g6219$.currentBinding(var356);
                        try {
                            $g6219$.bind(module0048.f_1X($g6219$.getDynamicValue(var356)), var356);
                            f49746(var360, var35, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            $g6219$.rebind(var10_357, var356);
                        }
                    }
                    else if (NIL != f49817(var58)) {
                        final SubLObject var361 = Sequences.cconcatenate(var35, (SubLObject)$ic126$);
                        f49725(var361);
                    }
                }
                f49739(var58);
            }
            finally {
                module0579.$g4262$.rebind(var357, var356);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49789(final SubLObject var58) {
        final SubLObject var59 = f49759(var58, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g232$.getGlobalValue());
        if (NIL != module0202.f12590(var59)) {
            f49684(var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39019((SubLObject)$ic127$);
        }
        module0642.f39020(module0015.$g233$.getGlobalValue());
        return var58;
    }
    
    public static SubLObject f49746(final SubLObject var69, SubLObject var35, SubLObject var177) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var177 == UNPROVIDED) {
            var177 = (SubLObject)$ic36$;
        }
        final SubLThread var178 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4309$.getDynamicValue(var178)) {
            final SubLObject var179 = Sequences.cconcatenate((SubLObject)$ic128$, var35);
            module0642.f39020(module0016.$g545$.getGlobalValue());
            module0642.f39020(module0016.$g546$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic33$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0016.$g547$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var180 = module0015.$g533$.currentBinding(var178);
            try {
                module0015.$g533$.bind((SubLObject)T, var178);
                module0642.f39028((SubLObject)UNPROVIDED);
                module0016.f886(var179);
                module0016.f889(module0016.$g555$.getGlobalValue());
                module0642.f39020((SubLObject)$ic35$);
                module0016.f890();
                module0016.f887();
                module0642.f39028((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var180, var178);
            }
            module0642.f39020(module0016.$g548$.getGlobalValue());
            module0642.f39028((SubLObject)UNPROVIDED);
            module0016.f923(var179, var177);
            module0016.f908(var179, (SubLObject)$ic37$, (SubLObject)$ic38$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var179) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var179);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var180 = module0015.$g533$.currentBinding(var178);
            try {
                module0015.$g533$.bind((SubLObject)T, var178);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_361 = module0015.$g533$.currentBinding(var178);
                try {
                    module0015.$g533$.bind((SubLObject)T, var178);
                    SubLObject var181 = (SubLObject)NIL;
                    SubLObject var182 = (SubLObject)NIL;
                    SubLObject var183 = (SubLObject)NIL;
                    var181 = var69;
                    var182 = var181.first();
                    for (var183 = (SubLObject)ZERO_INTEGER; NIL != var181; var181 = var181.rest(), var182 = var181.first(), var183 = Numbers.add((SubLObject)ONE_INTEGER, var183)) {
                        module0642.f39020(module0015.$g275$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_362 = module0015.$g533$.currentBinding(var178);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var178);
                            final SubLObject var184 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic129$, var35, var183);
                            f49784(var182, var184, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_362, var178);
                        }
                        module0642.f39020(module0015.$g276$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var10_361, var178);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var180, var178);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic119$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var185 = module0015.$g533$.currentBinding(var178);
            try {
                module0015.$g533$.bind((SubLObject)T, var178);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_363 = module0015.$g533$.currentBinding(var178);
                try {
                    module0015.$g533$.bind((SubLObject)T, var178);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic120$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_364 = module0015.$g533$.currentBinding(var178);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var178);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_364, var178);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_365 = module0015.$g533$.currentBinding(var178);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var178);
                        f49785(var177, var69);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_365, var178);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_363, var178);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var185, var178);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49785(final SubLObject var177, final SubLObject var97) {
        final SubLThread var178 = SubLProcess.currentSubLThread();
        module0642.f39021(var177);
        module0642.f39020(module0015.$g264$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var179 = module0015.$g533$.currentBinding(var178);
        try {
            module0015.$g533$.bind((SubLObject)T, var178);
            SubLObject var180 = (SubLObject)NIL;
            SubLObject var181 = (SubLObject)NIL;
            SubLObject var182 = (SubLObject)NIL;
            var180 = var97;
            var181 = var180.first();
            for (var182 = (SubLObject)ZERO_INTEGER; NIL != var180; var180 = var180.rest(), var181 = var180.first(), var182 = Numbers.add((SubLObject)ONE_INTEGER, var182)) {
                module0642.f39020(module0015.$g275$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_368 = module0015.$g533$.currentBinding(var178);
                try {
                    module0015.$g533$.bind((SubLObject)T, var178);
                    f49784(var181, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var10_368, var178);
                }
                module0642.f39020(module0015.$g276$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var179, var178);
        }
        module0642.f39020(module0015.$g265$.getGlobalValue());
        return var97;
    }
    
    public static SubLObject f49814(final SubLObject var168, final SubLObject var35) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4346$.getDynamicValue(var169)) {
            if (NIL != f49818(var168)) {
                if (NIL != module0579.$g4309$.getDynamicValue(var169)) {
                    final SubLObject var170 = Sequences.cconcatenate((SubLObject)$ic130$, var35);
                    module0642.f39020(module0016.$g545$.getGlobalValue());
                    module0642.f39020(module0016.$g546$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0016.$g547$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    SubLObject var171 = module0015.$g533$.currentBinding(var169);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var169);
                        module0642.f39028((SubLObject)UNPROVIDED);
                        module0016.f886(var170);
                        module0016.f889(module0016.$g555$.getGlobalValue());
                        module0642.f39020((SubLObject)$ic35$);
                        module0016.f890();
                        module0016.f887();
                        module0642.f39028((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var171, var169);
                    }
                    module0642.f39020(module0016.$g548$.getGlobalValue());
                    module0642.f39028((SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0016.f923(var170, (SubLObject)$ic36$);
                    module0016.f908(var170, (SubLObject)$ic37$, (SubLObject)$ic38$);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    if (NIL != var170) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var170);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    var171 = module0015.$g533$.currentBinding(var169);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var169);
                        module0642.f39020(module0015.$g264$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_369 = module0015.$g533$.currentBinding(var169);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var169);
                            module0642.f39020(module0015.$g275$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_370 = module0015.$g533$.currentBinding(var169);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var169);
                                f49819(var168);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_370, var169);
                            }
                            module0642.f39020(module0015.$g276$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_369, var169);
                        }
                        module0642.f39020(module0015.$g265$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var171, var169);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                else if (NIL != f49820(module0178.f11287(var168))) {
                    f49734(module0038.$g916$.getGlobalValue());
                }
                else {
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39019((SubLObject)$ic131$);
                    f49819(var168);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49818(final SubLObject var168) {
        return (SubLObject)makeBoolean(NIL != f49703(var168) || NIL != module0532.f33187(var168) || NIL != module0259.f16854(module0178.f11287(var168), $ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49819(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        var169.resetMultipleValues();
        final SubLObject var170 = f49821(var168);
        final SubLObject var171 = var169.secondMultipleValue();
        var169.resetMultipleValues();
        module0642.f39020(module0015.$g224$.getGlobalValue());
        if (NIL != var171) {
            SubLObject var172 = var171;
            SubLObject var173 = (SubLObject)NIL;
            var173 = var172.first();
            while (NIL != var172) {
                f49822(var173, (SubLObject)UNPROVIDED);
                var172 = var172.rest();
                var173 = var172.first();
            }
        }
        else if (NIL != module0259.f16854(var170, $ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0642.f39019((SubLObject)$ic133$);
        }
        if (NIL != module0532.f33187(var168)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic134$);
        }
        if (NIL != module0178.f11290(var168) && NIL != module0377.f26812(var168, $ic135$)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic136$);
        }
        module0642.f39020(module0015.$g225$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49823(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0004.f104(module0191.f11965(var58), $g6220$.getDynamicValue(var59), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f49817(var58) || (module0191.f11965(var58).eql((SubLObject)$ic137$) && NIL != module0172.f10917(module0205.f13388(module0191.f11967(var58), (SubLObject)UNPROVIDED)) && NIL == Sequences.find_if((SubLObject)$ic138$, module0205.f13207(module0205.f13388(module0191.f11967(var58), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f49750() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)(module0579.$g4353$.getDynamicValue(var5).isList() ? module0579.$g4353$.getDynamicValue(var5) : NIL);
    }
    
    public static SubLObject f49817(final SubLObject var58) {
        return module0004.f104(var58, f49750(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49816(final SubLObject var58, SubLObject var372, SubLObject var155) {
        if (var372 == UNPROVIDED) {
            var372 = (SubLObject)NIL;
        }
        if (var155 == UNPROVIDED) {
            var155 = f49747();
        }
        final SubLThread var373 = SubLProcess.currentSubLThread();
        if (NIL != f49823(var58)) {
            if (NIL != module0773.$g6197$.getDynamicValue(var373)) {
                Errors.warn((SubLObject)$ic139$, var58);
            }
            return (SubLObject)NIL;
        }
        final SubLObject var374 = f49824(var58);
        final SubLObject var375 = f49759(var58, (SubLObject)UNPROVIDED);
        final SubLObject var376 = module0191.f11965(var58);
        SubLObject var377 = (SubLObject)NIL;
        SubLObject var378 = (SubLObject)NIL;
        SubLObject var379 = var374;
        SubLObject var380 = (SubLObject)NIL;
        var380 = var379.first();
        while (NIL != var379) {
            if (NIL != module0178.f11290(var380)) {
                if (NIL != f49748(var380, var155)) {
                    if (NIL != module0773.$g6197$.getDynamicValue(var373)) {
                        Errors.warn((SubLObject)$ic140$, var58, var380);
                    }
                    return (SubLObject)NIL;
                }
                var377 = f49825(f49752(var380, var155), var380, var58);
            }
            if (NIL != f49826(var380, var376)) {
                var378 = (SubLObject)ConsesLow.cons(var380, var378);
            }
            else if (!f49759(var380, (SubLObject)UNPROVIDED).equal(var375)) {
                if (NIL != f49755(var380, (SubLObject)NIL, module0751.f46998((SubLObject)ConsesLow.list($ic82$, var155, f49747())))) {
                    if (NIL != var372) {
                        module0773.f49321(var372, var380, (SubLObject)$ic141$);
                    }
                }
                else {
                    var378 = (SubLObject)ConsesLow.cons(var380, var378);
                }
            }
            var379 = var379.rest();
            var380 = var379.first();
        }
        if (NIL != var377 && NIL != var378) {
            var378 = f49753(var378, var377);
        }
        return f49754(Sequences.delete_duplicates(var378, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49754(final SubLObject var69) {
        return Sort.sort(var69, (SubLObject)$ic142$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49827(final SubLObject var376, final SubLObject var377) {
        if (NIL != module0178.f11290(var376) && NIL == module0178.f11290(var377)) {
            return (SubLObject)T;
        }
        if (NIL != module0178.f11290(var377) && NIL == module0178.f11290(var376)) {
            return (SubLObject)NIL;
        }
        return module0213.f13927(var376, var377, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49752(final SubLObject var159, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = module0751.f46998((SubLObject)ConsesLow.list($ic82$, f49747(), f49799()));
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0147.f9540(var155);
        final SubLObject var162 = module0147.$g2095$.currentBinding(var160);
        final SubLObject var163 = module0147.$g2094$.currentBinding(var160);
        final SubLObject var164 = module0147.$g2096$.currentBinding(var160);
        try {
            module0147.$g2095$.bind(module0147.f9545(var161), var160);
            module0147.$g2094$.bind(module0147.f9546(var161), var160);
            module0147.$g2096$.bind(module0147.f9549(var161), var160);
            return module0220.f14562(var159, $ic143$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var164, var160);
            module0147.$g2094$.rebind(var163, var160);
            module0147.$g2095$.rebind(var162, var160);
        }
    }
    
    public static SubLObject f49825(final SubLObject var378, final SubLObject var159, final SubLObject var167) {
        final SubLObject var379 = module0205.f13204(module0289.f19396(var159), (SubLObject)UNPROVIDED);
        final SubLObject var380 = module0377.f26834(var159);
        final SubLObject var381 = module0235.f15475(module0233.f15362(var380, var379), module0191.f11967(var167), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var382 = (SubLObject)NIL;
        SubLObject var383 = var378;
        SubLObject var384 = (SubLObject)NIL;
        var384 = var383.first();
        while (NIL != var383) {
            var382 = (SubLObject)ConsesLow.cons(module0233.f15362(var381, module0233.f15362(var380, var384)), var382);
            var383 = var383.rest();
            var384 = var383.first();
        }
        return Sequences.nreverse(var382);
    }
    
    public static SubLObject f49753(final SubLObject var383, final SubLObject var160) {
        final SubLThread var384 = SubLProcess.currentSubLThread();
        SubLObject var385 = (SubLObject)NIL;
        final SubLObject var386 = module0773.$g6204$.currentBinding(var384);
        try {
            module0773.$g6204$.bind(Sequences.cconcatenate(var160, module0773.$g6204$.getDynamicValue(var384)), var384);
            SubLObject var387 = var383;
            SubLObject var388 = (SubLObject)NIL;
            var388 = var387.first();
            while (NIL != var387) {
                if (NIL == conses_high.member(var388, var385, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0773.f49553(var388)) {
                    if (NIL != module0773.$g6197$.getDynamicValue(var384)) {
                        Errors.warn((SubLObject)$ic144$, var388);
                    }
                    var385 = (SubLObject)ConsesLow.cons(var388, var385);
                }
                var387 = var387.rest();
                var388 = var387.first();
            }
            return conses_high.set_difference(var383, var385, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0773.$g6204$.rebind(var386, var384);
        }
    }
    
    public static SubLObject f49828(final SubLObject var385) {
        return module0004.f104(var385, $g6221$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49829(final SubLObject var60, final SubLObject var385) {
        if (NIL != f49828(var385)) {
            return (SubLObject)T;
        }
        if (var385.eql((SubLObject)$ic146$) && !module0191.f11965(var60).eql((SubLObject)$ic147$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49826(final SubLObject var60, final SubLObject var385) {
        final SubLThread var386 = SubLProcess.currentSubLThread();
        final SubLObject var387 = module0034.$g879$.getDynamicValue(var386);
        SubLObject var388 = (SubLObject)NIL;
        if (NIL == var387) {
            return f49829(var60, var385);
        }
        var388 = module0034.f1857(var387, (SubLObject)$ic145$, (SubLObject)UNPROVIDED);
        if (NIL == var388) {
            var388 = module0034.f1807(module0034.f1842(var387), (SubLObject)$ic145$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var387, (SubLObject)$ic145$, var388);
        }
        final SubLObject var389 = module0034.f1782(var60, var385);
        final SubLObject var390 = module0034.f1814(var388, var389, (SubLObject)UNPROVIDED);
        if (var390 != $ic27$) {
            SubLObject var391 = var390;
            SubLObject var392 = (SubLObject)NIL;
            var392 = var391.first();
            while (NIL != var391) {
                SubLObject var393 = var392.first();
                final SubLObject var394 = conses_high.second(var392);
                if (var60.equal(var393.first())) {
                    var393 = var393.rest();
                    if (NIL != var393 && NIL == var393.rest() && var385.equal(var393.first())) {
                        return module0034.f1959(var394);
                    }
                }
                var391 = var391.rest();
                var392 = var391.first();
            }
        }
        final SubLObject var395 = Values.arg2(var386.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49829(var60, var385)));
        module0034.f1836(var388, var389, var390, var395, (SubLObject)ConsesLow.list(var60, var385));
        return module0034.f1959(var395);
    }
    
    public static SubLObject f49730(SubLObject var386, final SubLObject var35) {
        final SubLThread var387 = SubLProcess.currentSubLThread();
        var386 = f49691(var386);
        final SubLObject var388 = module0035.remove_if_not((SubLObject)$ic148$, var386, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var388) {
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic149$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != module0015.$g520$.getGlobalValue()) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g520$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var389 = module0015.$g533$.currentBinding(var387);
            try {
                module0015.$g533$.bind((SubLObject)T, var387);
                module0642.f39020(module0015.$g187$.getGlobalValue());
                module0642.f39021((SubLObject)$ic150$);
                module0642.f39020(module0015.$g188$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var389, var387);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        if (NIL != module0035.f1997(var386)) {
            f49784(var386.first(), var35, var388);
        }
        else {
            SubLObject var390 = module0035.remove_if_not((SubLObject)$ic16$, var386, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f2004(var386, var390)) {
                var390 = (SubLObject)NIL;
            }
            var390 = conses_high.set_difference(var390, var388, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g264$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var391 = module0015.$g533$.currentBinding(var387);
            try {
                module0015.$g533$.bind((SubLObject)T, var387);
                SubLObject var392 = (SubLObject)NIL;
                SubLObject var393 = (SubLObject)NIL;
                SubLObject var394 = (SubLObject)NIL;
                var392 = var386;
                var393 = var392.first();
                for (var394 = (SubLObject)ZERO_INTEGER; NIL != var392; var392 = var392.rest(), var393 = var392.first(), var394 = Numbers.add((SubLObject)ONE_INTEGER, var394)) {
                    if (NIL == module0004.f104(var393, var390, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        module0642.f39020(module0015.$g275$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_389 = module0015.$g533$.currentBinding(var387);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var387);
                            final SubLObject var395 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic151$, var35, var394);
                            f49784(var393, var395, var388);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_389, var387);
                        }
                        module0642.f39020(module0015.$g276$.getGlobalValue());
                    }
                }
            }
            finally {
                module0015.$g533$.rebind(var391, var387);
            }
            module0642.f39020(module0015.$g265$.getGlobalValue());
            if (NIL != var390) {
                f49830(var390, var35);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49764(final SubLObject var27) {
        if (NIL != assertion_handles_oc.f11035(var27)) {
            return f49755(var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0202.f12595(var27)) {
            return (SubLObject)makeBoolean(NIL == module0035.find_if_not((SubLObject)$ic21$, module0205.f13207(var27, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0202.f12590(var27)) {
            return f49726(var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49831(final SubLObject var58, SubLObject var154, SubLObject var155) {
        if (var154 == UNPROVIDED) {
            var154 = (SubLObject)NIL;
        }
        if (var155 == UNPROVIDED) {
            var155 = f49747();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        if (NIL != $g6217$.getDynamicValue(var156)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0178.f11359(var58, (SubLObject)UNPROVIDED) || NIL != f49817(var58) || NIL != f49798(var58, module0751.f46998((SubLObject)ConsesLow.list($ic82$, var155, f49799())))) {
            return (SubLObject)T;
        }
        if (NIL != f49800(var58)) {
            return (SubLObject)NIL;
        }
        if (NIL != assertion_handles_oc.f11035(var58) && NIL != module0767.f48941(var58)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49832(module0191.f11965(var58)) || NIL != f49726(f49708(var58), var154, var155)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49755(final SubLObject var58, SubLObject var154, SubLObject var155) {
        if (var154 == UNPROVIDED) {
            var154 = (SubLObject)NIL;
        }
        if (var155 == UNPROVIDED) {
            var155 = f49747();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        final SubLObject var157 = module0034.$g879$.getDynamicValue(var156);
        SubLObject var158 = (SubLObject)NIL;
        if (NIL == var157) {
            return f49831(var58, var154, var155);
        }
        var158 = module0034.f1857(var157, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        if (NIL == var158) {
            var158 = module0034.f1807(module0034.f1842(var157), (SubLObject)$ic16$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var157, (SubLObject)$ic16$, var158);
        }
        final SubLObject var159 = module0034.f1781(var58, var154, var155);
        final SubLObject var160 = module0034.f1814(var158, var159, (SubLObject)UNPROVIDED);
        if (var160 != $ic27$) {
            SubLObject var161 = var160;
            SubLObject var162 = (SubLObject)NIL;
            var162 = var161.first();
            while (NIL != var161) {
                SubLObject var163 = var162.first();
                final SubLObject var164 = conses_high.second(var162);
                if (var58.equal(var163.first())) {
                    var163 = var163.rest();
                    if (var154.equal(var163.first())) {
                        var163 = var163.rest();
                        if (NIL != var163 && NIL == var163.rest() && var155.equal(var163.first())) {
                            return module0034.f1959(var164);
                        }
                    }
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
        }
        final SubLObject var165 = Values.arg2(var156.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49831(var58, var154, var155)));
        module0034.f1836(var158, var159, var160, var165, (SubLObject)ConsesLow.list(var58, var154, var155));
        return module0034.f1959(var165);
    }
    
    public static SubLObject f49832(final SubLObject var375) {
        final SubLThread var376 = SubLProcess.currentSubLThread();
        return module0004.f104(var375, $g6222$.getDynamicValue(var376), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49759(final SubLObject var58, SubLObject var390) {
        if (var390 == UNPROVIDED) {
            var390 = (SubLObject)T;
        }
        final SubLObject var391 = module0191.f11967(var58);
        return (NIL != var390) ? f49833(var391) : var391;
    }
    
    public static SubLObject f49834(final SubLObject var58) {
        final SubLObject var59 = module0191.f11970(var58);
        return f49833(var59);
    }
    
    public static SubLObject f49708(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0034.$g879$.getDynamicValue(var59);
        SubLObject var61 = (SubLObject)NIL;
        if (NIL == var60) {
            return f49834(var58);
        }
        var61 = module0034.f1857(var60, (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
        if (NIL == var61) {
            var61 = module0034.f1807(module0034.f1842(var60), (SubLObject)$ic17$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var60, (SubLObject)$ic17$, var61);
        }
        SubLObject var62 = module0034.f1814(var61, var58, (SubLObject)$ic27$);
        if (var62 == $ic27$) {
            var62 = Values.arg2(var59.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49834(var58)));
            module0034.f1816(var61, var58, var62, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var62);
    }
    
    public static SubLObject f49833(final SubLObject var74) {
        return module0205.f13147(var74, (SubLObject)$ic153$, (SubLObject)$ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49835(final SubLObject var320) {
        return (SubLObject)makeBoolean(NIL != module0167.f10813(var320) && NIL != f49836(var320));
    }
    
    public static SubLObject f49837(final SubLObject var391) {
        return f49836(var391);
    }
    
    public static SubLObject f49838(final SubLObject var391) {
        final SubLThread var392 = SubLProcess.currentSubLThread();
        SubLObject var393 = (SubLObject)NIL;
        final SubLObject var394 = module0147.$g2094$.currentBinding(var392);
        final SubLObject var395 = module0147.$g2095$.currentBinding(var392);
        try {
            module0147.$g2094$.bind((SubLObject)$ic156$, var392);
            module0147.$g2095$.bind($ic157$, var392);
            final SubLObject var396 = $ic158$;
            if (NIL != module0158.f10010(var391, (SubLObject)NIL, var396)) {
                final SubLObject var397 = module0158.f10011(var391, (SubLObject)NIL, var396);
                SubLObject var398 = var393;
                final SubLObject var399 = (SubLObject)NIL;
                while (NIL == var398) {
                    final SubLObject var400 = module0052.f3695(var397, var399);
                    final SubLObject var401 = (SubLObject)makeBoolean(!var399.eql(var400));
                    if (NIL != var401) {
                        SubLObject var402 = (SubLObject)NIL;
                        try {
                            var402 = module0158.f10316(var400, (SubLObject)$ic159$, (SubLObject)$ic160$, (SubLObject)NIL);
                            SubLObject var395_400 = var393;
                            final SubLObject var396_401 = (SubLObject)NIL;
                            while (NIL == var395_400) {
                                final SubLObject var403 = module0052.f3695(var402, var396_401);
                                final SubLObject var398_403 = (SubLObject)makeBoolean(!var396_401.eql(var403));
                                if (NIL != var398_403) {
                                    final SubLObject var404 = module0178.f11334(var403);
                                    if (NIL != constant_handles_oc.f8449(var404)) {
                                        var393 = var404;
                                    }
                                }
                                var395_400 = (SubLObject)makeBoolean(NIL == var398_403 || NIL != var393);
                            }
                        }
                        finally {
                            final SubLObject var10_405 = Threads.$is_thread_performing_cleanupP$.currentBinding(var392);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var392);
                                if (NIL != var402) {
                                    module0158.f10319(var402);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_405, var392);
                            }
                        }
                    }
                    var398 = (SubLObject)makeBoolean(NIL == var401 || NIL != var393);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var395, var392);
            module0147.$g2094$.rebind(var394, var392);
        }
        return var393;
    }
    
    public static SubLObject f49836(final SubLObject var391) {
        final SubLThread var392 = SubLProcess.currentSubLThread();
        final SubLObject var393 = module0034.$g879$.getDynamicValue(var392);
        SubLObject var394 = (SubLObject)NIL;
        if (NIL == var393) {
            return f49838(var391);
        }
        var394 = module0034.f1857(var393, (SubLObject)$ic155$, (SubLObject)UNPROVIDED);
        if (NIL == var394) {
            var394 = module0034.f1807(module0034.f1842(var393), (SubLObject)$ic155$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var393, (SubLObject)$ic155$, var394);
        }
        SubLObject var395 = module0034.f1814(var394, var391, (SubLObject)$ic27$);
        if (var395 == $ic27$) {
            var395 = Values.arg2(var392.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49838(var391)));
            module0034.f1816(var394, var391, var395, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var395);
    }
    
    public static SubLObject f49839(final SubLObject var332, final SubLObject var333) {
        SubLObject var335;
        final SubLObject var334 = var335 = var332.rest();
        SubLObject var336 = (SubLObject)NIL;
        SubLObject var337 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic161$);
        var336 = var335.first();
        var335 = var335.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic161$);
        var337 = var335.first();
        final SubLObject var338;
        var335 = (var338 = var335.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic162$, (SubLObject)$ic163$, (SubLObject)ConsesLow.listS((SubLObject)$ic164$, (SubLObject)ConsesLow.list((SubLObject)$ic165$, (SubLObject)ConsesLow.list((SubLObject)$ic166$, (SubLObject)$ic167$, var336), var337), ConsesLow.append(var338, (SubLObject)NIL)));
    }
    
    public static SubLObject f49726(final SubLObject var357, SubLObject var154, SubLObject var155) {
        if (var154 == UNPROVIDED) {
            var154 = (SubLObject)NIL;
        }
        if (var155 == UNPROVIDED) {
            var155 = f49747();
        }
        final SubLThread var358 = SubLProcess.currentSubLThread();
        if (NIL != module0191.f11950(var357)) {
            return f49726(module0191.f11970(var357), var154, var155);
        }
        if (NIL != module0205.f13220(var357, module0202.f12787(var154, (SubLObject)UNPROVIDED), (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12597(var357)) {
            return f49726(module0205.f13204(var357, (SubLObject)UNPROVIDED), var154, var155);
        }
        if (NIL == module0202.f12590(var357)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0201.f12546(module0205.f13132(var357))) {
            if (NIL != module0579.$g4295$.getDynamicValue(var358)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)$ic168$, new SubLObject[] { module0006.$g11$.getGlobalValue(), $ic169$, module0006.f205(var357), module0006.$g11$.getGlobalValue() }), (SubLObject)$ic170$), module0205.f13132(var357));
            }
            return (SubLObject)T;
        }
        if (NIL != module0201.f12584(module0205.f13132(var357))) {
            if (NIL != module0579.$g4295$.getDynamicValue(var358)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)$ic168$, new SubLObject[] { module0006.$g11$.getGlobalValue(), $ic169$, module0006.f205(var357), module0006.$g11$.getGlobalValue() }), (SubLObject)$ic171$), module0205.f13132(var357));
            }
            return (SubLObject)T;
        }
        if (NIL != module0751.f46849(module0172.f10922(module0205.f13132(var357)), $ic172$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0202.f12589(var357, $ic173$)) {
            return f49726(module0205.f13204(var357, (SubLObject)UNPROVIDED), var154, var155);
        }
        final SubLObject var359 = (SubLObject)TWELVE_INTEGER;
        final SubLObject var360 = module0205.f13180(var357, (SubLObject)$ic106$);
        SubLObject var361 = (SubLObject)NIL;
        SubLObject var362 = (SubLObject)NIL;
        SubLObject var363 = (SubLObject)NIL;
        var361 = var360;
        var362 = var361.first();
        for (var363 = (SubLObject)ZERO_INTEGER; NIL != var361; var361 = var361.rest(), var362 = var361.first(), var363 = module0048.f_1X(var363)) {
            if (var363.numG(var359)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0751.f46709(var362, var154, var155)) {
                if (NIL != module0579.$g4295$.getDynamicValue(var358)) {
                    Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)$ic168$, new SubLObject[] { module0006.$g11$.getGlobalValue(), $ic169$, module0006.f205(var357), module0006.$g11$.getGlobalValue() }), (SubLObject)$ic174$), var362, var155);
                }
                return (SubLObject)T;
            }
            if (NIL != f49726(var362, var154, var155)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49719(final SubLObject var74, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        if (NIL != $g6217$.getDynamicValue(var156)) {
            return (SubLObject)NIL;
        }
        if (NIL != assertion_handles_oc.f11035(var74)) {
            return f49806(var74, (SubLObject)UNPROVIDED);
        }
        if (NIL != f49807(module0205.f13132(var74), (SubLObject)$ic175$, var155)) {
            return (SubLObject)T;
        }
        if (NIL != module0202.f12592(var74) && NIL != f49807(module0205.f13132(module0205.f13203(var74, (SubLObject)UNPROVIDED)), (SubLObject)$ic175$, var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49840(var74, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0202.f12691(var74, (SubLObject)UNPROVIDED) || NIL == module0202.f12925(var74)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49841(var74)) {
            return (SubLObject)T;
        }
        if (NIL != f49842(var74)) {
            return (SubLObject)T;
        }
        if (NIL != f49843(var74, var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49844(var74, var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49845(var74, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != f49846(var74)) {
            return (SubLObject)T;
        }
        if (NIL != f49847(var74)) {
            return (SubLObject)T;
        }
        if (NIL != f49848(var74, var155)) {
            return (SubLObject)T;
        }
        if (NIL != f49849(var74, var155)) {
            if (NIL != module0579.$g4295$.getDynamicValue(var156)) {
                Errors.warn(Sequences.cconcatenate(Sequences.cconcatenate((SubLObject)$ic168$, new SubLObject[] { module0006.$g11$.getGlobalValue(), $ic169$, module0006.f205(var74), module0006.$g11$.getGlobalValue() }), (SubLObject)$ic176$));
            }
            return (SubLObject)T;
        }
        if (NIL != f49850(var74, var155)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49851(final SubLObject var74, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12691(var74, (SubLObject)UNPROVIDED) && NIL != module0751.f46848(module0202.f12643($ic177$, var74), var155, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f49852(final SubLObject var74, final SubLObject var155) {
        SubLObject var156 = (SubLObject)NIL;
        if (NIL == var156) {
            SubLObject var157 = module0217.f14425(var74);
            SubLObject var158 = (SubLObject)NIL;
            var158 = var157.first();
            while (NIL == var156 && NIL != var157) {
                if (NIL != f49807(var158, (SubLObject)$ic105$, var155)) {
                    var156 = (SubLObject)T;
                }
                var157 = var157.rest();
                var158 = var157.first();
            }
        }
        return var156;
    }
    
    public static SubLObject f49850(final SubLObject var74, final SubLObject var155) {
        final SubLThread var156 = SubLProcess.currentSubLThread();
        final SubLObject var157 = module0034.$g879$.getDynamicValue(var156);
        SubLObject var158 = (SubLObject)NIL;
        if (NIL == var157) {
            return f49852(var74, var155);
        }
        var158 = module0034.f1857(var157, (SubLObject)$ic178$, (SubLObject)UNPROVIDED);
        if (NIL == var158) {
            var158 = module0034.f1807(module0034.f1842(var157), (SubLObject)$ic178$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var157, (SubLObject)$ic178$, var158);
        }
        final SubLObject var159 = module0034.f1782(var74, var155);
        final SubLObject var160 = module0034.f1814(var158, var159, (SubLObject)UNPROVIDED);
        if (var160 != $ic27$) {
            SubLObject var161 = var160;
            SubLObject var162 = (SubLObject)NIL;
            var162 = var161.first();
            while (NIL != var161) {
                SubLObject var163 = var162.first();
                final SubLObject var164 = conses_high.second(var162);
                if (var74.equal(var163.first())) {
                    var163 = var163.rest();
                    if (NIL != var163 && NIL == var163.rest() && var155.equal(var163.first())) {
                        return module0034.f1959(var164);
                    }
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
        }
        final SubLObject var165 = Values.arg2(var156.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49852(var74, var155)));
        module0034.f1836(var158, var159, var160, var165, (SubLObject)ConsesLow.list(var74, var155));
        return module0034.f1959(var165);
    }
    
    public static SubLObject f49848(final SubLObject var74, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        return (SubLObject)makeBoolean(module0205.f13132(module0205.f13203(var74, (SubLObject)UNPROVIDED)).equal($ic179$) && module0205.f13203(module0205.f13203(var74, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED).equal(module0205.f13204(var74, (SubLObject)UNPROVIDED)) && NIL != module0751.f46849(module0205.f13132(var74), $ic96$, var155));
    }
    
    public static SubLObject f49842(final SubLObject var74) {
        if (NIL != module0337.f22630(var74, (SubLObject)$ic180$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49849(final SubLObject var74, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)NIL;
        final SubLObject var158 = module0205.f13132(var74);
        final SubLObject var159 = (SubLObject)((NIL != module0259.f16854(var158, $ic181$, var155, (SubLObject)UNPROVIDED)) ? module0751.f46855((SubLObject)$ic182$, (SubLObject)ConsesLow.listS($ic183$, (SubLObject)$ic184$, var158, (SubLObject)$ic185$), var155, (SubLObject)$ic186$) : NIL);
        if (NIL == var157) {
            SubLObject var160 = var159;
            SubLObject var161 = (SubLObject)NIL;
            var161 = var160.first();
            while (NIL == var157 && NIL != var160) {
                SubLObject var163;
                final SubLObject var162 = var163 = var161;
                SubLObject var164 = (SubLObject)NIL;
                SubLObject var165 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var163, var162, (SubLObject)$ic187$);
                var164 = var163.first();
                var163 = (var165 = var163.rest());
                final SubLObject var166 = module0205.f13384(var74, var165, (SubLObject)UNPROVIDED);
                var157 = Equality.eql(module0205.f13276(var166), var164);
                var160 = var160.rest();
                var161 = var160.first();
            }
        }
        if (NIL != var157 && NIL != module0773.$g6197$.getDynamicValue(var156)) {
            Errors.warn((SubLObject)$ic188$, var74);
        }
        return var157;
    }
    
    public static SubLObject f49841(final SubLObject var74) {
        return (SubLObject)makeBoolean(module0205.f13132(var74).eql($ic96$) && module0205.f13204(var74, (SubLObject)UNPROVIDED).equal(module0205.f13277(module0205.f13203(var74, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) && NIL != conses_high.member(module0205.f13276(module0205.f13203(var74, (SubLObject)UNPROVIDED)), (SubLObject)$ic189$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49844(final SubLObject var74, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)NIL;
        if (NIL != module0202.f12734(var74, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0202.f12589(var74, $ic190$)) {
            SubLObject var159;
            final SubLObject var158 = var159 = module0205.f13385(var74, (SubLObject)UNPROVIDED);
            SubLObject var160 = (SubLObject)NIL;
            SubLObject var161 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var159, var158, (SubLObject)$ic191$);
            var160 = var159.first();
            var159 = var159.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var159, var158, (SubLObject)$ic191$);
            var161 = var159.first();
            var159 = var159.rest();
            if (NIL == var159) {
                if (var161.equal(module0205.f13277(var160, (SubLObject)UNPROVIDED)) && NIL != module0226.f14819(var160)) {
                    var157 = (SubLObject)T;
                }
                else {
                    if (NIL != module0206.f13453(var161) && $ic192$.eql(module0205.f13276(var161)) && NIL != module0202.f12676(module0205.f13277(var161, (SubLObject)UNPROVIDED)) && NIL != conses_high.member(var160, module0202.f12792(module0205.f13277(var161, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0212.f13762(var161) && (NIL != module0220.f14548(var161, $ic193$, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14548(var161, $ic194$, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                        var157 = (SubLObject)T;
                    }
                    else if (NIL != module0206.f13453(var160) && NIL != module0004.f104(var161, module0226.f15014(module0205.f13276(var160), var155, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var157 = (SubLObject)T;
                    }
                    else if (NIL != module0206.f13453(var160) && NIL != module0004.f104(var161, module0226.f15016(var160, var155), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var157 = (SubLObject)T;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var158, (SubLObject)$ic191$);
            }
        }
        if (NIL != var157 && NIL != module0773.$g6197$.getDynamicValue(var156)) {
            Errors.warn((SubLObject)$ic195$, var74);
        }
        return var157;
    }
    
    public static SubLObject f49843(final SubLObject var74, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)NIL;
        if (NIL != module0202.f12734(var74, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0202.f12589(var74, $ic96$)) {
            SubLObject var159;
            final SubLObject var158 = var159 = module0205.f13385(var74, (SubLObject)UNPROVIDED);
            SubLObject var160 = (SubLObject)NIL;
            SubLObject var161 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var159, var158, (SubLObject)$ic191$);
            var160 = var159.first();
            var159 = var159.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var159, var158, (SubLObject)$ic191$);
            var161 = var159.first();
            var159 = var159.rest();
            if (NIL == var159) {
                if (NIL != module0212.f13762(var161) && (NIL != module0220.f14548(var161, $ic193$, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14548(var161, $ic196$, var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var157 = (SubLObject)T;
                }
                else if (NIL != module0206.f13453(var161) && module0205.f13276(var161).eql($ic197$)) {
                    var157 = (SubLObject)T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var158, (SubLObject)$ic191$);
            }
        }
        if (NIL != var157 && NIL != module0773.$g6197$.getDynamicValue(var156)) {
            Errors.warn((SubLObject)$ic198$, var74);
        }
        return var157;
    }
    
    public static SubLObject f49845(final SubLObject var74, SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = f49799();
        }
        if (!module0205.f13132(var74).eql($ic199$)) {
            return (SubLObject)NIL;
        }
        if (module0205.f13204(var74, (SubLObject)UNPROVIDED).equal(module0205.f13277(module0205.f13203(var74, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED))) {
            return (SubLObject)T;
        }
        if (NIL != f49853(var74, var29)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49854(final SubLObject var74, final SubLObject var29) {
        return module0409.f28506((SubLObject)ConsesLow.list($ic201$, (SubLObject)ConsesLow.list($ic202$, var74), (SubLObject)ConsesLow.list($ic203$, (SubLObject)$ic204$, (SubLObject)ConsesLow.listS($ic205$, (SubLObject)ConsesLow.list($ic206$, (SubLObject)$ic204$, var74), (SubLObject)$ic207$))), var29, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49853(final SubLObject var74, final SubLObject var29) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        final SubLObject var76 = module0034.$g879$.getDynamicValue(var75);
        SubLObject var77 = (SubLObject)NIL;
        if (NIL == var76) {
            return f49854(var74, var29);
        }
        var77 = module0034.f1857(var76, (SubLObject)$ic200$, (SubLObject)UNPROVIDED);
        if (NIL == var77) {
            var77 = module0034.f1807(module0034.f1842(var76), (SubLObject)$ic200$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var76, (SubLObject)$ic200$, var77);
        }
        final SubLObject var78 = module0034.f1782(var74, var29);
        final SubLObject var79 = module0034.f1814(var77, var78, (SubLObject)UNPROVIDED);
        if (var79 != $ic27$) {
            SubLObject var80 = var79;
            SubLObject var81 = (SubLObject)NIL;
            var81 = var80.first();
            while (NIL != var80) {
                SubLObject var82 = var81.first();
                final SubLObject var83 = conses_high.second(var81);
                if (var74.equal(var82.first())) {
                    var82 = var82.rest();
                    if (NIL != var82 && NIL == var82.rest() && var29.equal(var82.first())) {
                        return module0034.f1959(var83);
                    }
                }
                var80 = var80.rest();
                var81 = var80.first();
            }
        }
        final SubLObject var84 = Values.arg2(var75.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49854(var74, var29)));
        module0034.f1836(var77, var78, var79, var84, (SubLObject)ConsesLow.list(var74, var29));
        return module0034.f1959(var84);
    }
    
    public static SubLObject f49846(final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        SubLObject var76 = (SubLObject)NIL;
        var75.resetMultipleValues();
        final SubLObject var77 = module0337.f22630(var74, (SubLObject)$ic208$);
        final SubLObject var78 = var75.secondMultipleValue();
        var75.resetMultipleValues();
        if (NIL != var77) {
            final SubLObject var79 = module0035.f2294(var78, (SubLObject)$ic209$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var80 = module0035.f2294(var78, (SubLObject)$ic210$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var81 = module0035.f2294(var78, (SubLObject)$ic211$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0337.f22630(module0205.f13180(var81, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)$ic212$, (SubLObject)$ic212$, var80, var79))) {
                var76 = (SubLObject)T;
            }
        }
        return var76;
    }
    
    public static SubLObject f49847(final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        final SubLObject var76 = module0205.f13132(var74);
        final SubLObject var77 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var78 = (SubLObject)ZERO_INTEGER;
        SubLObject var80;
        final SubLObject var79 = var80 = module0205.f13207(var74, (SubLObject)$ic106$);
        SubLObject var81 = (SubLObject)NIL;
        var81 = var80.first();
        while (NIL != var80) {
            var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER);
            module0084.f5762(var77, var81, var78);
            var80 = var80.rest();
            var81 = var80.first();
        }
        if (NIL == var75) {
            SubLObject var82 = module0067.f4903(var77);
            SubLObject var83 = (SubLObject)NIL;
            var83 = var82.first();
            while (NIL == var75 && NIL != var82) {
                SubLObject var84 = (SubLObject)NIL;
                final SubLObject var85 = Sequences.length(var83);
                if (!var85.eql((SubLObject)ZERO_INTEGER)) {
                    if (!var85.eql((SubLObject)ONE_INTEGER)) {
                        if (var85.eql((SubLObject)TWO_INTEGER)) {
                            var84 = (SubLObject)ConsesLow.list(var83);
                        }
                        else {
                            SubLObject var86 = module0035.f2489((SubLObject)ConsesLow.list(var83, var83), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            SubLObject var87 = (SubLObject)NIL;
                            var87 = var86.first();
                            while (NIL != var86) {
                                if (var87.first().numL(conses_high.second(var87))) {
                                    var84 = (SubLObject)ConsesLow.cons(var87, var84);
                                }
                                var86 = var86.rest();
                                var87 = var86.first();
                            }
                        }
                    }
                }
                if (NIL == var75) {
                    SubLObject var162_437 = var84;
                    SubLObject var87 = (SubLObject)NIL;
                    var87 = var162_437.first();
                    while (NIL == var75 && NIL != var162_437) {
                        SubLObject var89;
                        final SubLObject var88 = var89 = var87;
                        SubLObject var90 = (SubLObject)NIL;
                        SubLObject var91 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic191$);
                        var90 = var89.first();
                        var89 = var89.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic191$);
                        var91 = var89.first();
                        var89 = var89.rest();
                        if (NIL == var89) {
                            if (NIL != module0751.f46848((SubLObject)ConsesLow.list($ic213$, var76, var90, var91), $ic135$, (SubLObject)ONE_INTEGER)) {
                                var75 = (SubLObject)T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic191$);
                        }
                        var162_437 = var162_437.rest();
                        var87 = var162_437.first();
                    }
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        if (NIL != var75) {}
        return var75;
    }
    
    public static SubLObject f49855(final SubLObject var320, final SubLObject var272, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var321 = SubLProcess.currentSubLThread();
        SubLObject var322 = (SubLObject)NIL;
        if (NIL != module0206.f13450(var320)) {
            SubLObject var323 = (SubLObject)NIL;
            try {
                var323 = module0361.f24136((SubLObject)NIL);
                var322 = (SubLObject)makeBoolean(NIL != f49856(var320, var272, var155, var323) && NIL == f49857(var320, var272, var155, var323));
            }
            finally {
                final SubLObject var324 = Threads.$is_thread_performing_cleanupP$.currentBinding(var321);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var321);
                    module0361.f24005(var323);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var324, var321);
                }
            }
        }
        if (NIL != var322 && NIL != module0773.$g6197$.getDynamicValue(var321)) {
            Errors.warn((SubLObject)$ic215$, var320);
        }
        return var322;
    }
    
    public static SubLObject f49807(final SubLObject var320, final SubLObject var272, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var321 = SubLProcess.currentSubLThread();
        final SubLObject var322 = module0034.$g879$.getDynamicValue(var321);
        SubLObject var323 = (SubLObject)NIL;
        if (NIL == var322) {
            return f49855(var320, var272, var155);
        }
        var323 = module0034.f1857(var322, (SubLObject)$ic214$, (SubLObject)UNPROVIDED);
        if (NIL == var323) {
            var323 = module0034.f1807(module0034.f1842(var322), (SubLObject)$ic214$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var322, (SubLObject)$ic214$, var323);
        }
        final SubLObject var324 = module0034.f1781(var320, var272, var155);
        final SubLObject var325 = module0034.f1814(var323, var324, (SubLObject)UNPROVIDED);
        if (var325 != $ic27$) {
            SubLObject var326 = var325;
            SubLObject var327 = (SubLObject)NIL;
            var327 = var326.first();
            while (NIL != var326) {
                SubLObject var328 = var327.first();
                final SubLObject var329 = conses_high.second(var327);
                if (var320.equal(var328.first())) {
                    var328 = var328.rest();
                    if (var272.equal(var328.first())) {
                        var328 = var328.rest();
                        if (NIL != var328 && NIL == var328.rest() && var155.equal(var328.first())) {
                            return module0034.f1959(var329);
                        }
                    }
                }
                var326 = var326.rest();
                var327 = var326.first();
            }
        }
        final SubLObject var330 = Values.arg2(var321.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49855(var320, var272, var155)));
        module0034.f1836(var323, var324, var325, var330, (SubLObject)ConsesLow.list(var320, var272, var155));
        return module0034.f1959(var330);
    }
    
    public static SubLObject f49858(final SubLObject var441, final SubLObject var272) {
        if (var272.eql((SubLObject)$ic175$)) {
            return (SubLObject)ConsesLow.list($ic216$, var441);
        }
        if (var272.eql((SubLObject)$ic105$)) {
            return (SubLObject)ConsesLow.list($ic217$, var441);
        }
        if (var272.eql((SubLObject)$ic109$)) {
            return (SubLObject)ConsesLow.list($ic108$, var441);
        }
        Errors.error((SubLObject)$ic218$, var272);
        return $ic219$;
    }
    
    public static SubLObject f49859(final SubLObject var442) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic220$, (SubLObject)$ic221$, (SubLObject)$ic222$, var442);
    }
    
    public static SubLObject f49856(final SubLObject var441, final SubLObject var272, final SubLObject var155, final SubLObject var442) {
        if (var272 == $ic175$ && NIL != module0222.f14637(var441) && NIL == module0222.f14635($ic216$, var441, (SubLObject)ONE_INTEGER, (SubLObject)T)) {
            return (SubLObject)NIL;
        }
        if (var272 == $ic105$ && NIL == f49860(var441)) {
            return (SubLObject)NIL;
        }
        return module0540.f33533(module0409.f28506(f49858(var441, var272), var155, f49859(var442)));
    }
    
    public static SubLObject f49860(final SubLObject var443) {
        SubLObject var444 = module0260.f17034($ic217$, $ic135$, (SubLObject)UNPROVIDED);
        SubLObject var445 = (SubLObject)NIL;
        var445 = var444.first();
        while (NIL != var444) {
            if (NIL == module0222.f14636(var445) || NIL != module0222.f14635(var445, var443, (SubLObject)ONE_INTEGER, (SubLObject)T)) {
                return (SubLObject)T;
            }
            var444 = var444.rest();
            var445 = var444.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49857(final SubLObject var441, final SubLObject var272, final SubLObject var155, final SubLObject var442) {
        return module0540.f33533(module0409.f28506(module0205.f13338(f49858(var441, var272)), var155, f49859(var442)));
    }
    
    public static SubLObject f49830(final SubLObject var97, final SubLObject var35) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4309$.getDynamicValue(var98)) {
            final SubLObject var99 = Sequences.cconcatenate((SubLObject)$ic223$, var35);
            module0642.f39020(module0016.$g545$.getGlobalValue());
            module0642.f39020(module0016.$g546$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic33$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0016.$g547$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            SubLObject var100 = module0015.$g533$.currentBinding(var98);
            try {
                module0015.$g533$.bind((SubLObject)T, var98);
                module0642.f39028((SubLObject)UNPROVIDED);
                module0016.f886(var99);
                module0016.f889(module0016.$g555$.getGlobalValue());
                module0642.f39020((SubLObject)$ic35$);
                module0016.f890();
                module0016.f887();
                module0642.f39028((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var100, var98);
            }
            module0642.f39020(module0016.$g548$.getGlobalValue());
            module0642.f39028((SubLObject)UNPROVIDED);
            module0016.f923(var99, (SubLObject)$ic224$);
            module0016.f908(var99, (SubLObject)$ic37$, (SubLObject)$ic38$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var99) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var99);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var100 = module0015.$g533$.currentBinding(var98);
            try {
                module0015.$g533$.bind((SubLObject)T, var98);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_444 = module0015.$g533$.currentBinding(var98);
                try {
                    module0015.$g533$.bind((SubLObject)T, var98);
                    SubLObject var101 = (SubLObject)NIL;
                    SubLObject var102 = (SubLObject)NIL;
                    SubLObject var103 = (SubLObject)NIL;
                    var101 = var97;
                    var102 = var101.first();
                    for (var103 = (SubLObject)ZERO_INTEGER; NIL != var101; var101 = var101.rest(), var102 = var101.first(), var103 = Numbers.add((SubLObject)ONE_INTEGER, var103)) {
                        module0642.f39020(module0015.$g275$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_445 = module0015.$g533$.currentBinding(var98);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var98);
                            final SubLObject var104 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic225$, var35, var103);
                            f49784(var102, var104, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_445, var98);
                        }
                        module0642.f39020(module0015.$g276$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var10_444, var98);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var100, var98);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39019((SubLObject)$ic224$);
            module0642.f39020(module0015.$g264$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var105 = module0015.$g533$.currentBinding(var98);
            try {
                module0015.$g533$.bind((SubLObject)T, var98);
                SubLObject var106 = (SubLObject)NIL;
                SubLObject var107 = (SubLObject)NIL;
                SubLObject var108 = (SubLObject)NIL;
                var106 = var97;
                var107 = var106.first();
                for (var108 = (SubLObject)ZERO_INTEGER; NIL != var106; var106 = var106.rest(), var107 = var106.first(), var108 = Numbers.add((SubLObject)ONE_INTEGER, var108)) {
                    module0642.f39020(module0015.$g275$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_446 = module0015.$g533$.currentBinding(var98);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var98);
                        f49784(var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_446, var98);
                    }
                    module0642.f39020(module0015.$g276$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var105, var98);
            }
            module0642.f39020(module0015.$g265$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49686(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        final SubLObject var170 = module0579.$g4262$.currentBinding(var169);
        try {
            module0579.$g4262$.bind(module0767.f48872(module0178.f11287(var168), (SubLObject)UNPROVIDED), var169);
            if (NIL != f49861(var168, (SubLObject)UNPROVIDED)) {
                module0642.f39020(module0015.$g209$.getGlobalValue());
                f49862(var168);
                module0642.f39020(module0015.$g210$.getGlobalValue());
            }
            else {
                f49862(var168);
            }
        }
        finally {
            module0579.$g4262$.rebind(var170, var169);
        }
        return var168;
    }
    
    public static SubLObject f49862(final SubLObject var168) {
        f49863(var168, (SubLObject)$ic3$, (SubLObject)UNPROVIDED);
        return var168;
    }
    
    public static SubLObject f49821(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        var169.resetMultipleValues();
        final SubLObject var170 = f49703(var168);
        final SubLObject var171 = var169.secondMultipleValue();
        var169.resetMultipleValues();
        return Values.values(module0161.f10550(var168), var170, var171);
    }
    
    public static SubLObject f49864(final SubLObject var168) {
        return module0035.sublisp_boolean(f49703(var168));
    }
    
    public static SubLObject f49703(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        SubLObject var170 = f49865(module0161.f10550(var168));
        SubLObject var171 = (SubLObject)NIL;
        if (NIL == var170 && NIL != Sequences.find_if((SubLObject)$ic226$, module0211.f13701(var168), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var169.resetMultipleValues();
            final SubLObject var448_449 = f49866(var168);
            final SubLObject var450_451 = var169.secondMultipleValue();
            var169.resetMultipleValues();
            var170 = var448_449;
            var171 = var450_451;
        }
        return Values.values(var170, var171);
    }
    
    public static SubLObject f49867(final SubLObject var168) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var168) && NIL == Sequences.find(module0178.f11333(var168), $g6223$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49865(final SubLObject var452) {
        final SubLObject var453 = module0161.f10557(var452);
        return f49868(var453);
    }
    
    public static SubLObject f49869(final SubLObject var453) {
        final SubLThread var454 = SubLProcess.currentSubLThread();
        SubLObject var455 = (SubLObject)NIL;
        final SubLObject var456 = $g6224$.currentBinding(var454);
        final SubLObject var457 = module0579.$g4296$.currentBinding(var454);
        final SubLObject var458 = module0580.$g4361$.currentBinding(var454);
        try {
            $g6224$.bind((SubLObject)NIL, var454);
            module0579.$g4296$.bind(var453, var454);
            module0580.$g4361$.bind((SubLObject)NIL, var454);
            var454.resetMultipleValues();
            final SubLObject var10_454 = module0580.$g4362$.currentBinding(var454);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var454);
                final SubLObject var459 = var454.secondMultipleValue();
                var454.resetMultipleValues();
                try {
                    var454.resetMultipleValues();
                    final SubLObject var10_455 = module0580.$g4358$.currentBinding(var454);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var454);
                        final SubLObject var460 = var454.secondMultipleValue();
                        var454.resetMultipleValues();
                        final SubLObject var10_456 = module0580.$g4359$.currentBinding(var454);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var454);
                            final SubLObject var461 = module0580.$g4358$.getDynamicValue(var454);
                            final SubLObject var10_457 = module0034.$g879$.currentBinding(var454);
                            try {
                                module0034.$g879$.bind(var461, var454);
                                SubLObject var462 = (SubLObject)NIL;
                                if (NIL != var461 && NIL == module0034.f1842(var461)) {
                                    var462 = module0034.f1869(var461);
                                    final SubLObject var463 = Threads.current_process();
                                    if (NIL == var462) {
                                        module0034.f1873(var461, var463);
                                    }
                                    else if (!var462.eql(var463)) {
                                        Errors.error((SubLObject)$ic23$);
                                    }
                                }
                                try {
                                    SubLObject var464 = inference_datastructures_inference_oc.f25744(var453);
                                    SubLObject var465 = (SubLObject)NIL;
                                    var465 = var464.first();
                                    while (NIL != var464) {
                                        var455 = ConsesLow.append(var455, f49870(var465));
                                        var464 = var464.rest();
                                        var465 = var464.first();
                                    }
                                }
                                finally {
                                    final SubLObject var10_458 = Threads.$is_thread_performing_cleanupP$.currentBinding(var454);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var454);
                                        if (NIL != var461 && NIL == var462) {
                                            module0034.f1873(var461, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_458, var454);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var10_457, var454);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var10_456, var454);
                        }
                        if (var460 == $ic229$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var454))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var454));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var10_455, var454);
                    }
                }
                finally {
                    final SubLObject var10_459 = Threads.$is_thread_performing_cleanupP$.currentBinding(var454);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var454);
                        if (NIL == var459) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var454));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_459, var454);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var10_454, var454);
            }
        }
        finally {
            module0580.$g4361$.rebind(var458, var454);
            module0579.$g4296$.rebind(var457, var454);
            $g6224$.rebind(var456, var454);
        }
        return module0035.f2269(var455, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49871(final SubLObject var453) {
        final SubLThread var454 = SubLProcess.currentSubLThread();
        final SubLObject var455 = module0034.$g879$.getDynamicValue(var454);
        SubLObject var456 = (SubLObject)NIL;
        if (NIL == var455) {
            return f49869(var453);
        }
        var456 = module0034.f1857(var455, (SubLObject)$ic228$, (SubLObject)UNPROVIDED);
        if (NIL == var456) {
            var456 = module0034.f1807(module0034.f1842(var455), (SubLObject)$ic228$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var455, (SubLObject)$ic228$, var456);
        }
        SubLObject var457 = module0034.f1814(var456, var453, (SubLObject)$ic27$);
        if (var457 == $ic27$) {
            var457 = Values.arg2(var454.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49869(var453)));
            module0034.f1816(var456, var453, var457, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var457);
    }
    
    public static SubLObject f49870(final SubLObject var24) {
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = inference_datastructures_inference_oc.f25775(var24);
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            var25 = ConsesLow.append(var25, f49872(var27));
            var26 = var26.rest();
            var27 = var26.first();
        }
        return module0035.f2269(var25, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49872(final SubLObject var58) {
        SubLObject var59 = (SubLObject)NIL;
        if (NIL != module0191.f11991(var58, (SubLObject)$ic19$)) {
            var59 = f49873(var58);
        }
        else {
            SubLObject var60 = module0333.f22429(var58);
            SubLObject var61 = (SubLObject)NIL;
            var61 = var60.first();
            while (NIL != var60) {
                if (NIL != assertion_handles_oc.f11035(var61)) {
                    var59 = ConsesLow.append(var59, f49874(var61));
                }
                var60 = var60.rest();
                var61 = var60.first();
            }
        }
        return module0035.f2269(var59, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49873(final SubLObject var58) {
        final SubLObject var59 = module0191.f11972(var58);
        SubLObject var61;
        final SubLObject var60 = var61 = f49865(var59);
        if (NIL != module0751.f46847((SubLObject)ConsesLow.list($ic230$, var59), $ic231$)) {
            final SubLObject var62 = module0191.f11967(var58);
            final SubLObject var63 = module0751.f46781((SubLObject)$ic232$, (SubLObject)ConsesLow.list($ic233$, (SubLObject)$ic232$, var62), var59, (SubLObject)UNPROVIDED);
            var61 = ConsesLow.append(var63, var61);
        }
        return var61;
    }
    
    public static SubLObject f49874(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104(var168, $g6224$.getDynamicValue(var169), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        $g6224$.setDynamicValue((SubLObject)ConsesLow.cons(var168, $g6224$.getDynamicValue(var169)), var169);
        SubLObject var170 = f49703(var168);
        SubLObject var171 = module0178.f11299(var168);
        SubLObject var172 = (SubLObject)NIL;
        var172 = var171.first();
        while (NIL != var171) {
            if (NIL != deduction_handles_oc.f11659(var172)) {
                var170 = ConsesLow.append(var170, f49875(var172));
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return module0035.f2269(var170, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49875(final SubLObject var464) {
        SubLObject var465 = (SubLObject)NIL;
        SubLObject var466 = module0188.f11770(var464);
        SubLObject var467 = (SubLObject)NIL;
        var467 = var466.first();
        while (NIL != var466) {
            var465 = ConsesLow.append(var465, f49872(var467));
            var466 = var466.rest();
            var467 = var466.first();
        }
        return module0035.f2269(var465, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49876(final SubLObject var168, final SubLObject var8) {
        final SubLObject var169 = module0161.f10550(var168);
        SubLObject var170 = (SubLObject)NIL;
        SubLObject var171 = module0288.f19344(module0289.f19396(var168), var8);
        SubLObject var172 = (SubLObject)NIL;
        var172 = var171.first();
        while (NIL != var171) {
            if (!var172.eql(var168) && NIL != module0161.f10607(var169, module0161.f10550(var172))) {
                SubLObject var23_466 = f49703(var172);
                SubLObject var173 = (SubLObject)NIL;
                var173 = var23_466.first();
                while (NIL != var23_466) {
                    final SubLObject var174 = var173;
                    if (NIL == conses_high.member(var174, var170, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var170 = (SubLObject)ConsesLow.cons(var174, var170);
                    }
                    var23_466 = var23_466.rest();
                    var173 = var23_466.first();
                }
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return var170;
    }
    
    public static SubLObject f49877(final SubLObject var330) {
        SubLObject var331 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var330)) {
            var331 = module0751.f46781((SubLObject)$ic235$, (SubLObject)ConsesLow.listS($ic236$, var330, (SubLObject)$ic237$), $ic135$, (SubLObject)$ic238$);
        }
        return var331;
    }
    
    public static SubLObject f49868(final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        final SubLObject var332 = module0034.$g879$.getDynamicValue(var331);
        SubLObject var333 = (SubLObject)NIL;
        if (NIL == var332) {
            return f49877(var330);
        }
        var333 = module0034.f1857(var332, (SubLObject)$ic234$, (SubLObject)UNPROVIDED);
        if (NIL == var333) {
            var333 = module0034.f1807(module0034.f1842(var332), (SubLObject)$ic234$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var332, (SubLObject)$ic234$, var333);
        }
        SubLObject var334 = module0034.f1814(var333, var330, (SubLObject)$ic27$);
        if (var334 == $ic27$) {
            var334 = Values.arg2(var331.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49877(var330)));
            module0034.f1816(var333, var330, var334, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var334);
    }
    
    public static SubLObject f49878(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        final SubLObject var170 = module0751.f46781((SubLObject)$ic235$, (SubLObject)ConsesLow.list($ic240$, (SubLObject)$ic235$, var168), $ic135$, (SubLObject)$ic241$);
        var169.resetMultipleValues();
        final SubLObject var171 = f49879(var168, var170);
        final SubLObject var172 = var169.secondMultipleValue();
        var169.resetMultipleValues();
        return Values.values(var171, var172);
    }
    
    public static SubLObject f49866(final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        final SubLObject var170 = module0034.$g879$.getDynamicValue(var169);
        SubLObject var171 = (SubLObject)NIL;
        if (NIL == var170) {
            return f49878(var168);
        }
        var171 = module0034.f1857(var170, (SubLObject)$ic239$, (SubLObject)UNPROVIDED);
        if (NIL == var171) {
            var171 = module0034.f1807(module0034.f1842(var170), (SubLObject)$ic239$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var170, (SubLObject)$ic239$, var171);
        }
        SubLObject var172 = module0034.f1814(var171, var168, (SubLObject)$ic27$);
        if (var172 == $ic27$) {
            var172 = Values.arg2(var169.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49878(var168)));
            module0034.f1816(var171, var168, var172, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var172);
    }
    
    public static SubLObject f49879(final SubLObject var168, final SubLObject var468) {
        SubLObject var469 = (SubLObject)NIL;
        SubLObject var470 = (SubLObject)NIL;
        if (NIL != module0035.f1998(var468) && NIL != Sequences.find_if((SubLObject)$ic242$, var468, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Sequences.find_if((SubLObject)$ic243$, var468, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var471 = f49880(var468);
            if (NIL != var471) {
                var470 = (SubLObject)ConsesLow.cons(var471, var470);
                var469 = (SubLObject)T;
            }
        }
        if (NIL == var470) {
            var470 = var468;
        }
        return Values.values(var470, var469);
    }
    
    public static SubLObject f49881() {
        if (NIL != module0107.f7628($g6225$.getGlobalValue())) {}
        if (NIL != module0107.f7628($g6225$.getGlobalValue())) {
            $g6225$.setGlobalValue((SubLObject)NIL);
        }
        return $g6225$.getGlobalValue();
    }
    
    public static SubLObject f49882(final SubLObject var320) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var320) && NIL != module0337.f22630(var320, f49881()));
    }
    
    public static SubLObject f49880(final SubLObject var371) {
        SubLObject var372 = (SubLObject)NIL;
        SubLObject var373 = (SubLObject)NIL;
        SubLObject var374 = (SubLObject)NIL;
        if (NIL == constant_handles_oc.f8463($ic244$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == var374) {
            SubLObject var375 = var371;
            SubLObject var376 = (SubLObject)NIL;
            var376 = var375.first();
            while (NIL == var374 && NIL != var375) {
                if (NIL != f49882(var376)) {
                    var372 = var376;
                }
                else if (var376.isString()) {
                    var373 = var376;
                }
                if (NIL != var372 && NIL != var373) {
                    var374 = (SubLObject)T;
                }
                var375 = var375.rest();
                var376 = var375.first();
            }
        }
        if (NIL != var374) {
            return module0202.f12768($ic244$, var372, var373);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49822(final SubLObject var228, SubLObject var447) {
        if (var447 == UNPROVIDED) {
            var447 = (SubLObject)NIL;
        }
        final SubLThread var448 = SubLProcess.currentSubLThread();
        PrintLow.format(module0015.$g131$.getDynamicValue(var448), (SubLObject)$ic245$, f49883(var228));
        return var228;
    }
    
    public static SubLObject f49861(final SubLObject var168, SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = $ic135$;
        }
        SubLObject var169 = (SubLObject)ConsesLow.list($ic246$, var168);
        if (NIL != module0178.f11284(var168)) {
            var169 = module0276.f18280((SubLObject)ConsesLow.list(var169, (SubLObject)ConsesLow.list($ic125$, module0178.f11333(var168))), (SubLObject)UNPROVIDED);
        }
        return module0751.f46848(var169, var29, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49684(final SubLObject var74, SubLObject var473, SubLObject var474) {
        if (var473 == UNPROVIDED) {
            var473 = (SubLObject)NIL;
        }
        if (var474 == UNPROVIDED) {
            var474 = (SubLObject)T;
        }
        f49863(var74, (SubLObject)$ic3$, var473);
        return var74;
    }
    
    public static SubLObject f49884(final SubLObject var441, SubLObject var473, SubLObject var474) {
        if (var473 == UNPROVIDED) {
            var473 = (SubLObject)NIL;
        }
        if (var474 == UNPROVIDED) {
            var474 = (SubLObject)T;
        }
        final SubLObject var475 = module0751.f47036(var441);
        f49863(var441, var475, var473);
        return var441;
    }
    
    public static SubLObject f49885(final SubLObject var476) {
        f49863(var476, (SubLObject)$ic247$, (SubLObject)UNPROVIDED);
        return var476;
    }
    
    public static SubLObject f49883(final SubLObject var320) {
        final SubLThread var321 = SubLProcess.currentSubLThread();
        final SubLObject var322 = (SubLObject)ConsesLow.list($ic248$, module0751.f47118(), var320);
        return module0770.f49067(var322, (SubLObject)$ic249$, (SubLObject)$ic250$, (SubLObject)$ic2$, (SubLObject)$ic2$, module0579.$g4259$.getDynamicValue(var321), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49863(final SubLObject var320, final SubLObject var475, SubLObject var473) {
        if (var473 == UNPROVIDED) {
            var473 = (SubLObject)NIL;
        }
        final SubLThread var476 = SubLProcess.currentSubLThread();
        if (!var473.isString()) {
            var473 = module0770.f49067(var320, var475, (SubLObject)$ic2$, (SubLObject)$ic2$, (SubLObject)$ic2$, module0579.$g4259$.getDynamicValue(var476), (SubLObject)UNPROVIDED);
        }
        if (var473.isString()) {
            module0642.f39020(var473);
        }
        else {
            module0642.f39019(var320);
        }
        return var320;
    }
    
    public static SubLObject f49682(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g6226$.getDynamicValue(var27) && NIL != f49886(var26));
    }
    
    public static SubLObject f49886(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != module0377.f26776(var26)) {
            var27 = f49887(var26);
        }
        return var27;
    }
    
    public static SubLObject f49887(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        final SubLObject var28 = module0507.f32389(var26);
        SubLObject var29 = (SubLObject)NIL;
        final SubLObject var30 = module0146.$g2007$.currentBinding(var27);
        try {
            module0146.$g2007$.bind((SubLObject)NIL, var27);
            var29 = module0751.f46781((SubLObject)$ic251$, (SubLObject)ConsesLow.list($ic252$, (SubLObject)$ic251$, var28), module0579.$g4260$.getDynamicValue(var27), (SubLObject)$ic253$);
        }
        finally {
            module0146.$g2007$.rebind(var30, var27);
        }
        return f49888(var26, var29);
    }
    
    public static SubLObject f49888(final SubLObject var26, final SubLObject var480) {
        return var480.first();
    }
    
    public static SubLObject f49768(final SubLObject var26, final SubLObject var29, final SubLObject var90, SubLObject var137) {
        if (var137 == UNPROVIDED) {
            var137 = (SubLObject)NIL;
        }
        final SubLObject var138 = f49887(var26);
        f49889(var26, var138, var29, var90);
        f49890(var26, var138, var29, var90);
        f49891(var26, var138, var29, var90, var137);
        f49718(var26);
        f49738(var26);
        return var26;
    }
    
    public static SubLObject f49892(final SubLObject var481, final SubLObject var478) {
        final SubLObject var482 = (SubLObject)$ic254$;
        return module0035.f2293(var482, var481, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49889(final SubLObject var26, final SubLObject var478, final SubLObject var29, final SubLObject var90) {
        final SubLThread var479 = SubLProcess.currentSubLThread();
        final SubLObject var480 = module0377.f26833(var26);
        SubLObject var481 = (SubLObject)NIL;
        SubLObject var482 = (SubLObject)NIL;
        SubLObject var483 = (SubLObject)NIL;
        var481 = f49893(var478);
        var482 = var481.first();
        for (var483 = (SubLObject)ZERO_INTEGER; NIL != var481; var481 = var481.rest(), var482 = var481.first(), var483 = Numbers.add((SubLObject)ONE_INTEGER, var483)) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            if (var483.isZero()) {
                module0642.f39019((SubLObject)$ic255$);
            }
            else {
                module0642.f39019((SubLObject)$ic256$);
            }
            final SubLObject var484 = module0233.f15362(var480, var482);
            final SubLObject var485 = module0579.$g4239$.currentBinding(var479);
            try {
                module0579.$g4239$.bind((SubLObject)ZERO_INTEGER, var479);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic119$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_486 = module0015.$g533$.currentBinding(var479);
                try {
                    module0015.$g533$.bind((SubLObject)T, var479);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_487 = module0015.$g533$.currentBinding(var479);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var479);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic120$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_488 = module0015.$g533$.currentBinding(var479);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var479);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_488, var479);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_489 = module0015.$g533$.currentBinding(var479);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var479);
                            f49684(var484, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_489, var479);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_487, var479);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var10_486, var479);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            finally {
                module0579.$g4239$.rebind(var485, var479);
            }
        }
        return var26;
    }
    
    public static SubLObject f49893(final SubLObject var478) {
        return module0751.f46781((SubLObject)$ic257$, (SubLObject)ConsesLow.listS($ic258$, var478, (SubLObject)$ic259$), $ic135$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49894(final SubLObject var478) {
        return (SubLObject)T;
    }
    
    public static SubLObject f49895(final SubLObject var478) {
        final SubLObject var479 = (SubLObject)$ic260$;
        module0642.f39019(var479);
        return var478;
    }
    
    public static SubLObject f49896(final SubLObject var478, final SubLObject var26, final SubLObject var29, final SubLObject var90) {
        if (NIL != module0337.f22630(f49705(var26, var29), (SubLObject)$ic261$)) {
            f49676(var26, var29, var90);
        }
        SubLObject var479 = module0366.f24938(var26);
        SubLObject var480 = (SubLObject)NIL;
        var480 = var479.first();
        while (NIL != var479) {
            final SubLObject var481 = Sequences.cconcatenate(var90, (SubLObject)$ic262$);
            f49896(var478, var480, var29, var481);
            var479 = var479.rest();
            var480 = var479.first();
        }
        return var478;
    }
    
    public static SubLObject f49890(final SubLObject var26, final SubLObject var478, final SubLObject var29, final SubLObject var90) {
        final SubLObject var479 = module0751.f46781((SubLObject)$ic263$, (SubLObject)ConsesLow.listS($ic264$, var478, (SubLObject)$ic265$), $ic135$, (SubLObject)UNPROVIDED);
        final SubLObject var480 = module0377.f26833(var26);
        SubLObject var481 = (SubLObject)NIL;
        if (NIL == var481) {
            SubLObject var482 = var479;
            SubLObject var483 = (SubLObject)NIL;
            var483 = var482.first();
            while (NIL == var481 && NIL != var482) {
                final SubLObject var484 = module0751.f46823(module0233.f15362(var480, var483), (SubLObject)NIL);
                final SubLObject var485 = module0763.f48248(var484, (SubLObject)UNPROVIDED);
                module0758.f47878(var485, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0756.f47479(var485)) {
                    module0642.f39019((SubLObject)$ic266$);
                    f49684(var484, module0756.f47480(var485, (SubLObject)T), (SubLObject)NIL);
                    var481 = (SubLObject)T;
                }
                var482 = var482.rest();
                var483 = var482.first();
            }
        }
        return var26;
    }
    
    public static SubLObject f49897(final SubLObject var26, final SubLObject var478, final SubLObject var29, final SubLObject var90) {
        final SubLThread var479 = SubLProcess.currentSubLThread();
        final SubLObject var480 = module0377.f26833(var26);
        final SubLObject var481 = f49898(var478);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var482 = module0015.$g533$.currentBinding(var479);
        try {
            module0015.$g533$.bind((SubLObject)T, var479);
            SubLObject var483 = var481;
            SubLObject var484 = (SubLObject)NIL;
            var484 = var483.first();
            while (NIL != var483) {
                module0642.f39026((SubLObject)UNPROVIDED);
                final SubLObject var485 = f49892(var484, var478);
                final SubLObject var486 = module0233.f15369(var484, var480);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_499 = module0015.$g533$.currentBinding(var479);
                try {
                    module0015.$g533$.bind((SubLObject)T, var479);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic267$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_500 = module0015.$g533$.currentBinding(var479);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var479);
                        module0642.f39020(var485);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_500, var479);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic269$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_501 = module0015.$g533$.currentBinding(var479);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var479);
                        module0642.f39027((SubLObject)$ic270$, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic271$);
                        module0642.f39027((SubLObject)$ic270$, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_501, var479);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39046(module0015.$g369$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic272$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_502 = module0015.$g533$.currentBinding(var479);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var479);
                        module0656.f39804(var486, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_502, var479);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_499, var479);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                var483 = var483.rest();
                var484 = var483.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var482, var479);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var26;
    }
    
    public static SubLObject f49898(final SubLObject var478) {
        return (SubLObject)$ic273$;
    }
    
    public static SubLObject f49891(final SubLObject var26, final SubLObject var478, final SubLObject var29, final SubLObject var90, final SubLObject var137) {
        final SubLObject var479 = f49673(var26, var29);
        f49766(var479, var137, (SubLObject)NIL);
        return var26;
    }
    
    public static SubLObject f49899(final SubLObject var1, SubLObject var2, SubLObject var503) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var503 == UNPROVIDED) {
            var503 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != Types.integerp(var1) : var1;
        assert NIL != Types.integerp(var2) : var2;
        assert NIL != Types.integerp(var503) : var503;
        final SubLObject var504 = module0361.f24195(var1, var2);
        final SubLObject var505 = inference_datastructures_inference_oc.f25616(var504, var503);
        final SubLObject var506 = Sort.sort(f49679(var505), Symbols.symbol_function((SubLObject)$ic24$), (SubLObject)$ic275$);
        SubLObject var507 = (SubLObject)NIL;
        module0642.f39020((SubLObject)$ic276$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        SubLObject var508 = var506;
        SubLObject var509 = (SubLObject)NIL;
        var509 = var508.first();
        while (NIL != var508) {
            final SubLObject var510 = f49670(var504);
            final SubLObject var511 = module0773.f49487(var509, var505, var510);
            var507 = (SubLObject)ConsesLow.cons(var511, var507);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0656.f39804(var511, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39028((SubLObject)UNPROVIDED);
            f49900(var511, (SubLObject)UNPROVIDED);
            var508 = var508.rest();
            var509 = var508.first();
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var507;
    }
    
    public static SubLObject f49900(SubLObject var372, SubLObject var505) {
        if (var505 == UNPROVIDED) {
            var505 = module0773.f49329(var372);
        }
        final SubLThread var506 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f106(var372)) {
            var372 = module0773.f49287(var372);
        }
        assert NIL != module0773.f49284(var372) : var372;
        final SubLObject var508;
        final SubLObject var507 = var508 = module0773.f49303(var372);
        final SubLObject var509 = module0034.$g879$.currentBinding(var506);
        try {
            module0034.$g879$.bind(var508, var506);
            SubLObject var510 = (SubLObject)NIL;
            if (NIL != var508 && NIL == module0034.f1842(var508)) {
                var510 = module0034.f1869(var508);
                final SubLObject var511 = Threads.current_process();
                if (NIL == var510) {
                    module0034.f1873(var508, var511);
                }
                else if (!var510.eql(var511)) {
                    Errors.error((SubLObject)$ic23$);
                }
            }
            try {
                module0642.f39020(module0015.$g144$.getGlobalValue());
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic278$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_507 = module0015.$g533$.currentBinding(var506);
                try {
                    module0015.$g533$.bind((SubLObject)T, var506);
                    f49901(var505);
                    if (NIL != var505) {
                        f49902(var372);
                    }
                    final SubLObject var10_508 = module0579.$g4351$.currentBinding(var506);
                    try {
                        module0579.$g4351$.bind((SubLObject)NIL, var506);
                        final SubLObject var512 = module0773.f49394(var372);
                        final SubLObject var513 = module0773.f49399(var512);
                        final SubLObject var514 = Sequences.find((SubLObject)$ic279$, var513, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic280$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var515 = Sequences.find(module0773.$g6177$.getDynamicValue(var506), var513, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic280$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var516 = Sequences.find(module0773.$g6175$.getDynamicValue(var506), var513, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic280$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var517 = Sequences.find(module0773.$g6176$.getDynamicValue(var506), var513, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic280$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var518 = (SubLObject)NIL;
                        if (NIL != var517) {
                            var518 = (SubLObject)ConsesLow.cons(var517, var518);
                        }
                        if (NIL != var516) {
                            var518 = (SubLObject)ConsesLow.cons(var516, var518);
                        }
                        if (NIL != var515) {
                            var518 = (SubLObject)ConsesLow.cons(var515, var518);
                        }
                        f49903(var514, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic281$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic282$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_509 = module0015.$g533$.currentBinding(var506);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var506);
                            module0642.f39020(module0015.$g264$.getGlobalValue());
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic283$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_510 = module0015.$g533$.currentBinding(var506);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var506);
                                final SubLObject var519 = module0035.find_if_not((SubLObject)$ic284$, var518, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                SubLObject var520 = var518;
                                SubLObject var521 = (SubLObject)NIL;
                                var521 = var520.first();
                                while (NIL != var520) {
                                    if (NIL == module0773.f49259(var521)) {
                                        final SubLObject var522 = Sequences.cconcatenate((SubLObject)$ic285$, f49904(var521));
                                        final SubLObject var523 = (SubLObject)(var521.equal(var519) ? $ic286$ : $ic36$);
                                        module0642.f39020(module0015.$g275$.getGlobalValue());
                                        if (NIL != var523) {
                                            module0642.f39020(module0015.$g158$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(var523);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var10_511 = module0015.$g533$.currentBinding(var506);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var506);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(var522);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var10_512 = module0015.$g533$.currentBinding(var506);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var506);
                                                module0642.f39020(module0015.$g217$.getGlobalValue());
                                                PrintLow.format(module0015.$g131$.getDynamicValue(var506), module0773.f49260(var521));
                                                module0642.f39020(module0015.$g218$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var10_512, var506);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var10_511, var506);
                                        }
                                        module0642.f39020(module0015.$g276$.getGlobalValue());
                                        module0773.f49409(var521);
                                    }
                                    var520 = var520.rest();
                                    var521 = var520.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var10_510, var506);
                            }
                            module0642.f39020(module0015.$g265$.getGlobalValue());
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g158$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic287$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_513 = module0015.$g533$.currentBinding(var506);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var506);
                                SubLObject var524 = (SubLObject)NIL;
                                SubLObject var525 = (SubLObject)NIL;
                                SubLObject var526 = (SubLObject)NIL;
                                var524 = var518;
                                var525 = var524.first();
                                for (var526 = (SubLObject)ZERO_INTEGER; NIL != var524; var524 = var524.rest(), var525 = var524.first(), var526 = Numbers.add((SubLObject)ONE_INTEGER, var526)) {
                                    if (NIL == module0773.f49259(var525)) {
                                        final SubLObject var527 = f49904(var525);
                                        module0642.f39020(module0015.$g144$.getGlobalValue());
                                        if (NIL != var527) {
                                            module0642.f39020(module0015.$g157$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(var527);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        }
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var10_514 = module0015.$g533$.currentBinding(var506);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var506);
                                            f49903(var525, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var10_514, var506);
                                        }
                                        module0642.f39020(module0015.$g145$.getGlobalValue());
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var10_513, var506);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            SubLObject var528 = var513;
                            SubLObject var529 = (SubLObject)NIL;
                            var529 = var528.first();
                            while (NIL != var528) {
                                if (!var514.eql(var529) && NIL == module0004.f104(var529, var518, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0773.f49259(var529)) {
                                    f49903(var529, (SubLObject)UNPROVIDED);
                                }
                                var528 = var528.rest();
                                var529 = var528.first();
                            }
                            if (NIL != var505) {
                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                module0642.f39020(module0015.$g157$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic288$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_515 = module0015.$g533$.currentBinding(var506);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var506);
                                    f49905(var372);
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_515, var506);
                                }
                                module0642.f39020(module0015.$g145$.getGlobalValue());
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var10_509, var506);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                    }
                    finally {
                        module0579.$g4351$.rebind(var10_508, var506);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var10_507, var506);
                }
                module0642.f39020(module0015.$g145$.getGlobalValue());
            }
            finally {
                final SubLObject var10_516 = Threads.$is_thread_performing_cleanupP$.currentBinding(var506);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var506);
                    if (NIL != var508 && NIL == var510) {
                        module0034.f1873(var508, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_516, var506);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var509, var506);
        }
        module0773.f49367(var372, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49904(final SubLObject var531) {
        return Sequences.cconcatenate((SubLObject)$ic289$, module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic290$), module0773.f49260(var531), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49901(final SubLObject var532) {
        final SubLThread var533 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic291$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var534 = module0015.$g533$.currentBinding(var533);
        try {
            module0015.$g533$.bind((SubLObject)T, var533);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic292$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_533 = module0015.$g533$.currentBinding(var533);
            try {
                module0015.$g533$.bind((SubLObject)T, var533);
                if (NIL != var532) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic293$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_534 = module0015.$g533$.currentBinding(var533);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var533);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g309$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic294$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic295$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic296$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var533), (SubLObject)$ic295$);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_534, var533);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                module0642.f39020(module0015.$g149$.getGlobalValue());
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic297$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_535 = module0015.$g533$.currentBinding(var533);
                try {
                    module0015.$g533$.bind((SubLObject)T, var533);
                    module0642.f39020(module0015.$g295$.getGlobalValue());
                    module0642.f39020(module0015.$g305$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g309$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic298$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g302$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic299$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g160$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic300$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var533), (SubLObject)$ic301$);
                }
                finally {
                    module0015.$g533$.rebind(var10_535, var533);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var10_533, var533);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var534, var533);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49902(final SubLObject var372) {
        final SubLThread var373 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic119$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var374 = module0015.$g533$.currentBinding(var373);
        try {
            module0015.$g533$.bind((SubLObject)T, var373);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_536 = module0015.$g533$.currentBinding(var373);
            try {
                module0015.$g533$.bind((SubLObject)T, var373);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic120$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_537 = module0015.$g533$.currentBinding(var373);
                try {
                    module0015.$g533$.bind((SubLObject)T, var373);
                }
                finally {
                    module0015.$g533$.rebind(var10_537, var373);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_538 = module0015.$g533$.currentBinding(var373);
                try {
                    module0015.$g533$.bind((SubLObject)T, var373);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic302$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_539 = module0015.$g533$.currentBinding(var373);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var373);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_540 = module0015.$g533$.currentBinding(var373);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var373);
                            final SubLObject var375 = module0015.$g522$.getGlobalValue();
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var375) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var375);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_541 = module0015.$g533$.currentBinding(var373);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var373);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var373), (SubLObject)$ic303$);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_541, var373);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_540, var373);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        SubLObject var376 = module0773.f49265(var372);
                        SubLObject var377 = (SubLObject)NIL;
                        var377 = var376.first();
                        while (NIL != var376) {
                            SubLObject var379;
                            final SubLObject var378 = var379 = var377;
                            SubLObject var380 = (SubLObject)NIL;
                            SubLObject var381 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var379, var378, (SubLObject)$ic304$);
                            var380 = var379.first();
                            var379 = (var381 = var379.rest());
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_542 = module0015.$g533$.currentBinding(var373);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var373);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic305$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_543 = module0015.$g533$.currentBinding(var373);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var373);
                                    module0642.f39019(var380);
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_543, var373);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic306$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_544 = module0015.$g533$.currentBinding(var373);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var373);
                                    module0656.f39804(var381, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_544, var373);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_542, var373);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            var376 = var376.rest();
                            var377 = var376.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var10_539, var373);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_538, var373);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var10_536, var373);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var374, var373);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49906() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic119$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_550 = module0015.$g533$.currentBinding(var5);
            try {
                module0015.$g533$.bind((SubLObject)T, var5);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic120$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_551 = module0015.$g533$.currentBinding(var5);
                try {
                    module0015.$g533$.bind((SubLObject)T, var5);
                }
                finally {
                    module0015.$g533$.rebind(var10_551, var5);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_552 = module0015.$g533$.currentBinding(var5);
                try {
                    module0015.$g533$.bind((SubLObject)T, var5);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic307$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_553 = module0015.$g533$.currentBinding(var5);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var5);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_554 = module0015.$g533$.currentBinding(var5);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var5);
                            final SubLObject var7 = module0015.$g522$.getGlobalValue();
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            if (NIL != var7) {
                                module0642.f39020(module0015.$g374$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var7);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_555 = module0015.$g533$.currentBinding(var5);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var5);
                                PrintLow.format(module0015.$g131$.getDynamicValue(var5), (SubLObject)$ic308$);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_555, var5);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_554, var5);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        SubLObject var8 = (SubLObject)$ic310$;
                        SubLObject var9 = (SubLObject)NIL;
                        var9 = var8.first();
                        while (NIL != var8) {
                            SubLObject var11;
                            final SubLObject var10 = var11 = var9;
                            SubLObject var12 = (SubLObject)NIL;
                            SubLObject var13 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic309$);
                            var12 = var11.first();
                            var11 = (var13 = var11.rest());
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_556 = module0015.$g533$.currentBinding(var5);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var5);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_557 = module0015.$g533$.currentBinding(var5);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var5);
                                    module0642.f39020(module0015.$g381$.getGlobalValue());
                                    module0642.f39020(module0015.$g383$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var12);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var10_558 = module0015.$g533$.currentBinding(var5);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var5);
                                        module0642.f39019(var13);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_558, var5);
                                    }
                                    module0642.f39020(module0015.$g382$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_557, var5);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_556, var5);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            var8 = var8.rest();
                            var9 = var8.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var10_553, var5);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_552, var5);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var10_550, var5);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49907(final SubLObject var563) {
        final SubLThread var564 = SubLProcess.currentSubLThread();
        final SubLObject var565 = module0773.f49260(var563);
        SubLObject var566 = (SubLObject)NIL;
        if (var565.equal((SubLObject)$ic279$)) {
            var566 = (SubLObject)$ic311$;
        }
        else if (var565.equal((SubLObject)$ic312$)) {
            var566 = (SubLObject)$ic313$;
        }
        else if (var565.equal((SubLObject)$ic314$)) {
            var566 = (SubLObject)$ic315$;
        }
        else if (var565.equal((SubLObject)$ic316$)) {
            var566 = (SubLObject)$ic317$;
        }
        else if (var565.equal((SubLObject)$ic318$)) {
            var566 = (SubLObject)$ic319$;
        }
        else if (var565.equal((SubLObject)$ic320$)) {
            var566 = (SubLObject)$ic321$;
        }
        if (NIL != var566) {
            module0642.f39020(module0015.$g381$.getGlobalValue());
            if (NIL != var566) {
                module0642.f39020(module0015.$g384$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var566);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var567 = module0015.$g533$.currentBinding(var564);
            try {
                module0015.$g533$.bind((SubLObject)T, var564);
            }
            finally {
                module0015.$g533$.rebind(var567, var564);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var566;
    }
    
    public static SubLObject f49908(final SubLObject var332, final SubLObject var333) {
        final SubLObject var334 = var332.rest();
        final SubLObject var336;
        final SubLObject var335 = var336 = var334;
        return (SubLObject)ConsesLow.list((SubLObject)$ic113$, (SubLObject)ConsesLow.list((SubLObject)$ic114$, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic322$, (SubLObject)ConsesLow.listS((SubLObject)$ic323$, (SubLObject)$ic324$, ConsesLow.append(var336, (SubLObject)NIL)))));
    }
    
    public static SubLObject f49905(final SubLObject var372) {
        final SubLThread var373 = SubLProcess.currentSubLThread();
        final SubLObject var374 = module0773.f49320(var372);
        if (NIL != var374 && NIL == module0067.f4882(var374)) {
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g384$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic325$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var375 = module0015.$g533$.currentBinding(var373);
            try {
                module0015.$g533$.bind((SubLObject)T, var373);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic119$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_568 = module0015.$g533$.currentBinding(var373);
                try {
                    module0015.$g533$.bind((SubLObject)T, var373);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_569 = module0015.$g533$.currentBinding(var373);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var373);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic120$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_570 = module0015.$g533$.currentBinding(var373);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var373);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_570, var373);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_571 = module0015.$g533$.currentBinding(var373);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var373);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)ONE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_572 = module0015.$g533$.currentBinding(var373);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var373);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_573 = module0015.$g533$.currentBinding(var373);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var373);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var10_574 = module0015.$g533$.currentBinding(var373);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var373);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var373), (SubLObject)$ic326$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_574, var373);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_573, var373);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_575 = module0015.$g533$.currentBinding(var373);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var373);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var10_576 = module0015.$g533$.currentBinding(var373);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var373);
                                        module0642.f39020(module0015.$g346$.getGlobalValue());
                                        module0642.f39020(module0015.$g158$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic119$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g352$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)ZERO_INTEGER);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var10_577 = module0015.$g533$.currentBinding(var373);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var373);
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var10_578 = module0015.$g533$.currentBinding(var373);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var373);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020((SubLObject)$ic120$);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var10_579 = module0015.$g533$.currentBinding(var373);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var373);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var10_579, var373);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var10_580 = module0015.$g533$.currentBinding(var373);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var373);
                                                    module0642.f39020(module0015.$g346$.getGlobalValue());
                                                    module0642.f39020(module0015.$g352$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020((SubLObject)ONE_INTEGER);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                    final SubLObject var10_581 = module0015.$g533$.currentBinding(var373);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)T, var373);
                                                        SubLObject var376;
                                                        for (var376 = module0066.f4838(module0067.f4891(var374)); NIL == module0066.f4841(var376); var376 = module0066.f4840(var376)) {
                                                            var373.resetMultipleValues();
                                                            final SubLObject var377 = module0066.f4839(var376);
                                                            final SubLObject var378 = var373.secondMultipleValue();
                                                            var373.resetMultipleValues();
                                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                            final SubLObject var10_582 = module0015.$g533$.currentBinding(var373);
                                                            try {
                                                                module0015.$g533$.bind((SubLObject)T, var373);
                                                                final SubLObject var379 = module0015.$g522$.getGlobalValue();
                                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                                if (NIL != var379) {
                                                                    module0642.f39020(module0015.$g374$.getGlobalValue());
                                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                    module0642.f39020(var379);
                                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                }
                                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                final SubLObject var10_583 = module0015.$g533$.currentBinding(var373);
                                                                try {
                                                                    module0015.$g533$.bind((SubLObject)T, var373);
                                                                    PrintLow.format(module0015.$g131$.getDynamicValue(var373), (SubLObject)$ic327$, var377);
                                                                }
                                                                finally {
                                                                    module0015.$g533$.rebind(var10_583, var373);
                                                                }
                                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                                            }
                                                            finally {
                                                                module0015.$g533$.rebind(var10_582, var373);
                                                            }
                                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                                            module0642.f39029((SubLObject)UNPROVIDED);
                                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                            final SubLObject var10_584 = module0015.$g533$.currentBinding(var373);
                                                            try {
                                                                module0015.$g533$.bind((SubLObject)T, var373);
                                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                final SubLObject var10_585 = module0015.$g533$.currentBinding(var373);
                                                                try {
                                                                    module0015.$g533$.bind((SubLObject)T, var373);
                                                                    module0642.f39020(module0015.$g346$.getGlobalValue());
                                                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                    module0642.f39020((SubLObject)$ic119$);
                                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                    module0642.f39020(module0015.$g352$.getGlobalValue());
                                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                    module0642.f39020((SubLObject)ZERO_INTEGER);
                                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                    final SubLObject var10_586 = module0015.$g533$.currentBinding(var373);
                                                                    try {
                                                                        module0015.$g533$.bind((SubLObject)T, var373);
                                                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                        final SubLObject var10_587 = module0015.$g533$.currentBinding(var373);
                                                                        try {
                                                                            module0015.$g533$.bind((SubLObject)T, var373);
                                                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                                                            module0642.f39020(module0015.$g158$.getGlobalValue());
                                                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                            module0642.f39020((SubLObject)$ic120$);
                                                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                            final SubLObject var10_588 = module0015.$g533$.currentBinding(var373);
                                                                            try {
                                                                                module0015.$g533$.bind((SubLObject)T, var373);
                                                                            }
                                                                            finally {
                                                                                module0015.$g533$.rebind(var10_588, var373);
                                                                            }
                                                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                            final SubLObject var10_589 = module0015.$g533$.currentBinding(var373);
                                                                            try {
                                                                                module0015.$g533$.bind((SubLObject)T, var373);
                                                                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                                                                module0642.f39020(module0015.$g352$.getGlobalValue());
                                                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                                module0642.f39020((SubLObject)ONE_INTEGER);
                                                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                                final SubLObject var10_590 = module0015.$g533$.currentBinding(var373);
                                                                                try {
                                                                                    module0015.$g533$.bind((SubLObject)T, var373);
                                                                                    SubLObject var380 = var378;
                                                                                    SubLObject var381 = (SubLObject)NIL;
                                                                                    var381 = var380.first();
                                                                                    while (NIL != var380) {
                                                                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                                                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                                        final SubLObject var10_591 = module0015.$g533$.currentBinding(var373);
                                                                                        try {
                                                                                            module0015.$g533$.bind((SubLObject)T, var373);
                                                                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                                                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                                                            final SubLObject var10_592 = module0015.$g533$.currentBinding(var373);
                                                                                            try {
                                                                                                module0015.$g533$.bind((SubLObject)T, var373);
                                                                                                module0656.f39804(var381, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                                                                            }
                                                                                            finally {
                                                                                                module0015.$g533$.rebind(var10_592, var373);
                                                                                            }
                                                                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                                                                        }
                                                                                        finally {
                                                                                            module0015.$g533$.rebind(var10_591, var373);
                                                                                        }
                                                                                        module0642.f39020(module0015.$g365$.getGlobalValue());
                                                                                        module0642.f39029((SubLObject)UNPROVIDED);
                                                                                        var380 = var380.rest();
                                                                                        var381 = var380.first();
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0015.$g533$.rebind(var10_590, var373);
                                                                                }
                                                                                module0642.f39020(module0015.$g347$.getGlobalValue());
                                                                            }
                                                                            finally {
                                                                                module0015.$g533$.rebind(var10_589, var373);
                                                                            }
                                                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                                                        }
                                                                        finally {
                                                                            module0015.$g533$.rebind(var10_587, var373);
                                                                        }
                                                                        module0642.f39020(module0015.$g365$.getGlobalValue());
                                                                        module0642.f39029((SubLObject)UNPROVIDED);
                                                                    }
                                                                    finally {
                                                                        module0015.$g533$.rebind(var10_586, var373);
                                                                    }
                                                                    module0642.f39020(module0015.$g347$.getGlobalValue());
                                                                }
                                                                finally {
                                                                    module0015.$g533$.rebind(var10_585, var373);
                                                                }
                                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                                            }
                                                            finally {
                                                                module0015.$g533$.rebind(var10_584, var373);
                                                            }
                                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                                            module0642.f39029((SubLObject)UNPROVIDED);
                                                        }
                                                        module0066.f4842(var376);
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var10_581, var373);
                                                    }
                                                    module0642.f39020(module0015.$g347$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var10_580, var373);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var10_578, var373);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var10_577, var373);
                                        }
                                        module0642.f39020(module0015.$g347$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_576, var373);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_575, var373);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var10_572, var373);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_571, var373);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_569, var373);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var10_568, var373);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var375, var373);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var372;
    }
    
    public static SubLObject f49903(final SubLObject var563, SubLObject var594) {
        if (var594 == UNPROVIDED) {
            var594 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var595 = SubLProcess.currentSubLThread();
        final SubLObject var596 = module0773.f49439(var563);
        final SubLObject var597 = Functions.funcall((SubLObject)makeSymbol("S#54196", "CYC"), var596, (SubLObject)$ic328$);
        final SubLObject var598 = module0773.f49391(var563);
        final SubLObject var599 = Sequences.cconcatenate((SubLObject)$ic329$, module0006.f203(var598));
        f49907(var563);
        final SubLObject var600 = f49909(var563);
        final SubLObject var601 = module0035.sublisp_boolean(module0773.f49399(var563));
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic119$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var602 = module0015.$g533$.currentBinding(var595);
        try {
            module0015.$g533$.bind((SubLObject)T, var595);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_600 = module0015.$g533$.currentBinding(var595);
            try {
                module0015.$g533$.bind((SubLObject)T, var595);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic120$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_601 = module0015.$g533$.currentBinding(var595);
                try {
                    module0015.$g533$.bind((SubLObject)T, var595);
                    if (var594.numG((SubLObject)ZERO_INTEGER) && NIL != var601) {
                        module0016.f923(var599, (SubLObject)$ic36$);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var10_601, var595);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_602 = module0015.$g533$.currentBinding(var595);
                try {
                    module0015.$g533$.bind((SubLObject)T, var595);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    if (NIL != var600) {
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var600);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_603 = module0015.$g533$.currentBinding(var595);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var595);
                        if (NIL != module0038.f2653(module0773.f49260(var563))) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_604 = module0015.$g533$.currentBinding(var595);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var595);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic330$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_605 = module0015.$g533$.currentBinding(var595);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var595);
                                    module0642.f39020(module0015.$g149$.getGlobalValue());
                                    module0642.f39020(module0015.$g158$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic331$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var10_606 = module0015.$g533$.currentBinding(var595);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var595);
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var595), (SubLObject)$ic332$, module0773.f49260(var563));
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_606, var595);
                                    }
                                    module0642.f39020(module0015.$g150$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_605, var595);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_604, var595);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_607 = module0015.$g533$.currentBinding(var595);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var595);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var10_608 = module0015.$g533$.currentBinding(var595);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var595);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic333$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_609 = module0015.$g533$.currentBinding(var595);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var595);
                                    SubLObject var603 = module0773.f49405(var563);
                                    SubLObject var604 = module0773.f49404(var563);
                                    if (NIL != var603) {
                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                        module0642.f39020(module0015.$g158$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic334$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var10_610 = module0015.$g533$.currentBinding(var595);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var595);
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var10_611 = module0015.$g533$.currentBinding(var595);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var595);
                                                module0642.f39020(module0015.$g149$.getGlobalValue());
                                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020((SubLObject)$ic329$);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var10_612 = module0015.$g533$.currentBinding(var595);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var595);
                                                    PrintLow.format(module0015.$g131$.getDynamicValue(var595), (SubLObject)$ic335$, var598);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var10_612, var595);
                                                }
                                                module0642.f39020(module0015.$g150$.getGlobalValue());
                                                module0642.f39020(var597);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var10_611, var595);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var10_610, var595);
                                        }
                                        module0642.f39020(module0015.$g365$.getGlobalValue());
                                        module0642.f39029((SubLObject)UNPROVIDED);
                                        while (NIL != module0773.f49371(var603)) {
                                            var604 = module0773.f49404(var603);
                                            var603 = module0773.f49405(var603);
                                        }
                                        if (NIL != f49910(var604)) {
                                            final SubLObject var521_614 = (SubLObject)((NIL != module0773.f49371(var603) || NIL != module0035.f2192((SubLObject)$ic336$, var603)) ? $ic337$ : $ic338$);
                                            module0642.f39020(module0015.$g364$.getGlobalValue());
                                            if (NIL != var521_614) {
                                                module0642.f39020(module0015.$g158$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020(var521_614);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            }
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var10_613 = module0015.$g533$.currentBinding(var595);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var595);
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var10_614 = module0015.$g533$.currentBinding(var595);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var595);
                                                    if (NIL != module0191.f11950(var603)) {
                                                        module0671.f41002(var603, (SubLObject)UNPROVIDED);
                                                    }
                                                    else {
                                                        module0656.f39804(var603, var594, (SubLObject)T);
                                                    }
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var10_614, var595);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var10_613, var595);
                                            }
                                            module0642.f39020(module0015.$g365$.getGlobalValue());
                                            module0642.f39029((SubLObject)UNPROVIDED);
                                        }
                                    }
                                    final SubLObject var605 = module0773.f49399(var563);
                                    final SubLObject var606 = f49911(var563, var594);
                                    if (NIL != var605) {
                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                        module0642.f39020(module0015.$g158$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic339$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var10_615 = module0015.$g533$.currentBinding(var595);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var595);
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var10_616 = module0015.$g533$.currentBinding(var595);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var595);
                                                module0016.f908(var599, var606, (SubLObject)$ic38$);
                                                module0642.f39020(module0015.$g144$.getGlobalValue());
                                                if (NIL != var599) {
                                                    module0642.f39020(module0015.$g157$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var599);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var10_617 = module0015.$g533$.currentBinding(var595);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var595);
                                                    SubLObject var607 = var605;
                                                    SubLObject var608 = (SubLObject)NIL;
                                                    var608 = var607.first();
                                                    while (NIL != var607) {
                                                        f49903(var608, Numbers.add(var594, (SubLObject)ONE_INTEGER));
                                                        var607 = var607.rest();
                                                        var608 = var607.first();
                                                    }
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var10_617, var595);
                                                }
                                                module0642.f39020(module0015.$g145$.getGlobalValue());
                                                module0642.f39029((SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var10_616, var595);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var10_615, var595);
                                        }
                                        module0642.f39020(module0015.$g365$.getGlobalValue());
                                        module0642.f39029((SubLObject)UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_609, var595);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var10_608, var595);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var10_607, var595);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_603, var595);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_602, var595);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var10_600, var595);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var602, var595);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49911(final SubLObject var563, final SubLObject var594) {
        return (SubLObject)((NIL != module0773.f49434(var563)) ? $ic340$ : $ic37$);
    }
    
    public static SubLObject f49909(final SubLObject var531) {
        final SubLObject var533;
        final SubLObject var532 = var533 = module0773.f49404(var531);
        if (var533.eql((SubLObject)$ic341$)) {
            return Sequences.cconcatenate((SubLObject)$ic342$, f49912(module0773.f49260(var531)));
        }
        return Sequences.cconcatenate((SubLObject)$ic342$, f49912(var532));
    }
    
    public static SubLObject f49912(final SubLObject var320) {
        return module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_space, Sequences.cconcatenate((SubLObject)$ic343$, Strings.string_downcase(module0035.remove_if_not((SubLObject)$ic290$, print_high.princ_to_string(var320), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f49910(final SubLObject var610) {
        return (SubLObject)makeBoolean(NIL == conses_high.member(var610, (SubLObject)$ic344$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49913(final SubLObject var441, final SubLObject var621, final SubLObject var622, final SubLObject var623) {
        final SubLThread var624 = SubLProcess.currentSubLThread();
        SubLObject var625 = (SubLObject)NIL;
        SubLObject var626 = (SubLObject)NIL;
        if (NIL != constant_handles_oc.f8449(var441)) {
            SubLObject var627 = (SubLObject)NIL;
            try {
                var627 = streams_high.make_private_string_output_stream();
                final SubLObject var628 = module0015.$g131$.currentBinding(var624);
                try {
                    module0015.$g131$.bind(var627, var624);
                    module0656.f39841(var441, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g131$.rebind(var628, var624);
                }
                var625 = streams_high.get_output_stream_string(var627);
            }
            finally {
                final SubLObject var629 = Threads.$is_thread_performing_cleanupP$.currentBinding(var624);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var624);
                    streams_high.close(var627, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var629, var624);
                }
            }
            var626 = module0590.f36050(var625, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(var626.first(), var622, conses_high.second(var626));
        }
        if (NIL != module0167.f10813(var441)) {
            SubLObject var627 = (SubLObject)NIL;
            try {
                var627 = streams_high.make_private_string_output_stream();
                final SubLObject var628 = module0015.$g131$.currentBinding(var624);
                try {
                    module0015.$g131$.bind(var627, var624);
                    module0656.f39845(var441, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g131$.rebind(var628, var624);
                }
                var625 = streams_high.get_output_stream_string(var627);
            }
            finally {
                final SubLObject var630 = Threads.$is_thread_performing_cleanupP$.currentBinding(var624);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var624);
                    streams_high.close(var627, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var630, var624);
                }
            }
            var626 = module0590.f36050(var625, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(var626.first(), var622, conses_high.second(var626));
        }
        if (NIL != module0206.f13453(var441)) {
            SubLObject var627 = (SubLObject)NIL;
            try {
                var627 = streams_high.make_private_string_output_stream();
                final SubLObject var628 = module0015.$g131$.currentBinding(var624);
                try {
                    module0015.$g131$.bind(var627, var624);
                    module0656.f39847(var441, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g131$.rebind(var628, var624);
                }
                var625 = streams_high.get_output_stream_string(var627);
            }
            finally {
                final SubLObject var631 = Threads.$is_thread_performing_cleanupP$.currentBinding(var624);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var624);
                    streams_high.close(var627, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var631, var624);
                }
            }
            var626 = module0590.f36050(var625, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(var626.first(), var622, conses_high.second(var626));
        }
        return (SubLObject)ConsesLow.list(var621, var622, var623);
    }
    
    public static SubLObject f49914(final SubLObject var563) {
        final SubLObject var564 = module0773.f49260(var563);
        if (var564.equal((SubLObject)$ic345$)) {
            return module0015.$g505$.getGlobalValue();
        }
        if (var564.equal((SubLObject)$ic346$)) {
            return module0015.$g513$.getGlobalValue();
        }
        if (var564.equal((SubLObject)$ic347$)) {
            return module0015.$g492$.getGlobalValue();
        }
        return module0015.$g522$.getGlobalValue();
    }
    
    public static SubLObject f49670(final SubLObject var7) {
        final SubLObject var8 = inference_datastructures_inference_oc.f25587(var7);
        final SubLObject var9 = (NIL != module0035.f1997(var8)) ? var8.first() : inference_datastructures_inference_oc.f25484(var7);
        return var9;
    }
    
    public static SubLObject f49678(final SubLObject var26, final SubLObject var6) {
        SubLObject var27 = inference_datastructures_inference_oc.f25744(var6);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            SubLObject var23_627 = inference_datastructures_inference_oc.f25785(var28);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var23_627.first();
            while (NIL != var23_627) {
                if (var26.eql(var29)) {
                    return (SubLObject)T;
                }
                var23_627 = var23_627.rest();
                var29 = var23_627.first();
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49786(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var58)) {
            return module0178.f11282(var58);
        }
        if (NIL != module0191.f11952(var58)) {
            return module0282.f18746(f49759(var58, (SubLObject)UNPROVIDED), module0147.$g2095$.getDynamicValue(var59)).first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49820(final SubLObject var29) {
        return module0259.f16854(var29, $ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49796(final SubLObject var26, final SubLObject var29) {
        if (NIL == f49820(var29)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49797(var26)) {
            final SubLObject var30 = module0366.f24966(var26).first();
            final SubLObject var31 = f49762(var30);
            final SubLObject var32 = (SubLObject)((NIL != assertion_handles_oc.f11035(var31)) ? module0178.f11287(var31) : NIL);
            return (SubLObject)makeBoolean(NIL != module0161.f10481(var32) && NIL != f49915(var32, var29));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49694(final SubLObject var58, final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var58) && (NIL != f49916(var58) || NIL != f49915(module0178.f11287(var58), var29)));
    }
    
    public static SubLObject f49916(final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)NIL;
        if (NIL == var59) {
            SubLObject var60 = module0579.$g4278$.getDynamicValue(var58);
            SubLObject var61 = (SubLObject)NIL;
            var61 = var60.first();
            while (NIL == var59 && NIL != var60) {
                if (NIL != module0205.f13220(module0233.f15370(var61), var57, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var59 = (SubLObject)T;
                }
                var60 = var60.rest();
                var61 = var60.first();
            }
        }
        return var59;
    }
    
    public static SubLObject f49915(final SubLObject var632, final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != f49820(var632) && NIL != module0262.f17336(var29, var632, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49917(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL != module0377.f26776(var26) && NIL == f49918(var26));
    }
    
    public static SubLObject f49918(final SubLObject var26) {
        SubLObject var27 = module0366.f24938(var26);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != module0377.f26776(var28)) {
                return (SubLObject)T;
            }
            if (NIL != f49918(var28)) {
                return (SubLObject)T;
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49919(final SubLObject var26, final SubLObject var29, final SubLObject var633) {
        SubLObject var634 = (SubLObject)NIL;
        if (NIL != module0004.f104(f49705(var26, var29), var633, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            var634 = (SubLObject)ConsesLow.cons(var26, var634);
        }
        else {
            SubLObject var635 = module0366.f24938(var26);
            SubLObject var636 = (SubLObject)NIL;
            var636 = var635.first();
            while (NIL != var635) {
                var634 = ConsesLow.append(var634, f49919(var636, var29, var633));
                var635 = var635.rest();
                var636 = var635.first();
            }
        }
        return Sequences.delete_duplicates(var634, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49790(final SubLObject var201, final SubLObject var26, final SubLObject var29) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        var202.resetMultipleValues();
        final SubLObject var203 = f49920(var26);
        final SubLObject var204 = var202.secondMultipleValue();
        final SubLObject var205 = var202.thirdMultipleValue();
        var202.resetMultipleValues();
        final SubLObject var206 = f49921(var201, var203, var204, var29);
        return Values.values(var206, var203, var205);
    }
    
    public static SubLObject f49921(final SubLObject var201, final SubLObject var206, final SubLObject var634, final SubLObject var29) {
        final SubLThread var635 = SubLProcess.currentSubLThread();
        final SubLObject var636 = module0202.f12765(module0178.f11282(var201));
        final SubLObject var637 = module0233.f15362(var634, var636);
        final SubLObject var638 = f49922(var637);
        SubLObject var639 = (SubLObject)NIL;
        SubLObject var640 = (SubLObject)NIL;
        SubLObject var641 = (SubLObject)ZERO_INTEGER;
        SubLObject var642 = module0232.f15306(var638);
        SubLObject var643 = (SubLObject)NIL;
        var643 = var642.first();
        while (NIL != var642) {
            final SubLObject var644 = (SubLObject)$ic348$;
            if (var644 == $ic348$) {
                SubLObject var645 = (SubLObject)NIL;
                if (NIL == var645) {
                    SubLObject var646 = var206;
                    SubLObject var647 = (SubLObject)NIL;
                    var647 = var646.first();
                    while (NIL == var645 && NIL != var646) {
                        if (NIL != f49923(var647, var643, var29)) {
                            var639 = (SubLObject)ConsesLow.cons(var643, var639);
                            var645 = (SubLObject)T;
                        }
                        var646 = var646.rest();
                        var647 = var646.first();
                    }
                }
            }
            var641 = Numbers.add(var641, (SubLObject)ONE_INTEGER);
            var642 = var642.rest();
            var643 = var642.first();
        }
        var641 = (SubLObject)ZERO_INTEGER;
        var642 = module0232.f15308(var638);
        var643 = (SubLObject)NIL;
        var643 = var642.first();
        while (NIL != var642) {
            final SubLObject var644 = (SubLObject)$ic349$;
            if (var644 == $ic348$) {
                SubLObject var645 = (SubLObject)NIL;
                if (NIL == var645) {
                    SubLObject var646 = var206;
                    SubLObject var647 = (SubLObject)NIL;
                    var647 = var646.first();
                    while (NIL == var645 && NIL != var646) {
                        if (NIL != f49923(var647, var643, var29)) {
                            var639 = (SubLObject)ConsesLow.cons(var643, var639);
                            var645 = (SubLObject)T;
                        }
                        var646 = var646.rest();
                        var647 = var646.first();
                    }
                }
            }
            var641 = Numbers.add(var641, (SubLObject)ONE_INTEGER);
            var642 = var642.rest();
            var643 = var642.first();
        }
        final SubLObject var648 = module0579.$g4262$.currentBinding(var635);
        try {
            module0579.$g4262$.bind(var29, var635);
            final SubLObject var649 = f49924(conses_high.set_difference(module0232.f15306(var638), var639, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var650 = module0232.f15305(var649, module0232.f15308(var638));
            final SubLObject var651 = module0178.f11348(var201);
            var640 = module0289.f19418(var650, module0178.f11287(var201), var651);
        }
        finally {
            module0579.$g4262$.rebind(var648, var635);
        }
        return var640;
    }
    
    public static SubLObject f49924(SubLObject var648) {
        var648 = Sequences.remove_if((SubLObject)$ic350$, var648, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var648 = f49925(var648);
        return var648;
    }
    
    public static SubLObject f49925(final SubLObject var648) {
        SubLObject var650;
        final SubLObject var649 = var650 = module0035.f2109($ic351$, var648, Symbols.symbol_function((SubLObject)EQ), (SubLObject)$ic352$);
        SubLObject var651 = (SubLObject)NIL;
        var651 = var650.first();
        while (NIL != var650) {
            SubLObject var653;
            final SubLObject var652 = var653 = module0205.f13385(var651, (SubLObject)UNPROVIDED);
            SubLObject var654 = (SubLObject)NIL;
            SubLObject var655 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var653, var652, (SubLObject)$ic353$);
            var654 = var653.first();
            var653 = var653.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var653, var652, (SubLObject)$ic353$);
            var655 = var653.first();
            var653 = var653.rest();
            if (NIL == var653) {
                final SubLObject var656 = Sequences.remove(var651, var648, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var657 = conses_high.subst(var655, var654, var656, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var658 = f49924(var657);
                if (!var657.equal(var658)) {
                    return var658;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var652, (SubLObject)$ic353$);
            }
            var650 = var650.rest();
            var651 = var650.first();
        }
        return var648;
    }
    
    public static SubLObject f49794(final SubLObject var657, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = f49799();
        }
        return (SubLObject)makeBoolean(NIL != module0193.f12105(var657) && (NIL != f49726(var657, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f49719(var657, var155)));
    }
    
    public static SubLObject f49922(final SubLObject var638) {
        final SubLThread var639 = SubLProcess.currentSubLThread();
        SubLObject var640 = (SubLObject)NIL;
        SubLObject var641 = (SubLObject)NIL;
        SubLObject var642 = (SubLObject)NIL;
        SubLObject var643 = (SubLObject)ZERO_INTEGER;
        SubLObject var644 = module0232.f15306(var638);
        SubLObject var645 = (SubLObject)NIL;
        var645 = var644.first();
        while (NIL != var644) {
            final SubLObject var646 = (SubLObject)$ic348$;
            if (var646 == $ic348$) {
                if (module0205.f13333(var645).eql($ic354$) && NIL != module0167.f10813(module0205.f13387(var645, (SubLObject)UNPROVIDED))) {
                    var641 = (SubLObject)T;
                    var639.resetMultipleValues();
                    final SubLObject var647 = module0234.f15444(module0205.f13387(var645, (SubLObject)UNPROVIDED), module0205.f13388(var645, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var648 = var639.secondMultipleValue();
                    var639.resetMultipleValues();
                    SubLObject var23_662 = var647;
                    SubLObject var649 = (SubLObject)NIL;
                    var649 = var23_662.first();
                    while (NIL != var23_662) {
                        var640 = (SubLObject)ConsesLow.cons(var649, var640);
                        var23_662 = var23_662.rest();
                        var649 = var23_662.first();
                    }
                }
                else {
                    var642 = (SubLObject)ConsesLow.cons(var645, var642);
                }
            }
            var643 = Numbers.add(var643, (SubLObject)ONE_INTEGER);
            var644 = var644.rest();
            var645 = var644.first();
        }
        var643 = (SubLObject)ZERO_INTEGER;
        var644 = module0232.f15308(var638);
        var645 = (SubLObject)NIL;
        var645 = var644.first();
        while (NIL != var644) {
            final SubLObject var646 = (SubLObject)$ic349$;
            if (var646 == $ic348$) {
                if (module0205.f13333(var645).eql($ic354$) && NIL != module0167.f10813(module0205.f13387(var645, (SubLObject)UNPROVIDED))) {
                    var641 = (SubLObject)T;
                    var639.resetMultipleValues();
                    final SubLObject var647 = module0234.f15444(module0205.f13387(var645, (SubLObject)UNPROVIDED), module0205.f13388(var645, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var648 = var639.secondMultipleValue();
                    var639.resetMultipleValues();
                    SubLObject var23_663 = var647;
                    SubLObject var649 = (SubLObject)NIL;
                    var649 = var23_663.first();
                    while (NIL != var23_663) {
                        var640 = (SubLObject)ConsesLow.cons(var649, var640);
                        var23_663 = var23_663.rest();
                        var649 = var23_663.first();
                    }
                }
                else {
                    var642 = (SubLObject)ConsesLow.cons(var645, var642);
                }
            }
            var643 = Numbers.add(var643, (SubLObject)ONE_INTEGER);
            var644 = var644.rest();
            var645 = var644.first();
        }
        if (NIL == var641) {
            return var638;
        }
        final SubLObject var650 = Sequences.nreverse(var642);
        final SubLObject var651 = module0232.f15305(var650, module0232.f15308(var638));
        return module0233.f15362(var640, var651);
    }
    
    public static SubLObject f49923(final SubLObject var55, final SubLObject var642, final SubLObject var29) {
        return Equality.equal(var642, f49705(var55, var29));
    }
    
    public static SubLObject f49920(final SubLObject var667) {
        final SubLThread var668 = SubLProcess.currentSubLThread();
        var668.resetMultipleValues();
        final SubLObject var669 = f49926(var667);
        SubLObject var670 = var668.secondMultipleValue();
        var668.resetMultipleValues();
        final SubLObject var671 = module0377.f26830(var667);
        final SubLObject var672 = conses_high.intersection(var671, module0579.$g4278$.getDynamicValue(var668), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic355$));
        final SubLObject var673 = (SubLObject)makeBoolean(NIL != conses_high.set_difference(var670, var672, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic355$)));
        var670 = ConsesLow.append(var670, var672);
        return Values.values(var669, module0234.f15470(var670), var673);
    }
    
    public static SubLObject f49926(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = module0366.f24938(var26);
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            final SubLObject var32 = f49927(var26, var31);
            if (NIL != f49797(var31)) {
                final SubLObject var33 = var31;
                if (NIL == conses_high.member(var33, var28, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var28 = (SubLObject)ConsesLow.cons(var33, var28);
                }
                if (NIL != module0035.f1997(module0366.f24938(var26))) {
                    SubLObject var23_671 = module0233.f15362(var32, module0366.f24934(var26));
                    SubLObject var34 = (SubLObject)NIL;
                    var34 = var23_671.first();
                    while (NIL != var23_671) {
                        final SubLObject var35 = var34;
                        if (NIL != var35) {
                            var29 = (SubLObject)ConsesLow.cons(var35, var29);
                        }
                        var23_671 = var23_671.rest();
                        var34 = var23_671.first();
                    }
                }
            }
            else if (NIL == module0377.f26776(var31)) {
                var27.resetMultipleValues();
                final SubLObject var36 = f49926(var31);
                SubLObject var37 = var27.secondMultipleValue();
                var27.resetMultipleValues();
                var37 = module0233.f15362(var32, var37);
                SubLObject var38 = (SubLObject)NIL;
                SubLObject var179_676 = (SubLObject)NIL;
                SubLObject var39 = (SubLObject)NIL;
                SubLObject var631_678 = (SubLObject)NIL;
                var38 = var36;
                var179_676 = var38.first();
                var39 = var37;
                var631_678 = var39.first();
                while (NIL != var39 || NIL != var38) {
                    final SubLObject var40 = var179_676;
                    if (NIL == conses_high.member(var40, var28, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var28 = (SubLObject)ConsesLow.cons(var40, var28);
                    }
                    final SubLObject var41 = var631_678;
                    if (NIL != var41) {
                        var29 = (SubLObject)ConsesLow.cons(var41, var29);
                    }
                    var38 = var38.rest();
                    var179_676 = var38.first();
                    var39 = var39.rest();
                    var631_678 = var39.first();
                }
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return Values.values(module0035.remove_if_not((SubLObject)$ic10$, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var29);
    }
    
    public static SubLObject f49927(final SubLObject var26, final SubLObject var55) {
        final SubLObject var56 = module0366.f24937(var26);
        final SubLObject var57 = module0366.f24956(var55);
        SubLObject var58 = (SubLObject)NIL;
        final SubLObject var59 = var56;
        SubLObject var60;
        SubLObject var61;
        for (var60 = (SubLObject)NIL, var60 = module0364.f24735(var59); NIL == var58 && NIL != var60; var60 = var60.rest()) {
            var61 = var60.first();
            if (NIL != module0339.f22743((SubLObject)NIL, var59, var61) && var57.eql(module0364.f24736(var61))) {
                var58 = var61;
            }
        }
        return (SubLObject)((NIL != module0364.f24774(var58)) ? module0364.f24737(var58) : NIL);
    }
    
    public static SubLObject f49797(final SubLObject var26) {
        if (NIL != module0376.f26656(var26)) {
            final SubLObject var27 = module0366.f24966(var26);
            if (NIL != module0035.f1997(var27)) {
                final SubLObject var28 = f49762(var27.first());
                return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var28) && NIL != module0178.f11375(var28));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49690(final SubLObject var26) {
        final SubLObject var27 = conses_high.copy_list(module0366.f24938(var26));
        final SubLObject var28 = conses_high.set_difference(var27, f49810(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var29 = Sort.sort(var28, Symbols.symbol_function((SubLObject)$ic24$), (SubLObject)$ic356$);
        return var29;
    }
    
    public static SubLObject f49928(final SubLObject var26, final SubLObject var29) {
        final SubLObject var30 = f49705(var26, var29);
        final SubLObject var31 = (SubLObject)((NIL != f49929(var30)) ? module0288.f19338(var30, var29) : NIL);
        if (NIL != var31) {
            return var31;
        }
        if (NIL == f49728(var26)) {
            return var30;
        }
        final SubLObject var32 = f49691(module0366.f24966(var26)).first();
        if (NIL != f49694(var32, var29)) {
            return var30;
        }
        if (NIL != assertion_handles_oc.f11035(var32)) {
            return var32;
        }
        return module0191.f11970(var32);
    }
    
    public static SubLObject f49673(final SubLObject var26, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0034.$g879$.getDynamicValue(var30);
        SubLObject var32 = (SubLObject)NIL;
        if (NIL == var31) {
            return f49928(var26, var29);
        }
        var32 = module0034.f1857(var31, (SubLObject)$ic357$, (SubLObject)UNPROVIDED);
        if (NIL == var32) {
            var32 = module0034.f1807(module0034.f1842(var31), (SubLObject)$ic357$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var31, (SubLObject)$ic357$, var32);
        }
        final SubLObject var33 = module0034.f1782(var26, var29);
        final SubLObject var34 = module0034.f1814(var32, var33, (SubLObject)UNPROVIDED);
        if (var34 != $ic27$) {
            SubLObject var35 = var34;
            SubLObject var36 = (SubLObject)NIL;
            var36 = var35.first();
            while (NIL != var35) {
                SubLObject var37 = var36.first();
                final SubLObject var38 = conses_high.second(var36);
                if (var26.equal(var37.first())) {
                    var37 = var37.rest();
                    if (NIL != var37 && NIL == var37.rest() && var29.equal(var37.first())) {
                        return module0034.f1959(var38);
                    }
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        final SubLObject var39 = Values.arg2(var30.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49928(var26, var29)));
        module0034.f1836(var32, var33, var34, var39, (SubLObject)ConsesLow.list(var26, var29));
        return module0034.f1959(var39);
    }
    
    public static SubLObject f49929(final SubLObject var685) {
        return (SubLObject)makeBoolean(NIL != module0202.f12934(var685) && NIL == f49840(var685, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49840(final SubLObject var685, SubLObject var594) {
        if (var594 == UNPROVIDED) {
            var594 = (SubLObject)ZERO_INTEGER;
        }
        if (var594.numG((SubLObject)FIVE_INTEGER)) {
            return (SubLObject)T;
        }
        if (NIL == module0035.f2014(var685)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f2002(var685, (SubLObject)TWELVE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        final SubLObject var686 = module0048.f_1X(var594);
        SubLObject var687 = var685;
        SubLObject var688 = (SubLObject)NIL;
        var688 = var687.first();
        while (NIL != var687) {
            if (NIL != f49840(var688, var686)) {
                return (SubLObject)T;
            }
            var687 = var687.rest();
            var688 = var687.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49705(final SubLObject var26, final SubLObject var29) {
        final SubLObject var30 = module0370.f25912(module0373.f26241(var26), var29);
        return f49833(var30);
    }
    
    public static SubLObject f49728(final SubLObject var26) {
        final SubLObject var27 = module0366.f24966(var26);
        if (NIL != module0035.f1997(var27) && NIL != module0376.f26656(var26)) {
            final SubLObject var28 = var27.first();
            return (SubLObject)makeBoolean(NIL != module0191.f11952(var28) || NIL != module0178.f11284(var28));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49691(final SubLObject var97) {
        return module0036.f2531(var97, (SubLObject)$ic358$, (SubLObject)$ic359$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49930(final SubLObject var320) {
        return (SubLObject)makeBoolean((NIL != module0191.f11952(var320) || NIL != module0179.f11424(var320)) && NIL != f49762(var320));
    }
    
    public static SubLObject f49762(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var58)) {
            return var58;
        }
        if ($ic105$ == module0191.f11965(var58)) {
            return module0538.f33385(module0191.f11967(var58), module0191.f11976(var58));
        }
        final SubLObject var60 = module0191.f11967(var58);
        final SubLObject var61 = module0191.f11976(var58);
        if (NIL == f49929(var60)) {
            return (SubLObject)NIL;
        }
        var59.resetMultipleValues();
        final SubLObject var62 = module0282.f18745(var60, var61, (SubLObject)UNPROVIDED);
        final SubLObject var63 = var59.secondMultipleValue();
        var59.resetMultipleValues();
        return f49931(var62, var63);
    }
    
    public static SubLObject f49931(final SubLObject var690, final SubLObject var29) {
        SubLObject var691 = (SubLObject)NIL;
        if (!var690.isList()) {
            return (SubLObject)NIL;
        }
        if (NIL == var691) {
            SubLObject var692;
            SubLObject var693;
            for (var692 = var690, var693 = (SubLObject)NIL, var693 = var692.first(); NIL == var691 && NIL != var692; var691 = f49932(var693, var29), var692 = var692.rest(), var693 = var692.first()) {}
        }
        return var691;
    }
    
    public static SubLObject f49932(final SubLObject var691, final SubLObject var29) {
        if (var29.eql($ic157$) || var29.eql($ic135$)) {
            return module0217.f14418(var691);
        }
        return module0217.f14419(var691, var29);
    }
    
    public static SubLObject f49763(final SubLObject var57, SubLObject var692) {
        if (var692 == UNPROVIDED) {
            var692 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var693 = module0035.remove_if_not((SubLObject)$ic360$, module0178.f11299(var57), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var694 = Sort.sort(var693, (SubLObject)$ic361$, (SubLObject)UNPROVIDED);
        SubLObject var695 = (SubLObject)NIL;
        final SubLObject var696 = module0077.f5314(var692);
        module0077.f5326(var57, var696);
        if (NIL == var695) {
            SubLObject var697 = var694;
            SubLObject var698 = (SubLObject)NIL;
            var698 = var697.first();
            while (NIL == var695 && NIL != var697) {
                SubLObject var699 = (SubLObject)NIL;
                final SubLObject var700 = f49691(module0188.f11770(var698));
                SubLObject var701 = (SubLObject)NIL;
                if (NIL == var701) {
                    SubLObject var162_699 = var700;
                    SubLObject var702 = (SubLObject)NIL;
                    var702 = var162_699.first();
                    while (NIL == var701 && NIL != var162_699) {
                        if (NIL != module0078.f5362(f49759(var702, (SubLObject)UNPROVIDED), var696, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic362$) && NIL != module0078.f5362(module0191.f11976(var702), var696, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic363$)) {
                            var701 = (SubLObject)T;
                        }
                        else {
                            final SubLObject var703 = f49693(var702, var696);
                            if (NIL == var703) {
                                var701 = (SubLObject)T;
                            }
                            else {
                                var699 = (SubLObject)ConsesLow.cons(var703, var699);
                            }
                        }
                        var162_699 = var162_699.rest();
                        var702 = var162_699.first();
                    }
                }
                if (NIL == var701) {
                    var695 = (SubLObject)ConsesLow.cons(var57, Sequences.nreverse(var699));
                }
                var697 = var697.rest();
                var698 = var697.first();
            }
        }
        if (NIL != module0035.f2014(var695)) {
            return var695;
        }
        if (NIL != module0178.f11375(var57)) {
            return (SubLObject)ConsesLow.list(var57);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49693(final SubLObject var58, final SubLObject var692) {
        final SubLThread var693 = SubLProcess.currentSubLThread();
        SubLObject var694 = (SubLObject)NIL;
        final SubLObject var695 = $g6219$.currentBinding(var693);
        try {
            $g6219$.bind((SubLObject)($g6219$.getDynamicValue(var693).isInteger() ? module0048.f_1X($g6219$.getDynamicValue(var693)) : ONE_INTEGER), var693);
            if (!$g6219$.getDynamicValue(var693).numG($g6218$.getGlobalValue())) {
                if (NIL != assertion_handles_oc.f11035(var58)) {
                    var694 = f49763(var58, var692);
                }
                else if (NIL != module0191.f11952(var58)) {
                    final SubLObject var696 = Sequences.remove(var58, f49824(var58), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var694 = f49778(var58, var696, var692);
                }
            }
        }
        finally {
            $g6219$.rebind(var695, var693);
        }
        if (NIL != var694 && !areAssertionsDisabledFor(me) && NIL == f49698(var694)) {
            throw new AssertionError(var694);
        }
        return var694;
    }
    
    public static SubLObject f49778(final SubLObject var701, final SubLObject var97, SubLObject var692) {
        if (var692 == UNPROVIDED) {
            var692 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var702 = (SubLObject)NIL;
        SubLObject var703 = (SubLObject)NIL;
        if (NIL == var703) {
            SubLObject var704 = var97;
            SubLObject var705 = (SubLObject)NIL;
            var705 = var704.first();
            while (NIL == var703 && NIL != var704) {
                if (NIL != module0078.f5362(f49759(var705, (SubLObject)UNPROVIDED), var692, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic362$)) {
                    var703 = (SubLObject)T;
                }
                else {
                    final SubLObject var706 = f49693(var705, var692);
                    if (NIL == var706) {
                        var703 = (SubLObject)T;
                    }
                    else {
                        var702 = (SubLObject)ConsesLow.cons(var706, var702);
                    }
                }
                var704 = var704.rest();
                var705 = var704.first();
            }
        }
        if (NIL != var703) {
            return (SubLObject)NIL;
        }
        final SubLObject var707 = (SubLObject)ConsesLow.cons(var701, Sequences.nreverse(var702));
        assert NIL != f49698(var707) : var707;
        return var707;
    }
    
    public static SubLObject f49698(final SubLObject var320) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var320) && NIL != module0191.f11950(f49701(var320)) && NIL != module0035.f2192((SubLObject)$ic364$, var320.rest()));
    }
    
    public static SubLObject f49701(final SubLObject var66) {
        return var66.first();
    }
    
    public static SubLObject f49699(final SubLObject var66) {
        return var66.rest();
    }
    
    public static SubLObject f49933(final SubLObject var66) {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var66, var66, (SubLObject)$ic365$);
        var67 = var66.first();
        final SubLObject var69 = var68 = var66.rest();
        return f49759(var67, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49760(SubLObject var57, SubLObject var704, SubLObject var169) {
        if (var704 == UNPROVIDED) {
            var704 = (SubLObject)T;
        }
        if (var169 == UNPROVIDED) {
            var169 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        SubLObject var705 = (SubLObject)NIL;
        if (NIL != var704 || NIL == module0178.f11375(var57)) {
            final SubLObject var706 = f49934(var57, (SubLObject)NIL);
            if (NIL != assertion_handles_oc.f11035(var706)) {
                var57 = var706;
            }
            final SubLObject var707 = module0035.remove_if_not((SubLObject)$ic360$, module0178.f11299(var57), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var705) {
                SubLObject var708 = Sort.sort(var707, (SubLObject)$ic366$, (SubLObject)UNPROVIDED);
                SubLObject var709 = (SubLObject)NIL;
                var709 = var708.first();
                while (NIL == var705 && NIL != var708) {
                    final SubLObject var710 = f49691(module0188.f11770(var709));
                    SubLObject var711 = (SubLObject)NIL;
                    if (NIL == var711) {
                        SubLObject var162_706 = var710;
                        SubLObject var712 = (SubLObject)NIL;
                        var712 = var162_706.first();
                        while (NIL == var711 && NIL != var162_706) {
                            if (NIL != module0077.f5320(f49759(var712, (SubLObject)UNPROVIDED), var169)) {
                                var711 = (SubLObject)T;
                            }
                            var162_706 = var162_706.rest();
                            var712 = var162_706.first();
                        }
                    }
                    if (NIL == var711 && NIL != Sequences.remove_if((SubLObject)$ic16$, var710, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var705 = var710;
                    }
                    var708 = var708.rest();
                    var709 = var708.first();
                }
            }
        }
        if (NIL == var705) {
            var705 = (SubLObject)ConsesLow.list(var57);
        }
        return var705;
    }
    
    public static SubLObject f49935(final SubLObject var707, final SubLObject var708) {
        if (NIL != module0205.f13220($ic158$, module0188.f11770(var708), (SubLObject)$ic367$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0205.f13220($ic158$, module0188.f11770(var707), (SubLObject)$ic367$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0205.f13220($ic158$, module0188.f11770(var707), (SubLObject)$ic367$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0205.f13220($ic158$, module0188.f11770(var708), (SubLObject)$ic367$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f49936(var707, var708)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49934(final SubLObject var57, SubLObject var709) {
        if (var709 == UNPROVIDED) {
            var709 = (SubLObject)NIL;
        }
        SubLObject var710 = (SubLObject)NIL;
        if (NIL != module0178.f11284(var57)) {
            final SubLObject var711 = f49759(var57, var709);
            final SubLObject var712 = module0178.f11287(var57);
            var710 = f49765(var711, var712, var709);
        }
        return var710;
    }
    
    public static SubLObject f49765(final SubLObject var713, final SubLObject var29, final SubLObject var709) {
        final SubLThread var714 = SubLProcess.currentSubLThread();
        SubLObject var715 = (SubLObject)NIL;
        SubLObject var716 = (SubLObject)NIL;
        SubLObject var717 = (SubLObject)NIL;
        SubLObject var718 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var713, var713, (SubLObject)$ic368$);
        var716 = var713.first();
        SubLObject var719 = var713.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var719, var713, (SubLObject)$ic368$);
        var717 = var719.first();
        var719 = (var718 = var719.rest());
        final SubLObject var720 = module0147.f9540(var29);
        final SubLObject var721 = module0147.$g2095$.currentBinding(var714);
        final SubLObject var722 = module0147.$g2094$.currentBinding(var714);
        final SubLObject var723 = module0147.$g2096$.currentBinding(var714);
        try {
            module0147.$g2095$.bind(module0147.f9545(var720), var714);
            module0147.$g2094$.bind(module0147.f9546(var720), var714);
            module0147.$g2096$.bind(module0147.f9549(var720), var714);
            final SubLObject var724 = var716;
            if (NIL != module0158.f10010(var717, (SubLObject)NIL, var724)) {
                final SubLObject var725 = module0158.f10011(var717, (SubLObject)NIL, var724);
                SubLObject var726 = var715;
                final SubLObject var727 = (SubLObject)NIL;
                while (NIL == var726) {
                    final SubLObject var728 = module0052.f3695(var725, var727);
                    final SubLObject var729 = (SubLObject)makeBoolean(!var727.eql(var728));
                    if (NIL != var729) {
                        SubLObject var730 = (SubLObject)NIL;
                        try {
                            var730 = module0158.f10316(var728, (SubLObject)$ic159$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var395_718 = var715;
                            final SubLObject var396_719 = (SubLObject)NIL;
                            while (NIL == var395_718) {
                                final SubLObject var731 = module0052.f3695(var730, var396_719);
                                final SubLObject var398_720 = (SubLObject)makeBoolean(!var396_719.eql(var731));
                                if (NIL != var398_720 && NIL != f49937(var731, var713, var29, var709)) {
                                    final SubLObject var732 = f49934(var731, (SubLObject)UNPROVIDED);
                                    var715 = ((NIL != var732) ? var732 : var731);
                                }
                                var395_718 = (SubLObject)makeBoolean(NIL == var398_720 || NIL != var715);
                            }
                        }
                        finally {
                            final SubLObject var10_722 = Threads.$is_thread_performing_cleanupP$.currentBinding(var714);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var714);
                                if (NIL != var730) {
                                    module0158.f10319(var730);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_722, var714);
                            }
                        }
                    }
                    var726 = (SubLObject)makeBoolean(NIL == var729 || NIL != var715);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var723, var714);
            module0147.$g2094$.rebind(var722, var714);
            module0147.$g2095$.rebind(var721, var714);
        }
        return var715;
    }
    
    public static SubLObject f49937(final SubLObject var402, final SubLObject var713, final SubLObject var29, final SubLObject var709) {
        final SubLObject var714 = (SubLObject)makeBoolean(!module0178.f11287(var402).eql(var29) && f49759(var402, var709).equal(var713) && NIL == module0262.f17336(module0178.f11287(var402), var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var714;
    }
    
    public static SubLObject f49936(final SubLObject var724, final SubLObject var725) {
        return Numbers.numL(deduction_handles_oc.f11649(var724), deduction_handles_oc.f11649(var725));
    }
    
    public static SubLObject f49824(final SubLObject var58) {
        if (NIL != module0179.f11424(var58)) {
            return f49824(module0183.f11557(var58));
        }
        if (NIL != assertion_handles_oc.f11035(var58)) {
            final SubLObject var59 = module0259.f16854(module0161.f10557(module0161.f10550(var58)), $ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f49760(var58, var59, (SubLObject)UNPROVIDED);
        }
        if (NIL != f49938(var58)) {
            return f49939(var58);
        }
        if (module0191.f11965(var58).eql((SubLObject)$ic369$)) {
            return f49940(var58);
        }
        if (NIL != f49941(var58)) {
            return f49942(var58);
        }
        if (NIL != f49943(var58)) {
            return f49944(var58);
        }
        return f49945(var58);
    }
    
    public static SubLObject f49945(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0333.f22428(var58);
        final SubLObject var61 = module0191.f11965(var58);
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        if (NIL != module0191.f11953(var60)) {
            SubLObject var64 = var60;
            SubLObject var65 = (SubLObject)NIL;
            var65 = var64.first();
            while (NIL != var64) {
                if (NIL != f49826(var65, var61)) {
                    var63 = (SubLObject)ConsesLow.cons(var65, var63);
                }
                else if (NIL == f49755(var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var63 = (SubLObject)ConsesLow.cons(var65, var63);
                }
                else if (NIL != module0178.f11290(var65)) {
                    var62 = conses_high.union(var62, f49752(var65, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                }
                else if ($g6228$.getDynamicValue(var59).numL($g6227$.getDynamicValue(var59)) && NIL == f49798(var65, (SubLObject)UNPROVIDED)) {
                    final SubLObject var66 = $g6228$.currentBinding(var59);
                    try {
                        $g6228$.bind(module0048.f_1X($g6228$.getDynamicValue(var59)), var59);
                        SubLObject var23_727 = f49824(var65);
                        SubLObject var67 = (SubLObject)NIL;
                        var67 = var23_727.first();
                        while (NIL != var23_727) {
                            if (NIL == f49755(var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                final SubLObject var68 = var67;
                                if (NIL == conses_high.member(var68, var63, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic28$))) {
                                    var63 = (SubLObject)ConsesLow.cons(var68, var63);
                                }
                            }
                            else if (NIL != module0178.f11290(var67)) {
                                var62 = conses_high.union(var62, f49752(var67, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                            }
                            var23_727 = var23_727.rest();
                            var67 = var23_727.first();
                        }
                    }
                    finally {
                        $g6228$.rebind(var66, var59);
                    }
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
            if (NIL != var62 && NIL != var63) {
                var63 = f49753(var63, var62);
            }
        }
        return var63;
    }
    
    public static SubLObject f49815(final SubLObject var320) {
        if (NIL != assertion_handles_oc.f11035(var320)) {
            return module0178.f11362(var320, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0191.f11952(var320)) {
            return (SubLObject)makeBoolean(NIL == f49946(var320));
        }
        if (NIL == module0191.f11950(var320)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49946(final SubLObject var729) {
        SubLObject var730 = module0333.f22427(var729);
        if (NIL == var730) {
            var730 = f49947(var729);
            if (NIL != var730) {
                Errors.warn((SubLObject)$ic370$, var729);
            }
        }
        return var730;
    }
    
    public static SubLObject f49947(final SubLObject var729) {
        final SubLObject var730 = (SubLObject)$ic371$;
        final SubLObject var731 = module0191.f11976(var729);
        return module0540.f33526(module0409.f28506(module0191.f11967(var729), var731, var730));
    }
    
    public static SubLObject f49941(final SubLObject var58) {
        return (SubLObject)makeBoolean(module0191.f11978(var58) == $ic160$ && NIL != module0202.f12589(module0191.f11967(var58), $ic96$));
    }
    
    public static SubLObject f49943(final SubLObject var58) {
        return (SubLObject)makeBoolean(module0191.f11978(var58) == $ic160$ && NIL != module0202.f12589(module0191.f11967(var58), $ic190$));
    }
    
    public static SubLObject f49944(final SubLObject var58) {
        SubLObject var60;
        final SubLObject var59 = var60 = module0205.f13207(module0191.f11967(var58), (SubLObject)UNPROVIDED);
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic372$);
        var61 = var60.first();
        var60 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic372$);
        var62 = var60.first();
        var60 = var60.rest();
        if (NIL == var60) {
            final SubLObject var63 = module0191.f11976(var58);
            final SubLObject var64 = f49948(var61, var62, var63, (SubLObject)$ic373$, (SubLObject)NIL);
            if (NIL != var64) {
                return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic374$, module0202.f12768($ic190$, var61, var64), var63, (SubLObject)UNPROVIDED), module0191.f11990((SubLObject)$ic374$, module0202.f12768($ic190$, var64, var62), var63, (SubLObject)UNPROVIDED));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)$ic372$);
        }
        return f49945(var58);
    }
    
    public static SubLObject f49942(final SubLObject var737) {
        final SubLObject var738 = (SubLObject)((NIL != module0191.f11950(var737) && NIL == assertion_handles_oc.f11035(var737)) ? module0333.f22428(var737) : NIL);
        SubLObject var739 = module0035.f1993(var738, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var740 = module0205.f13203(f49759(var737, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        SubLObject var741 = (SubLObject)NIL;
        SubLObject var742 = (SubLObject)NIL;
        SubLObject var743 = (SubLObject)NIL;
        if (NIL == var739) {
            SubLObject var744 = var738;
            SubLObject var745 = (SubLObject)NIL;
            var745 = var744.first();
            while (NIL == var739 && NIL != var744) {
                if (NIL == var743 && (NIL == assertion_handles_oc.f11035(var745) || NIL == f49941(var745) || !module0178.f11334(var745).equal(var740))) {
                    var739 = (SubLObject)T;
                }
                else if (NIL == var743) {
                    var743 = (SubLObject)ConsesLow.cons(var745, var743);
                    var741 = module0178.f11335(var745);
                    var742 = module0178.f11335(var745);
                }
                else if (NIL != f49943(var745) && NIL != assertion_handles_oc.f11035(var745) && module0178.f11334(var745).equal(var742) && NIL == module0751.f46709(module0178.f11335(var745), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var742 = module0178.f11335(var745);
                    if (NIL != module0751.f46709(var741, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var741 = var742;
                        var743 = (SubLObject)ConsesLow.list(module0191.f11990(module0191.f11965(var737), module0202.f12817((SubLObject)TWO_INTEGER, var741, module0191.f11967(var737)), module0191.f11976(var737), module0130.f8529(module0191.f11978(var737), module0191.f11980(var737))));
                    }
                }
                else {
                    var739 = (SubLObject)T;
                }
                var744 = var744.rest();
                var745 = var744.first();
            }
        }
        if (NIL != var739 || NIL == var742 || NIL == var741 || var742.equal(var741)) {
            return var738;
        }
        final SubLObject var746 = module0202.f12768($ic190$, var741, var742);
        final SubLObject var747 = module0191.f11990((SubLObject)$ic374$, var746, module0191.f11976(var737), (SubLObject)UNPROVIDED);
        var743 = (SubLObject)ConsesLow.cons(var747, var743);
        return Sequences.nreverse(var743);
    }
    
    public static SubLObject f49938(final SubLObject var58) {
        final SubLObject var59 = module0191.f11967(var58);
        final SubLObject var60 = module0205.f13136(var59);
        return (SubLObject)makeBoolean(NIL != module0004.f104(var60, (SubLObject)$ic375$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0202.f12589(module0205.f13203(var59, (SubLObject)UNPROVIDED), $ic96$));
    }
    
    public static SubLObject f49939(final SubLObject var58) {
        final SubLObject var59 = module0205.f13203(f49759(var58, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var60 = module0191.f11976(var58);
        if (NIL != f49949(var58)) {
            final SubLObject var61 = module0202.f12683($ic190$, module0205.f13207(var59, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic374$, var61, var60, (SubLObject)UNPROVIDED));
        }
        final SubLObject var62 = module0333.f22428(var58);
        final SubLObject var63 = var62.first();
        if (NIL != module0202.f12589(module0191.f11967(var63), $ic96$)) {
            final SubLObject var64 = module0205.f13204(var59, (SubLObject)UNPROVIDED);
            final SubLObject var65 = module0205.f13204(f49759(var63, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            if (NIL != module0257.f16702(var64, var65, var60)) {
                return (SubLObject)ConsesLow.list(var63, module0191.f11990((SubLObject)$ic369$, module0202.f12768($ic376$, var65, var64), var60, (SubLObject)UNPROVIDED));
            }
        }
        return var62;
    }
    
    public static SubLObject f49949(final SubLObject var58) {
        final SubLObject var59 = f49759(var58, (SubLObject)UNPROVIDED);
        final SubLObject var60 = module0205.f13136(var59);
        if (NIL != module0004.f104(var60, (SubLObject)$ic375$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var61 = module0205.f13203(var59, (SubLObject)UNPROVIDED);
            if (NIL != module0202.f12589(var61, $ic96$) && !module0205.f13203(var61, (SubLObject)UNPROVIDED).equal(module0205.f13204(var61, (SubLObject)UNPROVIDED))) {
                final SubLObject var62 = module0191.f11976(var58);
                final SubLObject var63 = module0205.f13207(var61, (SubLObject)UNPROVIDED);
                return module0035.sublisp_boolean(module0347.f23334(module0202.f12683($ic190$, var63, (SubLObject)UNPROVIDED), var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49940(final SubLObject var58) {
        final SubLObject var59 = f49759(var58, (SubLObject)UNPROVIDED);
        SubLObject var60 = (SubLObject)NIL;
        if (NIL != module0202.f12734(var59, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var62;
            final SubLObject var61 = var62 = module0205.f13207(var59, (SubLObject)UNPROVIDED);
            SubLObject var63 = (SubLObject)NIL;
            SubLObject var64 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic377$);
            var63 = var62.first();
            var62 = var62.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var62, var61, (SubLObject)$ic377$);
            var64 = var62.first();
            var62 = var62.rest();
            if (NIL == var62) {
                SubLObject var65 = (SubLObject)NIL;
                final SubLObject var66 = module0191.f11976(var58);
                if (NIL == var65) {
                    SubLObject var67 = module0333.f22428(var58);
                    SubLObject var68 = (SubLObject)NIL;
                    var68 = var67.first();
                    while (NIL == var65 && NIL != var67) {
                        if ($ic376$.eql(module0205.f13132(module0191.f11967(var68)))) {
                            SubLObject var759_760;
                            final SubLObject var757_758 = var759_760 = module0205.f13207(module0191.f11967(var68), (SubLObject)UNPROVIDED);
                            SubLObject var69 = (SubLObject)NIL;
                            SubLObject var70 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var759_760, var757_758, (SubLObject)$ic378$);
                            var69 = var759_760.first();
                            var759_760 = var759_760.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var759_760, var757_758, (SubLObject)$ic378$);
                            var70 = var759_760.first();
                            var759_760 = var759_760.rest();
                            if (NIL == var759_760) {
                                if (NIL == module0256.f16576(var63, var69, var66, (SubLObject)UNPROVIDED)) {
                                    final SubLObject var71 = var69;
                                    var69 = var70;
                                    var70 = var71;
                                }
                                final SubLObject var72 = f49950(var63, var69, var66, (SubLObject)UNPROVIDED);
                                final SubLObject var73 = f49950(var64, var70, var66, (SubLObject)UNPROVIDED);
                                if (var72.eql(var69) && var73.eql(var70)) {
                                    var60 = (SubLObject)ConsesLow.cons(var68, var60);
                                }
                                else {
                                    var60 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic369$, module0202.f12768($ic376$, var72, var73), var66, (SubLObject)UNPROVIDED), var60);
                                }
                                if (!var63.equal(var72)) {
                                    var60 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic374$, module0202.f12768($ic190$, var63, var72), var66, (SubLObject)UNPROVIDED), var60);
                                }
                                if (!var64.equal(var73)) {
                                    var60 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic374$, module0202.f12768($ic190$, var64, var73), var66, (SubLObject)UNPROVIDED), var60);
                                }
                                var65 = (SubLObject)T;
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var757_758, (SubLObject)$ic378$);
                            }
                        }
                        var67 = var67.rest();
                        var68 = var67.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic377$);
            }
        }
        if (NIL == var60) {
            var60 = module0333.f22428(var58);
        }
        return var60;
    }
    
    public static SubLObject f49950(final SubLObject var766, final SubLObject var735, final SubLObject var29, SubLObject var767) {
        if (var767 == UNPROVIDED) {
            var767 = (SubLObject)T;
        }
        return f49948(var766, var735, var29, (SubLObject)$ic379$, var767);
    }
    
    public static SubLObject f49948(final SubLObject var766, final SubLObject var735, final SubLObject var29, final SubLObject var768, final SubLObject var767) {
        SubLObject var769 = module0549.f33908(module0256.f16565(var766, var735, var29, (SubLObject)UNPROVIDED), var768);
        if (NIL == var767) {
            var769 = Sequences.delete(var766, Sequences.delete(var735, var769, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var770 = var769;
        SubLObject var771 = (SubLObject)NIL;
        var771 = var770.first();
        while (NIL != var770) {
            if (NIL != module0794.f50804(var771, (SubLObject)UNPROVIDED)) {
                return var771;
            }
            var770 = var770.rest();
            var771 = var770.first();
        }
        var770 = var769;
        var771 = (SubLObject)NIL;
        var771 = var770.first();
        while (NIL != var770) {
            if (NIL == module0751.f46709(var771, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var771;
            }
            var770 = var770.rest();
            var771 = var770.first();
        }
        Errors.warn((SubLObject)$ic380$, var766, var735, var29);
        return var735;
    }
    
    public static SubLObject f49951(final SubLObject var430) {
        return (SubLObject)makeBoolean(var430.isDouble() && var430.numLE((SubLObject)$ic381$) && ZERO_INTEGER.numLE(var430));
    }
    
    public static SubLObject f49952(final SubLObject var6, final SubLObject var26, SubLObject var4, SubLObject var155, SubLObject var771) {
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        if (var771 == UNPROVIDED) {
            var771 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var772 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25684(var6) : var6;
        assert NIL != module0366.f24916(var26) : var26;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var772) && NIL == f49678(var26, var6)) {
            Errors.error((SubLObject)$ic7$, var26, var6);
        }
        return f49953(var6, var26, var4, var155, var771);
    }
    
    public static SubLObject f49954(final SubLObject var7, SubLObject var772, SubLObject var4, SubLObject var155, SubLObject var771) {
        if (var772 == UNPROVIDED) {
            var772 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        if (var771 == UNPROVIDED) {
            var771 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var773 = SubLProcess.currentSubLThread();
        SubLObject var774 = (SubLObject)NIL;
        var773.resetMultipleValues();
        final SubLObject var775 = f49955(var7, var772, var4, var155, var771, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var776 = var773.secondMultipleValue();
        var773.resetMultipleValues();
        var774 = var775;
        return var774;
    }
    
    public static SubLObject f49955(final SubLObject var7, SubLObject var772, SubLObject var4, SubLObject var155, SubLObject var771, SubLObject var775, SubLObject var776) {
        if (var772 == UNPROVIDED) {
            var772 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        if (var771 == UNPROVIDED) {
            var771 = module0579.$g4259$.getDynamicValue();
        }
        if (var775 == UNPROVIDED) {
            var775 = (SubLObject)NIL;
        }
        if (var776 == UNPROVIDED) {
            var776 = (SubLObject)NIL;
        }
        final SubLThread var777 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var7) : var7;
        if (NIL != var775 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var775)) {
            throw new AssertionError(var775);
        }
        if (NIL != var776 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var776)) {
            throw new AssertionError(var776);
        }
        SubLObject var778 = (SubLObject)NIL;
        SubLObject var779 = (SubLObject)NIL;
        SubLObject var780 = (SubLObject)NIL;
        SubLObject var781 = (SubLObject)NIL;
        SubLObject var782 = (SubLObject)NIL;
        SubLObject var783 = (SubLObject)NIL;
        SubLObject var784 = (SubLObject)T;
        final SubLObject var785 = module0003.f61();
        try {
            var777.throwStack.push(var785);
            final SubLObject var786 = module0003.$g4$.currentBinding(var777);
            try {
                module0003.$g4$.bind((SubLObject)T, var777);
                SubLObject var787 = (SubLObject)NIL;
                try {
                    final SubLObject var10_785 = module0003.$g5$.currentBinding(var777);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var777)), var777);
                        var787 = module0003.f62(var776, var785);
                        final SubLObject var10_786 = module0580.$g4371$.currentBinding(var777);
                        final SubLObject var788 = module0580.$g4369$.currentBinding(var777);
                        final SubLObject var789 = module0580.$g4370$.currentBinding(var777);
                        try {
                            module0580.$g4371$.bind((SubLObject)ZERO_INTEGER, var777);
                            module0580.$g4369$.bind(module0580.f35598(var775), var777);
                            module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var777), var777);
                            module0580.$g4370$.setDynamicValue(module0580.f35596(), var777);
                            if (NIL == module0580.$g4370$.getDynamicValue(var777)) {
                                final SubLObject var10_787 = module0580.$g4361$.currentBinding(var777);
                                try {
                                    module0580.$g4361$.bind((SubLObject)NIL, var777);
                                    var777.resetMultipleValues();
                                    final SubLObject var10_788 = module0580.$g4362$.currentBinding(var777);
                                    try {
                                        module0580.$g4362$.bind(module0580.f35560(), var777);
                                        final SubLObject var790 = var777.secondMultipleValue();
                                        var777.resetMultipleValues();
                                        try {
                                            var777.resetMultipleValues();
                                            final SubLObject var10_789 = module0580.$g4358$.currentBinding(var777);
                                            try {
                                                module0580.$g4358$.bind(module0580.f35544(), var777);
                                                final SubLObject var791 = var777.secondMultipleValue();
                                                var777.resetMultipleValues();
                                                final SubLObject var10_790 = module0580.$g4359$.currentBinding(var777);
                                                try {
                                                    module0580.$g4359$.bind(module0580.f35545(), var777);
                                                    final SubLObject var792 = module0580.$g4358$.getDynamicValue(var777);
                                                    final SubLObject var10_791 = module0034.$g879$.currentBinding(var777);
                                                    try {
                                                        module0034.$g879$.bind(var792, var777);
                                                        SubLObject var793 = (SubLObject)NIL;
                                                        if (NIL != var792 && NIL == module0034.f1842(var792)) {
                                                            var793 = module0034.f1869(var792);
                                                            final SubLObject var794 = Threads.current_process();
                                                            if (NIL == var793) {
                                                                module0034.f1873(var792, var794);
                                                            }
                                                            else if (!var793.eql(var794)) {
                                                                Errors.error((SubLObject)$ic23$);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject var795 = inference_datastructures_inference_oc.f25492(var7);
                                                            if (NIL == module0065.f4772(var795, (SubLObject)$ic384$)) {
                                                                final SubLObject var793_794 = var795;
                                                                if (NIL == module0065.f4775(var793_794, (SubLObject)$ic384$)) {
                                                                    final SubLObject var796 = module0065.f4740(var793_794);
                                                                    final SubLObject var797 = (SubLObject)NIL;
                                                                    SubLObject var798;
                                                                    SubLObject var799;
                                                                    SubLObject var800;
                                                                    SubLObject var801;
                                                                    SubLObject var802;
                                                                    SubLObject var803;
                                                                    SubLObject var10_792;
                                                                    SubLObject var11_802;
                                                                    SubLObject var804;
                                                                    SubLObject var805;
                                                                    SubLObject var806;
                                                                    SubLObject var807;
                                                                    for (var798 = Sequences.length(var796), var799 = (SubLObject)NIL, var799 = (SubLObject)ZERO_INTEGER; var799.numL(var798); var799 = Numbers.add(var799, (SubLObject)ONE_INTEGER)) {
                                                                        var800 = ((NIL != var797) ? Numbers.subtract(var798, var799, (SubLObject)ONE_INTEGER) : var799);
                                                                        var801 = Vectors.aref(var796, var800);
                                                                        if (NIL == module0065.f4749(var801) || NIL == module0065.f4773((SubLObject)$ic384$)) {
                                                                            if (NIL != module0065.f4749(var801)) {
                                                                                var801 = (SubLObject)$ic384$;
                                                                            }
                                                                            if (NIL != Functions.funcall(var772, var801)) {
                                                                                var802 = f49679(var801);
                                                                                var803 = f49680(var802);
                                                                                var10_792 = module0579.$g4262$.currentBinding(var777);
                                                                                var11_802 = module0579.$g4287$.currentBinding(var777);
                                                                                try {
                                                                                    module0579.$g4262$.bind(var155, var777);
                                                                                    module0579.$g4287$.bind((SubLObject)TWO_INTEGER, var777);
                                                                                    var777.resetMultipleValues();
                                                                                    var804 = f49953(var801, var803, var4, var155, var771);
                                                                                    var805 = var777.secondMultipleValue();
                                                                                    var806 = var777.thirdMultipleValue();
                                                                                    var807 = var777.fourthMultipleValue();
                                                                                    var777.resetMultipleValues();
                                                                                    if (NIL == f49956(var804, var805, var806)) {
                                                                                        var804 = module0038.$g916$.getGlobalValue();
                                                                                    }
                                                                                    if (NIL == module0038.f2653(var804) || NIL == module0004.f104(var804, var778, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                                                                                        var784 = (SubLObject)NIL;
                                                                                        var778 = (SubLObject)ConsesLow.cons(var804, var778);
                                                                                        var779 = (SubLObject)ConsesLow.cons(var805, var779);
                                                                                        var780 = (SubLObject)ConsesLow.cons(var806, var780);
                                                                                        var781 = (SubLObject)ConsesLow.cons(var807, var781);
                                                                                        var784 = (SubLObject)T;
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0579.$g4287$.rebind(var11_802, var777);
                                                                                    module0579.$g4262$.rebind(var10_792, var777);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                final SubLObject var807_808 = var795;
                                                                if (NIL == module0065.f4777(var807_808)) {
                                                                    final SubLObject var808 = module0065.f4738(var807_808);
                                                                    SubLObject var809 = (SubLObject)NIL;
                                                                    SubLObject var810 = (SubLObject)NIL;
                                                                    final Iterator var811 = Hashtables.getEntrySetIterator(var808);
                                                                    try {
                                                                        while (Hashtables.iteratorHasNext(var811)) {
                                                                            final Map.Entry var812 = Hashtables.iteratorNextEntry(var811);
                                                                            var809 = Hashtables.getEntryKey(var812);
                                                                            var810 = Hashtables.getEntryValue(var812);
                                                                            if (NIL != Functions.funcall(var772, var810)) {
                                                                                final SubLObject var813 = f49679(var810);
                                                                                final SubLObject var814 = f49680(var813);
                                                                                final SubLObject var10_793 = module0579.$g4262$.currentBinding(var777);
                                                                                final SubLObject var11_803 = module0579.$g4287$.currentBinding(var777);
                                                                                try {
                                                                                    module0579.$g4262$.bind(var155, var777);
                                                                                    module0579.$g4287$.bind((SubLObject)TWO_INTEGER, var777);
                                                                                    var777.resetMultipleValues();
                                                                                    SubLObject var815 = f49953(var810, var814, var4, var155, var771);
                                                                                    final SubLObject var816 = var777.secondMultipleValue();
                                                                                    final SubLObject var817 = var777.thirdMultipleValue();
                                                                                    final SubLObject var818 = var777.fourthMultipleValue();
                                                                                    var777.resetMultipleValues();
                                                                                    if (NIL == f49956(var815, var816, var817)) {
                                                                                        var815 = module0038.$g916$.getGlobalValue();
                                                                                    }
                                                                                    if (NIL != module0038.f2653(var815) && NIL != module0004.f104(var815, var778, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                                                                                        continue;
                                                                                    }
                                                                                    var784 = (SubLObject)NIL;
                                                                                    var778 = (SubLObject)ConsesLow.cons(var815, var778);
                                                                                    var779 = (SubLObject)ConsesLow.cons(var816, var779);
                                                                                    var780 = (SubLObject)ConsesLow.cons(var817, var780);
                                                                                    var781 = (SubLObject)ConsesLow.cons(var818, var781);
                                                                                    var784 = (SubLObject)T;
                                                                                }
                                                                                finally {
                                                                                    module0579.$g4287$.rebind(var11_803, var777);
                                                                                    module0579.$g4262$.rebind(var10_793, var777);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Hashtables.releaseEntrySetIterator(var811);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var10_794 = Threads.$is_thread_performing_cleanupP$.currentBinding(var777);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var777);
                                                                if (NIL != var792 && NIL == var793) {
                                                                    module0034.f1873(var792, (SubLObject)NIL);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var10_794, var777);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0034.$g879$.rebind(var10_791, var777);
                                                    }
                                                }
                                                finally {
                                                    module0580.$g4359$.rebind(var10_790, var777);
                                                }
                                                if (var791 == $ic229$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var777))) {
                                                    module0034.f1891(module0580.$g4358$.getDynamicValue(var777));
                                                }
                                            }
                                            finally {
                                                module0580.$g4358$.rebind(var10_789, var777);
                                            }
                                        }
                                        finally {
                                            final SubLObject var10_795 = Threads.$is_thread_performing_cleanupP$.currentBinding(var777);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var777);
                                                if (NIL == var790) {
                                                    module0580.f35554(module0580.$g4362$.getDynamicValue(var777));
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var10_795, var777);
                                            }
                                        }
                                    }
                                    finally {
                                        module0580.$g4362$.rebind(var10_788, var777);
                                    }
                                }
                                finally {
                                    module0580.$g4361$.rebind(var10_787, var777);
                                }
                            }
                            var782 = module0580.f35596();
                        }
                        finally {
                            module0580.$g4370$.rebind(var789, var777);
                            module0580.$g4369$.rebind(var788, var777);
                            module0580.$g4371$.rebind(var10_786, var777);
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var10_785, var777);
                    }
                }
                finally {
                    final SubLObject var10_796 = Threads.$is_thread_performing_cleanupP$.currentBinding(var777);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var777);
                        module0003.f64(var787);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_796, var777);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var786, var777);
            }
        }
        catch (Throwable var819) {
            var783 = Errors.handleThrowable(var819, var785);
        }
        finally {
            var777.throwStack.pop();
        }
        if (NIL == var784) {
            final SubLObject var820 = Numbers.min(Sequences.length(var778), new SubLObject[] { Sequences.length(var779), Sequences.length(var780), Sequences.length(var781) });
            final SubLObject var821 = Numbers.max(Sequences.length(var778), new SubLObject[] { Sequences.length(var779), Sequences.length(var780), Sequences.length(var781) });
            if (!var820.numE(var821)) {
                var778 = module0035.f2124(var820, var778);
                var779 = module0035.f2124(var820, var779);
                var780 = module0035.f2124(var820, var780);
                var781 = module0035.f2124(var820, var781);
            }
        }
        final SubLObject var822 = (SubLObject)makeBoolean(NIL != var782 || NIL != var783);
        return Values.values(var778, var779, var780, var781, var822);
    }
    
    public static SubLObject f49956(final SubLObject var803, final SubLObject var804, final SubLObject var805) {
        if (NIL == module0038.f2653(var803)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0038.f2668(constant_reader_oc.f8495(), var803, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49953(final SubLObject var6, final SubLObject var26, final SubLObject var4, final SubLObject var155, final SubLObject var771) {
        final SubLThread var772 = SubLProcess.currentSubLThread();
        SubLObject var773 = module0038.$g916$.getGlobalValue();
        SubLObject var774 = (SubLObject)NIL;
        SubLObject var775 = (SubLObject)NIL;
        SubLObject var776 = (SubLObject)ZERO_INTEGER;
        final SubLObject var777 = module0579.$g4344$.currentBinding(var772);
        final SubLObject var778 = module0579.$g4262$.currentBinding(var772);
        try {
            module0579.$g4344$.bind(module0373.f26231(var26), var772);
            module0579.$g4262$.bind(var155, var772);
            final SubLObject var779 = f49957(var6, var26);
            if (NIL != var779) {
                final SubLObject var10_824 = module0579.$g4296$.currentBinding(var772);
                final SubLObject var11_825 = module0579.$g4278$.currentBinding(var772);
                final SubLObject var780 = module0579.$g4273$.currentBinding(var772);
                final SubLObject var781 = module0579.$g4238$.currentBinding(var772);
                final SubLObject var782 = module0579.$g4350$.currentBinding(var772);
                final SubLObject var783 = module0579.$g4351$.currentBinding(var772);
                final SubLObject var784 = module0579.$g4352$.currentBinding(var772);
                final SubLObject var785 = module0579.$g4355$.currentBinding(var772);
                final SubLObject var786 = module0579.$g4353$.currentBinding(var772);
                try {
                    module0579.$g4296$.bind(var6, var772);
                    module0579.$g4278$.bind(inference_datastructures_inference_oc.f25491(inference_datastructures_inference_oc.f25732(var6)), var772);
                    module0579.$g4273$.bind((SubLObject)T, var772);
                    module0579.$g4238$.bind((SubLObject)T, var772);
                    module0579.$g4350$.bind((SubLObject)NIL, var772);
                    module0579.$g4351$.bind(f49671(), var772);
                    module0579.$g4352$.bind(f49672(), var772);
                    module0579.$g4355$.bind((SubLObject)ZERO_INTEGER, var772);
                    module0579.$g4353$.bind((SubLObject)NIL, var772);
                    var772.resetMultipleValues();
                    final SubLObject var787 = module0580.f35615();
                    final SubLObject var788 = var772.secondMultipleValue();
                    var772.resetMultipleValues();
                    final SubLObject var10_825 = module0579.$g4298$.currentBinding(var772);
                    final SubLObject var11_826 = module0579.$g4301$.currentBinding(var772);
                    try {
                        module0579.$g4298$.bind((NIL != var787) ? var787 : module0579.$g4298$.getDynamicValue(var772), var772);
                        module0579.$g4301$.bind((NIL != var788) ? var788 : module0579.$g4301$.getDynamicValue(var772), var772);
                        var775 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
                        final SubLObject var789 = module0579.$g4338$.getDynamicValue(var772);
                        final SubLObject var10_826 = module0579.$g4337$.currentBinding(var772);
                        final SubLObject var11_827 = module0579.$g4338$.currentBinding(var772);
                        try {
                            module0579.$g4337$.bind((SubLObject)((NIL != module0579.f35513()) ? module0579.$g4337$.getDynamicValue(var772) : $ic385$), var772);
                            module0579.$g4338$.bind(var775, var772);
                            final SubLObject var10_827 = module0580.$g4363$.currentBinding(var772);
                            final SubLObject var11_828 = module0580.$g4366$.currentBinding(var772);
                            final SubLObject var12_833 = module0580.$g4364$.currentBinding(var772);
                            try {
                                module0580.$g4363$.bind(module0054.f3968(), var772);
                                module0580.$g4366$.bind(module0580.f35568(), var772);
                                module0580.$g4364$.bind((SubLObject)T, var772);
                                try {
                                    final SubLObject var790 = Mapping.mapcar((SubLObject)$ic386$, var779);
                                    final SubLObject var791 = module0760.f48074(var6, var790);
                                    module0760.f48081(var791, var4, var155, var771);
                                    if (NIL != module0760.f48107(var791)) {
                                        SubLObject var792 = (SubLObject)NIL;
                                        try {
                                            var792 = streams_high.make_private_string_output_stream();
                                            module0760.f48082(var791, var792);
                                            var773 = streams_high.get_output_stream_string(var792);
                                        }
                                        finally {
                                            final SubLObject var10_828 = Threads.$is_thread_performing_cleanupP$.currentBinding(var772);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var772);
                                                streams_high.close(var792, (SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var10_828, var772);
                                            }
                                        }
                                        var776 = f49958(var791);
                                    }
                                }
                                finally {
                                    final SubLObject var10_829 = Threads.$is_thread_performing_cleanupP$.currentBinding(var772);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var772);
                                        module0580.f35566();
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_829, var772);
                                    }
                                }
                            }
                            finally {
                                module0580.$g4364$.rebind(var12_833, var772);
                                module0580.$g4366$.rebind(var11_828, var772);
                                module0580.$g4363$.rebind(var10_827, var772);
                            }
                            if (NIL != module0067.f4852(var789)) {
                                module0756.f47660(module0579.$g4338$.getDynamicValue(var772), var789);
                            }
                        }
                        finally {
                            module0579.$g4338$.rebind(var11_827, var772);
                            module0579.$g4337$.rebind(var10_826, var772);
                        }
                        var774 = var779;
                    }
                    finally {
                        module0579.$g4301$.rebind(var11_826, var772);
                        module0579.$g4298$.rebind(var10_825, var772);
                    }
                }
                finally {
                    module0579.$g4353$.rebind(var786, var772);
                    module0579.$g4355$.rebind(var785, var772);
                    module0579.$g4352$.rebind(var784, var772);
                    module0579.$g4351$.rebind(var783, var772);
                    module0579.$g4350$.rebind(var782, var772);
                    module0579.$g4238$.rebind(var781, var772);
                    module0579.$g4273$.rebind(var780, var772);
                    module0579.$g4278$.rebind(var11_825, var772);
                    module0579.$g4296$.rebind(var10_824, var772);
                }
            }
        }
        finally {
            module0579.$g4262$.rebind(var778, var772);
            module0579.$g4344$.rebind(var777, var772);
        }
        return Values.values(var773, var774, var776, var775);
    }
    
    public static SubLObject f49958(final SubLObject var835) {
        final SubLObject var836 = module0760.f48108(var835);
        return (SubLObject)(var836.isZero() ? $ic381$ : Numbers.divide((SubLObject)$ic381$, var836));
    }
    
    public static SubLObject f49957(final SubLObject var6, final SubLObject var26) {
        final SubLObject var27 = inference_datastructures_inference_oc.f25732(var6);
        final SubLObject var28 = f49670(var27);
        final SubLObject var29 = f49705(var26, var28);
        final SubLObject var30 = (NIL != module0202.f12589(var29, $ic387$)) ? f49959(var29, inference_datastructures_inference_oc.f25687(var6), var28, inference_datastructures_inference_oc.f25421(var27)) : f49960(var6, var26, var29);
        return var30;
    }
    
    public static SubLObject f49961(final SubLObject var320) {
        return module0202.f12589(var320, $ic388$);
    }
    
    public static SubLObject f49959(final SubLObject var840, final SubLObject var380, final SubLObject var29, final SubLObject var442) {
        final SubLObject var841 = module0205.f13204(var840, (SubLObject)UNPROVIDED);
        final SubLObject var842 = f49961(var841);
        final SubLObject var843 = (NIL != var842) ? module0205.f13277(var841, (SubLObject)UNPROVIDED) : var841;
        final SubLObject var844 = f49962(var843, var29, var442);
        final SubLObject var845 = (NIL != var842) ? f49963(var844, var380, var843) : f49964(var844, var380, (SubLObject)ConsesLow.list(var843));
        return var845;
    }
    
    public static SubLObject f49962(final SubLObject var843, final SubLObject var29, final SubLObject var442) {
        if (NIL != module0202.f12663(var843)) {
            final SubLObject var844 = module0434.f30574(var843, var29, (SubLObject)ConsesLow.list((SubLObject)$ic389$, (SubLObject)ONE_INTEGER, (SubLObject)$ic222$, var442));
            final SubLObject var845 = var844.first();
            return module0035.remove_if_not((SubLObject)$ic390$, conses_high.second(var845), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != assertion_handles_oc.f11035(var843)) {
            return f49824(var843);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49960(final SubLObject var6, final SubLObject var26, final SubLObject var840) {
        final SubLObject var841 = inference_datastructures_inference_oc.f25687(var6);
        final SubLObject var842 = f49712(var6, var26);
        final SubLObject var843 = module0035.remove_if_not((SubLObject)$ic390$, inference_datastructures_inference_oc.f25775(var842), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var844 = f49963(var843, var841, var840);
        return var844;
    }
    
    public static SubLObject f49963(final SubLObject var844, final SubLObject var380, final SubLObject var47) {
        if (NIL != module0035.f1997(var380) && NIL != module0206.f13425(module0233.f15370(var380.first()))) {
            return Mapping.mapcar((SubLObject)$ic391$, var380);
        }
        final SubLObject var845 = Sequences.remove_if((SubLObject)$ic16$, var844, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var846 = Sequences.delete_if((SubLObject)$ic16$, f49965(var845), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var847 = f49966(var846, var380, var47);
        return f49964(var847, var380, (SubLObject)((NIL != f49719(var47, (SubLObject)UNPROVIDED)) ? NIL : ConsesLow.list(var47)));
    }
    
    public static SubLObject f49966(final SubLObject var97, final SubLObject var380, final SubLObject var47) {
        if (NIL != f49967(var97)) {
            return f49968(var97, var380, var47);
        }
        return Values.values(var97, (SubLObject)NIL);
    }
    
    public static SubLObject f49967(final SubLObject var97) {
        return module0035.f2002(var97, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49968(final SubLObject var97, final SubLObject var380, final SubLObject var47) {
        SubLObject var381 = var97;
        SubLObject var382 = (SubLObject)NIL;
        if (NIL != var380) {
            SubLObject var383 = (SubLObject)NIL;
            SubLObject var384 = var381;
            SubLObject var385 = (SubLObject)NIL;
            var385 = var384.first();
            while (NIL != var384) {
                if (NIL != f49969(var385, var380)) {
                    var383 = (SubLObject)ConsesLow.cons(var385, var383);
                }
                var384 = var384.rest();
                var385 = var384.first();
            }
            if (NIL != var383 && NIL == module0035.f2004(var383, var381)) {
                var381 = Sequences.nreverse(var383);
                var382 = (SubLObject)ConsesLow.cons((SubLObject)$ic392$, var382);
            }
            if (NIL == f49967(var381)) {
                return Values.values(var381, var382);
            }
        }
        final SubLObject var386 = module0205.f13183(var47, (SubLObject)$ic393$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var387 = (SubLObject)NIL;
        SubLObject var388 = (SubLObject)ZERO_INTEGER;
        SubLObject var389 = var381;
        SubLObject var390 = (SubLObject)NIL;
        var390 = var389.first();
        while (NIL != var389) {
            SubLObject var391 = (SubLObject)ZERO_INTEGER;
            SubLObject var23_855 = var386;
            SubLObject var392 = (SubLObject)NIL;
            var392 = var23_855.first();
            while (NIL != var23_855) {
                if (NIL != module0205.f13220(var392, var390, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var391 = Numbers.add(var391, (SubLObject)ONE_INTEGER);
                }
                var23_855 = var23_855.rest();
                var392 = var23_855.first();
            }
            if (var391.numG(var388)) {
                var387 = (SubLObject)ConsesLow.list(var390);
                var388 = var391;
            }
            else if (var391.numE(var388)) {
                var387 = (SubLObject)ConsesLow.cons(var390, var387);
            }
            var389 = var389.rest();
            var390 = var389.first();
        }
        if (NIL != var387 && NIL == module0035.f2004(var387, var381)) {
            var381 = Sequences.nreverse(var387);
            var382 = (SubLObject)ConsesLow.cons((SubLObject)$ic394$, var382);
        }
        return Values.values(var381, var382);
    }
    
    public static SubLObject f49969(final SubLObject var58, final SubLObject var380) {
        SubLObject var381 = (SubLObject)NIL;
        if (NIL == var381) {
            SubLObject var382 = var380;
            SubLObject var383 = (SubLObject)NIL;
            var383 = var382.first();
            while (NIL == var381 && NIL != var382) {
                final SubLObject var384 = module0233.f15370(var383);
                var381 = module0205.f13220(var384, var58, (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                var382 = var382.rest();
                var383 = var382.first();
            }
        }
        return var381;
    }
    
    public static SubLObject f49970(final SubLObject var857, final SubLObject var380) {
        SubLObject var858 = (SubLObject)NIL;
        if (NIL == var858) {
            SubLObject var859 = var380;
            SubLObject var860 = (SubLObject)NIL;
            var860 = var859.first();
            while (NIL == var858 && NIL != var859) {
                final SubLObject var861 = module0233.f15370(var860);
                SubLObject var862 = f49961(var861);
                if (NIL == var862) {
                    SubLObject var162_860;
                    SubLObject var863;
                    for (var162_860 = var857, var863 = (SubLObject)NIL, var863 = var162_860.first(); NIL == var862 && NIL != var162_860; var862 = module0205.f13220(var861, var863, (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var162_860 = var162_860.rest(), var863 = var162_860.first()) {}
                }
                var858 = (SubLObject)makeBoolean(NIL == var862);
                var859 = var859.rest();
                var860 = var859.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var858);
    }
    
    public static SubLObject f49964(final SubLObject var844, final SubLObject var380, final SubLObject var861) {
        final SubLObject var862 = f49971(var844);
        final SubLObject var863 = (NIL != f49972(var862, var380)) ? var862 : var861;
        return var863;
    }
    
    public static SubLObject f49972(final SubLObject var857, final SubLObject var380) {
        if (NIL == var857) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f2002(var857, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL == f49970(var857, var380)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49965(final SubLObject var97) {
        SubLObject var98 = (SubLObject)NIL;
        SubLObject var99 = var97;
        SubLObject var100 = (SubLObject)NIL;
        var100 = var99.first();
        while (NIL != var99) {
            SubLObject var23_863 = f49702(f49693(var100, module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var101 = (SubLObject)NIL;
            var101 = var23_863.first();
            while (NIL != var23_863) {
                final SubLObject var102 = var101;
                if (NIL == conses_high.member(var102, var98, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var98 = (SubLObject)ConsesLow.cons(var102, var98);
                }
                var23_863 = var23_863.rest();
                var101 = var23_863.first();
            }
            var99 = var99.rest();
            var100 = var99.first();
        }
        return Sequences.nreverse(var98);
    }
    
    public static SubLObject f49971(final SubLObject var97) {
        return Mapping.mapcar((SubLObject)$ic395$, var97);
    }
    
    public static SubLObject f49973(final SubLObject var58) {
        final SubLObject var59 = $ic396$;
        final SubLObject var60 = (SubLObject)((NIL != constant_handles_oc.f8463(var59, (SubLObject)UNPROVIDED)) ? f49974(var58) : NIL);
        SubLObject var61 = var58;
        if (NIL != module0191.f11952(var58)) {
            var61 = module0191.f11967(var58);
        }
        if (NIL != module0206.f13451(var60)) {
            var61 = module0202.f12768(var59, var60, var61);
        }
        return var61;
    }
    
    public static SubLObject f49974(final SubLObject var58) {
        if (NIL != assertion_handles_oc.f11035(var58)) {
            return f49703(var58).first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49975(final SubLObject var6, SubLObject var4, SubLObject var155, SubLObject var771) {
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        if (var771 == UNPROVIDED) {
            var771 = module0579.$g4259$.getDynamicValue();
        }
        assert NIL != inference_datastructures_inference_oc.f25684(var6) : var6;
        return f49976(var6, var4, var155, var771);
    }
    
    public static SubLObject f49977(final SubLObject var7, SubLObject var772, SubLObject var4, SubLObject var155, SubLObject var771, SubLObject var775, SubLObject var776) {
        if (var772 == UNPROVIDED) {
            var772 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var155 == UNPROVIDED) {
            var155 = module0579.$g4262$.getDynamicValue();
        }
        if (var771 == UNPROVIDED) {
            var771 = module0579.$g4259$.getDynamicValue();
        }
        if (var775 == UNPROVIDED) {
            var775 = (SubLObject)NIL;
        }
        if (var776 == UNPROVIDED) {
            var776 = (SubLObject)NIL;
        }
        final SubLThread var777 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var7) : var7;
        if (NIL != var775 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var775)) {
            throw new AssertionError(var775);
        }
        if (NIL != var776 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var776)) {
            throw new AssertionError(var776);
        }
        SubLObject var778 = (SubLObject)NIL;
        SubLObject var779 = (SubLObject)NIL;
        SubLObject var780 = (SubLObject)NIL;
        SubLObject var781 = (SubLObject)NIL;
        SubLObject var782 = (SubLObject)NIL;
        SubLObject var783 = (SubLObject)NIL;
        SubLObject var784 = (SubLObject)T;
        final SubLObject var785 = module0003.f61();
        try {
            var777.throwStack.push(var785);
            final SubLObject var786 = module0003.$g4$.currentBinding(var777);
            try {
                module0003.$g4$.bind((SubLObject)T, var777);
                SubLObject var787 = (SubLObject)NIL;
                try {
                    final SubLObject var10_867 = module0003.$g5$.currentBinding(var777);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var777)), var777);
                        var787 = module0003.f62(var776, var785);
                        final SubLObject var10_868 = module0580.$g4371$.currentBinding(var777);
                        final SubLObject var788 = module0580.$g4369$.currentBinding(var777);
                        final SubLObject var789 = module0580.$g4370$.currentBinding(var777);
                        try {
                            module0580.$g4371$.bind((SubLObject)ZERO_INTEGER, var777);
                            module0580.$g4369$.bind(module0580.f35598(var775), var777);
                            module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var777), var777);
                            module0580.$g4370$.setDynamicValue(module0580.f35596(), var777);
                            if (NIL == module0580.$g4370$.getDynamicValue(var777)) {
                                final SubLObject var10_869 = module0580.$g4361$.currentBinding(var777);
                                try {
                                    module0580.$g4361$.bind((SubLObject)NIL, var777);
                                    var777.resetMultipleValues();
                                    final SubLObject var10_870 = module0580.$g4362$.currentBinding(var777);
                                    try {
                                        module0580.$g4362$.bind(module0580.f35560(), var777);
                                        final SubLObject var790 = var777.secondMultipleValue();
                                        var777.resetMultipleValues();
                                        try {
                                            var777.resetMultipleValues();
                                            final SubLObject var10_871 = module0580.$g4358$.currentBinding(var777);
                                            try {
                                                module0580.$g4358$.bind(module0580.f35544(), var777);
                                                final SubLObject var791 = var777.secondMultipleValue();
                                                var777.resetMultipleValues();
                                                final SubLObject var10_872 = module0580.$g4359$.currentBinding(var777);
                                                try {
                                                    module0580.$g4359$.bind(module0580.f35545(), var777);
                                                    final SubLObject var792 = module0580.$g4358$.getDynamicValue(var777);
                                                    final SubLObject var10_873 = module0034.$g879$.currentBinding(var777);
                                                    try {
                                                        module0034.$g879$.bind(var792, var777);
                                                        SubLObject var793 = (SubLObject)NIL;
                                                        if (NIL != var792 && NIL == module0034.f1842(var792)) {
                                                            var793 = module0034.f1869(var792);
                                                            final SubLObject var794 = Threads.current_process();
                                                            if (NIL == var793) {
                                                                module0034.f1873(var792, var794);
                                                            }
                                                            else if (!var793.eql(var794)) {
                                                                Errors.error((SubLObject)$ic23$);
                                                            }
                                                        }
                                                        try {
                                                            final SubLObject var795 = inference_datastructures_inference_oc.f25492(var7);
                                                            if (NIL == module0065.f4772(var795, (SubLObject)$ic384$)) {
                                                                final SubLObject var793_874 = var795;
                                                                if (NIL == module0065.f4775(var793_874, (SubLObject)$ic384$)) {
                                                                    final SubLObject var796 = module0065.f4740(var793_874);
                                                                    final SubLObject var797 = (SubLObject)NIL;
                                                                    SubLObject var798;
                                                                    SubLObject var799;
                                                                    SubLObject var800;
                                                                    SubLObject var801;
                                                                    SubLObject var10_874;
                                                                    SubLObject var11_876;
                                                                    SubLObject var802;
                                                                    SubLObject var803;
                                                                    SubLObject var804;
                                                                    SubLObject var805;
                                                                    for (var798 = Sequences.length(var796), var799 = (SubLObject)NIL, var799 = (SubLObject)ZERO_INTEGER; var799.numL(var798); var799 = Numbers.add(var799, (SubLObject)ONE_INTEGER)) {
                                                                        var800 = ((NIL != var797) ? Numbers.subtract(var798, var799, (SubLObject)ONE_INTEGER) : var799);
                                                                        var801 = Vectors.aref(var796, var800);
                                                                        if (NIL == module0065.f4749(var801) || NIL == module0065.f4773((SubLObject)$ic384$)) {
                                                                            if (NIL != module0065.f4749(var801)) {
                                                                                var801 = (SubLObject)$ic384$;
                                                                            }
                                                                            if (NIL != module0035.f1993(inference_datastructures_inference_oc.f25687(var801), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != Functions.funcall(var772, var801)) {
                                                                                var10_874 = module0579.$g4262$.currentBinding(var777);
                                                                                var11_876 = module0579.$g4287$.currentBinding(var777);
                                                                                try {
                                                                                    module0579.$g4262$.bind(var155, var777);
                                                                                    module0579.$g4287$.bind((SubLObject)TWO_INTEGER, var777);
                                                                                    var777.resetMultipleValues();
                                                                                    var802 = f49976(var801, var4, var155, var771);
                                                                                    var803 = var777.secondMultipleValue();
                                                                                    var804 = var777.thirdMultipleValue();
                                                                                    var805 = var777.fourthMultipleValue();
                                                                                    var777.resetMultipleValues();
                                                                                    if (NIL == f49978(var802, var803, var804)) {
                                                                                        var802 = module0038.$g916$.getGlobalValue();
                                                                                    }
                                                                                    if (NIL == module0038.f2653(var802) || NIL == module0004.f104(var802, var778, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                                                                                        var784 = (SubLObject)NIL;
                                                                                        var778 = (SubLObject)ConsesLow.cons(var802, var778);
                                                                                        var779 = (SubLObject)ConsesLow.cons(var803, var779);
                                                                                        var780 = (SubLObject)ConsesLow.cons(var804, var780);
                                                                                        var781 = (SubLObject)ConsesLow.cons(var805, var781);
                                                                                        var784 = (SubLObject)T;
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0579.$g4287$.rebind(var11_876, var777);
                                                                                    module0579.$g4262$.rebind(var10_874, var777);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                final SubLObject var807_879 = var795;
                                                                if (NIL == module0065.f4777(var807_879)) {
                                                                    final SubLObject var806 = module0065.f4738(var807_879);
                                                                    SubLObject var807 = (SubLObject)NIL;
                                                                    SubLObject var808 = (SubLObject)NIL;
                                                                    final Iterator var809 = Hashtables.getEntrySetIterator(var806);
                                                                    try {
                                                                        while (Hashtables.iteratorHasNext(var809)) {
                                                                            final Map.Entry var810 = Hashtables.iteratorNextEntry(var809);
                                                                            var807 = Hashtables.getEntryKey(var810);
                                                                            var808 = Hashtables.getEntryValue(var810);
                                                                            if (NIL != module0035.f1993(inference_datastructures_inference_oc.f25687(var808), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && NIL != Functions.funcall(var772, var808)) {
                                                                                final SubLObject var10_875 = module0579.$g4262$.currentBinding(var777);
                                                                                final SubLObject var11_877 = module0579.$g4287$.currentBinding(var777);
                                                                                try {
                                                                                    module0579.$g4262$.bind(var155, var777);
                                                                                    module0579.$g4287$.bind((SubLObject)TWO_INTEGER, var777);
                                                                                    var777.resetMultipleValues();
                                                                                    SubLObject var811 = f49976(var808, var4, var155, var771);
                                                                                    final SubLObject var812 = var777.secondMultipleValue();
                                                                                    final SubLObject var813 = var777.thirdMultipleValue();
                                                                                    final SubLObject var814 = var777.fourthMultipleValue();
                                                                                    var777.resetMultipleValues();
                                                                                    if (NIL == f49978(var811, var812, var813)) {
                                                                                        var811 = module0038.$g916$.getGlobalValue();
                                                                                    }
                                                                                    if (NIL != module0038.f2653(var811) && NIL != module0004.f104(var811, var778, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                                                                                        continue;
                                                                                    }
                                                                                    var784 = (SubLObject)NIL;
                                                                                    var778 = (SubLObject)ConsesLow.cons(var811, var778);
                                                                                    var779 = (SubLObject)ConsesLow.cons(var812, var779);
                                                                                    var780 = (SubLObject)ConsesLow.cons(var813, var780);
                                                                                    var781 = (SubLObject)ConsesLow.cons(var814, var781);
                                                                                    var784 = (SubLObject)T;
                                                                                }
                                                                                finally {
                                                                                    module0579.$g4287$.rebind(var11_877, var777);
                                                                                    module0579.$g4262$.rebind(var10_875, var777);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        Hashtables.releaseEntrySetIterator(var809);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject var10_876 = Threads.$is_thread_performing_cleanupP$.currentBinding(var777);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var777);
                                                                if (NIL != var792 && NIL == var793) {
                                                                    module0034.f1873(var792, (SubLObject)NIL);
                                                                }
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var10_876, var777);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0034.$g879$.rebind(var10_873, var777);
                                                    }
                                                }
                                                finally {
                                                    module0580.$g4359$.rebind(var10_872, var777);
                                                }
                                                if (var791 == $ic229$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var777))) {
                                                    module0034.f1891(module0580.$g4358$.getDynamicValue(var777));
                                                }
                                            }
                                            finally {
                                                module0580.$g4358$.rebind(var10_871, var777);
                                            }
                                        }
                                        finally {
                                            final SubLObject var10_877 = Threads.$is_thread_performing_cleanupP$.currentBinding(var777);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var777);
                                                if (NIL == var790) {
                                                    module0580.f35554(module0580.$g4362$.getDynamicValue(var777));
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var10_877, var777);
                                            }
                                        }
                                    }
                                    finally {
                                        module0580.$g4362$.rebind(var10_870, var777);
                                    }
                                }
                                finally {
                                    module0580.$g4361$.rebind(var10_869, var777);
                                }
                            }
                            var782 = module0580.f35596();
                        }
                        finally {
                            module0580.$g4370$.rebind(var789, var777);
                            module0580.$g4369$.rebind(var788, var777);
                            module0580.$g4371$.rebind(var10_868, var777);
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var10_867, var777);
                    }
                }
                finally {
                    final SubLObject var10_878 = Threads.$is_thread_performing_cleanupP$.currentBinding(var777);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var777);
                        module0003.f64(var787);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_878, var777);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var786, var777);
            }
        }
        catch (Throwable var815) {
            var783 = Errors.handleThrowable(var815, var785);
        }
        finally {
            var777.throwStack.pop();
        }
        if (NIL == var784) {
            final SubLObject var816 = Numbers.min(Sequences.length(var778), new SubLObject[] { Sequences.length(var779), Sequences.length(var780), Sequences.length(var781) });
            final SubLObject var817 = Numbers.max(Sequences.length(var778), new SubLObject[] { Sequences.length(var779), Sequences.length(var780), Sequences.length(var781) });
            if (!var816.numE(var817)) {
                var778 = module0035.f2124(var816, var778);
                var779 = module0035.f2124(var816, var779);
                var780 = module0035.f2124(var816, var780);
                var781 = module0035.f2124(var816, var781);
            }
        }
        final SubLObject var818 = (SubLObject)makeBoolean(NIL != var782 || NIL != var783);
        return Values.values(var778, var779, var780, var781, var818);
    }
    
    public static SubLObject f49976(final SubLObject var6, final SubLObject var4, final SubLObject var155, final SubLObject var771) {
        final SubLThread var772 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var772) && NIL == module0035.f1993(inference_datastructures_inference_oc.f25687(var6), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic397$, var6);
        }
        SubLObject var773 = module0038.$g916$.getGlobalValue();
        SubLObject var774 = (SubLObject)NIL;
        SubLObject var775 = (SubLObject)NIL;
        SubLObject var776 = (SubLObject)ZERO_INTEGER;
        final SubLObject var777 = module0579.$g4262$.currentBinding(var772);
        try {
            module0579.$g4262$.bind(var155, var772);
            final SubLObject var778 = f49979(var6);
            final SubLObject var779 = (SubLObject)$ic3$;
            if (NIL != var778) {
                var775 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
                final SubLObject var780 = module0579.$g4338$.getDynamicValue(var772);
                final SubLObject var10_888 = module0579.$g4337$.currentBinding(var772);
                final SubLObject var781 = module0579.$g4338$.currentBinding(var772);
                try {
                    module0579.$g4337$.bind((SubLObject)((NIL != module0579.f35513()) ? module0579.$g4337$.getDynamicValue(var772) : $ic385$), var772);
                    module0579.$g4338$.bind(var775, var772);
                    var773 = module0770.f49067(var778, var779, (SubLObject)$ic2$, var4, var155, var771, (SubLObject)UNPROVIDED);
                    if (NIL != module0067.f4852(var780)) {
                        module0756.f47660(module0579.$g4338$.getDynamicValue(var772), var780);
                    }
                }
                finally {
                    module0579.$g4338$.rebind(var781, var772);
                    module0579.$g4337$.rebind(var10_888, var772);
                }
                var774 = var778;
                var776 = (SubLObject)((NIL != var773) ? f49980(var775) : ZERO_INTEGER);
            }
        }
        finally {
            module0579.$g4262$.rebind(var777, var772);
        }
        return Values.values(var773, var774, var776, var775);
    }
    
    public static SubLObject f49979(final SubLObject var6) {
        final SubLObject var7 = inference_datastructures_inference_oc.f25687(var6);
        if (NIL != var7) {
            final SubLObject var8 = module0233.f15370(var7.first());
            return (SubLObject)((NIL != module0751.f46709(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? NIL : var8);
        }
        return $ic398$;
    }
    
    public static SubLObject f49980(final SubLObject var806) {
        final SubLObject var807 = module0067.f4861(var806);
        return Numbers.divide((SubLObject)$ic381$, module0048.f_1X(var807));
    }
    
    public static SubLObject f49978(final SubLObject var877, final SubLObject var890, final SubLObject var805) {
        if (NIL == module0038.f2653(var877)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0038.f2668(constant_reader_oc.f8495(), var877, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49981() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49669", "GENERATE-INFERENCE-ANSWER-SENTENCE-FOR-JAVA", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49674", "S#54198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49677", "S#54199", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49681", "PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49675", "S#54200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49685", "S#54201", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49687", "S#54202", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49689", "S#54203", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49695", "S#54204", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49696", "S#54205", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49697", "S#54206", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49688", "S#54207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49692", "S#54208", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49702", "S#54209", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49700", "S#54210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49683", "S#54211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49707", "S#54212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49679", "S#46274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49709", "S#54213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49710", "S#54214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49712", "S#54215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49680", "S#54216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49713", "PPH-PROOF-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49715", "S#54217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49714", "S#54218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49711", "S#54219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49676", "S#54220", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49731", "S#54221", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49725", "S#54222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49734", "S#54223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49733", "S#54224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49727", "S#54225", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49671", "S#39296", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49718", "S#54226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49717", "S#54227", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49722", "S#54228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49736", "S#54229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49737", "S#54230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49672", "S#39297", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49738", "S#54231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49724", "S#54232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49739", "S#54233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49716", "S#54234", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49740", "S#54235", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49721", "S#54236", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49720", "S#54237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49732", "S#54238", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49743", "S#54239", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49735", "S#53735", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49748", "S#54240", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49751", "S#54241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49756", "S#54242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49704", "S#54243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49749", "S#54244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49706", "S#54245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49758", "S#54246", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49729", "S#54247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49761", "S#54248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49741", "S#54249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49757", "S#54250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49745", "S#54251", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49766", "S#54252", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49723", "S#54253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49742", "S#54254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49744", "S#54255", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49769", "S#54256", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49770", "S#54257", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49775", "S#54258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49776", "S#54259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49777", "S#54260", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49772", "S#54261", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49780", "S#54262", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49773", "S#54263", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49767", "S#54264", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49781", "S#54265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49779", "S#54266", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49782", "S#54267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49774", "S#54268", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49788", "S#54269", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49791", "S#54270", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49792", "S#54271", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49783", "S#54272", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49793", "S#54273", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49798", "S#53727", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49799", "S#53725", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49803", "S#54274", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49802", "S#54275", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49747", "S#53724", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49805", "S#54276", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49804", "S#54277", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49800", "S#54278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49787", "S#54279", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49806", "S#54280", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49808", "S#54281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49801", "S#54282", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49795", "S#54283", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49809", "S#54284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49810", "S#54285", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0775", "f49811", "S#54286");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0775", "f49812", "S#54287");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49771", "S#54288", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49813", "S#54289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49784", "S#53719", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49789", "S#54290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49746", "S#54291", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49785", "S#54292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49814", "S#54293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49818", "S#54294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49819", "S#54295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49823", "S#54296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49750", "S#54297", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49817", "S#54298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49816", "S#53741", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49754", "S#53740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49827", "S#54299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49752", "S#53732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49825", "S#54300", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49753", "S#54301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49828", "S#54302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49829", "S#54303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49826", "S#54304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49730", "S#54305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49764", "S#54306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49831", "S#54307", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49755", "S#53738", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49832", "S#54308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49759", "S#53718", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49834", "S#54309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49708", "S#53714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49833", "S#54310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49835", "S#54311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49837", "S#54312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49838", "S#54313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49836", "S#54314", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0775", "f49839", "S#54315");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49726", "S#50951", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49719", "S#53728", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49851", "S#54316", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49852", "S#54317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49850", "S#54318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49848", "S#54319", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49842", "S#54320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49849", "S#54321", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49841", "S#54322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49844", "S#54323", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49843", "S#54324", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49845", "S#54325", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49854", "S#54326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49853", "S#54327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49846", "S#54328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49847", "S#54329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49855", "S#54330", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49807", "S#54331", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49858", "S#54332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49859", "S#54333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49856", "S#54334", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49860", "S#54335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49857", "S#54336", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49830", "S#54337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49686", "S#54338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49862", "S#54339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49821", "S#53730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49864", "S#53726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49703", "S#52548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49867", "S#54340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49865", "S#54341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49869", "S#54342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49871", "S#54343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49870", "S#54344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49872", "S#54345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49873", "S#53742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49874", "S#54346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49875", "S#54347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49876", "S#52543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49877", "S#54348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49868", "S#52549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49878", "S#54349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49866", "S#54350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49879", "S#54351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49881", "S#54352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49882", "S#54353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49880", "S#54354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49822", "S#54355", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49861", "S#54356", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49684", "S#53720", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49884", "S#53488", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49885", "S#53721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49883", "S#54357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49863", "S#54358", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49682", "S#54359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49886", "S#54360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49887", "S#54361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49888", "S#54362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49768", "S#54363", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49892", "S#54364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49889", "S#54365", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49893", "S#54366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49894", "S#54367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49895", "S#54368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49896", "S#54369", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49890", "S#54370", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49897", "S#54371", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49898", "S#54372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49891", "S#54373", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49899", "S#54374", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49900", "S#54143", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49904", "S#54375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49901", "S#54376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49902", "S#54377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49906", "S#54378", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49907", "S#54379", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0775", "f49908", "S#54380");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49905", "S#54381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49903", "S#54382", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49911", "S#54383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49909", "S#54384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49912", "S#54385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49910", "S#54386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49913", "S#54387", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49914", "S#54388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49670", "S#53715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49678", "S#54389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49786", "S#54390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49820", "S#51003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49796", "S#54391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49694", "S#54392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49916", "S#54393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49915", "S#54394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49917", "S#54395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49918", "S#54396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49919", "S#54397", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49790", "S#54398", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49921", "S#54399", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49924", "S#54400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49925", "S#54401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49794", "S#54402", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49922", "S#54403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49923", "S#54404", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49920", "S#54405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49926", "S#54406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49927", "S#54407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49797", "S#54408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49690", "S#53736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49928", "S#54409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49673", "S#53723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49929", "S#54410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49840", "S#53733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49705", "S#53739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49728", "S#53737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49691", "S#53734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49930", "S#54411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49762", "S#54412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49931", "S#54413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49932", "S#54414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49763", "S#54415", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49693", "S#54416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49778", "S#54417", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49698", "S#54418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49701", "S#54419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49699", "S#54420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49933", "S#54421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49760", "S#54422", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49935", "S#54423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49934", "S#54424", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49765", "S#54425", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49937", "S#54426", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49936", "S#54427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49824", "S#53272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49945", "S#54428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49815", "S#54429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49946", "S#54430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49947", "S#54431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49941", "S#54432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49943", "S#54433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49944", "S#54434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49942", "S#54435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49938", "S#54436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49939", "S#54437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49949", "S#54438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49940", "S#54439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49950", "S#54440", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49948", "S#54441", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49951", "S#54442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49952", "S#54443", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49954", "S#54444", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49955", "S#54445", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49956", "S#54446", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49953", "S#54447", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49958", "S#54448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49957", "S#54449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49961", "S#54450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49959", "S#54451", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49962", "S#54452", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49960", "S#54453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49963", "S#54454", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49966", "S#54455", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49967", "S#54456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49968", "S#54457", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49969", "S#54458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49970", "S#54459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49964", "S#54460", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49972", "S#54461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49965", "S#54462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49971", "S#54463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49973", "S#54464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49974", "S#54465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49975", "S#54466", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49977", "S#54467", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49976", "S#54468", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49979", "S#54469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49980", "S#54470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0775", "f49978", "S#54471", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49982() {
        $g6217$ = SubLFiles.defparameter("S#54472", (SubLObject)NIL);
        $g6218$ = SubLFiles.deflexical("S#54473", (SubLObject)TEN_INTEGER);
        $g6219$ = SubLFiles.defparameter("S#54474", (SubLObject)ZERO_INTEGER);
        $g6220$ = SubLFiles.defparameter("S#54475", (SubLObject)NIL);
        $g6221$ = SubLFiles.deflexical("S#54476", (SubLObject)NIL);
        $g6222$ = SubLFiles.defparameter("S#54477", (SubLObject)$ic152$);
        $g6223$ = SubLFiles.deflexical("S#54478", (SubLObject)$ic227$);
        $g6224$ = SubLFiles.defparameter("S#54479", (SubLObject)NIL);
        $g6225$ = SubLFiles.deflexical("S#54480", module0107.f7627());
        $g6226$ = SubLFiles.defparameter("S#54481", (SubLObject)T);
        $g6227$ = SubLFiles.defparameter("S#54482", (SubLObject)TWO_INTEGER);
        $g6228$ = SubLFiles.defparameter("S#54483", (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49983() {
        module0002.f38((SubLObject)$ic0$);
        module0034.f1895((SubLObject)$ic26$);
        module0034.f1895((SubLObject)$ic83$);
        module0034.f1895((SubLObject)$ic101$);
        module0034.f1895((SubLObject)$ic145$);
        module0034.f1895((SubLObject)$ic16$);
        module0034.f1895((SubLObject)$ic17$);
        module0034.f1895((SubLObject)$ic155$);
        module0034.f1895((SubLObject)$ic178$);
        module0034.f1895((SubLObject)$ic200$);
        module0034.f1895((SubLObject)$ic214$);
        module0034.f1895((SubLObject)$ic228$);
        module0034.f1895((SubLObject)$ic234$);
        module0034.f1895((SubLObject)$ic239$);
        module0034.f1895((SubLObject)$ic357$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f49981();
    }
    
    public void initializeVariables() {
        f49982();
    }
    
    public void runTopLevelForms() {
        f49983();
    }
    
    static {
        me = (SubLFile)new module0775();
        $g6217$ = null;
        $g6218$ = null;
        $g6219$ = null;
        $g6220$ = null;
        $g6221$ = null;
        $g6222$ = null;
        $g6223$ = null;
        $g6224$ = null;
        $g6225$ = null;
        $g6226$ = null;
        $g6227$ = null;
        $g6228$ = null;
        $ic0$ = makeSymbol("GENERATE-INFERENCE-ANSWER-SENTENCE-FOR-JAVA");
        $ic1$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic2$ = makeKeyword("DEFAULT");
        $ic3$ = makeKeyword("DECLARATIVE");
        $ic4$ = makeString("Couldn't generate a paraphrase for the sentence proven by inference answer ~S ~S ~S");
        $ic5$ = makeSymbol("S#54219", "CYC");
        $ic6$ = makeKeyword("FIND-BEST");
        $ic7$ = makeString("~S is not a proof of ~S");
        $ic8$ = makeString("proof");
        $ic9$ = makeSymbol("INFERENCE-ANSWER-P");
        $ic10$ = makeSymbol("S#26816", "CYC");
        $ic11$ = makeString("Facts Proved:");
        $ic12$ = makeSymbol("S#11995", "CYC");
        $ic13$ = makeString("Selected ");
        $ic14$ = makeString("Facts Used from Knowledge Base:");
        $ic15$ = makeSymbol("ASSERTED-ASSERTION?");
        $ic16$ = makeSymbol("S#53738", "CYC");
        $ic17$ = makeSymbol("S#53714", "CYC");
        $ic18$ = makeSymbol("HL-SUPPORT-P");
        $ic19$ = makeKeyword("SKSI");
        $ic20$ = makeSymbol("S#53728", "CYC");
        $ic21$ = makeSymbol("S#50951", "CYC");
        $ic22$ = makeSymbol("S#54212", "CYC");
        $ic23$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic24$ = makeSymbol("<");
        $ic25$ = makeSymbol("PPH-PROOF-DEPTH");
        $ic26$ = makeSymbol("S#54218", "CYC");
        $ic27$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic28$ = makeSymbol("SUPPORT-SENTENCE");
        $ic29$ = makeKeyword("SUPPORTS-AND-CONCLUSION");
        $ic30$ = makeString("See above");
        $ic31$ = makeString("From question");
        $ic32$ = makeString("see_above_");
        $ic33$ = makeString("text/css");
        $ic34$ = makeString("screen");
        $ic35$ = makeString("none");
        $ic36$ = makeString("");
        $ic37$ = makeKeyword("INVISIBLE");
        $ic38$ = makeKeyword("TEXT");
        $ic39$ = makeString("(~A)");
        $ic40$ = makeSymbol("S#54229", "CYC");
        $ic41$ = makeSymbol("S#28937", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#34269", "CYC"), (SubLObject)makeSymbol("S#34270", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#34275", "CYC"), (SubLObject)makeSymbol("S#34276", "CYC"));
        $ic44$ = makeString("By analogous reasoning, ");
        $ic45$ = makeString("since:");
        $ic46$ = makeString("it follows that:");
        $ic47$ = makeString("Trivially: ");
        $ic48$ = makeSymbol("S#12732", "CYC");
        $ic49$ = makeSymbol("S#5859", "CYC");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("ruleAndSupportsTrivialForJustificationParaphrase"));
        $ic51$ = makeSymbol("S#53727", "CYC");
        $ic52$ = makeKeyword("CODE");
        $ic53$ = makeString("_");
        $ic54$ = makeString("Proof that");
        $ic55$ = makeString("Intermediate Result:");
        $ic56$ = makeString("Conclusion:");
        $ic57$ = makeString("Supporting Facts");
        $ic58$ = makeString("_transformation_supports");
        $ic59$ = makeString("Rule Application:");
        $ic60$ = makeString("Transformation Proof Supports");
        $ic61$ = makeSymbol("S#15542", "CYC");
        $ic62$ = makeSymbol("S#54421", "CYC");
        $ic63$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("S#54484", "CYC"));
        $ic64$ = makeString("_meta_");
        $ic65$ = makeKeyword("HYPOTHESIZED");
        $ic66$ = makeKeyword("FROM-KB");
        $ic67$ = makeString("Applicable Rule:");
        $ic68$ = makeSymbol("FIRST");
        $ic69$ = makeSymbol("S#18186", "CYC");
        $ic70$ = makeString("transformation_rule_");
        $ic71$ = makeString("Invalidated Rule");
        $ic72$ = makeString("Supporting Rule");
        $ic73$ = makeString("Transformation Supports");
        $ic74$ = makeKeyword("IMPLICATION");
        $ic75$ = makeKeyword("DISJUNCTION");
        $ic76$ = makeKeyword("DERIVED-FROM-HYPOTHESIS");
        $ic77$ = makeString("Given (from the question):");
        $ic78$ = makeString("Derived from the question:");
        $ic79$ = makeString("Given (from the knowledge base):");
        $ic80$ = makeString("Other Givens:");
        $ic81$ = makeString("_restriction-subproofs");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic83$ = makeSymbol("S#54275", "CYC");
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("TrivialityContextForIndividualFn"));
        $ic85$ = makeKeyword("DEPTH");
        $ic86$ = makeKeyword("STACK");
        $ic87$ = makeKeyword("QUEUE");
        $ic88$ = makeSymbol("S#11450", "CYC");
        $ic89$ = makeKeyword("ERROR");
        $ic90$ = makeString("~A is not a ~A");
        $ic91$ = makeSymbol("S#11592", "CYC");
        $ic92$ = makeKeyword("CERROR");
        $ic93$ = makeString("continue anyway");
        $ic94$ = makeKeyword("WARN");
        $ic95$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic97$ = makeString("~A is neither SET-P nor LISTP.");
        $ic98$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("TrivialityContextForTypeFn"));
        $ic100$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic101$ = makeSymbol("S#54277", "CYC");
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("IrrelevanceContextForIndividualFn"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("IrrelevanceContextForTypeFn"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("ruleRequiredForJustificationParaphrase"));
        $ic105$ = makeKeyword("ASSERTION");
        $ic106$ = makeKeyword("IGNORE");
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("ruleConclusionsTrivial"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("mtTrivialForJustificationParaphrase"));
        $ic109$ = makeKeyword("MT");
        $ic110$ = ConsesLow.list((SubLObject)makeSymbol("S#54485", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic111$ = makeSymbol("S#1021", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)makeKeyword("BORDER"), (SubLObject)ZERO_INTEGER, (SubLObject)makeKeyword("CLASS"), (SubLObject)makeString("pf-indent"));
        $ic113$ = makeSymbol("S#1028", "CYC");
        $ic114$ = makeSymbol("S#1023", "CYC");
        $ic115$ = ConsesLow.list((SubLObject)makeKeyword("CLASS"), (SubLObject)makeString("pf-indent-td"));
        $ic116$ = makeSymbol("S#1024", "CYC");
        $ic117$ = ConsesLow.list((SubLObject)makeSymbol("S#1023", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CLASS"), (SubLObject)makeString("pf-indent-td")));
        $ic118$ = makeString("subproofs_");
        $ic119$ = makeString("pf-indent");
        $ic120$ = makeString("pf-indent-td");
        $ic121$ = makeString("~A_subproof");
        $ic122$ = makeString("~A_subproof_~D");
        $ic123$ = makeString("support");
        $ic124$ = makeKeyword("UNCOMPUTED");
        $ic125$ = constant_handles_oc.f8479((SubLObject)makeString("predHighlyRelevantForJustificationParaphrase"));
        $ic126$ = makeString("_see_above");
        $ic127$ = makeString("Invalidated support");
        $ic128$ = makeString("meta_supports_");
        $ic129$ = makeString("~A_meta_~D");
        $ic130$ = makeString("assert_info_");
        $ic131$ = makeString("--");
        $ic132$ = constant_handles_oc.f8479((SubLObject)makeString("HypotheticalContext"));
        $ic133$ = makeString("This was stated in the question.");
        $ic134$ = makeString("Note: This rule has exceptions, but none that apply in this case.");
        $ic135$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic136$ = makeString("Note: This rule has further conditions on its application, but all are met in this case.");
        $ic137$ = makeKeyword("EVAL");
        $ic138$ = makeSymbol("NAUT-P");
        $ic139$ = makeString("Skipping meta-supports for ~S");
        $ic140$ = makeString("Pruning all supports for ~S~% due to ~S");
        $ic141$ = makeKeyword("IRRELEVANT");
        $ic142$ = makeSymbol("S#54299", "CYC");
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("suppressLiteralForJustificationParaphrase"));
        $ic144$ = makeString("Pruning ~S");
        $ic145$ = makeSymbol("S#54304", "CYC");
        $ic146$ = makeKeyword("RTV");
        $ic147$ = makeKeyword("GENLPREDS");
        $ic148$ = makeSymbol("S#54429", "CYC");
        $ic149$ = makeString("+2");
        $ic150$ = makeString("Invalid");
        $ic151$ = makeString("~A_~D");
        $ic152$ = ConsesLow.list((SubLObject)makeKeyword("REFORMULATE"));
        $ic153$ = makeSymbol("S#54311", "CYC");
        $ic154$ = makeSymbol("S#54312", "CYC");
        $ic155$ = makeSymbol("S#54314", "CYC");
        $ic156$ = makeSymbol("S#12274", "CYC");
        $ic157$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic158$ = constant_handles_oc.f8479((SubLObject)makeString("rewriteOf"));
        $ic159$ = makeKeyword("GAF");
        $ic160$ = makeKeyword("TRUE");
        $ic161$ = ConsesLow.list((SubLObject)makeSymbol("S#42702", "CYC"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic162$ = makeSymbol("PWHEN");
        $ic163$ = makeSymbol("S#38999", "CYC");
        $ic164$ = makeSymbol("WARN");
        $ic165$ = makeSymbol("CCONCATENATE");
        $ic166$ = makeSymbol("S#176", "CYC");
        $ic167$ = makeString("PPH irrelevant formula:~% ~S~%");
        $ic168$ = makeString("PPH irrelevant formula:");
        $ic169$ = makeString(" ");
        $ic170$ = makeString("Has EL variable functor: ~S.");
        $ic171$ = makeString("Has HL variable functor: ~S.");
        $ic172$ = constant_handles_oc.f8479((SubLObject)makeString("interestingSentence"));
        $ic173$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic174$ = makeString("Has irrelevant FORT: ~S in ~S.");
        $ic175$ = makeKeyword("PREDICATE");
        $ic176$ = makeString("Trivial functional sentence.");
        $ic177$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceTrivialForJustificationParaphrase"));
        $ic178$ = makeSymbol("S#54318", "CYC");
        $ic179$ = constant_handles_oc.f8479((SubLObject)makeString("The"));
        $ic180$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls"))), (SubLObject)makeKeyword("FULLY-BOUND"), constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic181$ = constant_handles_oc.f8479((SubLObject)makeString("FunctionalPredicate"));
        $ic182$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("?FN"), (SubLObject)makeSymbol("?ARGNUM"));
        $ic183$ = constant_handles_oc.f8479((SubLObject)makeString("functionCorrespondingPredicate"));
        $ic184$ = makeSymbol("?FN");
        $ic185$ = ConsesLow.list((SubLObject)makeSymbol("?ARGNUM"));
        $ic186$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"));
        $ic187$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#11675", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"));
        $ic188$ = makeString("Trivial functional sentence:~% ~S~%");
        $ic189$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("InstanceWithRelationToFn")), constant_handles_oc.f8479((SubLObject)makeString("InstanceWithRelationFromFn")));
        $ic190$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic191$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic192$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionUnionFn"));
        $ic193$ = constant_handles_oc.f8479((SubLObject)makeString("instanceAndSpecSentencesTrivialForJustificationParaphrase"));
        $ic194$ = constant_handles_oc.f8479((SubLObject)makeString("specSentencesTrivialForJustificationParaphrase"));
        $ic195$ = makeString("Trivial #$genls sentence:~% ~S~%");
        $ic196$ = constant_handles_oc.f8479((SubLObject)makeString("instanceSentencesTrivialForJustificationParaphrase"));
        $ic197$ = constant_handles_oc.f8479((SubLObject)makeString("SingletonCollectionFn"));
        $ic198$ = makeString("Trivial #$isa sentence:~% ~S~%");
        $ic199$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic200$ = makeSymbol("S#54327", "CYC");
        $ic201$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic202$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceRequiredForJustificationParaphrase"));
        $ic203$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic204$ = makeSymbol("?AS");
        $ic205$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic206$ = constant_handles_oc.f8479((SubLObject)makeString("assertionSentence"));
        $ic207$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertionRequiredForJustificationParaphrase")), (SubLObject)makeSymbol("?AS")));
        $ic208$ = ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#12628", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#21679", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#9941", "CYC")));
        $ic209$ = makeSymbol("S#9941", "CYC");
        $ic210$ = makeSymbol("S#24413", "CYC");
        $ic211$ = makeSymbol("S#21679", "CYC");
        $ic212$ = makeKeyword("ANYTHING");
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("reflexiveInArgs"));
        $ic214$ = makeSymbol("S#54331", "CYC");
        $ic215$ = makeString("~A is trivial");
        $ic216$ = constant_handles_oc.f8479((SubLObject)makeString("predTrivialForJustificationParaphrase"));
        $ic217$ = constant_handles_oc.f8479((SubLObject)makeString("assertionTrivialForJustificationParaphrase"));
        $ic218$ = makeString("~S is an unknown triviality type.");
        $ic219$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic220$ = makeKeyword("INFERENCE-MODE");
        $ic221$ = makeKeyword("MINIMAL");
        $ic222$ = makeKeyword("PROBLEM-STORE");
        $ic223$ = makeString("additional_supports_");
        $ic224$ = makeString("Additional Supports");
        $ic225$ = makeString("~A_additional_~D");
        $ic226$ = makeSymbol("S#54340", "CYC");
        $ic227$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("highlyRelevantAssertion")), constant_handles_oc.f8479((SubLObject)makeString("nonAbducibleRule")), constant_handles_oc.f8479((SubLObject)makeString("forwardReificationRule")), constant_handles_oc.f8479((SubLObject)makeString("except")), constant_handles_oc.f8479((SubLObject)makeString("abnormal")), constant_handles_oc.f8479((SubLObject)makeString("meetsPragmaticRequirement")), constant_handles_oc.f8479((SubLObject)makeString("assertPriorToInCreationTemplate")), constant_handles_oc.f8479((SubLObject)makeString("creationTemplateAssertions")), constant_handles_oc.f8479((SubLObject)makeString("creationTemplateAllowableRules")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNoteOKForInclusionInResearchCyc")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("definitionalDisplayAssertion")), constant_handles_oc.f8479((SubLObject)makeString("salientAssertions")), constant_handles_oc.f8479((SubLObject)makeString("exampleAssertions")), constant_handles_oc.f8479((SubLObject)makeString("toBeReviewedBy")), constant_handles_oc.f8479((SubLObject)makeString("mixedRule")), constant_handles_oc.f8479((SubLObject)makeString("correctsMixedRule")), constant_handles_oc.f8479((SubLObject)makeString("assertionWorkflowStatus")), constant_handles_oc.f8479((SubLObject)makeString("workaroundAssertionForBug")), constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion")), constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion-Terse")), constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion-Precise")), constant_handles_oc.f8479((SubLObject)makeString("englishGloss")), constant_handles_oc.f8479((SubLObject)makeString("politenessOfWS")), constant_handles_oc.f8479((SubLObject)makeString("formalityOfWS")), constant_handles_oc.f8479((SubLObject)makeString("strengthOfLexicalMapping")), constant_handles_oc.f8479((SubLObject)makeString("nlPragmaticRequirement")), constant_handles_oc.f8479((SubLObject)makeString("rhetoricalDeviceOfPhrase")), constant_handles_oc.f8479((SubLObject)makeString("reformulationPrecondition")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForNPPOutputTersification")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForQuantifierUnification")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForVPPProcessing-NonStateVerbs")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForQueryProcessing")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForQuantifierMovement")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForQuantifierProcessing")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForSubcollectionProcessing")), constant_handles_oc.f8479((SubLObject)makeString("useReformulationRuleForSimplification")), constant_handles_oc.f8479((SubLObject)makeString("tkbAptimaTieAssertion")), constant_handles_oc.f8479((SubLObject)makeString("tkbAptimaTieAssertion-Prototype2")), constant_handles_oc.f8479((SubLObject)makeString("tkbAptimaTieAssertion-Prototype")), constant_handles_oc.f8479((SubLObject)makeString("ruleTrivialForJustificationParaphrase")), constant_handles_oc.f8479((SubLObject)makeString("ruleConclusionsTrivial")), constant_handles_oc.f8479((SubLObject)makeString("assertionUsedInProcessType")), constant_handles_oc.f8479((SubLObject)makeString("constraint")), constant_handles_oc.f8479((SubLObject)makeString("domainSpecificDefaultForwardRule")), constant_handles_oc.f8479((SubLObject)makeString("assertionEvaluated")), constant_handles_oc.f8479((SubLObject)makeString("evaluee-Direct")), constant_handles_oc.f8479((SubLObject)makeString("nthInOrdering")), constant_handles_oc.f8479((SubLObject)makeString("usedInWPDemoInferencing")), constant_handles_oc.f8479((SubLObject)makeString("chemicalLaw")), constant_handles_oc.f8479((SubLObject)makeString("softwareAssertionParameterValueInSpecification")), constant_handles_oc.f8479((SubLObject)makeString("omitFromIKB")), constant_handles_oc.f8479((SubLObject)makeString("programActionTypeRules")), constant_handles_oc.f8479((SubLObject)makeString("queryPracticeRules")), constant_handles_oc.f8479((SubLObject)makeString("queryPracticeGAFs")), constant_handles_oc.f8479((SubLObject)makeString("deprecatedSalientDescriptorRuleAssertion")), constant_handles_oc.f8479((SubLObject)makeString("assertionDirectionForProjectBuilds")), constant_handles_oc.f8479((SubLObject)makeString("genlRules")) });
        $ic228$ = makeSymbol("S#54343", "CYC");
        $ic229$ = makeKeyword("NEW");
        $ic230$ = constant_handles_oc.f8479((SubLObject)makeString("supportsInMtMayHaveGraphInformation"));
        $ic231$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic232$ = makeSymbol("?GRAPH");
        $ic233$ = constant_handles_oc.f8479((SubLObject)makeString("ist-Graph"));
        $ic234$ = makeSymbol("S#52549", "CYC");
        $ic235$ = makeSymbol("?SOURCE");
        $ic236$ = constant_handles_oc.f8479((SubLObject)makeString("mtSource"));
        $ic237$ = ConsesLow.list((SubLObject)makeSymbol("?SOURCE"));
        $ic238$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"));
        $ic239$ = makeSymbol("S#54350", "CYC");
        $ic240$ = constant_handles_oc.f8479((SubLObject)makeString("sourceOfAssertion-NonTrivial"));
        $ic241$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"));
        $ic242$ = makeSymbol("STRINGP");
        $ic243$ = makeSymbol("S#54353", "CYC");
        $ic244$ = constant_handles_oc.f8479((SubLObject)makeString("StringInDocumentFn"));
        $ic245$ = makeString(" from ~A");
        $ic246$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceHighlyRelevantForJustificationParaphrase"));
        $ic247$ = makeKeyword("INTERROGATIVE");
        $ic248$ = constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-Constrained"));
        $ic249$ = makeKeyword("NONE");
        $ic250$ = makeKeyword("ANY");
        $ic251$ = makeSymbol("?TEMPLATE");
        $ic252$ = constant_handles_oc.f8479((SubLObject)makeString("justificationTemplateAppliesToProof"));
        $ic253$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)ONE_INTEGER);
        $ic254$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeSymbol("?KA"), (SubLObject)makeString("K<sub>a</sub>")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("?PH"), (SubLObject)makeString("pH")));
        $ic255$ = makeString("Since:");
        $ic256$ = makeString("and since:");
        $ic257$ = makeSymbol("?CONSTRAINT");
        $ic258$ = constant_handles_oc.f8479((SubLObject)makeString("justificationTemplateApplicabilityConstraint"));
        $ic259$ = ConsesLow.list((SubLObject)makeSymbol("?CONSTRAINT"));
        $ic260$ = makeString("the Henderson-Hasselbalch equation");
        $ic261$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("ANYTHING"), constant_handles_oc.f8479((SubLObject)makeString("AqueousBufferSolution")));
        $ic262$ = makeString("_sub");
        $ic263$ = makeSymbol("?RULE-GLOSS-TEMPLATE");
        $ic264$ = constant_handles_oc.f8479((SubLObject)makeString("justificationGenerationRuleGlossTemplate"));
        $ic265$ = ConsesLow.list((SubLObject)makeSymbol("?RULE-GLOSS-TEMPLATE"));
        $ic266$ = makeString("We can apply the rule: ");
        $ic267$ = makeKeyword("RIGHT");
        $ic268$ = makeKeyword("TOP");
        $ic269$ = makeKeyword("CENTER");
        $ic270$ = makeKeyword("NBSP");
        $ic271$ = makeString("=");
        $ic272$ = makeKeyword("LEFT");
        $ic273$ = ConsesLow.list((SubLObject)makeSymbol("?KA"), (SubLObject)makeSymbol("?PH"));
        $ic274$ = makeSymbol("INTEGERP");
        $ic275$ = makeSymbol("S#54073", "CYC");
        $ic276$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic277$ = makeSymbol("S#53761", "CYC");
        $ic278$ = makeString("body");
        $ic279$ = makeString("Query:");
        $ic280$ = makeSymbol("S#53881", "CYC");
        $ic281$ = makeString("justifications");
        $ic282$ = makeString("yui-navset");
        $ic283$ = makeString("yui-nav");
        $ic284$ = makeSymbol("S#53745", "CYC");
        $ic285$ = makeString("#");
        $ic286$ = makeString("selected");
        $ic287$ = makeString("yui-content");
        $ic288$ = makeString("pfFilteredItems");
        $ic289$ = makeString("tab");
        $ic290$ = makeSymbol("S#4061", "CYC");
        $ic291$ = makeString("pf-buttonbar");
        $ic292$ = makeString("bd");
        $ic293$ = makeString("pf-show-debugging");
        $ic294$ = makeString("pf-show-debugging-checkbox");
        $ic295$ = makeString("Debugging?");
        $ic296$ = makeString("toggleDebug(this, 'body');");
        $ic297$ = makeString("pf-show-cycl-button");
        $ic298$ = makeString("pf-show-cycl-checkbox");
        $ic299$ = makeString("show-cycl");
        $ic300$ = makeString("toggleCycLVisible(this, 'body');");
        $ic301$ = makeString("Show CycL");
        $ic302$ = makeString("pf-parameters");
        $ic303$ = makeString("Parameters");
        $ic304$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#5251", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic305$ = makeString("right");
        $ic306$ = makeString("left");
        $ic307$ = makeString("pf-toc");
        $ic308$ = makeString("Quick Links");
        $ic309$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#54486", "CYC"), (SubLObject)makeSymbol("S#1611", "CYC"));
        $ic310$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("#root"), (SubLObject)makeString("Root")), (SubLObject)ConsesLow.cons((SubLObject)makeString("#query"), (SubLObject)makeString("Query and Answer")), (SubLObject)ConsesLow.cons((SubLObject)makeString("#because"), (SubLObject)makeString("Key Facts")), (SubLObject)ConsesLow.cons((SubLObject)makeString("#rules"), (SubLObject)makeString("Key Rules")), (SubLObject)ConsesLow.cons((SubLObject)makeString("#details"), (SubLObject)makeString("Detailed Justification")), (SubLObject)ConsesLow.cons((SubLObject)makeString("#linear"), (SubLObject)makeString("Linear Justification")), (SubLObject)ConsesLow.cons((SubLObject)makeString("#filtered"), (SubLObject)makeString("Filtered Supports")));
        $ic311$ = makeString("query");
        $ic312$ = makeString("Root");
        $ic313$ = makeString("root");
        $ic314$ = makeString("Key Rules:");
        $ic315$ = makeString("rules");
        $ic316$ = makeString("Because:");
        $ic317$ = makeString("because");
        $ic318$ = makeString("Detailed Justification:");
        $ic319$ = makeString("details");
        $ic320$ = makeString("Linear Justification:");
        $ic321$ = makeString("linear");
        $ic322$ = makeSymbol("S#54287", "CYC");
        $ic323$ = makeSymbol("S#1022", "CYC");
        $ic324$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic325$ = makeString("filtered");
        $ic326$ = makeString("Filtered Supports");
        $ic327$ = makeString("Reason: ~S");
        $ic328$ = makeSymbol("S#54387", "CYC");
        $ic329$ = makeString("pf-stepnum");
        $ic330$ = makeString("pf-steprow");
        $ic331$ = makeString("pf-label");
        $ic332$ = makeString("~A");
        $ic333$ = makeString("pf-entry-content");
        $ic334$ = makeString("pf-paraphrase");
        $ic335$ = makeString("~4d ");
        $ic336$ = makeSymbol("S#53717", "CYC");
        $ic337$ = makeString("pf-object pf-entry-struct");
        $ic338$ = makeString("pf-object");
        $ic339$ = makeString("pf-children");
        $ic340$ = makeKeyword("VISIBLE");
        $ic341$ = makeKeyword("SECTION-ROOT");
        $ic342$ = makeString("pf-entry ");
        $ic343$ = makeString("pf-");
        $ic344$ = ConsesLow.list((SubLObject)makeKeyword("ASSERTION-BOOKKEEPING"), (SubLObject)makeKeyword("UNSUPPORTED-SUPPORT"));
        $ic345$ = makeString("Inferred:");
        $ic346$ = makeString("Asserted:");
        $ic347$ = makeString("Opaque:");
        $ic348$ = makeKeyword("NEG");
        $ic349$ = makeKeyword("POS");
        $ic350$ = makeSymbol("S#54402", "CYC");
        $ic351$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic352$ = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic353$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#54487", "CYC"));
        $ic354$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic355$ = makeSymbol("CDR");
        $ic356$ = makeSymbol("PROOF-SUID");
        $ic357$ = makeSymbol("S#53723", "CYC");
        $ic358$ = makeSymbol("S#54411", "CYC");
        $ic359$ = makeSymbol("S#54412", "CYC");
        $ic360$ = makeSymbol("DEDUCTION-P");
        $ic361$ = makeSymbol("S#54427", "CYC");
        $ic362$ = makeSymbol("ASSERTION-FORMULA");
        $ic363$ = makeSymbol("ASSERTION-MT");
        $ic364$ = makeSymbol("S#54418", "CYC");
        $ic365$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("S#54488", "CYC"));
        $ic366$ = makeSymbol("S#54423", "CYC");
        $ic367$ = makeSymbol("EXPRESSION-FIND");
        $ic368$ = ConsesLow.listS((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#54489", "CYC"));
        $ic369$ = makeKeyword("DISJOINTWITH");
        $ic370$ = makeString("HL-VERIFY failure on valid support:~% ~S~%");
        $ic371$ = ConsesLow.list((SubLObject)makeKeyword("REWRITE-ALLOWED?"), (SubLObject)T, (SubLObject)makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)NIL);
        $ic372$ = ConsesLow.list((SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"));
        $ic373$ = makeKeyword("ASCENDING");
        $ic374$ = makeKeyword("GENLS");
        $ic375$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")));
        $ic376$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic377$ = ConsesLow.list((SubLObject)makeSymbol("S#25108", "CYC"), (SubLObject)makeSymbol("S#25109", "CYC"));
        $ic378$ = ConsesLow.list((SubLObject)makeSymbol("S#54490", "CYC"), (SubLObject)makeSymbol("S#54491", "CYC"));
        $ic379$ = makeKeyword("DESCENDING");
        $ic380$ = makeString("No THCL or non-irrelevant collections between ~S and ~S in ~S");
        $ic381$ = (SubLFloat)makeDouble(1.0);
        $ic382$ = makeSymbol("INFERENCE-P");
        $ic383$ = makeSymbol("NUMBERP");
        $ic384$ = makeKeyword("SKIP");
        $ic385$ = makeKeyword("QUIET");
        $ic386$ = makeSymbol("S#52512", "CYC");
        $ic387$ = constant_handles_oc.f8479((SubLObject)makeString("appropriateResponseContent"));
        $ic388$ = constant_handles_oc.f8479((SubLObject)makeString("BestSupportSentenceFn"));
        $ic389$ = makeKeyword("MAX-NUMBER");
        $ic390$ = makeSymbol("SUPPORT-P");
        $ic391$ = makeSymbol("S#17993", "CYC");
        $ic392$ = makeKeyword("REMOVED-SUPPORTS-THAT-DONT-MENTION-BINDING-VALUES");
        $ic393$ = makeSymbol("FORT-P");
        $ic394$ = makeKeyword("USED-SUPPORTS-THAT-MENTION-MOST-PROVEN-SENTENCE-FORTS");
        $ic395$ = makeSymbol("S#54464", "CYC");
        $ic396$ = constant_handles_oc.f8479((SubLObject)makeString("authorityClaims-Term"));
        $ic397$ = makeString("~S~% has too many bindings (no more than 1 is allowed).");
        $ic398$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 6177 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/