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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0714 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0714";
    public static final String myFingerPrint = "713da2a3901c799ffa09b0b2f679ca124ec07524cd0897a849dbf5b7bde7db4b";
    private static SubLSymbol $g5660$;
    private static SubLSymbol $g5661$;
    private static SubLSymbol $g5662$;
    public static SubLSymbol $g5663$;
    private static SubLSymbol $g5664$;
    private static SubLSymbol $g5665$;
    private static SubLSymbol $g5666$;
    private static SubLSymbol $g5667$;
    private static SubLSymbol $g5668$;
    private static SubLSymbol $g5669$;
    private static SubLSymbol $g5670$;
    private static SubLSymbol $g5671$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLString $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLString $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
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
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLObject $ic117$;
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
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLString $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLString $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLString $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLString $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLString $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLString $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLString $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLString $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLObject $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLList $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLObject $ic193$;
    private static final SubLString $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLString $ic196$;
    private static final SubLObject $ic197$;
    private static final SubLString $ic198$;
    private static final SubLList $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLString $ic203$;
    private static final SubLObject $ic204$;
    private static final SubLString $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLString $ic211$;
    private static final SubLObject $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLList $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLObject $ic234$;
    private static final SubLString $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLObject $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLSymbol $ic244$;
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
    private static final SubLObject $ic256$;
    private static final SubLList $ic257$;
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
    private static final SubLSymbol $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLList $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLString $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLString $ic289$;
    private static final SubLString $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLString $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLString $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLString $ic304$;
    private static final SubLString $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    
    
    public static SubLObject f43860() {
        module0006.f218((SubLObject)T, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43861(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        var3 = conses_high.copy_list(var3);
        f43862((SubLObject)$ic5$, module0035.f2333((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var1, var2, var3)));
        SubLObject var4 = (SubLObject)NIL;
        try {
            var4 = compatibility.open_text(var2, (SubLObject)$ic7$);
            if (!var4.isStream()) {
                Errors.error((SubLObject)$ic8$, var2);
            }
            final SubLObject var5_6 = var4;
            final SubLObject var5 = f43863(var3);
            f43864(var5, var1);
            f43865(var5, f43866(var1));
            f43867(var5, (SubLObject)$ic9$, var5_6);
            f43867(var5, (SubLObject)$ic10$, var2);
            f43868(var5);
            return var5;
        }
        finally {
            final SubLObject var6 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var4.isStream()) {
                    streams_high.close(var4, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var6);
            }
        }
    }
    
    public static SubLObject f43869(final SubLObject var1, SubLObject var5, SubLObject var3) {
        if (var5 == UNPROVIDED) {
            var5 = module0587.$g4457$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        var3 = conses_high.copy_list(var3);
        f43862((SubLObject)$ic13$, module0035.f2333((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var1, var5, var3)));
        final SubLObject var6 = f43863(var3);
        f43864(var6, var1);
        f43865(var6, f43866(var1));
        f43867(var6, (SubLObject)$ic9$, var5);
        f43868(var6);
        return var6;
    }
    
    public static SubLObject f43870(final SubLObject var9, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        var3 = conses_high.copy_list(var3);
        f43862((SubLObject)$ic16$, module0035.f2333((SubLObject)$ic17$, (SubLObject)ConsesLow.list(var9, var2, var3)));
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = compatibility.open_text(var2, (SubLObject)$ic7$);
            if (!var10.isStream()) {
                Errors.error((SubLObject)$ic8$, var2);
            }
            final SubLObject var5_11 = var10;
            final SubLObject var11 = f43863(var3);
            f43865(var11, var9);
            f43867(var11, (SubLObject)$ic9$, var5_11);
            f43867(var11, (SubLObject)$ic10$, var2);
            f43868(var11);
            return var11;
        }
        finally {
            final SubLObject var12 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var10.isStream()) {
                    streams_high.close(var10, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var12);
            }
        }
    }
    
    public static SubLObject f43871(final SubLObject var9, SubLObject var5, SubLObject var3) {
        if (var5 == UNPROVIDED) {
            var5 = module0587.$g4457$.getDynamicValue();
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        var3 = conses_high.copy_list(var3);
        f43862((SubLObject)$ic19$, module0035.f2333((SubLObject)$ic20$, (SubLObject)ConsesLow.list(var9, var3)));
        final SubLObject var10 = f43863(var3);
        f43865(var10, var9);
        f43867(var10, (SubLObject)$ic9$, var5);
        f43868(var10);
        return var10;
    }
    
    public static SubLObject f43866(final SubLObject var1) {
        final SubLObject var2 = module0220.f14565(var1, $ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            SubLObject var13_15 = module0259.f16995(var5);
            SubLObject var6 = (SubLObject)NIL;
            var6 = var13_15.first();
            while (NIL != var13_15) {
                final SubLObject var7 = var6;
                if (NIL == conses_high.member(var7, var3, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var7, var3);
                }
                var13_15 = var13_15.rest();
                var6 = var13_15.first();
            }
            SubLObject var13_16 = module0259.f16847(var5);
            var6 = (SubLObject)NIL;
            var6 = var13_16.first();
            while (NIL != var13_16) {
                final SubLObject var7 = var6;
                if (NIL == conses_high.member(var7, var3, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var7, var3);
                }
                var13_16 = var13_16.rest();
                var6 = var13_16.first();
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        var4 = module0220.f14565(var1, $ic22$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var4.first();
        while (NIL != var4) {
            final SubLObject var9 = var8;
            if (NIL == conses_high.member(var9, var3, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var3 = (SubLObject)ConsesLow.cons(var9, var3);
            }
            var4 = var4.rest();
            var8 = var4.first();
        }
        var4 = module0220.f14565(var1, $ic23$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        var8 = (SubLObject)NIL;
        var8 = var4.first();
        while (NIL != var4) {
            final SubLObject var9 = var8;
            if (NIL == conses_high.member(var9, var3, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var3 = (SubLObject)ConsesLow.cons(var9, var3);
            }
            var4 = var4.rest();
            var8 = var4.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f43862(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        if (NIL != module0035.f2346(var20, (SubLObject)$ic10$)) {
            final SubLObject var23 = conses_high.getf(var20, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
            if (NIL != module0075.f5218(var23)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic24$, var19, conses_high.getf(var20, (SubLObject)$ic10$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var22 = (SubLObject)T;
            }
        }
        final SubLObject var24 = conses_high.getf(var20, (SubLObject)$ic25$, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f2327(var24)) {
            module0006.f218((SubLObject)T, (SubLObject)$ic26$, var19, conses_high.getf(var20, (SubLObject)$ic25$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var22 = (SubLObject)T;
        }
        final SubLObject var25 = conses_high.getf(var24, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            if (NIL == module0259.f16891(var25, $ic28$)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic29$, var19, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var22 = (SubLObject)T;
            }
        }
        else if (NIL == module0259.f16891(module0574.f35152(), $ic28$) || $ic30$.eql(module0574.f35152())) {
            module0006.f218((SubLObject)T, (SubLObject)$ic31$, var19, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var22 = (SubLObject)T;
        }
        final SubLObject var26 = conses_high.set_difference(module0035.f2354(var24), $g5660$.getDynamicValue(var21), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0006.f218((SubLObject)T, (SubLObject)$ic32$, var19, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var22 = (SubLObject)T;
        }
        if (NIL != var22) {
            f43860();
            Errors.error((SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43868(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        final SubLObject var9 = f43873(var7);
        final SubLObject var10 = f43874(var7);
        SubLObject var11 = f43875(var7, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        SubLObject var12 = f43875(var7, (SubLObject)$ic36$, (SubLObject)UNPROVIDED);
        final SubLObject var13 = f43875(var7, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
        final SubLObject var14 = $g5661$.currentBinding(var8);
        try {
            $g5661$.bind(Hashtables.make_hash_table(Numbers.min((SubLObject)TEN_INTEGER, Numbers.multiply((SubLObject)THREE_INTEGER, Sequences.length(var10))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var8);
            final SubLObject var15 = f43875(var7, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
            final SubLObject var8_30 = module0012.$silent_progressP$.currentBinding(var8);
            try {
                module0012.$silent_progressP$.bind((SubLObject)makeBoolean(NIL == var15), var8);
                if (NIL == module0161.f10499(var11) && $ic39$ != var11 && NIL != module0173.f10955(var9)) {
                    var11 = module0220.f14556(var9, $ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL == module0161.f10499(var11)) {
                    var11 = (SubLObject)$ic39$;
                }
                f43867(var7, (SubLObject)$ic35$, var11);
                if (NIL == module0269.f17705(var12) && NIL != module0173.f10955(var9)) {
                    var12 = module0220.f14556(var9, $ic21$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL == module0269.f17705(var12)) {
                    var12 = (SubLObject)NIL;
                }
                f43867(var7, (SubLObject)$ic36$, var12);
                if (NIL != f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
                    if (NIL != var15) {
                        module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var8), (SubLObject)$ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if ($ic43$ != f43875(var7, (SubLObject)$ic44$, (SubLObject)UNPROVIDED)) {
                        if (NIL != var15) {
                            Errors.warn((SubLObject)$ic45$);
                        }
                        f43867(var7, (SubLObject)$ic44$, (SubLObject)$ic43$);
                    }
                    if (NIL != f43875(var7, (SubLObject)$ic46$, (SubLObject)UNPROVIDED)) {
                        Errors.warn((SubLObject)$ic47$);
                    }
                    f43867(var7, (SubLObject)$ic48$, (SubLObject)T);
                    if (T == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
                        f43867(var7, (SubLObject)$ic41$, (SubLObject)$ic49$);
                    }
                    if ($ic49$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
                        f43867(var7, (SubLObject)$ic37$, module0710.f43474((SubLObject)UNPROVIDED));
                        f43867(var7, (SubLObject)$ic50$, module0710.f43474((SubLObject)UNPROVIDED));
                        f43867(var7, (SubLObject)$ic46$, (SubLObject)$ic51$);
                    }
                    else if ($ic52$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
                        f43867(var7, (SubLObject)$ic37$, module0710.f43473((SubLObject)UNPROVIDED));
                        f43867(var7, (SubLObject)$ic50$, module0710.f43473((SubLObject)UNPROVIDED));
                        f43867(var7, (SubLObject)$ic46$, (SubLObject)$ic53$);
                    }
                    else if ($ic54$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
                        f43867(var7, (SubLObject)$ic37$, module0710.f43479());
                        f43867(var7, (SubLObject)$ic50$, module0710.f43479());
                        f43867(var7, (SubLObject)$ic46$, (SubLObject)$ic55$);
                    }
                    else {
                        if (NIL != var15) {
                            Errors.warn((SubLObject)$ic56$);
                        }
                        f43867(var7, (SubLObject)$ic41$, (SubLObject)$ic49$);
                        f43867(var7, (SubLObject)$ic37$, module0710.f43474((SubLObject)UNPROVIDED));
                        f43867(var7, (SubLObject)$ic50$, module0710.f43474((SubLObject)UNPROVIDED));
                    }
                }
                if (NIL == module0038.f2653(var13) && NIL != module0173.f10955(var9)) {
                    final SubLObject var16 = module0220.f14556(var9, $ic57$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var17 = (NIL != module0173.f10955(var16)) ? module0220.f14556(var16, $ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var16;
                    if (NIL != module0038.f2653(var17)) {
                        f43867(var7, (SubLObject)$ic37$, var17);
                    }
                }
                final SubLObject var18 = (SubLObject)makeBoolean($ic54$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED) || $ic52$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED));
                final SubLObject var8_31 = module0711.$g5593$.currentBinding(var8);
                final SubLObject var19 = module0711.$g5588$.currentBinding(var8);
                final SubLObject var20 = module0710.$g5584$.currentBinding(var8);
                try {
                    module0711.$g5593$.bind((SubLObject)NIL, var8);
                    module0711.$g5588$.bind(var18, var8);
                    module0710.$g5584$.bind(module0035.sublisp_boolean(f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)), var8);
                    f43876(var7);
                    if (NIL != var15) {
                        module0708.f43052(f43877(var7));
                    }
                    f43878(var7);
                }
                finally {
                    module0710.$g5584$.rebind(var20, var8);
                    module0711.$g5588$.rebind(var19, var8);
                    module0711.$g5593$.rebind(var8_31, var8);
                }
                f43879(var7);
            }
            finally {
                module0012.$silent_progressP$.rebind(var8_30, var8);
            }
        }
        finally {
            $g5661$.rebind(var14, var8);
        }
        return var7;
    }
    
    public static SubLObject f43880() {
        final SubLObject var37 = Sequences.position_if((SubLObject)$ic61$, $g5662$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var38 = module0038.f2666(module0038.f2623($g5662$.getGlobalValue(), var37, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER);
        module0038.f2743((SubLObject)ZERO_INTEGER, var38, (SubLObject)Characters.CHAR_2, (SubLObject)UNPROVIDED);
        return var38;
    }
    
    public static SubLObject f43881(final SubLObject var39, final SubLObject var5) {
        f43882(var39, var5, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43872(final SubLObject var39) {
        return (SubLObject)((var39.getClass() == $sX48033_native.class) ? T : NIL);
    }
    
    public static SubLObject f43883(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField2();
    }
    
    public static SubLObject f43884(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField3();
    }
    
    public static SubLObject f43885(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField4();
    }
    
    public static SubLObject f43886(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField5();
    }
    
    public static SubLObject f43887(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField6();
    }
    
    public static SubLObject f43888(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField7();
    }
    
    public static SubLObject f43889(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField8();
    }
    
    public static SubLObject f43890(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField9();
    }
    
    public static SubLObject f43891(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField10();
    }
    
    public static SubLObject f43892(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField11();
    }
    
    public static SubLObject f43893(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField12();
    }
    
    public static SubLObject f43894(final SubLObject var39) {
        assert NIL != f43872(var39) : var39;
        return var39.getField13();
    }
    
    public static SubLObject f43895(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField2(var41);
    }
    
    public static SubLObject f43896(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField3(var41);
    }
    
    public static SubLObject f43897(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField4(var41);
    }
    
    public static SubLObject f43898(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField5(var41);
    }
    
    public static SubLObject f43899(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField6(var41);
    }
    
    public static SubLObject f43900(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField7(var41);
    }
    
    public static SubLObject f43901(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField8(var41);
    }
    
    public static SubLObject f43902(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField9(var41);
    }
    
    public static SubLObject f43903(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField10(var41);
    }
    
    public static SubLObject f43904(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField11(var41);
    }
    
    public static SubLObject f43905(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField12(var41);
    }
    
    public static SubLObject f43906(final SubLObject var39, final SubLObject var41) {
        assert NIL != f43872(var39) : var39;
        return var39.setField13(var41);
    }
    
    public static SubLObject f43907(SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        final SubLObject var43 = (SubLObject)new $sX48033_native();
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        for (var44 = (SubLObject)NIL, var44 = var42; NIL != var44; var44 = conses_high.cddr(var44)) {
            var45 = var44.first();
            var46 = conses_high.cadr(var44);
            var47 = var45;
            if (var47.eql((SubLObject)$ic94$)) {
                f43895(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic95$)) {
                f43896(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic96$)) {
                f43897(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic97$)) {
                f43898(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic27$)) {
                f43899(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic98$)) {
                f43900(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic99$)) {
                f43901(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic100$)) {
                f43902(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic101$)) {
                f43903(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic102$)) {
                f43904(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic103$)) {
                f43905(var43, var46);
            }
            else if (var47.eql((SubLObject)$ic104$)) {
                f43906(var43, var46);
            }
            else {
                Errors.error((SubLObject)$ic105$, var45);
            }
        }
        return var43;
    }
    
    public static SubLObject f43908(final SubLObject var48, final SubLObject var49) {
        Functions.funcall(var49, var48, (SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic94$, f43883(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic95$, f43884(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic96$, f43885(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic97$, f43886(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic27$, f43887(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic98$, f43888(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic99$, f43889(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic100$, f43890(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic101$, f43891(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic102$, f43892(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic103$, f43893(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic108$, (SubLObject)$ic104$, f43894(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic109$, (SubLObject)$ic107$, (SubLObject)TWELVE_INTEGER);
        return var48;
    }
    
    public static SubLObject f43909(final SubLObject var48, final SubLObject var49) {
        return f43908(var48, var49);
    }
    
    public static SubLObject f43882(final SubLObject var50, final SubLObject var5, final SubLObject var51) {
        PrintLow.format(var5, (SubLObject)$ic111$, f43883(var50), f43884(var50));
        return var50;
    }
    
    public static SubLObject f43863(final SubLObject var23) {
        assert NIL != module0035.f2327(var23) : var23;
        final SubLObject var24 = f43907((SubLObject)UNPROVIDED);
        final SubLObject var25 = conses_high.getf(var23, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
        f43895(var24, f43910());
        f43899(var24, f43911(var25));
        f43902(var24, (SubLObject)NIL);
        f43903(var24, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f43904(var24, module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        f43905(var24, var23);
        return var24;
    }
    
    public static SubLObject f43911(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = f43880();
        final SubLObject var27 = module0202.f12768($ic113$, $ic114$, var26);
        final SubLObject var28 = module0202.f12768($ic115$, var27, var24);
        if (NIL == module0226.f14809(module0172.f10921(var28))) {
            final SubLObject var29 = module0111.$g1405$.currentBinding(var25);
            try {
                module0111.$g1405$.bind((SubLObject)NIL, var25);
                module0574.f35153(var24);
                module0543.f33631((SubLObject)ConsesLow.list($ic116$, var28), $ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0111.$g1405$.rebind(var29, var25);
            }
        }
        return module0172.f10921(var28);
    }
    
    public static SubLObject f43910() {
        return module0057.f4175($g5664$.getGlobalValue());
    }
    
    public static SubLObject f43912() {
        return $g5665$.getGlobalValue();
    }
    
    public static SubLObject f43913(final SubLObject var7, final SubLObject var54) {
        return module0067.f4886($g5665$.getGlobalValue(), var54, var7);
    }
    
    public static SubLObject f43914(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43883(var7);
    }
    
    public static SubLObject f43915(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43884(var7);
    }
    
    public static SubLObject f43916(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43885(var7);
    }
    
    public static SubLObject f43917(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43886(var7);
    }
    
    public static SubLObject f43918(final SubLObject var7, final SubLObject var55) {
        assert NIL != f43872(var7) : var7;
        assert NIL != module0701.f42628(var55) : var55;
        f43898(var7, var55);
        return var55;
    }
    
    public static SubLObject f43919(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43887(var7);
    }
    
    public static SubLObject f43920(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43888(var7);
    }
    
    public static SubLObject f43873(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43889(var7);
    }
    
    public static SubLObject f43864(final SubLObject var7, final SubLObject var56) {
        assert NIL != f43872(var7) : var7;
        assert NIL != module0173.f10955(var56) : var56;
        f43901(var7, var56);
        return var56;
    }
    
    public static SubLObject f43874(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43890(var7);
    }
    
    public static SubLObject f43865(final SubLObject var7, final SubLObject var9) {
        assert NIL != f43872(var7) : var7;
        f43902(var7, var9);
        return var9;
    }
    
    public static SubLObject f43921(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43891(var7);
    }
    
    public static SubLObject f43922(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43892(var7);
    }
    
    public static SubLObject f43923(final SubLObject var7, final SubLObject var57, final SubLObject var58) {
        return module0067.f4886(f43922(var7), var57, var58);
    }
    
    public static SubLObject f43924(final SubLObject var7, final SubLObject var57) {
        return module0067.f4885(f43922(var7), var57, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43925(final SubLObject var7) {
        return f43924(var7, (SubLObject)$ic122$);
    }
    
    public static SubLObject f43926(final SubLObject var7) {
        return f43924(var7, (SubLObject)$ic123$);
    }
    
    public static SubLObject f43927(final SubLObject var7) {
        return f43924(var7, (SubLObject)$ic124$);
    }
    
    public static SubLObject f43928(final SubLObject var7) {
        return f43923(var7, (SubLObject)$ic123$, module0048.f_1X(f43926(var7)));
    }
    
    public static SubLObject f43929(final SubLObject var7) {
        return f43923(var7, (SubLObject)$ic124$, module0048.f_1X(f43927(var7)));
    }
    
    public static SubLObject f43930(final SubLObject var7, final SubLObject var23) {
        assert NIL != f43872(var7) : var7;
        if (NIL != var23 && !areAssertionsDisabledFor(me) && NIL == module0035.f2327(var23)) {
            throw new AssertionError(var23);
        }
        f43905(var7, var23);
        return var23;
    }
    
    public static SubLObject f43867(final SubLObject var7, final SubLObject var59, final SubLObject var58) {
        assert NIL != f43872(var7) : var7;
        SubLObject var60 = f43893(var7);
        var60 = conses_high.putf(var60, var59, var58);
        f43905(var7, var60);
        return var60;
    }
    
    public static SubLObject f43931(final SubLObject var7, final SubLObject var59, final SubLObject var58) {
        assert NIL != f43872(var7) : var7;
        SubLObject var60 = f43893(var7);
        if (NIL == module0035.f2346(var60, var59)) {
            var60 = conses_high.putf(var60, var59, var58);
            f43905(var7, var60);
        }
        return var60;
    }
    
    public static SubLObject f43875(final SubLObject var7, final SubLObject var59, SubLObject var60) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        assert NIL != f43872(var7) : var7;
        return conses_high.getf(f43893(var7), var59, var60);
    }
    
    public static SubLObject f43877(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43893(var7);
    }
    
    public static SubLObject f43932(final SubLObject var7, final SubLObject var61) {
        assert NIL != f43872(var7) : var7;
        assert NIL != Types.processp(var61) : var61;
        f43906(var7, var61);
        return f43894(var7);
    }
    
    public static SubLObject f43933(final SubLObject var7) {
        assert NIL != f43872(var7) : var7;
        return f43894(var7);
    }
    
    public static SubLObject f43934(final SubLObject var50) {
        return f43935(var50);
    }
    
    public static SubLObject f43935(final SubLObject var7) {
        return Sxhash.sxhash(f43883(var7));
    }
    
    public static SubLObject f43876(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        final SubLObject var9 = f43875(var7, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = f43873(var7);
        final SubLObject var11 = f43875(var7, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        final SubLObject var12 = f43874(var7);
        final SubLObject var13 = module0701.f42625();
        f43918(var7, var13);
        f43936(var7);
        final SubLObject var14 = module0139.$g1630$.getDynamicValue(var8);
        final SubLObject var15 = module0139.$g1631$.currentBinding(var8);
        final SubLObject var16 = module0139.$g1632$.currentBinding(var8);
        final SubLObject var17 = module0139.$g1630$.currentBinding(var8);
        final SubLObject var18 = module0147.$g2095$.currentBinding(var8);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var8);
        try {
            module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)SIX_INTEGER), var8);
            module0139.$g1632$.bind(module0139.f9016(var14), var8);
            module0139.$g1630$.bind((SubLObject)T, var8);
            module0147.$g2095$.bind((SubLObject)((NIL != module0161.f10481(var11)) ? var11 : NIL), var8);
            module0147.$g2094$.bind((SubLObject)((NIL != f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED) || $ic39$ == var11) ? $ic128$ : ((NIL != f43875(var7, (SubLObject)$ic129$, (SubLObject)UNPROVIDED)) ? $ic130$ : $ic131$)), var8);
            final SubLObject var21;
            final SubLObject var20 = var21 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var8_67 = module0034.$g879$.currentBinding(var8);
            try {
                module0034.$g879$.bind(var21, var8);
                SubLObject var22 = (SubLObject)NIL;
                if (NIL != var21 && NIL == module0034.f1842(var21)) {
                    var22 = module0034.f1869(var21);
                    final SubLObject var23 = Threads.current_process();
                    if (NIL == var22) {
                        module0034.f1873(var21, var23);
                    }
                    else if (!var22.eql(var23)) {
                        Errors.error((SubLObject)$ic132$);
                    }
                }
                try {
                    final SubLObject var24 = (SubLObject)$ic133$;
                    final SubLObject var8_68 = module0012.$g73$.currentBinding(var8);
                    final SubLObject var35_72 = module0012.$g65$.currentBinding(var8);
                    final SubLObject var36_73 = module0012.$g67$.currentBinding(var8);
                    final SubLObject var63_74 = module0012.$g68$.currentBinding(var8);
                    final SubLObject var64_75 = module0012.$g66$.currentBinding(var8);
                    final SubLObject var25 = module0012.$g69$.currentBinding(var8);
                    final SubLObject var26 = module0012.$g70$.currentBinding(var8);
                    final SubLObject var27 = module0012.$silent_progressP$.currentBinding(var8);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var8);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var8), var8);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var8);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var8);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var8);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var8);
                        module0012.$g70$.bind((SubLObject)T, var8);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var24) ? module0012.$silent_progressP$.getDynamicValue(var8) : T), var8);
                        module0012.f474(var24);
                        if (NIL != module0173.f10955(var10)) {
                            f43937(var7, var10, (SubLObject)T);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var27, var8);
                        module0012.$g70$.rebind(var26, var8);
                        module0012.$g69$.rebind(var25, var8);
                        module0012.$g66$.rebind(var64_75, var8);
                        module0012.$g68$.rebind(var63_74, var8);
                        module0012.$g67$.rebind(var36_73, var8);
                        module0012.$g65$.rebind(var35_72, var8);
                        module0012.$g73$.rebind(var8_68, var8);
                    }
                }
                finally {
                    final SubLObject var8_69 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                        if (NIL != var12) {
                            SubLObject var28 = var12;
                            module0012.$g82$.setDynamicValue((SubLObject)$ic134$, var8);
                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                            module0012.$g83$.setDynamicValue(Sequences.length(var28), var8);
                            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                            final SubLObject var8_70 = module0012.$g75$.currentBinding(var8);
                            final SubLObject var35_73 = module0012.$g76$.currentBinding(var8);
                            final SubLObject var36_74 = module0012.$g77$.currentBinding(var8);
                            final SubLObject var63_75 = module0012.$g78$.currentBinding(var8);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                module0012.$g77$.bind((SubLObject)T, var8);
                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                SubLObject var29 = var28;
                                SubLObject var30 = (SubLObject)NIL;
                                var30 = var29.first();
                                while (NIL != var29) {
                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                    if (NIL != module0269.f17705(var30)) {
                                        f43937(var7, var30, (SubLObject)T);
                                    }
                                    var29 = var29.rest();
                                    var30 = var29.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var63_75, var8);
                                module0012.$g77$.rebind(var36_74, var8);
                                module0012.$g76$.rebind(var35_73, var8);
                                module0012.$g75$.rebind(var8_70, var8);
                            }
                            var28 = var12;
                            module0012.$g82$.setDynamicValue((SubLObject)$ic135$, var8);
                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                            module0012.$g83$.setDynamicValue(Sequences.length(var28), var8);
                            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                            final SubLObject var8_71 = module0012.$g75$.currentBinding(var8);
                            final SubLObject var35_74 = module0012.$g76$.currentBinding(var8);
                            final SubLObject var36_75 = module0012.$g77$.currentBinding(var8);
                            final SubLObject var63_76 = module0012.$g78$.currentBinding(var8);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                module0012.$g77$.bind((SubLObject)T, var8);
                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                SubLObject var29 = var28;
                                SubLObject var30 = (SubLObject)NIL;
                                var30 = var29.first();
                                while (NIL != var29) {
                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                    if (NIL == module0269.f17705(var30)) {
                                        f43937(var7, var30, (SubLObject)T);
                                    }
                                    var29 = var29.rest();
                                    var30 = var29.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var63_76, var8);
                                module0012.$g77$.rebind(var36_75, var8);
                                module0012.$g76$.rebind(var35_74, var8);
                                module0012.$g75$.rebind(var8_71, var8);
                            }
                        }
                        if (NIL != f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED)) {
                            SubLObject var31 = Sequences.copy_seq((SubLObject)$ic136$);
                            SubLObject var32 = module0173.f10962();
                            SubLObject var33 = (SubLObject)ZERO_INTEGER;
                            final SubLObject var8_72 = module0012.$g75$.currentBinding(var8);
                            final SubLObject var35_75 = module0012.$g76$.currentBinding(var8);
                            final SubLObject var36_76 = module0012.$g77$.currentBinding(var8);
                            final SubLObject var63_77 = module0012.$g78$.currentBinding(var8);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                module0012.$g77$.bind((SubLObject)T, var8);
                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                module0012.f478(var31);
                                SubLObject var34 = module0173.f10961();
                                SubLObject var35 = (SubLObject)NIL;
                                var35 = var34.first();
                                while (NIL != var34) {
                                    final SubLObject var36 = var35;
                                    if (NIL == module0065.f4772(var36, (SubLObject)$ic137$)) {
                                        final SubLObject var99_100 = var36;
                                        if (NIL == module0065.f4775(var99_100, (SubLObject)$ic137$)) {
                                            final SubLObject var37 = module0065.f4740(var99_100);
                                            final SubLObject var38 = (SubLObject)NIL;
                                            SubLObject var39;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var42;
                                            for (var39 = Sequences.length(var37), var40 = (SubLObject)NIL, var40 = (SubLObject)ZERO_INTEGER; var40.numL(var39); var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER)) {
                                                var41 = ((NIL != var38) ? Numbers.subtract(var39, var40, (SubLObject)ONE_INTEGER) : var40);
                                                var42 = Vectors.aref(var37, var41);
                                                if (NIL == module0065.f4749(var42) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                    if (NIL != module0065.f4749(var42)) {
                                                        var42 = (SubLObject)$ic137$;
                                                    }
                                                    var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                                                    module0012.note_percent_progress(var33, var32);
                                                    if (NIL != module0269.f17705(var42)) {
                                                        f43937(var7, var42, (SubLObject)T);
                                                    }
                                                }
                                            }
                                        }
                                        final SubLObject var107_108 = var36;
                                        if (NIL == module0065.f4777(var107_108) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                            final SubLObject var43 = module0065.f4738(var107_108);
                                            SubLObject var44 = module0065.f4739(var107_108);
                                            final SubLObject var45 = module0065.f4734(var107_108);
                                            final SubLObject var46 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic137$)) ? NIL : $ic137$);
                                            while (var44.numL(var45)) {
                                                final SubLObject var47 = Hashtables.gethash_without_values(var44, var43, var46);
                                                if (NIL == module0065.f4773((SubLObject)$ic137$) || NIL == module0065.f4749(var47)) {
                                                    var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                                                    module0012.note_percent_progress(var33, var32);
                                                    if (NIL != module0269.f17705(var47)) {
                                                        f43937(var7, var47, (SubLObject)T);
                                                    }
                                                }
                                                var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
                                            }
                                        }
                                    }
                                    var34 = var34.rest();
                                    var35 = var34.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var63_77, var8);
                                module0012.$g77$.rebind(var36_76, var8);
                                module0012.$g76$.rebind(var35_75, var8);
                                module0012.$g75$.rebind(var8_72, var8);
                            }
                            var31 = Sequences.copy_seq((SubLObject)$ic138$);
                            var32 = module0173.f10962();
                            var33 = (SubLObject)ZERO_INTEGER;
                            final SubLObject var8_73 = module0012.$g75$.currentBinding(var8);
                            final SubLObject var35_76 = module0012.$g76$.currentBinding(var8);
                            final SubLObject var36_77 = module0012.$g77$.currentBinding(var8);
                            final SubLObject var63_78 = module0012.$g78$.currentBinding(var8);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                module0012.$g77$.bind((SubLObject)T, var8);
                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                module0012.f478(var31);
                                SubLObject var34 = module0173.f10961();
                                SubLObject var35 = (SubLObject)NIL;
                                var35 = var34.first();
                                while (NIL != var34) {
                                    final SubLObject var36 = var35;
                                    if (NIL == module0065.f4772(var36, (SubLObject)$ic137$)) {
                                        final SubLObject var99_101 = var36;
                                        if (NIL == module0065.f4775(var99_101, (SubLObject)$ic137$)) {
                                            final SubLObject var37 = module0065.f4740(var99_101);
                                            final SubLObject var38 = (SubLObject)NIL;
                                            SubLObject var39;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var42;
                                            for (var39 = Sequences.length(var37), var40 = (SubLObject)NIL, var40 = (SubLObject)ZERO_INTEGER; var40.numL(var39); var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER)) {
                                                var41 = ((NIL != var38) ? Numbers.subtract(var39, var40, (SubLObject)ONE_INTEGER) : var40);
                                                var42 = Vectors.aref(var37, var41);
                                                if (NIL == module0065.f4749(var42) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                    if (NIL != module0065.f4749(var42)) {
                                                        var42 = (SubLObject)$ic137$;
                                                    }
                                                    var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                                                    module0012.note_percent_progress(var33, var32);
                                                    if (NIL == module0269.f17705(var42)) {
                                                        f43937(var7, var42, (SubLObject)T);
                                                    }
                                                }
                                            }
                                        }
                                        final SubLObject var107_109 = var36;
                                        if (NIL == module0065.f4777(var107_109) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                            final SubLObject var43 = module0065.f4738(var107_109);
                                            SubLObject var44 = module0065.f4739(var107_109);
                                            final SubLObject var45 = module0065.f4734(var107_109);
                                            final SubLObject var46 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic137$)) ? NIL : $ic137$);
                                            while (var44.numL(var45)) {
                                                final SubLObject var47 = Hashtables.gethash_without_values(var44, var43, var46);
                                                if (NIL == module0065.f4773((SubLObject)$ic137$) || NIL == module0065.f4749(var47)) {
                                                    var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                                                    module0012.note_percent_progress(var33, var32);
                                                    if (NIL == module0269.f17705(var47)) {
                                                        f43937(var7, var47, (SubLObject)T);
                                                    }
                                                }
                                                var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
                                            }
                                        }
                                    }
                                    var34 = var34.rest();
                                    var35 = var34.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var63_78, var8);
                                module0012.$g77$.rebind(var36_77, var8);
                                module0012.$g76$.rebind(var35_76, var8);
                                module0012.$g75$.rebind(var8_73, var8);
                            }
                        }
                        if (NIL != var21 && NIL == var22) {
                            module0034.f1873(var21, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var8_69, var8);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var8_67, var8);
            }
        }
        finally {
            module0147.$g2094$.rebind(var19, var8);
            module0147.$g2095$.rebind(var18, var8);
            module0139.$g1630$.rebind(var17, var8);
            module0139.$g1632$.rebind(var16, var8);
            module0139.$g1631$.rebind(var15, var8);
        }
        if (NIL != var9) {
            module0006.f218((SubLObject)T, (SubLObject)$ic139$, module0701.f42686(f43917(var7)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0006.f218((SubLObject)T, (SubLObject)$ic140$, module0701.f42752(f43917(var7)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f43937(final SubLObject var7, SubLObject var16, SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104(var16, $g5666$.getDynamicValue(var119), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED)) {
            var118 = (SubLObject)T;
        }
        final SubLObject var120 = $g5666$.currentBinding(var119);
        try {
            $g5666$.bind((SubLObject)ConsesLow.cons(var16, $g5666$.getDynamicValue(var119)), var119);
            final SubLObject var121 = f43938(var7, var16, var118, (SubLObject)UNPROVIDED);
            if (NIL != var118 && NIL != module0701.f42629(var121)) {
                module0701.f42757(f43917(var7), var121);
            }
            if (NIL != module0202.f12672(var16)) {
                var16 = $ic141$;
            }
            if (NIL != module0202.f12671(var16)) {
                f43939(var7, var16);
            }
            else {
                SubLObject var122 = (SubLObject)NIL;
                SubLObject var123 = f43940(var7, var16);
                SubLObject var124 = (SubLObject)NIL;
                var124 = var123.first();
                while (NIL != var123) {
                    if (NIL != module0178.f11284(var124) && NIL != f43941(module0178.f11332(var124))) {
                        var122 = (SubLObject)ConsesLow.cons(var124, var122);
                    }
                    else {
                        f43942(var7, var124);
                    }
                    var123 = var123.rest();
                    var124 = var123.first();
                }
                var123 = var122;
                var124 = (SubLObject)NIL;
                var124 = var123.first();
                while (NIL != var123) {
                    f43942(var7, var124);
                    var123 = var123.rest();
                    var124 = var123.first();
                }
            }
            if (NIL == module0703.f42867(var121) && NIL != var118) {
                f43943(var7, var121, var16);
            }
            if (NIL == module0703.f42867(var121) && NIL != var118) {
                final SubLObject var125 = f43938(var7, var16, (SubLObject)T, (SubLObject)UNPROVIDED);
                if (NIL == module0701.f42633(var121, var125)) {
                    module0701.f42627(f43917(var7), var121, module0701.f42807((SubLObject)$ic142$), var125);
                }
            }
        }
        finally {
            $g5666$.rebind(var120, var119);
        }
        return var7;
    }
    
    public static SubLObject f43938(final SubLObject var7, final SubLObject var16, SubLObject var118, SubLObject var121) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        if (var121 == UNPROVIDED) {
            var121 = (SubLObject)NIL;
        }
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123 = (SubLObject)NIL;
        if (var16.isInteger() || (NIL != module0038.f2653(var16) && NIL != module0038.f2734(var16))) {
            var123 = module0701.f42635(f43917(var7), var16.isInteger() ? module0006.f206(var16) : reader.parse_integer(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, module0701.f42807((SubLObject)$ic143$));
        }
        else if (var16.isString()) {
            var123 = module0701.f42635(f43917(var7), var16, (SubLObject)((NIL != assertion_handles_oc.f11035(var121)) ? f43944(module0178.f11287(var121)) : NIL), (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0208.f13537(var16, (SubLObject)UNPROVIDED)) {
            var123 = module0701.f42635(f43917(var7), module0208.f13536(var16), (SubLObject)((NIL != assertion_handles_oc.f11035(var121)) ? f43944(module0178.f11287(var121)) : NIL), (SubLObject)UNPROVIDED);
        }
        else if (NIL != var118 && var16.eql($ic141$)) {
            var123 = module0702.f42814(module0712.f43676(var16, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != var118 && $ic43$ == f43875(var7, (SubLObject)$ic44$, (SubLObject)UNPROVIDED) && NIL != module0035.f2169(var16, (SubLObject)$ic144$) && (NIL != f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED) || NIL != module0035.f2169(var16, f43874(var7)))) {
            var123 = f43945(var7, var16);
        }
        else {
            var123 = f43946(var7, var16);
        }
        if (NIL != var123 && $g5661$.getDynamicValue(var122).isHashtable()) {
            Hashtables.sethash(var123, $g5661$.getDynamicValue(var122), var16);
        }
        return var123;
    }
    
    public static SubLObject f43947(final SubLObject var7, final SubLObject var16) {
        final SubLObject var17 = f43875(var7, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != module0167.f10813(var16) && NIL == module0172.f10933($ic146$, var16) && (NIL != module0259.f16891(var16, $ic147$) || NIL != module0259.f16891(var16, $ic148$))) {
            var18 = module0703.f42873(f43948(var7));
        }
        else if (NIL != module0167.f10813(var16) && NIL != module0172.f10933($ic146$, var16)) {
            var18 = module0702.f42814(module0205.f13203(module0172.f10920(var16), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0167.f10813(var16) && NIL != module0172.f10933($ic149$, var16)) {
            var18 = module0702.f42814(module0205.f13203(module0172.f10920(var16), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0202.f12672(var16)) {
            var18 = module0701.f42807((SubLObject)$ic150$);
        }
        else if (NIL != module0202.f12674(var16)) {
            var18 = module0703.f42873(f43948(var7));
        }
        else if (var16.eql($ic151$)) {
            var18 = module0701.f42807((SubLObject)$ic152$);
        }
        else if (var16.eql($ic153$)) {
            var18 = module0701.f42807((SubLObject)$ic154$);
        }
        else if (var16.eql($ic155$)) {
            var18 = module0701.f42807((SubLObject)$ic156$);
        }
        else if (var16.eql($ic157$)) {
            var18 = module0701.f42807((SubLObject)$ic158$);
        }
        else if (var16.eql($ic159$)) {
            var18 = module0701.f42807((SubLObject)$ic160$);
        }
        else if (var16.eql($ic161$)) {
            var18 = module0701.f42807((SubLObject)$ic162$);
        }
        else if (var16.eql($ic163$)) {
            var18 = module0701.f42807((SubLObject)$ic164$);
        }
        else if (var16.eql($ic165$)) {
            var18 = module0701.f42807((SubLObject)$ic166$);
        }
        else if (NIL != f43949(var16)) {
            var18 = module0701.f42807(var16);
        }
        else {
            if (var16.eql(f43873(var7)) && NIL != module0589.f35907(f43875(var7, (SubLObject)$ic167$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
                return module0702.f42814(f43875(var7, (SubLObject)$ic167$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != constant_handles_oc.f8449(var16) && (NIL != module0038.f2668((SubLObject)$ic168$, constants_high_oc.f10743(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0038.f2668((SubLObject)$ic169$, constants_high_oc.f10743(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && NIL != module0259.f16976(var16, $ic170$)) {
                var18 = module0703.f42873(f43948(var7));
            }
            else if (NIL != module0167.f10813(var16) && module0205.f13276(var16).eql($ic171$)) {
                var18 = module0703.f42873(f43948(var7));
            }
            else if ($ic172$ == f43875(var7, (SubLObject)$ic44$, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(var16) && NIL != f43950(var7, var16)) {
                var18 = f43950(var7, var16);
            }
            else if ($ic43$ == f43875(var7, (SubLObject)$ic44$, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(var16) && NIL != f43951(var7, var16)) {
                var18 = f43945(var7, var16);
            }
            else if ($ic43$ == f43875(var7, (SubLObject)$ic44$, (SubLObject)UNPROVIDED) && NIL != module0173.f10955(var16)) {
                if (NIL != f43875(var7, (SubLObject)$ic173$, (SubLObject)UNPROVIDED)) {
                    var18 = module0702.f42814(module0712.f43677(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    var18 = module0702.f42814(module0712.f43678(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            else if (NIL != module0173.f10955(var16) && (NIL != ((NIL != module0161.f10481(var17)) ? module0220.f14562(var16, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0220.f14565(var16, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != module0220.f14563(var16, $ic174$, $ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                SubLObject var19 = (NIL != module0161.f10481(var17)) ? module0220.f14562(var16, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0220.f14565(var16, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var19) {
                    var19 = module0220.f14563(var16, $ic174$, $ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (ONE_INTEGER.numL(Sequences.length(var19))) {
                    Errors.warn((SubLObject)$ic175$, var16, var17);
                }
                var18 = module0702.f42814(var19.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0173.f10955(var16)) {
                Errors.warn((SubLObject)$ic176$, var16);
                var18 = module0702.f42814(module0712.f43677(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return var18;
    }
    
    public static SubLObject f43946(final SubLObject var7, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0034.$g879$.getDynamicValue(var17);
        SubLObject var19 = (SubLObject)NIL;
        if (NIL == var18) {
            return f43947(var7, var16);
        }
        var19 = module0034.f1857(var18, (SubLObject)$ic145$, (SubLObject)UNPROVIDED);
        if (NIL == var19) {
            var19 = module0034.f1807(module0034.f1842(var18), (SubLObject)$ic145$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var18, (SubLObject)$ic145$, var19);
        }
        final SubLObject var20 = module0034.f1782(var7, var16);
        final SubLObject var21 = module0034.f1814(var19, var20, (SubLObject)UNPROVIDED);
        if (var21 != $ic177$) {
            SubLObject var22 = var21;
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                SubLObject var24 = var23.first();
                final SubLObject var25 = conses_high.second(var23);
                if (var7.equal(var24.first())) {
                    var24 = var24.rest();
                    if (NIL != var24 && NIL == var24.rest() && var16.equal(var24.first())) {
                        return module0034.f1959(var25);
                    }
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        final SubLObject var26 = Values.arg2(var17.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43947(var7, var16)));
        module0034.f1836(var19, var20, var21, var26, (SubLObject)ConsesLow.list(var7, var16));
        return module0034.f1959(var26);
    }
    
    public static SubLObject f43945(final SubLObject var7, final SubLObject var16) {
        SubLObject var17 = (SubLObject)NIL;
        if ($ic54$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
            var17 = module0702.f42814(module0712.f43674(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if ($ic52$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
            var17 = module0702.f42814(module0712.f43675(var16, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            var17 = module0702.f42814(module0712.f43676(var16, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var17;
    }
    
    public static SubLObject f43950(final SubLObject var7, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f43873(var7);
        final SubLObject var19 = f43875(var7, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        final SubLObject var20 = f43875(var7, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
        SubLObject var21 = (SubLObject)NIL;
        if (NIL != module0161.f10481(var19)) {
            final SubLObject var22 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var23 = module0147.$g2095$.currentBinding(var17);
            try {
                module0147.$g2094$.bind((SubLObject)$ic130$, var17);
                module0147.$g2095$.bind(var19, var17);
                var21 = module0220.f14572($ic22$, var16, var18, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var23, var17);
                module0147.$g2094$.rebind(var22, var17);
            }
        }
        if (NIL == var21) {
            var21 = module0220.f14572($ic22$, var16, var18, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != var21) {
            final SubLObject var24 = Mapping.mapcar((SubLObject)$ic178$, var21);
            final SubLObject var25 = module0701.f42758(f43917(var7));
            SubLObject var26 = (SubLObject)NIL;
            if (NIL == var26) {
                SubLObject var27 = var24;
                SubLObject var28 = (SubLObject)NIL;
                var28 = var27.first();
                while (NIL == var26 && NIL != var27) {
                    var28 = module0589.f35898(var28, (SubLObject)UNPROVIDED);
                    if (NIL != module0589.f35909(var28)) {
                        final SubLObject var29 = module0702.f42814(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != module0702.f42828(var29)) {
                            var26 = var29;
                        }
                    }
                    else if (NIL != module0038.f2653(var20) && ONE_INTEGER.numE(module0038.f2851(var28, (SubLObject)Characters.CHAR_colon))) {
                        var17.resetMultipleValues();
                        final SubLObject var30 = module0038.f2752(var28, (SubLObject)$ic179$);
                        final SubLObject var31 = var17.secondMultipleValue();
                        var17.resetMultipleValues();
                        final SubLObject var32 = conses_high.assoc(var30, var25, (SubLObject)EQUAL, (SubLObject)UNPROVIDED).rest();
                        if (NIL != var32) {
                            final SubLObject var33 = module0702.f42814(var32, (SubLObject)Characters.CHAR_hash, var31);
                            if (NIL != module0702.f42828(var33)) {
                                var26 = var33;
                            }
                        }
                    }
                    else if (NIL != module0038.f2653(var20) && NIL != module0038.f2653(var28)) {
                        final SubLObject var29 = module0702.f42814(var20, (SubLObject)Characters.CHAR_hash, var28);
                        if (NIL != module0702.f42828(var29)) {
                            var26 = var29;
                        }
                    }
                    var27 = var27.rest();
                    var28 = var27.first();
                }
            }
            return var26;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43951(final SubLObject var7, final SubLObject var106) {
        return (SubLObject)makeBoolean(NIL != f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED) || NIL != module0712.f43689(var106));
    }
    
    public static SubLObject f43948(final SubLObject var7) {
        final SubLObject var8 = conses_high.getf(f43877(var7), (SubLObject)$ic180$, (SubLObject)UNPROVIDED);
        final SubLObject var9 = (SubLObject)(var8.isInteger() ? Numbers.add((SubLObject)ONE_INTEGER, var8) : ONE_INTEGER);
        conses_high.putf(f43877(var7), (SubLObject)$ic180$, var9);
        return var9;
    }
    
    public static SubLObject f43940(final SubLObject var7, final SubLObject var16) {
        assert NIL != f43872(var7) : var7;
        assert NIL != module0173.f10955(var16) : var16;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = module0219.f14509(var16, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            if (NIL != f43952(var7, var19)) {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        var18 = module0219.f14509(var16, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            if (NIL != module0226.f14797(module0178.f11332(var19)) && NIL != f43952(var7, var19)) {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f43941(final SubLObject var145) {
        return module0035.f2169(var145, (SubLObject)$ic181$);
    }
    
    public static SubLObject f43952(final SubLObject var7, final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        final SubLObject var123 = f43874(var7);
        final SubLObject var124 = module0178.f11332(var121);
        final SubLObject var125 = module0178.f11334(var121);
        final SubLObject var126 = module0178.f11335(var121);
        if (NIL != module0178.f11284(var121) && NIL != module0226.f14807(module0178.f11332(var121))) {
            var122.resetMultipleValues();
            final SubLObject var127 = f43953(var7, var124, var125, var126);
            final SubLObject var128 = var122.secondMultipleValue();
            var122.resetMultipleValues();
            if (NIL != var127) {
                return Values.values(var127, var128);
            }
            if (NIL != module0226.f14797(var124)) {
                var122.resetMultipleValues();
                final SubLObject var129 = f43953(var7, var124, var126, var125);
                final SubLObject var130 = var122.secondMultipleValue();
                var122.resetMultipleValues();
                if (NIL != var127) {
                    return Values.values(var129, var130);
                }
            }
            return Values.values(var127, var128);
        }
        else {
            if (NIL != f43941(var124)) {
                SubLObject var131 = module0178.f11303(var121).rest();
                SubLObject var132 = (SubLObject)NIL;
                var132 = var131.first();
                while (NIL != var131) {
                    if (NIL == conses_high.member(var132, var123, (SubLObject)EQUAL, (SubLObject)UNPROVIDED) && NIL == f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED) && !var132.isString() && !var132.isNumber()) {
                        return Values.values((SubLObject)NIL, (SubLObject)$ic182$);
                    }
                    var131 = var131.rest();
                    var132 = var131.first();
                }
                return Values.values((SubLObject)T, (SubLObject)NIL);
            }
            return Values.values((SubLObject)NIL, (SubLObject)$ic183$);
        }
    }
    
    public static SubLObject f43953(final SubLObject var7, final SubLObject var146, final SubLObject var147, final SubLObject var50) {
        final SubLObject var148 = f43874(var7);
        final SubLObject var149 = f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED);
        if (NIL == module0226.f14807(var146)) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic184$);
        }
        if (!var146.eql($ic151$) && (!var146.eql($ic153$) || NIL != module0256.f16598(var50, var147)) && (!var146.eql($ic155$) || NIL != module0260.f17090(var50, var147)) && NIL == f43949(var146) && NIL == module0004.f104(var146, var148, (SubLObject)EQUAL, (SubLObject)UNPROVIDED) && NIL == var149) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic185$);
        }
        if (NIL == module0004.f104(var147, var148, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == var149 && (NIL == module0173.f10955(f43873(var7)) || !var147.equal(f43873(var7)))) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic186$);
        }
        if (NIL == f43949(var50) && NIL == module0004.f104(var50, var148, (SubLObject)EQUAL, (SubLObject)UNPROVIDED) && NIL == var149 && NIL == module0202.f12674(var50) && !var50.isString() && NIL == module0208.f13537(var50, (SubLObject)UNPROVIDED) && !var50.isInteger() && (NIL == module0173.f10955(var50) || NIL == module0220.f14556(var50, $ic187$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) && (NIL == module0167.f10813(var50) || !module0205.f13276(var50).eql($ic146$))) {
            return Values.values((SubLObject)NIL, (SubLObject)$ic188$);
        }
        return Values.values((SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f43942(final SubLObject var7, final SubLObject var121) {
        if (NIL == module0178.f11375(var121) && NIL != f43875(var7, (SubLObject)$ic189$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f43875(var7, (SubLObject)$ic48$, (SubLObject)UNPROVIDED) && $ic157$.eql(module0178.f11332(var121))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0178.f11284(var121) && NIL != module0226.f14807(module0178.f11332(var121))) {
            return f43954(var7, var121);
        }
        if (NIL != module0178.f11284(var121) && NIL != f43941(module0178.f11332(var121))) {
            return f43955(var7, var121);
        }
        Errors.warn((SubLObject)$ic190$, var121);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43954(final SubLObject var7, final SubLObject var154) {
        assert NIL != f43872(var7) : var7;
        assert NIL != assertion_handles_oc.f11035(var154) : var154;
        final SubLObject var155 = f43917(var7);
        final SubLObject var156 = module0178.f11332(var154);
        final SubLObject var157 = module0178.f11334(var154);
        final SubLObject var158 = module0178.f11335(var154);
        final SubLObject var159 = f43938(var7, var156, (SubLObject)NIL, var154);
        final SubLObject var160 = f43938(var7, var157, (SubLObject)T, var154);
        final SubLObject var161 = f43938(var7, var158, (SubLObject)NIL, var154);
        if (NIL == module0701.f42630(var159) || NIL == module0701.f42629(var160) || NIL == module0701.f42631(var161)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0703.f42867(var160) && NIL == module0178.f11375(var154)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0701.f42654(var159) && NIL != module0703.f42867(var160) && NIL == module0703.f42867(var161)) {
            module0701.f42627(var155, var161, var159, var160);
        }
        else {
            module0701.f42627(var155, var160, var159, var161);
        }
        if (NIL != module0703.f42867(var161)) {
            f43937(var7, var158, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f43955(final SubLObject var7, final SubLObject var158) {
        assert NIL != f43872(var7) : var7;
        assert NIL != assertion_handles_oc.f11035(var158) : var158;
        final SubLObject var159 = f43917(var7);
        final SubLObject var160 = module0178.f11332(var158);
        final SubLObject var161 = module0178.f11334(var158);
        final SubLObject var162 = module0178.f11335(var158);
        final SubLObject var163 = module0178.f11336(var158);
        final SubLObject var164 = f43938(var7, var161, (SubLObject)NIL, var158);
        final SubLObject var165 = f43938(var7, var162, (SubLObject)T, var158);
        final SubLObject var166 = f43938(var7, var163, (SubLObject)NIL, var158);
        final SubLObject var167 = module0701.f42662(var159, var164, module0701.f42807((SubLObject)$ic192$));
        if (NIL != var167) {
            SubLObject var168 = var167;
            SubLObject var169 = (SubLObject)NIL;
            var169 = var168.first();
            while (NIL != var168) {
                final SubLObject var170 = module0700.f42612(var169);
                if (NIL != module0703.f42867(var170) && ((var160.eql($ic193$) && NIL != module0701.f42643(var159, var170, module0701.f42807((SubLObject)$ic194$), var166)) || (var160.eql($ic195$) && NIL != module0701.f42643(var159, var170, module0701.f42807((SubLObject)$ic196$), var166)) || (var160.eql($ic197$) && NIL != module0701.f42643(var159, var170, module0701.f42807((SubLObject)$ic198$), var166)) || (NIL != module0035.f2169(var160, (SubLObject)$ic199$) && NIL != module0701.f42643(var159, var170, module0701.f42807((SubLObject)$ic200$), var166)))) {
                    return (SubLObject)NIL;
                }
                var168 = var168.rest();
                var169 = var168.first();
            }
        }
        final SubLObject var171 = module0703.f42873(f43948(var7));
        if (NIL != f43941(var160)) {
            if (NIL == module0701.f42662(var159, var171, module0701.f42807((SubLObject)$ic154$))) {
                module0701.f42627(var159, var165, module0701.f42807((SubLObject)$ic154$), var171);
            }
            if (NIL == module0701.f42662(var159, var171, module0701.f42807((SubLObject)$ic152$))) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic201$));
            }
            module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic192$), var164);
            if (var160.eql($ic193$)) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic194$), var166);
            }
            else if (var160.eql($ic195$)) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic196$), var166);
            }
            else if (var160.eql($ic197$)) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic198$), var166);
            }
            else if (var160.eql($ic202$)) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic200$), var166);
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic203$), f43938(var7, module0178.f11337(var158), (SubLObject)NIL, var158));
            }
            else if (var160.eql($ic204$)) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic200$), var166);
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic205$), f43938(var7, module0178.f11337(var158), (SubLObject)NIL, var158));
            }
            else if (var160.eql($ic206$)) {
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic200$), var166);
                module0701.f42627(var159, var171, module0701.f42807((SubLObject)$ic207$), f43938(var7, module0178.f11337(var158), (SubLObject)NIL, var158));
            }
        }
        else {
            Errors.warn((SubLObject)$ic208$, var158);
        }
        return var7;
    }
    
    public static SubLObject f43943(final SubLObject var7, final SubLObject var168, final SubLObject var156) {
        if (NIL != f43875(var7, (SubLObject)$ic209$, (SubLObject)UNPROVIDED) || NIL != module0704.f42888(var168)) {
            return (SubLObject)NIL;
        }
        final SubLObject var169 = f43917(var7);
        final SubLObject var170 = f43874(var7);
        if (NIL != module0259.f16891(var156, $ic210$) && NIL == f43875(var7, (SubLObject)$ic209$, (SubLObject)UNPROVIDED)) {
            module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic211$));
        }
        else if (NIL != module0226.f14807(var156)) {
            if (NIL != module0035.sublisp_boolean(module0256.f16567(module0220.f14562(var156, $ic165$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0259.f16847($ic212$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic213$));
            }
            else {
                module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic214$));
            }
            if (!ZERO_INTEGER.numL(module0701.f42656(var169, var168, module0701.f42807((SubLObject)$ic166$)))) {
                f43956(var7, var168, var156);
            }
            if (!ZERO_INTEGER.numL(module0701.f42656(var169, var168, module0701.f42807((SubLObject)$ic164$)))) {
                f43957(var7, var168, var156);
            }
        }
        else if (NIL != module0269.f17709(var156)) {
            module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic215$));
        }
        else if (NIL != module0226.f14811(var156)) {
            module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic216$));
        }
        else if (NIL != module0269.f17715(var156)) {
            module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic217$));
        }
        if (!ZERO_INTEGER.numL(module0701.f42656(var169, var168, module0701.f42807((SubLObject)$ic152$)))) {
            SubLObject var172;
            final SubLObject var171 = var172 = module0256.f16529(module0259.f16857(var156, module0035.remove_if_not((SubLObject)$ic218$, var170, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var173 = (SubLObject)NIL;
            var173 = var172.first();
            while (NIL != var172) {
                module0701.f42627(var169, var168, module0701.f42807((SubLObject)$ic152$), f43938(var7, var173, (SubLObject)T, (SubLObject)UNPROVIDED));
                var172 = var172.rest();
                var173 = var172.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43956(final SubLObject var7, final SubLObject var171, final SubLObject var155) {
        final SubLObject var172 = f43917(var7);
        final SubLObject var173 = module0035.remove_if_not((SubLObject)$ic218$, f43874(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var174 = module0220.f14562(var155, $ic165$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var175 = (SubLObject)NIL;
        SubLObject var176 = var174;
        SubLObject var177 = (SubLObject)NIL;
        var177 = var176.first();
        while (NIL != var176) {
            SubLObject var13_175 = module0256.f16575(var177, var173, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var178 = (SubLObject)NIL;
            var178 = var13_175.first();
            while (NIL != var13_175) {
                var175 = (SubLObject)ConsesLow.cons(var178, var175);
                var13_175 = var13_175.rest();
                var178 = var13_175.first();
            }
            var176 = var176.rest();
            var177 = var176.first();
        }
        if (NIL != var175) {
            var176 = module0256.f16529(var175, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var179 = (SubLObject)NIL;
            var179 = var176.first();
            while (NIL != var176) {
                final SubLObject var180 = f43938(var7, var179, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0701.f42627(var172, var171, module0701.f42807((SubLObject)$ic166$), var180);
                var176 = var176.rest();
                var179 = var176.first();
            }
        }
        else {
            module0701.f42627(var172, var171, module0701.f42807((SubLObject)$ic166$), module0701.f42807((SubLObject)$ic219$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43957(final SubLObject var7, final SubLObject var171, final SubLObject var155) {
        final SubLObject var172 = f43917(var7);
        final SubLObject var173 = module0035.remove_if_not((SubLObject)$ic218$, f43874(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var174 = module0220.f14562(var155, $ic163$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var175 = (SubLObject)NIL;
        SubLObject var176 = var174;
        SubLObject var177 = (SubLObject)NIL;
        var177 = var176.first();
        while (NIL != var176) {
            SubLObject var13_182 = module0256.f16575(var177, var173, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var178 = (SubLObject)NIL;
            var178 = var13_182.first();
            while (NIL != var13_182) {
                var175 = (SubLObject)ConsesLow.cons(var178, var175);
                var13_182 = var13_182.rest();
                var178 = var13_182.first();
            }
            var176 = var176.rest();
            var177 = var176.first();
        }
        if (NIL != var175) {
            var176 = module0256.f16529(var175, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var179 = (SubLObject)NIL;
            var179 = var176.first();
            while (NIL != var176) {
                final SubLObject var180 = f43938(var7, var179, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0701.f42627(var172, var171, module0701.f42807((SubLObject)$ic164$), var180);
                var176 = var176.rest();
                var179 = var176.first();
            }
        }
        else {
            module0701.f42627(var172, var171, module0701.f42807((SubLObject)$ic164$), module0701.f42807((SubLObject)$ic219$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43939(final SubLObject var7, final SubLObject var185) {
        assert NIL != f43872(var7) : var7;
        assert NIL != module0202.f12674(var185) : var185;
        final SubLObject var186 = f43917(var7);
        final SubLObject var187 = module0701.f42807((SubLObject)$ic221$);
        final SubLObject var188 = module0701.f42807((SubLObject)$ic222$);
        final SubLObject var189 = module0701.f42807((SubLObject)$ic150$);
        final SubLObject var190 = module0202.f12751(var185);
        final SubLObject var191 = var190.first();
        final SubLObject var192 = var190.rest();
        final SubLObject var189_192 = f43938(var7, var185, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var193 = f43938(var7, var191, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0701.f42627(var186, var189_192, var187, var193);
        if (NIL != module0703.f42867(var193)) {
            f43937(var7, var191, (SubLObject)UNPROVIDED);
        }
        if (NIL == var192) {
            module0701.f42627(var186, var189_192, var188, var189);
        }
        else {
            final SubLObject var194 = module0202.f12787(var192, (SubLObject)UNPROVIDED);
            final SubLObject var195 = f43938(var7, var194, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0701.f42627(var186, var189_192, var188, var195);
            f43937(var7, var194, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f43958(final SubLObject var16) {
        final SubLObject var17 = module0220.f14553(var16, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0589.f35909(var17)) {
            return module0702.f42814(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var16.eql($ic151$)) {
            return module0701.f42807((SubLObject)$ic152$);
        }
        if (var16.eql($ic153$)) {
            return module0701.f42807((SubLObject)$ic154$);
        }
        if (var16.eql($ic155$)) {
            return module0701.f42807((SubLObject)$ic156$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43949(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        try {
            var51.throwStack.push($ic223$);
            final SubLObject var54 = Errors.$error_handler$.currentBinding(var51);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic224$), var51);
                try {
                    var52 = module0701.f42807(var50);
                }
                catch (Throwable var55) {
                    Errors.handleThrowable(var55, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var54, var51);
            }
        }
        catch (Throwable var56) {
            var53 = Errors.handleThrowable(var56, (SubLObject)$ic223$);
        }
        finally {
            var51.throwStack.pop();
        }
        return var52;
    }
    
    public static SubLObject f43878(final SubLObject var7) {
        f43959(var7);
        if (NIL != f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) {
            f43960(var7);
        }
        return var7;
    }
    
    public static SubLObject f43959(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f43917(var7);
        final SubLObject var10 = module0702.f42814(module0708.f43016((SubLObject)$ic225$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = f43875(var7, (SubLObject)$ic46$, (SubLObject)UNPROVIDED);
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0701.f42700(var9);
        SubLObject var17;
        for (SubLObject var15 = (SubLObject)NIL; NIL == var15; var15 = (SubLObject)makeBoolean(NIL == var17)) {
            var8.resetMultipleValues();
            final SubLObject var16 = module0052.f3693(var14);
            var17 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            if (NIL != var17) {
                final SubLObject var18 = module0700.f42612(var16);
                if (NIL != module0077.f5326(var18, var13) && NIL == module0703.f42867(var18)) {
                    var12 = (SubLObject)ConsesLow.cons(var18, var12);
                }
            }
        }
        final SubLObject var19 = var12;
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic226$, new SubLObject[] { module0006.f203(Sequences.length(var12)), $ic227$ }), var8);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
        module0012.$g83$.setDynamicValue(Sequences.length(var19), var8);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
        final SubLObject var20 = module0012.$g75$.currentBinding(var8);
        final SubLObject var21 = module0012.$g76$.currentBinding(var8);
        final SubLObject var22 = module0012.$g77$.currentBinding(var8);
        final SubLObject var23 = module0012.$g78$.currentBinding(var8);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
            module0012.$g76$.bind((SubLObject)NIL, var8);
            module0012.$g77$.bind((SubLObject)T, var8);
            module0012.$g78$.bind(Time.get_universal_time(), var8);
            module0012.f478(module0012.$g82$.getDynamicValue(var8));
            SubLObject var24 = var19;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                final SubLObject var26 = Hashtables.gethash(var25, $g5661$.getDynamicValue(var8), (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var26)) {
                    if (NIL != var11) {
                        SubLObject var27 = module0220.f14562(var26, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var28 = (SubLObject)NIL;
                        var28 = var27.first();
                        while (NIL != var27) {
                            if (NIL != module0589.f35907(var28, (SubLObject)UNPROVIDED)) {
                                final SubLObject var29 = module0702.f42814(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL == module0701.f42633(var25, var29)) {
                                    module0701.f42627(var9, var25, var10, module0702.f42814(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                }
                            }
                            var27 = var27.rest();
                            var28 = var27.first();
                        }
                        if (NIL != module0035.f2169((SubLObject)$ic43$, var11) && NIL != f43951(var7, var26)) {
                            final SubLObject var30 = module0712.f43676(var26, (SubLObject)UNPROVIDED);
                            if (NIL != module0703.f42867(var25) || NIL == Strings.stringE(var30, module0702.f42830(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                module0701.f42627(var9, var25, var10, module0702.f42814(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            }
                        }
                        if (NIL != module0035.f2169((SubLObject)$ic228$, var11) && NIL != f43951(var7, var26)) {
                            final SubLObject var30 = module0712.f43675(var26, (SubLObject)UNPROVIDED);
                            if (NIL != module0703.f42867(var25) || NIL == Strings.stringE(var30, module0702.f42830(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                module0701.f42627(var9, var25, var10, module0702.f42814(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            }
                        }
                        if (NIL != module0035.f2169((SubLObject)$ic229$, var11) && NIL != f43951(var7, var26)) {
                            final SubLObject var30 = module0712.f43674(var26);
                            if (NIL != module0703.f42867(var25) || NIL == Strings.stringE(var30, module0702.f42830(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                module0701.f42627(var9, var25, var10, module0702.f42814(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            }
                        }
                        if (NIL != module0035.f2169((SubLObject)$ic230$, var11)) {
                            final SubLObject var30 = module0712.f43677(var26);
                            if (NIL != module0703.f42867(var25) || NIL == Strings.stringE(var30, module0702.f42830(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                module0701.f42627(var9, var25, var10, module0702.f42814(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            }
                        }
                        if (NIL != module0035.f2169((SubLObject)$ic231$, var11)) {
                            final SubLObject var8_208 = module0147.$g2094$.currentBinding(var8);
                            final SubLObject var35_209 = module0147.$g2095$.currentBinding(var8);
                            try {
                                module0147.$g2094$.bind((SubLObject)$ic130$, var8);
                                module0147.$g2095$.bind(module0172.f10921((SubLObject)$ic232$), var8);
                                final SubLObject var31 = module0220.f14553(var26, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (var31.isString()) {
                                    module0701.f42627(var9, var25, var10, module0702.f42814(var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                }
                            }
                            finally {
                                module0147.$g2095$.rebind(var35_209, var8);
                                module0147.$g2094$.rebind(var8_208, var8);
                            }
                        }
                    }
                    if (NIL != f43875(var7, (SubLObject)$ic48$, (SubLObject)UNPROVIDED)) {
                        final SubLObject var32 = f43938(var7, $ic157$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var33 = module0220.f14558(var26, $ic157$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var34 = (SubLObject)NIL;
                        var34 = var33.first();
                        while (NIL != var33) {
                            final SubLObject var35 = f43944(module0178.f11287(var34));
                            final SubLObject var36 = module0178.f11335(var34);
                            final SubLObject var8_209 = module0710.$g5582$.currentBinding(var8);
                            final SubLObject var35_210 = module0711.$g5621$.currentBinding(var8);
                            try {
                                module0710.$g5582$.bind((SubLObject)(($ic54$ == f43875(var7, (SubLObject)$ic41$, (SubLObject)UNPROVIDED)) ? NIL : module0710.$g5582$.getDynamicValue(var8)), var8);
                                module0711.$g5621$.bind((SubLObject)ConsesLow.list($ic157$, var26, var36), var8);
                                final SubLObject var37 = module0711.f43586(var36, (SubLObject)UNPROVIDED);
                                SubLObject var38 = (SubLObject)NIL;
                                SubLObject var39 = (SubLObject)NIL;
                                try {
                                    var39 = streams_high.make_private_string_output_stream();
                                    final SubLObject var8_210 = module0587.$g4457$.currentBinding(var8);
                                    try {
                                        module0587.$g4457$.bind(var39, var8);
                                        module0601.f36754(var37);
                                    }
                                    finally {
                                        module0587.$g4457$.rebind(var8_210, var8);
                                    }
                                    var38 = streams_high.get_output_stream_string(var39);
                                }
                                finally {
                                    final SubLObject var8_211 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                                        streams_high.close(var39, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_211, var8);
                                    }
                                }
                                module0701.f42627(var9, var25, var32, module0704.f42901(var38, var35));
                            }
                            finally {
                                module0711.$g5621$.rebind(var35_210, var8);
                                module0710.$g5582$.rebind(var8_209, var8);
                            }
                            var33 = var33.rest();
                            var34 = var33.first();
                        }
                    }
                    final SubLObject var8_212 = module0580.$g4361$.currentBinding(var8);
                    try {
                        module0580.$g4361$.bind((SubLObject)NIL, var8);
                        var8.resetMultipleValues();
                        final SubLObject var8_213 = module0580.$g4362$.currentBinding(var8);
                        try {
                            module0580.$g4362$.bind(module0580.f35560(), var8);
                            final SubLObject var40 = var8.secondMultipleValue();
                            var8.resetMultipleValues();
                            try {
                                var8.resetMultipleValues();
                                final SubLObject var8_214 = module0580.$g4358$.currentBinding(var8);
                                try {
                                    module0580.$g4358$.bind(module0580.f35544(), var8);
                                    final SubLObject var41 = var8.secondMultipleValue();
                                    var8.resetMultipleValues();
                                    final SubLObject var8_215 = module0580.$g4359$.currentBinding(var8);
                                    try {
                                        module0580.$g4359$.bind(module0580.f35545(), var8);
                                        final SubLObject var42 = module0580.$g4358$.getDynamicValue(var8);
                                        final SubLObject var8_216 = module0034.$g879$.currentBinding(var8);
                                        try {
                                            module0034.$g879$.bind(var42, var8);
                                            SubLObject var43 = (SubLObject)NIL;
                                            if (NIL != var42 && NIL == module0034.f1842(var42)) {
                                                var43 = module0034.f1869(var42);
                                                final SubLObject var44 = Threads.current_process();
                                                if (NIL == var43) {
                                                    module0034.f1873(var42, var44);
                                                }
                                                else if (!var43.eql(var44)) {
                                                    Errors.error((SubLObject)$ic132$);
                                                }
                                            }
                                            try {
                                                if (NIL != f43875(var7, (SubLObject)$ic233$, (SubLObject)UNPROVIDED)) {
                                                    final SubLObject var45 = f43938(var7, $ic234$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    SubLObject var46 = module0711.f43624(var26);
                                                    SubLObject var47 = (SubLObject)NIL;
                                                    var47 = var46.first();
                                                    while (NIL != var46) {
                                                        module0701.f42627(var9, var25, var45, module0704.f42901(var47, (SubLObject)$ic235$));
                                                        var46 = var46.rest();
                                                        var47 = var46.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_217 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                                                    if (NIL != f43875(var7, (SubLObject)$ic236$, (SubLObject)UNPROVIDED)) {
                                                        final SubLObject var48 = f43938(var7, $ic237$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        final SubLObject var49 = module0711.f43623(var26);
                                                        if (NIL != module0038.f2653(var49)) {
                                                            module0701.f42627(var9, var25, var48, module0704.f42901(var49, (SubLObject)$ic235$));
                                                        }
                                                    }
                                                    if (NIL != var42 && NIL == var43) {
                                                        module0034.f1873(var42, (SubLObject)NIL);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_217, var8);
                                                }
                                            }
                                        }
                                        finally {
                                            module0034.$g879$.rebind(var8_216, var8);
                                        }
                                    }
                                    finally {
                                        module0580.$g4359$.rebind(var8_215, var8);
                                    }
                                    if (var41 == $ic238$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var8))) {
                                        module0034.f1891(module0580.$g4358$.getDynamicValue(var8));
                                    }
                                }
                                finally {
                                    module0580.$g4358$.rebind(var8_214, var8);
                                }
                            }
                            finally {
                                final SubLObject var8_218 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                                    if (NIL == var40) {
                                        module0580.f35554(module0580.$g4362$.getDynamicValue(var8));
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_218, var8);
                                }
                            }
                        }
                        finally {
                            module0580.$g4362$.rebind(var8_213, var8);
                        }
                    }
                    finally {
                        module0580.$g4361$.rebind(var8_212, var8);
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var23, var8);
            module0012.$g77$.rebind(var22, var8);
            module0012.$g76$.rebind(var21, var8);
            module0012.$g75$.rebind(var20, var8);
        }
        return var7;
    }
    
    public static SubLObject f43944(final SubLObject var234) {
        final SubLObject var235 = module0732.f45147(var234);
        final SubLObject var236 = (SubLObject)((NIL != var235) ? module0732.f45164(var235) : NIL);
        return var236;
    }
    
    public static SubLObject f43960(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f43917(var7);
        final SubLObject var10 = module0702.f42814(f43875(var7, (SubLObject)$ic239$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = f43875(var7, (SubLObject)$ic127$, (SubLObject)UNPROVIDED);
        final SubLObject var12 = f43874(var7);
        module0701.f42755(var9, var10);
        module0701.f42627(var9, var10, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic211$));
        module0701.f42627(var9, var10, module0701.f42807((SubLObject)$ic240$), module0704.f42901(module0712.$g5651$.getDynamicValue(var8), (SubLObject)UNPROVIDED));
        SubLObject var13 = (SubLObject)NIL;
        try {
            var8.throwStack.push($ic223$);
            final SubLObject var14 = Errors.$error_handler$.currentBinding(var8);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic224$), var8);
                try {
                    final SubLObject var15 = module0038.f2953(module0712.$g5632$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0038.f2653(var15)) {
                        module0701.f42627(var9, var10, module0701.f42807((SubLObject)$ic158$), module0704.f42901(var15, (SubLObject)$ic235$));
                    }
                }
                catch (Throwable var16) {
                    Errors.handleThrowable(var16, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var14, var8);
            }
        }
        catch (Throwable var17) {
            var13 = Errors.handleThrowable(var17, (SubLObject)$ic223$);
        }
        finally {
            var8.throwStack.pop();
        }
        final SubLObject var18 = module0580.$g4361$.currentBinding(var8);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var8);
            var8.resetMultipleValues();
            final SubLObject var8_241 = module0580.$g4362$.currentBinding(var8);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var8);
                final SubLObject var19 = var8.secondMultipleValue();
                var8.resetMultipleValues();
                try {
                    var8.resetMultipleValues();
                    final SubLObject var8_242 = module0580.$g4358$.currentBinding(var8);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var8);
                        final SubLObject var20 = var8.secondMultipleValue();
                        var8.resetMultipleValues();
                        final SubLObject var8_243 = module0580.$g4359$.currentBinding(var8);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var8);
                            final SubLObject var21 = module0580.$g4358$.getDynamicValue(var8);
                            final SubLObject var8_244 = module0034.$g879$.currentBinding(var8);
                            try {
                                module0034.$g879$.bind(var21, var8);
                                SubLObject var22 = (SubLObject)NIL;
                                if (NIL != var21 && NIL == module0034.f1842(var21)) {
                                    var22 = module0034.f1869(var21);
                                    final SubLObject var23 = Threads.current_process();
                                    if (NIL == var22) {
                                        module0034.f1873(var21, var23);
                                    }
                                    else if (!var22.eql(var23)) {
                                        Errors.error((SubLObject)$ic132$);
                                    }
                                }
                                try {
                                    if (NIL != var11) {
                                        final SubLObject var24 = Sequences.cconcatenate((SubLObject)$ic241$, new SubLObject[] { module0006.f203(module0173.f10962()), $ic242$ });
                                        final SubLObject var25 = module0173.f10962();
                                        SubLObject var26 = (SubLObject)ZERO_INTEGER;
                                        final SubLObject var8_245 = module0012.$g75$.currentBinding(var8);
                                        final SubLObject var27 = module0012.$g76$.currentBinding(var8);
                                        final SubLObject var28 = module0012.$g77$.currentBinding(var8);
                                        final SubLObject var29 = module0012.$g78$.currentBinding(var8);
                                        try {
                                            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                            module0012.$g76$.bind((SubLObject)NIL, var8);
                                            module0012.$g77$.bind((SubLObject)T, var8);
                                            module0012.$g78$.bind(Time.get_universal_time(), var8);
                                            module0012.f478(var24);
                                            SubLObject var30 = module0173.f10961();
                                            SubLObject var31 = (SubLObject)NIL;
                                            var31 = var30.first();
                                            while (NIL != var30) {
                                                final SubLObject var32 = var31;
                                                if (NIL == module0065.f4772(var32, (SubLObject)$ic137$)) {
                                                    final SubLObject var99_246 = var32;
                                                    if (NIL == module0065.f4775(var99_246, (SubLObject)$ic137$)) {
                                                        final SubLObject var33 = module0065.f4740(var99_246);
                                                        final SubLObject var34 = (SubLObject)NIL;
                                                        SubLObject var35;
                                                        SubLObject var36;
                                                        SubLObject var37;
                                                        SubLObject var38;
                                                        SubLObject var39;
                                                        for (var35 = Sequences.length(var33), var36 = (SubLObject)NIL, var36 = (SubLObject)ZERO_INTEGER; var36.numL(var35); var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER)) {
                                                            var37 = ((NIL != var34) ? Numbers.subtract(var35, var36, (SubLObject)ONE_INTEGER) : var36);
                                                            var38 = Vectors.aref(var33, var37);
                                                            if (NIL == module0065.f4749(var38) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                                if (NIL != module0065.f4749(var38)) {
                                                                    var38 = (SubLObject)$ic137$;
                                                                }
                                                                var26 = Numbers.add(var26, (SubLObject)ONE_INTEGER);
                                                                module0012.note_percent_progress(var26, var25);
                                                                var39 = f43938(var7, var38, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                                if (NIL != module0702.f42828(var39)) {
                                                                    module0701.f42627(var9, var39, module0701.f42807((SubLObject)$ic243$), module0704.f42901(module0711.f43559(var38), (SubLObject)$ic235$));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    final SubLObject var107_248 = var32;
                                                    if (NIL == module0065.f4777(var107_248) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                        final SubLObject var40 = module0065.f4738(var107_248);
                                                        SubLObject var41 = module0065.f4739(var107_248);
                                                        final SubLObject var42 = module0065.f4734(var107_248);
                                                        final SubLObject var43 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic137$)) ? NIL : $ic137$);
                                                        while (var41.numL(var42)) {
                                                            final SubLObject var44 = Hashtables.gethash_without_values(var41, var40, var43);
                                                            if (NIL == module0065.f4773((SubLObject)$ic137$) || NIL == module0065.f4749(var44)) {
                                                                var26 = Numbers.add(var26, (SubLObject)ONE_INTEGER);
                                                                module0012.note_percent_progress(var26, var25);
                                                                final SubLObject var45 = f43938(var7, var44, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                                if (NIL != module0702.f42828(var45)) {
                                                                    module0701.f42627(var9, var45, module0701.f42807((SubLObject)$ic243$), module0704.f42901(module0711.f43559(var44), (SubLObject)$ic235$));
                                                                }
                                                            }
                                                            var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                                var30 = var30.rest();
                                                var31 = var30.first();
                                            }
                                            module0012.f479();
                                        }
                                        finally {
                                            module0012.$g78$.rebind(var29, var8);
                                            module0012.$g77$.rebind(var28, var8);
                                            module0012.$g76$.rebind(var27, var8);
                                            module0012.$g75$.rebind(var8_245, var8);
                                        }
                                    }
                                    else {
                                        final SubLObject var46 = var12;
                                        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic241$, new SubLObject[] { module0006.f203(Sequences.length(var12)), $ic242$ }), var8);
                                        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                                        module0012.$g83$.setDynamicValue(Sequences.length(var46), var8);
                                        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                                        final SubLObject var8_246 = module0012.$g75$.currentBinding(var8);
                                        final SubLObject var47 = module0012.$g76$.currentBinding(var8);
                                        final SubLObject var48 = module0012.$g77$.currentBinding(var8);
                                        final SubLObject var49 = module0012.$g78$.currentBinding(var8);
                                        try {
                                            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                            module0012.$g76$.bind((SubLObject)NIL, var8);
                                            module0012.$g77$.bind((SubLObject)T, var8);
                                            module0012.$g78$.bind(Time.get_universal_time(), var8);
                                            module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                            SubLObject var50 = var46;
                                            SubLObject var51 = (SubLObject)NIL;
                                            var51 = var50.first();
                                            while (NIL != var50) {
                                                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                                final SubLObject var52 = f43938(var7, var51, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                if (NIL != module0702.f42828(var52)) {
                                                    module0701.f42627(var9, var52, module0701.f42807((SubLObject)$ic243$), module0704.f42901(module0711.f43559(var51), (SubLObject)$ic235$));
                                                }
                                                var50 = var50.rest();
                                                var51 = var50.first();
                                            }
                                            module0012.f479();
                                        }
                                        finally {
                                            module0012.$g78$.rebind(var49, var8);
                                            module0012.$g77$.rebind(var48, var8);
                                            module0012.$g76$.rebind(var47, var8);
                                            module0012.$g75$.rebind(var8_246, var8);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var8_247 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                                        SubLObject var53 = module0701.f42758(var9);
                                        if (NIL == conses_high.assoc(module0710.f43486(), var53, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
                                            final SubLObject var54 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, module0710.f43486()), module0710.f43487());
                                            if (NIL == conses_high.member(var54, var53, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                var53 = (SubLObject)ConsesLow.cons(var54, var53);
                                            }
                                            module0701.f42759(var9, var53);
                                        }
                                        final SubLObject var55 = (SubLObject)$ic246$;
                                        final SubLObject var56 = module0702.f42814(Sequences.cconcatenate(module0710.f43487(), var55), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        final SubLObject var57 = module0035.f2293(module0712.$g5652$.getGlobalValue(), var55, (SubLObject)$ic244$, (SubLObject)UNPROVIDED).first();
                                        module0701.f42627(var9, var56, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic247$));
                                        module0701.f42627(var9, var56, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic248$));
                                        module0701.f42627(var9, var56, module0701.f42807((SubLObject)$ic243$), module0704.f42901(var55, (SubLObject)$ic235$));
                                        module0701.f42627(var9, var56, module0701.f42807((SubLObject)$ic158$), module0704.f42901(var57, (SubLObject)$ic235$));
                                        if (NIL != var11) {
                                            final SubLObject var58 = Sequences.cconcatenate((SubLObject)$ic249$, new SubLObject[] { module0006.f203(module0173.f10962()), $ic242$ });
                                            final SubLObject var59 = module0173.f10962();
                                            SubLObject var60 = (SubLObject)ZERO_INTEGER;
                                            final SubLObject var8_248 = module0012.$g75$.currentBinding(var8);
                                            final SubLObject var61 = module0012.$g76$.currentBinding(var8);
                                            final SubLObject var62 = module0012.$g77$.currentBinding(var8);
                                            final SubLObject var63 = module0012.$g78$.currentBinding(var8);
                                            try {
                                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                                module0012.$g77$.bind((SubLObject)T, var8);
                                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                                module0012.f478(var58);
                                                SubLObject var64 = module0173.f10961();
                                                SubLObject var65 = (SubLObject)NIL;
                                                var65 = var64.first();
                                                while (NIL != var64) {
                                                    final SubLObject var66 = var65;
                                                    if (NIL == module0065.f4772(var66, (SubLObject)$ic137$)) {
                                                        final SubLObject var99_247 = var66;
                                                        if (NIL == module0065.f4775(var99_247, (SubLObject)$ic137$)) {
                                                            final SubLObject var67 = module0065.f4740(var99_247);
                                                            final SubLObject var68 = (SubLObject)NIL;
                                                            SubLObject var69;
                                                            SubLObject var70;
                                                            SubLObject var71;
                                                            SubLObject var72;
                                                            SubLObject var73;
                                                            for (var69 = Sequences.length(var67), var70 = (SubLObject)NIL, var70 = (SubLObject)ZERO_INTEGER; var70.numL(var69); var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER)) {
                                                                var71 = ((NIL != var68) ? Numbers.subtract(var69, var70, (SubLObject)ONE_INTEGER) : var70);
                                                                var72 = Vectors.aref(var67, var71);
                                                                if (NIL == module0065.f4749(var72) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                                    if (NIL != module0065.f4749(var72)) {
                                                                        var72 = (SubLObject)$ic137$;
                                                                    }
                                                                    var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                                                                    module0012.note_percent_progress(var60, var59);
                                                                    var73 = f43938(var7, var72, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                                    if (NIL != module0702.f42828(var73)) {
                                                                        module0701.f42627(var9, var73, var56, module0704.f42901(module0711.f43531(var72), (SubLObject)NIL));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject var107_249 = var66;
                                                        if (NIL == module0065.f4777(var107_249) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                            final SubLObject var74 = module0065.f4738(var107_249);
                                                            SubLObject var75 = module0065.f4739(var107_249);
                                                            final SubLObject var76 = module0065.f4734(var107_249);
                                                            final SubLObject var77 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic137$)) ? NIL : $ic137$);
                                                            while (var75.numL(var76)) {
                                                                final SubLObject var78 = Hashtables.gethash_without_values(var75, var74, var77);
                                                                if (NIL == module0065.f4773((SubLObject)$ic137$) || NIL == module0065.f4749(var78)) {
                                                                    var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                                                                    module0012.note_percent_progress(var60, var59);
                                                                    final SubLObject var79 = f43938(var7, var78, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                                    if (NIL != module0702.f42828(var79)) {
                                                                        module0701.f42627(var9, var79, var56, module0704.f42901(module0711.f43531(var78), (SubLObject)NIL));
                                                                    }
                                                                }
                                                                var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
                                                            }
                                                        }
                                                    }
                                                    var64 = var64.rest();
                                                    var65 = var64.first();
                                                }
                                                module0012.f479();
                                            }
                                            finally {
                                                module0012.$g78$.rebind(var63, var8);
                                                module0012.$g77$.rebind(var62, var8);
                                                module0012.$g76$.rebind(var61, var8);
                                                module0012.$g75$.rebind(var8_248, var8);
                                            }
                                        }
                                        else {
                                            final SubLObject var80 = var12;
                                            module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic249$, new SubLObject[] { module0006.f203(Sequences.length(var12)), $ic242$ }), var8);
                                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                                            module0012.$g83$.setDynamicValue(Sequences.length(var80), var8);
                                            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                                            final SubLObject var8_249 = module0012.$g75$.currentBinding(var8);
                                            final SubLObject var81 = module0012.$g76$.currentBinding(var8);
                                            final SubLObject var82 = module0012.$g77$.currentBinding(var8);
                                            final SubLObject var83 = module0012.$g78$.currentBinding(var8);
                                            try {
                                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                                module0012.$g77$.bind((SubLObject)T, var8);
                                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                                module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                                SubLObject var84 = var80;
                                                SubLObject var85 = (SubLObject)NIL;
                                                var85 = var84.first();
                                                while (NIL != var84) {
                                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                                    final SubLObject var86 = f43938(var7, var85, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                    if (NIL != module0702.f42828(var86)) {
                                                        module0701.f42627(var9, var86, var56, module0704.f42901(module0711.f43531(var85), (SubLObject)NIL));
                                                    }
                                                    var84 = var84.rest();
                                                    var85 = var84.first();
                                                }
                                                module0012.f479();
                                            }
                                            finally {
                                                module0012.$g78$.rebind(var83, var8);
                                                module0012.$g77$.rebind(var82, var8);
                                                module0012.$g76$.rebind(var81, var8);
                                                module0012.$g75$.rebind(var8_249, var8);
                                            }
                                        }
                                        final SubLObject var87 = (SubLObject)$ic250$;
                                        final SubLObject var88 = module0702.f42814(Sequences.cconcatenate(module0710.f43487(), var87), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        final SubLObject var89 = module0035.f2293(module0712.$g5652$.getGlobalValue(), var87, (SubLObject)$ic244$, (SubLObject)UNPROVIDED).first();
                                        module0701.f42627(var9, var88, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic247$));
                                        module0701.f42627(var9, var88, module0701.f42807((SubLObject)$ic152$), module0701.f42807((SubLObject)$ic248$));
                                        module0701.f42627(var9, var88, module0701.f42807((SubLObject)$ic243$), module0704.f42901(var87, (SubLObject)$ic235$));
                                        module0701.f42627(var9, var88, module0701.f42807((SubLObject)$ic158$), module0704.f42901(var89, (SubLObject)$ic235$));
                                        if (NIL != var11) {
                                            final SubLObject var58 = Sequences.cconcatenate((SubLObject)$ic251$, new SubLObject[] { module0006.f203(module0173.f10962()), $ic242$ });
                                            final SubLObject var59 = module0173.f10962();
                                            SubLObject var60 = (SubLObject)ZERO_INTEGER;
                                            final SubLObject var8_250 = module0012.$g75$.currentBinding(var8);
                                            final SubLObject var61 = module0012.$g76$.currentBinding(var8);
                                            final SubLObject var62 = module0012.$g77$.currentBinding(var8);
                                            final SubLObject var63 = module0012.$g78$.currentBinding(var8);
                                            try {
                                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                                module0012.$g77$.bind((SubLObject)T, var8);
                                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                                module0012.f478(var58);
                                                SubLObject var64 = module0173.f10961();
                                                SubLObject var65 = (SubLObject)NIL;
                                                var65 = var64.first();
                                                while (NIL != var64) {
                                                    final SubLObject var66 = var65;
                                                    if (NIL == module0065.f4772(var66, (SubLObject)$ic137$)) {
                                                        final SubLObject var99_248 = var66;
                                                        if (NIL == module0065.f4775(var99_248, (SubLObject)$ic137$)) {
                                                            final SubLObject var67 = module0065.f4740(var99_248);
                                                            final SubLObject var68 = (SubLObject)NIL;
                                                            SubLObject var69;
                                                            SubLObject var70;
                                                            SubLObject var71;
                                                            SubLObject var72;
                                                            SubLObject var73;
                                                            for (var69 = Sequences.length(var67), var70 = (SubLObject)NIL, var70 = (SubLObject)ZERO_INTEGER; var70.numL(var69); var70 = Numbers.add(var70, (SubLObject)ONE_INTEGER)) {
                                                                var71 = ((NIL != var68) ? Numbers.subtract(var69, var70, (SubLObject)ONE_INTEGER) : var70);
                                                                var72 = Vectors.aref(var67, var71);
                                                                if (NIL == module0065.f4749(var72) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                                    if (NIL != module0065.f4749(var72)) {
                                                                        var72 = (SubLObject)$ic137$;
                                                                    }
                                                                    var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                                                                    module0012.note_percent_progress(var60, var59);
                                                                    var73 = f43938(var7, var72, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                                    if (NIL != module0702.f42828(var73)) {
                                                                        module0701.f42627(var9, var73, var88, module0704.f42901(module0711.f43561(var72), (SubLObject)NIL));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject var107_250 = var66;
                                                        if (NIL == module0065.f4777(var107_250) || NIL == module0065.f4773((SubLObject)$ic137$)) {
                                                            final SubLObject var74 = module0065.f4738(var107_250);
                                                            SubLObject var75 = module0065.f4739(var107_250);
                                                            final SubLObject var76 = module0065.f4734(var107_250);
                                                            final SubLObject var77 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic137$)) ? NIL : $ic137$);
                                                            while (var75.numL(var76)) {
                                                                final SubLObject var78 = Hashtables.gethash_without_values(var75, var74, var77);
                                                                if (NIL == module0065.f4773((SubLObject)$ic137$) || NIL == module0065.f4749(var78)) {
                                                                    var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                                                                    module0012.note_percent_progress(var60, var59);
                                                                    final SubLObject var79 = f43938(var7, var78, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                                    if (NIL != module0702.f42828(var79)) {
                                                                        module0701.f42627(var9, var79, var88, module0704.f42901(module0711.f43561(var78), (SubLObject)NIL));
                                                                    }
                                                                }
                                                                var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
                                                            }
                                                        }
                                                    }
                                                    var64 = var64.rest();
                                                    var65 = var64.first();
                                                }
                                                module0012.f479();
                                            }
                                            finally {
                                                module0012.$g78$.rebind(var63, var8);
                                                module0012.$g77$.rebind(var62, var8);
                                                module0012.$g76$.rebind(var61, var8);
                                                module0012.$g75$.rebind(var8_250, var8);
                                            }
                                        }
                                        else {
                                            final SubLObject var80 = var12;
                                            module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic251$, new SubLObject[] { module0006.f203(Sequences.length(var12)), $ic242$ }), var8);
                                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                                            module0012.$g83$.setDynamicValue(Sequences.length(var80), var8);
                                            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                                            final SubLObject var8_251 = module0012.$g75$.currentBinding(var8);
                                            final SubLObject var81 = module0012.$g76$.currentBinding(var8);
                                            final SubLObject var82 = module0012.$g77$.currentBinding(var8);
                                            final SubLObject var83 = module0012.$g78$.currentBinding(var8);
                                            try {
                                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                                module0012.$g76$.bind((SubLObject)NIL, var8);
                                                module0012.$g77$.bind((SubLObject)T, var8);
                                                module0012.$g78$.bind(Time.get_universal_time(), var8);
                                                module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                                SubLObject var84 = var80;
                                                SubLObject var85 = (SubLObject)NIL;
                                                var85 = var84.first();
                                                while (NIL != var84) {
                                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                                    final SubLObject var86 = f43938(var7, var85, (SubLObject)T, (SubLObject)UNPROVIDED);
                                                    if (NIL != module0702.f42828(var86)) {
                                                        module0701.f42627(var9, var86, var88, module0704.f42901(module0711.f43559(var85), (SubLObject)$ic235$));
                                                    }
                                                    var84 = var84.rest();
                                                    var85 = var84.first();
                                                }
                                                module0012.f479();
                                            }
                                            finally {
                                                module0012.$g78$.rebind(var83, var8);
                                                module0012.$g77$.rebind(var82, var8);
                                                module0012.$g76$.rebind(var81, var8);
                                                module0012.$g75$.rebind(var8_251, var8);
                                            }
                                        }
                                        if (NIL != var21 && NIL == var22) {
                                            module0034.f1873(var21, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_247, var8);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var8_244, var8);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var8_243, var8);
                        }
                        if (var20 == $ic238$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var8))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var8));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var8_242, var8);
                    }
                }
                finally {
                    final SubLObject var8_252 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                        if (NIL == var19) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var8));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var8_252, var8);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var8_241, var8);
            }
        }
        finally {
            module0580.$g4361$.rebind(var18, var8);
        }
        SubLObject var90 = module0701.f42662(var9, module0701.f42807((SubLObject)$ic219$), module0701.f42807((SubLObject)$ic166$));
        module0012.$g82$.setDynamicValue((SubLObject)$ic252$, var8);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
        module0012.$g83$.setDynamicValue(Sequences.length(var90), var8);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
        SubLObject var14 = module0012.$g75$.currentBinding(var8);
        SubLObject var91 = module0012.$g76$.currentBinding(var8);
        SubLObject var92 = module0012.$g77$.currentBinding(var8);
        SubLObject var93 = module0012.$g78$.currentBinding(var8);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
            module0012.$g76$.bind((SubLObject)NIL, var8);
            module0012.$g77$.bind((SubLObject)T, var8);
            module0012.$g78$.bind(Time.get_universal_time(), var8);
            module0012.f478(module0012.$g82$.getDynamicValue(var8));
            SubLObject var94 = var90;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                module0701.f42647(var9, var95);
                var94 = var94.rest();
                var95 = var94.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var93, var8);
            module0012.$g77$.rebind(var92, var8);
            module0012.$g76$.rebind(var91, var8);
            module0012.$g75$.rebind(var14, var8);
        }
        var90 = module0701.f42662(var9, module0701.f42807((SubLObject)$ic219$), module0701.f42807((SubLObject)$ic164$));
        module0012.$g82$.setDynamicValue((SubLObject)$ic253$, var8);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
        module0012.$g83$.setDynamicValue(Sequences.length(var90), var8);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
        var14 = module0012.$g75$.currentBinding(var8);
        var91 = module0012.$g76$.currentBinding(var8);
        var92 = module0012.$g77$.currentBinding(var8);
        var93 = module0012.$g78$.currentBinding(var8);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
            module0012.$g76$.bind((SubLObject)NIL, var8);
            module0012.$g77$.bind((SubLObject)T, var8);
            module0012.$g78$.bind(Time.get_universal_time(), var8);
            module0012.f478(module0012.$g82$.getDynamicValue(var8));
            SubLObject var94 = var90;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                module0701.f42647(var9, var95);
                var94 = var94.rest();
                var95 = var94.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var93, var8);
            module0012.$g77$.rebind(var92, var8);
            module0012.$g76$.rebind(var91, var8);
            module0012.$g75$.rebind(var14, var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43936(final SubLObject var7) {
        final SubLObject var8 = f43873(var7);
        final SubLObject var9 = f43917(var7);
        final SubLObject var10 = f43875(var7, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
        SubLObject var11 = module0701.f42758(var9);
        if (NIL != module0038.f2653(var10)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons((SubLObject)$ic254$, var10);
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        if (NIL != module0173.f10955(var8)) {
            module0701.f42755(var9, f43938(var7, var8, (SubLObject)T, (SubLObject)UNPROVIDED));
            SubLObject var13 = module0220.f14601(var8, $ic256$, (SubLObject)ONE_INTEGER, (SubLObject)$ic257$, (SubLObject)UNPROVIDED);
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                final SubLObject var15 = var14.first();
                final SubLObject var16 = module0220.f14553(conses_high.second(var14), $ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0038.f2608(var15)) {
                    final SubLObject var17 = (SubLObject)ConsesLow.cons((SubLObject)$ic255$, var16);
                    if (NIL == conses_high.member(var17, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var11 = (SubLObject)ConsesLow.cons(var17, var11);
                    }
                }
                else {
                    final SubLObject var17 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, var15), var16);
                    if (NIL == conses_high.member(var17, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var11 = (SubLObject)ConsesLow.cons(var17, var11);
                    }
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        if (NIL == conses_high.assoc((SubLObject)$ic258$, var11, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, (SubLObject)$ic258$), (SubLObject)$ic259$);
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        if (NIL == conses_high.assoc((SubLObject)$ic260$, var11, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, (SubLObject)$ic260$), (SubLObject)$ic261$);
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        if (NIL == conses_high.assoc((SubLObject)$ic262$, var11, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, (SubLObject)$ic262$), (SubLObject)$ic263$);
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        if (NIL == conses_high.assoc((SubLObject)$ic264$, var11, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, (SubLObject)$ic264$), (SubLObject)$ic265$);
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        if (NIL == conses_high.assoc((SubLObject)$ic266$, var11, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, (SubLObject)$ic266$), module0710.f43474((SubLObject)UNPROVIDED));
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        if (NIL == conses_high.assoc((SubLObject)$ic267$, var11, (SubLObject)$ic244$, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic245$, (SubLObject)$ic267$), (SubLObject)$ic268$);
            if (NIL == conses_high.member(var12, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var12, var11);
            }
        }
        final SubLObject var18 = f43875(var7, (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
        if (NIL != module0589.f35907(var18, (SubLObject)UNPROVIDED)) {
            final SubLObject var19 = (SubLObject)ConsesLow.cons((SubLObject)$ic255$, var18);
            if (NIL == conses_high.member(var19, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var11 = (SubLObject)ConsesLow.cons(var19, var11);
            }
        }
        module0701.f42759(var9, var11);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43879(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        final SubLObject var9 = module0601.$g4653$.currentBinding(var8);
        try {
            module0601.$g4653$.bind((SubLObject)FOUR_INTEGER, var8);
            f43961(var7);
        }
        finally {
            module0601.$g4653$.rebind(var9, var8);
        }
        return var7;
    }
    
    public static SubLObject f43962(final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        SubLObject var167 = (SubLObject)NIL;
        if (NIL != module0031.f1688((SubLObject)ConsesLow.list(module0700.f42613(var165), module0700.f42612(var165), module0700.f42614(var165)), $g5669$.getDynamicValue(var166))) {
            var167 = (SubLObject)T;
        }
        if (NIL == var167 && NIL != module0701.f42654(module0700.f42613(var165)) && NIL != module0031.f1688((SubLObject)ConsesLow.list(module0700.f42613(var165), module0700.f42614(var165), module0700.f42612(var165)), $g5669$.getDynamicValue(var166))) {
            var167 = (SubLObject)T;
        }
        return var167;
    }
    
    public static SubLObject f43963(final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        module0031.f1690((SubLObject)ConsesLow.list(module0700.f42613(var165), module0700.f42612(var165), module0700.f42614(var165)), $g5669$.getDynamicValue(var166));
        return var165;
    }
    
    public static SubLObject f43964(final SubLObject var247) {
        final SubLThread var248 = SubLProcess.currentSubLThread();
        if (var247.isString()) {
            Errors.sublisp_break((SubLObject)UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return module0031.f1688(var247, $g5670$.getDynamicValue(var248));
    }
    
    public static SubLObject f43965(final SubLObject var247) {
        final SubLThread var248 = SubLProcess.currentSubLThread();
        module0031.f1690(var247, $g5670$.getDynamicValue(var248));
        return var247;
    }
    
    public static SubLObject f43966(final SubLObject var7, final SubLObject var247) {
        return module0004.f104(var247, module0701.f42756(f43917(var7)), (SubLObject)$ic269$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43961(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        final SubLObject var9 = f43917(var7);
        final SubLObject var10 = f43875(var7, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        final SubLObject var11 = $g5669$.currentBinding(var8);
        final SubLObject var12 = $g5670$.currentBinding(var8);
        final SubLObject var13 = $g5671$.currentBinding(var8);
        try {
            $g5669$.bind(module0031.f1685(module0701.f42686(var9), Symbols.symbol_function((SubLObject)EQUAL)), var8);
            $g5670$.bind(module0031.f1685(module0701.f42686(var9), Symbols.symbol_function((SubLObject)EQUAL)), var8);
            $g5671$.bind((SubLObject)NIL, var8);
            final SubLObject var15;
            final SubLObject var14 = var15 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var8_270 = module0034.$g879$.currentBinding(var8);
            try {
                module0034.$g879$.bind(var15, var8);
                SubLObject var16 = (SubLObject)NIL;
                if (NIL != var15 && NIL == module0034.f1842(var15)) {
                    var16 = module0034.f1869(var15);
                    final SubLObject var17 = Threads.current_process();
                    if (NIL == var16) {
                        module0034.f1873(var15, var17);
                    }
                    else if (!var16.eql(var17)) {
                        Errors.error((SubLObject)$ic132$);
                    }
                }
                try {
                    final SubLObject var8_271 = module0587.$g4457$.currentBinding(var8);
                    try {
                        module0587.$g4457$.bind(var10, var8);
                        module0601.f36751(module0601.$g4651$.getDynamicValue(var8), (SubLObject)$ic270$, (SubLObject)UNPROVIDED);
                        module0712.f43725(module0701.f42758(var9));
                        SubLObject var18 = module0708.f43033(var9);
                        final SubLObject var19 = f43875(var7, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
                        if (NIL != module0589.f35907(var19, (SubLObject)UNPROVIDED)) {
                            var18 = conses_high.putf(var18, (SubLObject)$ic271$, var19);
                        }
                        try {
                            final SubLObject var8_272 = module0601.$g4652$.currentBinding(var8);
                            final SubLObject var35_274 = module0601.$g4654$.currentBinding(var8);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var8), module0601.$g4652$.getDynamicValue(var8)), var8);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var8), var8);
                                module0601.f36758(f43967(var7, (SubLObject)$ic272$), var18, (SubLObject)NIL, (SubLObject)T);
                                final SubLObject var20 = module0701.f42703(var9);
                                SubLObject var21 = (SubLObject)NIL;
                                if (NIL != module0702.f42828(var20)) {
                                    SubLObject var22 = module0701.f42651(var9, var20, (SubLObject)UNPROVIDED);
                                    SubLObject var23 = (SubLObject)NIL;
                                    var23 = var22.first();
                                    while (NIL != var22) {
                                        if (NIL != module0701.f42633(module0700.f42613(var23), module0701.f42807((SubLObject)$ic152$)) && NIL != module0701.f42633(module0700.f42614(var23), module0701.f42807((SubLObject)$ic211$))) {
                                            f43963(var23);
                                        }
                                        else {
                                            var21 = (SubLObject)ConsesLow.cons(var23, var21);
                                        }
                                        var22 = var22.rest();
                                        var23 = var22.first();
                                    }
                                    f43968(var7, var20, module0701.f42807((SubLObject)$ic211$));
                                    f43965(var20);
                                }
                                final SubLObject var8_273 = module0701.$g5498$.currentBinding(var8);
                                try {
                                    module0701.$g5498$.bind((SubLObject)NIL, var8);
                                    final SubLObject var24 = (SubLObject)$ic273$;
                                    SubLObject var26;
                                    final SubLObject var25 = var26 = var24;
                                    SubLObject var27 = (SubLObject)NIL;
                                    var27 = var26.first();
                                    while (NIL != var26) {
                                        f43969(var7, var27);
                                        var26 = var26.rest();
                                        var27 = var26.first();
                                    }
                                    SubLObject var28 = (SubLObject)NIL;
                                    SubLObject var29 = module0701.f42756(var9);
                                    module0012.$g82$.setDynamicValue((SubLObject)$ic274$, var8);
                                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                                    module0012.$g83$.setDynamicValue(Sequences.length(var29), var8);
                                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                                    final SubLObject var8_274 = module0012.$g75$.currentBinding(var8);
                                    final SubLObject var35_275 = module0012.$g76$.currentBinding(var8);
                                    final SubLObject var36_284 = module0012.$g77$.currentBinding(var8);
                                    SubLObject var30 = module0012.$g78$.currentBinding(var8);
                                    try {
                                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                        module0012.$g76$.bind((SubLObject)NIL, var8);
                                        module0012.$g77$.bind((SubLObject)T, var8);
                                        module0012.$g78$.bind(Time.get_universal_time(), var8);
                                        module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                        SubLObject var31 = var29;
                                        SubLObject var32 = (SubLObject)NIL;
                                        var32 = var31.first();
                                        while (NIL != var31) {
                                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                            if (NIL == f43964(var32)) {
                                                var28 = (SubLObject)ConsesLow.cons(var32, var28);
                                            }
                                            var31 = var31.rest();
                                            var32 = var31.first();
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var30, var8);
                                        module0012.$g77$.rebind(var36_284, var8);
                                        module0012.$g76$.rebind(var35_275, var8);
                                        module0012.$g75$.rebind(var8_274, var8);
                                    }
                                    var29 = var28;
                                    module0012.$g82$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic275$, Sequences.length(var28)), var8);
                                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var8);
                                    module0012.$g83$.setDynamicValue(Sequences.length(var29), var8);
                                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var8);
                                    final SubLObject var8_275 = module0012.$g75$.currentBinding(var8);
                                    final SubLObject var35_276 = module0012.$g76$.currentBinding(var8);
                                    final SubLObject var36_285 = module0012.$g77$.currentBinding(var8);
                                    var30 = module0012.$g78$.currentBinding(var8);
                                    try {
                                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                                        module0012.$g76$.bind((SubLObject)NIL, var8);
                                        module0012.$g77$.bind((SubLObject)T, var8);
                                        module0012.$g78$.bind(Time.get_universal_time(), var8);
                                        module0012.f478(module0012.$g82$.getDynamicValue(var8));
                                        SubLObject var31 = var29;
                                        SubLObject var32 = (SubLObject)NIL;
                                        var32 = var31.first();
                                        while (NIL != var31) {
                                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var8), module0012.$g83$.getDynamicValue(var8));
                                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var8), (SubLObject)ONE_INTEGER), var8);
                                            final SubLObject var8_276 = $g5668$.currentBinding(var8);
                                            try {
                                                $g5668$.bind(var32, var8);
                                                module0601.f36746();
                                                f43970(var7, var32, (SubLObject)UNPROVIDED);
                                                f43965(var32);
                                            }
                                            finally {
                                                $g5668$.rebind(var8_276, var8);
                                            }
                                            var31 = var31.rest();
                                            var32 = var31.first();
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var30, var8);
                                        module0012.$g77$.rebind(var36_285, var8);
                                        module0012.$g76$.rebind(var35_276, var8);
                                        module0012.$g75$.rebind(var8_275, var8);
                                    }
                                }
                                finally {
                                    module0701.$g5498$.rebind(var8_273, var8);
                                }
                                module0601.f36746();
                            }
                            finally {
                                module0601.$g4654$.rebind(var35_274, var8);
                                module0601.$g4652$.rebind(var8_272, var8);
                            }
                        }
                        finally {
                            final SubLObject var8_277 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                                module0601.f36746();
                                module0601.f36760(f43967(var7, (SubLObject)$ic272$));
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var8_277, var8);
                            }
                        }
                        module0601.f36746();
                    }
                    finally {
                        module0587.$g4457$.rebind(var8_271, var8);
                    }
                }
                finally {
                    final SubLObject var8_278 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var8);
                        if (NIL != var15 && NIL == var16) {
                            module0034.f1873(var15, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var8_278, var8);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var8_270, var8);
            }
        }
        finally {
            $g5671$.rebind(var13, var8);
            $g5670$.rebind(var12, var8);
            $g5669$.rebind(var11, var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43969(final SubLObject var7, final SubLObject var280) {
        final SubLThread var281 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        final SubLObject var282 = f43917(var7);
        final SubLObject var283 = module0702.f42814(module0699.f42531((SubLObject)$ic276$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var284 = module0701.f42807(var280);
        final SubLObject var285 = module0701.f42664(var282, var284, var283);
        final SubLObject var286 = Mapping.mapcar((SubLObject)$ic277$, var285);
        if (NIL != var286) {
            SubLObject var287 = (SubLObject)NIL;
            SubLObject var288 = var286;
            SubLObject var289 = (SubLObject)NIL;
            var289 = var288.first();
            while (NIL != var288) {
                if (NIL == module0703.f42867(var289)) {
                    var287 = (SubLObject)ConsesLow.cons(var289, var287);
                }
                var288 = var288.rest();
                var289 = var288.first();
            }
            final SubLObject var290;
            var287 = (var290 = Sequences.nreverse(var287));
            module0012.$g82$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic278$, Sequences.length(var286), var280), var281);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var281);
            module0012.$g83$.setDynamicValue(Sequences.length(var290), var281);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var281);
            final SubLObject var291 = module0012.$g75$.currentBinding(var281);
            final SubLObject var292 = module0012.$g76$.currentBinding(var281);
            final SubLObject var293 = module0012.$g77$.currentBinding(var281);
            final SubLObject var294 = module0012.$g78$.currentBinding(var281);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var281);
                module0012.$g76$.bind((SubLObject)NIL, var281);
                module0012.$g77$.bind((SubLObject)T, var281);
                module0012.$g78$.bind(Time.get_universal_time(), var281);
                module0012.f478(module0012.$g82$.getDynamicValue(var281));
                SubLObject var295 = var290;
                SubLObject var296 = (SubLObject)NIL;
                var296 = var295.first();
                while (NIL != var295) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var281), module0012.$g83$.getDynamicValue(var281));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var281), (SubLObject)ONE_INTEGER), var281);
                    final SubLObject var8_296 = $g5668$.currentBinding(var281);
                    try {
                        $g5668$.bind(var296, var281);
                        f43968(var7, var296, var284);
                        f43965(var296);
                    }
                    finally {
                        $g5668$.rebind(var8_296, var281);
                    }
                    var295 = var295.rest();
                    var296 = var295.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var294, var281);
                module0012.$g77$.rebind(var293, var281);
                module0012.$g76$.rebind(var292, var281);
                module0012.$g75$.rebind(var291, var281);
            }
        }
        final SubLObject var297 = var286;
        module0012.$g82$.setDynamicValue(PrintLow.format((SubLObject)NIL, (SubLObject)$ic279$, Sequences.length(var286), var280), var281);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var281);
        module0012.$g83$.setDynamicValue(Sequences.length(var297), var281);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var281);
        final SubLObject var298 = module0012.$g75$.currentBinding(var281);
        final SubLObject var299 = module0012.$g76$.currentBinding(var281);
        final SubLObject var300 = module0012.$g77$.currentBinding(var281);
        final SubLObject var301 = module0012.$g78$.currentBinding(var281);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var281);
            module0012.$g76$.bind((SubLObject)NIL, var281);
            module0012.$g77$.bind((SubLObject)T, var281);
            module0012.$g78$.bind(Time.get_universal_time(), var281);
            module0012.f478(module0012.$g82$.getDynamicValue(var281));
            SubLObject var302 = var297;
            SubLObject var303 = (SubLObject)NIL;
            var303 = var302.first();
            while (NIL != var302) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var281), module0012.$g83$.getDynamicValue(var281));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var281), (SubLObject)ONE_INTEGER), var281);
                if (NIL != module0703.f42867(var303) && NIL == f43964(var303)) {
                    final SubLObject var8_297 = $g5668$.currentBinding(var281);
                    try {
                        $g5668$.bind(var303, var281);
                        f43968(var7, var303, var284);
                        f43965(var303);
                    }
                    finally {
                        $g5668$.rebind(var8_297, var281);
                    }
                }
                var302 = var302.rest();
                var303 = var302.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var301, var281);
            module0012.$g77$.rebind(var300, var281);
            module0012.$g76$.rebind(var299, var281);
            module0012.$g75$.rebind(var298, var281);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43968(final SubLObject var7, final SubLObject var168, final SubLObject var292) {
        final SubLThread var293 = SubLProcess.currentSubLThread();
        final SubLObject var294 = f43917(var7);
        SubLObject var295 = Sequences.remove_if((SubLObject)$ic280$, module0701.f42655(var294, var168, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var296 = (SubLObject)NIL;
        SubLObject var297 = (SubLObject)NIL;
        SubLObject var298 = var295;
        SubLObject var299 = (SubLObject)NIL;
        var299 = var298.first();
        while (NIL != var298) {
            if (NIL != module0701.f42633(module0700.f42614(var299), var292)) {
                var296 = (SubLObject)ConsesLow.cons(var299, var296);
            }
            else {
                var297 = (SubLObject)ConsesLow.cons(var299, var297);
            }
            var298 = var298.rest();
            var299 = var298.first();
        }
        var295 = Sequences.nreverse(var297);
        if (NIL != module0703.f42867(var168) && NIL == module0035.f2111((SubLObject)$ic280$, var296, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        SubLObject var300 = var296;
        SubLObject var301 = (SubLObject)NIL;
        var301 = var300.first();
        while (NIL != var300) {
            f43963(var301);
            var300 = var300.rest();
            var301 = var300.first();
        }
        module0601.f36746();
        module0601.f36746();
        if (NIL != f43967(var7, var292)) {
            if (NIL == module0703.f42867(var168) || NIL != $g5668$.getDynamicValue(var293)) {
                try {
                    final SubLObject var302 = module0601.$g4652$.currentBinding(var293);
                    final SubLObject var303 = module0601.$g4654$.currentBinding(var293);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var293), module0601.$g4652$.getDynamicValue(var293)), var293);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var293), var293);
                        module0601.f36758(f43967(var7, var292), f43971(var7, var168), (SubLObject)makeBoolean(NIL == var295), (SubLObject)NIL);
                        if (NIL != var295) {
                            SubLObject var304 = var295;
                            SubLObject var305 = (SubLObject)NIL;
                            var305 = var304.first();
                            while (NIL != var304) {
                                f43973(var7, var305);
                                var304 = var304.rest();
                                var305 = var304.first();
                            }
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var303, var293);
                        module0601.$g4652$.rebind(var302, var293);
                    }
                }
                finally {
                    final SubLObject var306 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                        if (NIL != var295) {
                            if (NIL != var295) {
                                module0601.f36746();
                            }
                            module0601.f36760(f43967(var7, var292));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var306, var293);
                    }
                }
                return (SubLObject)NIL;
            }
        }
        try {
            final SubLObject var302 = module0601.$g4652$.currentBinding(var293);
            final SubLObject var303 = module0601.$g4654$.currentBinding(var293);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var293), module0601.$g4652$.getDynamicValue(var293)), var293);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var293), var293);
                module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var168), (SubLObject)NIL, (SubLObject)NIL);
                module0601.f36746();
                final SubLObject var8_302 = module0601.$g4652$.currentBinding(var293);
                final SubLObject var35_303 = module0601.$g4654$.currentBinding(var293);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var293), module0601.$g4652$.getDynamicValue(var293)), var293);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var293), var293);
                    module0601.f36758(f43967(var7, (SubLObject)$ic152$), f43972(var7, var292), (SubLObject)T, (SubLObject)NIL);
                }
                finally {
                    module0601.$g4654$.rebind(var35_303, var293);
                    module0601.$g4652$.rebind(var8_302, var293);
                }
                if (NIL != var295) {
                    f43970(var7, var168, var295);
                }
            }
            finally {
                module0601.$g4654$.rebind(var303, var293);
                module0601.$g4652$.rebind(var302, var293);
            }
        }
        finally {
            final SubLObject var307 = Threads.$is_thread_performing_cleanupP$.currentBinding(var293);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var293);
                module0601.f36746();
                module0601.f36760(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var307, var293);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43971(final SubLObject var7, final SubLObject var247) {
        return (SubLObject)((NIL != module0703.f42867(var247)) ? ConsesLow.list(f43967(var7, (SubLObject)$ic282$), Sequences.cconcatenate((SubLObject)$ic283$, module0703.f42874(var247))) : ConsesLow.list(f43967(var7, (SubLObject)$ic284$), f43974(var7, var247)));
    }
    
    public static SubLObject f43972(final SubLObject var7, final SubLObject var247) {
        return (SubLObject)((NIL != module0703.f42867(var247)) ? ConsesLow.list(f43967(var7, (SubLObject)$ic282$), Sequences.cconcatenate((SubLObject)$ic283$, module0703.f42874(var247))) : ConsesLow.list(f43967(var7, (SubLObject)$ic285$), f43974(var7, var247)));
    }
    
    public static SubLObject f43970(final SubLObject var7, final SubLObject var168, SubLObject var298) {
        if (var298 == UNPROVIDED) {
            var298 = (SubLObject)NIL;
        }
        final SubLThread var299 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        assert NIL != module0701.f42629(var168) : var168;
        if (NIL != var298) {
            final SubLObject var300 = var298;
            assert NIL != module0035.f2015(var300) : var300;
            SubLObject var301 = var300;
            SubLObject var302 = (SubLObject)NIL;
            var302 = var301.first();
            while (NIL != var301) {
                assert NIL != module0700.f42611(var302, (SubLObject)UNPROVIDED) : var302;
                var301 = var301.rest();
                var302 = var301.first();
            }
        }
        final SubLObject var303 = f43917(var7);
        SubLObject var304 = (SubLObject)NIL;
        if (NIL == var298) {
            var298 = Sequences.remove_if((SubLObject)$ic280$, module0701.f42655(var303, var168, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var305 = (SubLObject)NIL;
        SubLObject var306 = var298;
        SubLObject var307 = (SubLObject)NIL;
        var307 = var306.first();
        while (NIL != var306) {
            if (NIL != module0701.f42633(module0700.f42613(var307), module0702.f42814(module0699.f42531((SubLObject)$ic276$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                var304 = (SubLObject)ConsesLow.cons(var307, var304);
            }
            else {
                var305 = (SubLObject)ConsesLow.cons(var307, var305);
            }
            var298 = var305;
            var306 = var306.rest();
            var307 = var306.first();
        }
        if (NIL == var304 && NIL == var298) {
            module0601.f36746();
            final SubLObject var308 = module0601.$g4652$.currentBinding(var299);
            final SubLObject var309 = module0601.$g4654$.currentBinding(var299);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var168), (SubLObject)T, (SubLObject)NIL);
            }
            finally {
                module0601.$g4654$.rebind(var309, var299);
                module0601.$g4652$.rebind(var308, var299);
            }
            return (SubLObject)T;
        }
        if (NIL != module0035.f1997(var304)) {
            if (NIL != f43962(var304.first()) && NIL != module0703.f42867(var168)) {
                module0601.f36746();
                final SubLObject var308 = module0601.$g4652$.currentBinding(var299);
                final SubLObject var309 = module0601.$g4654$.currentBinding(var299);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                    module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var168), (SubLObject)T, (SubLObject)NIL);
                }
                finally {
                    module0601.$g4654$.rebind(var309, var299);
                    module0601.$g4652$.rebind(var308, var299);
                }
                return (SubLObject)NIL;
            }
            final SubLObject var310 = var304.first();
            final SubLObject var311 = module0700.f42614(var310);
            final SubLObject var312 = module0700.f42612(var310);
            SubLObject var313 = var304;
            SubLObject var301_308 = (SubLObject)NIL;
            var301_308 = var313.first();
            while (NIL != var313) {
                f43963(var301_308);
                var313 = var313.rest();
                var301_308 = var313.first();
            }
            module0601.f36746();
            if (NIL != module0703.f42867(var312)) {
                if (NIL == module0703.f42867(var311)) {
                    if (NIL != f43967(var7, var311)) {
                        try {
                            final SubLObject var314 = module0601.$g4652$.currentBinding(var299);
                            final SubLObject var315 = module0601.$g4654$.currentBinding(var299);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                                module0601.f36758(f43967(var7, var311), (SubLObject)((NIL != f43975(var7, var312)) ? f43971(var7, var312) : NIL), (SubLObject)NIL, (SubLObject)NIL);
                                if (NIL != var298) {
                                    SubLObject var316 = var298;
                                    SubLObject var317 = (SubLObject)NIL;
                                    var317 = var316.first();
                                    while (NIL != var316) {
                                        f43973(var7, var317);
                                        var316 = var316.rest();
                                        var317 = var316.first();
                                    }
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var315, var299);
                                module0601.$g4652$.rebind(var314, var299);
                            }
                        }
                        finally {
                            final SubLObject var318 = Threads.$is_thread_performing_cleanupP$.currentBinding(var299);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var299);
                                module0601.f36746();
                                module0601.f36760(f43967(var7, var311));
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var318, var299);
                            }
                        }
                        return (SubLObject)NIL;
                    }
                }
                try {
                    final SubLObject var314 = module0601.$g4652$.currentBinding(var299);
                    final SubLObject var315 = module0601.$g4654$.currentBinding(var299);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                        module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var312), (SubLObject)NIL, (SubLObject)NIL);
                        module0601.f36746();
                        final SubLObject var8_309 = module0601.$g4652$.currentBinding(var299);
                        final SubLObject var35_310 = module0601.$g4654$.currentBinding(var299);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                            module0601.f36758(f43967(var7, (SubLObject)$ic152$), f43972(var7, var311), (SubLObject)T, (SubLObject)NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var35_310, var299);
                            module0601.$g4652$.rebind(var8_309, var299);
                        }
                        SubLObject var316 = var298;
                        SubLObject var317 = (SubLObject)NIL;
                        var317 = var316.first();
                        while (NIL != var316) {
                            f43973(var7, var317);
                            var316 = var316.rest();
                            var317 = var316.first();
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var315, var299);
                        module0601.$g4652$.rebind(var314, var299);
                    }
                }
                finally {
                    final SubLObject var319 = Threads.$is_thread_performing_cleanupP$.currentBinding(var299);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var299);
                        module0601.f36746();
                        module0601.f36760(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var319, var299);
                    }
                }
            }
            else if (NIL != module0701.f42633(var311, module0702.f42814(module0708.f43016((SubLObject)$ic289$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                try {
                    final SubLObject var314 = module0601.$g4652$.currentBinding(var299);
                    final SubLObject var315 = module0601.$g4654$.currentBinding(var299);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                        module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var312), (SubLObject)makeBoolean(NIL == var298), (SubLObject)NIL);
                        if (NIL != var298) {
                            SubLObject var316 = var298;
                            SubLObject var317 = (SubLObject)NIL;
                            var317 = var316.first();
                            while (NIL != var316) {
                                f43973(var7, var317);
                                var316 = var316.rest();
                                var317 = var316.first();
                            }
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var315, var299);
                        module0601.$g4652$.rebind(var314, var299);
                    }
                }
                finally {
                    final SubLObject var320 = Threads.$is_thread_performing_cleanupP$.currentBinding(var299);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var299);
                        if (NIL != var298) {
                            if (NIL != var298) {
                                module0601.f36746();
                            }
                            module0601.f36760(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var320, var299);
                    }
                }
            }
            else {
                try {
                    final SubLObject var314 = module0601.$g4652$.currentBinding(var299);
                    final SubLObject var315 = module0601.$g4654$.currentBinding(var299);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                        module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var312), (SubLObject)NIL, (SubLObject)NIL);
                        module0601.f36746();
                        final SubLObject var8_310 = module0601.$g4652$.currentBinding(var299);
                        final SubLObject var35_311 = module0601.$g4654$.currentBinding(var299);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                            module0601.f36758(f43967(var7, (SubLObject)$ic152$), f43972(var7, var311), (SubLObject)T, (SubLObject)NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var35_311, var299);
                            module0601.$g4652$.rebind(var8_310, var299);
                        }
                        SubLObject var316 = var298;
                        SubLObject var317 = (SubLObject)NIL;
                        var317 = var316.first();
                        while (NIL != var316) {
                            f43973(var7, var317);
                            var316 = var316.rest();
                            var317 = var316.first();
                        }
                    }
                    finally {
                        module0601.$g4654$.rebind(var315, var299);
                        module0601.$g4652$.rebind(var314, var299);
                    }
                }
                finally {
                    final SubLObject var321 = Threads.$is_thread_performing_cleanupP$.currentBinding(var299);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var299);
                        module0601.f36746();
                        module0601.f36760(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var321, var299);
                    }
                }
            }
        }
        else if (NIL != var304) {
            SubLObject var322 = var304;
            SubLObject var323 = (SubLObject)NIL;
            var323 = var322.first();
            while (NIL != var322) {
                f43963(var323);
                var322 = var322.rest();
                var323 = var322.first();
            }
            module0601.f36746();
            try {
                final SubLObject var308 = module0601.$g4652$.currentBinding(var299);
                final SubLObject var309 = module0601.$g4654$.currentBinding(var299);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                    module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var168), (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var324 = var304;
                    SubLObject var325 = (SubLObject)NIL;
                    var325 = var324.first();
                    while (NIL != var324) {
                        final SubLObject var326 = module0700.f42614(var325);
                        module0601.f36746();
                        final SubLObject var8_311 = module0601.$g4652$.currentBinding(var299);
                        final SubLObject var35_312 = module0601.$g4654$.currentBinding(var299);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                            module0601.f36758(f43967(var7, (SubLObject)$ic152$), f43972(var7, var326), (SubLObject)T, (SubLObject)NIL);
                        }
                        finally {
                            module0601.$g4654$.rebind(var35_312, var299);
                            module0601.$g4652$.rebind(var8_311, var299);
                        }
                        var324 = var324.rest();
                        var325 = var324.first();
                    }
                    var324 = var298;
                    SubLObject var327 = (SubLObject)NIL;
                    var327 = var324.first();
                    while (NIL != var324) {
                        f43973(var7, var327);
                        var324 = var324.rest();
                        var327 = var324.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var309, var299);
                    module0601.$g4652$.rebind(var308, var299);
                }
            }
            finally {
                final SubLObject var328 = Threads.$is_thread_performing_cleanupP$.currentBinding(var299);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var299);
                    module0601.f36746();
                    module0601.f36760(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var328, var299);
                }
            }
        }
        else if (NIL != $g5667$.getDynamicValue(var299)) {
            SubLObject var322 = var298;
            SubLObject var329 = (SubLObject)NIL;
            var329 = var322.first();
            while (NIL != var322) {
                f43973(var7, var329);
                var322 = var322.rest();
                var329 = var322.first();
            }
        }
        else {
            module0601.f36746();
            try {
                final SubLObject var308 = module0601.$g4652$.currentBinding(var299);
                final SubLObject var309 = module0601.$g4654$.currentBinding(var299);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var299), module0601.$g4652$.getDynamicValue(var299)), var299);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var299), var299);
                    module0601.f36758(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), f43971(var7, var168), (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var324 = var298;
                    SubLObject var327 = (SubLObject)NIL;
                    var327 = var324.first();
                    while (NIL != var324) {
                        f43973(var7, var327);
                        var324 = var324.rest();
                        var327 = var324.first();
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var309, var299);
                    module0601.$g4652$.rebind(var308, var299);
                }
            }
            finally {
                final SubLObject var330 = Threads.$is_thread_performing_cleanupP$.currentBinding(var299);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var299);
                    module0601.f36746();
                    module0601.f36760(f43967(var7, module0702.f42814(module0699.f42531((SubLObject)$ic281$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var330, var299);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43973(final SubLObject var7, final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        if (NIL == f43962(var165)) {
            f43963(var165);
            final SubLObject var167 = f43917(var7);
            final SubLObject var168 = module0700.f42613(var165);
            final SubLObject var169 = module0700.f42612(var165);
            final SubLObject var170 = module0700.f42614(var165);
            if (NIL != module0703.f42867(var170)) {
                final SubLObject var171 = module0701.f42655(var167, var170, module0702.f42814(module0699.f42531((SubLObject)$ic290$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)).first();
                final SubLObject var172 = (SubLObject)((NIL != var171) ? module0700.f42614(var171) : NIL);
                module0601.f36746();
                if (NIL != var171 && NIL == module0701.f42633(var172, module0702.f42814(module0699.f42531((SubLObject)$ic291$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    try {
                        final SubLObject var173 = module0601.$g4652$.currentBinding(var166);
                        final SubLObject var174 = module0601.$g4654$.currentBinding(var166);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var166), module0601.$g4652$.getDynamicValue(var166)), var166);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var166), var166);
                            module0601.f36758(f43967(var7, var168), (SubLObject)ConsesLow.list(f43967(var7, (SubLObject)$ic292$), (SubLObject)$ic293$), (SubLObject)NIL, (SubLObject)NIL);
                            f43976(var7, var170);
                        }
                        finally {
                            module0601.$g4654$.rebind(var174, var166);
                            module0601.$g4652$.rebind(var173, var166);
                        }
                    }
                    finally {
                        final SubLObject var175 = Threads.$is_thread_performing_cleanupP$.currentBinding(var166);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var166);
                            module0601.f36746();
                            module0601.f36760(f43967(var7, var168));
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var175, var166);
                        }
                    }
                }
                else {
                    try {
                        final SubLObject var173 = module0601.$g4652$.currentBinding(var166);
                        final SubLObject var174 = module0601.$g4654$.currentBinding(var166);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var166), module0601.$g4652$.getDynamicValue(var166)), var166);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var166), var166);
                            module0601.f36758(f43967(var7, var168), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            f43976(var7, var170);
                        }
                        finally {
                            module0601.$g4654$.rebind(var174, var166);
                            module0601.$g4652$.rebind(var173, var166);
                        }
                    }
                    finally {
                        final SubLObject var176 = Threads.$is_thread_performing_cleanupP$.currentBinding(var166);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var166);
                            module0601.f36746();
                            module0601.f36760(f43967(var7, var168));
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var176, var166);
                        }
                    }
                }
            }
            else {
                module0601.f36746();
                if (NIL != module0704.f42888(var170)) {
                    f43977(var7, var170, var168);
                }
                else {
                    final SubLObject var177 = module0601.$g4652$.currentBinding(var166);
                    final SubLObject var178 = module0601.$g4654$.currentBinding(var166);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var166), module0601.$g4652$.getDynamicValue(var166)), var166);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var166), var166);
                        module0601.f36758(f43967(var7, var168), f43972(var7, var170), (SubLObject)T, (SubLObject)NIL);
                    }
                    finally {
                        module0601.$g4654$.rebind(var178, var166);
                        module0601.$g4652$.rebind(var177, var166);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43977(final SubLObject var7, final SubLObject var318, SubLObject var171) {
        if (var171 == UNPROVIDED) {
            var171 = (SubLObject)NIL;
        }
        final SubLThread var319 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        assert NIL != module0704.f42888(var318) : var318;
        final SubLObject var320 = module0704.f42882(var318);
        final SubLObject var321 = module0704.f42883(var318);
        if (NIL != var171) {
            SubLObject var322 = (SubLObject)NIL;
            if (NIL != var320) {
                var322 = conses_high.putf(var322, (SubLObject)$ic295$, var320);
            }
            else if (NIL != var321) {
                var322 = conses_high.putf(var322, f43967(var7, (SubLObject)$ic296$), f43974(var7, var321));
            }
            try {
                final SubLObject var323 = module0601.$g4652$.currentBinding(var319);
                final SubLObject var324 = module0601.$g4654$.currentBinding(var319);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var319), module0601.$g4652$.getDynamicValue(var319)), var319);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var319), var319);
                    module0601.f36758((NIL != f43967(var7, var171)) ? f43967(var7, var171) : module0702.f42830(var171), var322, (SubLObject)NIL, (SubLObject)NIL);
                    final SubLObject var325 = module0704.f42881(var318);
                    if (NIL != module0038.f2684(var325, module0601.f36752()) && NIL != module0038.f2673(var325, module0601.f36753(), (SubLObject)UNPROVIDED)) {
                        module0601.f36747(var325, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        module0601.f36759(module0704.f42881(var318));
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var324, var319);
                    module0601.$g4652$.rebind(var323, var319);
                }
            }
            finally {
                final SubLObject var326 = Threads.$is_thread_performing_cleanupP$.currentBinding(var319);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var319);
                    module0601.f36760((NIL != f43967(var7, var171)) ? f43967(var7, var171) : module0702.f42830(var171));
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var326, var319);
                }
            }
        }
        else {
            module0601.f36746();
            Errors.warn((SubLObject)$ic297$, var318);
            final SubLObject var327 = module0601.$g4652$.currentBinding(var319);
            final SubLObject var328 = module0601.$g4654$.currentBinding(var319);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var319), module0601.$g4652$.getDynamicValue(var319)), var319);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var319), var319);
                module0601.f36758(f43967(var7, (SubLObject)$ic298$), f43971(var7, var318), (SubLObject)T, (SubLObject)NIL);
            }
            finally {
                module0601.$g4654$.rebind(var328, var319);
                module0601.$g4652$.rebind(var327, var319);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43978(final SubLObject var7, final SubLObject var247) {
        if (NIL != module0701.f42629(var247)) {
            f43970(var7, var247, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0704.f42888(var247)) {
            f43977(var7, var247, (SubLObject)UNPROVIDED);
        }
        else {
            Errors.sublisp_break((SubLObject)$ic299$, new SubLObject[] { var247 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43976(final SubLObject var7, final SubLObject var322) {
        final SubLThread var323 = SubLProcess.currentSubLThread();
        assert NIL != f43872(var7) : var7;
        assert NIL != module0703.f42867(var322) : var322;
        final SubLObject var324 = f43917(var7);
        if (NIL != f43975(var7, var322) && !var322.eql($g5668$.getDynamicValue(var323)) && NIL != Sequences.remove_if((SubLObject)$ic280$, module0701.f42655(var324, var322, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0601.f36746();
            final SubLObject var325 = module0601.$g4652$.currentBinding(var323);
            final SubLObject var326 = module0601.$g4654$.currentBinding(var323);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var323), module0601.$g4652$.getDynamicValue(var323)), var323);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var323), var323);
                module0601.f36758(f43967(var7, (SubLObject)$ic301$), f43971(var7, var322), (SubLObject)T, (SubLObject)NIL);
            }
            finally {
                module0601.$g4654$.rebind(var326, var323);
                module0601.$g4652$.rebind(var325, var323);
            }
            $g5671$.setDynamicValue((SubLObject)ConsesLow.cons(var322, $g5671$.getDynamicValue(var323)), var323);
        }
        else {
            final SubLObject var327 = module0701.f42655(var324, var322, module0702.f42814(module0699.f42531((SubLObject)$ic302$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)).first();
            if (NIL != var327) {
                final SubLObject var328 = module0700.f42614(var327);
                final SubLObject var329 = module0701.f42655(var324, var322, module0702.f42814(module0699.f42531((SubLObject)$ic290$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)).first();
                final SubLObject var330 = (SubLObject)((NIL != var329) ? module0700.f42614(var329) : NIL);
                final SubLObject var331 = module0701.f42655(var324, var322, module0702.f42814(module0699.f42531((SubLObject)$ic276$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)).first();
                final SubLObject var332 = (SubLObject)((NIL != var331) ? module0700.f42614(var331) : NIL);
                if (NIL != var332) {
                    f43963(var331);
                    try {
                        final SubLObject var333 = module0601.$g4652$.currentBinding(var323);
                        final SubLObject var334 = module0601.$g4654$.currentBinding(var323);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var323), module0601.$g4652$.getDynamicValue(var323)), var323);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var323), var323);
                            module0601.f36758(f43967(var7, var332), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            f43978(var7, var328);
                        }
                        finally {
                            module0601.$g4654$.rebind(var334, var323);
                            module0601.$g4652$.rebind(var333, var323);
                        }
                    }
                    finally {
                        final SubLObject var335 = Threads.$is_thread_performing_cleanupP$.currentBinding(var323);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var323);
                            module0601.f36746();
                            module0601.f36760(f43967(var7, var332));
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var335, var323);
                        }
                    }
                }
                else {
                    f43978(var7, var328);
                }
                if (NIL == module0701.f42633(var330, module0702.f42814(module0699.f42531((SubLObject)$ic291$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    f43976(var7, var330);
                }
            }
            else {
                f43970(var7, var322, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43975(final SubLObject var7, final SubLObject var322) {
        final SubLObject var323 = f43917(var7);
        return (SubLObject)makeBoolean(NIL == f43875(var7, (SubLObject)$ic303$, (SubLObject)UNPROVIDED) && NIL != module0703.f42867(var322) && NIL == module0699.f42594(var322, var323) && ONE_INTEGER.numL(Sequences.length(module0701.f42664(var323, var322, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f43967(final SubLObject var7, final SubLObject var138) {
        return f43979(var7, var138);
    }
    
    public static SubLObject f43979(final SubLObject var7, SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        if (var138.isString()) {
            var138 = module0701.f42807(var138);
        }
        if (NIL != module0704.f42888(var138)) {
            return module0704.f42881(var138);
        }
        final SubLObject var140 = f43917(var7);
        final SubLObject var141 = module0701.f42758(var140);
        final SubLObject var142 = module0035.f2293(var141, (SubLObject)$ic304$, (SubLObject)$ic244$, (SubLObject)UNPROVIDED);
        if (NIL != module0038.f2653(var142) && NIL != Strings.stringE(module0702.f42830(var138), Sequences.cconcatenate(var142, module0702.f42840(var138)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0702.f42840(var138);
        }
        var139.resetMultipleValues();
        final SubLObject var143 = module0708.f43034(var141, var138);
        final SubLObject var144 = var139.secondMultipleValue();
        var139.resetMultipleValues();
        if (!var143.isString()) {
            return (SubLObject)NIL;
        }
        if (NIL != module0038.f2608(var143)) {
            return module0702.f42830(var138);
        }
        return Sequences.cconcatenate(var143, new SubLObject[] { $ic305$, var144 });
    }
    
    public static SubLObject f43974(final SubLObject var7, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        if (NIL != module0704.f42888(var138)) {
            return module0704.f42881(var138);
        }
        final SubLObject var140 = f43917(var7);
        final SubLObject var141 = f43875(var7, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
        final SubLObject var142 = module0701.f42758(var140);
        var139.resetMultipleValues();
        final SubLObject var143 = module0708.f43034(var142, var138);
        final SubLObject var144 = var139.secondMultipleValue();
        var139.resetMultipleValues();
        if (NIL != module0038.f2653(var141) && NIL != Strings.stringE(module0702.f42830(var138), Sequences.cconcatenate(var141, module0702.f42840(var138)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0702.f42840(var138);
        }
        if (!var143.isString()) {
            return module0702.f42830(var138);
        }
        if (NIL != module0038.f2608(var143)) {
            return module0702.f42830(var138);
        }
        return Sequences.cconcatenate((SubLObject)$ic306$, new SubLObject[] { var143, $ic307$, var144 });
    }
    
    public static SubLObject f43980() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43860", "S#48036", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43861", "OWL-EXPORT-ONTOLOGY-TO-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43869", "OWL-EXPORT-ONTOLOGY-TO-STREAM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43870", "OWL-EXPORT-TERMS-TO-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43871", "OWL-EXPORT-TERMS-TO-STREAM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43866", "S#48037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43862", "S#48038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43868", "S#48039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43880", "S#48040", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43881", "S#48041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43872", "S#48034", 1, 0, false);
        new $f43872$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43883", "S#48042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43884", "S#48043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43885", "S#48044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43886", "S#48045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43887", "S#48046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43888", "S#48047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43889", "S#48048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43890", "S#48049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43891", "S#48050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43892", "S#48051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43893", "S#48052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43894", "S#48053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43895", "S#48054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43896", "S#48055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43897", "S#48056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43898", "S#48057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43899", "S#48058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43900", "S#48059", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43901", "S#48060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43902", "S#48061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43903", "S#48062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43904", "S#48063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43905", "S#48064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43906", "S#48065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43907", "S#48066", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43908", "S#48067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43909", "S#48068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43882", "S#48069", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43863", "S#48070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43911", "S#48071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43910", "S#48072", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43912", "S#48073", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43913", "S#48074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43914", "S#48075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43915", "S#48076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43916", "S#48077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43917", "S#48078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43918", "S#48079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43919", "S#48080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43920", "S#48081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43873", "S#48082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43864", "S#48083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43874", "S#48084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43865", "S#48085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43921", "S#48086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43922", "S#48087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43923", "S#48088", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43924", "S#48089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43925", "S#48090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43926", "S#48091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43927", "S#48092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43928", "S#48093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43929", "S#48094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43930", "S#48095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43867", "S#48096", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43931", "S#48097", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43875", "S#48098", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43877", "S#48099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43932", "S#48100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43933", "S#48101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43934", "S#48102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43935", "S#48103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43876", "S#48104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43937", "S#48105", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43938", "S#48106", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43947", "S#48107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43946", "S#48108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43945", "S#48109", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43950", "S#48110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43951", "S#48111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43948", "S#48112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43940", "S#48113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43941", "S#48114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43952", "S#48115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43953", "S#48116", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43942", "S#48117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43954", "S#48118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43955", "S#48119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43943", "S#48120", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43956", "S#48121", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43957", "S#48122", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43939", "S#48123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43958", "S#48124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43949", "S#48125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43878", "S#48126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43959", "S#48127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43944", "S#48128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43960", "S#48129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43936", "S#48130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43879", "S#48131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43962", "S#48132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43963", "S#48133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43964", "S#48134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43965", "S#48135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43966", "S#48136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43961", "S#48137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43969", "S#48138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43968", "S#48139", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43971", "S#48140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43972", "S#48141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43970", "S#48142", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43973", "S#48143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43977", "S#48144", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43978", "S#48145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43976", "S#48146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43975", "S#48147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43967", "S#48148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43979", "S#48149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0714", "f43974", "S#48150", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43981() {
        $g5660$ = SubLFiles.defparameter("S#48151", (SubLObject)$ic0$);
        $g5661$ = SubLFiles.defparameter("S#48152", (SubLObject)NIL);
        $g5662$ = SubLFiles.deflexical("S#48153", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic59$)) ? $g5662$.getGlobalValue() : NIL));
        $g5663$ = SubLFiles.defconstant("S#48154", (SubLObject)$ic62$);
        $g5664$ = SubLFiles.deflexical("S#48155", (NIL != Symbols.boundp((SubLObject)$ic118$)) ? $g5664$.getGlobalValue() : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5665$ = SubLFiles.deflexical("S#48156", (NIL != Symbols.boundp((SubLObject)$ic119$)) ? $g5665$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g5666$ = SubLFiles.defparameter("S#48157", (SubLObject)NIL);
        $g5667$ = SubLFiles.defparameter("S#48158", (SubLObject)NIL);
        $g5668$ = SubLFiles.defparameter("S#48159", (SubLObject)NIL);
        $g5669$ = SubLFiles.defparameter("S#48160", (SubLObject)NIL);
        $g5670$ = SubLFiles.defparameter("S#48161", (SubLObject)NIL);
        $g5671$ = SubLFiles.defparameter("S#48162", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43982() {
        module0002.f38((SubLObject)$ic4$);
        module0002.f38((SubLObject)$ic12$);
        module0002.f38((SubLObject)$ic15$);
        module0002.f38((SubLObject)$ic18$);
        module0003.f57((SubLObject)$ic59$);
        $g5662$.setGlobalValue((SubLObject)$ic60$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5663$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic68$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic69$);
        Structures.def_csetf((SubLObject)$ic70$, (SubLObject)$ic71$);
        Structures.def_csetf((SubLObject)$ic72$, (SubLObject)$ic73$);
        Structures.def_csetf((SubLObject)$ic74$, (SubLObject)$ic75$);
        Structures.def_csetf((SubLObject)$ic76$, (SubLObject)$ic77$);
        Structures.def_csetf((SubLObject)$ic78$, (SubLObject)$ic79$);
        Structures.def_csetf((SubLObject)$ic80$, (SubLObject)$ic81$);
        Structures.def_csetf((SubLObject)$ic82$, (SubLObject)$ic83$);
        Structures.def_csetf((SubLObject)$ic84$, (SubLObject)$ic85$);
        Structures.def_csetf((SubLObject)$ic86$, (SubLObject)$ic87$);
        Structures.def_csetf((SubLObject)$ic88$, (SubLObject)$ic89$);
        Structures.def_csetf((SubLObject)$ic90$, (SubLObject)$ic91$);
        Structures.def_csetf((SubLObject)$ic92$, (SubLObject)$ic93$);
        Equality.identity((SubLObject)$ic62$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5663$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic110$));
        module0012.f419((SubLObject)$ic67$);
        module0003.f57((SubLObject)$ic118$);
        module0003.f57((SubLObject)$ic119$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5663$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic126$));
        module0034.f1895((SubLObject)$ic145$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f43980();
    }
    
    public void initializeVariables() {
        f43981();
    }
    
    public void runTopLevelForms() {
        f43982();
    }
    
    static {
        me = (SubLFile)new module0714();
        $g5660$ = null;
        $g5661$ = null;
        $g5662$ = null;
        $g5663$ = null;
        $g5664$ = null;
        $g5665$ = null;
        $g5666$ = null;
        $g5667$ = null;
        $g5668$ = null;
        $g5669$ = null;
        $g5670$ = null;
        $g5671$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { makeKeyword("ONTOLOGY-TERM"), makeKeyword("ONTOLOGY-MT"), makeKeyword("ONTOLOGY-URI"), makeKeyword("BASE-URI"), makeKeyword("DEFAULT-NAMESPACE-URI"), makeKeyword("CYCLIST"), makeKeyword("PREFER-URIS"), makeKeyword("SAME-AS-URIS"), makeKeyword("ADD-COMMENTS"), makeKeyword("ADD-PRETTY-STRINGS"), makeKeyword("ADD-PRETTY-STRING-CANONICAL"), makeKeyword("RESTRICT-CONTEXT?"), makeKeyword("SUPPRESS-ADDITIONAL-TYPE-TRIPLES?"), makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?"), makeKeyword("SUPPRESS-HUMANLY-READABLE-NON-OPENCYC-URIS"), makeKeyword("EXPORT-ENTIRE-KB?"), makeKeyword("OPENCYC-EXPORT?"), makeKeyword("VERBOSE?") });
        $ic1$ = makeString("OWL Exporter usages:~%");
        $ic2$ = makeString(" owl-export-ontology-to-file   (ontology-term filename &optional exporter-options)~%");
        $ic3$ = makeString(" owl-export-ontology-to-stream (ontology-term (stream *xml-stream*) &optional exporter-options)~%");
        $ic4$ = makeSymbol("OWL-EXPORT-ONTOLOGY-TO-FILE");
        $ic5$ = makeString("owl-export-ontology-to-file");
        $ic6$ = ConsesLow.list((SubLObject)makeKeyword("ONTOLOGY-TERM"), (SubLObject)makeKeyword("FILENAME"), (SubLObject)makeKeyword("EXPORTER-OPTIONS"));
        $ic7$ = makeKeyword("OUTPUT");
        $ic8$ = makeString("Unable to open ~S");
        $ic9$ = makeKeyword("OUTPUT-STREAM");
        $ic10$ = makeKeyword("FILENAME");
        $ic11$ = makeSymbol("S#5859", "CYC");
        $ic12$ = makeSymbol("OWL-EXPORT-ONTOLOGY-TO-STREAM");
        $ic13$ = makeString("owl-export-ontology-to-stream");
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("ONTOLOGY-TERM"), (SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("EXPORTER-OPTIONS"));
        $ic15$ = makeSymbol("OWL-EXPORT-TERMS-TO-FILE");
        $ic16$ = makeString("owl-export-terms-to-file");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("TERMS"), (SubLObject)makeKeyword("FILENAME"), (SubLObject)makeKeyword("EXPORTER-OPTIONS"));
        $ic18$ = makeSymbol("OWL-EXPORT-TERMS-TO-STREAM");
        $ic19$ = makeString("owl-export-terms-to-stream");
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("TERMS"), (SubLObject)makeKeyword("EXPORTER-OPTIONS"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("termTypeForOntology"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("synonymousExternalConcept"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("overlappingExternalConcept"));
        $ic24$ = makeString("~A: FILENAME ~S already exists~%");
        $ic25$ = makeKeyword("EXPORTER-OPTIONS");
        $ic26$ = makeString("~A: EXPORTER-OPTIONS ~S is not a valid property list~%");
        $ic27$ = makeKeyword("CYCLIST");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("Cyclist"));
        $ic29$ = makeString("~A: EXPORTER-OPTIONS :cyclist ~A is not a #$Cyclist~%");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("Guest"));
        $ic31$ = makeString("~A: Please log in with (set-the-cyclist [Cyc Account])~%");
        $ic32$ = makeString("~A: EXPORTER-OPTIONS has invalid keys: ~A~%");
        $ic33$ = makeString("Errors found, aborting export...");
        $ic34$ = makeSymbol("S#48034", "CYC");
        $ic35$ = makeKeyword("ONTOLOGY-MT");
        $ic36$ = makeKeyword("ONTOLOGY-TERM-TYPE");
        $ic37$ = makeKeyword("BASE-URI");
        $ic38$ = makeKeyword("VERBOSE?");
        $ic39$ = makeKeyword("ALL");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("contextOfPCW"));
        $ic41$ = makeKeyword("OPENCYC-EXPORT?");
        $ic42$ = makeString("Performing OpenCyc export...~%");
        $ic43$ = makeKeyword("OPENCYC");
        $ic44$ = makeKeyword("PREFER-URIS");
        $ic45$ = makeString("Setting prefer OpenCyc URI option");
        $ic46$ = makeKeyword("SAME-AS-URIS");
        $ic47$ = makeString("Resetting sameAs URI parameter to opencyc settings");
        $ic48$ = makeKeyword("ADD-COMMENTS");
        $ic49$ = makeKeyword("HUMAN-READABLE");
        $ic50$ = makeKeyword("DEFAULT-NAMESPACE-URI");
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("DBPEDIA"), (SubLObject)makeKeyword("UMBEL"), (SubLObject)makeKeyword("OPENCYC-VERSIONED"), (SubLObject)makeKeyword("OPENCYC-UNVERSIONED"));
        $ic52$ = makeKeyword("VERSIONED");
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("DBPEDIA"), (SubLObject)makeKeyword("UMBEL"), (SubLObject)makeKeyword("OPENCYC"), (SubLObject)makeKeyword("OPENCYC-UNVERSIONED"));
        $ic54$ = makeKeyword("UNVERSIONED");
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("DBPEDIA"), (SubLObject)makeKeyword("UMBEL"), (SubLObject)makeKeyword("OPENCYC"), (SubLObject)makeKeyword("OPENCYC-VERSIONED"));
        $ic56$ = makeString("Invalid opencyc export type: ~A.  Defaulting to readable.");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("baseNamespaceForSKS"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("uriString"));
        $ic59$ = makeSymbol("S#48153", "CYC");
        $ic60$ = makeString("$revision: 1.2 $");
        $ic61$ = makeSymbol("DIGIT-CHAR-P");
        $ic62$ = makeSymbol("S#48033", "CYC");
        $ic63$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#1519", "CYC"), makeSymbol("S#47557", "CYC"), makeSymbol("S#2813", "CYC"), makeSymbol("S#10129", "CYC"), makeSymbol("S#710", "CYC"), makeSymbol("EXPORT"), makeSymbol("S#47547", "CYC"), makeSymbol("S#13098", "CYC"), makeSymbol("S#45663", "CYC"), makeSymbol("S#48032", "CYC"), makeSymbol("S#6511", "CYC"), makeSymbol("S#5845", "CYC") });
        $ic64$ = ConsesLow.list(new SubLObject[] { makeKeyword("ID"), makeKeyword("URI"), makeKeyword("FILE"), makeKeyword("GRAPH"), makeKeyword("CYCLIST"), makeKeyword("EXPORT"), makeKeyword("ONTOLOGY"), makeKeyword("TERMS"), makeKeyword("SENTENCES"), makeKeyword("STATS"), makeKeyword("OPTIONS"), makeKeyword("THREAD") });
        $ic65$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#48042", "CYC"), makeSymbol("S#48043", "CYC"), makeSymbol("S#48044", "CYC"), makeSymbol("S#48045", "CYC"), makeSymbol("S#48046", "CYC"), makeSymbol("S#48047", "CYC"), makeSymbol("S#48048", "CYC"), makeSymbol("S#48049", "CYC"), makeSymbol("S#48050", "CYC"), makeSymbol("S#48051", "CYC"), makeSymbol("S#48052", "CYC"), makeSymbol("S#48053", "CYC") });
        $ic66$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#48054", "CYC"), makeSymbol("S#48055", "CYC"), makeSymbol("S#48056", "CYC"), makeSymbol("S#48057", "CYC"), makeSymbol("S#48058", "CYC"), makeSymbol("S#48059", "CYC"), makeSymbol("S#48060", "CYC"), makeSymbol("S#48061", "CYC"), makeSymbol("S#48062", "CYC"), makeSymbol("S#48063", "CYC"), makeSymbol("S#48064", "CYC"), makeSymbol("S#48065", "CYC") });
        $ic67$ = makeSymbol("S#48069", "CYC");
        $ic68$ = makeSymbol("S#48041", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#48034", "CYC"));
        $ic70$ = makeSymbol("S#48042", "CYC");
        $ic71$ = makeSymbol("S#48054", "CYC");
        $ic72$ = makeSymbol("S#48043", "CYC");
        $ic73$ = makeSymbol("S#48055", "CYC");
        $ic74$ = makeSymbol("S#48044", "CYC");
        $ic75$ = makeSymbol("S#48056", "CYC");
        $ic76$ = makeSymbol("S#48045", "CYC");
        $ic77$ = makeSymbol("S#48057", "CYC");
        $ic78$ = makeSymbol("S#48046", "CYC");
        $ic79$ = makeSymbol("S#48058", "CYC");
        $ic80$ = makeSymbol("S#48047", "CYC");
        $ic81$ = makeSymbol("S#48059", "CYC");
        $ic82$ = makeSymbol("S#48048", "CYC");
        $ic83$ = makeSymbol("S#48060", "CYC");
        $ic84$ = makeSymbol("S#48049", "CYC");
        $ic85$ = makeSymbol("S#48061", "CYC");
        $ic86$ = makeSymbol("S#48050", "CYC");
        $ic87$ = makeSymbol("S#48062", "CYC");
        $ic88$ = makeSymbol("S#48051", "CYC");
        $ic89$ = makeSymbol("S#48063", "CYC");
        $ic90$ = makeSymbol("S#48052", "CYC");
        $ic91$ = makeSymbol("S#48064", "CYC");
        $ic92$ = makeSymbol("S#48053", "CYC");
        $ic93$ = makeSymbol("S#48065", "CYC");
        $ic94$ = makeKeyword("ID");
        $ic95$ = makeKeyword("URI");
        $ic96$ = makeKeyword("FILE");
        $ic97$ = makeKeyword("GRAPH");
        $ic98$ = makeKeyword("EXPORT");
        $ic99$ = makeKeyword("ONTOLOGY");
        $ic100$ = makeKeyword("TERMS");
        $ic101$ = makeKeyword("SENTENCES");
        $ic102$ = makeKeyword("STATS");
        $ic103$ = makeKeyword("OPTIONS");
        $ic104$ = makeKeyword("THREAD");
        $ic105$ = makeString("Invalid slot ~S for construction function");
        $ic106$ = makeKeyword("BEGIN");
        $ic107$ = makeSymbol("S#48066", "CYC");
        $ic108$ = makeKeyword("SLOT");
        $ic109$ = makeKeyword("END");
        $ic110$ = makeSymbol("S#48068", "CYC");
        $ic111$ = makeString("<OWL-EXPORTER ~D for ~A>");
        $ic112$ = makeSymbol("S#748", "CYC");
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("SoftwareVersionFn"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("OWLExporter-Cyc"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("UserOfProgramFn"));
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("retainTerm"));
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic118$ = makeSymbol("S#48155", "CYC");
        $ic119$ = makeSymbol("S#48156", "CYC");
        $ic120$ = makeSymbol("S#46652", "CYC");
        $ic121$ = makeSymbol("FORT-P");
        $ic122$ = makeKeyword("TRIPLE-COUNT");
        $ic123$ = makeKeyword("TRIPLES-DONE");
        $ic124$ = makeKeyword("NODES-DONE");
        $ic125$ = makeSymbol("PROCESSP");
        $ic126$ = makeSymbol("S#48102", "CYC");
        $ic127$ = makeKeyword("EXPORT-ENTIRE-KB?");
        $ic128$ = makeSymbol("S#12274", "CYC");
        $ic129$ = makeKeyword("RESTRICT-CONTEXT?");
        $ic130$ = makeSymbol("S#12276", "CYC");
        $ic131$ = makeSymbol("S#12278", "CYC");
        $ic132$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic133$ = makeString("Adding ontology to graph...");
        $ic134$ = makeString("Adding collections to export graph...");
        $ic135$ = makeString("Adding non-collections to export graph...");
        $ic136$ = makeString("Adding all KB collections to export graph...");
        $ic137$ = makeKeyword("SKIP");
        $ic138$ = makeString("Adding all KB non-collections to export graph...");
        $ic139$ = makeString("~A triple~:p~%");
        $ic140$ = makeString("~A node~:p~%");
        $ic141$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptyList"));
        $ic142$ = makeString("owl:sameAs");
        $ic143$ = makeString("xsd:int");
        $ic144$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("coExtensional")), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")));
        $ic145$ = makeSymbol("S#48108", "CYC");
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("ResourceWithURIFn"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("owl:Class"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)makeString("owl:Restriction"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("URIFn"));
        $ic150$ = makeString("rdf:nil");
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic152$ = makeString("rdf:type");
        $ic153$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic154$ = makeString("rdfs:subClassOf");
        $ic155$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic156$ = makeString("rdfs:subPropertyOf");
        $ic157$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic158$ = makeString("rdfs:comment");
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("coExtensional"));
        $ic160$ = makeString("owl:equivalentClass");
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic162$ = makeString("owl:disjointWith");
        $ic163$ = constant_handles_oc.f8479((SubLObject)makeString("arg1Isa"));
        $ic164$ = makeString("rdfs:domain");
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Isa"));
        $ic166$ = makeString("rdfs:range");
        $ic167$ = makeKeyword("ONTOLOGY-URI");
        $ic168$ = makeString("Indeterminate");
        $ic169$ = makeString("Anonymous");
        $ic170$ = constant_handles_oc.f8479((SubLObject)makeString("IndeterminateTerm"));
        $ic171$ = constant_handles_oc.f8479((SubLObject)makeString("TheCollection"));
        $ic172$ = makeKeyword("SYNONYMOUS-EXTERNAL-CONCEPT");
        $ic173$ = makeKeyword("SUPPRESS-HUMANLY-READABLE-NON-OPENCYC-URIS");
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("rdfURI"));
        $ic175$ = makeString("~A has more than one #$rdfURI assertion in ~A");
        $ic176$ = makeString("Cannot find best node for term ~A, using mycyc:");
        $ic177$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic178$ = makeSymbol("GAF-ARG3");
        $ic179$ = ConsesLow.list((SubLObject)Characters.CHAR_colon);
        $ic180$ = makeKeyword("BLANK-NODE-COUNT");
        $ic181$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), constant_handles_oc.f8479((SubLObject)makeString("relationAllOnly")), constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax")));
        $ic182$ = makeKeyword("RULE-MACRO-PRED-ASSERTION-TERM-NOT-EXPORTABLE");
        $ic183$ = makeKeyword("RULES-NOT-EXPORTABLE");
        $ic184$ = makeKeyword("NON-BINARY-PREDICATE");
        $ic185$ = makeKeyword("UNEXPORTABLE-PREDICATE");
        $ic186$ = makeKeyword("SUBJECT-NOT-EXPORTABLE");
        $ic187$ = constant_handles_oc.f8479((SubLObject)makeString("owlDataTypeSemanticCorrelation"));
        $ic188$ = makeKeyword("OBJECT-NOT-EXPORTABLE");
        $ic189$ = makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?");
        $ic190$ = makeString("Could not export assertion ~A");
        $ic191$ = makeSymbol("ASSERTION-P");
        $ic192$ = makeString("owl:onProperty");
        $ic193$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic194$ = makeString("owl:someValuesFrom");
        $ic195$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllOnly"));
        $ic196$ = makeString("owl:allValuesFrom");
        $ic197$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic198$ = makeString("owl:hasValue");
        $ic199$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin")), constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax")));
        $ic200$ = makeString("owl:valuesFrom");
        $ic201$ = makeString("owl:Restriction");
        $ic202$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount"));
        $ic203$ = makeString("owl:cardinality");
        $ic204$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin"));
        $ic205$ = makeString("owl:minCardinality");
        $ic206$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax"));
        $ic207$ = makeString("owl:maxCardinality");
        $ic208$ = makeString("Unhandled rmp pred for assertion ~A");
        $ic209$ = makeKeyword("SUPPRESS-ADDITIONAL-TYPE-TRIPLES?");
        $ic210$ = constant_handles_oc.f8479((SubLObject)makeString("Ontology"));
        $ic211$ = makeString("owl:Ontology");
        $ic212$ = constant_handles_oc.f8479((SubLObject)makeString("OwlSemanticDataType"));
        $ic213$ = makeString("owl:DatatypeProperty");
        $ic214$ = makeString("owl:ObjectProperty");
        $ic215$ = makeString("owl:Class");
        $ic216$ = makeString("owl:NamedIndividual");
        $ic217$ = makeString("rdf:Property");
        $ic218$ = makeSymbol("S#15489", "CYC");
        $ic219$ = makeString("owl:Thing");
        $ic220$ = makeSymbol("S#15600", "CYC");
        $ic221$ = makeString("rdf:first");
        $ic222$ = makeString("rdf:rest");
        $ic223$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic224$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic225$ = makeString("sameAs");
        $ic226$ = makeString("Adding additional triples for ");
        $ic227$ = makeString(" nodes...");
        $ic228$ = makeKeyword("OPENCYC-VERSIONED");
        $ic229$ = makeKeyword("OPENCYC-UNVERSIONED");
        $ic230$ = makeKeyword("CYC");
        $ic231$ = makeKeyword("DBPEDIA");
        $ic232$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MappingMtFn")), constant_handles_oc.f8479((SubLObject)makeString("DBPediaTripleStore")));
        $ic233$ = makeKeyword("ADD-PRETTY-STRINGS");
        $ic234$ = constant_handles_oc.f8479((SubLObject)makeString("prettyString"));
        $ic235$ = makeString("en");
        $ic236$ = makeKeyword("ADD-PRETTY-STRING-CANONICAL");
        $ic237$ = constant_handles_oc.f8479((SubLObject)makeString("prettyString-Canonical"));
        $ic238$ = makeKeyword("NEW");
        $ic239$ = makeKeyword("ONTOLOGY-TERM");
        $ic240$ = makeString("owl:versionInfo");
        $ic241$ = makeString("Adding rdf:label triples for ");
        $ic242$ = makeString(" FORTs");
        $ic243$ = makeString("rdf:label");
        $ic244$ = makeSymbol("STRING=");
        $ic245$ = makeString("xmlns:");
        $ic246$ = makeString("externalID");
        $ic247$ = makeString("owl:AnnotationProperty");
        $ic248$ = makeString("owl:FunctionalProperty");
        $ic249$ = makeString("Adding cycAnnot:externalID triples for ");
        $ic250$ = makeString("label");
        $ic251$ = makeString("Adding cycAnnot:label triples for ");
        $ic252$ = makeString("Removing (rdfs:range ?X owl:Thing) triples");
        $ic253$ = makeString("Removing (rdfs:domain ?X owl:Thing) triples");
        $ic254$ = makeString("base:uri");
        $ic255$ = makeString("xmlns");
        $ic256$ = constant_handles_oc.f8479((SubLObject)makeString("nameSpacePrefixForSKS"));
        $ic257$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER);
        $ic258$ = makeString("rdf");
        $ic259$ = makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        $ic260$ = makeString("owl");
        $ic261$ = makeString("http://www.w3.org/2002/07/owl#");
        $ic262$ = makeString("rdfs");
        $ic263$ = makeString("http://www.w3.org/2000/01/rdf-schema#");
        $ic264$ = makeString("xsd");
        $ic265$ = makeString("http://www.w3.org/2001/XMLSchema#");
        $ic266$ = makeString("opencyc");
        $ic267$ = makeString("mycyc");
        $ic268$ = makeString("http://sw.cyc.com/concept/");
        $ic269$ = makeSymbol("S#46734", "CYC");
        $ic270$ = makeString("UTF-8");
        $ic271$ = makeString("xml:base");
        $ic272$ = makeString("rdf:RDF");
        $ic273$ = ConsesLow.list((SubLObject)makeString("owl:AnnotationProperty"), (SubLObject)makeString("owl:ObjectProperty"), (SubLObject)makeString("owl:DatatypeProperty"), (SubLObject)makeString("owl:NamedIndividual"), (SubLObject)makeString("owl:Class"), (SubLObject)makeString("owl:Restriction"));
        $ic274$ = makeString("Finding unexported nodes...");
        $ic275$ = makeString("Exporting ~A owl:Description node~:p");
        $ic276$ = makeString("type");
        $ic277$ = makeSymbol("S#46525", "CYC");
        $ic278$ = makeString("Exporting ~A ~A node~:p");
        $ic279$ = makeString("Exporting ~A ~A node~:p (blank)");
        $ic280$ = makeSymbol("S#48132", "CYC");
        $ic281$ = makeString("Description");
        $ic282$ = makeString("rdf:nodeID");
        $ic283$ = makeString("A");
        $ic284$ = makeString("rdf:about");
        $ic285$ = makeString("rdf:resource");
        $ic286$ = makeSymbol("S#46523", "CYC");
        $ic287$ = makeSymbol("S#747", "CYC");
        $ic288$ = makeSymbol("S#46531", "CYC");
        $ic289$ = makeString("Class");
        $ic290$ = makeString("rest");
        $ic291$ = makeString("nil");
        $ic292$ = makeString("rdf:parseType");
        $ic293$ = makeString("Collection");
        $ic294$ = makeSymbol("S#46510", "CYC");
        $ic295$ = makeString("xml:lang");
        $ic296$ = makeString("rdf:datatype");
        $ic297$ = makeString("Unexportable literal encountered: ~A");
        $ic298$ = makeString("rdfs:Literal");
        $ic299$ = makeString("Don't know how to export ~A");
        $ic300$ = makeSymbol("S#46522", "CYC");
        $ic301$ = makeString("rdf:Description");
        $ic302$ = makeString("first");
        $ic303$ = makeKeyword("SUPPRESS-DUPLICATE-EXPORT-OF-BLANK-NODES?");
        $ic304$ = makeString("");
        $ic305$ = makeString(":");
        $ic306$ = makeString("&");
        $ic307$ = makeString(";");
    }
    
    public static final class $sX48033_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $uri;
        public SubLObject $file;
        public SubLObject $graph;
        public SubLObject $cyclist;
        public SubLObject $export;
        public SubLObject $ontology;
        public SubLObject $terms;
        public SubLObject $sentences;
        public SubLObject $stats;
        public SubLObject $options;
        public SubLObject $thread;
        private static final SubLStructDeclNative structDecl;
        
        public $sX48033_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$uri = (SubLObject)CommonSymbols.NIL;
            this.$file = (SubLObject)CommonSymbols.NIL;
            this.$graph = (SubLObject)CommonSymbols.NIL;
            this.$cyclist = (SubLObject)CommonSymbols.NIL;
            this.$export = (SubLObject)CommonSymbols.NIL;
            this.$ontology = (SubLObject)CommonSymbols.NIL;
            this.$terms = (SubLObject)CommonSymbols.NIL;
            this.$sentences = (SubLObject)CommonSymbols.NIL;
            this.$stats = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
            this.$thread = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX48033_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$uri;
        }
        
        public SubLObject getField4() {
            return this.$file;
        }
        
        public SubLObject getField5() {
            return this.$graph;
        }
        
        public SubLObject getField6() {
            return this.$cyclist;
        }
        
        public SubLObject getField7() {
            return this.$export;
        }
        
        public SubLObject getField8() {
            return this.$ontology;
        }
        
        public SubLObject getField9() {
            return this.$terms;
        }
        
        public SubLObject getField10() {
            return this.$sentences;
        }
        
        public SubLObject getField11() {
            return this.$stats;
        }
        
        public SubLObject getField12() {
            return this.$options;
        }
        
        public SubLObject getField13() {
            return this.$thread;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$uri = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$file = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$graph = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$cyclist = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$export = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$ontology = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$terms = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$sentences = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$stats = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$options = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$thread = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX48033_native.class, $ic62$, $ic34$, $ic63$, $ic64$, new String[] { "$id", "$uri", "$file", "$graph", "$cyclist", "$export", "$ontology", "$terms", "$sentences", "$stats", "$options", "$thread" }, $ic65$, $ic66$, $ic67$);
        }
    }
    
    public static final class $f43872$UnaryFunction extends UnaryFunction
    {
        public $f43872$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#48034"));
        }
        
        public SubLObject processItem(final SubLObject var40) {
            return f43872(var40);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3790 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/