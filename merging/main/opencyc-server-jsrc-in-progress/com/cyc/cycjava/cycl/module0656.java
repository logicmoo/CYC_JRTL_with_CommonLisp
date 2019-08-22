package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0656 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0656";
    public static final String myFingerPrint = "bf8bf4fee42d8c40b08961df77d5118e3c2affc30aa1b770b6696a75cb102aaf";
    private static SubLSymbol $g5145$;
    private static SubLSymbol $g5146$;
    private static SubLSymbol $g5147$;
    private static SubLSymbol $g5148$;
    private static SubLSymbol $g5149$;
    private static SubLSymbol $g5150$;
    private static SubLSymbol $g5151$;
    public static SubLSymbol $g5152$;
    public static SubLSymbol $g5153$;
    public static SubLSymbol $g5154$;
    private static SubLSymbol $g5155$;
    private static SubLSymbol $g5156$;
    public static SubLSymbol $g5157$;
    public static SubLSymbol $g5158$;
    public static SubLSymbol $g5159$;
    public static SubLSymbol $g5160$;
    public static SubLSymbol $g5161$;
    private static SubLSymbol $g5162$;
    private static SubLSymbol $g5163$;
    public static SubLSymbol $g5164$;
    private static SubLSymbol $g5165$;
    private static SubLSymbol $g5166$;
    public static SubLSymbol $g5167$;
    private static SubLSymbol $g5168$;
    private static SubLSymbol $g5169$;
    private static SubLSymbol $g5170$;
    public static SubLSymbol $g5171$;
    public static SubLSymbol $g5172$;
    public static SubLSymbol $g5173$;
    public static SubLSymbol $g5174$;
    public static SubLSymbol $g5175$;
    public static SubLSymbol $g5176$;
    public static SubLSymbol $g5177$;
    public static SubLSymbol $g5178$;
    private static SubLSymbol $g5179$;
    private static SubLSymbol $g5180$;
    private static SubLSymbol $g5181$;
    private static SubLSymbol $g5182$;
    private static SubLSymbol $g5183$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLList $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLInteger $ic160$;
    private static final SubLInteger $ic161$;
    private static final SubLInteger $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLInteger $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
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
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLString $ic222$;
    private static final SubLInteger $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLList $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLList $ic233$;
    private static final SubLList $ic234$;
    private static final SubLList $ic235$;
    private static final SubLList $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLList $ic239$;
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
    private static final SubLString $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLList $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLList $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLString $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLString $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLList $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLString $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLString $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLObject $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLString $ic290$;
    private static final SubLList $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLList $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLList $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLInteger $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLString $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLString $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLString $ic307$;
    private static final SubLString $ic308$;
    private static final SubLString $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLString $ic311$;
    private static final SubLString $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLString $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLList $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLString $ic319$;
    private static final SubLString $ic320$;
    private static final SubLString $ic321$;
    private static final SubLString $ic322$;
    private static final SubLInteger $ic323$;
    private static final SubLString $ic324$;
    private static final SubLString $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLObject $ic329$;
    private static final SubLObject $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLString $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    
    
    public static SubLObject f39788(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        PrintLow.format(module0015.$g131$.getDynamicValue(var7), (SubLObject)$ic0$, module0110.$g570$.getDynamicValue(var7), var1);
        if (NIL != var2) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var7), var2, new SubLObject[] { var3, var4, var5, var6 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39789(final SubLObject var8, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var9) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic1$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic2$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g132$.getDynamicValue(var10);
        final SubLObject var12 = module0015.$g535$.currentBinding(var10);
        try {
            module0015.$g535$.bind((SubLObject)T, var10);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var11) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var11));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_12 = module0015.$g533$.currentBinding(var10);
            try {
                module0015.$g533$.bind((SubLObject)T, var10);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic2$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0015.f741();
                module0642.f39020(module0015.$g203$.getGlobalValue());
                final SubLObject var11_13 = module0015.$g537$.currentBinding(var10);
                try {
                    module0015.$g537$.bind((SubLObject)T, var10);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var10), var8, new SubLObject[] { var3, var4, var5, var6, var9 });
                }
                finally {
                    module0015.$g537$.rebind(var11_13, var10);
                }
                module0642.f39020(module0015.$g204$.getGlobalValue());
                f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var11_12, var10);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var12, var10);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39791(final SubLObject var14) {
        final SubLObject var15 = module0538.f33326(var14);
        return f39789((SubLObject)$ic3$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39792(final SubLObject var16, SubLObject var17, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)ONE_INTEGER;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic4$;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic1$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        final SubLObject var20 = module0015.$g535$.currentBinding(var19);
        try {
            module0015.$g535$.bind((SubLObject)T, var19);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39032((SubLObject)ONE_INTEGER);
            if (var17.isInteger()) {
                module0644.f39177(var18);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_19 = module0015.$g533$.currentBinding(var19);
            try {
                module0015.$g533$.bind((SubLObject)T, var19);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019(var16);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var11_19, var19);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var20, var19);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39793(final SubLObject var16, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)T;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0015.$g538$.currentBinding(var21);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var21))) ? module0015.$g538$.getDynamicValue(var21) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var21);
            module0642.f39020((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var21), module0655.$g5142$.getDynamicValue(var21));
            final SubLObject var23 = module0014.f672((SubLObject)$ic5$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var23) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var23);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var16) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var16);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var11_23 = module0015.$g535$.currentBinding(var21);
            try {
                module0015.$g535$.bind((SubLObject)T, var21);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var21)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var21)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic10$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_24 = module0015.$g533$.currentBinding(var21);
                try {
                    module0015.$g533$.bind((SubLObject)T, var21);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic11$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_25 = module0015.$g533$.currentBinding(var21);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var21);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_25, var21);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var16) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var16);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var21));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_26 = module0015.$g533$.currentBinding(var21);
                    final SubLObject var24 = module0015.$g541$.currentBinding(var21);
                    final SubLObject var25 = module0015.$g539$.currentBinding(var21);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var21);
                        module0015.$g541$.bind((SubLObject)T, var21);
                        module0015.$g539$.bind(module0015.f797(), var21);
                        if (NIL != var20) {
                            f39790((SubLObject)$ic15$, (SubLObject)$ic16$);
                        }
                        else {
                            f39790((SubLObject)$ic15$, (SubLObject)$ic17$);
                        }
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0677.f41331();
                        module0015.f799(module0015.$g539$.getDynamicValue(var21));
                    }
                    finally {
                        module0015.$g539$.rebind(var25, var21);
                        module0015.$g541$.rebind(var24, var21);
                        module0015.$g533$.rebind(var11_26, var21);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var11_24, var21);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var11_23, var21);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var22, var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39794(final SubLObject var29) {
        module0642.f39026((SubLObject)TWO_INTEGER);
        final SubLObject var30 = Sequences.cconcatenate((SubLObject)$ic18$, new SubLObject[] { module0006.f203(var29), $ic19$ });
        f39790((SubLObject)$ic15$, var30);
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0677.f41331();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39795(final SubLObject var30) {
        if (var30.eql((SubLObject)$ic20$)) {
            module0642.f39019((SubLObject)$ic21$);
        }
        else if (var30.eql((SubLObject)$ic22$)) {
            module0642.f39019((SubLObject)$ic23$);
        }
        else if (var30.eql((SubLObject)$ic24$)) {
            module0642.f39019((SubLObject)$ic25$);
        }
        else {
            module0642.f39019((SubLObject)$ic26$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39796(final SubLObject var32) {
        if (var32.eql((SubLObject)$ic27$)) {
            module0642.f39019((SubLObject)$ic28$);
        }
        else if (var32.eql((SubLObject)$ic29$)) {
            module0642.f39019((SubLObject)$ic30$);
        }
        else if (var32.eql((SubLObject)$ic24$)) {
            module0642.f39019((SubLObject)$ic25$);
        }
        else {
            module0642.f39019((SubLObject)$ic26$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39797(final SubLObject var33) {
        if (var33.eql((SubLObject)$ic31$)) {
            module0642.f39019((SubLObject)$ic32$);
        }
        else if (var33.eql((SubLObject)$ic33$)) {
            module0642.f39019((SubLObject)$ic34$);
        }
        else if (var33.eql((SubLObject)$ic35$)) {
            module0642.f39019((SubLObject)$ic36$);
        }
        else {
            module0642.f39019((SubLObject)$ic26$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39798(final SubLObject var34) {
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0642.f39019(var34);
        module0642.f39020(module0015.$g241$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39799(final SubLObject var35, SubLObject var36, SubLObject var37) {
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)THREE_INTEGER;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)$ic37$;
        }
        if (NIL != module0167.f10813(var35)) {
            return module0048.f_1_(var36);
        }
        if (NIL != constant_handles_oc.f8449(var35) && Sequences.length(constants_high_oc.f10743(var35)).numG(var37)) {
            return module0048.f_1_(var36);
        }
        if (NIL != constant_handles_oc.f8449(var35)) {
            return var36;
        }
        if (var35.isString() && Sequences.length(var35).numG(var37)) {
            return module0048.f_1_(var36);
        }
        if (var35.isString()) {
            return var36;
        }
        return var36;
    }
    
    public static SubLObject f39800(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        var39.resetMultipleValues();
        final SubLObject var40 = module0051.f3613(var38);
        SubLObject var41 = var39.secondMultipleValue();
        final SubLObject var42 = var39.thirdMultipleValue();
        var39.resetMultipleValues();
        var41 = module0051.f3660(var41);
        PrintLow.format(module0015.$g131$.getDynamicValue(var39), (SubLObject)$ic38$, new SubLObject[] { var41, var40, var42 });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39801(final SubLObject var42) {
        module0642.f39019(module0051.f3634(var42));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39802(final SubLObject var43) {
        if (NIL != module0131.f8548()) {
            final SubLObject var44 = f39803(var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0642.f39020(var44);
        }
        return f39804(var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39805() {
        final SubLObject var45 = $g5145$.getGlobalValue();
        if (NIL != var45) {
            module0034.f1818(var45);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39806(final SubLObject var43, SubLObject var46, SubLObject var47) {
        if (var46 == UNPROVIDED) {
            var46 = module0574.f35152();
        }
        if (var47 == UNPROVIDED) {
            var47 = module0579.$g4262$.getDynamicValue();
        }
        return module0034.f1829($g5145$.getGlobalValue(), (SubLObject)ConsesLow.list(var43, var46, var47), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39807(final SubLObject var43, final SubLObject var46, final SubLObject var47) {
        return f39808(var43, var47, (SubLObject)$ic40$, var46);
    }
    
    public static SubLObject f39803(final SubLObject var43, SubLObject var46, SubLObject var47) {
        if (var46 == UNPROVIDED) {
            var46 = module0574.f35152();
        }
        if (var47 == UNPROVIDED) {
            var47 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var48 = $g5145$.getGlobalValue();
        if (NIL == var48) {
            var48 = module0034.f1934((SubLObject)$ic39$, (SubLObject)$ic41$, (SubLObject)TWENTY_INTEGER, (SubLObject)EQL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var49 = module0034.f1781(var43, var46, var47);
        final SubLObject var50 = module0034.f1814(var48, var49, (SubLObject)UNPROVIDED);
        if (var50 != $ic42$) {
            SubLObject var51 = var50;
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                SubLObject var53 = var52.first();
                final SubLObject var54 = conses_high.second(var52);
                if (var43.eql(var53.first())) {
                    var53 = var53.rest();
                    if (var46.eql(var53.first())) {
                        var53 = var53.rest();
                        if (NIL != var53 && NIL == var53.rest() && var47.eql(var53.first())) {
                            return module0034.f1959(var54);
                        }
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        final SubLObject var55 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f39807(var43, var46, var47)));
        module0034.f1836(var48, var49, var50, var55, (SubLObject)ConsesLow.list(var43, var46, var47));
        return module0034.f1959(var55);
    }
    
    public static SubLObject f39809() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(module0006.f203(module0110.$g127$.getDynamicValue(var7)), (SubLObject)$ic43$);
    }
    
    public static SubLObject f39810() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(module0006.f203(module0110.$g127$.getDynamicValue(var7)), (SubLObject)$ic44$);
    }
    
    public static SubLObject f39811() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(module0006.f203(module0110.$g127$.getDynamicValue(var7)), (SubLObject)$ic45$);
    }
    
    public static SubLObject f39812(final SubLObject var56, final SubLObject var57, final SubLObject var58, SubLObject var59) {
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        module0642.f39032((SubLObject)THREE_INTEGER);
        module0642.f39020(module0015.$g224$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var60), (SubLObject)$ic46$, var56);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019(var58);
        if (NIL != var59) {
            module0642.f39019((SubLObject)$ic47$);
            module0642.f39019(var59);
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var61 = module0015.$g533$.currentBinding(var60);
        try {
            module0015.$g533$.bind((SubLObject)T, var60);
            module0642.f39019(var57);
        }
        finally {
            module0015.$g533$.rebind(var61, var60);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39019((SubLObject)$ic48$);
        module0642.f39020(module0015.$g225$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39813(final SubLObject var60) {
        return module0642.f39019(f39814(var60));
    }
    
    public static SubLObject f39814(final SubLObject var60) {
        return (SubLObject)((NIL != var60) ? $ic49$ : $ic50$);
    }
    
    public static SubLObject f39815() {
        return conses_high.copy_list($g5146$.getGlobalValue());
    }
    
    public static SubLObject f39816() {
        return conses_high.set_difference(f39815(), f39817(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39817() {
        return Sequences.remove((SubLObject)$ic52$, $g5146$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic53$), Symbols.symbol_function((SubLObject)$ic54$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39818() {
        $g5146$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39819(final SubLObject var61, final SubLObject var62, final SubLObject var63, final SubLObject var64) {
        f39820(var61);
        $g5146$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var61, var62, var63, var64, (SubLObject)$ic55$), $g5146$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39821(final SubLObject var61, final SubLObject var62, final SubLObject var63, final SubLObject var64) {
        f39820(var61);
        $g5146$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var61, var62, var63, var64, (SubLObject)$ic52$), $g5146$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39820(final SubLObject var61) {
        $g5146$.setGlobalValue(Sequences.delete(var61, $g5146$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic56$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var61;
    }
    
    public static SubLObject f39822(final SubLObject var61) {
        return conses_high.second(conses_high.assoc(var61, $g5146$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39823(final SubLObject var61) {
        return conses_high.third(conses_high.assoc(var61, $g5146$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39824(final SubLObject var65) {
        return conses_high.assoc(var65, $g5147$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f39825(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)NIL;
        final SubLObject var69 = module0147.$g2094$.currentBinding(var67);
        final SubLObject var70 = module0147.$g2095$.currentBinding(var67);
        try {
            module0147.$g2094$.bind((SubLObject)$ic58$, var67);
            module0147.$g2095$.bind($ic59$, var67);
            final SubLObject var71 = module0269.f17701(var66, (SubLObject)NIL);
            var68 = f39824(var71);
        }
        finally {
            module0147.$g2095$.rebind(var70, var67);
            module0147.$g2094$.rebind(var69, var67);
        }
        return var68;
    }
    
    public static SubLObject f39826(final SubLObject var66, SubLObject var68, SubLObject var69) {
        if (var69 == UNPROVIDED) {
            var69 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        var68 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic60$), var68, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var68 = module0213.f13926(var68, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)T, var69, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var66)) {
            return var68;
        }
        SubLObject var71 = (SubLObject)NIL;
        final SubLObject var72 = module0147.$g2094$.currentBinding(var70);
        final SubLObject var73 = module0147.$g2095$.currentBinding(var70);
        try {
            module0147.$g2094$.bind((SubLObject)$ic58$, var70);
            module0147.$g2095$.bind($ic59$, var70);
            var71 = module0269.f17701(var66, (SubLObject)NIL);
        }
        finally {
            module0147.$g2095$.rebind(var73, var70);
            module0147.$g2094$.rebind(var72, var70);
        }
        final SubLObject var74 = f39824(var71);
        return module0035.f2386(var68, var74, Symbols.symbol_function((SubLObject)EQL), var69);
    }
    
    public static SubLObject f39827(SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        var71 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic61$), var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var71 = module0213.f13926(var71, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0655.$g5113$.getDynamicValue(var72)) {
            final SubLObject var73 = module0139.$g1630$.getDynamicValue(var72);
            final SubLObject var74 = module0139.$g1631$.currentBinding(var72);
            final SubLObject var75 = module0139.$g1632$.currentBinding(var72);
            final SubLObject var76 = module0139.$g1630$.currentBinding(var72);
            try {
                module0139.$g1631$.bind(module0139.f9015(var73, (SubLObject)SIX_INTEGER), var72);
                module0139.$g1632$.bind(module0139.f9016(var73), var72);
                module0139.$g1630$.bind((SubLObject)T, var72);
                var71 = Sort.stable_sort(var71, (SubLObject)$ic62$, (SubLObject)UNPROVIDED);
                var71 = Sort.stable_sort(var71, (SubLObject)$ic63$, (SubLObject)UNPROVIDED);
            }
            finally {
                module0139.$g1630$.rebind(var76, var72);
                module0139.$g1632$.rebind(var75, var72);
                module0139.$g1631$.rebind(var74, var72);
            }
        }
        var71 = module0132.f8605(var71);
        return var71;
    }
    
    public static SubLObject f39828(final SubLObject var73, final SubLObject var74) {
        final SubLObject var75 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), module0161.f10583(var73));
        final SubLObject var76 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), module0161.f10583(var74));
        return module0328.f22177(var76, var75, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39829(final SubLObject var73, final SubLObject var74) {
        final SubLObject var75 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), module0161.f10583(var73));
        final SubLObject var76 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), module0161.f10583(var74));
        return module0328.f22198(var76, var75, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39830(final SubLObject var77) {
        return Sort.sort(var77, Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39831(final SubLObject var78) {
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var81 = var78;
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            final SubLObject var83 = module0161.f10557(var82);
            module0084.f5762(var80, var83, var82);
            var81 = var81.rest();
            var82 = var81.first();
        }
        final SubLObject var84 = module0067.f4902(var80);
        SubLObject var86;
        final SubLObject var85 = var86 = f39827(var84);
        SubLObject var87 = (SubLObject)NIL;
        var87 = var86.first();
        while (NIL != var86) {
            final SubLObject var88 = module0067.f4884(var80, var87, (SubLObject)UNPROVIDED);
            var79 = (SubLObject)ConsesLow.cons(var88, var79);
            var86 = var86.rest();
            var87 = var86.first();
        }
        return Sequences.nreverse(var79);
    }
    
    public static SubLObject f39790(SubLObject var86, SubLObject var87) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic15$;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)$ic67$;
        }
        if (var86.eql((SubLObject)$ic15$)) {
            return module0644.f39180(var87);
        }
        final SubLObject var88 = var86;
        if (var88.eql((SubLObject)$ic68$)) {
            return module0644.f39174(var87, $g5148$.getGlobalValue(), (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
        }
        if (var88.eql((SubLObject)$ic70$)) {
            return module0644.f39174(var87, $g5148$.getGlobalValue(), (SubLObject)$ic71$, (SubLObject)UNPROVIDED);
        }
        final SubLObject var89 = f39832(var86);
        if (NIL != var89) {
            return module0644.f39174(var87, $g5149$.getGlobalValue(), var89, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39833(final SubLObject var89, final SubLObject var90, SubLObject var91, SubLObject var92, SubLObject var93, SubLObject var94) {
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)T;
        }
        assert NIL != Types.keywordp(var89) : var89;
        assert NIL != Types.stringp(var90) : var90;
        if (NIL != var91 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var91)) {
            throw new AssertionError(var91);
        }
        if (NIL != var92 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var92)) {
            throw new AssertionError(var92);
        }
        SubLObject var95 = f39834(var89);
        if (NIL == var95) {
            var95 = (SubLObject)ConsesLow.list(var89, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            $g5150$.setGlobalValue((SubLObject)ConsesLow.cons(var95, $g5150$.getGlobalValue()));
        }
        ConsesLow.set_nth((SubLObject)ONE_INTEGER, var95, var90);
        ConsesLow.set_nth((SubLObject)TWO_INTEGER, var95, var91);
        ConsesLow.set_nth((SubLObject)THREE_INTEGER, var95, var92);
        ConsesLow.set_nth((SubLObject)FOUR_INTEGER, var95, module0035.sublisp_boolean(var93));
        if (NIL != var94) {
            ConsesLow.set_nth((SubLObject)FIVE_INTEGER, var95, (SubLObject)NIL);
        }
        else {
            ConsesLow.set_nth((SubLObject)FIVE_INTEGER, var95, (SubLObject)$ic75$);
        }
        return var89;
    }
    
    public static SubLObject f39835(final SubLObject var89) {
        assert NIL != Types.keywordp(var89) : var89;
        $g5150$.setGlobalValue(Sequences.delete(var89, $g5150$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic76$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var89;
    }
    
    public static SubLObject f39834(final SubLObject var89) {
        assert NIL != Types.keywordp(var89) : var89;
        return conses_high.assoc(var89, $g5150$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39832(final SubLObject var89) {
        if (var89.isKeyword()) {
            return conses_high.second(f39834(var89));
        }
        if (var89.isString()) {
            return var89;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39836(final SubLObject var65, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var65.eql((SubLObject)$ic77$)) {
            final SubLObject var66 = f39832((SubLObject)$ic77$);
            SubLObject var67 = (SubLObject)((NIL != module0543.f33698()) ? $ic78$ : $ic79$);
            SubLObject var68 = (SubLObject)$ic80$;
            if (var3.isCons()) {
                SubLObject var70;
                final SubLObject var69 = var70 = var3;
                SubLObject var71 = (SubLObject)NIL;
                SubLObject var72 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)$ic81$);
                var71 = var70.first();
                var70 = (var72 = var70.rest());
                if (var71.isString()) {
                    final SubLObject var73 = Packages.find_symbol(Strings.string_upcase(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                    if (var73.isSymbol() && NIL != Symbols.fboundp(var73) && NIL != module0015.f874(var73)) {
                        var67 = var71;
                        SubLObject var74 = var72;
                        SubLObject var75 = (SubLObject)NIL;
                        var75 = var74.first();
                        while (NIL != var74) {
                            if (var75.isCons()) {
                                var68 = Sequences.cconcatenate(var68, Sequences.cconcatenate((SubLObject)$ic82$, new SubLObject[] { module0006.f203(var75.first()), $ic83$, module0006.f203(conses_high.second(var75)) }));
                            }
                            else {
                                var68 = Sequences.cconcatenate(var68, Sequences.cconcatenate((SubLObject)$ic82$, module0006.f203(var75)));
                            }
                            var74 = var74.rest();
                            var75 = var74.first();
                        }
                    }
                }
            }
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g407$.getGlobalValue());
            module0642.f39020(module0015.$g412$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var66);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g414$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            f39788(var67, (SubLObject)$ic3$, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var76 = f39834(var65);
            if (NIL != var76) {
                SubLObject var78;
                final SubLObject var77 = var78 = var76;
                SubLObject var79 = (SubLObject)NIL;
                SubLObject var80 = (SubLObject)NIL;
                SubLObject var81 = (SubLObject)NIL;
                SubLObject var82 = (SubLObject)NIL;
                SubLObject var83 = (SubLObject)NIL;
                SubLObject var84 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic84$);
                var79 = var78.first();
                var78 = var78.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic84$);
                var80 = var78.first();
                var78 = var78.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic84$);
                var81 = var78.first();
                var78 = var78.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic84$);
                var82 = var78.first();
                var78 = var78.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic84$);
                var83 = var78.first();
                var78 = var78.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)$ic84$);
                var84 = var78.first();
                var78 = var78.rest();
                if (NIL == var78) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g407$.getGlobalValue());
                    module0642.f39020(module0015.$g412$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var80);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var83) {
                        module0642.f39046(module0015.$g409$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g414$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    f39788(var81, var82, var3, var4, var5, var6);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var84) {
                        module0642.f39020(module0015.$g413$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var84);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)$ic84$);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39837(final SubLObject var65, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var9) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLObject var66 = f39838(var65);
        if (NIL != var66) {
            final SubLObject var68;
            final SubLObject var67 = var68 = f39839(var65);
            if (var68.eql((SubLObject)ZERO_INTEGER)) {
                Functions.funcall(var66);
            }
            else if (var68.eql((SubLObject)ONE_INTEGER)) {
                Functions.funcall(var66, var3);
            }
            else if (var68.eql((SubLObject)TWO_INTEGER)) {
                Functions.funcall(var66, var3, var4);
            }
            else if (var68.eql((SubLObject)THREE_INTEGER)) {
                Functions.funcall(var66, var3, var4, var5);
            }
            else if (var68.eql((SubLObject)FOUR_INTEGER)) {
                Functions.funcall(var66, var3, var4, var5, var6);
            }
            else {
                Functions.funcall(var66, var3, var4, var5, var6, var9);
            }
        }
        else {
            Errors.error((SubLObject)$ic123$, var65);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39840(final SubLObject var65, final SubLObject var109, final SubLObject var108) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(var65) : var65;
        assert NIL != Types.symbolp(var109) : var109;
        assert NIL != Types.fixnump(var108) : var108;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && !var108.numLE($g5151$.getGlobalValue())) {
            Errors.error((SubLObject)$ic126$, var109, var108);
        }
        Symbols.put(var65, (SubLObject)$ic127$, var109);
        Symbols.put(var65, (SubLObject)$ic128$, var108);
        return var65;
    }
    
    public static SubLObject f39838(final SubLObject var65) {
        return Symbols.get(var65, (SubLObject)$ic127$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39839(final SubLObject var65) {
        return Symbols.get(var65, (SubLObject)$ic128$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39841(final SubLObject var110, SubLObject var111, SubLObject var112) {
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        if (NIL == var111) {
            var111 = constants_high_oc.f10743(var110);
        }
        SubLObject var114 = $g5152$.getDynamicValue(var113);
        final SubLObject var115 = module0655.$g5132$.getDynamicValue(var113);
        module0659.f40116((SubLObject)$ic130$, var115, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0659.f40116((SubLObject)$ic131$, var115, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var115 == $ic68$) {
            var114 = Sequences.cconcatenate((SubLObject)$ic132$, module0006.f203($g5152$.getDynamicValue(var113)));
        }
        final SubLObject var116 = f39832(var115);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var113), (SubLObject)$ic133$, var114, f39842(var110));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var116) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var116);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var117 = module0015.$g533$.currentBinding(var113);
        try {
            module0015.$g533$.bind((SubLObject)T, var113);
            if (NIL != var112) {
                final SubLObject var118 = module0014.f697(var112);
                final SubLObject var119 = (SubLObject)$ic68$;
                final SubLObject var120 = (NIL != var111) ? var111 : module0014.f694(var112);
                final SubLObject var121 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var118);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var120) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var120);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var119) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var119));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var121) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var121);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_118 = module0015.$g533$.currentBinding(var113);
                try {
                    module0015.$g533$.bind((SubLObject)T, var113);
                }
                finally {
                    module0015.$g533$.rebind(var11_118, var113);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            else if (NIL != constant_handles_oc.f8463(var110, (SubLObject)UNPROVIDED)) {
                module0642.f39019(var111);
            }
            else {
                module0642.f39041(var111, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var117, var113);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var110;
    }
    
    public static SubLObject f39843(final SubLObject var119, SubLObject var120) {
        if (var120 == UNPROVIDED) {
            var120 = $g5153$.getDynamicValue();
        }
        return Sequences.cconcatenate(module0006.f203(f39844(module0205.f13144(var119))), new SubLObject[] { $ic139$, module0006.f203(var120) });
    }
    
    public static SubLObject f39845(final SubLObject var121, SubLObject var111, SubLObject var112) {
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        final SubLThread var122 = SubLProcess.currentSubLThread();
        if (NIL == var111) {
            var111 = (SubLObject)$ic140$;
        }
        SubLObject var123 = $g5152$.getDynamicValue(var122);
        final SubLObject var124 = module0655.$g5132$.getDynamicValue(var122);
        final SubLObject var125 = Sequences.cconcatenate(module0006.f203(module0652.$g5069$.getDynamicValue(var122)), module0006.f203(f39843(var121, (SubLObject)UNPROVIDED)));
        module0659.f40116((SubLObject)$ic130$, var124, var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0659.f40116((SubLObject)$ic137$, var124, var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var124 == $ic68$) {
            var123 = Sequences.cconcatenate((SubLObject)$ic132$, module0006.f203($g5152$.getDynamicValue(var122)));
        }
        final SubLObject var126 = f39832(var124);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var122), (SubLObject)$ic133$, var123, f39842(var121));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g386$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic80$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var126) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var126);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var125) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var125);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var127 = module0015.$g533$.currentBinding(var122);
        try {
            module0015.$g533$.bind((SubLObject)T, var122);
            if (NIL != var112) {
                module0642.f39020(module0015.$g459$.getGlobalValue());
                final SubLObject var128 = module0014.f697(var112);
                final SubLObject var129 = (SubLObject)$ic141$;
                final SubLObject var130 = module0014.f694(var112);
                final SubLObject var131 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var128);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var130) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var130);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var129) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var129));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var131) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var131);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_123 = module0015.$g533$.currentBinding(var122);
                try {
                    module0015.$g533$.bind((SubLObject)T, var122);
                }
                finally {
                    module0015.$g533$.rebind(var11_123, var122);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39019(var111);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            else {
                module0642.f39019(var111);
            }
        }
        finally {
            module0015.$g533$.rebind(var127, var122);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var121;
    }
    
    public static SubLObject f39846(final SubLObject var121, SubLObject var111) {
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        return f39837((SubLObject)$ic137$, var121, var111, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39847(final SubLObject var124, SubLObject var111, SubLObject var112) {
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        if (var112 == UNPROVIDED) {
            var112 = (SubLObject)NIL;
        }
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (NIL == var111) {
            var111 = (SubLObject)$ic140$;
        }
        SubLObject var126 = $g5154$.getDynamicValue(var125);
        final SubLObject var127 = module0655.$g5132$.getDynamicValue(var125);
        final SubLObject var128 = Sequences.cconcatenate(module0006.f203(module0652.$g5069$.getDynamicValue(var125)), module0006.f203(f39843(var124, (SubLObject)UNPROVIDED)));
        module0659.f40116((SubLObject)$ic145$, var127, var124, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var127 == $ic68$) {
            var126 = Sequences.cconcatenate((SubLObject)$ic132$, module0006.f203($g5154$.getDynamicValue(var125)));
        }
        final SubLObject var129 = f39832(var127);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var125), (SubLObject)$ic133$, var126, f39844(var124));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g386$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic80$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var129) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var129);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var128) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var128);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var130 = module0015.$g533$.currentBinding(var125);
        try {
            module0015.$g533$.bind((SubLObject)T, var125);
            if (NIL != var112) {
                module0642.f39020(module0015.$g459$.getGlobalValue());
                final SubLObject var131 = module0014.f697(var112);
                final SubLObject var132 = (SubLObject)$ic141$;
                final SubLObject var133 = module0014.f694(var112);
                final SubLObject var134 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var131);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var133) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var133);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var132) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var132));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var134) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var134);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_125 = module0015.$g533$.currentBinding(var125);
                try {
                    module0015.$g533$.bind((SubLObject)T, var125);
                }
                finally {
                    module0015.$g533$.rebind(var11_125, var125);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39019(var111);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            else {
                module0642.f39019(var111);
            }
        }
        finally {
            module0015.$g533$.rebind(var130, var125);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var124;
    }
    
    public static SubLObject f39848(final SubLObject var110) {
        final SubLObject var111 = module0770.f49049(var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f39837((SubLObject)$ic131$, var110, var111, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39849(final SubLObject var121) {
        final SubLObject var122 = module0167.f10803(var121);
        if (!var122.isInteger()) {
            return module0642.f39019((SubLObject)$ic149$);
        }
        final SubLObject var123 = Sequences.cconcatenate((SubLObject)$ic150$, new SubLObject[] { module0006.f205(var122), $ic151$ });
        return f39837((SubLObject)$ic137$, var121, var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39850(final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5134$.getDynamicValue(var128)) {
            Functions.funcall(module0655.$g5134$.getDynamicValue(var128), var127);
        }
        SubLObject var129 = (SubLObject)$ic154$;
        final SubLObject var130 = module0655.$g5133$.getDynamicValue(var128);
        SubLObject var131 = (SubLObject)NIL;
        if (var130 == $ic68$) {
            var129 = (SubLObject)$ic155$;
        }
        if (NIL != module0655.$g5110$.getDynamicValue(var128)) {
            var131 = f39851(var127);
        }
        f39852(var127, var129, var130, var131);
        return var127;
    }
    
    public static SubLObject f39852(final SubLObject var127, final SubLObject var1, final SubLObject var88, final SubLObject var128) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = assertion_handles_oc.f11025(var127);
        final SubLObject var131 = (NIL != module0178.f11375(var127) && NIL != module0674.f41166(var127)) ? module0652.$g5072$.getDynamicValue(var129) : module0652.$g5073$.getDynamicValue(var129);
        final SubLObject var132 = (SubLObject)((NIL != module0178.f11290(var127)) ? module0652.$g5068$.getDynamicValue(var129) : $ic80$);
        final SubLObject var133 = Sequences.cconcatenate(module0652.$g5067$.getDynamicValue(var129), new SubLObject[] { var131, var132 });
        final SubLObject var134 = (SubLObject)((NIL != var128) ? module0642.f39017(var128, (SubLObject)T) : NIL);
        final SubLObject var135 = (SubLObject)((NIL != module0015.f794((SubLObject)UNPROVIDED)) ? module0015.f793((SubLObject)UNPROVIDED) : $ic80$);
        final SubLObject var136 = f39832(var88);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var129), (SubLObject)$ic133$, var1, var130);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var134) {
            module0642.f39020(module0015.$g386$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var134);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var136) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var136);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var133) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var133);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020((SubLObject)$ic158$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var130);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic159$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var135);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var137 = module0015.$g533$.currentBinding(var129);
        try {
            module0015.$g533$.bind((SubLObject)T, var129);
            f39853(var127, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var137, var129);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0659.f40116((SubLObject)$ic156$, var88, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39854(final SubLObject var127) {
        if (NIL != module0178.f11290(var127)) {
            final SubLObject var128 = module0414.f28917(var127);
            if (var128.numLE((SubLObject)$ic160$)) {
                return f39855(Numbers.minus(var128), (SubLObject)$ic161$);
            }
            if (var128.numGE((SubLObject)$ic37$)) {
                return f39856(var128, (SubLObject)$ic161$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39857() {
        final SubLObject var45 = $g5155$.getGlobalValue();
        if (NIL != var45) {
            module0034.f1818(var45);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39858(final SubLObject var87, SubLObject var135) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)$ic162$;
        }
        return module0034.f1829($g5155$.getGlobalValue(), (SubLObject)ConsesLow.list(var87, var135), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39859(final SubLObject var87, final SubLObject var135) {
        final SubLObject var136 = Numbers.min((SubLObject)$ic164$, Numbers.integerDivide(Numbers.multiply((SubLObject)$ic162$, var87), var135));
        final SubLObject var137 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic165$, module0038.f2792(Numbers.integerDivide(var136, (SubLObject)SIXTEEN_INTEGER)), module0038.f2792(Numbers.mod(var136, (SubLObject)SIXTEEN_INTEGER)));
        return var137;
    }
    
    public static SubLObject f39855(final SubLObject var87, SubLObject var135) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)$ic162$;
        }
        SubLObject var136 = $g5155$.getGlobalValue();
        if (NIL == var136) {
            var136 = module0034.f1934((SubLObject)$ic163$, (SubLObject)$ic166$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var137 = module0034.f1782(var87, var135);
        final SubLObject var138 = module0034.f1814(var136, var137, (SubLObject)UNPROVIDED);
        if (var138 != $ic42$) {
            SubLObject var139 = var138;
            SubLObject var140 = (SubLObject)NIL;
            var140 = var139.first();
            while (NIL != var139) {
                SubLObject var141 = var140.first();
                final SubLObject var142 = conses_high.second(var140);
                if (var87.equal(var141.first())) {
                    var141 = var141.rest();
                    if (NIL != var141 && NIL == var141.rest() && var135.equal(var141.first())) {
                        return module0034.f1959(var142);
                    }
                }
                var139 = var139.rest();
                var140 = var139.first();
            }
        }
        final SubLObject var143 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f39859(var87, var135)));
        module0034.f1836(var136, var137, var138, var143, (SubLObject)ConsesLow.list(var87, var135));
        return module0034.f1959(var143);
    }
    
    public static SubLObject f39860() {
        final SubLObject var45 = $g5156$.getGlobalValue();
        if (NIL != var45) {
            module0034.f1818(var45);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39861(final SubLObject var87, SubLObject var135) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)$ic162$;
        }
        return module0034.f1829($g5156$.getGlobalValue(), (SubLObject)ConsesLow.list(var87, var135), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39862(final SubLObject var87, final SubLObject var135) {
        final SubLObject var136 = Numbers.min((SubLObject)$ic164$, Numbers.integerDivide(Numbers.multiply((SubLObject)$ic162$, var87), var135));
        final SubLObject var137 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic168$, module0038.f2792(Numbers.integerDivide(var136, (SubLObject)SIXTEEN_INTEGER)), module0038.f2792(Numbers.mod(var136, (SubLObject)SIXTEEN_INTEGER)));
        return var137;
    }
    
    public static SubLObject f39856(final SubLObject var87, SubLObject var135) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)$ic162$;
        }
        SubLObject var136 = $g5156$.getGlobalValue();
        if (NIL == var136) {
            var136 = module0034.f1934((SubLObject)$ic167$, (SubLObject)$ic169$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var137 = module0034.f1782(var87, var135);
        final SubLObject var138 = module0034.f1814(var136, var137, (SubLObject)UNPROVIDED);
        if (var138 != $ic42$) {
            SubLObject var139 = var138;
            SubLObject var140 = (SubLObject)NIL;
            var140 = var139.first();
            while (NIL != var139) {
                SubLObject var141 = var140.first();
                final SubLObject var142 = conses_high.second(var140);
                if (var87.equal(var141.first())) {
                    var141 = var141.rest();
                    if (NIL != var141 && NIL == var141.rest() && var135.equal(var141.first())) {
                        return module0034.f1959(var142);
                    }
                }
                var139 = var139.rest();
                var140 = var139.first();
            }
        }
        final SubLObject var143 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f39862(var87, var135)));
        module0034.f1836(var136, var137, var138, var143, (SubLObject)ConsesLow.list(var87, var135));
        return module0034.f1959(var143);
    }
    
    public static SubLObject f39863(final SubLObject var127, SubLObject var139) {
        if (var139 == UNPROVIDED) {
            var139 = (SubLObject)$ic68$;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5134$.getDynamicValue(var140)) {
            Functions.funcall(module0655.$g5134$.getDynamicValue(var140), var127);
        }
        SubLObject var141 = (SubLObject)$ic154$;
        final SubLObject var142 = module0655.$g5133$.getDynamicValue(var140);
        SubLObject var143 = (SubLObject)NIL;
        if (var142 == $ic68$) {
            var141 = (SubLObject)$ic155$;
        }
        if (NIL != module0655.$g5110$.getDynamicValue(var140)) {
            var143 = f39851(var127);
        }
        final SubLObject var144 = f39832(var142);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic133$, var141, assertion_handles_oc.f11025(var127));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var143) {
            module0642.f39020(module0015.$g386$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var143);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var144) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var144);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var145 = module0015.$g533$.currentBinding(var140);
        try {
            module0015.$g533$.bind((SubLObject)T, var140);
            f39853(var127, var139);
        }
        finally {
            module0015.$g533$.rebind(var145, var140);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var127;
    }
    
    public static SubLObject f39864(final SubLObject var127) {
        SubLObject var128 = (SubLObject)NIL;
        if (NIL != module0178.f11341(var127)) {
            var128 = (SubLObject)$ic35$;
        }
        else if (NIL != module0178.f11290(var127)) {
            if (NIL != module0178.f11314(var127)) {
                var128 = (SubLObject)$ic31$;
            }
            else {
                var128 = (SubLObject)$ic33$;
            }
        }
        else if (NIL != module0178.f11343(var127, (SubLObject)$ic22$)) {
            var128 = (SubLObject)$ic22$;
        }
        else if ($ic24$ == module0178.f11292(var127)) {
            var128 = (SubLObject)$ic24$;
        }
        else if (NIL == module0178.f11375(var127)) {
            var128 = (SubLObject)$ic174$;
        }
        else if (NIL == module0035.f1997(module0178.f11299(var127))) {
            var128 = (SubLObject)$ic181$;
        }
        else if (module0178.f11293(var127) == $ic29$) {
            var128 = (SubLObject)$ic29$;
        }
        else {
            var128 = (SubLObject)$ic27$;
        }
        return var128;
    }
    
    public static SubLObject f39853(final SubLObject var127, SubLObject var139) {
        if (var139 == UNPROVIDED) {
            var139 = (SubLObject)$ic68$;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        final SubLObject var141 = f39864(var127);
        if (NIL != module0655.$g5112$.getDynamicValue(var140)) {
            final SubLObject var142 = module0014.f697(var141);
            final SubLObject var115_141 = (SubLObject)((NIL != var139) ? var139 : $ic68$);
            final SubLObject var143 = (SubLObject)$ic80$;
            final SubLObject var144 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var142);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var143) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var143);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var115_141) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var115_141));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var144) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var144);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var145 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)T, var140);
            }
            finally {
                module0015.$g533$.rebind(var145, var140);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        else {
            final SubLObject var142 = module0014.f697(var141);
            final SubLObject var115_142 = (SubLObject)((NIL != var139) ? var139 : $ic68$);
            final SubLObject var143 = module0014.f694(var141);
            final SubLObject var144 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var142);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var143) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var143);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var115_142) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var115_142));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var144) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var144);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var145 = module0015.$g533$.currentBinding(var140);
            try {
                module0015.$g533$.bind((SubLObject)T, var140);
            }
            finally {
                module0015.$g533$.rebind(var145, var140);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39851(final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        final SubLObject var129 = module0178.f11295(var127);
        final SubLObject var130 = module0178.f11296(var127);
        final SubLObject var131 = module0178.f11297(var127);
        final SubLObject var132 = module0178.f11298(var127);
        final SubLObject var133 = module0178.f11375(var127);
        final SubLObject var134 = module0178.f11287(var127);
        final SubLObject var135 = module0178.f11290(var127);
        final SubLObject var136 = module0178.f11314(var127);
        final SubLObject var137 = Equality.eq(module0178.f11293(var127), (SubLObject)$ic29$);
        SubLObject var138 = (SubLObject)NIL;
        if (NIL != var137) {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic190$, var138);
        }
        if (NIL != var136) {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic191$, var138);
        }
        else {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic192$, var138);
        }
        if (NIL != var135) {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic193$, var138);
        }
        else {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic194$, var138);
        }
        if (NIL != var133) {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic195$, var138);
            var138 = (SubLObject)ConsesLow.cons(f39865(var134), var138);
            if (NIL != module0173.f10969(var129)) {
                var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic196$, var138);
                var138 = (SubLObject)ConsesLow.cons((NIL != module0131.f8548()) ? module0770.f49049(var129, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : constants_high_oc.f10743(var129), var138);
                if (NIL != var130) {
                    var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic197$, var138);
                    var128.resetMultipleValues();
                    final SubLObject var139 = module0051.f3613(var130);
                    SubLObject var140 = var128.secondMultipleValue();
                    final SubLObject var141 = var128.thirdMultipleValue();
                    var128.resetMultipleValues();
                    var140 = module0051.f3660(var140);
                    var138 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(module0006.f203(var140), new SubLObject[] { $ic198$, module0006.f203(var139), $ic199$, module0006.f203(var141) }), var138);
                }
                if (NIL != var132) {
                    var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic200$, var138);
                    var138 = (SubLObject)ConsesLow.cons(module0051.f3634(var132), var138);
                }
                if (NIL != module0173.f10969(var131)) {
                    var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic201$, var138);
                    var138 = (SubLObject)ConsesLow.cons(constants_high_oc.f10743(var131), var138);
                }
                if (NIL != module0178.f11376(var127)) {
                    var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic202$, var138);
                }
            }
        }
        else {
            var138 = (SubLObject)ConsesLow.cons((SubLObject)$ic203$, var138);
            var138 = (SubLObject)ConsesLow.cons(f39865(var134), var138);
        }
        return module0038.f2812(module0038.f2735(Functions.apply(Symbols.symbol_function((SubLObject)$ic204$), Sequences.nreverse(var138))));
    }
    
    public static SubLObject f39866(final SubLObject var152, SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = (SubLObject)NIL;
        }
        final SubLThread var154 = SubLProcess.currentSubLThread();
        SubLObject var155 = (SubLObject)$ic205$;
        final SubLObject var156 = module0655.$g5133$.getDynamicValue(var154);
        if (var156 == $ic68$) {
            var155 = (SubLObject)$ic206$;
        }
        final SubLObject var157 = f39832(var156);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var154), (SubLObject)((NIL != var153) ? $ic207$ : $ic133$), var155, module0655.f39759(var152));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var157) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var157);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var158 = module0015.$g533$.currentBinding(var154);
        try {
            module0015.$g533$.bind((SubLObject)T, var154);
            f39867(var152);
        }
        finally {
            module0015.$g533$.rebind(var158, var154);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var152;
    }
    
    public static SubLObject f39867(final SubLObject var152) {
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = module0014.f697((SubLObject)$ic210$);
        final SubLObject var155 = (SubLObject)$ic68$;
        final SubLObject var156 = module0014.f694((SubLObject)$ic210$);
        final SubLObject var157 = (SubLObject)ZERO_INTEGER;
        module0642.f39020(module0015.$g431$.getGlobalValue());
        module0642.f39020(module0015.$g440$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var154);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var156) {
            module0642.f39020(module0015.$g437$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var156);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var155) {
            module0642.f39020(module0015.$g438$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049(var155));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var157) {
            module0642.f39020(module0015.$g439$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var157);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var158 = module0015.$g533$.currentBinding(var153);
        try {
            module0015.$g533$.bind((SubLObject)T, var153);
        }
        finally {
            module0015.$g533$.rebind(var158, var153);
        }
        module0642.f39020(module0015.$g432$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39868(SubLObject var86) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        if (NIL == var86) {
            if (NIL != module0655.$g5109$.getDynamicValue(var87)) {
                var86 = (SubLObject)$ic92$;
            }
            else {
                var86 = (SubLObject)$ic77$;
            }
        }
        return var86;
    }
    
    public static SubLObject f39869(final SubLObject var154, SubLObject var86, SubLObject var155) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)NIL;
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5077$.getDynamicValue(var156)) {
            final SubLObject var157 = f39868(var86);
            final SubLObject var158 = f39832(var157);
            final SubLObject var159 = module0014.f690(var154);
            final SubLObject var160 = (NIL != var155) ? var155 : module0014.f688(var154);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var159);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var158) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var158);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var161 = module0015.$g533$.currentBinding(var156);
            try {
                module0015.$g533$.bind((SubLObject)T, var156);
                final SubLObject var162 = module0014.f697((SubLObject)$ic213$);
                final SubLObject var163 = (SubLObject)$ic68$;
                final SubLObject var164 = module0014.f694((SubLObject)$ic213$);
                final SubLObject var165 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var162);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var164) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var164);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var163) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var163));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var165) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var165);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_160 = module0015.$g533$.currentBinding(var156);
                try {
                    module0015.$g533$.bind((SubLObject)T, var156);
                }
                finally {
                    module0015.$g533$.rebind(var11_160, var156);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var161, var156);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39870(final SubLObject var161, SubLObject var162, SubLObject var16) {
        if (var162 == UNPROVIDED) {
            var162 = (SubLObject)$ic15$;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLThread var163 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5077$.getDynamicValue(var163)) {
            if (var161.isKeyword()) {
                f39869(var161, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                Errors.warn((SubLObject)$ic216$, var161);
            }
            module0642.f39032((SubLObject)UNPROVIDED);
        }
        if (NIL != var16) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(var16);
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39804(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        final SubLObject var167 = Structures.method_func(var163, $g5160$.getGlobalValue());
        if (NIL != var167) {
            return Functions.funcall(var167, var163, var164, var165);
        }
        module0642.f39020(module0015.$g459$.getGlobalValue());
        if (NIL != module0004.f104(var163, $g5161$.getDynamicValue(var166), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var168 = (SubLObject)$ic217$;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var168) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var168));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var169 = module0015.$g533$.currentBinding(var166);
            try {
                module0015.$g533$.bind((SubLObject)T, var166);
                module0642.f39024(var163);
            }
            finally {
                module0015.$g533$.rebind(var169, var166);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        else {
            module0642.f39024(var163);
        }
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39871(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g459$.getGlobalValue());
        if (NIL != module0004.f104(var163, $g5161$.getDynamicValue(var166), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var167 = (SubLObject)$ic217$;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var167) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var167));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var168 = module0015.$g533$.currentBinding(var166);
            try {
                module0015.$g533$.bind((SubLObject)T, var166);
                module0642.f39024(var163);
            }
            finally {
                module0015.$g533$.rebind(var168, var166);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        else {
            module0642.f39024(var163);
        }
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39872(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        f39837((SubLObject)$ic131$, var163, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39873(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        if (NIL == var164) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var167 = module0172.f10915(var163);
        if (NIL != var167) {
            final SubLObject var168 = $g5157$.currentBinding(var166);
            final SubLObject var169 = $g5153$.currentBinding(var166);
            try {
                $g5157$.bind(var163, var166);
                $g5153$.bind((SubLObject)((NIL != module0015.f794((SubLObject)UNPROVIDED)) ? module0015.f793((SubLObject)UNPROVIDED) : NIL), var166);
                final SubLObject var170 = f39843(var163, (SubLObject)UNPROVIDED);
                if (NIL != $g5153$.getDynamicValue(var166)) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    if (NIL != var170) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var170);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != module0652.$g5069$.getDynamicValue(var166)) {
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0652.$g5069$.getDynamicValue(var166));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_170 = module0015.$g533$.currentBinding(var166);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var166);
                        f39804(var167, var164, var165);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_170, var166);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                else {
                    f39804(var167, var164, var165);
                }
            }
            finally {
                $g5153$.rebind(var169, var166);
                $g5157$.rebind(var168, var166);
            }
        }
        else {
            f39837((SubLObject)$ic152$, var163, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39874(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        if (NIL == var164) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (NIL != var165) {
            if (!var164.numE((SubLObject)ZERO_INTEGER)) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            module0642.f39032(Numbers.multiply((SubLObject)TWO_INTEGER, var164));
        }
        if (NIL != module0178.f11361(var163, (SubLObject)UNPROVIDED)) {
            f39875(var163, var164, var165);
        }
        else {
            f39876(var163, var164, var165);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39875(final SubLObject var127, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        final SubLObject var167 = module0018.$g582$.currentBinding(var166);
        final SubLObject var168 = $g5161$.currentBinding(var166);
        try {
            module0018.$g582$.bind(module0178.f11294(var127), var166);
            $g5161$.bind((SubLObject)((NIL != module0178.f11290(var127)) ? module0211.f13733(var127) : NIL), var166);
            f39877(var127, module0178.f11303(var127), var164, var165);
        }
        finally {
            $g5161$.rebind(var168, var166);
            module0018.$g582$.rebind(var167, var166);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39876(final SubLObject var127, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        module0642.f39019((SubLObject)$ic222$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39877(final SubLObject var127, final SubLObject var171, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var172 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (NIL != module0652.$g5065$.getDynamicValue(var172)) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0652.$g5065$.getDynamicValue(var172));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var173 = module0015.$g533$.currentBinding(var172);
        try {
            module0015.$g533$.bind((SubLObject)T, var172);
            f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var11_172 = $g5158$.currentBinding(var172);
            try {
                $g5158$.bind((SubLObject)T, var172);
                final SubLObject var174 = module0147.f9540(module0178.f11287(var127));
                final SubLObject var11_173 = module0147.$g2095$.currentBinding(var172);
                final SubLObject var175 = module0147.$g2094$.currentBinding(var172);
                final SubLObject var176 = module0147.$g2096$.currentBinding(var172);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var174), var172);
                    module0147.$g2094$.bind(module0147.f9546(var174), var172);
                    module0147.$g2096$.bind(module0147.f9549(var174), var172);
                    f39804(var171, Numbers.add(var164, (SubLObject)ONE_INTEGER), var165);
                }
                finally {
                    module0147.$g2096$.rebind(var176, var172);
                    module0147.$g2094$.rebind(var175, var172);
                    module0147.$g2095$.rebind(var11_173, var172);
                }
            }
            finally {
                $g5158$.rebind(var11_172, var172);
            }
        }
        finally {
            module0015.$g533$.rebind(var173, var172);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39878(final SubLObject var127, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        return f39877(var127, module0543.f33671(var127), var164, var165);
    }
    
    public static SubLObject f39879(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (NIL != module0652.$g5071$.getDynamicValue(var166)) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0652.$g5071$.getDynamicValue(var166));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var167 = module0015.$g533$.currentBinding(var166);
        try {
            module0015.$g533$.bind((SubLObject)T, var166);
            if (NIL != var165 && NIL != module0015.$g537$.getDynamicValue(var166) && Sequences.length(var163).numG($g5162$.getDynamicValue(var166))) {
                module0015.f740();
                module0642.f39020(module0015.$g204$.getGlobalValue());
                final SubLObject var11_175 = module0015.$g537$.currentBinding(var166);
                try {
                    module0015.$g537$.bind((SubLObject)NIL, var166);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var11_176 = module0015.$g534$.currentBinding(var166);
                    try {
                        module0015.$g534$.bind((SubLObject)T, var166);
                        module0642.f39033(var163);
                    }
                    finally {
                        module0015.$g534$.rebind(var11_176, var166);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g537$.rebind(var11_175, var166);
                }
                module0642.f39020(module0015.$g203$.getGlobalValue());
            }
            else {
                module0642.f39033(var163);
            }
        }
        finally {
            module0015.$g533$.rebind(var167, var166);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39880(final SubLObject var163, final SubLObject var177, final SubLObject var164) {
        final SubLThread var178 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_level$.getDynamicValue(var178) && var164.numG(print_high.$print_level$.getDynamicValue(var178))) {
            print_high.princ((SubLObject)$ic47$, var177);
        }
        else if (NIL != print_high.$print_readably$.getDynamicValue(var178)) {
            print_high.print_not_readable(var163, var177);
        }
        else {
            streams_high.write_string((SubLObject)$ic228$, var177, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var163), new SubLObject[] { $ic229$, var177 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var177);
            print_high.princ(f39881(var163), var177);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var177);
        }
        return var163;
    }
    
    public static SubLObject f39882(final SubLObject var182, final SubLObject var177) {
        f39880(var182, var177, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39883(final SubLObject var182) {
        return (SubLObject)((var182.getClass() == $sX43764_native.class) ? T : NIL);
    }
    
    public static SubLObject f39881(final SubLObject var182) {
        assert NIL != f39883(var182) : var182;
        return var182.getField2();
    }
    
    public static SubLObject f39884(final SubLObject var182) {
        assert NIL != f39883(var182) : var182;
        return var182.getField3();
    }
    
    public static SubLObject f39885(final SubLObject var182) {
        assert NIL != f39883(var182) : var182;
        return var182.getField4();
    }
    
    public static SubLObject f39886(final SubLObject var182) {
        assert NIL != f39883(var182) : var182;
        return var182.getField5();
    }
    
    public static SubLObject f39887(final SubLObject var182, final SubLObject var183) {
        assert NIL != f39883(var182) : var182;
        return var182.setField2(var183);
    }
    
    public static SubLObject f39888(final SubLObject var182, final SubLObject var183) {
        assert NIL != f39883(var182) : var182;
        return var182.setField3(var183);
    }
    
    public static SubLObject f39889(final SubLObject var182, final SubLObject var183) {
        assert NIL != f39883(var182) : var182;
        return var182.setField4(var183);
    }
    
    public static SubLObject f39890(final SubLObject var182, final SubLObject var183) {
        assert NIL != f39883(var182) : var182;
        return var182.setField5(var183);
    }
    
    public static SubLObject f39891(SubLObject var184) {
        if (var184 == UNPROVIDED) {
            var184 = (SubLObject)NIL;
        }
        final SubLObject var185 = (SubLObject)new $sX43764_native();
        SubLObject var186;
        SubLObject var187;
        SubLObject var188;
        SubLObject var189;
        for (var186 = (SubLObject)NIL, var186 = var184; NIL != var186; var186 = conses_high.cddr(var186)) {
            var187 = var186.first();
            var188 = conses_high.cadr(var186);
            var189 = var187;
            if (var189.eql((SubLObject)$ic248$)) {
                f39887(var185, var188);
            }
            else if (var189.eql((SubLObject)$ic249$)) {
                f39888(var185, var188);
            }
            else if (var189.eql((SubLObject)$ic250$)) {
                f39889(var185, var188);
            }
            else if (var189.eql((SubLObject)$ic251$)) {
                f39890(var185, var188);
            }
            else {
                Errors.error((SubLObject)$ic252$, var187);
            }
        }
        return var185;
    }
    
    public static SubLObject f39892(final SubLObject var189, final SubLObject var190) {
        Functions.funcall(var190, var189, (SubLObject)$ic253$, (SubLObject)$ic254$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var190, var189, (SubLObject)$ic255$, (SubLObject)$ic248$, f39881(var189));
        Functions.funcall(var190, var189, (SubLObject)$ic255$, (SubLObject)$ic249$, f39884(var189));
        Functions.funcall(var190, var189, (SubLObject)$ic255$, (SubLObject)$ic250$, f39885(var189));
        Functions.funcall(var190, var189, (SubLObject)$ic255$, (SubLObject)$ic251$, f39886(var189));
        Functions.funcall(var190, var189, (SubLObject)$ic256$, (SubLObject)$ic254$, (SubLObject)FOUR_INTEGER);
        return var189;
    }
    
    public static SubLObject f39893(final SubLObject var189, final SubLObject var190) {
        return f39892(var189, var190);
    }
    
    public static SubLObject f39894(final SubLObject var191, final SubLObject var192) {
        SubLObject var194;
        final SubLObject var193 = var194 = var191.rest();
        SubLObject var195 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var194, var193, (SubLObject)$ic258$);
        var195 = var194.first();
        final SubLObject var196;
        var194 = (var196 = var194.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic259$, (SubLObject)ConsesLow.list((SubLObject)$ic260$, var195), (SubLObject)ConsesLow.list((SubLObject)$ic260$, var196));
    }
    
    public static SubLObject f39895(final SubLObject var90, final SubLObject var195) {
        final SubLObject var196 = f39891(var195);
        f39887(var196, var90);
        Hashtables.sethash(f39884(var196), $g5166$.getGlobalValue(), var196);
        $g5165$.setGlobalValue((SubLObject)ConsesLow.cons(var196, Sequences.delete(var90, $g5165$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic240$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        return var196;
    }
    
    public static SubLObject f39896(final SubLObject var191, final SubLObject var192) {
        SubLObject var194;
        final SubLObject var193 = var194 = var191.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var194, var193, (SubLObject)$ic262$);
        final SubLObject var195 = var194.rest();
        var194 = var194.first();
        SubLObject var196 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var194, var193, (SubLObject)$ic262$);
        var196 = var194.first();
        var194 = var194.rest();
        if (NIL == var194) {
            final SubLObject var197;
            var194 = (var197 = var195);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic263$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic264$, (SubLObject)ConsesLow.list((SubLObject)$ic265$, var196))), ConsesLow.append(var197, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var193, (SubLObject)$ic262$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39897(final SubLObject var200) {
        SubLObject var201 = (SubLObject)NIL;
        SubLObject var202 = var200;
        SubLObject var203 = (SubLObject)NIL;
        var203 = var202.first();
        while (NIL != var202) {
            final SubLObject var204 = f39898(var203);
            if (NIL != var204) {
                var201 = (SubLObject)ConsesLow.cons(var204, var201);
            }
            var202 = var202.rest();
            var203 = var202.first();
        }
        return var201;
    }
    
    public static SubLObject f39899() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return ConsesLow.append($g5164$.getDynamicValue(var7), f39900());
    }
    
    public static SubLObject f39901(final SubLObject var203) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        final SubLObject var205 = f39898(var203);
        if (NIL != var205) {
            $g5168$.setDynamicValue((SubLObject)ConsesLow.cons(var205, $g5168$.getDynamicValue(var204)), var204);
        }
        return $g5168$.getDynamicValue(var204);
    }
    
    public static SubLObject f39900() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return $g5168$.getDynamicValue(var7);
    }
    
    public static SubLObject f39898(final SubLObject var106) {
        return Hashtables.gethash(var106, $g5166$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39902(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = Sequences.cconcatenate(module0724.f44349(), (SubLObject)$ic267$);
        final SubLObject var38 = module0172.f10922(var35);
        final SubLObject var39 = module0173.f10955(var38);
        final SubLObject var40 = (NIL != var39) ? $g5152$.getDynamicValue(var36) : $g5154$.getDynamicValue(var36);
        final SubLObject var41 = (NIL != var39) ? f39842(var38) : f39844(var38);
        return Sequences.cconcatenate(var37, new SubLObject[] { var40, $ic82$, var41 });
    }
    
    public static SubLObject f39903(final SubLObject var208) {
        final SubLThread var209 = SubLProcess.currentSubLThread();
        if (NIL != $g5171$.getDynamicValue(var209)) {
            return Numbers.numG(var208, $g5171$.getDynamicValue(var209));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39904(final SubLObject var163, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        if (NIL != module0652.$g5070$.getDynamicValue(var166)) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0652.$g5070$.getDynamicValue(var166));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var167 = module0015.$g533$.currentBinding(var166);
        try {
            module0015.$g533$.bind((SubLObject)T, var166);
            f39905(var163, var164, var165);
        }
        finally {
            module0015.$g533$.rebind(var167, var166);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        return var163;
    }
    
    public static SubLObject f39905(SubLObject var163, SubLObject var164, final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        if (NIL == var164) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (NIL != module0210.f13595(var163, (SubLObject)UNPROVIDED) && !var163.equal($g5170$.getDynamicValue(var166))) {
            final SubLObject var167 = $g5170$.currentBinding(var166);
            final SubLObject var168 = $g5153$.currentBinding(var166);
            try {
                $g5170$.bind(var163, var166);
                $g5153$.bind((SubLObject)((NIL != module0015.f794((SubLObject)UNPROVIDED)) ? module0015.f793((SubLObject)UNPROVIDED) : NIL), var166);
                final SubLObject var169 = f39843(var163, (SubLObject)UNPROVIDED);
                if (NIL != $g5153$.getDynamicValue(var166)) {
                    module0642.f39020(module0015.$g149$.getGlobalValue());
                    if (NIL != var169) {
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var169);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != module0652.$g5069$.getDynamicValue(var166)) {
                        module0642.f39020(module0015.$g158$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0652.$g5069$.getDynamicValue(var166));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_209 = module0015.$g533$.currentBinding(var166);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var166);
                        f39905(var163, var164, var165);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_209, var166);
                    }
                    module0642.f39020(module0015.$g150$.getGlobalValue());
                }
                else {
                    f39905(var163, var164, var165);
                }
            }
            finally {
                $g5153$.rebind(var168, var166);
                $g5170$.rebind(var167, var166);
            }
            return (SubLObject)NIL;
        }
        if (var163.first().eql((SubLObject)$ic260$)) {
            if (NIL != var165 && !conses_high.second(var163).isAtom()) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39032(var164);
            }
            module0642.f39019((SubLObject)$ic269$);
            final SubLObject var167 = $g5158$.currentBinding(var166);
            try {
                $g5158$.bind((SubLObject)T, var166);
                f39804(conses_high.second(var163), var164, var165);
            }
            finally {
                $g5158$.rebind(var167, var166);
            }
        }
        else {
            SubLObject var170 = (SubLObject)NIL;
            SubLObject var171 = (SubLObject)NIL;
            if (NIL == var170) {
                SubLObject var172 = f39899();
                SubLObject var173 = (SubLObject)NIL;
                var173 = var172.first();
                while (NIL == var170 && NIL != var172) {
                    final SubLObject var174 = f39885(var173);
                    final SubLObject var175 = f39886(var173);
                    if (var174.isFunctionSpec() && NIL != Functions.funcall(var174, var163) && var175.isFunctionSpec()) {
                        Functions.funcall(var175, var163);
                        var170 = (SubLObject)T;
                    }
                    var172 = var172.rest();
                    var173 = var172.first();
                }
            }
            if (NIL == var170) {
                if (NIL == $g5159$.getDynamicValue(var166) && NIL != var165 && NIL == $g5158$.getDynamicValue(var166)) {
                    if (!var164.numE((SubLObject)ZERO_INTEGER)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                    module0642.f39032(var164);
                }
                $g5158$.setDynamicValue((SubLObject)NIL, var166);
                if (NIL != module0004.f104(var163.first(), $g5169$.getDynamicValue(var166), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    module0642.f39019((SubLObject)$ic140$);
                }
                else if (NIL != $g5157$.getDynamicValue(var166)) {
                    var171 = (SubLObject)T;
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    f39837((SubLObject)$ic137$, $g5157$.getDynamicValue(var166), (SubLObject)$ic140$, (SubLObject)$ic137$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    $g5157$.setDynamicValue((SubLObject)NIL, var166);
                }
                else if (NIL != $g5170$.getDynamicValue(var166)) {
                    f39837((SubLObject)$ic145$, $g5170$.getDynamicValue(var166), (SubLObject)$ic140$, (SubLObject)$ic135$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    $g5170$.setDynamicValue((SubLObject)NIL, var166);
                }
                else {
                    module0642.f39019((SubLObject)$ic140$);
                }
                SubLObject var176 = (SubLObject)ZERO_INTEGER;
                final SubLObject var177 = $g5159$.currentBinding(var166);
                try {
                    $g5159$.bind((SubLObject)T, var166);
                    f39804(var163.first(), var164, var165);
                    var176 = Numbers.add(var176, (SubLObject)ONE_INTEGER);
                }
                finally {
                    $g5159$.rebind(var177, var166);
                }
                if (NIL != $g5159$.getDynamicValue(var166)) {
                    $g5159$.setDynamicValue((SubLObject)NIL, var166);
                }
                if (NIL != module0004.f104(var163.first(), $g5163$.getDynamicValue(var166), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    f39906();
                    f39804(conses_high.second(var163), var164, (SubLObject)NIL);
                    var163 = var163.rest();
                    var176 = Numbers.add(var176, (SubLObject)ONE_INTEGER);
                }
                SubLObject var178;
                for (var178 = (SubLObject)NIL, var178 = var163.rest(); NIL == f39903(var176) && var178.isCons(); var176 = Numbers.add(var176, (SubLObject)ONE_INTEGER), var178 = var178.rest()) {
                    f39906();
                    f39804(var178.first(), Numbers.add(var164, (SubLObject)ONE_INTEGER), var165);
                }
                if (NIL != f39903(var176)) {
                    module0642.f39021((SubLObject)$ic270$);
                }
                else if (NIL != var178) {
                    module0642.f39019((SubLObject)$ic271$);
                    f39804(var178, Numbers.add(var164, (SubLObject)ONE_INTEGER), var165);
                }
                if (NIL != var171) {
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic272$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
                else {
                    module0642.f39019((SubLObject)$ic272$);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39906() {
        module0642.f39019((SubLObject)$ic198$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39907(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var77, var77, (SubLObject)$ic273$);
        var79 = var77.first();
        final SubLObject var80 = var77.rest();
        if (NIL == var80) {
            module0642.f39020((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019((SubLObject)$ic274$);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var81 = module0015.$g132$.getDynamicValue(var78);
            final SubLObject var82 = module0015.$g535$.currentBinding(var78);
            try {
                module0015.$g535$.bind((SubLObject)T, var78);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != var81) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var81));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_220 = module0015.$g533$.currentBinding(var78);
                try {
                    module0015.$g533$.bind((SubLObject)T, var78);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic274$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic275$);
                    module0642.f39021(var79);
                    module0642.f39019((SubLObject)$ic276$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var11_220, var78);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var82, var78);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)$ic273$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39908(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var111) : var111;
        final SubLObject var113 = f39832((SubLObject)$ic15$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var112), (SubLObject)$ic278$, module0589.f35898(var111, (SubLObject)UNPROVIDED));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var113) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var113);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var114 = module0015.$g533$.currentBinding(var112);
        try {
            module0015.$g533$.bind((SubLObject)T, var112);
            module0642.f39019(var111);
        }
        finally {
            module0015.$g533$.rebind(var114, var112);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39909(final SubLObject var221) {
        final SubLObject var222 = Sequences.length(var221);
        if (!var222.eql((SubLObject)ZERO_INTEGER)) {
            if (var222.eql((SubLObject)ONE_INTEGER)) {
                f39804(var221.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var222.eql((SubLObject)TWO_INTEGER)) {
                f39804(var221.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic281$);
                f39804(conses_high.second(var221), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                final SubLObject var223 = module0035.f2114(var221);
                SubLObject var225;
                final SubLObject var224 = var225 = conses_high.butlast(var221, (SubLObject)UNPROVIDED);
                SubLObject var226 = (SubLObject)NIL;
                var226 = var225.first();
                while (NIL != var225) {
                    f39804(var226, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic199$);
                    var225 = var225.rest();
                    var226 = var225.first();
                }
                module0642.f39019((SubLObject)$ic282$);
                f39804(var223, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39910(final SubLObject var127) {
        final SubLObject var128 = module0178.f11287(var127);
        f39911(var127, var128, (SubLObject)$ic283$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39912(final SubLObject var152, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = module0579.$g4262$.getDynamicValue();
        }
        f39911(var152, var47, (SubLObject)$ic283$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39913(final SubLObject var152, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = module0579.$g4262$.getDynamicValue();
        }
        f39911(var152, var47, (SubLObject)$ic284$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39914(final SubLObject var35, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = module0579.$g4262$.getDynamicValue();
        }
        f39911(var35, var47, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39911(final SubLObject var225, final SubLObject var47, final SubLObject var226) {
        module0642.f39020(f39808(var225, var47, var226, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39808(final SubLObject var225, final SubLObject var47, final SubLObject var226, SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = module0574.f35152();
        }
        final SubLThread var227 = SubLProcess.currentSubLThread();
        SubLObject var228 = (SubLObject)NIL;
        final SubLObject var229 = module0579.$g4262$.currentBinding(var227);
        try {
            module0579.$g4262$.bind(var47, var227);
            final SubLObject var230 = f39832((SubLObject)$ic77$);
            final SubLObject var11_228 = module0579.$g4298$.currentBinding(var227);
            final SubLObject var231 = module0579.$g4301$.currentBinding(var227);
            try {
                module0579.$g4298$.bind((SubLObject)$ic285$, var227);
                module0579.$g4301$.bind((NIL != var230) ? var230 : module0579.$g4301$.getDynamicValue(var227), var227);
                if (NIL != module0018.$g709$.getDynamicValue(var227)) {
                    final SubLObject var11_229 = module0579.$g4284$.currentBinding(var227);
                    final SubLObject var27_230 = module0579.$g4283$.currentBinding(var227);
                    try {
                        module0579.$g4284$.bind($ic286$, var227);
                        module0579.$g4283$.bind(var46, var227);
                        var228 = Functions.funcall(var226, var225);
                    }
                    finally {
                        module0579.$g4283$.rebind(var27_230, var227);
                        module0579.$g4284$.rebind(var11_229, var227);
                    }
                }
                else {
                    var228 = Functions.funcall(var226, var225);
                }
            }
            finally {
                module0579.$g4301$.rebind(var231, var227);
                module0579.$g4298$.rebind(var11_228, var227);
            }
        }
        finally {
            module0579.$g4262$.rebind(var229, var227);
        }
        return var228;
    }
    
    public static SubLObject f39915(final SubLObject var35, SubLObject var164, SubLObject var165) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)ZERO_INTEGER;
        }
        if (var165 == UNPROVIDED) {
            var165 = (SubLObject)NIL;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        if ($ic288$ == module0018.$g707$.getDynamicValue(var166)) {
            return f39914(var35, (SubLObject)UNPROVIDED);
        }
        return f39804(var35, var164, var165);
    }
    
    public static SubLObject f39916(final SubLObject var127, SubLObject var231, SubLObject var232) {
        if (var231 == UNPROVIDED) {
            var231 = module0655.$g5095$.getDynamicValue();
        }
        if (var232 == UNPROVIDED) {
            var232 = (SubLObject)T;
        }
        final SubLThread var233 = SubLProcess.currentSubLThread();
        if ($ic288$ == module0018.$g707$.getDynamicValue(var233)) {
            f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f39910(var127);
        }
        else if (NIL != var231 && $ic289$ == module0018.$g707$.getDynamicValue(var233)) {
            module0642.f39020(module0015.$g149$.getGlobalValue());
            if (NIL != module0652.$g5066$.getDynamicValue(var233)) {
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0652.$g5066$.getDynamicValue(var233));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var234 = module0015.$g533$.currentBinding(var233);
            try {
                module0015.$g533$.bind((SubLObject)T, var233);
                f39804(var127, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                if (NIL != var232) {
                    final SubLObject var235 = module0178.f11287(var127);
                    if (NIL == constant_handles_oc.f8449(var235)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)$ic290$);
                    if (NIL != constant_handles_oc.f8449(var235)) {
                        f39804(var235, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        module0642.f39020(module0015.$g230$.getGlobalValue());
                        f39804(var235, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g231$.getGlobalValue());
                    }
                }
            }
            finally {
                module0015.$g533$.rebind(var234, var233);
            }
            module0642.f39020(module0015.$g150$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39020(module0015.$g149$.getGlobalValue());
            if (NIL != module0652.$g5066$.getDynamicValue(var233)) {
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0652.$g5066$.getDynamicValue(var233));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var234 = module0015.$g533$.currentBinding(var233);
            try {
                module0015.$g533$.bind((SubLObject)T, var233);
                f39804(var127, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                if (NIL != var232) {
                    module0642.f39019((SubLObject)$ic290$);
                    f39804(module0178.f11287(var127), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var234, var233);
            }
            module0642.f39020(module0015.$g150$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return var127;
    }
    
    public static SubLObject f39917(final SubLObject var191, final SubLObject var192) {
        SubLObject var194;
        final SubLObject var193 = var194 = var191.rest();
        SubLObject var195 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var194, var193, (SubLObject)$ic291$);
        var195 = var194.first();
        final SubLObject var196;
        var194 = (var196 = var194.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic292$, (SubLObject)ConsesLow.list((SubLObject)$ic293$, (SubLObject)$ic294$, (SubLObject)ConsesLow.list((SubLObject)$ic295$, (SubLObject)$ic296$, var195)), ConsesLow.append(var196, (SubLObject)NIL));
    }
    
    public static SubLObject f39918(final SubLObject var191, final SubLObject var192) {
        final SubLObject var193 = var191.rest();
        final SubLObject var195;
        final SubLObject var194 = var195 = var193;
        return (SubLObject)ConsesLow.list((SubLObject)$ic263$, (SubLObject)$ic297$, reader.bq_cons((SubLObject)$ic298$, ConsesLow.append(var195, (SubLObject)NIL)));
    }
    
    public static SubLObject f39919(final SubLObject var127, SubLObject var231) {
        if (var231 == UNPROVIDED) {
            var231 = module0655.$g5095$.getDynamicValue();
        }
        final SubLThread var232 = SubLProcess.currentSubLThread();
        if (NIL == $g5172$.getDynamicValue(var232) || NIL != Functions.funcall($g5172$.getDynamicValue(var232), var127)) {
            f39916(var127, var231, (SubLObject)NIL);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39920(final SubLObject var127, SubLObject var231) {
        if (var231 == UNPROVIDED) {
            var231 = module0655.$g5095$.getDynamicValue();
        }
        final SubLThread var232 = SubLProcess.currentSubLThread();
        if (NIL == $g5172$.getDynamicValue(var232) || NIL != Functions.funcall($g5172$.getDynamicValue(var232), var127)) {
            f39916(var127, var231, (SubLObject)T);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39921(final SubLObject var127, SubLObject var237) {
        if (var237 == UNPROVIDED) {
            var237 = (SubLObject)NIL;
        }
        final SubLThread var238 = SubLProcess.currentSubLThread();
        if (NIL == $g5172$.getDynamicValue(var238) || NIL != Functions.funcall($g5172$.getDynamicValue(var238), var127)) {
            if (NIL == var237 && $ic22$ == module0178.f11292(var127)) {
                return module0669.f40767(var127);
            }
            final SubLObject var239 = module0178.f11335(var127);
            final SubLObject var240 = (SubLObject)ZERO_INTEGER;
            SubLObject var241 = (SubLObject)NIL;
            SubLObject var242 = (SubLObject)NIL;
            if (NIL != constant_handles_oc.f8449(var239)) {
                var241 = (SubLObject)NIL;
            }
            else if (NIL != module0167.f10813(var239)) {
                var241 = (SubLObject)T;
            }
            else if (NIL != assertion_handles_oc.f11035(var239)) {
                var241 = (SubLObject)T;
                var242 = (SubLObject)T;
            }
            else if (var239.isString() && Sequences.length(var239).numG((SubLObject)$ic299$)) {
                var241 = module0655.$g5095$.getDynamicValue(var238);
            }
            else if (var239.isAtom()) {
                var241 = (SubLObject)NIL;
            }
            else {
                var241 = module0655.$g5095$.getDynamicValue(var238);
                var242 = (SubLObject)T;
            }
            if (NIL != var241) {
                module0642.f39020(module0015.$g149$.getGlobalValue());
                if (NIL != module0652.$g5065$.getDynamicValue(var238)) {
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0652.$g5065$.getDynamicValue(var238));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var243 = module0015.$g533$.currentBinding(var238);
                try {
                    module0015.$g533$.bind((SubLObject)T, var238);
                    f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f39915(var239, var240, var241);
                }
                finally {
                    module0015.$g533$.rebind(var243, var238);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39020(module0015.$g149$.getGlobalValue());
                if (NIL != module0652.$g5065$.getDynamicValue(var238)) {
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0652.$g5065$.getDynamicValue(var238));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var243 = module0015.$g533$.currentBinding(var238);
                try {
                    module0015.$g533$.bind((SubLObject)T, var238);
                    f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f39915(var239, var240, var241);
                }
                finally {
                    module0015.$g533$.rebind(var243, var238);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (NIL != var242) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            module0642.f39032((SubLObject)ONE_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39922(final SubLObject var240, SubLObject var241) {
        if (var241 == UNPROVIDED) {
            var241 = (SubLObject)$ic300$;
        }
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = module0191.f11965(var240);
        final SubLObject var244 = module0191.f11969(var240);
        final SubLObject var245 = module0191.f11976(var240);
        if ($ic288$ == module0018.$g707$.getDynamicValue(var242)) {
            f39923(var244);
            module0642.f39019((SubLObject)$ic301$);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g240$.getGlobalValue());
            f39837((SubLObject)$ic302$, var240, var241, var243, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g241$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019((SubLObject)$ic303$);
        }
        else {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var246 = module0015.$g533$.currentBinding(var242);
            try {
                module0015.$g533$.bind((SubLObject)T, var242);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_242 = module0015.$g533$.currentBinding(var242);
                try {
                    module0015.$g533$.bind((SubLObject)T, var242);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic304$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic68$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_243 = module0015.$g533$.currentBinding(var242);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var242);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        f39837((SubLObject)$ic302$, var240, var241, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var11_243, var242);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_244 = module0015.$g533$.currentBinding(var242);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var242);
                        module0642.f39027((SubLObject)$ic306$, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_244, var242);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic304$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic68$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_245 = module0015.$g533$.currentBinding(var242);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var242);
                        f39804(var244, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        if (NIL == constant_handles_oc.f8449(var245)) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)$ic290$);
                        if (NIL != constant_handles_oc.f8449(var245)) {
                            f39804(var245, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else {
                            module0642.f39020(module0015.$g230$.getGlobalValue());
                            f39804(var245, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g231$.getGlobalValue());
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var11_245, var242);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var11_242, var242);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var246, var242);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return var240;
    }
    
    public static SubLObject f39923(final SubLObject var171) {
        return f39912(var171, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39924(final SubLObject var127, SubLObject var231, SubLObject var232, SubLObject var246) {
        if (var231 == UNPROVIDED) {
            var231 = module0655.$g5095$.getDynamicValue();
        }
        if (var232 == UNPROVIDED) {
            var232 = (SubLObject)T;
        }
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        final SubLThread var247 = SubLProcess.currentSubLThread();
        if ($ic288$ == module0018.$g707$.getDynamicValue(var247)) {
            f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f39910(var127);
            return var127;
        }
        final SubLObject var248 = module0178.f11287(var127);
        final SubLObject var249 = module0538.f33367(var127, (SubLObject)UNPROVIDED);
        SubLObject var250 = (SubLObject)NIL;
        SubLObject var251 = (SubLObject)NIL;
        var247.resetMultipleValues();
        final SubLObject var252 = f39925(var127, var249);
        final SubLObject var253 = var247.secondMultipleValue();
        var247.resetMultipleValues();
        if (module0538.f33483(module0172.f10930(var252)).equal(module0538.f33483(module0172.f10930(var249)))) {
            var250 = var249;
        }
        else if (NIL != var246 && var252.equal(module0655.$g5129$.getDynamicValue(var247)) && (NIL == var232 || NIL != module0161.f10513(var248, module0655.$g5130$.getDynamicValue(var247)))) {
            var251 = (SubLObject)T;
        }
        else if (NIL != module0161.f10514(var248, var253) || NIL != var232) {
            var250 = var252;
        }
        else {
            var250 = module0202.f12782(var253, var252);
        }
        if (NIL != var246 && NIL == var251) {
            module0655.$g5129$.setDynamicValue(var250, var247);
            if (NIL != var232) {
                module0655.$g5130$.setDynamicValue(var248, var247);
            }
        }
        if (NIL != var251) {
            f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var232) {
                module0642.f39019((SubLObject)$ic308$);
            }
            else {
                module0642.f39019((SubLObject)$ic309$);
            }
        }
        else if (NIL != var231) {
            module0642.f39020(module0015.$g149$.getGlobalValue());
            if (NIL != module0652.$g5066$.getDynamicValue(var247)) {
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0652.$g5066$.getDynamicValue(var247));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var254 = module0015.$g533$.currentBinding(var247);
            try {
                module0015.$g533$.bind((SubLObject)T, var247);
                f39877(var127, var250, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                if (NIL != var232) {
                    module0642.f39019((SubLObject)$ic290$);
                    f39804(var253, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var254, var247);
            }
            module0642.f39020(module0015.$g150$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39020(module0015.$g149$.getGlobalValue());
            if (NIL != module0652.$g5066$.getDynamicValue(var247)) {
                module0642.f39020(module0015.$g158$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0652.$g5066$.getDynamicValue(var247));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var254 = module0015.$g533$.currentBinding(var247);
            try {
                module0015.$g533$.bind((SubLObject)T, var247);
                f39877(var127, var250, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                if (NIL != var232) {
                    module0642.f39019((SubLObject)$ic290$);
                    f39804(var253, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var254, var247);
            }
            module0642.f39020(module0015.$g150$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return var127;
    }
    
    public static SubLObject f39925(final SubLObject var127, SubLObject var247) {
        if (var247 == UNPROVIDED) {
            var247 = (SubLObject)NIL;
        }
        final SubLThread var248 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var127) : var127;
        if (NIL == module0067.f4852(module0655.$g5131$.getDynamicValue(var248))) {
            module0655.$g5131$.setDynamicValue(module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var248);
        }
        final SubLObject var249 = module0067.f4884(module0655.$g5131$.getDynamicValue(var248), var127, (SubLObject)UNPROVIDED);
        SubLObject var250 = var249.first();
        SubLObject var251 = conses_high.second(var249);
        if (NIL != var250) {
            return Values.values(var250, var251);
        }
        var248.resetMultipleValues();
        final SubLObject var252_253 = module0289.f19396(var127);
        final SubLObject var254_255 = var248.secondMultipleValue();
        var248.resetMultipleValues();
        var250 = var252_253;
        var251 = var254_255;
        if (NIL == var247) {
            var247 = module0538.f33367(var127, (SubLObject)UNPROVIDED);
        }
        if (!var250.equal(var247)) {
            module0067.f4886(module0655.$g5131$.getDynamicValue(var248), var127, (SubLObject)ConsesLow.list(var250, var251));
        }
        return Values.values(var250, var251);
    }
    
    public static SubLObject f39926(final SubLObject var127, SubLObject var231) {
        if (var231 == UNPROVIDED) {
            var231 = module0655.$g5095$.getDynamicValue();
        }
        final SubLThread var232 = SubLProcess.currentSubLThread();
        if (NIL == $g5172$.getDynamicValue(var232) || NIL != Functions.funcall($g5172$.getDynamicValue(var232), var127)) {
            f39924(var127, var231, (SubLObject)NIL, (SubLObject)T);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39927(final SubLObject var127, SubLObject var231) {
        if (var231 == UNPROVIDED) {
            var231 = module0655.$g5095$.getDynamicValue();
        }
        final SubLThread var232 = SubLProcess.currentSubLThread();
        if (NIL == $g5172$.getDynamicValue(var232) || NIL != Functions.funcall($g5172$.getDynamicValue(var232), var127)) {
            f39924(var127, var231, (SubLObject)T, (SubLObject)T);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39928(final SubLObject var127, SubLObject var237) {
        if (var237 == UNPROVIDED) {
            var237 = (SubLObject)NIL;
        }
        final SubLThread var238 = SubLProcess.currentSubLThread();
        if (NIL == $g5172$.getDynamicValue(var238) || NIL != Functions.funcall($g5172$.getDynamicValue(var238), var127)) {
            f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var239 = module0178.f11335(var127);
            if (NIL != assertion_handles_oc.f11035(var239)) {
                module0642.f39020(module0015.$g459$.getGlobalValue());
                f39924(var239, (SubLObject)T, (SubLObject)NIL, (SubLObject)T);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            else {
                module0655.$g5129$.setDynamicValue((SubLObject)NIL, var238);
                module0655.$g5130$.setDynamicValue((SubLObject)NIL, var238);
                if (NIL != constant_handles_oc.f8449(var239)) {
                    f39804(var239, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                }
                else if (NIL != module0167.f10813(var239)) {
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    f39804(var239, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                else if (var239.isString()) {
                    f39804(var239, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                }
                else if (var239.isAtom()) {
                    f39804(var239, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                }
                else {
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    f39804(var239, (SubLObject)ZERO_INTEGER, module0655.$g5095$.getDynamicValue(var238));
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
            }
            module0642.f39032((SubLObject)ONE_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39929(final SubLObject var127, SubLObject var238) {
        if (var238 == UNPROVIDED) {
            var238 = (SubLObject)NIL;
        }
        f39837((SubLObject)$ic156$, var127, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39804(module0205.f13379(var127, (SubLObject)UNPROVIDED), (SubLObject)NIL, var238);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39930(final SubLObject var163) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var163) || NIL != assertion_handles_oc.f11035(var163) || NIL != module0223.f14667(var163));
    }
    
    public static SubLObject f39931(final SubLObject var256) {
        if (NIL != module0173.f10955(var256)) {
            return f39842(var256);
        }
        if (NIL != module0223.f14667(var256)) {
            return var256;
        }
        if (NIL != module0210.f13595(var256, (SubLObject)UNPROVIDED)) {
            return f39844(var256);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39842(final SubLObject var66) {
        if (NIL != constant_handles_oc.f8449(var66)) {
            return Sequences.cconcatenate(module0006.f203($g5173$.getGlobalValue()), module0006.f203((NIL != $g5175$.getGlobalValue()) ? module0213.f14071(var66) : constants_high_oc.f10749(var66)));
        }
        if (NIL != module0167.f10813(var66)) {
            return Sequences.cconcatenate(module0006.f203($g5174$.getGlobalValue()), module0006.f203((NIL != $g5175$.getGlobalValue()) ? module0213.f14071(var66) : module0167.f10803(var66)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39932(final SubLObject var35) {
        if (NIL != module0173.f10955(var35)) {
            return f39842(var35);
        }
        if (NIL != module0210.f13595(var35, (SubLObject)UNPROVIDED)) {
            return f39844(var35);
        }
        if (NIL != module0223.f14667(var35)) {
            return print_high.prin1_to_string(var35);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39933(final SubLObject var163) {
        return (SubLObject)makeBoolean(var163.isString() && ((NIL != module0038.f2684(var163, $g5173$.getGlobalValue()) && NIL != ((NIL != $g5175$.getGlobalValue()) ? module0213.f13915(module0038.f2674(var163, $g5173$.getGlobalValue(), (SubLObject)UNPROVIDED)) : module0038.f2643(module0038.f2674(var163, $g5173$.getGlobalValue(), (SubLObject)UNPROVIDED)))) || (NIL != module0038.f2684(var163, $g5174$.getGlobalValue()) && NIL != ((NIL != $g5175$.getGlobalValue()) ? module0213.f13915(module0038.f2674(var163, $g5173$.getGlobalValue(), (SubLObject)UNPROVIDED)) : module0038.f2643(module0038.f2674(var163, $g5174$.getGlobalValue(), (SubLObject)UNPROVIDED))))));
    }
    
    public static SubLObject f39934(final SubLObject var81) {
        if (NIL != module0173.f10955(var81)) {
            return f39842(var81);
        }
        return f39935(var81);
    }
    
    public static SubLObject f39936(final SubLObject var163) {
        return (SubLObject)makeBoolean(NIL != f39933(var163) || var163.isString());
    }
    
    public static SubLObject f39937(final SubLObject var77) {
        if (var77.isInteger()) {
            return constants_high_oc.f10752(var77);
        }
        if (NIL != constant_handles_oc.f8449(var77)) {
            return var77;
        }
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        if (var77.isString()) {
            return f39938(var77);
        }
        if (var77.isCons() && NIL != module0173.f10955(var77.first())) {
            return module0172.f10921(var77);
        }
        if (var77.isCons()) {
            return f39937(var77.first());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39938(final SubLObject var77) {
        SubLObject var78 = (SubLObject)NIL;
        if (!var77.equalp((SubLObject)$ic314$)) {
            var78 = module0553.f34180(var77);
            if (NIL == constant_handles_oc.f8449(var78) && NIL != module0038.f2684(var77, $g5173$.getGlobalValue())) {
                var78 = f39937(reader.read_from_string_ignoring_errors(module0038.f2674(var77, $g5173$.getGlobalValue(), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            if (NIL == var78 && NIL != module0038.f2727(var77)) {
                var78 = f39937(reader.read_from_string_ignoring_errors(var77, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        return var78;
    }
    
    public static SubLObject f39939(final SubLObject var77) {
        if (var77.isInteger()) {
            return module0167.f10832(var77);
        }
        if (NIL != module0167.f10813(var77)) {
            return var77;
        }
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        if (var77.isString() && NIL != module0038.f2684(var77, $g5174$.getGlobalValue())) {
            return f39939(reader.read_from_string_ignoring_errors(module0038.f2674(var77, $g5174$.getGlobalValue(), (SubLObject)UNPROVIDED), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0038.f2727(var77)) {
            return f39939(reader.read_from_string_ignoring_errors(var77, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (var77.isString() && var77.equalp((SubLObject)$ic314$)) {
            return (SubLObject)NIL;
        }
        if (var77.isString()) {
            final SubLObject var78 = module0553.f34180(var77);
            return (SubLObject)((NIL != module0167.f10813(var78)) ? var78 : NIL);
        }
        if (var77.isCons() && NIL != module0173.f10955(var77.first())) {
            return module0172.f10921(var77);
        }
        if (var77.isCons()) {
            return f39939(var77.first());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39940(final SubLObject var77) {
        return f39939(var77);
    }
    
    public static SubLObject f39941(final SubLObject var66) {
        assert NIL != module0173.f10955(var66) : var66;
        if (NIL != constant_handles_oc.f8449(var66)) {
            return constants_high_oc.f10743(var66);
        }
        return module0038.f2698(f39942(var66));
    }
    
    public static SubLObject f39942(final SubLObject var66) {
        assert NIL != module0173.f10955(var66) : var66;
        final SubLObject var67 = module0173.f10958(var66);
        if (NIL != constant_handles_oc.f8449(var67)) {
            final SubLObject var68 = constants_high_oc.f10743(var67);
            if (var68.isString()) {
                return var68;
            }
        }
        return module0006.f204(var67);
    }
    
    public static SubLObject f39943(final SubLObject var77, SubLObject var257) {
        if (var257 == UNPROVIDED) {
            var257 = (SubLObject)T;
        }
        if (NIL != var257) {
            final SubLObject var258 = f39944(var77);
            if (NIL != var258) {
                return var258;
            }
        }
        return f39945(var77);
    }
    
    public static SubLObject f39944(final SubLObject var77) {
        if (var77.isInteger() && !var77.isNegative()) {
            return constants_high_oc.f10752(var77);
        }
        if (var77.isInteger() && var77.isNegative()) {
            return module0167.f10832(Numbers.minus(var77));
        }
        if (NIL != $g5175$.getGlobalValue() && var77.isString() && NIL != module0038.f2684(var77, $g5177$.getGlobalValue())) {
            return f39937(module0038.f2674(var77, $g5173$.getGlobalValue(), (SubLObject)UNPROVIDED));
        }
        if (var77.isString() && NIL != module0038.f2684(var77, $g5173$.getGlobalValue())) {
            return f39937(reader.read_from_string_ignoring_errors(var77, (SubLObject)NIL, (SubLObject)NIL, Sequences.length($g5173$.getGlobalValue()), (SubLObject)UNPROVIDED));
        }
        if (NIL != $g5175$.getGlobalValue() && var77.isString() && NIL != module0038.f2684(var77, $g5178$.getGlobalValue())) {
            return f39937(module0038.f2674(var77, $g5174$.getGlobalValue(), (SubLObject)UNPROVIDED));
        }
        if (var77.isString() && NIL != module0038.f2684(var77, $g5174$.getGlobalValue())) {
            return f39939(reader.read_from_string_ignoring_errors(var77, (SubLObject)NIL, (SubLObject)NIL, Sequences.length($g5174$.getGlobalValue()), (SubLObject)UNPROVIDED));
        }
        if (NIL != module0038.f2727(var77)) {
            return f39944(reader.read_from_string_ignoring_errors(var77, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (var77.isString() && Sequences.length(var77).numG((SubLObject)ONE_INTEGER) && NIL != Characters.charE(Strings.sublisp_char(var77, (SubLObject)ZERO_INTEGER), (SubLObject)Characters.CHAR_hyphen) && NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic318$), var77, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return f39944(reader.read_from_string_ignoring_errors(var77, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39945(final SubLObject var77) {
        if (NIL != constant_handles_oc.f8449(var77)) {
            return var77;
        }
        if (NIL != module0167.f10813(var77)) {
            return var77;
        }
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        if (var77.isString() && var77.equalp((SubLObject)$ic314$)) {
            return (SubLObject)NIL;
        }
        if (var77.isString()) {
            return module0553.f34180(var77);
        }
        if (var77.isCons() && NIL != module0173.f10955(var77.first())) {
            return module0172.f10921(var77);
        }
        if (var77.isCons()) {
            return f39943(var77.first(), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39946(final SubLObject var258) {
        return (SubLObject)makeBoolean(NIL != module0035.f2002(var258, $g5180$.getGlobalValue(), (SubLObject)UNPROVIDED) && NIL != Strings.stringE($g5179$.getGlobalValue(), module0038.f2623(var258, (SubLObject)ZERO_INTEGER, $g5180$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39844(final SubLObject var124) {
        return f39947(var124);
    }
    
    public static SubLObject f39948(final SubLObject var258) {
        return module0038.f2623(var258, $g5180$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39949(final SubLObject var124) {
        return module0038.f2698(module0038.f2626(module0205.f13144(var124)));
    }
    
    public static SubLObject f39947(final SubLObject var124) {
        return Sequences.cconcatenate($g5179$.getGlobalValue(), module0038.f2638(module0655.f39759(var124)));
    }
    
    public static SubLObject f39950(final SubLObject var77, SubLObject var257) {
        if (var257 == UNPROVIDED) {
            var257 = (SubLObject)T;
        }
        if (NIL != module0210.f13595(var77, (SubLObject)UNPROVIDED)) {
            return var77;
        }
        if (var77.isString() && NIL != var257 && NIL != f39946(var77)) {
            return module0655.f39758(f39948(var77));
        }
        if (NIL != var257 && NIL != module0213.f13913(var77)) {
            return module0213.f13921(var77);
        }
        if (var77.isCons()) {
            return f39950(var77.first(), var257);
        }
        return module0553.f34179(var77);
    }
    
    public static SubLObject f39951(final SubLObject var259) {
        return (NIL != module0210.f13595(var259, (SubLObject)UNPROVIDED)) ? var259 : f39950(var259, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39952(final SubLObject var258) {
        return (SubLObject)makeBoolean(NIL != module0035.f2002(var258, $g5182$.getGlobalValue(), (SubLObject)UNPROVIDED) && NIL != Strings.stringE($g5181$.getGlobalValue(), module0038.f2623(var258, (SubLObject)ZERO_INTEGER, $g5182$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f39953(final SubLObject var258) {
        return module0038.f2623(var258, $g5182$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39954(final SubLObject var152) {
        return Sequences.cconcatenate($g5181$.getGlobalValue(), module0038.f2638(module0655.f39759(var152)));
    }
    
    public static SubLObject f39955(final SubLObject var77) {
        if (NIL != f39952(var77)) {
            return module0655.f39758(f39953(var77));
        }
        return module0553.f34179(var77);
    }
    
    public static SubLObject f39865(final SubLObject var35) {
        if (NIL != module0173.f10955(var35)) {
            return f39941(var35);
        }
        return f39949(var35);
    }
    
    public static SubLObject f39956(final SubLObject var35) {
        if (NIL != module0173.f10955(var35)) {
            return f39942(var35);
        }
        return f39947(var35);
    }
    
    public static SubLObject f39957(final SubLObject var77, SubLObject var257) {
        if (var257 == UNPROVIDED) {
            var257 = (SubLObject)T;
        }
        final SubLObject var258 = f39943(var77, var257);
        if (NIL != var258) {
            return var258;
        }
        return f39950(var77, var257);
    }
    
    public static SubLObject f39958(final SubLObject var81) {
        return f39865(var81);
    }
    
    public static SubLObject f39935(final SubLObject var81) {
        return f39956(var81);
    }
    
    public static SubLObject f39959(final SubLObject var77) {
        return f39957(var77, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39960(final SubLObject var258) {
        if (NIL != module0038.f2610(var258)) {
            return module0161.$g2160$.getGlobalValue();
        }
        return module0612.f37539(var258);
    }
    
    public static SubLObject f39961(final SubLObject var258) {
        if (NIL != module0038.f2610(var258)) {
            return module0161.$g2157$.getGlobalValue();
        }
        return f39957(var258, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39962(final SubLObject var260) {
        return (SubLObject)((NIL != var260) ? module0038.f2698(module0194.f12113(var260, (SubLObject)UNPROVIDED)) : $ic80$);
    }
    
    public static SubLObject f39963(final SubLObject var261) {
        return (SubLObject)((NIL != var261) ? f39865(var261) : $ic80$);
    }
    
    public static SubLObject f39964(final SubLObject var81) {
        final SubLObject var82 = module0161.f10557(var81);
        module0642.f39019(f39941(var82));
        if (NIL != module0161.f10548(var81)) {
            module0642.f39019((SubLObject)$ic199$);
            f39965(var81);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39965(final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = module0161.f10557(var81);
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = (SubLObject)NIL;
        var82.resetMultipleValues();
        final SubLObject var262_263 = module0161.f10583(var81);
        final SubLObject var264_265 = var82.secondMultipleValue();
        var82.resetMultipleValues();
        var84 = var262_263;
        var85 = var264_265;
        module0642.f39019(f39962(var84));
        module0642.f39019((SubLObject)$ic199$);
        module0642.f39019(f39963(var85));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39966(final SubLObject var147) {
        return f39865(var147);
    }
    
    public static SubLObject f39967(final SubLObject var147) {
        return f39956(var147);
    }
    
    public static SubLObject f39968(final SubLObject var77) {
        return f39957(var77, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39969(SubLObject var77) {
        final SubLObject var78 = f39943(var77, (SubLObject)UNPROVIDED);
        if (NIL != module0173.f10955(var78)) {
            return var78;
        }
        if (var77.isCons()) {
            var77 = var77.first();
        }
        if (var77.isString()) {
            var77 = Packages.find_symbol(var77, module0018.$g575$.getGlobalValue());
        }
        if (!var77.isSymbol()) {
            return (SubLObject)NIL;
        }
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        if (module0217.f14357(var77).numG((SubLObject)ZERO_INTEGER)) {
            return var77;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39970(final SubLObject var77) {
        if (var77.isInteger()) {
            return assertion_handles_oc.f11053(var77);
        }
        if (NIL != assertion_handles_oc.f11035(var77)) {
            return var77;
        }
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        if (var77.isString()) {
            final SubLObject var78 = reader.read_from_string_ignoring_errors(var77, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var78.isInteger()) {
                return assertion_handles_oc.f11053(var78);
            }
            return (SubLObject)NIL;
        }
        else {
            if (var77.isCons()) {
                return f39970(var77.first());
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f39971(final SubLObject var77) {
        if (var77.isInteger()) {
            return deduction_handles_oc.f11675(var77);
        }
        if (NIL != deduction_handles_oc.f11659(var77)) {
            return var77;
        }
        if (NIL == var77) {
            return (SubLObject)NIL;
        }
        if (var77.isString()) {
            final SubLObject var78 = reader.read_from_string_ignoring_errors(var77, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var78.isInteger()) {
                return deduction_handles_oc.f11675(var78);
            }
            return (SubLObject)NIL;
        }
        else {
            if (var77.isCons()) {
                return f39971(var77.first());
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f39972(final SubLObject var143, final SubLObject var266) {
        final SubLObject var267 = Numbers.mod(var143, (SubLObject)$ic161$);
        final SubLObject var268 = Sequences.cconcatenate(var266, (SubLObject)$ic322$);
        final SubLObject var269 = Numbers.floor(Numbers.divide(Numbers.mod(var143, (SubLObject)$ic323$), (SubLObject)$ic161$), (SubLObject)UNPROVIDED);
        final SubLObject var270 = Sequences.cconcatenate(var266, (SubLObject)$ic324$);
        final SubLObject var271 = Numbers.floor(Numbers.divide(var143, (SubLObject)$ic323$), (SubLObject)UNPROVIDED);
        final SubLObject var272 = Sequences.cconcatenate(var266, (SubLObject)$ic325$);
        module0642.f39032((SubLObject)THREE_INTEGER);
        module0642.f39019((SubLObject)$ic326$);
        module0642.f39075(var270, var269, (SubLObject)TWO_INTEGER);
        module0642.f39032((SubLObject)THREE_INTEGER);
        module0642.f39019((SubLObject)$ic327$);
        module0642.f39075(var268, var267, (SubLObject)TWO_INTEGER);
        module0642.f39032((SubLObject)THREE_INTEGER);
        module0642.f39019((SubLObject)$ic328$);
        module0642.f39075(var272, var271, (SubLObject)FOUR_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39973(final SubLObject var266, final SubLObject var77) {
        final SubLObject var267 = Sequences.cconcatenate(var266, (SubLObject)$ic322$);
        final SubLObject var268 = Sequences.cconcatenate(var266, (SubLObject)$ic324$);
        final SubLObject var269 = Sequences.cconcatenate(var266, (SubLObject)$ic325$);
        final SubLObject var270 = reader.read_from_string_ignoring_errors(module0642.f39104(var267, var77), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var271 = reader.read_from_string_ignoring_errors(module0642.f39104(var268, var77), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var272 = reader.read_from_string_ignoring_errors(module0642.f39104(var269, var77), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Numbers.add(Numbers.multiply((SubLObject)$ic323$, var272), Numbers.multiply((SubLObject)$ic161$, var271), var270);
    }
    
    public static SubLObject f39974(final SubLObject var127) {
        assert NIL != assertion_handles_oc.f11035(var127) : var127;
        return module0220.f14563(var127, $ic329$, $ic330$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic20$);
    }
    
    public static SubLObject f39975(final SubLObject var258) {
        final SubLThread var259 = SubLProcess.currentSubLThread();
        final SubLObject var260 = module0038.f2874(var258, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic331$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        final SubLObject var261 = module0015.$g537$.currentBinding(var259);
        try {
            module0015.$g537$.bind((SubLObject)T, var259);
            SubLObject var273_274;
            SubLObject var262;
            SubLObject var263;
            SubLObject var264;
            SubLObject var265;
            SubLObject var11_277;
            for (var262 = (var273_274 = Sequences.length(var258)), var263 = (SubLObject)NIL, var263 = (SubLObject)ZERO_INTEGER; !var263.numGE(var273_274); var263 = module0048.f_1X(var263)) {
                var264 = Strings.sublisp_char(var258, var263);
                if (NIL != module0004.f104(var263, var260, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    var265 = $g5183$.getDynamicValue(var259);
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var265) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var265));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    var11_277 = module0015.$g533$.currentBinding(var259);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var259);
                        module0642.f39021(var264);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_277, var259);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                }
                else {
                    module0642.f39019(var264);
                }
            }
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g537$.rebind(var261, var259);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39976(final SubLObject var258, SubLObject var278) {
        if (var278 == UNPROVIDED) {
            var278 = (SubLObject)NIL;
        }
        final SubLThread var279 = SubLProcess.currentSubLThread();
        module0642.f39021((SubLObject)$ic332$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        final SubLObject var280 = module0015.$g537$.currentBinding(var279);
        try {
            module0015.$g537$.bind((SubLObject)T, var279);
            module0642.f39043(var258, var278);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g537$.rebind(var280, var279);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39977(final SubLObject var258) {
        final SubLThread var259 = SubLProcess.currentSubLThread();
        module0642.f39021((SubLObject)$ic333$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        final SubLObject var260 = module0015.$g537$.currentBinding(var259);
        try {
            module0015.$g537$.bind((SubLObject)T, var259);
            module0642.f39019(var258);
        }
        finally {
            module0015.$g537$.rebind(var260, var259);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39978(final SubLObject var258) {
        final SubLThread var259 = SubLProcess.currentSubLThread();
        module0642.f39021((SubLObject)$ic334$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        final SubLObject var260 = module0015.$g537$.currentBinding(var259);
        try {
            module0015.$g537$.bind((SubLObject)T, var259);
            module0642.f39019(var258);
        }
        finally {
            module0015.$g537$.rebind(var260, var259);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39979(SubLObject var279) {
        final SubLThread var280 = SubLProcess.currentSubLThread();
        var279 = module0038.f2735(var279);
        var280.resetMultipleValues();
        final SubLObject var281 = reader.read_from_string_ignoring_errors(var279, (SubLObject)NIL, (SubLObject)$ic335$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var282 = var280.secondMultipleValue();
        var280.resetMultipleValues();
        final SubLObject var283 = module0038.f2623(var279, (SubLObject)ZERO_INTEGER, var282);
        final SubLObject var284 = module0038.f2623(var279, var282, Sequences.length(var279));
        final SubLObject var285 = module0205.f13183(var281, (SubLObject)$ic336$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic337$);
        module0642.f39020(module0015.$g185$.getGlobalValue());
        SubLObject var286 = var285;
        SubLObject var287 = (SubLObject)NIL;
        var287 = var286.first();
        while (NIL != var286) {
            final SubLObject var288 = Symbols.symbol_name(var287);
            final SubLObject var289 = Sequences.search(var288, var279, Symbols.symbol_function((SubLObject)$ic338$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var290 = Sequences.subseq(var279, var289, Numbers.add(var289, Sequences.length(var288)));
            if (!var287.eql(var285.first())) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            module0642.f39019(var290);
            var286 = var286.rest();
            var287 = var286.first();
        }
        module0642.f39020(module0015.$g186$.getGlobalValue());
        module0642.f39021((SubLObject)$ic339$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        SubLObject var291 = module0015.$g537$.currentBinding(var280);
        try {
            module0015.$g537$.bind((SubLObject)T, var280);
            module0642.f39043(var283, (SubLObject)T);
        }
        finally {
            module0015.$g537$.rebind(var291, var280);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        if (NIL == module0038.f2610(var284)) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39021((SubLObject)$ic340$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            var291 = module0015.$g537$.currentBinding(var280);
            try {
                module0015.$g537$.bind((SubLObject)T, var280);
                module0642.f39019(var284);
            }
            finally {
                module0015.$g537$.rebind(var291, var280);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39980(SubLObject var279) {
        final SubLThread var280 = SubLProcess.currentSubLThread();
        var279 = module0038.f2735(var279);
        var280.resetMultipleValues();
        final SubLObject var281 = reader.read_from_string_ignoring_errors(var279, (SubLObject)NIL, (SubLObject)$ic335$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var282 = var280.secondMultipleValue();
        var280.resetMultipleValues();
        final SubLObject var283 = module0038.f2623(var279, (SubLObject)ZERO_INTEGER, var282);
        final SubLObject var284 = module0038.f2623(var279, var282, Sequences.length(var279));
        module0642.f39021((SubLObject)$ic341$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        SubLObject var285 = module0015.$g537$.currentBinding(var280);
        try {
            module0015.$g537$.bind((SubLObject)T, var280);
            module0642.f39019(var283);
        }
        finally {
            module0015.$g537$.rebind(var285, var280);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        module0642.f39021((SubLObject)$ic342$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        var285 = module0015.$g537$.currentBinding(var280);
        try {
            module0015.$g537$.bind((SubLObject)T, var280);
            module0642.f39019(module0207.f13508(var281));
        }
        finally {
            module0015.$g537$.rebind(var285, var280);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        if (NIL == module0038.f2610(var284)) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39021((SubLObject)$ic340$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            var285 = module0015.$g537$.currentBinding(var280);
            try {
                module0015.$g537$.bind((SubLObject)T, var280);
                module0642.f39019(var284);
            }
            finally {
                module0015.$g537$.rebind(var285, var280);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39981(final SubLObject var66) {
        return f39842(var66);
    }
    
    public static SubLObject f39982(final SubLObject var288, final SubLObject var289, SubLObject var290, SubLObject var291, SubLObject var292, SubLObject var293, SubLObject var294) {
        if (var290 == UNPROVIDED) {
            var290 = (SubLObject)NIL;
        }
        if (var291 == UNPROVIDED) {
            var291 = (SubLObject)ONE_INTEGER;
        }
        if (var292 == UNPROVIDED) {
            var292 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var293 == UNPROVIDED) {
            var293 = (SubLObject)NIL;
        }
        if (var294 == UNPROVIDED) {
            var294 = (SubLObject)$ic343$;
        }
        final SubLThread var295 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g318$.getGlobalValue());
        module0642.f39020(module0015.$g320$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var288);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var291) {
            module0642.f39020(module0015.$g321$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var291);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var296 = module0015.$g533$.currentBinding(var295);
        try {
            module0015.$g533$.bind((SubLObject)T, var295);
            if (NIL != var293) {
                module0642.f39020(module0015.$g324$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_295 = module0015.$g533$.currentBinding(var295);
                try {
                    module0015.$g533$.bind((SubLObject)T, var295);
                    module0642.f39019(var294);
                }
                finally {
                    module0015.$g533$.rebind(var11_295, var295);
                }
                module0642.f39020(module0015.$g325$.getGlobalValue());
            }
            SubLObject var297 = var289;
            SubLObject var298 = (SubLObject)NIL;
            var298 = var297.first();
            while (NIL != var297) {
                if (NIL != Functions.funcall(var292, var298)) {
                    final SubLObject var299 = f39981(var298);
                    final SubLObject var300 = Equality.eql(var298, var290);
                    module0642.f39020(module0015.$g324$.getGlobalValue());
                    if (NIL != var300) {
                        module0642.f39046(module0015.$g327$.getGlobalValue());
                    }
                    if (NIL != var299) {
                        module0642.f39020(module0015.$g326$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var299);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_296 = module0015.$g533$.currentBinding(var295);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var295);
                        module0642.f39019(module0597.f36628(var298));
                    }
                    finally {
                        module0015.$g533$.rebind(var11_296, var295);
                    }
                    module0642.f39020(module0015.$g325$.getGlobalValue());
                }
                var297 = var297.rest();
                var298 = var297.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var296, var295);
        }
        module0642.f39020(module0015.$g319$.getGlobalValue());
        return var289;
    }
    
    public static SubLObject f39983(final SubLObject var288, final SubLObject var300) {
        return f39943(module0642.f39104(var288, var300), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39984(final SubLObject var163) {
        return Types.sublisp_null(var163);
    }
    
    public static SubLObject f39985(final SubLObject var288, final SubLObject var301, SubLObject var290, SubLObject var291, SubLObject var292) {
        if (var290 == UNPROVIDED) {
            var290 = (SubLObject)NIL;
        }
        if (var291 == UNPROVIDED) {
            var291 = (SubLObject)ONE_INTEGER;
        }
        if (var292 == UNPROVIDED) {
            var292 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        return f39982(var288, module0259.f16848(var301, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var290, var291, var292, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39986(final SubLObject var288, final SubLObject var300) {
        return f39983(var288, var300);
    }
    
    public static SubLObject f39987(final SubLObject var43) {
        final SubLObject var44 = module0723.f44301();
        SubLObject var45 = (SubLObject)NIL;
        SubLObject var46 = var44;
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            final SubLObject var48 = module0723.f44307((SubLObject)$ic344$, var47);
            if (var48.eql(var43)) {
                var45 = (SubLObject)ConsesLow.cons(module0723.f44307((SubLObject)$ic345$, var47), var45);
                var45 = (SubLObject)ConsesLow.cons(module0723.f44307((SubLObject)$ic346$, var47), var45);
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        if (NIL != var45) {
            var45 = Functions.apply(Symbols.symbol_function((SubLObject)$ic204$), Sequences.nreverse(var45));
        }
        return module0035.f2267(var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39988() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39788", "S#42917", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39789", "S#42749", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39791", "S#43768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39792", "S#43769", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39793", "S#43770", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39794", "S#43771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39795", "S#43772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39796", "S#43773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39797", "S#43774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39798", "S#43775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39799", "S#43776", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39800", "S#33676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39801", "S#43777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39802", "S#43778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39805", "S#43779", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39806", "S#43780", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39807", "S#43781", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39803", "S#43782", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39809", "S#43783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39810", "S#43784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39811", "S#43785", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39812", "S#43786", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39813", "S#43787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39814", "S#43788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39815", "S#43789", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39816", "S#43790", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39817", "S#43791", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39818", "S#43792", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39819", "S#43793", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39821", "S#43794", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39820", "S#43795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39822", "S#43796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39823", "S#43797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39824", "S#43798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39825", "S#43799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39826", "S#17477", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39827", "S#43800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39828", "S#43801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39829", "S#43802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39830", "S#43803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39831", "S#43804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39790", "S#42750", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39833", "S#43805", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39835", "S#43806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39834", "S#43807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39832", "S#42901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39836", "S#43808", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39837", "S#30897", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39840", "S#43746", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39838", "S#43809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39839", "S#43810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39841", "S#43811", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39843", "S#43812", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39845", "S#43813", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39846", "S#43814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39847", "S#43815", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39848", "S#43816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39849", "S#43817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39850", "S#43818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39852", "S#43819", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39854", "S#43820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39857", "S#43821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39858", "S#43822", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39859", "S#43823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39855", "S#43824", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39860", "S#43825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39861", "S#43826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39862", "S#43827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39856", "S#43828", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39863", "S#43829", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39864", "S#43830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39853", "S#43831", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39851", "S#43832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39866", "S#43833", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39867", "S#43834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39868", "S#43835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39869", "S#43836", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39870", "S#43837", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39804", "S#24599", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39871", "S#43838", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39872", "S#43839", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39873", "S#43840", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39874", "S#43841", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39875", "S#43842", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39876", "S#43843", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39877", "S#43844", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39878", "S#43845", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39879", "S#43846", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39880", "S#43847", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39882", "S#43848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39883", "S#43765", 1, 0, false);
        new $f39883$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39881", "S#43849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39884", "S#43850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39885", "S#43851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39886", "S#43852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39887", "S#43853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39888", "S#43854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39889", "S#43855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39890", "S#43856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39891", "S#43857", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39892", "S#43858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39893", "S#43859", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0656", "f39894", "S#43860");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39895", "S#43861", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0656", "f39896", "S#43862");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39897", "S#43863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39899", "S#43864", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39901", "S#43865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39900", "S#43866", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39898", "S#43867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39902", "S#43868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39903", "S#43869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39904", "S#43764", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39905", "S#43870", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39906", "S#43871", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39907", "CB-UNIMPLEMENTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39908", "S#43872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39909", "S#43873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39910", "S#43874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39912", "S#43875", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39913", "S#43876", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39914", "S#43877", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39911", "S#43878", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39808", "S#43879", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39915", "S#43880", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39916", "S#24598", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0656", "f39917", "S#43881");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0656", "f39918", "S#43882");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39919", "S#43754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39920", "S#43753", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39921", "S#43756", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39922", "S#43883", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39923", "S#43884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39924", "S#43885", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39925", "S#43886", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39926", "S#43752", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39927", "S#43751", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39928", "S#43755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39929", "S#43887", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39930", "S#43888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39931", "S#43889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39842", "S#43890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39932", "S#1650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39933", "S#43891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39934", "S#43892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39936", "S#43893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39937", "S#43894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39938", "S#43895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39939", "S#43896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39940", "S#43897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39941", "S#43898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39942", "S#43899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39943", "CB-GUESS-FORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39944", "S#43900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39945", "S#43901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39946", "S#43902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39844", "S#43903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39948", "S#43904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39949", "S#43905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39947", "S#43906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39950", "S#43907", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39951", "S#43908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39952", "S#43909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39953", "S#43910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39954", "S#43911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39955", "S#43912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39865", "S#43913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39956", "S#43914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39957", "S#41092", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39958", "S#43915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39935", "S#43916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39959", "S#43917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39960", "S#41093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39961", "S#43918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39962", "S#43919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39963", "S#43920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39964", "S#43921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39965", "S#43922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39966", "S#43923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39967", "S#43924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39968", "S#43925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39969", "S#43926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39970", "S#43927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39971", "S#43928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39972", "S#43929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39973", "S#43930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39974", "S#43931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39975", "S#43932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39976", "S#43933", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39977", "S#43934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39978", "S#43935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39979", "S#43936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39980", "S#43937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39981", "S#43938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39982", "S#43939", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39983", "S#43940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39984", "S#43941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39985", "S#43942", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39986", "S#43943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0656", "f39987", "S#43944", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39989() {
        $g5145$ = SubLFiles.deflexical("S#43945", (SubLObject)NIL);
        $g5146$ = SubLFiles.deflexical("S#43946", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic51$)) ? $g5146$.getGlobalValue() : NIL));
        $g5147$ = SubLFiles.deflexical("S#43947", (SubLObject)$ic57$);
        $g5148$ = SubLFiles.deflexical("S#43948", (SubLObject)$ic65$);
        $g5149$ = SubLFiles.deflexical("S#43949", (SubLObject)$ic66$);
        $g5150$ = SubLFiles.deflexical("S#43950", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic72$)) ? $g5150$.getGlobalValue() : NIL));
        $g5151$ = SubLFiles.deflexical("S#43951", (SubLObject)FIVE_INTEGER);
        $g5152$ = SubLFiles.defparameter("S#43952", (SubLObject)$ic129$);
        $g5153$ = SubLFiles.defparameter("S#43953", (SubLObject)NIL);
        $g5154$ = SubLFiles.defparameter("S#43954", (SubLObject)$ic144$);
        $g5155$ = SubLFiles.deflexical("S#43955", (SubLObject)NIL);
        $g5156$ = SubLFiles.deflexical("S#43956", (SubLObject)NIL);
        $g5157$ = SubLFiles.defparameter("S#43957", (SubLObject)NIL);
        $g5158$ = SubLFiles.defparameter("S#43958", (SubLObject)NIL);
        $g5159$ = SubLFiles.defparameter("S#43959", (SubLObject)NIL);
        $g5160$ = SubLFiles.deflexical("S#43960", Vectors.make_vector((SubLObject)$ic162$, (SubLObject)NIL));
        $g5161$ = SubLFiles.defparameter("S#43961", (SubLObject)NIL);
        $g5162$ = SubLFiles.defparameter("S#43962", (SubLObject)$ic223$);
        $g5163$ = SubLFiles.defparameter("S#43963", (SubLObject)$ic225$);
        $g5164$ = SubLFiles.defparameter("S#43964", (SubLObject)NIL);
        $g5165$ = SubLFiles.deflexical("S#43965", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic226$)) ? $g5165$.getGlobalValue() : NIL));
        $g5166$ = SubLFiles.deflexical("S#43966", (NIL != Symbols.boundp((SubLObject)$ic227$)) ? $g5166$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)TEN_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5167$ = SubLFiles.defconstant("S#43967", (SubLObject)$ic231$);
        $g5168$ = SubLFiles.defparameter("S#43968", (SubLObject)NIL);
        $g5169$ = SubLFiles.defvar("S#43969", (SubLObject)NIL);
        $g5170$ = SubLFiles.defparameter("S#43970", (SubLObject)NIL);
        $g5171$ = SubLFiles.defparameter("S#43971", (SubLObject)NIL);
        $g5172$ = SubLFiles.defparameter("S#43972", (SubLObject)NIL);
        $g5173$ = SubLFiles.deflexical("S#43973", (SubLObject)$ic311$);
        $g5174$ = SubLFiles.deflexical("S#43974", (SubLObject)$ic312$);
        $g5175$ = SubLFiles.deflexical("S#43975", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic313$)) ? $g5175$.getGlobalValue() : NIL));
        $g5176$ = SubLFiles.deflexical("S#43976", module0038.f2623(module0213.f13918((SubLObject)ONE_INTEGER), (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER));
        $g5177$ = SubLFiles.deflexical("S#43977", Sequences.cconcatenate($g5173$.getGlobalValue(), $g5176$.getGlobalValue()));
        $g5178$ = SubLFiles.deflexical("S#43978", Sequences.cconcatenate($g5174$.getGlobalValue(), $g5176$.getGlobalValue()));
        $g5179$ = SubLFiles.deflexical("S#43979", (SubLObject)$ic320$);
        $g5180$ = SubLFiles.deflexical("S#43980", Sequences.length($g5179$.getGlobalValue()));
        $g5181$ = SubLFiles.deflexical("S#43981", (SubLObject)$ic321$);
        $g5182$ = SubLFiles.deflexical("S#43982", Sequences.length($g5181$.getGlobalValue()));
        $g5183$ = SubLFiles.defparameter("S#43983", (SubLObject)$ic217$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39990() {
        module0034.f1909((SubLObject)$ic39$);
        module0003.f57((SubLObject)$ic51$);
        module0003.f57((SubLObject)$ic72$);
        f39833((SubLObject)$ic15$, (SubLObject)$ic85$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic70$, (SubLObject)$ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic68$, (SubLObject)$ic87$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic90$, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic92$, (SubLObject)$ic93$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic96$, (SubLObject)$ic97$, (SubLObject)$ic98$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        f39833((SubLObject)$ic77$, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)$ic101$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic102$, (SubLObject)$ic103$, (SubLObject)$ic104$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)$ic101$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)$ic101$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic111$, (SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL);
        f39833((SubLObject)$ic114$, (SubLObject)$ic115$, (SubLObject)$ic116$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic117$, (SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39833((SubLObject)$ic120$, (SubLObject)$ic121$, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f39840((SubLObject)$ic131$, (SubLObject)$ic134$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic135$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic136$, (SubLObject)$ic80$));
        Hashtables.sethash((SubLObject)$ic137$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic138$, (SubLObject)$ic80$));
        f39840((SubLObject)$ic137$, (SubLObject)$ic142$, (SubLObject)THREE_INTEGER);
        f39840((SubLObject)$ic135$, (SubLObject)$ic143$, (SubLObject)TWO_INTEGER);
        f39840((SubLObject)$ic145$, (SubLObject)$ic146$, (SubLObject)THREE_INTEGER);
        f39840((SubLObject)$ic147$, (SubLObject)$ic148$, (SubLObject)ONE_INTEGER);
        f39840((SubLObject)$ic152$, (SubLObject)$ic153$, (SubLObject)ONE_INTEGER);
        f39840((SubLObject)$ic156$, (SubLObject)$ic157$, (SubLObject)ONE_INTEGER);
        module0034.f1909((SubLObject)$ic163$);
        module0034.f1909((SubLObject)$ic167$);
        Hashtables.sethash((SubLObject)$ic27$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic170$, (SubLObject)$ic171$));
        Hashtables.sethash((SubLObject)$ic29$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic172$, (SubLObject)$ic173$));
        Hashtables.sethash((SubLObject)$ic174$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic175$, (SubLObject)$ic176$));
        Hashtables.sethash((SubLObject)$ic33$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic177$, (SubLObject)$ic178$));
        Hashtables.sethash((SubLObject)$ic31$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic179$, (SubLObject)$ic180$));
        Hashtables.sethash((SubLObject)$ic181$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic182$, (SubLObject)$ic183$));
        Hashtables.sethash((SubLObject)$ic22$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic184$, (SubLObject)$ic185$));
        Hashtables.sethash((SubLObject)$ic35$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic186$, (SubLObject)$ic187$));
        Hashtables.sethash((SubLObject)$ic24$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic188$, (SubLObject)$ic189$));
        f39840((SubLObject)$ic208$, (SubLObject)$ic209$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic210$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic211$, (SubLObject)$ic212$));
        Hashtables.sethash((SubLObject)$ic213$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic214$, (SubLObject)$ic215$));
        Structures.register_method($g5160$.getGlobalValue(), module0193.$g2259$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic218$));
        Structures.register_method($g5160$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic219$));
        Structures.register_method($g5160$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic220$));
        Structures.register_method($g5160$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic221$));
        Structures.register_method($g5160$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic224$));
        module0003.f57((SubLObject)$ic226$);
        module0003.f57((SubLObject)$ic227$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5167$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic238$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic239$);
        Structures.def_csetf((SubLObject)$ic240$, (SubLObject)$ic241$);
        Structures.def_csetf((SubLObject)$ic242$, (SubLObject)$ic243$);
        Structures.def_csetf((SubLObject)$ic244$, (SubLObject)$ic245$);
        Structures.def_csetf((SubLObject)$ic246$, (SubLObject)$ic247$);
        Equality.identity((SubLObject)$ic231$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5167$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic257$));
        module0002.f50((SubLObject)$ic259$, (SubLObject)$ic261$);
        module0002.f50((SubLObject)$ic265$, (SubLObject)$ic266$);
        module0012.f441((SubLObject)$ic268$);
        module0012.f444((SubLObject)$ic268$);
        Structures.register_method($g5160$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic231$));
        module0015.f873((SubLObject)$ic277$);
        f39840((SubLObject)$ic279$, (SubLObject)$ic280$, (SubLObject)ONE_INTEGER);
        module0003.f57((SubLObject)$ic313$);
        module0002.f35((SubLObject)$ic315$, (SubLObject)$ic316$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39988();
    }
    
    public void initializeVariables() {
        f39989();
    }
    
    public void runTopLevelForms() {
        f39990();
    }
    
    static {
        me = (SubLFile)new module0656();
        $g5145$ = null;
        $g5146$ = null;
        $g5147$ = null;
        $g5148$ = null;
        $g5149$ = null;
        $g5150$ = null;
        $g5151$ = null;
        $g5152$ = null;
        $g5153$ = null;
        $g5154$ = null;
        $g5155$ = null;
        $g5156$ = null;
        $g5157$ = null;
        $g5158$ = null;
        $g5159$ = null;
        $g5160$ = null;
        $g5161$ = null;
        $g5162$ = null;
        $g5163$ = null;
        $g5164$ = null;
        $g5165$ = null;
        $g5166$ = null;
        $g5167$ = null;
        $g5168$ = null;
        $g5169$ = null;
        $g5170$ = null;
        $g5171$ = null;
        $g5172$ = null;
        $g5173$ = null;
        $g5174$ = null;
        $g5175$ = null;
        $g5176$ = null;
        $g5177$ = null;
        $g5178$ = null;
        $g5179$ = null;
        $g5180$ = null;
        $g5181$ = null;
        $g5182$ = null;
        $g5183$ = null;
        $ic0$ = makeString("~a?~a");
        $ic1$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic2$ = makeString("Cyc error");
        $ic3$ = makeString("~A");
        $ic4$ = makeInteger(2000);
        $ic5$ = makeKeyword("CB-CYC");
        $ic6$ = makeString("stylesheet");
        $ic7$ = makeString("text/css");
        $ic8$ = makeKeyword("SHA1");
        $ic9$ = makeString("text/javascript");
        $ic10$ = makeString("yui-skin-sam");
        $ic11$ = makeString("reloadFrameButton");
        $ic12$ = makeString("button");
        $ic13$ = makeString("reload");
        $ic14$ = makeString("Refresh Frames");
        $ic15$ = makeKeyword("SELF");
        $ic16$ = makeString("Back to previous (stale) page");
        $ic17$ = makeString("Back to previous page");
        $ic18$ = makeString("Back to (stale) ");
        $ic19$ = makeString(" page");
        $ic20$ = makeKeyword("TRUE");
        $ic21$ = makeString("True");
        $ic22$ = makeKeyword("FALSE");
        $ic23$ = makeString("False");
        $ic24$ = makeKeyword("UNKNOWN");
        $ic25$ = makeString("Unknown");
        $ic26$ = makeString("???");
        $ic27$ = makeKeyword("DEFAULT");
        $ic28$ = makeString("Default");
        $ic29$ = makeKeyword("MONOTONIC");
        $ic30$ = makeString("Monotonic");
        $ic31$ = makeKeyword("FORWARD");
        $ic32$ = makeString("Forward");
        $ic33$ = makeKeyword("BACKWARD");
        $ic34$ = makeString("Backward");
        $ic35$ = makeKeyword("CODE");
        $ic36$ = makeString("Code");
        $ic37$ = makeInteger(30);
        $ic38$ = makeString("~A ~A, ~A");
        $ic39$ = makeSymbol("S#43782", "CYC");
        $ic40$ = makeSymbol("HTML-GENERATE-PHRASE");
        $ic41$ = makeSymbol("S#43945", "CYC");
        $ic42$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic43$ = makeString("ref/renames-kills.html");
        $ic44$ = makeString("ref/cycl-syntax.html#naming conventions");
        $ic45$ = makeString("toc.html");
        $ic46$ = makeString("--For detailed help and warnings about ~A, please read the ");
        $ic47$ = makeString("#");
        $ic48$ = makeString(" documentation.");
        $ic49$ = makeString("Yes");
        $ic50$ = makeString("No");
        $ic51$ = makeSymbol("S#43946", "CYC");
        $ic52$ = makeKeyword("DEPRECATED");
        $ic53$ = makeSymbol("S#3302", "CYC");
        $ic54$ = makeSymbol("FIFTH");
        $ic55$ = makeKeyword("STANDARD");
        $ic56$ = makeSymbol("CAR");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("Collection")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("defnIff")), constant_handles_oc.f8479((SubLObject)makeString("quotedDefnIff")), constant_handles_oc.f8479((SubLObject)makeString("defnSufficient")), constant_handles_oc.f8479((SubLObject)makeString("quotedDefnSufficient")), constant_handles_oc.f8479((SubLObject)makeString("defnNecessary")), constant_handles_oc.f8479((SubLObject)makeString("quotedDefnNecessary")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("userDocComment")) }), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("Predicate")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("negationPreds")), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), constant_handles_oc.f8479((SubLObject)makeString("arity")), constant_handles_oc.f8479((SubLObject)makeString("arityMin")), constant_handles_oc.f8479((SubLObject)makeString("argsIsa")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsGenl")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestGenl")), constant_handles_oc.f8479((SubLObject)makeString("argIsa")), constant_handles_oc.f8479((SubLObject)makeString("argGenl")), constant_handles_oc.f8479((SubLObject)makeString("argQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg6Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg6QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg6Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg7Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg7QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg7Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg8Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg8QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg8Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg9Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg9QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg9Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg10Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg10QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg10Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg11Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg11QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg11Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg12Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg12QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg12Genl")), constant_handles_oc.f8479((SubLObject)makeString("fanOutArg")), constant_handles_oc.f8479((SubLObject)makeString("evaluationDefn")), constant_handles_oc.f8479((SubLObject)makeString("afterAdding")), constant_handles_oc.f8479((SubLObject)makeString("afterRemoving")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("userDocComment")) }), (SubLObject)ConsesLow.list((SubLObject)NIL, constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("userDocComment"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Microtheory")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("userDocComment"))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("genlFuncs")), constant_handles_oc.f8479((SubLObject)makeString("genlFunctions")), constant_handles_oc.f8479((SubLObject)makeString("resultIsa")), constant_handles_oc.f8479((SubLObject)makeString("resultIsaArg")), constant_handles_oc.f8479((SubLObject)makeString("resultIsaArgIsa")), constant_handles_oc.f8479((SubLObject)makeString("resultGenl")), constant_handles_oc.f8479((SubLObject)makeString("resultGenlArg")), constant_handles_oc.f8479((SubLObject)makeString("arity")), constant_handles_oc.f8479((SubLObject)makeString("arityMin")), constant_handles_oc.f8479((SubLObject)makeString("argsIsa")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("argsGenl")), constant_handles_oc.f8479((SubLObject)makeString("argAndRestGenl")), constant_handles_oc.f8479((SubLObject)makeString("argIsa")), constant_handles_oc.f8479((SubLObject)makeString("argGenl")), constant_handles_oc.f8479((SubLObject)makeString("argQuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("sharedNotes")), constant_handles_oc.f8479((SubLObject)makeString("userDocComment")) }));
        $ic58$ = makeSymbol("S#12274", "CYC");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic60$ = makeSymbol("S#11103", "CYC");
        $ic61$ = makeSymbol("S#13346", "CYC");
        $ic62$ = makeSymbol("S#43801", "CYC");
        $ic63$ = makeSymbol("S#43802", "CYC");
        $ic64$ = makeSymbol("<");
        $ic65$ = makeString("onClick=\"~A.history.back();\"");
        $ic66$ = makeString("onClick=\"var frame_name = '~A'; if (top.frames[frame_name]) top.frames[frame_name].history.back();\"");
        $ic67$ = makeString("Back");
        $ic68$ = makeKeyword("TOP");
        $ic69$ = makeString("top");
        $ic70$ = makeKeyword("PARENT");
        $ic71$ = makeString("parent");
        $ic72$ = makeSymbol("S#43950", "CYC");
        $ic73$ = makeSymbol("KEYWORDP");
        $ic74$ = makeSymbol("STRINGP");
        $ic75$ = makeString("no");
        $ic76$ = makeSymbol("FIRST");
        $ic77$ = makeKeyword("MAIN");
        $ic78$ = makeString("cb-login");
        $ic79$ = makeString("cb-history");
        $ic80$ = makeString("");
        $ic81$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#43984", "CYC"), (SubLObject)makeSymbol("S#43985", "CYC"));
        $ic82$ = makeString("&");
        $ic83$ = makeString("=");
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("KEYWORD"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#1755", "CYC"), (SubLObject)makeSymbol("S#1502", "CYC"), (SubLObject)makeSymbol("S#1619", "CYC"), (SubLObject)makeSymbol("S#1620", "CYC"));
        $ic85$ = makeString("_self");
        $ic86$ = makeString("_parent");
        $ic87$ = makeString("_top");
        $ic88$ = makeKeyword("BLANK");
        $ic89$ = makeString("_blank");
        $ic90$ = makeKeyword("NEW");
        $ic91$ = makeString("_new");
        $ic92$ = makeKeyword("DOC");
        $ic93$ = makeString("doc");
        $ic94$ = makeKeyword("COMPLETION");
        $ic95$ = makeString("completion");
        $ic96$ = makeKeyword("TOOLBAR");
        $ic97$ = makeString("toolbar");
        $ic98$ = makeString("cb-toolbar-frame");
        $ic99$ = makeString("cyc-main");
        $ic100$ = makeString("cb-main-frame");
        $ic101$ = makeString("&~a");
        $ic102$ = makeKeyword("STATUS");
        $ic103$ = makeString("status");
        $ic104$ = makeString("cb-status-frame");
        $ic105$ = makeKeyword("INDEX");
        $ic106$ = makeString("index");
        $ic107$ = makeString("cb-index-frame");
        $ic108$ = makeKeyword("CONTENT");
        $ic109$ = makeString("content");
        $ic110$ = makeString("cb-content-frame");
        $ic111$ = makeKeyword("EMPTY");
        $ic112$ = makeString("empty");
        $ic113$ = makeString("cb-empty-frame");
        $ic114$ = makeKeyword("SETUP");
        $ic115$ = makeString("setup");
        $ic116$ = makeString("cb-setup-frame");
        $ic117$ = makeKeyword("INF-INDEX");
        $ic118$ = makeString("inf-index");
        $ic119$ = makeString("cb-inf-index-frame");
        $ic120$ = makeKeyword("INF-CONTENT");
        $ic121$ = makeString("inf-content");
        $ic122$ = makeString("cb-inf-content-frame");
        $ic123$ = makeString("No cb-link method for ~S defined");
        $ic124$ = makeSymbol("SYMBOLP");
        $ic125$ = makeSymbol("FIXNUMP");
        $ic126$ = makeString("Too many args in ~S:  max of ~S allowed");
        $ic127$ = makeKeyword("CB-LINK-METHOD");
        $ic128$ = makeKeyword("CB-LINK-MAX-ARGS");
        $ic129$ = makeString("cb-cf");
        $ic130$ = makeKeyword("FORT");
        $ic131$ = makeKeyword("CONSTANT");
        $ic132$ = makeString("cb-start|");
        $ic133$ = makeString("~a&~a");
        $ic134$ = makeSymbol("S#43811", "CYC");
        $ic135$ = makeKeyword("NAT");
        $ic136$ = makeString("nat.png");
        $ic137$ = makeKeyword("NART");
        $ic138$ = makeString("nart.png");
        $ic139$ = makeString("-");
        $ic140$ = makeString("(");
        $ic141$ = makeString("absmiddle");
        $ic142$ = makeSymbol("S#43813", "CYC");
        $ic143$ = makeSymbol("S#43814", "CYC");
        $ic144$ = makeString("cb-naut-frame");
        $ic145$ = makeKeyword("NAUT");
        $ic146$ = makeSymbol("S#43815", "CYC");
        $ic147$ = makeKeyword("LEXICON");
        $ic148$ = makeSymbol("S#43816", "CYC");
        $ic149$ = makeString("<NART>");
        $ic150$ = makeString("<NART ");
        $ic151$ = makeString(">");
        $ic152$ = makeKeyword("UNNAMED");
        $ic153$ = makeSymbol("S#43817", "CYC");
        $ic154$ = makeString("cb-af");
        $ic155$ = makeString("cb-start|cb-af");
        $ic156$ = makeKeyword("ASSERTION");
        $ic157$ = makeSymbol("S#43818", "CYC");
        $ic158$ = makeString(" cycid=");
        $ic159$ = makeString(" id=");
        $ic160$ = makeInteger(-30);
        $ic161$ = makeInteger(100);
        $ic162$ = makeInteger(256);
        $ic163$ = makeSymbol("S#43824", "CYC");
        $ic164$ = makeInteger(255);
        $ic165$ = makeString("~C~C0000");
        $ic166$ = makeSymbol("S#43955", "CYC");
        $ic167$ = makeSymbol("S#43828", "CYC");
        $ic168$ = makeString("00~C~C00");
        $ic169$ = makeSymbol("S#43956", "CYC");
        $ic170$ = makeString("yellow.gif");
        $ic171$ = makeString("[Def]");
        $ic172$ = makeString("white.gif");
        $ic173$ = makeString("[Mon]");
        $ic174$ = makeKeyword("DERIVED");
        $ic175$ = makeString("green.gif");
        $ic176$ = makeString("[Inf]");
        $ic177$ = makeString("purple.gif");
        $ic178$ = makeString("[B]");
        $ic179$ = makeString("blue.gif");
        $ic180$ = makeString("[F]");
        $ic181$ = makeKeyword("REDUNDANT");
        $ic182$ = makeString("cyan.gif");
        $ic183$ = makeString("[R]");
        $ic184$ = makeString("red.gif");
        $ic185$ = makeString("[False]");
        $ic186$ = makeString("pink.gif");
        $ic187$ = makeString("[Code]");
        $ic188$ = makeString("gray.gif");
        $ic189$ = makeString("[Unknown]");
        $ic190$ = makeString(" monotonic");
        $ic191$ = makeString(" forward");
        $ic192$ = makeString(" backward");
        $ic193$ = makeString(" rule");
        $ic194$ = makeString(" GAF");
        $ic195$ = makeString(" asserted locally in ");
        $ic196$ = makeString(" by ");
        $ic197$ = makeString(" on ");
        $ic198$ = makeString(" ");
        $ic199$ = makeString(", ");
        $ic200$ = makeString(" at ");
        $ic201$ = makeString(" for ");
        $ic202$ = makeString(" and inferred by Cyc");
        $ic203$ = makeString(" inferred in ");
        $ic204$ = makeSymbol("CCONCATENATE");
        $ic205$ = makeString("cb-sentence");
        $ic206$ = makeString("cb-start|cb-sentence");
        $ic207$ = makeString("~a&~a&t");
        $ic208$ = makeKeyword("SENTENCE");
        $ic209$ = makeSymbol("S#43833", "CYC");
        $ic210$ = makeKeyword("SENTENCE-MARKER");
        $ic211$ = makeString("cyc-logo-3-t.gif");
        $ic212$ = makeString("[CycL]");
        $ic213$ = makeKeyword("HELP");
        $ic214$ = makeString("help_btn_s.gif");
        $ic215$ = makeString("[Help]");
        $ic216$ = makeString("Use of unsupported legacy help system for ~A.  Add and use def-cb-help definition.");
        $ic217$ = makeKeyword("RED");
        $ic218$ = makeSymbol("S#43838", "CYC");
        $ic219$ = makeSymbol("S#43839", "CYC");
        $ic220$ = makeSymbol("S#43840", "CYC");
        $ic221$ = makeSymbol("S#43841", "CYC");
        $ic222$ = makeString("#<INVALID ASSERTION>");
        $ic223$ = makeInteger(60);
        $ic224$ = makeSymbol("S#43846", "CYC");
        $ic225$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("holdsIn")));
        $ic226$ = makeSymbol("S#43965", "CYC");
        $ic227$ = makeSymbol("S#43966", "CYC");
        $ic228$ = makeString("#<");
        $ic229$ = makeKeyword("STREAM");
        $ic230$ = makeKeyword("BASE");
        $ic231$ = makeSymbol("S#43764", "CYC");
        $ic232$ = makeSymbol("S#43765", "CYC");
        $ic233$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("KEYWORD"), (SubLObject)makeSymbol("S#43986", "CYC"), (SubLObject)makeSymbol("S#43987", "CYC"));
        $ic234$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("KEYWORD"), (SubLObject)makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)makeKeyword("HTML-OUTPUT-FN"));
        $ic235$ = ConsesLow.list((SubLObject)makeSymbol("S#43849", "CYC"), (SubLObject)makeSymbol("S#43850", "CYC"), (SubLObject)makeSymbol("S#43851", "CYC"), (SubLObject)makeSymbol("S#43852", "CYC"));
        $ic236$ = ConsesLow.list((SubLObject)makeSymbol("S#43853", "CYC"), (SubLObject)makeSymbol("S#43854", "CYC"), (SubLObject)makeSymbol("S#43855", "CYC"), (SubLObject)makeSymbol("S#43856", "CYC"));
        $ic237$ = makeSymbol("S#43847", "CYC");
        $ic238$ = makeSymbol("S#43848", "CYC");
        $ic239$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#43765", "CYC"));
        $ic240$ = makeSymbol("S#43849", "CYC");
        $ic241$ = makeSymbol("S#43853", "CYC");
        $ic242$ = makeSymbol("S#43850", "CYC");
        $ic243$ = makeSymbol("S#43854", "CYC");
        $ic244$ = makeSymbol("S#43851", "CYC");
        $ic245$ = makeSymbol("S#43855", "CYC");
        $ic246$ = makeSymbol("S#43852", "CYC");
        $ic247$ = makeSymbol("S#43856", "CYC");
        $ic248$ = makeKeyword("NAME");
        $ic249$ = makeKeyword("KEYWORD");
        $ic250$ = makeKeyword("APPLICABILITY-TEST-FN");
        $ic251$ = makeKeyword("HTML-OUTPUT-FN");
        $ic252$ = makeString("Invalid slot ~S for construction function");
        $ic253$ = makeKeyword("BEGIN");
        $ic254$ = makeSymbol("S#43857", "CYC");
        $ic255$ = makeKeyword("SLOT");
        $ic256$ = makeKeyword("END");
        $ic257$ = makeSymbol("S#43859", "CYC");
        $ic258$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#30", "CYC"));
        $ic259$ = makeSymbol("S#43861", "CYC");
        $ic260$ = makeSymbol("QUOTE");
        $ic261$ = makeSymbol("S#43860", "CYC");
        $ic262$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43988", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic263$ = makeSymbol("CLET");
        $ic264$ = makeSymbol("S#43964", "CYC");
        $ic265$ = makeSymbol("S#43863", "CYC");
        $ic266$ = makeSymbol("S#43862", "CYC");
        $ic267$ = makeString("cg?cb-start|");
        $ic268$ = makeSymbol("S#43971", "CYC");
        $ic269$ = makeString("'");
        $ic270$ = makeString(" ...");
        $ic271$ = makeString(" . ");
        $ic272$ = makeString(")");
        $ic273$ = ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"));
        $ic274$ = makeString("Unimplemented Link");
        $ic275$ = makeString("The page for ");
        $ic276$ = makeString(" has not yet been implemented.");
        $ic277$ = makeSymbol("CB-UNIMPLEMENTED");
        $ic278$ = makeString("cb-unimplemented&~A");
        $ic279$ = makeKeyword("UNIMPLEMENTED");
        $ic280$ = makeSymbol("S#43872", "CYC");
        $ic281$ = makeString(" and ");
        $ic282$ = makeString("and ");
        $ic283$ = makeSymbol("HTML-GENERATE-TEXT");
        $ic284$ = makeSymbol("S#43989", "CYC");
        $ic285$ = makeSymbol("CB-CF");
        $ic286$ = constant_handles_oc.f8479((SubLObject)makeString("Cyc"));
        $ic287$ = makeKeyword("SILK");
        $ic288$ = makeKeyword("NL");
        $ic289$ = makeKeyword("CYCL");
        $ic290$ = makeString(" in ");
        $ic291$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic292$ = makeSymbol("PWHEN");
        $ic293$ = makeSymbol("COR");
        $ic294$ = ConsesLow.list((SubLObject)makeSymbol("NULL"), (SubLObject)makeSymbol("S#43972", "CYC"));
        $ic295$ = makeSymbol("FUNCALL");
        $ic296$ = makeSymbol("S#43972", "CYC");
        $ic297$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43972", "CYC"), (SubLObject)NIL));
        $ic298$ = makeSymbol("PROGN");
        $ic299$ = makeInteger(40);
        $ic300$ = makeKeyword("NONE");
        $ic301$ = makeString(" (claimed by ");
        $ic302$ = makeKeyword("HL-SUPPORT");
        $ic303$ = makeString(" module)");
        $ic304$ = makeKeyword("LEFT");
        $ic305$ = makeKeyword("MINI-LOGO");
        $ic306$ = makeKeyword("NBSP");
        $ic307$ = makeString("claimed by ");
        $ic308$ = makeString("EL Formula & Mt Identical to Assertion Above");
        $ic309$ = makeString("EL Formula Identical to Assertion Above");
        $ic310$ = makeSymbol("ASSERTION-P");
        $ic311$ = makeString("c");
        $ic312$ = makeString("nart");
        $ic313$ = makeSymbol("S#43975", "CYC");
        $ic314$ = makeString("NIL");
        $ic315$ = makeSymbol("S#43897", "CYC");
        $ic316$ = ConsesLow.list((SubLObject)makeSymbol("S#43896", "CYC"));
        $ic317$ = makeSymbol("FORT-P");
        $ic318$ = makeSymbol("DIGIT-CHAR-P");
        $ic319$ = makeString(";");
        $ic320$ = makeString("naut");
        $ic321$ = makeString("sentence");
        $ic322$ = makeString("-day");
        $ic323$ = makeInteger(10000);
        $ic324$ = makeString("-month");
        $ic325$ = makeString("-year");
        $ic326$ = makeString("Month");
        $ic327$ = makeString("Day");
        $ic328$ = makeString("Year");
        $ic329$ = constant_handles_oc.f8479((SubLObject)makeString("myReviewer"));
        $ic330$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic331$ = makeString("The following parentheses are unmatched:");
        $ic332$ = makeString("The following constants are invalid:");
        $ic333$ = makeString("This is unreadable, because more was expected at the end :");
        $ic334$ = makeString("Trying to read this generated an internal error :");
        $ic335$ = makeKeyword("EOF");
        $ic336$ = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
        $ic337$ = makeString("The following references to constants are invalid:");
        $ic338$ = makeSymbol("CHAR-EQUAL");
        $ic339$ = makeString("in the following string :");
        $ic340$ = makeString("Also, the following extra string at the end was ignored :");
        $ic341$ = makeString("The following string did not specify a sentence :");
        $ic342$ = makeString("because: ");
        $ic343$ = makeString(" -- none selected -- ");
        $ic344$ = makeSymbol("*THE-CYCLIST*");
        $ic345$ = makeSymbol("*CB-NAT-HISTORY*");
        $ic346$ = makeSymbol("*CB-CONSTANT-HISTORY*");
    }
    
    public static final class $sX43764_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $applicability_test_fn;
        public SubLObject $html_output_fn;
        public static final SubLStructDeclNative structDecl;
        
        public $sX43764_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$applicability_test_fn = (SubLObject)CommonSymbols.NIL;
            this.$html_output_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$keyword;
        }
        
        public SubLObject getField4() {
            return this.$applicability_test_fn;
        }
        
        public SubLObject getField5() {
            return this.$html_output_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$applicability_test_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$html_output_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX43764_native.class, $ic231$, $ic232$, $ic233$, $ic234$, new String[] { "$name", "$keyword", "$applicability_test_fn", "$html_output_fn" }, $ic235$, $ic236$, $ic237$);
        }
    }
    
    public static final class $f39883$UnaryFunction extends UnaryFunction
    {
        public $f39883$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#43765"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f39883(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1905 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/