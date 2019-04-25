package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0792 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0792";
    public static final String myFingerPrint = "13d07cc01e90991d17e52dbf8e5800515c329149b4219fa4d0d75436f3fa9c5c";
    public static SubLSymbol $g6314$;
    private static SubLSymbol $g6315$;
    private static SubLSymbol $g6316$;
    private static SubLSymbol $g6317$;
    private static SubLSymbol $g6318$;
    private static SubLSymbol $g6319$;
    private static SubLSymbol $g6320$;
    private static SubLSymbol $g6321$;
    private static SubLSymbol $g6322$;
    private static SubLSymbol $g6323$;
    public static SubLSymbol $g6324$;
    public static SubLSymbol $g6325$;
    private static SubLSymbol $g6326$;
    private static SubLSymbol $g6327$;
    private static SubLSymbol $g6328$;
    private static SubLSymbol $g6329$;
    private static SubLSymbol $g6330$;
    private static SubLSymbol $g6331$;
    private static SubLSymbol $g6332$;
    private static SubLSymbol $g6333$;
    private static SubLSymbol $g6334$;
    private static SubLSymbol $g6335$;
    private static SubLSymbol $g6336$;
    private static SubLSymbol $g6337$;
    private static SubLSymbol $g6338$;
    private static SubLSymbol $g6339$;
    private static SubLSymbol $g6340$;
    private static SubLSymbol $g6341$;
    public static SubLSymbol $g6342$;
    private static SubLSymbol $g6343$;
    private static SubLSymbol $g6344$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
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
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
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
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
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
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLList $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLList $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLList $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLList $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLObject $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLList $ic166$;
    private static final SubLList $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLList $ic169$;
    private static final SubLList $ic170$;
    private static final SubLList $ic171$;
    private static final SubLList $ic172$;
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
    private static final SubLList $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLList $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLList $ic192$;
    private static final SubLObject $ic193$;
    private static final SubLObject $ic194$;
    private static final SubLList $ic195$;
    private static final SubLList $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLObject $ic199$;
    private static final SubLObject $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLObject $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLObject $ic205$;
    private static final SubLList $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLObject $ic214$;
    private static final SubLObject $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLList $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLObject $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLObject $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLObject $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLObject $ic235$;
    private static final SubLObject $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLObject $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLObject $ic240$;
    private static final SubLString $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLObject $ic243$;
    private static final SubLObject $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLString $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLList $ic248$;
    private static final SubLList $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
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
    private static final SubLSymbol $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLString $ic286$;
    private static final SubLString $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLObject $ic299$;
    private static final SubLString $ic300$;
    private static final SubLObject $ic301$;
    private static final SubLString $ic302$;
    private static final SubLObject $ic303$;
    private static final SubLString $ic304$;
    private static final SubLObject $ic305$;
    private static final SubLList $ic306$;
    private static final SubLString $ic307$;
    private static final SubLObject $ic308$;
    private static final SubLString $ic309$;
    private static final SubLObject $ic310$;
    private static final SubLString $ic311$;
    private static final SubLString $ic312$;
    private static final SubLString $ic313$;
    private static final SubLString $ic314$;
    private static final SubLList $ic315$;
    private static final SubLList $ic316$;
    private static final SubLString $ic317$;
    private static final SubLList $ic318$;
    private static final SubLString $ic319$;
    private static final SubLString $ic320$;
    private static final SubLList $ic321$;
    private static final SubLString $ic322$;
    private static final SubLList $ic323$;
    private static final SubLString $ic324$;
    private static final SubLList $ic325$;
    private static final SubLString $ic326$;
    private static final SubLList $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLString $ic329$;
    private static final SubLList $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLInteger $ic333$;
    private static final SubLString $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLString $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLInteger $ic338$;
    private static final SubLInteger $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLString $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLString $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLList $ic357$;
    private static final SubLString $ic358$;
    private static final SubLList $ic359$;
    private static final SubLObject $ic360$;
    private static final SubLInteger $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLList $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLString $ic365$;
    
    
    public static SubLObject f50546(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)$ic2$);
    }
    
    public static SubLObject f50547(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f2169(var1, (SubLObject)$ic4$) || (var1.isCons() && $ic5$ == var1.first() && NIL != module0161.f10481(conses_high.second(var1))));
    }
    
    public static SubLObject f50548(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)$ic7$);
    }
    
    public static SubLObject f50549(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)$ic9$);
    }
    
    public static SubLObject f50550(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)$ic11$);
    }
    
    public static SubLObject f50551(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)$ic13$);
    }
    
    public static SubLObject f50552(final SubLObject var1) {
        return module0035.f2169(var1, $g6323$.getGlobalValue());
    }
    
    public static SubLObject f50553(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic17$, var2, $ic18$, var3, $ic19$, var4, $ic20$, var5, $ic21$, var6, $ic22$, var7, $ic23$, var8, $ic24$, var9, $ic25$, var10 });
    }
    
    public static SubLObject f50554(final SubLObject var11) {
        return conses_high.getf(var11, (SubLObject)$ic24$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50555(final SubLObject var11) {
        return conses_high.getf(var11, (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50556(final SubLObject var11) {
        return conses_high.getf(var11, (SubLObject)$ic25$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50557(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)$ic26$, var12, (SubLObject)$ic27$, (SubLObject)$ic28$), Functions.funcall((SubLObject)makeSymbol("S#55078", "CYC")));
        final SubLObject var15 = $g6325$.currentBinding(var13);
        try {
            $g6325$.bind((SubLObject)$ic29$, var13);
            f50558(module0213.f13973(), (SubLObject)NIL, module0213.f13970(), var14);
        }
        finally {
            $g6325$.rebind(var15, var13);
        }
        return var12;
    }
    
    public static SubLObject f50559(SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        return f50558(module0213.f13973(), (SubLObject)NIL, module0213.f13970(), var16);
    }
    
    public static SubLObject f50560(final SubLObject var17, SubLObject var16, SubLObject var18) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)T;
        }
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = (SubLObject)T;
        SubLObject var21 = var17;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            final SubLObject var23 = module0178.f11326(var22, var18, (SubLObject)T, var20, (SubLObject)UNPROVIDED);
            var19 = ConsesLow.append(var23, var19);
            var21 = var21.rest();
            var22 = var21.first();
        }
        var19 = module0035.f2269(var19, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f50558(var17, (SubLObject)NIL, var19, var16);
    }
    
    public static SubLObject f50561(final SubLObject var24, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var25 = module0035.f2269(module0035.f2399(var24, Symbols.symbol_function((SubLObject)$ic30$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f50558((SubLObject)NIL, var24, var25, var16);
    }
    
    public static SubLObject f50558(final SubLObject var17, final SubLObject var24, final SubLObject var19, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != module0035.f2015(var17) : var17;
        SubLObject var26 = var17;
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            assert NIL != assertion_handles_oc.f11035(var27) : var27;
            var26 = var26.rest();
            var27 = var26.first();
        }
        final SubLObject var29;
        final SubLObject var28 = var29 = var16;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var32_33 = (SubLObject)NIL;
        while (NIL != var31) {
            cdestructuring_bind.destructuring_bind_must_consp(var31, var28, (SubLObject)$ic33$);
            var32_33 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var28, (SubLObject)$ic33$);
            if (NIL == conses_high.member(var32_33, (SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var32 = (SubLObject)T;
            }
            if (var32_33 == $ic35$) {
                var30 = var31.first();
            }
            var31 = var31.rest();
        }
        if (NIL != var32 && NIL == var30) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic33$);
        }
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var29);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var29);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var29);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var29);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var29);
        final SubLObject var42 = (SubLObject)((NIL != var41) ? conses_high.cadr(var41) : NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic41$, var29);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var29);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        final SubLObject var47 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var29);
        final SubLObject var48 = (SubLObject)((NIL != var47) ? conses_high.cadr(var47) : NIL);
        final SubLObject var49 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var29);
        final SubLObject var50 = (SubLObject)((NIL != var49) ? conses_high.cadr(var49) : ONE_INTEGER);
        final SubLObject var51 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var29);
        final SubLObject var52 = (SubLObject)((NIL != var51) ? conses_high.cadr(var51) : NIL);
        final SubLObject var53 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var29);
        final SubLObject var54 = (SubLObject)((NIL != var53) ? conses_high.cadr(var53) : NIL);
        final SubLObject var55 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var29);
        final SubLObject var56 = (SubLObject)((NIL != var55) ? conses_high.cadr(var55) : NIL);
        final SubLObject var57 = cdestructuring_bind.property_list_member((SubLObject)$ic46$, var29);
        final SubLObject var58 = (SubLObject)((NIL != var57) ? conses_high.cadr(var57) : NIL);
        final SubLObject var59 = cdestructuring_bind.property_list_member((SubLObject)$ic47$, var29);
        final SubLObject var60 = (SubLObject)((NIL != var59) ? conses_high.cadr(var59) : NIL);
        final SubLObject var61 = cdestructuring_bind.property_list_member((SubLObject)$ic48$, var29);
        final SubLObject var62 = (SubLObject)((NIL != var61) ? conses_high.cadr(var61) : NIL);
        final SubLObject var63 = cdestructuring_bind.property_list_member((SubLObject)$ic49$, var29);
        final SubLObject var64 = (SubLObject)((NIL != var63) ? conses_high.cadr(var63) : NIL);
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)$ic50$, var29);
        final SubLObject var66 = (SubLObject)((NIL != var65) ? conses_high.cadr(var65) : T);
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)$ic51$, var29);
        final SubLObject var68 = (SubLObject)((NIL != var67) ? conses_high.cadr(var67) : T);
        f50562(var34, var36, var38, var40, var42, var44, var46, var48, var50, var52, var54, var56, var58, var60, var62, var64, var66, var68);
        SubLObject var69 = (SubLObject)NIL;
        final SubLObject var70 = var52;
        if (NIL != var70) {
            SubLObject var71 = (SubLObject)NIL;
            try {
                final SubLObject var72 = stream_macros.$stream_requires_locking$.currentBinding(var25);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var25);
                    var71 = compatibility.open_text(var70, (SubLObject)$ic52$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var72, var25);
                }
                if (!var71.isStream()) {
                    Errors.error((SubLObject)$ic53$, var70);
                }
                final SubLObject var73 = var71;
                final SubLObject var72_73 = var58;
                if (NIL != var72_73) {
                    SubLObject var74_75 = (SubLObject)NIL;
                    try {
                        final SubLObject var74 = stream_macros.$stream_requires_locking$.currentBinding(var25);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var25);
                            var74_75 = compatibility.open_binary(var72_73, (SubLObject)$ic52$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var74, var25);
                        }
                        if (!var74_75.isStream()) {
                            Errors.error((SubLObject)$ic53$, var72_73);
                        }
                        final SubLObject var75 = var74_75;
                        final SubLObject var76 = f50553(var16, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
                        if (NIL != var73) {
                            f50563(var76, var54, var73);
                        }
                        f50564(var76, var75);
                        final SubLObject var77 = $g6326$.currentBinding(var25);
                        final SubLObject var78 = $g6327$.currentBinding(var25);
                        final SubLObject var79 = $g6328$.currentBinding(var25);
                        final SubLObject var80 = $g6329$.currentBinding(var25);
                        final SubLObject var81 = $g6330$.currentBinding(var25);
                        final SubLObject var82 = $g6331$.currentBinding(var25);
                        final SubLObject var83 = $g6332$.currentBinding(var25);
                        final SubLObject var84 = $g6315$.currentBinding(var25);
                        final SubLObject var85 = $g6316$.currentBinding(var25);
                        final SubLObject var86 = $g6317$.currentBinding(var25);
                        final SubLObject var87 = $g6318$.currentBinding(var25);
                        final SubLObject var88 = $g6319$.currentBinding(var25);
                        final SubLObject var89 = $g6320$.currentBinding(var25);
                        try {
                            $g6326$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6327$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6328$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6329$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6330$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6331$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6332$.bind((SubLObject)ZERO_INTEGER, var25);
                            $g6315$.bind((NIL != var34) ? var34 : $g6315$.getDynamicValue(var25), var25);
                            $g6316$.bind((NIL != var36) ? var36 : $g6316$.getDynamicValue(var25), var25);
                            $g6317$.bind((NIL != var40) ? var40 : $g6317$.getDynamicValue(var25), var25);
                            $g6318$.bind((NIL != var42) ? var42 : $g6318$.getDynamicValue(var25), var25);
                            $g6319$.bind((NIL != var44) ? var44 : $g6319$.getDynamicValue(var25), var25);
                            $g6320$.bind((NIL != var46) ? var46 : $g6320$.getDynamicValue(var25), var25);
                            final SubLObject var90 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                            final SubLObject var91 = f50565(var17, var50, var38, var64, var16, var73, var75, var90, var68);
                            final SubLObject var92 = f50566(var24, var50, var38, var64, var16, var73, var75, var90, var68);
                            final SubLObject var93 = f50567(var19, var50, var38, var64, var16, var73, var75, var90, var68);
                            final SubLObject var94 = Sequences.nreverse(ConsesLow.nconc(var93, var92, var91));
                            var69 = f50553(var16, $g6327$.getDynamicValue(var25), $g6328$.getDynamicValue(var25), $g6329$.getDynamicValue(var25), $g6330$.getDynamicValue(var25), $g6331$.getDynamicValue(var25), $g6332$.getDynamicValue(var25), var94, var90);
                        }
                        finally {
                            $g6320$.rebind(var89, var25);
                            $g6319$.rebind(var88, var25);
                            $g6318$.rebind(var87, var25);
                            $g6317$.rebind(var86, var25);
                            $g6316$.rebind(var85, var25);
                            $g6315$.rebind(var84, var25);
                            $g6332$.rebind(var83, var25);
                            $g6331$.rebind(var82, var25);
                            $g6330$.rebind(var81, var25);
                            $g6329$.rebind(var80, var25);
                            $g6328$.rebind(var79, var25);
                            $g6327$.rebind(var78, var25);
                            $g6326$.rebind(var77, var25);
                        }
                    }
                    finally {
                        final SubLObject var95 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                            if (var74_75.isStream()) {
                                streams_high.close(var74_75, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var95, var25);
                        }
                    }
                }
                else {
                    final SubLObject var96 = (SubLObject)NIL;
                    final SubLObject var97 = f50553(var16, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
                    if (NIL != var73) {
                        f50563(var97, var54, var73);
                    }
                    f50564(var97, var96);
                    final SubLObject var98 = $g6326$.currentBinding(var25);
                    final SubLObject var99 = $g6327$.currentBinding(var25);
                    final SubLObject var100 = $g6328$.currentBinding(var25);
                    final SubLObject var101 = $g6329$.currentBinding(var25);
                    final SubLObject var102 = $g6330$.currentBinding(var25);
                    final SubLObject var103 = $g6331$.currentBinding(var25);
                    final SubLObject var104 = $g6332$.currentBinding(var25);
                    final SubLObject var105 = $g6315$.currentBinding(var25);
                    final SubLObject var106 = $g6316$.currentBinding(var25);
                    final SubLObject var107 = $g6317$.currentBinding(var25);
                    final SubLObject var108 = $g6318$.currentBinding(var25);
                    final SubLObject var109 = $g6319$.currentBinding(var25);
                    final SubLObject var110 = $g6320$.currentBinding(var25);
                    try {
                        $g6326$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6327$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6328$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6329$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6330$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6331$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6332$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6315$.bind((NIL != var34) ? var34 : $g6315$.getDynamicValue(var25), var25);
                        $g6316$.bind((NIL != var36) ? var36 : $g6316$.getDynamicValue(var25), var25);
                        $g6317$.bind((NIL != var40) ? var40 : $g6317$.getDynamicValue(var25), var25);
                        $g6318$.bind((NIL != var42) ? var42 : $g6318$.getDynamicValue(var25), var25);
                        $g6319$.bind((NIL != var44) ? var44 : $g6319$.getDynamicValue(var25), var25);
                        $g6320$.bind((NIL != var46) ? var46 : $g6320$.getDynamicValue(var25), var25);
                        final SubLObject var111 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                        final SubLObject var112 = f50565(var17, var50, var38, var64, var16, var73, var96, var111, var68);
                        final SubLObject var113 = f50566(var24, var50, var38, var64, var16, var73, var96, var111, var68);
                        final SubLObject var114 = f50567(var19, var50, var38, var64, var16, var73, var96, var111, var68);
                        final SubLObject var115 = Sequences.nreverse(ConsesLow.nconc(var114, var113, var112));
                        var69 = f50553(var16, $g6327$.getDynamicValue(var25), $g6328$.getDynamicValue(var25), $g6329$.getDynamicValue(var25), $g6330$.getDynamicValue(var25), $g6331$.getDynamicValue(var25), $g6332$.getDynamicValue(var25), var115, var111);
                    }
                    finally {
                        $g6320$.rebind(var110, var25);
                        $g6319$.rebind(var109, var25);
                        $g6318$.rebind(var108, var25);
                        $g6317$.rebind(var107, var25);
                        $g6316$.rebind(var106, var25);
                        $g6315$.rebind(var105, var25);
                        $g6332$.rebind(var104, var25);
                        $g6331$.rebind(var103, var25);
                        $g6330$.rebind(var102, var25);
                        $g6329$.rebind(var101, var25);
                        $g6328$.rebind(var100, var25);
                        $g6327$.rebind(var99, var25);
                        $g6326$.rebind(var98, var25);
                    }
                }
            }
            finally {
                final SubLObject var116 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                    if (var71.isStream()) {
                        streams_high.close(var71, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var116, var25);
                }
            }
        }
        else {
            final SubLObject var117 = (SubLObject)NIL;
            final SubLObject var72_74 = var58;
            if (NIL != var72_74) {
                SubLObject var118 = (SubLObject)NIL;
                try {
                    final SubLObject var119 = stream_macros.$stream_requires_locking$.currentBinding(var25);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var25);
                        var118 = compatibility.open_binary(var72_74, (SubLObject)$ic52$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var119, var25);
                    }
                    if (!var118.isStream()) {
                        Errors.error((SubLObject)$ic53$, var72_74);
                    }
                    final SubLObject var96 = var118;
                    final SubLObject var97 = f50553(var16, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
                    if (NIL != var117) {
                        f50563(var97, var54, var117);
                    }
                    f50564(var97, var96);
                    final SubLObject var98 = $g6326$.currentBinding(var25);
                    final SubLObject var99 = $g6327$.currentBinding(var25);
                    final SubLObject var100 = $g6328$.currentBinding(var25);
                    final SubLObject var101 = $g6329$.currentBinding(var25);
                    final SubLObject var102 = $g6330$.currentBinding(var25);
                    final SubLObject var103 = $g6331$.currentBinding(var25);
                    final SubLObject var104 = $g6332$.currentBinding(var25);
                    final SubLObject var105 = $g6315$.currentBinding(var25);
                    final SubLObject var106 = $g6316$.currentBinding(var25);
                    final SubLObject var107 = $g6317$.currentBinding(var25);
                    final SubLObject var108 = $g6318$.currentBinding(var25);
                    final SubLObject var109 = $g6319$.currentBinding(var25);
                    final SubLObject var110 = $g6320$.currentBinding(var25);
                    try {
                        $g6326$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6327$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6328$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6329$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6330$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6331$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6332$.bind((SubLObject)ZERO_INTEGER, var25);
                        $g6315$.bind((NIL != var34) ? var34 : $g6315$.getDynamicValue(var25), var25);
                        $g6316$.bind((NIL != var36) ? var36 : $g6316$.getDynamicValue(var25), var25);
                        $g6317$.bind((NIL != var40) ? var40 : $g6317$.getDynamicValue(var25), var25);
                        $g6318$.bind((NIL != var42) ? var42 : $g6318$.getDynamicValue(var25), var25);
                        $g6319$.bind((NIL != var44) ? var44 : $g6319$.getDynamicValue(var25), var25);
                        $g6320$.bind((NIL != var46) ? var46 : $g6320$.getDynamicValue(var25), var25);
                        final SubLObject var111 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                        final SubLObject var112 = f50565(var17, var50, var38, var64, var16, var117, var96, var111, var68);
                        final SubLObject var113 = f50566(var24, var50, var38, var64, var16, var117, var96, var111, var68);
                        final SubLObject var114 = f50567(var19, var50, var38, var64, var16, var117, var96, var111, var68);
                        final SubLObject var115 = Sequences.nreverse(ConsesLow.nconc(var114, var113, var112));
                        var69 = f50553(var16, $g6327$.getDynamicValue(var25), $g6328$.getDynamicValue(var25), $g6329$.getDynamicValue(var25), $g6330$.getDynamicValue(var25), $g6331$.getDynamicValue(var25), $g6332$.getDynamicValue(var25), var115, var111);
                    }
                    finally {
                        $g6320$.rebind(var110, var25);
                        $g6319$.rebind(var109, var25);
                        $g6318$.rebind(var108, var25);
                        $g6317$.rebind(var107, var25);
                        $g6316$.rebind(var106, var25);
                        $g6315$.rebind(var105, var25);
                        $g6332$.rebind(var104, var25);
                        $g6331$.rebind(var103, var25);
                        $g6330$.rebind(var102, var25);
                        $g6329$.rebind(var101, var25);
                        $g6328$.rebind(var100, var25);
                        $g6327$.rebind(var99, var25);
                        $g6326$.rebind(var98, var25);
                    }
                }
                finally {
                    final SubLObject var120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                        if (var118.isStream()) {
                            streams_high.close(var118, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var120, var25);
                    }
                }
            }
            else {
                final SubLObject var121 = (SubLObject)NIL;
                final SubLObject var122 = f50553(var16, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != var117) {
                    f50563(var122, var54, var117);
                }
                f50564(var122, var121);
                final SubLObject var74 = $g6326$.currentBinding(var25);
                final SubLObject var123 = $g6327$.currentBinding(var25);
                final SubLObject var124 = $g6328$.currentBinding(var25);
                final SubLObject var125 = $g6329$.currentBinding(var25);
                final SubLObject var126 = $g6330$.currentBinding(var25);
                final SubLObject var127 = $g6331$.currentBinding(var25);
                final SubLObject var128 = $g6332$.currentBinding(var25);
                final SubLObject var129 = $g6315$.currentBinding(var25);
                final SubLObject var130 = $g6316$.currentBinding(var25);
                final SubLObject var131 = $g6317$.currentBinding(var25);
                final SubLObject var132 = $g6318$.currentBinding(var25);
                final SubLObject var133 = $g6319$.currentBinding(var25);
                final SubLObject var134 = $g6320$.currentBinding(var25);
                try {
                    $g6326$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6327$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6328$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6329$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6330$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6331$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6332$.bind((SubLObject)ZERO_INTEGER, var25);
                    $g6315$.bind((NIL != var34) ? var34 : $g6315$.getDynamicValue(var25), var25);
                    $g6316$.bind((NIL != var36) ? var36 : $g6316$.getDynamicValue(var25), var25);
                    $g6317$.bind((NIL != var40) ? var40 : $g6317$.getDynamicValue(var25), var25);
                    $g6318$.bind((NIL != var42) ? var42 : $g6318$.getDynamicValue(var25), var25);
                    $g6319$.bind((NIL != var44) ? var44 : $g6319$.getDynamicValue(var25), var25);
                    $g6320$.bind((NIL != var46) ? var46 : $g6320$.getDynamicValue(var25), var25);
                    final SubLObject var135 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                    final SubLObject var136 = f50565(var17, var50, var38, var64, var16, var117, var121, var135, var68);
                    final SubLObject var137 = f50566(var24, var50, var38, var64, var16, var117, var121, var135, var68);
                    final SubLObject var138 = f50567(var19, var50, var38, var64, var16, var117, var121, var135, var68);
                    final SubLObject var139 = Sequences.nreverse(ConsesLow.nconc(var138, var137, var136));
                    var69 = f50553(var16, $g6327$.getDynamicValue(var25), $g6328$.getDynamicValue(var25), $g6329$.getDynamicValue(var25), $g6330$.getDynamicValue(var25), $g6331$.getDynamicValue(var25), $g6332$.getDynamicValue(var25), var139, var135);
                }
                finally {
                    $g6320$.rebind(var134, var25);
                    $g6319$.rebind(var133, var25);
                    $g6318$.rebind(var132, var25);
                    $g6317$.rebind(var131, var25);
                    $g6316$.rebind(var130, var25);
                    $g6315$.rebind(var129, var25);
                    $g6332$.rebind(var128, var25);
                    $g6331$.rebind(var127, var25);
                    $g6330$.rebind(var126, var25);
                    $g6329$.rebind(var125, var25);
                    $g6328$.rebind(var124, var25);
                    $g6327$.rebind(var123, var25);
                    $g6326$.rebind(var74, var25);
                }
            }
        }
        return var69;
    }
    
    public static SubLObject f50565(final SubLObject var17, final SubLObject var51, final SubLObject var39, final SubLObject var64, final SubLObject var16, final SubLObject var71, final SubLObject var76, final SubLObject var10, final SubLObject var68) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        assert NIL != module0035.f2015(var17) : var17;
        SubLObject var78 = var17;
        SubLObject var79 = (SubLObject)NIL;
        var79 = var78.first();
        while (NIL != var78) {
            assert NIL != assertion_handles_oc.f11035(var79) : var79;
            var78 = var78.rest();
            var79 = var78.first();
        }
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)ZERO_INTEGER;
        final SubLObject var82 = (SubLObject)((NIL != var68) ? $ic54$ : NIL);
        if (NIL != var82) {
            module0012.$g82$.setDynamicValue((SubLObject)((NIL != var68) ? $ic54$ : NIL), var77);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var77);
            module0012.$g83$.setDynamicValue(Sequences.length(var17), var77);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var77);
            final SubLObject var83 = module0012.$g75$.currentBinding(var77);
            final SubLObject var84 = module0012.$g76$.currentBinding(var77);
            final SubLObject var85 = module0012.$g77$.currentBinding(var77);
            final SubLObject var86 = module0012.$g78$.currentBinding(var77);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var77);
                module0012.$g76$.bind((SubLObject)NIL, var77);
                module0012.$g77$.bind((SubLObject)T, var77);
                module0012.$g78$.bind(Time.get_universal_time(), var77);
                module0012.f478(module0012.$g82$.getDynamicValue(var77));
                SubLObject var87 = var17;
                SubLObject var88 = (SubLObject)NIL;
                var88 = var87.first();
                while (NIL != var87) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var77), module0012.$g83$.getDynamicValue(var77));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var77), (SubLObject)ONE_INTEGER), var77);
                    var81 = Numbers.add(var81, (SubLObject)ONE_INTEGER);
                    if (var81.numE(var51)) {
                        var81 = (SubLObject)ZERO_INTEGER;
                        if (NIL != f50568(var88, var39)) {
                            SubLObject var89 = (SubLObject)NIL;
                            SubLObject var90 = (SubLObject)NIL;
                            try {
                                var77.throwStack.push($ic55$);
                                final SubLObject var15_102 = Errors.$error_handler$.currentBinding(var77);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic56$), var77);
                                    try {
                                        var89 = f50569(var88);
                                    }
                                    catch (Throwable var91) {
                                        Errors.handleThrowable(var91, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var15_102, var77);
                                }
                            }
                            catch (Throwable var92) {
                                var90 = Errors.handleThrowable(var92, (SubLObject)$ic55$);
                            }
                            finally {
                                var77.throwStack.pop();
                            }
                            if (NIL != var89) {
                                final SubLObject var93 = f50570(var88, var89, var16, var71, var76, var10);
                                if (NIL != var64) {
                                    var80 = (SubLObject)ConsesLow.cons(var93, var80);
                                }
                            }
                            else {
                                PrintLow.format((SubLObject)T, (SubLObject)$ic57$, var88);
                            }
                        }
                    }
                    var87 = var87.rest();
                    var88 = var87.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var86, var77);
                module0012.$g77$.rebind(var85, var77);
                module0012.$g76$.rebind(var84, var77);
                module0012.$g75$.rebind(var83, var77);
            }
        }
        else {
            SubLObject var94 = var17;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                var81 = Numbers.add(var81, (SubLObject)ONE_INTEGER);
                if (var81.numE(var51)) {
                    var81 = (SubLObject)ZERO_INTEGER;
                    if (NIL != f50568(var95, var39)) {
                        SubLObject var96 = (SubLObject)NIL;
                        SubLObject var97 = (SubLObject)NIL;
                        try {
                            var77.throwStack.push($ic55$);
                            final SubLObject var98 = Errors.$error_handler$.currentBinding(var77);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic56$), var77);
                                try {
                                    var96 = f50569(var95);
                                }
                                catch (Throwable var99) {
                                    Errors.handleThrowable(var99, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var98, var77);
                            }
                        }
                        catch (Throwable var100) {
                            var97 = Errors.handleThrowable(var100, (SubLObject)$ic55$);
                        }
                        finally {
                            var77.throwStack.pop();
                        }
                        if (NIL != var96) {
                            final SubLObject var101 = f50570(var95, var96, var16, var71, var76, var10);
                            if (NIL != var64) {
                                var80 = (SubLObject)ConsesLow.cons(var101, var80);
                            }
                        }
                        else {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic57$, var95);
                        }
                    }
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
        }
        return var80;
    }
    
    public static SubLObject f50566(final SubLObject var24, final SubLObject var51, final SubLObject var39, final SubLObject var64, final SubLObject var16, final SubLObject var71, final SubLObject var76, final SubLObject var10, final SubLObject var68) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)ZERO_INTEGER;
        final SubLObject var80 = (SubLObject)((NIL != var68) ? $ic58$ : NIL);
        if (NIL != var80) {
            module0012.$g82$.setDynamicValue((SubLObject)((NIL != var68) ? $ic58$ : NIL), var77);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var77);
            module0012.$g83$.setDynamicValue(Sequences.length(var24), var77);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var77);
            final SubLObject var81 = module0012.$g75$.currentBinding(var77);
            final SubLObject var82 = module0012.$g76$.currentBinding(var77);
            final SubLObject var83 = module0012.$g77$.currentBinding(var77);
            final SubLObject var84 = module0012.$g78$.currentBinding(var77);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var77);
                module0012.$g76$.bind((SubLObject)NIL, var77);
                module0012.$g77$.bind((SubLObject)T, var77);
                module0012.$g78$.bind(Time.get_universal_time(), var77);
                module0012.f478(module0012.$g82$.getDynamicValue(var77));
                SubLObject var85 = var24;
                SubLObject var86 = (SubLObject)NIL;
                var86 = var85.first();
                while (NIL != var85) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var77), module0012.$g83$.getDynamicValue(var77));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var77), (SubLObject)ONE_INTEGER), var77);
                    var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
                    if (var79.numE(var51)) {
                        var79 = (SubLObject)ZERO_INTEGER;
                        SubLObject var87 = var86;
                        SubLObject var88 = $ic59$;
                        var77.resetMultipleValues();
                        final SubLObject var110_111 = module0279.f18578(var87, var88);
                        final SubLObject var112_113 = var77.secondMultipleValue();
                        var77.resetMultipleValues();
                        var87 = var110_111;
                        var88 = var112_113;
                        if (NIL != f50571(var88, var39)) {
                            final SubLObject var89 = f50572(var87, var88);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var77) && NIL == var89) {
                                Errors.error((SubLObject)$ic60$, var89);
                            }
                            final SubLObject var90 = f50570(var86, var89, var16, var71, var76, var10);
                            if (NIL != var64) {
                                var78 = (SubLObject)ConsesLow.cons(var90, var78);
                            }
                        }
                    }
                    var85 = var85.rest();
                    var86 = var85.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var84, var77);
                module0012.$g77$.rebind(var83, var77);
                module0012.$g76$.rebind(var82, var77);
                module0012.$g75$.rebind(var81, var77);
            }
        }
        else {
            SubLObject var91 = var24;
            SubLObject var92 = (SubLObject)NIL;
            var92 = var91.first();
            while (NIL != var91) {
                var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
                if (var79.numE(var51)) {
                    var79 = (SubLObject)ZERO_INTEGER;
                    SubLObject var93 = var92;
                    SubLObject var94 = $ic59$;
                    var77.resetMultipleValues();
                    final SubLObject var114_115 = module0279.f18578(var93, var94);
                    final SubLObject var116_117 = var77.secondMultipleValue();
                    var77.resetMultipleValues();
                    var93 = var114_115;
                    var94 = var116_117;
                    if (NIL != f50571(var94, var39)) {
                        final SubLObject var95 = f50572(var93, var94);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var77) && NIL == var95) {
                            Errors.error((SubLObject)$ic60$, var95);
                        }
                        final SubLObject var96 = f50570(var92, var95, var16, var71, var76, var10);
                        if (NIL != var64) {
                            var78 = (SubLObject)ConsesLow.cons(var96, var78);
                        }
                    }
                }
                var91 = var91.rest();
                var92 = var91.first();
            }
        }
        return var78;
    }
    
    public static SubLObject f50567(final SubLObject var19, final SubLObject var51, final SubLObject var39, final SubLObject var64, final SubLObject var16, final SubLObject var71, final SubLObject var76, final SubLObject var10, final SubLObject var68) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)ZERO_INTEGER;
        final SubLObject var80 = module0147.$g2094$.currentBinding(var77);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var77);
        try {
            module0147.$g2094$.bind((SubLObject)$ic61$, var77);
            module0147.$g2095$.bind($ic62$, var77);
            final SubLObject var82 = (SubLObject)((NIL != var68) ? $ic63$ : NIL);
            if (NIL != var82) {
                module0012.$g82$.setDynamicValue((SubLObject)((NIL != var68) ? $ic63$ : NIL), var77);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var77);
                module0012.$g83$.setDynamicValue(Sequences.length(var19), var77);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var77);
                final SubLObject var15_118 = module0012.$g75$.currentBinding(var77);
                final SubLObject var78_119 = module0012.$g76$.currentBinding(var77);
                final SubLObject var83 = module0012.$g77$.currentBinding(var77);
                final SubLObject var84 = module0012.$g78$.currentBinding(var77);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var77);
                    module0012.$g76$.bind((SubLObject)NIL, var77);
                    module0012.$g77$.bind((SubLObject)T, var77);
                    module0012.$g78$.bind(Time.get_universal_time(), var77);
                    module0012.f478(module0012.$g82$.getDynamicValue(var77));
                    SubLObject var85 = var19;
                    SubLObject var86 = (SubLObject)NIL;
                    var86 = var85.first();
                    while (NIL != var85) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var77), module0012.$g83$.getDynamicValue(var77));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var77), (SubLObject)ONE_INTEGER), var77);
                        var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
                        if (var79.numE(var51)) {
                            var79 = (SubLObject)ZERO_INTEGER;
                            final SubLObject var87 = conses_high.getf(var16, (SubLObject)$ic43$, (SubLObject)NIL);
                            final SubLObject var88 = f50573(var86, var39, var87);
                            if (NIL != var88) {
                                final SubLObject var89 = f50570(var86, var88, var16, var71, var76, var10);
                                if (NIL != var64) {
                                    var78 = (SubLObject)ConsesLow.cons(var89, var78);
                                }
                            }
                        }
                        var85 = var85.rest();
                        var86 = var85.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var84, var77);
                    module0012.$g77$.rebind(var83, var77);
                    module0012.$g76$.rebind(var78_119, var77);
                    module0012.$g75$.rebind(var15_118, var77);
                }
            }
            else {
                SubLObject var90 = var19;
                SubLObject var91 = (SubLObject)NIL;
                var91 = var90.first();
                while (NIL != var90) {
                    var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
                    if (var79.numE(var51)) {
                        var79 = (SubLObject)ZERO_INTEGER;
                        final SubLObject var92 = conses_high.getf(var16, (SubLObject)$ic43$, (SubLObject)NIL);
                        final SubLObject var93 = f50573(var91, var39, var92);
                        if (NIL != var93) {
                            final SubLObject var94 = f50570(var91, var93, var16, var71, var76, var10);
                            if (NIL != var64) {
                                var78 = (SubLObject)ConsesLow.cons(var94, var78);
                            }
                        }
                    }
                    var90 = var90.rest();
                    var91 = var90.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var81, var77);
            module0147.$g2094$.rebind(var80, var77);
        }
        return var78;
    }
    
    public static SubLObject f50574(final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var121) : var121;
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125 = (SubLObject)NIL;
        try {
            final SubLObject var126 = stream_macros.$stream_requires_locking$.currentBinding(var122);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var122);
                var125 = compatibility.open_binary(var121, (SubLObject)$ic65$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var126, var122);
            }
            if (!var125.isStream()) {
                Errors.error((SubLObject)$ic53$, var121);
            }
            final SubLObject var125_126 = var125;
            final SubLObject var127 = module0021.$g777$.currentBinding(var122);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var122);
                module0021.f1149(dumper_oc.f37935());
                final SubLObject var15_127 = module0021.$g789$.currentBinding(var122);
                try {
                    module0021.$g789$.bind(Guids.guid_to_string(Guids.new_guid()), var122);
                    var123 = module0021.f1060(var125_126, (SubLObject)T, (SubLObject)UNPROVIDED);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var122) && $ic66$ != f50575(var123)) {
                        Errors.error((SubLObject)$ic67$);
                    }
                    SubLObject var128 = (SubLObject)NIL;
                    while (NIL == var128) {
                        final SubLObject var129 = module0021.f1060(var125_126, (SubLObject)NIL, (SubLObject)$ic68$);
                        var128 = Equality.eq(var129, (SubLObject)$ic68$);
                        if (NIL == var128) {
                            if ($ic69$ == f50575(var129)) {
                                var124 = (SubLObject)ConsesLow.cons(var129, var124);
                            }
                            else {
                                var123 = var129;
                            }
                        }
                    }
                }
                finally {
                    module0021.$g789$.rebind(var15_127, var122);
                }
            }
            finally {
                module0021.$g777$.rebind(var127, var122);
            }
        }
        finally {
            final SubLObject var130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var122);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var122);
                if (var125.isStream()) {
                    streams_high.close(var125, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var130, var122);
            }
        }
        var124 = Sequences.nreverse(var124);
        var123 = f50576(var123, var124);
        return var123;
    }
    
    public static SubLObject f50575(final SubLObject var130) {
        final SubLThread var131 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var131) && !var130.isCons()) {
            Errors.error((SubLObject)$ic70$, var130);
        }
        final SubLObject var132 = var130.first();
        if (var132.isKeyword()) {
            return (SubLObject)$ic66$;
        }
        return (SubLObject)$ic69$;
    }
    
    public static SubLObject f50576(SubLObject var11, final SubLObject var123) {
        if (NIL != var123) {
            SubLObject var124 = f50554(var11);
            var124 = ConsesLow.nconc(var124, var123);
            var11 = conses_high.putf(var11, (SubLObject)$ic24$, var124);
        }
        return var11;
    }
    
    public static SubLObject f50577(final SubLObject var122, final SubLObject var54, final SubLObject var121) {
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        try {
            var124 = compatibility.open_text(var121, (SubLObject)$ic52$);
            if (!var124.isStream()) {
                Errors.error((SubLObject)$ic53$, var121);
            }
            final SubLObject var125 = var124;
            var123 = f50578(var122, var54, var125);
        }
        finally {
            final SubLObject var126 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var124.isStream()) {
                    streams_high.close(var124, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var126);
            }
        }
        return var123;
    }
    
    public static SubLObject f50578(final SubLObject var122, final SubLObject var54, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var54.eql((SubLObject)$ic71$)) {
            return f50579(var122, var125);
        }
        if (var54.eql((SubLObject)$ic28$)) {
            return f50580(var122, var125);
        }
        return Errors.error((SubLObject)$ic72$, var54);
    }
    
    public static SubLObject f50581(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        final SubLObject var124 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var126;
        final SubLObject var125 = var126 = f50554(var122);
        module0012.$g82$.setDynamicValue((SubLObject)$ic73$, var123);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var123);
        module0012.$g83$.setDynamicValue(Sequences.length(var126), var123);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var123);
        final SubLObject var127 = module0012.$g75$.currentBinding(var123);
        final SubLObject var128 = module0012.$g76$.currentBinding(var123);
        final SubLObject var129 = module0012.$g77$.currentBinding(var123);
        final SubLObject var130 = module0012.$g78$.currentBinding(var123);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var123);
            module0012.$g76$.bind((SubLObject)NIL, var123);
            module0012.$g77$.bind((SubLObject)T, var123);
            module0012.$g78$.bind(Time.get_universal_time(), var123);
            module0012.f478(module0012.$g82$.getDynamicValue(var123));
            SubLObject var131 = var126;
            SubLObject var132 = (SubLObject)NIL;
            var132 = var131.first();
            while (NIL != var131) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var123), module0012.$g83$.getDynamicValue(var123));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var123), (SubLObject)ONE_INTEGER), var123);
                SubLObject var133;
                final SubLObject var137_138 = var133 = var132;
                SubLObject var134 = (SubLObject)NIL;
                SubLObject var135 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var133, var137_138, (SubLObject)$ic74$);
                var134 = var133.first();
                var133 = var133.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var133, var137_138, (SubLObject)$ic74$);
                var135 = var133.first();
                var133 = var133.rest();
                final SubLObject var136 = (SubLObject)(var133.isCons() ? var133.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var133, var137_138, (SubLObject)$ic74$);
                var133 = var133.rest();
                if (NIL == var133) {
                    SubLObject var137 = module0035.f2399(var135, (SubLObject)$ic75$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var138 = (SubLObject)NIL;
                    var138 = var137.first();
                    while (NIL != var137) {
                        module0077.f5326(var138, var124);
                        var137 = var137.rest();
                        var138 = var137.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var137_138, (SubLObject)$ic74$);
                }
                var131 = var131.rest();
                var132 = var131.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var130, var123);
            module0012.$g77$.rebind(var129, var123);
            module0012.$g76$.rebind(var128, var123);
            module0012.$g75$.rebind(var127, var123);
        }
        return module0077.f5311(var124);
    }
    
    public static SubLObject f50582(final SubLObject var143, final SubLObject var109, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)NIL;
        final SubLObject var147;
        final SubLObject var146 = var147 = var16;
        SubLObject var148 = (SubLObject)NIL;
        SubLObject var149 = var147;
        SubLObject var150 = (SubLObject)NIL;
        SubLObject var149_150 = (SubLObject)NIL;
        while (NIL != var149) {
            cdestructuring_bind.destructuring_bind_must_consp(var149, var146, (SubLObject)$ic76$);
            var149_150 = var149.first();
            var149 = var149.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var149, var146, (SubLObject)$ic76$);
            if (NIL == conses_high.member(var149_150, (SubLObject)$ic77$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var150 = (SubLObject)T;
            }
            if (var149_150 == $ic35$) {
                var148 = var149.first();
            }
            var149 = var149.rest();
        }
        if (NIL != var150 && NIL == var148) {
            cdestructuring_bind.cdestructuring_bind_error(var146, (SubLObject)$ic76$);
        }
        final SubLObject var151 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var147);
        final SubLObject var152 = (SubLObject)((NIL != var151) ? conses_high.cadr(var151) : NIL);
        final SubLObject var153 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var147);
        final SubLObject var154 = (SubLObject)((NIL != var153) ? conses_high.cadr(var153) : NIL);
        final SubLObject var155 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var147);
        final SubLObject var156 = (SubLObject)((NIL != var155) ? conses_high.cadr(var155) : NIL);
        final SubLObject var157 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var147);
        final SubLObject var158 = (SubLObject)((NIL != var157) ? conses_high.cadr(var157) : NIL);
        final SubLObject var159 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var147);
        final SubLObject var160 = (SubLObject)((NIL != var159) ? conses_high.cadr(var159) : NIL);
        final SubLObject var161 = cdestructuring_bind.property_list_member((SubLObject)$ic41$, var147);
        final SubLObject var162 = (SubLObject)((NIL != var161) ? conses_high.cadr(var161) : NIL);
        final SubLObject var163 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var147);
        final SubLObject var164 = (SubLObject)((NIL != var163) ? conses_high.cadr(var163) : NIL);
        final SubLObject var165 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var147);
        final SubLObject var166 = (SubLObject)((NIL != var165) ? conses_high.cadr(var165) : NIL);
        final SubLObject var167 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var147);
        final SubLObject var168 = (SubLObject)((NIL != var167) ? conses_high.cadr(var167) : ONE_INTEGER);
        final SubLObject var169 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var147);
        final SubLObject var170 = (SubLObject)((NIL != var169) ? conses_high.cadr(var169) : NIL);
        final SubLObject var171 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var147);
        final SubLObject var172 = (SubLObject)((NIL != var171) ? conses_high.cadr(var171) : NIL);
        final SubLObject var173 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var147);
        final SubLObject var174 = (SubLObject)((NIL != var173) ? conses_high.cadr(var173) : NIL);
        final SubLObject var175 = cdestructuring_bind.property_list_member((SubLObject)$ic48$, var147);
        final SubLObject var176 = (SubLObject)((NIL != var175) ? conses_high.cadr(var175) : NIL);
        final SubLObject var177 = cdestructuring_bind.property_list_member((SubLObject)$ic50$, var147);
        final SubLObject var178 = (SubLObject)((NIL != var177) ? conses_high.cadr(var177) : T);
        final SubLObject var179 = cdestructuring_bind.property_list_member((SubLObject)$ic51$, var147);
        final SubLObject var180 = (SubLObject)((NIL != var179) ? conses_high.cadr(var179) : T);
        f50562(var152, var154, (SubLObject)NIL, var158, var160, var162, var164, var166, var168, var170, var172, var174, (SubLObject)NIL, (SubLObject)NIL, var176, (SubLObject)T, var178, var180);
        SubLObject var181 = (SubLObject)NIL;
        final SubLObject var182 = $g6315$.currentBinding(var144);
        final SubLObject var183 = $g6316$.currentBinding(var144);
        final SubLObject var184 = $g6317$.currentBinding(var144);
        final SubLObject var185 = $g6318$.currentBinding(var144);
        final SubLObject var186 = $g6319$.currentBinding(var144);
        final SubLObject var187 = $g6320$.currentBinding(var144);
        try {
            $g6315$.bind((NIL != var152) ? var152 : $g6315$.getDynamicValue(var144), var144);
            $g6316$.bind((NIL != var154) ? var154 : $g6316$.getDynamicValue(var144), var144);
            $g6317$.bind((NIL != var158) ? var158 : $g6317$.getDynamicValue(var144), var144);
            $g6318$.bind((NIL != var160) ? var160 : $g6318$.getDynamicValue(var144), var144);
            $g6319$.bind((NIL != var162) ? var162 : $g6319$.getDynamicValue(var144), var144);
            $g6320$.bind((NIL != var164) ? var164 : $g6320$.getDynamicValue(var144), var144);
            final SubLObject var188 = module0282.f18747(var143, var109);
            if (NIL == module0206.f13427(var188)) {
                SubLObject var189 = var188;
                SubLObject var190 = (SubLObject)NIL;
                var190 = var189.first();
                while (NIL != var189) {
                    SubLObject var171_172;
                    final SubLObject var169_170 = var171_172 = var190;
                    SubLObject var191 = (SubLObject)NIL;
                    SubLObject var192 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var171_172, var169_170, (SubLObject)$ic78$);
                    var191 = var171_172.first();
                    var171_172 = var171_172.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var171_172, var169_170, (SubLObject)$ic78$);
                    var192 = var171_172.first();
                    var171_172 = var171_172.rest();
                    if (NIL == var171_172) {
                        SubLObject var193 = (SubLObject)NIL;
                        SubLObject var194 = (SubLObject)NIL;
                        SubLObject var21_177 = var191;
                        SubLObject var195 = (SubLObject)NIL;
                        var195 = var21_177.first();
                        while (NIL != var21_177) {
                            final SubLObject var196 = f50583(var195, var109, var154);
                            var193 = (SubLObject)ConsesLow.cons(var196, var193);
                            var21_177 = var21_177.rest();
                            var195 = var21_177.first();
                        }
                        SubLObject var21_178 = var192;
                        SubLObject var197 = (SubLObject)NIL;
                        var197 = var21_178.first();
                        while (NIL != var21_178) {
                            final SubLObject var196 = f50583(var197, var109, var154);
                            var194 = (SubLObject)ConsesLow.cons(var196, var194);
                            var21_178 = var21_178.rest();
                            var197 = var21_178.first();
                        }
                        var193 = Sequences.nreverse(var193);
                        var194 = Sequences.nreverse(var194);
                        final SubLObject var198 = module0232.f15330(var193, var194);
                        final SubLObject var199 = module0232.f15332(var198);
                        var181 = (SubLObject)ConsesLow.cons(var199, var181);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var169_170, (SubLObject)$ic78$);
                    }
                    var189 = var189.rest();
                    var190 = var189.first();
                }
            }
            if (NIL == var181) {
                var145 = (SubLObject)NIL;
            }
            else {
                var145 = module0276.f18302(module0276.f18280(var181, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                final SubLObject var200 = $g6316$.getDynamicValue(var144);
                if (var200.eql((SubLObject)$ic79$)) {
                    final SubLObject var201 = module0202.f12768($ic80$, $ic59$, (SubLObject)$ic81$);
                    final SubLObject var202 = f50583(var201, var109, $g6316$.getDynamicValue(var144));
                    var145 = module0202.f12774(var202, var145);
                }
                else if (var200.eql((SubLObject)$ic82$)) {
                    final SubLObject var201 = module0202.f12643($ic83$, var109);
                    final SubLObject var203 = f50583(var201, var109, $g6316$.getDynamicValue(var144));
                    var145 = module0202.f12774(var203, var145);
                }
                else if (var200.eql((SubLObject)$ic3$)) {
                    if (NIL == module0132.f8596(var109)) {
                        final SubLObject var201 = module0202.f12643($ic83$, var109);
                        final SubLObject var203 = f50583(var201, var109, $g6316$.getDynamicValue(var144));
                        var145 = module0202.f12774(var203, var145);
                    }
                }
                else if (var200.eql((SubLObject)$ic84$)) {}
                if (NIL != var178) {
                    var145 = module0205.f13338(var145);
                }
            }
        }
        finally {
            $g6320$.rebind(var187, var144);
            $g6319$.rebind(var186, var144);
            $g6318$.rebind(var185, var144);
            $g6317$.rebind(var184, var144);
            $g6316$.rebind(var183, var144);
            $g6315$.rebind(var182, var144);
        }
        return var145;
    }
    
    public static SubLObject f50584(final SubLObject var186, final SubLObject var122, final SubLObject var54, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var54.eql((SubLObject)$ic71$)) {
            return f50585(var186, var122, var125);
        }
        if (var54.eql((SubLObject)$ic28$)) {
            return f50586(var186, var122, var125);
        }
        return Errors.error((SubLObject)$ic72$, var54);
    }
    
    public static SubLObject f50587(final SubLObject var187, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLThread var188 = SubLProcess.currentSubLThread();
        var188.resetMultipleValues();
        final SubLObject var189 = module0423.f29604(var187);
        final SubLObject var190 = var188.secondMultipleValue();
        final SubLObject var191 = var188.thirdMultipleValue();
        var188.resetMultipleValues();
        if (NIL != conses_high.getf(var191, (SubLObject)$ic85$, (SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic86$);
            return (SubLObject)NIL;
        }
        return f50582(var189, var190, var16);
    }
    
    public static SubLObject f50588(final SubLObject var187, final SubLObject var122, final SubLObject var54, SubLObject var16, SubLObject var125) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var188 = f50587(var187, var16);
        if (NIL != var188) {
            f50584(var188, var122, var54, var125);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50589(final SubLObject var22, final SubLObject var54, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)NIL;
        final SubLObject var128 = $g6326$.currentBinding(var126);
        try {
            $g6326$.bind((SubLObject)ZERO_INTEGER, var126);
            final SubLObject var129 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            final SubLObject var15_189 = $g6327$.currentBinding(var126);
            try {
                $g6327$.bind((SubLObject)$ic87$, var126);
                var127 = f50569(var22);
                final SubLObject var130 = (SubLObject)ConsesLow.list((SubLObject)$ic27$, var54);
                f50570(var22, var127, var130, var125, (SubLObject)NIL, var129);
            }
            finally {
                $g6327$.rebind(var15_189, var126);
            }
        }
        finally {
            $g6326$.rebind(var128, var126);
        }
        return var127;
    }
    
    public static SubLObject f50570(final SubLObject var140, final SubLObject var100, final SubLObject var16, final SubLObject var71, final SubLObject var76, final SubLObject var10) {
        final SubLObject var141 = f50590(var140, var100);
        f50591(var141, var16, var71, var76, var10);
        return var141;
    }
    
    public static SubLObject f50590(final SubLObject var140, final SubLObject var100) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        var141.resetMultipleValues();
        final SubLObject var142 = f50592(var100);
        final SubLObject var143 = var141.secondMultipleValue();
        var141.resetMultipleValues();
        if (NIL != var143) {
            return (SubLObject)ConsesLow.list(var140, var142, var143);
        }
        return (SubLObject)ConsesLow.list(var140, var142);
    }
    
    public static SubLObject f50591(final SubLObject var105, final SubLObject var16, final SubLObject var71, final SubLObject var76, final SubLObject var10) {
        f50593(var105);
        if (NIL != var71) {
            f50594(var105, var16, var71);
        }
        if (NIL != var76) {
            f50595(var105, var16, var76);
        }
        f50596(var105, var10);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50594(final SubLObject var105, final SubLObject var16, final SubLObject var71) {
        final SubLObject var106 = conses_high.getf(var16, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        f50597(var105, var106, var71);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50595(final SubLObject var105, final SubLObject var16, final SubLObject var76) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        final SubLObject var107 = conses_high.getf(var16, (SubLObject)$ic47$, (SubLObject)UNPROVIDED);
        final SubLObject var108 = module0021.$g777$.currentBinding(var106);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var106);
            module0021.f1149(dumper_oc.f37935());
            if (NIL != var107) {
                module0021.f1038(var105, var76);
            }
            else {
                module0021.f1040(var105, var76);
            }
        }
        finally {
            module0021.$g777$.rebind(var108, var106);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50564(final SubLObject var11, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = f50555(var11);
        if (NIL != var76) {
            final SubLObject var79 = conses_high.getf(var78, (SubLObject)$ic47$, (SubLObject)UNPROVIDED);
            final SubLObject var80 = module0021.$g777$.currentBinding(var77);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var77);
                module0021.f1149(dumper_oc.f37935());
                if (NIL != var79) {
                    module0021.f1038(var11, var76);
                }
                else {
                    module0021.f1040(var11, var76);
                }
            }
            finally {
                module0021.$g777$.rebind(var80, var77);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50593(final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        if ($g6327$.getDynamicValue(var106) == $ic87$) {
            return var105;
        }
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var108 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var105, var105, (SubLObject)$ic74$);
        var107 = var105.first();
        SubLObject var109 = var105.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var109, var105, (SubLObject)$ic74$);
        var108 = var109.first();
        var109 = var109.rest();
        final SubLObject var110 = (SubLObject)(var109.isCons() ? var109.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var109, var105, (SubLObject)$ic74$);
        var109 = var109.rest();
        if (NIL == var109) {
            $g6327$.setDynamicValue(Numbers.add($g6327$.getDynamicValue(var106), Sequences.length(var108)), var106);
            $g6327$.setDynamicValue(Numbers.add($g6327$.getDynamicValue(var106), Sequences.length(var110)), var106);
            $g6328$.setDynamicValue(Numbers.add($g6328$.getDynamicValue(var106), Sequences.length(var108)), var106);
            $g6329$.setDynamicValue(Numbers.add($g6329$.getDynamicValue(var106), (SubLObject)ONE_INTEGER), var106);
            if (NIL != var108 && NIL == var110) {
                $g6330$.setDynamicValue(Numbers.add($g6330$.getDynamicValue(var106), (SubLObject)ONE_INTEGER), var106);
            }
            else if (NIL != var108 && NIL != var110) {
                $g6331$.setDynamicValue(Numbers.add($g6331$.getDynamicValue(var106), (SubLObject)ONE_INTEGER), var106);
            }
            else {
                $g6332$.setDynamicValue(Numbers.add($g6332$.getDynamicValue(var106), (SubLObject)ONE_INTEGER), var106);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var105, (SubLObject)$ic74$);
        }
        return var105;
    }
    
    public static SubLObject f50562(final SubLObject var35, final SubLObject var37, final SubLObject var39, final SubLObject var41, final SubLObject var43, final SubLObject var45, final SubLObject var47, final SubLObject var49, final SubLObject var51, final SubLObject var12, final SubLObject var54, final SubLObject var56, final SubLObject var58, final SubLObject var60, final SubLObject var62, final SubLObject var64, final SubLObject var66, final SubLObject var68) {
        if (NIL != var35 && !areAssertionsDisabledFor(me) && NIL == f50546(var35)) {
            throw new AssertionError(var35);
        }
        if (NIL != var37 && !areAssertionsDisabledFor(me) && NIL == f50547(var37)) {
            throw new AssertionError(var37);
        }
        if (NIL != var39 && !areAssertionsDisabledFor(me) && NIL == module0161.f10481(var39)) {
            throw new AssertionError(var39);
        }
        if (NIL != var41 && !areAssertionsDisabledFor(me) && NIL == f50548(var41)) {
            throw new AssertionError(var41);
        }
        if (NIL != var43 && !areAssertionsDisabledFor(me) && NIL == f50549(var43)) {
            throw new AssertionError(var43);
        }
        if (NIL != var45 && !areAssertionsDisabledFor(me) && NIL == f50550(var45)) {
            throw new AssertionError(var45);
        }
        if (NIL != var47 && !areAssertionsDisabledFor(me) && NIL == f50551(var47)) {
            throw new AssertionError(var47);
        }
        assert NIL != Types.booleanp(var49) : var49;
        assert NIL != module0004.f105(var51) : var51;
        if (NIL != var12 && !areAssertionsDisabledFor(me) && NIL == module0075.f5193(var12)) {
            throw new AssertionError(var12);
        }
        if (NIL != var54 && !areAssertionsDisabledFor(me) && NIL == f50552(var54)) {
            throw new AssertionError(var54);
        }
        if (NIL != var56 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var56)) {
            throw new AssertionError(var56);
        }
        if (NIL != var58 && !areAssertionsDisabledFor(me) && NIL == module0075.f5193(var58)) {
            throw new AssertionError(var58);
        }
        assert NIL != Types.booleanp(var60) : var60;
        assert NIL != Types.booleanp(var62) : var62;
        assert NIL != Types.booleanp(var64) : var64;
        assert NIL != Types.booleanp(var66) : var66;
        assert NIL != Types.booleanp(var68) : var68;
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50568(final SubLObject var22, final SubLObject var195) {
        return f50571(module0178.f11287(var22), var195);
    }
    
    public static SubLObject f50571(final SubLObject var109, final SubLObject var195) {
        final SubLThread var196 = SubLProcess.currentSubLThread();
        SubLObject var197 = (SubLObject)NIL;
        if (NIL != var195) {
            final SubLObject var198 = module0147.f9540(var195);
            final SubLObject var199 = module0147.$g2095$.currentBinding(var196);
            final SubLObject var200 = module0147.$g2094$.currentBinding(var196);
            final SubLObject var201 = module0147.$g2096$.currentBinding(var196);
            try {
                module0147.$g2095$.bind(module0147.f9545(var198), var196);
                module0147.$g2094$.bind(module0147.f9546(var198), var196);
                module0147.$g2096$.bind(module0147.f9549(var198), var196);
                var197 = module0147.f9507(var109);
            }
            finally {
                module0147.$g2096$.rebind(var201, var196);
                module0147.$g2094$.rebind(var200, var196);
                module0147.$g2095$.rebind(var199, var196);
            }
        }
        return (SubLObject)makeBoolean(NIL == var197);
    }
    
    public static SubLObject f50569(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0178.f11287(var22);
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = $g6318$.getDynamicValue(var23);
        if (var26.eql((SubLObject)$ic8$)) {
            var25 = f50598(var22, var24);
        }
        else if (var26.eql((SubLObject)$ic99$) || var26.eql((SubLObject)$ic100$)) {
            final SubLObject var27 = module0289.f19396(var22);
            final SubLObject var28 = $g6318$.currentBinding(var23);
            try {
                $g6318$.bind((SubLObject)$ic99$, var23);
                var25 = f50572(var27, var24);
            }
            finally {
                $g6318$.rebind(var28, var23);
            }
        }
        if ($g6318$.getDynamicValue(var23) == $ic100$) {
            var25 = ConsesLow.nconc(var25, f50598(var22, var24));
        }
        if (NIL != module0178.f11284(var22) && NIL != module0211.f13635(var22)) {
            final SubLObject var29 = module0178.f11285(var22);
            final SubLObject var30 = f50599(var29, var24);
            if (NIL != var25) {
                var25 = ConsesLow.nconc(var25, var30);
            }
        }
        return module0035.f2269(var25, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50598(final SubLObject var22, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        final SubLObject var111 = module0178.f11283(var22);
        SubLObject var112 = (SubLObject)NIL;
        final SubLObject var113 = $g6333$.currentBinding(var110);
        try {
            $g6333$.bind(var22, var110);
            var112 = f50600(var111, var109);
        }
        finally {
            $g6333$.rebind(var113, var110);
        }
        return var112;
    }
    
    public static SubLObject f50572(final SubLObject var108, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        final SubLObject var113 = $g6318$.getDynamicValue(var110);
        if (var113.eql((SubLObject)$ic8$)) {
            var111 = (SubLObject)ConsesLow.cons(var108, var111);
        }
        else if (var113.eql((SubLObject)$ic99$)) {
            var111 = (SubLObject)ConsesLow.cons(f50601(var108, var109), var111);
        }
        else if (var113.eql((SubLObject)$ic100$)) {
            var111 = (SubLObject)ConsesLow.cons(var108, var111);
            final SubLObject var114 = f50601(var108, var109);
            if (!var108.equal(var114)) {
                var111 = (SubLObject)ConsesLow.cons(var114, var111);
            }
        }
        SubLObject var115 = var111;
        SubLObject var108_204 = (SubLObject)NIL;
        var108_204 = var115.first();
        while (NIL != var115) {
            final SubLObject var116 = f50602(var108_204, var109);
            if (NIL == module0206.f13427(var116)) {
                SubLObject var21_206 = var116;
                SubLObject var117 = (SubLObject)NIL;
                var117 = var21_206.first();
                while (NIL != var21_206) {
                    var112 = ConsesLow.nconc(var112, f50600(var117, var109));
                    if (NIL != module0232.f15322(var117)) {
                        final SubLObject var118 = module0204.f13054(var117);
                        final SubLObject var119 = f50599(var118, var109);
                        var112 = ConsesLow.nconc(var112, var119);
                    }
                    var21_206 = var21_206.rest();
                    var117 = var21_206.first();
                }
            }
            var115 = var115.rest();
            var108_204 = var115.first();
        }
        return var112;
    }
    
    public static SubLObject f50601(final SubLObject var108, SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (NIL == module0202.f12589(var108, $ic101$)) {
            SubLObject var111 = (SubLObject)NIL;
            if (NIL != module0132.f8596(var109)) {
                var109 = module0132.$g1547$.getGlobalValue();
            }
            if (NIL != module0035.f2439((SubLObject)$ic107$, var108, (SubLObject)UNPROVIDED)) {
                final SubLObject var112 = module0147.f9540(var109);
                final SubLObject var113 = module0147.$g2095$.currentBinding(var110);
                final SubLObject var114 = module0147.$g2094$.currentBinding(var110);
                final SubLObject var115 = module0147.$g2096$.currentBinding(var110);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var112), var110);
                    module0147.$g2094$.bind(module0147.f9546(var112), var110);
                    module0147.$g2096$.bind(module0147.f9549(var112), var110);
                    var111 = module0202.f12912(module0036.f2547(var108, (SubLObject)$ic107$, (SubLObject)$ic108$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                finally {
                    module0147.$g2096$.rebind(var115, var110);
                    module0147.$g2094$.rebind(var114, var110);
                    module0147.$g2095$.rebind(var113, var110);
                }
            }
            return var111;
        }
        final SubLObject var116 = module0205.f13203(var108, (SubLObject)UNPROVIDED);
        if (var116.eql($ic102$)) {
            return (SubLObject)$ic103$;
        }
        if (var116.eql($ic104$)) {
            return (SubLObject)$ic105$;
        }
        return f50603((SubLObject)$ic106$, $ic101$);
    }
    
    public static SubLObject f50604(final SubLObject var198) {
        return f50605(var198);
    }
    
    public static SubLObject f50605(final SubLObject var198) {
        return (SubLObject)makeBoolean(NIL != module0269.f17792(module0205.f13136(var198)) && NIL != module0220.f14544(module0205.f13136(var198), $ic109$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50606(final SubLObject var198, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = module0147.$g2095$.getDynamicValue();
        }
        return module0202.f12910(module0278.f18392(var198, var109));
    }
    
    public static SubLObject f50602(final SubLObject var108, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = module0146.$g2017$.currentBinding(var110);
        final SubLObject var113 = module0282.$g2616$.currentBinding(var110);
        try {
            module0146.$g2017$.bind((SubLObject)NIL, var110);
            module0282.$g2616$.bind((SubLObject)NIL, var110);
            var111 = module0282.f18746(var108, var109);
        }
        finally {
            module0282.$g2616$.rebind(var113, var110);
            module0146.$g2017$.rebind(var112, var110);
        }
        return var111;
    }
    
    public static SubLObject f50600(final SubLObject var201, final SubLObject var109) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var201, var201, (SubLObject)$ic78$);
        var204 = var201.first();
        SubLObject var206 = var201.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var206, var201, (SubLObject)$ic78$);
        var205 = var206.first();
        var206 = var206.rest();
        if (NIL == var206) {
            SubLObject var207 = (SubLObject)NIL;
            SubLObject var208 = (SubLObject)NIL;
            SubLObject var209 = (SubLObject)NIL;
            final SubLObject var210 = $g6316$.getDynamicValue(var202);
            if (var210.eql((SubLObject)$ic79$)) {
                if (NIL != var204 || !Sequences.length(var205).equal((SubLObject)ONE_INTEGER) || !var205.first().first().equal($ic80$)) {
                    final SubLObject var211 = module0202.f12768($ic80$, var109, (SubLObject)$ic81$);
                    var207 = (SubLObject)ConsesLow.cons(f50583(var211, $ic59$, $g6316$.getDynamicValue(var202)), var207);
                }
            }
            else if (var210.eql((SubLObject)$ic82$)) {
                final SubLObject var212 = module0202.f12643($ic83$, var109);
                var207 = (SubLObject)ConsesLow.cons(f50583(var212, var109, $g6316$.getDynamicValue(var202)), var207);
            }
            else if (var210.eql((SubLObject)$ic3$)) {
                if (NIL == module0132.f8596(var109)) {
                    final SubLObject var212 = module0202.f12643($ic83$, var109);
                    var207 = (SubLObject)ConsesLow.cons(f50583(var212, var109, $g6316$.getDynamicValue(var202)), var207);
                }
            }
            else if (!var210.eql((SubLObject)$ic84$)) {
                SubLObject var213_214;
                final SubLObject var211_212 = var213_214 = $g6316$.getDynamicValue(var202);
                SubLObject var213 = (SubLObject)NIL;
                SubLObject var214 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var213_214, var211_212, (SubLObject)$ic110$);
                var213 = var213_214.first();
                var213_214 = var213_214.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var213_214, var211_212, (SubLObject)$ic110$);
                var214 = var213_214.first();
                var213_214 = var213_214.rest();
                if (NIL == var213_214) {
                    final SubLObject var215 = module0147.f9540(var214);
                    final SubLObject var216 = module0147.$g2095$.currentBinding(var202);
                    final SubLObject var217 = module0147.$g2094$.currentBinding(var202);
                    final SubLObject var218 = module0147.$g2096$.currentBinding(var202);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var215), var202);
                        module0147.$g2094$.bind(module0147.f9546(var215), var202);
                        module0147.$g2096$.bind(module0147.f9549(var215), var202);
                        if (NIL == module0147.f9507(var109)) {
                            var209 = (SubLObject)T;
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var218, var202);
                        module0147.$g2094$.rebind(var217, var202);
                        module0147.$g2095$.rebind(var216, var202);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var211_212, (SubLObject)$ic110$);
                }
            }
            if (NIL != var209) {
                var203 = (SubLObject)ConsesLow.cons(f50603((SubLObject)$ic111$, var109), var203);
            }
            else {
                SubLObject var219 = var204;
                SubLObject var220 = (SubLObject)NIL;
                var220 = var219.first();
                while (NIL != var219) {
                    final SubLObject var221 = f50583(var220, var109, $g6316$.getDynamicValue(var202));
                    var207 = (SubLObject)ConsesLow.cons(var221, var207);
                    var219 = var219.rest();
                    var220 = var219.first();
                }
                var219 = var205;
                SubLObject var222 = (SubLObject)NIL;
                var222 = var219.first();
                while (NIL != var219) {
                    final SubLObject var221 = f50583(var222, var109, $g6316$.getDynamicValue(var202));
                    var208 = (SubLObject)ConsesLow.cons(var221, var208);
                    var219 = var219.rest();
                    var222 = var219.first();
                }
                var207 = Sequences.nreverse(var207);
                var208 = Sequences.nreverse(var208);
                final SubLObject var223 = module0232.f15326(var207, var208);
                final SubLObject var224 = module0232.f15328(var223, (SubLObject)UNPROVIDED);
                var203 = (SubLObject)ConsesLow.cons(var224, var203);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var201, (SubLObject)$ic78$);
        }
        return Sequences.nreverse(var203);
    }
    
    public static SubLObject f50592(final SubLObject var100) {
        if (NIL == f50607(var100)) {
            return Values.values(var100, (SubLObject)NIL);
        }
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = var100;
        SubLObject var104 = (SubLObject)NIL;
        var104 = var103.first();
        while (NIL != var103) {
            if (NIL != f50607(var104)) {
                var102 = (SubLObject)ConsesLow.cons(var104, var102);
            }
            else {
                var101 = (SubLObject)ConsesLow.cons(var104, var101);
            }
            var103 = var103.rest();
            var104 = var103.first();
        }
        return Values.values(Sequences.nreverse(var101), Sequences.nreverse(var102));
    }
    
    public static SubLObject f50596(final SubLObject var105, final SubLObject var10) {
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var105, var105, (SubLObject)$ic74$);
        var106 = var105.first();
        SubLObject var108 = var105.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var108, var105, (SubLObject)$ic74$);
        var107 = var108.first();
        var108 = var108.rest();
        final SubLObject var109 = (SubLObject)(var108.isCons() ? var108.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var108, var105, (SubLObject)$ic74$);
        var108 = var108.rest();
        if (NIL == var108) {
            if (NIL != var109) {
                f50608(var109, var10);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var105, (SubLObject)$ic74$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50608(final SubLObject var221, final SubLObject var10) {
        final SubLObject var222 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var224;
        final SubLObject var223 = var224 = module0035.f2399(var221, (SubLObject)$ic112$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var225 = (SubLObject)NIL;
        var225 = var224.first();
        while (NIL != var224) {
            SubLObject var227;
            final SubLObject var226 = var227 = var225;
            SubLObject var228 = (SubLObject)NIL;
            SubLObject var229 = (SubLObject)NIL;
            SubLObject var230 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var227, var226, (SubLObject)$ic113$);
            var228 = var227.first();
            var227 = var227.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var227, var226, (SubLObject)$ic113$);
            var229 = var227.first();
            var227 = var227.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var227, var226, (SubLObject)$ic113$);
            var230 = var227.first();
            var227 = var227.rest();
            if (NIL == var227) {
                module0077.f5326(var229, var222);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var226, (SubLObject)$ic113$);
            }
            var224 = var224.rest();
            var225 = var224.first();
        }
        final SubLObject var231 = module0077.f5333(var222);
        SubLObject var229;
        SubLObject var232;
        SubLObject var233;
        for (var232 = module0032.f1741(var231), var233 = (SubLObject)NIL, var233 = module0032.f1742(var232, var231); NIL == module0032.f1744(var232, var233); var233 = module0032.f1743(var233)) {
            var229 = module0032.f1745(var232, var233);
            if (NIL != module0032.f1746(var233, var229)) {
                module0084.f5775(var10, var229, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50609(final SubLObject var122, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(var125, (SubLObject)$ic114$, (SubLObject)$ic115$);
        PrintLow.format(var125, (SubLObject)$ic116$, (SubLObject)$ic117$);
        module0213.f13862(var125);
        final SubLObject var126 = f50556(var122);
        if (NIL != var126) {
            PrintLow.format(var125, (SubLObject)$ic114$, (SubLObject)$ic118$);
            f50610(f50556(var122), var125);
            streams_high.terpri(var125);
            PrintLow.format(var125, (SubLObject)$ic114$, (SubLObject)$ic119$);
            f50611(f50556(var122), var125);
        }
        PrintLow.format(var125, (SubLObject)$ic114$, (SubLObject)$ic120$);
        SubLObject var127 = conses_high.copy_list(var122);
        var127 = conses_high.remf(var127, (SubLObject)$ic24$);
        var127 = conses_high.remf(var127, (SubLObject)$ic25$);
        module0035.f2365(var127, var125);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50610(final SubLObject var10, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return module0006.f215(module0084.f5795(var10, Symbols.symbol_function((SubLObject)$ic121$)), var125);
    }
    
    public static SubLObject f50611(final SubLObject var10, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var126 = module0084.f5795(var10, Symbols.symbol_function((SubLObject)$ic121$));
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            SubLObject var129;
            final SubLObject var128 = var129 = var127;
            SubLObject var130 = (SubLObject)NIL;
            SubLObject var131 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var129, var128, (SubLObject)$ic122$);
            var130 = var129.first();
            var129 = (var131 = var129.rest());
            final SubLObject var132 = f50612(var130);
            PrintLow.format(var125, (SubLObject)$ic123$, new SubLObject[] { var131, var131, (NIL != module0048.f3275(var131)) ? $ic124$ : $ic125$, var132 });
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50612(final SubLObject var228) {
        SubLObject var229 = conses_high.getf($g6322$.getGlobalValue(), var228, (SubLObject)UNPROVIDED);
        if (NIL == var229) {
            var229 = Sequences.cconcatenate((SubLObject)$ic126$, module0038.f2638(var228));
        }
        return var229;
    }
    
    public static SubLObject f50613(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic127$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50607(final SubLObject var1) {
        return module0035.f2439((SubLObject)$ic112$, var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50603(final SubLObject var228, final SubLObject var229) {
        return module0202.f12768($ic127$, var228, var229);
    }
    
    public static SubLObject f50599(final SubLObject var199, final SubLObject var109) {
        SubLObject var200 = (SubLObject)NIL;
        SubLObject var201 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var199, var199, (SubLObject)$ic128$);
        var200 = var199.first();
        final SubLObject var202 = var201 = var199.rest();
        if (NIL != module0173.f10955(var200)) {
            final SubLObject var203 = var200;
            if (var203.eql($ic129$)) {
                SubLObject var245_246;
                final SubLObject var243_244 = var245_246 = var201;
                SubLObject var204 = (SubLObject)NIL;
                SubLObject var205 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)$ic130$);
                var204 = var245_246.first();
                var245_246 = var245_246.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)$ic130$);
                var205 = var245_246.first();
                var245_246 = var245_246.rest();
                if (NIL == var245_246) {
                    final SubLObject var206 = module0225.f14739(var204);
                    if (var206.isInteger()) {
                        final SubLObject var207 = f50614(var206);
                        final SubLObject var208 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var204, ConsesLow.append(var207, (SubLObject)NIL))), (SubLObject)ConsesLow.list(reader.bq_cons(var205, ConsesLow.append(var207, (SubLObject)NIL))));
                        return f50600(var208, var109);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var243_244, (SubLObject)$ic130$);
                }
            }
            else if (var203.eql($ic131$)) {
                SubLObject var254_255;
                final SubLObject var252_253 = var254_255 = var201;
                SubLObject var204 = (SubLObject)NIL;
                SubLObject var205 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var254_255, var252_253, (SubLObject)$ic130$);
                var204 = var254_255.first();
                var254_255 = var254_255.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var254_255, var252_253, (SubLObject)$ic130$);
                var205 = var254_255.first();
                var254_255 = var254_255.rest();
                if (NIL == var254_255) {
                    final SubLObject var206 = module0225.f14739(var204);
                    if (var206.isInteger()) {
                        final SubLObject var207 = f50614(var206);
                        final SubLObject var208 = reader.bq_cons((SubLObject)ConsesLow.list(reader.bq_cons(var204, ConsesLow.append(var207, (SubLObject)NIL)), reader.bq_cons(var205, ConsesLow.append(var207, (SubLObject)NIL))), (SubLObject)$ic132$);
                        return f50600(var208, var109);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var252_253, (SubLObject)$ic130$);
                }
            }
            else {
                if (var203.eql($ic133$) || var203.eql($ic134$) || var203.eql($ic135$) || var203.eql($ic136$) || var203.eql($ic137$) || var203.eql($ic138$)) {
                    return f50615(var199, var109, $ic139$);
                }
                if (var203.eql($ic140$) || var203.eql($ic141$) || var203.eql($ic142$) || var203.eql($ic143$) || var203.eql($ic144$) || var203.eql($ic145$)) {
                    return f50615(var199, var109, $ic146$);
                }
                if (var203.eql($ic147$)) {
                    return f50616(var199, var109, $ic139$);
                }
                if (var203.eql($ic148$)) {
                    return f50616(var199, var109, $ic148$);
                }
                if (var203.eql($ic146$) || var203.eql($ic149$) || var203.eql($ic150$)) {
                    SubLObject var209 = (SubLObject)NIL;
                    final SubLObject var210 = module0278.f18392(var199, var109);
                    if (!var210.equal(var199)) {
                        final SubLObject var211 = module0282.f18746(var210, var109);
                        if (!$ic151$.eql(var211)) {
                            if (var211.isCons()) {
                                SubLObject var212 = var211;
                                SubLObject var213 = (SubLObject)NIL;
                                var213 = var212.first();
                                while (NIL != var212) {
                                    var209 = ConsesLow.nconc(f50600(var213, var109), var209);
                                    var212 = var212.rest();
                                    var213 = var212.first();
                                }
                            }
                            else {
                                var209 = (SubLObject)ConsesLow.list(f50603((SubLObject)$ic99$, var210));
                            }
                        }
                    }
                    return var209;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50615(final SubLObject var199, final SubLObject var109, final SubLObject var257) {
        SubLObject var258 = (SubLObject)NIL;
        SubLObject var259 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var199, var199, (SubLObject)$ic128$);
        var258 = var199.first();
        final SubLObject var260 = var259 = var199.rest();
        SubLObject var262_263;
        final SubLObject var260_261 = var262_263 = var259;
        SubLObject var261 = (SubLObject)NIL;
        SubLObject var262 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var262_263, var260_261, (SubLObject)$ic152$);
        var261 = var262_263.first();
        var262_263 = var262_263.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var262_263, var260_261, (SubLObject)$ic152$);
        var262 = var262_263.first();
        var262_263 = var262_263.rest();
        if (NIL == var262_263) {
            if (NIL != module0269.f17726(var261)) {
                return (SubLObject)ConsesLow.list(f50603((SubLObject)$ic153$, var199));
            }
            if (NIL != module0269.f17716(var261)) {
                final SubLObject var263 = module0225.f14739(var261);
                if (var263.isInteger()) {
                    final SubLObject var264 = f50614(var263);
                    final SubLObject var265 = $ic139$.eql(var257) ? module0226.f14914(var258) : module0226.f14916(var258);
                    final SubLObject var266 = ConsesLow.nth(module0048.f_1_(var265), var264);
                    if (var265.numG(var263)) {
                        return (SubLObject)ConsesLow.list(f50603((SubLObject)$ic154$, var199));
                    }
                    final SubLObject var267 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var261, ConsesLow.append(var264, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var257, var266, var262)));
                    return f50600(var267, var109);
                }
            }
            else {
                if (NIL != f50617(var261)) {
                    return (SubLObject)ConsesLow.list(f50603((SubLObject)$ic155$, var261));
                }
                return (SubLObject)ConsesLow.list(f50603((SubLObject)$ic156$, var261));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var260_261, (SubLObject)$ic152$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50616(final SubLObject var199, final SubLObject var109, final SubLObject var268) {
        SubLObject var269 = (SubLObject)NIL;
        SubLObject var270 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var199, var199, (SubLObject)$ic128$);
        var269 = var199.first();
        final SubLObject var271 = var270 = var199.rest();
        SubLObject var273_274;
        final SubLObject var271_272 = var273_274 = var270;
        SubLObject var272 = (SubLObject)NIL;
        SubLObject var273 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var273_274, var271_272, (SubLObject)$ic157$);
        var272 = var273_274.first();
        var273_274 = var273_274.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var273_274, var271_272, (SubLObject)$ic157$);
        var273 = var273_274.first();
        var273_274 = var273_274.rest();
        if (NIL == var273_274) {
            final SubLObject var274 = module0225.f14739(var272);
            if (var274.isInteger()) {
                final SubLObject var275 = f50614(var274);
                final SubLObject var276 = (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var268, reader.bq_cons(var272, ConsesLow.append(var275, (SubLObject)NIL)), var273)));
                return f50600(var276, var109);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var271_272, (SubLObject)$ic157$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50617(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12621(var1) || NIL != module0202.f12630(var1));
    }
    
    public static SubLObject f50618() {
        final SubLObject var276 = $g6334$.getGlobalValue();
        if (NIL != var276) {
            module0034.f1818(var276);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50619(final SubLObject var249) {
        return module0034.f1829($g6334$.getGlobalValue(), (SubLObject)ConsesLow.list(var249), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50620(final SubLObject var249) {
        SubLObject var250 = (SubLObject)NIL;
        SubLObject var251;
        SubLObject var252;
        for (var251 = (SubLObject)NIL, var251 = (SubLObject)ZERO_INTEGER; var251.numL(var249); var251 = Numbers.add(var251, (SubLObject)ONE_INTEGER)) {
            var252 = module0201.f12550(Sequences.cconcatenate((SubLObject)$ic159$, module0006.f203(module0048.f_1X(var251))));
            var250 = (SubLObject)ConsesLow.cons(var252, var250);
        }
        return Sequences.nreverse(var250);
    }
    
    public static SubLObject f50614(final SubLObject var249) {
        SubLObject var250 = $g6334$.getGlobalValue();
        if (NIL == var250) {
            var250 = module0034.f1934((SubLObject)$ic158$, (SubLObject)$ic160$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var251 = module0034.f1814(var250, var249, (SubLObject)$ic161$);
        if (var251 == $ic161$) {
            var251 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50620(var249)));
            module0034.f1816(var250, var249, var251, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var251);
    }
    
    public static SubLObject f50573(final SubLObject var120, final SubLObject var39, final SubLObject var49) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        SubLObject var122 = (SubLObject)NIL;
        if (NIL == module0035.f2169(var120, $g6321$.getGlobalValue())) {
            if (NIL != module0269.f17710(var120) && NIL != f50571($ic59$, var39) && $g6317$.getDynamicValue(var121) == $ic6$) {
                if (NIL != var49) {
                    var122 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic162$, (SubLObject)ConsesLow.list((SubLObject)$ic163$, (SubLObject)$ic164$, f50621(var120)), reader.bq_cons((SubLObject)ConsesLow.listS($ic165$, var120, (SubLObject)$ic166$), (SubLObject)$ic167$)), var122);
                }
                else {
                    var122 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic168$, (SubLObject)ConsesLow.list((SubLObject)$ic163$, (SubLObject)$ic164$, f50621(var120)), reader.bq_cons((SubLObject)ConsesLow.listS($ic165$, var120, (SubLObject)$ic166$), (SubLObject)$ic167$)), var122);
                    var122 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic168$, reader.bq_cons((SubLObject)ConsesLow.listS($ic165$, var120, (SubLObject)$ic166$), (SubLObject)$ic167$), (SubLObject)ConsesLow.list((SubLObject)$ic163$, (SubLObject)$ic164$, f50621(var120))), var122);
                }
            }
            if (var120.eql($ic80$) && $ic84$ != $g6316$.getDynamicValue(var121)) {
                var122 = (SubLObject)ConsesLow.cons((SubLObject)$ic169$, var122);
            }
            if (NIL != module0035.f2169($g6316$.getDynamicValue(var121), (SubLObject)$ic170$) && NIL != module0132.f8596(var120)) {
                var122 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic171$, f50621(var120)), var122);
            }
            if (NIL != module0269.f17716(var120)) {
                final SubLObject var123 = f50622(var120);
                if (var123.isVector()) {
                    final SubLObject var124 = var123;
                    final SubLObject var125 = (SubLObject)NIL;
                    SubLObject var126;
                    SubLObject var127;
                    SubLObject var128;
                    SubLObject var129;
                    for (var126 = Sequences.length(var124), var127 = (SubLObject)NIL, var127 = (SubLObject)ZERO_INTEGER; var127.numL(var126); var127 = Numbers.add(var127, (SubLObject)ONE_INTEGER)) {
                        var128 = ((NIL != var125) ? Numbers.subtract(var126, var127, (SubLObject)ONE_INTEGER) : var127);
                        var129 = Vectors.aref(var124, var128);
                        var122 = (SubLObject)ConsesLow.cons(var129, var122);
                    }
                }
                else {
                    SubLObject var130 = var123;
                    SubLObject var131 = (SubLObject)NIL;
                    var131 = var130.first();
                    while (NIL != var130) {
                        var122 = (SubLObject)ConsesLow.cons(var131, var122);
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
                if (NIL != module0225.f14781(var120) && NIL != f50571(module0132.$g1555$.getGlobalValue(), var39)) {
                    SubLObject var132 = f50623(var120);
                    SubLObject var133 = (SubLObject)NIL;
                    var133 = var132.first();
                    while (NIL != var132) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                        var132 = var132.rest();
                        var133 = var132.first();
                    }
                    var132 = f50624(var120);
                    var133 = (SubLObject)NIL;
                    var133 = var132.first();
                    while (NIL != var132) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                        var132 = var132.rest();
                        var133 = var132.first();
                    }
                    var132 = f50625(var120);
                    var133 = (SubLObject)NIL;
                    var133 = var132.first();
                    while (NIL != var132) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                        var132 = var132.rest();
                        var133 = var132.first();
                    }
                    var132 = f50626(var120);
                    var133 = (SubLObject)NIL;
                    var133 = var132.first();
                    while (NIL != var132) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                        var132 = var132.rest();
                        var133 = var132.first();
                    }
                    var132 = f50627(var120);
                    var133 = (SubLObject)NIL;
                    var133 = var132.first();
                    while (NIL != var132) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                        var132 = var132.rest();
                        var133 = var132.first();
                    }
                    var132 = f50628(var120);
                    var133 = (SubLObject)NIL;
                    var133 = var132.first();
                    while (NIL != var132) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                        var132 = var132.rest();
                        var133 = var132.first();
                    }
                }
            }
            if (NIL != module0269.f17728(var120) && module0225.f14739(var120).isInteger()) {
                SubLObject var123 = f50629(var120);
                if (var123.isVector()) {
                    final SubLObject var124 = var123;
                    final SubLObject var125 = (SubLObject)NIL;
                    SubLObject var126;
                    SubLObject var127;
                    SubLObject var128;
                    SubLObject var129;
                    for (var126 = Sequences.length(var124), var127 = (SubLObject)NIL, var127 = (SubLObject)ZERO_INTEGER; var127.numL(var126); var127 = Numbers.add(var127, (SubLObject)ONE_INTEGER)) {
                        var128 = ((NIL != var125) ? Numbers.subtract(var126, var127, (SubLObject)ONE_INTEGER) : var127);
                        var129 = Vectors.aref(var124, var128);
                        var122 = (SubLObject)ConsesLow.cons(var129, var122);
                    }
                }
                else {
                    SubLObject var130 = var123;
                    SubLObject var131 = (SubLObject)NIL;
                    var131 = var130.first();
                    while (NIL != var130) {
                        var122 = (SubLObject)ConsesLow.cons(var131, var122);
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
                var123 = f50630(var120);
                if (var123.isVector()) {
                    final SubLObject var124 = var123;
                    final SubLObject var125 = (SubLObject)NIL;
                    SubLObject var126;
                    SubLObject var127;
                    SubLObject var128;
                    SubLObject var129;
                    for (var126 = Sequences.length(var124), var127 = (SubLObject)NIL, var127 = (SubLObject)ZERO_INTEGER; var127.numL(var126); var127 = Numbers.add(var127, (SubLObject)ONE_INTEGER)) {
                        var128 = ((NIL != var125) ? Numbers.subtract(var126, var127, (SubLObject)ONE_INTEGER) : var127);
                        var129 = Vectors.aref(var124, var128);
                        var122 = (SubLObject)ConsesLow.cons(var129, var122);
                    }
                }
                else {
                    SubLObject var130 = var123;
                    SubLObject var131 = (SubLObject)NIL;
                    var131 = var130.first();
                    while (NIL != var130) {
                        var122 = (SubLObject)ConsesLow.cons(var131, var122);
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
                var123 = f50631(var120);
                if (var123.isVector()) {
                    final SubLObject var124 = var123;
                    final SubLObject var125 = (SubLObject)NIL;
                    SubLObject var126;
                    SubLObject var127;
                    SubLObject var128;
                    SubLObject var129;
                    for (var126 = Sequences.length(var124), var127 = (SubLObject)NIL, var127 = (SubLObject)ZERO_INTEGER; var127.numL(var126); var127 = Numbers.add(var127, (SubLObject)ONE_INTEGER)) {
                        var128 = ((NIL != var125) ? Numbers.subtract(var126, var127, (SubLObject)ONE_INTEGER) : var127);
                        var129 = Vectors.aref(var124, var128);
                        var122 = (SubLObject)ConsesLow.cons(var129, var122);
                    }
                }
                else {
                    SubLObject var130 = var123;
                    SubLObject var131 = (SubLObject)NIL;
                    var131 = var130.first();
                    while (NIL != var130) {
                        var122 = (SubLObject)ConsesLow.cons(var131, var122);
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
            }
        }
        return Sequences.nreverse(var122);
    }
    
    public static SubLObject f50632(final SubLObject var288, final SubLObject var289) {
        SubLObject var291;
        final SubLObject var290 = var291 = var288.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic172$);
        final SubLObject var292 = var291.rest();
        var291 = var291.first();
        SubLObject var293 = (SubLObject)NIL;
        SubLObject var294 = (SubLObject)NIL;
        SubLObject var295 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic172$);
        var293 = var291.first();
        var291 = var291.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic172$);
        var294 = var291.first();
        var291 = var291.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var291, var290, (SubLObject)$ic172$);
        var295 = var291.first();
        var291 = var291.rest();
        if (NIL == var291) {
            final SubLObject var296;
            var291 = (var296 = var292);
            final SubLObject var297 = (SubLObject)$ic173$;
            final SubLObject var298 = (SubLObject)$ic174$;
            final SubLObject var299 = (SubLObject)$ic175$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic176$, (SubLObject)ConsesLow.list((SubLObject)$ic177$, var295), (SubLObject)ConsesLow.list((SubLObject)$ic178$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var299, (SubLObject)ConsesLow.list((SubLObject)$ic179$, var295))), (SubLObject)ConsesLow.list((SubLObject)$ic176$, var299, (SubLObject)ConsesLow.list((SubLObject)$ic180$, (SubLObject)ConsesLow.list(var297, var299), (SubLObject)ConsesLow.list((SubLObject)$ic178$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var294, (SubLObject)ConsesLow.list((SubLObject)$ic181$, var297)), (SubLObject)ConsesLow.list(var298, (SubLObject)ConsesLow.list((SubLObject)$ic182$, var294))), (SubLObject)ConsesLow.listS((SubLObject)$ic183$, (SubLObject)ConsesLow.listS(var293, var295, (SubLObject)$ic184$, var298, (SubLObject)$ic185$), ConsesLow.append(var296, (SubLObject)NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var290, (SubLObject)$ic172$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50622(final SubLObject var264) {
        SubLObject var265 = (SubLObject)NIL;
        if (NIL != module0269.f17720(var264)) {
            final SubLObject var266 = module0225.f14739(var264);
            if (NIL != var266) {
                SubLObject var267;
                SubLObject var268;
                SubLObject var270;
                SubLObject var269;
                SubLObject var271;
                SubLObject var272;
                SubLObject var273;
                SubLObject var274;
                SubLObject var275;
                SubLObject var276;
                SubLObject var304_309;
                SubLObject var305_310;
                SubLObject var277;
                SubLObject var307_311;
                SubLObject var278;
                SubLObject var279;
                SubLObject var280;
                SubLObject var281;
                SubLObject var282;
                SubLObject var283;
                SubLObject var284;
                SubLObject var285;
                SubLObject var286;
                SubLObject var287;
                SubLObject var288;
                SubLObject var289;
                SubLObject var290;
                SubLObject var291;
                for (var267 = (SubLObject)NIL, var267 = (SubLObject)ZERO_INTEGER; var267.numL(var266); var267 = Numbers.add(var267, (SubLObject)ONE_INTEGER)) {
                    var268 = module0048.f_1X(var267);
                    var269 = (var270 = module0226.f14903(var268, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    if (NIL != module0158.f10010(var264, (SubLObject)ONE_INTEGER, var270)) {
                        var271 = module0158.f10011(var264, (SubLObject)ONE_INTEGER, var270);
                        var272 = (SubLObject)NIL;
                        var273 = (SubLObject)NIL;
                        while (NIL == var272) {
                            var274 = module0052.f3695(var271, var273);
                            var275 = (SubLObject)makeBoolean(!var273.eql(var274));
                            if (NIL != var275) {
                                var276 = (SubLObject)NIL;
                                try {
                                    var276 = module0158.f10316(var274, (SubLObject)$ic8$, (SubLObject)$ic186$, (SubLObject)NIL);
                                    var304_309 = (SubLObject)NIL;
                                    var305_310 = (SubLObject)NIL;
                                    while (NIL == var304_309) {
                                        var277 = module0052.f3695(var276, var305_310);
                                        var307_311 = (SubLObject)makeBoolean(!var305_310.eql(var277));
                                        if (NIL != var307_311) {
                                            var278 = module0178.f11335(var277);
                                            var279 = module0178.f11287(var277);
                                            var280 = module0202.f12817(var268, (SubLObject)$ic187$, f50633(var264));
                                            var281 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var280), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic139$, (SubLObject)$ic187$, var278)));
                                            var282 = f50600(var281, var279);
                                            if (var282.isVector()) {
                                                var283 = var282;
                                                var284 = (SubLObject)NIL;
                                                for (var285 = Sequences.length(var283), var286 = (SubLObject)NIL, var286 = (SubLObject)ZERO_INTEGER; var286.numL(var285); var286 = Numbers.add(var286, (SubLObject)ONE_INTEGER)) {
                                                    var287 = ((NIL != var284) ? Numbers.subtract(var285, var286, (SubLObject)ONE_INTEGER) : var286);
                                                    var288 = Vectors.aref(var283, var287);
                                                    var265 = (SubLObject)ConsesLow.cons(var288, var265);
                                                }
                                            }
                                            else {
                                                var289 = var282;
                                                var290 = (SubLObject)NIL;
                                                var290 = var289.first();
                                                while (NIL != var289) {
                                                    var265 = (SubLObject)ConsesLow.cons(var290, var265);
                                                    var289 = var289.rest();
                                                    var290 = var289.first();
                                                }
                                            }
                                        }
                                        var304_309 = (SubLObject)makeBoolean(NIL == var307_311);
                                    }
                                }
                                finally {
                                    var291 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var276) {
                                            module0158.f10319(var276);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var291);
                                    }
                                }
                            }
                            var272 = (SubLObject)makeBoolean(NIL == var275);
                        }
                    }
                }
            }
        }
        return var265;
    }
    
    public static SubLObject f50623(final SubLObject var241) {
        if (NIL != module0226.f14800(var241)) {
            final SubLObject var242 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic188$), reader.bq_cons(var241, (SubLObject)$ic189$)), (SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic190$)));
            return f50600(var242, module0132.$g1555$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50624(final SubLObject var241) {
        if (NIL != module0226.f14797(var241)) {
            final SubLObject var242 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic188$)), (SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic191$)));
            return f50600(var242, module0132.$g1555$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50625(final SubLObject var241) {
        if (NIL != module0226.f14798(var241)) {
            final SubLObject var242 = reader.bq_cons((SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic188$), reader.bq_cons(var241, (SubLObject)$ic191$)), (SubLObject)$ic132$);
            return f50600(var242, module0132.$g1555$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50626(final SubLObject var241) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        SubLObject var243 = (SubLObject)NIL;
        if (NIL != module0226.f14795(var241)) {
            final SubLObject var244 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            if (NIL != module0269.f17720(var241)) {
                final SubLObject var245 = module0225.f14739(var241);
                if (NIL != var245) {
                    SubLObject var246;
                    SubLObject var247;
                    SubLObject var249;
                    SubLObject var248;
                    SubLObject var250;
                    SubLObject var251;
                    SubLObject var252;
                    SubLObject var253;
                    SubLObject var254;
                    SubLObject var255;
                    SubLObject var304_316;
                    SubLObject var305_317;
                    SubLObject var256;
                    SubLObject var307_318;
                    SubLObject var257;
                    SubLObject var258;
                    SubLObject var259;
                    for (var246 = (SubLObject)NIL, var246 = (SubLObject)ZERO_INTEGER; var246.numL(var245); var246 = Numbers.add(var246, (SubLObject)ONE_INTEGER)) {
                        var247 = module0048.f_1X(var246);
                        var248 = (var249 = module0226.f14903(var247, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        if (NIL != module0158.f10010(var241, (SubLObject)ONE_INTEGER, var249)) {
                            var250 = module0158.f10011(var241, (SubLObject)ONE_INTEGER, var249);
                            var251 = (SubLObject)NIL;
                            var252 = (SubLObject)NIL;
                            while (NIL == var251) {
                                var253 = module0052.f3695(var250, var252);
                                var254 = (SubLObject)makeBoolean(!var252.eql(var253));
                                if (NIL != var254) {
                                    var255 = (SubLObject)NIL;
                                    try {
                                        var255 = module0158.f10316(var253, (SubLObject)$ic8$, (SubLObject)$ic186$, (SubLObject)NIL);
                                        var304_316 = (SubLObject)NIL;
                                        var305_317 = (SubLObject)NIL;
                                        while (NIL == var304_316) {
                                            var256 = module0052.f3695(var255, var305_317);
                                            var307_318 = (SubLObject)makeBoolean(!var305_317.eql(var256));
                                            if (NIL != var307_318) {
                                                var257 = module0178.f11287(var256);
                                                if (NIL != module0173.f10955(var257)) {
                                                    var258 = module0178.f11335(var256);
                                                    module0084.f5762(var244, var257, var258);
                                                }
                                            }
                                            var304_316 = (SubLObject)makeBoolean(NIL == var307_318);
                                        }
                                    }
                                    finally {
                                        var259 = Threads.$is_thread_performing_cleanupP$.currentBinding(var242);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var242);
                                            if (NIL != var255) {
                                                module0158.f10319(var255);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var259, var242);
                                        }
                                    }
                                }
                                var251 = (SubLObject)makeBoolean(NIL == var254);
                            }
                        }
                    }
                }
            }
            SubLObject var260;
            for (var260 = module0066.f4838(module0067.f4891(var244)); NIL == module0066.f4841(var260); var260 = module0066.f4840(var260)) {
                var242.resetMultipleValues();
                final SubLObject var261 = module0066.f4839(var260);
                final SubLObject var262 = var242.secondMultipleValue();
                var242.resetMultipleValues();
                SubLObject var263 = (SubLObject)NIL;
                SubLObject var264 = module0256.f16529(var262, var261, (SubLObject)UNPROVIDED);
                SubLObject var265 = (SubLObject)NIL;
                var265 = var264.first();
                while (NIL != var264) {
                    var263 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic139$, (SubLObject)$ic164$, var265), var263);
                    var264 = var264.rest();
                    var265 = var264.first();
                }
                final SubLObject var266 = (SubLObject)ConsesLow.list(var263, (SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic192$)));
                final SubLObject var267 = f50600(var266, var261);
                if (var267.isVector()) {
                    final SubLObject var268 = var267;
                    final SubLObject var269 = (SubLObject)NIL;
                    SubLObject var270;
                    SubLObject var271;
                    SubLObject var272;
                    SubLObject var273;
                    for (var270 = Sequences.length(var268), var271 = (SubLObject)NIL, var271 = (SubLObject)ZERO_INTEGER; var271.numL(var270); var271 = Numbers.add(var271, (SubLObject)ONE_INTEGER)) {
                        var272 = ((NIL != var269) ? Numbers.subtract(var270, var271, (SubLObject)ONE_INTEGER) : var271);
                        var273 = Vectors.aref(var268, var272);
                        var243 = (SubLObject)ConsesLow.cons(var273, var243);
                    }
                }
                else {
                    SubLObject var274 = var267;
                    SubLObject var275 = (SubLObject)NIL;
                    var275 = var274.first();
                    while (NIL != var274) {
                        var243 = (SubLObject)ConsesLow.cons(var275, var243);
                        var274 = var274.rest();
                        var275 = var274.first();
                    }
                }
            }
            module0066.f4842(var260);
        }
        return var243;
    }
    
    public static SubLObject f50627(final SubLObject var241) {
        if (NIL != module0226.f14796(var241)) {
            final SubLObject var242 = reader.bq_cons((SubLObject)ConsesLow.list(reader.bq_cons(var241, (SubLObject)$ic192$)), (SubLObject)$ic132$);
            return f50600(var242, module0132.$g1555$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50628(final SubLObject var241) {
        SubLObject var242 = (SubLObject)NIL;
        if (NIL != module0318.f21440(var241)) {
            SubLObject var243 = $ic193$;
            if (NIL != module0158.f10010(var241, (SubLObject)ONE_INTEGER, var243)) {
                final SubLObject var244 = module0158.f10011(var241, (SubLObject)ONE_INTEGER, var243);
                SubLObject var245 = (SubLObject)NIL;
                final SubLObject var246 = (SubLObject)NIL;
                while (NIL == var245) {
                    final SubLObject var247 = module0052.f3695(var244, var246);
                    final SubLObject var248 = (SubLObject)makeBoolean(!var246.eql(var247));
                    if (NIL != var248) {
                        SubLObject var249 = (SubLObject)NIL;
                        try {
                            var249 = module0158.f10316(var247, (SubLObject)$ic8$, (SubLObject)$ic186$, (SubLObject)NIL);
                            SubLObject var304_323 = (SubLObject)NIL;
                            final SubLObject var305_324 = (SubLObject)NIL;
                            while (NIL == var304_323) {
                                final SubLObject var250 = module0052.f3695(var249, var305_324);
                                final SubLObject var307_325 = (SubLObject)makeBoolean(!var305_324.eql(var250));
                                if (NIL != var307_325) {
                                    final SubLObject var251 = f50634(var250);
                                    if (var251.isVector()) {
                                        final SubLObject var252 = var251;
                                        final SubLObject var253 = (SubLObject)NIL;
                                        SubLObject var254;
                                        SubLObject var255;
                                        SubLObject var256;
                                        SubLObject var257;
                                        for (var254 = Sequences.length(var252), var255 = (SubLObject)NIL, var255 = (SubLObject)ZERO_INTEGER; var255.numL(var254); var255 = Numbers.add(var255, (SubLObject)ONE_INTEGER)) {
                                            var256 = ((NIL != var253) ? Numbers.subtract(var254, var255, (SubLObject)ONE_INTEGER) : var255);
                                            var257 = Vectors.aref(var252, var256);
                                            var242 = (SubLObject)ConsesLow.cons(var257, var242);
                                        }
                                    }
                                    else {
                                        SubLObject var258 = var251;
                                        SubLObject var259 = (SubLObject)NIL;
                                        var259 = var258.first();
                                        while (NIL != var258) {
                                            var242 = (SubLObject)ConsesLow.cons(var259, var242);
                                            var258 = var258.rest();
                                            var259 = var258.first();
                                        }
                                    }
                                }
                                var304_323 = (SubLObject)makeBoolean(NIL == var307_325);
                            }
                        }
                        finally {
                            final SubLObject var260 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var249) {
                                    module0158.f10319(var249);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var260);
                            }
                        }
                    }
                    var245 = (SubLObject)makeBoolean(NIL == var248);
                }
            }
            var243 = $ic194$;
            if (NIL != module0158.f10010(var241, (SubLObject)ONE_INTEGER, var243)) {
                final SubLObject var244 = module0158.f10011(var241, (SubLObject)ONE_INTEGER, var243);
                SubLObject var245 = (SubLObject)NIL;
                final SubLObject var246 = (SubLObject)NIL;
                while (NIL == var245) {
                    final SubLObject var247 = module0052.f3695(var244, var246);
                    final SubLObject var248 = (SubLObject)makeBoolean(!var246.eql(var247));
                    if (NIL != var248) {
                        SubLObject var249 = (SubLObject)NIL;
                        try {
                            var249 = module0158.f10316(var247, (SubLObject)$ic8$, (SubLObject)$ic186$, (SubLObject)NIL);
                            SubLObject var304_324 = (SubLObject)NIL;
                            final SubLObject var305_325 = (SubLObject)NIL;
                            while (NIL == var304_324) {
                                final SubLObject var250 = module0052.f3695(var249, var305_325);
                                final SubLObject var307_326 = (SubLObject)makeBoolean(!var305_325.eql(var250));
                                if (NIL != var307_326) {
                                    final SubLObject var251 = f50634(var250);
                                    if (var251.isVector()) {
                                        final SubLObject var252 = var251;
                                        final SubLObject var253 = (SubLObject)NIL;
                                        SubLObject var254;
                                        SubLObject var255;
                                        SubLObject var256;
                                        SubLObject var257;
                                        for (var254 = Sequences.length(var252), var255 = (SubLObject)NIL, var255 = (SubLObject)ZERO_INTEGER; var255.numL(var254); var255 = Numbers.add(var255, (SubLObject)ONE_INTEGER)) {
                                            var256 = ((NIL != var253) ? Numbers.subtract(var254, var255, (SubLObject)ONE_INTEGER) : var255);
                                            var257 = Vectors.aref(var252, var256);
                                            var242 = (SubLObject)ConsesLow.cons(var257, var242);
                                        }
                                    }
                                    else {
                                        SubLObject var258 = var251;
                                        SubLObject var259 = (SubLObject)NIL;
                                        var259 = var258.first();
                                        while (NIL != var258) {
                                            var242 = (SubLObject)ConsesLow.cons(var259, var242);
                                            var258 = var258.rest();
                                            var259 = var258.first();
                                        }
                                    }
                                }
                                var304_324 = (SubLObject)makeBoolean(NIL == var307_326);
                            }
                        }
                        finally {
                            final SubLObject var261 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var249) {
                                    module0158.f10319(var249);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var261);
                            }
                        }
                    }
                    var245 = (SubLObject)makeBoolean(NIL == var248);
                }
            }
        }
        return var242;
    }
    
    public static SubLObject f50634(final SubLObject var329) {
        final SubLObject var330 = module0178.f11332(var329);
        final SubLObject var331 = module0178.f11334(var329);
        final SubLObject var332 = module0178.f11335(var329);
        final SubLObject var333 = module0178.f11336(var329);
        final SubLObject var334 = f50635(var331, var333);
        final SubLObject var335 = var330.eql($ic193$) ? reader.bq_cons(var332, (SubLObject)$ic195$) : reader.bq_cons(var332, (SubLObject)$ic196$);
        final SubLObject var336 = f50636(var331, var333);
        final SubLObject var337 = module0232.f15326((SubLObject)ConsesLow.list(var334, var335), (SubLObject)ConsesLow.list(var336));
        return f50600(var337, module0178.f11287(var329));
    }
    
    public static SubLObject f50635(final SubLObject var264, final SubLObject var300) {
        return f50637(var264, var300, (SubLObject)$ic197$);
    }
    
    public static SubLObject f50636(final SubLObject var264, final SubLObject var300) {
        return f50637(var264, var300, (SubLObject)$ic198$);
    }
    
    public static SubLObject f50637(final SubLObject var264, final SubLObject var300, final SubLObject var335) {
        return module0202.f12817(var300, var335, f50633(var264));
    }
    
    public static SubLObject f50633(final SubLObject var336) {
        SubLObject var337 = module0202.f12683(var336, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        SubLObject var338;
        SubLObject var339;
        SubLObject var340;
        SubLObject var341;
        for (var338 = module0225.f14739(var336), var339 = (SubLObject)NIL, var339 = (SubLObject)ZERO_INTEGER; var339.numL(var338); var339 = Numbers.add(var339, (SubLObject)ONE_INTEGER)) {
            var340 = module0048.f_1X(var339);
            var341 = module0201.f12550(Sequences.cconcatenate((SubLObject)$ic159$, module0038.f2638(var340)));
            var337 = (SubLObject)ConsesLow.cons(var341, var337);
        }
        return Sequences.nreverse(var337);
    }
    
    public static SubLObject f50629(final SubLObject var275) {
        if (NIL != module0225.f14739(var275)) {
            final SubLObject var276 = (SubLObject)ConsesLow.list($ic199$, f50633(var275), var275);
            return f50600(module0204.f13033(var276), $ic59$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50630(final SubLObject var275) {
        SubLObject var276 = (SubLObject)NIL;
        final SubLObject var277 = f50633(var275);
        final SubLObject var278 = module0225.f14739(var275);
        if (NIL != var278) {
            SubLObject var279;
            SubLObject var280;
            SubLObject var281;
            SubLObject var282;
            SubLObject var283;
            SubLObject var284;
            SubLObject var285;
            SubLObject var286;
            SubLObject var287;
            SubLObject var288;
            SubLObject var289;
            SubLObject var290;
            SubLObject var291;
            for (var279 = (SubLObject)NIL, var279 = (SubLObject)ZERO_INTEGER; var279.numL(var278); var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER)) {
                var280 = module0048.f_1X(var279);
                var281 = module0205.f13362(var277, var280, (SubLObject)UNPROVIDED);
                var282 = (SubLObject)ConsesLow.list($ic200$, var277, var280, var281);
                var283 = f50600(module0204.f13033(var282), $ic59$);
                if (var283.isVector()) {
                    var284 = var283;
                    var285 = (SubLObject)NIL;
                    for (var286 = Sequences.length(var284), var287 = (SubLObject)NIL, var287 = (SubLObject)ZERO_INTEGER; var287.numL(var286); var287 = Numbers.add(var287, (SubLObject)ONE_INTEGER)) {
                        var288 = ((NIL != var285) ? Numbers.subtract(var286, var287, (SubLObject)ONE_INTEGER) : var287);
                        var289 = Vectors.aref(var284, var288);
                        var276 = (SubLObject)ConsesLow.cons(var289, var276);
                    }
                }
                else {
                    var290 = var283;
                    var291 = (SubLObject)NIL;
                    var291 = var290.first();
                    while (NIL != var290) {
                        var276 = (SubLObject)ConsesLow.cons(var291, var276);
                        var290 = var290.rest();
                        var291 = var290.first();
                    }
                }
            }
        }
        return Sequences.nreverse(var276);
    }
    
    public static SubLObject f50631(final SubLObject var275) {
        SubLObject var276 = (SubLObject)NIL;
        final SubLObject var277 = f50633(var275);
        final SubLObject var278 = $ic147$;
        if (NIL != module0158.f10010(var275, (SubLObject)ONE_INTEGER, var278)) {
            final SubLObject var279 = module0158.f10011(var275, (SubLObject)ONE_INTEGER, var278);
            SubLObject var280 = (SubLObject)NIL;
            final SubLObject var281 = (SubLObject)NIL;
            while (NIL == var280) {
                final SubLObject var282 = module0052.f3695(var279, var281);
                final SubLObject var283 = (SubLObject)makeBoolean(!var281.eql(var282));
                if (NIL != var283) {
                    SubLObject var284 = (SubLObject)NIL;
                    try {
                        var284 = module0158.f10316(var282, (SubLObject)$ic8$, (SubLObject)$ic186$, (SubLObject)NIL);
                        SubLObject var304_343 = (SubLObject)NIL;
                        final SubLObject var305_344 = (SubLObject)NIL;
                        while (NIL == var304_343) {
                            final SubLObject var285 = module0052.f3695(var284, var305_344);
                            final SubLObject var307_345 = (SubLObject)makeBoolean(!var305_344.eql(var285));
                            if (NIL != var307_345) {
                                final SubLObject var286 = module0178.f11335(var285);
                                final SubLObject var287 = module0178.f11287(var285);
                                final SubLObject var288 = (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic139$, var277, var286)));
                                final SubLObject var289 = f50600(var288, var287);
                                if (var289.isVector()) {
                                    final SubLObject var290 = var289;
                                    final SubLObject var291 = (SubLObject)NIL;
                                    SubLObject var292;
                                    SubLObject var293;
                                    SubLObject var294;
                                    SubLObject var295;
                                    for (var292 = Sequences.length(var290), var293 = (SubLObject)NIL, var293 = (SubLObject)ZERO_INTEGER; var293.numL(var292); var293 = Numbers.add(var293, (SubLObject)ONE_INTEGER)) {
                                        var294 = ((NIL != var291) ? Numbers.subtract(var292, var293, (SubLObject)ONE_INTEGER) : var293);
                                        var295 = Vectors.aref(var290, var294);
                                        var276 = (SubLObject)ConsesLow.cons(var295, var276);
                                    }
                                }
                                else {
                                    SubLObject var296 = var289;
                                    SubLObject var297 = (SubLObject)NIL;
                                    var297 = var296.first();
                                    while (NIL != var296) {
                                        var276 = (SubLObject)ConsesLow.cons(var297, var276);
                                        var296 = var296.rest();
                                        var297 = var296.first();
                                    }
                                }
                            }
                            var304_343 = (SubLObject)makeBoolean(NIL == var307_345);
                        }
                    }
                    finally {
                        final SubLObject var298 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var284) {
                                module0158.f10319(var284);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var298);
                        }
                    }
                }
                var280 = (SubLObject)makeBoolean(NIL == var283);
            }
        }
        return Sequences.nreverse(var276);
    }
    
    public static SubLObject f50583(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        if ($g6315$.getDynamicValue(var347) == $ic201$) {
            return f50638(var346, var109, var37);
        }
        return f50639(var346, var109, var37);
    }
    
    public static SubLObject f50639(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        SubLObject var347 = (SubLObject)NIL;
        if (NIL != module0202.f12706(var346)) {
            var347 = ConsesLow.append(var347, (SubLObject)ConsesLow.list(f50603((SubLObject)$ic202$, module0202.f12706(var346))));
        }
        else {
            final SubLObject var349;
            final SubLObject var348 = var349 = module0205.f13333(var346);
            if (var349.eql($ic139$)) {
                var347 = f50640(var346, var109, var37);
            }
            else if (var349.eql($ic203$)) {
                var347 = f50641(var346);
            }
            else if (var349.eql($ic80$)) {
                var347 = f50642(var346);
            }
            else {
                var347 = f50643(var346, var109, var37);
            }
        }
        return var347;
    }
    
    public static SubLObject f50642(final SubLObject var346) {
        final SubLObject var347 = module0205.f13136(var346);
        final SubLObject var348 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
        final SubLObject var349 = f50644(var347, (SubLObject)$ic82$);
        final SubLObject var350 = f50645(var348);
        return module0202.f12720(var349, var350, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50641(final SubLObject var346) {
        final SubLObject var347 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
        final SubLObject var348 = Mapping.mapcar((SubLObject)$ic204$, var347);
        final SubLObject var349 = f50646($ic205$, (SubLObject)TWO_INTEGER);
        SubLObject var350 = (SubLObject)NIL;
        SubLObject var351 = module0035.f2492(var348);
        SubLObject var352 = (SubLObject)NIL;
        var352 = var351.first();
        while (NIL != var351) {
            SubLObject var354;
            final SubLObject var353 = var354 = var352;
            SubLObject var355 = (SubLObject)NIL;
            SubLObject var356 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var354, var353, (SubLObject)$ic206$);
            var355 = var354.first();
            var354 = var354.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var354, var353, (SubLObject)$ic206$);
            var356 = var354.first();
            var354 = var354.rest();
            if (NIL == var354) {
                final SubLObject var357 = module0205.f13338(module0202.f12768(var349, var355, var356));
                var350 = (SubLObject)ConsesLow.cons(var357, var350);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var353, (SubLObject)$ic206$);
            }
            var351 = var351.rest();
            var352 = var351.first();
        }
        return module0276.f18287(Sequences.nreverse(var350), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50643(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        if (var37.eql((SubLObject)$ic79$)) {
            final SubLObject var347 = module0205.f13136(var346);
            final SubLObject var348 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
            final SubLObject var349 = f50644(var347, var37);
            final SubLObject var350 = (SubLObject)ConsesLow.cons(f50647((SubLObject)$ic81$), f50645(var348));
            return module0202.f12720(var349, var350, (SubLObject)UNPROVIDED);
        }
        final SubLObject var347 = module0205.f13136(var346);
        final SubLObject var348 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
        final SubLObject var349 = f50644(var347, var37);
        final SubLObject var350 = f50645(var348);
        return module0202.f12720(var349, var350, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50640(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        final SubLObject var348 = $g6317$.getDynamicValue(var347);
        if (var348.eql((SubLObject)$ic207$)) {
            return f50648(var346, var109, var37);
        }
        if (var348.eql((SubLObject)$ic6$)) {
            SubLObject var349 = f50649(var346, var37);
            if (NIL != f50607(var349)) {
                var349 = f50648(var346, var109, var37);
            }
            return var349;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50648(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        return f50643(var346, var109, var37);
    }
    
    public static SubLObject f50649(final SubLObject var346, final SubLObject var37) {
        SubLObject var348;
        final SubLObject var347 = var348 = module0205.f13385(var346, (SubLObject)UNPROVIDED);
        SubLObject var349 = (SubLObject)NIL;
        SubLObject var350 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var348, var347, (SubLObject)$ic208$);
        var349 = var348.first();
        var348 = var348.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var348, var347, (SubLObject)$ic208$);
        var350 = var348.first();
        var348 = var348.rest();
        if (NIL != var348) {
            cdestructuring_bind.cdestructuring_bind_error(var347, (SubLObject)$ic208$);
            return (SubLObject)NIL;
        }
        if (var37.eql((SubLObject)$ic79$)) {
            final SubLObject var351 = f50650(var350, var37);
            final SubLObject var352 = (SubLObject)ConsesLow.list(f50647((SubLObject)$ic81$), f50621(var349));
            return module0202.f12720(var351, var352, (SubLObject)UNPROVIDED);
        }
        final SubLObject var351 = f50650(var350, var37);
        final SubLObject var353 = f50621(var349);
        return module0202.f12643(var351, var353);
    }
    
    public static SubLObject f50645(final SubLObject var242) {
        SubLObject var243 = (SubLObject)NIL;
        SubLObject var244 = var242;
        SubLObject var245 = (SubLObject)NIL;
        var245 = var244.first();
        while (NIL != var244) {
            var243 = (SubLObject)ConsesLow.cons(f50621(var245), var243);
            var244 = var244.rest();
            var245 = var244.first();
        }
        return Sequences.nreverse(var243);
    }
    
    public static SubLObject f50621(final SubLObject var278) {
        final SubLThread var279 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2169(var278, $g6321$.getGlobalValue())) {
            return f50603((SubLObject)$ic106$, var278);
        }
        if (NIL != constant_handles_oc.f8449(var278)) {
            return f50651(var278);
        }
        if (NIL != module0167.f10813(var278)) {
            final SubLObject var280 = module0172.f10915(var278);
            return f50621(var280);
        }
        if (NIL != module0193.f12067(var278)) {
            if (NIL != $g6333$.getDynamicValue(var279)) {
                final SubLObject var281 = module0178.f11352($g6333$.getDynamicValue(var279), var278);
                if (NIL != var281) {
                    return var281;
                }
            }
            return var278;
        }
        if (NIL != module0206.f13497(var278)) {
            return var278;
        }
        if (var278.isNumber()) {
            return f50652(var278);
        }
        if (var278.isString()) {
            return f50653(var278);
        }
        if (NIL != assertion_handles_oc.f11035(var278)) {
            return f50603((SubLObject)$ic209$, var278);
        }
        if (var278.isKeyword()) {
            return f50603((SubLObject)$ic210$, var278);
        }
        if (var278.isSymbol()) {
            return f50603((SubLObject)$ic154$, var278);
        }
        if (NIL == module0202.f12659(var278)) {
            return f50603((SubLObject)$ic156$, var278);
        }
        if (NIL != module0202.f12639(var278)) {
            return f50603((SubLObject)$ic211$, var278);
        }
        if (NIL != module0269.f17736(module0205.f13136(var278))) {
            return f50603((SubLObject)$ic212$, var278);
        }
        SubLObject var282 = (SubLObject)NIL;
        final SubLObject var283 = module0205.f13136(var278);
        final SubLObject var284 = module0205.f13207(var278, (SubLObject)UNPROVIDED);
        final SubLObject var285 = f50654(var283);
        final SubLObject var286 = f50645(var284);
        var282 = module0202.f12720(var285, var286, (SubLObject)UNPROVIDED);
        if (NIL != module0202.f12706(var278)) {
            var282 = ConsesLow.append(var282, (SubLObject)ConsesLow.list(f50603((SubLObject)$ic202$, module0202.f12706(var278))));
        }
        return var282;
    }
    
    public static SubLObject f50647(final SubLObject var278) {
        if (NIL != module0035.f2169(var278, $g6321$.getGlobalValue())) {
            return f50603((SubLObject)$ic106$, var278);
        }
        if (var278.isNumber()) {
            return f50603((SubLObject)$ic154$, var278);
        }
        if (var278.isString()) {
            return f50603((SubLObject)$ic154$, var278);
        }
        return f50621(var278);
    }
    
    public static SubLObject f50638(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        SubLObject var347 = (SubLObject)NIL;
        if (NIL != module0202.f12706(var346)) {
            var347 = ConsesLow.append(var347, (SubLObject)ConsesLow.list(f50603((SubLObject)$ic202$, module0202.f12706(var346))));
        }
        else {
            final SubLObject var349;
            final SubLObject var348 = var349 = module0205.f13333(var346);
            if (var349.eql($ic139$)) {
                var347 = f50655(var346, var109, var37);
            }
            else if (var349.eql($ic203$)) {
                var347 = f50656(var346);
            }
            else if (var349.eql($ic80$)) {
                var347 = f50657(var346);
            }
            else {
                var347 = f50658(var346, var109, var37);
            }
        }
        return var347;
    }
    
    public static SubLObject f50657(final SubLObject var346) {
        final SubLObject var347 = module0205.f13136(var346);
        final SubLObject var348 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
        final SubLObject var349 = f50659(var347, (SubLObject)$ic82$);
        final SubLObject var350 = f50660(var348);
        return module0202.f12720(var349, var350, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50658(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        if (var37.eql((SubLObject)$ic79$)) {
            final SubLObject var347 = module0205.f13136(var346);
            final SubLObject var348 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
            final SubLObject var349 = f50661(var347);
            final SubLObject var350 = (SubLObject)ConsesLow.cons(f50662((SubLObject)$ic81$), f50660(var348));
            return module0202.f12720(f50659($ic213$, var37), (SubLObject)ConsesLow.cons(var349, var350), (SubLObject)UNPROVIDED);
        }
        final SubLObject var347 = module0205.f13136(var346);
        final SubLObject var348 = module0205.f13207(var346, (SubLObject)UNPROVIDED);
        final SubLObject var349 = f50661(var347);
        final SubLObject var350 = f50660(var348);
        return module0202.f12720(f50659($ic213$, var37), (SubLObject)ConsesLow.cons(var349, var350), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50655(final SubLObject var346, final SubLObject var109, final SubLObject var37) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        final SubLObject var348 = $g6317$.getDynamicValue(var347);
        if (var348.eql((SubLObject)$ic207$)) {
            return f50658(var346, var109, var37);
        }
        if (var348.eql((SubLObject)$ic6$)) {
            SubLObject var350;
            final SubLObject var349 = var350 = module0205.f13385(var346, (SubLObject)UNPROVIDED);
            SubLObject var351 = (SubLObject)NIL;
            SubLObject var352 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic208$);
            var351 = var350.first();
            var350 = var350.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic208$);
            var352 = var350.first();
            var350 = var350.rest();
            if (NIL == var350) {
                if (var37.eql((SubLObject)$ic79$)) {
                    final SubLObject var353 = f50661(var352);
                    final SubLObject var354 = (SubLObject)ConsesLow.list(f50662((SubLObject)$ic81$), f50661(var351));
                    return module0202.f12720(f50659($ic213$, var37), (SubLObject)ConsesLow.cons(var353, var354), (SubLObject)UNPROVIDED);
                }
                final SubLObject var353 = f50661(var352);
                final SubLObject var355 = f50661(var351);
                return module0202.f12720(f50659($ic213$, var37), (SubLObject)ConsesLow.list(var353, var355), (SubLObject)UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var349, (SubLObject)$ic208$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50656(final SubLObject var346) {
        return f50641(var346);
    }
    
    public static SubLObject f50660(final SubLObject var242) {
        if (Sequences.length(var242).eql((SubLObject)ONE_INTEGER)) {
            return f50661(var242.first());
        }
        return module0202.f12768(f50663($ic214$), f50661(var242.first()), f50660(var242.rest()));
    }
    
    public static SubLObject f50663(final SubLObject var347) {
        return f50654(var347);
    }
    
    public static SubLObject f50661(final SubLObject var278) {
        return f50621(var278);
    }
    
    public static SubLObject f50662(final SubLObject var109) {
        return f50647(var109);
    }
    
    public static SubLObject f50659(final SubLObject var347, final SubLObject var37) {
        return f50646(var347, (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f50644(final SubLObject var347, final SubLObject var37) {
        if (NIL != module0035.f2169(var347, $g6321$.getGlobalValue())) {
            return f50603((SubLObject)$ic106$, var347);
        }
        if (var347.eql($ic83$)) {
            return f50646(var347, (SubLObject)ONE_INTEGER);
        }
        if (var347.eql($ic215$)) {
            return f50603((SubLObject)$ic216$, var347);
        }
        if (NIL != module0035.f2169(var347, (SubLObject)$ic217$)) {
            return var347;
        }
        if (NIL != module0173.f10955(var347)) {
            if (NIL == module0269.f17706(var347)) {
                return f50603((SubLObject)$ic218$, var347);
            }
            final SubLObject var348 = module0225.f14739(var347);
            if (!var348.isInteger()) {
                if (NIL != module0225.f14767(var347)) {
                    return f50603((SubLObject)$ic219$, var347);
                }
                return f50603((SubLObject)$ic220$, var347);
            }
            else {
                if (var37.eql((SubLObject)$ic79$)) {
                    return f50646(var347, Numbers.add(var348, (SubLObject)ONE_INTEGER));
                }
                return f50646(var347, var348);
            }
        }
        else {
            if (NIL == module0193.f12105(var347)) {
                return f50603((SubLObject)$ic221$, var347);
            }
            if (NIL != module0206.f13497(var347)) {
                return f50603((SubLObject)$ic221$, var347);
            }
            if (var347.isKeyword()) {
                return f50603((SubLObject)$ic210$, var347);
            }
            if (var347.isSymbol()) {
                return f50603((SubLObject)$ic154$, var347);
            }
            if (var347.isString()) {
                return f50603((SubLObject)$ic154$, var347);
            }
            if (NIL == module0202.f12659(var347)) {
                return f50603((SubLObject)$ic156$, var347);
            }
            if ($ic222$.eql(module0205.f13366(var347))) {
                return f50603((SubLObject)$ic223$, var347);
            }
            return f50603((SubLObject)$ic154$, var347);
        }
    }
    
    public static SubLObject f50650(final SubLObject var347, final SubLObject var37) {
        if (NIL != module0035.f2169(var347, $g6321$.getGlobalValue())) {
            return f50603((SubLObject)$ic106$, var347);
        }
        if (NIL != module0173.f10955(var347)) {
            if (NIL == module0269.f17705(var347)) {
                return f50603((SubLObject)$ic224$, var347);
            }
            if (var37.eql((SubLObject)$ic79$)) {
                return f50646(var347, (SubLObject)TWO_INTEGER);
            }
            return f50646(var347, (SubLObject)ONE_INTEGER);
        }
        else {
            if (NIL == module0193.f12105(var347)) {
                return f50603((SubLObject)$ic225$, var347);
            }
            if (NIL != module0206.f13497(var347)) {
                return f50603((SubLObject)$ic225$, var347);
            }
            if (NIL != module0202.f12659(var347) && NIL != module0269.f17726(module0205.f13136(var347))) {
                return f50603((SubLObject)$ic154$, var347);
            }
            if (var347.isKeyword()) {
                return f50603((SubLObject)$ic210$, var347);
            }
            if (var347.isSymbol()) {
                return f50603((SubLObject)$ic154$, var347);
            }
            if (var347.isString()) {
                return f50603((SubLObject)$ic154$, var347);
            }
            return f50603((SubLObject)$ic156$, var347);
        }
    }
    
    public static SubLObject f50654(final SubLObject var347) {
        if (NIL != module0035.f2169(var347, $g6321$.getGlobalValue())) {
            return f50603((SubLObject)$ic106$, var347);
        }
        if (var347.eql($ic214$)) {
            return f50664(var347, (SubLObject)TWO_INTEGER);
        }
        if (NIL != module0173.f10955(var347)) {
            if (NIL == module0269.f17708(var347)) {
                return f50603((SubLObject)$ic226$, var347);
            }
            if (NIL != module0269.f17794(var347)) {
                return f50603((SubLObject)$ic227$, var347);
            }
            final SubLObject var348 = module0225.f14739(var347);
            if (var348.isInteger()) {
                return f50664(var347, var348);
            }
            if (NIL != module0225.f14767(var347)) {
                return f50603((SubLObject)$ic228$, var347);
            }
            return f50603((SubLObject)$ic229$, var347);
        }
        else {
            if (NIL == module0193.f12105(var347)) {
                return f50603((SubLObject)$ic230$, var347);
            }
            if (NIL != module0206.f13497(var347)) {
                return f50603((SubLObject)$ic230$, var347);
            }
            if (var347.isKeyword()) {
                return f50603((SubLObject)$ic210$, var347);
            }
            if (var347.isSymbol()) {
                return f50603((SubLObject)$ic154$, var347);
            }
            if (var347.isString()) {
                return f50603((SubLObject)$ic154$, var347);
            }
            if (NIL == module0202.f12659(var347)) {
                return f50603((SubLObject)$ic156$, var347);
            }
            if ($ic231$.eql(module0205.f13366(var347))) {
                return f50603((SubLObject)$ic232$, var347);
            }
            return f50603((SubLObject)$ic154$, var347);
        }
    }
    
    public static SubLObject f50665(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f50666(var1) || NIL != f50667(var1));
    }
    
    public static SubLObject f50666(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f50668(var1) || NIL != f50669(var1) || NIL != f50670(var1) || NIL != f50671(var1) || NIL != f50672(var1));
    }
    
    public static SubLObject f50667(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f50673(var1) || NIL != f50674(var1));
    }
    
    public static SubLObject f50651(final SubLObject var1) {
        return module0202.f12643($ic233$, var1);
    }
    
    public static SubLObject f50668(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic233$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50646(final SubLObject var1, final SubLObject var249) {
        assert NIL != Types.integerp(var249) : var249;
        return module0202.f12768($ic165$, var1, var249);
    }
    
    public static SubLObject f50671(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic165$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50664(final SubLObject var1, final SubLObject var249) {
        assert NIL != Types.integerp(var249) : var249;
        return module0202.f12768($ic235$, var1, var249);
    }
    
    public static SubLObject f50672(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic235$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50675(final SubLObject var1) {
        return module0205.f13204(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50653(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var3 = $g6319$.getDynamicValue(var2);
        if (var3.eql((SubLObject)$ic10$)) {
            return module0202.f12643($ic236$, var1);
        }
        if (var3.eql((SubLObject)$ic237$)) {
            return module0202.f12643($ic238$, var1);
        }
        if (var3.eql((SubLObject)$ic239$)) {
            return f50651($ic240$);
        }
        return Errors.error((SubLObject)$ic241$, $g6319$.getDynamicValue(var2));
    }
    
    public static SubLObject f50673(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic236$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50669(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic238$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50652(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != Types.numberp(var1) : var1;
        final SubLObject var3 = $g6320$.getDynamicValue(var2);
        if (var3.eql((SubLObject)$ic10$)) {
            return module0202.f12643($ic243$, var1);
        }
        if (var3.eql((SubLObject)$ic12$)) {
            if (var1.isDouble()) {
                return module0202.f12643($ic244$, var1);
            }
            return module0202.f12643($ic243$, var1);
        }
        else {
            if (var3.eql((SubLObject)$ic245$)) {
                return module0202.f12643($ic244$, var1);
            }
            return Errors.error((SubLObject)$ic246$, $g6320$.getDynamicValue(var2));
        }
    }
    
    public static SubLObject f50674(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic243$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50670(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && $ic244$.eql(module0205.f13136(var1)));
    }
    
    public static SubLObject f50676(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f50677(var1) && NIL != f50678(var1));
    }
    
    public static SubLObject f50677(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var1) && NIL != f50671(module0205.f13136(var1)));
    }
    
    public static SubLObject f50678(final SubLObject var367) {
        return (SubLObject)makeBoolean(NIL != module0202.f12689(var367, Symbols.symbol_function((SubLObject)$ic247$)) || NIL != module0202.f12692(f50679(var367), Symbols.symbol_function((SubLObject)$ic247$)));
    }
    
    public static SubLObject f50680(final SubLObject var9, final SubLObject var140) {
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = var9;
        SubLObject var143 = (SubLObject)NIL;
        var143 = var142.first();
        while (NIL != var142) {
            final SubLObject var144 = conses_high.second(var143);
            if (NIL != module0035.f2428(var140, var144, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var141 = (SubLObject)ConsesLow.cons(var143, var141);
            }
            var142 = var142.rest();
            var143 = var142.first();
        }
        return Sequences.nreverse(var141);
    }
    
    public static SubLObject f50681(final SubLObject var11) {
        return f50682(f50554(var11));
    }
    
    public static SubLObject f50682(final SubLObject var369) {
        SubLObject var370 = (SubLObject)NIL;
        SubLObject var371 = (SubLObject)NIL;
        SubLObject var372 = var369;
        SubLObject var373 = (SubLObject)NIL;
        var373 = var372.first();
        while (NIL != var372) {
            SubLObject var375;
            final SubLObject var374 = var375 = f50683(var373);
            SubLObject var376 = (SubLObject)NIL;
            SubLObject var377 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var375, var374, (SubLObject)$ic248$);
            var376 = var375.first();
            var375 = var375.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var375, var374, (SubLObject)$ic248$);
            var377 = var375.first();
            var375 = var375.rest();
            if (NIL == var375) {
                var370 = ConsesLow.append(var376, var370);
                var371 = ConsesLow.append(var377, var371);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var374, (SubLObject)$ic248$);
            }
            var372 = var372.rest();
            var373 = var372.first();
        }
        return (SubLObject)ConsesLow.list(module0035.f2269(var370, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0035.f2269(var371, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50683(final SubLObject var372) {
        SubLObject var373 = (SubLObject)NIL;
        SubLObject var374 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var372, var372, (SubLObject)$ic74$);
        var373 = var372.first();
        SubLObject var375 = var372.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var375, var372, (SubLObject)$ic74$);
        var374 = var375.first();
        var375 = var375.rest();
        final SubLObject var376 = (SubLObject)(var375.isCons() ? var375.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var375, var372, (SubLObject)$ic74$);
        var375 = var375.rest();
        if (NIL == var375) {
            return f50684(var374, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var372, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50684(final SubLObject var100, SubLObject var379) {
        if (var379 == UNPROVIDED) {
            var379 = (SubLObject)NIL;
        }
        SubLObject var380 = (SubLObject)NIL;
        SubLObject var381 = (SubLObject)NIL;
        SubLObject var382 = var100;
        SubLObject var383 = (SubLObject)NIL;
        var383 = var382.first();
        while (NIL != var382) {
            SubLObject var385;
            final SubLObject var384 = var385 = f50685(var383, var379);
            SubLObject var386 = (SubLObject)NIL;
            SubLObject var387 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var385, var384, (SubLObject)$ic248$);
            var386 = var385.first();
            var385 = var385.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var385, var384, (SubLObject)$ic248$);
            var387 = var385.first();
            var385 = var385.rest();
            if (NIL == var385) {
                var380 = ConsesLow.append(var386, var380);
                var381 = ConsesLow.append(var387, var381);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var384, (SubLObject)$ic248$);
            }
            var382 = var382.rest();
            var383 = var382.first();
        }
        return (SubLObject)ConsesLow.list(module0035.f2269(var380, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0035.f2269(var381, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f50685(final SubLObject var380, final SubLObject var379) {
        if (NIL != var379) {
            SubLObject var381 = (SubLObject)NIL;
            SubLObject var382 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var380, var380, (SubLObject)$ic249$);
            var381 = var380.first();
            final SubLObject var383 = var382 = var380.rest();
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var381), var382);
        }
        final SubLObject var384 = module0035.f2259(Symbols.symbol_function((SubLObject)$ic250$), var380, (SubLObject)UNPROVIDED);
        return f50684(var384, (SubLObject)T);
    }
    
    public static SubLObject f50563(final SubLObject var122, final SubLObject var54, final SubLObject var125) {
        if (var54.eql((SubLObject)$ic28$)) {
            return f50686(var122, var125);
        }
        if (var54.eql((SubLObject)$ic71$)) {
            return f50687(var122, var125);
        }
        return Errors.error((SubLObject)$ic72$, var54);
    }
    
    public static SubLObject f50597(final SubLObject var105, final SubLObject var54, final SubLObject var125) {
        if (var54.eql((SubLObject)$ic28$)) {
            return f50688(var105, var125);
        }
        if (var54.eql((SubLObject)$ic71$)) {
            return f50689(var105, var125);
        }
        return Errors.error((SubLObject)$ic72$, var54);
    }
    
    public static SubLObject f50579(final SubLObject var122, final SubLObject var125) {
        final SubLObject var126 = f50555(var122);
        f50687(var126, var125);
        SubLObject var128;
        final SubLObject var127 = var128 = f50554(var122);
        SubLObject var129 = (SubLObject)NIL;
        var129 = var128.first();
        while (NIL != var128) {
            f50689(var129, var125);
            var128 = var128.rest();
            var129 = var128.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50687(final SubLObject var11, final SubLObject var125) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50689(final SubLObject var105, final SubLObject var125) {
        SubLObject var126 = (SubLObject)NIL;
        SubLObject var127 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var105, var105, (SubLObject)$ic74$);
        var126 = var105.first();
        SubLObject var128 = var105.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var128, var105, (SubLObject)$ic74$);
        var127 = var128.first();
        var128 = var128.rest();
        final SubLObject var129 = (SubLObject)(var128.isCons() ? var128.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var128, var105, (SubLObject)$ic74$);
        var128 = var128.rest();
        if (NIL == var128) {
            if (NIL != assertion_handles_oc.f11035(var126)) {
                final SubLObject var130 = var126;
                PrintLow.format(var125, (SubLObject)$ic251$, assertion_handles_oc.f11025(var130));
                SubLObject var131 = var127;
                SubLObject var132 = (SubLObject)NIL;
                var132 = var131.first();
                while (NIL != var131) {
                    module0194.f12114(var132, var125, (SubLObject)ZERO_INTEGER);
                    var131 = var131.rest();
                    var132 = var131.first();
                }
            }
            else if (NIL != module0173.f10955(var126)) {
                final SubLObject var133 = var126;
                PrintLow.format(var125, (SubLObject)$ic251$, var133);
                SubLObject var131 = var127;
                SubLObject var132 = (SubLObject)NIL;
                var132 = var131.first();
                while (NIL != var131) {
                    module0194.f12114(var132, var125, (SubLObject)ZERO_INTEGER);
                    var131 = var131.rest();
                    var132 = var131.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var105, (SubLObject)$ic74$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50585(final SubLObject var186, final SubLObject var122, final SubLObject var125) {
        PrintLow.format(var125, (SubLObject)$ic252$);
        module0194.f12114(var186, var125, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50690(final SubLObject var17, final SubLObject var125) {
        final SubLObject var126 = f50558(var17, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        return f50580(var126, var125);
    }
    
    public static SubLObject f50580(final SubLObject var122, final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        f50686(var122, var125);
        final SubLObject var127 = $g6326$.currentBinding(var126);
        try {
            $g6326$.bind((SubLObject)ZERO_INTEGER, var126);
            SubLObject var129;
            final SubLObject var128 = var129 = f50554(var122);
            SubLObject var130 = (SubLObject)NIL;
            var130 = var129.first();
            while (NIL != var129) {
                f50688(var130, var125);
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        finally {
            $g6326$.rebind(var127, var126);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50686(final SubLObject var122, final SubLObject var125) {
        final SubLObject var126 = f50555(var122);
        final SubLObject var127 = f50691(var126);
        print_high.princ(var127, var125);
        return var125;
    }
    
    public static SubLObject f50688(final SubLObject var105, final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)NIL;
        SubLObject var128 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var105, var105, (SubLObject)$ic74$);
        var127 = var105.first();
        SubLObject var129 = var105.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var129, var105, (SubLObject)$ic74$);
        var128 = var129.first();
        var129 = var129.rest();
        final SubLObject var130 = (SubLObject)(var129.isCons() ? var129.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var129, var105, (SubLObject)$ic74$);
        var129 = var129.rest();
        if (NIL == var129) {
            if (NIL != var128) {
                f50692(var127, var125);
            }
            SubLObject var131 = var128;
            SubLObject var132 = (SubLObject)NIL;
            var132 = var131.first();
            while (NIL != var131) {
                $g6326$.setDynamicValue(Numbers.add($g6326$.getDynamicValue(var126), (SubLObject)ONE_INTEGER), var126);
                f50693(var125, var132, $g6326$.getDynamicValue(var126));
                var131 = var131.rest();
                var132 = var131.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var105, (SubLObject)$ic74$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50692(final SubLObject var140, final SubLObject var125) {
        if (NIL != assertion_handles_oc.f11035(var140)) {
            PrintLow.format(var125, (SubLObject)$ic253$, assertion_handles_oc.f11025(var140));
        }
        else if (NIL != module0167.f10813(var140)) {
            PrintLow.format(var125, (SubLObject)$ic254$, module0167.f10803(var140));
        }
        else if (NIL != constant_handles_oc.f8449(var140)) {
            PrintLow.format(var125, (SubLObject)$ic255$, constants_high_oc.f10749(var140));
        }
        else if (NIL != module0202.f12661(var140)) {
            PrintLow.format(var125, (SubLObject)$ic256$, var140);
        }
        else {
            Errors.error((SubLObject)$ic257$, var140);
        }
        return var125;
    }
    
    public static SubLObject f50586(final SubLObject var186, final SubLObject var122, final SubLObject var125) {
        final SubLObject var187 = f50694(var122);
        f50695(var125, var186, var187);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50691(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = conses_high.getf(var16, (SubLObject)$ic45$, (SubLObject)UNPROVIDED);
        if (NIL != var18) {
            return var18;
        }
        final SubLObject var19 = print_high.$print_pretty$.currentBinding(var17);
        final SubLObject var20 = print_high.$print_length$.currentBinding(var17);
        final SubLObject var21 = print_high.$print_level$.currentBinding(var17);
        try {
            print_high.$print_pretty$.bind((SubLObject)NIL, var17);
            print_high.$print_length$.bind((SubLObject)NIL, var17);
            print_high.$print_level$.bind((SubLObject)NIL, var17);
            var18 = (SubLObject)$ic258$;
            var18 = f50696(var18, (SubLObject)$ic259$, (SubLObject)$ic260$);
            var18 = f50696(var18, (SubLObject)$ic261$, (SubLObject)$ic262$);
            var18 = f50696(var18, (SubLObject)$ic263$, (SubLObject)$ic264$);
            var18 = f50696(var18, (SubLObject)$ic265$, f50697(var16));
            var18 = f50696(var18, (SubLObject)$ic266$, (SubLObject)$ic267$);
            var18 = f50698(var18);
            var18 = f50698(var18);
            var18 = f50696(var18, (SubLObject)$ic268$, (SubLObject)$ic269$);
            var18 = f50696(var18, (SubLObject)$ic270$, (SubLObject)$ic269$);
            var18 = f50696(var18, (SubLObject)$ic271$, (SubLObject)$ic269$);
            var18 = f50696(var18, (SubLObject)$ic272$, (SubLObject)$ic273$);
            var18 = f50696(var18, (SubLObject)$ic274$, (SubLObject)$ic275$);
            var18 = f50696(var18, (SubLObject)$ic276$, (SubLObject)$ic277$);
            var18 = f50696(var18, (SubLObject)$ic278$, (SubLObject)$ic279$);
            var18 = f50696(var18, (SubLObject)$ic280$, (SubLObject)$ic269$);
            var18 = Sequences.cconcatenate(var18, (SubLObject)$ic281$);
            return var18;
        }
        finally {
            print_high.$print_level$.rebind(var21, var17);
            print_high.$print_length$.rebind(var20, var17);
            print_high.$print_pretty$.rebind(var19, var17);
        }
    }
    
    public static SubLObject f50696(final SubLObject var56, final SubLObject var392, final SubLObject var393) {
        return Sequences.cconcatenate(var56, new SubLObject[] { $ic283$, var392, $ic284$, var393, $ic285$ });
    }
    
    public static SubLObject f50698(final SubLObject var56) {
        return Sequences.cconcatenate(var56, (SubLObject)$ic286$);
    }
    
    public static SubLObject f50697(final SubLObject var16) {
        return Sequences.cconcatenate($g6314$.getGlobalValue(), new SubLObject[] { $ic287$, module0006.f204(module0035.f2329(var16, (SubLObject)$ic288$)) });
    }
    
    public static SubLObject f50699(final SubLObject var394) {
        return (SubLObject)makeBoolean(var394 != $ic26$);
    }
    
    public static SubLObject f50700() {
        final SubLObject var276 = $g6335$.getGlobalValue();
        if (NIL != var276) {
            module0034.f1818(var276);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50701(final SubLObject var122) {
        return module0034.f1829($g6335$.getGlobalValue(), (SubLObject)ConsesLow.list(var122), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50702(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (NIL != $g6324$.getDynamicValue(var123)) {
            return $g6324$.getDynamicValue(var123);
        }
        final SubLObject var124 = f50554(var122);
        SubLObject var125 = (SubLObject)ZERO_INTEGER;
        SubLObject var126 = var124;
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            SubLObject var128;
            final SubLObject var395_396 = var128 = var127;
            SubLObject var129 = (SubLObject)NIL;
            SubLObject var130 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var128, var395_396, (SubLObject)$ic74$);
            var129 = var128.first();
            var128 = var128.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var128, var395_396, (SubLObject)$ic74$);
            var130 = var128.first();
            var128 = var128.rest();
            final SubLObject var131 = (SubLObject)(var128.isCons() ? var128.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var128, var395_396, (SubLObject)$ic74$);
            var128 = var128.rest();
            if (NIL == var128) {
                var125 = Numbers.add(var125, Sequences.length(var130));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var395_396, (SubLObject)$ic74$);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return module0048.f_1X(var125);
    }
    
    public static SubLObject f50694(final SubLObject var122) {
        SubLObject var123 = $g6335$.getGlobalValue();
        if (NIL == var123) {
            var123 = module0034.f1934((SubLObject)$ic289$, (SubLObject)$ic290$, (SubLObject)ONE_INTEGER, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var124 = module0034.f1814(var123, var122, (SubLObject)$ic161$);
        if (var124 == $ic161$) {
            var124 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50702(var122)));
            module0034.f1816(var123, var122, var124, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var124);
    }
    
    public static SubLObject f50693(final SubLObject var125, final SubLObject var367, final SubLObject var277) {
        f50703(var125, var367, var277);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50695(final SubLObject var125, final SubLObject var367, final SubLObject var277) {
        f50704(var125, var367, var277);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50703(final SubLObject var125, final SubLObject var179, final SubLObject var277) {
        final SubLObject var278 = module0202.f12910(var179);
        PrintLow.format(var125, (SubLObject)$ic291$, f50705(var277));
        f50706(var125, var278);
        PrintLow.format(var125, (SubLObject)$ic292$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50705(final SubLObject var277) {
        final SubLThread var278 = SubLProcess.currentSubLThread();
        if (NIL != $g6325$.getDynamicValue(var278)) {
            return Sequences.cconcatenate($g6325$.getDynamicValue(var278), module0038.f2638(var277));
        }
        return var277;
    }
    
    public static SubLObject f50704(final SubLObject var125, final SubLObject var186, final SubLObject var277) {
        final SubLObject var278 = module0202.f12913(var186);
        PrintLow.format(var125, (SubLObject)$ic293$, var277);
        f50706(var125, var278);
        PrintLow.format(var125, (SubLObject)$ic292$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50706(final SubLObject var125, final SubLObject var179) {
        SubLObject var180 = (SubLObject)NIL;
        SubLObject var181 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var179, var179, (SubLObject)$ic294$);
        var180 = var179.first();
        final SubLObject var182 = var181 = var179.rest();
        final SubLObject var183 = var180;
        if (var183.eql($ic168$)) {
            SubLObject var404_405;
            final SubLObject var402_403 = var404_405 = var181;
            SubLObject var184 = (SubLObject)NIL;
            SubLObject var185 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var404_405, var402_403, (SubLObject)$ic295$);
            var184 = var404_405.first();
            var404_405 = var404_405.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var404_405, var402_403, (SubLObject)$ic295$);
            var185 = var404_405.first();
            var404_405 = var404_405.rest();
            if (NIL == var404_405) {
                print_high.princ((SubLObject)$ic296$, var125);
                f50706(var125, var184);
                print_high.princ((SubLObject)$ic297$, var125);
                f50706(var125, var185);
                print_high.princ((SubLObject)$ic298$, var125);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var402_403, (SubLObject)$ic295$);
            }
        }
        else if (var183.eql($ic299$)) {
            print_high.princ((SubLObject)$ic296$, var125);
            f50706(var125, var181.first());
            SubLObject var186 = var181.rest();
            SubLObject var187 = (SubLObject)NIL;
            var187 = var186.first();
            while (NIL != var186) {
                print_high.princ((SubLObject)$ic300$, var125);
                f50706(var125, var187);
                var186 = var186.rest();
                var187 = var186.first();
            }
            print_high.princ((SubLObject)$ic298$, var125);
        }
        else if (var183.eql($ic301$)) {
            print_high.princ((SubLObject)$ic296$, var125);
            f50706(var125, var181.first());
            SubLObject var186 = var181.rest();
            SubLObject var188 = (SubLObject)NIL;
            var188 = var186.first();
            while (NIL != var186) {
                print_high.princ((SubLObject)$ic302$, var125);
                f50706(var125, var188);
                var186 = var186.rest();
                var188 = var186.first();
            }
            print_high.princ((SubLObject)$ic298$, var125);
        }
        else if (var183.eql($ic303$)) {
            print_high.princ((SubLObject)$ic304$, var125);
            f50706(var125, var181.first());
            print_high.princ((SubLObject)$ic298$, var125);
        }
        else if (var183.eql($ic305$)) {
            SubLObject var412_413;
            final SubLObject var410_411 = var412_413 = var181;
            SubLObject var189 = (SubLObject)NIL;
            SubLObject var190 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var412_413, var410_411, (SubLObject)$ic306$);
            var189 = var412_413.first();
            var412_413 = var412_413.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var412_413, var410_411, (SubLObject)$ic306$);
            var190 = var412_413.first();
            var412_413 = var412_413.rest();
            if (NIL == var412_413) {
                PrintLow.format(var125, (SubLObject)$ic307$, f50707(var189));
                f50706(var125, var190);
                print_high.princ((SubLObject)$ic298$, var125);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var410_411, (SubLObject)$ic306$);
            }
        }
        else if (var183.eql($ic308$)) {
            SubLObject var417_418;
            final SubLObject var415_416 = var417_418 = var181;
            SubLObject var189 = (SubLObject)NIL;
            SubLObject var190 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var417_418, var415_416, (SubLObject)$ic306$);
            var189 = var417_418.first();
            var417_418 = var417_418.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var417_418, var415_416, (SubLObject)$ic306$);
            var190 = var417_418.first();
            var417_418 = var417_418.rest();
            if (NIL == var417_418) {
                PrintLow.format(var125, (SubLObject)$ic309$, f50707(var189));
                f50706(var125, var190);
                print_high.princ((SubLObject)$ic298$, var125);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var415_416, (SubLObject)$ic306$);
            }
        }
        else if (var183.eql($ic205$) || var183.eql($ic310$)) {
            SubLObject var421_422;
            final SubLObject var419_420 = var421_422 = var181;
            SubLObject var191 = (SubLObject)NIL;
            SubLObject var192 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var421_422, var419_420, (SubLObject)$ic130$);
            var191 = var421_422.first();
            var421_422 = var421_422.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var421_422, var419_420, (SubLObject)$ic130$);
            var192 = var421_422.first();
            var421_422 = var421_422.rest();
            if (NIL == var421_422) {
                print_high.princ((SubLObject)$ic296$, var125);
                f50708(var125, var191);
                print_high.princ((SubLObject)$ic311$, var125);
                f50708(var125, var192);
                print_high.princ((SubLObject)$ic298$, var125);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var419_420, (SubLObject)$ic130$);
            }
        }
        else {
            print_high.princ((SubLObject)$ic296$, var125);
            f50709(var125, var180);
            print_high.princ((SubLObject)$ic296$, var125);
            f50708(var125, var181.first());
            SubLObject var186 = var181.rest();
            SubLObject var193 = (SubLObject)NIL;
            var193 = var186.first();
            while (NIL != var186) {
                print_high.princ((SubLObject)$ic312$, var125);
                f50708(var125, var193);
                var186 = var186.rest();
                var193 = var186.first();
            }
            print_high.princ((SubLObject)$ic313$, var125);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50708(final SubLObject var125, final SubLObject var1) {
        if (NIL != f50672(var1)) {
            return f50710(var125, var1);
        }
        if (NIL != f50668(var1)) {
            return f50711(var125, var1);
        }
        if (NIL != f50669(var1)) {
            return f50712(var125, var1);
        }
        if (NIL != f50673(var1)) {
            return f50713(var125, var1);
        }
        if (NIL != f50670(var1)) {
            return f50714(var125, var1);
        }
        if (NIL != f50674(var1)) {
            return f50715(var125, var1);
        }
        if (NIL != module0206.f13497(var1)) {
            return f50716(var125, var1);
        }
        if (NIL != module0202.f12659(var1)) {
            return f50717(var125, var1);
        }
        return Errors.error((SubLObject)$ic314$, var1);
    }
    
    public static SubLObject f50717(final SubLObject var125, final SubLObject var423) {
        SubLObject var424 = (SubLObject)NIL;
        SubLObject var425 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var423, var423, (SubLObject)$ic315$);
        var424 = var423.first();
        final SubLObject var426 = var425 = var423.rest();
        final SubLObject var427 = f50675(var424);
        if (var427.isZero()) {
            f50718(var125, var424);
        }
        else {
            f50710(var125, var424);
            print_high.princ((SubLObject)$ic296$, var125);
            if (NIL != var425) {
                f50708(var125, var425.first());
            }
            SubLObject var428 = var425.rest();
            SubLObject var429 = (SubLObject)NIL;
            var429 = var428.first();
            while (NIL != var428) {
                print_high.princ((SubLObject)$ic312$, var125);
                f50708(var125, var429);
                var428 = var428.rest();
                var429 = var428.first();
            }
            print_high.princ((SubLObject)$ic298$, var125);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50709(final SubLObject var125, final SubLObject var348) {
        final SubLThread var349 = SubLProcess.currentSubLThread();
        SubLObject var350 = (SubLObject)NIL;
        SubLObject var351 = (SubLObject)NIL;
        SubLObject var352 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var348, var348, (SubLObject)$ic316$);
        var350 = var348.first();
        SubLObject var353 = var348.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var348, (SubLObject)$ic316$);
        var351 = var353.first();
        var353 = var353.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var353, var348, (SubLObject)$ic316$);
        var352 = var353.first();
        var353 = var353.rest();
        if (NIL == var353) {
            if ($g6315$.getDynamicValue(var349) == $ic201$) {
                print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic317$, module0038.f2638(var351))), var125);
            }
            else {
                print_high.princ(f50719(module0038.f2638(var351)), var125);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var348, (SubLObject)$ic316$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50710(final SubLObject var125, final SubLObject var360) {
        final SubLThread var361 = SubLProcess.currentSubLThread();
        SubLObject var362 = (SubLObject)NIL;
        SubLObject var363 = (SubLObject)NIL;
        SubLObject var364 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var360, var360, (SubLObject)$ic318$);
        var362 = var360.first();
        SubLObject var365 = var360.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var365, var360, (SubLObject)$ic318$);
        var363 = var365.first();
        var365 = var365.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var365, var360, (SubLObject)$ic318$);
        var364 = var365.first();
        var365 = var365.rest();
        if (NIL == var365) {
            if ($g6315$.getDynamicValue(var361) == $ic201$) {
                print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic319$, module0038.f2638(var363))), var125);
            }
            else {
                print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic319$, module0038.f2638(var363))), var125);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var360, (SubLObject)$ic318$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50718(final SubLObject var125, final SubLObject var360) {
        final SubLThread var361 = SubLProcess.currentSubLThread();
        SubLObject var362 = (SubLObject)NIL;
        SubLObject var363 = (SubLObject)NIL;
        SubLObject var364 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var360, var360, (SubLObject)$ic318$);
        var362 = var360.first();
        SubLObject var365 = var360.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var365, var360, (SubLObject)$ic318$);
        var363 = var365.first();
        var365 = var365.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var365, var360, (SubLObject)$ic318$);
        var364 = var365.first();
        var365 = var365.rest();
        if (NIL == var365) {
            if ($g6315$.getDynamicValue(var361) == $ic201$) {
                print_high.princ(f50719(module0038.f2638(var363)), var125);
            }
            else {
                print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic320$, module0038.f2638(var363))), var125);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var360, (SubLObject)$ic318$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50711(final SubLObject var125, final SubLObject var436) {
        final SubLThread var437 = SubLProcess.currentSubLThread();
        SubLObject var438 = (SubLObject)NIL;
        SubLObject var439 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var436, var436, (SubLObject)$ic321$);
        var438 = var436.first();
        SubLObject var440 = var436.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var440, var436, (SubLObject)$ic321$);
        var439 = var440.first();
        var440 = var440.rest();
        if (NIL == var440) {
            if ($g6315$.getDynamicValue(var437) == $ic201$) {
                print_high.princ(f50719(constants_high_oc.f10743(var439)), var125);
            }
            else {
                print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic322$, constants_high_oc.f10743(var439))), var125);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var436, (SubLObject)$ic321$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50712(final SubLObject var125, final SubLObject var441) {
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var441, var441, (SubLObject)$ic323$);
        var442 = var441.first();
        SubLObject var444 = var441.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var444, var441, (SubLObject)$ic323$);
        var443 = var444.first();
        var444 = var444.rest();
        if (NIL == var444) {
            print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic324$, var443)), var125);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var441, (SubLObject)$ic323$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50713(final SubLObject var125, final SubLObject var441) {
        SubLObject var442 = (SubLObject)NIL;
        SubLObject var443 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var441, var441, (SubLObject)$ic325$);
        var442 = var441.first();
        SubLObject var444 = var441.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var444, var441, (SubLObject)$ic325$);
        var443 = var444.first();
        var444 = var444.rest();
        if (NIL == var444) {
            print_high.princ((SubLObject)$ic326$, var125);
            print_high.princ(f50720(var443), var125);
            print_high.princ((SubLObject)$ic326$, var125);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var441, (SubLObject)$ic325$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50714(final SubLObject var125, final SubLObject var449) {
        final SubLThread var450 = SubLProcess.currentSubLThread();
        SubLObject var451 = (SubLObject)NIL;
        SubLObject var452 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var449, var449, (SubLObject)$ic327$);
        var451 = var449.first();
        SubLObject var453 = var449.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var453, var449, (SubLObject)$ic327$);
        var452 = var453.first();
        var453 = var453.rest();
        if (NIL == var453) {
            final SubLObject var454 = reader.$read_default_float_format$.currentBinding(var450);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic328$, var450);
                print_high.princ(f50719(Sequences.cconcatenate((SubLObject)$ic329$, module0006.f203(var452))), var125);
            }
            finally {
                reader.$read_default_float_format$.rebind(var454, var450);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var449, (SubLObject)$ic327$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50715(final SubLObject var125, final SubLObject var449) {
        final SubLThread var450 = SubLProcess.currentSubLThread();
        SubLObject var451 = (SubLObject)NIL;
        SubLObject var452 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var449, var449, (SubLObject)$ic330$);
        var451 = var449.first();
        SubLObject var453 = var449.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var453, var449, (SubLObject)$ic330$);
        var452 = var453.first();
        var453 = var453.rest();
        if (NIL == var453) {
            final SubLObject var454 = reader.$read_default_float_format$.currentBinding(var450);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic328$, var450);
                print_high.princ(f50721(module0006.f202(var452)), var125);
            }
            finally {
                reader.$read_default_float_format$.rebind(var454, var450);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var449, (SubLObject)$ic330$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50716(final SubLObject var125, final SubLObject var338) {
        print_high.princ(f50707(var338), var125);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50707(final SubLObject var338) {
        return f50722(module0201.f12548(var338));
    }
    
    public static SubLObject f50720(final SubLObject var457) {
        return module0035.delete_if_not((SubLObject)$ic331$, var457, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50723() {
        $g6336$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic333$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return $g6336$.getGlobalValue();
    }
    
    public static SubLObject f50719(final SubLObject var457) {
        final SubLThread var458 = SubLProcess.currentSubLThread();
        SubLObject var459 = f50724(var457);
        if (Sequences.length(var459).numGE($g6337$.getDynamicValue(var458))) {
            final SubLObject var460 = Hashtables.gethash_without_values(var459, $g6336$.getGlobalValue(), (SubLObject)UNPROVIDED);
            if (NIL != var460) {
                var459 = var460;
            }
            else {
                final SubLObject var461 = Hashtables.hash_table_count($g6336$.getGlobalValue());
                final SubLObject var462 = Sequences.cconcatenate((SubLObject)$ic334$, module0038.f2638(var461));
                Hashtables.sethash(var459, $g6336$.getGlobalValue(), var462);
                var459 = var462;
            }
        }
        return var459;
    }
    
    public static SubLObject f50724(SubLObject var457) {
        var457 = module0038.f2842((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, var457);
        var457 = module0038.f2842((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_colon, var457);
        var457 = module0035.delete_if_not((SubLObject)$ic335$, Strings.string_downcase(var457, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == Characters.alpha_char_p(module0038.f2636(var457))) {
            var457 = Sequences.cconcatenate((SubLObject)$ic336$, var457);
        }
        return var457;
    }
    
    public static SubLObject f50722(final SubLObject var457) {
        return module0035.delete_if_not((SubLObject)$ic335$, Strings.string_upcase(var457, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50721(final SubLObject var457) {
        return module0035.delete_if_not((SubLObject)$ic337$, var457, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50725(final SubLObject var461) {
        if (!Characters.CHAR_quotation.eql(var461) && !Characters.CHAR_backslash.eql(var461) && !Characters.CHAR_newline.eql(var461)) {
            final SubLObject var462 = Characters.char_code(var461);
            if (var462.numGE((SubLObject)$ic338$) && var462.numLE((SubLObject)$ic339$)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50726(final SubLObject var461) {
        return (SubLObject)makeBoolean(NIL != Characters.alphanumericp(var461) || Characters.CHAR_underbar.eql(var461));
    }
    
    public static SubLObject f50727(final SubLObject var461) {
        return (SubLObject)makeBoolean(NIL != Characters.alphanumericp(var461) || Characters.CHAR_underbar.eql(var461) || Characters.CHAR_period.eql(var461));
    }
    
    public static SubLObject f50679(final SubLObject var367) {
        if (NIL != f50672(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50671(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50668(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50669(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50673(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50670(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != f50674(var367)) {
            return module0205.f13203(var367, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0206.f13497(var367)) {
            return var367;
        }
        if (NIL != module0269.f17736(var367)) {
            return var367;
        }
        if (NIL != module0202.f12590(var367)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic340$), var367);
        }
        return Errors.error((SubLObject)$ic314$, var367);
    }
    
    public static SubLObject f50728(final SubLObject var121, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123 = (SubLObject)ZERO_INTEGER;
        final SubLObject var124 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var125 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var126 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var127 = (SubLObject)NIL;
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        try {
            final SubLObject var130 = stream_macros.$stream_requires_locking$.currentBinding(var122);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var122);
                var129 = compatibility.open_text(var121, (SubLObject)$ic52$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var130, var122);
            }
            if (!var129.isStream()) {
                Errors.error((SubLObject)$ic53$, var121);
            }
            final SubLObject var125_469 = var129;
            final SubLObject var132;
            final SubLObject var131 = var132 = var16;
            final SubLObject var133 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var132);
            final SubLObject var134 = (SubLObject)((NIL != var133) ? conses_high.cadr(var133) : NIL);
            final SubLObject var135 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var132);
            final SubLObject var136 = (SubLObject)((NIL != var135) ? conses_high.cadr(var135) : NIL);
            final SubLObject var137 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var132);
            final SubLObject var138 = (SubLObject)((NIL != var137) ? conses_high.cadr(var137) : NIL);
            final SubLObject var139 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var132);
            final SubLObject var140 = (SubLObject)((NIL != var139) ? conses_high.cadr(var139) : NIL);
            final SubLObject var141 = cdestructuring_bind.property_list_member((SubLObject)$ic341$, var132);
            final SubLObject var142 = (SubLObject)((NIL != var141) ? conses_high.cadr(var141) : T);
            final SubLObject var143 = cdestructuring_bind.property_list_member((SubLObject)$ic342$, var132);
            final SubLObject var144 = (SubLObject)((NIL != var143) ? conses_high.cadr(var143) : $ic343$);
            final SubLObject var145 = $g6316$.currentBinding(var122);
            final SubLObject var146 = $g6317$.currentBinding(var122);
            final SubLObject var147 = $g6318$.currentBinding(var122);
            try {
                $g6316$.bind(var134, var122);
                $g6317$.bind(var138, var122);
                $g6318$.bind(var140, var122);
                final SubLObject var148 = assertion_handles_oc.f11010();
                final SubLObject var149 = (SubLObject)$ic54$;
                final SubLObject var150 = module0065.f4733(var148);
                SubLObject var151 = (SubLObject)ZERO_INTEGER;
                assert NIL != Types.stringp(var149) : var149;
                final SubLObject var15_484 = module0012.$g75$.currentBinding(var122);
                final SubLObject var78_485 = module0012.$g76$.currentBinding(var122);
                final SubLObject var79_486 = module0012.$g77$.currentBinding(var122);
                final SubLObject var152 = module0012.$g78$.currentBinding(var122);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var122);
                    module0012.$g76$.bind((SubLObject)NIL, var122);
                    module0012.$g77$.bind((SubLObject)T, var122);
                    module0012.$g78$.bind(Time.get_universal_time(), var122);
                    module0012.f478(var149);
                    final SubLObject var487_488 = var148;
                    if (NIL == module0065.f4772(var487_488, (SubLObject)$ic344$)) {
                        final SubLObject var489_490 = var487_488;
                        if (NIL == module0065.f4775(var489_490, (SubLObject)$ic344$)) {
                            final SubLObject var153 = module0065.f4740(var489_490);
                            final SubLObject var154 = (SubLObject)NIL;
                            SubLObject var155;
                            SubLObject var156;
                            SubLObject var157;
                            SubLObject var158;
                            SubLObject var160;
                            SubLObject var159;
                            SubLObject var161;
                            for (var155 = Sequences.length(var153), var156 = (SubLObject)NIL, var156 = (SubLObject)ZERO_INTEGER; var156.numL(var155); var156 = Numbers.add(var156, (SubLObject)ONE_INTEGER)) {
                                var157 = ((NIL != var154) ? Numbers.subtract(var155, var156, (SubLObject)ONE_INTEGER) : var156);
                                var158 = Vectors.aref(var153, var157);
                                if (NIL == module0065.f4749(var158) || NIL == module0065.f4773((SubLObject)$ic344$)) {
                                    if (NIL != module0065.f4749(var158)) {
                                        var158 = (SubLObject)$ic344$;
                                    }
                                    module0012.note_percent_progress(var151, var150);
                                    var151 = Numbers.add(var151, (SubLObject)ONE_INTEGER);
                                    if (NIL != f50568(var158, var136)) {
                                        var159 = (var160 = f50569(var158));
                                        var161 = (SubLObject)NIL;
                                        var161 = var160.first();
                                        while (NIL != var160) {
                                            if (NIL != f50729(var161, var142)) {
                                                var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                                                f50730(var125_469, var123, var161, var144, var124, var125, var126);
                                            }
                                            var160 = var160.rest();
                                            var161 = var160.first();
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var492_493 = var487_488;
                        if (NIL == module0065.f4777(var492_493) || NIL == module0065.f4773((SubLObject)$ic344$)) {
                            final SubLObject var162 = module0065.f4738(var492_493);
                            SubLObject var163 = module0065.f4739(var492_493);
                            final SubLObject var164 = module0065.f4734(var492_493);
                            final SubLObject var165 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic344$)) ? NIL : $ic344$);
                            while (var163.numL(var164)) {
                                final SubLObject var166 = Hashtables.gethash_without_values(var163, var162, var165);
                                if (NIL == module0065.f4773((SubLObject)$ic344$) || NIL == module0065.f4749(var166)) {
                                    module0012.note_percent_progress(var151, var150);
                                    var151 = Numbers.add(var151, (SubLObject)ONE_INTEGER);
                                    if (NIL != f50568(var166, var136)) {
                                        SubLObject var168;
                                        final SubLObject var167 = var168 = f50569(var166);
                                        SubLObject var169 = (SubLObject)NIL;
                                        var169 = var168.first();
                                        while (NIL != var168) {
                                            if (NIL != f50729(var169, var142)) {
                                                var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                                                f50730(var125_469, var123, var169, var144, var124, var125, var126);
                                            }
                                            var168 = var168.rest();
                                            var169 = var168.first();
                                        }
                                    }
                                }
                                var163 = Numbers.add(var163, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var152, var122);
                    module0012.$g77$.rebind(var79_486, var122);
                    module0012.$g76$.rebind(var78_485, var122);
                    module0012.$g75$.rebind(var15_484, var122);
                }
                final SubLObject var15_485 = module0147.$g2094$.currentBinding(var122);
                final SubLObject var78_486 = module0147.$g2095$.currentBinding(var122);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic61$, var122);
                    module0147.$g2095$.bind($ic62$, var122);
                    final SubLObject var170 = (SubLObject)$ic63$;
                    final SubLObject var500_501 = module0173.f10962();
                    SubLObject var502_503 = (SubLObject)ZERO_INTEGER;
                    final SubLObject var15_486 = module0012.$g75$.currentBinding(var122);
                    final SubLObject var78_487 = module0012.$g76$.currentBinding(var122);
                    final SubLObject var79_487 = module0012.$g77$.currentBinding(var122);
                    final SubLObject var171 = module0012.$g78$.currentBinding(var122);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var122);
                        module0012.$g76$.bind((SubLObject)NIL, var122);
                        module0012.$g77$.bind((SubLObject)T, var122);
                        module0012.$g78$.bind(Time.get_universal_time(), var122);
                        module0012.f478(var170);
                        SubLObject var172 = module0173.f10961();
                        SubLObject var173 = (SubLObject)NIL;
                        var173 = var172.first();
                        while (NIL != var172) {
                            final SubLObject var487_489 = var173;
                            if (NIL == module0065.f4772(var487_489, (SubLObject)$ic344$)) {
                                final SubLObject var489_491 = var487_489;
                                if (NIL == module0065.f4775(var489_491, (SubLObject)$ic344$)) {
                                    final SubLObject var174 = module0065.f4740(var489_491);
                                    final SubLObject var175 = (SubLObject)NIL;
                                    SubLObject var176;
                                    SubLObject var177;
                                    SubLObject var178;
                                    SubLObject var179;
                                    SubLObject var180;
                                    SubLObject var21_510;
                                    SubLObject var181;
                                    SubLObject var182;
                                    for (var176 = Sequences.length(var174), var177 = (SubLObject)NIL, var177 = (SubLObject)ZERO_INTEGER; var177.numL(var176); var177 = Numbers.add(var177, (SubLObject)ONE_INTEGER)) {
                                        var178 = ((NIL != var175) ? Numbers.subtract(var176, var177, (SubLObject)ONE_INTEGER) : var177);
                                        var179 = Vectors.aref(var174, var178);
                                        if (NIL == module0065.f4749(var179) || NIL == module0065.f4773((SubLObject)$ic344$)) {
                                            if (NIL != module0065.f4749(var179)) {
                                                var179 = (SubLObject)$ic344$;
                                            }
                                            var502_503 = Numbers.add(var502_503, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var502_503, var500_501);
                                            var180 = conses_high.getf(var16, (SubLObject)$ic43$, (SubLObject)NIL);
                                            var181 = (var21_510 = f50573(var179, var136, var180));
                                            var182 = (SubLObject)NIL;
                                            var182 = var21_510.first();
                                            while (NIL != var21_510) {
                                                if (NIL != f50729(var182, var142)) {
                                                    var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                                                    f50730(var125_469, var123, var182, var144, var124, var125, var126);
                                                }
                                                var21_510 = var21_510.rest();
                                                var182 = var21_510.first();
                                            }
                                        }
                                    }
                                }
                                final SubLObject var492_494 = var487_489;
                                if (NIL == module0065.f4777(var492_494) || NIL == module0065.f4773((SubLObject)$ic344$)) {
                                    final SubLObject var183 = module0065.f4738(var492_494);
                                    SubLObject var184 = module0065.f4739(var492_494);
                                    final SubLObject var185 = module0065.f4734(var492_494);
                                    final SubLObject var186 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic344$)) ? NIL : $ic344$);
                                    while (var184.numL(var185)) {
                                        final SubLObject var187 = Hashtables.gethash_without_values(var184, var183, var186);
                                        if (NIL == module0065.f4773((SubLObject)$ic344$) || NIL == module0065.f4749(var187)) {
                                            var502_503 = Numbers.add(var502_503, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var502_503, var500_501);
                                            final SubLObject var188 = conses_high.getf(var16, (SubLObject)$ic43$, (SubLObject)NIL);
                                            SubLObject var21_511;
                                            final SubLObject var189 = var21_511 = f50573(var187, var136, var188);
                                            SubLObject var190 = (SubLObject)NIL;
                                            var190 = var21_511.first();
                                            while (NIL != var21_511) {
                                                if (NIL != f50729(var190, var142)) {
                                                    var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                                                    f50730(var125_469, var123, var190, var144, var124, var125, var126);
                                                }
                                                var21_511 = var21_511.rest();
                                                var190 = var21_511.first();
                                            }
                                        }
                                        var184 = Numbers.add(var184, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                            var172 = var172.rest();
                            var173 = var172.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var171, var122);
                        module0012.$g77$.rebind(var79_487, var122);
                        module0012.$g76$.rebind(var78_487, var122);
                        module0012.$g75$.rebind(var15_486, var122);
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var78_486, var122);
                    module0147.$g2094$.rebind(var15_485, var122);
                }
            }
            finally {
                $g6318$.rebind(var147, var122);
                $g6317$.rebind(var146, var122);
                $g6316$.rebind(var145, var122);
            }
            var128 = var123;
            var127 = Numbers.add(module0077.f5311(var124), module0077.f5311(var125), module0077.f5311(var126));
        }
        finally {
            final SubLObject var191 = Threads.$is_thread_performing_cleanupP$.currentBinding(var122);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var122);
                if (var129.isStream()) {
                    streams_high.close(var129, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var191, var122);
            }
        }
        return Values.values(var127, var128);
    }
    
    public static SubLObject f50729(final SubLObject var108, final SubLObject var477) {
        if (NIL != var477) {
            return (SubLObject)T;
        }
        if (NIL != module0202.f12594(var108)) {
            return (SubLObject)T;
        }
        if (NIL != module0202.f12597(var108) && NIL != module0202.f12594(module0205.f13380(var108, (SubLObject)UNPROVIDED))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50730(final SubLObject var125, final SubLObject var463, final SubLObject var108, final SubLObject var479, final SubLObject var464, final SubLObject var465, final SubLObject var466) {
        final SubLThread var480 = SubLProcess.currentSubLThread();
        var480.resetMultipleValues();
        final SubLObject var481 = f50731(var108);
        final SubLObject var482 = var480.secondMultipleValue();
        final SubLObject var483 = var480.thirdMultipleValue();
        var480.resetMultipleValues();
        if (var479 == $ic343$ || NIL != module0035.f2169((SubLObject)$ic184$, var479)) {
            SubLObject var484 = var481;
            SubLObject var485 = (SubLObject)NIL;
            var485 = var484.first();
            while (NIL != var484) {
                module0077.f5326(var485, var464);
                PrintLow.format(var125, (SubLObject)$ic345$, var463);
                f50732(var125, var485, (SubLObject)$ic184$);
                streams_high.terpri(var125);
                var484 = var484.rest();
                var485 = var484.first();
            }
        }
        if (var479 == $ic343$ || NIL != module0035.f2169((SubLObject)$ic346$, var479)) {
            SubLObject var484 = var482;
            SubLObject var486 = (SubLObject)NIL;
            var486 = var484.first();
            while (NIL != var484) {
                module0077.f5326(var486, var465);
                PrintLow.format(var125, (SubLObject)$ic345$, var463);
                f50732(var125, var486, (SubLObject)$ic346$);
                streams_high.terpri(var125);
                var484 = var484.rest();
                var486 = var484.first();
            }
        }
        if (var479 == $ic343$ || NIL != module0035.f2169((SubLObject)$ic347$, var479)) {
            SubLObject var484 = var483;
            SubLObject var487 = (SubLObject)NIL;
            var487 = var484.first();
            while (NIL != var484) {
                module0077.f5326(var487, var466);
                PrintLow.format(var125, (SubLObject)$ic345$, var463);
                f50732(var125, var487, (SubLObject)$ic347$);
                streams_high.terpri(var125);
                var484 = var484.rest();
                var487 = var484.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50731(final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        final SubLObject var113 = $g6338$.currentBinding(var109);
        final SubLObject var114 = $g6339$.currentBinding(var109);
        final SubLObject var115 = $g6340$.currentBinding(var109);
        try {
            $g6338$.bind((SubLObject)NIL, var109);
            $g6339$.bind((SubLObject)NIL, var109);
            $g6340$.bind((SubLObject)NIL, var109);
            module0205.f13228((SubLObject)$ic348$, var108, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var110 = Sequences.nreverse($g6338$.getDynamicValue(var109));
            var111 = Sequences.nreverse($g6339$.getDynamicValue(var109));
            var112 = Sequences.nreverse($g6340$.getDynamicValue(var109));
        }
        finally {
            $g6340$.rebind(var115, var109);
            $g6339$.rebind(var114, var109);
            $g6338$.rebind(var113, var109);
        }
        return Values.values(var110, var111, var112);
    }
    
    public static SubLObject f50733(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (var1.isCons()) {
            final SubLObject var3 = var1.first();
            if (var3.eql($ic165$)) {
                final SubLObject var4 = conses_high.second(var1);
                if (NIL == conses_high.member(var4, $g6338$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    $g6338$.setDynamicValue((SubLObject)ConsesLow.cons(var4, $g6338$.getDynamicValue(var2)), var2);
                }
            }
            else if (var3.eql($ic235$)) {
                final SubLObject var4 = conses_high.second(var1);
                if (NIL == conses_high.member(var4, $g6339$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    $g6339$.setDynamicValue((SubLObject)ConsesLow.cons(var4, $g6339$.getDynamicValue(var2)), var2);
                }
            }
            else if (var3.eql($ic233$)) {
                final SubLObject var4 = conses_high.second(var1);
                if (NIL == conses_high.member(var4, $g6340$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    $g6340$.setDynamicValue((SubLObject)ConsesLow.cons(var4, $g6340$.getDynamicValue(var2)), var2);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50732(final SubLObject var125, final SubLObject var140, final SubLObject var516) {
        if (NIL != constant_handles_oc.f8449(var140)) {
            print_high.princ(f50734(var140), var125);
        }
        else if (NIL != module0167.f10813(var140)) {
            print_high.princ(f50735(var140), var125);
        }
        else {
            Errors.error((SubLObject)$ic349$);
        }
        if (var516.eql((SubLObject)$ic184$)) {
            print_high.princ((SubLObject)$ic350$, var125);
        }
        else if (var516.eql((SubLObject)$ic346$)) {
            print_high.princ((SubLObject)$ic351$, var125);
        }
        else if (var516.eql((SubLObject)$ic347$)) {
            print_high.princ((SubLObject)$ic352$, var125);
        }
        else {
            Errors.error((SubLObject)$ic353$, var516);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50734(final SubLObject var517) {
        return constants_high_oc.f10743(var517);
    }
    
    public static SubLObject f50736() {
        final SubLObject var276 = $g6341$.getGlobalValue();
        if (NIL != var276) {
            module0034.f1818(var276);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50737(final SubLObject var518) {
        return module0034.f1829($g6341$.getGlobalValue(), (SubLObject)ConsesLow.list(var518), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50738(final SubLObject var518) {
        final SubLThread var519 = SubLProcess.currentSubLThread();
        SubLObject var520 = (SubLObject)NIL;
        final SubLObject var521 = reader.$read_default_float_format$.currentBinding(var519);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic328$, var519);
            var520 = module0656.f39941(var518);
        }
        finally {
            reader.$read_default_float_format$.rebind(var521, var519);
        }
        var520 = module0035.nsubstitute_if_not((SubLObject)Characters.CHAR_underbar, Symbols.symbol_function((SubLObject)$ic355$), var520, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var520;
    }
    
    public static SubLObject f50735(final SubLObject var518) {
        SubLObject var519 = $g6341$.getGlobalValue();
        if (NIL == var519) {
            var519 = module0034.f1934((SubLObject)$ic354$, (SubLObject)$ic356$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var520 = module0034.f1814(var519, var518, (SubLObject)$ic161$);
        if (var520 == $ic161$) {
            var520 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50738(var518)));
            module0034.f1816(var519, var518, var520, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var520);
    }
    
    public static SubLObject f50739(final SubLObject var121, final SubLObject var122) {
        final SubLObject var123 = module0425.f30068((SubLObject)$ic358$);
        final SubLObject var124 = module0424.f29696(var123);
        final SubLObject var125 = module0424.f29688(var124);
        SubLObject var126 = (SubLObject)NIL;
        try {
            var126 = compatibility.open_text(var121, (SubLObject)$ic52$);
            if (!var126.isStream()) {
                Errors.error((SubLObject)$ic53$, var121);
            }
            final SubLObject var127 = var126;
            SubLObject var128 = var125;
            SubLObject var129 = (SubLObject)NIL;
            var129 = var128.first();
            while (NIL != var128) {
                f50588(var129, var122, (SubLObject)$ic28$, $g6342$.getGlobalValue(), var127);
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        finally {
            final SubLObject var130 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var126.isStream()) {
                    streams_high.close(var126, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var130);
            }
        }
        return Sequences.length(var125);
    }
    
    public static SubLObject f50740(SubLObject var51) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var52 = conses_high.putf(conses_high.copy_list($g6342$.getGlobalValue()), (SubLObject)$ic44$, var51);
        final SubLObject var53 = f50559(var52);
        f50609(var53, (SubLObject)T);
        return var53;
    }
    
    public static SubLObject f50741(final SubLObject var525, final SubLObject var109, final SubLObject var122, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var526 = f50582(var525, var109, $g6342$.getGlobalValue());
        f50584(var526, var122, (SubLObject)$ic28$, var125);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50742(final SubLObject var526) {
        final SubLThread var527 = SubLProcess.currentSubLThread();
        SubLObject var528 = (SubLObject)NIL;
        final SubLObject var529 = assertion_handles_oc.f11053(var526);
        print_high.print(var529, (SubLObject)UNPROVIDED);
        final SubLObject var530 = $g6316$.currentBinding(var527);
        try {
            $g6316$.bind((SubLObject)$ic79$, var527);
            var528 = f50569(var529);
        }
        finally {
            $g6316$.rebind(var530, var527);
        }
        return var528;
    }
    
    public static SubLObject f50743() {
        return f50744($g6343$.getGlobalValue(), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f50745(SubLObject var527, SubLObject var68, SubLObject var528) {
        if (var527 == UNPROVIDED) {
            var527 = (SubLObject)$ic361$;
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)T;
        }
        if (var528 == UNPROVIDED) {
            var528 = (SubLObject)T;
        }
        return f50744($g6344$.getGlobalValue(), var527, var68, var528);
    }
    
    public static SubLObject f50744(final SubLObject var521, final SubLObject var527, final SubLObject var68, final SubLObject var528) {
        final SubLThread var529 = SubLProcess.currentSubLThread();
        SubLObject var530 = (SubLObject)NIL;
        if (NIL != var528) {
            module0569.f34904((SubLObject)UNPROVIDED);
        }
        SubLObject var531 = var521;
        SubLObject var532 = (SubLObject)NIL;
        var532 = var531.first();
        while (NIL != var531) {
            final SubLObject var533 = module0408.f28423(module0202.f12887(var532));
            SubLObject var534 = (SubLObject)NIL;
            SubLObject var535 = (SubLObject)NIL;
            SubLObject var536 = (SubLObject)NIL;
            final SubLObject var537 = Time.get_internal_real_time();
            var529.resetMultipleValues();
            final SubLObject var534_535 = module0409.f28506(var532, (SubLObject)NIL, (SubLObject)ConsesLow.listS((SubLObject)$ic85$, var533, (SubLObject)$ic362$, var527, (SubLObject)$ic363$));
            final SubLObject var536_537 = var529.secondMultipleValue();
            var529.resetMultipleValues();
            var535 = var534_535;
            var536 = var536_537;
            var534 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var537), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (NIL == var535) {
                var534 = (SubLObject)$ic364$;
            }
            if (NIL != var68) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic365$, new SubLObject[] { var532, var536, var534 });
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var530 = (SubLObject)ConsesLow.cons(var534, var530);
            var531 = var531.rest();
            var532 = var531.first();
        }
        return Sequences.nreverse(var530);
    }
    
    public static SubLObject f50746() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50546", "S#55079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50547", "S#55080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50548", "S#55081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50549", "S#55082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50550", "S#55083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50551", "S#55084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50552", "S#55085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50553", "S#55086", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50554", "S#55087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50555", "S#55088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50556", "S#55089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50557", "S#55090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50559", "S#55091", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50560", "S#55092", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50561", "S#55093", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50558", "S#55094", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50565", "S#55095", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50566", "S#55096", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50567", "S#55097", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50574", "S#55098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50575", "S#55099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50576", "S#55100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50577", "S#55101", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50578", "S#55102", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50581", "S#55103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50582", "S#55104", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50584", "S#55105", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50587", "S#55106", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50588", "S#55107", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50589", "S#55108", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50570", "S#55109", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50590", "S#55110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50591", "S#55111", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50594", "S#55112", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50595", "S#55113", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50564", "S#55114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50593", "S#55115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50562", "S#55116", 18, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50568", "S#55117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50571", "S#55118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50569", "S#55119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50598", "S#55120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50572", "S#55121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50601", "S#55122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50604", "S#55123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50605", "S#55124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50606", "S#55125", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50602", "S#55126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50600", "S#55127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50592", "S#55128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50596", "S#55129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50608", "S#55130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50609", "S#55131", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50610", "S#55132", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50611", "S#55133", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50612", "S#55134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50613", "S#55135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50607", "S#55136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50603", "S#55137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50599", "S#55138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50615", "S#55139", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50616", "S#55140", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50617", "S#55141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50618", "S#55142", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50619", "S#55143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50620", "S#55144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50614", "S#55145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50573", "S#55146", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0792", "f50632", "S#55147");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50622", "S#55148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50623", "S#55149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50624", "S#55150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50625", "S#55151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50626", "S#55152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50627", "S#55153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50628", "S#55154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50634", "S#55155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50635", "S#55156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50636", "S#55157", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50637", "S#55158", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50633", "S#55159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50629", "S#55160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50630", "S#55161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50631", "S#55162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50583", "S#55163", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50639", "S#55164", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50642", "S#55165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50641", "S#55166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50643", "S#55167", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50640", "S#55168", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50648", "S#55169", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50649", "S#55170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50645", "S#55171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50621", "S#55172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50647", "S#55173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50638", "S#55174", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50657", "S#55175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50658", "S#55176", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50655", "S#55177", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50656", "S#55178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50660", "S#55179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50663", "S#55180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50661", "S#55181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50662", "S#55182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50659", "S#55183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50644", "S#55184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50650", "S#55185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50654", "S#55186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50665", "S#55187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50666", "S#55188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50667", "S#55189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50651", "S#55190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50668", "S#55191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50646", "S#55192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50671", "S#55193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50664", "S#55194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50672", "S#55195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50675", "S#55196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50653", "S#55197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50673", "S#55198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50669", "S#55199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50652", "S#55200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50674", "S#55201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50670", "S#55202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50676", "S#55203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50677", "S#55204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50678", "S#55205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50680", "S#55206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50681", "S#55207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50682", "S#55208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50683", "S#55209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50684", "S#55210", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50685", "S#55211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50563", "S#55212", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50597", "S#55213", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50579", "S#55214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50687", "S#55215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50689", "S#55216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50585", "S#55217", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50690", "S#55218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50580", "S#55219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50686", "S#55220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50688", "S#55221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50692", "S#55222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50586", "S#55223", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50691", "S#55224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50696", "S#55225", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50698", "S#55226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50697", "S#55227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50699", "S#55228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50700", "S#55229", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50701", "S#55230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50702", "S#55231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50694", "S#55232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50693", "S#55233", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50695", "S#55234", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50703", "S#55235", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50705", "S#55236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50704", "S#55237", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50706", "S#55238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50708", "S#55239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50717", "S#55240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50709", "S#55241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50710", "S#55242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50718", "S#55243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50711", "S#55244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50712", "S#55245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50713", "S#55246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50714", "S#55247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50715", "S#55248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50716", "S#55249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50707", "S#55250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50720", "S#55251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50723", "S#55252", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50719", "S#55253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50724", "S#55254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50722", "S#55255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50721", "S#55256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50725", "S#55257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50726", "S#55258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50727", "S#55259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50679", "S#55260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50728", "S#55261", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50729", "S#55262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50730", "S#55263", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50731", "S#55264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50733", "S#55265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50732", "S#55266", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50734", "S#55267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50736", "S#55268", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50737", "S#55269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50738", "S#55270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50735", "S#55271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50739", "S#55272", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50740", "S#55273", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50741", "S#55274", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50742", "S#55275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50743", "S#55276", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50745", "S#55277", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0792", "f50744", "S#55278", 4, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50747() {
        $g6314$ = SubLFiles.deflexical("S#55279", (SubLObject)$ic0$);
        $g6315$ = SubLFiles.defparameter("S#55280", (SubLObject)$ic1$);
        $g6316$ = SubLFiles.defparameter("S#55281", (SubLObject)$ic3$);
        $g6317$ = SubLFiles.defparameter("S#55282", (SubLObject)$ic6$);
        $g6318$ = SubLFiles.defparameter("S#55283", (SubLObject)$ic8$);
        $g6319$ = SubLFiles.defparameter("S#55284", (SubLObject)$ic10$);
        $g6320$ = SubLFiles.defparameter("S#55285", (SubLObject)$ic12$);
        $g6321$ = SubLFiles.deflexical("S#55286", (SubLObject)$ic14$);
        $g6322$ = SubLFiles.deflexical("S#55287", (SubLObject)$ic15$);
        $g6323$ = SubLFiles.deflexical("S#55288", (SubLObject)$ic16$);
        $g6324$ = SubLFiles.defparameter("S#55289", (SubLObject)NIL);
        $g6325$ = SubLFiles.defparameter("S#55290", (SubLObject)NIL);
        $g6326$ = SubLFiles.defparameter("S#55291", (SubLObject)NIL);
        $g6327$ = SubLFiles.defparameter("S#55292", (SubLObject)NIL);
        $g6328$ = SubLFiles.defparameter("S#55293", (SubLObject)NIL);
        $g6329$ = SubLFiles.defparameter("S#55294", (SubLObject)NIL);
        $g6330$ = SubLFiles.defparameter("S#55295", (SubLObject)NIL);
        $g6331$ = SubLFiles.defparameter("S#55296", (SubLObject)NIL);
        $g6332$ = SubLFiles.defparameter("S#55297", (SubLObject)NIL);
        $g6333$ = SubLFiles.defparameter("S#55298", (SubLObject)NIL);
        $g6334$ = SubLFiles.deflexical("S#55299", (SubLObject)NIL);
        $g6335$ = SubLFiles.deflexical("S#55300", (SubLObject)NIL);
        $g6336$ = SubLFiles.deflexical("S#55301", (NIL != Symbols.boundp((SubLObject)$ic332$)) ? $g6336$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic333$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g6337$ = SubLFiles.defparameter("S#55302", (SubLObject)$ic333$);
        $g6338$ = SubLFiles.defparameter("S#55303", (SubLObject)NIL);
        $g6339$ = SubLFiles.defparameter("S#55304", (SubLObject)NIL);
        $g6340$ = SubLFiles.defparameter("S#55305", (SubLObject)NIL);
        $g6341$ = SubLFiles.deflexical("S#55306", (SubLObject)NIL);
        $g6342$ = SubLFiles.deflexical("S#55307", (SubLObject)$ic357$);
        $g6343$ = SubLFiles.deflexical("S#55308", (SubLObject)$ic359$);
        $g6344$ = SubLFiles.deflexical("S#55309", $ic360$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50748() {
        module0034.f1909((SubLObject)$ic158$);
        module0012.f419((SubLObject)$ic288$);
        module0034.f1909((SubLObject)$ic289$);
        module0003.f57((SubLObject)$ic332$);
        module0034.f1909((SubLObject)$ic354$);
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_360_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("Individual")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("Baseball-Ball")), constant_handles_oc.f8479((SubLObject)makeString("Cube")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("ProductUsageMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typePrimaryFunction")), constant_handles_oc.f8479((SubLObject)makeString("Bathtub")), constant_handles_oc.f8479((SubLObject)makeString("TakingABath")), constant_handles_oc.f8479((SubLObject)makeString("deviceUsed")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("AnimalActivitiesMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typeBehaviorIncapable")), constant_handles_oc.f8479((SubLObject)makeString("InanimateObject")), constant_handles_oc.f8479((SubLObject)makeString("AtLeastPartiallyMentalEvent")), constant_handles_oc.f8479((SubLObject)makeString("doneBy")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UnitedStatesSocialLifeMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("HumanInfant")), constant_handles_oc.f8479((SubLObject)makeString("HumanPreSchoolageChild")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("IndustryMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subOrganizations")), (SubLObject)makeSymbol("?Z"), (SubLObject)makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("hasMembers")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("hasMembers")), (SubLObject)makeSymbol("?Z"), (SubLObject)makeSymbol("?Y")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("ClothingGMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Garment"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Bluish")))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("WorldCulturalGeographyDataMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("perpetrator")), constant_handles_oc.f8479((SubLObject)makeString("BombingOfIraqEvent")), constant_handles_oc.f8479((SubLObject)makeString("UnitedStatesOfAmerica"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?Y"), constant_handles_oc.f8479((SubLObject)makeString("Person"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("responsibleFor")), (SubLObject)makeSymbol("?Y"), constant_handles_oc.f8479((SubLObject)makeString("BombingOfIraqEvent"))))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("BlowDryer")), constant_handles_oc.f8479((SubLObject)makeString("Weapon")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("GolfCart"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("ArmoredVehicle")))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("or")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("Alice")), constant_handles_oc.f8479((SubLObject)makeString("Animal"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("Alice")), constant_handles_oc.f8479((SubLObject)makeString("Vegetable-Plant"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("Alice")), constant_handles_oc.f8479((SubLObject)makeString("Mineral"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("ArtifactGVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("FireplacePoker"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("productTypeManufacturedIn")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Foundry-Building"))))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("parts")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("parts")), (SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?Z"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("parts")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Z")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("covers-Generic")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("transformedInto")), (SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?X"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("interArgIsa2-1")), constant_handles_oc.f8479((SubLObject)makeString("anatomicalParts")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FruitFn")), constant_handles_oc.f8479((SubLObject)makeString("BananaTree"))), constant_handles_oc.f8479((SubLObject)makeString("BananaTree")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("performedBy")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("ArrestingSomeone"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?Y"), constant_handles_oc.f8479((SubLObject)makeString("PrivateSectorEmployee")))))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("Thinking"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("doneBy")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?Y"), constant_handles_oc.f8479((SubLObject)makeString("SomethingExisting"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CIAWorldFactbook1997Mt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("permanentMemberOfOrganization")), constant_handles_oc.f8479((SubLObject)makeString("SouthKorea")), constant_handles_oc.f8479((SubLObject)makeString("UNSecurityCouncil"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("ScatteredSpaceRegion"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("convexSpaceRegionOf")), (SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?Z"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("convexSpaceRegionOf")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Z")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("componentPartOfSpaceRegion")), (SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?X")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("ProductPhysicalCharacteristicsMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?X"), constant_handles_oc.f8479((SubLObject)makeString("PhoneAnsweringMachineCombo"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("uniformColorOfObject")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?Z"), constant_handles_oc.f8479((SubLObject)makeString("ResetButton"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("surfaceParts")), (SubLObject)makeSymbol("?Z"), (SubLObject)makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("uniformColorOfObject")), (SubLObject)makeSymbol("?Z"), (SubLObject)makeSymbol("?Y")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("PatternsOfGlobalTerrorism1998Mt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?COMP2"), constant_handles_oc.f8479((SubLObject)makeString("IBMNetfinityComputer"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?COMP1"), constant_handles_oc.f8479((SubLObject)makeString("SunMachine"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equivalentHosts")), (SubLObject)makeSymbol("?COMP1"), (SubLObject)makeSymbol("?COMP2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("doneBy")), (SubLObject)makeSymbol("?CRACK"), (SubLObject)makeSymbol("?HACKER")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?CRACK"), constant_handles_oc.f8479((SubLObject)makeString("Cracking-CompromisingSecurity"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("securityCompromised")), (SubLObject)makeSymbol("?CRACK"), (SubLObject)makeSymbol("?COMP1"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?ACTION"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("damages")), (SubLObject)makeSymbol("?ACTION"), (SubLObject)makeSymbol("?COMP2"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("NaiveInformationMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?CUP"), constant_handles_oc.f8479((SubLObject)makeString("Demitasse"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?COFFEE"), constant_handles_oc.f8479((SubLObject)makeString("Coffee-Hot"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("in-ContOpen")), (SubLObject)makeSymbol("?COFFEE"), (SubLObject)makeSymbol("?CUP"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("orientation")), (SubLObject)makeSymbol("?CUP"), constant_handles_oc.f8479((SubLObject)makeString("RightSideUp"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typeBehaviorIncapable")), constant_handles_oc.f8479((SubLObject)makeString("Can")), constant_handles_oc.f8479((SubLObject)makeString("Cancan-StyleOfDance")), constant_handles_oc.f8479((SubLObject)makeString("performedBy")))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), constant_handles_oc.f8479((SubLObject)makeString("biologicalFather")), constant_handles_oc.f8479((SubLObject)makeString("Cyc")), constant_handles_oc.f8479((SubLObject)makeString("MaleAnimal"))))), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?TERRORIST"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TERRORIST"), constant_handles_oc.f8479((SubLObject)makeString("Terrorist"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("birthPlace")), (SubLObject)makeSymbol("?TERRORIST"), constant_handles_oc.f8479((SubLObject)makeString("ContinentOfAsia")))))) });
    }
    
    public void declareFunctions() {
        f50746();
    }
    
    public void initializeVariables() {
        f50747();
    }
    
    public void runTopLevelForms() {
        f50748();
    }
    
    static {
        me = (SubLFile)new module0792();
        $g6314$ = null;
        $g6315$ = null;
        $g6316$ = null;
        $g6317$ = null;
        $g6318$ = null;
        $g6319$ = null;
        $g6320$ = null;
        $g6321$ = null;
        $g6322$ = null;
        $g6323$ = null;
        $g6324$ = null;
        $g6325$ = null;
        $g6326$ = null;
        $g6327$ = null;
        $g6328$ = null;
        $g6329$ = null;
        $g6330$ = null;
        $g6331$ = null;
        $g6332$ = null;
        $g6333$ = null;
        $g6334$ = null;
        $g6335$ = null;
        $g6336$ = null;
        $g6337$ = null;
        $g6338$ = null;
        $g6339$ = null;
        $g6340$ = null;
        $g6341$ = null;
        $g6342$ = null;
        $g6343$ = null;
        $g6344$ = null;
        $ic0$ = makeString("0.7.2");
        $ic1$ = makeKeyword("REGULAR-FOL");
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("REGULAR-FOL"), (SubLObject)makeKeyword("SET-THEORY"));
        $ic3$ = makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS");
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("MT-VISIBLE"), (SubLObject)makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), (SubLObject)makeKeyword("MT-ARGUMENT"), (SubLObject)makeKeyword("FLAT"));
        $ic5$ = makeKeyword("COLLAPSE");
        $ic6$ = makeKeyword("UNARY-PREDICATE");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("UNARY-PREDICATE"), (SubLObject)makeKeyword("ISA"));
        $ic8$ = makeKeyword("GAF");
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("GAF"), (SubLObject)makeKeyword("EXPANSION"), (SubLObject)makeKeyword("GAF-AND-EXPANSION"));
        $ic10$ = makeKeyword("ALLOWED");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("ALLOWED"), (SubLObject)makeKeyword("DWIM-TO-SINGLE-CONSTANT"), (SubLObject)makeKeyword("DWIM-TO-DISTINCT-CONSTANTS"), (SubLObject)makeKeyword("SKIP"));
        $ic12$ = makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS");
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("ALLOWED"), (SubLObject)makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS"), (SubLObject)makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS"));
        $ic14$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("Quote")), constant_handles_oc.f8479((SubLObject)makeString("EscapeQuote")), constant_handles_oc.f8479((SubLObject)makeString("QuasiQuote")), constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn")), constant_handles_oc.f8479((SubLObject)makeString("ExpandSubLFn")), constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerable")), constant_handles_oc.f8479((SubLObject)makeString("completelyEnumerableCollection")), constant_handles_oc.f8479((SubLObject)makeString("unknownSentence")), constant_handles_oc.f8479((SubLObject)makeString("evaluate")), constant_handles_oc.f8479((SubLObject)makeString("Nothing")), constant_handles_oc.f8479((SubLObject)makeString("CollectionDifferenceFn")), constant_handles_oc.f8479((SubLObject)makeString("reformulatorEquiv")) });
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("VARIABLE-ARITY-PREDICATE"), makeString("contained a variable-arity predicate with a maximum arity."), makeKeyword("VARIABLE-ARITY-FUNCTION"), makeString("contained a variable-arity function with a maximum arity."), makeKeyword("UNBOUNDED-ARITY-PREDICATE"), makeString("contained a variable-arity predicate with an unbounded arity."), makeKeyword("UNBOUNDED-ARITY-FUNCTION"), makeString("contained a variable-arity function with an unbounded arity."), makeKeyword("META-SENTENCE"), makeString("contained an embedded sentence used as a term."), makeKeyword("META-ASSERTION"), makeString("contained an embedded assertion used as a term."), makeKeyword("META-VARIABLE"), makeString("contained a meta-variable."), makeKeyword("SUBL-ESCAPE"), makeString("contained an escape to SubL (a hook into the underlying implentation language)"), makeKeyword("FUNCTION-ARG-CONSTRAINT"), makeString("expressed an argument constraint on a function, for which there is currently no FOL translation."), makeKeyword("FUNCTION-QUANTIFICATION"), makeString("quantified over functions."), makeKeyword("PREDICATE-QUANTIFICATION"), makeString("quantified over predicates."), makeKeyword("COLLECTION-QUANTIFICATION"), makeString("quantified into a collection, which is like quantifying over predicates."), makeKeyword("SEQUENCE-VAR"), makeString("contained a sequence variable"), makeKeyword("IST"), makeString("used the predicate #$ist, which is used to do quantification across contexts or contextual lifting."), makeKeyword("ILL-FORMED"), makeString("were ill-formed.  This illustrates a problem with the Cyc KB itself, not with the Cyc -> FOL conversion."), makeKeyword("NONSTANDARD-SENTENTIAL-RELATION"), makeString("contained a bounded existential, or a user-defined logical operator or quantifier"), makeKeyword("EXPANSION"), makeString("had an expansion that could not be translated"), makeKeyword("KAPPA"), makeString("contained Kappa, a predicate-denoting function"), makeKeyword("LAMBDA"), makeString("contained Lambda, a function-denoting function"), makeKeyword("EXPLICITLY-FORBIDDEN-TERM"), makeString("contained an explicitly forbidden term, function, or predicate") });
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("TPTP"), (SubLObject)makeKeyword("CYCL"));
        $ic17$ = makeKeyword("GENERATION-PROPERTIES");
        $ic18$ = makeKeyword("CANDIDATE-FOL-SENTENCE-COUNT");
        $ic19$ = makeKeyword("FOL-SENTENCE-COUNT");
        $ic20$ = makeKeyword("TERM-COUNT");
        $ic21$ = makeKeyword("HANDLED-TERM-COUNT");
        $ic22$ = makeKeyword("PARTIALLY-HANDLED-TERM-COUNT");
        $ic23$ = makeKeyword("UNHANDLED-TERM-COUNT");
        $ic24$ = makeKeyword("FOL-SENTENCES-DATA");
        $ic25$ = makeKeyword("REJECTION-STATISTICS");
        $ic26$ = makeKeyword("OUTPUT-FILENAME");
        $ic27$ = makeKeyword("OUTPUT-FORMAT");
        $ic28$ = makeKeyword("TPTP");
        $ic29$ = makeString("cyc");
        $ic30$ = makeSymbol("FORT-P");
        $ic31$ = makeSymbol("S#747", "CYC");
        $ic32$ = makeSymbol("ASSERTION-P");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#55310", "CYC"), makeSymbol("S#55311", "CYC"), makeSymbol("S#55312", "CYC"), makeSymbol("S#55313", "CYC"), makeSymbol("S#55314", "CYC"), makeSymbol("S#55315", "CYC"), makeSymbol("S#55316", "CYC"), makeSymbol("S#55317", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#55318", "CYC"), (SubLObject)ONE_INTEGER), makeSymbol("S#38473", "CYC"), makeSymbol("S#2818", "CYC"), makeSymbol("S#8559", "CYC"), makeSymbol("S#33244", "CYC"), makeSymbol("S#55319", "CYC"), makeSymbol("S#55320", "CYC"), makeSymbol("S#55321", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#55322", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#55323", "CYC"), (SubLObject)T) });
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("TRANSLATION-TYPE"), makeKeyword("MT-HANDLING"), makeKeyword("MT-CEILING"), makeKeyword("ISA-HANDLING"), makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("STRING-HANDLING"), makeKeyword("NUMBER-HANDLING"), makeKeyword("ALLOW-EQUIV-RELATION?"), makeKeyword("SAMPLE-RATE"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("HEADER"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("ANALYSIS-FILE-INTERNAL?"), makeKeyword("INCLUDE-COMMENTS?"), makeKeyword("RETURN-DATA?"), makeKeyword("NEGATE-QUERIES?"), makeKeyword("VERBOSE?") });
        $ic35$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic36$ = makeKeyword("TRANSLATION-TYPE");
        $ic37$ = makeKeyword("MT-HANDLING");
        $ic38$ = makeKeyword("MT-CEILING");
        $ic39$ = makeKeyword("ISA-HANDLING");
        $ic40$ = makeKeyword("RULE-MACRO-PREDICATE-HANDLING");
        $ic41$ = makeKeyword("STRING-HANDLING");
        $ic42$ = makeKeyword("NUMBER-HANDLING");
        $ic43$ = makeKeyword("ALLOW-EQUIV-RELATION?");
        $ic44$ = makeKeyword("SAMPLE-RATE");
        $ic45$ = makeKeyword("HEADER");
        $ic46$ = makeKeyword("ANALYSIS-FILENAME");
        $ic47$ = makeKeyword("ANALYSIS-FILE-INTERNAL?");
        $ic48$ = makeKeyword("INCLUDE-COMMENTS?");
        $ic49$ = makeKeyword("RETURN-DATA?");
        $ic50$ = makeKeyword("NEGATE-QUERIES?");
        $ic51$ = makeKeyword("VERBOSE?");
        $ic52$ = makeKeyword("OUTPUT");
        $ic53$ = makeString("Unable to open ~S");
        $ic54$ = makeString("Converting assertions to FOL");
        $ic55$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic56$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic57$ = makeString("failed to translate ~s~%");
        $ic58$ = makeString("Converting sentences to FOL");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic60$ = makeString("failed to translate ~s");
        $ic61$ = makeSymbol("S#12274", "CYC");
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic63$ = makeString("Converting forts to FOL");
        $ic64$ = makeSymbol("STRINGP");
        $ic65$ = makeKeyword("INPUT");
        $ic66$ = makeKeyword("ANALYSIS");
        $ic67$ = makeString("Expected a fol-sentences-analysis as the first loaded item");
        $ic68$ = makeKeyword("EOF");
        $ic69$ = makeKeyword("DATUM");
        $ic70$ = makeString("expected to input a cons, got ~s");
        $ic71$ = makeKeyword("CYCL");
        $ic72$ = makeString("Unrecognized output format: ~s");
        $ic73$ = makeString("Gathering FOL symbols");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#55094", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#55324", "CYC"));
        $ic75$ = makeSymbol("S#55188", "CYC");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#55310", "CYC"), makeSymbol("S#55311", "CYC"), makeSymbol("S#55312", "CYC"), makeSymbol("S#55313", "CYC"), makeSymbol("S#55314", "CYC"), makeSymbol("S#55315", "CYC"), makeSymbol("S#55316", "CYC"), makeSymbol("S#55317", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#55318", "CYC"), (SubLObject)ONE_INTEGER), makeSymbol("S#38473", "CYC"), makeSymbol("S#2818", "CYC"), makeSymbol("S#8559", "CYC"), makeSymbol("S#55320", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#55322", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#55323", "CYC"), (SubLObject)T) });
        $ic77$ = ConsesLow.list(new SubLObject[] { makeKeyword("TRANSLATION-TYPE"), makeKeyword("MT-HANDLING"), makeKeyword("MT-CEILING"), makeKeyword("ISA-HANDLING"), makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("STRING-HANDLING"), makeKeyword("NUMBER-HANDLING"), makeKeyword("ALLOW-EQUIV-RELATION?"), makeKeyword("SAMPLE-RATE"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("HEADER"), makeKeyword("INCLUDE-COMMENTS?"), makeKeyword("NEGATE-QUERIES?"), makeKeyword("VERBOSE?") });
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("NEG-LITS"), (SubLObject)makeSymbol("POS-LITS"));
        $ic79$ = makeKeyword("MT-ARGUMENT");
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic81$ = makeSymbol("?MT");
        $ic82$ = makeKeyword("MT-VISIBLE");
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("mtVisible"));
        $ic84$ = makeKeyword("FLAT");
        $ic85$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic86$ = makeString("can't handle conditional sentences~%");
        $ic87$ = makeKeyword("TESTING");
        $ic88$ = makeSymbol("S#55079", "CYC");
        $ic89$ = makeSymbol("S#55080", "CYC");
        $ic90$ = makeSymbol("S#12263", "CYC");
        $ic91$ = makeSymbol("S#55081", "CYC");
        $ic92$ = makeSymbol("S#55082", "CYC");
        $ic93$ = makeSymbol("S#55083", "CYC");
        $ic94$ = makeSymbol("S#55084", "CYC");
        $ic95$ = makeSymbol("BOOLEANP");
        $ic96$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic97$ = makeSymbol("S#6802", "CYC");
        $ic98$ = makeSymbol("S#55085", "CYC");
        $ic99$ = makeKeyword("EXPANSION");
        $ic100$ = makeKeyword("GAF-AND-EXPANSION");
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsaArg"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn"));
        $ic103$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?INDEP-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?INDEP-COL"), (SubLObject)makeSymbol("?DEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationAllExistsFn")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?INDEP-COL"), (SubLObject)makeSymbol("?DEP-COL")), (SubLObject)makeSymbol("?DEP-COL")));
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn"));
        $ic105$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?INDEP-COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationExistsAll")), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?DEP-COL"), (SubLObject)makeSymbol("?INDEP-COL"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("RelationExistsAllFn")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?DEP-COL"), (SubLObject)makeSymbol("?INDEP-COL")), (SubLObject)makeSymbol("?DEP-COL")));
        $ic106$ = makeKeyword("EXPLICITLY-FORBIDDEN-TERM");
        $ic107$ = makeSymbol("S#55123", "CYC");
        $ic108$ = makeSymbol("S#55125", "CYC");
        $ic109$ = constant_handles_oc.f8479((SubLObject)makeString("expansion"));
        $ic110$ = ConsesLow.list((SubLObject)makeSymbol("S#55325", "CYC"), (SubLObject)makeSymbol("S#55326", "CYC"));
        $ic111$ = makeKeyword("NOT-IN-THEORY");
        $ic112$ = makeSymbol("S#55135", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#55327", "CYC"), (SubLObject)makeSymbol("S#25812", "CYC"), (SubLObject)makeSymbol("S#55328", "CYC"));
        $ic114$ = makeString("~%~a~%");
        $ic115$ = makeString("FOLification statistics");
        $ic116$ = makeString("~a~%");
        $ic117$ = makeString("-----------------------");
        $ic118$ = makeString("Rejection statistics (raw):");
        $ic119$ = makeString("Rejection statistics (pretty):");
        $ic120$ = makeString("Conversion statistics:");
        $ic121$ = makeSymbol(">");
        $ic122$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#25812", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic123$ = makeString("~s assertion~p could not be converted to FOL because ~a ~a~%");
        $ic124$ = makeString("it");
        $ic125$ = makeString("they");
        $ic126$ = makeString("yielded the rejection condition ");
        $ic127$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-UnhandledFn"));
        $ic128$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic129$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic130$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic131$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic132$ = ConsesLow.list((SubLObject)NIL);
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Isa"));
        $ic134$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Isa"));
        $ic135$ = constant_handles_oc.f8479((SubLObject)makeString("arg3Isa"));
        $ic136$ = constant_handles_oc.f8479((SubLObject)makeString("arg4Isa"));
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("arg5Isa"));
        $ic138$ = constant_handles_oc.f8479((SubLObject)makeString("arg6Isa"));
        $ic139$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic140$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Genl"));
        $ic141$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Genl"));
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("arg3Genl"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("arg4Genl"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("arg5Genl"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)makeString("arg6Genl"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsa"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)makeString("resultGenl"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic152$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"));
        $ic153$ = makeKeyword("FUNCTION-ARG-CONSTRAINT");
        $ic154$ = makeKeyword("ILL-FORMED");
        $ic155$ = makeKeyword("NONSTANDARD-SENTENTIAL-RELATION");
        $ic156$ = makeKeyword("UNEXPECTED");
        $ic157$ = ConsesLow.list((SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"));
        $ic158$ = makeSymbol("S#55145", "CYC");
        $ic159$ = makeString("ARG");
        $ic160$ = makeSymbol("S#55299", "CYC");
        $ic161$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("equiv"));
        $ic163$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FOL-PredicateFn")), constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)TWO_INTEGER);
        $ic164$ = makeSymbol("?X");
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-PredicateFn"));
        $ic166$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic167$ = ConsesLow.list((SubLObject)makeSymbol("?X"));
        $ic168$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic169$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FOL-PredicateFn")), constant_handles_oc.f8479((SubLObject)makeString("mtVisible")), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("?SPEC-MT")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FOL-PredicateFn")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)TWO_INTEGER), (SubLObject)makeSymbol("?SPEC-MT"), (SubLObject)makeSymbol("?GENL-MT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FOL-PredicateFn")), constant_handles_oc.f8479((SubLObject)makeString("mtVisible")), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("?GENL-MT")));
        $ic170$ = ConsesLow.list((SubLObject)makeKeyword("MT-VISIBLE"), (SubLObject)makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"));
        $ic171$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FOL-PredicateFn")), constant_handles_oc.f8479((SubLObject)makeString("mtVisible")), (SubLObject)ONE_INTEGER);
        $ic172$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16578", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic173$ = makeUninternedSymbol("US#6F9624D");
        $ic174$ = makeUninternedSymbol("US#3F5A69B");
        $ic175$ = makeUninternedSymbol("US#34A2445");
        $ic176$ = makeSymbol("PWHEN");
        $ic177$ = makeSymbol("S#20283", "CYC");
        $ic178$ = makeSymbol("CLET");
        $ic179$ = makeSymbol("ARITY");
        $ic180$ = makeSymbol("CDOTIMES");
        $ic181$ = makeSymbol("1+");
        $ic182$ = makeSymbol("S#17689", "CYC");
        $ic183$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic184$ = makeKeyword("PREDICATE");
        $ic185$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("TRUE"));
        $ic186$ = makeKeyword("TRUE");
        $ic187$ = makeSymbol("?INS");
        $ic188$ = ConsesLow.list((SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y"));
        $ic189$ = ConsesLow.list((SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?Z"));
        $ic190$ = ConsesLow.list((SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Z"));
        $ic191$ = ConsesLow.list((SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?X"));
        $ic192$ = ConsesLow.list((SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?X"));
        $ic193$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArg"));
        $ic194$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse"));
        $ic195$ = ConsesLow.list((SubLObject)makeSymbol("?OLD"), (SubLObject)makeSymbol("?NEW"));
        $ic196$ = ConsesLow.list((SubLObject)makeSymbol("?NEW"), (SubLObject)makeSymbol("?OLD"));
        $ic197$ = makeSymbol("?OLD");
        $ic198$ = makeSymbol("?NEW");
        $ic199$ = constant_handles_oc.f8479((SubLObject)makeString("natFunction"));
        $ic200$ = constant_handles_oc.f8479((SubLObject)makeString("natArgument"));
        $ic201$ = makeKeyword("SET-THEORY");
        $ic202$ = makeKeyword("SEQUENCE-VAR");
        $ic203$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic204$ = makeSymbol("S#55172", "CYC");
        $ic205$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic206$ = ConsesLow.list((SubLObject)makeSymbol("S#55329", "CYC"), (SubLObject)makeSymbol("S#55330", "CYC"));
        $ic207$ = makeKeyword("ISA");
        $ic208$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"));
        $ic209$ = makeKeyword("META-ASSERTION");
        $ic210$ = makeKeyword("META-VARIABLE");
        $ic211$ = makeKeyword("SUBL-ESCAPE");
        $ic212$ = makeKeyword("META-SENTENCE");
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("memberOfSet"));
        $ic214$ = constant_handles_oc.f8479((SubLObject)makeString("SetifyArgumentFn"));
        $ic215$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic216$ = makeKeyword("IST");
        $ic217$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equals")), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")));
        $ic218$ = makeKeyword("NON-PREDICATE");
        $ic219$ = makeKeyword("VARIABLE-ARITY-PREDICATE");
        $ic220$ = makeKeyword("UNBOUNDED-ARITY-PREDICATE");
        $ic221$ = makeKeyword("PREDICATE-QUANTIFICATION");
        $ic222$ = constant_handles_oc.f8479((SubLObject)makeString("Kappa"));
        $ic223$ = makeKeyword("KAPPA");
        $ic224$ = makeKeyword("NON-COLLECTION");
        $ic225$ = makeKeyword("COLLECTION-QUANTIFICATION");
        $ic226$ = makeKeyword("NON-FUNCTION");
        $ic227$ = makeKeyword("SCOPING-RELATION");
        $ic228$ = makeKeyword("VARIABLE-ARITY-FUNCTION");
        $ic229$ = makeKeyword("UNBOUNDED-ARITY-FUNCTION");
        $ic230$ = makeKeyword("FUNCTION-QUANTIFICATION");
        $ic231$ = constant_handles_oc.f8479((SubLObject)makeString("Lambda"));
        $ic232$ = makeKeyword("LAMBDA");
        $ic233$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-AtomicTermFn"));
        $ic234$ = makeSymbol("INTEGERP");
        $ic235$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-FunctionFn"));
        $ic236$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-StringFn"));
        $ic237$ = makeKeyword("DWIM-TO-DISTINCT-CONSTANTS");
        $ic238$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-StringConstantFn"));
        $ic239$ = makeKeyword("DWIM-TO-SINGLE-CONSTANT");
        $ic240$ = constant_handles_oc.f8479((SubLObject)makeString("Canonical_String"));
        $ic241$ = makeString("unexpected string handling directive ~s");
        $ic242$ = makeSymbol("NUMBERP");
        $ic243$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-NumberFn"));
        $ic244$ = constant_handles_oc.f8479((SubLObject)makeString("FOL-NumberConstantFn"));
        $ic245$ = makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS");
        $ic246$ = makeString("unexpected number handling directive ~s");
        $ic247$ = makeSymbol("EL-VAR?");
        $ic248$ = ConsesLow.list((SubLObject)makeSymbol("S#10994", "CYC"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic249$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#55331", "CYC"), (SubLObject)makeSymbol("S#55332", "CYC"));
        $ic250$ = makeSymbol("S#55204", "CYC");
        $ic251$ = makeString("~%;; ~S");
        $ic252$ = makeString("~%;; QUERY:");
        $ic253$ = makeString("% Cyc Assertion #~a:~%");
        $ic254$ = makeString("% Cyc NART #~a:~%");
        $ic255$ = makeString("% Cyc Constant #~a:~%");
        $ic256$ = makeString("% CycL Sentence: ~a:~%");
        $ic257$ = makeString("Unexpected object ~s");
        $ic258$ = makeString("%--------------------------------------------------------------------------\n");
        $ic259$ = makeString("File");
        $ic260$ = makeString("CYC-10 : TPTP v2.2.0. Released 2.2.0. ");
        $ic261$ = makeString("Domain");
        $ic262$ = makeString("Knowledge Representation(Common-Sense Reasoning)");
        $ic263$ = makeString("Problem");
        $ic264$ = makeString("Reasoning with the Cyc Common Sense KB");
        $ic265$ = makeString("Version");
        $ic266$ = makeString("English");
        $ic267$ = makeString("The Cyc KB contains assertions for reasoning with Common Sense mainly in FOL but with some extensions.");
        $ic268$ = makeString("Refs");
        $ic269$ = makeString("");
        $ic270$ = makeString("Source");
        $ic271$ = makeString("Names");
        $ic272$ = makeString("Status");
        $ic273$ = makeString("unknown");
        $ic274$ = makeString("Rating");
        $ic275$ = makeString("1.0");
        $ic276$ = makeString("Syntax");
        $ic277$ = makeString("<blank>");
        $ic278$ = makeString("Comments");
        $ic279$ = makeString("To obtain a First Orderification of the ResearchCyc KB a number of non-trivial transformations were performed.\n% See First-Orderized ResearchCyc: Expressivity and Efficiency in a Common-Sense Ontology (2005) [Ramachandran, Reagan, Goolsbey] for details.\n% \n% Copyright (c)2003-2011 by Cycorp, Inc.\n% All rights reserved.\n% Use outside of Cycorp subject to separate license terms.\n%");
        $ic280$ = makeString("Bugfixes");
        $ic281$ = makeString("%-----------------------------------------\n");
        $ic282$ = makeSymbol("S#5859", "CYC");
        $ic283$ = makeString("% ");
        $ic284$ = makeString(" : ");
        $ic285$ = makeString("\n");
        $ic286$ = makeString("%\n");
        $ic287$ = makeString(": ");
        $ic288$ = makeSymbol("S#55228", "CYC");
        $ic289$ = makeSymbol("S#55232", "CYC");
        $ic290$ = makeSymbol("S#55300", "CYC");
        $ic291$ = makeString("fof(~a,axiom,");
        $ic292$ = makeString(").~%");
        $ic293$ = makeString("fof(~a,conjecture,");
        $ic294$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic295$ = ConsesLow.list((SubLObject)makeSymbol("S#31793", "CYC"), (SubLObject)makeSymbol("S#31794", "CYC"));
        $ic296$ = makeString("(");
        $ic297$ = makeString(" => ");
        $ic298$ = makeString(")");
        $ic299$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic300$ = makeString(" & ");
        $ic301$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic302$ = makeString(" | ");
        $ic303$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic304$ = makeString("(~");
        $ic305$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic306$ = ConsesLow.list((SubLObject)makeSymbol("S#35842", "CYC"), (SubLObject)makeSymbol("S#55333", "CYC"));
        $ic307$ = makeString("(? [~a] : ");
        $ic308$ = constant_handles_oc.f8479((SubLObject)makeString("forAll"));
        $ic309$ = makeString("(! [~a] : ");
        $ic310$ = constant_handles_oc.f8479((SubLObject)makeString("equalSymbols"));
        $ic311$ = makeString(" = ");
        $ic312$ = makeString(",");
        $ic313$ = makeString("))");
        $ic314$ = makeString("unexpected FOL term ~s");
        $ic315$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#55334", "CYC"), (SubLObject)makeSymbol("S#55332", "CYC"));
        $ic316$ = ConsesLow.list((SubLObject)makeSymbol("S#55335", "CYC"), (SubLObject)makeSymbol("S#55336", "CYC"), (SubLObject)makeSymbol("ARITY"));
        $ic317$ = makeString("p_");
        $ic318$ = ConsesLow.list((SubLObject)makeSymbol("S#55337", "CYC"), (SubLObject)makeSymbol("S#55338", "CYC"), (SubLObject)makeSymbol("ARITY"));
        $ic319$ = makeString("f_");
        $ic320$ = makeString("c_zero_arity_function_application_");
        $ic321$ = ConsesLow.list((SubLObject)makeSymbol("S#55339", "CYC"), (SubLObject)makeSymbol("S#55340", "CYC"));
        $ic322$ = makeString("c_");
        $ic323$ = ConsesLow.list((SubLObject)makeSymbol("S#55341", "CYC"), (SubLObject)makeSymbol("S#55342", "CYC"));
        $ic324$ = makeString("s_");
        $ic325$ = ConsesLow.list((SubLObject)makeSymbol("S#55343", "CYC"), (SubLObject)makeSymbol("S#55342", "CYC"));
        $ic326$ = makeString("\"");
        $ic327$ = ConsesLow.list((SubLObject)makeSymbol("S#55344", "CYC"), (SubLObject)makeSymbol("S#55345", "CYC"));
        $ic328$ = makeSymbol("DOUBLE-FLOAT");
        $ic329$ = makeString("n_");
        $ic330$ = ConsesLow.list((SubLObject)makeSymbol("S#55346", "CYC"), (SubLObject)makeSymbol("S#55345", "CYC"));
        $ic331$ = makeSymbol("S#55257", "CYC");
        $ic332$ = makeSymbol("S#55301", "CYC");
        $ic333$ = makeInteger(256);
        $ic334$ = makeString("ls_");
        $ic335$ = makeSymbol("S#55258", "CYC");
        $ic336$ = makeString("tptp_");
        $ic337$ = makeSymbol("S#55259", "CYC");
        $ic338$ = makeInteger(32);
        $ic339$ = makeInteger(126);
        $ic340$ = makeSymbol("S#55260", "CYC");
        $ic341$ = makeKeyword("INCLUDE-HORN");
        $ic342$ = makeKeyword("TERM-TYPES");
        $ic343$ = makeKeyword("ALL");
        $ic344$ = makeKeyword("SKIP");
        $ic345$ = makeString("~S ");
        $ic346$ = makeKeyword("FUNCTION");
        $ic347$ = makeKeyword("TERM");
        $ic348$ = makeSymbol("S#55265", "CYC");
        $ic349$ = makeString("time to handle non-forts");
        $ic350$ = makeString("_P");
        $ic351$ = makeString("_F");
        $ic352$ = makeString("_T");
        $ic353$ = makeString("time to handle ~S");
        $ic354$ = makeSymbol("S#55271", "CYC");
        $ic355$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic356$ = makeSymbol("S#55306", "CYC");
        $ic357$ = ConsesLow.list((SubLObject)makeKeyword("TRANSLATION-TYPE"), (SubLObject)makeKeyword("SET-THEORY"), (SubLObject)makeKeyword("MT-HANDLING"), (SubLObject)makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), (SubLObject)makeKeyword("ISA-HANDLING"), (SubLObject)makeKeyword("UNARY-PREDICATE"), (SubLObject)makeKeyword("STRING-HANDLING"), (SubLObject)makeKeyword("DWIM-TO-SINGLE-CONSTANT"));
        $ic358$ = makeString("opencyc-all-20050422-non-conditional");
        $ic359$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("Individual")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("subOrganizations")), (SubLObject)makeSymbol("?Z"), (SubLObject)makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("hasMembers")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("hasMembers")), (SubLObject)makeSymbol("?Z"), (SubLObject)makeSymbol("?Y")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typePrimaryFunction")), constant_handles_oc.f8479((SubLObject)makeString("Bathtub")), constant_handles_oc.f8479((SubLObject)makeString("TakingABath")), constant_handles_oc.f8479((SubLObject)makeString("deviceUsed")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typeBehaviorIncapable")), constant_handles_oc.f8479((SubLObject)makeString("Doughnut")), constant_handles_oc.f8479((SubLObject)makeString("Talking")), constant_handles_oc.f8479((SubLObject)makeString("doneBy")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("parts")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("parts")), (SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?Z"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("parts")), (SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Z")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("Baseball-Ball")), constant_handles_oc.f8479((SubLObject)makeString("Cube")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("HumanInfant")), constant_handles_oc.f8479((SubLObject)makeString("Doctor-Medical")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("TerrestrialFrameOfReferenceMt")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?CUP"), constant_handles_oc.f8479((SubLObject)makeString("CoffeeCup"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?COFFEE"), constant_handles_oc.f8479((SubLObject)makeString("Coffee-Hot"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("in-ContOpen")), (SubLObject)makeSymbol("?COFFEE"), (SubLObject)makeSymbol("?CUP"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("orientation")), (SubLObject)makeSymbol("?CUP"), constant_handles_oc.f8479((SubLObject)makeString("RightSideUp"))))));
        $ic360$ = _constant_360_initializer();
        $ic361$ = makeInteger(60);
        $ic362$ = makeKeyword("MAX-TIME");
        $ic363$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)NIL, (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic364$ = makeKeyword("FAILURE");
        $ic365$ = makeString("~S~%~s~%~s~%~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4141 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/